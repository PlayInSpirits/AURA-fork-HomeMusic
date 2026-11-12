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
    public boolean k;
    public boolean l;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ cx3 o;
    public final /* synthetic */ f22 p;

    public b22(f22 r1, cx3 r2, int r3, float r4, float r5, float r6, float r7, int r8, cx3 r9) {
        this.p = r1;
        this.n = r8;
        this.o = r9;
        this.k = false;
        this.l = false;
        this.f = r3;
        this.e = r2;
        this.a = r4;
        this.b = r5;
        this.c = r6;
        this.d = r7;
        ValueAnimator r10 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.g = r10;
        r10.addUpdateListener(new qq(4, this));
        r10.setTarget(r2.a);
        r10.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator r2) {
        if (this.l == true) goto L5;
        this.e.p(true);
    L5:
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r5) {
        a(r5);
        if (this.k == true) goto L18;
        int r6 = this.n;
        cx3 r0 = this.o;
        f22 r1 = this.p;
        if (r6 > 0) goto L8;
        r1.m.a(r1.r, r0);
    L11:
        View r4 = r1.w;
        View r7 = r0.a;
        if (r4 != r7) goto L16;
        if (r7 != r4) goto L17;
        r1.w = null;
        return;
    L17:
        return;
    L16:
        return;
    L8:
        r1.a.add(r0.a);
        this.h = true;
        if (r6 <= 0) goto L11;
        r1.r.post(new lg1(r1, this, r6));
        goto L11
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r1) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
    }
}
