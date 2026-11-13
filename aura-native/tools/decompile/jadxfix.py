# Mechanical fix-ups of common jadx recompilation problems; writes only changed units.
import os, re, sys
src, dst = sys.argv[1], sys.argv[2]
RT = 'anim|animator|array|attr|bool|color|dimen|drawable|font|id|integer|interpolator|layout|menu|mipmap|plurals|raw|string|style|styleable|xml|transition|navigation'
r_ref = re.compile(r'(?<![\w.])R\.(' + RT + r')\.')
n = 0
for dp, dn, fn in os.walk(src):
    for f in fn:
        if not f.endswith('.java'): continue
        p = os.path.join(dp, f)
        s = open(p, encoding='utf-8').read()
        o = s
        if 'import app.homemusic.R;' in s:
            s = r_ref.sub(lambda m: 'app.homemusic.R.' + m.group(1) + '.', s)
        # Iterator<T>/Iterable<T> with an undeclared type variable -> raw type
        if not re.search(r'<T(\s+extends[^>]*)?>\s', s) and not re.search(r'\bclass \w+<[^>]*\bT\b', s):
            s = re.sub(r'\b(Iterator|Iterable|ListIterator)<T> ', r'\1 ', s)
        # Kotlin declaration-site variance leaks as List<? extends X>; javac then rejects List<X> returns
        s = re.sub(r'<\? extends ([\w.$]+)>', r'<\1>', s)
        if s != o:
            out = os.path.join(dst, os.path.relpath(p, src))
            os.makedirs(os.path.dirname(out), exist_ok=True)
            open(out, 'w', encoding='utf-8').write(s)
            n += 1
print('fixed units', n)
