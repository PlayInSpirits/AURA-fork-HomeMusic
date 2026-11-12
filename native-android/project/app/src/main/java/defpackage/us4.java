package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class us4 extends dx4 {
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
        HashMap map = mx4Var.a;
        HashMap map2 = mx4Var2.a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new qq(8, textView));
        return valueAnimatorOfFloat;
    }
}
