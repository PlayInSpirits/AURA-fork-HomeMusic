package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class px4 extends ch4 {
    public final ch4 e;
    public final boolean f;
    public final boolean g;
    public if1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px4(ch4 ch4Var, if1 if1Var, boolean z, boolean z2) {
        if1 if1VarE;
        super(0L, gh4.r);
        o54 o54Var = jh4.a;
        this.e = ch4Var;
        this.f = z;
        this.g = z2;
        this.h = jh4.k(if1Var, (ch4Var == null || (if1VarE = ch4Var.e()) == null) ? jh4.j.e : if1VarE, z);
        this.i = te5.m();
    }

    @Override // defpackage.ch4
    public final void c() {
        ch4 ch4Var;
        this.c = true;
        if (!this.g || (ch4Var = this.e) == null) {
            return;
        }
        ch4Var.c();
    }

    @Override // defpackage.ch4
    public final gh4 d() {
        return v().d();
    }

    @Override // defpackage.ch4
    public final if1 e() {
        return this.h;
    }

    @Override // defpackage.ch4
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ch4
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ch4
    public final if1 i() {
        return null;
    }

    @Override // defpackage.ch4
    public final void k() {
        te5.Q();
        throw null;
    }

    @Override // defpackage.ch4
    public final void l() {
        te5.Q();
        throw null;
    }

    @Override // defpackage.ch4
    public final void m() {
        v().m();
    }

    @Override // defpackage.ch4
    public final void n(rl4 rl4Var) {
        v().n(rl4Var);
    }

    @Override // defpackage.ch4
    public final ch4 u(if1 if1Var) {
        if1 if1VarK = jh4.k(if1Var, this.h, true);
        return !this.f ? jh4.g(v().u(null), if1VarK, true) : v().u(if1VarK);
    }

    public final ch4 v() {
        ch4 ch4Var = this.e;
        return ch4Var == null ? jh4.j : ch4Var;
    }
}
