package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class gb5 extends eb5 {
    public vz1 s;
    public vz1 t;
    public vz1 u;

    public gb5(pb5 pb5Var, WindowInsets windowInsets) {
        super(pb5Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.mb5
    public vz1 j() {
        if (this.t == null) {
            this.t = vz1.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.t;
    }

    @Override // defpackage.mb5
    public vz1 l() {
        if (this.s == null) {
            this.s = vz1.c(this.c.getSystemGestureInsets());
        }
        return this.s;
    }

    @Override // defpackage.mb5
    public vz1 n() {
        if (this.u == null) {
            this.u = vz1.c(this.c.getTappableElementInsets());
        }
        return this.u;
    }

    @Override // defpackage.cb5, defpackage.mb5
    public pb5 q(int i, int i2, int i3, int i4) {
        return pb5.g(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.db5, defpackage.mb5
    public void x(vz1 vz1Var) {
    }
}
