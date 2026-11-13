package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ul implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;

    public /* synthetic */ ul(q41 q41Var, int i, boolean z) {
        this.n = 3;
        this.p = q41Var;
        this.o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = 1;
        int i3 = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                ((vl) obj).b.onAudioFocusChange(i3);
                break;
            case 1:
                qm qmVar = (qm) ((xc5) obj).p;
                String str = f35.a;
                qmVar.b(i3);
                break;
            case 2:
                ((ft0) obj).n.d(i3, 1, null);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                q41 q41Var = (q41) obj;
                nj0 nj0Var = q41Var.K;
                int i4 = ((kq) q41Var.n[i3].e).o;
                nj0Var.b0(nj0Var.a0(), 1033, new oi0(13));
                break;
            case 4:
                bm2 bm2Var = (bm2) obj;
                qi qiVar = bm2Var.k;
                qiVar.remove(Integer.valueOf(i3));
                bm2Var.l.delete(i3);
                cb4 cb4Var = bm2Var.n;
                if (cb4Var != null && cb4Var.a.f() < 5 && qiVar.isEmpty()) {
                    bm2Var.m.postDelayed(new sl2(bm2Var, i2), 500L);
                    break;
                }
                break;
            case 5:
                ((au0) obj).M(i3);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.C.get();
                if (view != null) {
                    sideSheetBehavior.z(view, i3, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ul(int i, int i2, Object obj) {
        this.n = i2;
        this.p = obj;
        this.o = i;
    }
}
