package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;

    public /* synthetic */ wq(fr frVar, int i) {
        this.a = i;
        this.b = frVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        fr frVar = this.b;
        switch (i) {
            case 0:
                frVar.c();
                break;
            case 1:
                frVar.d();
                break;
            case 2:
                frVar.c();
                break;
            default:
                frVar.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        fr frVar = this.b;
        switch (i) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = frVar.j;
                int i2 = frVar.c;
                int i3 = frVar.a;
                int i4 = i2 - i3;
                snackbarContentLayout.n.setAlpha(0.0f);
                long j = i3;
                ViewPropertyAnimator duration = snackbarContentLayout.n.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.p;
                long j2 = i4;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.o.getVisibility() == 0) {
                    snackbarContentLayout.o.setAlpha(0.0f);
                    snackbarContentLayout.o.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    break;
                }
                break;
            case 2:
                SnackbarContentLayout snackbarContentLayout2 = frVar.j;
                int i5 = frVar.b;
                snackbarContentLayout2.n.setAlpha(1.0f);
                long j3 = i5;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.n.animate().alpha(0.0f).setDuration(j3);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.p;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                if (snackbarContentLayout2.o.getVisibility() == 0) {
                    snackbarContentLayout2.o.setAlpha(1.0f);
                    snackbarContentLayout2.o.animate().alpha(0.0f).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ wq(fr frVar, int i, int i2) {
        this.a = i2;
        this.b = frVar;
    }
}
