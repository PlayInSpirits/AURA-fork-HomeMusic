package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class e72 implements sv0 {
    public final mz n = new mz();
    public rv0 o;

    @Override // defpackage.oo0
    public final float D(float f) {
        return f / this.n.g();
    }

    @Override // defpackage.sv0
    public final void H(long j, long j2, long j3, q05 q05Var, int i) {
        this.n.H(j, j2, j3, q05Var, i);
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.J();
    }

    @Override // defpackage.oo0
    public final float M(float f) {
        return this.n.g() * f;
    }

    @Override // defpackage.sv0
    public final i61 O() {
        return this.n.o;
    }

    @Override // defpackage.sv0
    public final long P() {
        return this.n.P();
    }

    @Override // defpackage.sv0
    public final void U(cc ccVar, long j, long j2, long j3, float f, dt dtVar, int i) {
        this.n.U(ccVar, j, j2, j3, f, dtVar, i);
    }

    @Override // defpackage.oo0
    public final int V(float f) {
        return this.n.V(f);
    }

    @Override // defpackage.sv0
    public final long W() {
        return this.n.W();
    }

    @Override // defpackage.oo0
    public final long Y(long j) {
        return this.n.Y(j);
    }

    public final void a() {
        mz mzVar = this.n;
        jz g = mzVar.o.g();
        eo0 eo0Var = this.o;
        if (eo0Var == null) {
            throw xa3.l("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        cx2 cx2Var = (cx2) eo0Var;
        cx2 cx2Var2 = cx2Var.n.s;
        if (cx2Var2 != null && (cx2Var2.q & 4) != 0) {
            while (cx2Var2 != null) {
                int i = cx2Var2.p;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    cx2Var2 = cx2Var2.s;
                }
            }
        }
        cx2Var2 = null;
        if (cx2Var2 == null) {
            f63 M = j51.M(eo0Var, 4);
            if (M.A0() == cx2Var.n) {
                M = M.I;
                M.getClass();
            }
            M.R0(g, (sj1) mzVar.o.p);
            return;
        }
        f13 f13Var = null;
        while (cx2Var2 != null) {
            if (cx2Var2 instanceof rv0) {
                rv0 rv0Var = (rv0) cx2Var2;
                sj1 sj1Var = (sj1) mzVar.o.p;
                f63 M2 = j51.M(rv0Var, 4);
                long o0 = l93.o0(M2.p);
                c72 c72Var = M2.H;
                c72Var.getClass();
                ((ra) h12.L(c72Var)).getSharedDrawScope().b(g, o0, M2, rv0Var, sj1Var);
            } else if ((cx2Var2.p & 4) != 0 && (cx2Var2 instanceof fo0)) {
                int i2 = 0;
                for (cx2 cx2Var3 = ((fo0) cx2Var2).C; cx2Var3 != null; cx2Var3 = cx2Var3.s) {
                    if ((cx2Var3.p & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cx2Var2 = cx2Var3;
                        } else {
                            if (f13Var == null) {
                                f13Var = new f13(new cx2[16]);
                            }
                            if (cx2Var2 != null) {
                                f13Var.b(cx2Var2);
                                cx2Var2 = null;
                            }
                            f13Var.b(cx2Var3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            cx2Var2 = j51.c(f13Var);
        }
    }

    @Override // defpackage.oo0
    public final float a0(long j) {
        return this.n.a0(j);
    }

    public final void b(jz jzVar, long j, f63 f63Var, rv0 rv0Var, sj1 sj1Var) {
        rv0 rv0Var2 = this.o;
        this.o = rv0Var;
        r62 r62Var = f63Var.H.K;
        mz mzVar = this.n;
        oo0 h = mzVar.o.h();
        i61 i61Var = mzVar.o;
        r62 i = i61Var.i();
        jz g = i61Var.g();
        long j2 = i61Var.j();
        sj1 sj1Var2 = (sj1) i61Var.p;
        i61Var.r(f63Var);
        i61Var.s(r62Var);
        i61Var.q(jzVar);
        i61Var.t(j);
        i61Var.p = sj1Var;
        jzVar.e();
        try {
            rv0Var.S(this);
            jzVar.k();
            i61Var.r(h);
            i61Var.s(i);
            i61Var.q(g);
            i61Var.t(j2);
            i61Var.p = sj1Var2;
            this.o = rv0Var2;
        } catch (Throwable th) {
            jzVar.k();
            i61Var.r(h);
            i61Var.s(i);
            i61Var.q(g);
            i61Var.t(j2);
            i61Var.p = sj1Var2;
            throw th;
        }
    }

    public final void c(nc ncVar, long j, q05 q05Var) {
        mz mzVar = this.n;
        mzVar.n.c.c(ncVar, mz.a(mzVar, j, q05Var, 3));
    }

    @Override // defpackage.sv0
    public final void d(nc ncVar, uo uoVar, float f, q05 q05Var) {
        this.n.d(ncVar, uoVar, f, q05Var);
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.n.g();
    }

    @Override // defpackage.sv0
    public final r62 getLayoutDirection() {
        return this.n.n.b;
    }

    @Override // defpackage.oo0
    public final long h(float f) {
        return this.n.h(f);
    }

    @Override // defpackage.oo0
    public final long i(long j) {
        return this.n.i(j);
    }

    @Override // defpackage.oo0
    public final float o(long j) {
        return this.n.o(j);
    }

    @Override // defpackage.oo0
    public final long w(float f) {
        return this.n.w(f);
    }
}
