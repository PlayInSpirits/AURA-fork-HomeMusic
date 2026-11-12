package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends x0 implements ListIterator {
    public final /* synthetic */ a1 q;

    public y0(a1 r2, int r3) {
        this.q = r2;
        super(0, r2);
        int r4 = r2.a();
        if (r3 < 0) goto L7;
        if (r3 > r4) goto L7;
        this.o = r3;
        return;
    L7:
        kf2.h(xa3.e(r3, r4, "index: ", ", size: "));
        throw null;
    }

    @Override // java.util.ListIterator
    public final void add(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.o <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious() == false) goto L6;
        int r0 = this.o - 1;
        this.o = r0;
        return this.q.get(r0);
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object r1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
