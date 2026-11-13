package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class mp0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ pp0 n;

    public mp0(pp0 pp0Var) {
        this.n = pp0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        pp0 pp0Var = this.n;
        Dialog dialog = pp0Var.w0;
        if (dialog != null) {
            pp0Var.onDismiss(dialog);
        }
    }
}
