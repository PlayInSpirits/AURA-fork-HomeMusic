package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mw3 {
    public ew4 a;
    public RecyclerView b;
    public final qr2 c;
    public final qr2 d;
    public db2 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public mw3() {
        pz1 pz1Var = new pz1(18, this);
        rm2 rm2Var = new rm2(13, this);
        this.c = new qr2((u55) pz1Var);
        this.d = new qr2((u55) rm2Var);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        return view.getLeft() - ((nw3) view.getLayoutParams()).b.left;
    }

    public static int B(View view) {
        return view.getRight() + ((nw3) view.getLayoutParams()).b.right;
    }

    public static int C(View view) {
        return view.getTop() - ((nw3) view.getLayoutParams()).b.top;
    }

    public static int I(View view) {
        return ((nw3) view.getLayoutParams()).a.d();
    }

    public static lw3 J(Context context, AttributeSet attributeSet, int i, int i2) {
        lw3 lw3Var = new lw3();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ct3.a, i, i2);
        lw3Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        lw3Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        lw3Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        lw3Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return lw3Var;
    }

    public static boolean O(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void P(View view, int i, int i2, int i3, int i4) {
        nw3 nw3Var = (nw3) view.getLayoutParams();
        Rect rect = nw3Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) nw3Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) nw3Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) nw3Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nw3Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int y(View view) {
        return view.getBottom() + ((nw3) view.getLayoutParams()).b.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final boolean B0(View view, int i, int i2, nw3 nw3Var) {
        return (this.h && O(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) nw3Var).width) && O(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) nw3Var).height)) ? false : true;
    }

    public abstract void C0(RecyclerView recyclerView, int i);

    public final int D() {
        RecyclerView recyclerView = this.b;
        dw3 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void D0(db2 db2Var) {
        db2 db2Var2 = this.e;
        if (db2Var2 != null && db2Var != db2Var2 && db2Var2.e) {
            db2Var2.i();
        }
        this.e = db2Var;
        RecyclerView recyclerView = this.b;
        bx3 bx3Var = recyclerView.r0;
        bx3Var.t.removeCallbacks(bx3Var);
        bx3Var.p.abortAnimation();
        if (db2Var.h) {
            Log.w("RecyclerView", "An instance of " + db2Var.getClass().getSimpleName() + " was started more than once. Each instance of" + db2Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        db2Var.b = recyclerView;
        db2Var.c = this;
        int i = db2Var.a;
        if (i == -1) {
            kf2.n("Invalid target position");
            return;
        }
        recyclerView.u0.a = i;
        db2Var.e = true;
        db2Var.d = true;
        db2Var.f = recyclerView.A.q(i);
        db2Var.b.r0.b();
        db2Var.h = true;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean E0() {
        return false;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int H() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int K(hm2 hm2Var, yw3 yw3Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.z == null || !e()) {
            return 1;
        }
        return this.b.z.a();
    }

    public final void L(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((nw3) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.y;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean M() {
        return false;
    }

    public boolean N() {
        return false;
    }

    public void Q(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iH = recyclerView.s.h();
            for (int i2 = 0; i2 < iH; i2++) {
                recyclerView.s.g(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void R(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iH = recyclerView.s.h();
            for (int i2 = 0; i2 < iH; i2++) {
                recyclerView.s.g(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void S() {
    }

    public void T(RecyclerView recyclerView) {
    }

    public View U(View view, int i, hm2 hm2Var, yw3 yw3Var) {
        return null;
    }

    public void V(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        hm2 hm2Var = recyclerView.p;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        dw3 dw3Var = this.b.z;
        if (dw3Var != null) {
            accessibilityEvent.setItemCount(dw3Var.a());
        }
    }

    public void W(hm2 hm2Var, yw3 yw3Var, v3 v3Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            v3Var.a(8192);
            v3Var.m(true);
            v3Var.h(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            v3Var.a(4096);
            v3Var.m(true);
            v3Var.h(67108864, true);
        }
        v3Var.j(t3.a(K(hm2Var, yw3Var), x(hm2Var, yw3Var), 0));
    }

    public void X(hm2 hm2Var, yw3 yw3Var, View view, v3 v3Var) {
        v3Var.k(u3.a(e() ? I(view) : 0, 1, d() ? I(view) : 0, 1, false, false));
    }

    public final void Y(View view, v3 v3Var) {
        cx3 cx3VarN = RecyclerView.N(view);
        if (cx3VarN == null || cx3VarN.j()) {
            return;
        }
        ew4 ew4Var = this.a;
        if (((ArrayList) ew4Var.r).contains(cx3VarN.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        X(recyclerView.p, recyclerView.u0, view, v3Var);
    }

    public void Z(int i, int i2) {
    }

    public void a0() {
    }

    public final void b(View view, int i, boolean z) {
        cx3 cx3VarN = RecyclerView.N(view);
        if (z || cx3VarN.j()) {
            yd4 yd4Var = (yd4) this.b.t.n;
            r65 r65VarA = (r65) yd4Var.get(cx3VarN);
            if (r65VarA == null) {
                r65VarA = r65.a();
                yd4Var.put(cx3VarN, r65VarA);
            }
            r65VarA.a |= 1;
        } else {
            this.b.t.N(cx3VarN);
        }
        nw3 nw3Var = (nw3) view.getLayoutParams();
        if (cx3VarN.r() || cx3VarN.k()) {
            if (cx3VarN.k()) {
                cx3VarN.n.l(cx3VarN);
            } else {
                cx3VarN.j &= -33;
            }
            this.a.e(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            ew4 ew4Var = this.a;
            if (parent == recyclerView) {
                e20 e20Var = (e20) ew4Var.q;
                int iIndexOfChild = ((RecyclerView) ((rm2) ew4Var.p).o).indexOfChild(view);
                int iQ = (iIndexOfChild == -1 || e20Var.s(iIndexOfChild)) ? -1 : iIndexOfChild - e20Var.q(iIndexOfChild);
                if (i == -1) {
                    i = this.a.h();
                }
                if (iQ == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                }
                if (iQ != i) {
                    mw3 mw3Var = this.b.A;
                    View viewU = mw3Var.u(iQ);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iQ + mw3Var.b.toString());
                    }
                    mw3Var.u(iQ);
                    mw3Var.a.f(iQ);
                    nw3 nw3Var2 = (nw3) viewU.getLayoutParams();
                    cx3 cx3VarN2 = RecyclerView.N(viewU);
                    boolean zJ = cx3VarN2.j();
                    RecyclerView recyclerView2 = mw3Var.b;
                    if (zJ) {
                        yd4 yd4Var2 = (yd4) recyclerView2.t.n;
                        r65 r65VarA2 = (r65) yd4Var2.get(cx3VarN2);
                        if (r65VarA2 == null) {
                            r65VarA2 = r65.a();
                            yd4Var2.put(cx3VarN2, r65VarA2);
                        }
                        r65VarA2.a = 1 | r65VarA2.a;
                    } else {
                        recyclerView2.t.N(cx3VarN2);
                    }
                    mw3Var.a.e(viewU, i, nw3Var2, cx3VarN2.j());
                }
            } else {
                ew4Var.d(view, i, false);
                nw3Var.c = true;
                db2 db2Var = this.e;
                if (db2Var != null && db2Var.e) {
                    db2Var.b.getClass();
                    cx3 cx3VarN3 = RecyclerView.N(view);
                    if ((cx3VarN3 != null ? cx3VarN3.d() : -1) == db2Var.a) {
                        db2Var.f = view;
                        if (RecyclerView.Q0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (nw3Var.d) {
            if (RecyclerView.Q0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + nw3Var.a);
            }
            cx3VarN.a.invalidate();
            nw3Var.d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public void d0(int i, int i2) {
    }

    public abstract boolean e();

    public abstract void e0(hm2 hm2Var, yw3 yw3Var);

    public boolean f(nw3 nw3Var) {
        return nw3Var != null;
    }

    public abstract void f0(yw3 yw3Var);

    public void g0(Parcelable parcelable) {
    }

    public void h(int i, int i2, yw3 yw3Var, b30 b30Var) {
    }

    public Parcelable h0() {
        return null;
    }

    public void i(int i, b30 b30Var) {
    }

    public void i0(int i) {
    }

    public abstract int j(yw3 yw3Var);

    public boolean j0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.b;
        return k0(recyclerView.p, recyclerView.u0, i, bundle);
    }

    public abstract int k(yw3 yw3Var);

    /* JADX WARN: Code duplicated, block: B:21:0x0062 A[PHI: r8
  0x0062: PHI (r8v8 int) = (r8v5 int), (r8v20 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean k0(hm2 hm2Var, yw3 yw3Var, int i, Bundle bundle) {
        int iH;
        int iF;
        float f;
        if (this.b != null) {
            int iHeight = this.o;
            int iWidth = this.n;
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iH = this.b.canScrollVertically(1) ? (iHeight - H()) - E() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    iF = (iWidth - F()) - G();
                } else {
                    iF = 0;
                }
            } else if (i != 8192) {
                iH = 0;
                iF = 0;
            } else {
                iH = this.b.canScrollVertically(-1) ? -((iHeight - H()) - E()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    iF = -((iWidth - F()) - G());
                } else {
                    iF = 0;
                }
            }
            if (iH != 0 || iF != 0) {
                if (bundle != null) {
                    f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                    if (f < 0.0f) {
                        if (RecyclerView.P0) {
                            throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                        }
                    }
                } else {
                    f = 1.0f;
                }
                if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                    if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                        iF = (int) (iF * f);
                        iH = (int) (iH * f);
                    }
                    this.b.l0(iF, iH, true);
                    return true;
                }
                RecyclerView recyclerView = this.b;
                dw3 dw3Var = recyclerView.z;
                if (dw3Var != null) {
                    if (i == 4096) {
                        recyclerView.m0(dw3Var.a() - 1);
                        return true;
                    }
                    if (i != 8192) {
                        return true;
                    }
                    recyclerView.m0(0);
                    return true;
                }
            }
        }
        return false;
    }

    public abstract int l(yw3 yw3Var);

    public final void l0(hm2 hm2Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.N(u(iV)).q()) {
                View viewU = u(iV);
                o0(iV);
                hm2Var.h(viewU);
            }
        }
    }

    public abstract int m(yw3 yw3Var);

    public final void m0(hm2 hm2Var) {
        ArrayList arrayList;
        int size = ((ArrayList) hm2Var.d).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) hm2Var.d;
            if (i < 0) {
                break;
            }
            View view = ((cx3) arrayList.get(i)).a;
            cx3 cx3VarN = RecyclerView.N(view);
            if (!cx3VarN.q()) {
                cx3VarN.p(false);
                if (cx3VarN.l()) {
                    this.b.removeDetachedView(view, false);
                }
                jw3 jw3Var = this.b.c0;
                if (jw3Var != null) {
                    jw3Var.d(cx3VarN);
                }
                cx3VarN.p(true);
                cx3 cx3VarN2 = RecyclerView.N(view);
                cx3VarN2.n = null;
                cx3VarN2.o = false;
                cx3VarN2.j &= -33;
                hm2Var.i(cx3VarN2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) hm2Var.e;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int n(yw3 yw3Var);

    public final void n0(View view, hm2 hm2Var) {
        ew4 ew4Var = this.a;
        rm2 rm2Var = (rm2) ew4Var.p;
        int i = ew4Var.o;
        if (i == 1) {
            kf2.o("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            kf2.o("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            ew4Var.o = 1;
            ew4Var.s = view;
            int iIndexOfChild = ((RecyclerView) rm2Var.o).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((e20) ew4Var.q).y(iIndexOfChild)) {
                    ew4Var.p(view);
                }
                rm2Var.i(iIndexOfChild);
            }
            ew4Var.o = 0;
            ew4Var.s = null;
            hm2Var.h(view);
        } catch (Throwable th) {
            ew4Var.o = 0;
            ew4Var.s = null;
            throw th;
        }
    }

    public abstract int o(yw3 yw3Var);

    public final void o0(int i) {
        if (u(i) != null) {
            ew4 ew4Var = this.a;
            rm2 rm2Var = (rm2) ew4Var.p;
            int i2 = ew4Var.o;
            if (i2 == 1) {
                kf2.o("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                kf2.o("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int i3 = ew4Var.i(i);
                View childAt = ((RecyclerView) rm2Var.o).getChildAt(i3);
                if (childAt == null) {
                    return;
                }
                ew4Var.o = 1;
                ew4Var.s = childAt;
                if (((e20) ew4Var.q).y(i3)) {
                    ew4Var.p(childAt);
                }
                rm2Var.i(i3);
            } finally {
                ew4Var.o = 0;
                ew4Var.s = null;
            }
        }
    }

    public final void p(hm2 hm2Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            cx3 cx3VarN = RecyclerView.N(viewU);
            if (cx3VarN.q()) {
                if (RecyclerView.Q0) {
                    Log.d("RecyclerView", "ignoring view " + cx3VarN);
                }
            } else if (!cx3VarN.h() || cx3VarN.j() || this.b.z.o) {
                u(iV);
                this.a.f(iV);
                hm2Var.j(viewU);
                this.b.t.N(cx3VarN);
            } else {
                o0(iV);
                hm2Var.i(cx3VarN);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    public boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iF = F();
        int iH = H();
        int iG = this.n - G();
        int iE = this.o - E();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iF;
        int iMin = Math.min(0, i);
        int i2 = top - iH;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iG;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iE);
        if (this.b.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iF2 = F();
                int iH2 = H();
                int iG2 = this.n - G();
                int iE2 = this.o - E();
                Rect rect2 = this.b.w;
                z(focusedChild, rect2);
                if (rect2.left - i4 < iG2 && rect2.right - i4 > iF2 && rect2.top - i5 < iE2 && rect2.bottom - i5 > iH2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.l0(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.l0(i4, i5, false);
            return true;
        }
        return false;
    }

    public View q(int i) {
        int iV = v();
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            cx3 cx3VarN = RecyclerView.N(viewU);
            if (cx3VarN != null && cx3VarN.d() == i && !cx3VarN.q() && (this.b.u0.g || !cx3VarN.j())) {
                return viewU;
            }
        }
        return null;
    }

    public final void q0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract nw3 r();

    public abstract int r0(int i, hm2 hm2Var, yw3 yw3Var);

    public nw3 s(Context context, AttributeSet attributeSet) {
        return new nw3(context, attributeSet);
    }

    public abstract void s0(int i);

    public nw3 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof nw3) {
            return new nw3((nw3) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new nw3((ViewGroup.MarginLayoutParams) layoutParams) : new nw3(layoutParams);
    }

    public abstract int t0(int i, hm2 hm2Var, yw3 yw3Var);

    public final View u(int i) {
        ew4 ew4Var = this.a;
        if (ew4Var != null) {
            return ew4Var.g(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        v0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int v() {
        ew4 ew4Var = this.a;
        if (ew4Var != null) {
            return ew4Var.h();
        }
        return 0;
    }

    public final void v0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.T0) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.T0) {
            return;
        }
        this.o = 0;
    }

    public void w0(Rect rect, int i, int i2) {
        int iG = G() + F() + rect.width();
        int iE = E() + H() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = j65.a;
        this.b.setMeasuredDimension(g(i, iG, recyclerView.getMinimumWidth()), g(i2, iE, this.b.getMinimumHeight()));
    }

    public int x(hm2 hm2Var, yw3 yw3Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.z == null || !d()) {
            return 1;
        }
        return this.b.z.a();
    }

    public final void x0(int i, int i2) {
        int iV = v();
        if (iV == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            Rect rect = this.b.w;
            z(viewU, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.w.set(i6, i4, i3, i5);
        w0(this.b.w, i, i2);
    }

    public final void y0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.s;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public void z(View view, Rect rect) {
        RecyclerView.O(view, rect);
    }

    public final boolean z0(View view, int i, int i2, nw3 nw3Var) {
        return (!view.isLayoutRequested() && this.h && O(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) nw3Var).width) && O(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) nw3Var).height)) ? false : true;
    }
}
