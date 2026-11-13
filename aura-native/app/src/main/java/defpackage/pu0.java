package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pu0 extends cx2 implements rx4, o62 {
    public pu0() {
        super();
    }

    public pu0 B;
    public pu0 C;
    public long D;

    @Override // defpackage.o62, defpackage.yi2
    public final void a(long j) {
        this.D = j;
    }

    @Override // defpackage.rx4
    public final Object f() {
        return fz0.X;
    }

    @Override // defpackage.cx2
    public final void j0() {
        this.C = null;
        this.B = null;
    }

    public final boolean q0() {
        pu0 pu0Var = this.B;
        if (pu0Var != null) {
            return pu0Var.q0();
        }
        pu0 pu0Var2 = this.C;
        if (pu0Var2 != null) {
            return pu0Var2.q0();
        }
        return false;
    }

    public final void r0() {
        pu0 pu0Var = this.C;
        if (pu0Var != null) {
            pu0Var.r0();
            return;
        }
        pu0 pu0Var2 = this.B;
        if (pu0Var2 != null) {
            pu0Var2.r0();
        }
    }

    public final void s0() {
        pu0 pu0Var = this.C;
        if (pu0Var != null) {
            pu0Var.s0();
        }
        pu0 pu0Var2 = this.B;
        if (pu0Var2 != null) {
            pu0Var2.s0();
        }
        this.B = null;
    }

    public final void t0(zg5 zg5Var) {
        rx4 rx4Var;
        pu0 pu0Var;
        pu0 pu0Var2 = this.B;
        if (pu0Var2 == null || !ud3.a(pu0Var2, su3.u(zg5Var))) {
            if (this.n.A) {
                jx3 jx3Var = new jx3();
                gh0.J(this, new ou0(jx3Var, this, zg5Var));
                rx4Var = (rx4) jx3Var.n;
            } else {
                rx4Var = null;
            }
            pu0Var = (pu0) rx4Var;
        } else {
            pu0Var = pu0Var2;
        }
        if (pu0Var != null && pu0Var2 == null) {
            pu0Var.r0();
            pu0Var.t0(zg5Var);
            pu0 pu0Var3 = this.C;
            if (pu0Var3 != null) {
                pu0Var3.s0();
            }
        } else if (pu0Var == null && pu0Var2 != null) {
            pu0 pu0Var4 = this.C;
            if (pu0Var4 != null) {
                pu0Var4.r0();
                pu0Var4.t0(zg5Var);
            }
            pu0Var2.s0();
        } else if (!h12.c(pu0Var, pu0Var2)) {
            if (pu0Var != null) {
                pu0Var.r0();
                pu0Var.t0(zg5Var);
            }
            if (pu0Var2 != null) {
                pu0Var2.s0();
            }
        } else if (pu0Var != null) {
            pu0Var.t0(zg5Var);
        } else {
            pu0 pu0Var5 = this.C;
            if (pu0Var5 != null) {
                pu0Var5.t0(zg5Var);
            }
        }
        this.B = pu0Var;
    }

    public final void u0() {
        pu0 pu0Var = this.C;
        if (pu0Var != null) {
            pu0Var.u0();
            return;
        }
        pu0 pu0Var2 = this.B;
        if (pu0Var2 != null) {
            pu0Var2.u0();
        }
    }
}
