package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x43 extends ch4 {
    public final if1 e;
    public final ch4 f;

    public x43(long r1, gh4 r3, if1 r4, ch4 r5) {
        super(r1, r3);
        this.e = r4;
        this.f = r5;
        r5.k();
    }

    @Override // defpackage.ch4
    public final void c() {
        ch4 r0 = this.f;
        if (this.c == false) goto L5;
        return;
    L5:
        if (this.b == r0.g()) goto L7;
        a();
    L7:
        r0.l();
        this.c = true;
        Object r1 = jh4.c;
        monitor-enter(r1);
        o();     // Catch: Throwable -> L12
        monitor-exit(r1);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ch4
    public final if1 e() {
        return this.e;
    }

    @Override // defpackage.ch4
    public final boolean f() {
        return true;
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
    }

    @Override // defpackage.ch4
    public final void n(rl4 r1) {
        o54 r0 = jh4.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ch4
    public final ch4 u(if1 r7) {
        return new x43(this.b, this.a, jh4.k(r7, this.e, true), this.f);
    }
}
