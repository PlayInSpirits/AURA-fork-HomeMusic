package defpackage;

import android.animation.Animator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d30 implements Animator.AnimatorListener {
    public final /* synthetic */ e30 a;
    public final /* synthetic */ f30 b;

    public d30(f30 r1, e30 r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r5) {
        f30 r0 = this.b;
        e30 r4 = this.a;
        r0.a(1.0f, r4, true);
        r4.k = r4.e;
        r4.l = r4.f;
        r4.m = r4.g;
        r4.a((r4.j + 1) % r4.i.length);
        if (r0.s == false) goto L8;
        r0.s = false;
        r5.cancel();
        r5.setDuration(1332);
        r5.start();
        if (r4.n == false) goto L10;
        r4.n = false;
        return;
    L10:
        return;
    L8:
        r0.r += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        this.b.r = 0.0f;
    }
}
