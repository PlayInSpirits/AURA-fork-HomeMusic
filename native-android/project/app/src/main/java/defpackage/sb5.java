package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sb5 extends su3 {
    public final WindowInsetsController g;
    public final om1 h;
    public final Window i;

    public sb5(Window window, om1 om1Var) {
        this(window.getInsetsController(), om1Var);
        this.i = window;
    }

    @Override // defpackage.su3
    public void C(boolean z) {
        Window window = this.i;
        if (window != null) {
            if (!z) {
                J(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.g;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.su3
    public void D(boolean z) {
        Window window = this.i;
        if (window != null) {
            if (!z) {
                J(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.g;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.su3
    public void E(int i) {
        Window window = this.i;
        if (window == null) {
            this.g.setSystemBarsBehavior(i);
            return;
        }
        window.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            J(6144);
            return;
        }
        if (i == 1) {
            J(4096);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2048);
        } else {
            if (i != 2) {
                return;
            }
            J(2048);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 4096);
        }
    }

    @Override // defpackage.su3
    public final void F(int i) {
        if ((i & 8) != 0) {
            ((sg3) this.h.o).b();
        }
        this.g.show(i & (-9));
    }

    public final void J(int i) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.su3
    public final void x(int i) {
        if ((i & 8) != 0) {
            ((sg3) this.h.o).a();
        }
        this.g.hide(i & (-9));
    }

    @Override // defpackage.su3
    public boolean y() {
        Window window = this.i;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }
        this.g.setSystemBarsAppearance(0, 0);
        return (this.g.getSystemBarsAppearance() & 8) != 0;
    }

    public sb5(WindowInsetsController windowInsetsController, om1 om1Var) {
        this.g = windowInsetsController;
        this.h = om1Var;
    }
}
