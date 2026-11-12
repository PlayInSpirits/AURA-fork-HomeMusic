package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nx4 extends AnimatorListenerAdapter implements bx4 {
    public final View a;
    public final View b;
    public final int c;
    public final int d;
    public int[] e;
    public float f;
    public float g;
    public final float h;
    public final float i;

    public nx4(View r2, View r3, int r4, int r5, float r6, float r7) {
        this.b = r2;
        this.a = r3;
        this.c = r4 - Math.round(r2.getTranslationX());
        this.d = r5 - Math.round(r2.getTranslationY());
        this.h = r6;
        this.i = r7;
        int[] r8 = (int[]) r3.getTag(R.id.transition_position);
        this.e = r8;
        if (r8 == null) goto L6;
        r3.setTag(R.id.transition_position, null);
        return;
    }

    @Override // defpackage.bx4
    public final void a(dx4 r1) {
    }

    @Override // defpackage.bx4
    public final void b() {
    }

    @Override // defpackage.bx4
    public final void c(dx4 r3) {
        float r0 = this.h;
        View r1 = this.b;
        r1.setTranslationX(r0);
        r1.setTranslationY(this.i);
        r3.u(this);
    }

    @Override // defpackage.bx4
    public final void d() {
    }

    @Override // defpackage.bx4
    public final void e() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r4) {
        if (this.e != null) goto L5;
        this.e = new int[2];
    L5:
        int[] r5 = this.e;
        float r0 = this.c;
        View r1 = this.b;
        r5[0] = Math.round(r1.getTranslationX() + r0);
        this.e[1] = Math.round(r1.getTranslationY() + this.d);
        this.a.setTag(R.id.transition_position, this.e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator r2) {
        View r3 = this.b;
        this.f = r3.getTranslationX();
        this.g = r3.getTranslationY();
        r3.setTranslationX(this.h);
        r3.setTranslationY(this.i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator r2) {
        float r3 = this.f;
        View r0 = this.b;
        r0.setTranslationX(r3);
        r0.setTranslationY(this.g);
    }
}
