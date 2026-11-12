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

    @Override // defpackage.uo
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public abstract jx1 o();

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        ((a05) this).o().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        ((a05) this).o().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        ((a05) this).o().clear();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return ((a05) this).o().contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((a05) this).o().containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return obj == this || o().equals(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return o().hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((a05) this).o().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((a05) this).o().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        ((a05) this).o().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ((a05) this).o().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ((a05) this).o().getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((a05) this).o().size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return ((a05) this).o().toArray(rw1.n);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((a05) this).o().toArray(objArr);
    }
}
