package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k85 extends AnimatorListenerAdapter implements bx4 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public boolean e;
    public boolean f = false;
    public final boolean d = true;

    public k85(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // defpackage.bx4
    public final void b() {
        f(false);
    }

    @Override // defpackage.bx4
    public final void c(dx4 dx4Var) {
        if (!this.f) {
            d85.a.W(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        dx4Var.u(this);
    }

    @Override // defpackage.bx4
    public final void e() {
        f(true);
    }

    public final void f(boolean z) {
        ViewGroup viewGroup;
        if (!this.d || this.e == z || (viewGroup = this.c) == null) {
            return;
        }
        this.e = z;
        fh0.y(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            d85.a.W(this.a, this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f) {
            return;
        }
        d85.a.W(this.a, this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f) {
            return;
        }
        d85.a.W(this.a, 0);
    }

    @Override // defpackage.bx4
    public final void d() {
    }

    @Override // defpackage.bx4
    public final void a(dx4 dx4Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
