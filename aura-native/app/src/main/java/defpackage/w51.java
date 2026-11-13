package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final Object d;

    public w51(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.a = 0;
        this.b = actionMenuView;
        this.c = actionMenuView2;
        this.d = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.c;
        View view2 = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                float[] fArr = (float[]) obj;
                zz1.g(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr);
                if (view2 != null) {
                    view2.setAlpha(fArr[0]);
                }
                if (view != null) {
                    view.setAlpha(fArr[1]);
                    break;
                }
                break;
            default:
                ((jq4) obj).c(view2, view, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public w51(jq4 jq4Var, View view, View view2) {
        this.a = 1;
        this.d = jq4Var;
        this.b = view;
        this.c = view2;
    }
}
