package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xr1 {
    public static volatile boolean a;
    public static volatile bv3 b;
    public static Thread c;
    public static Context d;
    public static final rp4 e = null;
    public static final u6 f = null;

    static {
        e = new rp4(new e90(12));
        f = new u6(6);
    }

    public static final synchronized void a() {
        monitor-enter(xr1.class);
        a = false;     // Catch: Throwable -> L8
        bv3 r1 = b;     // Catch: Throwable -> L8
        if (r1 == null) goto L10;
        r1.cancel();     // Catch: Throwable -> L8
    L10:
        b = null;     // Catch: Throwable -> L8
        Thread r2 = c;     // Catch: Throwable -> L8
        if (r2 == null) goto L13;
        r2.interrupt();     // Catch: Throwable -> L8
    L13:
        c = null;     // Catch: Throwable -> L8
        monitor-exit(xr1.class);
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
