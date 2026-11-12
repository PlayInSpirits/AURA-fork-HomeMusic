package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w62 extends f63 {
    public static final gc p0 = null;
    public u62 n0;
    public v62 o0;

    static {
        gc r0 = fh0.b();
        r0.f(x40.e);
        ((Paint) r0.b).setStrokeWidth(1.0f);
        r0.h(1);
        p0 = r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w62(c72 r2, u62 r3) {
        super(r2);
        this.n0 = r3;
        if (r2.u == null) goto L5;
        v62 r4 = new v62(this);
    L6:
        this.o0 = r4;
        if ((((cx2) r3).n.p & 512) != 0) goto L9;
        return;
    L9:
        kf2.k();
        throw null;
    L5:
        r4 = null;
        goto L6
    }

    @Override // defpackage.f63
    public final cx2 A0() {
        return ((cx2) this.n0).n;
    }

    @Override // defpackage.jg3
    public final void N(long r1, float r3, if1 r4) {
        S0(r1, r3, r4);
        if (this.A == true) goto L7;
        N0();
        f63 r2 = this.I;
        r2.getClass();
        boolean r5 = r2.B;
        r2.B = this.B;
        h0().c();
        r2.B = r5;
        return;
    }

    @Override // defpackage.f63
    public final void R0(jz r9, sj1 r10) {
        f63 r0 = this.I;
        r0.getClass();
        r0.t0(r9, r10);
        if (((ra) h12.L(this.H)).getShowLayoutBounds() == false) goto L12;
        f63 r11 = this.I;
        if (r11 != null) goto L7;
        return;
    L7:
        if (n02.a(this.p, r11.p) == true) goto L9;
    L10:
        long r1 = this.p;
        r9.g(0.5f, 0.5f, ((int) (r1 >> 32)) - 0.5f, ((int) (r1 & 4294967295L)) - 0.5f, p0);
        return;
    L9:
        if (g02.a(r11.S, 0) == false) goto L10;
        return;
    }

    @Override // defpackage.cf2
    public final int X(pp1 r2) {
        v62 r0 = this.o0;
        if (r0 == null) goto L11;
        p03 r1 = r0.M;
        int r3 = r1.d(r2);
        if (r3 >= 0) goto L7;
        return Integer.MIN_VALUE;
    L7:
        return r1.c[r3];
    L11:
        return zz1.a(this, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(u62 r2) {
        if (r2.equals(this.n0) == false) goto L5;
    L9:
        this.n0 = r2;
        return;
    L5:
        if ((((cx2) r2).n.p & 512) == 0) goto L9;
        kf2.k();
    }

    @Override // defpackage.pi2
    public final jg3 r(long r3) {
        R(r3);
        u62 r0 = this.n0;
        f63 r1 = this.I;
        r1.getClass();
        V0(r0.r(this, r1, r3));
        M0();
        return this;
    }

    @Override // defpackage.f63
    public final void v0() {
        if (this.o0 != null) goto L6;
        this.o0 = new v62(this);
        return;
    }

    @Override // defpackage.f63
    public final ef2 y0() {
        return this.o0;
    }
}
