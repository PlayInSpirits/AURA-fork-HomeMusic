package defpackage;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dc2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ec2 n;

    public dc2(ec2 r1) {
        this.n = r1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r1, int r2) {
        ec2 r0 = this.n;
        r0.J0 = r2;
        r0.I0 = -1;
        r1.dismiss();
    }
}
