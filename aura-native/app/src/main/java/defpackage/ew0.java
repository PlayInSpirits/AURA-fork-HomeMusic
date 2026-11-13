package defpackage;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ew0 implements View.OnApplyWindowInsetsListener {
    public ew0() {
        super();
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z = false;
        boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.J = windowInsets;
        drawerLayout.K = z2;
        if (!z2 && drawerLayout.getBackground() == null) {
            z = true;
        }
        drawerLayout.setWillNotDraw(z);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
