package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 extends ei2 {
    public final RectF r;

    public dh0(dh0 dh0Var) {
        super(dh0Var);
        this.r = dh0Var.r;
    }

    @Override // defpackage.ei2, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        eh0 eh0Var = new eh0(this);
        eh0Var.K = this;
        eh0Var.invalidateSelf();
        return eh0Var;
    }

    public dh0(bc4 bc4Var, RectF rectF) {
        super(bc4Var);
        this.r = rectF;
    }
}
