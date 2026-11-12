package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ff2 implements q62 {
    public final ef2 n;

    public ff2(ef2 ef2Var) {
        this.n = ef2Var;
    }

    @Override // defpackage.q62
    public final long A(q62 q62Var, long j) {
        boolean z = q62Var instanceof ff2;
        ef2 ef2Var = this.n;
        if (!z) {
            ef2 ef2VarA = au0.A(ef2Var);
            f63 f63Var = ef2VarA.H;
            long jA = A(ef2VarA.K, j);
            long j2 = ef2VarA.I;
            long jD = g83.d(jA, (4294967295L & ((long) Float.floatToRawIntBits((int) (j2 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!f63Var.A0().A) {
                cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            f63Var.L0();
            f63 f63Var2 = f63Var.J;
            if (f63Var2 != null) {
                f63Var = f63Var2;
            }
            return g83.e(jD, f63Var.A(q62Var, 0L));
        }
        ef2 ef2Var2 = ((ff2) q62Var).n;
        f63 f63Var3 = ef2Var2.H;
        f63Var3.L0();
        ef2 ef2VarY0 = ef2Var.H.w0(f63Var3).y0();
        if (ef2VarY0 != null) {
            long jB = g02.b(g02.c(ef2Var2.s0(ef2VarY0, false), ji2.K(j)), ef2Var.s0(ef2VarY0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        ef2 ef2VarA2 = au0.A(ef2Var2);
        long jC = g02.c(g02.c(ef2Var2.s0(ef2VarA2, false), ef2VarA2.I), ji2.K(j));
        ef2 ef2VarA3 = au0.A(ef2Var);
        long jB2 = g02.b(jC, g02.c(ef2Var.s0(ef2VarA3, false), ef2VarA3.I));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        f63 f63Var4 = ef2VarA3.H.J;
        f63Var4.getClass();
        f63 f63Var5 = ef2VarA2.H.J;
        f63Var5.getClass();
        return f63Var4.A(f63Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // defpackage.q62
    public final wv3 C(q62 q62Var, boolean z) {
        return this.n.H.C(q62Var, z);
    }

    public final long a() {
        ef2 ef2Var = this.n;
        ef2 ef2VarA = au0.A(ef2Var);
        return g83.d(A(ef2VarA.K, 0L), ef2Var.H.A(ef2VarA.H, 0L));
    }

    @Override // defpackage.q62
    public final long b(long j) {
        return this.n.H.b(g83.e(j, a()));
    }

    @Override // defpackage.q62
    public final boolean f() {
        return this.n.H.A0().A;
    }

    @Override // defpackage.q62
    public final long k() {
        ef2 ef2Var = this.n;
        return (((long) ef2Var.n) << 32) | (((long) ef2Var.o) & 4294967295L);
    }

    @Override // defpackage.q62
    public final long q(long j) {
        return this.n.H.q(g83.e(0L, a()));
    }

    @Override // defpackage.q62
    public final q62 u() {
        ef2 ef2VarY0;
        if (!f()) {
            cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f63 f63Var = ((f63) this.n.H.H.Q.e).J;
        if (f63Var == null || (ef2VarY0 = f63Var.y0()) == null) {
            return null;
        }
        return ef2VarY0.K;
    }

    @Override // defpackage.q62
    public final long z(q62 q62Var, long j) {
        return A(q62Var, j);
    }
}
