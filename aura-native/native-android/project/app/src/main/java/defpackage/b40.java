package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b40 implements no2, mo2 {
    public final no2 n;
    public mo2 o;
    public a40[] p = new a40[0];
    public long q;
    public long r;
    public long s;
    public long t;
    public ClippingMediaSource$IllegalClippingException u;

    public b40(no2 no2Var, boolean z, long j, long j2) {
        this.n = no2Var;
        this.q = z ? j : -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.s = j;
        this.t = j2;
    }

    public final boolean a() {
        return this.q != -9223372036854775807L;
    }

    @Override // defpackage.mo2
    public final void b(no2 no2Var) {
        if (this.u != null) {
            return;
        }
        mo2 mo2Var = this.o;
        mo2Var.getClass();
        mo2Var.b(this);
    }

    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        long j2;
        this.p = new a40[q44VarArr.length];
        q44[] q44VarArr2 = new q44[q44VarArr.length];
        for (int i = 0; i < q44VarArr.length; i++) {
            a40[] a40VarArr = this.p;
            a40 a40Var = (a40) q44VarArr[i];
            a40VarArr[i] = a40Var;
            q44VarArr2[i] = a40Var != null ? a40Var.n : null;
        }
        long jC = this.n.c(t41VarArr, zArr, q44VarArr2, zArr2, j);
        long j3 = this.t;
        long jMax = Math.max(jC, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (a()) {
            if (jC >= j) {
                if (jC != 0) {
                    int length = t41VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            t41 t41Var = t41VarArr[i2];
                            if (t41Var != null) {
                                tb1 tb1VarM = t41Var.m();
                                if (!lw2.a(tb1VarM.n, tb1VarM.k)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.q = j2;
        for (int i3 = 0; i3 < q44VarArr.length; i3++) {
            q44 q44Var = q44VarArr2[i3];
            a40[] a40VarArr2 = this.p;
            if (q44Var == null) {
                a40VarArr2[i3] = null;
            } else {
                a40 a40Var2 = a40VarArr2[i3];
                if (a40Var2 == null || a40Var2.n != q44Var) {
                    a40VarArr2[i3] = new a40(this, q44Var);
                }
            }
            q44VarArr[i3] = a40VarArr2[i3];
        }
        return jMax;
    }

    @Override // defpackage.da4
    public final long d() {
        long jD = this.n.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.t;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        long j2 = this.s;
        if (j == j2) {
            return j2;
        }
        long jK = f35.k(n84Var.a, 0L, j - j2);
        long j3 = n84Var.b;
        long j4 = this.t;
        long jK2 = f35.k(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jK != n84Var.a || jK2 != n84Var.b) {
            n84Var = new n84(jK, jK2);
        }
        return this.n.e(j, n84Var);
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.n.f();
    }

    @Override // defpackage.no2
    public final void h() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.u;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.n.h();
    }

    @Override // defpackage.no2
    public final long i(long j) {
        this.q = -9223372036854775807L;
        for (a40 a40Var : this.p) {
            if (a40Var != null) {
                a40Var.o = false;
            }
        }
        long jI = this.n.i(j);
        long j2 = this.s;
        long j3 = this.t;
        long jMax = Math.max(jI, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.ca4
    public final void j(da4 da4Var) {
        mo2 mo2Var = this.o;
        mo2Var.getClass();
        mo2Var.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) {
        this.n.k(z, j);
    }

    @Override // defpackage.no2
    public final long l() {
        if (a()) {
            long j = this.q;
            this.q = -9223372036854775807L;
            this.r = j;
            long jL = l();
            return jL != -9223372036854775807L ? jL : j;
        }
        long jL2 = this.n.l();
        if (jL2 != -9223372036854775807L) {
            long j2 = this.s;
            long j3 = this.t;
            long jMax = Math.max(jL2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.r) {
                this.r = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        this.o = mo2Var;
        this.n.m(this, j);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        return this.n.n();
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        return this.n.o(pd2Var);
    }

    @Override // defpackage.da4
    public final long q() {
        long jQ = this.n.q();
        if (jQ != Long.MIN_VALUE) {
            long j = this.t;
            if (j == Long.MIN_VALUE || jQ < j) {
                return jQ;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.da4
    public final void u(long j) {
        this.n.u(j);
    }
}
