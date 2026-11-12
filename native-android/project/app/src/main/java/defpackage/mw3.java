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
        pz1 r0 = new pz1(18, this);
        rm2 r1 = new rm2(13, this);
        this.c = new qr2(r0);
        this.d = new qr2(r1);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View r1) {
        return r1.getLeft() - ((nw3) r1.getLayoutParams()).b.left;
    }

    public static int B(View r1) {
        return r1.getRight() + ((nw3) r1.getLayoutParams()).b.right;
    }

    public static int C(View r1) {
        return r1.getTop() - ((nw3) r1.getLayoutParams()).b.top;
    }

    public static int I(View r0) {
        return ((nw3) r0.getLayoutParams()).a.d();
    }

    public static lw3 J(Context r2, AttributeSet r3, int r4, int r5) {
        lw3 r0 = new lw3();
        TypedArray r6 = r2.obtainStyledAttributes(r3, ct3.a, r4, r5);
        r0.a = r6.getInt(0, 1);
        r0.b = r6.getInt(10, 1);
        r0.c = r6.getBoolean(9, false);
        r0.d = r6.getBoolean(11, false);
        r6.recycle();
        return r0;
    }

    public static boolean O(int r3, int r4, int r5) {
        int r0 = View.MeasureSpec.getMode(r4);
        int r6 = View.MeasureSpec.getSize(r4);
        if (r5 <= 0) goto L7;
        if (r3 == r5) goto L7;
        return false;
    L7:
        if (r0 == Integer.MIN_VALUE) goto L16;
        if (r0 != 0) goto L10;
        return true;
    L10:
        if (r0 == 1073741824) goto L12;
        return false;
    L12:
        if (r6 != r3) goto L14;
        return true;
    L14:
        return false;
    L16:
        if (r6 < r3) goto L18;
        return true;
    L18:
        return false;
    }

    public static void P(View r3, int r4, int r5, int r6, int r7) {
        nw3 r0 = (nw3) r3.getLayoutParams();
        Rect r1 = r0.b;
        r3.layout((r4 + r1.left) + ((ViewGroup.MarginLayoutParams) r0).leftMargin, (r5 + r1.top) + ((ViewGroup.MarginLayoutParams) r0).topMargin, (r6 - r1.right) - ((ViewGroup.MarginLayoutParams) r0).rightMargin, (r7 - r1.bottom) - ((ViewGroup.MarginLayoutParams) r0).bottomMargin);
    }

    public static int g(int r2, int r3, int r4) {
        int r0 = View.MeasureSpec.getMode(r2);
        int r5 = View.MeasureSpec.getSize(r2);
        if (r0 == Integer.MIN_VALUE) goto L9;
        if (r0 != 1073741824) goto L7;
        return r5;
    L7:
        return Math.max(r3, r4);
    L9:
        return Math.min(r5, Math.max(r3, r4));
    }

    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        int r9 = Math.max(0, r5 - r7);
        if (r4 == false) goto L11;
        if (r8 < 0) goto L6;
    L5:
        r6 = 1073741824;
    L22:
        return View.MeasureSpec.makeMeasureSpec(r8, r6);
    L6:
        if (r8 != (-1)) goto L10;
        if (r6 == Integer.MIN_VALUE) goto L14;
        if (r6 == 0) goto L10;
        if (r6 != 1073741824) goto L10;
    L14:
        r8 = r9;
    L10:
        r6 = 0;
        r8 = 0;
        goto L22
    L11:
        if (r8 >= 0) goto L5;
        if (r8 == (-1)) goto L14;
        if (r8 != (-2)) goto L10;
        if (r6 == Integer.MIN_VALUE) goto L20;
        if (r6 == 1073741824) goto L20;
        r8 = r9;
        r6 = 0;
    L20:
        r8 = r9;
        r6 = Integer.MIN_VALUE;
        goto L22
    }

    public static int y(View r1) {
        return r1.getBottom() + ((nw3) r1.getLayoutParams()).b.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final boolean B0(View r2, int r3, int r4, nw3 r5) {
        if (this.h == true) goto L5;
        return true;
    L5:
        if (O(r2.getMeasuredWidth(), r3, ((ViewGroup.MarginLayoutParams) r5).width) == true) goto L7;
        return true;
    L7:
        if (O(r2.getMeasuredHeight(), r4, ((ViewGroup.MarginLayoutParams) r5).height) == false) goto L14;
        return false;
    L14:
        return true;
    }

    public abstract void C0(RecyclerView r1, int r2);

    public final int D() {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L5;
        dw3 r1 = r0.getAdapter();
    L6:
        if (r1 != null) goto L8;
        return 0;
    L8:
        return r1.a();
    L5:
        r1 = null;
        goto L6
    }

    public final void D0(db2 r4) {
        db2 r0 = this.e;
        if (r0 == null) goto L8;
        if (r4 == r0) goto L8;
        if (r0.e == false) goto L8;
        r0.i();
    L8:
        this.e = r4;
        RecyclerView r1 = this.b;
        bx3 r2 = r1.r0;
        r2.t.removeCallbacks(r2);
        r2.p.abortAnimation();
        if (r4.h == false) goto L11;
        Log.w("RecyclerView", "An instance of " + r4.getClass().getSimpleName() + " was started more than once. Each instance of" + r4.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
    L11:
        r4.b = r1;
        r4.c = this;
        int r3 = r4.a;
        if (r3 == (-1)) goto L15;
        r1.u0.a = r3;
        r4.e = true;
        r4.d = true;
        r4.f = r1.A.q(r3);
        r4.b.r0.b();
        r4.h = true;
        return;
    L15:
        kf2.n("Invalid target position");
    }

    public final int E() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingBottom();
    }

    public boolean E0() {
        return false;
    }

    public final int F() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingLeft();
    }

    public final int G() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingRight();
    }

    public final int H() {
        RecyclerView r0 = this.b;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingTop();
    }

    public int K(hm2 r1, yw3 r2) {
        RecyclerView r3 = this.b;
        if (r3 != null) goto L5;
        return 1;
    L5:
        if (r3.z != null) goto L8;
        return 1;
    L8:
        if (e() == true) goto L10;
        return 1;
    L10:
        return this.b.z.a();
    }

    public final void L(View r6, Rect r7) {
        Rect r0 = ((nw3) r6.getLayoutParams()).b;
        r7.set(-r0.left, -r0.top, r6.getWidth() + r0.right, r6.getHeight() + r0.bottom);
        if (this.b == null) goto L9;
        Matrix r1 = r6.getMatrix();
        if (r1 == null) goto L9;
        if (r1.isIdentity() == true) goto L9;
        RectF r5 = this.b.y;
        r5.set(r7);
        r1.mapRect(r5);
        r7.set((int) Math.floor(r5.left), (int) Math.floor(r5.top), (int) Math.ceil(r5.right), (int) Math.ceil(r5.bottom));
    L9:
        r7.offset(r6.getLeft(), r6.getTop());
    }

    public boolean M() {
        return false;
    }

    public boolean N() {
        return false;
    }

    public void Q(int r4) {
        RecyclerView r3 = this.b;
        if (r3 == null) goto L7;
        int r0 = r3.s.h();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3.s.g(r1).offsetLeftAndRight(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void R(int r4) {
        RecyclerView r3 = this.b;
        if (r3 == null) goto L7;
        int r0 = r3.s.h();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L9;
        r3.s.g(r1).offsetTopAndBottom(r4);
        r1 = r1 + 1;
        goto L5
    L9:
        return;
    }

    public void S() {
    }

    public void T(RecyclerView r1) {
    }

    public View U(View r1, int r2, hm2 r3, yw3 r4) {
        return null;
    }

    public void V(AccessibilityEvent r4) {
        RecyclerView r0 = this.b;
        hm2 r1 = r0.p;
        if (r4 == null) goto L20;
        boolean r2 = true;
        if (r0.canScrollVertically(1) == false) goto L8;
    L15:
        r4.setScrollable(r2);
        dw3 r3 = this.b.z;
        if (r3 == null) goto L19;
        r4.setItemCount(r3.a());
        return;
    L19:
        return;
    L8:
        if (this.b.canScrollVertically(-1) == true) goto L15;
        if (this.b.canScrollHorizontally(-1) == true) goto L15;
        if (this.b.canScrollHorizontally(1) == true) goto L15;
        r2 = false;
        goto L15
    }

    public void W(hm2 r5, yw3 r6, v3 r7) {
        if (this.b.canScrollVertically(-1) == false) goto L5;
    L6:
        r7.a(8192);
        r7.m(true);
        r7.h(67108864, true);
    L8:
        if (this.b.canScrollVertically(1) == false) goto L10;
    L11:
        r7.a(4096);
        r7.m(true);
        r7.h(67108864, true);
    L12:
        r7.j(t3.a(K(r5, r6), x(r5, r6), 0));
        return;
    L10:
        if (this.b.canScrollHorizontally(1) == false) goto L12;
    L5:
        if (this.b.canScrollHorizontally(-1) == false) goto L8;
        goto L6
    }

    public void X(hm2 r7, yw3 r8, View r9, v3 r10) {
        int r11 = 0;
        if (e() == false) goto L5;
        int r0 = I(r9);
    L7:
        if (d() == false) goto L9;
        r11 = I(r9);
    L9:
        r10.k(u3.a(r0, 1, r11, 1, false, false));
        return;
    L5:
        r0 = 0;
        goto L7
    }

    public final void Y(View r3, v3 r4) {
        cx3 r0 = RecyclerView.N(r3);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.j() == true) goto L11;
        ew4 r1 = this.a;
        View r2 = r0.a;
        if (((ArrayList) r1.r).contains(r2) == true) goto L12;
        RecyclerView r5 = this.b;
        X(r5.p, r5.u0, r3, r4);
        return;
    L12:
        return;
    }

    public void Z(int r1, int r2) {
    }

    public void a0() {
    }

    public final void b(View r9, int r10, boolean r11) {
        cx3 r0 = RecyclerView.N(r9);
        if (r11 == false) goto L5;
    L8:
        yd4 r12 = (yd4) this.b.t.n;
        r65 r2 = (r65) r12.get(r0);
        if (r2 != null) goto L11;
        r2 = r65.a();
        r12.put(r0, r2);
    L11:
        r2.a |= 1;
    L12:
        nw3 r13 = (nw3) r9.getLayoutParams();
        if (r0.r() == true) goto L57;
        if (r0.k() == true) goto L57;
        ViewParent r3 = r9.getParent();
        RecyclerView r5 = this.b;
        ew4 r6 = this.a;
        int r7 = -1;
        if (r3 != r5) goto L44;
        e20 r4 = (e20) r6.q;
        int r8 = ((RecyclerView) ((rm2) r6.p).o).indexOfChild(r9);
        if (r8 != (-1)) goto L23;
    L24:
        int r14 = -1;
    L26:
        if (r10 != (-1)) goto L28;
        r10 = this.a.h();
    L28:
        if (r14 == (-1)) goto L43;
        if (r14 == r10) goto L62;
        mw3 r15 = this.b.A;
        View r16 = r15.u(r14);
        if (r16 == null) goto L41;
        r15.u(r14);
        r15.a.f(r14);
        nw3 r17 = (nw3) r16.getLayoutParams();
        cx3 r18 = RecyclerView.N(r16);
        boolean r19 = r18.j();
        RecyclerView r20 = r15.b;
        if (r19 == false) goto L38;
        yd4 r21 = (yd4) r20.t.n;
        r65 r22 = (r65) r21.get(r18);
        if (r22 != null) goto L37;
        r22 = r65.a();
        r21.put(r18, r22);
    L37:
        r22.a = 1 | r22.a;
    L39:
        r15.a.e(r16, r10, r17, r18.j());
        goto L62
    L38:
        r20.t.N(r18);
        goto L39
    L41:
        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + r14 + r15.b.toString());
    L62:
        if (r13.d == true) goto L64;
        return;
    L64:
        if (RecyclerView.Q0 == false) goto L66;
        Log.d("RecyclerView", "consuming pending invalidate on child " + r13.a);
    L66:
        r0.a.invalidate();
        r13.d = false;
        return;
    L43:
        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(r9) + this.b.C());
    L23:
        if (r4.s(r8) == true) goto L24;
        r14 = r8 - r4.q(r8);
        goto L26
    L44:
        r6.d(r9, r10, false);
        r13.c = true;
        db2 r23 = this.e;
        if (r23 == null) goto L62;
        if (r23.e == false) goto L62;
        r23.b.getClass();
        cx3 r110 = RecyclerView.N(r9);
        if (r110 == null) goto L52;
        r7 = r110.d();
    L52:
        if (r7 != r23.a) goto L62;
        r23.f = r9;
        if (RecyclerView.Q0 == false) goto L62;
        Log.d("RecyclerView", "smooth scroll target view has been attached");
    L57:
        if (r0.k() == false) goto L59;
        r0.n.l(r0);
    L60:
        this.a.e(r9, r10, r9.getLayoutParams(), false);
        goto L62
    L59:
        r0.j &= -33;
        goto L60
    L5:
        if (r0.j() == true) goto L8;
        this.b.t.N(r0);
        goto L12
    }

    public void b0(int r1, int r2) {
    }

    public void c(String r1) {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L6;
        r0.k(r1);
        return;
    }

    public void c0(int r1, int r2) {
    }

    public abstract boolean d();

    public void d0(int r1, int r2) {
    }

    public abstract boolean e();

    public abstract void e0(hm2 r1, yw3 r2);

    public boolean f(nw3 r1) {
        if (r1 == null) goto L5;
        return true;
    L5:
        return false;
    }

    public abstract void f0(yw3 r1);

    public void g0(Parcelable r1) {
    }

    public void h(int r1, int r2, yw3 r3, b30 r4) {
    }

    public Parcelable h0() {
        return null;
    }

    public void i(int r1, b30 r2) {
    }

    public void i0(int r1) {
    }

    public abstract int j(yw3 r1);

    public boolean j0(int r3, Bundle r4) {
        RecyclerView r0 = this.b;
        return k0(r0.p, r0.u0, r3, r4);
    }

    public abstract int k(yw3 r1);

    public boolean k0(hm2 r8, yw3 r9, int r10, Bundle r11) {
        if (this.b == null) goto L46;
        int r12 = this.o;
        int r0 = this.n;
        Rect r1 = new Rect();
        if (this.b.getMatrix().isIdentity() == false) goto L11;
        if (this.b.getGlobalVisibleRect(r1) == false) goto L11;
        r12 = r1.height();
        r0 = r1.width();
    L11:
        if (r10 == 4096) goto L23;
        if (r10 == 8192) goto L15;
        int r13 = 0;
        int r2 = 0;
    L29:
        if (r13 != 0) goto L33;
        if (r2 == 0) goto L46;
    L33:
        if (r11 == null) goto L41;
        float r14 = r11.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
        if (r14 >= 0.0f) goto L43;
        if (RecyclerView.P0 == false) goto L46;
        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + r14 + ")");
    L43:
        if (Float.compare(r14, Float.POSITIVE_INFINITY) != 0) goto L55;
        RecyclerView r7 = this.b;
        dw3 r15 = r7.z;
        if (r15 == null) goto L46;
        if (r10 == 4096) goto L52;
        if (r10 == 8192) goto L50;
        return true;
    L50:
        r7.m0(0);
        return true;
    L52:
        r7.m0(r15.a() - 1);
        return true;
    L55:
        if (Float.compare(1.0f, r14) != 0) goto L57;
    L59:
        this.b.l0(r2, r13, true);
        return true;
    L57:
        if (Float.compare(0.0f, r14) == 0) goto L59;
        r2 = (int) (r2 * r14);
        r13 = (int) (r13 * r14);
        goto L59
    L41:
        r14 = 1.0f;
        goto L43
    L15:
        if (this.b.canScrollVertically(-1) == false) goto L17;
        r13 = -((r12 - H()) - E());
    L19:
        if (this.b.canScrollHorizontally(-1) == false) goto L21;
        r2 = -((r0 - F()) - G());
    L21:
        r2 = 0;
        goto L29
    L17:
        r13 = 0;
        goto L19
    L23:
        if (this.b.canScrollVertically(1) == false) goto L25;
        r13 = (r12 - H()) - E();
    L27:
        if (this.b.canScrollHorizontally(1) == false) goto L21;
        r2 = (r0 - F()) - G();
        goto L29
    L25:
        r13 = 0;
    L46:
        return false;
    }

    public abstract int l(yw3 r1);

    public final void l0(hm2 r3) {
        int r0 = v() - 1;
    L3:
        if (r0 < 0) goto L8;
        if (RecyclerView.N(u(r0)).q() == true) goto L7;
        View r1 = u(r0);
        o0(r0);
        r3.h(r1);
    L7:
        r0 = r0 - 1;
        goto L3
    }

    public abstract int m(yw3 r1);

    public final void m0(hm2 r7) {
        int r0 = ((ArrayList) r7.d).size();
        int r1 = r0 - 1;
    L3:
        ArrayList r2 = (ArrayList) r7.d;
        if (r1 < 0) goto L16;
        View r3 = ((cx3) r2.get(r1)).a;
        cx3 r4 = RecyclerView.N(r3);
        if (r4.q() == true) goto L15;
        r4.p(false);
        if (r4.l() == false) goto L11;
        this.b.removeDetachedView(r3, false);
    L11:
        jw3 r5 = this.b.c0;
        if (r5 == null) goto L14;
        r5.d(r4);
    L14:
        r4.p(true);
        cx3 r6 = RecyclerView.N(r3);
        r6.n = null;
        r6.o = false;
        r6.j &= -33;
        r7.i(r6);
    L15:
        r1 = r1 - 1;
        goto L3
    L16:
        r2.clear();
        ArrayList r8 = (ArrayList) r7.e;
        if (r8 == null) goto L19;
        r8.clear();
    L19:
        if (r0 <= 0) goto L25;
        this.b.invalidate();
        return;
    }

    public abstract int n(yw3 r1);

    public final void n0(View r6, hm2 r7) {
        ew4 r5 = this.a;
        rm2 r0 = (rm2) r5.p;
        int r1 = r5.o;
        if (r1 != 1) goto L5;
        kf2.o("Cannot call removeView(At) within removeView(At)");
        return;
    L5:
        if (r1 != 2) goto L25;
        kf2.o("Cannot call removeView(At) within removeViewIfHidden");
        return;
    L25:
        r5.o = 1;     // Catch: Throwable -> L13
        r5.s = r6;     // Catch: Throwable -> L13
        int r2 = ((RecyclerView) r0.o).indexOfChild(r6);     // Catch: Throwable -> L13
        if (r2 >= 0) goto L11;
    L9:
        r5.o = 0;
        r5.s = null;
        r7.h(r6);
        return;
    L11:
        if (((e20) r5.q).y(r2) == false) goto L15;
        r5.p(r6);     // Catch: Throwable -> L13
    L15:
        r0.i(r2);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        r5.o = 0;
        r5.s = null;
        throw th;
    }

    public abstract int o(yw3 r1);

    public final void o0(int r6) {
        if (u(r6) == null) goto L29;
        ew4 r5 = this.a;
        rm2 r0 = (rm2) r5.p;
        int r1 = r5.o;
        if (r1 != 1) goto L7;
        kf2.o("Cannot call removeView(At) within removeView(At)");
        return;
    L7:
        if (r1 != 2) goto L27;
        kf2.o("Cannot call removeView(At) within removeViewIfHidden");
        return;
    L27:
        int r7 = r5.i(r6);     // Catch: Throwable -> L16
        View r4 = ((RecyclerView) r0.o).getChildAt(r7);     // Catch: Throwable -> L16
        if (r4 != null) goto L13;
        r5.o = 0;
        r5.s = null;
        return;
    L13:
        r5.o = 1;     // Catch: Throwable -> L16
        r5.s = r4;     // Catch: Throwable -> L16
        if (((e20) r5.q).y(r7) == false) goto L18;
        r5.p(r4);     // Catch: Throwable -> L16
    L18:
        r0.i(r7);     // Catch: Throwable -> L16
        r5.o = 0;
        r5.s = null;
        return;
    L16:
        th = move-exception;
        r5.o = 0;
        r5.s = null;
        throw th;
    }

    public final void p(hm2 r5) {
        int r0 = v() - 1;
    L3:
        if (r0 < 0) goto L18;
        View r1 = u(r0);
        cx3 r2 = RecyclerView.N(r1);
        if (r2.q() == false) goto L10;
        if (RecyclerView.Q0 == false) goto L17;
        Log.d("RecyclerView", "ignoring view " + r2);
    L17:
        r0 = r0 - 1;
        goto L3
    L10:
        if (r2.h() == true) goto L12;
    L16:
        u(r0);
        this.a.f(r0);
        r5.j(r1);
        this.b.t.N(r2);
        goto L17
    L12:
        if (r2.j() == true) goto L16;
        if (this.b.z.o == true) goto L16;
        o0(r0);
        r5.i(r2);
        goto L17
    }

    public boolean p0(RecyclerView r9, View r10, Rect r11, boolean r12, boolean r13) {
        int r0 = F();
        int r1 = H();
        int r2 = this.n - G();
        int r3 = this.o - E();
        int r4 = (r10.getLeft() + r11.left) - r10.getScrollX();
        int r5 = (r10.getTop() + r11.top) - r10.getScrollY();
        int r14 = r11.width() + r4;
        int r15 = r11.height() + r5;
        int r6 = r4 - r0;
        int r7 = Math.min(0, r6);
        int r8 = r5 - r1;
        int r16 = Math.min(0, r8);
        int r17 = r14 - r2;
        int r18 = Math.max(0, r17);
        int r19 = Math.max(0, r15 - r3);
        if (this.b.getLayoutDirection() != 1) goto L7;
        if (r18 != 0) goto L11;
        r18 = Math.max(r7, r17);
    L11:
        if (r16 != 0) goto L14;
        r16 = Math.min(r8, r19);
    L14:
        int[] r110 = {r18, r16};
        int r111 = r110[0];
        int r112 = r110[1];
        if (r13 == false) goto L28;
        View r113 = r9.getFocusedChild();
        if (r113 == null) goto L31;
        int r20 = F();
        int r21 = H();
        int r22 = this.n - G();
        int r23 = this.o - E();
        Rect r24 = this.b.w;
        z(r113, r24);
        if ((r24.left - r111) >= r22) goto L31;
        if ((r24.right - r111) <= r20) goto L31;
        if ((r24.top - r112) >= r23) goto L31;
        if ((r24.bottom - r112) > r21) goto L28;
    L31:
        return false;
    L28:
        if (r111 != 0) goto L32;
        if (r112 == 0) goto L31;
    L32:
        if (r12 == false) goto L35;
        r9.scrollBy(r111, r112);
        return true;
    L35:
        r9.l0(r111, r112, false);
        return true;
    L7:
        if (r7 != 0) goto L10;
        r7 = Math.min(r6, r18);
    L10:
        r18 = r7;
        goto L11
    }

    public View q(int r6) {
        int r0 = v();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L17;
        View r2 = u(r1);
        cx3 r3 = RecyclerView.N(r2);
        if (r3 == null) goto L16;
        if (r3.d() != r6) goto L16;
        if (r3.q() == true) goto L16;
        if (this.b.u0.g == true) goto L15;
        if (r3.j() == true) goto L16;
    L15:
        return r2;
    L16:
        r1 = r1 + 1;
        goto L3
    L17:
        return null;
    }

    public final void q0() {
        RecyclerView r0 = this.b;
        if (r0 == null) goto L6;
        r0.requestLayout();
        return;
    }

    public abstract nw3 r();

    public abstract int r0(int r1, hm2 r2, yw3 r3);

    public nw3 s(Context r1, AttributeSet r2) {
        return new nw3(r1, r2);
    }

    public abstract void s0(int r1);

    public nw3 t(ViewGroup.LayoutParams r1) {
        if ((r1 instanceof nw3) == false) goto L7;
        return new nw3((nw3) r1);
    L7:
        if ((r1 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new nw3((ViewGroup.MarginLayoutParams) r1);
    L11:
        return new nw3(r1);
    }

    public abstract int t0(int r1, hm2 r2, yw3 r3);

    public final View u(int r1) {
        ew4 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.g(r1);
    }

    public final void u0(RecyclerView r3) {
        v0(View.MeasureSpec.makeMeasureSpec(r3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r3.getHeight(), 1073741824));
    }

    public final int v() {
        ew4 r0 = this.a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.h();
    }

    public final void v0(int r2, int r3) {
        this.n = View.MeasureSpec.getSize(r2);
        int r4 = View.MeasureSpec.getMode(r2);
        this.l = r4;
        if (r4 == 0) goto L5;
    L7:
        this.o = View.MeasureSpec.getSize(r3);
        int r5 = View.MeasureSpec.getMode(r3);
        this.m = r5;
        if (r5 == 0) goto L10;
        return;
    L10:
        if (RecyclerView.T0 == true) goto L14;
        this.o = 0;
        return;
    L14:
        return;
    L5:
        if (RecyclerView.T0 == true) goto L7;
        this.n = 0;
        goto L7
    }

    public void w0(Rect r4, int r5, int r6) {
        int r0 = r4.width();
        int r1 = F() + r0;
        int r2 = G() + r1;
        int r7 = r4.height();
        int r3 = H() + r7;
        int r8 = E() + r3;
        RecyclerView r9 = this.b;
        WeakHashMap r10 = j65.a;
        int r11 = g(r5, r2, r9.getMinimumWidth());
        int r12 = g(r6, r8, this.b.getMinimumHeight());
        RecyclerView.g(this.b, r11, r12);
    }

    public int x(hm2 r1, yw3 r2) {
        RecyclerView r3 = this.b;
        if (r3 != null) goto L5;
        return 1;
    L5:
        if (r3.z != null) goto L8;
        return 1;
    L8:
        if (d() == true) goto L10;
        return 1;
    L10:
        return this.b.z.a();
    }

    public final void x0(int r9, int r10) {
        int r0 = v();
        if (r0 != 0) goto L6;
        this.b.q(r9, r10);
        return;
    L6:
        int r1 = Integer.MIN_VALUE;
        int r4 = Integer.MAX_VALUE;
        int r5 = 0;
        int r2 = Integer.MIN_VALUE;
        int r3 = Integer.MAX_VALUE;
    L7:
        if (r5 >= r0) goto L21;
        View r6 = u(r5);
        Rect r7 = this.b.w;
        z(r6, r7);
        int r8 = r7.left;
        if (r8 >= r3) goto L11;
        r3 = r8;
    L11:
        int r11 = r7.right;
        if (r11 <= r1) goto L14;
        r1 = r11;
    L14:
        int r12 = r7.top;
        if (r12 >= r4) goto L17;
        r4 = r12;
    L17:
        int r13 = r7.bottom;
        if (r13 <= r2) goto L20;
        r2 = r13;
    L20:
        r5 = r5 + 1;
        goto L7
    L21:
        this.b.w.set(r3, r4, r1, r2);
        w0(this.b.w, r9, r10);
    }

    public final void y0(RecyclerView r2) {
        if (r2 != null) goto L4;
        this.b = null;
        this.a = null;
        this.n = 0;
        this.o = 0;
    L5:
        this.l = 1073741824;
        this.m = 1073741824;
        return;
    L4:
        this.b = r2;
        this.a = r2.s;
        this.n = r2.getWidth();
        this.o = r2.getHeight();
        goto L5
    }

    public void z(View r1, Rect r2) {
        RecyclerView.O(r1, r2);
    }

    public final boolean z0(View r2, int r3, int r4, nw3 r5) {
        if (r2.isLayoutRequested() == false) goto L5;
        return true;
    L5:
        if (this.h == true) goto L7;
        return true;
    L7:
        if (O(r2.getWidth(), r3, ((ViewGroup.MarginLayoutParams) r5).width) == true) goto L9;
        return true;
    L9:
        if (O(r2.getHeight(), r4, ((ViewGroup.MarginLayoutParams) r5).height) == false) goto L17;
        return false;
    L17:
        return true;
    }
}
