package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.homemusic.R;
import defpackage.a30;
import defpackage.g30;
import defpackage.gp0;
import defpackage.h12;
import defpackage.ht3;
import defpackage.iq;
import defpackage.jq;
import defpackage.sx1;
import defpackage.uc5;
import defpackage.y20;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CircularProgressIndicator extends iq {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        Context context2 = getContext();
        g30 g30Var = (g30) this.n;
        setIndeterminateDrawable(new sx1(context2, g30Var, new y20(g30Var), new a30(g30Var)));
        setProgressDrawable(new gp0(getContext(), g30Var, new y20(g30Var)));
    }

    @Override // defpackage.iq
    public final jq a(Context context, AttributeSet attributeSet) {
        g30 g30Var = new g30(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        uc5.c(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = ht3.j;
        uc5.g(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        g30Var.g = Math.max(h12.u(context, obtainStyledAttributes, 2, dimensionPixelSize), g30Var.a * 2);
        g30Var.h = h12.u(context, obtainStyledAttributes, 1, dimensionPixelSize2);
        g30Var.i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return g30Var;
    }

    public int getIndicatorDirection() {
        return ((g30) this.n).i;
    }

    public int getIndicatorInset() {
        return ((g30) this.n).h;
    }

    public int getIndicatorSize() {
        return ((g30) this.n).g;
    }

    public void setIndicatorDirection(int i) {
        ((g30) this.n).i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        jq jqVar = this.n;
        if (((g30) jqVar).h != i) {
            ((g30) jqVar).h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        jq jqVar = this.n;
        if (((g30) jqVar).g != max) {
            ((g30) jqVar).g = max;
            ((g30) jqVar).getClass();
            invalidate();
        }
    }

    @Override // defpackage.iq
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((g30) this.n).getClass();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
