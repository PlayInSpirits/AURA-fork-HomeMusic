package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import app.homemusic.R;
import defpackage.ht3;
import defpackage.jv3;
import defpackage.su3;
import defpackage.te5;
import defpackage.uc5;
import defpackage.v50;
import defpackage.vr1;
import defpackage.zz1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] w0 = {app.homemusic.R.attr.state_with_icon};
    public Drawable j0;
    public Drawable k0;
    public int l0;
    public Drawable m0;
    public Drawable n0;
    public ColorStateList o0;
    public ColorStateList p0;
    public PorterDuff.Mode q0;
    public ColorStateList r0;
    public ColorStateList s0;
    public PorterDuff.Mode t0;
    public int[] u0;
    public int[] v0;

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, app.homemusic.R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.l0 = -1;
        Context context2 = getContext();
        this.j0 = super.getThumbDrawable();
        this.o0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.m0 = super.getTrackDrawable();
        this.r0 = super.getTrackTintList();
        super.setTrackTintList(null);
        jv3 E = uc5.E(context2, attributeSet, ht3.E, i, app.homemusic.R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        this.k0 = E.c(0);
        TypedArray typedArray = (TypedArray) E.o;
        this.l0 = typedArray.getDimensionPixelSize(1, -1);
        this.p0 = E.b(2);
        int i2 = typedArray.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.q0 = vr1.B(i2, mode);
        this.n0 = E.c(4);
        this.s0 = E.b(5);
        this.t0 = vr1.B(typedArray.getInt(6, -1), mode);
        E.g();
        setEnforceSwitchWidth(false);
        e();
        f();
    }

    public static void g(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(v50.c(colorStateList.getColorForState(iArr, 0), f, colorStateList.getColorForState(iArr2, 0)));
    }

    public final void e() {
        this.j0 = te5.l(this.j0, this.o0, getThumbTintMode());
        this.k0 = te5.l(this.k0, this.p0, this.q0);
        h();
        Drawable drawable = this.j0;
        Drawable drawable2 = this.k0;
        int i = this.l0;
        super.setThumbDrawable(te5.h(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    public final void f() {
        this.m0 = te5.l(this.m0, this.r0, getTrackTintMode());
        this.n0 = te5.l(this.n0, this.s0, this.t0);
        h();
        Drawable drawable = this.m0;
        if (drawable != null && this.n0 != null) {
            drawable = new LayerDrawable(new Drawable[]{this.m0, this.n0});
        } else if (drawable == null) {
            drawable = this.n0;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.j0;
    }

    public Drawable getThumbIconDrawable() {
        return this.k0;
    }

    public int getThumbIconSize() {
        return this.l0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.p0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.q0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.o0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.n0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.s0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.t0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.m0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.r0;
    }

    public final void h() {
        if (this.o0 == null && this.p0 == null && this.r0 == null && this.s0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.o0;
        if (colorStateList != null) {
            g(this.j0, colorStateList, this.u0, this.v0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.p0;
        if (colorStateList2 != null) {
            g(this.k0, colorStateList2, this.u0, this.v0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.r0;
        if (colorStateList3 != null) {
            g(this.m0, colorStateList3, this.u0, this.v0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.s0;
        if (colorStateList4 != null) {
            g(this.n0, colorStateList4, this.u0, this.v0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        h();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.k0 != null) {
            View.mergeDrawableStates(onCreateDrawableState, w0);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.u0 = iArr;
        this.v0 = te5.u(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.j0 = drawable;
        e();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.k0 = drawable;
        e();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(zz1.r(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.l0 != i) {
            this.l0 = i;
            e();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.p0 = colorStateList;
        e();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.q0 = mode;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.o0 = colorStateList;
        e();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        e();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.n0 = drawable;
        f();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(zz1.r(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.s0 = colorStateList;
        f();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.t0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.m0 = drawable;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        f();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context) {
        this(context, null);
    }
}
