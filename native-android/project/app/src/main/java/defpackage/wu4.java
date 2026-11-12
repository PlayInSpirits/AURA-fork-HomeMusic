package defpackage;

import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wu4 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ wu4(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 4;
        switch (this.n) {
            case 0:
                ((Toolbar) this.o).v();
                return;
            case 1:
                cv4 cv4Var = (cv4) this.o;
                Window.Callback callback = cv4Var.e;
                Menu menuU0 = cv4Var.u0();
                qu2 qu2Var = menuU0 instanceof qu2 ? (qu2) menuU0 : null;
                if (qu2Var != null) {
                    qu2Var.y();
                }
                try {
                    menuU0.clear();
                    if (!callback.onCreatePanelMenu(0, menuU0) || !callback.onPreparePanel(0, null, menuU0)) {
                        menuU0.clear();
                    }
                    if (qu2Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (qu2Var != null) {
                        qu2Var.x();
                    }
                }
                break;
            case 2:
                if (((q25) this.o).C || !((q25) this.o).M) {
                    return;
                }
                q25 q25Var = (q25) this.o;
                q25Var.l.execute(new o25(q25Var, i));
                Handler handler = ((q25) this.o).n;
                Set set = q25.Q;
                handler.postDelayed(this, 2000L);
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (((s25) this.o).A) {
                    if (!((s25) this.o).C && !((s25) this.o).x.isShutdown()) {
                        ((s25) this.o).C = true;
                        s25 s25Var = (s25) this.o;
                        s25Var.x.execute(new r25(s25Var, 1));
                    }
                    s25 s25Var2 = (s25) this.o;
                    s25Var2.y.postDelayed(this, s25Var2.B ? s25.F : s25.G);
                    return;
                }
                return;
            case 4:
                ((o65) this.o).p(0);
                return;
            case 5:
                ((gf5) this.o).e();
                return;
            case 6:
                me meVar = ((gf5) ((h45) this.o).o).f;
                meVar.a0(meVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            default:
                ((rf5) this.o).l.a(new ka0(4));
                return;
        }
    }
}
