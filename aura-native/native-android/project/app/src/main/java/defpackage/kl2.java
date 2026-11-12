package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl2 implements xl2, qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ int p;

    public /* synthetic */ kl2(bm2 bm2Var, int i, int i2) {
        this.n = i2;
        this.o = bm2Var;
        this.p = i;
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        int i3 = this.p;
        bm2 bm2Var = this.o;
        switch (i2) {
            case 0:
                pu1Var.D0(bm2Var.c, i, i3);
                break;
            case 1:
                pu1Var.K(bm2Var.c, i, i3);
                break;
            case 5:
                pu1Var.F(bm2Var.c, i, i3);
                break;
            case 7:
                pu1Var.q0(bm2Var.c, i, i3);
                break;
            case 10:
                pu1Var.f0(bm2Var.c, i, i3);
                break;
            default:
                pu1Var.N(bm2Var.c, i, i3);
                break;
        }
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        int i2 = this.p;
        bm2 bm2Var = this.o;
        oi3 oi3Var = (oi3) obj;
        switch (i) {
            case 2:
                oi3Var.C(i2, bm2Var.q.u);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                oi3Var.C(i2, bm2Var.q.u);
                break;
            case 4:
                oi3Var.C(i2, bm2Var.q.u);
                break;
            case 5:
            case 7:
            default:
                oi3Var.C(i2, bm2Var.q.u);
                break;
            case 6:
                oi3Var.C(i2, bm2Var.q.u);
                break;
            case 8:
                oi3Var.C(i2, bm2Var.q.u);
                break;
        }
    }
}
