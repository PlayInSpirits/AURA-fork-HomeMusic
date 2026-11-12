package defpackage;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vq1 implements of4 {
    public final boolean n;
    public final tv o;
    public boolean p;
    public final /* synthetic */ yq1 q;

    public vq1(yq1 r1, boolean r2) {
        this.q = r1;
        this.n = r2;
        this.o = new tv();
    }

    @Override // defpackage.of4
    public final void L(tv r4, long r5) {
        tl1 r0 = ze5.a;
        tv r1 = this.o;
        r1.L(r4, r5);
    L4:
        if (r1.o < 16384) goto L6;
        b(false);
        goto L4
    }

    public final void b(boolean r13) {
        yq1 r1 = this.q;
        monitor-enter(r1);
        r1.k.h();     // Catch: Throwable -> L32
    L47:
    L23:
        th = move-exception;
        r1.k.k();     // Catch: Throwable -> L32
        throw th;     // Catch: Throwable -> L32
    L6:
        if (r1.d < r1.e) goto L25;
        if (this.n == true) goto L25;
        if (this.p == true) goto L25;
        monitor-enter(r1);     // Catch: Throwable -> L23
        b21 r0 = r1.l;     // Catch: Throwable -> L19
        monitor-exit(r1);     // Catch: Throwable -> L23
        if (r0 != null) goto L25;
        r1.wait();     // Catch: InterruptedException -> L17 Throwable -> L23
    L17:
        Thread.currentThread().interrupt();     // Catch: Throwable -> L23
        throw new InterruptedIOException();     // Catch: Throwable -> L23
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L23
    L25:
        r1.k.k();     // Catch: Throwable -> L32
        r1.b();     // Catch: Throwable -> L32
        long r10 = Math.min(r1.e - r1.d, this.o.o);     // Catch: Throwable -> L32
        r1.d += r10;     // Catch: Throwable -> L32
        if (r13 == true) goto L29;
    L34:
        boolean r14 = false;
    L31:
        boolean r8 = r14;
        monitor-exit(r1);
        this.q.k.h();
        yq1 r15 = this.q;     // Catch: Throwable -> L40
        r15.b.u(r15.a, r8, this.o, r10);     // Catch: Throwable -> L40
        this.q.k.k();
        return;
    L40:
        th = move-exception;
        this.q.k.k();
        throw th;
    L29:
        if (r10 != this.o.o) goto L34;
        r14 = true;
    L32:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.of4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yq1 r1 = this.q;
        tl1 r0 = ze5.a;
        monitor-enter(r1);
    L39:
        th = move-exception;
        throw th;
    L5:
        if (this.p == false) goto L8;
        monitor-exit(r1);
        return;
    L8:
        monitor-enter(r1);     // Catch: Throwable -> L39
        b21 r2 = r1.l;     // Catch: Throwable -> L35
        monitor-exit(r1);     // Catch: Throwable -> L39
        if (r2 != null) goto L14;
        boolean r3 = true;
    L15:
        monitor-exit(r1);
        yq1 r4 = this.q;
        if (r4.i.n == false) goto L19;
    L25:
        yq1 r5 = this.q;
        monitor-enter(r5);
        this.p = true;     // Catch: Throwable -> L31
        r5.notifyAll();     // Catch: Throwable -> L31
        monitor-exit(r5);
        this.q.b.flush();
        this.q.a();
        return;
    L31:
        th = move-exception;
        throw th;
    L19:
        if (this.o.o > 0) goto L21;
        if (r3 == false) goto L25;
        r4.b.u(r4.a, true, null, 0);
    L21:
        if (this.o.o <= 0) goto L25;
        b(true);
        goto L21
    L14:
        r3 = false;
        goto L15
    L35:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    }

    @Override // defpackage.of4, java.io.Flushable
    public final void flush() {
        yq1 r0 = this.q;
        tl1 r1 = ze5.a;
        monitor-enter(r0);
        r0.b();     // Catch: Throwable -> L10
        monitor-exit(r0);
    L7:
        if (this.o.o <= 0) goto L9;
        b(false);
        this.q.b.flush();
        goto L7
    L9:
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.of4
    public final fu4 timeout() {
        return this.q.k;
    }
}
