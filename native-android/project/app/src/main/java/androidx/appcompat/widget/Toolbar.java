package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import app.homemusic.R;
import defpackage.av4;
import defpackage.bv4;
import defpackage.cd1;
import defpackage.e35;
import defpackage.e85;
import defpackage.fj0;
import defpackage.gv4;
import defpackage.i4;
import defpackage.j65;
import defpackage.jg;
import defpackage.jv3;
import defpackage.mh;
import defpackage.no4;
import defpackage.om1;
import defpackage.pz1;
import defpackage.qu2;
import defpackage.r20;
import defpackage.si1;
import defpackage.st3;
import defpackage.t34;
import defpackage.tu2;
import defpackage.vu4;
import defpackage.wu4;
import defpackage.xk0;
import defpackage.xu4;
import defpackage.y4;
import defpackage.yu4;
import defpackage.zu4;
import defpackage.zz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public final int A;
    public final int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public t34 G;
    public int H;
    public int I;
    public final int J;
    public CharSequence K;
    public CharSequence L;
    public ColorStateList M;
    public ColorStateList N;
    public boolean O;
    public boolean P;
    public final ArrayList Q;
    public final ArrayList R;
    public final int[] S;
    public final r20 T;
    public ArrayList U;
    public av4 V;
    public final om1 W;
    public gv4 a0;
    public y4 b0;
    public yu4 c0;
    public xk0 d0;
    public si1 e0;
    public boolean f0;
    public OnBackInvokedCallback g0;
    public OnBackInvokedDispatcher h0;
    public boolean i0;
    public final wu4 j0;
    public ActionMenuView n;
    public mh o;
    public mh p;
    public AppCompatImageButton q;
    public jg r;
    public final Drawable s;
    public final CharSequence t;
    public AppCompatImageButton u;
    public View v;
    public Context w;
    public int x;
    public int y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.J = 8388627;
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = new int[2];
        this.T = new r20(new vu4(this, 1));
        this.U = new ArrayList();
        this.W = new om1(28, this);
        this.j0 = new wu4(0, this);
        Context context2 = getContext();
        int[] iArr = st3.z;
        jv3 jv3VarF = jv3.f(context2, attributeSet, iArr, i);
        j65.n(this, context, iArr, attributeSet, (TypedArray) jv3VarF.o, i, 0);
        TypedArray typedArray = (TypedArray) jv3VarF.o;
        this.y = typedArray.getResourceId(28, 0);
        this.z = typedArray.getResourceId(19, 0);
        this.J = typedArray.getInteger(0, 8388627);
        this.A = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.F = dimensionPixelOffset;
        this.E = dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        this.C = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.C = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.D = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.E = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.F = dimensionPixelOffset5;
        }
        this.B = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        t34 t34Var = this.G;
        t34Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            t34Var.e = dimensionPixelSize;
            t34Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            t34Var.f = dimensionPixelSize2;
            t34Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            t34Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.H = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.I = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.s = jv3VarF.c(4);
        this.t = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.w = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableC = jv3VarF.c(16);
        if (drawableC != null) {
            setNavigationIcon(drawableC);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableC2 = jv3VarF.c(11);
        if (drawableC2 != null) {
            setLogo(drawableC2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(jv3VarF.b(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(jv3VarF.b(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        jv3VarF.g();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new no4(getContext());
    }

    public static zu4 h() {
        zu4 zu4Var = new zu4(-2, -2);
        zu4Var.b = 0;
        zu4Var.a = 8388627;
        return zu4Var;
    }

    public static zu4 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof zu4;
        if (z) {
            zu4 zu4Var = (zu4) layoutParams;
            zu4 zu4Var2 = new zu4(zu4Var);
            zu4Var2.b = 0;
            zu4Var2.b = zu4Var.b;
            return zu4Var2;
        }
        if (z) {
            zu4 zu4Var3 = new zu4((zu4) layoutParams);
            zu4Var3.b = 0;
            return zu4Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            zu4 zu4Var4 = new zu4(layoutParams);
            zu4Var4.b = 0;
            return zu4Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        zu4 zu4Var5 = new zu4(marginLayoutParams);
        zu4Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) zu4Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) zu4Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) zu4Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) zu4Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return zu4Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                zu4 zu4Var = (zu4) childAt.getLayoutParams();
                if (zu4Var.b == 0 && u(childAt)) {
                    int i3 = zu4Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            zu4 zu4Var2 = (zu4) childAt2.getLayoutParams();
            if (zu4Var2.b == 0 && u(childAt2)) {
                int i5 = zu4Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        zu4 zu4VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            zu4VarI = h();
        } else {
            zu4VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (zu4) layoutParams;
        }
        zu4VarI.b = 1;
        if (!z || this.v == null) {
            addView(view, zu4VarI);
        } else {
            view.setLayoutParams(zu4VarI);
            this.R.add(view);
        }
    }

    public final void c() {
        if (this.u == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.u = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.s);
            this.u.setContentDescription(this.t);
            zu4 zu4VarH = h();
            zu4VarH.a = (this.A & 112) | 8388611;
            zu4VarH.b = 2;
            this.u.setLayoutParams(zu4VarH);
            this.u.setOnClickListener(new i4(14, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof zu4);
    }

    public final void d() {
        if (this.G == null) {
            t34 t34Var = new t34();
            t34Var.a = 0;
            t34Var.b = 0;
            t34Var.c = Integer.MIN_VALUE;
            t34Var.d = Integer.MIN_VALUE;
            t34Var.e = 0;
            t34Var.f = 0;
            t34Var.g = false;
            t34Var.h = false;
            this.G = t34Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.n;
        if (actionMenuView.C == null) {
            qu2 qu2Var = (qu2) actionMenuView.getMenu();
            if (this.c0 == null) {
                this.c0 = new yu4(this);
            }
            this.n.setExpandedActionViewsExclusive(true);
            qu2Var.b(this.c0, this.w);
            w();
        }
    }

    public final void f() {
        if (this.n == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.n = actionMenuView;
            actionMenuView.setPopupTheme(this.x);
            this.n.setOnMenuItemClickListener(this.W);
            ActionMenuView actionMenuView2 = this.n;
            xk0 xk0Var = this.d0;
            pz1 pz1Var = new pz1(29, this);
            actionMenuView2.H = xk0Var;
            actionMenuView2.I = pz1Var;
            zu4 zu4VarH = h();
            zu4VarH.a = (this.A & 112) | 8388613;
            this.n.setLayoutParams(zu4VarH);
            b(this.n, false);
        }
    }

    public final void g() {
        if (this.q == null) {
            this.q = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            zu4 zu4VarH = h();
            zu4VarH.a = (this.A & 112) | 8388611;
            this.q.setLayoutParams(zu4VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        zu4 zu4Var = new zu4(context, attributeSet);
        zu4Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st3.b);
        zu4Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        zu4Var.b = 0;
        return zu4Var;
    }

    public CharSequence getCollapseContentDescription() {
        AppCompatImageButton appCompatImageButton = this.u;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        AppCompatImageButton appCompatImageButton = this.u;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        t34 t34Var = this.G;
        if (t34Var != null) {
            return t34Var.g ? t34Var.a : t34Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.I;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        t34 t34Var = this.G;
        if (t34Var != null) {
            return t34Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        t34 t34Var = this.G;
        if (t34Var != null) {
            return t34Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        t34 t34Var = this.G;
        if (t34Var != null) {
            return t34Var.g ? t34Var.b : t34Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.H;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        qu2 qu2Var;
        ActionMenuView actionMenuView = this.n;
        return (actionMenuView == null || (qu2Var = actionMenuView.C) == null || !qu2Var.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.I, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.H, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        jg jgVar = this.r;
        if (jgVar != null) {
            return jgVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        jg jgVar = this.r;
        if (jgVar != null) {
            return jgVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.n.getMenu();
    }

    public View getNavButtonView() {
        return this.q;
    }

    public CharSequence getNavigationContentDescription() {
        AppCompatImageButton appCompatImageButton = this.q;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        AppCompatImageButton appCompatImageButton = this.q;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    public y4 getOuterActionMenuPresenter() {
        return this.b0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.n.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.w;
    }

    public int getPopupTheme() {
        return this.x;
    }

    public CharSequence getSubtitle() {
        return this.L;
    }

    public final TextView getSubtitleTextView() {
        return this.p;
    }

    public CharSequence getTitle() {
        return this.K;
    }

    public int getTitleMarginBottom() {
        return this.F;
    }

    public int getTitleMarginEnd() {
        return this.D;
    }

    public int getTitleMarginStart() {
        return this.C;
    }

    public int getTitleMarginTop() {
        return this.E;
    }

    public final TextView getTitleTextView() {
        return this.o;
    }

    public fj0 getWrapper() {
        if (this.a0 == null) {
            this.a0 = new gv4(this, true);
        }
        return this.a0;
    }

    public final int j(View view, int i) {
        zu4 zu4Var = (zu4) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = zu4Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.J & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) zu4Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) zu4Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) zu4Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        ArrayList arrayList = this.U;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.T.p).iterator();
        while (it.hasNext()) {
            ((cd1) it.next()).a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.U = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.R.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.j0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.P = false;
        }
        if (!this.P) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.P = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.P = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024b  */
    /* JADX WARN: Code duplicated, block: B:102:0x024e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:120:0x0309  */
    /* JADX WARN: Code duplicated, block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0141 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01df  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:91:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x020e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0210  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x0228  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iQ;
        int iR;
        int iMax;
        int iMin;
        boolean zU;
        boolean zU2;
        int measuredHeight;
        mh mhVar;
        mh mhVar2;
        zu4 zu4Var;
        zu4 zu4Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iQ2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        jg jgVar;
        View view;
        ActionMenuView actionMenuView;
        AppCompatImageButton appCompatImageButton;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.S;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = j65.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (u(this.q)) {
            AppCompatImageButton appCompatImageButton2 = this.q;
            if (z3) {
                iR = r(appCompatImageButton2, i26, iMin2, iArr);
                iQ = paddingLeft;
            } else {
                iQ = q(appCompatImageButton2, paddingLeft, iMin2, iArr);
            }
            if (u(this.u)) {
                appCompatImageButton = this.u;
                if (z3) {
                    iR = r(appCompatImageButton, iR, iMin2, iArr);
                } else {
                    iQ = q(appCompatImageButton, iQ, iMin2, iArr);
                }
            }
            if (u(this.n)) {
                actionMenuView = this.n;
                if (z3) {
                    iQ = q(actionMenuView, iQ, iMin2, iArr);
                } else {
                    iR = r(actionMenuView, iR, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iQ);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iR));
            iMax = Math.max(iQ, currentContentInsetLeft);
            iMin = Math.min(iR, i26 - currentContentInsetRight);
            if (u(this.v)) {
                view = this.v;
                if (z3) {
                    iMin = r(view, iMin, iMin2, iArr);
                } else {
                    iMax = q(view, iMax, iMin2, iArr);
                }
            }
            if (u(this.r)) {
                jgVar = this.r;
                if (z3) {
                    iMin = r(jgVar, iMin, iMin2, iArr);
                } else {
                    iMax = q(jgVar, iMax, iMin2, iArr);
                }
            }
            zU = u(this.o);
            zU2 = u(this.p);
            if (zU) {
                zu4 zu4Var3 = (zu4) this.o.getLayoutParams();
                measuredHeight = this.o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zu4Var3).topMargin + ((ViewGroup.MarginLayoutParams) zu4Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zU2) {
                zu4 zu4Var4 = (zu4) this.p.getLayoutParams();
                measuredHeight = this.p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zu4Var4).topMargin + ((ViewGroup.MarginLayoutParams) zu4Var4).bottomMargin + measuredHeight;
            }
            if (zU || zU2) {
                if (zU) {
                    mhVar = this.o;
                } else {
                    mhVar = this.p;
                }
                if (zU2) {
                    mhVar2 = this.p;
                } else {
                    mhVar2 = this.o;
                }
                zu4Var = (zu4) mhVar.getLayoutParams();
                zu4Var2 = (zu4) mhVar2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zU && this.o.getMeasuredWidth() > 0) || (zU2 && this.p.getMeasuredWidth() > 0);
                i6 = this.J & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) zu4Var).topMargin + this.E;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) zu4Var).topMargin + this.E;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) zu4Var).bottomMargin;
                        i17 = this.F;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) zu4Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) zu4Var2).bottomMargin) - this.F) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.C;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zU) {
                        zu4 zu4Var5 = (zu4) this.o.getLayoutParams();
                        int measuredWidth2 = iMin - this.o.getMeasuredWidth();
                        int measuredHeight2 = this.o.getMeasuredHeight() + paddingTop;
                        this.o.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.D;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) zu4Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zU2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((zu4) this.p.getLayoutParams())).topMargin;
                        this.p.layout(iMin - this.p.getMeasuredWidth(), i28, iMin, this.p.getMeasuredHeight() + i28);
                        i13 = iMin - this.D;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.C;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zU) {
                        zu4 zu4Var6 = (zu4) this.o.getLayoutParams();
                        int measuredWidth3 = this.o.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.o.getMeasuredHeight() + paddingTop;
                        this.o.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.D;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) zu4Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zU2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((zu4) this.p.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.p.getMeasuredWidth() + iMax;
                        this.p.layout(iMax, i30, measuredWidth4, this.p.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.D;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.Q;
            a(3, arrayList);
            size = arrayList.size();
            iQ2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iQ2 = q((View) arrayList.get(i18), iQ2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = r((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view2 = (View) arrayList.get(i22);
                zu4 zu4Var7 = (zu4) view2.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) zu4Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) zu4Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view2.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iQ2) {
                if (i25 > iMin) {
                    iQ2 = i24 - (i25 - iMin);
                } else {
                    iQ2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iQ2 = q((View) arrayList.get(i23), iQ2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iQ = paddingLeft;
        iR = i26;
        if (u(this.u)) {
            appCompatImageButton = this.u;
            if (z3) {
                iR = r(appCompatImageButton, iR, iMin2, iArr);
            } else {
                iQ = q(appCompatImageButton, iQ, iMin2, iArr);
            }
        }
        if (u(this.n)) {
            actionMenuView = this.n;
            if (z3) {
                iQ = q(actionMenuView, iQ, iMin2, iArr);
            } else {
                iR = r(actionMenuView, iR, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iQ);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iR));
        iMax = Math.max(iQ, currentContentInsetLeft2);
        iMin = Math.min(iR, i26 - currentContentInsetRight2);
        if (u(this.v)) {
            view = this.v;
            if (z3) {
                iMin = r(view, iMin, iMin2, iArr);
            } else {
                iMax = q(view, iMax, iMin2, iArr);
            }
        }
        if (u(this.r)) {
            jgVar = this.r;
            if (z3) {
                iMin = r(jgVar, iMin, iMin2, iArr);
            } else {
                iMax = q(jgVar, iMax, iMin2, iArr);
            }
        }
        zU = u(this.o);
        zU2 = u(this.p);
        if (zU) {
            zu4 zu4Var8 = (zu4) this.o.getLayoutParams();
            measuredHeight = this.o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zu4Var8).topMargin + ((ViewGroup.MarginLayoutParams) zu4Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zU2) {
            zu4 zu4Var9 = (zu4) this.p.getLayoutParams();
            measuredHeight = this.p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zu4Var9).topMargin + ((ViewGroup.MarginLayoutParams) zu4Var9).bottomMargin + measuredHeight;
        }
        if (zU) {
            if (zU) {
                mhVar = this.o;
            } else {
                mhVar = this.p;
            }
            if (zU2) {
                mhVar2 = this.p;
            } else {
                mhVar2 = this.o;
            }
            zu4Var = (zu4) mhVar.getLayoutParams();
            zu4Var2 = (zu4) mhVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zU) {
            }
            i6 = this.J & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) zu4Var).topMargin + this.E;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) zu4Var).topMargin + this.E;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) zu4Var).bottomMargin;
                    i17 = this.F;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) zu4Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) zu4Var2).bottomMargin) - this.F) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.C;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zU) {
                    zu4 zu4Var10 = (zu4) this.o.getLayoutParams();
                    int measuredWidth5 = iMin - this.o.getMeasuredWidth();
                    int measuredHeight4 = this.o.getMeasuredHeight() + paddingTop;
                    this.o.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.D;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) zu4Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zU2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((zu4) this.p.getLayoutParams())).topMargin;
                    this.p.layout(iMin - this.p.getMeasuredWidth(), i211, iMin, this.p.getMeasuredHeight() + i211);
                    i13 = iMin - this.D;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.C;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zU) {
                    zu4 zu4Var11 = (zu4) this.o.getLayoutParams();
                    int measuredWidth6 = this.o.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.o.getMeasuredHeight() + paddingTop;
                    this.o.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.D;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) zu4Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zU2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((zu4) this.p.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.p.getMeasuredWidth() + iMax;
                    this.p.layout(iMax, i35, measuredWidth7, this.p.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.D;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zU) {
                mhVar = this.o;
            } else {
                mhVar = this.p;
            }
            if (zU2) {
                mhVar2 = this.p;
            } else {
                mhVar2 = this.o;
            }
            zu4Var = (zu4) mhVar.getLayoutParams();
            zu4Var2 = (zu4) mhVar2.getLayoutParams();
            i5 = measuredHeight;
            if (zU) {
            }
            i6 = this.J & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) zu4Var).topMargin + this.E;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) zu4Var).topMargin + this.E;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) zu4Var).bottomMargin;
                    i17 = this.F;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) zu4Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) zu4Var2).bottomMargin) - this.F) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.C;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zU) {
                    zu4 zu4Var12 = (zu4) this.o.getLayoutParams();
                    int measuredWidth8 = iMin - this.o.getMeasuredWidth();
                    int measuredHeight6 = this.o.getMeasuredHeight() + paddingTop;
                    this.o.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.D;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) zu4Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zU2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((zu4) this.p.getLayoutParams())).topMargin;
                    this.p.layout(iMin - this.p.getMeasuredWidth(), i214, iMin, this.p.getMeasuredHeight() + i214);
                    i13 = iMin - this.D;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.C;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zU) {
                    zu4 zu4Var13 = (zu4) this.o.getLayoutParams();
                    int measuredWidth9 = this.o.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.o.getMeasuredHeight() + paddingTop;
                    this.o.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.D;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) zu4Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zU2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((zu4) this.p.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.p.getMeasuredWidth() + iMax;
                    this.p.layout(iMax, i36, measuredWidth10, this.p.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.D;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.Q;
        a(3, arrayList);
        size = arrayList.size();
        iQ2 = iMax;
        while (i18 < size) {
            iQ2 = q((View) arrayList.get(i18), iQ2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = r((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view3 = (View) arrayList.get(i22);
            zu4 zu4Var14 = (zu4) view3.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) zu4Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) zu4Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view3.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iQ2) {
            if (i25 > iMin) {
                iQ2 = i24 - (i25 - iMin);
            } else {
                iQ2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iQ2 = q((View) arrayList.get(i23), iQ2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = e85.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (u(this.q)) {
            t(this.q, i, 0, i2, this.B);
            iK = k(this.q) + this.q.getMeasuredWidth();
            iMax = Math.max(0, l(this.q) + this.q.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.q.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (u(this.u)) {
            t(this.u, i, 0, i2, this.B);
            iK = k(this.u) + this.u.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.u) + this.u.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.u.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.S;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (u(this.n)) {
            t(this.n, i, iMax3, i2, this.B);
            iK2 = k(this.n) + this.n.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.n) + this.n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (u(this.v)) {
            iMax5 += s(this.v, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.v) + this.v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.v.getMeasuredState());
        }
        if (u(this.r)) {
            iMax5 += s(this.r, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.r) + this.r.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.r.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((zu4) childAt.getLayoutParams()).b == 0 && u(childAt)) {
                iMax5 += s(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.E + this.F;
        int i7 = this.C + this.D;
        if (u(this.o)) {
            s(this.o, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.o) + this.o.getMeasuredWidth();
            iL = l(this.o) + this.o.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.o.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (u(this.p)) {
            iMax2 = Math.max(iMax2, s(this.p, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.p) + this.p.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.p.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof bv4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bv4 bv4Var = (bv4) parcelable;
        super.onRestoreInstanceState(bv4Var.n);
        ActionMenuView actionMenuView = this.n;
        qu2 qu2Var = actionMenuView != null ? actionMenuView.C : null;
        int i = bv4Var.p;
        if (i != 0 && this.c0 != null && qu2Var != null && (menuItemFindItem = qu2Var.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (bv4Var.q) {
            wu4 wu4Var = this.j0;
            removeCallbacks(wu4Var);
            post(wu4Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        t34 t34Var = this.G;
        boolean z = i == 1;
        if (z == t34Var.g) {
            return;
        }
        t34Var.g = z;
        if (!t34Var.h) {
            t34Var.a = t34Var.e;
            t34Var.b = t34Var.f;
            return;
        }
        if (z) {
            int i2 = t34Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = t34Var.e;
            }
            t34Var.a = i2;
            int i3 = t34Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = t34Var.f;
            }
            t34Var.b = i3;
            return;
        }
        int i4 = t34Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = t34Var.e;
        }
        t34Var.a = i4;
        int i5 = t34Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = t34Var.f;
        }
        t34Var.b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        tu2 tu2Var;
        bv4 bv4Var = new bv4(super.onSaveInstanceState());
        yu4 yu4Var = this.c0;
        if (yu4Var != null && (tu2Var = yu4Var.o) != null) {
            bv4Var.p = tu2Var.a;
        }
        bv4Var.q = p();
        return bv4Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.O = false;
        }
        if (!this.O) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.O = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.O = false;
        return true;
    }

    public final boolean p() {
        y4 y4Var;
        ActionMenuView actionMenuView = this.n;
        return (actionMenuView == null || (y4Var = actionMenuView.G) == null || !y4Var.k()) ? false : true;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        zu4 zu4Var = (zu4) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) zu4Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) zu4Var).rightMargin + iMax;
    }

    public final int r(View view, int i, int i2, int[] iArr) {
        zu4 zu4Var = (zu4) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) zu4Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) zu4Var).leftMargin);
    }

    public final int s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.i0 != z) {
            this.i0 = z;
            w();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        AppCompatImageButton appCompatImageButton = this.u;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.u.setImageDrawable(drawable);
        } else {
            AppCompatImageButton appCompatImageButton = this.u;
            if (appCompatImageButton != null) {
                appCompatImageButton.setImageDrawable(this.s);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.I) {
            this.I = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.H) {
            this.H = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        jg jgVar = this.r;
        if (drawable != null) {
            if (jgVar == null) {
                this.r = new jg(getContext(), null, 0);
            }
            if (!o(this.r)) {
                b(this.r, true);
            }
        } else if (jgVar != null && o(jgVar)) {
            removeView(this.r);
            this.R.remove(this.r);
        }
        jg jgVar2 = this.r;
        if (jgVar2 != null) {
            jgVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.r == null) {
            this.r = new jg(getContext(), null, 0);
        }
        jg jgVar = this.r;
        if (jgVar != null) {
            jgVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        AppCompatImageButton appCompatImageButton = this.q;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            e35.S(this.q, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.q)) {
                b(this.q, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.q;
            if (appCompatImageButton != null && o(appCompatImageButton)) {
                removeView(this.q);
                this.R.remove(this.q);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.q;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.q.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(av4 av4Var) {
        this.V = av4Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.n.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.x != i) {
            this.x = i;
            if (i == 0) {
                this.w = getContext();
            } else {
                this.w = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        mh mhVar = this.p;
        if (!zIsEmpty) {
            if (mhVar == null) {
                Context context = getContext();
                mh mhVar2 = new mh(context, null);
                this.p = mhVar2;
                mhVar2.setSingleLine();
                this.p.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.z;
                if (i != 0) {
                    this.p.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    this.p.setTextColor(colorStateList);
                }
            }
            if (!o(this.p)) {
                b(this.p, true);
            }
        } else if (mhVar != null && o(mhVar)) {
            removeView(this.p);
            this.R.remove(this.p);
        }
        mh mhVar3 = this.p;
        if (mhVar3 != null) {
            mhVar3.setText(charSequence);
        }
        this.L = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        mh mhVar = this.p;
        if (mhVar != null) {
            mhVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        mh mhVar = this.o;
        if (!zIsEmpty) {
            if (mhVar == null) {
                Context context = getContext();
                mh mhVar2 = new mh(context, null);
                this.o = mhVar2;
                mhVar2.setSingleLine();
                this.o.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.y;
                if (i != 0) {
                    this.o.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.o.setTextColor(colorStateList);
                }
            }
            if (!o(this.o)) {
                b(this.o, true);
            }
        } else if (mhVar != null && o(mhVar)) {
            removeView(this.o);
            this.R.remove(this.o);
        }
        mh mhVar3 = this.o;
        if (mhVar3 != null) {
            mhVar3.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.F = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.D = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.C = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.E = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        mh mhVar = this.o;
        if (mhVar != null) {
            mhVar.setTextColor(colorStateList);
        }
    }

    public final void t(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        y4 y4Var;
        ActionMenuView actionMenuView = this.n;
        return (actionMenuView == null || (y4Var = actionMenuView.G) == null || !y4Var.n()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = xu4.a(this);
            yu4 yu4Var = this.c0;
            int i = 0;
            boolean z = (yu4Var == null || yu4Var.o == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.i0) ? false : true;
            if (z && this.h0 == null) {
                if (this.g0 == null) {
                    this.g0 = xu4.b(new vu4(this, i));
                }
                xu4.c(onBackInvokedDispatcherA, this.g0);
                this.h0 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.h0) == null) {
                return;
            }
            xu4.d(onBackInvokedDispatcher, this.g0);
            this.h0 = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(zz1.r(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(zz1.r(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(zz1.r(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
