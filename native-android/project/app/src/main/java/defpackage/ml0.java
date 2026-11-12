package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ml0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ nl0 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ pl0 e;

    public /* synthetic */ ml0(pl0 r1, nl0 r2, ViewPropertyAnimator r3, View r4, int r5) {
        this.a = r5;
        this.e = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r7) {
        int r8 = this.a;
        nl0 r0 = this.b;
        pl0 r1 = this.e;
        View r4 = this.d;
        ViewPropertyAnimator r6 = this.c;
        switch(r8) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r6.setListener(null);
        r4.setAlpha(1.0f);
        r4.setTranslationX(0.0f);
        r4.setTranslationY(0.0f);
        r1.c(r0.b);
        r1.r.remove(r0.b);
        r1.i();
        return;
    L6:
        r6.setListener(null);
        r4.setAlpha(1.0f);
        r4.setTranslationX(0.0f);
        r4.setTranslationY(0.0f);
        r1.c(r0.a);
        r1.r.remove(r0.a);
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
}
