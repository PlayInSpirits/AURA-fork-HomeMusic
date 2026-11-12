package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zg0 implements wq4 {
    public final int n;
    public final int o;
    public pz3 p;

    public zg0() {
        if (e35.I(Integer.MIN_VALUE, Integer.MIN_VALUE) == false) goto L6;
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        return;
    L6:
        kf2.n("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        throw null;
    }

    @Override // defpackage.wq4
    public final void b(cf4 r1) {
    }

    @Override // defpackage.wq4
    public final void d(cf4 r2) {
        r2.m(this.n, this.o);
    }

    @Override // defpackage.wq4
    public final void e(pz3 r1) {
        this.p = r1;
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.wq4
    public final void i(Drawable r1) {
    }

    @Override // defpackage.z92
    public final void j() {
    }

    @Override // defpackage.wq4
    public final void k(Drawable r1) {
    }

    @Override // defpackage.wq4
    public final pz3 l() {
        return this.p;
    }

    @Override // defpackage.z92
    public final void n() {
    }
}
