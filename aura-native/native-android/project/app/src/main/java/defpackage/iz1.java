package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 extends f63 {
    public static final gc p0;
    public final sq4 n0;
    public hz1 o0;

    static {
        gc gcVarB = fh0.b();
        gcVarB.f(x40.d);
        ((Paint) gcVarB.b).setStrokeWidth(1.0f);
        gcVarB.h(1);
        p0 = gcVarB;
    }

    public iz1(c72 c72Var) {
        super(c72Var);
        sq4 sq4Var = new sq4();
        sq4Var.q = 0;
        this.n0 = sq4Var;
        sq4Var.u = this;
        this.o0 = c72Var.u != null ? new hz1(this) : null;
    }

    @Override // defpackage.f63
    public final cx2 A0() {
        return this.n0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.f63
    public final void H0(e63 e63Var, long j, fm1 fm1Var, int i, boolean z) {
        int i2;
        boolean z2;
        Object[] objArr;
        int i3;
        c72 c72Var;
        long jA;
        c72 c72Var2 = this.H;
        boolean z3 = false;
        if (e63Var.m(c72Var2)) {
            if (!a1(j)) {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(s0(j, z0())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
                if (z3) {
                    int i4 = fm1Var.p;
                    f13 f13VarX = c72Var2.x();
                    objArr = f13VarX.n;
                    i3 = f13VarX.p - 1;
                    while (i3 >= 0) {
                        c72Var = (c72) objArr[i3];
                        if (c72Var.H()) {
                            e63Var.i(c72Var, j, fm1Var, i2, z2);
                            jA = fm1Var.a();
                            if (g12.u(jA) >= 0.0f && g12.E(jA) && !g12.D(jA) && !e63Var.k(fm1Var, c72Var)) {
                                break;
                            }
                        }
                        i3--;
                        i2 = i;
                    }
                    fm1Var.p = i4;
                }
            }
            i2 = i;
            z2 = z;
            z3 = true;
            if (z3) {
                int i5 = fm1Var.p;
                f13 f13VarX2 = c72Var2.x();
                objArr = f13VarX2.n;
                i3 = f13VarX2.p - 1;
                while (i3 >= 0) {
                    c72Var = (c72) objArr[i3];
                    if (c72Var.H()) {
                        e63Var.i(c72Var, j, fm1Var, i2, z2);
                        jA = fm1Var.a();
                        if (g12.u(jA) >= 0.0f) {
                            continue;
                        }
                    }
                    i3--;
                    i2 = i;
                }
                fm1Var.p = i5;
            }
        }
        i2 = i;
        z2 = z;
        if (z3) {
            int i6 = fm1Var.p;
            f13 f13VarX3 = c72Var2.x();
            objArr = f13VarX3.n;
            i3 = f13VarX3.p - 1;
            while (i3 >= 0) {
                c72Var = (c72) objArr[i3];
                if (c72Var.H()) {
                    e63Var.i(c72Var, j, fm1Var, i2, z2);
                    jA = fm1Var.a();
                    if (g12.u(jA) >= 0.0f) {
                        continue;
                    }
                }
                i3--;
                i2 = i;
            }
            fm1Var.p = i6;
        }
    }

    @Override // defpackage.jg3
    public final void N(long j, float f, if1 if1Var) {
        S0(j, f, if1Var);
        if (this.A) {
            return;
        }
        this.H.R.p.b0();
    }

    @Override // defpackage.f63
    public final void R0(jz jzVar, sj1 sj1Var) {
        c72 c72Var = this.H;
        ub3 ub3VarL = h12.L(c72Var);
        f13 f13VarX = c72Var.x();
        Object[] objArr = f13VarX.n;
        int i = f13VarX.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if (c72Var2.H()) {
                c72Var2.i(jzVar, sj1Var);
            }
        }
        if (((ra) ub3VarL).getShowLayoutBounds()) {
            long j = this.p;
            jzVar.g(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, p0);
        }
    }

    @Override // defpackage.cf2
    public final int X(pp1 pp1Var) {
        hz1 hz1Var = this.o0;
        if (hz1Var != null) {
            return hz1Var.X(pp1Var);
        }
        ti2 ti2Var = this.H.R.p;
        y62 y62Var = ti2Var.s.d;
        d72 d72Var = ti2Var.H;
        if (y62Var == y62.n) {
            d72Var.d = true;
            if (d72Var.b) {
                ti2Var.F = true;
                ti2Var.G = true;
            }
        } else {
            d72Var.e = true;
        }
        iz1 iz1VarC = ti2Var.c();
        boolean z = iz1VarC.B;
        iz1VarC.B = true;
        ti2Var.y();
        iz1VarC.B = z;
        Integer num = (Integer) d72Var.g.get(pp1Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.pi2
    public final jg3 r(long j) {
        R(j);
        c72 c72Var = this.H;
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            ((c72) objArr[i2]).R.p.y = a72.p;
        }
        V0(c72Var.I.a(this, c72Var.R.p.S(), j));
        M0();
        return this;
    }

    @Override // defpackage.f63
    public final void v0() {
        if (this.o0 == null) {
            this.o0 = new hz1(this);
        }
    }

    @Override // defpackage.f63
    public final ef2 y0() {
        return this.o0;
    }
}
