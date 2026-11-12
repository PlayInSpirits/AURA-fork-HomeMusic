package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yi1 extends a13 {
    @Override // defpackage.a13
    public final a13 C(if1 r2, if1 r3) {
        return (a13) ((ch4) jh4.e(new ih4(new cd(2, r2, r3), 0)));
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void c() {
        Object r0 = jh4.c;
        monitor-enter(r0);
        o();     // Catch: Throwable -> L7
        monitor-exit(r0);
        return;
    L7:
        th = move-exception;
        throw th;
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
        jh4.a();
    }

    @Override // defpackage.a13, defpackage.ch4
    public final ch4 u(if1 r2) {
        return (uu3) ((ch4) jh4.e(new ih4(new kv(1, r2), 0)));
    }

    @Override // defpackage.a13
    public final jz4 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
