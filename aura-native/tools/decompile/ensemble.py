# Per-unit decompiler ensemble: pick first variant that compiles in context.
import os, sys, subprocess, re, json, shutil
W = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
T = W + '/tools'
variants = [('manual', W + '/manual'), ('jadx', W + '/jadx-out/sources'), ('jadxfix', W + '/jadx-fix'), ('vf', W + '/vf-out'), ('cfr', W + '/cfr-out')]
out = sys.argv[1]  # work dir
MARKERS = ['Method not decompiled', 'JADX ERROR', 'Code decompiled incorrectly', 'Method dump skipped', 'This method has failed to decompile', 'Exception decompiling', 'Unable to fully structure code', 'Code restructure failed']
skip = {'kotlin/coroutines/jvm/internal/DebugProbesKt.java'}
units = {}
for name, root in variants:
    for dp, dn, fn in os.walk(root):
        for f in fn:
            if f.endswith('.java'):
                rel = os.path.relpath(os.path.join(dp, f), root)
                if rel in skip: continue
                txt = open(os.path.join(dp, f), encoding='utf-8', errors='replace').read()
                if any(m in txt for m in MARKERS): continue
                units.setdefault(rel, []).append((name, os.path.join(dp, f)))
print('units', len(units))
choice = {u: 0 for u in units}
excluded = set()
if len(sys.argv) > 2:
    prev = json.load(open(sys.argv[2]))
    names = [n for n, _ in variants]
    for u, c in prev['choice'].items():
        if u in units:
            idx = [i for i, (n, _) in enumerate(units[u]) if n == c]
            if idx: choice[u] = idx[0]
    excluded = set(u for u in prev['excluded'] if u in units)
    for u in prev.get('force_exclude', []): excluded.add(u)
    order = [n for n, _ in variants]
    for u, vs in units.items():
        cur = 'EXCL' if u in excluded else vs[choice[u]][0]
        fixidx = [i for i, (n, _) in enumerate(vs) if n == 'jadxfix']
        if not os.environ.get('NOREENABLE') and fixidx and (cur == 'EXCL' or order.index(cur) > order.index('jadxfix')):
            choice[u] = fixidx[0]; excluded.discard(u)
for u, vs in units.items():
    if vs[0][0] == 'manual':
        choice[u] = 0; excluded.discard(u)
os.makedirs(out, exist_ok=True)
for it in range(int(os.environ.get('ITERS', '200'))):
    active = [u for u in units if u not in excluded]
    with open(out + '/list.txt', 'w') as fh:
        for u in active: fh.write(units[u][choice[u]][1] + '\n')
    shutil.rmtree(out + '/cls', ignore_errors=True); os.makedirs(out + '/cls')
    if os.environ.get('COMPILER') == 'ecj':
        r = subprocess.run(['java', '-Xmx6g', '-jar', T + '/ecj.jar', '-1.8', '-nowarn', '-proceedOnError', '-encoding', 'UTF-8',
            '-d', out + '/cls', '-cp', T + '/stubs.jar', '-bootclasspath', T + '/android-37.jar', '@' + out + '/list.txt'], capture_output=True, text=True)
    else:
        r = subprocess.run(['javac', '-J-Xmx6g', '-nowarn', '-encoding', 'UTF-8', '-source', '8', '-target', '8', '-proc:none',
        '-Xmaxerrs', '1000000', '-XDshould-stop.ifError=FLOW', '-XDcompilePolicy=simple', '-d', out + '/cls', '-cp', T + '/stubs.jar',
        '-bootclasspath', T + '/android-37.jar', '@' + out + '/list.txt'], capture_output=True, text=True)
    log = r.stdout + r.stderr
    open(out + '/javac.log', 'w').write(log)
    bad_files = set(m.group(1) for m in re.finditer(r'^(\S+\.java):\d+: error', log, re.M))
    bad_files |= set(m.group(1) for m in re.finditer(r'ERROR in (\S+\.java)', log))
    path2unit = {units[u][choice[u]][1]: u for u in active}
    bad = {path2unit[f] for f in bad_files if f in path2unit}
    unknown = bad_files - set(path2unit)
    if unknown: print('unknown error files', list(unknown)[:5])
    nerr = log.count(': error:') + log.count('ERROR in ')
    print(f'iter {it}: active {len(active)} bad {len(bad)} errors {nerr} rc {r.returncode}', flush=True)
    if not bad and r.returncode == 0:
        rc = subprocess.run(['java', '-cp', T + '/d2j/dex-tools-2.4.32/lib/d2j-external-2.4.32.jar:' + W + '/scripts/compat', 'Compat',
                             T + '/pkg-orig.jar', out + '/cls', out + '/compat.txt'], capture_output=True, text=True)
        badc = [l.split()[1] for l in open(out + '/compat.txt') if l.startswith('BAD ')]
        cls2unit = {}
        for u in active:
            base = u[:-5]
            cls2unit[base] = u
        cu = set()
        for c in badc:
            k = c
            while k not in cls2unit and '$' in k: k = k.rsplit('$', 1)[0]
            if k in cls2unit: cu.add(cls2unit[k])
            else: print('compat: no unit for', c)
        print(f'compat: {len(badc)} bad classes in {len(cu)} units', flush=True)
        if not cu:
            subprocess.run(['java', '-Xmx4g', '-cp', T + '/d2j/dex-tools-2.4.32/lib/d2j-external-2.4.32.jar:' + W + '/scripts/sem', 'Sem',
                            T + '/pkg-code.jar', out + '/cls', out + '/sem.tsv'], capture_output=True, text=True)
            for line in open(out + '/sem.tsv'):
                parts = line.split('\t')
                if int(parts[2]) > 2:
                    k = parts[0]
                    if k in cls2unit: cu.add(cls2unit[k])
            print(f'sem: {len(cu)} units with dropped references', flush=True)
        if not cu: break
        for u in cu:
            if choice[u] + 1 < len(units[u]): choice[u] += 1
            else: excluded.add(u)
        continue
    if not bad and r.returncode != 0:
        print(log[-3000:]); break
    json.dump({'choice': {u: units[u][choice[u]][0] for u in units if u not in excluded}, 'excluded': sorted(excluded)}, open(out + '/state.json', 'w'))
    for u in bad:
        if choice[u] + 1 < len(units[u]): choice[u] += 1
        else: excluded.add(u)
json.dump({'choice': {u: units[u][choice[u]][0] for u in units if u not in excluded}, 'excluded': sorted(excluded),
           'paths': {u: units[u][choice[u]][1] for u in units if u not in excluded}}, open(out + '/result.json', 'w'), indent=0)
from collections import Counter
print(Counter(units[u][choice[u]][0] for u in units if u not in excluded), 'excluded', len(excluded))
