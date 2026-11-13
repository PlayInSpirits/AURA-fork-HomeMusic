package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class u31 implements rc2, qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ i41 o;

    public /* synthetic */ u31(i41 i41Var, int i) {
        this.n = i;
        this.o = i41Var;
    }

    @Override // defpackage.rc2
    public void f(Object obj, w71 w71Var) {
        ((oi3) obj).B(this.o.g, new ni3(w71Var));
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        i41 i41Var = this.o;
        oi3 oi3Var = (oi3) obj;
        switch (i) {
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                oi3Var.O(i41Var.R);
                break;
            default:
                oi3Var.G(i41Var.T);
                break;
        }
    }
}
