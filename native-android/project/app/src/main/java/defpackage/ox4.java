package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ox4 extends a13 {
    public final a13 o;
    public final boolean p;
    public final boolean q;
    public if1 r;
    public if1 s;
    public final long t;

    public ox4(a13 r8, if1 r9, if1 r10, boolean r11, boolean r12) {
        o54 r0 = jh4.a;
        if (r8 == null) goto L6;
        if1 r1 = r8.y();
        if (r1 == null) goto L6;
    L7:
        if1 r5 = jh4.k(r9, r1, r11);
        if (r8 == null) goto L11;
        if1 r13 = r8.i();
        if (r13 == null) goto L11;
    L12:
        if1 r6 = jh4.l(r10, r13);
        super(0, gh4.r, r5, r6);
        this.o = r8;
        this.p = r11;
        this.q = r12;
        this.r = this.e;
        this.s = this.f;
        this.t = te5.m();
        return;
    L11:
        r13 = jh4.j.f;
    L6:
        r1 = jh4.j.e;
        goto L7
    }

    @Override // defpackage.a13
    public final void B(x03 r1) {
        te5.Q();
        throw null;
    }

    @Override // defpackage.a13
    public final a13 C(if1 r9, if1 r10) {
        if1 r4 = jh4.k(r9, this.r, true);
        if1 r5 = jh4.l(r10, this.s);
        if (this.p == true) goto L7;
        return new ox4(D().C(null, r5), r4, r5, false, true);
    L7:
        return D().C(r4, r5);
    }

    public final a13 D() {
        a13 r0 = this.o;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return jh4.j;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void c() {
        this.c = true;
        if (this.q == false) goto L8;
        a13 r1 = this.o;
        if (r1 == null) goto L9;
        r1.c();
        return;
    L9:
        return;
    }

    @Override // defpackage.ch4
    public final gh4 d() {
        return D().d();
    }

    @Override // defpackage.a13, defpackage.ch4
    public final if1 e() {
        return this.r;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.ch4
    public final long g() {
        return D().g();
    }

    @Override // defpackage.a13, defpackage.ch4
    public final int h() {
        return D().h();
    }

    @Override // defpackage.a13, defpackage.ch4
    public final if1 i() {
        return this.s;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void k() {
        te5.Q();
        throw null;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void l() {
        te5.Q();
        throw null;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void m() {
        D().m();
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void n(rl4 r1) {
        D().n(r1);
    }

    @Override // defpackage.ch4
    public final void r(gh4 r1) {
        te5.Q();
        throw null;
    }

    @Override // defpackage.ch4
    public final void s(long r1) {
        te5.Q();
        throw null;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void t(int r1) {
        D().t(r1);
    }

    @Override // defpackage.a13, defpackage.ch4
    public final ch4 u(if1 r3) {
        if1 r4 = jh4.k(r3, this.r, true);
        if (this.p == true) goto L7;
        return jh4.g(D().u(null), r4, true);
    L7:
        return D().u(r4);
    }

    @Override // defpackage.a13
    public final jz4 w() {
        return D().w();
    }

    @Override // defpackage.a13
    public final x03 x() {
        return D().x();
    }

    @Override // defpackage.a13
    public final if1 y() {
        return this.r;
    }
}
