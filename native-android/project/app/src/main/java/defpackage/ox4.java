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

    /* JADX WARN: Illegal instructions before constructor call */
    public ox4(a13 a13Var, if1 if1Var, if1 if1Var2, boolean z, boolean z2) {
        if1 if1VarI;
        if1 if1VarE;
        o54 o54Var = jh4.a;
        super(0L, gh4.r, jh4.k(if1Var, (a13Var == null || (if1VarE = a13Var.e()) == null) ? jh4.j.e : if1VarE, z), jh4.l(if1Var2, (a13Var == null || (if1VarI = a13Var.i()) == null) ? jh4.j.f : if1VarI));
        this.o = a13Var;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = te5.m();
    }

    @Override // defpackage.a13
    public final void B(x03 x03Var) {
        te5.Q();
        throw null;
    }

    @Override // defpackage.a13
    public final a13 C(if1 if1Var, if1 if1Var2) {
        if1 if1VarK = jh4.k(if1Var, this.r, true);
        if1 if1VarL = jh4.l(if1Var2, this.s);
        return !this.p ? new ox4(D().C(null, if1VarL), if1VarK, if1VarL, false, true) : D().C(if1VarK, if1VarL);
    }

    public final a13 D() {
        a13 a13Var = this.o;
        return a13Var == null ? jh4.j : a13Var;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void c() {
        a13 a13Var;
        this.c = true;
        if (!this.q || (a13Var = this.o) == null) {
            return;
        }
        a13Var.c();
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
    public final void n(rl4 rl4Var) {
        D().n(rl4Var);
    }

    @Override // defpackage.ch4
    public final void r(gh4 gh4Var) {
        te5.Q();
        throw null;
    }

    @Override // defpackage.ch4
    public final void s(long j) {
        te5.Q();
        throw null;
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.a13, defpackage.ch4
    public final ch4 u(if1 if1Var) {
        if1 if1VarK = jh4.k(if1Var, this.r, true);
        return !this.p ? jh4.g(D().u(null), if1VarK, true) : D().u(if1VarK);
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
    /* JADX INFO: renamed from: y */
    public final if1 e() {
        return this.r;
    }
}
