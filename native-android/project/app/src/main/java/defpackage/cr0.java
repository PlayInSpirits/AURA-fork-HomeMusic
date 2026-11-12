package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cr0 extends ac1 {
    public boolean n;
    public final /* synthetic */ jr0 o;
    public final /* synthetic */ dr0 p;

    public cr0(ej4 r1, jr0 r2, dr0 r3) {
        this.o = r2;
        this.p = r3;
        super(r1);
    }

    @Override // defpackage.ac1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.n == true) goto L18;
        this.n = true;
        jr0 r0 = this.o;
        dr0 r2 = this.p;
        monitor-enter(r0);
        int r1 = r2.h - 1;     // Catch: Throwable -> L12
        r2.h = r1;     // Catch: Throwable -> L12
        if (r1 == 0) goto L9;
    L14:
        monitor-exit(r0);
        return;
    L9:
        if (r2.f == false) goto L14;
        r0.K(r2);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }
}
