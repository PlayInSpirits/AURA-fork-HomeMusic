package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d13 implements List, y32 {
    public final List n;
    public final int o;
    public int p;

    public d13(int r1, int r2, List r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.util.List
    public final void add(int r2, Object r3) {
        this.n.add(r2 + this.o, r3);
        this.p++;
    }

    @Override // java.util.List
    public final boolean addAll(int r2, Collection r3) {
        this.n.addAll(r2 + this.o, r3);
        int r4 = r3.size();
        this.p += r4;
        if (r4 <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int r0 = this.p - 1;
        int r1 = this.o;
        if (r1 > r0) goto L7;
    L4:
        this.n.remove(r0);
        if (r0 == r1) goto L7;
        r0 = r0 - 1;
    L7:
        this.p = r1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object r4) {
        int r0 = this.p;
        int r1 = this.o;
    L3:
        if (r1 >= r0) goto L9;
        if (h12.c(this.n.get(r1), r4) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r2) {
        Iterator r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L9;
        if (contains(r3.next()) == true) goto L4;
        return false;
    L9:
        return true;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        g13.a(this, r2);
        int r3 = r2 + this.o;
        return this.n.get(r3);
    }

    @Override // java.util.List
    public final int indexOf(Object r5) {
        int r0 = this.p;
        int r1 = this.o;
        int r2 = r1;
    L3:
        if (r2 >= r0) goto L9;
        if (h12.c(this.n.get(r2), r5) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return r2 - r1;
    L9:
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.p != this.o) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new e13(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r4) {
        int r0 = this.p - 1;
        int r1 = this.o;
        if (r1 <= r0) goto L5;
        return -1;
    L5:
        if (h12.c(this.n.get(r0), r4) == true) goto L7;
        if (r0 == r1) goto L14;
        r0 = r0 - 1;
        goto L5
    L14:
        return -1;
    L7:
        return r0 - r1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e13(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r5) {
        int r0 = this.p;
        int r1 = this.o;
    L3:
        if (r1 >= r0) goto L9;
        List r2 = this.n;
        if (h12.c(r2.get(r1), r5) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        r2.remove(r1);
        this.p--;
        return true;
    L9:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r3) {
        int r0 = this.p;
        Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        remove(r4.next());
        goto L4
    L7:
        if (r0 == this.p) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r6) {
        int r0 = this.p;
        int r1 = r0 - 1;
        int r2 = this.o;
        if (r2 > r1) goto L10;
    L4:
        List r3 = this.n;
        if (r6.contains(r3.get(r1)) == true) goto L7;
        r3.remove(r1);
        this.p--;
    L7:
        if (r1 == r2) goto L10;
        r1 = r1 - 1;
    L10:
        if (r0 == this.p) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // java.util.List
    public final Object set(int r2, Object r3) {
        g13.a(this, r2);
        int r4 = r2 + this.o;
        return this.n.set(r4, r3);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.p - this.o;
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
    public final ListIterator listIterator(int r2) {
        return new e13(this, r2);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object r3) {
        int r0 = this.p;
        this.p = r0 + 1;
        this.n.add(r0, r3);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r3) {
        this.n.addAll(this.p, r3);
        int r4 = r3.size();
        this.p += r4;
        if (r4 <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.List
    public final Object remove(int r2) {
        g13.a(this, r2);
        Object r3 = this.n.remove(r2 + this.o);
        this.p--;
        return r3;
    }
}
