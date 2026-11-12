package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final View b;
    public final View c;
    public final Object d;

    public w51(ActionMenuView r2, ActionMenuView r3) {
        this.a = 0;
        this.b = r2;
        this.c = r3;
        this.d = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        int r0 = this.a;
        View r1 = this.c;
        View r2 = this.b;
        Object r3 = this.d;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((jq4) r3).c(r2, r1, r4.getAnimatedFraction());
        return;
    L6:
        float[] r5 = (float[]) r3;
        zz1.g(((Float) r4.getAnimatedValue()).floatValue(), r5);
        if (r2 == null) goto L9;
        r2.setAlpha(r5[0]);
    L9:
        if (r1 == null) goto L12;
        r1.setAlpha(r5[1]);
        return;
    }

    public w51(jq4 r2, View r3, View r4) {
        this.a = 1;
        this.d = r2;
        this.b = r3;
        this.c = r4;
    }
}
