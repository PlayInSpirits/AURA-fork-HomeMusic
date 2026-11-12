package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ll0 extends AnimatorListenerAdapter {
    public final /* synthetic */ cx3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ pl0 f;

    public ll0(pl0 r1, cx3 r2, int r3, View r4, int r5, ViewPropertyAnimator r6) {
        this.f = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r3) {
        int r4 = this.b;
        View r1 = this.c;
        if (r4 == 0) goto L6;
        r1.setTranslationX(0.0f);
    L6:
        if (this.d == 0) goto L9;
        r1.setTranslationY(0.0f);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        this.e.setListener(null);
        pl0 r3 = this.f;
        cx3 r1 = this.a;
        r3.c(r1);
        r3.p.remove(r1);
        r3.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
        this.f.getClass();
    }
}
