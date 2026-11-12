package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends g12 {
    @Override // defpackage.g12
    public final void K(t0 r1, t0 r2) {
        r1.b = r2;
    }

    @Override // defpackage.g12
    public final void L(t0 r1, Thread r2) {
        r1.a = r2;
    }

    @Override // defpackage.g12
    public final boolean g(u0 r1, i0 r2, i0 r3) {
        monitor-enter(r1);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r1.o != r2) goto L11;
        r1.o = r3;     // Catch: Throwable -> L8
        monitor-exit(r1);     // Catch: Throwable -> L8
        return true;
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L8
        return false;
    }

    @Override // defpackage.g12
    public final boolean h(u0 r1, Object r2, Object r3) {
        monitor-enter(r1);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r1.n != r2) goto L11;
        r1.n = r3;     // Catch: Throwable -> L8
        monitor-exit(r1);     // Catch: Throwable -> L8
        return true;
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L8
        return false;
    }

    @Override // defpackage.g12
    public final boolean i(u0 r1, t0 r2, t0 r3) {
        monitor-enter(r1);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r1.p != r2) goto L11;
        r1.p = r3;     // Catch: Throwable -> L8
        monitor-exit(r1);     // Catch: Throwable -> L8
        return true;
    L11:
        monitor-exit(r1);     // Catch: Throwable -> L8
        return false;
    }

    @Override // defpackage.g12
    public final i0 p(u0 r2) {
        i0 r1 = i0.d;
        monitor-enter(r2);
        i0 r0 = r2.o;     // Catch: Throwable -> L7
        if (r0 == r1) goto L9;
        r2.o = r1;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r2);     // Catch: Throwable -> L7
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.g12
    public final t0 q(u0 r2) {
        t0 r1 = t0.c;
        monitor-enter(r2);
        t0 r0 = r2.p;     // Catch: Throwable -> L7
        if (r0 == r1) goto L9;
        r2.p = r1;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r2);     // Catch: Throwable -> L7
        return r0;
    L7:
        th = move-exception;
        throw th;
    }
}
