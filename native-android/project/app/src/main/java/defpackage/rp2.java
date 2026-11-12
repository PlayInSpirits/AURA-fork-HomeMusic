package defpackage;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class rp2 extends pp0 {
    public final boolean B0;
    public dg C0;
    public rq2 D0;

    public rp2() {
        this.B0 = false;
        this.r0 = true;
        Dialog r1 = this.w0;
        if (r1 == null) goto L6;
        r1.setCancelable(true);
        return;
    }

    @Override // defpackage.pp0, defpackage.kc1
    public final void S() {
        super.S();
        dg r0 = this.C0;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.B0 == true) goto L9;
        ((qp2) r0).m(false);
        return;
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r2) {
        if (this.B0 == false) goto L5;
        lq2 r0 = new lq2(n());
        this.C0 = r0;
        r0.l(this.D0);
    L7:
        return this.C0;
    L5:
        this.C0 = new qp2(n());
        goto L7
    }

    @Override // defpackage.kc1, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
        this.R = true;
        dg r2 = this.C0;
        if (r2 != null) goto L5;
        return;
    L5:
        if (this.B0 == false) goto L8;
        ((lq2) r2).m();
        return;
    L8:
        ((qp2) r2).v();
    }
}
