package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 extends cx2 implements rx4, o62 {
    public pu0 B;
    public pu0 C;
    public long D;

    @Override // defpackage.o62, defpackage.yi2
    public final void a(long r1) {
        this.D = r1;
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
        pu0 r0 = this.B;
        if (r0 != null) goto L11;
        pu0 r1 = this.C;
        if (r1 != null) goto L7;
        return false;
    L7:
        return r1.q0();
    L11:
        return r0.q0();
    }

    public final void r0() {
        pu0 r0 = this.C;
        if (r0 != null) goto L8;
        pu0 r1 = this.B;
        if (r1 == null) goto L10;
        r1.r0();
        return;
    L10:
        return;
    L8:
        r0.r0();
    }

    public final void s0() {
        pu0 r0 = this.C;
        if (r0 == null) goto L5;
        r0.s0();
    L5:
        pu0 r1 = this.B;
        if (r1 == null) goto L8;
        r1.s0();
    L8:
        this.B = null;
    }

    public final void t0(zg5 r4) {
        pu0 r0 = this.B;
        if (r0 == null) goto L8;
        if (ud3.a(r0, su3.u(r4)) != true) goto L8;
        pu0 r1 = r0;
    L12:
        if (r1 == null) goto L17;
        if (r0 != null) goto L17;
        r1.r0();
        r1.t0(r4);
        pu0 r5 = this.C;
        if (r5 == null) goto L34;
        r5.s0();
    L34:
        this.B = r1;
        return;
    L17:
        if (r1 != null) goto L24;
        if (r0 == null) goto L24;
        pu0 r2 = this.C;
        if (r2 == null) goto L22;
        r2.r0();
        r2.t0(r4);
    L22:
        r0.s0();
    L24:
        if (h12.c(r1, r0) == true) goto L29;
        if (r1 == null) goto L27;
        r1.r0();
        r1.t0(r4);
    L27:
        if (r0 == null) goto L34;
        r0.s0();
        goto L34
    L29:
        if (r1 == null) goto L31;
        r1.t0(r4);
        goto L34
    L31:
        pu0 r3 = this.C;
        if (r3 == null) goto L34;
        r3.t0(r4);
    L8:
        if (this.n.A == true) goto L10;
        rx4 r6 = null;
    L11:
        r1 = (pu0) r6;
        goto L12
    L10:
        jx3 r7 = new jx3();
        gh0.J(this, new ou0(r7, this, r4));
        r6 = (rx4) r7.n;
        goto L11
    }

    public final void u0() {
        pu0 r0 = this.C;
        if (r0 != null) goto L8;
        pu0 r1 = this.B;
        if (r1 == null) goto L10;
        r1.u0();
        return;
    L10:
        return;
    L8:
        r0.u0();
    }
}
