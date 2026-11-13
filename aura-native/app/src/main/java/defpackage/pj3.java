package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.ui.PlayerControlView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pj3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerControlView b;
    public final /* synthetic */ qj3 c;

    public /* synthetic */ pj3(qj3 qj3Var, PlayerControlView playerControlView, int i) {
        this.a = i;
        this.c = qj3Var;
        this.b = playerControlView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        PlayerControlView playerControlView = this.b;
        qj3 qj3Var = this.c;
        switch (i) {
            case 0:
                qj3Var.i(1);
                if (qj3Var.C) {
                    playerControlView.post(qj3Var.t);
                    qj3Var.C = false;
                    break;
                }
                break;
            case 1:
                qj3Var.i(2);
                if (qj3Var.C) {
                    playerControlView.post(qj3Var.t);
                    qj3Var.C = false;
                    break;
                }
                break;
            default:
                qj3Var.i(2);
                if (qj3Var.C) {
                    playerControlView.post(qj3Var.t);
                    qj3Var.C = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        qj3 qj3Var = this.c;
        switch (i) {
            case 0:
                qj3Var.i(3);
                break;
            case 1:
                qj3Var.i(3);
                break;
            default:
                qj3Var.i(3);
                break;
        }
    }
}
