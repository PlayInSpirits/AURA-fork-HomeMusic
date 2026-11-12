package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class id5 implements Runnable {
    public final jd5 n;
    public final rc5 o;

    public id5(jd5 jd5Var, rc5 rc5Var) {
        this.n = jd5Var;
        this.o = rc5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.n.d) {
            try {
                if (((id5) this.n.b.remove(this.o)) != null) {
                    co0 co0Var = (co0) this.n.c.remove(this.o);
                    if (co0Var != null) {
                        rc5 rc5Var = this.o;
                        cx.f().b(co0.B, "Exceeded time limits on execution for " + rc5Var);
                        co0Var.u.execute(new bo0(co0Var, 0));
                    }
                } else {
                    cx.f().b("WrkTimerRunnable", "Timer with " + this.o + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
