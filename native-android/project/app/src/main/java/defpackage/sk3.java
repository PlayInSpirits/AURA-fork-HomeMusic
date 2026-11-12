package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sk3 {
    public final rk3 a;
    public final q41 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public sk3(q41 r1, rk3 r2, cu4 r3, int r4, Looper r5) {
        this.b = r1;
        this.a = r2;
        this.e = r5;
    }

    public final synchronized void a(boolean r1) {
        monitor-enter(this);
        notifyAll();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final void b() {
        rr2.w(!this.f);
        this.f = true;
        q41 r0 = this.b;
        if (r0.X == false) goto L5;
    L9:
        l93.q0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        a(false);
        return;
    L5:
        if (r0.w.getThread().isAlive() == false) goto L9;
        r0.u.b(14, this).b();
    }
}
