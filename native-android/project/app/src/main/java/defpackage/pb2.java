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

    public pb2(Object[] r1, int r2, int r3, pb2 r4, qb2 r5) {
        r1.getClass();
        r5.getClass();
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        ((AbstractList) this).modCount = qb2.d(r5);
    }

    public static final /* synthetic */ int d(pb2 r0) {
        return ((AbstractList) r0).modCount;
    }

    @Override // defpackage.v1
    public final int a() {
        g();
        return this.p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r2, Object r3) {
        h();
        g();
        int r0 = this.p;
        if (r2 < 0) goto L7;
        if (r2 > r0) goto L7;
        f(this.o + r2, r3);
        return;
    L7:
        kf2.h(xa3.e(r2, r0, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r4, Collection r5) {
        r5.getClass();
        h();
        g();
        int r0 = this.p;
        if (r4 < 0) goto L10;
        if (r4 > r0) goto L10;
        int r1 = r5.size();
        e(this.o + r4, r5, r1);
        if (r1 <= 0) goto L9;
        return true;
    L9:
        return false;
    L10:
        kf2.h(xa3.e(r4, r0, "index: ", ", size: "));
        return false;
    }

    @Override // defpackage.v1
    public final Object b(int r3) {
        h();
        g();
        int r0 = this.p;
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        return i(this.o + r3);
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.o, this.p);
    }

    public final void e(int r3, Collection r4, int r5) {
        ((AbstractList) this).modCount++;
        qb2 r0 = this.r;
        pb2 r1 = this.q;
        if (r1 == null) goto L5;
        r1.e(r3, r4, r5);
    L6:
        this.n = r0.n;
        this.p += r5;
        return;
    L5:
        qb2 r2 = qb2.q;
        r0.e(r3, r4, r5);
        goto L6
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r7) {
        g();
        if (r7 != this) goto L5;
        return true;
    L5:
        if ((r7 instanceof List) == false) goto L15;
        List r8 = (List) r7;
        Object[] r0 = this.n;
        int r2 = this.p;
        if (r2 != r8.size()) goto L15;
        int r3 = 0;
    L10:
        if (r3 >= r2) goto L20;
        if (h12.c(r0[this.o + r3], r8.get(r3)) == false) goto L15;
        r3 = r3 + 1;
        goto L10
    L20:
        return true;
    L15:
        return false;
    }

    public final void f(int r3, Object r4) {
        ((AbstractList) this).modCount++;
        qb2 r0 = this.r;
        pb2 r1 = this.q;
        if (r1 == null) goto L5;
        r1.f(r3, r4);
    L6:
        this.n = r0.n;
        this.p++;
        return;
    L5:
        qb2 r2 = qb2.q;
        r0.f(r3, r4);
        goto L6
    }

    public final void g() {
        if (qb2.d(this.r) != ((AbstractList) this).modCount) goto L5;
        return;
    L5:
        kf2.c();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r3) {
        g();
        int r0 = this.p;
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        return this.n[this.o + r3];
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    public final void h() {
        if (this.r.p == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] r0 = this.n;
        int r1 = this.p;
        int r2 = 1;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L9;
        Object r5 = r0[this.o + r4];
        int r3 = r2 * 31;
        if (r5 == null) goto L7;
        int r6 = r5.hashCode();
    L8:
        r2 = r3 + r6;
        r4 = r4 + 1;
        goto L3
    L7:
        r6 = 0;
        goto L8
    L9:
        return r2;
    }

    public final Object i(int r2) {
        ((AbstractList) this).modCount++;
        pb2 r0 = this.q;
        if (r0 == null) goto L5;
        Object r3 = r0.i(r2);
    L6:
        this.p--;
        return r3;
    L5:
        qb2 r1 = qb2.q;
        r3 = this.r.i(r2);
        goto L6
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r4) {
        g();
        int r0 = 0;
    L4:
        if (r0 >= this.p) goto L9;
        if (h12.c(this.n[this.o + r0], r4) == true) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        return r0;
    L9:
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        if (this.p != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int r2, int r3) {
        if (r3 <= 0) goto L4;
        ((AbstractList) this).modCount++;
    L4:
        pb2 r0 = this.q;
        if (r0 == null) goto L7;
        r0.j(r2, r3);
    L8:
        this.p -= r3;
        return;
    L7:
        qb2 r1 = qb2.q;
        this.r.j(r2, r3);
        goto L8
    }

    public final int k(int r2, int r3, Collection r4, boolean r5) {
        pb2 r0 = this.q;
        if (r0 == null) goto L5;
        int r6 = r0.k(r2, r3, r4, r5);
    L6:
        if (r6 <= 0) goto L8;
        ((AbstractList) this).modCount++;
    L8:
        this.p -= r6;
        return r6;
    L5:
        qb2 r1 = qb2.q;
        r6 = this.r.k(r2, r3, r4, r5);
        goto L6
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object r4) {
        g();
        int r0 = this.p - 1;
    L3:
        if (r0 < 0) goto L8;
        if (h12.c(this.n[this.o + r0], r4) == true) goto L6;
        r0 = r0 - 1;
        goto L3
    L6:
        return r0;
    L8:
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r3) {
        g();
        int r0 = this.p;
        if (r3 < 0) goto L7;
        if (r3 > r0) goto L7;
        return new dm1(this, r3);
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object r1) {
        h();
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
    public final boolean removeAll(Collection r4) {
        r4.getClass();
        h();
        g();
        int r0 = this.p;
        if (k(this.o, r0, r4, false) <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection r4) {
        r4.getClass();
        h();
        g();
        int r0 = this.p;
        if (k(this.o, r0, r4, true) <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r3, Object r4) {
        h();
        g();
        int r0 = this.p;
        if (r3 < 0) goto L7;
        if (r3 >= r0) goto L7;
        Object[] r1 = this.n;
        int r2 = this.o;
        Object r5 = r1[r2 + r3];
        r1[r2 + r3] = r4;
        return r5;
    L7:
        kf2.h(xa3.e(r3, r0, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int r8, int r9) {
        h12.g(r8, r9, this.p);
        return new pb2(this.n, this.o + r8, r9 - r8, this, this.r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] r5) {
        r5.getClass();
        g();
        int r0 = r5.length;
        int r1 = this.p;
        Object[] r2 = this.n;
        int r3 = this.o;
        if (r0 >= r1) goto L6;
        Object[] r4 = Arrays.copyOfRange(r2, r3, r1 + r3, r5.getClass());
        r4.getClass();
        return r4;
    L6:
        ti.Z(0, r3, r1 + r3, r2, r5);
        int r6 = this.p;
        if (r6 >= r5.length) goto L9;
        r5[r6] = null;
    L9:
        return r5;
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
    public final boolean add(Object r3) {
        h();
        g();
        f(this.o + this.p, r3);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] r0 = this.n;
        int r1 = this.p;
        int r2 = this.o;
        return ti.e0(r0, r2, r1 + r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r4) {
        r4.getClass();
        h();
        g();
        int r0 = r4.size();
        e(this.o + this.p, r4, r0);
        if (r0 <= 0) goto L6;
        return true;
    L6:
        return false;
    }
}
