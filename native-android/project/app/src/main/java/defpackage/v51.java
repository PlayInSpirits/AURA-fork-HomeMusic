package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v51 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final float[] c;
    public float d;

    public v51(Drawable r1, Drawable r2) {
        this.a = r1.getConstantState().newDrawable().mutate();
        Drawable r3 = r2.getConstantState().newDrawable().mutate();
        this.b = r3;
        r3.setAlpha(0);
        this.c = new float[2];
    }

    public final void a(float r4) {
        if (this.d == r4) goto L6;
        this.d = r4;
        float[] r0 = this.c;
        zz1.g(r4, r0);
        int r5 = (int) (r0[0] * 255.0f);
        this.a.setAlpha(r5);
        int r6 = (int) (r0[1] * 255.0f);
        this.b.setAlpha(r6);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r2) {
        this.a.draw(r2);
        this.b.draw(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.a.getIntrinsicHeight(), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.a.getIntrinsicWidth(), this.b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.a.getMinimumHeight(), this.b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.a.getMinimumWidth(), this.b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (this.a.isStateful() == false) goto L5;
        return true;
    L5:
        if (this.b.isStateful() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r5) {
        float r0 = this.d;
        Drawable r2 = this.b;
        Drawable r3 = this.a;
        if (r0 > 0.5f) goto L5;
        r3.setAlpha(r5);
        r2.setAlpha(0);
    L6:
        invalidateSelf();
        return;
    L5:
        r3.setAlpha(0);
        r2.setAlpha(r5);
        goto L6
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int r2, int r3, int r4, int r5) {
        super.setBounds(r2, r3, r4, r5);
        this.a.setBounds(r2, r3, r4, r5);
        this.b.setBounds(r2, r3, r4, r5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.a.setColorFilter(r2);
        this.b.setColorFilter(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
        boolean r0 = this.a.setState(r2);
        boolean r1 = this.b.setState(r2);
        if (r0 == true) goto L8;
        if (r1 == true) goto L10;
        return false;
    L10:
        return true;
    L8:
        return true;
    }
}
