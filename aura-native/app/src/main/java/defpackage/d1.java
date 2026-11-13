package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d1 extends jb4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ AbstractMap o;

    public /* synthetic */ d1(AbstractMap abstractMap, int i) {
        this.n = i;
        this.o = abstractMap;
    }

    public final boolean a(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map b = b();
        b.getClass();
        try {
            obj2 = b.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (si0.s(obj2, entry.getValue())) {
            return obj2 != null || b().containsKey(key);
        }
        return false;
    }

    public final Map b() {
        int i = this.n;
        AbstractMap abstractMap = this.o;
        switch (i) {
            case 0:
                return (f1) abstractMap;
            default:
                return (kg2) abstractMap;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        b().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.n) {
            case 0:
                Set entrySet = ((f1) this.o).p.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return a(obj);
        }
    }

    public final boolean d(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return b().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.n;
        AbstractMap abstractMap = this.o;
        switch (i) {
            case 0:
                return new e1((f1) abstractMap);
            default:
                kg2 kg2Var = (kg2) abstractMap;
                Iterator it = kg2Var.n.entrySet().iterator();
                jg2 jg2Var = kg2Var.o;
                jg2Var.getClass();
                return new i22(it, new pz1(3, jg2Var));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2;
        switch (this.n) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                q1 q1Var = ((f1) this.o).q;
                Object key = entry.getKey();
                Map map = q1Var.r;
                map.getClass();
                try {
                    obj2 = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    q1Var.s -= size;
                }
                return true;
            default:
                return d(obj);
        }
    }

    @Override // defpackage.jb4, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return j51.L(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= this.remove(it.next());
            }
            return z;
        }
    }

    @Override // defpackage.jb4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                uc5.f(size, "expectedSize");
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.b().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b().size();
    }
}
