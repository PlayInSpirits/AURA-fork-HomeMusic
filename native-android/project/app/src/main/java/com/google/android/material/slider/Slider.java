package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import defpackage.b11;
import defpackage.bc4;
import defpackage.fi2;
import defpackage.fz0;
import defpackage.ji2;
import defpackage.kf2;
import defpackage.m;
import defpackage.p42;
import defpackage.su3;
import defpackage.ud3;
import defpackage.uq;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class Slider extends uq {
    public Slider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.c0;
    }

    public int getFocusedThumbIndex() {
        return this.d0;
    }

    public int getHaloRadius() {
        return this.Q;
    }

    public ColorStateList getHaloTintList() {
        return this.m0;
    }

    public int getLabelBehavior() {
        return this.M;
    }

    public float getStepSize() {
        return this.e0;
    }

    public float getThumbElevation() {
        return this.r0.n.m;
    }

    public int getThumbRadius() {
        return this.P;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.r0.n.d;
    }

    public float getThumbStrokeWidth() {
        return this.r0.n.j;
    }

    public ColorStateList getThumbTintList() {
        return this.r0.n.c;
    }

    public int getTickActiveRadius() {
        return this.h0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.n0;
    }

    public int getTickInactiveRadius() {
        return this.i0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.o0;
    }

    public ColorStateList getTickTintList() {
        if (this.o0.equals(this.n0)) {
            return this.n0;
        }
        kf2.o("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        return null;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.p0;
    }

    public int getTrackHeight() {
        return this.N;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.q0;
    }

    public int getTrackSidePadding() {
        return this.O;
    }

    public ColorStateList getTrackTintList() {
        if (this.q0.equals(this.p0)) {
            return this.p0;
        }
        kf2.o("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        return null;
    }

    public int getTrackWidth() {
        return this.j0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.W;
    }

    public float getValueTo() {
        return this.a0;
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        a(drawableNewDrawable);
        this.s0 = drawableNewDrawable;
        this.t0.clear();
        postInvalidate();
    }

    @Override // defpackage.uq, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.b0.size()) {
            kf2.n("index out of range");
            return;
        }
        this.d0 = i;
        this.t.w(i);
        postInvalidate();
    }

    @Override // defpackage.uq
    public void setHaloRadius(int i) {
        if (i == this.Q) {
            return;
        }
        this.Q = i;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.Q);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.uq
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.m0)) {
            return;
        }
        this.m0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int iG = g(colorStateList);
        Paint paint = this.q;
        paint.setColor(iG);
        paint.setAlpha(63);
        invalidate();
    }

    @Override // defpackage.uq
    public void setLabelBehavior(int i) {
        if (this.M != i) {
            this.M = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(p42 p42Var) {
        this.U = p42Var;
    }

    public void setStepSize(float f) {
        if (f >= 0.0f) {
            if (this.e0 != f) {
                this.e0 = f;
                this.l0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        float f2 = this.W;
        float f3 = this.a0;
        StringBuilder sbR = b11.r("The stepSize(", f, ") must be 0, or a factor of the valueFrom(", f2, ")-valueTo(");
        sbR.append(f3);
        sbR.append(") range");
        throw new IllegalArgumentException(sbR.toString());
    }

    @Override // defpackage.uq
    public void setThumbElevation(float f) {
        this.r0.l(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // defpackage.uq
    public void setThumbRadius(int i) {
        if (i == this.P) {
            return;
        }
        this.P = i;
        fz0 fz0Var = new fz0(0);
        fz0 fz0Var2 = new fz0(0);
        fz0 fz0Var3 = new fz0(0);
        fz0 fz0Var4 = new fz0(0);
        float f = this.P;
        su3 su3VarV = ji2.v(0);
        m mVar = new m(f);
        m mVar2 = new m(f);
        m mVar3 = new m(f);
        m mVar4 = new m(f);
        bc4 bc4Var = new bc4();
        bc4Var.a = su3VarV;
        bc4Var.b = su3VarV;
        bc4Var.c = su3VarV;
        bc4Var.d = su3VarV;
        bc4Var.e = mVar;
        bc4Var.f = mVar2;
        bc4Var.g = mVar3;
        bc4Var.h = mVar4;
        bc4Var.i = fz0Var;
        bc4Var.j = fz0Var2;
        bc4Var.k = fz0Var3;
        bc4Var.l = fz0Var4;
        fi2 fi2Var = this.r0;
        fi2Var.setShapeAppearanceModel(bc4Var);
        int i2 = this.P * 2;
        fi2Var.setBounds(0, 0, i2, i2);
        Drawable drawable = this.s0;
        if (drawable != null) {
            a(drawable);
        }
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        v();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // defpackage.uq
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.r0.q(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(ud3.n(getContext(), i));
        }
    }

    @Override // defpackage.uq
    public void setThumbStrokeWidth(float f) {
        this.r0.r(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        fi2 fi2Var = this.r0;
        if (colorStateList.equals(fi2Var.n.c)) {
            return;
        }
        fi2Var.m(colorStateList);
        invalidate();
    }

    @Override // defpackage.uq
    public void setTickActiveRadius(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            this.s.setStrokeWidth(i * 2);
            v();
        }
    }

    @Override // defpackage.uq
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.n0)) {
            return;
        }
        this.n0 = colorStateList;
        this.s.setColor(g(colorStateList));
        invalidate();
    }

    @Override // defpackage.uq
    public void setTickInactiveRadius(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            this.r.setStrokeWidth(i * 2);
            v();
        }
    }

    @Override // defpackage.uq
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.o0)) {
            return;
        }
        this.o0 = colorStateList;
        this.r.setColor(g(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            postInvalidate();
        }
    }

    @Override // defpackage.uq
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.p0)) {
            return;
        }
        this.p0 = colorStateList;
        this.o.setColor(g(colorStateList));
        invalidate();
    }

    @Override // defpackage.uq
    public void setTrackHeight(int i) {
        if (this.N != i) {
            this.N = i;
            this.n.setStrokeWidth(i);
            this.o.setStrokeWidth(this.N);
            v();
        }
    }

    @Override // defpackage.uq
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.q0)) {
            return;
        }
        this.q0 = colorStateList;
        this.n.setColor(g(colorStateList));
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.W = f;
        this.l0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.a0 = f;
        this.l0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.sliderStyle);
    }

    public Slider(Context context) {
        this(context, null);
    }
}
