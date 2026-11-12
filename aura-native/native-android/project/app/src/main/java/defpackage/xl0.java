package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements yj2 {
    public final zq2 n;
    public final q41 o;
    public kq p;
    public yj2 q;
    public boolean r = true;
    public boolean s;

    public xl0(q41 q41Var, vp4 vp4Var) {
        this.o = q41Var;
        this.n = new zq2(vp4Var);
    }

    public final void a(kq kqVar) {
        yj2 yj2Var;
        yj2 yj2VarG = kqVar.g();
        if (yj2VarG == null || yj2VarG == (yj2Var = this.q)) {
            return;
        }
        if (yj2Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.q = yj2VarG;
        this.p = kqVar;
        yj2VarG.d((qh3) this.n.r);
    }

    @Override // defpackage.yj2
    public final void d(qh3 qh3Var) {
        yj2 yj2Var = this.q;
        if (yj2Var != null) {
            yj2Var.d(qh3Var);
            qh3Var = this.q.i();
        }
        this.n.d(qh3Var);
    }

    @Override // defpackage.yj2
    public final qh3 i() {
        yj2 yj2Var = this.q;
        return yj2Var != null ? yj2Var.i() : (qh3) this.n.r;
    }

    @Override // defpackage.yj2
    public final long j() {
        if (this.r) {
            return this.n.j();
        }
        yj2 yj2Var = this.q;
        yj2Var.getClass();
        return yj2Var.j();
    }

    @Override // defpackage.yj2
    public final boolean k() {
        if (this.r) {
            this.n.getClass();
            return false;
        }
        yj2 yj2Var = this.q;
        yj2Var.getClass();
        return yj2Var.k();
    }
}
