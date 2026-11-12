package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.homemusic.R;
import defpackage.cb2;
import defpackage.gp0;
import defpackage.ht3;
import defpackage.iq;
import defpackage.j65;
import defpackage.jq;
import defpackage.kf2;
import defpackage.sx1;
import defpackage.ta2;
import defpackage.uc5;
import defpackage.va2;
import defpackage.xa2;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicator extends iq {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        Context context2 = getContext();
        cb2 cb2Var = (cb2) this.n;
        setIndeterminateDrawable(new sx1(context2, cb2Var, new ta2(cb2Var), cb2Var.g == 0 ? new va2(cb2Var) : new xa2(context2, cb2Var)));
        setProgressDrawable(new gp0(getContext(), cb2Var, new ta2(cb2Var)));
    }

    @Override // defpackage.iq
    public final jq a(Context context, AttributeSet attributeSet) {
        cb2 cb2Var = new cb2(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        uc5.c(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = ht3.s;
        uc5.g(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        cb2Var.g = typedArrayObtainStyledAttributes.getInt(0, 1);
        cb2Var.h = typedArrayObtainStyledAttributes.getInt(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        cb2Var.a();
        cb2Var.i = cb2Var.h == 1;
        return cb2Var;
    }

    @Override // defpackage.iq
    public final void b(int i, boolean z) {
        jq jqVar = this.n;
        if (jqVar != null && ((cb2) jqVar).g == 0 && isIndeterminate()) {
            return;
        }
        super.b(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((cb2) this.n).g;
    }

    public int getIndicatorDirection() {
        return ((cb2) this.n).h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jq jqVar = this.n;
        cb2 cb2Var = (cb2) jqVar;
        boolean z2 = true;
        if (((cb2) jqVar).h != 1) {
            WeakHashMap weakHashMap = j65.a;
            if ((getLayoutDirection() != 1 || ((cb2) jqVar).h != 2) && (getLayoutDirection() != 0 || ((cb2) jqVar).h != 3)) {
                z2 = false;
            }
        }
        cb2Var.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        sx1 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        gp0 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        jq jqVar = this.n;
        if (((cb2) jqVar).g == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            kf2.o("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((cb2) jqVar).g = i;
        ((cb2) jqVar).a();
        if (i == 0) {
            sx1 indeterminateDrawable = getIndeterminateDrawable();
            va2 va2Var = new va2((cb2) jqVar);
            indeterminateDrawable.z = va2Var;
            va2Var.a = indeterminateDrawable;
        } else {
            sx1 indeterminateDrawable2 = getIndeterminateDrawable();
            xa2 xa2Var = new xa2(getContext(), (cb2) jqVar);
            indeterminateDrawable2.z = xa2Var;
            xa2Var.a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // defpackage.iq
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((cb2) this.n).a();
    }

    public void setIndicatorDirection(int i) {
        jq jqVar = this.n;
        ((cb2) jqVar).h = i;
        cb2 cb2Var = (cb2) jqVar;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = j65.a;
            if ((getLayoutDirection() != 1 || ((cb2) jqVar).h != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        cb2Var.i = z;
        invalidate();
    }

    @Override // defpackage.iq
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((cb2) this.n).a();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
