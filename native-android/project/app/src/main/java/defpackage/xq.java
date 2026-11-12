package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;

    public xq(fr r1, int r2) {
        this.a = 2;
        this.b = r1;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r2) {
        int r0 = this.a;
        fr r1 = this.b;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        int r3 = ((Integer) r2.getAnimatedValue()).intValue();
        a61 r4 = fr.w;
        r1.i.setTranslationY(r3);
        return;
    L6:
        int r5 = ((Integer) r2.getAnimatedValue()).intValue();
        a61 r6 = fr.w;
        r1.i.setTranslationY(r5);
        return;
    L8:
        float r7 = ((Float) r2.getAnimatedValue()).floatValue();
        er r8 = r1.i;
        r8.setScaleX(r7);
        r8.setScaleY(r7);
        return;
    L10:
        r1.i.setAlpha(((Float) r2.getAnimatedValue()).floatValue());
    }

    public /* synthetic */ xq(fr r1, int r2, byte r3) {
        this.a = r2;
        this.b = r1;
    }
}
