package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ri5 extends ki5 {
    public static final ri5 t;
    public final transient ei5 s;

    static {
        xh5 xh5Var = ei5.o;
        t = new ri5(pi5.r, ni5.o);
    }

    public ri5(ei5 ei5Var, Comparator comparator) {
        super(comparator);
        this.s = ei5Var;
    }

    @Override // defpackage.wh5
    public final int a(Object[] objArr) {
        return this.s.a(objArr);
    }

    @Override // defpackage.wh5
    public final int b() {
        return this.s.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iO = o(obj, true);
        ei5 ei5Var = this.s;
        if (iO == ei5Var.size()) {
            return null;
        }
        return ei5Var.get(iO);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.s, obj, this.q) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof mi5) {
            collection = ((mi5) collection).c();
        }
        Comparator comparator = this.q;
        if (!si0.a0(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        xh5 xh5VarListIterator = this.s.listIterator(0);
        Iterator it = collection.iterator();
        if (xh5VarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = xh5VarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!xh5VarListIterator.hasNext()) {
                            break;
                        }
                        next2 = xh5VarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.wh5
    public final int d() {
        return this.s.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.s.g().listIterator(0);
    }

    @Override // defpackage.wh5
    public final o15 e() {
        return this.s.listIterator(0);
    }

    @Override // defpackage.gi5, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            ei5 ei5Var = this.s;
            if (ei5Var.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.q;
                if (!si0.a0(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    xh5 xh5VarListIterator = ei5Var.listIterator(0);
                    while (xh5VarListIterator.hasNext()) {
                        Object next = xh5VarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.wh5
    public final Object[] f() {
        return this.s.f();
    }

    @Override // defpackage.ki5, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.s.get(0);
        }
        tb4.k();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iN = n(obj, true) - 1;
        if (iN == -1) {
            return null;
        }
        return this.s.get(iN);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iO = o(obj, false);
        ei5 ei5Var = this.s;
        if (iO == ei5Var.size()) {
            return null;
        }
        return ei5Var.get(iO);
    }

    @Override // defpackage.gi5
    public final ei5 i() {
        return this.s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override // defpackage.ki5, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            tb4.k();
            return null;
        }
        ei5 ei5Var = this.s;
        return ei5Var.get(ei5Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iN = n(obj, false) - 1;
        if (iN == -1) {
            return null;
        }
        return this.s.get(iN);
    }

    public final int n(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.s, obj, this.q);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int o(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.s, obj, this.q);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final ri5 p(int i, int i2) {
        ei5 ei5Var = this.s;
        if (i == 0) {
            if (i2 == ei5Var.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.q;
        return i < i2 ? new ri5(ei5Var.subList(i, i2), comparator) : ki5.m(comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.size();
    }
}
