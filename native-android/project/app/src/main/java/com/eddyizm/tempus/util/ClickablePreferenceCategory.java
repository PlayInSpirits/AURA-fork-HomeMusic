package com.eddyizm.tempus.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.PreferenceCategory;
import defpackage.p6;
import defpackage.rp3;
import defpackage.ss1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ClickablePreferenceCategory extends PreferenceCategory {
    public ss1 j0;

    public ClickablePreferenceCategory(Context r1, AttributeSet r2) {
        super(r1, r2);
        if (this.D == true) goto L6;
        this.D = true;
        h();
        return;
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void l(rp3 r3) {
        super.l(r3);
        View r4 = r3.a;
        r4.setClickable(true);
        r4.setOnClickListener(new p6(8, this));
    }
}
