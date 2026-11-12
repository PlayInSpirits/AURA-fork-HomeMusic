package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rn2 implements Executor {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;

    public /* synthetic */ rn2(tn2 tn2Var, int i) {
        this.n = i;
        this.o = tn2Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.n;
        tn2 tn2Var = this.o;
        switch (i) {
            case 0:
                tn2.b(tn2Var, runnable);
                break;
            case 1:
                f35.W(tn2Var.l, runnable);
                break;
            default:
                f35.W(tn2Var.l, runnable);
                break;
        }
    }
}
