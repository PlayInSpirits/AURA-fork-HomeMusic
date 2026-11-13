package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oc4 extends mc4 {
    public oc4(NavigationView navigationView) {
        c(navigationView);
    }

    private void c(View view) {
        view.setOutlineProvider(new i20(2, this));
    }

    @Override // defpackage.mc4
    public final void a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.a);
        if (this.a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // defpackage.mc4
    public final boolean b() {
        return this.a;
    }
}
