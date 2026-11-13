package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class n82 implements List, x32 {
    public final rh4 n = new rh4();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof l82)) {
            return false;
        }
        return this.n.contains((l82) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.n.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (l82) this.n.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof l82)) {
            return -1;
        }
        return this.n.indexOf((l82) obj);
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
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof l82)) {
            return -1;
        }
        return this.n.lastIndexOf((l82) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        rh4 rh4Var = this.n;
        rh4Var.getClass();
        return new dm1(rh4Var, i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.n.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.n.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zz1.J(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.n.listIterator();
    }
}
