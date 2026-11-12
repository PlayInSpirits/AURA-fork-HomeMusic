package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ lb4 o;
    public final /* synthetic */ ic2 p;

    public /* synthetic */ mn2(lb4 lb4Var, ic2 ic2Var, int i) {
        this.n = i;
        this.o = lb4Var;
        this.p = ic2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                lb4 lb4Var = this.o;
                ic2 ic2Var = this.p;
                if (lb4Var.n instanceof f0) {
                    ic2Var.cancel(false);
                }
                break;
            default:
                lb4 lb4Var2 = this.o;
                ic2 ic2Var2 = this.p;
                if (lb4Var2.n instanceof f0) {
                    ic2Var2.cancel(false);
                }
                break;
        }
    }
}
