package defpackage;

import android.animation.Animator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class d30 implements Animator.AnimatorListener {
    public final /* synthetic */ e30 a;
    public final /* synthetic */ f30 b;

    public d30(f30 f30Var, e30 e30Var) {
        this.b = f30Var;
        this.a = e30Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        f30 f30Var = this.b;
        e30 e30Var = this.a;
        f30Var.a(1.0f, e30Var, true);
        e30Var.k = e30Var.e;
        e30Var.l = e30Var.f;
        e30Var.m = e30Var.g;
        e30Var.a((e30Var.j + 1) % e30Var.i.length);
        if (!f30Var.s) {
            f30Var.r += 1.0f;
            return;
        }
        f30Var.s = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (e30Var.n) {
            e30Var.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.r = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
