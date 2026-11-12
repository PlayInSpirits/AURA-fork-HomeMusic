package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x54 implements Set, x32 {
    public final x03 n;

    public x54(x03 r1) {
        this.n = r1;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r1) {
        return this.n.c(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r4) {
        Collection r5 = r4;
        if ((r5 instanceof Collection) == true) goto L5;
    L7:
        Iterator r6 = r5.iterator();
    L9:
        if (r6.hasNext() == false) goto L14;
        Object r0 = r6.next();
        if (this.n.c(r0) == true) goto L9;
        return false;
    L14:
        return true;
    L5:
        if (r5.isEmpty() == false) goto L7;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.n.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return si0.C(new q11(this, null, 2));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.n.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return zz1.J(this, r1);
    }
}
