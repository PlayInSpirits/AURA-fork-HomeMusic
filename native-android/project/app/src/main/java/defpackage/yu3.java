package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yu3 implements Runnable {
    public final ky n;
    public volatile AtomicInteger o;
    public final /* synthetic */ bv3 p;

    public yu3(bv3 r1, ky r2) {
        this.p = r1;
        this.n = r2;
        this.o = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String r2 = "OkHttp ".concat(this.p.o.a.i());
        bv3 r3 = this.p;
        Thread r4 = Thread.currentThread();
        String r5 = r4.getName();
        r4.setName(r2);
        r3.q.h();     // Catch: Throwable -> L11
        boolean r6 = false;
    L39:
        this.n.onResponse(r3, r3.e());     // Catch: Throwable -> L13 IOException -> L15
        o83 r0 = r3.n;     // Catch: Throwable -> L11
    L9:
        r0.a.q(this);     // Catch: Throwable -> L11
        r4.setName(r5);
        return;
    L15:
        e = e;
        r6 = true;
    L25:
        if (r6 == false) goto L27;
        qg3 r7 = qg3.a;     // Catch: Throwable -> L21
        qg3 r8 = qg3.a;     // Catch: Throwable -> L21
        String r1 = "Callback failure for ".concat(bv3.a(r3));     // Catch: Throwable -> L21
        r8.getClass();     // Catch: Throwable -> L21
        qg3.i(r1, 4, e);     // Catch: Throwable -> L21
    L28:
        r0 = r3.n;     // Catch: Throwable -> L11
        goto L9
    L27:
        this.n.onFailure(r3, e);     // Catch: Throwable -> L21
    L13:
        th = th;
        r6 = true;
    L18:
        r3.cancel();     // Catch: Throwable -> L21
        if (r6 == true) goto L23;
        IOException r9 = new IOException("canceled due to " + th);     // Catch: Throwable -> L21
        j51.d(r9, th);     // Catch: Throwable -> L21
        this.n.onFailure(r3, r9);     // Catch: Throwable -> L21
    L23:
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        r3.n.a.q(this);     // Catch: Throwable -> L11
        throw th;     // Catch: Throwable -> L11
    L24:
        e = e;
    L17:
        th = th;
    L11:
        th = move-exception;
        r4.setName(r5);
        throw th;
    }
}
