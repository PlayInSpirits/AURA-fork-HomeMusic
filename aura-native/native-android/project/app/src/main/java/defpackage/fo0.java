package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public abstract class fo0
extends cx2 {
    public final int B = g63.d(this);
    public cx2 C;

    @Override
    public final void g0() {
        super.g0();
        cx2 cx22 = this.C;
        while (cx22 != null) {
            cx22.p0(this.u);
            if (!cx22.A) {
                cx22.g0();
            }
            cx22 = cx22.s;
        }
    }

    @Override
    public final void h0() {
        cx2 cx22 = this.C;
        while (cx22 != null) {
            cx22.h0();
            cx22 = cx22.s;
        }
        super.h0();
    }

    @Override
    public final void l0() {
        super.l0();
        cx2 cx22 = this.C;
        while (cx22 != null) {
            cx22.l0();
            cx22 = cx22.s;
        }
    }

    @Override
    public final void m0() {
        cx2 cx22 = this.C;
        while (cx22 != null) {
            cx22.m0();
            cx22 = cx22.s;
        }
        super.m0();
    }

    @Override
    public final void n0() {
        super.n0();
        cx2 cx22 = this.C;
        while (cx22 != null) {
            cx22.n0();
            cx22 = cx22.s;
        }
    }

    @Override
    public final void o0(cx2 cx22) {
        this.n = cx22;
        cx2 cx23 = this.C;
        while (cx23 != null) {
            cx23.o0(cx22);
            cx23 = cx23.s;
        }
    }

    @Override
    public final void p0(f63 f632) {
        this.u = f632;
        cx2 cx22 = this.C;
        while (cx22 != null) {
            cx22.p0(f632);
            cx22 = cx22.s;
        }
    }

    public final eo0 q0(eo0 eo02) {
        cx2 cx22 = ((cx2)eo02).n;
        if (cx22 != eo02) {
            cx2 cx23 = eo02 instanceof cx2 ? (cx2)eo02 : null;
            cx23 = cx23 != null ? cx23.r : null;
            if (cx22 != this.n || !h12.c(cx23, this)) {
                kf2.o("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            Object object;
            int n16;
            if (cx22.A) {
                cz1.b("Cannot delegate to an already attached node");
            }
            cx22.o0(this.n);
            int n17 = this.p;
            cx22.p = n16 = g63.e(cx22);
            int n18 = this.p;
            int n19 = n16 & 2;
            if (n19 != 0 && (n18 & 2) != 0 && !(this instanceof u62)) {
                object = new StringBuilder("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
                ((StringBuilder)object).append(this);
                ((StringBuilder)object).append("\nDelegate Node: ");
                ((StringBuilder)object).append(cx22);
                cz1.b(((StringBuilder)object).toString());
            }
            cx22.s = this.C;
            this.C = cx22;
            cx22.r = this;
            this.s0(n16 | this.p, false);
            if (this.A) {
                if (n19 != 0 && (n17 & 2) == 0) {
                    object = j51.O((eo0)this).Q;
                    this.n.p0(null);
                    ((w12)object).g();
                } else {
                    this.p0(this.u);
                }
                cx22.g0();
                cx22.m0();
                if (!cx22.A) {
                    cz1.b("autoInvalidateInsertedNode called on unattached node");
                }
                g63.a(cx22, -1, 1);
            }
        }
        return eo02;
    }

    public final void r0(eo0 object) {
        cx2 cx22 = this.C;
        cx2 cx23 = null;
        while (cx22 != null) {
            if (cx22 == object) {
                boolean bl5 = cx22.A;
                if (bl5) {
                    object = g63.a;
                    if (!bl5) {
                        cz1.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g63.a(cx22, -1, 2);
                    cx22.n0();
                    cx22.h0();
                }
                cx22.o0(cx22);
                cx22.q = 0;
                object = cx22.s;
                if (cx23 == null) {
                    this.C = object;
                } else {
                    cx23.s = object;
                }
                cx22.s = null;
                cx22.r = null;
                int n16 = this.p;
                int n17 = g63.e(this);
                this.s0(n17, true);
                if (this.A && (n16 & 2) != 0 && (n17 & 2) == 0) {
                    object = j51.O((eo0)this).Q;
                    this.n.p0(null);
                    ((w12)object).g();
                }
                return;
            }
            cx2 cx24 = cx22.s;
            cx23 = cx22;
            cx22 = cx24;
        }
        mj0.g(object, "Could not find delegate: ");
    }

    public final void s0(int n16, boolean bl5) {
        int n17 = this.p;
        this.p = n16;
        if (n17 != n16) {
            cx2 cx22 = this.n;
            if (cx22 == this) {
                this.q = n16;
            }
            if (this.A) {
                n17 = n16;
                cx2 cx23 = this;
                while (true) {
                    n16 = n17;
                    if (cx23 == null) break;
                    cx23.p = n17 |= cx23.p;
                    n16 = n17;
                    if (cx23 == cx22) break;
                    cx23 = cx23.r;
                }
                n17 = n16;
                if (bl5) {
                    n17 = n16;
                    if (cx23 == cx22) {
                        cx22.p = n17 = g63.e(cx22);
                    }
                }
                n16 = cx23 != null && (cx22 = cx23.s) != null ? cx22.q : 0;
                n16 = n17 | n16;
                while (cx23 != null) {
                    cx23.q = n16 |= cx23.p;
                    cx23 = cx23.r;
                }
            }
        }
    }
}

