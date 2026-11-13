package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yy0 extends ez0 {
    @Override // defpackage.ez0
    public void b(up4 up4Var, up4 up4Var2, Window window, View view, boolean z, boolean z2) {
        up4Var.getClass();
        up4Var2.getClass();
        window.getClass();
        view.getClass();
        l93.d0(window, false);
        window.setStatusBarColor(z ? up4Var.b : up4Var.a);
        window.setNavigationBarColor(up4Var2.b);
        om1 om1Var = new om1(view);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new tb5(window, om1Var) : i >= 30 ? new sb5(window, om1Var) : i >= 26 ? new rb5(window, om1Var) : new qb5(window, om1Var)).D(!z);
    }
}
