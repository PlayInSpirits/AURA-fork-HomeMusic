package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ov4 {
    public static final long a = 0;
    public static final Method b = null;

    static {
        if (Build.VERSION.SDK_INT >= 29) goto L11;
        a = Trace.class.getField("TRACE_TAG_APP").getLong(null);     // Catch: Exception -> L6
        Class r3 = Long.TYPE;     // Catch: Exception -> L6
        b = Trace.class.getMethod("isTagEnabled", new Class[]{r3});     // Catch: Exception -> L6
        Class r4 = Integer.TYPE;     // Catch: Exception -> L6
        Trace.class.getMethod("asyncTraceBegin", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        Trace.class.getMethod("asyncTraceEnd", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        Trace.class.getMethod("traceCounter", new Class[]{r3, String.class, r4});     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        Log.i("TraceCompat", "Unable to initialize via reflection.", e);
        return;
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT < 29) goto L11;
        return yh.c();
    L11:
        return ((Boolean) b.invoke(null, new Object[]{Long.valueOf(a)})).booleanValue();
    L9:
        Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
        return false;
    }
}
