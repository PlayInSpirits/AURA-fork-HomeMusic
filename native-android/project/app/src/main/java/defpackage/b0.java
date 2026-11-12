package defpackage;

import android.os.IBinder;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends ViewGroup {
    public WeakReference n;
    public IBinder o;
    public wd5 p;
    public u80 q;
    public h80 r;
    public gf1 s;
    public boolean t;
    public boolean u;
    public boolean v;

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(u80 r2) {
        if (this.q == r2) goto L13;
        this.q = r2;
        if (r2 == null) goto L7;
        this.n = null;
    L7:
        wd5 r3 = this.p;
        if (r3 == null) goto L14;
        r3.a();
        this.p = null;
        if (isAttachedToWindow() == false) goto L15;
        e();
        return;
    L15:
        return;
    L14:
        return;
    }

    private final void setPreviousAttachedWindowToken(IBinder r2) {
        if (this.o == r2) goto L6;
        this.o = r2;
        this.n = null;
        return;
    }

    public abstract void a(int r1, rg1 r2);

    @Override // android.view.ViewGroup
    public final void addView(View r1) {
        c();
        super.addView(r1);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View r1, int r2, ViewGroup.LayoutParams r3) {
        c();
        return super.addViewInLayout(r1, r2, r3);
    }

    public final void b() {
        if (isAttachedToWindow() == false) goto L20;
        setPreviousAttachedWindowToken(getWindowToken());
        if (this.r != null) goto L16;
        ra r1 = null;
        if (getChildCount() == 0) goto L13;
        View r0 = getChildAt(0);
        if ((r0 instanceof ra) == false) goto L13;
        r1 = (ra) r0;
    L13:
        if (r1 == null) goto L16;
        h80 r2 = r1.getComposeViewContext();
        r1.setComposeViewContext(h(au0.p(this), r2));
    L16:
        if (getShouldCreateCompositionOnAttachedToWindow() == false) goto L19;
        e();
        return;
    L19:
        return;
    }

    public final void c() {
        if (this.u == false) goto L5;
        return;
    L5:
        er1.l(xa3.h("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        View r1 = getChildAt(0);
        if ((r1 instanceof ra) == false) goto L5;
        ra r2 = (ra) r1;
    L6:
        if (r2 != null) goto L8;
    L10:
        wd5 r0 = this.p;
        if (r0 == null) goto L13;
        r0.a();
    L13:
        this.p = null;
        requestLayout();
        return;
    L8:
        if (r2.P0 == false) goto L10;
        r2.getComposeViewContext().b();
        r2.P0 = false;
        goto L10
    L5:
        r2 = null;
        goto L6
    }

    public final void e() {
        if (this.p != null) goto L21;
        int r0 = 0;
        this.u = true;     // Catch: Throwable -> L15
        Trace.beginSection("Compose:initializeView");     // Catch: Throwable -> L15
        h80 r2 = this.r;     // Catch: Throwable -> L9
        if (r2 != null) goto L11;
        r2 = f();     // Catch: Throwable -> L9
    L11:
        this.p = zd5.a(this, r2, new r70(1003123809, true, new z(r0, this)));     // Catch: Throwable -> L9
        Trace.endSection();     // Catch: Throwable -> L15
        this.u = false;
        return;
    L9:
        th = move-exception;
        Trace.endSection();     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        this.u = false;
        throw th;
    }

    public final h80 f() {
        f75 r1 = null;
        if (getChildCount() != 0) goto L5;
    L4:
        h80 r0 = null;
    L11:
        View r4 = au0.p(this);
        h80 r2 = au0.q(r4);
        if (r2 != null) goto L40;
        u80 r5 = g();
        ba2 r9 = j51.u(r4);
        if (r9 != null) goto L19;
        if (r0 == null) goto L17;
        r9 = r0.d();
    L18:
        if (r9 != null) goto L19;
        kf2.o("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
        return null;
    L17:
        r9 = null;
    L19:
        ba2 r6 = r9;
        j54 r10 = kb4.y(r4);
        if (r10 != null) goto L28;
        if (r0 == null) goto L26;
        r0.g();
        r10 = r0.e;
        r10.getClass();
    L27:
        if (r10 != null) goto L28;
        kf2.o("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
        return null;
    L26:
        r10 = null;
    L28:
        j54 r7 = r10;
        f75 r11 = gi1.o(r4);
        if (r11 != null) goto L36;
        if (r0 == null) goto L35;
        r0.g();
        r1 = r0.f;
    L35:
        f75 r8 = r1;
    L37:
        h80 r3 = new h80(au0.q(au0.p(r4)), r4, r5, r6, r7, r8);
        r4.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(r3));
        return r3;
    L36:
        r8 = r11;
        goto L37
    L40:
        return h(r4, r2);
    L5:
        View r12 = getChildAt(0);
        if ((r12 instanceof ra) == false) goto L8;
        ra r13 = (ra) r12;
    L9:
        if (r13 == null) goto L4;
        r0 = r13.getComposeViewContext();
        goto L11
    L8:
        r13 = null;
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u80] */
    /* JADX WARN: Type inference failed for: r0v1, types: [u80] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [u80] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [tv3] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final u80 g() {
        ?? r0 = this.q;
        if (r0 != 0) goto L41;
        r0 = ic5.a(this);
        if (r0 != 0) goto L12;
        Object r1 = getParent();
        r0 = r0;
    L8:
        if (r0 != 0) goto L12;
        if ((r1 instanceof View) == false) goto L12;
        View r2 = (View) r1;
        u80 r3 = ic5.a(r2);
        r1 = au0.z(r2);
        r0 = r3;
    L12:
        ov3 r4 = ov3.o;
        ?? r5 = 0;
        if (r0 != 0) goto L15;
        r0 = 0;
    L24:
        if (r0 != 0) goto L41;
        WeakReference r6 = this.n;
        if (r6 == null) goto L34;
        u80 r7 = (u80) r6.get();
        if (r7 == null) goto L34;
        boolean r8 = r7 instanceof tv3;
        r0 = r7;
        if (r8 == false) goto L35;
        int r9 = ((ov3) ((tv3) r7).u.getValue()).compareTo(r4);
        r0 = r7;
        if (r9 <= 0) goto L34;
    L35:
        if (r0 != 0) goto L41;
        r0 = ic5.b(this);
        if (((ov3) r0.u.getValue()).compareTo(r4) <= 0) goto L39;
        r5 = r0;
    L39:
        if (r5 == 0) goto L41;
        this.n = new WeakReference(r5);
    L34:
        r0 = 0;
        goto L35
    L15:
        if ((r0 instanceof tv3) == true) goto L17;
    L20:
        ?? r10 = r0;
    L21:
        if (r10 == 0) goto L24;
        this.n = new WeakReference(r10);
        goto L24
    L17:
        if (((ov3) ((tv3) r0).u.getValue()).compareTo(r4) > 0) goto L20;
        r10 = 0;
    L41:
        return r0;
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m65getAutoClearFocusBehavior4UtRPd4() {
        Object r1 = getTag(R.id.auto_clear_focus_behavior_tag);
        if ((r1 instanceof on) == false) goto L5;
        on r2 = (on) r1;
    L6:
        if (r2 != null) goto L8;
        return 1;
    L8:
        return r2.a;
    L5:
        r2 = null;
        goto L6
    }

    public final h80 getComposeViewContext$ui() {
        return this.r;
    }

    public final boolean getHasComposition() {
        if (this.p == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.t;
    }

    public final h80 h(View r8, h80 r9) {
        u80 r3 = g();
        ba2 r0 = j51.u(r8);
        f75 r6 = gi1.o(r8);
        j54 r1 = kb4.y(r8);
        if (r3 != r9.c()) goto L12;
        if (r0 != r9.d()) goto L12;
        r9.g();
        if (r6 != r9.f) goto L12;
        r9.g();
        j54 r2 = r9.e;
        r2.getClass();
        if (r1 != r2) goto L12;
        return r9;
    L12:
        if (r3.j() == r9.c().j()) goto L14;
        d();
    L14:
        if (r0 != null) goto L16;
        r0 = r9.d();
    L16:
        ba2 r4 = r0;
        if (r1 != null) goto L19;
        r9.g();
        r1 = r9.e;
        r1.getClass();
    L19:
        h80 r5 = new h80(r9, r8, r3, r4, r1, r6);
        r8.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(r5));
        return r5;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.v == true) goto L5;
        return true;
    L5:
        if (super.isTransitionGroup() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w03 r0 = ic5.a;
        Object r1 = au0.z(this);
        View r2 = this;
    L4:
        if ((r1 instanceof View) == false) goto L10;
        View r3 = (View) r1;
        if (r3.getId() == 16908290) goto L10;
        r2 = r3;
        r1 = r3.getParent();
    L10:
        if (r2.getParent() != null) goto L13;
        getHandler().postAtFrontOfQueue(new a0(0, this));
        return;
    L13:
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        View r8 = getChildAt(0);
        if (r8 == null) goto L6;
        r8.layout(getPaddingLeft(), getPaddingTop(), (r6 - r4) - getPaddingRight(), (r7 - r5) - getPaddingBottom());
        return;
    }

    @Override // android.view.View
    public final void onMeasure(int r6, int r7) {
        e();
        View r1 = getChildAt(0);
        if (r1 != null) goto L6;
        super.onMeasure(r6, r7);
        return;
    L6:
        int r2 = Math.max(0, (View.MeasureSpec.getSize(r6) - getPaddingLeft()) - getPaddingRight());
        int r0 = Math.max(0, (View.MeasureSpec.getSize(r7) - getPaddingTop()) - getPaddingBottom());
        r1.measure(View.MeasureSpec.makeMeasureSpec(r2, View.MeasureSpec.getMode(r6)), View.MeasureSpec.makeMeasureSpec(r0, View.MeasureSpec.getMode(r7)));
        int r8 = r1.getMeasuredWidth();
        int r9 = getPaddingLeft() + r8;
        int r10 = getPaddingRight() + r9;
        int r11 = r1.getMeasuredHeight();
        int r3 = getPaddingTop() + r11;
        setMeasuredDimension(r10, getPaddingBottom() + r3);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r2) {
        View r1 = getChildAt(0);
        if (r1 == null) goto L6;
        r1.setLayoutDirection(r2);
        return;
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m66setAutoClearFocusBehavior17tfJxM(int r2) {
        setTag(R.id.auto_clear_focus_behavior_tag, new on(r2));
    }

    public final void setComposeViewContext$ui(h80 r4) {
        if (this.r == r4) goto L19;
        if (r4 != null) goto L7;
        d();
    L17:
        this.r = r4;
        return;
    L7:
        if (getChildCount() == 0) goto L17;
        View r0 = getChildAt(0);
        if ((r0 instanceof ra) == false) goto L11;
        ra r1 = (ra) r0;
    L12:
        if (r1 == null) goto L17;
        if (r1.getCoroutineContext() == r4.c().j()) goto L16;
        d();
    L16:
        r1.setComposeViewContext(r4);
        goto L17
    L11:
        r1 = null;
        goto L12
    }

    public final void setParentCompositionContext(u80 r1) {
        setParentContext(r1);
    }

    public final void setShowLayoutBounds(boolean r2) {
        this.t = r2;
        KeyEvent.Callback r1 = getChildAt(0);
        if (r1 == null) goto L6;
        ((ra) ((ub3) r1)).setShowLayoutBounds(r2);
        return;
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean r1) {
        super.setTransitionGroup(r1);
        this.v = true;
    }

    public final void setViewCompositionStrategy(l65 r2) {
        gf1 r0 = this.s;
        if (r0 == null) goto L5;
        r0.invoke();
    L5:
        this.s = r2.d(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View r1, int r2) {
        c();
        super.addView(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View r1, int r2, ViewGroup.LayoutParams r3, boolean r4) {
        c();
        return super.addViewInLayout(r1, r2, r3, r4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View r1, int r2, int r3) {
        c();
        super.addView(r1, r2, r3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View r1, ViewGroup.LayoutParams r2) {
        c();
        super.addView(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View r1, int r2, ViewGroup.LayoutParams r3) {
        c();
        super.addView(r1, r2, r3);
    }
}
