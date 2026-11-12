package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class na5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ta5 a;
    public final /* synthetic */ pb5 b;
    public final /* synthetic */ pb5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public na5(ta5 ta5Var, pb5 pb5Var, pb5 pb5Var2, int i, View view) {
        this.a = ta5Var;
        this.b = pb5Var;
        this.c = pb5Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        bb5 va5Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ta5 ta5Var = this.a;
        sa5 sa5Var = ta5Var.a;
        sa5Var.e(animatedFraction);
        float fC = sa5Var.c();
        PathInterpolator pathInterpolator = pa5.e;
        int i = Build.VERSION.SDK_INT;
        pb5 pb5Var = this.b;
        if (i >= 36) {
            va5Var = new ab5(pb5Var);
        } else if (i >= 35) {
            va5Var = new za5(pb5Var);
        } else if (i >= 34) {
            va5Var = new ya5(pb5Var);
        } else if (i >= 31) {
            va5Var = new xa5(pb5Var);
        } else if (i >= 30) {
            va5Var = new wa5(pb5Var);
        } else {
            va5Var = i >= 29 ? new va5(pb5Var) : new ua5(pb5Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            mb5 mb5Var = pb5Var.a;
            if (i3 == 0) {
                va5Var.d(i2, mb5Var.h(i2));
            } else {
                vz1 vz1VarH = mb5Var.h(i2);
                vz1 vz1VarH2 = this.c.a.h(i2);
                float f = 1.0f - fC;
                va5Var.d(i2, pb5.e(vz1VarH, (int) (((double) ((vz1VarH.a - vz1VarH2.a) * f)) + 0.5d), (int) (((double) ((vz1VarH.b - vz1VarH2.b) * f)) + 0.5d), (int) (((double) ((vz1VarH.c - vz1VarH2.c) * f)) + 0.5d), (int) (((double) ((vz1VarH.d - vz1VarH2.d) * f)) + 0.5d)));
            }
        }
        pa5.h(this.e, va5Var.b(), Collections.singletonList(ta5Var));
    }
}
