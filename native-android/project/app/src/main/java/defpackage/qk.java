package defpackage;

import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qk implements Runnable {
    public static final ThreadPoolExecutor u = null;
    public static zw2 v;
    public final zq0 n;
    public final xw2 o;
    public volatile int p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final CountDownLatch s;
    public final /* synthetic */ og5 t;

    static {
        an0 r7 = new an0(1);
        LinkedBlockingQueue r6 = new LinkedBlockingQueue(10);
        u = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, r6, r7);
    }

    public qk(og5 r3) {
        this.t = r3;
        this.p = 1;
        this.q = new AtomicBoolean();
        this.r = new AtomicBoolean();
        zq0 r0 = new zq0(2, this);
        this.n = r0;
        this.o = new xw2(this, r0);
        this.s = new CountDownLatch(1);
    }

    public final void a(Object r6) {
        monitor-enter(qk.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (v != null) goto L9;
        v = new zw2(Looper.getMainLooper(), 0, false);     // Catch: Throwable -> L7
    L9:
        zw2 r1 = v;     // Catch: Throwable -> L7
        monitor-exit(qk.class);     // Catch: Throwable -> L7
        r1.obtainMessage(1, new yw2(this, new Object[]{r6})).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.b();
    }
}
