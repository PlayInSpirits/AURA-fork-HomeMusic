package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class xr extends pp0 {
    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        int i = 0;
        View inflate = o().inflate(app.homemusic.R.layout.dialog_battery_optimization, (ViewGroup) null, false);
        int i2 = app.homemusic.R.id.battery_optimization_primary;
        if (((TextView) uo.s(inflate, app.homemusic.R.id.battery_optimization_primary)) != null) {
            i2 = app.homemusic.R.id.battery_optimization_secondary;
            if (((TextView) uo.s(inflate, app.homemusic.R.id.battery_optimization_secondary)) != null) {
                vg2 q = new vg2(Z(), 0).q((LinearLayout) inflate);
                q.p(app.homemusic.R.string.activity_battery_optimizations_title);
                vg2 l = q.l(app.homemusic.R.string.battery_optimization_positive_button, new vr(i, this));
                l.k(app.homemusic.R.string.battery_optimization_neutral_button, new wr(0));
                return l.j(app.homemusic.R.string.battery_optimization_negative_button, null).create();
            }
        }
        nz2.n("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
