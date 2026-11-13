package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import app.homemusic.R;
import defpackage.fi2;
import defpackage.h12;
import defpackage.ht3;
import defpackage.j65;
import defpackage.su3;
import defpackage.uc5;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    public final fi2 n;
    public int o;
    public int p;
    public int q;
    public int r;

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        this.n = new fi2();
        TypedArray D = uc5.D(context2, attributeSet, ht3.B, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.o = D.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.q = D.getDimensionPixelOffset(2, 0);
        this.r = D.getDimensionPixelOffset(1, 0);
        setDividerColor(h12.s(context2, D, 0).getDefaultColor());
        D.recycle();
    }

    public int getDividerColor() {
        return this.p;
    }

    public int getDividerInsetEnd() {
        return this.r;
    }

    public int getDividerInsetStart() {
        return this.q;
    }

    public int getDividerThickness() {
        return this.o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        WeakHashMap weakHashMap = j65.a;
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.r : this.q;
        if (z) {
            width = getWidth();
            i = this.q;
        } else {
            width = getWidth();
            i = this.r;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        fi2 fi2Var = this.n;
        fi2Var.setBounds(i2, 0, i3, bottom);
        fi2Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.o;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.p != i) {
            this.p = i;
            this.n.m(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.r = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.q = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.o != i) {
            this.o = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
