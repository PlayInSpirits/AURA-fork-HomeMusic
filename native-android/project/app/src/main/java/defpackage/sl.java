package defpackage;

import android.content.Context;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ sl(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.go4
    public final Object get() {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                return xl.n((Context) obj);
            case 1:
                try {
                    return (lt2) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 2:
                return (os3) obj;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return (my0) obj;
            case 4:
                return (zp) obj;
            default:
                pe4 pe4Var = (pe4) obj;
                oe4 oe4VarA = pe4Var.a();
                oe4VarA.f = null;
                oe4VarA.d = pe4Var.w.p() ? 4 : 2;
                return new pe4(oe4VarA);
        }
    }
}
