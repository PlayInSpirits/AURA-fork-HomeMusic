package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class if2 extends jg3 implements pi2, k9, yx2 {
    public long A;
    public if1 B;
    public hf2 C;
    public final d72 D;
    public final f13 E;
    public boolean F;
    public boolean G;
    public final gf2 H;
    public long I;
    public final gf2 J;
    public final gf2 K;
    public boolean L;
    public final f72 s;
    public boolean t;
    public int u;
    public int v;
    public a72 w;
    public boolean x;
    public boolean y;
    public nc0 z;

    /* JADX WARN: Type inference failed for: r0v6, types: [gf2] */
    /* JADX WARN: Type inference failed for: r5v3, types: [gf2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gf2] */
    public if2(f72 r5) {
        this.s = r5;
        this.u = Integer.MAX_VALUE;
        this.v = Integer.MAX_VALUE;
        this.w = a72.p;
        this.A = 0;
        this.C = hf2.p;
        final int r1 = 1;
        this.D = new d72(this, 1);
        this.E = new f13(new if2[16]);
        this.F = true;
        final int r2 = 0;
        this.H = new gf2(this, r2);
        r5.p.getClass();
        this.I = qc0.b(0, 0, 15);
        this.J = new gf2(this, r1);
        final int r0 = 2;
        this.K = new gf2(this, r0);
    }

    @Override // defpackage.k9
    public final void E() {
        c72.U(this.s.a, false, 7);
    }

    @Override // defpackage.jg3
    public final void N(long r1, float r3, if1 r4) {
        d0(r1, r4);
    }

    public final boolean S() {
        f72 r1 = this.s;
        if (h12.A(r1.a) == false) goto L5;
        return true;
    L5:
        if (r1.c == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final void X(boolean r4) {
        if (r4 == true) goto L4;
    L5:
        if (r4 == false) goto L7;
    L9:
        this.C = hf2.p;
        f13 r3 = this.s.a.y();
        Object[] r5 = r3.n;
        int r6 = r3.p;
        int r0 = 0;
    L10:
        if (r0 >= r6) goto L15;
        if2 r1 = ((c72) r5[r0]).R.q;
        r1.getClass();
        r1.X(true);
        r0 = r0 + 1;
        goto L10
    L15:
        return;
    L7:
        if (S() == true) goto L9;
        return;
    L4:
        if (S() == false) goto L5;
    }

    public final void Z() {
        hf2 r0 = this.C;
        f72 r1 = this.s;
        boolean r2 = r1.c;
        c72 r3 = r1.a;
        hf2 r4 = hf2.n;
        if (r2 == false) goto L5;
        this.C = hf2.o;
    L6:
        if (r0 != r4) goto L8;
    L10:
        f13 r6 = r3.y();
        Object[] r5 = r6.n;
        int r7 = r6.p;
        int r8 = 0;
    L11:
        if (r8 >= r7) goto L24;
        c72 r9 = (c72) r5[r8];
        if2 r10 = r9.R.q;
        if (r10 == null) goto L18;
        if (r10.v == Integer.MAX_VALUE) goto L17;
        r10.Z();
        c72.X(r9);
    L17:
        r8 = r8 + 1;
        goto L11
    L18:
        kf2.n("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
        return;
    L24:
        return;
    L8:
        if (r1.e == false) goto L10;
        c72.U(r3, true, 6);
        goto L10
    L5:
        this.C = r4;
        goto L6
    }

    @Override // defpackage.k9
    public final d72 a() {
        return this.D;
    }

    public final void b0() {
        f72 r6 = this.s;
        if (r6.o <= 0) goto L17;
        f13 r7 = r6.a.y();
        Object[] r0 = r7.n;
        int r8 = r7.p;
        int r2 = 0;
    L5:
        if (r2 >= r8) goto L21;
        c72 r3 = (c72) r0[r2];
        f72 r4 = r3.R;
        if (r4.m == true) goto L11;
        if (r4.n == true) goto L11;
    L13:
        if2 r5 = r4.q;
        if (r5 == null) goto L16;
        r5.b0();
    L16:
        r2 = r2 + 1;
    L11:
        if (r4.f == true) goto L13;
        r3.T(false);
        goto L13
    L21:
        return;
    }

    @Override // defpackage.k9
    public final iz1 c() {
        return (iz1) this.s.a.Q.d;
    }

    public final void c0() {
        this.L = true;
        f72 r1 = this.s;
        c72 r2 = r1.a.t();
        hf2 r3 = this.C;
        if (r3 == hf2.n) goto L7;
        if (r1.c == true) goto L7;
    L10:
        Z();
        if (this.t == false) goto L14;
        if (r2 == null) goto L14;
        r2.T(false);
    L14:
        if (r2 == null) goto L26;
        f72 r4 = r2.R;
        if (this.t == true) goto L27;
        y62 r5 = r4.d;
        if (r5 == y62.p) goto L22;
        if (r5 != y62.q) goto L27;
    L22:
        if (this.v == Integer.MAX_VALUE) goto L25;
        cz1.b("Place was called on a node which was placed already");
    L25:
        int r6 = r4.h;
        this.v = r6;
        r4.h = r6 + 1;
    L27:
        y();
        return;
    L26:
        this.v = 0;
    L7:
        if (r3 == hf2.o) goto L14;
        if (r1.c == false) goto L14;
        goto L10
    }

    public final void d0(long r10, if1 r12) {
        f72 r0 = this.s;
        c72 r1 = r0.a;
        c72 r2 = r0.a;
        c72 r4 = r1.t();     // Catch: Throwable -> L10
        if (r4 == null) goto L6;
        y62 r5 = r4.R.d;     // Catch: Throwable -> L10
    L7:
        y62 r6 = y62.q;     // Catch: Throwable -> L10
        if (r5 != r6) goto L13;
        r0.c = false;     // Catch: Throwable -> L10
    L13:
        if (r2.Z == false) goto L15;
        cz1.a("place is called on a deactivated node");     // Catch: Throwable -> L10
    L15:
        r0.d = r6;     // Catch: Throwable -> L10
        boolean r7 = true;
        this.x = true;     // Catch: Throwable -> L10
        this.L = false;     // Catch: Throwable -> L10
        if (g02.a(r10, this.A) == false) goto L18;
    L23:
        ub3 r8 = h12.L(r2);     // Catch: Throwable -> L10
        this.A = r10;     // Catch: Throwable -> L10
        if (r0.f == false) goto L26;
    L31:
        r0.h(false);     // Catch: Throwable -> L10
        this.D.e = false;     // Catch: Throwable -> L10
        wb3 r11 = ((ra) r8).getSnapshotObserver();     // Catch: Throwable -> L10
        gf2 r13 = this.K;     // Catch: Throwable -> L10
        r11.a.e(r2, r11.g, r13);     // Catch: Throwable -> L10
    L32:
        this.B = r12;     // Catch: Throwable -> L10
        r0.d = y62.r;     // Catch: Throwable -> L10
        return;
    L26:
        if (this.C != hf2.p) goto L29;
        r7 = false;
    L29:
        if (r7 == false) goto L31;
        ef2 r3 = r0.a().y0();     // Catch: Throwable -> L10
        r3.getClass();     // Catch: Throwable -> L10
        r3.r0(g02.c(r10, r3.r));     // Catch: Throwable -> L10
        c0();     // Catch: Throwable -> L10
        goto L32
    L18:
        if (r0.n == false) goto L20;
    L21:
        r0.f = true;     // Catch: Throwable -> L10
    L22:
        b0();     // Catch: Throwable -> L10
        goto L23
    L20:
        if (r0.m == false) goto L22;
    L6:
        r5 = null;
    L10:
        th = move-exception;
        r1.Z(th);
        throw null;
    }

    @Override // defpackage.k9
    public final k9 e() {
        c72 r0 = this.s.a.t();
        if (r0 == null) goto L8;
        f72 r1 = r0.R;
        if (r1 != null) goto L7;
        return null;
    L7:
        return r1.q;
    L8:
        return null;
    }

    public final boolean e0(long r14) {
        f72 r0 = this.s;
        c72 r1 = r0.a;
        c72 r2 = r0.a;
    L6:
        th = move-exception;
        r1.Z(th);
        throw null;
    L4:
        if (r1.Z == false) goto L8;
        cz1.a("measure is called on a deactivated node");     // Catch: Throwable -> L6
    L8:
        c72 r3 = r2.t();     // Catch: Throwable -> L6
        if (r2.P == true) goto L15;
        if (r3 != null) goto L12;
    L14:
        boolean r4 = false;
    L16:
        r2.P = r4;     // Catch: Throwable -> L6
        if (r2.R.e == true) goto L29;
        nc0 r5 = this.z;     // Catch: Throwable -> L6
        if (r5 != null) goto L21;
        boolean r6 = false;
    L22:
        if (r6 == false) goto L29;
        ub3 r13 = r2.A;     // Catch: Throwable -> L6
        if (r13 == null) goto L27;
        ((ra) r13).g(r2, true);     // Catch: Throwable -> L6
    L27:
        r2.Y();     // Catch: Throwable -> L6
        return false;
    L21:
        r6 = nc0.b(r5.a, r14);     // Catch: Throwable -> L6
    L29:
        this.z = new nc0(r14);     // Catch: Throwable -> L6
        R(r14);     // Catch: Throwable -> L6
        this.D.d = false;     // Catch: Throwable -> L6
        f13 r7 = r2.y();     // Catch: Throwable -> L6
        Object[] r8 = r7.n;     // Catch: Throwable -> L6
        int r9 = r7.p;     // Catch: Throwable -> L6
        int r10 = 0;
    L30:
        if (r10 >= r9) goto L33;
        if2 r11 = ((c72) r8[r10]).R.q;     // Catch: Throwable -> L6
        r11.getClass();     // Catch: Throwable -> L6
        r11.D.getClass();     // Catch: Throwable -> L6
        r10 = r10 + 1;     // Catch: Throwable -> L6
        goto L30
    L33:
        if (this.y == false) goto L35;
        long r12 = this.p;     // Catch: Throwable -> L6
    L36:
        this.y = true;     // Catch: Throwable -> L6
        ef2 r15 = r0.a().y0();     // Catch: Throwable -> L6
        if (r15 != null) goto L40;
        cz1.b("Lookahead result from lookaheadRemeasure cannot be null");     // Catch: Throwable -> L6
    L40:
        r0.c(r14);     // Catch: Throwable -> L6
        Q((((long) r15.n) << 32) | (((long) r15.o) & 4294967295L));     // Catch: Throwable -> L6
        if (((int) (r12 >> 32)) == r15.n) goto L43;
    L46:
        return true;
    L43:
        if (((int) (r12 & 4294967295L)) != r15.o) goto L46;
        return false;
    L35:
        r12 = -9223372034707292160L;
        goto L36
    L12:
        if (r3.P == false) goto L14;
    L15:
        r4 = true;
        goto L16
    }

    @Override // defpackage.k9
    public final int n() {
        return this.v;
    }

    @Override // defpackage.pi2
    public final jg3 r(long r7) {
        f72 r0 = this.s;
        c72 r1 = r0.a;
        c72 r2 = r0.a;
        c72 r3 = r1.t();
        if (r3 == null) goto L5;
        y62 r4 = r3.R.d;
    L7:
        if (r4 == y62.o) goto L14;
        c72 r5 = r2.t();
        if (r5 == null) goto L11;
        y62 r6 = r5.R.d;
    L13:
        if (r6 == y62.q) goto L14;
    L15:
        c72 r8 = r2.t();
        a72 r9 = a72.p;
        if (r8 == null) goto L37;
        f72 r10 = r8.R;
        if (this.w != r9) goto L20;
    L23:
        int r11 = r10.d.ordinal();
        if (r11 != 0) goto L26;
    L35:
        a72 r12 = a72.n;
    L36:
        this.w = r12;
    L39:
        if (r2.N != r9) goto L41;
        r2.e();
    L41:
        e0(r7);
        return this;
    L26:
        if (r11 == 1) goto L35;
        if (r11 != 2) goto L30;
    L34:
        r12 = a72.o;
        goto L36
    L30:
        if (r11 == 3) goto L34;
        nz2.x(r10.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
        return null;
    L20:
        if (r2.P == true) goto L23;
        cz1.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
        goto L23
    L37:
        this.w = r9;
        goto L39
    L11:
        r6 = null;
    L14:
        r0.b = false;
        goto L15
    L5:
        r4 = null;
        goto L7
    }

    @Override // defpackage.k9
    public final void requestLayout() {
        this.s.a.T(false);
    }

    @Override // defpackage.k9
    public final void s(x r4) {
        f13 r3 = this.s.a.y();
        Object[] r0 = r3.n;
        int r5 = r3.p;
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L5;
        if2 r2 = ((c72) r0[r1]).R.q;
        r2.getClass();
        r4.invoke(r2);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        return null;
    }

    @Override // defpackage.yx2
    public final void x(boolean r3) {
        f72 r2 = this.s;
        ef2 r0 = r2.a().y0();
        if (r0 == null) goto L5;
        Boolean r1 = Boolean.valueOf(r0.y);
    L7:
        if (Boolean.valueOf(r3).equals(r1) == true) goto L12;
        ef2 r4 = r2.a().y0();
        if (r4 == null) goto L13;
        r4.y = r3;
        return;
    L13:
        return;
    L12:
        return;
    L5:
        r1 = null;
        goto L7
    }

    @Override // defpackage.k9
    public final void y() {
        this.G = true;
        d72 r0 = this.D;
        r0.h();
        f72 r1 = this.s;
        boolean r2 = r1.f;
        c72 r3 = r1.a;
        if (r2 == false) goto L18;
        f13 r4 = r3.y();
        Object[] r5 = r4.n;
        int r6 = r4.p;
        int r7 = 0;
    L5:
        if (r7 >= r6) goto L18;
        c72 r8 = (c72) r5[r7];
        f72 r9 = r8.R;
        if (r9.e == false) goto L17;
        if (r8.s() != a72.n) goto L17;
        if2 r10 = r9.q;
        r10.getClass();
        if2 r11 = r9.q;
        if (r11 == null) goto L13;
        nc0 r12 = r11.z;
    L14:
        r12.getClass();
        if (r10.e0(r12.a) == false) goto L17;
        c72.U(r3, false, 7);
        goto L17
    L13:
        r12 = null;
    L17:
        r7 = r7 + 1;
    L18:
        hz1 r13 = c().o0;
        r13.getClass();
        if (r1.g == false) goto L21;
    L24:
        r1.f = false;
        y62 r14 = r1.d;
        r1.d = y62.q;
        r1.i(false);
        wb3 r15 = ((ra) h12.L(r3)).getSnapshotObserver();
        r15.a.e(r3, r15.h, this.H);
        r1.d = r14;
        if (r1.m == true) goto L27;
    L29:
        r1.g = false;
    L31:
        if (r0.b == true) goto L33;
    L35:
        this.G = false;
        return;
    L33:
        if (r0.e() == false) goto L35;
        r0.g();
        goto L35
    L27:
        if (r13.B == false) goto L29;
        requestLayout();
        goto L29
    L21:
        if (r13.B == true) goto L31;
        if (r1.f == false) goto L31;
        goto L24
    }
}
