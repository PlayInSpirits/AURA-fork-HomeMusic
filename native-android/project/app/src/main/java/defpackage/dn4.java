package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dn4 implements List, y32 {
    public final rh4 n;
    public final int o;
    public int p;
    public int q;

    public dn4(rh4 rh4Var, int i, int i2) {
        this.n = rh4Var;
        this.o = i;
        this.p = rr2.H(rh4Var);
        this.q = i2 - i;
    }

    public final void a() {
        if (rr2.H(this.n) == this.p) {
            return;
        }
        kf2.c();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.o + this.q;
        rh4 rh4Var = this.n;
        rh4Var.add(i, obj);
        this.q++;
        this.p = rr2.H(rh4Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.o;
        rh4 rh4Var = this.n;
        boolean zAddAll = rh4Var.addAll(i2, collection);
        if (zAddAll) {
            this.q = collection.size() + this.q;
            this.p = rr2.H(rh4Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.q > 0) {
            a();
            int i = this.q;
            int i2 = this.o;
            rh4 rh4Var = this.n;
            rh4Var.e(i2, i + i2);
            this.q = 0;
            this.p = rr2.H(rh4Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        rr2.d(i, this.q);
        return this.n.get(this.o + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.q;
        int i2 = this.o;
        Iterator it = gb.g0(i2, i + i2).iterator();
        while (((i02) it).p) {
            int iNextInt = ((b02) it).nextInt();
            if (h12.c(obj, this.n.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.q == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.q;
        int i2 = this.o;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (h12.c(obj, this.n.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        hx3 hx3Var = new hx3();
        hx3Var.n = i - 1;
        return new f24(hx3Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.o + i;
        rh4 rh4Var = this.n;
        Object objRemove = rh4Var.remove(i2);
        this.q--;
        this.p = rr2.H(rh4Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        y1 y1Var;
        ch4 ch4VarJ;
        boolean zE;
        a();
        rh4 rh4Var = this.n;
        int i2 = this.o;
        int i3 = this.q + i2;
        int size = rh4Var.size();
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = rh4Var.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            xf3 xf3VarF = y1Var.f();
            xf3VarF.subList(i2, i3).retainAll(collection);
            y1 y1VarD = xf3VarF.d();
            if (h12.c(y1VarD, y1Var)) {
                break;
            }
            ql4 ql4Var3 = rh4Var.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                ch4VarJ = jh4.j();
                zE = rr2.e((ql4) jh4.w(ql4Var3, rh4Var, ch4VarJ), i, y1VarD, true);
            }
            jh4.n(ch4VarJ, rh4Var);
        } while (!zE);
        int size2 = size - rh4Var.size();
        if (size2 > 0) {
            this.p = rr2.H(this.n);
            this.q -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        rr2.d(i, this.q);
        a();
        int i2 = i + this.o;
        rh4 rh4Var = this.n;
        Object obj2 = rh4Var.set(i2, obj);
        this.p = rr2.H(rh4Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.q;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.q) {
            oo3.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.o;
        return new dn4(this.n, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zz1.J(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.o + i;
        rh4 rh4Var = this.n;
        rh4Var.add(i2, obj);
        this.q++;
        this.p = rr2.H(rh4Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.q, collection);
    }
}
