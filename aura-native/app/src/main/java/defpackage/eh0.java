package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class eh0 extends fi2 {
    public eh0(defpackage.ei2 a0) {
        super(a0);
    }

    public static final /* synthetic */ int L = 0;
    public dh0 K;

    @Override // defpackage.fi2
    public final void f(Canvas canvas) {
        if (this.K.r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        dh0 dh0Var = this.K;
        if (i >= 26) {
            canvas.clipOutRect(dh0Var.r);
        } else {
            canvas.clipRect(dh0Var.r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.K = new dh0(this.K);
        return this;
    }

    public final void v(float f, float f2, float f3, float f4) {
        RectF rectF = this.K.r;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
