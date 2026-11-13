package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class oj3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj3 b;

    public /* synthetic */ oj3(qj3 qj3Var, int i) {
        this.a = i;
        this.b = qj3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        qj3 qj3Var = this.b;
        switch (i) {
            case 0:
                View view = qj3Var.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = qj3Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = qj3Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = qj3Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    break;
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                qj3Var.i(0);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                qj3Var.i(0);
                break;
            case 4:
                ViewGroup viewGroup4 = qj3Var.g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    break;
                }
                break;
            case 5:
                ViewGroup viewGroup5 = qj3Var.i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        qj3 qj3Var = this.b;
        switch (i) {
            case 0:
                View view = qj3Var.k;
                if ((view instanceof DefaultTimeBar) && !qj3Var.B) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.R;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.S, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = qj3Var.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = qj3Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = qj3Var.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = qj3Var.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(qj3Var.B ? 0 : 4);
                }
                View view3 = qj3Var.k;
                if ((view3 instanceof DefaultTimeBar) && !qj3Var.B) {
                    DefaultTimeBar defaultTimeBar2 = (DefaultTimeBar) view3;
                    ValueAnimator valueAnimator2 = defaultTimeBar2.R;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    defaultTimeBar2.T = false;
                    valueAnimator2.setFloatValues(defaultTimeBar2.S, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                qj3Var.i(4);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                qj3Var.i(4);
                break;
            case 4:
                ViewGroup viewGroup4 = qj3Var.i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    break;
                }
                break;
            default:
                ViewGroup viewGroup5 = qj3Var.g;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
