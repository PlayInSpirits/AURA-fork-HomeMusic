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
    public static final ThreadPoolExecutor u;
    public static zw2 v;
    public final zq0 n;
    public final xw2 o;
    public volatile int p = 1;
    public final AtomicBoolean q = new AtomicBoolean();
    public final AtomicBoolean r = new AtomicBoolean();
    public final CountDownLatch s;
    public final /* synthetic */ og5 t;

    static {
        an0 an0Var = new an0(1);
        u = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), an0Var);
    }

    public qk(og5 og5Var) {
        this.t = og5Var;
        zq0 zq0Var = new zq0(2, this);
        this.n = zq0Var;
        this.o = new xw2(this, zq0Var);
        this.s = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        zw2 zw2Var;
        synchronized (qk.class) {
            try {
                if (v == null) {
                    v = new zw2(Looper.getMainLooper(), 0, false);
                }
                zw2Var = v;
            } catch (Throwable th) {
                throw th;
            }
        }
        zw2Var.obtainMessage(1, new yw2(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.b();
    }
}
