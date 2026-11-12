package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.bc4;
import defpackage.eh2;
import defpackage.ff;
import defpackage.fh2;
import defpackage.gh2;
import defpackage.h12;
import defpackage.ht3;
import defpackage.j65;
import defpackage.ji2;
import defpackage.kf2;
import defpackage.l24;
import defpackage.lc4;
import defpackage.si1;
import defpackage.su3;
import defpackage.uc5;
import defpackage.ud3;
import defpackage.vr1;
import defpackage.xa3;
import defpackage.zc1;
import defpackage.zz1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends ff implements Checkable, lc4 {
    public static final int[] E = {R.attr.state_checkable};
    public static final int[] F = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public final gh2 q;
    public final LinkedHashSet r;
    public eh2 s;
    public PorterDuff.Mode t;
    public ColorStateList u;
    public Drawable v;
    public String w;
    public int x;
    public int y;
    public int z;

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, app.homemusic.R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.r = new LinkedHashSet();
        this.B = false;
        this.C = false;
        Context context2 = getContext();
        TypedArray typedArrayD = uc5.D(context2, attributeSet, ht3.v, i, app.homemusic.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.A = typedArrayD.getDimensionPixelSize(12, 0);
        int i2 = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.t = vr1.B(i2, mode);
        this.u = h12.s(getContext(), typedArrayD, 14);
        this.v = h12.v(getContext(), typedArrayD, 10);
        this.D = typedArrayD.getInteger(11, 1);
        this.x = typedArrayD.getDimensionPixelSize(13, 0);
        gh2 gh2Var = new gh2(this, bc4.c(context2, attributeSet, i, app.homemusic.R.style.Widget_MaterialComponents_Button).a());
        this.q = gh2Var;
        gh2Var.c = typedArrayD.getDimensionPixelOffset(1, 0);
        gh2Var.d = typedArrayD.getDimensionPixelOffset(2, 0);
        gh2Var.e = typedArrayD.getDimensionPixelOffset(3, 0);
        gh2Var.f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            gh2Var.g = dimensionPixelSize;
            zc1 zc1VarG = gh2Var.b.g();
            zc1VarG.b(dimensionPixelSize);
            gh2Var.c(zc1VarG.a());
            gh2Var.p = true;
        }
        gh2Var.h = typedArrayD.getDimensionPixelSize(20, 0);
        gh2Var.i = vr1.B(typedArrayD.getInt(7, -1), mode);
        gh2Var.j = h12.s(getContext(), typedArrayD, 6);
        gh2Var.k = h12.s(getContext(), typedArrayD, 19);
        gh2Var.l = h12.s(getContext(), typedArrayD, 16);
        gh2Var.q = typedArrayD.getBoolean(5, false);
        gh2Var.t = typedArrayD.getDimensionPixelSize(9, 0);
        gh2Var.r = typedArrayD.getBoolean(21, true);
        WeakHashMap weakHashMap = j65.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            gh2Var.o = true;
            setSupportBackgroundTintList(gh2Var.j);
            setSupportBackgroundTintMode(gh2Var.i);
        } else {
            gh2Var.e();
        }
        setPaddingRelative(paddingStart + gh2Var.c, paddingTop + gh2Var.e, paddingEnd + gh2Var.d, paddingBottom + gh2Var.f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.A);
        c(this.v != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        gh2 gh2Var = this.q;
        return (gh2Var == null || gh2Var.o) ? false : true;
    }

    public final void b() {
        int i = this.D;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.v, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.v, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.v, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.v;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.v = drawableMutate;
            drawableMutate.setTintList(this.u);
            PorterDuff.Mode mode = this.t;
            if (mode != null) {
                this.v.setTintMode(mode);
            }
            int intrinsicWidth = this.x;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.v.getIntrinsicWidth();
            }
            int intrinsicHeight = this.x;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.v.getIntrinsicHeight();
            }
            Drawable drawable2 = this.v;
            int i = this.y;
            int i2 = this.z;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.v.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.D;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.v) || (((i3 == 3 || i3 == 4) && drawable5 != this.v) || ((i3 == 16 || i3 == 32) && drawable4 != this.v))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.v == null || getLayout() == null) {
            return;
        }
        int i3 = this.D;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.y = 0;
                if (i3 == 16) {
                    this.z = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.x;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.v.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.A) - getPaddingBottom()) / 2);
                if (this.z != iMax) {
                    this.z = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.z = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.D;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.y = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.x;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.v.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = j65.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.A) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.D == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.y != paddingEnd) {
            this.y = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.w)) {
            return this.w;
        }
        gh2 gh2Var = this.q;
        return ((gh2Var == null || !gh2Var.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.q.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.v;
    }

    public int getIconGravity() {
        return this.D;
    }

    public int getIconPadding() {
        return this.A;
    }

    public int getIconSize() {
        return this.x;
    }

    public ColorStateList getIconTint() {
        return this.u;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public int getInsetBottom() {
        return this.q.f;
    }

    public int getInsetTop() {
        return this.q.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.q.l;
        }
        return null;
    }

    public bc4 getShapeAppearanceModel() {
        if (a()) {
            return this.q.b;
        }
        kf2.o("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.q.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.q.h;
        }
        return 0;
    }

    @Override // defpackage.ff
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.q.j : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.ff
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.q.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.B;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            ji2.O(this, this.q.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        gh2 gh2Var = this.q;
        if (gh2Var != null && gh2Var.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        if (this.B) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.ff, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.B);
    }

    @Override // defpackage.ff, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        gh2 gh2Var = this.q;
        accessibilityNodeInfo.setCheckable(gh2Var != null && gh2Var.q);
        accessibilityNodeInfo.setChecked(this.B);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.ff, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof fh2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fh2 fh2Var = (fh2) parcelable;
        super.onRestoreInstanceState(fh2Var.n);
        setChecked(fh2Var.p);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        fh2 fh2Var = new fh2(super.onSaveInstanceState());
        fh2Var.p = this.B;
        return fh2Var;
    }

    @Override // defpackage.ff, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.q.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.v != null) {
            if (this.v.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.w = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        gh2 gh2Var = this.q;
        if (gh2Var.b(false) != null) {
            gh2Var.b(false).setTint(i);
        }
    }

    @Override // defpackage.ff, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        gh2 gh2Var = this.q;
        gh2Var.o = true;
        MaterialButton materialButton = gh2Var.a;
        materialButton.setSupportBackgroundTintList(gh2Var.j);
        materialButton.setSupportBackgroundTintMode(gh2Var.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.ff, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? zz1.r(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.q.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        gh2 gh2Var = this.q;
        if (gh2Var == null || !gh2Var.q || !isEnabled() || this.B == z) {
            return;
        }
        this.B = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.B;
            if (!materialButtonToggleGroup.s) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.C) {
            return;
        }
        this.C = true;
        Iterator it = this.r.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        this.C = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            gh2 gh2Var = this.q;
            if (gh2Var.p && gh2Var.g == i) {
                return;
            }
            gh2Var.g = i;
            gh2Var.p = true;
            zc1 zc1VarG = gh2Var.b.g();
            zc1VarG.b(i);
            gh2Var.c(zc1VarG.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.q.b(false).l(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.v != drawable) {
            this.v = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.D != i) {
            this.D = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.A != i) {
            this.A = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? zz1.r(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            kf2.n("iconSize cannot be less than 0");
        } else if (this.x != i) {
            this.x = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.t != mode) {
            this.t = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ud3.n(getContext(), i));
    }

    public void setInsetBottom(int i) {
        gh2 gh2Var = this.q;
        gh2Var.d(gh2Var.e, i);
    }

    public void setInsetTop(int i) {
        gh2 gh2Var = this.q;
        gh2Var.d(i, gh2Var.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(eh2 eh2Var) {
        this.s = eh2Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        eh2 eh2Var = this.s;
        if (eh2Var != null) {
            ((MaterialButtonToggleGroup) ((si1) eh2Var).o).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            gh2 gh2Var = this.q;
            MaterialButton materialButton = gh2Var.a;
            if (gh2Var.l != colorStateList) {
                gh2Var.l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(l24.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(ud3.n(getContext(), i));
        }
    }

    @Override // defpackage.lc4
    public void setShapeAppearanceModel(bc4 bc4Var) {
        if (a()) {
            this.q.c(bc4Var);
        } else {
            kf2.o("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            gh2 gh2Var = this.q;
            gh2Var.n = z;
            gh2Var.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            gh2 gh2Var = this.q;
            if (gh2Var.k != colorStateList) {
                gh2Var.k = colorStateList;
                gh2Var.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(ud3.n(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            gh2 gh2Var = this.q;
            if (gh2Var.h != i) {
                gh2Var.h = i;
                gh2Var.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.ff
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        gh2 gh2Var = this.q;
        if (gh2Var.j != colorStateList) {
            gh2Var.j = colorStateList;
            if (gh2Var.b(false) != null) {
                gh2Var.b(false).setTintList(gh2Var.j);
            }
        }
    }

    @Override // defpackage.ff
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        gh2 gh2Var = this.q;
        if (gh2Var.i != mode) {
            gh2Var.i = mode;
            if (gh2Var.b(false) == null || gh2Var.i == null) {
                return;
            }
            gh2Var.b(false).setTintMode(gh2Var.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.q.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.B);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
