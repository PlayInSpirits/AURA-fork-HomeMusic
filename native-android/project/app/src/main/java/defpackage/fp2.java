package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class fp2 extends pp0 {
    public final boolean B0;
    public dg C0;
    public rq2 D0;

    public fp2() {
        this.B0 = false;
        this.r0 = true;
        Dialog r1 = this.w0;
        if (r1 == null) goto L6;
        r1.setCancelable(true);
        return;
    }

    @Override // defpackage.pp0
    public final Dialog j0(Bundle r2) {
        if (this.B0 == false) goto L5;
        aq2 r0 = new aq2(n());
        this.C0 = r0;
        n0();
        r0.j(this.D0);
    L7:
        return this.C0;
    L5:
        ep2 r1 = new ep2(n());
        this.C0 = r1;
        n0();
        r1.k(this.D0);
        goto L7
    }

    public final void n0() {
        if (this.D0 != null) goto L15;
        Bundle r0 = this.s;
        if (r0 == null) goto L12;
        Bundle r1 = r0.getBundle("selector");
        rq2 r2 = null;
        if (r1 == null) goto L9;
        r2 = new rq2(r1, null);
    L10:
        this.D0 = r2;
        goto L12
    L9:
        rq2 r3 = rq2.c;
    L12:
        if (this.D0 != null) goto L16;
        this.D0 = rq2.c;
        return;
    L16:
        return;
    }

    @Override // defpackage.kc1, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r5) {
        this.R = true;
        dg r6 = this.C0;
        if (r6 != null) goto L5;
        return;
    L5:
        int r0 = -2;
        if (this.B0 == false) goto L16;
        aq2 r7 = (aq2) r6;
        Context r4 = r7.v;
        if (r4.getResources().getBoolean(R.bool.is_tablet) == true) goto L10;
        int r1 = -1;
    L12:
        if (r4.getResources().getBoolean(R.bool.is_tablet) == true) goto L14;
        r0 = -1;
    L14:
        r7.getWindow().setLayout(r1, r0);
        return;
    L10:
        r1 = xl.p(r4);
        goto L12
    L16:
        ep2 r8 = (ep2) r6;
        r8.getWindow().setLayout(xl.p(r8.getContext()), -2);
    }
}
