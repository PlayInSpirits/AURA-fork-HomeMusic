package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ra0 {
    public static final AtomicInteger a = null;
    public static volatile long b;
    public static volatile long c;

    static {
        a = new AtomicInteger(0);
    }

    public static final void a() {
        qa0 r0 = new qa0();
        a.updateAndGet(r0);
    }

    public static final boolean b() {
        if (SystemClock.elapsedRealtime() >= c) goto L5;
        return true;
    L5:
        if (a.get() > 0) goto L7;
        return false;
    L7:
        if ((SystemClock.elapsedRealtime() - b) < ((((long) ud3.x()) * 1000) + 1000)) goto L14;
        return false;
    L14:
        return true;
    }
}
