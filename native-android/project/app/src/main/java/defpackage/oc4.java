package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oc4 extends mc4 {
    public oc4(NavigationView r1) {
        c(r1);
    }

    private void c(View r3) {
        r3.setOutlineProvider(new i20(2, this));
    }

    @Override // defpackage.mc4
    public final void a(NavigationView r2) {
        r2.setClipToOutline(!this.a);
        if (this.a == false) goto L6;
        r2.invalidate();
        return;
    L6:
        r2.invalidateOutline();
    }

    @Override // defpackage.mc4
    public final boolean b() {
        return this.a;
    }
}
