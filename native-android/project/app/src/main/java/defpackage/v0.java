package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 extends o15 implements ListIterator {
    public final int o;
    public int p;

    public v0(int r2, int r3) {
        super(0);
        rr2.t(r3, r2);
        this.o = r2;
        this.p = r3;
    }

    public abstract Object a(int r1);

    @Override // java.util.ListIterator
    public final void add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.p >= this.o) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.p <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext() == false) goto L6;
        int r0 = this.p;
        this.p = r0 + 1;
        return a(r0);
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.p;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L6;
        int r0 = this.p - 1;
        this.p = r0;
        return a(r0);
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.p - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object r1) {
        throw new UnsupportedOperationException();
    }
}
