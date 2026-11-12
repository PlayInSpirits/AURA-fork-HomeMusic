package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends k91 implements Runnable {
    public ic2 u;
    public eg1 v;

    @Override // defpackage.u0
    public final void b() {
        ic2 r0 = this.u;
        if (r0 == null) goto L5;
        boolean r1 = true;
    L7:
        if ((r1 & (this.n instanceof f0)) == false) goto L9;
        r0.cancel(p());
    L9:
        this.u = null;
        this.v = null;
        return;
    L5:
        r1 = false;
        goto L7
    }

    @Override // defpackage.u0
    public final String j() {
        ic2 r0 = this.u;
        eg1 r1 = this.v;
        String r4 = super.j();
        if (r0 == null) goto L5;
        String r2 = "inputFuture=[" + r0 + "], ";
    L6:
        if (r1 != null) goto L8;
        if (r4 != null) goto L11;
        return null;
    L11:
        return r2.concat(r4);
    L8:
        return r2 + "function=[" + r1 + "]";
    L5:
        r2 = "";
        goto L6
    }

    @Override // java.lang.Runnable
    public final void run() {
        ic2 r0 = this.u;
        eg1 r1 = this.v;
        boolean r2 = this.n instanceof f0;
        boolean r3 = true;
        if (r0 != null) goto L5;
        boolean r5 = true;
    L6:
        boolean r4 = r2 | r5;
        if (r1 == null) goto L11;
        r3 = false;
    L11:
        if ((r4 | r3) == false) goto L13;
        return;
    L13:
        this.u = null;
        if (r0.isCancelled() == false) goto L46;
        n(r0);
        return;
    L46:
        Object r6 = r1.mo77apply(hw.j(r0));     // Catch: Throwable -> L21
        this.v = null;
        l(r6);
        return;
    L21:
        th = move-exception;
    L28:
        th = move-exception;
        this.v = null;
        throw th;
    L23:
        if ((th instanceof InterruptedException) == false) goto L25;
        Thread.currentThread().interrupt();     // Catch: Throwable -> L28
    L25:
        m(th);     // Catch: Throwable -> L28
        this.v = null;
        return;
    L31:
        e = move-exception;
        m(e);
        return;
    L40:
        cancel(false);
        return;
    L37:
        e = move-exception;
        m(e.getCause());
        return;
    L34:
        e = move-exception;
        m(e);
        return;
    L5:
        r5 = false;
        goto L6
    }
}
