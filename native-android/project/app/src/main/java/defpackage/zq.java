package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ fr o;

    public /* synthetic */ zq(fr r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        fr r6 = this.o;
        int r2 = 1;
        switch(r0) {
            case 0: goto L20;
            case 1: goto L18;
            default: goto L4;
        };
    L4:
        er r1 = r6.i;
        if (r1 == null) goto L31;
        byte r4 = 0;
        if (r1.getParent() == null) goto L11;
        r1.setVisibility(0);
    L11:
        if (r1.getAnimationMode() != 1) goto L13;
        ValueAnimator r3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r3.setInterpolator(r6.d);
        r3.addUpdateListener(new xq(r6, r4, r4));
        ValueAnimator r5 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        r5.setInterpolator(r6.f);
        r5.addUpdateListener(new xq(r6, r2, r4));
        AnimatorSet r7 = new AnimatorSet();
        r7.playTogether(new Animator[]{r3, r5});
        r7.setDuration(r6.a);
        r7.addListener(new wq(r6, 3));
        r7.start();
        return;
    L13:
        int r8 = r1.getHeight();
        ViewGroup.LayoutParams r9 = r1.getLayoutParams();
        if ((r9 instanceof ViewGroup.MarginLayoutParams) == false) goto L16;
        r8 = r8 + ((ViewGroup.MarginLayoutParams) r9).bottomMargin;
    L16:
        r1.setTranslationY(r8);
        ValueAnimator r10 = new ValueAnimator();
        r10.setIntValues(new int[]{r8, 0});
        r10.setInterpolator(r6.e);
        r10.setDuration(r6.c);
        r10.addListener(new wq(r6, r2));
        r10.addUpdateListener(new xq(r6, r8));
        r10.start();
        return;
    L31:
        return;
    L18:
        r6.c();
        return;
    L20:
        er r11 = r6.i;
        if (r11 == null) goto L32;
        int r12 = ya4.u(r6.h).height();
        int[] r13 = new int[2];
        r11.getLocationOnScreen(r13);
        int r14 = (r12 - (r11.getHeight() + r13[1])) + ((int) r11.getTranslationY());
        int r15 = r6.r;
        if (r14 < r15) goto L25;
        r6.s = r15;
        return;
    L25:
        ViewGroup.LayoutParams r16 = r11.getLayoutParams();
        if ((r16 instanceof ViewGroup.MarginLayoutParams) == true) goto L28;
        Log.w(fr.B, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
        return;
    L28:
        int r17 = r6.r;
        r6.s = r17;
        ViewGroup.MarginLayoutParams r18 = (ViewGroup.MarginLayoutParams) r16;
        r18.bottomMargin = (r17 - r14) + r18.bottomMargin;
        r11.requestLayout();
        return;
    }
}
