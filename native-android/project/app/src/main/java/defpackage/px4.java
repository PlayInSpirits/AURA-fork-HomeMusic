package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class px4 extends ch4 {
    public final ch4 e;
    public final boolean f;
    public final boolean g;
    public if1 h;
    public final long i;

    public px4(ch4 r4, if1 r5, boolean r6, boolean r7) {
        o54 r0 = jh4.a;
        super(0, gh4.r);
        this.e = r4;
        this.f = r6;
        this.g = r7;
        if (r4 == null) goto L6;
        if1 r8 = r4.e();
        if (r8 == null) goto L6;
    L7:
        this.h = jh4.k(r5, r8, r6);
        this.i = te5.m();
        return;
    L6:
        r8 = jh4.j.e;
        goto L7
    }

    @Override // defpackage.ch4
    public final void c() {
        this.c = true;
        if (this.g == false) goto L8;
        ch4 r1 = this.e;
        if (r1 == null) goto L9;
        r1.c();
        return;
    L9:
        return;
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
    public final void n(rl4 r1) {
        v().n(r1);
    }

    @Override // defpackage.ch4
    public final ch4 u(if1 r3) {
        if1 r4 = jh4.k(r3, this.h, true);
        if (this.f == true) goto L7;
        return jh4.g(v().u(null), r4, true);
    L7:
        return v().u(r4);
    }

    public final ch4 v() {
        ch4 r0 = this.e;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return jh4.j;
    }
}
