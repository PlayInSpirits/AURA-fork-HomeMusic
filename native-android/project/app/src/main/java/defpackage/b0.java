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

    private final void setParentContext(u80 u80Var) {
        if (this.q != u80Var) {
            this.q = u80Var;
            if (u80Var != null) {
                this.n = null;
            }
            wd5 wd5Var = this.p;
            if (wd5Var != null) {
                wd5Var.a();
                this.p = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.o != iBinder) {
            this.o = iBinder;
            this.n = null;
        }
    }

    public abstract void a(int i, rg1 rg1Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.r == null) {
                ra raVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ra) {
                        raVar = (ra) childAt;
                    }
                }
                if (raVar != null) {
                    raVar.setComposeViewContext(h(au0.p(this), raVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                e();
            }
        }
    }

    public final void c() {
        if (this.u) {
            return;
        }
        er1.l(xa3.h("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        View childAt = getChildAt(0);
        ra raVar = childAt instanceof ra ? (ra) childAt : null;
        if (raVar != null && raVar.P0) {
            raVar.getComposeViewContext().b();
            raVar.P0 = false;
        }
        wd5 wd5Var = this.p;
        if (wd5Var != null) {
            wd5Var.a();
        }
        this.p = null;
        requestLayout();
    }

    public final void e() {
        if (this.p == null) {
            int i = 0;
            try {
                this.u = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    h80 h80VarF = this.r;
                    if (h80VarF == null) {
                        h80VarF = f();
                    }
                    this.p = zd5.a(this, h80VarF, new r70(1003123809, true, new z(i, this)));
                    Trace.endSection();
                    this.u = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.u = false;
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final h80 f() {
        h80 composeViewContext;
        f75 f75Var;
        f75 f75Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ra raVar = childAt instanceof ra ? (ra) childAt : null;
            if (raVar != null) {
                composeViewContext = raVar.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewP = au0.p(this);
        h80 h80VarQ = au0.q(viewP);
        if (h80VarQ != null) {
            return h(viewP, h80VarQ);
        }
        u80 u80VarG = g();
        ba2 ba2VarU = j51.u(viewP);
        if (ba2VarU == null) {
            ba2VarU = composeViewContext != null ? composeViewContext.d() : null;
            if (ba2VarU == null) {
                kf2.o("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        ba2 ba2Var = ba2VarU;
        j54 j54VarY = kb4.y(viewP);
        if (j54VarY == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                j54VarY = composeViewContext.e;
                j54VarY.getClass();
            } else {
                j54VarY = null;
            }
            if (j54VarY == null) {
                kf2.o("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        j54 j54Var = j54VarY;
        f75 f75VarO = gi1.o(viewP);
        if (f75VarO == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                f75Var2 = composeViewContext.f;
            }
            f75Var = f75Var2;
        } else {
            f75Var = f75VarO;
        }
        h80 h80Var = new h80(au0.q(au0.p(viewP)), viewP, u80VarG, ba2Var, j54Var, f75Var);
        viewP.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(h80Var));
        return h80Var;
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
        u80 u80Var;
        ?? A = this.q;
        if (A == 0) {
            A = ic5.a(this);
            if (A == 0) {
                Object parent = getParent();
                while (true) {
                    if (A != 0 || !(parent instanceof View)) {
                        A = A;
                        break;
                    }
                    A = A;
                    View view = (View) parent;
                    u80 u80VarA = ic5.a(view);
                    parent = au0.z(view);
                    A = u80VarA;
                }
            }
            ov3 ov3Var = ov3.o;
            if (A != 0) {
                ?? r3 = (!(A instanceof tv3) || ((ov3) ((tv3) A).u.getValue()).compareTo(ov3Var) > 0) ? A : 0;
                if (r3 != 0) {
                    this.n = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.n;
                if (weakReference == null || (u80Var = (u80) weakReference.get()) == null || ((u80Var instanceof tv3) && ((ov3) ((tv3) u80Var).u.getValue()).compareTo(ov3Var) <= 0)) {
                    A = u80Var;
                    A = u80Var;
                    A = 0;
                }
                if (A == 0) {
                    A = ic5.b(this);
                    ?? r2 = ((ov3) A.u.getValue()).compareTo(ov3Var) > 0 ? A : 0;
                    if (r2 != 0) {
                        this.n = new WeakReference(r2);
                    }
                }
            }
        }
        return A;
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m65getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        on onVar = tag instanceof on ? (on) tag : null;
        if (onVar != null) {
            return onVar.a;
        }
        return 1;
    }

    public final h80 getComposeViewContext$ui() {
        return this.r;
    }

    public final boolean getHasComposition() {
        return this.p != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.t;
    }

    public final h80 h(View view, h80 h80Var) {
        u80 u80VarG = g();
        ba2 ba2VarU = j51.u(view);
        f75 f75VarO = gi1.o(view);
        j54 j54VarY = kb4.y(view);
        if (u80VarG == h80Var.c() && ba2VarU == h80Var.d()) {
            h80Var.g();
            if (f75VarO == h80Var.f) {
                h80Var.g();
                j54 j54Var = h80Var.e;
                j54Var.getClass();
                if (j54VarY == j54Var) {
                    return h80Var;
                }
            }
        }
        if (u80VarG.j() != h80Var.c().j()) {
            d();
        }
        if (ba2VarU == null) {
            ba2VarU = h80Var.d();
        }
        ba2 ba2Var = ba2VarU;
        if (j54VarY == null) {
            h80Var.g();
            j54VarY = h80Var.e;
            j54VarY.getClass();
        }
        h80 h80Var2 = new h80(h80Var, view, u80VarG, ba2Var, j54VarY, f75VarO);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(h80Var2));
        return h80Var2;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.v || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w03 w03Var = ic5.a;
        Object objZ = au0.z(this);
        View view = this;
        while (objZ instanceof View) {
            View view2 = (View) objZ;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objZ = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new a0(0, this));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m66setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new on(i));
    }

    public final void setComposeViewContext$ui(h80 h80Var) {
        if (this.r != h80Var) {
            if (h80Var == null) {
                d();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ra raVar = childAt instanceof ra ? (ra) childAt : null;
                if (raVar != null) {
                    if (raVar.getCoroutineContext() != h80Var.c().j()) {
                        d();
                    }
                    raVar.setComposeViewContext(h80Var);
                }
            }
            this.r = h80Var;
        }
    }

    public final void setParentCompositionContext(u80 u80Var) {
        setParentContext(u80Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.t = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ra) ((ub3) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.v = true;
    }

    public final void setViewCompositionStrategy(l65 l65Var) {
        gf1 gf1Var = this.s;
        if (gf1Var != null) {
            gf1Var.invoke();
        }
        this.s = l65Var.d(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }
}
