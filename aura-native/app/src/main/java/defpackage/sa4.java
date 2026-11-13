package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.homemusic.R;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        View inflate = o().inflate(app.homemusic.R.layout.dialog_server_unreachable, (ViewGroup) null, false);
        if (inflate == null) {
            nz2.n("rootView");
            return null;
        }
        vg2 q = new vg2(e(), 0).q((LinearLayout) inflate);
        q.p(app.homemusic.R.string.server_unreachable_dialog_title);
        vg2 l = q.l(app.homemusic.R.string.server_unreachable_dialog_positive_button, null);
        l.k(app.homemusic.R.string.server_unreachable_dialog_neutral_button, null);
        f9 create = l.j(app.homemusic.R.string.server_unreachable_dialog_negative_button, new wr(12)).create();
        create.setCanceledOnTouchOutside(false);
        create.setCancelable(false);
        return create;
    }
}
