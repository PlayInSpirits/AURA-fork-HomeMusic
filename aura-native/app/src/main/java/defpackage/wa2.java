package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wa2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa2 b;

    public /* synthetic */ wa2(xa2 xa2Var, int i) {
        this.a = i;
        this.b = xa2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                xa2 xa2Var = this.b;
                xa2Var.d();
                hq hqVar = xa2Var.k;
                if (hqVar != null) {
                    hqVar.a((sx1) xa2Var.a);
                    break;
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
                xa2 xa2Var = this.b;
                xa2Var.h = (xa2Var.h + 1) % xa2Var.g.c.length;
                xa2Var.i = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
