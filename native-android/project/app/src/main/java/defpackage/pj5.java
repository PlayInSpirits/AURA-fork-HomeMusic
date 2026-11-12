package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pj5 implements Iterator {
    public int n;
    public final int o;
    public final /* synthetic */ rj5 p;

    public pj5(rj5 r2) {
        this.p = r2;
        this.n = 0;
        this.o = r2.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.n >= this.o) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        if (r0 >= this.o) goto L6;
        this.n = r0 + 1;
        return Byte.valueOf(this.p.b(r0));
    L6:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
