package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.a5;
import defpackage.b5;
import defpackage.d34;
import defpackage.e85;
import defpackage.fv2;
import defpackage.iv2;
import defpackage.ou2;
import defpackage.pu2;
import defpackage.qu2;
import defpackage.rv2;
import defpackage.t4;
import defpackage.tu2;
import defpackage.v4;
import defpackage.xk0;
import defpackage.y4;
import defpackage.ya2;
import defpackage.z4;
import defpackage.za2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends za2 implements pu2, iv2 {
    public qu2 C;
    public Context D;
    public int E;
    public boolean F;
    public y4 G;
    public xk0 H;
    public ou2 I;
    public boolean J;
    public int K;
    public final int L;
    public final int M;
    public b5 N;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.L = (int) (56.0f * f);
        this.M = (int) (f * 4.0f);
        this.D = context;
        this.E = 0;
    }

    public static a5 j() {
        a5 a5Var = new a5(-2, -2);
        a5Var.a = false;
        ((LinearLayout.LayoutParams) a5Var).gravity = 16;
        return a5Var;
    }

    public static a5 k(ViewGroup.LayoutParams layoutParams) {
        a5 a5Var;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof a5) {
            a5 a5Var2 = (a5) layoutParams;
            a5Var = new a5(a5Var2);
            a5Var.a = a5Var2.a;
        } else {
            a5Var = new a5(layoutParams);
        }
        if (((LinearLayout.LayoutParams) a5Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) a5Var).gravity = 16;
        }
        return a5Var;
    }

    @Override // defpackage.pu2
    public final boolean a(tu2 tu2Var) {
        return this.C.q(tu2Var, null, 0);
    }

    @Override // defpackage.iv2
    public final void b(qu2 qu2Var) {
        this.C = qu2Var;
    }

    @Override // defpackage.za2, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a5;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.za2
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ ya2 generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.za2
    /* JADX INFO: renamed from: g */
    public final ya2 generateLayoutParams(AttributeSet attributeSet) {
        return new a5(getContext(), attributeSet);
    }

    @Override // defpackage.za2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.za2, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a5(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.C == null) {
            Context context = getContext();
            qu2 qu2Var = new qu2(context);
            this.C = qu2Var;
            qu2Var.e = new d34(3, this);
            y4 y4Var = new y4(context);
            this.G = y4Var;
            y4Var.z = true;
            y4Var.A = true;
            fv2 rv2Var = this.H;
            if (rv2Var == null) {
                rv2Var = new rv2(24);
            }
            y4Var.r = rv2Var;
            this.C.b(y4Var, this.D);
            y4 y4Var2 = this.G;
            y4Var2.u = this;
            this.C = y4Var2.p;
        }
        return this.C;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        y4 y4Var = this.G;
        v4 v4Var = y4Var.w;
        if (v4Var != null) {
            return v4Var.getDrawable();
        }
        if (y4Var.y) {
            return y4Var.x;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.E;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.za2
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ ya2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof z4)) {
            zA = ((z4) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof z4)) ? zA : ((z4) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y4 y4Var = this.G;
        if (y4Var != null) {
            y4Var.c(false);
            if (this.G.k()) {
                this.G.f();
                this.G.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y4 y4Var = this.G;
        if (y4Var != null) {
            y4Var.f();
            t4 t4Var = y4Var.H;
            if (t4Var == null || !t4Var.b()) {
                return;
            }
            t4Var.i.dismiss();
        }
    }

    @Override // defpackage.za2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.J) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = e85.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                a5 a5Var = (a5) childAt.getLayoutParams();
                if (a5Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) a5Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) a5Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) a5Var).leftMargin) + ((LinearLayout.LayoutParams) a5Var).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                a5 a5Var2 = (a5) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !a5Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) a5Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) a5Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            a5 a5Var3 = (a5) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !a5Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) a5Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) a5Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.za2, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        qu2 qu2Var;
        boolean z = this.J;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.J = z2;
        if (z != z2) {
            this.K = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.J && (qu2Var = this.C) != null && size != this.K) {
            this.K = size;
            qu2Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.J || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                a5 a5Var = (a5) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) a5Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) a5Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.L;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.M;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                a5 a5Var2 = (a5) childAt.getLayoutParams();
                a5Var2.f = false;
                a5Var2.c = 0;
                a5Var2.b = 0;
                a5Var2.d = false;
                ((LinearLayout.LayoutParams) a5Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) a5Var2).rightMargin = 0;
                a5Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = a5Var2.a ? 1 : i10;
                a5 a5Var3 = (a5) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                a5Var3.d = !a5Var3.a && z6;
                a5Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (a5Var2.d) {
                    i15++;
                }
                if (a5Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                a5 a5Var4 = (a5) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (a5Var4.d) {
                    int i28 = a5Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                a5 a5Var5 = (a5) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && a5Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    a5Var5.b += r11;
                    a5Var5.f = r11;
                    i23--;
                } else if (a5Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((a5) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((a5) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    a5 a5Var6 = (a5) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        a5Var6.c = i32;
                        a5Var6.f = true;
                        if (i33 == 0 && !a5Var6.e) {
                            ((LinearLayout.LayoutParams) a5Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (a5Var6.a) {
                        a5Var6.c = i32;
                        a5Var6.f = true;
                        ((LinearLayout.LayoutParams) a5Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) a5Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) a5Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                a5 a5Var7 = (a5) childAt4.getLayoutParams();
                if (a5Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((a5Var7.b * i22) + a5Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.G.E = z;
    }

    public void setOnMenuItemClickListener(b5 b5Var) {
        this.N = b5Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        y4 y4Var = this.G;
        v4 v4Var = y4Var.w;
        if (v4Var != null) {
            v4Var.setImageDrawable(drawable);
        } else {
            y4Var.y = true;
            y4Var.x = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.F = z;
    }

    public void setPopupTheme(int i) {
        if (this.E != i) {
            this.E = i;
            if (i == 0) {
                this.D = getContext();
            } else {
                this.D = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(y4 y4Var) {
        this.G = y4Var;
        y4Var.u = this;
        this.C = y4Var.p;
    }

    @Override // defpackage.za2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
