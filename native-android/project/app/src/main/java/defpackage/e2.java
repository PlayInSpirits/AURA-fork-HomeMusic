package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends ji2 {
    @Override // defpackage.ji2
    public final void B(f2 r1, f2 r2) {
        r1.b = r2;
    }

    @Override // defpackage.ji2
    public final void C(f2 r1, Thread r2) {
        r1.a = r2;
    }

    @Override // defpackage.ji2
    public final boolean d(g2 r1, c2 r2, c2 r3) {
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

    @Override // defpackage.ji2
    public final boolean e(g2 r1, Object r2, Object r3) {
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

    @Override // defpackage.ji2
    public final boolean f(g2 r1, f2 r2, f2 r3) {
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
}
