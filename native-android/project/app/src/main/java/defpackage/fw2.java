package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fw2 {
    public static final gw2 g = new gw2();
    public final dm0 a;
    public final gn2 b;
    public final yp4 c;
    public final bw2 d;
    public final bw2 e;
    public boolean f;

    public fw2(dm0 dm0Var, gn2 gn2Var, bw2 bw2Var, bw2 bw2Var2) {
        Looper looper;
        this.a = dm0Var;
        this.b = gn2Var;
        this.d = bw2Var;
        this.e = bw2Var2;
        gw2 gw2Var = g;
        synchronized (gw2Var) {
            try {
                if (gw2Var.b == null) {
                    rr2.w(gw2Var.c == 0);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:MetadataRetriever");
                    gw2Var.b = handlerThread;
                    handlerThread.start();
                }
                gw2Var.c++;
                HandlerThread handlerThread2 = gw2Var.b;
                handlerThread2.getClass();
                looper = handlerThread2.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c = new yp4(new Handler(looper, new ew2(this)));
    }

    public final synchronized void a() {
        if (!this.f) {
            this.f = true;
            this.c.a(4).b();
        }
    }
}
