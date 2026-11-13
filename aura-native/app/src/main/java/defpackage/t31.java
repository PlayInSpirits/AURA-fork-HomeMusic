package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class t31 implements qc2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;

    public /* synthetic */ t31(int i, boolean z) {
        this.n = i;
        this.o = z;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        int i = this.n;
        boolean z = this.o;
        al3 al3Var = (al3) obj;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                al3Var.V(z);
                break;
            case 4:
                al3Var.q0(z);
                break;
            default:
                al3Var.s(z);
                break;
        }
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        boolean z = this.o;
        oi3 oi3Var = (oi3) obj;
        switch (i) {
            case 0:
                oi3Var.x(z);
                break;
            case 1:
                oi3Var.d(z);
                break;
            default:
                oi3Var.x(z);
                break;
        }
    }
}
