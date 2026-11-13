package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class us4 extends dx4 {
    public us4() {
        super();
    }

    @Override // defpackage.dx4
    public final void c(mx4 mx4Var) {
        View view = mx4Var.b;
        if (view instanceof TextView) {
            mx4Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.dx4
    public final void f(mx4 mx4Var) {
        View view = mx4Var.b;
        if (view instanceof TextView) {
            mx4Var.a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // defpackage.dx4
    public final Animator j(ViewGroup viewGroup, mx4 mx4Var, mx4 mx4Var2) {
        if (mx4Var == null || mx4Var2 == null || !(mx4Var.b instanceof TextView)) {
            return null;
        }
        View view = mx4Var2.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = mx4Var.a;
        HashMap hashMap2 = mx4Var2.a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new qq(8, textView));
        return ofFloat;
    }
}
