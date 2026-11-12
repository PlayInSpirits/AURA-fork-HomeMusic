package com.google.android.material.sidesheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import defpackage.b11;
import defpackage.bc4;
import defpackage.bk;
import defpackage.de0;
import defpackage.e92;
import defpackage.f34;
import defpackage.fi2;
import defpackage.ge0;
import defpackage.h12;
import defpackage.hi2;
import defpackage.ht3;
import defpackage.j65;
import defpackage.kf2;
import defpackage.l4;
import defpackage.m;
import defpackage.o3;
import defpackage.o65;
import defpackage.oo;
import defpackage.q31;
import defpackage.rd4;
import defpackage.tt;
import defpackage.ul;
import defpackage.wr1;
import defpackage.xa3;
import defpackage.zc1;
import defpackage.zg2;
import defpackage.zr2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends de0 implements zg2 {
    public int A;
    public int B;
    public WeakReference C;
    public WeakReference D;
    public final int E;
    public VelocityTracker F;
    public hi2 G;
    public int H;
    public final LinkedHashSet I;
    public final tt J;
    public wr1 n;
    public final fi2 o;
    public final ColorStateList p;
    public final bc4 q;
    public final bk r;
    public final float s;
    public final boolean t;
    public int u;
    public o65 v;
    public boolean w;
    public final float x;
    public int y;
    public int z;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.r = new bk(this);
        this.t = true;
        this.u = 5;
        this.x = 0.1f;
        this.E = -1;
        this.I = new LinkedHashSet();
        this.J = new tt(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ht3.R);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.p = h12.s(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.q = bc4.c(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.E = resourceId;
            WeakReference weakReference = this.D;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.D = null;
            WeakReference weakReference2 = this.C;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = j65.a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        bc4 bc4Var = this.q;
        if (bc4Var != null) {
            fi2 fi2Var = new fi2(bc4Var);
            this.o = fi2Var;
            fi2Var.j(context);
            ColorStateList colorStateList = this.p;
            if (colorStateList != null) {
                this.o.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.o.setTint(typedValue.data);
            }
        }
        this.s = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.t = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void A() {
        View view;
        WeakReference weakReference = this.C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        j65.l(view, 262144);
        j65.i(view, 0);
        j65.l(view, 1048576);
        j65.i(view, 0);
        int i = 6;
        int i2 = 5;
        if (this.u != 5) {
            j65.m(view, o3.n, new q31(i2, i, this));
        }
        int i3 = 3;
        if (this.u != 3) {
            j65.m(view, o3.l, new q31(i3, i, this));
        }
    }

    @Override // defpackage.zg2
    public final void a() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        hi2 hi2Var = this.G;
        if (hi2Var == null) {
            return;
        }
        oo ooVar = hi2Var.f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        hi2Var.f = null;
        int i = 5;
        if (ooVar == null || Build.VERSION.SDK_INT < 34) {
            w(5);
            return;
        }
        wr1 wr1Var = this.n;
        if (wr1Var != null && wr1Var.B() != 0) {
            i = 3;
        }
        l4 l4Var = new l4(13, this);
        WeakReference weakReference = this.D;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iS = this.n.s(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: qd4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.n.T(marginLayoutParams, yd.c(iS, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        hi2Var.c(ooVar, i, l4Var, animatorUpdateListener);
    }

    @Override // defpackage.zg2
    public final void b(oo ooVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        hi2 hi2Var = this.G;
        if (hi2Var == null) {
            return;
        }
        wr1 wr1Var = this.n;
        int i = (wr1Var == null || wr1Var.B() == 0) ? 5 : 3;
        if (hi2Var.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        oo ooVar2 = hi2Var.f;
        hi2Var.f = ooVar;
        if (ooVar2 != null) {
            hi2Var.d(ooVar.c, i, ooVar.d == 0);
        }
        WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.C.get();
        WeakReference weakReference2 = this.D;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.n.T(marginLayoutParams, (int) ((view.getScaleX() * this.y) + this.B));
        view2.requestLayout();
    }

    @Override // defpackage.zg2
    public final void c(oo ooVar) {
        hi2 hi2Var = this.G;
        if (hi2Var == null) {
            return;
        }
        hi2Var.f = ooVar;
    }

    @Override // defpackage.zg2
    public final void d() {
        hi2 hi2Var = this.G;
        if (hi2Var == null) {
            return;
        }
        hi2Var.b();
    }

    @Override // defpackage.de0
    public final void g(ge0 ge0Var) {
        this.C = null;
        this.v = null;
        this.G = null;
    }

    @Override // defpackage.de0
    public final void j() {
        this.C = null;
        this.v = null;
        this.G = null;
    }

    @Override // defpackage.de0
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        o65 o65Var;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && j65.e(view) == null) || !this.t) {
            this.w = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.F) != null) {
            velocityTracker.recycle();
            this.F = null;
        }
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.H = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.w) {
            this.w = false;
            return false;
        }
        return (this.w || (o65Var = this.v) == null || !o65Var.r(motionEvent)) ? false : true;
    }

    @Override // defpackage.de0
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int iY;
        int i2;
        View viewFindViewById;
        WeakHashMap weakHashMap = j65.a;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.C;
        fi2 fi2Var = this.o;
        int i4 = 0;
        if (weakReference == null) {
            this.C = new WeakReference(view);
            this.G = new hi2(view);
            if (fi2Var != null) {
                view.setBackground(fi2Var);
                float elevation = this.s;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                fi2Var.l(elevation);
            } else {
                ColorStateList colorStateList = this.p;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            int i5 = this.u == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            A();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (j65.e(view) == null) {
                j65.p(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((ge0) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        wr1 wr1Var = this.n;
        if (wr1Var == null || wr1Var.B() != i6) {
            ge0 ge0Var = null;
            bc4 bc4Var = this.q;
            if (i6 == 0) {
                this.n = new e92(this, i3);
                if (bc4Var != null) {
                    WeakReference weakReference2 = this.C;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof ge0)) {
                        ge0Var = (ge0) view3.getLayoutParams();
                    }
                    if (ge0Var == null || ((ViewGroup.MarginLayoutParams) ge0Var).rightMargin <= 0) {
                        zc1 zc1VarG = bc4Var.g();
                        zc1VarG.f = new m(0.0f);
                        zc1VarG.g = new m(0.0f);
                        bc4 bc4VarA = zc1VarG.a();
                        if (fi2Var != null) {
                            fi2Var.setShapeAppearanceModel(bc4VarA);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    kf2.n(b11.j(i6, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                    return false;
                }
                this.n = new e92(this, i4);
                if (bc4Var != null) {
                    WeakReference weakReference3 = this.C;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof ge0)) {
                        ge0Var = (ge0) view2.getLayoutParams();
                    }
                    if (ge0Var == null || ((ViewGroup.MarginLayoutParams) ge0Var).leftMargin <= 0) {
                        zc1 zc1VarG2 = bc4Var.g();
                        zc1VarG2.e = new m(0.0f);
                        zc1VarG2.h = new m(0.0f);
                        bc4 bc4VarA2 = zc1VarG2.a();
                        if (fi2Var != null) {
                            fi2Var.setShapeAppearanceModel(bc4VarA2);
                        }
                    }
                }
            }
        }
        if (this.v == null) {
            this.v = new o65(coordinatorLayout.getContext(), coordinatorLayout, this.J);
        }
        int iY2 = this.n.y(view);
        coordinatorLayout.r(view, i);
        this.z = coordinatorLayout.getWidth();
        this.A = this.n.z(coordinatorLayout);
        this.y = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.B = marginLayoutParams != null ? this.n.e(marginLayoutParams) : 0;
        int i7 = this.u;
        if (i7 == 1 || i7 == 2) {
            iY = iY2 - this.n.y(view);
        } else if (i7 == 3) {
            iY = 0;
        } else {
            if (i7 != 5) {
                zr2.c(this.u, "Unexpected value: ");
                return false;
            }
            iY = this.n.u();
        }
        view.offsetLeftAndRight(iY);
        if (this.D == null && (i2 = this.E) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.D = new WeakReference(viewFindViewById);
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                kf2.k();
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.de0
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.de0
    public final void r(View view, Parcelable parcelable) {
        int i = ((rd4) parcelable).p;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.u = i;
    }

    @Override // defpackage.de0
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new rd4(this);
    }

    @Override // defpackage.de0
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.u == 1 && actionMasked == 0) {
            return true;
        }
        if (y()) {
            this.v.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.F) != null) {
            velocityTracker.recycle();
            this.F = null;
        }
        if (this.F == null) {
            this.F = VelocityTracker.obtain();
        }
        this.F.addMovement(motionEvent);
        if (y() && actionMasked == 2 && !this.w && y()) {
            float fAbs = Math.abs(this.H - motionEvent.getX());
            o65 o65Var = this.v;
            if (fAbs > o65Var.b) {
                o65Var.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.w;
    }

    public final void w(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(b11.q(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null) {
            x(i);
            return;
        }
        View view = (View) this.C.get();
        ul ulVar = new ul(i, 6, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = j65.a;
            if (view.isAttachedToWindow()) {
                view.post(ulVar);
                return;
            }
        }
        ulVar.run();
    }

    public final void x(int i) {
        View view;
        if (this.u == i) {
            return;
        }
        this.u = i;
        WeakReference weakReference = this.C;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.u == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.I.iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
        A();
    }

    public final boolean y() {
        if (this.v != null) {
            return this.t || this.u == 1;
        }
        return false;
    }

    public final void z(View view, int i, boolean z) {
        int iT;
        if (i == 3) {
            iT = this.n.t();
        } else {
            if (i != 5) {
                kf2.n(f34.f(i, "Invalid state to get outer edge offset: "));
                return;
            }
            iT = this.n.u();
        }
        o65 o65Var = this.v;
        if (o65Var == null || (!z ? o65Var.s(view, iT, view.getTop()) : o65Var.q(iT, view.getTop()))) {
            x(i);
        } else {
            x(2);
            this.r.c(i);
        }
    }

    public SideSheetBehavior() {
        this.r = new bk(this);
        this.t = true;
        this.u = 5;
        this.x = 0.1f;
        this.E = -1;
        this.I = new LinkedHashSet();
        this.J = new tt(this, 1);
    }
}
