package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a30 b;

    public /* synthetic */ z20(a30 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator r2) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationEnd(r2);
        return;
    L6:
        super.onAnimationEnd(r2);
        a30 r1 = this.b;
        r1.d();
        hq r3 = r1.k;
        if (r3 == null) goto L10;
        r3.a((sx1) r1.a);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationRepeat(r2);
        return;
    L6:
        super.onAnimationRepeat(r2);
        a30 r1 = this.b;
        r1.h = (r1.h + 4) % r1.g.c.length;
    }
}
