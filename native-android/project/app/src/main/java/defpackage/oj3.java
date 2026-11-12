package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oj3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj3 b;

    public /* synthetic */ oj3(qj3 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator r5) {
        int r0 = this.a;
        qj3 r3 = this.b;
        switch(r0) {
            case 0: goto L18;
            case 1: goto L4;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L10;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationEnd(r5);
        return;
    L6:
        ViewGroup r4 = r3.i;
        if (r4 == null) goto L31;
        r4.setVisibility(4);
        return;
    L31:
        return;
    L10:
        ViewGroup r6 = r3.g;
        if (r6 == null) goto L32;
        r6.setVisibility(4);
        return;
    L32:
        return;
    L14:
        r3.i(0);
        return;
    L16:
        r3.i(0);
        return;
    L18:
        View r7 = r3.b;
        if (r7 == null) goto L21;
        r7.setVisibility(4);
    L21:
        ViewGroup r8 = r3.c;
        if (r8 == null) goto L24;
        r8.setVisibility(4);
    L24:
        ViewGroup r9 = r3.d;
        if (r9 == null) goto L27;
        r9.setVisibility(4);
    L27:
        ViewGroup r10 = r3.f;
        if (r10 == null) goto L33;
        r10.setVisibility(4);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r8) {
        int r9 = this.a;
        int r4 = 4;
        qj3 r7 = this.b;
        switch(r9) {
            case 0: goto L40;
            case 1: goto L16;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L8;
            default: goto L4;
        };
    L4:
        ViewGroup r10 = r7.g;
        if (r10 == null) goto L49;
        r10.setVisibility(0);
        return;
    L49:
        return;
    L8:
        ViewGroup r11 = r7.i;
        if (r11 == null) goto L50;
        r11.setVisibility(0);
        r11.setTranslationX(r11.getWidth());
        r11.scrollTo(r11.getWidth(), 0);
        return;
    L50:
        return;
    L12:
        r7.i(4);
        return;
    L14:
        r7.i(4);
        return;
    L16:
        View r12 = r7.b;
        if (r12 == null) goto L19;
        r12.setVisibility(0);
    L19:
        ViewGroup r13 = r7.c;
        if (r13 == null) goto L22;
        r13.setVisibility(0);
    L22:
        ViewGroup r14 = r7.d;
        if (r14 == null) goto L25;
        r14.setVisibility(0);
    L25:
        ViewGroup r15 = r7.f;
        if (r15 != null) goto L28;
    L31:
        View r16 = r7.k;
        if ((r16 instanceof DefaultTimeBar) == true) goto L34;
        return;
    L34:
        if (r7.B == true) goto L52;
        DefaultTimeBar r17 = (DefaultTimeBar) r16;
        ValueAnimator r18 = r17.R;
        if (r18.isStarted() == false) goto L38;
        r18.cancel();
    L38:
        r17.T = false;
        r18.setFloatValues(new float[]{r17.S, 1.0f});
        r18.setDuration(250);
        r18.start();
        return;
    L52:
        return;
    L28:
        if (r7.B == false) goto L30;
        r4 = 0;
    L30:
        r15.setVisibility(r4);
        goto L31
    L40:
        View r19 = r7.k;
        if ((r19 instanceof DefaultTimeBar) == true) goto L43;
        return;
    L43:
        if (r7.B == true) goto L54;
        DefaultTimeBar r20 = (DefaultTimeBar) r19;
        ValueAnimator r21 = r20.R;
        if (r21.isStarted() == false) goto L47;
        r21.cancel();
    L47:
        r21.setFloatValues(new float[]{r20.S, 0.0f});
        r21.setDuration(250);
        r21.start();
        return;
    }
}
