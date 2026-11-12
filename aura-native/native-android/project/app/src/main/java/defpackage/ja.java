package defpackage;

import android.os.Handler;
import android.os.Looper;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ra o;

    public /* synthetic */ ja(ra raVar, int i) {
        this.n = i;
        this.o = raVar;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        ra raVar = this.o;
        switch (i) {
            case 0:
                gf1 gf1Var = (gf1) obj;
                Handler handler = raVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    gf1Var.invoke();
                } else {
                    Handler handler2 = raVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new ga(0, gf1Var));
                    }
                }
                return j15Var;
            case 1:
                u91 focusOwner = raVar.getFocusOwner();
                int i2 = ((o91) obj).a;
                ey eyVar = (ey) focusOwner;
                ra raVar2 = (ra) eyVar.a;
                jx3 jx3Var = new jx3();
                jx3Var.n = Boolean.FALSE;
                ba1 ba1VarF = eyVar.f();
                Boolean boolE = eyVar.e(i2, raVar2.getEmbeddedViewFocusRect(), new v91(i2, jx3Var));
                if ((!h12.c(boolE, Boolean.TRUE) || ba1VarF == eyVar.f()) && boolE != null && jx3Var.n != null && boolE.booleanValue()) {
                    ((Boolean) jx3Var.n).getClass();
                }
                return j15Var;
            case 2:
                return raVar.getSavedStateRegistry();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Boolean.valueOf(raVar.getScrollCaptureInProgress());
            case 4:
                return raVar.getInputModeManager();
            case 5:
                return raVar.getTextInputService();
            case 6:
                return raVar.getSoftwareKeyboardController();
            case 7:
                return raVar.getTextToolbar();
            default:
                return raVar.getPointerIconService();
        }
    }
}
