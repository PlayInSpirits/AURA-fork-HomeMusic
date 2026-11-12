package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.homemusic.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ca0 extends pp0 {
    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Dialog dialog = this.w0;
        Objects.requireNonNull(dialog);
        ((f9) dialog).i(-3).setOnClickListener(new p6(10, this));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        View viewInflate = o().inflate(R.layout.dialog_connection_alert, (ViewGroup) null, false);
        if (viewInflate == null) {
            nz2.n("rootView");
            return null;
        }
        vg2 vg2VarQ = new vg2(e(), 0).q((LinearLayout) viewInflate);
        vg2VarQ.p(R.string.connection_alert_dialog_title);
        vg2 vg2VarJ = vg2VarQ.l(R.string.connection_alert_dialog_positive_button, new wr(1)).j(R.string.connection_alert_dialog_negative_button, new wr(2));
        if (!ud3.R()) {
            vg2VarJ.k(R.string.connection_alert_dialog_neutral_button, new wr(3));
        }
        return vg2VarJ.create();
    }
}
