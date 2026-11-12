package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class py4 extends k91 implements RunnableFuture {
    public volatile oy4 u;

    public py4(Callable r2) {
        this.u = new oy4(this, r2);
    }

    @Override // defpackage.u0
    public final void b() {
        if (p() == false) goto L7;
        oy4 r0 = this.u;
        if (r0 == null) goto L7;
        r0.c();
    L7:
        this.u = null;
    }

    @Override // defpackage.u0
    public final String j() {
        oy4 r0 = this.u;
        if (r0 == null) goto L7;
        return "task=[" + r0 + "]";
    L7:
        return super.j();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        oy4 r0 = this.u;
        if (r0 == null) goto L5;
        r0.run();
    L5:
        this.u = null;
    }
}
