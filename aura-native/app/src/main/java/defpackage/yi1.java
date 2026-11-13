package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yi1 extends a13 {
    public yi1(long a0, defpackage.gh4 a1, defpackage.if1 a2, defpackage.if1 a3) {
        super(a0, a1, a2, a3);
    }

    @Override // defpackage.a13
    public final a13 C(if1 if1Var, if1 if1Var2) {
        return (a13) ((ch4) jh4.e(new ih4(new cd(2, if1Var, if1Var2), 0)));
    }

    @Override // defpackage.a13, defpackage.ch4
    public final void c() {
        synchronized (jh4.c) {
            o();
        }
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
    public final ch4 u(if1 if1Var) {
        return (uu3) ((ch4) jh4.e(new ih4(new kv(1, if1Var), 0)));
    }

    @Override // defpackage.a13
    public final jz4 w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
