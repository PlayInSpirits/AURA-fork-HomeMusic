package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y85 {
    public static final String a = null;

    static {
        a = cx.i("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context r2, String r3) {
        r2.getClass();
        Object r4 = r2.getApplicationContext().getSystemService("power");
        r4.getClass();
        String r5 = "WorkManager: ".concat(r3);
        PowerManager.WakeLock r6 = ((PowerManager) r4).newWakeLock(1, r5);
        z85 r0 = z85.a;
        monitor-enter(r0);
        String r7 = (String) z85.b.put(r6, r5);     // Catch: Throwable -> L8
        monitor-exit(r0);
        r6.getClass();
        return r6;
    L8:
        th = move-exception;
        throw th;
    }
}
