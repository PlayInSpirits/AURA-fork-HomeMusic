package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wt4 implements no2, mo2 {
    public final no2 n;
    public final long o;
    public mo2 p;

    public wt4(no2 no2Var, long j) {
        this.n = no2Var;
        this.o = j;
    }

    @Override // defpackage.mo2
    public final void b(no2 no2Var) {
        mo2 mo2Var = this.p;
        mo2Var.getClass();
        mo2Var.b(this);
    }

    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        q44[] q44VarArr2 = new q44[q44VarArr.length];
        int i = 0;
        while (true) {
            q44 q44Var = null;
            if (i >= q44VarArr.length) {
                break;
            }
            vt4 vt4Var = (vt4) q44VarArr[i];
            if (vt4Var != null) {
                q44Var = vt4Var.n;
            }
            q44VarArr2[i] = q44Var;
            i++;
        }
        no2 no2Var = this.n;
        long j2 = this.o;
        long jC = no2Var.c(t41VarArr, zArr, q44VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < q44VarArr.length; i2++) {
            q44 q44Var2 = q44VarArr2[i2];
            if (q44Var2 == null) {
                q44VarArr[i2] = null;
            } else {
                q44 q44Var3 = q44VarArr[i2];
                if (q44Var3 == null || ((vt4) q44Var3).n != q44Var2) {
                    q44VarArr[i2] = new vt4(q44Var2, j2);
                }
            }
        }
        return jC + j2;
    }

    @Override // defpackage.da4
    public final long d() {
        long jD = this.n.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.o;
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        long j2 = this.o;
        return this.n.e(j - j2, n84Var) + j2;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.n.f();
    }

    @Override // defpackage.no2
    public final void h() {
        this.n.h();
    }

    @Override // defpackage.no2
    public final long i(long j) {
        long j2 = this.o;
        return this.n.i(j - j2) + j2;
    }

    @Override // defpackage.ca4
    public final void j(da4 da4Var) {
        mo2 mo2Var = this.p;
        mo2Var.getClass();
        mo2Var.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) {
        this.n.k(z, j - this.o);
    }

    @Override // defpackage.no2
    public final long l() {
        long jL = this.n.l();
        if (jL == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jL + this.o;
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        this.p = mo2Var;
        this.n.m(this, j - this.o);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        return this.n.n();
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        od2 od2Var = new od2();
        long j = pd2Var.a;
        od2Var.b = pd2Var.b;
        od2Var.c = pd2Var.c;
        od2Var.a = j - this.o;
        return this.n.o(new pd2(od2Var));
    }

    @Override // defpackage.da4
    public final long q() {
        long jQ = this.n.q();
        if (jQ == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jQ + this.o;
    }

    @Override // defpackage.da4
    public final void u(long j) {
        this.n.u(j - this.o);
    }
}
