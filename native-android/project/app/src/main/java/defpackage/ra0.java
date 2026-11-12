package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ra0 {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static volatile long b;
    public static volatile long c;

    public static final void a() {
        a.updateAndGet(new qa0());
    }

    public static final boolean b() {
        if (SystemClock.elapsedRealtime() >= c) {
            return a.get() > 0 && SystemClock.elapsedRealtime() - b < (((long) ud3.x()) * 1000) + 1000;
        }
        return true;
    }
}
