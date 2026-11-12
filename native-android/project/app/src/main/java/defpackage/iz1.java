package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 extends f63 {
    public static final gc p0 = null;
    public final sq4 n0;
    public hz1 o0;

    static {
        gc r0 = fh0.b();
        r0.f(x40.d);
        ((Paint) r0.b).setStrokeWidth(1.0f);
        r0.h(1);
        p0 = r0;
    }

    public iz1(c72 r3) {
        super(r3);
        sq4 r0 = new sq4();
        r0.q = 0;
        this.n0 = r0;
        r0.u = this;
        if (r3.u == null) goto L5;
        hz1 r4 = new hz1(this);
    L6:
        this.o0 = r4;
        return;
    L5:
        r4 = null;
        goto L6
    }

    @Override // defpackage.f63
    public final cx2 A0() {
        return this.n0;
    }

    @Override // defpackage.f63
    public final void H0(e63 r12, long r13, fm1 r15, int r16, boolean r17) {
        c72 r0 = this.H;
        boolean r3 = false;
        if (r12.m(r0) == true) goto L5;
        int r9 = r16;
    L14:
        boolean r10 = r17;
    L15:
        if (r3 == false) goto L38;
        int r11 = r15.p;
        f13 r1 = r0.x();
        Object[] r2 = r1.n;
        int r4 = r1.p - 1;
    L17:
        if (r4 < 0) goto L29;
        c72 r5 = (c72) r2[r4];
        if (r5.H() == false) goto L28;
        r12.i(r5, r13, r15, r9, r10);
        long r6 = r15.a();
        if (g12.u(r6) >= 0.0f) goto L28;
        if (g12.E(r6) == false) goto L28;
        if (g12.D(r6) == true) goto L28;
        if (r12.k(r15, r5) == false) goto L29;
    L28:
        r4 = r4 - 1;
        r9 = r16;
    L29:
        r15.p = r11;
        return;
    L38:
        return;
    L5:
        if (a1(r13) == false) goto L8;
        r9 = r16;
        r10 = r17;
    L7:
        r3 = true;
        goto L15
    L8:
        r9 = r16;
        if (r9 != 1) goto L14;
        if ((Float.floatToRawIntBits(s0(r13, z0())) & Integer.MAX_VALUE) >= 2139095040) goto L14;
        r10 = false;
        goto L7
    }

    @Override // defpackage.jg3
    public final void N(long r1, float r3, if1 r4) {
        S0(r1, r3, r4);
        if (this.A == false) goto L5;
        return;
    L5:
        this.H.R.p.b0();
    }

    @Override // defpackage.f63
    public final void R0(jz r9, sj1 r10) {
        c72 r0 = this.H;
        ub3 r1 = h12.L(r0);
        f13 r2 = r0.x();
        Object[] r3 = r2.n;
        int r4 = r2.p;
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L9;
        c72 r6 = (c72) r3[r5];
        if (r6.H() == false) goto L7;
        r6.i(r9, r10);
    L7:
        r5 = r5 + 1;
        goto L3
    L9:
        if (((ra) r1).getShowLayoutBounds() == false) goto L15;
        long r7 = this.p;
        r9.g(0.5f, 0.5f, ((int) (r7 >> 32)) - 0.5f, ((int) (r7 & 4294967295L)) - 0.5f, p0);
        return;
    }

    @Override // defpackage.cf2
    public final int X(pp1 r5) {
        hz1 r0 = this.o0;
        if (r0 != null) goto L5;
        ti2 r4 = this.H.R.p;
        y62 r1 = r4.s.d;
        d72 r2 = r4.H;
        if (r1 != y62.n) goto L11;
        r2.d = true;
        if (r2.b == false) goto L12;
        r4.F = true;
        r4.G = true;
    L12:
        iz1 r3 = r4.c();
        boolean r6 = r3.B;
        r3.B = true;
        r4.y();
        r3.B = r6;
        Integer r7 = (Integer) r2.g.get(r5);
        if (r7 != null) goto L15;
        return Integer.MIN_VALUE;
    L15:
        return r7.intValue();
    L11:
        r2.e = true;
        goto L12
    L5:
        return r0.X(r5);
    }

    @Override // defpackage.pi2
    public final jg3 r(long r7) {
        R(r7);
        c72 r0 = this.H;
        f13 r1 = r0.y();
        Object[] r2 = r1.n;
        int r3 = r1.p;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L5;
        ti2 r5 = ((c72) r2[r4]).R.p;
        r5.y = a72.p;
        r4 = r4 + 1;
        goto L3
    L5:
        V0(r0.I.a(this, r0.R.p.S(), r7));
        M0();
        return this;
    }

    @Override // defpackage.f63
    public final void v0() {
        if (this.o0 != null) goto L6;
        this.o0 = new hz1(this);
        return;
    }

    @Override // defpackage.f63
    public final ef2 y0() {
        return this.o0;
    }
}
