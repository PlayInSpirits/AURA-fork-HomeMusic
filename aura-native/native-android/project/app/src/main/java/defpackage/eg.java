package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class eg extends pp0 {
    @Override // defpackage.pp0
    public Dialog j0(Bundle bundle) {
        return new dg(n(), this.q0);
    }

    @Override // defpackage.pp0
    public final void l0(Dialog dialog, int i) {
        if (!(dialog instanceof dg)) {
            super.l0(dialog, i);
            return;
        }
        dg dgVar = (dg) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dgVar.e().i(1);
    }
}
