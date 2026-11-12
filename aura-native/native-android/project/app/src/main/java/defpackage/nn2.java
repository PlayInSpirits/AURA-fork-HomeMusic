package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ lb4 o;
    public final /* synthetic */ uj2 p;

    public /* synthetic */ nn2(lb4 lb4Var, uj2 uj2Var, int i) {
        this.n = i;
        this.o = lb4Var;
        this.p = uj2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        uj2 uj2Var = this.p;
        lb4 lb4Var = this.o;
        switch (i) {
            case 0:
                try {
                    uj2Var.f((ij2) lb4Var.get());
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    l93.r0("MLSLegacyStub", "Library operation failed", e);
                    uj2Var.f(null);
                }
                break;
            default:
                try {
                    List list = (List) lb4Var.get();
                    uj2Var.f(list == null ? null : ju2.g(list));
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    l93.r0("MLSLegacyStub", "Library operation failed", e2);
                    uj2Var.f(null);
                    return;
                }
                break;
        }
    }
}
