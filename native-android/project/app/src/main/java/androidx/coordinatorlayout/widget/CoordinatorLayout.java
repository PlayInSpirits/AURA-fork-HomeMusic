package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;
import defpackage.a65;
import defpackage.ah0;
import defpackage.ca1;
import defpackage.ce0;
import defpackage.de0;
import defpackage.ee0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.he0;
import defpackage.hg3;
import defpackage.j65;
import defpackage.k53;
import defpackage.kf2;
import defpackage.ko3;
import defpackage.l53;
import defpackage.lt3;
import defpackage.n50;
import defpackage.nz2;
import defpackage.pb5;
import defpackage.q65;
import defpackage.ss0;
import defpackage.yd4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements k53, l53 {
    public static final String F;
    public static final Class[] G;
    public static final ThreadLocal H;
    public static final ca1 I;
    public static final ko3 J;
    public boolean A;
    public Drawable B;
    public ViewGroup.OnHierarchyChangeListener C;
    public hg3 D;
    public final n50 E;
    public final ArrayList n;
    public final ss0 o;
    public final ArrayList p;
    public final int[] q;
    public final int[] r;
    public boolean s;
    public boolean t;
    public final int[] u;
    public View v;
    public View w;
    public ah0 x;
    public boolean y;
    public pb5 z;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        F = r0 != null ? r0.getName() : null;
        I = new ca1(15);
        G = new Class[]{Context.class, AttributeSet.class};
        H = new ThreadLocal();
        J = new ko3(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.n = new ArrayList();
        this.o = new ss0(4);
        this.p = new ArrayList();
        this.q = new int[2];
        this.r = new int[2];
        this.E = new n50();
        int[] iArr = lt3.a;
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            j65.n(coordinatorLayout, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            coordinatorLayout = this;
            context2 = context;
            j65.n(coordinatorLayout, context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.u = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = coordinatorLayout.u;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        coordinatorLayout.B = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.z();
        super.setOnHierarchyChangeListener(new fe0(coordinatorLayout));
        WeakHashMap weakHashMap = j65.a;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) J.b();
        return rect == null ? new Rect() : rect;
    }

    public static void m(int i, Rect rect, Rect rect2, ge0 ge0Var, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = ge0Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = ge0Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ge0 o(View view) {
        ge0 ge0Var = (ge0) view.getLayoutParams();
        if (!ge0Var.b) {
            if (view instanceof ce0) {
                de0 behavior = ((ce0) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                ge0Var.b(behavior);
                ge0Var.b = true;
                return ge0Var;
            }
            ee0 ee0Var = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                ee0Var = (ee0) superclass.getAnnotation(ee0.class);
                if (ee0Var != null) {
                    break;
                }
            }
            if (ee0Var != null) {
                try {
                    ge0Var.b((de0) ee0Var.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + ee0Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            ge0Var.b = true;
        }
        return ge0Var;
    }

    public static void x(View view, int i) {
        ge0 ge0Var = (ge0) view.getLayoutParams();
        int i2 = ge0Var.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = j65.a;
            view.offsetLeftAndRight(i - i2);
            ge0Var.i = i;
        }
    }

    public static void y(View view, int i) {
        ge0 ge0Var = (ge0) view.getLayoutParams();
        int i2 = ge0Var.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = j65.a;
            view.offsetTopAndBottom(i - i2);
            ge0Var.j = i;
        }
    }

    @Override // defpackage.l53
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        de0 de0Var;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ge0 ge0Var = (ge0) childAt.getLayoutParams();
                if (ge0Var.a(i5) && (de0Var = ge0Var.a) != null) {
                    int[] iArr2 = this.q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    de0Var.p(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // defpackage.k53
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, 0, this.r);
    }

    @Override // defpackage.k53
    public final boolean c(View view, View view2, int i, int i2) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view3 = view;
                i3 = i;
                i4 = i2;
            } else {
                ge0 ge0Var = (ge0) childAt.getLayoutParams();
                de0 de0Var = ge0Var.a;
                if (de0Var != null) {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    boolean zT = de0Var.t(coordinatorLayout, childAt, view3, i3, i4);
                    z |= zT;
                    if (i4 == 0) {
                        ge0Var.m = zT;
                    } else if (i4 == 1) {
                        ge0Var.n = zT;
                    }
                } else {
                    coordinatorLayout = this;
                    view3 = view;
                    i3 = i;
                    i4 = i2;
                    if (i4 == 0) {
                        ge0Var.m = false;
                    } else if (i4 == 1) {
                        ge0Var.n = false;
                    }
                }
            }
            i5++;
            this = coordinatorLayout;
            view = view3;
            i = i3;
            i2 = i4;
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ge0) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.k53
    public final void d(View view, View view2, int i, int i2) {
        n50 n50Var = this.E;
        if (i2 == 1) {
            n50Var.b = i;
        } else {
            n50Var.a = i;
        }
        this.w = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((ge0) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        de0 de0Var = ((ge0) view.getLayoutParams()).a;
        if (de0Var != null) {
            de0Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.B;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.k53
    public final void e(View view, int i) {
        n50 n50Var = this.E;
        if (i == 1) {
            n50Var.b = 0;
        } else {
            n50Var.a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ge0 ge0Var = (ge0) childAt.getLayoutParams();
            if (ge0Var.a(i)) {
                de0 de0Var = ge0Var.a;
                if (de0Var != null) {
                    de0Var.u(this, childAt, view, i);
                }
                if (i == 0) {
                    ge0Var.m = false;
                } else if (i == 1) {
                    ge0Var.n = false;
                }
                ge0Var.o = false;
            }
        }
        this.w = null;
    }

    @Override // defpackage.k53
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        de0 de0Var;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ge0 ge0Var = (ge0) childAt.getLayoutParams();
                if (ge0Var.a(i3) && (de0Var = ge0Var.a) != null) {
                    int[] iArr2 = this.q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    de0Var.o(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ge0();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ge0) {
            return new ge0((ge0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ge0((ViewGroup.MarginLayoutParams) layoutParams) : new ge0(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        v();
        return Collections.unmodifiableList(this.n);
    }

    public final pb5 getLastWindowInsets() {
        return this.z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n50 n50Var = this.E;
        return n50Var.b | n50Var.a;
    }

    public Drawable getStatusBarBackground() {
        return this.B;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(ge0 ge0Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void i(View view) {
        ArrayList arrayList = (ArrayList) ((yd4) this.o.o).get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = (View) arrayList.get(i);
            de0 de0Var = ((ge0) view2.getLayoutParams()).a;
            if (de0Var != null) {
                de0Var.h(this, view2, view);
            }
        }
    }

    public final void j(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            l(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final List k(View view) {
        yd4 yd4Var = (yd4) this.o.o;
        int i = yd4Var.p;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) yd4Var.j(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(yd4Var.f(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void l(View view, Rect rect) {
        ThreadLocal threadLocal = q65.a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = q65.a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        q65.a(this, view, matrix);
        ThreadLocal threadLocal3 = q65.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i) {
        int[] iArr = this.u;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
        if (this.y) {
            if (this.x == null) {
                this.x = new ah0(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.x);
        }
        if (this.z == null) {
            WeakHashMap weakHashMap = j65.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w();
        if (this.y && this.x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.x);
        }
        View view = this.w;
        if (view != null) {
            e(view, 0);
        }
        this.t = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.A || this.B == null) {
            return;
        }
        pb5 pb5Var = this.z;
        int iD = pb5Var != null ? pb5Var.d() : 0;
        if (iD > 0) {
            this.B.setBounds(0, 0, getWidth(), iD);
            this.B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w();
        }
        boolean zU = u(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zU;
        }
        this.v = null;
        w();
        return zU;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        de0 de0Var;
        WeakHashMap weakHashMap = j65.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((de0Var = ((ge0) view.getLayoutParams()).a) == null || !de0Var.l(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        de0 de0Var;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        ArrayList arrayList;
        int i10;
        View view;
        int i11;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.v();
        int childCount = coordinatorLayout.getChildCount();
        int i12 = 0;
        loop0: while (true) {
            if (i12 >= childCount) {
                z = false;
                break;
            }
            View childAt = coordinatorLayout.getChildAt(i12);
            yd4 yd4Var = (yd4) coordinatorLayout.o.o;
            int i13 = yd4Var.p;
            for (int i14 = 0; i14 < i13; i14++) {
                ArrayList arrayList2 = (ArrayList) yd4Var.j(i14);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z = true;
                    break loop0;
                }
            }
            i12++;
        }
        if (z != coordinatorLayout.y) {
            boolean z3 = coordinatorLayout.t;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.x == null) {
                        coordinatorLayout.x = new ah0(coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.x);
                }
                coordinatorLayout.y = true;
            } else {
                if (z3 && coordinatorLayout.x != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.x);
                }
                coordinatorLayout.y = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = j65.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i15 = paddingLeft + paddingRight;
        int i16 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.z != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList3 = coordinatorLayout.n;
        int size3 = arrayList3.size();
        int i17 = 0;
        int iCombineMeasuredStates = 0;
        while (i17 < size3) {
            View view2 = (View) arrayList3.get(i17);
            int i18 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i4 = size3;
                i11 = i17;
                i6 = paddingLeft;
                suggestedMinimumWidth = i18;
                z2 = false;
                i8 = paddingRight;
            } else {
                ge0 ge0Var = (ge0) view2.getLayoutParams();
                int i19 = ge0Var.e;
                if (i19 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                } else {
                    int iN = coordinatorLayout.n(i19);
                    int i20 = ge0Var.c;
                    if (i20 == 0) {
                        i20 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i20, layoutDirection) & 7;
                    i3 = suggestedMinimumHeight;
                    if ((absoluteGravity != 3 || z4) && !(absoluteGravity == 5 && z4)) {
                        if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                            iMax = Math.max(0, iN - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iC = coordinatorLayout.z.c() + coordinatorLayout.z.b();
                            int iA = coordinatorLayout.z.a() + coordinatorLayout.z.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        de0Var = ge0Var.a;
                        if (de0Var != null) {
                            z2 = false;
                            i6 = paddingLeft;
                            i7 = i18;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            int i21 = iMakeMeasureSpec;
                            i11 = i17;
                            int i22 = iMakeMeasureSpec2;
                            zM = de0Var.m(this, view2, i21, i5, i22);
                            view = view2;
                            iMakeMeasureSpec = i21;
                            i10 = i22;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin + ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            i6 = paddingLeft;
                            i7 = i18;
                            z2 = false;
                            i8 = paddingRight;
                            i9 = i3;
                            arrayList = arrayList3;
                            i10 = iMakeMeasureSpec2;
                            view = view2;
                            i11 = i17;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin + ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iN);
                    }
                    int i23 = size3;
                    i5 = iMax;
                    i4 = i23;
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    de0Var = ge0Var.a;
                    if (de0Var != null) {
                        z2 = false;
                        i6 = paddingLeft;
                        i7 = i18;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        int i24 = iMakeMeasureSpec;
                        i11 = i17;
                        int i25 = iMakeMeasureSpec2;
                        zM = de0Var.m(this, view2, i24, i5, i25);
                        view = view2;
                        iMakeMeasureSpec = i24;
                        i10 = i25;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin + ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        i6 = paddingLeft;
                        i7 = i18;
                        z2 = false;
                        i8 = paddingRight;
                        i9 = i3;
                        arrayList = arrayList3;
                        i10 = iMakeMeasureSpec2;
                        view = view2;
                        i11 = i17;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin + ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                i4 = size3;
                i5 = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                de0Var = ge0Var.a;
                if (de0Var != null) {
                    z2 = false;
                    i6 = paddingLeft;
                    i7 = i18;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    int i26 = iMakeMeasureSpec;
                    i11 = i17;
                    int i27 = iMakeMeasureSpec2;
                    zM = de0Var.m(this, view2, i26, i5, i27);
                    view = view2;
                    iMakeMeasureSpec = i26;
                    i10 = i27;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin + ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    i6 = paddingLeft;
                    i7 = i18;
                    z2 = false;
                    i8 = paddingRight;
                    i9 = i3;
                    arrayList = arrayList3;
                    i10 = iMakeMeasureSpec2;
                    view = view2;
                    i11 = i17;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, i5, i10, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i15 + ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin + ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i16 + ((ViewGroup.MarginLayoutParams) ge0Var).topMargin + ((ViewGroup.MarginLayoutParams) ge0Var).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i17 = i11 + 1;
            paddingLeft = i6;
            paddingRight = i8;
            size3 = i4;
            arrayList3 = arrayList;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i2, i28 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ge0 ge0Var = (ge0) childAt.getLayoutParams();
                if (ge0Var.a(0)) {
                    de0 de0Var = ge0Var.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        de0 de0Var;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ge0 ge0Var = (ge0) childAt.getLayoutParams();
                if (ge0Var.a(0) && (de0Var = ge0Var.a) != null) {
                    zN |= de0Var.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        f(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        b(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof he0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        he0 he0Var = (he0) parcelable;
        super.onRestoreInstanceState(he0Var.n);
        SparseArray sparseArray = he0Var.p;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            de0 de0Var = o(childAt).a;
            if (id != -1 && de0Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                de0Var.r(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableS;
        he0 he0Var = new he0(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            de0 de0Var = ((ge0) childAt.getLayoutParams()).a;
            if (id != -1 && de0Var != null && (parcelableS = de0Var.s(childAt)) != null) {
                sparseArray.append(id, parcelableS);
            }
        }
        he0Var.p = sparseArray;
        return he0Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zU;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.v;
        boolean z = false;
        if (view != null) {
            de0 de0Var = ((ge0) view.getLayoutParams()).a;
            zU = de0Var != null ? de0Var.v(this, this.v, motionEvent) : false;
        } else {
            zU = u(motionEvent, 1);
            if (actionMasked != 0 && zU) {
                z = true;
            }
        }
        if (this.v == null || actionMasked == 3) {
            zU |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zU;
        }
        this.v = null;
        w();
        return zU;
    }

    public final boolean p(View view, int i, int i2) {
        ko3 ko3Var = J;
        Rect rectG = g();
        l(view, rectG);
        try {
            return rectG.contains(i, i2);
        } finally {
            rectG.setEmpty();
            ko3Var.a(rectG);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void q(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zH;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        ge0 ge0Var;
        int i10;
        View view;
        de0 de0Var;
        WeakHashMap weakHashMap = j65.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.n;
        int size = arrayList2.size();
        Rect rectG = g();
        Rect rectG2 = g();
        Rect rectG3 = g();
        int i11 = 0;
        while (true) {
            ko3 ko3Var = J;
            if (i11 >= size) {
                Rect rect2 = rectG3;
                rectG.setEmpty();
                ko3Var.a(rectG);
                rectG2.setEmpty();
                ko3Var.a(rectG2);
                rect2.setEmpty();
                ko3Var.a(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            ge0 ge0Var2 = (ge0) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (ge0Var2.l == ((View) arrayList2.get(i12))) {
                        ge0 ge0Var3 = (ge0) view2.getLayoutParams();
                        if (ge0Var3.k != null) {
                            Rect rectG4 = g();
                            Rect rectG5 = g();
                            ge0 ge0Var4 = ge0Var2;
                            Rect rectG6 = g();
                            l(ge0Var3.k, rectG4);
                            j(view2, rectG5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            ge0Var = ge0Var4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            m(layoutDirection, rectG4, rectG6, ge0Var3, measuredWidth, measuredHeight);
                            boolean z3 = (rectG6.left == rectG5.left && rectG6.top == rectG5.top) ? false : true;
                            h(ge0Var3, rectG6, measuredWidth, measuredHeight);
                            int i13 = rectG6.left - rectG5.left;
                            int i14 = rectG6.top - rectG5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = j65.a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = j65.a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (de0Var = ge0Var3.a) != null) {
                                de0Var.h(this, view, ge0Var3.k);
                            }
                            rectG4.setEmpty();
                            ko3Var.a(rectG4);
                            rectG5.setEmpty();
                            ko3Var.a(rectG5);
                            rectG6.setEmpty();
                            ko3Var.a(rectG6);
                        } else {
                            ge0Var = ge0Var2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        ge0Var = ge0Var2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    ge0Var2 = ge0Var;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectG3 = rectG3;
                }
                ArrayList arrayList3 = arrayList2;
                ge0 ge0Var5 = ge0Var2;
                int i15 = size;
                Rect rect3 = rectG3;
                i2 = i11;
                View view4 = view2;
                j(view4, rectG2, true);
                if (ge0Var5.g != 0 && !rectG2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(ge0Var5.g, layoutDirection);
                    int i16 = absoluteGravity & 112;
                    if (i16 == 48) {
                        rectG.top = Math.max(rectG.top, rectG2.bottom);
                    } else if (i16 == 80) {
                        rectG.bottom = Math.max(rectG.bottom, getHeight() - rectG2.top);
                    }
                    int i17 = absoluteGravity & 7;
                    if (i17 == 3) {
                        rectG.left = Math.max(rectG.left, rectG2.right);
                    } else if (i17 == 5) {
                        rectG.right = Math.max(rectG.right, getWidth() - rectG2.left);
                    }
                }
                if (ge0Var5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = j65.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        ge0 ge0Var6 = (ge0) view4.getLayoutParams();
                        de0 de0Var2 = ge0Var6.a;
                        Rect rectG7 = g();
                        Rect rectG8 = g();
                        rectG8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (de0Var2 == null || !de0Var2.e(view4, rectG7)) {
                            rectG7.set(rectG8);
                        } else if (!rectG8.contains(rectG7)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectG7.toShortString() + " | Bounds:" + rectG8.toShortString());
                        }
                        rectG8.setEmpty();
                        ko3Var.a(rectG8);
                        if (rectG7.isEmpty()) {
                            rectG7.setEmpty();
                            ko3Var.a(rectG7);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(ge0Var6.h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (rectG7.top - ((ViewGroup.MarginLayoutParams) ge0Var6).topMargin) - ge0Var6.j) >= (i9 = rectG.top)) {
                                z = false;
                            } else {
                                y(view4, i9 - i8);
                                z = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectG7.bottom) - ((ViewGroup.MarginLayoutParams) ge0Var6).bottomMargin) + ge0Var6.j) < (i7 = rectG.bottom)) {
                                y(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                y(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (rectG7.left - ((ViewGroup.MarginLayoutParams) ge0Var6).leftMargin) - ge0Var6.i) >= (i6 = rectG.left)) {
                                z2 = false;
                            } else {
                                x(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectG7.right) - ((ViewGroup.MarginLayoutParams) ge0Var6).rightMargin) + ge0Var6.i) < (i4 = rectG.right)) {
                                x(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                x(view4, 0);
                            }
                            rectG7.setEmpty();
                            ko3Var.a(rectG7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((ge0) view4.getLayoutParams()).p);
                    if (rect.equals(rectG2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((ge0) view4.getLayoutParams()).p.set(rectG2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    ge0 ge0Var7 = (ge0) view5.getLayoutParams();
                    de0 de0Var3 = ge0Var7.a;
                    if (de0Var3 != null && de0Var3.f(view5, view4)) {
                        if (i == 0 && ge0Var7.o) {
                            ge0Var7.o = false;
                        } else {
                            if (i != 2) {
                                zH = de0Var3.h(this, view5, view4);
                            } else {
                                de0Var3.i(this, view4);
                                zH = true;
                            }
                            if (i == 1) {
                                ge0Var7.o = zH;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectG3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectG3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    public final void r(View view, int i) {
        int i2;
        ge0 ge0Var = (ge0) view.getLayoutParams();
        View view2 = ge0Var.k;
        if (view2 == null && ge0Var.f != -1) {
            kf2.o("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        ko3 ko3Var = J;
        if (view2 != null) {
            Rect rectG = g();
            Rect rectG2 = g();
            try {
                l(view2, rectG);
                ge0 ge0Var2 = (ge0) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i, rectG, rectG2, ge0Var2, measuredWidth, measuredHeight);
                h(ge0Var2, rectG2, measuredWidth, measuredHeight);
                view.layout(rectG2.left, rectG2.top, rectG2.right, rectG2.bottom);
                return;
            } finally {
                rectG.setEmpty();
                ko3Var.a(rectG);
                rectG2.setEmpty();
                ko3Var.a(rectG2);
            }
        }
        int i3 = ge0Var.e;
        if (i3 < 0) {
            ge0 ge0Var3 = (ge0) view.getLayoutParams();
            Rect rectG3 = g();
            rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ge0Var3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) ge0Var3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) ge0Var3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) ge0Var3).bottomMargin);
            if (this.z != null) {
                WeakHashMap weakHashMap = j65.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectG3.left = this.z.b() + rectG3.left;
                    rectG3.top = this.z.d() + rectG3.top;
                    rectG3.right -= this.z.c();
                    rectG3.bottom -= this.z.a();
                }
            }
            Rect rectG4 = g();
            int i4 = ge0Var3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, i);
            view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
            rectG3.setEmpty();
            ko3Var.a(rectG3);
            rectG4.setEmpty();
            ko3Var.a(rectG4);
            return;
        }
        ge0 ge0Var4 = (ge0) view.getLayoutParams();
        int i5 = ge0Var4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iN = n(i3) - measuredWidth2;
        if (i6 == 1) {
            iN += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iN += measuredWidth2;
        }
        if (i7 != 16) {
            i2 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i2 = measuredHeight2 / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) ge0Var4).leftMargin, Math.min(iN, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) ge0Var4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) ge0Var4).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) ge0Var4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        de0 de0Var = ((ge0) view.getLayoutParams()).a;
        if (de0Var == null || !de0Var.q(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.s) {
            return;
        }
        if (this.v == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                de0 de0Var = ((ge0) childAt.getLayoutParams()).a;
                if (de0Var != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    de0Var.k(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        w();
        this.s = true;
    }

    public final void s(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.C = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.B = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.B.setState(getDrawableState());
                }
                Drawable drawable3 = this.B;
                WeakHashMap weakHashMap = j65.a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.B.setVisible(getVisibility() == 0, false);
                this.B.setCallback(this);
            }
            WeakHashMap weakHashMap2 = j65.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.B;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.B.setVisible(z, false);
    }

    public final boolean t(de0 de0Var, View view, MotionEvent motionEvent, int i) {
        if (i == 0) {
            return de0Var.k(this, view, motionEvent);
        }
        if (i == 1) {
            return de0Var.v(this, view, motionEvent);
        }
        nz2.c();
        return false;
    }

    public final boolean u(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.p;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        ca1 ca1Var = I;
        if (ca1Var != null) {
            Collections.sort(arrayList, ca1Var);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zT = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            de0 de0Var = ((ge0) view.getLayoutParams()).a;
            if (zT && actionMasked != 0) {
                if (de0Var != null) {
                    if (motionEventObtain == null) {
                        motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                    }
                    t(de0Var, view, motionEventObtain, i);
                }
            } else if (!zT && de0Var != null && (zT = t(de0Var, view, motionEvent, i))) {
                this.v = view;
                if (actionMasked != 3 && actionMasked != 1) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        View view2 = (View) arrayList.get(i4);
                        de0 de0Var2 = ((ge0) view2.getLayoutParams()).a;
                        if (de0Var2 != null) {
                            if (motionEventObtain == null) {
                                motionEventObtain = MotionEvent.obtain(motionEvent);
                                motionEventObtain.setAction(3);
                            }
                            t(de0Var2, view2, motionEventObtain, i);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zT;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x0093
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void v() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.v():void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.B;
    }

    public final void w() {
        View view = this.v;
        if (view != null) {
            de0 de0Var = ((ge0) view.getLayoutParams()).a;
            if (de0Var != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                de0Var.v(this, this.v, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.v = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ge0) getChildAt(i).getLayoutParams()).getClass();
        }
        this.s = false;
    }

    public final void z() {
        WeakHashMap weakHashMap = j65.a;
        if (!getFitsSystemWindows()) {
            a65.c(this, null);
            return;
        }
        if (this.D == null) {
            this.D = new hg3(12, this);
        }
        a65.c(this, this.D);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ge0(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
