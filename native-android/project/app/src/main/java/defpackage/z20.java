package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a30 b;

    public /* synthetic */ z20(a30 a30Var, int i) {
        this.a = i;
        this.b = a30Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                a30 a30Var = this.b;
                a30Var.d();
                hq hqVar = a30Var.k;
                if (hqVar != null) {
                    hqVar.a((sx1) a30Var.a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                a30 a30Var = this.b;
                a30Var.h = (a30Var.h + 4) % a30Var.g.c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
