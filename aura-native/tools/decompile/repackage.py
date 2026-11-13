# Move all default-package classes into package "defpackage" (matches jadx source naming)
import os, re, sys, shutil
src, dst = sys.argv[1], sys.argv[2]
names = set()
for f in os.listdir(src):
    if f.endswith('.smali'): names.add(f[:-6])
pat = re.compile(r'L([A-Za-z0-9_$\-]+)([;<])')
def sub(m):
    n = m.group(1)
    return 'Ldefpackage/' + n + m.group(2) if n in names else m.group(0)
if os.path.exists(dst): shutil.rmtree(dst)
for dp, dn, fn in os.walk(src):
    for f in fn:
        p = os.path.join(dp, f); rel = os.path.relpath(p, src)
        out = os.path.join(dst, 'defpackage', rel) if os.sep not in rel else os.path.join(dst, rel)
        os.makedirs(os.path.dirname(out), exist_ok=True)
        s = open(p, encoding='utf-8').read()
        open(out, 'w', encoding='utf-8').write(pat.sub(sub, s))
print(len(names), 'default-package classes moved')
