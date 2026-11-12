package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g60 extends n6 {
    public static final y82 A = new y82(g60.class);
    public rw1 y;
    public f60 z;

    public g60(yw1 yw1Var, zq0 zq0Var) {
        int size = yw1Var.size();
        Object obj = null;
        this.u = null;
        this.v = size;
        this.y = yw1Var;
        this.z = new f60(this, zq0Var);
        gq0 gq0Var = gq0.n;
        Objects.requireNonNull(this.y);
        if (!this.y.isEmpty()) {
            k6 k6Var = new k6(0, this, obj);
            o15 it = this.y.iterator();
            while (it.hasNext()) {
                ic2 ic2Var = (ic2) it.next();
                if (ic2Var.isDone()) {
                    q(null);
                } else {
                    ic2Var.f(k6Var, gq0Var);
                }
            }
            return;
        }
        f60 f60Var = this.z;
        if (f60Var != null) {
            try {
                f60Var.p.getClass();
                f60Var.run();
            } catch (RejectedExecutionException e) {
                f60Var.q.m(e);
            }
        }
    }

    @Override // defpackage.u0
    public final void b() {
        rw1 rw1Var = this.y;
        this.y = null;
        this.z = null;
        if ((this.n instanceof f0) && (rw1Var != null)) {
            boolean zP = p();
            o15 it = rw1Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zP);
            }
        }
    }

    @Override // defpackage.u0
    public final void i() {
        f60 f60Var = this.z;
        if (f60Var != null) {
            f60Var.c();
        }
    }

    @Override // defpackage.u0
    public final String j() {
        rw1 rw1Var = this.y;
        if (rw1Var == null) {
            return super.j();
        }
        return "futures=" + rw1Var;
    }

    public final void q(rw1 rw1Var) {
        int iL = n6.w.l(this);
        rr2.v("Less than 0 remaining futures", iL >= 0);
        if (iL == 0) {
            if (rw1Var != null) {
                o15 it = rw1Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e) {
                                r(e.getCause());
                            } catch (Throwable th2) {
                                r(th2);
                            }
                        }
                    }
                }
            }
            this.u = null;
            f60 f60Var = this.z;
            if (f60Var != null) {
                try {
                    f60Var.p.getClass();
                    f60Var.run();
                } catch (RejectedExecutionException e2) {
                    f60Var.q.m(e2);
                }
            }
            this.y = null;
        }
    }

    public final void r(Throwable th) {
        th.getClass();
        if (th instanceof Error) {
            A.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }
}
