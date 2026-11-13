package com.google.android.material.theme;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import app.homemusic.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.di2;
import defpackage.ef;
import defpackage.ff;
import defpackage.h12;
import defpackage.hf;
import defpackage.ht3;
import defpackage.mg;
import defpackage.mh;
import defpackage.sh2;
import defpackage.su3;
import defpackage.th;
import defpackage.uc5;
import defpackage.xg2;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends th {
    @Override // defpackage.th
    public final ef a(Context context, AttributeSet attributeSet) {
        return new xg2(context, attributeSet);
    }

    @Override // defpackage.th
    public final ff b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.th
    public final hf c(Context context, AttributeSet attributeSet) {
        return new sh2(context, attributeSet);
    }

    @Override // defpackage.th
    public final mg d(Context context, AttributeSet attributeSet) {
        di2 di2Var = new di2(su3.H(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = di2Var.getContext();
        TypedArray D = uc5.D(context2, attributeSet, ht3.C, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (D.hasValue(0)) {
            di2Var.setButtonTintList(h12.s(context2, D, 0));
        }
        di2Var.s = D.getBoolean(1, false);
        D.recycle();
        return di2Var;
    }

    @Override // defpackage.th
    public final mh e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
