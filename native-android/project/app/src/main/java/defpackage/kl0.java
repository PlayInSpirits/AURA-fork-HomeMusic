package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cx3 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ pl0 e;

    public kl0(pl0 pl0Var, cx3 cx3Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = pl0Var;
        this.b = cx3Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        cx3 cx3Var = this.b;
        pl0 pl0Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                pl0Var.c(cx3Var);
                pl0Var.q.remove(cx3Var);
                pl0Var.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                pl0Var.c(cx3Var);
                pl0Var.o.remove(cx3Var);
                pl0Var.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public kl0(pl0 pl0Var, cx3 cx3Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = pl0Var;
        this.b = cx3Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
