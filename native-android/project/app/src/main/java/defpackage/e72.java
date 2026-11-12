package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e72 implements sv0 {
    public final mz n;
    public rv0 o;

    public e72() {
        this.n = new mz();
    }

    @Override // defpackage.oo0
    public final float D(float r1) {
        return r1 / this.n.g();
    }

    @Override // defpackage.sv0
    public final void H(long r1, long r3, long r5, q05 r7, int r8) {
        this.n.H(r1, r3, r5, r7, r8);
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.n.J();
    }

    @Override // defpackage.oo0
    public final float M(float r1) {
        return this.n.g() * r1;
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
    public final void U(cc r1, long r2, long r4, long r6, float r8, dt r9, int r10) {
        this.n.U(r1, r2, r4, r6, r8, r9, r10);
    }

    @Override // defpackage.oo0
    public final int V(float r1) {
        return this.n.V(r1);
    }

    @Override // defpackage.sv0
    public final long W() {
        return this.n.W();
    }

    @Override // defpackage.oo0
    public final long Y(long r1) {
        return this.n.Y(r1);
    }

    public final void a() {
        mz r0 = this.n;
        jz r3 = r0.o.g();
        eo0 r11 = this.o;
        if (r11 == null) goto L53;
        cx2 r1 = (cx2) r11;
        cx2 r2 = r1.n.s;
        if (r2 != null) goto L8;
    L18:
        r2 = null;
    L19:
        if (r2 == null) goto L47;
        f13 r12 = null;
    L21:
        if (r2 == null) goto L46;
        if ((r2 instanceof rv0) == true) goto L24;
        if ((r2.p & 4) == 0) goto L45;
        if ((r2 instanceof fo0) == false) goto L45;
        cx2 r4 = ((fo0) r2).C;
        int r5 = 0;
    L31:
        if (r4 == null) goto L43;
        if ((r4.p & 4) == 0) goto L42;
        r5 = r5 + 1;
        if (r5 != 1) goto L37;
        r2 = r4;
        goto L42
    L37:
        if (r12 != null) goto L39;
        r12 = new f13(new cx2[16]);
    L39:
        if (r2 == null) goto L41;
        r12.b(r2);
        r2 = null;
    L41:
        r12.b(r4);
    L42:
        r4 = r4.s;
        goto L31
    L43:
        if (r5 == 1) goto L21;
    L45:
        r2 = j51.c(r12);
        goto L21
    L24:
        rv0 r7 = (rv0) r2;
        sj1 r8 = (sj1) r0.o.p;
        f63 r6 = j51.M(r7, 4);
        long r9 = l93.o0(r6.p);
        c72 r10 = r6.H;
        r10.getClass();
        ((ra) h12.L(r10)).getSharedDrawScope().b(r3, r9, r6, r7, r8);
        goto L45
    L46:
        return;
    L47:
        f63 r13 = j51.M(r11, 4);
        if (r13.A0() != r1.n) goto L50;
        r13 = r13.I;
        r13.getClass();
    L50:
        r13.R0(r3, (sj1) r0.o.p);
        return;
    L8:
        if ((r2.q & 4) == 0) goto L18;
    L10:
        if (r2 == null) goto L18;
        int r14 = r2.p;
        if ((r14 & 2) != 0) goto L18;
        if ((r14 & 4) != 0) goto L19;
        r2 = r2.s;
        goto L10
    L53:
        throw xa3.l("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // defpackage.oo0
    public final float a0(long r1) {
        return this.n.a0(r1);
    }

    public final void b(jz r10, long r11, f63 r13, rv0 r14, sj1 r15) {
        rv0 r0 = this.o;
        this.o = r14;
        r62 r1 = r13.H.K;
        mz r2 = this.n;
        oo0 r3 = r2.o.h();
        i61 r4 = r2.o;
        r62 r5 = r4.i();
        jz r6 = r4.g();
        long r7 = r4.j();
        sj1 r8 = (sj1) r4.p;
        r4.r(r13);
        r4.s(r1);
        r4.q(r10);
        r4.t(r11);
        r4.p = r15;
        r10.e();
        r14.S(this);     // Catch: Throwable -> L6
        r10.k();
        r4.r(r3);
        r4.s(r5);
        r4.q(r6);
        r4.t(r7);
        r4.p = r8;
        this.o = r0;
        return;
    L6:
        th = move-exception;
        r10.k();
        r4.r(r3);
        r4.s(r5);
        r4.q(r6);
        r4.t(r7);
        r4.p = r8;
        throw th;
    }

    public final void c(nc r3, long r4, q05 r6) {
        mz r2 = this.n;
        r2.n.c.c(r3, mz.a(r2, r4, r6, 3));
    }

    @Override // defpackage.sv0
    public final void d(nc r1, uo r2, float r3, q05 r4) {
        this.n.d(r1, r2, r3, r4);
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
    public final long h(float r1) {
        return this.n.h(r1);
    }

    @Override // defpackage.oo0
    public final long i(long r1) {
        return this.n.i(r1);
    }

    @Override // defpackage.oo0
    public final float o(long r1) {
        return this.n.o(r1);
    }

    @Override // defpackage.oo0
    public final long w(float r1) {
        return this.n.w(r1);
    }
}
