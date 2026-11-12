package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a85 {
    public static void a(View r2, Rect r3, Rect r4) {
        Insets r5 = r2.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(r3)).build(), r4).getSystemWindowInsets();
        r3.set(r5.left, r5.top, r5.right, r5.bottom);
    }
}
