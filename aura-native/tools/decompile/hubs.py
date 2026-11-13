import json, sys, collections
g = json.load(open(sys.argv[1])); refs = g['refs']
def seed(c): return c.startswith('Lcom/eddyizm/tempus/') or c.startswith('Lapp/homemusic/')
direct = [c for c,r in refs.items() if not seed(c) and any(seed(x) for x in r)]
print('direct referrers', len(direct))
# reverse graph: who references whom
rev = collections.defaultdict(set)
for c,r in refs.items():
    for x in r: rev[x].add(c)
# which seed targets are referenced by many non-seed classes
cnt = collections.Counter()
for c in direct:
    for x in refs[c]:
        if seed(x): cnt[x]+=1
print(cnt.most_common(15))
# in-degree of direct referrers (how many classes reference them)
d2 = sorted(direct, key=lambda c: -len(rev[c]))[:15]
for c in d2: print(c, len(rev[c]), [x for x in refs[c] if seed(x)][:3])
