package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n82 implements List, x32 {
    public final rh4 n;

    public n82() {
        this.n = new rh4();
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
    public final boolean contains(Object r2) {
        if ((r2 instanceof l82) == true) goto L6;
        return false;
    L6:
        rh4 r1 = this.n;
        return r1.contains((l82) r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r1) {
        return this.n.containsAll(r1);
    }

    @Override // java.util.List
    public final Object get(int r1) {
        return (l82) this.n.get(r1);
    }

    @Override // java.util.List
    public final int indexOf(Object r2) {
        if ((r2 instanceof l82) == true) goto L6;
        return -1;
    L6:
        rh4 r1 = this.n;
        return r1.indexOf((l82) r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.n.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r2) {
        if ((r2 instanceof l82) == true) goto L6;
        return -1;
    L6:
        rh4 r1 = this.n;
        return r1.lastIndexOf((l82) r2);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        rh4 r1 = this.n;
        r1.getClass();
        return new dm1(r1, r2);
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
        return this.n.size();
    }

    @Override // java.util.List
    public final void sort(Comparator r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int r1, int r2) {
        return this.n.subList(r1, r2);
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
        return this.n.listIterator();
    }
}
