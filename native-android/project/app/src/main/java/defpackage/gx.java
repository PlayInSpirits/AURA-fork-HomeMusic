package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gx extends zb1 {
    public final /* synthetic */ hx o;
    public final /* synthetic */ jw p;

    public gx(hx r1, jw r2, of4 r3) {
        this.o = r1;
        this.p = r2;
        super(r3);
    }

    @Override // defpackage.zb1, defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        hx r0 = this.o;
        jw r1 = this.p;
        monitor-enter(r0);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (r1.n == false) goto L9;
        monitor-exit(r0);
        return;
    L9:
        r1.n = true;     // Catch: Throwable -> L13
        monitor-exit(r0);
        super.close();
        ((ll) this.p.o).b();
    }
}
