package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kp1 implements rw4 {
    public kp1() {
        super();
    }

    @Override // defpackage.rw4
    public final void a(kp kpVar, ii0 ii0Var, boolean z, int i) {
        ii0Var.getClass();
        if (z && jp1.b()) {
            (h12.c(Thread.currentThread().getName(), "queue-preloader") ? lp1.c : lp1.b).addAndGet(i);
            lp1 lp1Var = lp1.a;
            synchronized (lp1Var) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (lp1.b.get() + lp1.c.get() >= 262144 || elapsedRealtime - lp1.d >= 5000) {
                    lp1Var.c();
                }
            }
        }
    }

    @Override // defpackage.rw4
    public final void b(kp kpVar, ii0 ii0Var, boolean z) {
        ii0Var.getClass();
    }

    @Override // defpackage.rw4
    public final void c(kp kpVar, ii0 ii0Var, boolean z) {
        ii0Var.getClass();
        if (z) {
            lp1 lp1Var = lp1.a;
            Uri uri = ii0Var.a;
            uri.getClass();
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = uri.toString();
                lastPathSegment.getClass();
            }
            Log.d("HomeTrafficStats", "end " + lastPathSegment + " at " + ii0Var.f);
        }
    }

    @Override // defpackage.rw4
    public final void d(kp kpVar, ii0 ii0Var) {
        ii0Var.getClass();
    }
}
