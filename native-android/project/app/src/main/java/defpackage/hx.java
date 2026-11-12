package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hx implements Closeable, Flushable {
    public final jr0 n;

    public hx(File r4) {
        s32 r0 = b71.a;
        String r1 = ge3.o;
        ge3 r5 = tv1.A(r4);
        r0.getClass();
        gr4 r2 = gr4.l;
        r2.getClass();
        this.n = new jr0(r0, r5, r2);
    }

    public final void b(oz3 r5) {
        r5.getClass();
        jr0 r4 = this.n;
        String r6 = si0.D(r5.a);
        monitor-enter(r4);
        r6.getClass();     // Catch: Throwable -> L12
        r4.q();     // Catch: Throwable -> L12
        r4.b();     // Catch: Throwable -> L12
        jr0.R(r6);     // Catch: Throwable -> L12
        dr0 r7 = (dr0) r4.v.get(r6);     // Catch: Throwable -> L12
        if (r7 != null) goto L8;
        monitor-exit(r4);
        return;
    L8:
        r4.K(r7);     // Catch: Throwable -> L12
        if (r4.t > r4.p) goto L14;
        r4.B = false;     // Catch: Throwable -> L12
    L14:
        monitor-exit(r4);
        return;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.n.flush();
    }
}
