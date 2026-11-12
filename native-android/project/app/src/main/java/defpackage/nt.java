package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nt extends Drawable {
    public final fo1 a;
    public final Paint b;
    public final Path c;
    public final Rect d;
    public final RectF e;
    public final RectF f;
    public final pd g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public bc4 o;
    public ColorStateList p;

    public nt(bc4 r2) {
        this.a = cc4.a;
        this.c = new Path();
        this.d = new Rect();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new pd(this);
        this.n = true;
        this.o = r2;
        Paint r3 = new Paint(1);
        this.b = r3;
        r3.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r21) {
        boolean r1 = this.n;
        Rect r2 = this.d;
        Paint r3 = this.b;
        if (r1 == false) goto L5;
        copyBounds(r2);
        float r4 = this.h / r2.height();
        r3.setShader(new LinearGradient(0.0f, r2.top, 0.0f, r2.bottom, new int[]{v50.g(this.i, this.m), v50.g(this.j, this.m), v50.g(v50.i(this.j, 0), this.m), v50.g(v50.i(this.l, 0), this.m), v50.g(this.l, this.m), v50.g(this.k, this.m)}, new float[]{0.0f, r4, 0.5f, 0.5f, 1.0f - r4, 1.0f}, Shader.TileMode.CLAMP));
        this.n = false;
    L5:
        float r5 = r3.getStrokeWidth() / 2.0f;
        copyBounds(r2);
        RectF r6 = this.e;
        r6.set(r2);
        ke0 r7 = this.o.e;
        Rect r8 = getBounds();
        RectF r9 = this.f;
        r9.set(r8);
        float r10 = Math.min(r7.a(r9), r6.width() / 2.0f);
        bc4 r11 = this.o;
        r9.set(getBounds());
        if (r11.f(r9) == false) goto L9;
        r6.inset(r5, r5);
        r21.drawRoundRect(r6, r10, r10, r3);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.h <= 0.0f) goto L6;
        return -3;
    L6:
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline r8) {
        bc4 r0 = this.o;
        Rect r1 = getBounds();
        RectF r2 = this.f;
        r2.set(r1);
        if (r0.f(r2) == false) goto L6;
        ke0 r3 = this.o.e;
        r2.set(getBounds());
        float r4 = r3.a(r2);
        r8.setRoundRect(getBounds(), r4);
        return;
    L6:
        Rect r5 = this.d;
        copyBounds(r5);
        RectF r6 = this.e;
        r6.set(r5);
        bc4 r7 = this.o;
        fo1 r9 = this.a;
        Path r10 = this.c;
        r9.d(r7, 1.0f, r6, null, r10);
        te5.M(r8, r10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r4) {
        bc4 r0 = this.o;
        Rect r1 = getBounds();
        RectF r2 = this.f;
        r2.set(r1);
        if (r0.f(r2) == false) goto L7;
        int r3 = Math.round(this.h);
        r4.set(r3, r3, r3, r3);
        return true;
    L7:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList r0 = this.p;
        if (r0 == null) goto L7;
        if (r0.isStateful() == false) goto L7;
        return true;
    L7:
        if (super.isStateful() == true) goto L12;
        return false;
    L12:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r1) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r3) {
        ColorStateList r0 = this.p;
        if (r0 == null) goto L8;
        int r4 = r0.getColorForState(r3, this.m);
        if (r4 == this.m) goto L8;
        this.n = true;
        this.m = r4;
    L8:
        if (this.n == false) goto L11;
        invalidateSelf();
    L11:
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        this.b.setAlpha(r2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        this.b.setColorFilter(r2);
        invalidateSelf();
    }
}
