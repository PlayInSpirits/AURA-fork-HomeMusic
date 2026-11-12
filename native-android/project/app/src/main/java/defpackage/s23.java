package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s23 implements Iterator, x32 {
    public int n;
    public boolean o;
    public final /* synthetic */ t23 p;

    public s23(t23 r1) {
        this.p = r1;
        this.n = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if ((this.n + 1) >= this.p.x.e()) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L6;
        this.o = true;
        mj4 r1 = this.p.x;
        int r2 = this.n + 1;
        this.n = r2;
        return (r23) r1.f(r2);
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.o == false) goto L9;
        mj4 r0 = this.p.x;
        ((r23) r0.f(this.n)).o = null;
        int r1 = this.n;
        Object[] r2 = r0.p;
        Object r3 = r2[r1];
        Object r4 = su3.f;
        if (r3 == r4) goto L7;
        r2[r1] = r4;
        r0.n = true;
    L7:
        this.n = r1 - 1;
        this.o = false;
        return;
    L9:
        kf2.o("You must call next() before you can remove an element");
    }
}
