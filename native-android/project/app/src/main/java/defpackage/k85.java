package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k85 extends AnimatorListenerAdapter implements bx4 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public k85(View r2, int r3) {
        this.f = false;
        this.a = r2;
        this.b = r3;
        this.c = (ViewGroup) r2.getParent();
        this.d = true;
        f(true);
    }

    @Override // defpackage.bx4
    public final void a(dx4 r1) {
    }

    @Override // defpackage.bx4
    public final void b() {
        f(false);
    }

    @Override // defpackage.bx4
    public final void c(dx4 r4) {
        if (this.f == true) goto L7;
        int r0 = this.b;
        d85.a.W(this.a, r0);
        ViewGroup r1 = this.c;
        if (r1 == null) goto L7;
        r1.invalidate();
    L7:
        f(false);
        r4.u(this);
    }

    @Override // defpackage.bx4
    public final void d() {
    }

    @Override // defpackage.bx4
    public final void e() {
        f(true);
    }

    public final void f(boolean r2) {
        if (this.d == true) goto L5;
        return;
    L5:
        if (this.e == r2) goto L11;
        ViewGroup r0 = this.c;
        if (r0 == null) goto L12;
        this.e = r2;
        fh0.y(r0, r2);
        return;
    L12:
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        if (this.f == true) goto L7;
        int r4 = this.b;
        d85.a.W(this.a, r4);
        ViewGroup r5 = this.c;
        if (r5 == null) goto L7;
        r5.invalidate();
    L7:
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator r2) {
        if (this.f == true) goto L6;
        int r3 = this.b;
        d85.a.W(this.a, r3);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator r2) {
        if (this.f == true) goto L6;
        d85.a.W(this.a, 0);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
    }
}
