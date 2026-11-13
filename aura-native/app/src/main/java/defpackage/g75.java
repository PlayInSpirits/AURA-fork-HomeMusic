package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class g75 extends de0 {
    public h75 n;
    public int o = 0;

    public g75() {
    }

    @Override // defpackage.de0
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.n == null) {
            this.n = new h75(view);
        }
        h75 h75Var = this.n;
        View view2 = h75Var.a;
        h75Var.b = view2.getTop();
        h75Var.c = view2.getLeft();
        this.n.a();
        int i2 = this.o;
        if (i2 == 0) {
            return true;
        }
        this.n.b(i2);
        this.o = 0;
        return true;
    }

    public final int w() {
        h75 h75Var = this.n;
        if (h75Var != null) {
            return h75Var.d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public g75(int i) {
    }
}
