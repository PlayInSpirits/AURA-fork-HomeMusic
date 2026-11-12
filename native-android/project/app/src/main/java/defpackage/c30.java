package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c30(oz2 oz2Var, View[] viewArr) {
        this.b = oz2Var;
        this.c = viewArr;
    }

    public static c30 a(View... viewArr) {
        return new c30(new zr2(29), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f30 f30Var = (f30) obj2;
                e30 e30Var = (e30) obj;
                f30.d(fFloatValue, e30Var);
                f30Var.a(fFloatValue, e30Var, false);
                f30Var.invalidateSelf();
                break;
            default:
                for (View view : (View[]) obj2) {
                    ((oz2) obj).a(valueAnimator, view);
                }
                break;
        }
    }

    public c30(f30 f30Var, e30 e30Var) {
        this.c = f30Var;
        this.b = e30Var;
    }
}
