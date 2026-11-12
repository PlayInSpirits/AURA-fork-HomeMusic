package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import defpackage.a65;
import defpackage.af;
import defpackage.ce0;
import defpackage.de0;
import defpackage.fi2;
import defpackage.g12;
import defpackage.ge0;
import defpackage.h12;
import defpackage.h75;
import defpackage.ht3;
import defpackage.i53;
import defpackage.j65;
import defpackage.ji2;
import defpackage.k;
import defpackage.kf2;
import defpackage.o3;
import defpackage.pb5;
import defpackage.ql1;
import defpackage.qr2;
import defpackage.rl1;
import defpackage.su3;
import defpackage.uc5;
import defpackage.xe;
import defpackage.xl;
import defpackage.yd;
import defpackage.yd4;
import defpackage.ye;
import defpackage.ze;
import defpackage.zh0;
import defpackage.zz1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements ce0 {
    public static final /* synthetic */ int L = 0;
    public WeakReference A;
    public final ColorStateList B;
    public ValueAnimator C;
    public final ValueAnimator.AnimatorUpdateListener D;
    public final ArrayList E;
    public final long F;
    public final TimeInterpolator G;
    public int[] H;
    public Drawable I;
    public final float J;
    public Behavior K;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public pb5 t;
    public ArrayList u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.o = -1;
        this.p = -1;
        this.q = -1;
        int i2 = 0;
        this.s = 0;
        this.E = new ArrayList();
        Context context2 = getContext();
        int i3 = 1;
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray typedArrayD = uc5.D(context3, attributeSet, xl.g, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayD.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayD.getResourceId(0, 0)));
            }
            typedArrayD.recycle();
            TypedArray typedArrayD2 = uc5.D(context2, attributeSet, ht3.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            Drawable drawable = typedArrayD2.getDrawable(0);
            WeakHashMap weakHashMap = j65.a;
            setBackground(drawable);
            ColorStateList colorStateListS = h12.s(context2, typedArrayD2, 6);
            this.B = colorStateListS;
            ColorStateList backgroundCSL = getBackgroundCSL();
            if (backgroundCSL != null) {
                fi2 fi2Var = new fi2();
                fi2Var.m(backgroundCSL);
                if (colorStateListS != null) {
                    fi2Var.setAlpha(this.x ? 255 : 0);
                    fi2Var.m(colorStateListS);
                    this.D = new xe(i3, this, fi2Var);
                } else {
                    fi2Var.j(context2);
                    this.D = new xe(i2, this, fi2Var);
                }
                setBackground(fi2Var);
            }
            this.F = g12.N(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.G = g12.O(context2, R.attr.motionEasingStandardInterpolator, yd.a);
            if (typedArrayD2.hasValue(4)) {
                f(typedArrayD2.getBoolean(4, false), false, false);
            }
            if (typedArrayD2.hasValue(3)) {
                xl.K(this, typedArrayD2.getDimensionPixelSize(3, 0));
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayD2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayD2.getBoolean(2, false));
                }
                if (typedArrayD2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayD2.getBoolean(1, false));
                }
            }
            this.J = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.y = typedArrayD2.getBoolean(5, false);
            this.z = typedArrayD2.getResourceId(7, -1);
            setStatusBarForeground(typedArrayD2.getDrawable(8));
            typedArrayD2.recycle();
            a65.c(this, new zh0(5, this));
        } catch (Throwable th) {
            typedArrayD.recycle();
            throw th;
        }
    }

    public static ze c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ze zeVar = new ze((LinearLayout.LayoutParams) layoutParams);
            zeVar.a = 1;
            return zeVar;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ze zeVar2 = new ze((ViewGroup.MarginLayoutParams) layoutParams);
            zeVar2.a = 1;
            return zeVar2;
        }
        ze zeVar3 = new ze(layoutParams);
        zeVar3.a = 1;
        return zeVar3;
    }

    private ColorStateList getBackgroundCSL() {
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) background).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return ye.b(background);
        }
        return null;
    }

    public final void a(af afVar) {
        if (this.u == null) {
            this.u = new ArrayList();
        }
        if (afVar == null || this.u.contains(afVar)) {
            return;
        }
        this.u.add(afVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ze generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ze zeVar = new ze(context, attributeSet);
        zeVar.a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.b);
        zeVar.a = typedArrayObtainStyledAttributes.getInt(1, 0);
        zeVar.b = typedArrayObtainStyledAttributes.getInt(0, 0) != 1 ? null : new qr2(2);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            zeVar.c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        return zeVar;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ze;
    }

    public final void d() {
        Behavior behavior = this.K;
        f fVarE = (behavior == null || this.o == -1 || this.s != 0) ? null : behavior.E(k.o, this);
        this.o = -1;
        this.p = -1;
        this.q = -1;
        if (fVarE != null) {
            Behavior behavior2 = this.K;
            if (behavior2.z != null) {
                return;
            }
            behavior2.z = fVarE;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.I == null || getTopInset() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.n);
        this.I.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.I;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i) {
        this.n = i;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = j65.a;
            postInvalidateOnAnimation();
        }
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                af afVar = (af) this.u.get(i2);
                if (afVar != null) {
                    afVar.a(i);
                }
            }
        }
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        this.s = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    public final boolean g(boolean z) {
        if (this.v || this.x == z) {
            return false;
        }
        this.x = z;
        refreshDrawableState();
        if (!this.y || !(getBackground() instanceof fi2)) {
            return true;
        }
        if (this.B != null) {
            i(z ? 0.0f : 255.0f, z ? 255.0f : 0.0f);
            return true;
        }
        float f = this.J;
        i(z ? 0.0f : f, z ? f : 0.0f);
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ze zeVar = new ze(-1, -2);
        zeVar.a = 1;
        return zeVar;
    }

    @Override // defpackage.ce0
    public de0 getBehavior() {
        Behavior behavior = new Behavior();
        this.K = behavior;
        return behavior;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                ze zeVar = (ze) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = zeVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) zeVar).topMargin + ((LinearLayout.LayoutParams) zeVar).bottomMargin;
                    if ((i3 & 8) != 0) {
                        WeakHashMap weakHashMap = j65.a;
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            WeakHashMap weakHashMap2 = j65.a;
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0) {
                            WeakHashMap weakHashMap3 = j65.a;
                            if (childAt.getFitsSystemWindows()) {
                                iMin = Math.min(iMin, measuredHeight - getTopInset());
                            }
                        }
                        i2 += iMin;
                    }
                    iMin = minimumHeight + i4;
                    if (childCount == 0) {
                        WeakHashMap weakHashMap4 = j65.a;
                        if (childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.p = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.q;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ze zeVar = (ze) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) zeVar).topMargin + ((LinearLayout.LayoutParams) zeVar).bottomMargin + childAt.getMeasuredHeight();
                int i3 = zeVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap = j65.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.q = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.z;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = j65.a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.s;
    }

    public Drawable getStatusBarForeground() {
        return this.I;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        pb5 pb5Var = this.t;
        if (pb5Var != null) {
            return pb5Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ze zeVar = (ze) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = zeVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                int topInset = measuredHeight + ((LinearLayout.LayoutParams) zeVar).topMargin + ((LinearLayout.LayoutParams) zeVar).bottomMargin + minimumHeight;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = j65.a;
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= getTopInset();
                    }
                }
                minimumHeight = topInset;
                if ((i3 & 2) != 0) {
                    WeakHashMap weakHashMap2 = j65.a;
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = Math.max(0, minimumHeight);
        this.o = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(View view) {
        int i;
        if (this.A == null && (i = this.z) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.z);
            }
            if (viewFindViewById != null) {
                this.A = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.A;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final void i(float f, float f2) {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.F);
        this.C.setInterpolator(this.G);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.D;
        if (animatorUpdateListener != null) {
            this.C.addUpdateListener(animatorUpdateListener);
        }
        this.C.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji2.P(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.H == null) {
            this.H = new int[4];
        }
        int[] iArr = this.H;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.w;
        int i2 = R.attr.state_liftable;
        if (!z) {
            i2 = -R.attr.state_liftable;
        }
        iArr[0] = i2;
        int i3 = R.attr.state_lifted;
        if (!z || !this.x) {
            i3 = -R.attr.state_lifted;
        }
        iArr[1] = i3;
        int i4 = R.attr.state_collapsible;
        if (!z) {
            i4 = -R.attr.state_collapsible;
        }
        iArr[2] = i4;
        int i5 = R.attr.state_collapsed;
        if (!z || !this.x) {
            i5 = -R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = j65.a;
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        d();
        this.r = false;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            if (((ze) getChildAt(i5).getLayoutParams()).c != null) {
                this.r = true;
                break;
            }
        }
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.v) {
            return;
        }
        if (!this.y) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 >= childCount3) {
                    z2 = false;
                    break;
                }
                int i7 = ((ze) getChildAt(i6).getLayoutParams()).a;
                if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        if (this.w != z2) {
            this.w = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = j65.a;
            if (getFitsSystemWindows() && getChildCount() > 0) {
                View childAt = getChildAt(0);
                if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                    int measuredHeight = getMeasuredHeight();
                    if (mode == Integer.MIN_VALUE) {
                        measuredHeight = su3.l(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                    } else if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                    setMeasuredDimension(getMeasuredWidth(), measuredHeight);
                }
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ji2.N(this, f);
    }

    public void setExpanded(boolean z) {
        WeakHashMap weakHashMap = j65.a;
        f(z, isLaidOut(), true);
    }

    public void setLiftOnScroll(boolean z) {
        this.y = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.z = -1;
        if (view != null) {
            this.A = new WeakReference(view);
            return;
        }
        WeakReference weakReference = this.A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A = null;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.z = i;
        WeakReference weakReference = this.A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A = null;
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.v = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
        } else {
            kf2.n("AppBarLayout is always vertical and does not support horizontal orientation");
        }
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.I;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.I = drawableMutate;
            boolean z = false;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.I.setState(getDrawableState());
                }
                Drawable drawable3 = this.I;
                WeakHashMap weakHashMap = j65.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.I.setVisible(getVisibility() == 0, false);
                this.I.setCallback(this);
            }
            if (this.I != null && getTopInset() > 0) {
                z = true;
            }
            setWillNotDraw(true ^ z);
            WeakHashMap weakHashMap2 = j65.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(zz1.r(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        xl.K(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.I;
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class BaseBehavior<T extends AppBarLayout> extends ql1 {
        public WeakReference A;
        public boolean B;
        public int w;
        public int x;
        public ValueAnimator y;
        public f z;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.s = -1;
            this.u = -1;
        }

        public static View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof i53) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005d  */
        public static void H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View childAt;
            boolean zH;
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = ((ze) childAt.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    WeakHashMap weakHashMap = j65.a;
                    int minimumHeight = childAt.getMinimumHeight();
                    zH = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zH = false;
                    }
                } else {
                    zH = false;
                }
            } else {
                zH = false;
            }
            if (appBarLayout.y) {
                zH = appBarLayout.h(C(coordinatorLayout));
            }
            boolean zG = appBarLayout.g(zH);
            if (!z) {
                if (zG) {
                    ArrayList arrayList = (ArrayList) ((yd4) coordinatorLayout.o.o).get(appBarLayout);
                    List arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
                    if (arrayList2 == null) {
                        arrayList2 = Collections.EMPTY_LIST;
                    }
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        de0 de0Var = ((ge0) ((View) arrayList2.get(i5)).getLayoutParams()).a;
                        if (de0Var instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) de0Var).s == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(y() - i);
            float fAbs = Math.abs(0.0f);
            int iRound = fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iY = y();
            ValueAnimator valueAnimator = this.y;
            if (iY == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.y.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.y = valueAnimator2;
                valueAnimator2.setInterpolator(yd.e);
                this.y.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.y.setDuration(Math.min(iRound, 600));
            this.y.setIntValues(iY, i);
            this.y.start();
        }

        /* JADX WARN: Code duplicated, block: B:9:0x002b  */
        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            AppBarLayout appBarLayout2;
            int i2;
            int downNestedPreScrollRange;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i2;
                } else {
                    i2 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i3 = i2;
                int i4 = downNestedPreScrollRange;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = z(coordinatorLayout, appBarLayout2, y() - i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.y) {
                appBarLayout2.g(appBarLayout2.h(view));
            }
        }

        public final f E(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iW = w();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iW;
                if (childAt.getTop() + iW <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = k.o;
                    }
                    f fVar = new f(parcelable);
                    boolean z = iW == 0;
                    fVar.q = z;
                    fVar.p = !z && (-iW) >= appBarLayout.getTotalScrollRange();
                    fVar.r = i;
                    WeakHashMap weakHashMap = j65.a;
                    fVar.t = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    fVar.s = bottom / childAt.getHeight();
                    return fVar;
                }
            }
            return null;
        }

        public final void F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int iY = y() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                ze zeVar = (ze) childAt.getLayoutParams();
                if ((zeVar.a & 32) == 32) {
                    top -= ((LinearLayout.LayoutParams) zeVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) zeVar).bottomMargin;
                }
                int i2 = -iY;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                ze zeVar2 = (ze) childAt2.getLayoutParams();
                int i3 = zeVar2.a;
                if ((i3 & 17) == 17) {
                    int topInset = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = j65.a;
                        if (appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                            topInset -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        WeakHashMap weakHashMap2 = j65.a;
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if ((i3 & 5) == 5) {
                        WeakHashMap weakHashMap3 = j65.a;
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iY < minimumHeight2) {
                            topInset = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if ((i3 & 32) == 32) {
                        topInset += ((LinearLayout.LayoutParams) zeVar2).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) zeVar2).bottomMargin;
                    }
                    if (iY < (minimumHeight + topInset) / 2) {
                        topInset = minimumHeight;
                    }
                    B(coordinatorLayout, appBarLayout, su3.l(topInset + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View childAt;
            BaseBehavior<T> baseBehavior;
            j65.l(coordinatorLayout, o3.j.a());
            boolean z = false;
            j65.i(coordinatorLayout, 0);
            j65.l(coordinatorLayout, o3.k.a());
            j65.i(coordinatorLayout, 0);
            if (appBarLayout.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = coordinatorLayout.getChildAt(i);
                if (((ge0) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    break;
                } else {
                    i++;
                }
            }
            View view = childAt;
            if (view == null) {
                return;
            }
            int childCount2 = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                if (((ze) appBarLayout.getChildAt(i2).getLayoutParams()).a != 0) {
                    if (j65.d(coordinatorLayout) == null) {
                        j65.o(coordinatorLayout, new b(this));
                    }
                    boolean z2 = true;
                    if (y() != (-appBarLayout.getTotalScrollRange())) {
                        j65.m(coordinatorLayout, o3.j, new d(appBarLayout, false));
                        z = true;
                    }
                    if (y() == 0) {
                        baseBehavior = this;
                        z2 = z;
                    } else if (view.canScrollVertically(-1)) {
                        int i3 = -appBarLayout.getDownNestedPreScrollRange();
                        if (i3 != 0) {
                            baseBehavior = this;
                            j65.m(coordinatorLayout, o3.k, new c(baseBehavior, coordinatorLayout, appBarLayout, view, i3));
                        } else {
                            baseBehavior = this;
                            z2 = z;
                        }
                    } else {
                        baseBehavior = this;
                        j65.m(coordinatorLayout, o3.k, new d(appBarLayout, true));
                    }
                    baseBehavior.B = z2;
                    return;
                }
            }
        }

        @Override // defpackage.g75, defpackage.de0
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
            int iRound;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.l(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            f fVar = this.z;
            if (fVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            B(coordinatorLayout, appBarLayout, i2);
                        } else {
                            A(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            B(coordinatorLayout, appBarLayout, 0);
                        } else {
                            A(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (fVar.p) {
                A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (fVar.q) {
                A(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(fVar.r);
                int i3 = -childAt.getBottom();
                if (this.z.t) {
                    WeakHashMap weakHashMap = j65.a;
                    iRound = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i3;
                } else {
                    iRound = Math.round(childAt.getHeight() * this.z.s) + i3;
                }
                A(coordinatorLayout, appBarLayout, iRound);
            }
            appBarLayout.s = 0;
            this.z = null;
            int iL = su3.l(w(), -appBarLayout.getTotalScrollRange(), 0);
            h75 h75Var = this.n;
            if (h75Var != null) {
                h75Var.b(iL);
            } else {
                this.o = iL;
            }
            H(coordinatorLayout, appBarLayout, w(), 0, true);
            appBarLayout.e(w());
            G(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.de0
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((ge0) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), appBarLayout);
            return true;
        }

        @Override // defpackage.de0
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // defpackage.de0
        public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = baseBehavior.z(coordinatorLayout2, appBarLayout, y() - i3, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
            }
            if (i3 == 0) {
                baseBehavior.G(coordinatorLayout2, appBarLayout);
            }
        }

        @Override // defpackage.de0
        public final void r(View view, Parcelable parcelable) {
            if (parcelable instanceof f) {
                this.z = (f) parcelable;
            } else {
                this.z = null;
            }
        }

        @Override // defpackage.de0
        public final Parcelable s(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            f fVarE = E(absSavedState, (AppBarLayout) view);
            return fVarE == null ? absSavedState : fVarE;
        }

        @Override // defpackage.de0
        public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = (i & 2) != 0 && (appBarLayout.y || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()));
            if (z && (valueAnimator = this.y) != null) {
                valueAnimator.cancel();
            }
            this.A = null;
            this.x = i2;
            return z;
        }

        @Override // defpackage.de0
        public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.x == 0 || i == 1) {
                F(coordinatorLayout, appBarLayout);
                if (appBarLayout.y) {
                    appBarLayout.g(appBarLayout.h(view2));
                }
            }
            this.A = new WeakReference(view2);
        }

        @Override // defpackage.ql1
        public final int y() {
            return w() + this.w;
        }

        @Override // defpackage.ql1
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int top;
            boolean zB;
            int topInset;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iY = y();
            int i4 = 0;
            if (i2 == 0 || iY < i2 || iY > i3) {
                this.w = 0;
            } else {
                int iL = su3.l(i, i2, i3);
                if (iY != iL) {
                    if (!appBarLayout.r) {
                        top = iL;
                        break;
                    }
                    int iAbs = Math.abs(iL);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            View childAt = appBarLayout.getChildAt(i5);
                            ze zeVar = (ze) childAt.getLayoutParams();
                            Interpolator interpolator = zeVar.c;
                            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i6 = zeVar.a;
                                    if ((i6 & 1) != 0) {
                                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) zeVar).topMargin + ((LinearLayout.LayoutParams) zeVar).bottomMargin;
                                        if ((i6 & 2) != 0) {
                                            WeakHashMap weakHashMap = j65.a;
                                            topInset -= childAt.getMinimumHeight();
                                        }
                                    } else {
                                        topInset = 0;
                                    }
                                    WeakHashMap weakHashMap2 = j65.a;
                                    if (childAt.getFitsSystemWindows()) {
                                        topInset -= appBarLayout.getTopInset();
                                    }
                                    if (topInset > 0) {
                                        float f = topInset;
                                        top = (childAt.getTop() + Math.round(interpolator.getInterpolation((iAbs - childAt.getTop()) / f) * f)) * Integer.signum(iL);
                                        break;
                                    }
                                }
                            } else {
                                i5++;
                            }
                        }
                        top = iL;
                        break;
                    }
                    h75 h75Var = this.n;
                    if (h75Var != null) {
                        zB = h75Var.b(top);
                    } else {
                        this.o = top;
                        zB = false;
                    }
                    int i7 = iY - iL;
                    this.w = iL - top;
                    int i8 = 1;
                    if (zB) {
                        int i9 = 0;
                        while (i9 < appBarLayout.getChildCount()) {
                            ze zeVar2 = (ze) appBarLayout.getChildAt(i9).getLayoutParams();
                            qr2 qr2Var = zeVar2.b;
                            if (qr2Var != null && (zeVar2.a & i8) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i9);
                                float fW = w();
                                Rect rect = (Rect) qr2Var.p;
                                Rect rect2 = (Rect) qr2Var.o;
                                childAt2.getDrawingRect(rect2);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect2);
                                rect2.offset(0, -appBarLayout.getTopInset());
                                float fAbs = rect2.top - Math.abs(fW);
                                if (fAbs <= 0.0f) {
                                    float fK = 1.0f - su3.k(Math.abs(fAbs / rect2.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (fK * fK)));
                                    childAt2.setTranslationY(fHeight);
                                    childAt2.getDrawingRect(rect);
                                    rect.offset(0, (int) (-fHeight));
                                    WeakHashMap weakHashMap3 = j65.a;
                                    childAt2.setClipBounds(rect);
                                } else {
                                    WeakHashMap weakHashMap4 = j65.a;
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                            i9++;
                            i8 = 1;
                        }
                    }
                    if (!zB && appBarLayout.r) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.e(w());
                    H(coordinatorLayout, appBarLayout, iL, iL < iY ? -1 : 1, false);
                    i4 = i7;
                }
            }
            G(coordinatorLayout, appBarLayout);
            return i4;
        }

        public BaseBehavior() {
            this.s = -1;
            this.u = -1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ze zeVar = new ze(-1, -2);
        zeVar.a = 1;
        return zeVar;
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class ScrollingViewBehavior extends rl1 {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.M);
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public static AppBarLayout z(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.de0
        public final boolean f(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.de0
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            de0 de0Var = ((ge0) view2.getLayoutParams()).a;
            if (de0Var instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) de0Var).w) + this.r) - y(view2);
                WeakHashMap weakHashMap = j65.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.y) {
                return false;
            }
            appBarLayout.g(appBarLayout.h(view));
            return false;
        }

        @Override // defpackage.de0
        public final void i(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                j65.l(coordinatorLayout, o3.j.a());
                j65.i(coordinatorLayout, 0);
                j65.l(coordinatorLayout, o3.k.a());
                j65.i(coordinatorLayout, 0);
                j65.o(coordinatorLayout, null);
            }
        }

        @Override // defpackage.de0
        public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutZ = z(coordinatorLayout.k(view));
            if (appBarLayoutZ != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.p;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayoutZ.f(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
