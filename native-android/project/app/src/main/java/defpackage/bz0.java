package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class bz0 extends az0 {
    @Override // defpackage.zy0, defpackage.ez0
    public void b(up4 up4Var, up4 up4Var2, Window window, View view, boolean z, boolean z2) {
        su3 rb5Var;
        up4Var.getClass();
        up4Var2.getClass();
        window.getClass();
        view.getClass();
        l93.d0(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        om1 om1Var = new om1(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            rb5Var = new tb5(window, om1Var);
        } else if (i >= 30) {
            rb5Var = new sb5(window, om1Var);
        } else {
            rb5Var = i >= 26 ? new rb5(window, om1Var) : new qb5(window, om1Var);
        }
        rb5Var.D(!z);
        rb5Var.C(!z2);
    }
}
