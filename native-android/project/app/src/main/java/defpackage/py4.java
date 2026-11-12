package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class py4 extends k91 implements RunnableFuture {
    public volatile oy4 u;

    public py4(Callable callable) {
        this.u = new oy4(this, callable);
    }

    @Override // defpackage.u0
    public final void b() {
        oy4 oy4Var;
        if (p() && (oy4Var = this.u) != null) {
            oy4Var.c();
        }
        this.u = null;
    }

    @Override // defpackage.u0
    public final String j() {
        oy4 oy4Var = this.u;
        if (oy4Var == null) {
            return super.j();
        }
        return "task=[" + oy4Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        oy4 oy4Var = this.u;
        if (oy4Var != null) {
            oy4Var.run();
        }
        this.u = null;
    }
}
