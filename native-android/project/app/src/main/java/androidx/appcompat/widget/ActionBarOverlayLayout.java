package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import app.homemusic.R;
import defpackage.a65;
import defpackage.ab5;
import defpackage.bb5;
import defpackage.fj0;
import defpackage.fv2;
import defpackage.gv4;
import defpackage.ia5;
import defpackage.j65;
import defpackage.k53;
import defpackage.kf2;
import defpackage.l4;
import defpackage.l53;
import defpackage.m4;
import defpackage.mb5;
import defpackage.n4;
import defpackage.n50;
import defpackage.o4;
import defpackage.p4;
import defpackage.pb5;
import defpackage.qu2;
import defpackage.t75;
import defpackage.ua5;
import defpackage.va5;
import defpackage.vz1;
import defpackage.wa5;
import defpackage.xa5;
import defpackage.y4;
import defpackage.ya5;
import defpackage.yu4;
import defpackage.za5;
import defpackage.zz1;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k53, l53 {
    public static final int[] P = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final pb5 Q;
    public static final Rect R;
    public final Rect A;
    public final Rect B;
    public final Rect C;
    public pb5 D;
    public pb5 E;
    public pb5 F;
    public pb5 G;
    public n4 H;
    public OverScroller I;
    public ViewPropertyAnimator J;
    public final l4 K;
    public final m4 L;
    public final m4 M;
    public final n50 N;
    public final p4 O;
    public int n;
    public int o;
    public ContentFrameLayout p;
    public ActionBarContainer q;
    public fj0 r;
    public Drawable s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public final Rect z;

    static {
        bb5 va5Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            va5Var = new ab5();
        } else if (i >= 35) {
            va5Var = new za5();
        } else if (i >= 34) {
            va5Var = new ya5();
        } else if (i >= 31) {
            va5Var = new xa5();
        } else if (i >= 30) {
            va5Var = new wa5();
        } else {
            va5Var = i >= 29 ? new va5() : new ua5();
        }
        va5Var.h(vz1.b(0, 1, 0, 1));
        Q = va5Var.b();
        R = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = 0;
        this.z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        this.C = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        pb5 pb5Var = pb5.b;
        this.D = pb5Var;
        this.E = pb5Var;
        this.F = pb5Var;
        this.G = pb5Var;
        this.K = new l4(0, this);
        this.L = new m4(this, 0);
        this.M = new m4(this, 1);
        i(context);
        this.N = new n50();
        p4 p4Var = new p4(context);
        p4Var.setWillNotDraw(true);
        this.O = p4Var;
        addView(p4Var);
    }

    public static boolean g(View view, Rect rect, boolean z) {
        boolean z2;
        o4 o4Var = (o4) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) o4Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) o4Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) o4Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) o4Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) o4Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) o4Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) o4Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) o4Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.l53
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        b(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.k53
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.k53
    public final boolean c(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o4;
    }

    @Override // defpackage.k53
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.s != null) {
            if (this.q.getVisibility() == 0) {
                translationY = (int) (this.q.getTranslationY() + this.q.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.s.setBounds(0, translationY, getWidth(), this.s.getIntrinsicHeight() + translationY);
            this.s.draw(canvas);
        }
    }

    @Override // defpackage.k53
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.k53
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o4(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o4(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.q;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n50 n50Var = this.N;
        return n50Var.b | n50Var.a;
    }

    public CharSequence getTitle() {
        k();
        return ((gv4) this.r).a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.L);
        removeCallbacks(this.M);
        ViewPropertyAnimator viewPropertyAnimator = this.J;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(P);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.s = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.I = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((gv4) this.r).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((gv4) this.r).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        fj0 wrapper;
        if (this.p == null) {
            this.p = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.q = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof fj0) {
                wrapper = (fj0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    kf2.o("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.r = wrapper;
        }
    }

    public final void l(Menu menu, fv2 fv2Var) {
        k();
        gv4 gv4Var = (gv4) this.r;
        Toolbar toolbar = gv4Var.a;
        if (gv4Var.m == null) {
            y4 y4Var = new y4(toolbar.getContext());
            gv4Var.m = y4Var;
            y4Var.v = R.id.action_menu_presenter;
        }
        y4 y4Var2 = gv4Var.m;
        y4Var2.r = fv2Var;
        qu2 qu2Var = (qu2) menu;
        if (qu2Var == null && toolbar.n == null) {
            return;
        }
        toolbar.f();
        qu2 qu2Var2 = toolbar.n.C;
        if (qu2Var2 == qu2Var) {
            return;
        }
        if (qu2Var2 != null) {
            qu2Var2.r(toolbar.b0);
            qu2Var2.r(toolbar.c0);
        }
        if (toolbar.c0 == null) {
            toolbar.c0 = new yu4(toolbar);
        }
        y4Var2.E = true;
        Context context = toolbar.w;
        if (qu2Var != null) {
            qu2Var.b(y4Var2, context);
            qu2Var.b(toolbar.c0, toolbar.w);
        } else {
            y4Var2.l(context, null);
            toolbar.c0.l(toolbar.w, null);
            y4Var2.c(true);
            toolbar.c0.c(true);
        }
        toolbar.n.setPopupTheme(toolbar.x);
        toolbar.n.setPresenter(y4Var2);
        toolbar.b0 = y4Var2;
        toolbar.w();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        pb5 pb5VarG = pb5.g(windowInsets, this);
        boolean zG = g(this.q, new Rect(pb5VarG.b(), pb5VarG.d(), pb5VarG.c(), pb5VarG.a()), false);
        WeakHashMap weakHashMap = j65.a;
        Rect rect = this.z;
        a65.b(this, pb5VarG, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        mb5 mb5Var = pb5VarG.a;
        pb5 pb5VarQ = mb5Var.q(i, i2, i3, i4);
        this.D = pb5VarQ;
        boolean z = true;
        if (!this.E.equals(pb5VarQ)) {
            this.E = this.D;
            zG = true;
        }
        Rect rect2 = this.A;
        if (rect2.equals(rect)) {
            z = zG;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return mb5Var.a().a.c().a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = j65.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                o4 o4Var = (o4) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) o4Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) o4Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        pb5 pb5Var;
        int i3;
        bb5 ua5Var;
        k();
        measureChildWithMargins(this.q, i, 0, i2, 0);
        o4 o4Var = (o4) this.q.getLayoutParams();
        int iMax = Math.max(0, this.q.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) o4Var).leftMargin + ((ViewGroup.MarginLayoutParams) o4Var).rightMargin);
        int iMax2 = Math.max(0, this.q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o4Var).topMargin + ((ViewGroup.MarginLayoutParams) o4Var).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.q.getMeasuredState());
        WeakHashMap weakHashMap = j65.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.n;
            if (this.u && this.q.getTabContainer() != null) {
                measuredHeight += this.n;
            }
        } else {
            measuredHeight = this.q.getVisibility() != 8 ? this.q.getMeasuredHeight() : 0;
        }
        Rect rect = this.z;
        Rect rect2 = this.B;
        rect2.set(rect);
        this.F = this.D;
        if (this.t || z) {
            vz1 vz1VarB = vz1.b(this.F.b(), this.F.d() + measuredHeight, this.F.c(), this.F.a());
            pb5Var = this.F;
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                ua5Var = new ab5(pb5Var);
            } else if (i3 >= 35) {
                ua5Var = new za5(pb5Var);
            } else if (i3 >= 34) {
                ua5Var = new ya5(pb5Var);
            } else if (i3 >= 31) {
                ua5Var = new xa5(pb5Var);
            } else if (i3 >= 30) {
                ua5Var = new wa5(pb5Var);
            } else if (i3 >= 29) {
                ua5Var = new va5(pb5Var);
            } else {
                ua5Var = new ua5(pb5Var);
            }
            ua5Var.h(vz1VarB);
            this.F = ua5Var.b();
        } else {
            p4 p4Var = this.O;
            pb5 pb5Var2 = Q;
            Rect rect3 = this.C;
            a65.b(p4Var, pb5Var2, rect3);
            if (rect3.equals(R)) {
                vz1 vz1VarB2 = vz1.b(this.F.b(), this.F.d() + measuredHeight, this.F.c(), this.F.a());
                pb5Var = this.F;
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 36) {
                    ua5Var = new ab5(pb5Var);
                } else if (i3 >= 35) {
                    ua5Var = new za5(pb5Var);
                } else if (i3 >= 34) {
                    ua5Var = new ya5(pb5Var);
                } else if (i3 >= 31) {
                    ua5Var = new xa5(pb5Var);
                } else if (i3 >= 30) {
                    ua5Var = new wa5(pb5Var);
                } else if (i3 >= 29) {
                    ua5Var = new va5(pb5Var);
                } else {
                    ua5Var = new ua5(pb5Var);
                }
                ua5Var.h(vz1VarB2);
                this.F = ua5Var.b();
            } else {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.F = this.F.a.q(0, measuredHeight, 0, 0);
            }
        }
        g(this.p, rect2, true);
        if (!this.G.equals(this.F)) {
            pb5 pb5Var3 = this.F;
            this.G = pb5Var3;
            j65.b(this.p, pb5Var3);
        }
        measureChildWithMargins(this.p, i, 0, i2, 0);
        o4 o4Var2 = (o4) this.p.getLayoutParams();
        int iMax3 = Math.max(iMax, this.p.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) o4Var2).leftMargin + ((ViewGroup.MarginLayoutParams) o4Var2).rightMargin);
        int iMax4 = Math.max(iMax2, this.p.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o4Var2).topMargin + ((ViewGroup.MarginLayoutParams) o4Var2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.p.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.v || !z) {
            return false;
        }
        this.I.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.I.getFinalY() > this.q.getHeight()) {
            h();
            this.M.run();
        } else {
            h();
            this.L.run();
        }
        this.w = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.x + i2;
        this.x = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ia5 ia5Var;
        t75 t75Var;
        this.N.a = i;
        this.x = getActionBarHideOffset();
        h();
        n4 n4Var = this.H;
        if (n4Var == null || (t75Var = (ia5Var = (ia5) n4Var).v) == null) {
            return;
        }
        t75Var.a();
        ia5Var.v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.q.getVisibility() != 0) {
            return false;
        }
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.v || this.w) {
            return;
        }
        if (this.x <= this.q.getHeight()) {
            h();
            postDelayed(this.L, 600L);
        } else {
            h();
            postDelayed(this.M, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.y ^ i;
        this.y = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        n4 n4Var = this.H;
        if (n4Var != null) {
            ia5 ia5Var = (ia5) n4Var;
            ia5Var.r = !z2;
            if (z || !z2) {
                if (ia5Var.s) {
                    ia5Var.s = false;
                    ia5Var.x0(true);
                }
            } else if (!ia5Var.s) {
                ia5Var.s = true;
                ia5Var.x0(true);
            }
        }
        if ((i2 & 256) == 0 || this.H == null) {
            return;
        }
        WeakHashMap weakHashMap = j65.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.o = i;
        n4 n4Var = this.H;
        if (n4Var != null) {
            ((ia5) n4Var).q = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.q.setTranslationY(-Math.max(0, Math.min(i, this.q.getHeight())));
    }

    public void setActionBarVisibilityCallback(n4 n4Var) {
        this.H = n4Var;
        if (getWindowToken() != null) {
            ((ia5) this.H).q = this.o;
            int i = this.y;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = j65.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.u = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.v) {
            this.v = z;
            if (z) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        gv4 gv4Var = (gv4) this.r;
        gv4Var.d = i != 0 ? zz1.r(gv4Var.a.getContext(), i) : null;
        gv4Var.d();
    }

    public void setLogo(int i) {
        k();
        gv4 gv4Var = (gv4) this.r;
        gv4Var.e = i != 0 ? zz1.r(gv4Var.a.getContext(), i) : null;
        gv4Var.d();
    }

    public void setOverlayMode(boolean z) {
        this.t = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((gv4) this.r).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        gv4 gv4Var = (gv4) this.r;
        if (gv4Var.g) {
            return;
        }
        Toolbar toolbar = gv4Var.a;
        gv4Var.h = charSequence;
        if ((gv4Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (gv4Var.g) {
                j65.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new o4(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        gv4 gv4Var = (gv4) this.r;
        gv4Var.d = drawable;
        gv4Var.d();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
