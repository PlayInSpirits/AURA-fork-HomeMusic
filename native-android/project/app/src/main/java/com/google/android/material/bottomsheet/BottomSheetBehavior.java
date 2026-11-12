package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartPlan;
import defpackage.a61;
import defpackage.b11;
import defpackage.bc4;
import defpackage.bk;
import defpackage.de0;
import defpackage.dh2;
import defpackage.eh;
import defpackage.f34;
import defpackage.fi2;
import defpackage.ge0;
import defpackage.h12;
import defpackage.ht3;
import defpackage.j65;
import defpackage.kf2;
import defpackage.l4;
import defpackage.o3;
import defpackage.o65;
import defpackage.oo;
import defpackage.qq;
import defpackage.tt;
import defpackage.ut;
import defpackage.vr1;
import defpackage.vt;
import defpackage.wz1;
import defpackage.x7;
import defpackage.xk0;
import defpackage.y2;
import defpackage.yd;
import defpackage.z2;
import defpackage.zg2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends de0 implements zg2 {
    public boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public int I;
    public int J;
    public final boolean K;
    public final bc4 L;
    public boolean M;
    public final bk N;
    public final ValueAnimator O;
    public final int P;
    public int Q;
    public int R;
    public final float S;
    public int T;
    public final float U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public o65 Z;
    public boolean a0;
    public int b0;
    public boolean c0;
    public final float d0;
    public int e0;
    public int f0;
    public int g0;
    public WeakReference h0;
    public WeakReference i0;
    public final ArrayList j0;
    public VelocityTracker k0;
    public dh2 l0;
    public int m0;
    public final int n;
    public int n0;
    public boolean o;
    public boolean o0;
    public final float p;
    public HashMap p0;
    public final int q;
    public final SparseIntArray q0;
    public int r;
    public final tt r0;
    public boolean s;
    public int t;
    public final int u;
    public final fi2 v;
    public final ColorStateList w;
    public final int x;
    public final int y;
    public int z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.n = 0;
        int i2 = 1;
        this.o = true;
        this.x = -1;
        this.y = -1;
        this.N = new bk(this);
        this.S = 0.5f;
        this.U = -1.0f;
        this.X = true;
        this.Y = 4;
        this.d0 = 0.1f;
        this.j0 = new ArrayList();
        this.n0 = -1;
        this.q0 = new SparseIntArray();
        this.r0 = new tt(this, 0);
        this.u = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.f);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.w = h12.s(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.L = bc4.c(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        bc4 bc4Var = this.L;
        if (bc4Var != null) {
            fi2 fi2Var = new fi2(bc4Var);
            this.v = fi2Var;
            fi2Var.j(context);
            ColorStateList colorStateList = this.w;
            if (colorStateList != null) {
                this.v.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.v.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y(), 1.0f);
        this.O = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.O.addUpdateListener(new qq(i2, this));
        this.U = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            I(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            I(i);
        }
        H(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.A = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.o != z) {
            this.o = z;
            if (this.h0 != null) {
                x();
            }
            K((this.o && this.Y == 6) ? 3 : this.Y);
            O(this.Y, true);
            N();
        }
        this.W = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.X = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.n = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            kf2.n("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.S = f;
        if (this.h0 != null) {
            this.R = (int) ((1.0f - f) * this.g0);
        }
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                kf2.n("offset must be greater than or equal to 0");
                throw null;
            }
            this.P = dimensionPixelOffset;
            O(this.Y, true);
        } else {
            int i3 = typedValuePeekValue2.data;
            if (i3 < 0) {
                kf2.n("offset must be greater than or equal to 0");
                throw null;
            }
            this.P = i3;
            O(this.Y, true);
        }
        this.q = typedArrayObtainStyledAttributes.getInt(11, SmartPlan.MAX_QUEUE);
        this.B = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.C = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.D = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.E = typedArrayObtainStyledAttributes.getBoolean(20, true);
        this.F = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.G = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.H = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.recycle();
        this.p = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = j65.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewB = B(viewGroup.getChildAt(i));
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    public static BottomSheetBehavior C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ge0)) {
            kf2.n("The view is not a child of CoordinatorLayout");
            return null;
        }
        de0 de0Var = ((ge0) layoutParams).a;
        if (de0Var instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) de0Var;
        }
        kf2.n("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int D(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        float f;
        float fE;
        View view = (View) this.h0.get();
        if (view != null) {
            ArrayList arrayList = this.j0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.T;
            if (i > i2 || i2 == E()) {
                int i3 = this.T;
                f = i3 - i;
                fE = this.g0 - i3;
            } else {
                int i4 = this.T;
                f = i4 - i;
                fE = i4 - E();
            }
            float f2 = f / fE;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((ut) arrayList.get(i5)).b(view, f2);
            }
        }
    }

    public final int E() {
        if (this.o) {
            return this.Q;
        }
        return Math.max(this.P, this.E ? 0 : this.J);
    }

    public final int F(int i) {
        if (i == 3) {
            return E();
        }
        if (i == 4) {
            return this.T;
        }
        if (i == 5) {
            return this.g0;
        }
        if (i == 6) {
            return this.R;
        }
        kf2.n(f34.f(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean G() {
        WeakReference weakReference = this.h0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.h0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void H(boolean z) {
        if (this.V != z) {
            this.V = z;
            if (!z && this.Y == 5) {
                J(4);
            }
            N();
        }
    }

    public final void I(int i) {
        boolean z = this.s;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.s = true;
            }
        } else {
            if (!z && this.r == i) {
                return;
            }
            this.s = false;
            this.r = Math.max(0, i);
        }
        Q();
    }

    public final void J(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(b11.q(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.V && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.o && F(i) <= this.Q) ? 3 : i;
        WeakReference weakReference = this.h0;
        if (weakReference == null || weakReference.get() == null) {
            K(i);
            return;
        }
        View view = (View) this.h0.get();
        eh ehVar = new eh(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = j65.a;
            if (view.isAttachedToWindow()) {
                view.post(ehVar);
                return;
            }
        }
        ehVar.run();
    }

    public final void K(int i) {
        View view;
        if (this.Y == i) {
            return;
        }
        this.Y = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.V;
        }
        WeakReference weakReference = this.h0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            P(true);
        } else if (i == 6 || i == 5 || i == 4) {
            P(false);
        }
        O(i, true);
        while (true) {
            ArrayList arrayList = this.j0;
            if (i2 >= arrayList.size()) {
                N();
                return;
            } else {
                ((ut) arrayList.get(i2)).c(view, i);
                i2++;
            }
        }
    }

    public final boolean L(View view, float f) {
        if (this.W) {
            return true;
        }
        if (view.getTop() < this.T) {
            return false;
        }
        return Math.abs(((f * this.d0) + ((float) view.getTop())) - ((float) this.T)) / ((float) z()) > 0.5f;
    }

    public final void M(View view, int i, boolean z) {
        int iF = F(i);
        o65 o65Var = this.Z;
        if (o65Var == null || (!z ? o65Var.s(view, view.getLeft(), iF) : o65Var.q(view.getLeft(), iF))) {
            K(i);
            return;
        }
        K(2);
        O(i, true);
        this.N.c(i);
    }

    public final void N() {
        View view;
        int iA;
        WeakReference weakReference = this.h0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        j65.l(view, 524288);
        j65.i(view, 0);
        j65.l(view, 262144);
        j65.i(view, 0);
        j65.l(view, 1048576);
        j65.i(view, 0);
        SparseIntArray sparseIntArray = this.q0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            j65.l(view, i);
            j65.i(view, 0);
            sparseIntArray.delete(0);
        }
        int i2 = 3;
        int i3 = 6;
        if (!this.o && this.Y != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            x7 x7Var = new x7(i3, i2, this);
            ArrayList arrayListF = j65.f(view);
            int i4 = 0;
            while (true) {
                if (i4 >= arrayListF.size()) {
                    int i5 = 0;
                    int i6 = -1;
                    while (true) {
                        int[] iArr = j65.d;
                        if (i5 >= 32 || i6 != -1) {
                            break;
                        }
                        int i7 = iArr[i5];
                        boolean z = true;
                        for (int i8 = 0; i8 < arrayListF.size(); i8++) {
                            z &= ((o3) arrayListF.get(i8)).a() != i7;
                        }
                        if (z) {
                            i6 = i7;
                        }
                        i5++;
                    }
                    iA = i6;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((o3) arrayListF.get(i4)).a).getLabel())) {
                    iA = ((o3) arrayListF.get(i4)).a();
                    break;
                }
                i4++;
            }
            if (iA != -1) {
                o3 o3Var = new o3(null, iA, string, x7Var, null);
                View.AccessibilityDelegate accessibilityDelegateD = j65.d(view);
                z2 z2Var = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof y2 ? ((y2) accessibilityDelegateD).a : new z2(accessibilityDelegateD);
                if (z2Var == null) {
                    z2Var = new z2();
                }
                j65.o(view, z2Var);
                j65.l(view, o3Var.a());
                j65.f(view).add(o3Var);
                j65.i(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.V) {
            int i9 = 5;
            if (this.Y != 5) {
                j65.m(view, o3.n, new x7(i9, i2, this));
            }
        }
        int i10 = this.Y;
        int i11 = 4;
        if (i10 == 3) {
            j65.m(view, o3.m, new x7(this.o ? 4 : 6, i2, this));
            return;
        }
        if (i10 == 4) {
            j65.m(view, o3.l, new x7(this.o ? 3 : 6, i2, this));
        } else {
            if (i10 != 6) {
                return;
            }
            j65.m(view, o3.m, new x7(i11, i2, this));
            j65.m(view, o3.l, new x7(i2, i2, this));
        }
    }

    public final void O(int i, boolean z) {
        fi2 fi2Var;
        if (i == 2) {
            return;
        }
        boolean z2 = this.Y == 3 && (this.K || G());
        if (this.M == z2 || (fi2Var = this.v) == null) {
            return;
        }
        this.M = z2;
        ValueAnimator valueAnimator = this.O;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            fi2Var.n(this.M ? y() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(fi2Var.n.i, z2 ? y() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void P(boolean z) {
        WeakReference weakReference = this.h0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.p0 != null) {
                    return;
                } else {
                    this.p0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.h0.get() && z) {
                    this.p0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.p0 = null;
        }
    }

    public final void Q() {
        View view;
        if (this.h0 != null) {
            x();
            if (this.Y != 4 || (view = (View) this.h0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.zg2
    public final void a() {
        dh2 dh2Var = this.l0;
        if (dh2Var == null) {
            return;
        }
        int i = dh2Var.d;
        int i2 = dh2Var.c;
        oo ooVar = dh2Var.f;
        dh2Var.f = null;
        if (ooVar != null) {
            float f = ooVar.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.V) {
                    AnimatorSet animatorSetB = dh2Var.b();
                    animatorSetB.setDuration(yd.c(i2, f, i));
                    animatorSetB.start();
                    J(4);
                    return;
                }
                l4 l4Var = new l4(3, this);
                View view = dh2Var.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                objectAnimatorOfFloat.setInterpolator(new a61(1));
                objectAnimatorOfFloat.setDuration(yd.c(i2, f, i));
                objectAnimatorOfFloat.addListener(new l4(11, dh2Var));
                objectAnimatorOfFloat.addListener(l4Var);
                objectAnimatorOfFloat.start();
                return;
            }
        }
        J(this.V ? 5 : 4);
    }

    @Override // defpackage.zg2
    public final void b(oo ooVar) {
        dh2 dh2Var = this.l0;
        if (dh2Var == null) {
            return;
        }
        if (dh2Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        oo ooVar2 = dh2Var.f;
        dh2Var.f = ooVar;
        if (ooVar2 == null) {
            return;
        }
        dh2Var.c(ooVar.c);
    }

    @Override // defpackage.zg2
    public final void c(oo ooVar) {
        dh2 dh2Var = this.l0;
        if (dh2Var == null) {
            return;
        }
        dh2Var.f = ooVar;
    }

    @Override // defpackage.zg2
    public final void d() {
        dh2 dh2Var = this.l0;
        if (dh2Var == null || dh2Var.a() == null) {
            return;
        }
        AnimatorSet animatorSetB = dh2Var.b();
        animatorSetB.setDuration(dh2Var.e);
        animatorSetB.start();
    }

    @Override // defpackage.de0
    public final void g(ge0 ge0Var) {
        this.h0 = null;
        this.Z = null;
        this.l0 = null;
    }

    @Override // defpackage.de0
    public final void j() {
        this.h0 = null;
        this.Z = null;
        this.l0 = null;
    }

    @Override // defpackage.de0
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        o65 o65Var;
        if (!view.isShown() || !this.X) {
            this.a0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.m0 = -1;
            this.n0 = -1;
            VelocityTracker velocityTracker = this.k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.k0 = null;
            }
        }
        if (this.k0 == null) {
            this.k0 = VelocityTracker.obtain();
        }
        this.k0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.n0 = (int) motionEvent.getY();
            if (this.Y != 2) {
                WeakReference weakReference = this.i0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x, this.n0)) {
                    this.m0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.o0 = true;
                }
            }
            this.a0 = this.m0 == -1 && !coordinatorLayout.p(view, x, this.n0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.o0 = false;
            this.m0 = -1;
            if (this.a0) {
                this.a0 = false;
                return false;
            }
        }
        if (this.a0 || (o65Var = this.Z) == null || !o65Var.r(motionEvent)) {
            WeakReference weakReference2 = this.i0;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.a0 || this.Y == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Z == null || (i = this.n0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Z.b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.de0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = j65.a;
        int i2 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.h0 == null) {
            this.t = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.A || this.s) ? false : true;
            if (this.B || this.C || this.D || this.F || this.G || this.H || z) {
                vr1.k(view, new xk0(this, z, i2));
            }
            j65.q(view, new wz1(view));
            this.h0 = new WeakReference(view);
            this.l0 = new dh2(view);
            fi2 fi2Var = this.v;
            if (fi2Var != null) {
                view.setBackground(fi2Var);
                float elevation = this.U;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                fi2Var.l(elevation);
            } else {
                ColorStateList colorStateList = this.w;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            N();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Z == null) {
            this.Z = new o65(coordinatorLayout.getContext(), coordinatorLayout, this.r0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i);
        this.f0 = coordinatorLayout.getWidth();
        this.g0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.e0 = height;
        int iMin = this.g0;
        int i4 = iMin - height;
        int i5 = this.J;
        if (i4 < i5) {
            boolean z2 = this.E;
            int i6 = this.y;
            if (z2) {
                if (i6 != -1) {
                    iMin = Math.min(iMin, i6);
                }
                this.e0 = iMin;
            } else {
                int iMin2 = iMin - i5;
                if (i6 != -1) {
                    iMin2 = Math.min(iMin2, i6);
                }
                this.e0 = iMin2;
            }
        }
        this.Q = Math.max(0, this.g0 - this.e0);
        this.R = (int) ((1.0f - this.S) * this.g0);
        x();
        int i7 = this.Y;
        if (i7 == 3) {
            view.offsetTopAndBottom(E());
        } else if (i7 == 6) {
            view.offsetTopAndBottom(this.R);
        } else if (this.V && i7 == 5) {
            view.offsetTopAndBottom(this.g0);
        } else if (i7 == 4) {
            view.offsetTopAndBottom(this.T);
        } else if (i7 == 1 || i7 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        O(this.Y, false);
        this.i0 = new WeakReference(B(view));
        while (true) {
            ArrayList arrayList = this.j0;
            if (i3 >= arrayList.size()) {
                return true;
            }
            ((ut) arrayList.get(i3)).a(view);
            i3++;
        }
    }

    @Override // defpackage.de0
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.x, marginLayoutParams.width), D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.y, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.de0
    public final boolean n(View view) {
        WeakReference weakReference = this.i0;
        return (weakReference == null || view != weakReference.get() || this.Y == 3) ? false : true;
    }

    @Override // defpackage.de0
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.i0;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < E()) {
                int iE = top - E();
                iArr[1] = iE;
                int i5 = -iE;
                WeakHashMap weakHashMap = j65.a;
                view.offsetTopAndBottom(i5);
                K(3);
            } else {
                if (!this.X) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = j65.a;
                view.offsetTopAndBottom(-i2);
                K(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.T;
            if (i4 > i6 && !this.V) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = j65.a;
                view.offsetTopAndBottom(i8);
                K(4);
            } else {
                if (!this.X) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = j65.a;
                view.offsetTopAndBottom(-i2);
                K(1);
            }
        }
        A(view.getTop());
        this.b0 = i2;
        this.c0 = true;
    }

    @Override // defpackage.de0
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // defpackage.de0
    public final void r(View view, Parcelable parcelable) {
        vt vtVar = (vt) parcelable;
        int i = this.n;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.r = vtVar.q;
            }
            if (i == -1 || (i & 2) == 2) {
                this.o = vtVar.r;
            }
            if (i == -1 || (i & 4) == 4) {
                this.V = vtVar.s;
            }
            if (i == -1 || (i & 8) == 8) {
                this.W = vtVar.t;
            }
        }
        int i2 = vtVar.p;
        if (i2 == 1 || i2 == 2) {
            this.Y = 4;
        } else {
            this.Y = i2;
        }
    }

    @Override // defpackage.de0
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new vt(this);
    }

    @Override // defpackage.de0
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.b0 = 0;
        this.c0 = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // defpackage.de0
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == E()) {
            K(3);
            return;
        }
        WeakReference weakReference = this.i0;
        if (weakReference != null && view2 == weakReference.get() && this.c0) {
            if (this.b0 > 0) {
                if (!this.o && view.getTop() > this.R) {
                    i3 = 6;
                }
            } else if (this.V) {
                VelocityTracker velocityTracker = this.k0;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.p);
                    yVelocity = this.k0.getYVelocity(this.m0);
                }
                if (L(view, yVelocity)) {
                    i3 = 5;
                } else if (this.b0 == 0) {
                    top2 = view.getTop();
                    if (this.o) {
                        i2 = this.R;
                        if (top2 < i2) {
                            if (top2 >= Math.abs(top2 - this.T)) {
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.T)) {
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.Q) >= Math.abs(top2 - this.T)) {
                        i3 = 4;
                    }
                } else {
                    if (!this.o) {
                        top = view.getTop();
                        if (Math.abs(top - this.R) < Math.abs(top - this.T)) {
                            i3 = 6;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.b0 == 0) {
                top2 = view.getTop();
                if (this.o) {
                    i2 = this.R;
                    if (top2 < i2) {
                        if (top2 >= Math.abs(top2 - this.T)) {
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.T)) {
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.Q) >= Math.abs(top2 - this.T)) {
                    i3 = 4;
                }
            } else {
                if (!this.o) {
                    top = view.getTop();
                    if (Math.abs(top - this.R) < Math.abs(top - this.T)) {
                        i3 = 6;
                    }
                }
                i3 = 4;
            }
            M(view, i3, false);
            this.c0 = false;
        }
    }

    @Override // defpackage.de0
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.Y;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        o65 o65Var = this.Z;
        if (o65Var != null && (this.X || i == 1)) {
            o65Var.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.m0 = -1;
            this.n0 = -1;
            VelocityTracker velocityTracker = this.k0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.k0 = null;
            }
        }
        if (this.k0 == null) {
            this.k0 = VelocityTracker.obtain();
        }
        this.k0.addMovement(motionEvent);
        if (this.Z != null && ((this.X || this.Y == 1) && actionMasked == 2 && !this.a0)) {
            float fAbs = Math.abs(this.n0 - motionEvent.getY());
            o65 o65Var2 = this.Z;
            if (fAbs > o65Var2.b) {
                o65Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.a0;
    }

    public final void w(ut utVar) {
        ArrayList arrayList = this.j0;
        if (arrayList.contains(utVar)) {
            return;
        }
        arrayList.add(utVar);
    }

    public final void x() {
        int iZ = z();
        boolean z = this.o;
        int i = this.g0;
        if (z) {
            this.T = Math.max(i - iZ, this.Q);
        } else {
            this.T = i - iZ;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public final float y() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        float f2 = 0.0f;
        fi2 fi2Var = this.v;
        if (fi2Var != null && (weakReference = this.h0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.h0.get();
            if (G() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fH = fi2Var.h();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= 0.0f || fH <= 0.0f) {
                        f = 0.0f;
                    } else {
                        f = radius / fH;
                    }
                } else {
                    f = 0.0f;
                }
                float fA = fi2Var.n.a.f.a(fi2Var.g());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fA > 0.0f) {
                        f2 = radius2 / fA;
                    }
                }
                return Math.max(f, f2);
            }
        }
        return 0.0f;
    }

    public final int z() {
        int iMin;
        int i;
        int i2;
        if (this.s) {
            iMin = Math.min(Math.max(this.t, this.g0 - ((this.f0 * 9) / 16)), this.e0);
            i = this.I;
        } else {
            if (!this.A && !this.B && (i2 = this.z) > 0) {
                return Math.max(this.r, i2 + this.u);
            }
            iMin = this.r;
            i = this.I;
        }
        return iMin + i;
    }

    public BottomSheetBehavior() {
        this.n = 0;
        this.o = true;
        this.x = -1;
        this.y = -1;
        this.N = new bk(this);
        this.S = 0.5f;
        this.U = -1.0f;
        this.X = true;
        this.Y = 4;
        this.d0 = 0.1f;
        this.j0 = new ArrayList();
        this.n0 = -1;
        this.q0 = new SparseIntArray();
        this.r0 = new tt(this, 0);
    }
}
