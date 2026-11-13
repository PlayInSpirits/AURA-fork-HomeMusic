package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import defpackage.de0;
import defpackage.g12;
import defpackage.l4;
import defpackage.xa3;
import defpackage.yd;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends de0 {
    public int o;
    public int p;
    public TimeInterpolator q;
    public TimeInterpolator r;
    public ViewPropertyAnimator u;
    public final LinkedHashSet n = new LinkedHashSet();
    public int s = 0;
    public int t = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // defpackage.de0
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.s = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.o = g12.N(view.getContext(), R.attr.motionDurationLong2, 225);
        this.p = g12.N(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.q = g12.O(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, yd.d);
        this.r = g12.O(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, yd.c);
        return false;
    }

    @Override // defpackage.de0
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.n;
        if (i > 0) {
            if (this.t == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.u;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.t = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw xa3.d(it);
            }
            this.u = view.animate().translationY(this.s).setInterpolator(this.r).setDuration(this.p).setListener(new l4(9, this));
            return;
        }
        if (i >= 0 || this.t == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.u;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.t = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw xa3.d(it2);
        }
        this.u = view.animate().translationY(0.0f).setInterpolator(this.q).setDuration(this.o).setListener(new l4(9, this));
    }

    @Override // defpackage.de0
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
