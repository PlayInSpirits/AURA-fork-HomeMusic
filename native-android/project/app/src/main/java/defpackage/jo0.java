package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class jo0 extends pp0 {
    @Override // defpackage.kc1
    public final void P() {
        this.R = true;
        f9 f9Var = (f9) this.w0;
        if (f9Var != null) {
            f9Var.i(-1).setOnClickListener(new j8(8, this, f9Var));
            f9Var.i(-2).setOnClickListener(new io0(f9Var, 0));
        }
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        View viewInflate = o().inflate(R.layout.dialog_delete_download_storage, (ViewGroup) null, false);
        if (viewInflate == null) {
            nz2.n("rootView");
            return null;
        }
        vg2 vg2VarQ = new vg2(Z(), 0).q((LinearLayout) viewInflate);
        vg2VarQ.p(R.string.delete_download_storage_dialog_title);
        return vg2VarQ.l(R.string.delete_download_storage_dialog_positive_button, null).j(R.string.delete_download_storage_dialog_negative_button, null).create();
    }
}
