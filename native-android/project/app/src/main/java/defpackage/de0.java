package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class de0 {
    public boolean e(View r1, Rect r2) {
        return false;
    }

    public boolean f(View r1, View r2) {
        return false;
    }

    public void g(ge0 r1) {
    }

    public boolean h(CoordinatorLayout r1, View r2, View r3) {
        return false;
    }

    public void i(CoordinatorLayout r1, View r2) {
    }

    public void j() {
    }

    public boolean k(CoordinatorLayout r1, View r2, MotionEvent r3) {
        return false;
    }

    public boolean l(CoordinatorLayout r1, View r2, int r3) {
        return false;
    }

    public boolean m(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        return false;
    }

    public boolean n(View r1) {
        return false;
    }

    public void o(CoordinatorLayout r1, View r2, View r3, int r4, int r5, int[] r6, int r7) {
    }

    public void p(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
        r6[0] = r6[0] + r4;
        r6[1] = r6[1] + r5;
    }

    public boolean q(CoordinatorLayout r1, View r2, Rect r3, boolean r4) {
        return false;
    }

    public void r(View r1, Parcelable r2) {
    }

    public Parcelable s(View r1) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean t(CoordinatorLayout r1, View r2, View r3, int r4, int r5) {
        return false;
    }

    public void u(CoordinatorLayout r1, View r2, View r3, int r4) {
    }

    public boolean v(CoordinatorLayout r1, View r2, MotionEvent r3) {
        return false;
    }
}
