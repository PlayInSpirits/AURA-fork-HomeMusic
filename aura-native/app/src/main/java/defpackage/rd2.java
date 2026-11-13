package defpackage;

import android.graphics.PathMeasure;
import java.util.LinkedHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class rd2 implements gf1 {
    public final /* synthetic */ int n;

    public /* synthetic */ rd2(int i) {
        this.n = i;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        switch (this.n) {
            case 0:
                wl4 wl4Var = sd2.a;
                return fz0.b0;
            case 1:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 2:
                td0 a = te5.a(q01.n);
                te5.g(a, null);
                return a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new qb3();
            case 4:
                return new oc(new PathMeasure());
            case 5:
                l90 l90Var = fg3.a;
                return null;
            case 6:
                return new w44(new LinkedHashMap());
            case 7:
                wl4 wl4Var2 = z44.a;
                return null;
            case 8:
                l90 l90Var2 = c94.a;
                return null;
            case 9:
                return Boolean.TRUE;
            default:
                return j15.a;
        }
    }
}
