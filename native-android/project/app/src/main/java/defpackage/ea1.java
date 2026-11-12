package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 extends fo0 implements g94, vi1, a90, b83, rx4 {
    public static final y41 J = new y41(10);
    public rm2 D = null;
    public final q E;
    public p91 F;
    public l82 G;
    public f63 H;
    public final ba1 I;

    public ea1(q qVar) {
        this.E = qVar;
        ba1 ba1Var = new ba1(0, new da1(2, 0, ea1.class, this, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"), 10);
        q0(ba1Var);
        this.I = ba1Var;
    }

    @Override // defpackage.vi1
    public final void L(f63 f63Var) {
        this.H = f63Var;
        if (this.I.v0().a()) {
            if (!f63Var.A0().A) {
                u0();
                return;
            }
            f63 f63Var2 = this.H;
            if (f63Var2 == null || !f63Var2.A0().A) {
                return;
            }
            u0();
        }
    }

    @Override // defpackage.b83
    public final void Q() {
        jx3 jx3Var = new jx3();
        j51.F(this, new fa(6, jx3Var, this));
        l82 l82Var = (l82) jx3Var.n;
        if (this.I.v0().a()) {
            l82 l82Var2 = this.G;
            if (l82Var2 != null) {
                l82Var2.b();
            }
            if (l82Var != null) {
                l82Var.a();
            } else {
                l82Var = null;
            }
            this.G = l82Var;
        }
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        boolean zA = this.I.v0().a();
        c42[] c42VarArr = o94.a;
        p94 p94Var = n94.l;
        c42 c42Var = o94.a[4];
        Boolean boolValueOf = Boolean.valueOf(zA);
        p94Var.getClass();
        q94Var.a(p94Var, boolValueOf);
        q94Var.a(d94.v, new w2(null, new na(0, this, ea1.class, "requestFocus", "requestFocus()Z", 0, 2)));
    }

    @Override // defpackage.rx4
    public final Object f() {
        return J;
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void k0() {
        l82 l82Var = this.G;
        if (l82Var != null) {
            l82Var.b();
        }
        this.G = null;
    }

    public final void t0(rm2 rm2Var, q02 q02Var) {
        if (!this.A) {
            rm2Var.l(q02Var);
        } else {
            s22 s22Var = (s22) e0().e().K(fz0.h0);
            fu.G(e0(), null, null, new r(rm2Var, q02Var, s22Var != null ? s22Var.M(new o(8, rm2Var, q02Var)) : null, null, 6), 3);
        }
    }

    public final void u0() {
        w12 w12Var;
        if (this.A) {
            if (!this.n.A) {
                cz1.b("visitAncestors called on an unattached node");
            }
            cx2 cx2Var = this.n.r;
            c72 c72VarO = j51.O(this);
            while (c72VarO != null) {
                if ((((cx2) c72VarO.Q.g).q & 262144) != 0) {
                    while (cx2Var != null) {
                        if ((cx2Var.p & 262144) != 0) {
                            cx2 cx2VarC = cx2Var;
                            f13 f13Var = null;
                            while (cx2VarC != null) {
                                if (cx2VarC instanceof rx4) {
                                    if (fa1.B == ((rx4) cx2VarC).f()) {
                                        return;
                                    }
                                }
                                if ((cx2VarC.p & 262144) != 0 && (cx2VarC instanceof fo0)) {
                                    int i = 0;
                                    for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                        if ((cx2Var2.p & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cx2VarC = cx2Var2;
                                            } else {
                                                if (f13Var == null) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (cx2VarC != null) {
                                                    f13Var.b(cx2VarC);
                                                    cx2VarC = null;
                                                }
                                                f13Var.b(cx2Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cx2VarC = j51.c(f13Var);
                            }
                        }
                        cx2Var = cx2Var.r;
                    }
                }
                c72VarO = c72VarO.t();
                cx2Var = (c72VarO == null || (w12Var = c72VarO.Q) == null) ? null : (sq4) w12Var.f;
            }
        }
    }

    public final void v0(rm2 rm2Var) {
        if (h12.c(this.D, rm2Var)) {
            return;
        }
        rm2 rm2Var2 = this.D;
        if (rm2Var2 != null && this.F != null) {
            rm2Var2.l(new q91());
        }
        this.F = null;
        this.D = rm2Var;
    }
}
