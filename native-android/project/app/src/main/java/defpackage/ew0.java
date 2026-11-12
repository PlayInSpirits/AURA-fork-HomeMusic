package defpackage;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ew0 implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View r3, WindowInsets r4) {
        DrawerLayout r5 = (DrawerLayout) r3;
        boolean r0 = false;
        if (r4.getSystemWindowInsetTop() <= 0) goto L5;
        boolean r2 = true;
    L6:
        r5.J = r4;
        r5.K = r2;
        if (r2 == false) goto L9;
    L11:
        r5.setWillNotDraw(r0);
        r5.requestLayout();
        return r4.consumeSystemWindowInsets();
    L9:
        if (r5.getBackground() != null) goto L11;
        r0 = true;
        goto L11
    L5:
        r2 = false;
        goto L6
    }
}
