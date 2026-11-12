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
public final class qb2 extends v1 implements RandomAccess, Serializable {
    public static final qb2 q;
    public Object[] n;
    public int o;
    public boolean p;

    static {
        qb2 qb2Var = new qb2(0);
        qb2Var.p = true;
        q = qb2Var;
    }

    public qb2(int i) {
        if (i >= 0) {
            this.n = new Object[i];
        } else {
            kf2.n("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.v1
    public final int a() {
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i2 = this.o;
        if (i < 0 || i > i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.n[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        int i2 = this.o;
        if (i < 0 || i > i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        e(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.v1
    public final Object b(int i) {
        g();
        int i2 = this.o;
        if (i >= 0 && i < i2) {
            return i(i);
        }
        kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.o);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        h(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.n[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.n;
            int i = this.o;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (h12.c(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.n[i] = obj;
    }

    public final void g() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.o;
        if (i >= 0 && i < i2) {
            return this.n[i];
        }
        kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void h(int i, int i2) {
        int i3 = this.o + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.n;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.n = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.n;
        ti.Z(i + i2, i, this.o, objArr2, objArr2);
        this.o += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.n;
        int i = this.o;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.n;
        Object obj = objArr[i];
        ti.Z(i, i + 1, this.o, objArr, objArr);
        Object[] objArr2 = this.n;
        int i2 = this.o - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.o--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.o; i++) {
            if (h12.c(this.n[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.o == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.n;
        ti.Z(i, i + i2, this.o, objArr, objArr);
        Object[] objArr2 = this.n;
        int i3 = this.o;
        xl.I(objArr2, i3 - i2, i3);
        this.o -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.n;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.n;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        ti.Z(i + i4, i2 + i, this.o, objArr, objArr);
        Object[] objArr3 = this.n;
        int i7 = this.o;
        xl.I(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.o -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.o - 1; i >= 0; i--) {
            if (h12.c(this.n[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.o;
        if (i >= 0 && i <= i2) {
            return new dm1(this, i);
        }
        kf2.h(xa3.e(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        g();
        return k(0, this.o, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        return k(0, this.o, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i2 = this.o;
        if (i < 0 || i >= i2) {
            kf2.h(xa3.e(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        h12.g(i, i2, this.o);
        return new pb2(this.n, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.o;
        Object[] objArr2 = this.n;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        ti.Z(0, 0, i, objArr2, objArr);
        int i2 = this.o;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return xl.c(this.n, 0, this.o, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.o;
        ((AbstractList) this).modCount++;
        h(i, 1);
        this.n[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ti.e0(this.n, 0, this.o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        int size = collection.size();
        e(this.o, collection, size);
        return size > 0;
    }
}
