import os, re, sys, json, collections
root = sys.argv[1]
refs = {}; files = {}
tok = re.compile(r'L[\w$/\-]+;')
for dp, dn, fn in os.walk(root):
    for f in fn:
        if not f.endswith('.smali'): continue
        p = os.path.join(dp, f)
        s = open(p, encoding='utf-8').read()
        m = re.search(r'^\.class[^\n]* (L[^;]+;)', s, re.M)
        c = m.group(1)
        refs[c] = set(tok.findall(s)) - {c}
        files[c] = os.path.relpath(p, root)
json.dump({'refs': {k: sorted(v & refs.keys()) for k, v in refs.items()}, 'files': files}, open(sys.argv[2], 'w'))
print(len(refs))
