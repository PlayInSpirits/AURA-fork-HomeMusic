package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yp4 {
    public static final ArrayList b = null;
    public final Handler a;

    static {
        b = new ArrayList(50);
    }

    public yp4(Handler r1) {
        this.a = r1;
    }

    public static xp4 c() {
        ArrayList r0 = b;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (r0.isEmpty() == false) goto L9;
        xp4 r1 = new xp4();     // Catch: Throwable -> L7
    L10:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L9:
        r1 = (xp4) r0.remove(r0.size() - 1);     // Catch: Throwable -> L7
        goto L10
    }

    public final xp4 a(int r2) {
        xp4 r0 = c();
        r0.a = this.a.obtainMessage(r2);
        return r0;
    }

    public final xp4 b(int r2, Object r3) {
        xp4 r0 = c();
        r0.a = this.a.obtainMessage(r2, r3);
        return r0;
    }

    public final void d(Runnable r1) {
        this.a.post(r1);
    }

    public final void e() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final void f(int r2) {
        if (r2 == 0) goto L4;
        boolean r0 = true;
    L5:
        rr2.l(r0);
        this.a.removeMessages(r2);
        return;
    L4:
        r0 = false;
        goto L5
    }

    public final void g(int r1) {
        this.a.sendEmptyMessage(r1);
    }

    public final void h(int r3, int r4) {
        this.a.sendEmptyMessageDelayed(r3, r4);
    }
}
