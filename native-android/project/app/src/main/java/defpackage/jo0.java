package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jo0 extends pp0 {
    public jo0() {
    }

    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        f9 r0 = (f9) this.w0;
        if (r0 == null) goto L6;
        r0.i(-1).setOnClickListener(new j8(8, this, r0));
        r0.i(-2).setOnClickListener(new io0(r0, 0));
        return;
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r4) {
        View r5 = o().inflate(R.layout.dialog_delete_download_storage, null, false);
        if (r5 == null) goto L6;
        vg2 r0 = new vg2(Z(), 0);
        vg2 r3 = r0.q((LinearLayout) r5);
        r3.p(R.string.delete_download_storage_dialog_title);
        return r3.l(R.string.delete_download_storage_dialog_positive_button, null).j(R.string.delete_download_storage_dialog_negative_button, null).create();
    L6:
        nz2.n("rootView");
        return null;
    }
}
