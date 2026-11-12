package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class em1 implements List, x32 {
    public final int n;
    public final int o;
    public final /* synthetic */ fm1 p;

    public em1(fm1 r1, int r2, int r3) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final Object get(int r2) {
        Object r1 = this.p.n.f(r2 + this.n);
        r1.getClass();
        return (cx2) r1;
    }

    @Override // java.util.List
    public final int indexOf(Object r5) {
        if ((r5 instanceof cx2) == false) goto L18;
        cx2 r6 = (cx2) r5;
        int r0 = this.n;
        int r1 = this.o;
        if (r0 > r1) goto L14;
        int r2 = r0;
    L9:
        if (h12.c(this.p.n.f(r2), r6) == true) goto L11;
        if (r2 == r1) goto L19;
        r2 = r2 + 1;
        goto L9
    L19:
        return -1;
    L11:
        return r2 - r0;
    L14:
        return -1;
    L18:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int r1 = this.n;
        int r2 = this.o;
        return new dm1(this.p, r1, r1, r2);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r4) {
        if ((r4 instanceof cx2) == false) goto L17;
        cx2 r5 = (cx2) r4;
        int r0 = this.o;
        int r1 = this.n;
        if (r1 <= r0) goto L8;
        return -1;
    L8:
        if (h12.c(this.p.n.f(r0), r5) == true) goto L10;
        if (r0 == r1) goto L18;
        r0 = r0 - 1;
        goto L8
    L18:
        return -1;
    L10:
        return r0 - r1;
    L17:
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r4) {
        int r1 = this.n;
        int r2 = this.o;
        fm1 r3 = this.p;
        return new dm1(r3, r4 + r1, r1, r2);
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
        return this.o - this.n;
    }

    @Override // java.util.List
    public final void sort(Comparator r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int r3, int r4) {
        int r1 = this.n;
        fm1 r2 = this.p;
        return new em1(r2, r3 + r1, r1 + r4);
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int r1 = this.n;
        int r2 = this.o;
        return new dm1(this.p, r1, r1, r2);
    }
}
