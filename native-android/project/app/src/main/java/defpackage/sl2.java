package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;

    public /* synthetic */ sl2(bm2 bm2Var, int i) {
        this.n = i;
        this.o = bm2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        bm2 bm2Var = this.o;
        switch (i) {
            case 0:
                yl2 yl2Var = bm2Var.o;
                if (yl2Var != null) {
                    bm2Var.d.unbindService(yl2Var);
                    bm2Var.o = null;
                }
                bm2Var.c.e.clear();
                break;
            default:
                lk3 lk3Var = bm2Var.H;
                if (lk3Var != null) {
                    bm2Var.o1(lk3Var, jk3.c);
                }
                break;
        }
    }
}
