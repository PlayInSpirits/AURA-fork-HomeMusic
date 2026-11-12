package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 implements Iterator, x32 {
    public final ig4 n;
    public final int o;
    public int p;
    public final int q;

    public ik1(ig4 r1, int r2, int r3) {
        this.n = r1;
        this.o = r3;
        this.p = r2;
        this.q = r1.u;
        if (r1.t == false) goto L6;
        kg4.f();
        return;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.p >= this.o) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ig4 r0 = this.n;
        int r1 = r0.u;
        int r2 = this.q;
        if (r1 == r2) goto L5;
        kg4.f();
    L5:
        int r3 = this.p;
        this.p = r0.n[(r3 * 5) + 3] + r3;
        return new jg4(r0, r3, r2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
