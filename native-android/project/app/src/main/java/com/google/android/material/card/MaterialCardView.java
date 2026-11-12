package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import defpackage.bc4;
import defpackage.fi2;
import defpackage.g12;
import defpackage.h12;
import defpackage.ht3;
import defpackage.ji2;
import defpackage.l24;
import defpackage.lc4;
import defpackage.oh2;
import defpackage.qh2;
import defpackage.su3;
import defpackage.uc5;
import defpackage.ud3;
import defpackage.zc1;
import defpackage.zz1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, lc4 {
    public static final int[] x = {R.attr.state_checkable};
    public static final int[] y = {R.attr.state_checked};
    public static final int[] z = {app.homemusic.R.attr.state_dragged};
    public final qh2 t;
    public final boolean u;
    public boolean v;
    public boolean w;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, app.homemusic.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.v = false;
        this.w = false;
        this.u = true;
        TypedArray typedArrayD = uc5.D(getContext(), attributeSet, ht3.z, i, app.homemusic.R.style.Widget_MaterialComponents_CardView, new int[0]);
        qh2 qh2Var = new qh2(this, attributeSet, i);
        this.t = qh2Var;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        fi2 fi2Var = qh2Var.c;
        fi2Var.m(cardBackgroundColor);
        qh2Var.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        qh2Var.j();
        MaterialCardView materialCardView = qh2Var.a;
        ColorStateList colorStateListS = h12.s(materialCardView.getContext(), typedArrayD, 11);
        qh2Var.n = colorStateListS;
        if (colorStateListS == null) {
            qh2Var.n = ColorStateList.valueOf(-1);
        }
        qh2Var.h = typedArrayD.getDimensionPixelSize(12, 0);
        boolean z2 = typedArrayD.getBoolean(0, false);
        qh2Var.s = z2;
        materialCardView.setLongClickable(z2);
        qh2Var.l = h12.s(materialCardView.getContext(), typedArrayD, 6);
        qh2Var.g(h12.v(materialCardView.getContext(), typedArrayD, 2));
        qh2Var.f = typedArrayD.getDimensionPixelSize(5, 0);
        qh2Var.e = typedArrayD.getDimensionPixelSize(4, 0);
        qh2Var.g = typedArrayD.getInteger(3, 8388661);
        ColorStateList colorStateListS2 = h12.s(materialCardView.getContext(), typedArrayD, 7);
        qh2Var.k = colorStateListS2;
        if (colorStateListS2 == null) {
            qh2Var.k = ColorStateList.valueOf(g12.t(materialCardView, app.homemusic.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListS3 = h12.s(materialCardView.getContext(), typedArrayD, 1);
        colorStateListS3 = colorStateListS3 == null ? ColorStateList.valueOf(0) : colorStateListS3;
        fi2 fi2Var2 = qh2Var.d;
        fi2Var2.m(colorStateListS3);
        int[] iArr = l24.a;
        RippleDrawable rippleDrawable = qh2Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(qh2Var.k);
        }
        fi2Var.l(materialCardView.getCardElevation());
        float f = qh2Var.h;
        ColorStateList colorStateList = qh2Var.n;
        fi2Var2.r(f);
        fi2Var2.q(colorStateList);
        materialCardView.setBackgroundInternal(qh2Var.d(fi2Var));
        Drawable drawableC = materialCardView.isClickable() ? qh2Var.c() : fi2Var2;
        qh2Var.i = drawableC;
        materialCardView.setForeground(qh2Var.d(drawableC));
        typedArrayD.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.t.c.getBounds());
        return rectF;
    }

    public final void b() {
        qh2 qh2Var;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (qh2Var = this.t).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        qh2Var.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        qh2Var.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.t.c.n.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.t.d.n.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.t.j;
    }

    public int getCheckedIconGravity() {
        return this.t.g;
    }

    public int getCheckedIconMargin() {
        return this.t.e;
    }

    public int getCheckedIconSize() {
        return this.t.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.t.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.t.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.t.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.t.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.t.b.top;
    }

    public float getProgress() {
        return this.t.c.n.i;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.t.c.h();
    }

    public ColorStateList getRippleColor() {
        return this.t.k;
    }

    public bc4 getShapeAppearanceModel() {
        return this.t.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.t.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.t.n;
    }

    public int getStrokeWidth() {
        return this.t.h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji2.O(this, this.t.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        qh2 qh2Var = this.t;
        if (qh2Var != null && qh2Var.s) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, x);
        }
        if (this.v) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y);
        }
        if (this.w) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.v);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        qh2 qh2Var = this.t;
        accessibilityNodeInfo.setCheckable(qh2Var != null && qh2Var.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.v);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.t.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.u) {
            qh2 qh2Var = this.t;
            if (!qh2Var.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                qh2Var.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.t.c.m(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        qh2 qh2Var = this.t;
        qh2Var.c.l(qh2Var.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        fi2 fi2Var = this.t.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        fi2Var.m(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.t.s = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.v != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.t.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        qh2 qh2Var = this.t;
        if (qh2Var.g != i) {
            qh2Var.g = i;
            MaterialCardView materialCardView = qh2Var.a;
            qh2Var.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.t.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.t.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.t.g(zz1.r(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.t.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.t.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        qh2 qh2Var = this.t;
        qh2Var.l = colorStateList;
        Drawable drawable = qh2Var.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        qh2 qh2Var = this.t;
        if (qh2Var != null) {
            Drawable drawable = qh2Var.i;
            MaterialCardView materialCardView = qh2Var.a;
            Drawable drawableC = materialCardView.isClickable() ? qh2Var.c() : qh2Var.d;
            qh2Var.i = drawableC;
            if (drawable != drawableC) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
                } else {
                    materialCardView.setForeground(qh2Var.d(drawableC));
                }
            }
        }
    }

    public void setDragged(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.t.k();
    }

    public void setOnCheckedChangeListener(oh2 oh2Var) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        qh2 qh2Var = this.t;
        qh2Var.k();
        qh2Var.j();
    }

    public void setProgress(float f) {
        qh2 qh2Var = this.t;
        qh2Var.c.n(f);
        fi2 fi2Var = qh2Var.d;
        if (fi2Var != null) {
            fi2Var.n(f);
        }
        fi2 fi2Var2 = qh2Var.q;
        if (fi2Var2 != null) {
            fi2Var2.n(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        qh2 qh2Var = this.t;
        zc1 zc1VarG = qh2Var.m.g();
        zc1VarG.b(f);
        qh2Var.h(zc1VarG.a());
        qh2Var.i.invalidateSelf();
        if (qh2Var.i() || (qh2Var.a.getPreventCornerOverlap() && !qh2Var.c.k())) {
            qh2Var.j();
        }
        if (qh2Var.i()) {
            qh2Var.k();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        qh2 qh2Var = this.t;
        qh2Var.k = colorStateList;
        int[] iArr = l24.a;
        RippleDrawable rippleDrawable = qh2Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListN = ud3.n(getContext(), i);
        qh2 qh2Var = this.t;
        qh2Var.k = colorStateListN;
        int[] iArr = l24.a;
        RippleDrawable rippleDrawable = qh2Var.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListN);
        }
    }

    @Override // defpackage.lc4
    public void setShapeAppearanceModel(bc4 bc4Var) {
        setClipToOutline(bc4Var.f(getBoundsAsRectF()));
        this.t.h(bc4Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        qh2 qh2Var = this.t;
        if (qh2Var.n != colorStateList) {
            qh2Var.n = colorStateList;
            fi2 fi2Var = qh2Var.d;
            fi2Var.r(qh2Var.h);
            fi2Var.q(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        qh2 qh2Var = this.t;
        if (i != qh2Var.h) {
            qh2Var.h = i;
            fi2 fi2Var = qh2Var.d;
            ColorStateList colorStateList = qh2Var.n;
            fi2Var.r(i);
            fi2Var.q(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        qh2 qh2Var = this.t;
        qh2Var.k();
        qh2Var.j();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        qh2 qh2Var = this.t;
        if (qh2Var != null && qh2Var.s && isEnabled()) {
            this.v = !this.v;
            refreshDrawableState();
            b();
            qh2Var.f(this.v, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.t.c.m(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
