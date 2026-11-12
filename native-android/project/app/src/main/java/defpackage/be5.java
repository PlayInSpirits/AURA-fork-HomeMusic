package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class be5 extends p80 {
    public final bq k;

    public be5(bq r1) {
        this.k = r1;
    }

    public abstract void A(cu4 r1);

    public final void B() {
        x(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // defpackage.bq
    public boolean a(gn2 r1) {
        return this.k.a(r1);
    }

    @Override // defpackage.bq
    public no2 b(mt2 r1, n9 r2, long r3) {
        return this.k.b(r1, r2, r3);
    }

    @Override // defpackage.bq
    public final cu4 g() {
        return this.k.g();
    }

    @Override // defpackage.bq
    public final gn2 h() {
        return this.k.h();
    }

    @Override // defpackage.bq
    public final boolean i() {
        return this.k.i();
    }

    @Override // defpackage.bq
    public final void l(rw4 r1) {
        this.j = r1;
        this.i = f35.p(null);
        C();
    }

    @Override // defpackage.bq
    public void n(no2 r1) {
        this.k.n(r1);
    }

    @Override // defpackage.bq
    public void s(gn2 r1) {
        this.k.s(r1);
    }

    @Override // defpackage.p80
    public final mt2 t(Object r1, mt2 r2) {
        Void r3 = (Void) r1;
        return z(r2);
    }

    @Override // defpackage.p80
    public final long u(long r1, Object r3) {
        Void r4 = (Void) r3;
        return r1;
    }

    @Override // defpackage.p80
    public final int v(int r1, Object r2) {
        Void r3 = (Void) r2;
        return r1;
    }

    @Override // defpackage.p80
    public final void w(Object r1, bq r2, cu4 r3) {
        Void r4 = (Void) r1;
        A(r3);
    }

    public mt2 z(mt2 r1) {
        return r1;
    }
}
