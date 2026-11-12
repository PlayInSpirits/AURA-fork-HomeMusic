package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kl0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx3 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ pl0 e;

    public kl0(pl0 r2, cx3 r3, ViewPropertyAnimator r4, View r5) {
        this.a = 0;
        this.e = r2;
        this.b = r3;
        this.d = r4;
        this.c = r5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        this.c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r5) {
        int r6 = this.a;
        cx3 r0 = this.b;
        pl0 r1 = this.e;
        ViewPropertyAnimator r3 = this.d;
        switch(r6) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.setListener(null);
        r1.c(r0);
        r1.o.remove(r0);
        r1.i();
        return;
    L6:
        r3.setListener(null);
        this.c.setAlpha(1.0f);
        r1.c(r0);
        r1.q.remove(r0);
        r1.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.e.getClass();
        return;
    L6:
        this.e.getClass();
    }

    public kl0(pl0 r2, cx3 r3, View r4, ViewPropertyAnimator r5) {
        this.a = 1;
        this.e = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
    }
}
