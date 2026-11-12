package defpackage;

import android.webkit.WebView;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bd1 extends v83 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd1(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.v83
    public final void a() {
        int i;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ld1 ld1Var = (ld1) obj;
                ld1Var.y(true);
                if (ld1Var.h.b) {
                    ld1Var.Q();
                    return;
                } else {
                    ld1Var.g.b().a();
                    return;
                }
            case 1:
                fo1 fo1Var = (fo1) obj;
                if (fo1Var.a) {
                    return;
                }
                co1 co1Var = (co1) fo1Var.d;
                if ((co1Var == co1.p && ((String) fo1Var.f) == null) || co1Var == co1.q) {
                    fo1Var.s(co1.o);
                    return;
                } else {
                    fo1Var.s(co1.n);
                    return;
                }
            case 2:
                ((rm3) obj).z();
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                HubFragment hubFragment = (HubFragment) obj;
                MainActivity mainActivity = hubFragment.m0;
                if (mainActivity == null) {
                    h12.Q("activity");
                    throw null;
                }
                zg5 zg5Var = mainActivity.V;
                if (zg5Var != null) {
                    au auVar = (au) zg5Var.n;
                    if (auVar.a || (i = ((BottomSheetBehavior) auVar.b).Y) == 3 || i == 2) {
                        if (mainActivity != null) {
                            mainActivity.q();
                            return;
                        } else {
                            h12.Q("activity");
                            throw null;
                        }
                    }
                }
                WebView webView = hubFragment.n0;
                if (webView != null && webView.canGoBack()) {
                    WebView webView2 = hubFragment.n0;
                    if (webView2 != null) {
                        webView2.goBack();
                        return;
                    }
                    return;
                }
                c(false);
                MainActivity mainActivity2 = hubFragment.m0;
                if (mainActivity2 != null) {
                    mainActivity2.i().b().a();
                    return;
                } else {
                    h12.Q("activity");
                    throw null;
                }
            case 4:
                ((MainActivity) obj).q();
                return;
            default:
                v23 v23Var = (v23) obj;
                if (v23Var.g.isEmpty()) {
                    return;
                }
                r23 r23VarG = v23Var.g();
                r23VarG.getClass();
                v23Var.p(r23VarG.u, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd1(MainActivity mainActivity, boolean z) {
        super(z);
        this.d = 4;
        this.e = mainActivity;
    }
}
