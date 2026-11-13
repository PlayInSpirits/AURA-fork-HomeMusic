package defpackage;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;

    public xq(fr frVar, int i) {
        this.a = 2;
        this.b = frVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        fr frVar = this.b;
        switch (i) {
            case 0:
                frVar.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                er erVar = frVar.i;
                erVar.setScaleX(floatValue);
                erVar.setScaleY(floatValue);
                break;
            case 2:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a61 a61Var = fr.w;
                frVar.i.setTranslationY(intValue);
                break;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a61 a61Var2 = fr.w;
                frVar.i.setTranslationY(intValue2);
                break;
        }
    }

    public /* synthetic */ xq(fr frVar, int i, byte b) {
        this.a = i;
        this.b = frVar;
    }
}
