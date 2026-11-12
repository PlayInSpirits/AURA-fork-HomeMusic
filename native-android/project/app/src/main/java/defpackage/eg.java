package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class eg extends pp0 {
    public eg() {
    }

    @Override // defpackage.pp0
    public Dialog j0(Bundle r2) {
        return new dg(n(), this.q0);
    }

    @Override // defpackage.pp0
    public final void l0(Dialog r3, int r4) {
        if ((r3 instanceof dg) == false) goto L14;
        dg r2 = (dg) r3;
        if (r4 != 1) goto L7;
    L12:
        r2.e().i(1);
        return;
    L7:
        if (r4 == 2) goto L12;
        if (r4 == 3) goto L11;
        return;
    L11:
        r3.getWindow().addFlags(24);
        goto L12
    L14:
        super.l0(r3, r4);
    }
}
