package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ad implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ bd n;

    public ad(bd r1) {
        this.n = r1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r5) {
        this.n.q.removeCallbacks(this);
        bd.a0(this.n);
        bd r4 = this.n;
        Object r0 = r4.r;
        monitor-enter(r0);
    L16:
        th = move-exception;
        throw th;
    L5:
        if (r4.w == true) goto L8;
        monitor-exit(r0);
        return;
    L8:
        int r1 = 0;
        r4.w = false;     // Catch: Throwable -> L16
        ArrayList r2 = r4.t;     // Catch: Throwable -> L16
        r4.t = r4.u;     // Catch: Throwable -> L16
        r4.u = r2;     // Catch: Throwable -> L16
        monitor-exit(r0);
        int r6 = r2.size();
    L12:
        if (r1 >= r6) goto L14;
        ((Choreographer.FrameCallback) r2.get(r1)).doFrame(r5);
        r1 = r1 + 1;
        goto L12
    L14:
        r2.clear();
    }

    @Override // java.lang.Runnable
    public final void run() {
        bd.a0(this.n);
        bd r0 = this.n;
        Object r1 = r0.r;
        monitor-enter(r1);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (r0.t.isEmpty() == false) goto L10;
        r0.p.removeFrameCallback(this);     // Catch: Throwable -> L8
        r0.w = false;     // Catch: Throwable -> L8
    L10:
        monitor-exit(r1);
    }
}
