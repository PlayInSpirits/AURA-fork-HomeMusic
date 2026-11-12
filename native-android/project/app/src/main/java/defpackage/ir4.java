package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ir4 {
    public static final String a = null;
    public static final long b = 0;
    public static final int c = 0;
    public static final int d = 0;
    public static final long e = 0;
    public static final rv2 f = null;

    static {
        int r1 = eq4.a;
        String r0 = System.getProperty("kotlinx.coroutines.scheduler.default.name");     // Catch: SecurityException -> L5
    L6:
        if (r0 != null) goto L8;
        r0 = "DefaultDispatcher";
    L8:
        a = r0;
        b = kb4.V("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);
        int r2 = eq4.a;
        if (r2 >= 2) goto L11;
        r2 = 2;
    L11:
        c = kb4.W("kotlinx.coroutines.scheduler.core.pool.size", r2, 8);
        d = kb4.W("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(kb4.V("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
        f = rv2.r;
        return;
    L5:
        r0 = null;
        goto L6
    }
}
