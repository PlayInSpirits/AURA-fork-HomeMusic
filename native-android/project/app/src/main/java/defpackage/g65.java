package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g65 {
    public static WindowInsets a(View r0, WindowInsets r1) {
        return r0.dispatchApplyWindowInsets(r1);
    }

    public static CharSequence b(View r0) {
        return r0.getStateDescription();
    }

    public static ub5 c(View r1) {
        WindowInsetsController r2 = r1.getWindowInsetsController();
        if (r2 != null) goto L5;
        return null;
    L5:
        return new ub5(r2);
    }

    public static void d(View r0, CharSequence r1) {
        r0.setStateDescription(r1);
    }
}
