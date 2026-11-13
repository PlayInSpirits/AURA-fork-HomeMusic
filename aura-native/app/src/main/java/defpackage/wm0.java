package defpackage;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wm0 implements Animation.AnimationListener {
    public final /* synthetic */ pj4 a;
    public final /* synthetic */ xm0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ tm0 d;

    public wm0(pj4 pj4Var, xm0 xm0Var, View view, tm0 tm0Var) {
        this.a = pj4Var;
        this.b = xm0Var;
        this.c = view;
        this.d = tm0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        xm0 xm0Var = this.b;
        xm0Var.a.post(new v6(xm0Var, this.c, this.d, 6));
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (ld1.I(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
