package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i33 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ k33 b;

    public i33(k33 r1, float r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r2) {
        float r3 = ((Float) r2.getAnimatedValue()).floatValue();
        this.b.e(r3, this.a);
    }
}
