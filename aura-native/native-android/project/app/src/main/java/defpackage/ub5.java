package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ub5 {
    public final su3 a;

    public ub5(Window window, View view) {
        om1 om1Var = new om1(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new tb5(window, om1Var);
            return;
        }
        if (i >= 30) {
            this.a = new sb5(window, om1Var);
        } else if (i >= 26) {
            this.a = new rb5(window, om1Var);
        } else {
            this.a = new qb5(window, om1Var);
        }
    }

    public ub5(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new tb5(windowInsetsController, new om1(windowInsetsController));
        } else {
            this.a = new sb5(windowInsetsController, new om1(windowInsetsController));
        }
    }
}
