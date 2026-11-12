package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wq1 implements ej4 {
    public final long n;
    public boolean o;
    public final tv p;
    public final tv q;
    public tl1 r;
    public boolean s;
    public final /* synthetic */ yq1 t;

    public wq1(yq1 r1, long r2, boolean r4) {
        this.t = r1;
        this.n = r2;
        this.o = r4;
        this.p = new tv();
        this.q = new tv();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yq1 r0 = this.t;
        monitor-enter(r0);
        this.s = true;     // Catch: Throwable -> L12
        tv r1 = this.q;     // Catch: Throwable -> L12
        long r2 = r1.o;     // Catch: Throwable -> L12
        r1.b();     // Catch: Throwable -> L12
        r0.notifyAll();     // Catch: Throwable -> L12
        monitor-exit(r0);
        if (r2 <= 0) goto L10;
        yq1 r3 = this.t;
        tl1 r4 = ze5.a;
        r3.b.s(r2);
    L10:
        this.t.a();
        return;
    L12:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.ej4
    public final long read(tv r28, long r29) {
        r28.getClass();
        long r3 = 0;
        if (r29 < 0) goto L79;
    L4:
        yq1 r5 = this.t;
        monitor-enter(r5);
        r5.b.getClass();     // Catch: Throwable -> L16
        vq1 r6 = r5.i;     // Catch: Throwable -> L16
        boolean r8 = true;
        if (r6.p == false) goto L9;
    L12:
        boolean r7 = true;
    L13:
        if (r7 == false) goto L81;
        r5.j.h();     // Catch: Throwable -> L16
    L81:
        monitor-enter(r5);     // Catch: Throwable -> L32
        b21 r9 = r5.l;     // Catch: Throwable -> L71
        monitor-exit(r5);     // Catch: Throwable -> L32
        if (r9 != null) goto L23;
    L37:
        Throwable r10 = null;
    L39:
        if (this.s == true) goto L70;
        tv r11 = this.q;     // Catch: Throwable -> L32
        long r12 = r11.o;     // Catch: Throwable -> L32
        if (r12 <= r3) goto L49;
        long r17 = r11.read(r28, Math.min(r29, r12));     // Catch: Throwable -> L32
        os.c(r5.c, r17, 0, 2);     // Catch: Throwable -> L32
        long r13 = r5.c.b();     // Catch: Throwable -> L32
        if (r10 != null) goto L47;
        long r25 = r3;
        if (r13 < (r5.b.D.a() / 2)) goto L48;
        r5.b.F(r5.a, r13);     // Catch: Throwable -> L32
        os.c(r5.c, 0, r13, 1);     // Catch: Throwable -> L32
    L48:
        r8 = false;
    L57:
        if (r7 == false) goto L59;
        r5.j.k();     // Catch: Throwable -> L16
    L59:
        monitor-exit(r5);
        this.t.b.C.getClass();
        if (r8 == false) goto L64;
        r3 = r25;
        goto L4
    L64:
        if (r17 == (-1)) goto L66;
        return r17;
    L66:
        if (r10 != null) goto L68;
        return -1;
    L68:
        throw r10;
    L47:
        r25 = r3;
        goto L48
    L49:
        r25 = r3;
        if (this.o == true) goto L56;
        if (r10 != null) goto L56;
        r5.wait();     // Catch: Throwable -> L32 InterruptedException -> L54
    L53:
        r17 = -1;
        goto L57
    L54:
        Thread.currentThread().interrupt();     // Catch: Throwable -> L32
        throw new InterruptedIOException();     // Catch: Throwable -> L32
    L56:
        r8 = false;
        goto L53
    L70:
        throw new IOException("stream closed");     // Catch: Throwable -> L32
    L23:
        if (this.o == true) goto L37;
        r10 = r5.m;     // Catch: Throwable -> L32
        if (r10 != null) goto L39;
        monitor-enter(r5);     // Catch: Throwable -> L32
        b21 r14 = r5.l;     // Catch: Throwable -> L34
        monitor-exit(r5);     // Catch: Throwable -> L32
        r14.getClass();     // Catch: Throwable -> L32
        r10 = new StreamResetException(r14);     // Catch: Throwable -> L32
        goto L39
    L34:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L71:
        th = move-exception;
        throw th;     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        if (r7 == false) goto L76;
        r5.j.k();     // Catch: Throwable -> L16
    L76:
        throw th;     // Catch: Throwable -> L16
    L9:
        if (r6.n == true) goto L12;
        r7 = false;
    L16:
        th = move-exception;
        throw th;
    L79:
        kf2.e(b11.k("byteCount < 0: ", r29));
        return 0;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.t.j;
    }
}
