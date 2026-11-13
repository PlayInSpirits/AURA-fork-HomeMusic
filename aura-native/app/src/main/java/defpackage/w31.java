package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class w31 implements qc2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ float o;

    public /* synthetic */ w31(int i, float f) {
        this.n = i;
        this.o = f;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        int i = this.n;
        float f = this.o;
        al3 al3Var = (al3) obj;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                al3Var.e(f);
                break;
            default:
                al3Var.R(f);
                break;
        }
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        float f = this.o;
        oi3 oi3Var = (oi3) obj;
        switch (i) {
            case 0:
                oi3Var.s(f);
                break;
            case 1:
                oi3Var.s(f);
                break;
            default:
                oi3Var.s(f);
                break;
        }
    }
}
