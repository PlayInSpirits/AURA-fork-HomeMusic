package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 implements xj2 {
    public final long n;
    public long o = -1;
    public final List p;
    public final long q;

    public hm1(long j, List list) {
        this.n = list.size() - 1;
        this.q = j;
        this.p = list;
    }

    @Override // defpackage.xj2
    public final long j() {
        long j = this.o;
        if (j < 0 || j > this.n) {
            tb4.k();
            return 0L;
        }
        return this.q + ((wm1) this.p.get((int) j)).r;
    }

    @Override // defpackage.xj2
    public final long n() {
        long j = this.o;
        if (j < 0 || j > this.n) {
            tb4.k();
            return 0L;
        }
        wm1 wm1Var = (wm1) this.p.get((int) j);
        return this.q + wm1Var.r + wm1Var.p;
    }

    @Override // defpackage.xj2
    public final boolean next() {
        long j = this.o + 1;
        this.o = j;
        return !(j > this.n);
    }
}
