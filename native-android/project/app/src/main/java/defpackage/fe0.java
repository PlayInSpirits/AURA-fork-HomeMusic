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
    public final /* synthetic */ int n;
    public final /* synthetic */ KeyEvent.Callback o;

    public fe0(tj4 r1, df r2) {
        this.n = 1;
        this.o = r2;
    }

    private final void a(View r1, View r2) {
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r4, View r5) {
        int r0 = this.n;
        KeyEvent.Callback r3 = this.o;
        switch(r0) {
            case 0: goto L11;
            default: goto L5;
        };
    L11:
        ViewGroup.OnHierarchyChangeListener r6 = ((CoordinatorLayout) r3).C;
        if (r6 == null) goto L16;
        r6.onChildViewAdded(r4, r5);
        return;
    L16:
        return;
    L5:
        if (go2.x(r5) == false) goto L15;
        SplashScreenView r7 = go2.j(r5);
        r7.getClass();
        WindowInsets r8 = ek2.l(ek2.k());
        r8.getClass();
        Rect r1 = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (r8 != go2.i(r7).computeSystemWindowInsets(r8, r1)) goto L9;
        r1.isEmpty();
    L9:
        ((ViewGroup) ((df) r3).getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        return;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r2, View r3) {
        switch(this.n) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        CoordinatorLayout r1 = (CoordinatorLayout) this.o;
        r1.q(2);
        ViewGroup.OnHierarchyChangeListener r4 = r1.C;
        if (r4 == null) goto L9;
        r4.onChildViewRemoved(r2, r3);
        return;
    }

    public fe0(CoordinatorLayout r2) {
        this.n = 0;
        this.o = r2;
    }
}
