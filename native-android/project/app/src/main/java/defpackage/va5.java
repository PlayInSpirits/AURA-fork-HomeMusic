package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class va5 extends bb5 {
    public final WindowInsets.Builder e;

    public va5(pb5 r1) {
        super(r1);
        WindowInsets r2 = r1.f();
        if (r2 == null) goto L5;
        WindowInsets.Builder r3 = lm4.j(r2);
    L6:
        this.e = r3;
        return;
    L5:
        r3 = ek2.k();
        goto L6
    }

    @Override // defpackage.bb5
    public pb5 b() {
        a();
        pb5 r0 = pb5.g(lm4.k(this.e), null);
        vz1[] r2 = this.b;
        mb5 r3 = r0.a;
        r3.v(r2);
        r3.u(null);
        r3.z(this.c);
        r3.A(this.d);
        return r0;
    }

    @Override // defpackage.bb5
    public void e(vz1 r1) {
        lm4.C(this.e, r1.d());
    }

    @Override // defpackage.bb5
    public void f(vz1 r1) {
        lm4.A(this.e, r1.d());
    }

    @Override // defpackage.bb5
    public void g(vz1 r1) {
        lm4.B(this.e, r1.d());
    }

    @Override // defpackage.bb5
    public void h(vz1 r1) {
        lm4.w(this.e, r1.d());
    }

    @Override // defpackage.bb5
    public void i(vz1 r1) {
        lm4.D(this.e, r1.d());
    }

    public va5() {
        this.e = ek2.k();
    }
}
