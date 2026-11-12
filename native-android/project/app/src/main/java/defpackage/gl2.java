package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gl2 implements xl2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ gn2 p;

    public /* synthetic */ gl2(bm2 bm2Var, gn2 gn2Var, int i) {
        this.n = i;
        this.o = bm2Var;
        this.p = gn2Var;
    }

    @Override // defpackage.xl2
    public final void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        gn2 gn2Var = this.p;
        bm2 bm2Var = this.o;
        switch (i2) {
            case 0:
                pu1Var.o0(bm2Var.c, i, gn2Var.c(true), true);
                break;
            case 1:
                pu1Var.i0(bm2Var.c, i, gn2Var.c(true));
                break;
            default:
                pu1Var.G(bm2Var.c, i, gn2Var.c(true));
                break;
        }
    }
}
