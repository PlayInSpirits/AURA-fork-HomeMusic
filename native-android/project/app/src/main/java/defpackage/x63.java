package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x63 {
    public static final Object c = null;
    public static String d;
    public static HashSet e;
    public static final Object f = null;
    public static w63 g;
    public final Context a;
    public final NotificationManager b;

    static {
        c = new Object();
        e = new HashSet();
        f = new Object();
    }

    public x63(Context r2) {
        this.a = r2;
        this.b = (NotificationManager) r2.getSystemService("notification");
    }

    public final void a(int r5, Notification r6) {
        Bundle r0 = r6.extras;
        if (r0 != null) goto L5;
    L19:
        this.b.notify(null, r5, r6);
        return;
    L5:
        if (r0.getBoolean("android.support.useSideChannel") == false) goto L19;
        t63 r1 = new t63(this.a.getPackageName(), r5, r6);
        Object r2 = f;
        monitor-enter(r2);
    L11:
        th = move-exception;
        throw th;
    L9:
        if (g != null) goto L13;
        g = new w63(this.a.getApplicationContext());     // Catch: Throwable -> L11
    L13:
        g.o.obtainMessage(0, r1).sendToTarget();     // Catch: Throwable -> L11
        monitor-exit(r2);     // Catch: Throwable -> L11
        this.b.cancel(null, r5);
    }
}
