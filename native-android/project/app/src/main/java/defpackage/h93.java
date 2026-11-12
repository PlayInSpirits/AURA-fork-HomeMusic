package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h93 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View n;
    public ViewTreeObserver o;
    public final Runnable p;

    public h93(View r1, Runnable r2) {
        this.n = r1;
        this.o = r1.getViewTreeObserver();
        this.p = r2;
    }

    public static void a(View r1, Runnable r2) {
        if (r1 == null) goto L5;
        h93 r0 = new h93(r1, r2);
        r1.getViewTreeObserver().addOnPreDrawListener(r0);
        r1.addOnAttachStateChangeListener(r0);
        return;
    L5:
        nz2.n("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean r0 = this.o.isAlive();
        View r1 = this.n;
        if (r0 == false) goto L5;
        this.o.removeOnPreDrawListener(this);
    L6:
        r1.removeOnAttachStateChangeListener(this);
        this.p.run();
        return true;
    L5:
        r1.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
        this.o = r1.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        boolean r3 = this.o.isAlive();
        View r0 = this.n;
        if (r3 == false) goto L5;
        this.o.removeOnPreDrawListener(this);
    L6:
        r0.removeOnAttachStateChangeListener(this);
        return;
    L5:
        r0.getViewTreeObserver().removeOnPreDrawListener(this);
        goto L6
    }
}
