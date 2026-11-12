package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 implements u70, vb3, e80 {
    public static final c34 a0 = null;
    public static final e90 b0 = null;
    public static final x62 c0 = null;
    public static final n7 d0 = null;
    public ub3 A;
    public int B;
    public boolean C;
    public boolean D;
    public e94 E;
    public boolean F;
    public final f13 G;
    public boolean H;
    public ui2 I;
    public oo0 J;
    public r62 K;
    public m65 L;
    public c90 M;
    public a72 N;
    public a72 O;
    public boolean P;
    public final w12 Q;
    public final f72 R;
    public o72 S;
    public f63 T;
    public boolean U;
    public dx2 V;
    public dx2 W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final boolean n;
    public int o;
    public boolean p;
    public long q;
    public boolean r;
    public boolean s;
    public int t;
    public c72 u;
    public int v;
    public final gp3 w;
    public f13 x;
    public boolean y;
    public c72 z;

    static {
        a0 = new c34(1);
        b0 = new e90(28);
        c0 = new x62();
        d0 = new n7(16);
    }

    public c72(int r5, boolean r6) {
        this.n = r6;
        this.o = r5;
        this.q = 9223372034707292159L;
        this.r = true;
        this.s = true;
        this.t = -4;
        f13 r0 = new f13(new c72[16]);
        wc r2 = new wc(10, this);
        this.w = new gp3(15, r0, r2);
        this.G = new f13(new c72[16]);
        this.H = true;
        this.I = a0;
        this.J = h12.c;
        this.K = r62.n;
        this.L = c0;
        c90.f.getClass();
        this.M = b90.b;
        a72 r7 = a72.p;
        this.N = r7;
        this.O = r7;
        this.Q = new w12(this);
        this.R = new f72(this);
        this.U = true;
        this.V = ax2.a;
    }

    public static boolean P(c72 r3) {
        ti2 r0 = r3.R.p;
        if (r0.w == false) goto L5;
        nc0 r2 = new nc0(r0.q);
    L7:
        return r3.O(r2);
    L5:
        r2 = null;
        goto L7
    }

    public static void U(c72 r4, boolean r5, int r6) {
        boolean r1 = false;
        if ((r6 & 1) == 0) goto L6;
        r5 = false;
    L6:
        if ((r6 & 2) == 0) goto L8;
        boolean r0 = true;
    L10:
        if ((r6 & 4) == 0) goto L13;
        r1 = true;
    L13:
        if (r4.u != null) goto L16;
        cz1.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
    L16:
        ub3 r7 = r4.A;
        if (r7 != null) goto L20;
        return;
    L20:
        if (r4.C == false) goto L22;
        return;
    L22:
        if (r4.n == true) goto L55;
        ((ra) r7).u(r4, true, r5, r0);
        if (r1 == false) goto L56;
        if2 r8 = r4.R.q;
        r8.getClass();
        f72 r9 = r8.s;
        c72 r10 = r9.a.t();
        a72 r11 = r9.a.N;
        if (r10 != null) goto L28;
        return;
    L28:
        if (r11 != a72.p) goto L30;
        return;
    L30:
        if (r10.N != r11) goto L35;
        c72 r2 = r10.t();
        if (r2 == null) goto L35;
        r10 = r2;
    L35:
        int r12 = r11.ordinal();
        if (r12 == 0) goto L47;
        if (r12 == 1) goto L39;
        kf2.o("Intrinsics isn't used by the parent");
        return;
    L39:
        if (r10.u == null) goto L42;
        r10.T(r5);
        return;
    L42:
        r10.V(r5);
        return;
    L47:
        if (r10.u == null) goto L50;
        U(r10, r5, 6);
        return;
    L50:
        W(r10, r5, 6);
        return;
    L56:
        return;
    L55:
        return;
    L8:
        r0 = false;
        goto L10
    }

    public static void W(c72 r4, boolean r5, int r6) {
        if ((r6 & 1) == 0) goto L6;
        r5 = false;
    L6:
        if ((r6 & 2) == 0) goto L8;
        boolean r0 = true;
    L10:
        if ((r6 & 4) == 0) goto L12;
        boolean r7 = true;
    L14:
        if (r4.C == false) goto L16;
        return;
    L16:
        if (r4.n == true) goto L44;
        ub3 r3 = r4.A;
        if (r3 == null) goto L48;
        ((ra) r3).u(r4, false, r5, r0);
        if (r7 == false) goto L45;
        f72 r8 = r4.R.p.s;
        c72 r9 = r8.a.t();
        a72 r10 = r8.a.N;
        if (r9 != null) goto L25;
        return;
    L25:
        if (r10 != a72.p) goto L27;
        return;
    L27:
        if (r9.N != r10) goto L32;
        c72 r1 = r9.t();
        if (r1 == null) goto L32;
        r9 = r1;
    L32:
        int r11 = r10.ordinal();
        if (r11 == 0) goto L39;
        if (r11 != 1) goto L37;
        r9.V(r5);
        return;
    L37:
        kf2.o("Intrinsics isn't used by the parent");
        return;
    L39:
        W(r9, r5, 6);
        return;
    L45:
        return;
    L48:
        return;
    L44:
        return;
    L12:
        r7 = false;
        goto L14
    L8:
        r0 = false;
        goto L10
    }

    public static void X(c72 r4) {
        y62 r0 = r4.R.d;
        int r1 = b72.a[r0.ordinal()];
        f72 r2 = r4.R;
        if (r1 == 1) goto L5;
        nz2.x(r2.d, "Unexpected state ");
        return;
    L5:
        if (r2.e == false) goto L9;
        U(r4, true, 6);
        return;
    L9:
        if (r2.f == false) goto L12;
        r4.T(true);
    L12:
        if (r4.q() == false) goto L16;
        W(r4, true, 6);
        return;
    L16:
        if (r4.p() == false) goto L21;
        r4.V(true);
        return;
    }

    private final String k(c72 r4) {
        String r3 = g(0);
        c72 r1 = r4.z;
        if (r1 == null) goto L5;
        String r0 = r1.g(0);
    L7:
        return "Cannot insert " + r4 + " because it already has a parent or an owner. This tree: " + r3 + " Other tree: " + r0;
    L5:
        r0 = null;
        goto L7
    }

    public final void A(int r3, c72 r4) {
        if (r4.z != null) goto L5;
    L8:
        r4.z = this;
        gp3 r0 = this.w;
        ((f13) r0.o).a(r3, r4);
        ((wc) r0.p).invoke();
        N();
        if (r4.n == false) goto L11;
        this.v++;
    L11:
        F();
        ub3 r5 = this.A;
        if (r5 == null) goto L15;
        r4.d(r5);
    L15:
        if (r4.R.l <= 0) goto L18;
        f72 r6 = this.R;
        r6.d(r6.l + 1);
    L18:
        if (r4.Y <= 0) goto L21;
        b0(this.Y + 1);
        return;
    L21:
        return;
    L5:
        if (r4.A == null) goto L8;
        cz1.b(k(r4));
        goto L8
    }

    public final void B() {
        if (this.U == false) goto L16;
        w12 r0 = this.Q;
        f63 r1 = (iz1) r0.d;
        f63 r2 = ((f63) r0.e).J;
        this.T = null;
    L6:
        if (h12.c(r1, r2) == true) goto L15;
        if (r1 == null) goto L9;
        tb3 r3 = r1.g0;
    L10:
        if (r3 != null) goto L11;
        if (r1 != null) goto L13;
        r1 = null;
        goto L6
    L13:
        r1 = r1.J;
        goto L6
    L11:
        this.T = r1;
        goto L15
    L9:
        r3 = null;
    L15:
        this.U = false;
    L16:
        f63 r4 = this.T;
        if (r4 != null) goto L19;
    L23:
        if (r4 == null) goto L26;
        r4.I0();
        return;
    L26:
        c72 r5 = t();
        if (r5 == null) goto L30;
        r5.B();
        return;
    L30:
        ub3 r6 = this.A;
        if (r6 == null) goto L41;
        ((ra) r6).invalidate();
        return;
    L41:
        return;
    L19:
        if (r4.g0 != null) goto L23;
        throw xa3.l("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
    }

    public final void C() {
        w12 r3 = this.Q;
        f63 r0 = (f63) r3.e;
        iz1 r1 = (iz1) r3.d;
    L3:
        if (r0 == r1) goto L8;
        r0.getClass();
        w62 r2 = (w62) r0;
        tb3 r4 = r2.g0;
        if (r4 == null) goto L7;
        ((vj1) r4).c();
    L7:
        r0 = r2.I;
        goto L3
    L8:
        tb3 r5 = ((iz1) r3.d).g0;
        if (r5 == null) goto L15;
        ((vj1) r5).c();
        return;
    }

    public final void D() {
        if (this.n == false) goto L9;
        c72 r3 = t();
        if (r3 == null) goto L14;
        r3.D();
        return;
    L14:
        return;
    L9:
        if (this.u == null) goto L12;
        U(this, false, 7);
        return;
    L12:
        W(this, false, 7);
    }

    public final void E() {
        if (this.F == false) goto L6;
        return;
    L6:
        if (((b63) this.Q.c).s == null) goto L9;
    L10:
        this.D = true;
        return;
    L9:
        if (this.W != null) goto L10;
        e94 r0 = this.E;
        this.F = true;
        jx3 r1 = new jx3();
        r1.n = new e94();
        wb3 r2 = ((ra) h12.L(this)).getSnapshotObserver();
        fa r3 = new fa(10, this, r1);
        k52 r4 = r2.d;
        r2.a.e(this, r4, r3);
        this.F = false;
        this.E = (e94) r1.n;
        this.D = false;
        ra r5 = (ra) h12.L(this);
        r5.getSemanticsOwner().b(this, r0);
        r5.w();
    }

    public final void F() {
        if (this.v <= 0) goto L6;
        this.y = true;
    L6:
        if (this.n == false) goto L11;
        c72 r1 = this.z;
        if (r1 == null) goto L12;
        r1.F();
        return;
    L12:
        return;
    }

    public final boolean G() {
        if (this.A == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean H() {
        return this.R.p.C;
    }

    public final Boolean I() {
        if2 r1 = this.R.q;
        if (r1 != null) goto L5;
        return null;
    L5:
        if (r1.C == hf2.p) goto L7;
        boolean r2 = true;
    L9:
        return Boolean.valueOf(r2);
    L7:
        r2 = false;
        goto L9
    }

    public final void J() {
        if (this.N != a72.p) goto L5;
        f();
    L5:
        if2 r5 = this.R.q;
        r5.getClass();
        boolean r0 = true;
        r5.t = true;     // Catch: Throwable -> L9
        if (r5.x == true) goto L11;
        cz1.b("replace() called on item that was not placed");     // Catch: Throwable -> L9
    L11:
        r5.L = false;     // Catch: Throwable -> L9
        if (r5.C != hf2.p) goto L15;
        r0 = false;
    L15:
        r5.d0(r5.A, r5.B);     // Catch: Throwable -> L9
        if (r0 == true) goto L18;
    L22:
        r5.t = false;
        return;
    L18:
        if (r5.L == true) goto L22;
        c72 r1 = r5.s.a.t();     // Catch: Throwable -> L9
        if (r1 == null) goto L22;
        r1.T(false);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r5.t = false;
        throw th;
    }

    public final void K(int r7, int r8, int r9) {
        if (r7 != r8) goto L4;
        return;
    L4:
        int r0 = 0;
    L5:
        if (r0 >= r9) goto L13;
        if (r7 <= r8) goto L8;
        int r1 = r7 + r0;
    L9:
        if (r7 <= r8) goto L11;
        int r2 = r8 + r0;
    L12:
        gp3 r3 = this.w;
        f13 r4 = (f13) r3.o;
        wc r5 = (wc) r3.p;
        Object r6 = r4.k(r1);
        r5.invoke();
        ((f13) r3.o).a(r2, (c72) r6);
        r5.invoke();
        r0 = r0 + 1;
        goto L5
    L11:
        r2 = (r8 + r9) - 2;
        goto L12
    L8:
        r1 = r7;
        goto L9
    L13:
        N();
        F();
        D();
    }

    public final void L(c72 r5) {
        if (r5.R.l <= 0) goto L6;
        f72 r0 = this.R;
        r0.d(r0.l - 1);
    L6:
        if (this.A == null) goto L8;
        r5.h();
    L8:
        r5.z = null;
        if (r5.Y <= 0) goto L11;
        b0(this.Y - 1);
    L11:
        ((f63) r5.Q.e).J = null;
        if (r5.n == false) goto L16;
        this.v--;
        f13 r6 = (f13) r5.w.o;
        Object[] r1 = r6.n;
        int r7 = r6.p;
        int r2 = 0;
    L14:
        if (r2 >= r7) goto L16;
        ((f63) ((c72) r1[r2]).Q.e).J = null;
        r2 = r2 + 1;
    L16:
        F();
        N();
    }

    public final void M(f63 r9) {
        ub3 r0 = this.A;
        if (r0 == null) goto L5;
        yv3 r1 = ((ra) r0).getRectManager();
    L6:
        f72 r2 = this.R;
        int r4 = 0;
        if (r2.d == y62.r) goto L9;
    L14:
        boolean r3 = true;
    L16:
        if (this.t == (-4)) goto L33;
        if (r1 == null) goto L33;
        if (r9 != ((f63) this.Q.e)) goto L23;
        this.s = true;
        if (r3 == true) goto L33;
        r1.h(this);
        goto L33
    L23:
        this.r = true;
        f13 r10 = y();
        Object[] r5 = r10.n;
        int r11 = r10.p;
    L24:
        if (r4 >= r11) goto L30;
        c72 r7 = (c72) r5[r4];
        r7.s = true;
        if (r3 == true) goto L28;
        r1.h(r7);
    L28:
        r4 = r4 + 1;
        goto L24
    L30:
        if (this.t == (-4)) goto L32;
        r1.f = true;
        int r8 = r1.e(this);
        long[] r12 = (long[]) r1.c.p;
        int r13 = r8 + 2;
        long r6 = r12[r13];
        r12[r13] = r6 | (((r6 >> 63) & 1) << 60);
    L32:
        r1.k();
    L33:
        r2.p.e0();
        return;
    L9:
        if (q() == true) goto L14;
        if (p() == true) goto L14;
        r3 = false;
        goto L16
    L5:
        r1 = null;
        goto L6
    }

    public final void N() {
        if (this.n == false) goto L8;
        c72 r1 = t();
        if (r1 == null) goto L10;
        r1.N();
        return;
    L10:
        return;
    L8:
        this.H = true;
    }

    public final boolean O(nc0 r3) {
        if (r3 != null) goto L4;
        return false;
    L4:
        if (this.N != a72.p) goto L7;
        e();
    L7:
        return this.R.p.d0(r3.a);
    }

    public final void Q() {
        gp3 r0 = this.w;
        int r1 = ((f13) r0.o).p;
    L3:
        r1 = r1 - 1;
        f13 r2 = (f13) r0.o;
        if ((-1) >= r1) goto L6;
        L((c72) r2.n[r1]);
        goto L3
    L6:
        r2.g();
        ((wc) r0.p).invoke();
    }

    public final void R(int r3, int r4) {
        if (r4 >= 0) goto L5;
        cz1.a("count (" + r4 + ") must be greater than 0");
    L5:
        int r5 = (r4 + r3) - 1;
        if (r3 > r5) goto L10;
    L7:
        gp3 r0 = this.w;
        L((c72) ((f13) r0.o).n[r5]);
        Object r1 = ((f13) r0.o).k(r5);
        ((wc) r0.p).invoke();
        c72 r2 = (c72) r1;
        if (r5 == r3) goto L12;
        r5 = r5 - 1;
        goto L7
    L12:
        return;
    }

    public final void S() {
        if (this.N != a72.p) goto L5;
        f();
    L5:
        ti2 r7 = this.R.p;
        f72 r0 = r7.s;
        r7.t = true;     // Catch: Throwable -> L9
        if (r7.x == true) goto L11;
        cz1.b("replace called on unplaced item");     // Catch: Throwable -> L9
    L11:
        boolean r2 = r7.C;     // Catch: Throwable -> L9
        r7.c0(r7.z, r7.B, r7.A);     // Catch: Throwable -> L9
        if (r2 == true) goto L14;
    L18:
        r7.t = false;
        return;
    L14:
        if (r7.P == true) goto L18;
        c72 r3 = r0.a.t();     // Catch: Throwable -> L9
        if (r3 == null) goto L18;
        r3.V(false);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r0.a.Z(th);     // Catch: Throwable -> L22
        throw null;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        r7.t = false;
        throw th;
    }

    public final void T(boolean r3) {
        if (this.n == true) goto L8;
        ub3 r0 = this.A;
        if (r0 == null) goto L9;
        ((ra) r0).v(this, true, r3);
        return;
    L9:
        return;
    }

    public final void V(boolean r3) {
        if (this.n == true) goto L8;
        ub3 r0 = this.A;
        if (r0 == null) goto L9;
        ((ra) r0).v(this, false, r3);
        return;
    L9:
        return;
    }

    public final void Y() {
        f13 r5 = y();
        Object[] r0 = r5.n;
        int r6 = r5.p;
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L8;
        c72 r2 = (c72) r0[r1];
        a72 r3 = r2.O;
        r2.N = r3;
        if (r3 == a72.p) goto L7;
        r2.Y();
    L7:
        r1 = r1 + 1;
        goto L3
    }

    public final void Z(Throwable r4) {
        c90 r0 = this.M;
        wl4 r1 = y80.a;
        mf3 r2 = (mf3) r0;
        r2.getClass();
        x80 r3 = (x80) vr1.C(r2, r1);
        if (r3 == null) goto L6;
        si0.T(r4, new fa(4, r3, this));
        throw r4;
    L6:
        throw r4;
    }

    @Override // defpackage.u70
    public final void a() {
        o72 r0 = this.S;
        if (r0 == null) goto L5;
        r0.a();
    L5:
        w12 r2 = this.Q;
        f63 r1 = (f63) r2.e;
        f63 r3 = ((iz1) r2.d).I;
    L7:
        if (h12.c(r1, r3) == true) goto L10;
        if (r1 == null) goto L13;
        r1.O0();
        r1 = r1.I;
        goto L7
    L13:
        return;
    }

    public final void a0(oo0 r2) {
        if (h12.c(this.J, r2) == true) goto L13;
        this.J = r2;
        D();
        c72 r3 = t();
        if (r3 == null) goto L7;
        r3.B();
    L10:
        C();
        cx2 r1 = (cx2) this.Q.g;
    L11:
        if (r1 == null) goto L15;
        r1.b();
        r1 = r1.s;
        goto L11
    L15:
        return;
    L7:
        ub3 r4 = this.A;
        if (r4 == null) goto L10;
        ((ra) r4).invalidate();
        goto L10
    }

    @Override // defpackage.u70
    public final void b() {
        o72 r0 = this.S;
        if (r0 == null) goto L5;
        r0.i(true);
    L5:
        this.Z = true;
        cx2 r1 = (sq4) this.Q.f;
        cx2 r2 = r1;
    L6:
        if (r2 == null) goto L11;
        if (r2.A == false) goto L10;
        r2.l0();
    L10:
        r2 = r2.r;
        goto L6
    L11:
        cx2 r3 = r1;
    L12:
        if (r3 == null) goto L17;
        if (r3.A == false) goto L16;
        r3.n0();
    L16:
        r3 = r3.r;
    L17:
        if (r1 == null) goto L23;
        if (r1.A == false) goto L21;
        r1.h0();
    L21:
        r1 = r1.r;
        goto L17
    L23:
        if (G() == false) goto L25;
        this.E = null;
        this.D = false;
    L25:
        ub3 r4 = this.A;
        if (r4 == null) goto L44;
        ra r5 = (ra) r4;
        if (ra.d() == false) goto L45;
        y9 r6 = r5.m71getAutofillManager();
        if (r6 != null) goto L32;
        return;
    L32:
        if (r6.t.f(this.o) == false) goto L47;
        r6.n.p(r6.p, this.o, false);
        return;
    L47:
        return;
    L45:
        return;
    }

    public final void b0(int r3) {
        int r0 = this.Y;
        if (r0 == r3) goto L17;
        if (r3 <= 0) goto L9;
        if (r0 != 0) goto L9;
        c72 r1 = t();
        if (r1 == null) goto L9;
        r1.b0(r1.Y + 1);
    L9:
        if (r3 == 0) goto L11;
    L15:
        this.Y = r3;
        return;
    L11:
        if (this.Y <= 0) goto L15;
        c72 r2 = t();
        if (r2 == null) goto L15;
        r2.b0(r2.Y - 1);
        goto L15
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6031. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(defpackage.dx2 r24) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: CHECK_CAST (r9v1 ?? I:sq4) = (sq4) (r3v0 java.lang.Object) in method: c72.c(dx2):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c72.c(dx2):void");
    }

    public final void c0(c72 r3) {
        if (h12.c(r3, this.u) == true) goto L19;
        this.u = r3;
        f72 r0 = this.R;
        if (r3 != null) goto L7;
        r0.q = null;
        r0.f = false;
        r0.e = false;
    L15:
        D();
        return;
    L7:
        if (r0.q != null) goto L9;
        r0.q = new if2(r0);
    L9:
        w12 r4 = this.Q;
        f63 r1 = (f63) r4.e;
        f63 r5 = ((iz1) r4.d).I;
    L11:
        if (h12.c(r1, r5) == true) goto L15;
        if (r1 == null) goto L15;
        r1.v0();
        r1 = r1.I;
        goto L11
    }

    public final void d(ub3 r9) {
        int r1 = 0;
        if (this.A == null) goto L6;
        cz1.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
    L6:
        c72 r0 = this.z;
        if (r0 != null) goto L9;
    L20:
        c72 r2 = t();
        f72 r3 = this.R;
        if (r2 != null) goto L25;
        r3.p.C = true;
        ((ra) r9).getRectManager().h(this);
        if2 r5 = r3.q;
        if (r5 == null) goto L25;
        r5.C = hf2.n;
    L25:
        w12 r6 = this.Q;
        f63 r7 = (f63) r6.e;
        if (r2 == null) goto L28;
        iz1 r8 = (iz1) r2.Q.d;
    L29:
        r7.J = r8;
        this.A = r9;
        if (r2 == null) goto L32;
        int r10 = r2.B;
    L33:
        this.B = r10 + 1;
        dx2 r11 = this.W;
        if (r11 == null) goto L36;
        c(r11);
    L36:
        this.W = null;
        ((ra) r9).m74getLayoutNodes().i(this.o, this);
        c72 r4 = this.z;
        if (r4 == null) goto L40;
        c72 r12 = r4.u;
        if (r12 == null) goto L40;
    L41:
        c0(r12);
        if (this.u != null) goto L47;
        if (r6.d(512) == false) goto L47;
        c0(this);
    L47:
        if (this.Z == true) goto L51;
        cx2 r13 = (cx2) r6.g;
    L49:
        if (r13 == null) goto L51;
        r13.g0();
        r13 = r13.s;
    L51:
        f13 r14 = (f13) this.w.o;
        Object[] r15 = r14.n;
        int r16 = r14.p;
    L52:
        if (r1 >= r16) goto L55;
        ((c72) r15[r1]).d(r9);
        r1 = r1 + 1;
        goto L52
    L55:
        if (this.Z == true) goto L57;
        r6.e();
    L57:
        D();
        if (r2 == null) goto L60;
        r2.D();
    L60:
        r3.j();
        if (this.Z == false) goto L63;
    L65:
        ra r17 = (ra) r9;
        if (ra.d() == false) goto L77;
        y9 r18 = r17.m71getAutofillManager();
        if (r18 == null) goto L78;
        e94 r19 = v();
        if (r19 != null) goto L72;
        return;
    L72:
        if (r19.n.b(n94.q) != true) goto L80;
        r18.t.a(this.o);
        r18.n.p(r18.p, this.o, true);
        return;
    L80:
        return;
    L78:
        return;
    L77:
        return;
    L63:
        if (r6.d(8) == false) goto L65;
        E();
    L40:
        r12 = this.u;
        goto L41
    L32:
        r10 = -1;
        goto L33
    L28:
        r8 = null;
        goto L29
    L9:
        if (h12.c(r0.A, r9) == true) goto L20;
        c72 r20 = t();
        if (r20 == null) goto L14;
        ub3 r21 = r20.A;
    L15:
        String r22 = g(0);
        c72 r23 = this.z;
        if (r23 == null) goto L18;
        String r24 = r23.g(0);
    L19:
        cz1.b("Attaching to a different owner(" + r9 + ") than the parent's owner(" + r21 + "). This tree: " + r22 + " Parent tree: " + r24);
        goto L20
    L18:
        r24 = null;
        goto L19
    L14:
        r21 = null;
        goto L15
    }

    public final void d0(dx2 r3) {
        if (this.n == false) goto L9;
        if (this.V == ax2.a) goto L9;
        cz1.a("Modifiers are not supported on virtual LayoutNodes");
    L9:
        if (this.Z == false) goto L12;
        cz1.a("modifier is updated when deactivated");
    L12:
        if (G() == false) goto L17;
        c(r3);
        if (this.D == false) goto L19;
        E();
        return;
    L19:
        return;
    L17:
        this.W = r3;
    }

    public final void e() {
        this.O = this.N;
        a72 r0 = a72.p;
        this.N = r0;
        f13 r5 = y();
        Object[] r1 = r5.n;
        int r6 = r5.p;
        int r2 = 0;
    L3:
        if (r2 >= r6) goto L8;
        c72 r3 = (c72) r1[r2];
        if (r3.N == r0) goto L7;
        r3.e();
    L7:
        r2 = r2 + 1;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void e0(m65 r8) {
        if (h12.c(this.L, r8) == true) goto L38;
        this.L = r8;
        cx2 r7 = (cx2) this.Q.g;
        if ((r7.q & 16) == 0) goto L53;
    L6:
        if (r7 == null) goto L54;
        if ((r7.p & 16) == 0) goto L36;
        ?? r1 = r7;
        ?? r2 = 0;
    L10:
        if (r1 == 0) goto L36;
        if ((r1 instanceof rn3) == true) goto L13;
        if ((r1.p & 16) == 0) goto L34;
        if ((r1 instanceof fo0) == false) goto L34;
        cx2 r3 = ((fo0) r1).C;
        int r4 = 0;
        r1 = r1;
        r2 = r2;
    L20:
        if (r3 == null) goto L32;
        if ((r3.p & 16) == 0) goto L31;
        r4 = r4 + 1;
        r2 = r2;
        if (r4 != 1) goto L26;
        r1 = r3;
        goto L31
    L26:
        if (r2 != 0) goto L28;
        r2 = new f13(new cx2[16]);
    L28:
        if (r1 == 0) goto L30;
        r2.b(r1);
        r1 = 0;
    L30:
        r2.b(r3);
    L31:
        r3 = r3.s;
        r1 = r1;
        r2 = r2;
        goto L20
    L32:
        if (r4 == 1) goto L10;
    L34:
        r1 = j51.c(r2);
        goto L10
    L13:
        ((rn3) r1).Z();
    L36:
        if ((r7.q & 16) == 0) goto L55;
        r7 = r7.s;
        goto L6
    L55:
        return;
    L54:
        return;
    L53:
        return;
    }

    public final void f() {
        this.O = this.N;
        this.N = a72.p;
        f13 r5 = y();
        Object[] r0 = r5.n;
        int r6 = r5.p;
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L8;
        c72 r2 = (c72) r0[r1];
        if (r2.N != a72.o) goto L7;
        r2.f();
    L7:
        r1 = r1 + 1;
        goto L3
    }

    public final void f0() {
        if (this.v > 0) goto L5;
        return;
    L5:
        if (this.y == false) goto L24;
        int r0 = 0;
        this.y = false;
        f13 r1 = this.x;
        if (r1 != null) goto L9;
        r1 = new f13(new c72[16]);
        this.x = r1;
    L9:
        r1.g();
        f13 r2 = (f13) this.w.o;
        Object[] r3 = r2.n;
        int r4 = r2.p;
    L10:
        if (r0 >= r4) goto L16;
        c72 r5 = (c72) r3[r0];
        if (r5.n == false) goto L14;
        f13 r6 = r5.y();
        r1.c(r1.p, r6);
    L15:
        r0 = r0 + 1;
        goto L10
    L14:
        r1.b(r5);
        goto L15
    L16:
        f72 r7 = this.R;
        r7.p.J = true;
        if2 r8 = r7.q;
        if (r8 == null) goto L25;
        r8.F = true;
        return;
    L25:
        return;
    }

    public final String g(int r7) {
        StringBuilder r0 = new StringBuilder();
        int r2 = 0;
    L3:
        if (r2 >= r7) goto L5;
        r0.append("  ");
        r2 = r2 + 1;
        goto L3
    L5:
        r0.append("|-");
        r0.append(toString());
        r0.append('\n');
        f13 r6 = y();
        Object[] r3 = r6.n;
        int r8 = r6.p;
        int r4 = 0;
    L6:
        if (r4 >= r8) goto L8;
        r0.append(((c72) r3[r4]).g(r7 + 1));
        r4 = r4 + 1;
        goto L6
    L8:
        String r9 = r0.toString();
        if (r7 == 0) goto L11;
        return r9;
    L11:
        return r9.substring(0, r9.length() - 1);
    }

    public final void h() {
        ub3 r0 = this.A;
        String r1 = null;
        if (r0 != null) goto L9;
        c72 r11 = t();
        if (r11 == null) goto L7;
        r1 = r11.g(0);
    L7:
        cz1.c("Cannot detach node that is already detached!  Tree: " + r1);
        er1.a();
        return;
    L9:
        c72 r3 = t();
        f72 r4 = this.R;
        if (r3 == null) goto L14;
        r3.B();
        r3.D();
        ti2 r5 = r4.p;
        a72 r6 = a72.p;
        r5.y = r6;
        if2 r7 = r4.q;
        if (r7 == null) goto L14;
        r7.w = r6;
    L14:
        d72 r8 = r4.p.H;
        r8.b = true;
        r8.c = false;
        r8.d = false;
        r8.e = false;
        r8.f = null;
        if2 r9 = r4.q;
        if (r9 == null) goto L19;
        d72 r10 = r9.D;
        if (r10 == null) goto L19;
        r10.b = true;
        r10.c = false;
        r10.d = false;
        r10.e = false;
        r10.f = null;
    L19:
        w12 r12 = this.Q;
        f63 r13 = (f63) r12.e;
        cx2 r14 = (sq4) r12.f;
        f63 r15 = ((iz1) r12.d).I;
    L21:
        if (h12.c(r13, r15) == true) goto L27;
        if (r13 == null) goto L27;
        r13.U0();
        if (r13.H.H() == false) goto L26;
        r13.P0();
    L26:
        r13 = r13.I;
    L27:
        cx2 r16 = r14;
    L28:
        if (r16 == null) goto L33;
        if (r16.A == false) goto L32;
        r16.n0();
    L32:
        r16 = r16.r;
        goto L28
    L33:
        this.C = true;
        f13 r17 = (f13) this.w.o;
        Object[] r18 = r17.n;
        int r19 = r17.p;
        int r20 = 0;
    L34:
        if (r20 >= r19) goto L36;
        ((c72) r18[r20]).h();
        r20 = r20 + 1;
        goto L34
    L36:
        this.C = false;
    L37:
        if (r14 == null) goto L42;
        if (r14.A == false) goto L41;
        r14.h0();
    L41:
        r14 = r14.r;
        goto L37
    L42:
        ra r2 = (ra) r0;
        r2.m74getLayoutNodes().g(this.o);
        ri2 r21 = r2.f0;
        i61 r22 = r21.b;
        ((d34) r22.o).H(this);
        ((d34) r22.p).H(this);
        ((d34) r22.q).H(this);
        ((f13) r21.e.n).j(this);
        r2.W = true;
        if (ra.d() == false) goto L49;
        y9 r23 = r2.m71getAutofillManager();
        if (r23 == null) goto L49;
        if (r23.t.f(this.o) == false) goto L49;
        r23.n.p(r23.p, this.o, false);
    L49:
        r2.getRectManager().i(this);
        this.A = null;
        c0(null);
        this.B = 0;
        ti2 r24 = r4.p;
        r24.v = Integer.MAX_VALUE;
        r24.u = Integer.MAX_VALUE;
        r24.C = false;
        if2 r25 = r4.q;
        if (r25 == null) goto L53;
        r25.v = Integer.MAX_VALUE;
        r25.u = Integer.MAX_VALUE;
        r25.C = hf2.p;
    L53:
        if (r12.d(8) == false) goto L67;
        e94 r26 = this.E;
        this.E = null;
        this.D = false;
        r2.getSemanticsOwner().b(this, r26);
        r2.w();
        return;
    }

    public final void i(jz r2, sj1 r3) {
        ((f63) this.Q.e).t0(r2, r3);     // Catch: Throwable -> L4
        return;
    L4:
        th = move-exception;
        Z(th);
        throw null;
    }

    @Override // defpackage.vb3
    public final boolean j() {
        return G();
    }

    public final void l() {
        if (this.u == null) goto L5;
        U(this, false, 5);
    L6:
        ti2 r0 = this.R.p;
        if (r0.w == false) goto L9;
        nc0 r2 = new nc0(r0.q);
    L10:
        ub3 r1 = this.A;
        if (r2 == null) goto L15;
        if (r1 == null) goto L18;
        ra r3 = (ra) r1;
        r3.r(this, r2.a);
        return;
    L18:
        return;
    L15:
        if (r1 == null) goto L19;
        ((ra) r1).q(true);
        return;
    L19:
        return;
    L9:
        r2 = null;
        goto L10
    L5:
        W(this, false, 5);
        goto L6
    }

    public final List m() {
        if2 r9 = this.R.q;
        r9.getClass();
        f13 r0 = r9.E;
        f72 r1 = r9.s;
        r1.a.n();
        if (r9.F == false) goto L5;
        c72 r2 = r1.a;
        f13 r3 = r2.y();
        Object[] r4 = r3.n;
        int r5 = r3.p;
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L13;
        c72 r7 = (c72) r4[r6];
        if (r0.p > r6) goto L11;
        if2 r8 = r7.R.q;
        r8.getClass();
        r0.b(r8);
    L12:
        r6 = r6 + 1;
        goto L7
    L11:
        if2 r10 = r7.R.q;
        r10.getClass();
        Object[] r11 = r0.n;
        Object r12 = r11[r6];
        r11[r6] = r10;
        goto L12
    L13:
        r0.l(((c13) r2.n()).n.p, r0.p);
        r9.F = false;
        return r0.f();
    L5:
        return r0.f();
    }

    public final List n() {
        return y().f();
    }

    public final List o() {
        return ((f13) this.w.o).f();
    }

    public final boolean p() {
        return this.R.p.F;
    }

    public final boolean q() {
        return this.R.p.E;
    }

    public final a72 r() {
        return this.R.p.y;
    }

    public final a72 s() {
        if2 r0 = this.R.q;
        if (r0 == null) goto L9;
        a72 r1 = r0.w;
        if (r1 == null) goto L9;
        return r1;
    L9:
        return a72.p;
    }

    public final c72 t() {
        c72 r2 = this.z;
    L3:
        if (r2 == null) goto L7;
        if (r2.n != true) goto L7;
        r2 = r2.z;
    L7:
        return r2;
    }

    public final String toString() {
        return xl.L(this) + " children: " + ((c13) n()).n.p + " measurePolicy: " + this.I + " deactivated: " + this.Z + " isVirtual: " + this.n + " isPlaced: " + H();
    }

    public final int u() {
        return this.R.p.v;
    }

    public final e94 v() {
        if (G() == true) goto L5;
        return null;
    L5:
        if (this.Z == false) goto L7;
        return null;
    L7:
        if (this.Q.d(8) == true) goto L10;
        return null;
    L10:
        return this.E;
    }

    public final float w() {
        return this.R.p.O;
    }

    public final f13 x() {
        boolean r0 = this.H;
        f13 r1 = this.G;
        if (r0 == false) goto L5;
        r1.g();
        f13 r2 = y();
        r1.c(r1.p, r2);
        Arrays.sort(r1.n, 0, r1.p, d0);
        this.H = false;
    L5:
        return r1;
    }

    public final f13 y() {
        f0();
        if (this.v == 0) goto L5;
        f13 r1 = this.x;
        r1.getClass();
        return r1;
    L5:
        return (f13) this.w.o;
    }

    public final void z(long r10, fm1 r12, int r13, boolean r14) {
        w12 r9 = this.Q;
        f63 r0 = (f63) r9.e;
        k52 r1 = f63.h0;
        long r4 = r0.x0(r10);
        ((f63) r9.e).G0(f63.l0, r4, r12, r13, r14);
    }

    public c72(int r3) {
        if ((r3 & 1) == 0) goto L5;
        boolean r4 = false;
    L6:
        this(f94.a.addAndGet(1), r4);
        return;
    L5:
        r4 = true;
        goto L6
    }
}
