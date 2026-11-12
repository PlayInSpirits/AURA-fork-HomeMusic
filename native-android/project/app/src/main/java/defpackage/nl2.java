package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nl2 implements xl2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public /* synthetic */ nl2(bm2 bm2Var, int i, int i2, int i3) {
        this.n = i3;
        this.o = bm2Var;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.xl2
    public final void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        int i3 = this.q;
        int i4 = this.p;
        bm2 bm2Var = this.o;
        switch (i2) {
            case 0:
                pu1Var.M(bm2Var.c, i, i4, i3);
                break;
            case 1:
                pu1Var.t(bm2Var.c, i, i4, i3);
                break;
            default:
                pu1Var.F0(bm2Var.c, i, i4, i3);
                break;
        }
    }
}
