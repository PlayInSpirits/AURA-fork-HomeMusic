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
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubLeavePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void l(rp3 rp3Var) {
        super.l(rp3Var);
        View viewS = rp3Var.s(R.id.title);
        TextView textView = viewS instanceof TextView ? (TextView) viewS : null;
        if (textView != null) {
            textView.setTextColor(this.n.getColor(app.homemusic.R.color.homemusic_danger));
        }
    }
}
