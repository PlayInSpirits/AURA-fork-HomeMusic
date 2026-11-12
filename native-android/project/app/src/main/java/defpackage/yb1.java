package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yb1 extends uo implements Set, Collection {
    public yb1() {
        super(10);
    }

    public abstract jx1 W();

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object r1) {
        ((a05) this).W().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection r1) {
        ((a05) this).W().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ((a05) this).W().clear();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object r1) {
        return ((a05) this).W().contains(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection r1) {
        return ((a05) this).W().containsAll(r1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object r1) {
        if (r1 != this) goto L4;
        return true;
    L4:
        if (W().equals(r1) == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return W().hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((a05) this).W().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((a05) this).W().iterator();
    }

    @Override // defpackage.uo
    public /* bridge */ /* synthetic */ Object o() {
        return W();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object r1) {
        ((a05) this).W().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection r1) {
        ((a05) this).W().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection r1) {
        ((a05) this).W().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((a05) this).W().size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ((a05) this).W().toArray(rw1.n);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return ((a05) this).W().toArray(r1);
    }
}
