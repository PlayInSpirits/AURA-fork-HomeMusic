package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sf extends si0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ sf(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.si0, defpackage.u75
    public void b() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((qf) obj).o.H.setVisibility(0);
                break;
            case 1:
                bg bgVar = (bg) obj;
                bgVar.H.setVisibility(0);
                if (bgVar.H.getParent() instanceof View) {
                    View view = (View) bgVar.H.getParent();
                    WeakHashMap weakHashMap = j65.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // defpackage.u75
    public final void c() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                bg bgVar = ((qf) obj).o;
                bgVar.H.setAlpha(1.0f);
                bgVar.K.d(null);
                bgVar.K = null;
                break;
            case 1:
                bg bgVar2 = (bg) obj;
                bgVar2.H.setAlpha(1.0f);
                bgVar2.K.d(null);
                bgVar2.K = null;
                break;
            default:
                bg bgVar3 = (bg) ((rm3) obj).o;
                bgVar3.H.setVisibility(8);
                PopupWindow popupWindow = bgVar3.I;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (bgVar3.H.getParent() instanceof View) {
                    View view = (View) bgVar3.H.getParent();
                    WeakHashMap weakHashMap = j65.a;
                    view.requestApplyInsets();
                }
                bgVar3.H.e();
                bgVar3.K.d(null);
                bgVar3.K = null;
                ViewGroup viewGroup = bgVar3.N;
                WeakHashMap weakHashMap2 = j65.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
