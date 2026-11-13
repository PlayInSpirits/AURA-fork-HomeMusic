package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class la implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ jg3 o;

    public /* synthetic */ la(jg3 jg3Var, int i) {
        this.n = i;
        this.o = jg3Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        jg3 jg3Var = this.o;
        ig3 ig3Var = (ig3) obj;
        switch (i) {
            case 0:
                ig3.f(ig3Var, jg3Var, 0, 0);
                break;
            case 1:
                ig3.k(ig3Var, jg3Var);
                break;
            case 2:
                ig3.f(ig3Var, jg3Var, 0, 0);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ig3.k(ig3Var, jg3Var);
                break;
            case 4:
                ig3.n(ig3Var, jg3Var);
                break;
            case 5:
                ig3.k(ig3Var, jg3Var);
                break;
            default:
                ig3.f(ig3Var, jg3Var, 0, 0);
                break;
        }
        return j15Var;
    }
}
