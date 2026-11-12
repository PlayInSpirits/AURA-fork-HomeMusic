package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ti2 extends jg3 implements pi2, k9, yx2 {
    public if1 A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final d72 H;
    public final f13 I;
    public boolean J;
    public boolean K;
    public long L;
    public final si2 M;
    public final si2 N;
    public float O;
    public boolean P;
    public if1 Q;
    public long R;
    public float S;
    public final si2 T;
    public boolean U;
    public final f72 s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public a72 y;
    public long z;

    /* JADX WARN: Type inference failed for: r2v1, types: [si2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [si2] */
    /* JADX WARN: Type inference failed for: r6v6, types: [si2] */
    public ti2(f72 r6) {
        this.s = r6;
        this.u = Integer.MAX_VALUE;
        this.v = Integer.MAX_VALUE;
        this.y = a72.p;
        this.z = 0;
        final int r2 = 0;
        this.H = new d72(this, 0);
        this.I = new f13(new ti2[16]);
        final int r7 = 1;
        this.J = true;
        this.L = qc0.b(0, 0, 15);
        this.M = new si2(this, r2);
        this.N = new si2(this, r7);
        this.R = 0;
        final int r0 = 2;
        this.T = new si2(this, r0);
    }

    @Override // defpackage.k9
    public final void E() {
        c72.W(this.s.a, false, 7);
    }

    @Override // defpackage.jg3
    public final int F() {
        return this.s.a().F();
    }

    @Override // defpackage.jg3
    public final int G() {
        return this.s.a().G();
    }

    @Override // defpackage.jg3
    public final void N(long r8, float r10, if1 r11) {
        f72 r0 = this.s;
        c72 r1 = r0.a;
        this.D = true;     // Catch: Throwable -> L10
        if (g02.a(r8, this.z) == false) goto L13;
        if (r11 != this.A) goto L13;
        if (this.U == true) goto L13;
    L19:
        if2 r3 = r0.q;     // Catch: Throwable -> L10
        if (r3 == null) goto L27;
        f72 r5 = r3.s;     // Catch: Throwable -> L10
        if (r3.C != hf2.p) goto L27;
        if (h12.A(r5.a) == true) goto L27;
        r5.c = true;     // Catch: Throwable -> L10
    L27:
        if2 r4 = r0.q;     // Catch: Throwable -> L10
        if (r4 != null) goto L30;
    L40:
        if2 r2 = r0.q;     // Catch: Throwable -> L10
        if (r2 != null) goto L43;
    L45:
        c0(r8, r10, r11);     // Catch: Throwable -> L10
        return;
    L43:
        if (r2.x == true) goto L45;
        cz1.b("Error: Placement happened before lookahead.");     // Catch: Throwable -> L10
        goto L45
    L30:
        if (r4.S() != true) goto L40;
        f63 r6 = r0.a().J;     // Catch: Throwable -> L10
        if (r6 == null) goto L35;
        ig3 r7 = r6.C;     // Catch: Throwable -> L10
        if (r7 == null) goto L35;
    L36:
        if2 r9 = r0.q;     // Catch: Throwable -> L10
        r9.getClass();     // Catch: Throwable -> L10
        c72 r12 = r1.t();     // Catch: Throwable -> L10
        if (r12 == null) goto L39;
        r12.R.h = 0;     // Catch: Throwable -> L10
    L39:
        r9.v = Integer.MAX_VALUE;     // Catch: Throwable -> L10
        ig3.f(r7, r9, (int) (r8 >> 32), (int) (4294967295L & r8));     // Catch: Throwable -> L10
    L35:
        r7 = ((ra) h12.L(r1)).getPlacementScope();     // Catch: Throwable -> L10
    L13:
        if (r0.k == false) goto L15;
    L18:
        this.F = true;     // Catch: Throwable -> L10
        this.U = false;     // Catch: Throwable -> L10
        goto L19
    L15:
        if (r0.j == true) goto L18;
        if (this.U == false) goto L19;
    L10:
        th = move-exception;
        r1.Z(th);
        throw null;
    }

    public final List S() {
        f72 r0 = this.s;
        r0.a.f0();
        boolean r1 = this.J;
        f13 r2 = this.I;
        if (r1 == false) goto L5;
        c72 r3 = r0.a;
        f13 r4 = r3.y();
        Object[] r5 = r4.n;
        int r6 = r4.p;
        int r7 = 0;
    L7:
        if (r7 >= r6) goto L13;
        c72 r8 = (c72) r5[r7];
        if (r2.p > r7) goto L11;
        r2.b(r8.R.p);
    L12:
        r7 = r7 + 1;
        goto L7
    L11:
        ti2 r9 = r8.R.p;
        Object[] r10 = r2.n;
        Object r11 = r10[r7];
        r10[r7] = r9;
        goto L12
    L13:
        r2.l(((c13) r3.n()).n.p, r2.p);
        this.J = false;
        return r2.f();
    L5:
        return r2.f();
    }

    public final void X() {
        boolean r0 = this.C;
        this.C = true;
        f72 r5 = this.s;
        c72 r2 = r5.a;
        w12 r3 = r2.Q;
        if (r0 == true) goto L10;
        ((iz1) r3.d).N0();
        ((ra) h12.L(r2)).getRectManager().h(r5.a);
        if (r2.q() == false) goto L8;
        c72.W(r2, true, 6);
        goto L10
    L8:
        if (r2.R.e == false) goto L10;
        c72.U(r2, true, 6);
    L10:
        f63 r6 = (f63) r3.e;
        f63 r1 = ((iz1) r3.d).I;
    L12:
        if (h12.c(r6, r1) == true) goto L18;
        if (r6 == null) goto L18;
        if (r6.f0 == false) goto L17;
        r6.I0();
    L17:
        r6 = r6.I;
    L18:
        f13 r7 = r2.y();
        Object[] r4 = r7.n;
        int r8 = r7.p;
        int r9 = 0;
    L19:
        if (r9 >= r8) goto L24;
        c72 r10 = (c72) r4[r9];
        if (r10.u() == Integer.MAX_VALUE) goto L23;
        r10.R.p.X();
        c72.X(r10);
    L23:
        r9 = r9 + 1;
        goto L19
    }

    public final void Z() {
        if (this.C == false) goto L12;
        int r0 = 0;
        this.C = false;
        f72 r4 = this.s;
        c72 r1 = r4.a;
        c72 r5 = r4.a;
        ((ra) h12.L(r1)).getRectManager().i(r5);
        w12 r2 = r5.Q;
        f63 r3 = (f63) r2.e;
        f63 r6 = ((iz1) r2.d).I;
    L6:
        if (h12.c(r3, r6) == true) goto L9;
        if (r3 == null) goto L9;
        r3.P0();
        r3.U0();
        r3 = r3.I;
    L9:
        f13 r7 = r5.y();
        Object[] r8 = r7.n;
        int r9 = r7.p;
    L10:
        if (r0 >= r9) goto L16;
        ((c72) r8[r0]).R.p.Z();
        r0 = r0 + 1;
        goto L10
    L16:
        return;
    }

    @Override // defpackage.k9
    public final d72 a() {
        return this.H;
    }

    public final void b0() {
        this.P = true;
        f72 r1 = this.s;
        c72 r2 = r1.a.t();
        float r3 = c().T;
        c72 r4 = r1.a;
        w12 r5 = r4.Q;
        f63 r6 = (f63) r5.e;
        iz1 r7 = (iz1) r5.d;
    L3:
        if (r6 == r7) goto L6;
        r6.getClass();
        w62 r8 = (w62) r6;
        r3 = r3 + r8.T;
        r6 = r8.I;
        goto L3
    L6:
        if (r3 == this.O) goto L14;
        this.O = r3;
        if (r2 == null) goto L11;
        r2.N();
    L11:
        if (r2 == null) goto L14;
        r2.B();
    L14:
        if (c().B == true) goto L28;
        boolean r9 = this.C;
        if (r9 == true) goto L18;
    L19:
        X();
    L20:
        if (r9 == true) goto L27;
        if (r2 == null) goto L24;
        r2.B();
    L24:
        if (this.t == false) goto L28;
        if (r2 == null) goto L28;
        r2.V(false);
        goto L28
    L27:
        ((iz1) r4.Q.d).N0();
        goto L28
    L18:
        if (this.H.d() == false) goto L20;
    L28:
        if (r2 == null) goto L38;
        f72 r10 = r2.R;
        if (this.t == false) goto L32;
    L39:
        y();
        return;
    L32:
        if (r10.d != y62.p) goto L39;
        if (this.v == Integer.MAX_VALUE) goto L37;
        cz1.b("Place was called on a node which was placed already");
    L37:
        int r11 = r10.i;
        this.v = r11;
        r10.i = r11 + 1;
        goto L39
    L38:
        this.v = 0;
        goto L39
    }

    @Override // defpackage.k9
    public final iz1 c() {
        return (iz1) this.s.a.Q.d;
    }

    public final void c0(long r6, float r8, if1 r9) {
        f72 r0 = this.s;
        c72 r1 = r0.a;
        c72 r2 = r0.a;
        if (r1.Z == false) goto L5;
        cz1.a("place is called on a deactivated node");
    L5:
        r0.d = y62.p;
        this.z = r6;
        this.B = r8;
        this.A = r9;
        this.P = false;
        ub3 r3 = h12.L(r2);
        if (this.F == false) goto L8;
    L10:
        this.H.e = false;
        r0.f(false);
        this.Q = r9;
        this.R = r6;
        this.S = r8;
        wb3 r7 = ((ra) r3).getSnapshotObserver();
        k52 r10 = r7.f;
        r7.a.e(r2, r10, this.T);
    L11:
        r0.d = y62.r;
        if (r0.a().B == true) goto L14;
    L18:
        this.x = true;
        return;
    L14:
        if (r0.k == false) goto L16;
    L17:
        requestLayout();
        goto L18
    L16:
        if (r0.j == false) goto L18;
    L8:
        if (this.C == false) goto L10;
        f63 r4 = r0.a();
        r4.S0(g02.c(r6, r4.r), r8, r9);
        b0();
        goto L11
    }

    public final boolean d0(long r11) {
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
        ub3 r3 = h12.L(r2);     // Catch: Throwable -> L6
        c72 r4 = r2.t();     // Catch: Throwable -> L6
        boolean r6 = true;
        if (r2.P == true) goto L15;
        if (r4 != null) goto L12;
    L14:
        boolean r5 = false;
    L16:
        r2.P = r5;     // Catch: Throwable -> L6
        if (r2.q() == false) goto L19;
    L23:
        this.H.d = false;     // Catch: Throwable -> L6
        f13 r7 = r2.y();     // Catch: Throwable -> L6
        Object[] r8 = r7.n;     // Catch: Throwable -> L6
        int r9 = r7.p;     // Catch: Throwable -> L6
        int r10 = 0;
    L24:
        if (r10 >= r9) goto L26;
        ((c72) r8[r10]).R.p.H.getClass();     // Catch: Throwable -> L6
        r10 = r10 + 1;     // Catch: Throwable -> L6
        goto L24
    L26:
        this.w = true;     // Catch: Throwable -> L6
        long r12 = r0.a().p;     // Catch: Throwable -> L6
        R(r11);     // Catch: Throwable -> L6
        y62 r13 = r0.d;     // Catch: Throwable -> L6
        y62 r14 = y62.r;     // Catch: Throwable -> L6
        if (r13 == r14) goto L30;
        cz1.b("layout state is not idle before measure starts");     // Catch: Throwable -> L6
    L30:
        this.L = r11;     // Catch: Throwable -> L6
        y62 r15 = y62.n;     // Catch: Throwable -> L6
        r0.d = r15;     // Catch: Throwable -> L6
        this.E = false;     // Catch: Throwable -> L6
        wb3 r16 = ((ra) h12.L(r2)).getSnapshotObserver();     // Catch: Throwable -> L6
        si2 r17 = this.M;     // Catch: Throwable -> L6
        r16.a.e(r2, r16.c, r17);     // Catch: Throwable -> L6
        if (r0.d != r15) goto L34;
        this.F = true;     // Catch: Throwable -> L6
        this.G = true;     // Catch: Throwable -> L6
        r0.d = r14;     // Catch: Throwable -> L6
    L34:
        if (n02.a(r0.a().p, r12) == true) goto L36;
    L41:
        Q((((long) r0.a().o) & 4294967295L) | (((long) r0.a().n) << 32));     // Catch: Throwable -> L6
        return r6;
    L36:
        if (r0.a().n != this.n) goto L41;
        if (r0.a().o != this.o) goto L41;
        r6 = false;
        goto L41
    L19:
        if (nc0.b(this.q, r11) == false) goto L23;
        ((ra) r3).g(r2, false);     // Catch: Throwable -> L6
        r2.Y();     // Catch: Throwable -> L6
        return false;
    L12:
        if (r4.P == false) goto L14;
    L15:
        r5 = true;
        goto L16
    }

    @Override // defpackage.k9
    public final k9 e() {
        c72 r0 = this.s.a.t();
        if (r0 == null) goto L8;
        f72 r1 = r0.R;
        if (r1 != null) goto L7;
        return null;
    L7:
        return r1.p;
    L8:
        return null;
    }

    public final void e0() {
        f72 r3 = this.s;
        c72 r0 = r3.a;
        c72 r1 = r3.a;
        if (r0.H() == true) goto L5;
        return;
    L5:
        if (r3.l <= 0) goto L18;
        f72 r4 = r1.R;
        int r2 = 0;
        if (r4.j == true) goto L11;
        if (r4.k == true) goto L11;
    L13:
        f13 r5 = r1.y();
        Object[] r6 = r5.n;
        int r7 = r5.p;
    L14:
        if (r2 >= r7) goto L19;
        ((c72) r6[r2]).R.p.e0();
        r2 = r2 + 1;
        goto L14
    L19:
        return;
    L11:
        if (r4.p.F == true) goto L13;
        r1.V(false);
        goto L13
    }

    @Override // defpackage.k9
    public final int n() {
        return this.v;
    }

    @Override // defpackage.pi2
    public final jg3 r(long r6) {
        f72 r0 = this.s;
        c72 r1 = r0.a;
        c72 r2 = r0.a;
        a72 r3 = r1.N;
        a72 r4 = a72.p;
        if (r3 != r4) goto L6;
        r1.e();
    L6:
        if (h12.A(r2) == false) goto L8;
        if2 r5 = r0.q;
        r5.getClass();
        r5.w = r4;
        r5.r(r6);
    L8:
        c72 r7 = r2.t();
        if (r7 == null) goto L25;
        f72 r8 = r7.R;
        if (this.y != r4) goto L13;
    L16:
        int r9 = r8.d.ordinal();
        if (r9 != 0) goto L19;
        a72 r10 = a72.n;
    L24:
        this.y = r10;
    L26:
        d0(r6);
        return this;
    L19:
        if (r9 != 2) goto L21;
        r10 = a72.o;
        goto L24
    L21:
        nz2.x(r8.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
        return null;
    L13:
        if (r2.P == true) goto L16;
        cz1.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
        goto L16
    L25:
        this.y = r4;
        goto L26
    }

    @Override // defpackage.k9
    public final void requestLayout() {
        this.s.a.V(false);
    }

    @Override // defpackage.k9
    public final void s(x r4) {
        f13 r3 = this.s.a.y();
        Object[] r0 = r3.n;
        int r5 = r3.p;
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L5;
        r4.invoke(((c72) r0[r1]).R.p);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        return null;
    }

    @Override // defpackage.yx2
    public final void x(boolean r3) {
        f72 r0 = this.s;
        if (r3 == r0.a().y) goto L6;
        r0.a().y = r3;
        this.U = true;
        return;
    }

    @Override // defpackage.k9
    public final void y() {
        this.K = true;
        d72 r0 = this.H;
        r0.h();
        boolean r1 = this.F;
        f72 r2 = this.s;
        if (r1 == false) goto L15;
        f13 r3 = r2.a.y();
        Object[] r4 = r3.n;
        int r5 = r3.p;
        int r6 = 0;
    L5:
        if (r6 >= r5) goto L15;
        c72 r7 = (c72) r4[r6];
        if (r7.q() == false) goto L13;
        if (r7.r() != a72.n) goto L13;
        if (c72.P(r7) == false) goto L13;
        c72.W(r2.a, false, 7);
    L13:
        r6 = r6 + 1;
    L15:
        if (this.G == false) goto L17;
    L20:
        this.F = false;
        y62 r8 = r2.d;
        r2.d = y62.p;
        r2.g(false);
        c72 r9 = r2.a;
        wb3 r10 = ((ra) h12.L(r9)).getSnapshotObserver();
        r10.a.e(r9, r10.e, this.N);
        r2.d = r8;
        this.G = false;
    L22:
        if (r0.b == true) goto L24;
    L26:
        this.K = false;
        return;
    L24:
        if (r0.e() == false) goto L26;
        r0.g();
        goto L26
    L17:
        if (c().B == true) goto L22;
        if (this.F == false) goto L22;
        goto L20
    }
}
