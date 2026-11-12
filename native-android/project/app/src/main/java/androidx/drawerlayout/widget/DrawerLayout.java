package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import defpackage.ar;
import defpackage.er1;
import defpackage.ew0;
import defpackage.fw0;
import defpackage.gw0;
import defpackage.hw0;
import defpackage.iw0;
import defpackage.j65;
import defpackage.jw0;
import defpackage.kf2;
import defpackage.nt3;
import defpackage.nz2;
import defpackage.o3;
import defpackage.o65;
import defpackage.pb5;
import defpackage.vz1;
import defpackage.zh0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] P = {R.attr.colorPrimaryDark};
    public static final int[] Q = {R.attr.layout_gravity};
    public static final boolean R;
    public int A;
    public int B;
    public int C;
    public boolean D;
    public gw0 E;
    public ArrayList F;
    public float G;
    public float H;
    public Drawable I;
    public WindowInsets J;
    public boolean K;
    public final ArrayList L;
    public Rect M;
    public Matrix N;
    public final zh0 O;
    public float n;
    public final int o;
    public int p;
    public float q;
    public final Paint r;
    public final o65 s;
    public final o65 t;
    public final jw0 u;
    public final jw0 v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;

    static {
        R = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new fw0(0);
        this.p = -1728053248;
        this.r = new Paint();
        this.y = true;
        this.z = 3;
        this.A = 3;
        this.B = 3;
        this.C = 3;
        this.O = new zh0(21, this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.o = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        jw0 jw0Var = new jw0(this, 3);
        this.u = jw0Var;
        jw0 jw0Var2 = new jw0(this, 5);
        this.v = jw0Var2;
        o65 o65Var = new o65(getContext(), this, jw0Var);
        o65Var.b = (int) (o65Var.b * 1.0f);
        this.s = o65Var;
        o65Var.q = 1;
        o65Var.n = f2;
        jw0Var.k = o65Var;
        o65 o65Var2 = new o65(getContext(), this, jw0Var2);
        o65Var2.b = (int) (1.0f * o65Var2.b);
        this.t = o65Var2;
        o65Var2.q = 2;
        o65Var2.n = f2;
        jw0Var2.k = o65Var2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = j65.a;
        setImportantForAccessibility(1);
        j65.o(this, new ar(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ew0());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(P);
            try {
                this.I = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, nt3.a, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.n = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.n = getResources().getDimension(app.homemusic.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.L = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String k(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean l(View view) {
        return ((hw0) view.getLayoutParams()).a == 0;
    }

    public static boolean m(View view) {
        if (n(view)) {
            return (((hw0) view.getLayoutParams()).d & 1) == 1;
        }
        nz2.A(view, " is not a drawer", "View ");
        return false;
    }

    public static boolean n(View view) {
        int i = ((hw0) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = j65.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean o(View view) {
        if (n(view)) {
            return ((hw0) view.getLayoutParams()).b > 0.0f;
        }
        nz2.A(view, " is not a drawer", "View ");
        return false;
    }

    public final void a(gw0 gw0Var) {
        if (gw0Var == null) {
            return;
        }
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.add(gw0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.L;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!n(childAt)) {
                arrayList2.add(childAt);
            } else if (m(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((hw0) childAt.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || n(view)) {
            WeakHashMap weakHashMap = j65.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = j65.a;
            view.setImportantForAccessibility(1);
        }
    }

    public final boolean b(View view, int i) {
        return (j(view) & i) == i;
    }

    public final void c(View view, boolean z) {
        if (!n(view)) {
            nz2.A(view, " is not a sliding drawer", "View ");
            return;
        }
        hw0 hw0Var = (hw0) view.getLayoutParams();
        if (this.y) {
            hw0Var.b = 0.0f;
            hw0Var.d = 0;
        } else if (z) {
            hw0Var.d |= 4;
            if (b(view, 3)) {
                this.s.s(view, -view.getWidth(), view.getTop());
            } else {
                this.t.s(view, getWidth(), view.getTop());
            }
        } else {
            float f = ((hw0) view.getLayoutParams()).b;
            float width = view.getWidth();
            int i = ((int) (width * 0.0f)) - ((int) (f * width));
            if (!b(view, 3)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            s(view, 0.0f);
            v(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof hw0) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((hw0) getChildAt(i).getLayoutParams()).b);
        }
        this.q = fMax;
        boolean zG = this.s.g();
        boolean zG2 = this.t.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = j65.a;
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        View viewF = f(8388611);
        if (viewF != null) {
            c(viewF, true);
        } else {
            kf2.l(k(8388611), "No drawer view found with gravity ");
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.q <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.M == null) {
                this.M = new Rect();
            }
            childAt.getHitRect(this.M);
            if (this.M.contains((int) x, (int) y) && !l(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.N == null) {
                            this.N = new Matrix();
                        }
                        matrix.invert(this.N);
                        motionEventObtain.transform(this.N);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zL = l(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zL) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && n(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.q;
        if (f > 0.0f && zL) {
            int i4 = this.p;
            Paint paint = this.r;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final void e(boolean z) {
        int childCount = getChildCount();
        boolean zS = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            hw0 hw0Var = (hw0) childAt.getLayoutParams();
            if (n(childAt) && (!z || hw0Var.c)) {
                zS |= b(childAt, 3) ? this.s.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.t.s(childAt, getWidth(), childAt.getTop());
                hw0Var.c = false;
            }
        }
        jw0 jw0Var = this.u;
        jw0Var.m.removeCallbacks(jw0Var.l);
        jw0 jw0Var2 = this.v;
        jw0Var2.m.removeCallbacks(jw0Var2.l);
        if (zS) {
            invalidate();
        }
    }

    public final View f(int i) {
        WeakHashMap weakHashMap = j65.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((j(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (n(childAt) && o(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        hw0 hw0Var = new hw0(-1, -1);
        hw0Var.a = 0;
        return hw0Var;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof hw0) {
            hw0 hw0Var = (hw0) layoutParams;
            hw0 hw0Var2 = new hw0(hw0Var);
            hw0Var2.a = 0;
            hw0Var2.a = hw0Var.a;
            return hw0Var2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            hw0 hw0Var3 = new hw0((ViewGroup.MarginLayoutParams) layoutParams);
            hw0Var3.a = 0;
            return hw0Var3;
        }
        hw0 hw0Var4 = new hw0(layoutParams);
        hw0Var4.a = 0;
        return hw0Var4;
    }

    public float getDrawerElevation() {
        return this.n;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.I;
    }

    public final int h(int i) {
        WeakHashMap weakHashMap = j65.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.z;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.B : this.C;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.A;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.C : this.B;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.B;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.z : this.A;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.C;
        if (i8 != 3) {
            return i8;
        }
        int i9 = layoutDirection == 0 ? this.A : this.z;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    public final int i(View view) {
        if (n(view)) {
            return h(((hw0) view.getLayoutParams()).a);
        }
        nz2.A(view, " is not a drawer", "View ");
        return 0;
    }

    public final int j(View view) {
        int i = ((hw0) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = j65.a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.K || this.I == null) {
            return;
        }
        WindowInsets windowInsets = this.J;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.I.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.I.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        o65 o65Var = this.s;
        boolean zR = o65Var.r(motionEvent) | this.t.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e(true);
                this.D = false;
            } else if (actionMasked == 2) {
                int length = o65Var.d.length;
                for (int i = 0; i < length; i++) {
                    if ((o65Var.k & (1 << i)) != 0) {
                        float f = o65Var.f[i] - o65Var.d[i];
                        float f2 = o65Var.g[i] - o65Var.e[i];
                        float f3 = (f2 * f2) + (f * f);
                        int i2 = o65Var.b;
                        if (f3 > i2 * i2) {
                            jw0 jw0Var = this.u;
                            jw0Var.m.removeCallbacks(jw0Var.l);
                            jw0 jw0Var2 = this.v;
                            jw0Var2.m.removeCallbacks(jw0Var2.l);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                e(true);
                this.D = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.G = x;
            this.H = y;
            z = this.q > 0.0f && (viewH = o65Var.h((int) x, (int) y)) != null && l(viewH);
            this.D = false;
        }
        if (!zR && !z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (!((hw0) getChildAt(i3).getLayoutParams()).c) {
                }
            }
            if (!this.D) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || g() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewG = g();
        if (viewG != null && i(viewG) == 0) {
            e(false);
        }
        return viewG != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.x = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                hw0 hw0Var = (hw0) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) hw0Var).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) hw0Var).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) hw0Var).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (hw0Var.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (hw0Var.b * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z3 = f != hw0Var.b ? z2 : false;
                    int i10 = hw0Var.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) hw0Var).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) hw0Var).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) hw0Var).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) hw0Var).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) hw0Var).bottomMargin);
                    }
                    if (z3) {
                        s(childAt, f);
                    }
                    int i18 = hw0Var.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (R && (rootWindowInsets = getRootWindowInsets()) != null) {
            vz1 vz1VarL = pb5.g(rootWindowInsets, null).a.l();
            o65 o65Var = this.s;
            o65Var.o = Math.max(o65Var.p, vz1VarL.a);
            o65 o65Var2 = this.t;
            o65Var2.o = Math.max(o65Var2.p, vz1VarL.c);
        }
        this.x = false;
        this.y = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                kf2.n("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.J != null) {
            WeakHashMap weakHashMap = j65.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap weakHashMap2 = j65.a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                hw0 hw0Var = (hw0) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(hw0Var.a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    WindowInsets windowInsetsReplaceSystemWindowInsets = this.J;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) hw0Var).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) hw0Var).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) hw0Var).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) hw0Var).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (l(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) hw0Var).leftMargin) - ((ViewGroup.MarginLayoutParams) hw0Var).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) hw0Var).topMargin) - ((ViewGroup.MarginLayoutParams) hw0Var).bottomMargin, 1073741824));
                } else {
                    if (!n(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float elevation = childAt.getElevation();
                    float f = this.n;
                    if (elevation != f) {
                        childAt.setElevation(f);
                    }
                    int iJ = j(childAt) & 7;
                    boolean z4 = iJ == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        er1.j(k(iJ), " but this DrawerLayout already has a drawer view along that edge", "Child drawer has absolute gravity ");
                        return;
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.o + ((ViewGroup.MarginLayoutParams) hw0Var).leftMargin + ((ViewGroup.MarginLayoutParams) hw0Var).rightMargin, ((ViewGroup.MarginLayoutParams) hw0Var).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) hw0Var).topMargin + ((ViewGroup.MarginLayoutParams) hw0Var).bottomMargin, ((ViewGroup.MarginLayoutParams) hw0Var).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewF;
        if (!(parcelable instanceof iw0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        iw0 iw0Var = (iw0) parcelable;
        super.onRestoreInstanceState(iw0Var.n);
        int i = iw0Var.p;
        if (i != 0 && (viewF = f(i)) != null) {
            p(viewF);
        }
        int i2 = iw0Var.q;
        if (i2 != 3) {
            r(i2, 3);
        }
        int i3 = iw0Var.r;
        if (i3 != 3) {
            r(i3, 5);
        }
        int i4 = iw0Var.s;
        if (i4 != 3) {
            r(i4, 8388611);
        }
        int i5 = iw0Var.t;
        if (i5 != 3) {
            r(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        iw0 iw0Var = new iw0(super.onSaveInstanceState());
        iw0Var.p = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            hw0 hw0Var = (hw0) getChildAt(i).getLayoutParams();
            int i2 = hw0Var.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                iw0Var.p = hw0Var.a;
                break;
            }
        }
        iw0Var.q = this.z;
        iw0Var.r = this.A;
        iw0Var.s = this.B;
        iw0Var.t = this.C;
        return iw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        o65 o65Var = this.s;
        o65Var.k(motionEvent);
        this.t.k(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.G = x;
            this.H = y;
            this.D = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            e(true);
            this.D = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewH = o65Var.h((int) x2, (int) y2);
        if (viewH != null && l(viewH)) {
            float f = x2 - this.G;
            float f2 = y2 - this.H;
            int i = o65Var.b;
            if ((f2 * f2) + (f * f) < i * i) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i2);
                    if ((((hw0) childAt.getLayoutParams()).d & 1) == 1) {
                        break;
                    }
                    i2++;
                }
                z = childAt == null || i(childAt) == 2;
            }
        }
        e(z);
        return true;
    }

    public final void p(View view) {
        if (!n(view)) {
            nz2.A(view, " is not a sliding drawer", "View ");
            return;
        }
        hw0 hw0Var = (hw0) view.getLayoutParams();
        if (this.y) {
            hw0Var.b = 1.0f;
            hw0Var.d = 1;
            u(view, true);
            t(view);
        } else {
            hw0Var.d |= 2;
            if (b(view, 3)) {
                this.s.s(view, 0, view.getTop());
            } else {
                this.t.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void q() {
        View viewF = f(8388611);
        if (viewF != null) {
            p(viewF);
        } else {
            kf2.l(k(8388611), "No drawer view found with gravity ");
        }
    }

    public final void r(int i, int i2) {
        View viewF;
        WeakHashMap weakHashMap = j65.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.z = i;
        } else if (i2 == 5) {
            this.A = i;
        } else if (i2 == 8388611) {
            this.B = i;
        } else if (i2 == 8388613) {
            this.C = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.s : this.t).a();
        }
        if (i != 1) {
            if (i == 2 && (viewF = f(absoluteGravity)) != null) {
                p(viewF);
                return;
            }
            return;
        }
        View viewF2 = f(absoluteGravity);
        if (viewF2 != null) {
            c(viewF2, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.x) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view, float f) {
        hw0 hw0Var = (hw0) view.getLayoutParams();
        if (f == hw0Var.b) {
            return;
        }
        hw0Var.b = f;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((gw0) this.F.get(size)).a(f);
            }
        }
    }

    public void setDrawerElevation(float f) {
        this.n = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (n(childAt)) {
                float f2 = this.n;
                WeakHashMap weakHashMap = j65.a;
                childAt.setElevation(f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(gw0 gw0Var) {
        ArrayList arrayList;
        gw0 gw0Var2 = this.E;
        if (gw0Var2 != null && (arrayList = this.F) != null) {
            arrayList.remove(gw0Var2);
        }
        if (gw0Var != null) {
            a(gw0Var);
        }
        this.E = gw0Var;
    }

    public void setDrawerLockMode(int i) {
        r(i, 3);
        r(i, 5);
    }

    public void setScrimColor(int i) {
        this.p = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.I = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.I = new ColorDrawable(i);
        invalidate();
    }

    public final void t(View view) {
        o3 o3Var = o3.n;
        j65.k(view, o3Var.a());
        if (!m(view) || i(view) == 2) {
            return;
        }
        j65.m(view, o3Var, this.O);
    }

    public final void u(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || n(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = j65.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = j65.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void v(View view, int i) {
        int i2;
        View rootView;
        int i3 = this.s.a;
        int i4 = this.t.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((hw0) view.getLayoutParams()).b;
            if (f == 0.0f) {
                hw0 hw0Var = (hw0) view.getLayoutParams();
                if ((hw0Var.d & 1) == 1) {
                    hw0Var.d = 0;
                    ArrayList arrayList = this.F;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((gw0) this.F.get(size)).c(view);
                        }
                    }
                    u(view, false);
                    t(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                hw0 hw0Var2 = (hw0) view.getLayoutParams();
                if ((hw0Var2.d & 1) == 0) {
                    hw0Var2.d = 1;
                    ArrayList arrayList2 = this.F;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((gw0) this.F.get(size2)).b(view);
                        }
                    }
                    u(view, true);
                    t(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.w) {
            this.w = i2;
            ArrayList arrayList3 = this.F;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((gw0) this.F.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.I = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        hw0 hw0Var = new hw0(context, attributeSet);
        hw0Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        hw0Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return hw0Var;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.homemusic.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }
}
