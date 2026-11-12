package defpackage;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wm0 implements Animation.AnimationListener {
    public final /* synthetic */ pj4 a;
    public final /* synthetic */ xm0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ tm0 d;

    public wm0(pj4 r1, xm0 r2, View r3, tm0 r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation r6) {
        r6.getClass();
        xm0 r7 = this.b;
        r7.a.post(new v6(r7, this.c, this.d, 6));
        if (ld1.I(2) == false) goto L6;
        Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        return;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation r1) {
        r1.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation r2) {
        r2.getClass();
        if (ld1.I(2) == false) goto L6;
        Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        return;
    }
}
