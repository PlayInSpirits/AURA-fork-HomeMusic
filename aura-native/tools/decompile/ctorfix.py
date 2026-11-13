# R8 drops forwarding constructors: `new-instance vX, LC;` + `invoke-direct {vX..}, LSuper;-><init>(D)V`.
# Java cannot express that, so add an equivalent forwarding constructor C(D) { super(...); }
# to the smali of C and to every Java variant of C.
import os, re, sys, collections
W = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
smali = W + '/smali-pkg'
roots = [W + '/jadx-out/sources', W + '/jadx-fix', W + '/manual', W + '/cfr-out']
classes = {}
for dp, dn, fn in os.walk(smali):
    for f in fn:
        p = os.path.join(dp, f); rel = os.path.relpath(p, smali)[:-6]
        classes['L' + rel + ';'] = p
need = collections.defaultdict(set)
ni = re.compile(r'new-instance (\w+), (L[^;]+;)')
inv = re.compile(r'invoke-direct(?:/range)? \{(\w+)[^}]*\}, (L[^;]+;)-><init>\(([^)]*)\)V')
for c, p in classes.items():
    pend = {}
    for line in open(p, encoding='utf-8'):
        line = line.strip()
        if line.startswith('.method'): pend = {}
        m = ni.match(line)
        if m: pend[m.group(1)] = m.group(2); continue
        m = inv.match(line)
        if m and m.group(1) in pend:
            created = pend.pop(m.group(1))
            if created != m.group(2): need[created].add((m.group(2), m.group(3)))
def info(path):
    s = open(path, encoding='utf-8').read()
    sup = re.search(r'^\.super (L[^;]+;)', s, re.M).group(1)
    inits = set(re.findall(r'^\.method [^\n]*constructor <init>\(([^)]*)\)V', s, re.M))
    return s, sup, inits
def split_desc(d):
    out = []; i = 0
    while i < len(d):
        j = i
        while d[j] == '[': j += 1
        if d[j] == 'L': k = d.index(';', j); out.append(d[i:k+1]); i = k + 1
        else: out.append(d[i:j+1]); i = j + 1
    return out
PRIM = {'Z':'boolean','B':'byte','C':'char','S':'short','I':'int','J':'long','F':'float','D':'double'}
def jtype(t):
    dims = len(t) - len(t.lstrip('['))
    b = t[dims:]
    base = PRIM[b] if b in PRIM else b[1:-1].replace('/', '.').replace('$', '.')
    return base + '[]' * dims
added = 0; jadded = 0
for c, sups in sorted(need.items()):
    if c not in classes: continue
    s, sup, inits = info(classes[c])
    if '.class interface' in s.split('\n', 1)[0] or ' abstract ' in s.split('\n', 1)[0] and False: pass
    new_methods = []; jctors = []
    for owner, d in sorted(sups):
        if owner != sup or d in inits: continue
        params = split_desc(d)
        nregs = 1 + sum(2 if p in ('J', 'D') else 1 for p in params)
        call = f'invoke-direct/range {{p0 .. p{nregs-1}}}, {sup}-><init>({d})V' if nregs > 1 else f'invoke-direct {{p0}}, {sup}-><init>()V'
        new_methods.append(f'\n.method public constructor <init>({d})V\n    .registers {nregs}\n\n    {call}\n\n    return-void\n.end method\n')
        args = ', '.join(f'{jtype(p)} a{i}' for i, p in enumerate(params))
        jctors.append((args, ', '.join(f'a{i}' for i in range(len(params)))))
        inits.add(d)
    if not new_methods: continue
    open(classes[c], 'w', encoding='utf-8').write(s.rstrip('\n') + '\n' + ''.join(new_methods)); added += len(new_methods)
    rel = c[1:-1]
    if '$' in rel.rsplit('/', 1)[-1]: continue  # nested classes: smali only
    simple = rel.rsplit('/', 1)[-1]
    for r in roots:
        jp = os.path.join(r, rel + '.java')
        if not os.path.exists(jp): continue
        js = open(jp, encoding='utf-8').read()
        m = re.search(r'^(public |protected |private )?(abstract |final |static )*(/\* synthetic \*/ )?(abstract |final )*class ' + re.escape(simple) + r'\b[^{]*\{\n', js, re.M)
        if not m: continue
        code = ''.join(f'    public {simple}({a}) {{\n        super({b});\n    }}\n\n' for a, b in jctors)
        js = js[:m.end()] + code + js[m.end():]
        open(jp, 'w', encoding='utf-8').write(js); jadded += 1
print('smali constructors added', added, 'java files patched', jadded, 'classes', len(need))
