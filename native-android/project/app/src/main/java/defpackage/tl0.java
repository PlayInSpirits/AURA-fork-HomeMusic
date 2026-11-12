package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tl0 implements w92 {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public tl0(aa2 aa2Var) {
        this.n = 5;
        this.o = aa2Var;
        l30 l30Var = l30.c;
        Class<?> cls = aa2Var.getClass();
        j30 j30Var = (j30) l30Var.a.get(cls);
        this.p = j30Var == null ? l30Var.a(cls, null) : j30Var;
    }

    @Override // defpackage.w92
    public final void b(ba2 ba2Var, q92 q92Var) {
        int i = this.n;
        Object obj = this.o;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                rl0 rl0Var = (rl0) obj;
                switch (sl0.a[q92Var.ordinal()]) {
                    case 1:
                        rl0Var.getClass();
                        break;
                    case 2:
                        rl0Var.onStart(ba2Var);
                        break;
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                        rl0Var.j(ba2Var);
                        break;
                    case 4:
                        rl0Var.getClass();
                        break;
                    case 5:
                        rl0Var.onStop(ba2Var);
                        break;
                    case 6:
                        rl0Var.onDestroy(ba2Var);
                        break;
                    case 7:
                        kf2.n("ON_ANY must not been send by anybody");
                        break;
                    default:
                        er1.n();
                        break;
                }
                w92 w92Var = (w92) obj2;
                if (w92Var != null) {
                    w92Var.b(ba2Var, q92Var);
                }
                break;
            case 1:
                ke1 ke1Var = (ke1) obj;
                ee1 ee1Var = (ee1) obj2;
                if (!ee1Var.r.N()) {
                    ba2Var.h().f(this);
                    FrameLayout frameLayout = (FrameLayout) ke1Var.a;
                    WeakHashMap weakHashMap = j65.a;
                    if (frameLayout.isAttachedToWindow()) {
                        ee1Var.u(ke1Var);
                    }
                    break;
                }
                break;
            case 2:
                if (q92Var == q92.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((g5) obj2);
                    ba2Var.h().f(this);
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (q92Var == q92.ON_START) {
                    ((ea2) obj).f(this);
                    ((rm3) obj2).P();
                }
                break;
            case 4:
                u83 u83Var = (u83) obj;
                int i2 = z83.a[q92Var.ordinal()];
                if (i2 == 1) {
                    u83Var.b(true);
                    break;
                } else if (i2 == 2) {
                    u83Var.b(false);
                    break;
                } else if (i2 == 3) {
                    u83Var.a();
                    ((ea2) obj2).f(this);
                    break;
                }
                break;
            default:
                HashMap map = ((j30) obj2).a;
                j30.a((List) map.get(q92Var), ba2Var, q92Var, obj);
                j30.a((List) map.get(q92.ON_ANY), ba2Var, q92Var, obj);
                break;
        }
    }

    public tl0(rl0 rl0Var, w92 w92Var) {
        this.n = 0;
        rl0Var.getClass();
        this.o = rl0Var;
        this.p = w92Var;
    }

    public /* synthetic */ tl0(int i, Object obj, Object obj2) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
    }

    public tl0(u83 u83Var, a93 a93Var, ea2 ea2Var) {
        this.n = 4;
        this.o = u83Var;
        this.p = ea2Var;
    }

    public tl0(ee1 ee1Var, ke1 ke1Var) {
        this.n = 1;
        this.p = ee1Var;
        this.o = ke1Var;
    }
}
