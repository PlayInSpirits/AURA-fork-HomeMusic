package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pw4 implements no2, mo2 {
    public no2 n;
    public bq o;
    public final mt2 p;
    public final n9 q;
    public mo2 r;
    public long s;
    public boolean t;
    public Integer u;
    public t41[] v;
    public boolean[] w;
    public ow4[] x;
    public final /* synthetic */ qw4 y;

    public pw4(qw4 qw4Var, no2 no2Var, kr3 kr3Var, mt2 mt2Var, n9 n9Var) {
        kr3Var.getClass();
        n9Var.getClass();
        this.y = qw4Var;
        this.n = no2Var;
        this.o = kr3Var;
        this.p = mt2Var;
        this.q = n9Var;
        this.x = new ow4[0];
    }

    @Override // defpackage.mo2
    public final void b(no2 no2Var) {
        boolean[] zArr;
        int iMin;
        boolean[] zArrCopyOfRange;
        if (!this.t || !no2Var.equals(this.n)) {
            mo2 mo2Var = this.r;
            if (mo2Var != null) {
                mo2Var.b(this);
                return;
            }
            return;
        }
        this.t = false;
        t41[] t41VarArr = this.v;
        if (t41VarArr != null && (zArr = this.w) != null && (iMin = Math.min(t41VarArr.length, this.x.length)) != 0) {
            q44[] q44VarArr = new q44[iMin];
            boolean[] zArr2 = new boolean[iMin];
            j02 j02VarG0 = gb.g0(0, iMin);
            j02VarG0.getClass();
            t41[] t41VarArr2 = (t41[]) (j02VarG0.isEmpty() ? ti.e0(t41VarArr, 0, 0) : ti.e0(t41VarArr, j02VarG0.n, j02VarG0.o + 1));
            j02 j02VarG1 = gb.g0(0, iMin);
            j02VarG1.getClass();
            if (j02VarG1.isEmpty()) {
                zArrCopyOfRange = new boolean[0];
            } else {
                int i = j02VarG1.n;
                int i2 = j02VarG1.o + 1;
                ji2.u(i2, zArr.length);
                zArrCopyOfRange = Arrays.copyOfRange(zArr, i, i2);
                zArrCopyOfRange.getClass();
            }
            this.n.c(t41VarArr2, zArrCopyOfRange, q44VarArr, zArr2, 0L);
            for (int i3 = 0; i3 < iMin; i3++) {
                ow4 ow4Var = this.x[i3];
                if (ow4Var != null) {
                    ow4Var.n = q44VarArr[i3];
                }
            }
        }
        mo2 mo2Var2 = this.r;
        if (mo2Var2 != null) {
            mo2Var2.j(this);
        }
    }

    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        t41VarArr.getClass();
        zArr.getClass();
        q44VarArr.getClass();
        this.v = t41VarArr;
        this.w = zArr;
        q44[] q44VarArr2 = new q44[q44VarArr.length];
        int length = q44VarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            q44 q44Var = null;
            if (i >= length) {
                break;
            }
            q44 q44Var2 = q44VarArr[i];
            int i3 = i2 + 1;
            ow4 ow4Var = q44Var2 instanceof ow4 ? (ow4) q44Var2 : null;
            if (ow4Var != null) {
                q44Var = ow4Var.n;
            }
            q44VarArr2[i2] = q44Var;
            i++;
            i2 = i3;
        }
        long jC = this.n.c(t41VarArr, zArr, q44VarArr2, zArr2, j - this.s);
        ow4[] ow4VarArr = new ow4[q44VarArr.length];
        int length2 = q44VarArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            q44 q44Var3 = q44VarArr2[i4];
            if (q44Var3 == null) {
                q44VarArr[i4] = null;
            } else {
                q44 q44Var4 = q44VarArr[i4];
                ow4 ow4Var2 = q44Var4 instanceof ow4 ? (ow4) q44Var4 : null;
                if (ow4Var2 == null || ow4Var2.n != q44Var3) {
                    ow4 ow4Var3 = new ow4(this, q44Var3);
                    ow4VarArr[i4] = ow4Var3;
                    q44VarArr[i4] = ow4Var3;
                } else {
                    ow4VarArr[i4] = ow4Var2;
                }
            }
        }
        this.x = ow4VarArr;
        return jC + this.s;
    }

    @Override // defpackage.da4
    public final long d() {
        if (!this.t) {
            long jD = this.n.d();
            if (jD == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (jD != -9223372036854775807L) {
                return jD + this.s;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        n84Var.getClass();
        return j;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.t || this.n.f();
    }

    @Override // defpackage.no2
    public final void h() {
        if (this.t) {
            return;
        }
        this.n.h();
    }

    @Override // defpackage.no2
    public final long i(long j) {
        if (j == 0 && this.s == 0) {
            return this.n.i(j);
        }
        if (this.n.e(j, n84.d) != 0) {
            return this.n.i(j);
        }
        qw4 qw4Var = this.y;
        gn2 gn2Var = qw4Var.k;
        this.t = true;
        this.s = j;
        for (ow4 ow4Var : this.x) {
            if (ow4Var != null) {
                ow4Var.n = null;
            }
        }
        this.o.n(this.n);
        Integer num = this.u;
        if (num != null) {
            qw4Var.y(Integer.valueOf(num.intValue()));
        }
        Uri uriJ = e03.j((int) (f35.i0(j) / 1000), gn2Var.a);
        tm2 tm2VarA = gn2Var.a();
        tm2VarA.b = uriJ;
        kr3 kr3VarD = qw4Var.l.d(tm2VarA.a());
        int i = qw4Var.o;
        qw4Var.o = i + 1;
        this.u = Integer.valueOf(i);
        this.o = kr3VarD;
        qw4Var.x(Integer.valueOf(i), kr3VarD);
        no2 no2VarB = kr3VarD.b(this.p, this.q, 0L);
        this.n = no2VarB;
        ((hr3) no2VarB).m(this, 0L);
        return j;
    }

    @Override // defpackage.ca4
    public final void j(da4 da4Var) {
        mo2 mo2Var;
        ((no2) da4Var).getClass();
        if (this.t || (mo2Var = this.r) == null) {
            return;
        }
        mo2Var.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) {
        if (this.t) {
            return;
        }
        this.n.k(z, j - this.s);
    }

    @Override // defpackage.no2
    public final long l() {
        if (!this.t) {
            long jL = this.n.l();
            if (jL != -9223372036854775807L) {
                return jL + this.s;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        this.r = mo2Var;
        this.n.m(this, j);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        tv4 tv4VarN = this.n.n();
        tv4VarN.getClass();
        return tv4VarN;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        if (this.t) {
            return false;
        }
        od2 od2Var = new od2();
        long j = pd2Var.a;
        od2Var.b = pd2Var.b;
        od2Var.c = pd2Var.c;
        od2Var.a = j - this.s;
        return this.n.o(new pd2(od2Var));
    }

    @Override // defpackage.da4
    public final long q() {
        if (this.t) {
            return this.s;
        }
        long jQ = this.n.q();
        if (jQ == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        if (jQ == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jQ + this.s;
    }

    @Override // defpackage.da4
    public final void u(long j) {
        if (this.t) {
            return;
        }
        this.n.u(j - this.s);
    }
}
