package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hi implements Collection, x32 {
    public final Object[] n;
    public final boolean o;

    public hi(Object[] r1, boolean r2) {
        this.n = r1;
        this.o = r2;
    }

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

    @Override // java.util.Collection
    public final boolean contains(Object r1) {
        if (ti.m0(this.n, r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r3) {
        r3.getClass();
        Collection r4 = r3;
        if (r4.isEmpty() == true) goto L13;
        Iterator r5 = r4.iterator();
    L7:
        if (r5.hasNext() == false) goto L18;
        Object r0 = r5.next();
        if (ti.m0(this.n, r0) >= 0) goto L7;
        return false;
    L18:
        return true;
    L13:
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.n.length != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new x0(this.n);
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
    public final int size() {
        return this.n.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] r0 = this.n;
        if (this.o == true) goto L5;
    L7:
        Object[] r2 = Arrays.copyOf(r0, r0.length, Object[].class);
        r2.getClass();
        return r2;
    L5:
        if (r0.getClass().equals(Object[].class) == false) goto L7;
        return r0;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r1) {
        r1.getClass();
        return zz1.J(this, r1);
    }
}
