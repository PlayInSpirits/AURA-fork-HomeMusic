package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jm0 implements y43 {
    public final lm0 n;
    public final r62 o;

    public jm0(lm0 lm0Var, r62 r62Var) {
        this.n = lm0Var;
        this.o = r62Var;
    }

    @Override // defpackage.y43
    public final long R(int i, long j, long j2) {
        if (i != 2 || Float.intBitsToFloat((int) (j2 >> 32)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // defpackage.y43
    public final Object b0(long j, long j2, vd0 vd0Var) {
        return new k45(k45.a(j2, 0.0f, 0.0f, 1));
    }

    @Override // defpackage.y43
    public final long x(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        lm0 lm0Var = this.n;
        if (Math.abs(lm0Var.l()) <= 1.0E-6d) {
            return 0L;
        }
        int i2 = (int) (j >> 32);
        if (Math.abs(Float.intBitsToFloat(i2)) <= 0.0f) {
            return 0L;
        }
        qc3 qc3VarM = lm0Var.m();
        float fL = lm0Var.l() * lm0Var.o();
        float f = ((qc3VarM.b + qc3VarM.c) * (-Math.signum(lm0Var.l()))) + fL;
        if (lm0Var.l() > 0.0f) {
            fL = f;
            f = fL;
        }
        float fL2 = gb.l(Float.intBitsToFloat(i2), fL, f);
        boolean z = this.o == r62.o;
        ml3 ml3Var = lm0Var.k;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(z ? ml3Var.d(fL2) : -ml3Var.d(-fL2))) << 32);
    }
}
