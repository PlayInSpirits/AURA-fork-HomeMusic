package defpackage;

import java.util.concurrent.ExecutionException;
import kotlin.KotlinNullPointerException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nu4 implements Runnable {
    public final /* synthetic */ int n;
    public final ic2 o;
    public final cz p;

    public /* synthetic */ nu4(ic2 ic2Var, cz czVar, int i) {
        this.n = i;
        this.o = ic2Var;
        this.p = czVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        cz czVar = this.p;
        ic2 ic2Var = this.o;
        switch (i) {
            case 0:
                if (ic2Var.isCancelled()) {
                    czVar.r(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = ic2Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            czVar.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            czVar.resumeWith(new s14(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (ic2Var.isCancelled()) {
                    czVar.r(null);
                    return;
                }
                try {
                    czVar.resumeWith(g2.e(ic2Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        czVar.resumeWith(new s14(cause2));
                        return;
                    } else {
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                        h12.M(kotlinNullPointerException, h12.class.getName());
                        throw kotlinNullPointerException;
                    }
                }
        }
    }
}
