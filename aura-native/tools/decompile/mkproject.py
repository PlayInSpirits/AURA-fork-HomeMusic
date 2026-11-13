# Lay out app/src/main/{java,smali} from the ensemble result and the compiled class set.
import os, sys, json, shutil
W = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
res = json.load(open(sys.argv[1]))      # result.json (paths of chosen units)
cls = sys.argv[2]                        # dir with javac output of exactly those units
proj = sys.argv[3]                       # project root (contains app/)
java_dir = os.path.join(proj, 'app/src/main/java'); smali_dir = os.path.join(proj, 'app/src/main/smali')
for d in (java_dir, smali_dir): shutil.rmtree(d, ignore_errors=True); os.makedirs(d)
skip = {'app/homemusic/R.java'}
n = 0
for unit, path in res['paths'].items():
    if unit in skip: continue
    out = os.path.join(java_dir, unit); os.makedirs(os.path.dirname(out), exist_ok=True)
    shutil.copyfile(path, out); n += 1
produced = set()
for dp, dn, fn in os.walk(cls):
    for f in fn:
        if f.endswith('.class'): produced.add(os.path.relpath(os.path.join(dp, f), cls)[:-6])
src = os.path.join(W, 'smali-pkg'); kept = dropped = 0
for dp, dn, fn in os.walk(src):
    for f in fn:
        rel = os.path.relpath(os.path.join(dp, f), src)
        if rel[:-6] in produced: dropped += 1; continue
        out = os.path.join(smali_dir, rel); os.makedirs(os.path.dirname(out), exist_ok=True)
        shutil.copyfile(os.path.join(dp, f), out); kept += 1
print(f'java units {n}, smali kept {kept}, smali replaced by java {dropped}, javac classes {len(produced)}')
json.dump({'java_units': n, 'smali_kept': kept, 'smali_replaced': dropped, 'javac_classes': len(produced)}, open(os.path.join(W, 'stats.json'), 'w'))
