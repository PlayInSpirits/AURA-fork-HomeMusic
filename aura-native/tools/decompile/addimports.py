# Error-driven fix: add missing `import defpackage.X;` reported by ECJ as unresolved.
import re, sys, os
log, fixroot, jadxroot = sys.argv[1], sys.argv[2], sys.argv[3]
W = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
known = set(f[:-6] for f in os.listdir(W + '/smali-pkg/defpackage') if f.endswith('.smali') and '$' not in f)
txt = open(log, encoding='utf-8', errors='replace').read()
need = {}
for block in txt.split('----------'):
    m = re.search(r'ERROR in (\S+\.java)', block)
    if not m: continue
    n = re.search(r'\n(\w+) cannot be resolved', block)
    if n and n.group(1) in known:
        need.setdefault(m.group(1), set()).add(n.group(1))
cnt = 0
for path, names in need.items():
    rel = None
    for root in (fixroot, jadxroot):
        ra = os.path.abspath(root)
        if os.path.abspath(path).startswith(ra + os.sep): rel = os.path.relpath(path, ra)
    if rel is None or rel.startswith('defpackage/'): continue
    s = open(path, encoding='utf-8').read()
    imps = ''.join(f'import defpackage.{x};\n' for x in sorted(names) if f'import defpackage.{x};' not in s)
    if not imps: continue
    s = re.sub(r'^(package [^;]+;\n)', lambda m: m.group(1) + '\n' + imps, s, count=1, flags=re.M)
    out = os.path.join(fixroot, rel); os.makedirs(os.path.dirname(out), exist_ok=True)
    open(out, 'w', encoding='utf-8').write(s); cnt += 1
print('files with added imports', cnt)
