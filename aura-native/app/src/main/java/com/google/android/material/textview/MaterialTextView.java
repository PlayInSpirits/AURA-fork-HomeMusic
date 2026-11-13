package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.homemusic.R;
import defpackage.h12;
import defpackage.ht3;
import defpackage.mh;
import defpackage.su3;
import defpackage.zz1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class MaterialTextView extends mh {
    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(su3.H(context, attributeSet, i, 0), attributeSet, i);
        g(attributeSet, i, 0);
    }

    public final void g(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (zz1.E(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = ht3.G;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int[] iArr2 = {1, 2};
            int i3 = -1;
            for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                i3 = h12.u(context, obtainStyledAttributes, iArr2[i4], -1);
            }
            obtainStyledAttributes.recycle();
            if (i3 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, ht3.F);
                Context context2 = getContext();
                int[] iArr3 = {1, 2};
                int i5 = -1;
                for (int i6 = 0; i6 < 2 && i5 < 0; i6++) {
                    i5 = h12.u(context2, obtainStyledAttributes3, iArr3[i6], -1);
                }
                obtainStyledAttributes3.recycle();
                if (i5 >= 0) {
                    setLineHeight(i5);
                }
            }
        }
    }

    @Override // defpackage.mh, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (zz1.E(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, ht3.F);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = h12.u(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(su3.H(context, attributeSet, i, i2), attributeSet, i);
        g(attributeSet, i, i2);
    }
}
