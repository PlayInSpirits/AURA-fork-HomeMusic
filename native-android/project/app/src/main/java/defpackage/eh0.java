package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eh0 extends fi2 {
    public static final /* synthetic */ int L = 0;
    public dh0 K;

    @Override // defpackage.fi2
    public final void f(Canvas r4) {
        if (this.K.r.isEmpty() == false) goto L6;
        super.f(r4);
        return;
    L6:
        r4.save();
        int r0 = Build.VERSION.SDK_INT;
        dh0 r1 = this.K;
        if (r0 < 26) goto L9;
        tn.q(r4, r1.r);
    L10:
        super.f(r4);
        r4.restore();
        return;
    L9:
        r4.clipRect(r1.r, Region.Op.DIFFERENCE);
        goto L10
    }

    @Override // defpackage.fi2, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.K = new dh0(this.K);
        return this;
    }

    public final void v(float r3, float r4, float r5, float r6) {
        RectF r0 = this.K.r;
        if (r3 == r0.left) goto L5;
    L12:
        r0.set(r3, r4, r5, r6);
        invalidateSelf();
        return;
    L5:
        if (r4 != r0.top) goto L12;
        if (r5 != r0.right) goto L12;
        if (r6 != r0.bottom) goto L12;
    }
}
