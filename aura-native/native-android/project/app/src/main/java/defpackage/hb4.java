package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class hb4 extends AbstractCollection implements Set {
    public final Set n;
    public final ro3 o;

    public hb4(Set set, ro3 ro3Var) {
        this.n = set;
        this.o = ro3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        rr2.l(this.o.apply(obj));
        return this.n.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rr2.l(this.o.apply(it.next()));
        }
        return this.n.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.n;
        boolean z = set instanceof RandomAccess;
        ro3 ro3Var = this.o;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            ro3Var.getClass();
            while (it.hasNext()) {
                if (ro3Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        ro3Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!ro3Var.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        te5.N(list, ro3Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        te5.N(list, ro3Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.n;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.o.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return j51.r(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return j51.x(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.n.iterator();
        ro3 ro3Var = this.o;
        rr2.s(ro3Var, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (ro3Var.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.n.iterator();
        it.getClass();
        ro3 ro3Var = this.o;
        ro3Var.getClass();
        return new h22(it, ro3Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.n.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.o.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.n.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.o.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.n.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.o.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            h22 h22Var = (h22) it;
            if (!h22Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(h22Var.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            h22 h22Var = (h22) it;
            if (h22Var.hasNext()) {
                arrayList.add(h22Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
