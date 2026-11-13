package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class sk3 {
    public final rk3 a;
    public final q41 b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public sk3(q41 q41Var, rk3 rk3Var, cu4 cu4Var, int i, Looper looper) {
        this.b = q41Var;
        this.a = rk3Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        rr2.w(!this.f);
        this.f = true;
        q41 q41Var = this.b;
        if (!q41Var.X && q41Var.w.getThread().isAlive()) {
            q41Var.u.b(14, this).b();
        } else {
            l93.q0("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
