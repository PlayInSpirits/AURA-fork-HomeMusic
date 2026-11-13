package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class bs2 implements ks2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ls2 o;

    public /* synthetic */ bs2(ls2 ls2Var, int i) {
        this.n = i;
        this.o = ls2Var;
    }

    @Override // defpackage.ks2
    public final void b(fr2 fr2Var) {
        int i = this.n;
        ls2 ls2Var = this.o;
        switch (i) {
            case 0:
                al3 al3Var = ls2Var.g.s;
                String str = f35.a;
                if (al3Var != null && al3Var.S0(1)) {
                    al3Var.c();
                    break;
                }
                break;
            case 1:
                tn2 tn2Var = ls2Var.g;
                al3 al3Var2 = tn2Var.s;
                if (!f35.d0(al3Var2, tn2Var.p)) {
                    if (al3Var2 != null && al3Var2.S0(1)) {
                        al3Var2.c();
                        break;
                    }
                } else {
                    f35.I(al3Var2);
                    break;
                }
                break;
            case 2:
                ls2Var.g.s.S();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ls2Var.g.s.A();
                break;
            case 4:
                ls2Var.g.s.J0();
                break;
            case 5:
                ls2Var.g.i(fr2Var, true);
                break;
            case 6:
                ls2Var.g.s.b();
                break;
            case 7:
                ls2Var.g.s.stop();
                break;
            case 8:
                ls2Var.g.s.H0();
                break;
            case 9:
                ls2Var.g.s.c0();
                break;
            default:
                ls2Var.g.s.I0();
                break;
        }
    }
}
