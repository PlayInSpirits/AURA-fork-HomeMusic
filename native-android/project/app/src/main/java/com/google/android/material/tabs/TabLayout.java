package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;
import defpackage.cc3;
import defpackage.fi2;
import defpackage.g12;
import defpackage.h12;
import defpackage.hq4;
import defpackage.ht3;
import defpackage.iq4;
import defpackage.j65;
import defpackage.ji2;
import defpackage.jo3;
import defpackage.jq4;
import defpackage.kf2;
import defpackage.ko3;
import defpackage.kq4;
import defpackage.lz0;
import defpackage.mq4;
import defpackage.qq;
import defpackage.r75;
import defpackage.st3;
import defpackage.su3;
import defpackage.t3;
import defpackage.uc5;
import defpackage.ud3;
import defpackage.vr1;
import defpackage.xi4;
import defpackage.yd;
import defpackage.zz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {
    public static final ko3 e0 = new ko3(16);
    public ColorStateList A;
    public Drawable B;
    public int C;
    public final float D;
    public final float E;
    public final int F;
    public int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public final int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public boolean T;
    public xi4 U;
    public final TimeInterpolator V;
    public hq4 W;
    public final ArrayList a0;
    public ValueAnimator b0;
    public int c0;
    public final jo3 d0;
    public int n;
    public final ArrayList o;
    public kq4 p;
    public final jq4 q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public ColorStateList y;
    public ColorStateList z;

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.n = -1;
        this.o = new ArrayList();
        this.x = -1;
        this.C = 0;
        this.G = Integer.MAX_VALUE;
        this.R = -1;
        this.a0 = new ArrayList();
        this.d0 = new jo3(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        jq4 jq4Var = new jq4(this, context2);
        this.q = jq4Var;
        super.addView(jq4Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = uc5.D(context2, attributeSet, ht3.U, i, R.style.Widget_Design_TabLayout, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            fi2 fi2Var = new fi2();
            fi2Var.m(ColorStateList.valueOf(colorDrawable.getColor()));
            fi2Var.j(context2);
            WeakHashMap weakHashMap = j65.a;
            fi2Var.l(getElevation());
            setBackground(fi2Var);
        }
        setSelectedTabIndicator(h12.v(context2, typedArrayD, 5));
        setSelectedTabIndicatorColor(typedArrayD.getColor(8, 0));
        jq4Var.b(typedArrayD.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(9, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(16, 0);
        this.u = dimensionPixelSize;
        this.t = dimensionPixelSize;
        this.s = dimensionPixelSize;
        this.r = dimensionPixelSize;
        this.r = typedArrayD.getDimensionPixelSize(19, dimensionPixelSize);
        this.s = typedArrayD.getDimensionPixelSize(20, dimensionPixelSize);
        this.t = typedArrayD.getDimensionPixelSize(18, dimensionPixelSize);
        this.u = typedArrayD.getDimensionPixelSize(17, dimensionPixelSize);
        if (zz1.E(context2, R.attr.isMaterial3Theme, false)) {
            this.v = R.attr.textAppearanceTitleSmall;
        } else {
            this.v = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.w = resourceId;
        int[] iArr = st3.y;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.D = dimensionPixelSize2;
            this.y = h12.s(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(22)) {
                this.x = typedArrayD.getResourceId(22, resourceId);
            }
            int i2 = this.x;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i2 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i2, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListS = h12.s(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListS != null) {
                        this.y = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListS.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListS.getDefaultColor()), this.y.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayD.hasValue(25)) {
                this.y = h12.s(context2, typedArrayD, 25);
            }
            if (typedArrayD.hasValue(23)) {
                this.y = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayD.getColor(23, 0), this.y.getDefaultColor()});
            }
            this.z = h12.s(context2, typedArrayD, 3);
            vr1.B(typedArrayD.getInt(4, -1), null);
            this.A = h12.s(context2, typedArrayD, 21);
            this.M = typedArrayD.getInt(6, 300);
            this.V = g12.O(context2, R.attr.motionEasingEmphasizedInterpolator, yd.b);
            this.H = typedArrayD.getDimensionPixelSize(14, -1);
            this.I = typedArrayD.getDimensionPixelSize(13, -1);
            this.F = typedArrayD.getResourceId(0, 0);
            this.K = typedArrayD.getDimensionPixelSize(1, 0);
            this.O = typedArrayD.getInt(15, 1);
            this.L = typedArrayD.getInt(2, 0);
            this.P = typedArrayD.getBoolean(12, false);
            this.T = typedArrayD.getBoolean(26, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.E = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.J = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.H;
        if (i != -1) {
            return i;
        }
        int i2 = this.O;
        if (i2 == 0 || i2 == 2) {
            return this.J;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        jq4 jq4Var = this.q;
        int childCount = jq4Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = jq4Var.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof mq4) {
                        ((mq4) childAt).f();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(kq4 kq4Var, boolean z) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        if (kq4Var.d != this) {
            kf2.n("Tab belongs to a different TabLayout.");
            return;
        }
        kq4Var.b = size;
        arrayList.add(size, kq4Var);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((kq4) arrayList.get(i2)).b == this.n) {
                i = i2;
            }
            ((kq4) arrayList.get(i2)).b = i2;
        }
        this.n = i;
        mq4 mq4Var = kq4Var.e;
        mq4Var.setSelected(false);
        mq4Var.setActivated(false);
        int i3 = kq4Var.b;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.O == 1 && this.L == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.q.addView(mq4Var, i3, layoutParams);
        if (z) {
            TabLayout tabLayout = kq4Var.d;
            if (tabLayout != null) {
                tabLayout.i(kq4Var, true);
            } else {
                kf2.n("Tab not attached to a TabLayout");
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void b(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = j65.a;
            if (isLaidOut()) {
                jq4 jq4Var = this.q;
                int childCount = jq4Var.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (jq4Var.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iD = d(i, 0.0f);
                if (scrollX != iD) {
                    e();
                    this.b0.setIntValues(scrollX, iD);
                    this.b0.start();
                }
                ValueAnimator valueAnimator = jq4Var.n;
                if (valueAnimator != null && valueAnimator.isRunning() && jq4Var.o.n != i) {
                    jq4Var.n.cancel();
                }
                jq4Var.d(i, this.M, true);
                return;
            }
        }
        j(i, 0.0f, true, true, true);
    }

    public final void c() {
        int i = this.O;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.K - this.r) : 0;
        WeakHashMap weakHashMap = j65.a;
        jq4 jq4Var = this.q;
        jq4Var.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.O;
        if (i2 == 0) {
            int i3 = this.L;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                jq4Var.setGravity(1);
            } else if (i3 == 2) {
            }
            jq4Var.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.L == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            jq4Var.setGravity(1);
        }
        k(true);
    }

    public final int d(int i, float f) {
        jq4 jq4Var;
        View childAt;
        int i2 = this.O;
        if ((i2 != 0 && i2 != 2) || (childAt = (jq4Var = this.q).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < jq4Var.getChildCount() ? jq4Var.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        WeakHashMap weakHashMap = j65.a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void e() {
        if (this.b0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.b0 = valueAnimator;
            valueAnimator.setInterpolator(this.V);
            this.b0.setDuration(this.M);
            this.b0.addUpdateListener(new qq(6, this));
        }
    }

    public final kq4 f(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (kq4) this.o.get(i);
    }

    public final kq4 g() {
        kq4 kq4Var = (kq4) e0.b();
        if (kq4Var == null) {
            kq4Var = new kq4();
            kq4Var.b = -1;
        }
        kq4Var.d = this;
        jo3 jo3Var = this.d0;
        mq4 mq4Var = jo3Var != null ? (mq4) jo3Var.b() : null;
        if (mq4Var == null) {
            mq4Var = new mq4(this, getContext());
        }
        mq4Var.setTab(kq4Var);
        mq4Var.setFocusable(true);
        mq4Var.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(null)) {
            mq4Var.setContentDescription(kq4Var.a);
        } else {
            mq4Var.setContentDescription(null);
        }
        kq4Var.e = mq4Var;
        return kq4Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        kq4 kq4Var = this.p;
        if (kq4Var != null) {
            return kq4Var.b;
        }
        return -1;
    }

    public int getTabCount() {
        return this.o.size();
    }

    public int getTabGravity() {
        return this.L;
    }

    public ColorStateList getTabIconTint() {
        return this.z;
    }

    public int getTabIndicatorAnimationMode() {
        return this.S;
    }

    public int getTabIndicatorGravity() {
        return this.N;
    }

    public int getTabMaxWidth() {
        return this.G;
    }

    public int getTabMode() {
        return this.O;
    }

    public ColorStateList getTabRippleColor() {
        return this.A;
    }

    public Drawable getTabSelectedIndicator() {
        return this.B;
    }

    public ColorStateList getTabTextColors() {
        return this.y;
    }

    public final void h() {
        jq4 jq4Var = this.q;
        int childCount = jq4Var.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            mq4 mq4Var = (mq4) jq4Var.getChildAt(childCount);
            jq4Var.removeViewAt(childCount);
            if (mq4Var != null) {
                mq4Var.setTab(null);
                mq4Var.setSelected(false);
                this.d0.a(mq4Var);
            }
            requestLayout();
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            kq4 kq4Var = (kq4) it.next();
            it.remove();
            kq4Var.d = null;
            kq4Var.e = null;
            kq4Var.a = null;
            kq4Var.b = -1;
            kq4Var.c = null;
            e0.a(kq4Var);
        }
        this.p = null;
    }

    public final void i(kq4 kq4Var, boolean z) {
        TabLayout tabLayout;
        kq4 kq4Var2 = this.p;
        ArrayList arrayList = this.a0;
        if (kq4Var2 == kq4Var) {
            if (kq4Var2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((hq4) arrayList.get(size)).b(kq4Var);
                }
                b(kq4Var.b);
                return;
            }
            return;
        }
        int i = kq4Var != null ? kq4Var.b : -1;
        if (z) {
            if ((kq4Var2 == null || kq4Var2.b == -1) && i != -1) {
                tabLayout = this;
                tabLayout.j(i, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                tabLayout.b(i);
            }
            if (i != -1) {
                tabLayout.setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.p = kq4Var;
        if (kq4Var2 != null && kq4Var2.d != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((hq4) arrayList.get(size2)).a(kq4Var2);
            }
        }
        if (kq4Var != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((hq4) arrayList.get(size3)).c(kq4Var);
            }
        }
    }

    public final void j(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            jq4 jq4Var = this.q;
            if (iRound >= jq4Var.getChildCount()) {
                return;
            }
            if (z2) {
                jq4Var.o.n = Math.round(f2);
                ValueAnimator valueAnimator = jq4Var.n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    jq4Var.n.cancel();
                }
                jq4Var.c(jq4Var.getChildAt(i), jq4Var.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.b0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.b0.cancel();
            }
            int iD = d(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iD >= scrollX) || (i > getSelectedTabPosition() && iD <= scrollX) || i == getSelectedTabPosition();
            WeakHashMap weakHashMap = j65.a;
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iD <= scrollX) || (i > getSelectedTabPosition() && iD >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.c0 == 1 || z3) {
                if (i < 0) {
                    iD = 0;
                }
                scrollTo(iD, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void k(boolean z) {
        int i = 0;
        while (true) {
            jq4 jq4Var = this.q;
            if (i >= jq4Var.getChildCount()) {
                return;
            }
            View childAt = jq4Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.O == 1 && this.L == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ji2.P(this);
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        mq4 mq4Var;
        Drawable drawable;
        int i = 0;
        while (true) {
            jq4 jq4Var = this.q;
            if (i >= jq4Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = jq4Var.getChildAt(i);
            if ((childAt instanceof mq4) && (drawable = (mq4Var = (mq4) childAt).v) != null) {
                drawable.setBounds(mq4Var.getLeft(), mq4Var.getTop(), mq4Var.getRight(), mq4Var.getBottom());
                mq4Var.v.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t3.a(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iRound = Math.round(vr1.l(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iL = this.I;
            if (iL <= 0) {
                iL = (int) (size - vr1.l(getContext(), 56));
            }
            this.G = iL;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.O;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ji2.N(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.P == z) {
            return;
        }
        this.P = z;
        int i = 0;
        while (true) {
            jq4 jq4Var = this.q;
            if (i >= jq4Var.getChildCount()) {
                c();
                return;
            }
            View childAt = jq4Var.getChildAt(i);
            if (childAt instanceof mq4) {
                mq4 mq4Var = (mq4) childAt;
                mq4Var.setOrientation(!mq4Var.x.P ? 1 : 0);
                TextView textView = mq4Var.t;
                if (textView == null && mq4Var.u == null) {
                    mq4Var.g(mq4Var.o, mq4Var.p, true);
                } else {
                    mq4Var.g(textView, mq4Var.u, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(hq4 hq4Var) {
        hq4 hq4Var2 = this.W;
        ArrayList arrayList = this.a0;
        if (hq4Var2 != null) {
            arrayList.remove(hq4Var2);
        }
        this.W = hq4Var;
        if (hq4Var == null || arrayList.contains(hq4Var)) {
            return;
        }
        arrayList.add(hq4Var);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.b0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.B = drawableMutate;
        int i = this.C;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.R;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.B.getIntrinsicHeight();
        }
        this.q.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.C = i;
        Drawable drawable = this.B;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        k(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.N != i) {
            this.N = i;
            WeakHashMap weakHashMap = j65.a;
            this.q.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.R = i;
        this.q.b(i);
    }

    public void setTabGravity(int i) {
        if (this.L != i) {
            this.L = i;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            ArrayList arrayList = this.o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mq4 mq4Var = ((kq4) arrayList.get(i)).e;
                if (mq4Var != null) {
                    mq4Var.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(ud3.n(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.S = i;
        if (i == 0) {
            this.U = new xi4(19);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            this.U = new lz0(0);
        } else {
            if (i == 2) {
                this.U = new lz0(i2);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.Q = z;
        int i = jq4.p;
        jq4 jq4Var = this.q;
        jq4Var.a(jq4Var.o.getSelectedTabPosition());
        WeakHashMap weakHashMap = j65.a;
        jq4Var.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.O) {
            this.O = i;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A == colorStateList) {
            return;
        }
        this.A = colorStateList;
        int i = 0;
        while (true) {
            jq4 jq4Var = this.q;
            if (i >= jq4Var.getChildCount()) {
                return;
            }
            View childAt = jq4Var.getChildAt(i);
            if (childAt instanceof mq4) {
                Context context = getContext();
                int i2 = mq4.y;
                ((mq4) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(ud3.n(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            ArrayList arrayList = this.o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mq4 mq4Var = ((kq4) arrayList.get(i)).e;
                if (mq4Var != null) {
                    mq4Var.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(cc3 cc3Var) {
        h();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        int i = 0;
        while (true) {
            jq4 jq4Var = this.q;
            if (i >= jq4Var.getChildCount()) {
                return;
            }
            View childAt = jq4Var.getChildAt(i);
            if (childAt instanceof mq4) {
                Context context = getContext();
                int i2 = mq4.y;
                ((mq4) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(r75 r75Var) {
        h();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Deprecated
    public void setOnTabSelectedListener(iq4 iq4Var) {
        setOnTabSelectedListener((hq4) iq4Var);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(zz1.r(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
