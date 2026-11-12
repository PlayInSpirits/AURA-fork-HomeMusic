package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 implements List, x32 {
    public final q03 n;
    public final l03 o;
    public int p;

    public fm1() {
        this.n = new q03(16);
        this.o = new l03(16);
        this.p = -1;
    }

    public final long a() {
        long r0 = rr2.c(Float.POSITIVE_INFINITY, false, false);
        int r2 = this.p + 1;
        int r3 = this.n.b - 1;
        if (r2 > r3) goto L26;
    L4:
        l03 r4 = this.o;
        if (r2 < 0) goto L19;
        if (r2 >= r4.b) goto L20;
        long r5 = r4.a[r2];
        if (g12.k(r5, r0) >= 0) goto L12;
        r0 = r5;
    L12:
        if (g12.u(r0) < 0.0f) goto L14;
    L16:
        if (r2 == r3) goto L18;
        r2 = r2 + 1;
    L18:
        return r0;
    L14:
        if (g12.E(r0) == false) goto L16;
    L20:
        kf2.h("Index must be between 0 and size");
        return 0;
    L19:
        r4.getClass();
        goto L20
    L26:
        return r0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b(int r3, int r4) {
        if (r3 >= r4) goto L22;
        this.n.l(r3, r4);
        l03 r2 = this.o;
        if (r3 < 0) goto L18;
        int r0 = r2.b;
        if (r3 > r0) goto L19;
        if (r4 < 0) goto L19;
        if (r4 > r0) goto L19;
        if (r4 < r3) goto L16;
        if (r4 == r3) goto L21;
        if (r4 >= r0) goto L14;
        long[] r1 = r2.a;
        ti.a0(r1, r1, r3, r4, r0);
    L14:
        r2.b -= r4 - r3;
        return;
    L21:
        return;
    L16:
        kf2.n("The end index must be < start index");
        return;
    L19:
        kf2.h("Index must be between 0 and size");
        return;
    L18:
        r2.getClass();
        goto L19
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.p = -1;
        this.n.d();
        this.o.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object r3) {
        if ((r3 instanceof cx2) == true) goto L6;
        return false;
    L6:
        if (indexOf((cx2) r3) == (-1)) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r2) {
        Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (contains((cx2) r3.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.List
    public final Object get(int r1) {
        Object r0 = this.n.f(r1);
        r0.getClass();
        return (cx2) r0;
    }

    @Override // java.util.List
    public final int indexOf(Object r5) {
        if ((r5 instanceof cx2) == true) goto L5;
        return -1;
    L5:
        cx2 r6 = (cx2) r5;
        int r0 = size() - 1;
        if (r0 < 0) goto L13;
        int r2 = 0;
    L9:
        if (h12.c(this.n.f(r2), r6) == true) goto L10;
        if (r2 == r0) goto L13;
        r2 = r2 + 1;
        goto L9
    L10:
        return r2;
    L13:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.n.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new dm1(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r4) {
        if ((r4 instanceof cx2) == true) goto L5;
        return -1;
    L5:
        cx2 r5 = (cx2) r4;
        int r0 = size() - 1;
    L6:
        if ((-1) >= r0) goto L11;
        if (h12.c(this.n.f(r0), r5) == true) goto L9;
        r0 = r0 - 1;
        goto L6
    L9:
        return r0;
    L11:
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new dm1(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r1, Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.n.b;
    }

    @Override // java.util.List
    public final void sort(Comparator r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int r2, int r3) {
        return new em1(this, r2, r3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return zz1.J(this, r1);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r3) {
        return new dm1(this, r3, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
