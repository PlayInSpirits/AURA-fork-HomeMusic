/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import defpackage.dw0;
import defpackage.h11;
import defpackage.ix0;
import defpackage.lw0;
import defpackage.qh2;
import defpackage.v50;
import defpackage.v51;
import defpackage.yd;

public final class cn0
implements ValueAnimator.AnimatorUpdateListener {
    public final int a;
    public final Object b;

    public cn0(int n16, Object object) {
        this.a = n16;
        this.b = object;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int n16 = this.a;
        Object object = this.b;
        switch (n16) {
            default: {
                ((v51)object).a(((Float)valueAnimator.getAnimatedValue()).floatValue());
                return;
            }
            case 5: {
                ((dw0)object).setProgress(((Float)valueAnimator.getAnimatedValue()).floatValue());
                return;
            }
            case 4: {
                object = (ClippableRoundedCornerLayout)object;
                float f16 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                ((ClippableRoundedCornerLayout)object).a(((View)object).getLeft(), ((View)object).getTop(), ((View)object).getRight(), ((View)object).getBottom(), f16);
                return;
            }
            case 3: {
                object = (qh2)object;
                float f17 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                n16 = (int)(255.0f * f17);
                ((qh2)object).j.setAlpha(n16);
                ((qh2)object).x = f17;
                return;
            }
            case 2: {
                object = (ix0)object;
                float f18 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
                ((h11)object).d.setAlpha(f18);
                return;
            }
            case 1: {
                ((DrawerLayout)object).setScrimColor(v50.i(-1728053248, yd.c(lw0.a, valueAnimator.getAnimatedFraction(), 0)));
                return;
            }
            case 0: 
        }
        object = (DefaultTimeBar)object;
        n16 = DefaultTimeBar.f0;
        ((DefaultTimeBar)object).S = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        ((View)object).invalidate(((DefaultTimeBar)object).n);
    }
}

