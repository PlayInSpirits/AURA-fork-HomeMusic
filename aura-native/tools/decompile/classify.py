import json, sys, collections
g = json.load(open(sys.argv[1])); refs = g['refs']
def seed(c): return c.startswith('Lcom/eddyizm/tempus/') or c.startswith('Lapp/homemusic/')
app = {c for c in refs if seed(c)}
changed = True
while changed:
    changed = False
    for c, r in refs.items():
        if c not in app and any(x in app for x in r):
            app.add(c); changed = True
print('seed', sum(1 for c in refs if seed(c)), 'app(fixpoint)', len(app), 'lib', len(refs)-len(app))
pk = collections.Counter(c.rsplit('/',1)[0] if '/' in c else '(default)' for c in app)
print(pk.most_common(40))
json.dump(sorted(app), open(sys.argv[2],'w'))
