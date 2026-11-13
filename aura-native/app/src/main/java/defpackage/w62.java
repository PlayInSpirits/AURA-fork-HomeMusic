package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w62 extends f63 {
    public static final gc p0;
    public u62 n0;
    public v62 o0;

    static {
        gc b = fh0.b();
        b.f(x40.e);
        ((Paint) b.b).setStrokeWidth(1.0f);
        b.h(1);
        p0 = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w62(c72 c72Var, u62 u62Var) {
        super(c72Var);
        this.n0 = u62Var;
        this.o0 = c72Var.u != null ? new v62(this) : null;
        if ((((cx2) u62Var).n.p & 512) == 0) {
            return;
        }
        kf2.k();
        throw null;
    }

    @Override // defpackage.f63
    public final cx2 A0() {
        return ((cx2) this.n0).n;
    }

    @Override // defpackage.jg3
    public final void N(long j, float f, if1 if1Var) {
        S0(j, f, if1Var);
        if (this.A) {
            return;
        }
        N0();
        f63 f63Var = this.I;
        f63Var.getClass();
        boolean z = f63Var.B;
        f63Var.B = this.B;
        h0().c();
        f63Var.B = z;
    }

    @Override // defpackage.f63
    public final void R0(jz jzVar, sj1 sj1Var) {
        f63 f63Var;
        f63 f63Var2 = this.I;
        f63Var2.getClass();
        f63Var2.t0(jzVar, sj1Var);
        if (!((ra) h12.L(this.H)).getShowLayoutBounds() || (f63Var = this.I) == null) {
            return;
        }
        if (n02.a(this.p, f63Var.p) && g02.a(f63Var.S, 0L)) {
            return;
        }
        long j = this.p;
        jzVar.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, p0);
    }

    @Override // defpackage.cf2
    public final int X(pp1 pp1Var) {
        v62 v62Var = this.o0;
        if (v62Var == null) {
            return zz1.a(this, pp1Var);
        }
        p03 p03Var = v62Var.M;
        int d = p03Var.d(pp1Var);
        if (d >= 0) {
            return p03Var.c[d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(u62 u62Var) {
        if (u62Var.equals(this.n0) || (((cx2) u62Var).n.p & 512) == 0) {
            this.n0 = u62Var;
        } else {
            kf2.k();
        }
    }

    @Override // defpackage.pi2
    public final jg3 r(long j) {
        R(j);
        u62 u62Var = this.n0;
        f63 f63Var = this.I;
        f63Var.getClass();
        V0(u62Var.r(this, f63Var, j));
        M0();
        return this;
    }

    @Override // defpackage.f63
    public final void v0() {
        if (this.o0 == null) {
            this.o0 = new v62(this);
        }
    }

    @Override // defpackage.f63
    public final ef2 y0() {
        return this.o0;
    }
}
