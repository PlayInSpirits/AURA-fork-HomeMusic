package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vd2 implements Collection, x32 {
    public static final vd2 p = null;
    public final List n;
    public final int o;

    static {
        p = new vd2(u01.n);
    }

    public vd2(List r1) {
        this.n = r1;
        this.o = r1.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object r1) {
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
    public final boolean contains(Object r2) {
        if ((r2 instanceof ud2) == true) goto L6;
        return false;
    L6:
        List r1 = this.n;
        return r1.contains((ud2) r2);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r1) {
        return this.n.containsAll(r1);
    }

    @Override // java.util.Collection
    public final boolean equals(Object r2) {
        if (this != r2) goto L5;
        return true;
    L5:
        if ((r2 instanceof vd2) == false) goto L13;
        List r3 = ((vd2) r2).n;
        if (this.n.equals(r3) == true) goto L11;
        return false;
    L11:
        return true;
    L13:
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
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r1) {
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
    public final Object[] toArray(Object[] r1) {
        return zz1.J(this, r1);
    }
}
