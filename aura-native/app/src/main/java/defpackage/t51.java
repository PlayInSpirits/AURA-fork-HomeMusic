package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class t51 extends fx4 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t51(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fx4, defpackage.bx4
    public void a(dx4 dx4Var) {
        switch (this.a) {
            case 2:
                kx4 kx4Var = (kx4) this.b;
                if (!kx4Var.N) {
                    kx4Var.D();
                    kx4Var.N = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bx4
    public final void c(dx4 dx4Var) {
        switch (this.a) {
            case 0:
                View view = (View) this.b;
                f85 f85Var = d85.a;
                f85Var.R(view, 1.0f);
                f85Var.getClass();
                dx4Var.u(this);
                break;
            case 1:
                ((dx4) this.b).w();
                dx4Var.u(this);
                break;
            default:
                kx4 kx4Var = (kx4) this.b;
                int i = kx4Var.M - 1;
                kx4Var.M = i;
                if (i == 0) {
                    kx4Var.N = false;
                    kx4Var.l();
                }
                dx4Var.u(this);
                break;
        }
    }

    public /* synthetic */ t51() {
        this.a = 2;
    }
}
