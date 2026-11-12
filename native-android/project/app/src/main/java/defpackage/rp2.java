package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class rp2 extends pp0 {
    public final boolean B0 = false;
    public dg C0;
    public rq2 D0;

    public rp2() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        super.S();
        dg dgVar = this.C0;
        if (dgVar == null || this.B0) {
            return;
        }
        ((qp2) dgVar).m(false);
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        if (this.B0) {
            lq2 lq2Var = new lq2(n());
            this.C0 = lq2Var;
            lq2Var.l(this.D0);
        } else {
            this.C0 = new qp2(n());
        }
        return this.C0;
    }

    @Override // defpackage.kc1, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.R = true;
        dg dgVar = this.C0;
        if (dgVar != null) {
            if (this.B0) {
                ((lq2) dgVar).m();
            } else {
                ((qp2) dgVar).v();
            }
        }
    }
}
