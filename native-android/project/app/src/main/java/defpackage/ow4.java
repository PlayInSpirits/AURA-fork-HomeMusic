package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ow4 implements q44 {
    public q44 n;
    public final /* synthetic */ pw4 o;

    public ow4(pw4 pw4Var, q44 q44Var) {
        this.o = pw4Var;
        this.n = q44Var;
    }

    @Override // defpackage.q44
    public final boolean c() {
        q44 q44Var = this.n;
        if (q44Var != null) {
            return q44Var.c();
        }
        return false;
    }

    @Override // defpackage.q44
    public final void s() {
        q44 q44Var = this.n;
        if (q44Var != null) {
            q44Var.s();
        }
    }

    @Override // defpackage.q44
    public final int t(gp3 gp3Var, cj0 cj0Var, int i) {
        gp3Var.getClass();
        cj0Var.getClass();
        q44 q44Var = this.n;
        if (q44Var == null) {
            return -3;
        }
        int iT = q44Var.t(gp3Var, cj0Var, i);
        if (iT == -4 && !cj0Var.d(4)) {
            cj0Var.t += this.o.s;
        }
        return iT;
    }

    @Override // defpackage.q44
    public final int u(long j) {
        q44 q44Var = this.n;
        if (q44Var != null) {
            return q44Var.u(j - this.o.s);
        }
        return 0;
    }
}
