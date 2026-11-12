package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gb5 extends eb5 {
    public vz1 s;
    public vz1 t;
    public vz1 u;

    public gb5(pb5 r1, WindowInsets r2) {
        super(r1, r2);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.mb5
    public vz1 j() {
        if (this.t != null) goto L6;
        this.t = vz1.c(lm4.x(this.c));
    L6:
        return this.t;
    }

    @Override // defpackage.mb5
    public vz1 l() {
        if (this.s != null) goto L6;
        this.s = vz1.c(fb5.b(this.c));
    L6:
        return this.s;
    }

    @Override // defpackage.mb5
    public vz1 n() {
        if (this.u != null) goto L6;
        this.u = vz1.c(lm4.b(this.c));
    L6:
        return this.u;
    }

    @Override // defpackage.cb5, defpackage.mb5
    public pb5 q(int r1, int r2, int r3, int r4) {
        return pb5.g(lm4.l(this.c, r1, r2, r3, r4), null);
    }

    @Override // defpackage.db5, defpackage.mb5
    public void x(vz1 r1) {
    }
}
