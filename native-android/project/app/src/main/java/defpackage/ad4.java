package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ad4 implements as0 {
    public final cd4 n;
    public final long o;
    public final Object p;
    public final cz q;

    public ad4(cd4 r1, long r2, Object r4, cz r5) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
        this.q = r5;
    }

    @Override // defpackage.as0
    public final void a() {
        cd4 r0 = this.n;
        monitor-enter(r0);
    L16:
        th = move-exception;
        throw th;
    L6:
        if (this.o >= r0.o()) goto L9;
        monitor-exit(r0);
        return;
    L9:
        Object[] r1 = r0.u;     // Catch: Throwable -> L16
        r1.getClass();     // Catch: Throwable -> L16
        long r2 = this.o;     // Catch: Throwable -> L16
        if (r1[((int) r2) & (r1.length - 1)] == this) goto L13;
        monitor-exit(r0);
        return;
    L13:
        g12.d(r1, r2, g12.e);     // Catch: Throwable -> L16
        r0.j();     // Catch: Throwable -> L16
        monitor-exit(r0);
    }
}
