package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq uqVar = (uq) obj;
                ArrayList arrayList = uqVar.x;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    kv4 kv4Var = (kv4) obj2;
                    kv4Var.Y = 1.2f;
                    kv4Var.W = floatValue;
                    kv4Var.X = floatValue;
                    kv4Var.Z = yd.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                    kv4Var.invalidateSelf();
                }
                WeakHashMap weakHashMap = j65.a;
                uqVar.postInvalidateOnAnimation();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi2 fi2Var = ((BottomSheetBehavior) obj).v;
                if (fi2Var != null) {
                    fi2Var.n(floatValue2);
                    break;
                }
                break;
            case 2:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int floatValue3 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                e61 e61Var = (e61) obj;
                e61Var.c.setAlpha(floatValue3);
                e61Var.d.setAlpha(floatValue3);
                e61Var.s.invalidate();
                break;
            case 4:
                ((b22) obj).m = valueAnimator.getAnimatedFraction();
                break;
            case 5:
                ((ld4) obj).invalidateSelf();
                break;
            case 6:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 7:
                ((TextInputLayout) obj).H0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(floatValue4);
                textView.setScaleY(floatValue4);
                break;
        }
    }
}
