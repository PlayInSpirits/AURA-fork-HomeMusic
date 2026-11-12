package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u51 extends l85 {
    public u51(int r1) {
        this.K = r1;
    }

    @Override // defpackage.l85
    public final ObjectAnimator H(ViewGroup r2, View r3, mx4 r4, mx4 r5) {
        float r6 = 0.0f;
        if (r4 == null) goto L7;
        Float r7 = (Float) r4.a.get("android:fade:transitionAlpha");
        if (r7 == null) goto L7;
        float r8 = r7.floatValue();
    L9:
        if (r8 == 1.0f) goto L13;
        r6 = r8;
    L13:
        return J(r3, r6, 1.0f);
    L7:
        r8 = 0.0f;
        goto L9
    }

    @Override // defpackage.l85
    public final ObjectAnimator I(ViewGroup r1, View r2, mx4 r3) {
        d85.a.getClass();
        if (r3 == null) goto L7;
        Float r4 = (Float) r3.a.get("android:fade:transitionAlpha");
        if (r4 == null) goto L7;
        float r5 = r4.floatValue();
    L9:
        return J(r2, r5, 0.0f);
    L7:
        r5 = 1.0f;
        goto L9
    }

    public final ObjectAnimator J(View r3, float r4, float r5) {
        if (r4 != r5) goto L6;
        return null;
    L6:
        d85.a.R(r3, r4);
        ObjectAnimator r6 = ObjectAnimator.ofFloat(r3, d85.b, new float[]{r5});
        r6.addListener(new p51(r3));
        a(new t51(0, r3));
        return r6;
    }

    @Override // defpackage.dx4
    public final void f(mx4 r2) {
        l85.F(r2);
        HashMap r1 = r2.a;
        View r3 = r2.b;
        r1.put("android:fade:transitionAlpha", Float.valueOf(d85.a.D(r3)));
    }
}
