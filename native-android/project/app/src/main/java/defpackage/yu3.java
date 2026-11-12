package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yu3 implements Runnable {
    public final ky n;
    public volatile AtomicInteger o = new AtomicInteger(0);
    public final /* synthetic */ bv3 p;

    public yu3(bv3 bv3Var, ky kyVar) {
        this.p = bv3Var;
        this.n = kyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o83 o83Var;
        String strConcat = "OkHttp ".concat(this.p.o.a.i());
        bv3 bv3Var = this.p;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            bv3Var.q.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.n.onResponse(bv3Var, bv3Var.e());
                        o83Var = bv3Var.n;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            qg3 qg3Var = qg3.a;
                            qg3 qg3Var2 = qg3.a;
                            String strConcat2 = "Callback failure for ".concat(bv3.a(bv3Var));
                            qg3Var2.getClass();
                            qg3.i(strConcat2, 4, e);
                        } else {
                            this.n.onFailure(bv3Var, e);
                        }
                        o83Var = bv3Var.n;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        bv3Var.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            j51.d(iOException, th);
                            this.n.onFailure(bv3Var, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    bv3Var.n.a.q(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            o83Var.a.q(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
