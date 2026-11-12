package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l81 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public float b;
    public float c;
    public final /* synthetic */ o81 d;

    public l81(o81 r1) {
        this.d = r1;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        float r3 = (int) this.c;
        n81 r0 = this.d.b;
        if (r0 == null) goto L5;
        r0.l(r3);
    L5:
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r3) {
        boolean r0 = this.a;
        o81 r1 = this.d;
        if (r0 == true) goto L9;
        n81 r2 = r1.b;
        if (r2 != null) goto L7;
        float r4 = 0.0f;
    L8:
        this.b = r4;
        this.c = a();
        this.a = true;
        goto L9
    L7:
        r4 = r2.n.m;
    L9:
        float r5 = this.b;
        float r6 = (int) ((r3.getAnimatedFraction() * (this.c - r5)) + r5);
        n81 r7 = r1.b;
        if (r7 == null) goto L13;
        r7.l(r6);
        return;
    }
}
