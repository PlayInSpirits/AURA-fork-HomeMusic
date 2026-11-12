package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z01 implements Set, Serializable, x32 {
    public static final z01 n = null;

    static {
        n = new z01();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r1) {
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
    public final /* bridge */ boolean contains(Object r1) {
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r1) {
        r1.getClass();
        return r1.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r1) {
        if ((r1 instanceof Set) == true) goto L5;
        return false;
    L5:
        if (((Set) r1).isEmpty() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return t01.n;
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
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        r1.getClass();
        return zz1.J(this, r1);
    }

    public final String toString() {
        return "[]";
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }
}
