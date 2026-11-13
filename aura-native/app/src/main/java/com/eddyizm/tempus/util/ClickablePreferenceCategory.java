package com.eddyizm.tempus.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceCategory;
import defpackage.p6;
import defpackage.rp3;
import defpackage.ss1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class ClickablePreferenceCategory extends PreferenceCategory {
    public ss1 j0;

    public ClickablePreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.D) {
            this.D = true;
            h();
        }
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void l(rp3 rp3Var) {
        super.l(rp3Var);
        View view = rp3Var.a;
        view.setClickable(true);
        view.setOnClickListener(new p6(8, this));
    }
}
