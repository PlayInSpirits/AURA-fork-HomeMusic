/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class q65 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final ThreadLocal b = new ThreadLocal();

    public static void a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object object = view.getParent();
        if (object instanceof View && object != coordinatorLayout) {
            object = (View)object;
            q65.a(coordinatorLayout, (View)object, matrix);
            matrix.preTranslate(-((View)object).getScrollX(), -((View)object).getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}

