package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t00 extends fx4 {
    public boolean a = false;
    public final /* synthetic */ ViewGroup b;

    public t00(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.fx4, defpackage.bx4
    public final void b() {
        fh0.y(this.b, false);
    }

    @Override // defpackage.bx4
    public final void c(dx4 dx4Var) {
        if (!this.a) {
            fh0.y(this.b, false);
        }
        dx4Var.u(this);
    }

    @Override // defpackage.fx4, defpackage.bx4
    public final void d() {
        fh0.y(this.b, false);
        this.a = true;
    }

    @Override // defpackage.fx4, defpackage.bx4
    public final void e() {
        fh0.y(this.b, true);
    }
}
