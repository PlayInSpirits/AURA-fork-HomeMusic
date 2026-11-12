package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import app.homemusic.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ca0 extends pp0 {
    public ca0() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Dialog r0 = this.w0;
        Objects.requireNonNull(r0);
        ((f9) r0).i(-3).setOnClickListener(new p6(10, this));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r4) {
        View r5 = o().inflate(R.layout.dialog_connection_alert, null, false);
        if (r5 == null) goto L9;
        vg2 r0 = new vg2(l(), 0);
        vg2 r3 = r0.q((LinearLayout) r5);
        r3.p(R.string.connection_alert_dialog_title);
        vg2 r6 = r3.l(R.string.connection_alert_dialog_positive_button, new wr(1)).j(R.string.connection_alert_dialog_negative_button, new wr(2));
        if (ud3.R() == true) goto L8;
        r6.k(R.string.connection_alert_dialog_neutral_button, new wr(3));
    L8:
        return r6.create();
    L9:
        nz2.n("rootView");
        return null;
    }
}
