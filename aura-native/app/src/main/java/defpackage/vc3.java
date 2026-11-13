package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class vc3 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ad3 o;

    public /* synthetic */ vc3(ad3 ad3Var, int i) {
        this.n = i;
        this.o = ad3Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int k;
        int j;
        int i = this.n;
        ad3 ad3Var = this.o;
        switch (i) {
            case 0:
                boolean a = ad3Var.k.a();
                wd3 wd3Var = ad3Var.q;
                if (!a) {
                    k = ad3Var.k();
                } else if (wd3Var.g() != -1) {
                    k = wd3Var.g();
                } else {
                    float abs = Math.abs(ad3Var.l());
                    oo0 oo0Var = ad3Var.n;
                    dd3 dd3Var = ed3.a;
                    if (abs >= Math.abs(Math.min(oo0Var.M(56.0f), ad3Var.o() / 2.0f) / ad3Var.o())) {
                        boolean booleanValue = ((Boolean) ad3Var.E.getValue()).booleanValue();
                        int i2 = ad3Var.e;
                        k = booleanValue ? i2 + 1 : i2;
                    } else {
                        k = ad3Var.k();
                    }
                }
                j = ad3Var.j(k);
                break;
            default:
                j = ad3Var.n();
                break;
        }
        return Integer.valueOf(j);
    }
}
