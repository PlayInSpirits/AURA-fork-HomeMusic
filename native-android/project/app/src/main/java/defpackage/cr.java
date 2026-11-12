package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cr implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference n;
    public final WeakReference o;

    public cr(fr r2, View r3) {
        this.n = new WeakReference(r2);
        this.o = new WeakReference(r3);
    }

    public final void a() {
        WeakReference r0 = this.o;
        if (r0.get() == null) goto L7;
        ((View) r0.get()).removeOnAttachStateChangeListener(this);
        View r1 = (View) r0.get();
        if (r1 == null) goto L7;
        r1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    L7:
        r0.clear();
        this.n.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference r0 = this.n;
        if (r0.get() != null) goto L6;
        a();
        return;
    L6:
        fr r2 = (fr) r0.get();
        a61 r1 = fr.w;
        r2.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r2) {
        if (this.n.get() != null) goto L6;
        a();
        return;
    L6:
        if (r2 == null) goto L9;
        r2.getViewTreeObserver().addOnGlobalLayoutListener(this);
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        if (this.n.get() != null) goto L6;
        a();
        return;
    L6:
        if (r2 == null) goto L9;
        r2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        return;
    }
}
