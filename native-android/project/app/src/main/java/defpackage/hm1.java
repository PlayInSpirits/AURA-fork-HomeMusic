package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 implements xj2 {
    public final long n;
    public long o;
    public final List p;
    public final long q;

    public hm1(long r3, List r5) {
        this.n = r5.size() - 1;
        this.o = -1;
        this.q = r3;
        this.p = r5;
    }

    @Override // defpackage.xj2
    public final long j() {
        long r0 = this.o;
        if (r0 >= 0) goto L5;
    L8:
        tb4.k();
        return 0;
    L5:
        if (r0 > this.n) goto L8;
        long r1 = ((wm1) this.p.get((int) r0)).r;
        return this.q + r1;
    }

    @Override // defpackage.xj2
    public final long n() {
        long r0 = this.o;
        if (r0 >= 0) goto L5;
    L8:
        tb4.k();
        return 0;
    L5:
        if (r0 > this.n) goto L8;
        wm1 r1 = (wm1) this.p.get((int) r0);
        return (this.q + r1.r) + r1.p;
    }

    @Override // defpackage.xj2
    public final boolean next() {
        long r0 = this.o + 1;
        this.o = r0;
        if (r0 <= this.n) goto L5;
        boolean r4 = true;
    L7:
        return !r4;
    L5:
        r4 = false;
        goto L7
    }
}
