package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 extends k91 implements Runnable {
    public ic2 u;
    public eg1 v;

    @Override // defpackage.u0
    public final void b() {
        ic2 ic2Var = this.u;
        if ((ic2Var != null) & (this.n instanceof f0)) {
            ic2Var.cancel(p());
        }
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.u0
    public final String j() {
        String str;
        ic2 ic2Var = this.u;
        eg1 eg1Var = this.v;
        String strJ = super.j();
        if (ic2Var != null) {
            str = "inputFuture=[" + ic2Var + "], ";
        } else {
            str = "";
        }
        if (eg1Var == null) {
            if (strJ != null) {
                return str.concat(strJ);
            }
            return null;
        }
        return str + "function=[" + eg1Var + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ic2 ic2Var = this.u;
        eg1 eg1Var = this.v;
        if (((this.n instanceof f0) | (ic2Var == null)) || (eg1Var == null)) {
            return;
        }
        this.u = null;
        if (ic2Var.isCancelled()) {
            n(ic2Var);
            return;
        }
        try {
            try {
                Object objMo77apply = eg1Var.mo77apply(hw.j(ic2Var));
                this.v = null;
                l(objMo77apply);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.v = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
