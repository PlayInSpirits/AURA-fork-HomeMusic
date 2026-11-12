package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ud5 {
    public static final String a = cx.i("WorkerWrapper");

    public static final Object a(ic2 ic2Var, oc2 oc2Var, ep4 ep4Var) {
        Object obj;
        try {
            int i = 0;
            if (!ic2Var.isDone()) {
                cz czVar = new cz(1, ya4.x(ep4Var));
                czVar.u();
                ic2Var.f(new nu4(ic2Var, czVar, i), fq0.n);
                czVar.w(new br0(4, oc2Var, ic2Var));
                return czVar.q();
            }
            while (true) {
                try {
                    obj = ic2Var.get();
                    break;
                } catch (InterruptedException unused) {
                    i = 1;
                } catch (Throwable th) {
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (i != 0) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
