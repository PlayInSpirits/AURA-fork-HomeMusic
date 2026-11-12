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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int[] iArr2 = {1, 2};
            int iU = -1;
            for (int i3 = 0; i3 < 2 && iU < 0; i3++) {
                iU = h12.u(context, typedArrayObtainStyledAttributes, iArr2[i3], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iU != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, ht3.F);
                Context context2 = getContext();
                int[] iArr3 = {1, 2};
                int iU2 = -1;
                for (int i4 = 0; i4 < 2 && iU2 < 0; i4++) {
                    iU2 = h12.u(context2, typedArrayObtainStyledAttributes3, iArr3[i4], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iU2 >= 0) {
                    setLineHeight(iU2);
                }
            }
        }
    }

    @Override // defpackage.mh, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (zz1.E(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, ht3.F);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int iU = -1;
            for (int i2 = 0; i2 < 2 && iU < 0; i2++) {
                iU = h12.u(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iU >= 0) {
                setLineHeight(iU);
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
