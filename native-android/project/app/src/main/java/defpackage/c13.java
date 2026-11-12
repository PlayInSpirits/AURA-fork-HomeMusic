package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c13 implements List, y32 {
    public final f13 n;

    public c13(f13 r1) {
        this.n = r1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object r1) {
        this.n.b(r1);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r2) {
        f13 r1 = this.n;
        return r1.e(r1.p, r2);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.n.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object r1) {
        return this.n.h(r1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r3) {
        Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L9;
        Object r0 = r4.next();
        if (this.n.h(r0) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.List
    public final Object get(int r1) {
        g13.a(this, r1);
        return this.n.n[r1];
    }

    @Override // java.util.List
    public final int indexOf(Object r1) {
        return this.n.i(r1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.n.p != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e13(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r3) {
        f13 r2 = this.n;
        int r0 = r2.p - 1;
        Object[] r4 = r2.n;
    L3:
        if (r0 < 0) goto L8;
        if (h12.c(r3, r4[r0]) == true) goto L6;
        r0 = r0 - 1;
        goto L3
    L6:
        return r0;
    L8:
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e13(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int r1) {
        g13.a(this, r1);
        return this.n.k(r1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r3) {
        if (r3.isEmpty() == true) goto L16;
        f13 r2 = this.n;
        int r0 = r2.p;
        Iterator r4 = r3.iterator();
    L7:
        if (r4.hasNext() == false) goto L10;
        r2.j(r4.next());
        goto L7
    L10:
        if (r0 == r2.p) goto L13;
        return true;
    L13:
        return false;
    L16:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r4) {
        f13 r3 = this.n;
        int r0 = r3.p;
        int r1 = r0 - 1;
    L4:
        if ((-1) >= r1) goto L10;
        if (r4.contains(r3.n[r1]) == true) goto L8;
        r3.k(r1);
    L8:
        r1 = r1 - 1;
        goto L4
    L10:
        if (r0 == r3.p) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // java.util.List
    public final Object set(int r2, Object r3) {
        g13.a(this, r2);
        Object[] r1 = this.n.n;
        Object r0 = r1[r2];
        r1[r2] = r3;
        return r0;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.n.p;
    }

    @Override // java.util.List
    public final List subList(int r2, int r3) {
        g13.b(r2, r3, this);
        return new d13(r2, r3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return zz1.J(this, r1);
    }

    @Override // java.util.List
    public final void add(int r1, Object r2) {
        this.n.a(r1, r2);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        return new e13(this, r2);
    }

    @Override // java.util.List
    public final boolean addAll(int r1, Collection r2) {
        return this.n.e(r1, r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r1) {
        return this.n.j(r1);
    }
}
