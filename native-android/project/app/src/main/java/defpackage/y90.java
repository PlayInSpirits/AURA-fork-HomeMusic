package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y90 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;
    public final /* synthetic */ fr2 p;

    public /* synthetic */ y90(tn2 tn2Var, fr2 fr2Var, int i) {
        this.n = i;
        this.o = tn2Var;
        this.p = fr2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        fr2 fr2Var = this.p;
        tn2 tn2Var = this.o;
        switch (i) {
            case 0:
                if (!tn2Var.l()) {
                    nl1 nl1Var = tn2Var.F;
                    er2 er2Var = fr2Var.d;
                    er2Var.getClass();
                    o15 it = jx1.k(nl1Var.l(er2Var)).iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        er2 er2Var2 = fr2Var.d;
                        er2Var2.getClass();
                        tn2Var.E.remove(str, fr2Var);
                        nl1Var.remove(er2Var2, str);
                    }
                    if (tn2Var.y) {
                        if (!tn2.m(fr2Var)) {
                            if (tn2Var.k(fr2Var)) {
                                tn2Var.y = false;
                            }
                        }
                    }
                    tn2Var.e.getClass();
                    break;
                }
                break;
            case 1:
                tn2Var.g.O0(fr2Var, Integer.MIN_VALUE, 1, kt2.Q0(new zr2(2)));
                break;
            case 2:
                tn2Var.g.O0(fr2Var, Integer.MIN_VALUE, 9, kt2.Q0(new zr2(10)));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                tn2Var.g.O0(fr2Var, Integer.MIN_VALUE, 7, kt2.Q0(new zr2(6)));
                break;
            case 4:
                tn2Var.g.O0(fr2Var, Integer.MIN_VALUE, 12, kt2.Q0(new zr2(9)));
                break;
            case 5:
                tn2Var.g.O0(fr2Var, Integer.MIN_VALUE, 11, kt2.Q0(new zr2(5)));
                break;
            case 6:
                tn2Var.g.O0(fr2Var, Integer.MIN_VALUE, 3, kt2.Q0(new zr2(14)));
                break;
            case 7:
                tn2Var.g.O0(fr2Var, Integer.MIN_VALUE, 1, kt2.Q0(new zr2(2)));
                break;
            case 8:
                tn2Var.g.M0(fr2Var, Integer.MIN_VALUE);
                break;
            default:
                tn2Var.g.M0(fr2Var, Integer.MIN_VALUE);
                break;
        }
    }
}
