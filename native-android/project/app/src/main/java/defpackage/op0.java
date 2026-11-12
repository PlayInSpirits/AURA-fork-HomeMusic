package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 extends fu {
    public final /* synthetic */ fc1 A;
    public final /* synthetic */ pp0 B;

    public op0(pp0 pp0Var, fc1 fc1Var) {
        this.B = pp0Var;
        this.A = fc1Var;
    }

    @Override // defpackage.fu
    public final View H(int i) {
        fc1 fc1Var = this.A;
        if (fc1Var.I()) {
            return fc1Var.H(i);
        }
        Dialog dialog = this.B.w0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.fu
    public final boolean I() {
        return this.A.I() || this.B.A0;
    }
}
