package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 implements rw4 {
    @Override // defpackage.rw4
    public final void a(kp r3, ii0 r4, boolean r5, int r6) {
        r4.getClass();
        if (r5 == true) goto L5;
        return;
    L5:
        if (jp1.b() == true) goto L8;
        return;
    L8:
        if (h12.c(Thread.currentThread().getName(), "queue-preloader") == false) goto L10;
        AtomicLong r2 = lp1.c;
    L11:
        r2.addAndGet(r6);
        lp1 r7 = lp1.a;
        monitor-enter(r7);
        long r8 = SystemClock.elapsedRealtime();     // Catch: Throwable -> L20
        if ((lp1.b.get() + lp1.c.get()) < 262144) goto L17;
    L22:
        r7.c();     // Catch: Throwable -> L20
        monitor-exit(r7);
        return;
    L17:
        if ((r8 - lp1.d) >= 5000) goto L22;
        monitor-exit(r7);
        return;
    L20:
        th = move-exception;
        throw th;
    L10:
        r2 = lp1.b;
        goto L11
    }

    @Override // defpackage.rw4
    public final void b(kp r1, ii0 r2, boolean r3) {
        r2.getClass();
    }

    @Override // defpackage.rw4
    public final void c(kp r2, ii0 r3, boolean r4) {
        r3.getClass();
        if (r4 == false) goto L9;
        lp1 r1 = lp1.a;
        Uri r5 = r3.a;
        r5.getClass();
        String r6 = r5.getLastPathSegment();
        if (r6 != null) goto L7;
        r6 = r5.toString();
        r6.getClass();
    L7:
        Log.d("HomeTrafficStats", "end " + r6 + " at " + r3.f);
        return;
    }

    @Override // defpackage.rw4
    public final void d(kp r1, ii0 r2) {
        r2.getClass();
    }
}
