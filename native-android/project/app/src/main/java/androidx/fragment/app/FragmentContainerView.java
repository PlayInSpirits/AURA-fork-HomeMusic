package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import app.homemusic.R;
import defpackage.dd1;
import defpackage.fe1;
import defpackage.j65;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.ld1;
import defpackage.nc1;
import defpackage.nz2;
import defpackage.ot3;
import defpackage.pb5;
import defpackage.po;
import defpackage.xa3;
import defpackage.xj0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList n;
    public final ArrayList o;
    public View.OnApplyWindowInsetsListener p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, ld1 ld1Var) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        ld1Var.getClass();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.q = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ot3.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        kc1 kc1VarC = ld1Var.C(id);
        if (classAttribute != null && kc1VarC == null) {
            if (id == -1) {
                kf2.o(xa3.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            dd1 dd1VarF = ld1Var.F();
            context.getClassLoader();
            kc1 kc1VarA = dd1VarF.a(classAttribute);
            kc1VarA.getClass();
            kc1VarA.J = id;
            kc1VarA.K = id;
            kc1VarA.L = string;
            kc1VarA.F = ld1Var;
            kc1VarA.G = ld1Var.v;
            kc1VarA.M(context, attributeSet, null);
            po poVar = new po(ld1Var);
            poVar.p = true;
            kc1VarA.S = this;
            poVar.g(getId(), kc1VarA, string, 1);
            if (poVar.g) {
                kf2.o("This transaction is already being added to the back stack");
                throw null;
            }
            poVar.h = false;
            poVar.q.z(poVar, true);
        }
        ArrayList arrayListV = ld1Var.c.v();
        int size = arrayListV.size();
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            fe1 fe1Var = (fe1) obj;
            kc1 kc1Var = fe1Var.c;
            if (kc1Var.K == getId() && (view = kc1Var.T) != null && view.getParent() == null) {
                kc1Var.S = this;
                fe1Var.b();
            }
        }
    }

    public final void a(View view) {
        if (this.o.contains(view)) {
            this.n.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof kc1 ? (kc1) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            nz2.z(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        pb5 pb5VarG;
        windowInsets.getClass();
        pb5 pb5VarG2 = pb5.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.p;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            pb5VarG = pb5.g(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = j65.a;
            WindowInsets windowInsetsF = pb5VarG2.f();
            if (windowInsetsF != null && !windowInsetsF.equals(windowInsetsF)) {
                pb5VarG2 = pb5.g(windowInsetsF, this);
            }
            pb5VarG = pb5VarG2;
        }
        if (!pb5VarG.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                j65.b(getChildAt(i), pb5VarG);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.q) {
            ArrayList arrayList = this.n;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.q) {
            ArrayList arrayList = this.n;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.o.remove(view);
        if (this.n.remove(view)) {
            this.q = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends kc1> F getFragment() {
        kc1 kc1Var;
        nc1 nc1Var;
        ld1 ld1VarK;
        View view = this;
        while (true) {
            if (view == null) {
                kc1Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            kc1Var = tag instanceof kc1 ? (kc1) tag : null;
            if (kc1Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (kc1Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    nc1Var = null;
                    break;
                }
                if (context instanceof nc1) {
                    nc1Var = (nc1) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (nc1Var == null) {
                nz2.w(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            ld1VarK = nc1Var.k();
        } else {
            if (!kc1Var.y()) {
                throw new IllegalStateException("The Fragment " + kc1Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            ld1VarK = kc1Var.m();
        }
        return (F) ld1VarK.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.q = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.p = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.o.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.q = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, xj0 xj0Var) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        context.getClass();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.q = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ot3.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }
}
