package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import app.homemusic.R;
import defpackage.bc4;
import defpackage.cc4;
import defpackage.fi2;
import defpackage.fo1;
import defpackage.h12;
import defpackage.ht3;
import defpackage.jg;
import defpackage.lc4;
import defpackage.pc4;
import defpackage.su3;
import defpackage.ud3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ShapeableImageView extends jg implements lc4 {
    public final Path A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public boolean H;
    public final fo1 q;
    public final RectF r;
    public final RectF s;
    public final Paint t;
    public final Paint u;
    public final Path v;
    public ColorStateList w;
    public fi2 x;
    public bc4 y;
    public float z;

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.q = cc4.a;
        this.v = new Path();
        this.H = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.u = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.r = new RectF();
        this.s = new RectF();
        this.A = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ht3.Q, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.w = h12.s(context2, typedArrayObtainStyledAttributes, 9);
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.B = dimensionPixelSize;
        this.C = dimensionPixelSize;
        this.D = dimensionPixelSize;
        this.E = dimensionPixelSize;
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.t = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.y = bc4.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new pc4(this));
    }

    public final boolean c() {
        return getLayoutDirection() == 1;
    }

    public final void d(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.r;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        bc4 bc4Var = this.y;
        fo1 fo1Var = this.q;
        Path path = this.v;
        fo1Var.d(bc4Var, 1.0f, rectF, null, path);
        Path path2 = this.A;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.s;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.E;
    }

    public final int getContentPaddingEnd() {
        int i = this.G;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.B : this.D;
    }

    public int getContentPaddingLeft() {
        int i = this.G;
        int i2 = this.F;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.B;
    }

    public int getContentPaddingRight() {
        int i = this.G;
        int i2 = this.F;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (c() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!c() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.D;
    }

    public final int getContentPaddingStart() {
        int i = this.F;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return c() ? this.D : this.B;
    }

    public int getContentPaddingTop() {
        return this.C;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public bc4 getShapeAppearanceModel() {
        return this.y;
    }

    public ColorStateList getStrokeColor() {
        return this.w;
    }

    public float getStrokeWidth() {
        return this.z;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.A, this.u);
        if (this.w == null) {
            return;
        }
        float f = this.z;
        Paint paint = this.t;
        paint.setStrokeWidth(f);
        int colorForState = this.w.getColorForState(getDrawableState(), this.w.getDefaultColor());
        if (this.z <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.v, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.H && isLayoutDirectionResolved()) {
            this.H = true;
            if (!isPaddingRelative() && this.F == Integer.MIN_VALUE && this.G == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        d(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // defpackage.lc4
    public void setShapeAppearanceModel(bc4 bc4Var) {
        this.y = bc4Var;
        fi2 fi2Var = this.x;
        if (fi2Var != null) {
            fi2Var.setShapeAppearanceModel(bc4Var);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.w = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(ud3.n(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.z != f) {
            this.z = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
