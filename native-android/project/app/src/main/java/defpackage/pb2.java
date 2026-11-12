package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 extends v1 implements RandomAccess, Serializable {
    public Object[] n;
    public final int o;
    public int p;
    public final pb2 q;
    public final qb2 r;

    public pb2(Object[] objArr, int i, int i2, pb2 pb2Var, qb2 qb2Var) {
        objArr.getClass();
        qb2Var.getClass();
        this.n = objArr;
        this.o = i;
        this.p = i2;
        this.q = pb2Var;
        this.r = qb2Var;
        ((AbstractList) this).modCount = ((AbstractList) qb2Var).modCount;
    }

    @Override // defpackage.v1
    public final int a() {
        g();
        return this.p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i2 = this.p;
        if (i < 0 || i > i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        } else {
            f(this.o + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        int i2 = this.p;
        if (i < 0 || i > i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        e(this.o + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.v1
    public final Object b(int i) {
        h();
        g();
        int i2 = this.p;
        if (i >= 0 && i < i2) {
            return i(this.o + i);
        }
        kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.o, this.p);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        qb2 qb2Var = this.r;
        pb2 pb2Var = this.q;
        if (pb2Var != null) {
            pb2Var.e(i, collection, i2);
        } else {
            qb2 qb2Var2 = qb2.q;
            qb2Var.e(i, collection, i2);
        }
        this.n = qb2Var.n;
        this.p += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.n;
            int i = this.p;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (h12.c(objArr[this.o + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        qb2 qb2Var = this.r;
        pb2 pb2Var = this.q;
        if (pb2Var != null) {
            pb2Var.f(i, obj);
        } else {
            qb2 qb2Var2 = qb2.q;
            qb2Var.f(i, obj);
        }
        this.n = qb2Var.n;
        this.p++;
    }

    public final void g() {
        if (((AbstractList) this.r).modCount == ((AbstractList) this).modCount) {
            return;
        }
        kf2.c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.p;
        if (i >= 0 && i < i2) {
            return this.n[this.o + i];
        }
        kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void h() {
        if (this.r.p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.n;
        int i = this.p;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.o + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        Object objI;
        ((AbstractList) this).modCount++;
        pb2 pb2Var = this.q;
        if (pb2Var != null) {
            objI = pb2Var.i(i);
        } else {
            qb2 qb2Var = qb2.q;
            objI = this.r.i(i);
        }
        this.p--;
        return objI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.p; i++) {
            if (h12.c(this.n[this.o + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.p == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        pb2 pb2Var = this.q;
        if (pb2Var != null) {
            pb2Var.j(i, i2);
        } else {
            qb2 qb2Var = qb2.q;
            this.r.j(i, i2);
        }
        this.p -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        int iK;
        pb2 pb2Var = this.q;
        if (pb2Var != null) {
            iK = pb2Var.k(i, i2, collection, z);
        } else {
            qb2 qb2Var = qb2.q;
            iK = this.r.k(i, i2, collection, z);
        }
        if (iK > 0) {
            ((AbstractList) this).modCount++;
        }
        this.p -= iK;
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.p - 1; i >= 0; i--) {
            if (h12.c(this.n[this.o + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.p;
        if (i >= 0 && i <= i2) {
            return new dm1(this, i);
        }
        kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.o, this.p, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.o, this.p, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i2 = this.p;
        if (i < 0 || i >= i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.n;
        int i3 = this.o;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        h12.g(i, i2, this.p);
        return new pb2(this.n, this.o + i, i2 - i, this, this.r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.p;
        Object[] objArr2 = this.n;
        int i2 = this.o;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        ti.Z(0, i2, i + i2, objArr2, objArr);
        int i3 = this.p;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return xl.c(this.n, this.o, this.p, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.o + this.p, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.n;
        int i = this.p;
        int i2 = this.o;
        return ti.e0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        e(this.o + this.p, collection, size);
        return size > 0;
    }
}
