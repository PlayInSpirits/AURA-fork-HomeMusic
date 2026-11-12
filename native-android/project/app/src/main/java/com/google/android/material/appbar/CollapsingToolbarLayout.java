package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import app.homemusic.R;
import defpackage.a65;
import defpackage.ep0;
import defpackage.g12;
import defpackage.h12;
import defpackage.h75;
import defpackage.ht3;
import defpackage.j65;
import defpackage.k40;
import defpackage.l40;
import defpackage.m40;
import defpackage.n40;
import defpackage.nz0;
import defpackage.pb5;
import defpackage.qq;
import defpackage.su3;
import defpackage.uc5;
import defpackage.yd;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public boolean A;
    public Drawable B;
    public Drawable C;
    public int D;
    public boolean E;
    public ValueAnimator F;
    public long G;
    public final TimeInterpolator H;
    public final TimeInterpolator I;
    public int J;
    public m40 K;
    public int L;
    public int M;
    public pb5 N;
    public int O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean n;
    public final int o;
    public ViewGroup p;
    public View q;
    public View r;
    public int s;
    public int t;
    public int u;
    public int v;
    public final Rect w;
    public final k40 x;
    public final nz0 y;
    public boolean z;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList colorStateListS;
        ColorStateList colorStateListS2;
        super(su3.H(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        this.n = true;
        this.w = new Rect();
        this.J = -1;
        this.O = 0;
        this.Q = 0;
        Context context2 = getContext();
        k40 k40Var = new k40(this);
        this.x = k40Var;
        k40Var.W = yd.e;
        k40Var.i(false);
        k40Var.J = false;
        this.y = new nz0(context2);
        uc5.c(context2, attributeSet, i, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = ht3.k;
        uc5.g(context2, attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar);
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 8388691);
        if (k40Var.j != i3) {
            k40Var.j = i3;
            k40Var.i(false);
        }
        k40Var.l(typedArrayObtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.v = dimensionPixelSize;
        this.u = dimensionPixelSize;
        this.t = dimensionPixelSize;
        this.s = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.z = typedArrayObtainStyledAttributes.getBoolean(20, true);
        setTitle(typedArrayObtainStyledAttributes.getText(18));
        k40Var.n(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        k40Var.k(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            k40Var.n(typedArrayObtainStyledAttributes.getResourceId(10, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            k40Var.k(typedArrayObtainStyledAttributes.getResourceId(1, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            int i4 = typedArrayObtainStyledAttributes.getInt(22, -1);
            setTitleEllipsize(i4 != 0 ? i4 != 1 ? i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11) && k40Var.n != (colorStateListS2 = h12.s(context2, typedArrayObtainStyledAttributes, 11))) {
            k40Var.n = colorStateListS2;
            k40Var.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2) && k40Var.o != (colorStateListS = h12.s(context2, typedArrayObtainStyledAttributes, 2))) {
            k40Var.o = colorStateListS;
            k40Var.i(false);
        }
        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (typedArrayObtainStyledAttributes.hasValue(14) && (i2 = typedArrayObtainStyledAttributes.getInt(14, 1)) != k40Var.n0) {
            k40Var.n0 = i2;
            Bitmap bitmap = k40Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                k40Var.K = null;
            }
            k40Var.i(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            k40Var.V = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(21, 0));
            k40Var.i(false);
        }
        this.G = typedArrayObtainStyledAttributes.getInt(15, 600);
        this.H = g12.O(context2, R.attr.motionEasingStandardInterpolator, yd.c);
        this.I = g12.O(context2, R.attr.motionEasingStandardInterpolator, yd.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(19, 0));
        this.o = typedArrayObtainStyledAttributes.getResourceId(23, -1);
        this.P = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.R = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        zh0 zh0Var = new zh0(14, this);
        WeakHashMap weakHashMap = j65.a;
        a65.c(this, zh0Var);
    }

    public static h75 b(View view) {
        h75 h75Var = (h75) view.getTag(R.id.view_offset_helper);
        if (h75Var != null) {
            return h75Var;
        }
        h75 h75Var2 = new h75(view);
        view.setTag(R.id.view_offset_helper, h75Var2);
        return h75Var2;
    }

    public final void a() {
        View view;
        if (this.n) {
            ViewGroup viewGroup = null;
            this.p = null;
            this.q = null;
            int i = this.o;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.p = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    while (true) {
                        if (parent == this) {
                            view = viewGroup2;
                            break;
                        } else {
                            if (parent == null) {
                                break;
                            }
                            if (parent instanceof View) {
                                view = (View) parent;
                            }
                            parent = parent.getParent();
                            view = view;
                        }
                    }
                    this.q = view;
                }
            }
            if (this.p == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.p = viewGroup;
            }
            c();
            this.n = false;
        }
    }

    public final void c() {
        View view;
        if (!this.z && (view = this.r) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.r);
            }
        }
        if (!this.z || this.p == null) {
            return;
        }
        if (this.r == null) {
            this.r = new View(getContext());
        }
        if (this.r.getParent() == null) {
            this.p.addView(this.r, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l40;
    }

    public final void d() {
        if (this.B == null && this.C == null) {
            return;
        }
        setScrimsShown(getHeight() + this.L < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.p == null && (drawable = this.B) != null && this.D > 0) {
            drawable.mutate().setAlpha(this.D);
            this.B.draw(canvas);
        }
        if (this.z && this.A) {
            ViewGroup viewGroup = this.p;
            k40 k40Var = this.x;
            if (viewGroup == null || this.B == null || this.D <= 0 || this.M != 1 || k40Var.b >= k40Var.e) {
                k40Var.d(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.B.getBounds(), Region.Op.DIFFERENCE);
                k40Var.d(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.C == null || this.D <= 0) {
            return;
        }
        pb5 pb5Var = this.N;
        int iD = pb5Var != null ? pb5Var.d() : 0;
        if (iD > 0) {
            this.C.setBounds(0, -this.L, getWidth(), iD - this.L);
            this.C.mutate().setAlpha(this.D);
            this.C.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.B;
        if (drawable == null || this.D <= 0 || ((view2 = this.q) == null || view2 == this ? view != this.p : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.M == 1 && view != null && this.z) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.B.mutate().setAlpha(this.D);
            this.B.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.C;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.B;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        k40 k40Var = this.x;
        if (k40Var != null) {
            k40Var.R = drawableState;
            ColorStateList colorStateList2 = k40Var.o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = k40Var.n) != null && colorStateList.isStateful())) {
                k40Var.i(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.z || (view = this.r) == null) {
            return;
        }
        WeakHashMap weakHashMap = j65.a;
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.r.getVisibility() == 0;
        this.A = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.q;
            if (view2 == null) {
                view2 = this.p;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((l40) view2.getLayoutParams())).bottomMargin;
            View view3 = this.r;
            Rect rect = this.w;
            ep0.a(this, view3, rect);
            ViewGroup viewGroup = this.p;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            } else {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.top + height + titleMarginTop;
            int i7 = rect.right;
            if (!z3) {
                titleMarginStart = titleMarginEnd;
            }
            int i8 = i7 - titleMarginStart;
            int i9 = (rect.bottom + height) - titleMarginBottom;
            k40 k40Var = this.x;
            Rect rect2 = k40Var.h;
            if (rect2.left != i5 || rect2.top != i6 || rect2.right != i8 || rect2.bottom != i9) {
                rect2.set(i5, i6, i8, i9);
                k40Var.S = true;
            }
            int i10 = z3 ? this.u : this.s;
            int i11 = rect.top + this.t;
            int i12 = (i3 - i) - (z3 ? this.s : this.u);
            int i13 = (i4 - i2) - this.v;
            Rect rect3 = k40Var.g;
            if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                rect3.set(i10, i11, i12, i13);
                k40Var.S = true;
            }
            k40Var.i(z);
        }
    }

    public final void f() {
        CharSequence title;
        if (this.p != null && this.z && TextUtils.isEmpty(this.x.G)) {
            ViewGroup viewGroup = this.p;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).getTitle();
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            setTitle(title);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l40 l40Var = new l40(-1, -1);
        l40Var.a = 0;
        l40Var.b = 0.5f;
        return l40Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        l40 l40Var = new l40(context, attributeSet);
        l40Var.a = 0;
        l40Var.b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.l);
        l40Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        l40Var.b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
        return l40Var;
    }

    public int getCollapsedTitleGravity() {
        return this.x.k;
    }

    public float getCollapsedTitleTextSize() {
        return this.x.m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.x.w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.B;
    }

    public int getExpandedTitleGravity() {
        return this.x.j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.v;
    }

    public int getExpandedTitleMarginEnd() {
        return this.u;
    }

    public int getExpandedTitleMarginStart() {
        return this.s;
    }

    public int getExpandedTitleMarginTop() {
        return this.t;
    }

    public float getExpandedTitleTextSize() {
        return this.x.l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.x.z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.x.q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.x.i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.x.i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.x.i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.x.n0;
    }

    public int getScrimAlpha() {
        return this.D;
    }

    public long getScrimAnimationDuration() {
        return this.G;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.J;
        if (i >= 0) {
            return i + this.O + this.Q;
        }
        pb5 pb5Var = this.N;
        int iD = pb5Var != null ? pb5Var.d() : 0;
        WeakHashMap weakHashMap = j65.a;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.C;
    }

    public CharSequence getTitle() {
        if (this.z) {
            return this.x.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.M;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.x.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.x.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.M == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = j65.a;
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.K == null) {
                this.K = new m40(this);
            }
            appBarLayout.a(this.K);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.x.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        m40 m40Var = this.K;
        if (m40Var != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).u) != null) {
            arrayList.remove(m40Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pb5 pb5Var = this.N;
        if (pb5Var != null) {
            int iD = pb5Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                WeakHashMap weakHashMap = j65.a;
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            h75 h75VarB = b(getChildAt(i6));
            View view = h75VarB.a;
            h75VarB.b = view.getTop();
            h75VarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        pb5 pb5Var = this.N;
        int iD = pb5Var != null ? pb5Var.d() : 0;
        if ((mode == 0 || this.P) && iD > 0) {
            this.O = iD;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iD, 1073741824));
        }
        if (this.R) {
            k40 k40Var = this.x;
            if (k40Var.n0 > 1) {
                f();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), getMeasuredHeight());
                int i3 = k40Var.p;
                if (i3 > 1) {
                    TextPaint textPaint = k40Var.U;
                    textPaint.setTextSize(k40Var.l);
                    textPaint.setTypeface(k40Var.z);
                    textPaint.setLetterSpacing(k40Var.g0);
                    collapsingToolbarLayout.Q = (i3 - 1) * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(collapsingToolbarLayout.getMeasuredHeight() + collapsingToolbarLayout.Q, 1073741824));
                }
            } else {
                collapsingToolbarLayout = this;
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.p;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.q;
            if (view == null || view == collapsingToolbarLayout) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                collapsingToolbarLayout.setMinimumHeight(measuredHeight);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight2 = view.getMeasuredHeight();
            }
            collapsingToolbarLayout.setMinimumHeight(measuredHeight2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.B;
        if (drawable != null) {
            ViewGroup viewGroup = this.p;
            if (this.M == 1 && viewGroup != null && this.z) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.x.l(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.x.k(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        k40 k40Var = this.x;
        if (k40Var.o != colorStateList) {
            k40Var.o = colorStateList;
            k40Var.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        k40 k40Var = this.x;
        if (k40Var.m != f) {
            k40Var.m = f;
            k40Var.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        k40 k40Var = this.x;
        if (k40Var.m(typeface)) {
            k40Var.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.p;
                if (this.M == 1 && viewGroup != null && this.z) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.B.setCallback(this);
                this.B.setAlpha(this.D);
            }
            WeakHashMap weakHashMap = j65.a;
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        k40 k40Var = this.x;
        if (k40Var.j != i) {
            k40Var.j = i;
            k40Var.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.v = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.u = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.s = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.t = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.x.n(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        k40 k40Var = this.x;
        if (k40Var.n != colorStateList) {
            k40Var.n = colorStateList;
            k40Var.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        k40 k40Var = this.x;
        if (k40Var.l != f) {
            k40Var.l = f;
            k40Var.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        k40 k40Var = this.x;
        if (k40Var.o(typeface)) {
            k40Var.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.R = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.P = z;
    }

    public void setHyphenationFrequency(int i) {
        this.x.q0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.x.o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.x.p0 = f;
    }

    public void setMaxLines(int i) {
        k40 k40Var = this.x;
        if (i != k40Var.n0) {
            k40Var.n0 = i;
            Bitmap bitmap = k40Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                k40Var.K = null;
            }
            k40Var.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.x.J = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.D) {
            if (this.B != null && (viewGroup = this.p) != null) {
                WeakHashMap weakHashMap = j65.a;
                viewGroup.postInvalidateOnAnimation();
            }
            this.D = i;
            WeakHashMap weakHashMap2 = j65.a;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.G = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.J != i) {
            this.J = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        WeakHashMap weakHashMap = j65.a;
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.E != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.F;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.F = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.D ? this.H : this.I);
                    this.F.addUpdateListener(new qq(2, this));
                } else if (valueAnimator.isRunning()) {
                    this.F.cancel();
                }
                this.F.setDuration(this.G);
                this.F.setIntValues(this.D, i);
                this.F.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.E = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(n40 n40Var) {
        k40 k40Var = this.x;
        if (n40Var != null) {
            k40Var.i(true);
        } else {
            k40Var.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.C;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.C = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.C.setState(getDrawableState());
                }
                Drawable drawable3 = this.C;
                WeakHashMap weakHashMap = j65.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.C.setVisible(getVisibility() == 0, false);
                this.C.setCallback(this);
                this.C.setAlpha(this.D);
            }
            WeakHashMap weakHashMap2 = j65.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        k40 k40Var = this.x;
        if (charSequence == null || !TextUtils.equals(k40Var.G, charSequence)) {
            k40Var.G = charSequence;
            k40Var.H = null;
            Bitmap bitmap = k40Var.K;
            if (bitmap != null) {
                bitmap.recycle();
                k40Var.K = null;
            }
            k40Var.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.M = i;
        boolean z = i == 1;
        this.x.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.M == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.B == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            nz0 nz0Var = this.y;
            setContentScrimColor(nz0Var.b(nz0Var.d, dimension));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        k40 k40Var = this.x;
        k40Var.F = truncateAt;
        k40Var.i(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.z) {
            this.z = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        k40 k40Var = this.x;
        k40Var.V = timeInterpolator;
        k40Var.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.C;
        if (drawable != null && drawable.isVisible() != z) {
            this.C.setVisible(z, false);
        }
        Drawable drawable2 = this.B;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.B.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B || drawable == this.C;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        l40 l40Var = new l40(-1, -1);
        l40Var.a = 0;
        l40Var.b = 0.5f;
        return l40Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l40 l40Var = new l40(layoutParams);
        l40Var.a = 0;
        l40Var.b = 0.5f;
        return l40Var;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }
}
