package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class og2 implements no2, mo2 {
    public final mt2 n;
    public final long o;
    public final n9 p;
    public bq q;
    public no2 r;
    public mo2 s;
    public long t = -9223372036854775807L;

    public og2(mt2 mt2Var, n9 n9Var, long j) {
        this.n = mt2Var;
        this.p = n9Var;
        this.o = j;
    }

    public final void a(mt2 mt2Var) {
        long j = this.t;
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        bq bqVar = this.q;
        bqVar.getClass();
        no2 no2VarB = bqVar.b(mt2Var, this.p, j);
        this.r = no2VarB;
        if (this.s != null) {
            no2VarB.m(this, j);
        }
    }

    @Override // defpackage.mo2
    public final void b(no2 no2Var) {
        mo2 mo2Var = this.s;
        String str = f35.a;
        mo2Var.b(this);
    }

    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        long j2 = this.t;
        if (j2 != -9223372036854775807L && j == this.o) {
            j = j2;
        }
        this.t = -9223372036854775807L;
        no2 no2Var = this.r;
        String str = f35.a;
        return no2Var.c(t41VarArr, zArr, q44VarArr, zArr2, j);
    }

    @Override // defpackage.da4
    public final long d() {
        no2 no2Var = this.r;
        String str = f35.a;
        return no2Var.d();
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        no2 no2Var = this.r;
        String str = f35.a;
        return no2Var.e(j, n84Var);
    }

    @Override // defpackage.da4
    public final boolean f() {
        no2 no2Var = this.r;
        return no2Var != null && no2Var.f();
    }

    @Override // defpackage.no2
    public final void h() {
        no2 no2Var = this.r;
        if (no2Var != null) {
            no2Var.h();
            return;
        }
        bq bqVar = this.q;
        if (bqVar != null) {
            bqVar.j();
        }
    }

    @Override // defpackage.no2
    public final long i(long j) {
        no2 no2Var = this.r;
        String str = f35.a;
        return no2Var.i(j);
    }

    @Override // defpackage.ca4
    public final void j(da4 da4Var) {
        mo2 mo2Var = this.s;
        String str = f35.a;
        mo2Var.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) {
        no2 no2Var = this.r;
        String str = f35.a;
        no2Var.k(z, j);
    }

    @Override // defpackage.no2
    public final long l() {
        no2 no2Var = this.r;
        String str = f35.a;
        return no2Var.l();
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        this.s = mo2Var;
        no2 no2Var = this.r;
        if (no2Var != null) {
            long j2 = this.t;
            if (j2 == -9223372036854775807L) {
                j2 = this.o;
            }
            no2Var.m(this, j2);
        }
    }

    @Override // defpackage.no2
    public final tv4 n() {
        no2 no2Var = this.r;
        String str = f35.a;
        return no2Var.n();
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        no2 no2Var = this.r;
        return no2Var != null && no2Var.o(pd2Var);
    }

    @Override // defpackage.da4
    public final long q() {
        no2 no2Var = this.r;
        String str = f35.a;
        return no2Var.q();
    }

    @Override // defpackage.da4
    public final void u(long j) {
        no2 no2Var = this.r;
        String str = f35.a;
        no2Var.u(j);
    }
}
