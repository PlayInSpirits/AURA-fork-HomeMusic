package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vc2 extends AbstractList implements RandomAccess, Serializable {
    public final List n;
    public final eg1 o;

    public vc2(eg1 r1, List r2) {
        r2.getClass();
        this.n = r2;
        this.o = r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        Object r3 = this.n.get(r2);
        return this.o.mo77apply(r3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.n.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r3) {
        return new uc2(this, this.n.listIterator(r3), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int r2) {
        Object r3 = this.n.remove(r2);
        return this.o.mo77apply(r3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r1, int r2) {
        this.n.subList(r1, r2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n.size();
    }
}
