package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ga5 extends si0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ia5 h;

    public /* synthetic */ ga5(ia5 ia5Var, int i) {
        this.g = i;
        this.h = ia5Var;
    }

    @Override // defpackage.u75
    public final void c() {
        View view;
        int i = this.g;
        ia5 ia5Var = this.h;
        switch (i) {
            case 0:
                if (ia5Var.r && (view = ia5Var.j) != null) {
                    view.setTranslationY(0.0f);
                    ia5Var.g.setTranslationY(0.0f);
                }
                ia5Var.g.setVisibility(8);
                ia5Var.g.setTransitioning(false);
                ia5Var.v = null;
                rm3 rm3Var = ia5Var.n;
                if (rm3Var != null) {
                    rm3Var.H(ia5Var.m);
                    ia5Var.m = null;
                    ia5Var.n = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = ia5Var.f;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = j65.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                ia5Var.v = null;
                ia5Var.g.requestLayout();
                break;
        }
    }
}
