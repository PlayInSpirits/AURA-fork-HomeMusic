package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h34 extends Drawable {
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean f;
    public boolean g;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff.Mode k;

    public h34(ColorStateList r3, float r4) {
        this.f = false;
        this.g = true;
        this.k = PorterDuff.Mode.SRC_IN;
        this.a = r4;
        Paint r5 = new Paint(5);
        this.b = r5;
        if (r3 != null) goto L5;
        r3 = ColorStateList.valueOf(0);
    L5:
        this.h = r3;
        r5.setColor(r3.getColorForState(getState(), this.h.getDefaultColor()));
        this.c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList r2, PorterDuff.Mode r3) {
        if (r2 == null) goto L7;
        if (r3 != null) goto L6;
        return null;
    L6:
        return new PorterDuffColorFilter(r2.getColorForState(getState(), 0), r3);
    L7:
        return null;
    }

    public final void b(Rect r6) {
        if (r6 != null) goto L4;
        r6 = getBounds();
    L4:
        float r0 = r6.left;
        float r1 = r6.top;
        float r2 = r6.right;
        float r3 = r6.bottom;
        RectF r4 = this.c;
        r4.set(r0, r1, r2, r3);
        Rect r5 = this.d;
        r5.set(r6);
        if (this.f == false) goto L8;
        r5.inset((int) Math.ceil(i34.a(this.e, this.a, this.g)), (int) Math.ceil(i34.b(this.e, this.a, this.g)));
        r4.set(r5);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r4) {
        PorterDuffColorFilter r0 = this.i;
        Paint r1 = this.b;
        if (r0 != null) goto L5;
    L7:
        boolean r2 = false;
    L8:
        RectF r3 = this.c;
        float r5 = this.a;
        r4.drawRoundRect(r3, r5, r5, r1);
        if (r2 == false) goto L12;
        r1.setColorFilter(null);
        return;
    L12:
        return;
    L5:
        if (r1.getColorFilter() != null) goto L7;
        r1.setColorFilter(this.i);
        r2 = true;
        goto L8
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline r2) {
        r2.setRoundRect(this.d, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList r0 = this.j;
        if (r0 != null) goto L5;
    L6:
        ColorStateList r1 = this.h;
        if (r1 == null) goto L11;
        if (r1.isStateful() == false) goto L11;
        return true;
    L11:
        if (super.isStateful() == true) goto L17;
        return false;
    L17:
        return true;
    L5:
        if (r0.isStateful() == false) goto L6;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r1) {
        super.onBoundsChange(r1);
        b(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r4) {
        ColorStateList r0 = this.h;
        int r5 = r0.getColorForState(r4, r0.getDefaultColor());
        Paint r1 = this.b;
        if (r5 == r1.getColor()) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L8;
        r1.setColor(r5);
    L8:
        ColorStateList r6 = this.j;
        if (r6 == null) goto L14;
        PorterDuff.Mode r3 = this.k;
        if (r3 == null) goto L14;
        this.i = a(r6, r3);
        return true;
    L14:
        return r2;
    L5:
        r2 = false;
        goto L6
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
        this.b.setAlpha(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r1) {
        this.b.setColorFilter(r1);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        this.j = r2;
        this.i = a(r2, this.k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r2) {
        this.k = r2;
        this.i = a(this.j, r2);
        invalidateSelf();
    }
}
