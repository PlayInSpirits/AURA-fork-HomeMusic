package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gi2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hi2 c;

    public gi2(hi2 r1, boolean r2, int r3) {
        this.c = r1;
        this.a = r2;
        this.b = r3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        hi2 r4 = this.c;
        r4.b.setTranslationX(0.0f);
        boolean r0 = this.a;
        r4.d(0.0f, this.b, r0);
    }
}
