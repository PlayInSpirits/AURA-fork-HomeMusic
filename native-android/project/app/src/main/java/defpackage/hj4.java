package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hj4 implements w80, Iterable, x32 {
    public final ig4 n;
    public final int o;
    public final py3 p;

    public hj4(ig4 r1, int r2, tg1 r3, py3 r4) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof hj4) == false) goto L13;
        hj4 r4 = (hj4) r3;
        if (r4.o == this.o) goto L7;
        return false;
    L7:
        if (r4.n == this.n) goto L10;
        return false;
    L10:
        if (r4.p.equals(this.p) == false) goto L16;
        return true;
    L16:
        return false;
    L13:
        return false;
    }

    public final int hashCode() {
        int r0 = this.o * 31;
        int r1 = (this.n.hashCode() + r0) * 31;
        return this.p.hashCode() + r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        py3 r2 = this.p;
        return new gj4(this.n, this.o, null, r2);
    }
}
