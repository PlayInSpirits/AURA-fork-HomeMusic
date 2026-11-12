package com.eddyizm.tempus.homemusic;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import defpackage.rp3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class HubLeavePreference extends Preference {
    public HubLeavePreference(Context r1, AttributeSet r2) {
        r1.getClass();
        super(r1, r2);
    }

    @Override // androidx.preference.Preference
    public final void l(rp3 r2) {
        super.l(r2);
        View r3 = r2.s(R.id.title);
        if ((r3 instanceof TextView) == false) goto L5;
        TextView r4 = (TextView) r3;
    L6:
        if (r4 == null) goto L9;
        r4.setTextColor(this.n.getColor(app.homemusic.R.color.homemusic_danger));
        return;
    L9:
        return;
    L5:
        r4 = null;
        goto L6
    }
}
