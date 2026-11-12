package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ KeyEvent.Callback o;

    public fe0(tj4 tj4Var, df dfVar) {
        this.o = dfVar;
    }

    private final void a(View view, View view2) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        int i = this.n;
        KeyEvent.Callback callback = this.o;
        switch (i) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) callback).C;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
                break;
            default:
                if (go2.x(view2)) {
                    SplashScreenView splashScreenViewJ = go2.j(view2);
                    splashScreenViewJ.getClass();
                    WindowInsets windowInsetsBuild = ek2.k().build();
                    windowInsetsBuild.getClass();
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    if (windowInsetsBuild == splashScreenViewJ.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                        rect.isEmpty();
                    }
                    ((ViewGroup) ((df) callback).getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
                break;
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.n) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.o;
                coordinatorLayout.q(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.C;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
                break;
        }
    }

    public fe0(CoordinatorLayout coordinatorLayout) {
        this.o = coordinatorLayout;
    }
}
