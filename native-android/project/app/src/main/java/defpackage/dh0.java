package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 extends ei2 {
    public final RectF r;

    public dh0(dh0 r1) {
        super(r1);
        this.r = r1.r;
    }

    @Override // defpackage.ei2, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        eh0 r0 = new eh0(this);
        r0.K = this;
        r0.invalidateSelf();
        return r0;
    }

    public dh0(bc4 r1, RectF r2) {
        super(r1);
        this.r = r2;
    }
}
