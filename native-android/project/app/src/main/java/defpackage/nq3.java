package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nq3 {
    public static final String a = null;

    static {
        a = cx.i("ProcessUtils");
    }

    public static final boolean a(Context r4, r90 r5) {
        r4.getClass();
        r5.getClass();
        if (Build.VERSION.SDK_INT < 28) goto L5;
        String r6 = ne.g();
    L25:
        return h12.c(r6, r4.getApplicationInfo().processName);
    L5:
        r6 = null;
        Method r0 = Class.forName("android.app.ActivityThread", false, sc5.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);     // Catch: Throwable -> L10
        r0.setAccessible(true);     // Catch: Throwable -> L10
        Object r1 = r0.invoke(null, null);     // Catch: Throwable -> L10
        r1.getClass();     // Catch: Throwable -> L10
        if ((r1 instanceof String) == false) goto L12;
        r6 = (String) r1;     // Catch: Throwable -> L10
    L12:
        int r2 = Process.myPid();
        Object r3 = r4.getSystemService("activity");
        r3.getClass();
        List<ActivityManager.RunningAppProcessInfo> r7 = ((ActivityManager) r3).getRunningAppProcesses();
        if (r7 == null) goto L25;
        Iterator<T> r8 = r7.iterator();
    L16:
        if (r8.hasNext() == false) goto L20;
        Object r9 = r8.next();
        if (((ActivityManager.RunningAppProcessInfo) r9).pid != r2) goto L16;
    L21:
        ActivityManager.RunningAppProcessInfo r10 = (ActivityManager.RunningAppProcessInfo) r9;
        if (r10 == null) goto L25;
        r6 = r10.processName;
        goto L25
    L20:
        r9 = null;
    L10:
        th = move-exception;
        cx.f().c(a, "Unable to check ActivityThread for processName", th);
        goto L12
    }
}
