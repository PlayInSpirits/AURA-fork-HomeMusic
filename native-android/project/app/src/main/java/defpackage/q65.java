package defpackage;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q65 {
    public static final ThreadLocal a = null;
    public static final ThreadLocal b = null;

    static {
        a = new ThreadLocal();
        b = new ThreadLocal();
    }

    public static void a(CoordinatorLayout r2, View r3, Matrix r4) {
        Object r0 = r3.getParent();
        if ((r0 instanceof View) == false) goto L6;
        if (r0 == r2) goto L6;
        View r1 = (View) r0;
        a(r2, r1, r4);
        r4.preTranslate(-r1.getScrollX(), -r1.getScrollY());
    L6:
        r4.preTranslate(r3.getLeft(), r3.getTop());
        if (r3.getMatrix().isIdentity() == true) goto L10;
        r4.preConcat(r3.getMatrix());
        return;
    }
}
