package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fo0 extends cx2 {
    public final int B = g63.d(this);
    public cx2 C;

    @Override // defpackage.cx2
    public final void g0() {
        super.g0();
        for (cx2 cx2Var = this.C; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.p0(this.u);
            if (!cx2Var.A) {
                cx2Var.g0();
            }
        }
    }

    @Override // defpackage.cx2
    public final void h0() {
        for (cx2 cx2Var = this.C; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.h0();
        }
        super.h0();
    }

    @Override // defpackage.cx2
    public final void l0() {
        super.l0();
        for (cx2 cx2Var = this.C; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.l0();
        }
    }

    @Override // defpackage.cx2
    public final void m0() {
        for (cx2 cx2Var = this.C; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.m0();
        }
        super.m0();
    }

    @Override // defpackage.cx2
    public final void n0() {
        super.n0();
        for (cx2 cx2Var = this.C; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.n0();
        }
    }

    @Override // defpackage.cx2
    public final void o0(cx2 cx2Var) {
        this.n = cx2Var;
        for (cx2 cx2Var2 = this.C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
            cx2Var2.o0(cx2Var);
        }
    }

    @Override // defpackage.cx2
    public final void p0(f63 f63Var) {
        this.u = f63Var;
        for (cx2 cx2Var = this.C; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.p0(f63Var);
        }
    }

    public final eo0 q0(eo0 eo0Var) {
        cx2 cx2Var = ((cx2) eo0Var).n;
        if (cx2Var != eo0Var) {
            cx2 cx2Var2 = eo0Var instanceof cx2 ? (cx2) eo0Var : null;
            cx2 cx2Var3 = cx2Var2 != null ? cx2Var2.r : null;
            if (cx2Var != this.n || !h12.c(cx2Var3, this)) {
                kf2.o("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (cx2Var.A) {
                cz1.b("Cannot delegate to an already attached node");
            }
            cx2Var.o0(this.n);
            int i = this.p;
            int iE = g63.e(cx2Var);
            cx2Var.p = iE;
            int i2 = this.p;
            int i3 = iE & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof u62)) {
                cz1.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cx2Var);
            }
            cx2Var.s = this.C;
            this.C = cx2Var;
            cx2Var.r = this;
            s0(iE | this.p, false);
            if (this.A) {
                if (i3 == 0 || (i & 2) != 0) {
                    p0(this.u);
                } else {
                    w12 w12Var = j51.O(this).Q;
                    this.n.p0(null);
                    w12Var.g();
                }
                cx2Var.g0();
                cx2Var.m0();
                if (!cx2Var.A) {
                    cz1.b("autoInvalidateInsertedNode called on unattached node");
                }
                g63.a(cx2Var, -1, 1);
            }
        }
        return eo0Var;
    }

    public final void r0(eo0 eo0Var) {
        cx2 cx2Var = null;
        for (cx2 cx2Var2 = this.C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
            if (cx2Var2 == eo0Var) {
                boolean z = cx2Var2.A;
                if (z) {
                    p03 p03Var = g63.a;
                    if (!z) {
                        cz1.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g63.a(cx2Var2, -1, 2);
                    cx2Var2.n0();
                    cx2Var2.h0();
                }
                cx2Var2.o0(cx2Var2);
                cx2Var2.q = 0;
                cx2 cx2Var3 = cx2Var2.s;
                if (cx2Var == null) {
                    this.C = cx2Var3;
                } else {
                    cx2Var.s = cx2Var3;
                }
                cx2Var2.s = null;
                cx2Var2.r = null;
                int i = this.p;
                int iE = g63.e(this);
                s0(iE, true);
                if (this.A && (i & 2) != 0 && (iE & 2) == 0) {
                    w12 w12Var = j51.O(this).Q;
                    this.n.p0(null);
                    w12Var.g();
                    return;
                }
                return;
            }
            cx2Var = cx2Var2;
        }
        mj0.g(eo0Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void s0(int i, boolean z) {
        cx2 cx2Var;
        int i2 = this.p;
        this.p = i;
        if (i2 != i) {
            cx2 cx2Var2 = this.n;
            if (cx2Var2 == this) {
                this.q = i;
            }
            boolean z2 = this.A;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.p;
                    r2.p = i;
                    if (r2 == cx2Var2) {
                        break;
                    } else {
                        r2 = r2.r;
                    }
                }
                if (z && r2 == cx2Var2) {
                    i = g63.e(cx2Var2);
                    cx2Var2.p = i;
                }
                int i3 = i | ((r2 == 0 || (cx2Var = r2.s) == null) ? 0 : cx2Var.q);
                for (?? r3 = r2; r3 != 0; r3 = r3.r) {
                    i3 |= r3.p;
                    r3.q = i3;
                }
            }
        }
    }
}
