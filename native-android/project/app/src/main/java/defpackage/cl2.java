package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cl2 implements xl2, qc2, rc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;

    public /* synthetic */ cl2(bm2 bm2Var, int i) {
        this.n = i;
        this.o = bm2Var;
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        bm2 bm2Var = this.o;
        switch (i2) {
            case 0:
                pu1Var.R(bm2Var.c, i);
                break;
            case 1:
            case 2:
            default:
                pu1Var.A0(bm2Var.c, i);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                pu1Var.d(bm2Var.c, i);
                break;
            case 4:
                pu1Var.q(bm2Var.c, i);
                break;
            case 5:
                pu1Var.C0(bm2Var.c, i);
                break;
            case 6:
                pu1Var.e0(bm2Var.c, i);
                break;
            case 7:
                pu1Var.a0(bm2Var.c, i);
                break;
            case 8:
                pu1Var.B(bm2Var.c, i);
                break;
            case 9:
                pu1Var.W(bm2Var.c, i);
                break;
            case 10:
                pu1Var.v0(bm2Var.c, i);
                break;
            case 11:
                pu1Var.H(bm2Var.c, i);
                break;
            case 12:
                pu1Var.y(bm2Var.c, i);
                break;
            case 13:
                cb4 cb4Var = bm2Var.n;
                cb4Var.getClass();
                int iF = cb4Var.a.f();
                mm2 mm2Var = bm2Var.c;
                if (iF < 6) {
                    pu1Var.x(mm2Var, i, 0.0f);
                } else {
                    pu1Var.k(mm2Var, i);
                }
                break;
            case 14:
                pu1Var.v(bm2Var.c, i);
                break;
            case 15:
                pu1Var.g0(bm2Var.c, i);
                break;
        }
    }

    @Override // defpackage.rc2
    public void f(Object obj, w71 w71Var) {
        ((oi3) obj).B(this.o.f1(), new ni3(w71Var));
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        bm2 bm2Var = this.o;
        oi3 oi3Var = (oi3) obj;
        switch (i) {
            case 1:
                oi3Var.O(bm2Var.z);
                break;
            default:
                oi3Var.O(bm2Var.z);
                break;
        }
    }
}
