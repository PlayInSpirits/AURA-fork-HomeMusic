package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wt4 implements no2, mo2 {
    public final no2 n;
    public final long o;
    public mo2 p;

    public wt4(no2 r1, long r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.mo2
    public final void b(no2 r1) {
        mo2 r2 = this.p;
        r2.getClass();
        r2.b(this);
    }

    @Override // defpackage.no2
    public final long c(t41[] r12, boolean[] r13, q44[] r14, boolean[] r15, long r16) {
        q44[] r4 = new q44[r14.length];
        int r0 = 0;
        int r1 = 0;
    L3:
        q44 r8 = null;
        if (r1 >= r14.length) goto L9;
        vt4 r2 = (vt4) r14[r1];
        if (r2 == null) goto L8;
        r8 = r2.n;
    L8:
        r4[r1] = r8;
        r1 = r1 + 1;
        goto L3
    L9:
        no2 r3 = this.n;
        long r9 = this.o;
        long r11 = r3.c(r12, r13, r4, r15, r16 - r9);
    L11:
        if (r0 >= r14.length) goto L22;
        q44 r17 = r4[r0];
        if (r17 != null) goto L15;
        r14[r0] = null;
    L20:
        r0 = r0 + 1;
        goto L11
    L15:
        q44 r5 = r14[r0];
        if (r5 != null) goto L18;
    L19:
        r14[r0] = new vt4(r17, r9);
        goto L20
    L18:
        if (((vt4) r5).n == r17) goto L20;
    L22:
        return r11 + r9;
    }

    @Override // defpackage.da4
    public final long d() {
        long r0 = this.n.d();
        if (r0 != Long.MIN_VALUE) goto L6;
        return Long.MIN_VALUE;
    L6:
        return r0 + this.o;
    }

    @Override // defpackage.no2
    public final long e(long r3, n84 r5) {
        long r0 = this.o;
        no2 r2 = this.n;
        return r2.e(r3 - r0, r5) + r0;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.n.f();
    }

    @Override // defpackage.no2
    public final void h() {
        this.n.h();
    }

    @Override // defpackage.no2
    public final long i(long r3) {
        long r0 = this.o;
        no2 r2 = this.n;
        return r2.i(r3 - r0) + r0;
    }

    @Override // defpackage.ca4
    public final void j(da4 r1) {
        no2 r2 = (no2) r1;
        mo2 r3 = this.p;
        r3.getClass();
        r3.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean r3, long r4) {
        long r5 = r4 - this.o;
        this.n.k(r3, r5);
    }

    @Override // defpackage.no2
    public final long l() {
        long r0 = this.n.l();
        if (r0 != (-9223372036854775807L)) goto L6;
        return -9223372036854775807L;
    L6:
        return r0 + this.o;
    }

    @Override // defpackage.no2
    public final void m(mo2 r3, long r4) {
        this.p = r3;
        long r5 = r4 - this.o;
        this.n.m(this, r5);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        return this.n.n();
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r6) {
        od2 r0 = new od2();
        long r1 = r6.a;
        r0.b = r6.b;
        r0.c = r6.c;
        r0.a = r1 - this.o;
        pd2 r7 = new pd2(r0);
        return this.n.o(r7);
    }

    @Override // defpackage.da4
    public final long q() {
        long r0 = this.n.q();
        if (r0 != Long.MIN_VALUE) goto L6;
        return Long.MIN_VALUE;
    L6:
        return r0 + this.o;
    }

    @Override // defpackage.da4
    public final void u(long r3) {
        long r4 = r3 - this.o;
        this.n.u(r4);
    }
}
