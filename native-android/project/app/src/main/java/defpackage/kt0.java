package defpackage;

import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends Thread {
    public final tt0 n;
    public final du0 o;
    public final mt0 p;
    public final boolean q;
    public final int r;
    public volatile it0 s;
    public volatile boolean t;
    public Exception u;
    public long v;

    public kt0(tt0 r1, du0 r2, mt0 r3, boolean r4, int r5, it0 r6) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        this.s = r6;
        this.v = -1;
    }

    public final void a(boolean r1) {
        if (r1 == false) goto L5;
        this.s = null;
    L5:
        if (this.t == true) goto L8;
        this.t = true;
        this.o.cancel();
        interrupt();
        return;
    }

    public final void b(long r2, long r4, float r6) {
        this.p.a = r4;
        this.p.b = r6;
        if (r2 == this.v) goto L8;
        this.v = r2;
        it0 r5 = this.s;
        if (r5 == null) goto L9;
        r5.obtainMessage(11, (int) (r2 >> 32), (int) r2, this).sendToTarget();
        return;
    L9:
        return;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
    L23:
        Thread.currentThread().interrupt();
    L24:
        it0 r0 = this.s;
        if (r0 == null) goto L38;
        r0.obtainMessage(10, this).sendToTarget();
        return;
    L38:
        return;
    L5:
        e = move-exception;
        this.u = e;
        goto L24
    L3:
        if (this.q == false) goto L7;
        this.o.remove();     // Catch: Exception -> L5 InterruptedException -> L23
        goto L24
    L7:
        long r1 = -1;
        int r3 = 0;
    L9:
        if (this.t == true) goto L24;
        this.o.a(this);     // Catch: Exception -> L5 IOException -> L12 InterruptedException -> L23
    L12:
        e = move-exception;
        if (this.t == true) goto L9;
        long r5 = this.p.a;     // Catch: Exception -> L5 InterruptedException -> L23
        if (r5 == r1) goto L18;
        r3 = 0;
        r1 = r5;
    L18:
        int r6 = r3 + 1;     // Catch: Exception -> L5 InterruptedException -> L23
        if (r6 > this.r) goto L21;
        Thread.sleep(Math.min(r3 * 1000, SmartSession.MAX_SONGS));     // Catch: Exception -> L5 InterruptedException -> L23
        r3 = r6;
        goto L9
    L21:
        throw e;     // Catch: Exception -> L5 InterruptedException -> L23
    }
}
