package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s64 extends fo0 implements a90, b83 {
    public s64() {
        super();
    }

    public a74 D;
    public hb3 E;
    public boolean F;
    public y71 G;
    public rm2 H;
    public fv I;
    public tb J;
    public z64 K;
    public eo0 L;
    public ub M;
    public boolean N;

    @Override // defpackage.eo0
    public final void C() {
        boolean u0 = u0();
        if (this.N != u0) {
            this.N = u0;
            v0(this.D, this.E, this.J, this.F, this.G, this.H, this.I);
        }
    }

    @Override // defpackage.b83
    public final void Q() {
        ub ubVar = (ub) kb4.q(this, sb3.a);
        if (h12.c(ubVar, this.M)) {
            return;
        }
        this.M = ubVar;
        eo0 eo0Var = this.L;
        if (eo0Var != null) {
            r0(eo0Var);
        }
        this.L = null;
        t0();
        z64 z64Var = this.K;
        if (z64Var != null) {
            a74 a74Var = this.D;
            hb3 hb3Var = this.E;
            tb tbVar = this.J;
            boolean z = this.F;
            boolean z2 = this.N;
            z64Var.G0(tbVar, this.I, this.G, this.H, hb3Var, a74Var, z, z2);
        }
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i0() {
        this.N = u0();
        t0();
        if (this.K == null) {
            a74 a74Var = this.D;
            tb tbVar = this.J;
            y71 y71Var = this.G;
            hb3 hb3Var = this.E;
            boolean z = this.F;
            boolean z2 = this.N;
            z64 z64Var = new z64(tbVar, this.I, y71Var, this.H, hb3Var, a74Var, z, z2);
            q0(z64Var);
            this.K = z64Var;
        }
    }

    @Override // defpackage.cx2
    public final void j0() {
        eo0 eo0Var = this.L;
        if (eo0Var != null) {
            r0(eo0Var);
        }
    }

    public final void t0() {
        eo0 eo0Var = this.L;
        if (eo0Var != null) {
            if (((cx2) eo0Var).n.A) {
                return;
            }
            q0(eo0Var);
            return;
        }
        tb tbVar = this.J;
        if (tbVar != null) {
            fo0 fo0Var = tbVar.i;
            if (fo0Var.n.A) {
                return;
            }
            q0(fo0Var);
            this.L = fo0Var;
        }
    }

    public final boolean u0() {
        return (this.A ? j51.O(this).K : r62.n) != r62.o || this.E == hb3.n;
    }

    public final void v0(a74 a74Var, hb3 hb3Var, tb tbVar, boolean z, y71 y71Var, rm2 rm2Var, fv fvVar) {
        this.D = a74Var;
        this.E = hb3Var;
        if (!h12.c(this.J, tbVar)) {
            this.J = tbVar;
            eo0 eo0Var = this.L;
            if (eo0Var != null) {
                r0(eo0Var);
            }
            this.L = null;
            t0();
        }
        this.F = z;
        this.G = y71Var;
        this.H = rm2Var;
        this.I = fvVar;
        boolean u0 = u0();
        this.N = u0;
        z64 z64Var = this.K;
        if (z64Var != null) {
            z64Var.G0(this.J, fvVar, y71Var, rm2Var, hb3Var, a74Var, z, u0);
        }
    }
}
