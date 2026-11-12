package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fp2 extends pp0 {
    public final boolean B0 = false;
    public dg C0;
    public rq2 D0;

    public fp2() {
        this.r0 = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        if (this.B0) {
            aq2 aq2Var = new aq2(n());
            this.C0 = aq2Var;
            n0();
            aq2Var.j(this.D0);
        } else {
            ep2 ep2Var = new ep2(n());
            this.C0 = ep2Var;
            n0();
            ep2Var.k(this.D0);
        }
        return this.C0;
    }

    public final void n0() {
        if (this.D0 == null) {
            Bundle bundle = this.s;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("selector");
                rq2 rq2Var = null;
                if (bundle2 != null) {
                    rq2Var = new rq2(bundle2, null);
                } else {
                    rq2 rq2Var2 = rq2.c;
                }
                this.D0 = rq2Var;
            }
            if (this.D0 == null) {
                this.D0 = rq2.c;
            }
        }
    }

    @Override // defpackage.kc1, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.R = true;
        dg dgVar = this.C0;
        if (dgVar == null) {
            return;
        }
        if (!this.B0) {
            ep2 ep2Var = (ep2) dgVar;
            ep2Var.getWindow().setLayout(xl.p(ep2Var.getContext()), -2);
        } else {
            aq2 aq2Var = (aq2) dgVar;
            Context context = aq2Var.v;
            aq2Var.getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : xl.p(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        }
    }
}
