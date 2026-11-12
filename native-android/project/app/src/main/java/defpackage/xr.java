package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xr extends pp0 {
    public xr() {
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r5) {
        int r2 = 0;
        View r6 = o().inflate(R.layout.dialog_battery_optimization, null, false);
        int r0 = R.id.battery_optimization_primary;
        if (((TextView) uo.s(r6, R.id.battery_optimization_primary)) == null) goto L8;
        r0 = R.id.battery_optimization_secondary;
        if (((TextView) uo.s(r6, R.id.battery_optimization_secondary)) == null) goto L8;
        vg2 r1 = new vg2(Z(), 0);
        vg2 r7 = r1.q((LinearLayout) r6);
        r7.p(R.string.activity_battery_optimizations_title);
        vg2 r4 = r7.l(R.string.battery_optimization_positive_button, new vr(r2, this));
        r4.k(R.string.battery_optimization_neutral_button, new wr(0));
        return r4.j(R.string.battery_optimization_negative_button, null).create();
    L8:
        nz2.n("Missing required view with ID: ".concat(r6.getResources().getResourceName(r0)));
        return null;
    }
}
