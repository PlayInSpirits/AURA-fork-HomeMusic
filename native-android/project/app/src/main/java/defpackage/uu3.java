package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uu3 extends ch4 {
    public final if1 e;
    public int f;

    public uu3(long r1, gh4 r3, if1 r4) {
        super(r1, r3);
        this.e = r4;
        this.f = 1;
    }

    @Override // defpackage.ch4
    public final void c() {
        if (this.c == true) goto L12;
        l();
        this.c = true;
        Object r0 = jh4.c;
        monitor-enter(r0);
        o();     // Catch: Throwable -> L9
        monitor-exit(r0);
        return;
    L9:
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
        this.f++;
    }

    @Override // defpackage.ch4
    public final void l() {
        int r0 = this.f - 1;
        this.f = r0;
        if (r0 != 0) goto L6;
        a();
        return;
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
        jh4.c(this);
        return new x43(this.b, this.a, jh4.k(r7, this.e, true), this);
    }
}
