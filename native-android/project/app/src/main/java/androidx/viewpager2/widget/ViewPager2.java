package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.b11;
import defpackage.bc3;
import defpackage.dw3;
import defpackage.ee1;
import defpackage.et3;
import defpackage.g5;
import defpackage.h45;
import defpackage.i75;
import defpackage.j65;
import defpackage.j75;
import defpackage.jc1;
import defpackage.jw3;
import defpackage.k64;
import defpackage.k75;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.l64;
import defpackage.l75;
import defpackage.ld1;
import defpackage.mw3;
import defpackage.n75;
import defpackage.o75;
import defpackage.p75;
import defpackage.q75;
import defpackage.q80;
import defpackage.rm2;
import defpackage.rq;
import defpackage.ss0;
import defpackage.t3;
import defpackage.tb4;
import defpackage.tl0;
import defpackage.xe2;
import defpackage.zg5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public zg5 A;
    public bc3 B;
    public jw3 C;
    public boolean D;
    public boolean E;
    public int F;
    public ss0 G;
    public final Rect n;
    public final Rect o;
    public final q80 p;
    public int q;
    public boolean r;
    public final i75 s;
    public l75 t;
    public int u;
    public Parcelable v;
    public p75 w;
    public o75 x;
    public l64 y;
    public q80 z;

    public ViewPager2(Context context) {
        super(context);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new q80();
        this.r = false;
        this.s = new i75(0, this);
        this.u = -1;
        this.C = null;
        this.D = false;
        this.E = true;
        this.F = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        ss0 ss0Var = new ss0();
        ss0Var.q = this;
        ss0Var.n = new rm2(29, ss0Var);
        ss0Var.o = new h45(2, ss0Var);
        this.G = ss0Var;
        p75 p75Var = new p75(this, context);
        this.w = p75Var;
        WeakHashMap weakHashMap = j65.a;
        p75Var.setId(View.generateViewId());
        this.w.setDescendantFocusability(131072);
        l75 l75Var = new l75(this);
        this.t = l75Var;
        this.w.setLayoutManager(l75Var);
        int i = 1;
        this.w.setScrollingTouchSlop(1);
        int[] iArr = et3.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        j65.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        int i2 = 0;
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.w.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            p75 p75Var2 = this.w;
            k75 k75Var = new k75();
            if (p75Var2.P == null) {
                p75Var2.P = new ArrayList();
            }
            p75Var2.P.add(k75Var);
            l64 l64Var = new l64(this);
            this.y = l64Var;
            this.A = new zg5(l64Var);
            o75 o75Var = new o75(this);
            this.x = o75Var;
            o75Var.a(this.w);
            this.w.j(this.y);
            q80 q80Var = new q80();
            this.z = q80Var;
            this.y.a = q80Var;
            j75 j75Var = new j75(this, i2);
            j75 j75Var2 = new j75(this, i);
            ((ArrayList) q80Var.b).add(j75Var);
            ((ArrayList) this.z.b).add(j75Var2);
            ss0 ss0Var2 = this.G;
            p75 p75Var3 = this.w;
            ss0Var2.getClass();
            p75Var3.setImportantForAccessibility(2);
            ss0Var2.p = new i75(i, ss0Var2);
            ViewPager2 viewPager2 = (ViewPager2) ss0Var2.q;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.z.b).add(this.p);
            bc3 bc3Var = new bc3();
            this.B = bc3Var;
            ((ArrayList) this.z.b).add(bc3Var);
            p75 p75Var4 = this.w;
            attachViewToParent(p75Var4, 0, p75Var4.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b() {
        dw3 adapter;
        kc1 kc1VarT;
        if (this.u == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.v;
        if (parcelable != null) {
            if (adapter instanceof ee1) {
                ee1 ee1Var = (ee1) adapter;
                xe2 xe2Var = ee1Var.s;
                xe2 xe2Var2 = ee1Var.t;
                if (!xe2Var2.d() || !xe2Var.d()) {
                    kf2.o("Expected the adapter to be 'fresh' while restoring state.");
                    return;
                }
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(ee1Var.getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    int i = 2;
                    if (!it.hasNext()) {
                        if (!xe2Var.d()) {
                            ee1Var.y = true;
                            ee1Var.x = true;
                            ee1Var.s();
                            Handler handler = new Handler(Looper.getMainLooper());
                            g5 g5Var = new g5(14, ee1Var);
                            ee1Var.q.a(new tl0(i, handler, g5Var));
                            handler.postDelayed(g5Var, 10000L);
                            break;
                        }
                        break;
                    }
                    String next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        long j = Long.parseLong(next.substring(2));
                        ld1 ld1Var = ee1Var.r;
                        ld1Var.getClass();
                        String string = bundle.getString(next);
                        if (string == null) {
                            kc1VarT = null;
                        } else {
                            kc1VarT = ld1Var.c.t(string);
                            if (kc1VarT == null) {
                                ld1Var.g0(new IllegalStateException("Fragment no longer exists for key " + next + ": unique id " + string));
                                throw null;
                            }
                        }
                        xe2Var.f(j, kc1VarT);
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            kf2.n("Unexpected key in savedState: ".concat(next));
                            return;
                        }
                        long j2 = Long.parseLong(next.substring(2));
                        jc1 jc1Var = (jc1) bundle.getParcelable(next);
                        if (ee1Var.q(j2)) {
                            xe2Var2.f(j2, jc1Var);
                        }
                    }
                }
            }
            this.v = null;
        }
        int iMax = Math.max(0, Math.min(this.u, adapter.a() - 1));
        this.q = iMax;
        this.u = -1;
        this.w.j0(iMax);
        this.G.H();
    }

    public final void c(int i, boolean z) {
        Object obj = this.A.n;
        d(i, z);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.w.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.w.canScrollVertically(i);
    }

    public final void d(int i, boolean z) {
        q80 q80Var;
        dw3 adapter = getAdapter();
        if (adapter == null) {
            if (this.u != -1) {
                this.u = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.a() - 1);
        int i2 = this.q;
        if (iMin == i2 && this.y.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.q = iMin;
        this.G.H();
        l64 l64Var = this.y;
        if (l64Var.f != 0) {
            l64Var.e();
            k64 k64Var = l64Var.g;
            d = ((double) k64Var.b) + ((double) k64Var.a);
        }
        l64 l64Var2 = this.y;
        l64Var2.getClass();
        l64Var2.e = z ? 2 : 3;
        boolean z2 = l64Var2.i != iMin;
        l64Var2.i = iMin;
        l64Var2.c(2);
        if (z2 && (q80Var = l64Var2.a) != null) {
            q80Var.c(iMin);
        }
        if (!z) {
            this.w.j0(iMin);
            return;
        }
        double d2 = iMin;
        double dAbs = Math.abs(d2 - d);
        p75 p75Var = this.w;
        if (dAbs <= 3.0d) {
            p75Var.m0(iMin);
            return;
        }
        p75Var.j0(d2 > d ? iMin - 3 : iMin + 3);
        p75 p75Var2 = this.w;
        p75Var2.post(new rq(iMin, p75Var2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof q75) {
            int i = ((q75) parcelable).n;
            sparseArray.put(this.w.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public final void e() {
        o75 o75Var = this.x;
        if (o75Var == null) {
            kf2.o("Design assumption violated.");
            return;
        }
        View viewG = o75Var.g(this.t);
        if (viewG == null) {
            return;
        }
        this.t.getClass();
        int I = mw3.I(viewG);
        if (I != this.q && getScrollState() == 0) {
            this.z.c(I);
        }
        this.r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.G.getClass();
        this.G.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public dw3 getAdapter() {
        return this.w.getAdapter();
    }

    public int getCurrentItem() {
        return this.q;
    }

    public int getItemDecorationCount() {
        return this.w.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.F;
    }

    public int getOrientation() {
        return this.t.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        p75 p75Var = this.w;
        if (getOrientation() == 0) {
            height = p75Var.getWidth() - p75Var.getPaddingLeft();
            paddingBottom = p75Var.getPaddingRight();
        } else {
            height = p75Var.getHeight() - p75Var.getPaddingTop();
            paddingBottom = p75Var.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.y.f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iA;
        int iA2;
        int iA3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.G.q;
        if (viewPager2.getAdapter() == null) {
            iA = 0;
            iA2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iA = viewPager2.getAdapter().a();
            iA2 = 1;
        } else {
            iA2 = viewPager2.getAdapter().a();
            iA = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) t3.a(iA, iA2, 0).a);
        dw3 adapter = viewPager2.getAdapter();
        if (adapter == null || (iA3 = adapter.a()) == 0 || !viewPager2.E) {
            return;
        }
        if (viewPager2.q > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.q < iA3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.w.getMeasuredWidth();
        int measuredHeight = this.w.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.n;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.o;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.w.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.r) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.w, i, i2);
        int measuredWidth = this.w.getMeasuredWidth();
        int measuredHeight = this.w.getMeasuredHeight();
        int measuredState = this.w.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof q75)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q75 q75Var = (q75) parcelable;
        super.onRestoreInstanceState(q75Var.getSuperState());
        this.u = q75Var.o;
        this.v = q75Var.p;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        q75 q75Var = new q75(super.onSaveInstanceState());
        q75Var.n = this.w.getId();
        int i = this.u;
        if (i == -1) {
            i = this.q;
        }
        q75Var.o = i;
        Parcelable parcelable = this.v;
        if (parcelable != null) {
            q75Var.p = parcelable;
            return q75Var;
        }
        dw3 adapter = this.w.getAdapter();
        if (adapter instanceof ee1) {
            ee1 ee1Var = (ee1) adapter;
            xe2 xe2Var = ee1Var.s;
            int iH = xe2Var.h();
            xe2 xe2Var2 = ee1Var.t;
            Bundle bundle = new Bundle(xe2Var2.h() + iH);
            for (int i2 = 0; i2 < xe2Var.h(); i2++) {
                long jE = xe2Var.e(i2);
                kc1 kc1Var = (kc1) xe2Var.b(jE);
                if (kc1Var != null && kc1Var.y()) {
                    String strK = b11.k("f#", jE);
                    ld1 ld1Var = ee1Var.r;
                    ld1Var.getClass();
                    if (kc1Var.F != ld1Var) {
                        ld1Var.g0(new IllegalStateException(b11.l("Fragment ", kc1Var, " is not currently in the FragmentManager")));
                        throw null;
                    }
                    bundle.putString(strK, kc1Var.r);
                }
            }
            for (int i3 = 0; i3 < xe2Var2.h(); i3++) {
                long jE2 = xe2Var2.e(i3);
                if (ee1Var.q(jE2)) {
                    bundle.putParcelable(b11.k("s#", jE2), (Parcelable) xe2Var2.b(jE2));
                }
            }
            q75Var.p = bundle;
        }
        return q75Var;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.G.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ss0 ss0Var = this.G;
        ss0Var.getClass();
        ViewPager2 viewPager2 = (ViewPager2) ss0Var.q;
        if (i != 8192 && i != 4096) {
            tb4.a();
            return false;
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.E) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    public void setAdapter(dw3 dw3Var) {
        dw3 adapter = this.w.getAdapter();
        ss0 ss0Var = this.G;
        if (adapter != null) {
            adapter.n.unregisterObserver((i75) ss0Var.p);
        } else {
            ss0Var.getClass();
        }
        i75 i75Var = this.s;
        if (adapter != null) {
            adapter.n.unregisterObserver(i75Var);
        }
        this.w.setAdapter(dw3Var);
        this.q = 0;
        b();
        ss0 ss0Var2 = this.G;
        ss0Var2.H();
        if (dw3Var != null) {
            dw3Var.n.registerObserver((i75) ss0Var2.p);
        }
        if (dw3Var != null) {
            dw3Var.n.registerObserver(i75Var);
        }
    }

    public void setCurrentItem(int i) {
        c(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.G.H();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            kf2.n("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        } else {
            this.F = i;
            this.w.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.t.g1(i);
        this.G.H();
    }

    public void setPageTransformer(n75 n75Var) {
        boolean z = this.D;
        if (n75Var != null) {
            if (!z) {
                this.C = this.w.getItemAnimator();
                this.D = true;
            }
            this.w.setItemAnimator(null);
        } else if (z) {
            this.w.setItemAnimator(this.C);
            this.C = null;
            this.D = false;
        }
        this.B.getClass();
        if (n75Var == null) {
            return;
        }
        this.B.getClass();
        this.B.getClass();
    }

    public void setUserInputEnabled(boolean z) {
        this.E = z;
        this.G.H();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new q80();
        this.r = false;
        this.s = new i75(0, this);
        this.u = -1;
        this.C = null;
        this.D = false;
        this.E = true;
        this.F = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new q80();
        this.r = false;
        this.s = new i75(0, this);
        this.u = -1;
        this.C = null;
        this.D = false;
        this.E = true;
        this.F = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = new Rect();
        this.o = new Rect();
        this.p = new q80();
        this.r = false;
        this.s = new i75(0, this);
        this.u = -1;
        this.C = null;
        this.D = false;
        this.E = true;
        this.F = -1;
        a(context, attributeSet);
    }
}
