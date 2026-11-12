package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bl2 o;
    public final /* synthetic */ sk2 p;

    public /* synthetic */ pk2(bl2 bl2Var, sk2 sk2Var, int i) {
        this.n = i;
        this.o = bl2Var;
        this.p = sk2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.n) {
            case 0:
                bl2 bl2Var = this.o;
                sk2 sk2Var = this.p;
                bl2Var.v = sk2Var;
                if (bl2Var.w) {
                    bl2Var.l(sk2Var);
                }
                bl2Var.f(new pk2(bl2Var, sk2Var, 1), new h41(1, bl2Var));
                break;
            default:
                bl2 bl2Var2 = this.o;
                sk2 sk2Var2 = this.p;
                if (bl2Var2.n instanceof f0) {
                    sk2Var2.Y0();
                }
                break;
        }
    }
}
