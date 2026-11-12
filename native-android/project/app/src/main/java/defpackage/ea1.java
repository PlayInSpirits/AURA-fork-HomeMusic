package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ea1 extends fo0 implements g94, vi1, a90, b83, rx4 {
    public static final y41 J = null;
    public rm2 D;
    public final q E;
    public p91 F;
    public l82 G;
    public f63 H;
    public final ba1 I;

    static {
        J = new y41(10);
    }

    public ea1(q r9) {
        this.D = null;
        this.E = r9;
        ba1 r8 = new ba1(0, new da1(2, 0, ea1.class, this, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"), 10);
        q0(r8);
        this.I = r8;
    }

    @Override // defpackage.vi1
    public final void L(f63 r2) {
        this.H = r2;
        if (this.I.v0().a() == true) goto L6;
        return;
    L6:
        if (r2.A0().A == false) goto L13;
        f63 r3 = this.H;
        if (r3 != null) goto L10;
        return;
    L10:
        if (r3.A0().A == false) goto L16;
        u0();
        return;
    L16:
        return;
    L13:
        u0();
    }

    @Override // defpackage.b83
    public final void Q() {
        jx3 r0 = new jx3();
        j51.F(this, new fa(6, r0, this));
        l82 r1 = (l82) r0.n;
        if (this.I.v0().a() == false) goto L12;
        l82 r2 = this.G;
        if (r2 == null) goto L7;
        r2.b();
    L7:
        if (r1 == null) goto L9;
        r1.a();
    L10:
        this.G = r1;
        return;
    L9:
        r1 = null;
        goto L10
    }

    @Override // defpackage.g94
    public final void c0(q94 r11) {
        boolean r0 = this.I.v0().a();
        c42[] r1 = o94.a;
        p94 r2 = n94.l;
        c42 r3 = o94.a[4];
        Boolean r4 = Boolean.valueOf(r0);
        r2.getClass();
        r11.a(r2, r4);
        na r5 = new na(0, this, ea1.class, "requestFocus", "requestFocus()Z", 0, 2);
        r11.a(d94.v, new w2(null, r5));
    }

    @Override // defpackage.rx4
    public final Object f() {
        return J;
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void k0() {
        l82 r0 = this.G;
        if (r0 == null) goto L5;
        r0.b();
    L5:
        this.G = null;
    }

    public final void t0(rm2 r8, q02 r9) {
        if (this.A == false) goto L10;
        s22 r0 = (s22) e0().e().K(fz0.h0);
        if (r0 == null) goto L7;
        as0 r4 = r0.M(new o(8, r8, r9));
    L8:
        fu.G(e0(), null, null, new r(r8, r9, r4, null, 6), 3);
        return;
    L7:
        r4 = null;
        goto L8
    L10:
        r8.l(r9);
    }

    public final void u0() {
        if (this.A == true) goto L5;
        return;
    L5:
        if (this.n.A == true) goto L7;
        cz1.b("visitAncestors called on an unattached node");
    L7:
        cx2 r0 = this.n.r;
        c72 r9 = j51.O(this);
    L8:
        if (r9 == null) goto L72;
        if ((((cx2) r9.Q.g).q & 262144) == 0) goto L44;
    L11:
        if (r0 == null) goto L44;
        if ((r0.p & 262144) == 0) goto L43;
        cx2 r1 = r0;
        f13 r4 = null;
    L15:
        if (r1 == null) goto L43;
        if ((r1 instanceof rx4) == false) goto L23;
        if (fa1.B != ((rx4) r1).f()) goto L23;
        return;
    L23:
        if ((r1.p & 262144) == 0) goto L42;
        if ((r1 instanceof fo0) == false) goto L42;
        cx2 r5 = ((fo0) r1).C;
        int r6 = 0;
    L28:
        if (r5 == null) goto L40;
        if ((r5.p & 262144) == 0) goto L39;
        r6 = r6 + 1;
        if (r6 != 1) goto L34;
        r1 = r5;
        goto L39
    L34:
        if (r4 != null) goto L36;
        r4 = new f13(new cx2[16]);
    L36:
        if (r1 == null) goto L38;
        r4.b(r1);
        r1 = null;
    L38:
        r4.b(r5);
    L39:
        r5 = r5.s;
        goto L28
    L40:
        if (r6 == 1) goto L15;
    L42:
        r1 = j51.c(r4);
    L43:
        r0 = r0.r;
    L44:
        r9 = r9.t();
        if (r9 == null) goto L49;
        w12 r2 = r9.Q;
        if (r2 == null) goto L49;
        r0 = (sq4) r2.f;
    L49:
        r0 = null;
        goto L8
    }

    public final void v0(rm2 r3) {
        if (h12.c(this.D, r3) == true) goto L11;
        rm2 r0 = this.D;
        if (r0 != null) goto L7;
    L9:
        this.F = null;
        this.D = r3;
        return;
    L7:
        if (this.F == null) goto L9;
        r0.l(new q91());
        goto L9
    }
}
