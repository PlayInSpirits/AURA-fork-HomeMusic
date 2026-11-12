package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a65 {
    public static void a(WindowInsets r1, View r2) {
        View.OnApplyWindowInsetsListener r0 = (View.OnApplyWindowInsetsListener) r2.getTag(R.id.tag_window_insets_animation_callback);
        if (r0 == null) goto L6;
        r0.onApplyWindowInsets(r2, r1);
        return;
    }

    public static pb5 b(View r1, pb5 r2, Rect r3) {
        WindowInsets r0 = r2.f();
        if (r0 != null) goto L5;
        r3.setEmpty();
        return r2;
    L5:
        return pb5.g(r1.computeSystemWindowInsets(r0, r3), r1);
    }

    public static void c(View r2, r83 r3) {
        if (r3 == null) goto L4;
        z55 r0 = new z55(r2, r3);
    L6:
        if (Build.VERSION.SDK_INT >= 30) goto L9;
        r2.setTag(R.id.tag_on_apply_window_listener, r0);
    L9:
        if (r2.getTag(R.id.tag_compat_insets_dispatch) == null) goto L11;
        return;
    L11:
        if (r0 == null) goto L14;
        r2.setOnApplyWindowInsetsListener(r0);
        return;
    L14:
        r2.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) r2.getTag(R.id.tag_window_insets_animation_callback));
        return;
    L4:
        r0 = null;
        goto L6
    }
}
