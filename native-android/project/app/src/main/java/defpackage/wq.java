package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;

    public /* synthetic */ wq(fr r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1) {
        int r2 = this.a;
        fr r0 = this.b;
        switch(r2) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r0.d();
        return;
    L6:
        r0.c();
        return;
    L8:
        r0.d();
        return;
    L10:
        r0.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r9) {
        int r0 = this.a;
        fr r3 = this.b;
        switch(r0) {
            case 1: goto L10;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r9);
        return;
    L6:
        SnackbarContentLayout r8 = r3.j;
        int r10 = r3.b;
        r8.n.setAlpha(1.0f);
        long r4 = r10;
        ViewPropertyAnimator r11 = r8.n.animate().alpha(0.0f).setDuration(r4);
        TimeInterpolator r1 = r8.p;
        r11.setInterpolator(r1).setStartDelay(0).start();
        if (r8.o.getVisibility() != 0) goto L14;
        r8.o.setAlpha(1.0f);
        r8.o.animate().alpha(0.0f).setDuration(r4).setInterpolator(r1).setStartDelay(0).start();
        return;
    L14:
        return;
    L10:
        SnackbarContentLayout r12 = r3.j;
        int r13 = r3.c;
        int r2 = r3.a;
        int r14 = r13 - r2;
        r12.n.setAlpha(0.0f);
        long r5 = r2;
        ViewPropertyAnimator r6 = r12.n.animate().alpha(1.0f).setDuration(r5);
        TimeInterpolator r7 = r12.p;
        long r15 = r14;
        r6.setInterpolator(r7).setStartDelay(r15).start();
        if (r12.o.getVisibility() != 0) goto L15;
        r12.o.setAlpha(0.0f);
        r12.o.animate().alpha(1.0f).setDuration(r5).setInterpolator(r7).setStartDelay(r15).start();
        return;
    }

    public /* synthetic */ wq(fr r1, int r2, int r3) {
        this.a = r3;
        this.b = r1;
    }
}
