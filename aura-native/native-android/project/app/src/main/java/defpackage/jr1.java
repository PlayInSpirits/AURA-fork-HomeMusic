package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jr1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ ic2 o;

    public /* synthetic */ jr1(bl2 bl2Var, int i) {
        this.n = i;
        this.o = bl2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object s14Var;
        Object s14Var2;
        int i = this.n;
        ic2 ic2Var = this.o;
        switch (i) {
            case 0:
                try {
                    s14Var2 = (bj2) ic2Var.get();
                } catch (Throwable th) {
                    s14Var2 = new s14(th);
                }
                bj2 bj2Var = (bj2) (s14Var2 instanceof s14 ? null : s14Var2);
                if (bj2Var != null && lr1.a.get() != bj2Var) {
                    bj2Var.v(lr1.b);
                    lr1.a = new WeakReference(bj2Var);
                }
                break;
            case 1:
                try {
                    s14Var = (bj2) ic2Var.get();
                } catch (Throwable th2) {
                    s14Var = new s14(th2);
                }
                bj2 bj2Var2 = (bj2) (s14Var instanceof s14 ? null : s14Var);
                if (bj2Var2 != null) {
                    if (bj2Var2.h0() || bj2Var2.q()) {
                        bj2Var2.c();
                    }
                    break;
                }
                break;
            case 2:
                try {
                    if (ic2Var.isDone()) {
                        if (((bj2) ic2Var.get()).h0()) {
                            ((bj2) ic2Var.get()).c();
                        }
                        ((bj2) ic2Var.get()).stop();
                        ((bj2) ic2Var.get()).r();
                        try {
                            vs3 vs3Var = new vs3();
                            ExecutorService executorService = vs3.b;
                            ns3 ns3Var = vs3Var.a;
                            Objects.requireNonNull(ns3Var);
                            executorService.execute(new jq3(1, ns3Var));
                        } catch (InterruptedException e) {
                            e = e;
                        }
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    e = e2;
                }
                e.printStackTrace();
                break;
            default:
                try {
                    if (ic2Var.isDone() && ((bj2) ic2Var.get()).Q0() < 1 && !ra0.b()) {
                        try {
                            List listB = new vs3().b();
                            if (listB != null && listB.size() >= 1) {
                                ic2Var.f(new ws1(18, ic2Var, listB), gq0.n);
                                break;
                            }
                        } catch (InterruptedException e3) {
                            e = e3;
                        }
                    }
                } catch (InterruptedException | ExecutionException e4) {
                    e = e4;
                }
                e.printStackTrace();
                break;
        }
    }
}
