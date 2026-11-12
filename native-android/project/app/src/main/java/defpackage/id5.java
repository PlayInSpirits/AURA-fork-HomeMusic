package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class id5 implements Runnable {
    public final jd5 n;
    public final rc5 o;

    public id5(jd5 r1, rc5 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object r1 = this.n.d;
        monitor-enter(r1);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (((id5) this.n.b.remove(this.o)) == null) goto L11;
        co0 r0 = (co0) this.n.c.remove(this.o);     // Catch: Throwable -> L9
        if (r0 == null) goto L12;
        rc5 r6 = this.o;     // Catch: Throwable -> L9
        cx.f().b(co0.B, "Exceeded time limits on execution for " + r6);     // Catch: Throwable -> L9
        r0.u.execute(new bo0(r0, 0));     // Catch: Throwable -> L9
    L12:
        monitor-exit(r1);     // Catch: Throwable -> L9
        return;
    L11:
        cx.f().b("WrkTimerRunnable", "Timer with " + this.o + " is already marked as complete.");     // Catch: Throwable -> L9
        goto L12
    }
}
