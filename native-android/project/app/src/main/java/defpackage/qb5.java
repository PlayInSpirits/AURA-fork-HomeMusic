package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class qb5 extends su3 {
    public final Window g;
    public final om1 h;

    public qb5(Window window, om1 om1Var) {
        this.g = window;
        this.h = om1Var;
    }

    @Override // defpackage.su3
    public final void D(boolean z) {
        if (!z) {
            K(8192);
            return;
        }
        Window window = this.g;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        J(8192);
    }

    @Override // defpackage.su3
    public final void E(int i) {
        this.g.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            K(6144);
            return;
        }
        if (i == 1) {
            K(4096);
            J(2048);
        } else {
            if (i != 2) {
                return;
            }
            K(2048);
            J(4096);
        }
    }

    @Override // defpackage.su3
    public final void F(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    K(4);
                    this.g.clearFlags(1024);
                } else if (i2 == 2) {
                    K(2);
                } else if (i2 == 8) {
                    ((sg3) this.h.o).b();
                }
            }
        }
    }

    public final void J(int i) {
        View decorView = this.g.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void K(int i) {
        View decorView = this.g.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.su3
    public final void x(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    J(4);
                } else if (i2 == 2) {
                    J(2);
                } else if (i2 == 8) {
                    ((sg3) this.h.o).a();
                }
            }
        }
    }

    @Override // defpackage.su3
    public final boolean y() {
        return (this.g.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
