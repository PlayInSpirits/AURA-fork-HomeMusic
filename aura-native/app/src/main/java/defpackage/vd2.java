package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vd2 implements Collection, x32 {
    public static final vd2 p = new vd2(u01.n);
    public final List n;
    public final int o;

    public vd2(List list) {
        this.n = list;
        this.o = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof ud2)) {
            return false;
        }
        return this.n.contains((ud2) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.n.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vd2) {
            return this.n.equals(((vd2) obj).n);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.n.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.o;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.n + ")";
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zz1.J(this, objArr);
    }
}
