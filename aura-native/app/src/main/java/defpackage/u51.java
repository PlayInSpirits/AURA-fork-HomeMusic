package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class u51 extends l85 {
    public u51() {
        super();
    }

    public u51(int i) {
        this.K = i;
    }

    @Override // defpackage.l85
    public final ObjectAnimator H(ViewGroup viewGroup, View view, mx4 mx4Var, mx4 mx4Var2) {
        Float f;
        float floatValue = (mx4Var == null || (f = (Float) mx4Var.a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
        return J(view, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
    }

    @Override // defpackage.l85
    public final ObjectAnimator I(ViewGroup viewGroup, View view, mx4 mx4Var) {
        Float f;
        d85.a.getClass();
        return J(view, (mx4Var == null || (f = (Float) mx4Var.a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), 0.0f);
    }

    public final ObjectAnimator J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        d85.a.R(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, d85.b, f2);
        ofFloat.addListener(new p51(view));
        a(new t51(0, view));
        return ofFloat;
    }

    @Override // defpackage.dx4
    public final void f(mx4 mx4Var) {
        l85.F(mx4Var);
        mx4Var.a.put("android:fade:transitionAlpha", Float.valueOf(d85.a.D(mx4Var.b)));
    }
}
