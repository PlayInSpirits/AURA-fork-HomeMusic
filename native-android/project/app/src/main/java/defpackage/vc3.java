package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vc3 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ad3 o;

    public /* synthetic */ vc3(ad3 ad3Var, int i) {
        this.n = i;
        this.o = ad3Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int iK;
        int iJ;
        int i = this.n;
        ad3 ad3Var = this.o;
        switch (i) {
            case 0:
                boolean zA = ad3Var.k.a();
                wd3 wd3Var = ad3Var.q;
                if (!zA) {
                    iK = ad3Var.k();
                } else if (wd3Var.g() != -1) {
                    iK = wd3Var.g();
                } else {
                    float fAbs = Math.abs(ad3Var.l());
                    oo0 oo0Var = ad3Var.n;
                    dd3 dd3Var = ed3.a;
                    if (fAbs >= Math.abs(Math.min(oo0Var.M(56.0f), ad3Var.o() / 2.0f) / ad3Var.o())) {
                        boolean zBooleanValue = ((Boolean) ad3Var.E.getValue()).booleanValue();
                        int i2 = ad3Var.e;
                        iK = zBooleanValue ? i2 + 1 : i2;
                    } else {
                        iK = ad3Var.k();
                    }
                }
                iJ = ad3Var.j(iK);
                break;
            default:
                iJ = ad3Var.n();
                break;
        }
        return Integer.valueOf(iJ);
    }
}
