package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b22 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final cx3 e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ cx3 o;
    public final /* synthetic */ f22 p;

    public b22(f22 f22Var, cx3 cx3Var, int i, float f, float f2, float f3, float f4, int i2, cx3 cx3Var2) {
        this.p = f22Var;
        this.n = i2;
        this.o = cx3Var2;
        this.f = i;
        this.e = cx3Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new qq(4, this));
        valueAnimatorOfFloat.setTarget(cx3Var.a);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.p(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        cx3 cx3Var = this.o;
        f22 f22Var = this.p;
        if (i <= 0) {
            f22Var.m.a(f22Var.r, cx3Var);
        } else {
            f22Var.a.add(cx3Var.a);
            this.h = true;
            if (i > 0) {
                f22Var.r.post(new lg1(f22Var, this, i));
            }
        }
        View view = f22Var.w;
        View view2 = cx3Var.a;
        if (view == view2 && view2 == view) {
            f22Var.w = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
