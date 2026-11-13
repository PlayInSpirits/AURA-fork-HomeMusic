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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList n;
    public final ArrayList o;
    public View.OnApplyWindowInsetsListener p;
    public boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, ld1 ld1Var) {
        super(context, attributeSet);
        View view;
        context.getClass();
        attributeSet.getClass();
        ld1Var.getClass();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.q = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ot3.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        kc1 C = ld1Var.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                kf2.o(xa3.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            dd1 F = ld1Var.F();
            context.getClassLoader();
            kc1 a = F.a(classAttribute);
            a.getClass();
            a.J = id;
            a.K = id;
            a.L = string;
            a.F = ld1Var;
            a.G = ld1Var.v;
            a.M(context, attributeSet, null);
            po poVar = new po(ld1Var);
            poVar.p = true;
            a.S = this;
            poVar.g(getId(), a, string, 1);
            if (poVar.g) {
                kf2.o("This transaction is already being added to the back stack");
                throw null;
            }
            poVar.h = false;
            poVar.q.z(poVar, true);
        }
        ArrayList v = ld1Var.c.v();
        int size = v.size();
        while (i < size) {
            Object obj = v.get(i);
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
        pb5 pb5Var;
        windowInsets.getClass();
        pb5 g = pb5.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.p;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            pb5Var = pb5.g(onApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = j65.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = pb5.g(f, this);
            }
            pb5Var = g;
        }
        if (!pb5Var.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                j65.b(getChildAt(i), pb5Var);
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
        ld1 k;
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
            k = nc1Var.k();
        } else {
            if (!kc1Var.y()) {
                throw new IllegalStateException("The Fragment " + kc1Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            k = kc1Var.m();
        }
        return (F) k.C(getId());
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
        super(context, attributeSet, i);
        String str;
        context.getClass();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.q = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ot3.b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
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
