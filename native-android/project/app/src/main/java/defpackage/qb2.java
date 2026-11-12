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
    public static final qb2 q = null;
    public Object[] n;
    public int o;
    public boolean p;

    static {
        qb2 r0 = new qb2(0);
        r0.p = true;
        q = r0;
    }

    public qb2(int r1) {
        if (r1 < 0) goto L6;
        this.n = new Object[r1];
        return;
    L6:
        kf2.n("capacity must be non-negative.");
        throw null;
    }

    public static final /* synthetic */ int d(qb2 r0) {
        return ((AbstractList) r0).modCount;
    }

    @Override // defpackage.v1
    public final int a() {
        return this.o;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r3, Object r4) {
        g();
        int r0 = this.o;
        if (r3 < 0) goto L7;
        if (r3 > r0) goto L7;
        ((AbstractList) this).modCount++;
        h(r3, 1);
        this.n[r3] = r4;
        return;
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r3, Collection r4) {
        r4.getClass();
        g();
        int r0 = this.o;
        if (r3 < 0) goto L10;
        if (r3 > r0) goto L10;
        int r1 = r4.size();
        e(r3, r4, r1);
        if (r1 <= 0) goto L9;
        return true;
    L9:
        return false;
    L10:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return false;
    }

    @Override // defpackage.v1
    public final Object b(int r3) {
        g();
        int r0 = this.o;
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        return i(r3);
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.o);
    }

    public final void e(int r5, Collection r6, int r7) {
        ((AbstractList) this).modCount++;
        h(r5, r7);
        Iterator r8 = r6.iterator();
        int r0 = 0;
    L3:
        if (r0 >= r7) goto L5;
        this.n[r5 + r0] = r8.next();
        r0 = r0 + 1;
        goto L3
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r6) {
        if (r6 != this) goto L4;
        return true;
    L4:
        if ((r6 instanceof List) == false) goto L14;
        List r7 = (List) r6;
        Object[] r0 = this.n;
        int r5 = this.o;
        if (r5 != r7.size()) goto L14;
        int r2 = 0;
    L9:
        if (r2 >= r5) goto L19;
        if (h12.c(r0[r2], r7.get(r2)) == false) goto L14;
        r2 = r2 + 1;
        goto L9
    L19:
        return true;
    L14:
        return false;
    }

    public final void f(int r3, Object r4) {
        ((AbstractList) this).modCount++;
        h(r3, 1);
        this.n[r3] = r4;
    }

    public final void g() {
        if (this.p == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r3) {
        int r0 = this.o;
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        return this.n[r3];
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    public final void h(int r6, int r7) {
        int r0 = this.o + r7;
        if (r0 < 0) goto L18;
        Object[] r1 = this.n;
        if (r0 <= r1.length) goto L15;
        int r2 = r1.length;
        int r3 = r2 + (r2 >> 1);
        if ((r3 - r0) >= 0) goto L10;
        r3 = r0;
    L10:
        if ((r3 - 2147483639) <= 0) goto L14;
        if (r0 <= 2147483639) goto L13;
        r3 = Integer.MAX_VALUE;
        goto L14
    L13:
        r3 = 2147483639;
    L14:
        this.n = Arrays.copyOf(r1, r3);
    L15:
        Object[] r4 = this.n;
        ti.Z(r6 + r7, r6, this.o, r4, r4);
        this.o += r7;
        return;
    L18:
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] r0 = this.n;
        int r5 = this.o;
        int r1 = 1;
        int r3 = 0;
    L3:
        if (r3 >= r5) goto L9;
        Object r4 = r0[r3];
        int r2 = r1 * 31;
        if (r4 == null) goto L7;
        int r6 = r4.hashCode();
    L8:
        r1 = r2 + r6;
        r3 = r3 + 1;
        goto L3
    L7:
        r6 = 0;
        goto L8
    L9:
        return r1;
    }

    public final Object i(int r5) {
        ((AbstractList) this).modCount++;
        Object[] r0 = this.n;
        Object r1 = r0[r5];
        ti.Z(r5, r5 + 1, this.o, r0, r0);
        Object[] r6 = this.n;
        int r2 = this.o - 1;
        r6.getClass();
        r6[r2] = null;
        this.o--;
        return r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r3) {
        int r0 = 0;
    L4:
        if (r0 >= this.o) goto L9;
        if (h12.c(this.n[r0], r3) == true) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.o != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int r4, int r5) {
        if (r5 <= 0) goto L4;
        ((AbstractList) this).modCount++;
    L4:
        Object[] r0 = this.n;
        ti.Z(r4, r4 + r5, this.o, r0, r0);
        Object[] r6 = this.n;
        int r1 = this.o;
        xl.I(r6, r1 - r5, r1);
        this.o -= r5;
    }

    public final int k(int r6, int r7, Collection r8, boolean r9) {
        int r0 = 0;
        int r1 = 0;
    L3:
        Object[] r2 = this.n;
        if (r0 >= r7) goto L9;
        int r3 = r6 + r0;
        if (r8.contains(r2[r3]) == r9) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        Object[] r4 = this.n;
        r0 = r0 + 1;
        r4[r1 + r6] = r4[r3];
        r1 = r1 + 1;
        goto L3
    L9:
        int r10 = r7 - r1;
        ti.Z(r6 + r1, r7 + r6, this.o, r2, r2);
        Object[] r11 = this.n;
        int r12 = this.o;
        xl.I(r11, r12 - r10, r12);
        if (r10 <= 0) goto L12;
        ((AbstractList) this).modCount++;
    L12:
        this.o -= r10;
        return r10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r3) {
        int r0 = this.o - 1;
    L3:
        if (r0 < 0) goto L8;
        if (h12.c(this.n[r0], r3) == true) goto L6;
        r0 = r0 - 1;
        goto L3
    L6:
        return r0;
    L8:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r3) {
        int r0 = this.o;
        if (r3 < 0) goto L7;
        if (r3 > r0) goto L7;
        return new dm1(this, r3);
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r1) {
        g();
        int r2 = indexOf(r1);
        if (r2 < 0) goto L5;
        b(r2);
    L5:
        if (r2 < 0) goto L8;
        return true;
    L8:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection r3) {
        r3.getClass();
        g();
        if (k(0, this.o, r3, false) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r4) {
        r4.getClass();
        g();
        if (k(0, this.o, r4, true) <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r2, Object r3) {
        g();
        int r0 = this.o;
        if (r2 < 0) goto L7;
        if (r2 >= r0) goto L7;
        Object[] r1 = this.n;
        Object r4 = r1[r2];
        r1[r2] = r3;
        return r4;
    L7:
        kf2.h(xa3.e(r2, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int r8, int r9) {
        h12.g(r8, r9, this.o);
        return new pb2(this.n, r8, r9 - r8, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r5) {
        r5.getClass();
        int r0 = r5.length;
        int r1 = this.o;
        Object[] r2 = this.n;
        if (r0 >= r1) goto L6;
        Object[] r4 = Arrays.copyOfRange(r2, 0, r1, r5.getClass());
        r4.getClass();
        return r4;
    L6:
        ti.Z(0, 0, r1, r2, r5);
        int r6 = this.o;
        if (r6 >= r5.length) goto L9;
        r5[r6] = null;
    L9:
        return r5;
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
    public final boolean add(Object r4) {
        g();
        int r0 = this.o;
        ((AbstractList) this).modCount++;
        h(r0, 1);
        this.n[r0] = r4;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ti.e0(this.n, 0, this.o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r3) {
        r3.getClass();
        g();
        int r0 = r3.size();
        e(this.o, r3, r0);
        if (r0 <= 0) goto L6;
        return true;
    L6:
        return false;
    }
}
