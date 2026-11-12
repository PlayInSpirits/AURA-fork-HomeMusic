package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ik3 {
    public static final ik3 c = null;
    public static final ik3 d = null;
    public final String a;
    public final rm2 b;

    static {
        c = new ik3("");
        d = new ik3("preload");
    }

    public ik3(String r3) {
        this.a = r3;
        if (Build.VERSION.SDK_INT < 31) goto L5;
        rm2 r4 = new rm2(7, false);
        r4.o = go2.d();
    L6:
        this.b = r4;
        return;
    L5:
        r4 = null;
        goto L6
    }

    public final synchronized LogSessionId a() {
        monitor-enter(this);
        rm2 r0 = this.b;     // Catch: Throwable -> L6
        r0.getClass();     // Catch: Throwable -> L6
        LogSessionId r1 = (LogSessionId) r0.o;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r1;
    L6:
        th = move-exception;
        throw th;
    }
}
