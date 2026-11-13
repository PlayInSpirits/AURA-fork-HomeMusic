package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class g65 {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static ub5 c(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new ub5(windowInsetsController);
        }
        return null;
    }

    public static void d(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
