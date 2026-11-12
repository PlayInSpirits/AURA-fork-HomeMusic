package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vm0 extends AnimatorListenerAdapter {
    public final /* synthetic */ xm0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pj4 d;
    public final /* synthetic */ tm0 e;

    public vm0(xm0 r1, View r2, boolean r3, pj4 r4, tm0 r5) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        r3.getClass();
        ViewGroup r4 = this.a.a;
        View r0 = this.b;
        r4.endViewTransition(r0);
        boolean r5 = this.c;
        pj4 r1 = this.d;
        if (r5 == false) goto L5;
        int r6 = r1.a;
        r0.getClass();
        f34.a(r0, r6);
    L5:
        this.e.d();
        if (ld1.I(2) == false) goto L9;
        Log.v("FragmentManager", "Animator from operation " + r1 + " has ended.");
        return;
    }
}
