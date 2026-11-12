package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import app.homemusic.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sa4 extends pp0 {
    public sa4() {
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Dialog r0 = this.w0;
        Objects.requireNonNull(r0);
        f9 r1 = (f9) r0;
        r1.i(-3).setOnClickListener(new j8(22, this, r1));
        r1.i(-1).setOnClickListener(new io0(r1, 1));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r4) {
        View r5 = o().inflate(R.layout.dialog_server_unreachable, null, false);
        if (r5 == null) goto L6;
        vg2 r0 = new vg2(l(), 0);
        vg2 r3 = r0.q((LinearLayout) r5);
        r3.p(R.string.server_unreachable_dialog_title);
        vg2 r6 = r3.l(R.string.server_unreachable_dialog_positive_button, null);
        r6.k(R.string.server_unreachable_dialog_neutral_button, null);
        f9 r7 = r6.j(R.string.server_unreachable_dialog_negative_button, new wr(12)).create();
        r7.setCanceledOnTouchOutside(false);
        r7.setCancelable(false);
        return r7;
    L6:
        nz2.n("rootView");
        return null;
    }
}
