package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class os3 implements cd2 {
    public final wl0 a;

    public os3(wl0 wl0Var) {
        this.a = wl0Var;
    }

    @Override // defpackage.cd2
    public final boolean a(ik3 ik3Var, cu4 cu4Var, mt2 mt2Var, long j) {
        cu4Var.getClass();
        mt2Var.getClass();
        return this.a.a(ik3Var, cu4Var, mt2Var, j);
    }

    @Override // defpackage.cd2
    public final void b(ik3 ik3Var) {
        this.a.b(ik3Var);
    }

    @Override // defpackage.cd2
    public final void c(ik3 ik3Var) {
        this.a.m(ik3Var);
    }

    @Override // defpackage.cd2
    public final boolean d(ik3 ik3Var) {
        return false;
    }

    @Override // defpackage.cd2
    public final void e(ik3 ik3Var) {
        this.a.e(ik3Var);
    }

    @Override // defpackage.cd2
    public final void f(bd2 bd2Var, tv4 tv4Var, t41[] t41VarArr) {
        tv4Var.getClass();
        t41VarArr.getClass();
        this.a.f(bd2Var, tv4Var, t41VarArr);
    }

    @Override // defpackage.cd2
    public final r20 g(ik3 ik3Var) {
        return new r20(this.a, ik3Var);
    }

    @Override // defpackage.cd2
    public final boolean h(bd2 bd2Var) {
        long j = bd2Var.d;
        long j2 = bd2Var.e;
        boolean zA = jp1.a();
        if (j < -20000000) {
            return false;
        }
        return (!zA || j >= 30000000 || j2 < 40000000) && this.a.h(bd2Var);
    }

    @Override // defpackage.cd2
    public final long i(ik3 ik3Var) {
        return this.a.n;
    }

    @Override // defpackage.cd2
    public final boolean j(bd2 bd2Var) {
        return this.a.j(bd2Var);
    }
}
