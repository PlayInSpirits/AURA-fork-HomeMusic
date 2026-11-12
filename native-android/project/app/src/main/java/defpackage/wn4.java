package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wn4 extends dj0 implements qn4 {
    public qn4 s;
    public long t;

    @Override // defpackage.qn4
    public final int e(long j) {
        qn4 qn4Var = this.s;
        qn4Var.getClass();
        return qn4Var.e(j - this.t);
    }

    @Override // defpackage.qn4
    public final long k(int i) {
        qn4 qn4Var = this.s;
        qn4Var.getClass();
        return qn4Var.k(i) + this.t;
    }

    @Override // defpackage.qn4
    public final List m(long j) {
        qn4 qn4Var = this.s;
        qn4Var.getClass();
        return qn4Var.m(j - this.t);
    }

    @Override // defpackage.qn4
    public final int n() {
        qn4 qn4Var = this.s;
        qn4Var.getClass();
        return qn4Var.n();
    }

    @Override // defpackage.dj0
    public final void r() {
        this.o = 0;
        this.p = 0L;
        this.q = 0;
        this.r = false;
        this.s = null;
    }
}
