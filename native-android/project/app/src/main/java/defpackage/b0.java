package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Trace
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 */
import android.os.IBinder;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class b0
extends ViewGroup {
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

    private final void setParentContext(u80 object) {
        if (this.q != object) {
            this.q = object;
            if (object != null) {
                this.n = null;
            }
            if ((object = this.p) != null) {
                ((wd5)object).a();
                this.p = null;
                if (this.isAttachedToWindow()) {
                    this.e();
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

    public abstract void a(int var1, rg1 var2);

    public final void addView(View view) {
        this.c();
        super.addView(view);
    }

    public final void addView(View view, int n16) {
        this.c();
        super.addView(view, n16);
    }

    public final void addView(View view, int n16, int n17) {
        this.c();
        super.addView(view, n16, n17);
    }

    public final void addView(View view, int n16, ViewGroup.LayoutParams layoutParams) {
        this.c();
        super.addView(view, n16, layoutParams);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        this.c();
        super.addView(view, layoutParams);
    }

    public final boolean addViewInLayout(View view, int n16, ViewGroup.LayoutParams layoutParams) {
        this.c();
        return super.addViewInLayout(view, n16, layoutParams);
    }

    public final boolean addViewInLayout(View view, int n16, ViewGroup.LayoutParams layoutParams, boolean bl5) {
        this.c();
        return super.addViewInLayout(view, n16, layoutParams, bl5);
    }

    public final void b() {
        if (this.isAttachedToWindow()) {
            this.setPreviousAttachedWindowToken(this.getWindowToken());
            if (this.r == null) {
                Object object;
                int n16 = this.getChildCount();
                ra ra6 = null;
                if (n16 != 0 && (object = this.getChildAt(0)) instanceof ra) {
                    ra6 = (ra)object;
                }
                if (ra6 != null) {
                    object = ra6.getComposeViewContext();
                    ra6.setComposeViewContext(this.h(au0.p((View)this), (h80)object));
                }
            }
            if (this.getShouldCreateCompositionOnAttachedToWindow()) {
                this.e();
            }
        }
    }

    public final void c() {
        if (this.u) {
            return;
        }
        er1.l(xa3.h("Cannot add views to ", ((Object)((Object)this)).getClass().getSimpleName(), "; only Compose content is supported"));
    }

    public final void d() {
        Object object = this.getChildAt(0);
        object = object instanceof ra ? (ra)object : null;
        if (object != null && ((ra)object).P0) {
            ((ra)object).getComposeViewContext().b();
            ((ra)object).P0 = false;
        }
        if ((object = this.p) != null) {
            ((wd5)object).a();
        }
        this.p = null;
        this.requestLayout();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Throwable throwable3;
        Throwable throwable22;
        block8: {
            h80 h802;
            Object object;
            block7: {
                if (this.p != null) {
                    return;
                }
                try {
                    this.u = true;
                    Trace.beginSection((String)"Compose:initializeView");
                }
                catch (Throwable throwable22) {}
                try {
                    object = this.r;
                    h802 = object;
                    if (object != null) break block7;
                    h802 = this.f();
                }
                catch (Throwable throwable3) {
                    break block8;
                }
            }
            z z16 = new z(0, (Object)this);
            object = new r70(1003123809, true, z16);
            this.p = zd5.a(this, h802, (r70)object);
            Trace.endSection();
            this.u = false;
            return;
        }
        Trace.endSection();
        throw throwable3;
        this.u = false;
        throw throwable22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final h80 f() {
        Object object;
        int n16 = this.getChildCount();
        Object var6_2 = null;
        h80 h802 = n16 != 0 && (object = (object = this.getChildAt(0)) instanceof ra ? (ra)object : null) != null ? ((ra)object).getComposeViewContext() : null;
        View view = au0.p((View)this);
        object = au0.q(view);
        if (object != null) {
            return this.h(view, (h80)object);
        }
        u80 u802 = this.g();
        Object object2 = object = j51.u(view);
        if (object == null) {
            object = h802 != null ? h802.d() : null;
            if (object == null) {
                kf2.o("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
            object2 = object;
        }
        Object object3 = object = kb4.y(view);
        if (object == null) {
            if (h802 != null) {
                h802.g();
                object = h802.e;
                object.getClass();
            } else {
                object = null;
            }
            if (object == null) {
                kf2.o("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
            object3 = object;
        }
        if ((object = gi1.o(view)) == null) {
            object = var6_2;
            if (h802 != null) {
                h802.g();
                object = h802.f;
            }
        }
        object = new h80(au0.q(au0.p(view)), view, u802, (ba2)object2, (j54)object3, (f75)object);
        view.setTag(2131361997, new WeakReference<Object>(object));
        return object;
    }

    /*
     * Exception decompiling
     */
    public final u80 g() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final int getAutoClearFocusBehavior_4UtRPd4() {
        Object object = this.getTag(2131362053);
        object = object instanceof on ? (on)object : null;
        if (object != null) {
            return ((on)object).a;
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

    public final h80 h(View view, h80 h802) {
        ba2 ba22;
        u80 u802 = this.g();
        ba2 ba23 = j51.u(view);
        f75 f752 = gi1.o(view);
        j54 j542 = kb4.y(view);
        if (u802 == h802.c() && ba23 == h802.d()) {
            h802.g();
            if (f752 == h802.f) {
                h802.g();
                ba22 = h802.e;
                ba22.getClass();
                if (j542 == ba22) {
                    return h802;
                }
            }
        }
        if (u802.j() != h802.c().j()) {
            this.d();
        }
        ba22 = ba23;
        if (ba23 == null) {
            ba22 = h802.d();
        }
        ba23 = j542;
        if (j542 == null) {
            h802.g();
            ba23 = h802.e;
            ba23.getClass();
        }
        h802 = new h80(h802, view, u802, ba22, (j54)ba23, f752);
        view.setTag(2131361997, new WeakReference<h80>(h802));
        return h802;
    }

    public final boolean isTransitionGroup() {
        return !this.v || super.isTransitionGroup();
        {
        }
    }

    public final void onAttachedToWindow() {
        View view;
        super.onAttachedToWindow();
        Object object = ic5.a;
        ViewParent viewParent = au0.z((View)this);
        object = this;
        while (viewParent instanceof View && (view = (View)viewParent).getId() != 0x1020002) {
            viewParent = view.getParent();
            object = view;
        }
        if (object.getParent() == null) {
            this.getHandler().postAtFrontOfQueue((Runnable)new a0(0, (Object)this));
            return;
        }
        this.b();
    }

    public final void onLayout(boolean bl5, int n16, int n17, int n18, int n19) {
        View view = this.getChildAt(0);
        if (view != null) {
            view.layout(this.getPaddingLeft(), this.getPaddingTop(), n18 - n16 - this.getPaddingRight(), n19 - n17 - this.getPaddingBottom());
        }
    }

    public final void onMeasure(int n16, int n17) {
        this.e();
        View view = this.getChildAt(0);
        if (view == null) {
            super.onMeasure(n16, n17);
            return;
        }
        int n18 = Math.max(0, View.MeasureSpec.getSize((int)n16) - this.getPaddingLeft() - this.getPaddingRight());
        int n19 = Math.max(0, View.MeasureSpec.getSize((int)n17) - this.getPaddingTop() - this.getPaddingBottom());
        view.measure(View.MeasureSpec.makeMeasureSpec((int)n18, (int)View.MeasureSpec.getMode((int)n16)), View.MeasureSpec.makeMeasureSpec((int)n19, (int)View.MeasureSpec.getMode((int)n17)));
        n18 = view.getMeasuredWidth();
        int n26 = this.getPaddingLeft();
        n17 = this.getPaddingRight();
        n16 = view.getMeasuredHeight();
        n19 = this.getPaddingTop();
        this.setMeasuredDimension(n17 + (n26 + n18), this.getPaddingBottom() + (n19 + n16));
    }

    public final void onRtlPropertiesChanged(int n16) {
        View view = this.getChildAt(0);
        if (view != null) {
            view.setLayoutDirection(n16);
        }
    }

    public final void setAutoClearFocusBehavior_17tfJxM(int n16) {
        this.setTag(2131362053, new on(n16));
    }

    public final void setComposeViewContext$ui(h80 h802) {
        if (this.r != h802) {
            Object object;
            if (h802 == null) {
                this.d();
            } else if (this.getChildCount() != 0 && (object = (object = this.getChildAt(0)) instanceof ra ? (ra)object : null) != null) {
                if (((ra)object).getCoroutineContext() != h802.c().j()) {
                    this.d();
                }
                ((ra)object).setComposeViewContext(h802);
            }
            this.r = h802;
        }
    }

    public final void setParentCompositionContext(u80 u802) {
        this.setParentContext(u802);
    }

    public final void setShowLayoutBounds(boolean bl5) {
        this.t = bl5;
        View view = this.getChildAt(0);
        if (view != null) {
            ((ra)((ub3)view)).setShowLayoutBounds(bl5);
        }
    }

    public void setTransitionGroup(boolean bl5) {
        super.setTransitionGroup(bl5);
        this.v = true;
    }

    public final void setViewCompositionStrategy(l65 l652) {
        gf1 gf12 = this.s;
        if (gf12 != null) {
            gf12.invoke();
        }
        this.s = l652.d(this);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

