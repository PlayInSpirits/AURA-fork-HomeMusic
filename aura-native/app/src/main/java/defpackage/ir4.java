package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ir4 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final rv2 f;

    static {
        String str;
        int i = eq4.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = kb4.V("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = eq4.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = kb4.W("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        d = kb4.W("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(kb4.V("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = rv2.r;
    }
}
