package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class be5 extends p80 {
    public final bq k;

    public be5(bq bqVar) {
        this.k = bqVar;
    }

    public abstract void A(cu4 cu4Var);

    public final void B() {
        x(null, this.k);
    }

    public void C() {
        B();
    }

    @Override // defpackage.bq
    public boolean a(gn2 gn2Var) {
        return this.k.a(gn2Var);
    }

    @Override // defpackage.bq
    public no2 b(mt2 mt2Var, n9 n9Var, long j) {
        return this.k.b(mt2Var, n9Var, j);
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
    public final void l(rw4 rw4Var) {
        this.j = rw4Var;
        this.i = f35.p(null);
        C();
    }

    @Override // defpackage.bq
    public void n(no2 no2Var) {
        this.k.n(no2Var);
    }

    @Override // defpackage.bq
    public void s(gn2 gn2Var) {
        this.k.s(gn2Var);
    }

    @Override // defpackage.p80
    public final mt2 t(Object obj, mt2 mt2Var) {
        return z(mt2Var);
    }

    @Override // defpackage.p80
    public final long u(long j, Object obj) {
        return j;
    }

    @Override // defpackage.p80
    public final int v(int i, Object obj) {
        return i;
    }

    @Override // defpackage.p80
    public final void w(Object obj, bq bqVar, cu4 cu4Var) {
        A(cu4Var);
    }

    public mt2 z(mt2 mt2Var) {
        return mt2Var;
    }
}
