package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fw2 {
    public static final gw2 g = null;
    public final dm0 a;
    public final gn2 b;
    public final yp4 c;
    public final bw2 d;
    public final bw2 e;
    public boolean f;

    static {
        g = new gw2();
    }

    public fw2(dm0 r1, gn2 r2, bw2 r3, bw2 r4) {
        this.a = r1;
        this.b = r2;
        this.d = r3;
        this.e = r4;
        gw2 r5 = g;
        monitor-enter(r5);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (r5.b == null) goto L7;
    L13:
        r5.c++;     // Catch: Throwable -> L11
        HandlerThread r6 = r5.b;     // Catch: Throwable -> L11
        r6.getClass();     // Catch: Throwable -> L11
        Looper r7 = r6.getLooper();     // Catch: Throwable -> L11
        monitor-exit(r5);
        this.c = new yp4(new Handler(r7, new ew2(this)));
        return;
    L7:
        if (r5.c != 0) goto L9;
        boolean r8 = true;
    L10:
        rr2.w(r8);     // Catch: Throwable -> L11
        HandlerThread r9 = new HandlerThread("ExoPlayer:MetadataRetriever");     // Catch: Throwable -> L11
        r5.b = r9;     // Catch: Throwable -> L11
        r9.start();     // Catch: Throwable -> L11
        goto L13
    L9:
        r8 = false;
        goto L10
    }

    public final synchronized void a() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f == true) goto L9;
        this.f = true;     // Catch: Throwable -> L7
        this.c.a(4).b();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }
}
