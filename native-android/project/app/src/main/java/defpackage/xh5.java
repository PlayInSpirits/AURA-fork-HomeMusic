package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xh5 extends o15 implements ListIterator {
    public final int o;
    public int p;
    public final ei5 q;

    public xh5(ei5 r3, int r4) {
        int r0 = r3.size();
        super(1);
        if (r4 < 0) goto L7;
        if (r4 > r0) goto L7;
        this.o = r0;
        this.p = r4;
        this.q = r3;
        return;
    L7:
        kf2.h(fu.S("index", r4, r0));
        throw null;
    }

    public final Object a(int r1) {
        return this.q.get(r1);
    }

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
