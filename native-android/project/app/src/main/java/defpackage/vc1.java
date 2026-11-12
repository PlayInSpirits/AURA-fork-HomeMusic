package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public vc1(wc1 r2, fe1 r3) {
        this.n = 0;
        this.p = r2;
        this.o = r3;
    }

    private final void a(View r1) {
    }

    private final void b(View r1) {
    }

    private final void c(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r3) {
        int r4 = this.n;
        Object r0 = this.p;
        Object r1 = this.o;
        switch(r4) {
            case 0: goto L10;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        b0 r2 = (b0) r1;
        ba2 r5 = j51.u(r2);
        if (r5 == null) goto L8;
        ((jx3) r0).n = fu.c(r2, r5.h());
        r2.removeOnAttachStateChangeListener(this);
        return;
    L8:
        cz1.c("View tree for " + r2 + " has no ViewTreeLifecycleOwner");
        er1.a();
        return;
    L10:
        fe1 r6 = (fe1) r1;
        kc1 r7 = r6.c;
        r6.k();
        xm0.f((ViewGroup) r7.T.getParent(), ((wc1) r0).n).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
        switch(this.n) {
            case 0: goto L6;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((View) this.o).removeOnAttachStateChangeListener(this);
        ((tv3) this.p).x();
        return;
    }

    public /* synthetic */ vc1(int r1, View r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }
}
