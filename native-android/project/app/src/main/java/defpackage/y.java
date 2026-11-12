package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y implements Collection, x32 {
    public abstract int a();

    @Override // java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object r3) {
        if (isEmpty() == false) goto L5;
        return false;
    L5:
        Iterator<E> r2 = iterator();
    L7:
        if (r2.hasNext() == false) goto L12;
        if (h12.c(r2.next(), r3) == false) goto L7;
        return true;
    L12:
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection r2) {
        r2.getClass();
        Collection r3 = r2;
        if (r3.isEmpty() == true) goto L12;
        Iterator r4 = r3.iterator();
    L7:
        if (r4.hasNext() == false) goto L17;
        if (contains(r4.next()) == true) goto L7;
        return false;
    L17:
        return true;
    L12:
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (a() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] r1) {
        r1.getClass();
        return zz1.J(this, r1);
    }

    public final String toString() {
        return q40.B0(this, ", ", "[", "]", new x(0, this), 24);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return zz1.I(this);
    }
}
