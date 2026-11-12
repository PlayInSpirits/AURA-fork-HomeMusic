package defpackage;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) obj;
                int i2 = DefaultTimeBar.f0;
                defaultTimeBar.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.n);
                break;
            case 1:
                ((DrawerLayout) obj).setScrimColor(v50.i(-1728053248, yd.c(lw0.a, valueAnimator.getAnimatedFraction(), 0)));
                break;
            case 2:
                ((ix0) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                qh2 qh2Var = (qh2) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh2Var.j.setAlpha((int) (255.0f * fFloatValue));
                qh2Var.x = fFloatValue;
                break;
            case 4:
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) obj;
                clippableRoundedCornerLayout.a(clippableRoundedCornerLayout.getLeft(), clippableRoundedCornerLayout.getTop(), clippableRoundedCornerLayout.getRight(), clippableRoundedCornerLayout.getBottom(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 5:
                ((dw0) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((v51) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
