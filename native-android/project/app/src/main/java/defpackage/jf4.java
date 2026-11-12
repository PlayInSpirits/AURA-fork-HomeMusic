package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jf4 extends rp {
    public Object b;
    public Object c;
    public x03 d;
    public x03 e;
    public y94 f;
    public final kl3 g;
    public final ss2 h;

    public jf4() {
        super(4);
        this.g = new kl3(10, this);
        z r0 = new z(12, this);
        jh4.e(jh4.a);
        Object r1 = jh4.c;
        monitor-enter(r1);
        jh4.h = q40.F0(r0, jh4.h);     // Catch: Throwable -> L8
        monitor-exit(r1);
        this.h = new ss2(18, r0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.rp
    public final void e(y94 r1) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.rp
    public final void f() {
        Object r0 = this.a;
        monitor-enter(r0);
        this.b = this.c;     // Catch: Throwable -> L7
        if (this.e != null) goto L10;
        this.d = null;     // Catch: Throwable -> L7
    L13:
        monitor-exit(r0);
        return;
    L10:
        if (this.d != null) goto L12;
        x03 r1 = w54.a;     // Catch: Throwable -> L7
        this.d = new x03();     // Catch: Throwable -> L7
    L12:
        x03 r2 = this.d;     // Catch: Throwable -> L7
        this.d = this.e;     // Catch: Throwable -> L7
        this.e = r2;     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.rp
    public final void h() {
        this.h.d();
        this.c = null;
        this.e = null;
        Object r1 = this.a;
        monitor-enter(r1);
        this.f = null;     // Catch: Throwable -> L7
        this.b = null;     // Catch: Throwable -> L7
        this.d = null;     // Catch: Throwable -> L7
        monitor-exit(r1);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.rp
    public final if1 m(y94 r2) {
        y94 r0 = this.f;
        if (r0 != null) goto L5;
    L8:
        this.f = r2;
        return this.g;
    L5:
        if (r0.equals(r2) == true) goto L8;
        oo3.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        goto L8
    }

    @Override // defpackage.rp
    public final void n(y00 r1) {
        this.f = null;
        this.c = null;
        this.e = null;
        f();
    }
}
