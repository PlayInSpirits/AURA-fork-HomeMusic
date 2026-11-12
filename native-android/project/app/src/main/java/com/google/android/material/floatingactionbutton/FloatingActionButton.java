package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.b51;
import defpackage.bc4;
import defpackage.ce0;
import defpackage.d61;
import defpackage.de0;
import defpackage.ep0;
import defpackage.fg;
import defpackage.ge0;
import defpackage.h12;
import defpackage.ht3;
import defpackage.i;
import defpackage.j65;
import defpackage.ji2;
import defpackage.kf2;
import defpackage.l24;
import defpackage.l4;
import defpackage.lc4;
import defpackage.m81;
import defpackage.m85;
import defpackage.n81;
import defpackage.nt;
import defpackage.o81;
import defpackage.su3;
import defpackage.uc5;
import defpackage.ue1;
import defpackage.vr1;
import defpackage.w41;
import defpackage.zh0;
import defpackage.zx2;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends m85 implements w41, lc4, ce0 {
    public final ue1 A;
    public final i B;
    public o81 C;
    public ColorStateList o;
    public PorterDuff.Mode p;
    public ColorStateList q;
    public PorterDuff.Mode r;
    public ColorStateList s;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public final Rect y;
    public final Rect z;

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable layerDrawable;
        super(su3.H(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.n = getVisibility();
        this.y = new Rect();
        this.z = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = uc5.D(context2, attributeSet, ht3.o, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.o = h12.s(context2, typedArrayD, 1);
        this.p = vr1.B(typedArrayD.getInt(2, -1), null);
        this.s = h12.s(context2, typedArrayD, 12);
        this.t = typedArrayD.getInt(7, -1);
        this.u = typedArrayD.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(3, 0);
        float dimension = typedArrayD.getDimension(4, 0.0f);
        float dimension2 = typedArrayD.getDimension(9, 0.0f);
        float dimension3 = typedArrayD.getDimension(11, 0.0f);
        this.x = typedArrayD.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayD.getDimensionPixelSize(10, 0));
        zx2 zx2VarA = zx2.a(context2, typedArrayD, 15);
        zx2 zx2VarA2 = zx2.a(context2, typedArrayD, 8);
        bc4 bc4VarA = bc4.d(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, bc4.m).a();
        boolean z = typedArrayD.getBoolean(5, false);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        ue1 ue1Var = new ue1(this);
        this.A = ue1Var;
        ue1Var.t(attributeSet, i);
        i iVar = new i();
        iVar.b = false;
        iVar.a = 0;
        iVar.c = this;
        this.B = iVar;
        getImpl().g(bc4VarA);
        m81 impl = getImpl();
        ColorStateList colorStateList = this.o;
        PorterDuff.Mode mode = this.p;
        ColorStateList colorStateList2 = this.s;
        o81 o81Var = (o81) impl;
        FloatingActionButton floatingActionButton = o81Var.r;
        bc4 bc4Var = o81Var.a;
        bc4Var.getClass();
        n81 n81Var = new n81(bc4Var);
        o81Var.b = n81Var;
        n81Var.setTintList(colorStateList);
        if (mode != null) {
            o81Var.b.setTintMode(mode);
        }
        o81Var.b.j(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            bc4 bc4Var2 = o81Var.a;
            bc4Var2.getClass();
            nt ntVar = new nt(bc4Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            ntVar.i = color;
            ntVar.j = color2;
            ntVar.k = color3;
            ntVar.l = color4;
            float f = dimensionPixelSize;
            if (ntVar.h != f) {
                ntVar.h = f;
                ntVar.b.setStrokeWidth(f * 1.3333f);
                ntVar.n = true;
                ntVar.invalidateSelf();
            }
            if (colorStateList != null) {
                ntVar.m = colorStateList.getColorForState(ntVar.getState(), ntVar.m);
            }
            ntVar.p = colorStateList;
            ntVar.n = true;
            ntVar.invalidateSelf();
            o81Var.d = ntVar;
            nt ntVar2 = o81Var.d;
            ntVar2.getClass();
            n81 n81Var2 = o81Var.b;
            n81Var2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{ntVar2, n81Var2});
            drawable = null;
        } else {
            drawable = null;
            o81Var.d = null;
            layerDrawable = o81Var.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(l24.c(colorStateList2), layerDrawable, drawable);
        o81Var.c = rippleDrawable;
        o81Var.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        m81 impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        m81 impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        m81 impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().m = zx2VarA;
        getImpl().n = zx2VarA2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private m81 getImpl() {
        if (this.C == null) {
            this.C = new o81(this, new zh0(24, this));
        }
        return this.C;
    }

    public final int c(int i) {
        int i2 = this.u;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        m81 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.r;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.q;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.r;
        WeakHashMap weakHashMap = j65.a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        zx2 zx2Var = impl.n;
        AnimatorSet animatorSetB = zx2Var != null ? impl.b(zx2Var, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, m81.A, m81.B);
        animatorSetB.addListener(new d61(impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m81 impl = getImpl();
        getDrawableState();
        impl.getClass();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.q;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.r;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(fg.c(colorForState, mode));
    }

    public final void f() {
        m81 impl = getImpl();
        FloatingActionButton floatingActionButton = impl.r;
        Matrix matrix = impl.w;
        FloatingActionButton floatingActionButton2 = impl.r;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.q;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z = impl.m == null;
        WeakHashMap weakHashMap = j65.a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.o = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z ? 0.4f : 0.0f);
            float f = z ? 0.4f : 0.0f;
            impl.o = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        zx2 zx2Var = impl.m;
        AnimatorSet animatorSetB = zx2Var != null ? impl.b(zx2Var, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, m81.y, m81.z);
        animatorSetB.addListener(new l4(8, impl));
        animatorSetB.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.o;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.p;
    }

    @Override // defpackage.ce0
    public de0 getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return ((o81) getImpl()).r.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.u;
    }

    public int getExpandedComponentIdHint() {
        return this.B.a;
    }

    public zx2 getHideMotionSpec() {
        return getImpl().n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.s;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.s;
    }

    public bc4 getShapeAppearanceModel() {
        bc4 bc4Var = getImpl().a;
        bc4Var.getClass();
        return bc4Var;
    }

    public zx2 getShowMotionSpec() {
        return getImpl().m;
    }

    public int getSize() {
        return this.t;
    }

    public int getSizeDimension() {
        return c(this.t);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.q;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.r;
    }

    public boolean getUseCompatPadding() {
        return this.x;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().getClass();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81 impl = getImpl();
        n81 n81Var = impl.b;
        if (n81Var != null) {
            ji2.O(impl.r, n81Var);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().r.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.v = (sizeDimension - this.w) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.y;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b51)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b51 b51Var = (b51) parcelable;
        super.onRestoreInstanceState(b51Var.n);
        Bundle bundle = (Bundle) b51Var.p.get("expandableWidgetHelper");
        bundle.getClass();
        i iVar = this.B;
        iVar.getClass();
        iVar.b = bundle.getBoolean("expanded", false);
        iVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (iVar.b) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) iVar.c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        b51 b51Var = new b51(parcelableOnSaveInstanceState);
        i iVar = this.B;
        iVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", iVar.b);
        bundle.putInt("expandedComponentIdHint", iVar.a);
        b51Var.p.put("expandableWidgetHelper", bundle);
        return b51Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.z;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.y;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            o81 o81Var = this.C;
            int i2 = -(o81Var.f ? Math.max((o81Var.k - o81Var.r.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.o != colorStateList) {
            this.o = colorStateList;
            m81 impl = getImpl();
            n81 n81Var = impl.b;
            if (n81Var != null) {
                n81Var.setTintList(colorStateList);
            }
            nt ntVar = impl.d;
            if (ntVar != null) {
                if (colorStateList != null) {
                    ntVar.m = colorStateList.getColorForState(ntVar.getState(), ntVar.m);
                }
                ntVar.p = colorStateList;
                ntVar.n = true;
                ntVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.p != mode) {
            this.p = mode;
            n81 n81Var = getImpl().b;
            if (n81Var != null) {
                n81Var.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        m81 impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        m81 impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        m81 impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            kf2.n("Custom size must be non-negative");
        } else if (i != this.u) {
            this.u = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        n81 n81Var = getImpl().b;
        if (n81Var != null) {
            n81Var.l(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.B.a = i;
    }

    public void setHideMotionSpec(zx2 zx2Var) {
        getImpl().n = zx2Var;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(zx2.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            m81 impl = getImpl();
            float f = impl.o;
            impl.o = f;
            Matrix matrix = impl.w;
            impl.a(f, matrix);
            impl.r.setImageMatrix(matrix);
            if (this.q != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.A.z(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.w = i;
        m81 impl = getImpl();
        if (impl.p != i) {
            impl.p = i;
            float f = impl.o;
            impl.o = f;
            Matrix matrix = impl.w;
            impl.a(f, matrix);
            impl.r.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.s != colorStateList) {
            this.s = colorStateList;
            m81 impl = getImpl();
            ColorStateList colorStateList2 = this.s;
            RippleDrawable rippleDrawable = ((o81) impl).c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(l24.c(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(l24.c(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        m81 impl = getImpl();
        impl.g = z;
        impl.h();
    }

    @Override // defpackage.lc4
    public void setShapeAppearanceModel(bc4 bc4Var) {
        getImpl().g(bc4Var);
    }

    public void setShowMotionSpec(zx2 zx2Var) {
        getImpl().m = zx2Var;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(zx2.b(getContext(), i));
    }

    public void setSize(int i) {
        this.u = 0;
        if (i != this.t) {
            this.t = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.q != colorStateList) {
            this.q = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.r != mode) {
            this.r = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.x != z) {
            this.x = z;
            ((o81) getImpl()).h();
        }
    }

    @Override // defpackage.m85, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class BaseBehavior<T extends FloatingActionButton> extends de0 {
        public Rect n;
        public final boolean o;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.p);
            this.o = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // defpackage.de0
        public final boolean e(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.y;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.de0
        public final void g(ge0 ge0Var) {
            if (ge0Var.h == 0) {
                ge0Var.h = 80;
            }
        }

        @Override // defpackage.de0
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof ge0 ? ((ge0) layoutParams).a instanceof BottomSheetBehavior : false) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // defpackage.de0
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listK = coordinatorLayout.k(floatingActionButton);
            int size = listK.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listK.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof ge0 ? ((ge0) layoutParams).a instanceof BottomSheetBehavior : false) && x(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i);
            Rect rect = floatingActionButton.y;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                ge0 ge0Var = (ge0) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) ge0Var).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = j65.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = j65.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            ge0 ge0Var = (ge0) floatingActionButton.getLayoutParams();
            if (!this.o || ge0Var.f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.n == null) {
                this.n = new Rect();
            }
            Rect rect = this.n;
            ep0.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            ge0 ge0Var = (ge0) floatingActionButton.getLayoutParams();
            if (!this.o || ge0Var.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((ge0) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior() {
            this.o = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
