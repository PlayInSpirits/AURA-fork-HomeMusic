package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vc1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public vc1(wc1 wc1Var, fe1 fe1Var) {
        this.n = 0;
        this.p = wc1Var;
        this.o = fe1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                fe1 fe1Var = (fe1) obj2;
                kc1 kc1Var = fe1Var.c;
                fe1Var.k();
                xm0.f((ViewGroup) kc1Var.T.getParent(), ((wc1) obj).n).e();
                break;
            case 1:
                b0 b0Var = (b0) obj2;
                ba2 u = j51.u(b0Var);
                if (u == null) {
                    cz1.c("View tree for " + b0Var + " has no ViewTreeLifecycleOwner");
                    er1.a();
                    break;
                } else {
                    ((jx3) obj).n = fu.c(b0Var, u.h());
                    b0Var.removeOnAttachStateChangeListener(this);
                    break;
                }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.n) {
            case 0:
            case 1:
                break;
            default:
                ((View) this.o).removeOnAttachStateChangeListener(this);
                ((tv3) this.p).x();
                break;
        }
    }

    public /* synthetic */ vc1(int i, View view, Object obj) {
        this.n = i;
        this.o = view;
        this.p = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
