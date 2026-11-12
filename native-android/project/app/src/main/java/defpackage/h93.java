package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h93 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View n;
    public ViewTreeObserver o;
    public final Runnable p;

    public h93(View view, Runnable runnable) {
        this.n = view;
        this.o = view.getViewTreeObserver();
        this.p = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            nz2.n("view == null");
            return;
        }
        h93 h93Var = new h93(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(h93Var);
        view.addOnAttachStateChangeListener(h93Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.o.isAlive();
        View view = this.n;
        if (zIsAlive) {
            this.o.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.p.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.o = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.o.isAlive();
        View view2 = this.n;
        if (zIsAlive) {
            this.o.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
