package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wn4 extends dj0 implements qn4 {
    public qn4 s;
    public long t;

    @Override // defpackage.qn4
    public final int e(long r4) {
        qn4 r0 = this.s;
        r0.getClass();
        return r0.e(r4 - this.t);
    }

    @Override // defpackage.qn4
    public final long k(int r3) {
        qn4 r0 = this.s;
        r0.getClass();
        return r0.k(r3) + this.t;
    }

    @Override // defpackage.qn4
    public final List m(long r4) {
        qn4 r0 = this.s;
        r0.getClass();
        return r0.m(r4 - this.t);
    }

    @Override // defpackage.qn4
    public final int n() {
        qn4 r0 = this.s;
        r0.getClass();
        return r0.n();
    }

    @Override // defpackage.dj0
    public final void r() {
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = false;
        this.s = null;
    }
}
