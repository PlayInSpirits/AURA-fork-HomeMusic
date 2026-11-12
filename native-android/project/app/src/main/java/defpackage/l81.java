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

    public l81(o81 o81Var) {
        this.d = o81Var;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = (int) this.c;
        n81 n81Var = this.d.b;
        if (n81Var != null) {
            n81Var.l(f);
        }
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z = this.a;
        o81 o81Var = this.d;
        if (!z) {
            n81 n81Var = o81Var.b;
            this.b = n81Var == null ? 0.0f : n81Var.n.m;
            this.c = a();
            this.a = true;
        }
        float f = this.b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.c - f)) + f);
        n81 n81Var2 = o81Var.b;
        if (n81Var2 != null) {
            n81Var2.l(animatedFraction);
        }
    }
}
