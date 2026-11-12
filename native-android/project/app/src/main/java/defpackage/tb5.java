package defpackage;

import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tb5 extends sb5 {
    @Override // defpackage.sb5, defpackage.su3
    public final void C(boolean r1) {
        WindowInsetsController r0 = this.g;
        if (r1 == false) goto L5;
        int r2 = 16;
    L6:
        hb5.s(r0, r2);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.sb5, defpackage.su3
    public final void D(boolean r1) {
        WindowInsetsController r0 = this.g;
        if (r1 == false) goto L5;
        int r2 = 8;
    L6:
        hb5.u(r0, r2);
        return;
    L5:
        r2 = 0;
        goto L6
    }

    @Override // defpackage.sb5, defpackage.su3
    public final void E(int r1) {
        hb5.i(this.g, r1);
    }

    @Override // defpackage.sb5, defpackage.su3
    public final boolean y() {
        if ((hb5.b(this.g) & 8) == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
