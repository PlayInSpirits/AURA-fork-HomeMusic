/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import defpackage.wr1;
import defpackage.yd;

public final class qd4
implements ValueAnimator.AnimatorUpdateListener {
    public final SideSheetBehavior a;
    public final ViewGroup.MarginLayoutParams b;
    public final int c;
    public final View d;

    public qd4(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int n16, View view) {
        this.a = sideSheetBehavior;
        this.b = marginLayoutParams;
        this.c = n16;
        this.d = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        wr1 wr12 = this.a.n;
        float f16 = valueAnimator.getAnimatedFraction();
        int n16 = yd.c(this.c, f16, 0);
        wr12.T(this.b, n16);
        this.d.requestLayout();
    }
}

