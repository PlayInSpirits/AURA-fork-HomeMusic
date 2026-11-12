package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import defpackage.dt3;
import defpackage.e30;
import defpackage.f30;
import defpackage.i53;
import defpackage.j53;
import defpackage.j65;
import defpackage.jp2;
import defpackage.jq3;
import defpackage.k53;
import defpackage.kp4;
import defpackage.l53;
import defpackage.lp4;
import defpackage.mp4;
import defpackage.n50;
import defpackage.np4;
import defpackage.op4;
import defpackage.w20;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements l53, k53, i53 {
    public static final int[] a0 = {R.attr.enabled};
    public int A;
    public float B;
    public float C;
    public boolean D;
    public int E;
    public final DecelerateInterpolator F;
    public final w20 G;
    public int H;
    public int I;
    public final int J;
    public final int K;
    public int L;
    public final f30 M;
    public lp4 N;
    public lp4 O;
    public jp2 P;
    public jp2 Q;
    public boolean R;
    public int S;
    public boolean T;
    public final kp4 U;
    public final lp4 V;
    public final lp4 W;
    public View n;
    public np4 o;
    public boolean p;
    public final int q;
    public float r;
    public float s;
    public final n50 t;
    public final j53 u;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public boolean y;
    public final int z;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = false;
        this.r = -1.0f;
        this.v = new int[2];
        this.w = new int[2];
        this.x = new int[2];
        this.E = -1;
        this.H = -1;
        this.U = new kp4(this, 0);
        this.V = new lp4(this, 2);
        this.W = new lp4(this, 3);
        this.q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.z = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.F = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.S = (int) (displayMetrics.density * 40.0f);
        w20 w20Var = new w20(getContext());
        float f = w20Var.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = w20Var.getContext().obtainStyledAttributes(dt3.a);
        w20Var.o = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = j65.a;
        w20Var.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(w20Var.o);
        w20Var.setBackground(shapeDrawable);
        this.G = w20Var;
        f30 f30Var = new f30(getContext());
        this.M = f30Var;
        f30Var.c(1);
        this.G.setImageDrawable(this.M);
        this.G.setVisibility(8);
        addView(this.G);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.K = i;
        this.r = i;
        this.t = new n50();
        this.u = new j53(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.S;
        this.A = i2;
        this.J = i2;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a0);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.G.getBackground().setAlpha(i);
        this.M.setAlpha(i);
    }

    @Override // defpackage.l53
    public final void a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.u.d(i, i2, i3, i4, this.w, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.w[1] + i4 : i7;
        if (i8 >= 0 || g()) {
            return;
        }
        float fAbs = this.s + Math.abs(i8);
        this.s = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // defpackage.k53
    public final void b(View view, int i, int i2, int i3, int i4, int i5) {
        a(view, i, i2, i3, i4, i5, this.x);
    }

    @Override // defpackage.k53
    public final boolean c(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // defpackage.k53
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.u.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.u.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.u.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.u.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.k53
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.k53
    public final void f(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final boolean g() {
        View view = this.n;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.H;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n50 n50Var = this.t;
        return n50Var.b | n50Var.a;
    }

    public int getProgressCircleDiameter() {
        return this.S;
    }

    public int getProgressViewEndOffset() {
        return this.K;
    }

    public int getProgressViewStartOffset() {
        return this.J;
    }

    public final void h() {
        if (this.n == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.G)) {
                    this.n = childAt;
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.u.f(0);
    }

    public final void i(float f) {
        if (f > this.r) {
            m(true, true);
            return;
        }
        this.p = false;
        f30 f30Var = this.M;
        e30 e30Var = f30Var.n;
        e30Var.e = 0.0f;
        e30Var.f = 0.0f;
        f30Var.invalidateSelf();
        kp4 kp4Var = new kp4(this, 1);
        this.I = this.A;
        lp4 lp4Var = this.W;
        lp4Var.reset();
        lp4Var.setDuration(200L);
        lp4Var.setInterpolator(this.F);
        w20 w20Var = this.G;
        w20Var.n = kp4Var;
        w20Var.clearAnimation();
        w20Var.startAnimation(lp4Var);
        e30 e30Var2 = f30Var.n;
        if (e30Var2.n) {
            e30Var2.n = false;
        }
        f30Var.invalidateSelf();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.u.d;
    }

    public final void j(float f) {
        jp2 jp2Var;
        jp2 jp2Var2;
        f30 f30Var = this.M;
        e30 e30Var = f30Var.n;
        if (!e30Var.n) {
            e30Var.n = true;
        }
        f30Var.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.r));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.r;
        int i = this.L;
        if (i <= 0) {
            i = this.K;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.J + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        w20 w20Var = this.G;
        if (w20Var.getVisibility() != 0) {
            w20Var.setVisibility(0);
        }
        w20Var.setScaleX(1.0f);
        w20Var.setScaleY(1.0f);
        if (f < this.r) {
            if (f30Var.n.t > 76 && ((jp2Var2 = this.P) == null || !jp2Var2.hasStarted() || jp2Var2.hasEnded())) {
                jp2 jp2Var3 = new jp2(this, f30Var.n.t, 76);
                jp2Var3.setDuration(300L);
                w20Var.n = null;
                w20Var.clearAnimation();
                w20Var.startAnimation(jp2Var3);
                this.P = jp2Var3;
            }
        } else if (f30Var.n.t < 255 && ((jp2Var = this.Q) == null || !jp2Var.hasStarted() || jp2Var.hasEnded())) {
            jp2 jp2Var4 = new jp2(this, f30Var.n.t, 255);
            jp2Var4.setDuration(300L);
            w20Var.n = null;
            w20Var.clearAnimation();
            w20Var.startAnimation(jp2Var4);
            this.Q = jp2Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        e30 e30Var2 = f30Var.n;
        e30Var2.e = 0.0f;
        e30Var2.f = fMin2;
        f30Var.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        e30 e30Var3 = f30Var.n;
        if (fMin3 != e30Var3.p) {
            e30Var3.p = fMin3;
        }
        f30Var.invalidateSelf();
        f30Var.n.g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        f30Var.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.A);
    }

    public final void k(float f) {
        int i = this.I;
        setTargetOffsetTopAndBottom((i + ((int) ((this.J - i) * f))) - this.G.getTop());
    }

    public final void l() {
        this.G.clearAnimation();
        this.M.stop();
        this.G.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.J - this.A);
        this.A = this.G.getTop();
    }

    public final void m(boolean z, boolean z2) {
        if (this.p != z) {
            this.R = z2;
            h();
            this.p = z;
            w20 w20Var = this.G;
            kp4 kp4Var = this.U;
            if (!z) {
                lp4 lp4Var = new lp4(this, 1);
                this.O = lp4Var;
                lp4Var.setDuration(150L);
                w20Var.n = kp4Var;
                w20Var.clearAnimation();
                w20Var.startAnimation(this.O);
                return;
            }
            this.I = this.A;
            lp4 lp4Var2 = this.V;
            lp4Var2.reset();
            lp4Var2.setDuration(200L);
            lp4Var2.setInterpolator(this.F);
            if (kp4Var != null) {
                w20Var.n = kp4Var;
            }
            w20Var.clearAnimation();
            w20Var.startAnimation(lp4Var2);
        }
    }

    public final void n(boolean z, boolean z2) {
        if (!z || this.p == z) {
            m(z, false);
            return;
        }
        this.p = z;
        setTargetOffsetTopAndBottom((this.K + this.J) - this.A);
        this.R = z2;
        w20 w20Var = this.G;
        w20Var.setVisibility(0);
        this.M.setAlpha(255);
        lp4 lp4Var = new lp4(this, 0);
        this.N = lp4Var;
        lp4Var.setDuration(this.z);
        kp4 kp4Var = this.U;
        if (kp4Var != null) {
            w20Var.n = kp4Var;
        }
        w20Var.clearAnimation();
        w20Var.startAnimation(this.N);
    }

    public final void o(float f) {
        float f2 = this.C;
        float f3 = f - f2;
        float f4 = this.q;
        if (f3 <= f4 || this.D) {
            return;
        }
        this.B = f2 + f4;
        this.D = true;
        this.M.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        h();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !g() && !this.p && !this.y) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.D = false;
                    this.E = -1;
                } else if (actionMasked == 2) {
                    int i = this.E;
                    if (i == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        o(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.D = false;
                    this.E = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.E) {
                        this.E = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.D;
            }
            setTargetOffsetTopAndBottom(this.J - this.G.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.E = pointerId;
            this.D = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.C = motionEvent.getY(iFindPointerIndex2);
                return this.D;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.n == null) {
            h();
        }
        View view = this.n;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.G.getMeasuredWidth();
        int measuredHeight2 = this.G.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.A;
        this.G.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.n == null) {
            h();
        }
        View view = this.n;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.G.measure(View.MeasureSpec.makeMeasureSpec(this.S, 1073741824), View.MeasureSpec.makeMeasureSpec(this.S, 1073741824));
        this.H = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.G) {
                this.H = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.u.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.u.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.s;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.s = 0.0f;
                } else {
                    this.s = f - f2;
                    iArr[1] = i2;
                }
                j(this.s);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.v;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        a(view, i, i2, i3, i4, 0, this.x);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.t.a = i;
        startNestedScroll(i & 2);
        this.s = 0.0f;
        this.y = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        op4 op4Var = (op4) parcelable;
        super.onRestoreInstanceState(op4Var.getSuperState());
        setRefreshing(op4Var.n);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new op4(super.onSaveInstanceState(), this.p);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.p || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.t.a = 0;
        this.y = false;
        float f = this.s;
        if (f > 0.0f) {
            i(f);
            this.s = 0.0f;
        } else {
            post(new jq3(11, this));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !g() && !this.p && !this.y) {
            if (actionMasked == 0) {
                this.E = motionEvent.getPointerId(0);
                this.D = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.E);
                if (iFindPointerIndex < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.D) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.B) * 0.5f;
                    this.D = false;
                    i(y);
                }
                this.E = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.E);
                if (iFindPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                o(y2);
                if (this.D) {
                    float f = (y2 - this.B) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        j(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.E) {
                            this.E = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.E = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        View view;
        if (this.T && (view = this.n) != null) {
            WeakHashMap weakHashMap = j65.a;
            if (!view.isNestedScrollingEnabled()) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.G.setScaleX(f);
        this.G.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        h();
        f30 f30Var = this.M;
        e30 e30Var = f30Var.n;
        e30Var.i = iArr;
        e30Var.a(0);
        e30Var.a(0);
        f30Var.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.r = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.T = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        j53 j53Var = this.u;
        if (j53Var.d) {
            ViewGroup viewGroup = j53Var.c;
            WeakHashMap weakHashMap = j65.a;
            viewGroup.stopNestedScroll();
        }
        j53Var.d = z;
    }

    public void setOnChildScrollUpCallback(mp4 mp4Var) {
    }

    public void setOnRefreshListener(np4 np4Var) {
        this.o = np4Var;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.G.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setRefreshing(boolean z) {
        n(z, false);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.S = (int) (displayMetrics.density * 56.0f);
            } else {
                this.S = (int) (displayMetrics.density * 40.0f);
            }
            this.G.setImageDrawable(null);
            this.M.c(i);
            this.G.setImageDrawable(this.M);
        }
    }

    public void setSlingshotDistance(int i) {
        this.L = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        w20 w20Var = this.G;
        w20Var.bringToFront();
        WeakHashMap weakHashMap = j65.a;
        w20Var.offsetTopAndBottom(i);
        this.A = w20Var.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.u.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.u.h(0);
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
