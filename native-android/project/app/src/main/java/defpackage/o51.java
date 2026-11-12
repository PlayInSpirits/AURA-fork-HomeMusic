package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o51 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public o51(boolean r1, View r2, View r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        if (this.a == true) goto L6;
        this.b.setVisibility(4);
        View r1 = this.c;
        r1.setAlpha(1.0f);
        r1.setVisibility(0);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        if (this.a == false) goto L6;
        this.b.setVisibility(0);
        View r1 = this.c;
        r1.setAlpha(0.0f);
        r1.setVisibility(4);
        return;
    }
}
