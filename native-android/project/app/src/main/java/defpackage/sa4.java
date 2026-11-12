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
public class sa4 extends pp0 {
    @Override // defpackage.pp0, defpackage.kc1
    public final void R() {
        super.R();
        Dialog dialog = this.w0;
        Objects.requireNonNull(dialog);
        f9 f9Var = (f9) dialog;
        f9Var.i(-3).setOnClickListener(new j8(22, this, f9Var));
        f9Var.i(-1).setOnClickListener(new io0(f9Var, 1));
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        View viewInflate = o().inflate(R.layout.dialog_server_unreachable, (ViewGroup) null, false);
        if (viewInflate == null) {
            nz2.n("rootView");
            return null;
        }
        vg2 vg2VarQ = new vg2(e(), 0).q((LinearLayout) viewInflate);
        vg2VarQ.p(R.string.server_unreachable_dialog_title);
        vg2 vg2VarL = vg2VarQ.l(R.string.server_unreachable_dialog_positive_button, null);
        vg2VarL.k(R.string.server_unreachable_dialog_neutral_button, null);
        f9 f9VarCreate = vg2VarL.j(R.string.server_unreachable_dialog_negative_button, new wr(12)).create();
        f9VarCreate.setCanceledOnTouchOutside(false);
        f9VarCreate.setCancelable(false);
        return f9VarCreate;
    }
}
