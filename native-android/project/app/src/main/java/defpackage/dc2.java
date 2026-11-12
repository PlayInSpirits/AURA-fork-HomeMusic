package defpackage;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dc2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ec2 n;

    public dc2(ec2 ec2Var) {
        this.n = ec2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ec2 ec2Var = this.n;
        ec2Var.J0 = i;
        ec2Var.I0 = -1;
        dialogInterface.dismiss();
    }
}
