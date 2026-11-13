package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ xm0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pj4 d;
    public final /* synthetic */ tm0 e;

    public vm0(xm0 xm0Var, View view, boolean z, pj4 pj4Var, tm0 tm0Var) {
        this.a = xm0Var;
        this.b = view;
        this.c = z;
        this.d = pj4Var;
        this.e = tm0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        pj4 pj4Var = this.d;
        if (z) {
            int i = pj4Var.a;
            view.getClass();
            f34.a(view, i);
        }
        this.e.d();
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Animator from operation " + pj4Var + " has ended.");
        }
    }
}
