package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class db5 extends cb5 {
    public vz1 r;

    public db5(pb5 pb5Var, WindowInsets windowInsets) {
        super(pb5Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.mb5
    public pb5 b() {
        return pb5.g(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.mb5
    public pb5 c() {
        return pb5.g(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.mb5
    public final vz1 k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = vz1.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.mb5
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.mb5
    public void x(vz1 vz1Var) {
        this.r = vz1Var;
    }
}
