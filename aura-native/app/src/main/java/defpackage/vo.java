package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vo extends cx2 implements rv0, b83, g94 {
    public vo() {
        super();
    }

    public long B;
    public sp1 C;
    public long D;
    public r62 E;
    public ya4 F;
    public sp1 G;
    public ya4 H;

    @Override // defpackage.b83
    public final void Q() {
        this.D = 9205357640488583168L;
        this.E = null;
        this.F = null;
        this.G = null;
        jz4.z(this);
    }

    @Override // defpackage.rv0
    public final void S(e72 e72Var) {
        ya4 ya4Var;
        e72 e72Var2;
        nc ncVar;
        e72 e72Var3 = e72Var;
        mz mzVar = e72Var3.n;
        c71 c71Var = c71.d;
        if (this.C != kb4.b) {
            if (qf4.a(mzVar.P(), this.D) && e72Var3.getLayoutDirection() == this.E && h12.c(this.G, this.C)) {
                ya4Var = this.F;
                ya4Var.getClass();
            } else {
                j51.F(this, new fa(2, this, e72Var3));
                ya4Var = this.H;
                this.H = null;
            }
            this.F = ya4Var;
            this.D = mzVar.P();
            this.E = e72Var3.getLayoutDirection();
            this.G = this.C;
            ya4Var.getClass();
            if (!x40.c(this.B, x40.g)) {
                long j = this.B;
                if (ya4Var instanceof nb3) {
                    wv3 wv3Var = ((nb3) ya4Var).f;
                    float f = wv3Var.a;
                    float f2 = wv3Var.b;
                    long floatToRawIntBits = Float.floatToRawIntBits(f);
                    long L = jz4.L(wv3Var);
                    e72Var2 = e72Var;
                    e72Var2.H(j, (Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32), L, c71Var, 3);
                } else {
                    e72Var2 = e72Var3;
                    if (ya4Var instanceof ob3) {
                        ob3 ob3Var = (ob3) ya4Var;
                        ncVar = ob3Var.g;
                        if (ncVar == null) {
                            g34 g34Var = ob3Var.f;
                            float f3 = g34Var.b;
                            float f4 = g34Var.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (g34Var.h >> 32));
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                            float f5 = g34Var.c - f4;
                            float f6 = g34Var.d - f3;
                            long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
                            long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                            int i = (int) (floatToRawIntBits2 >> 32);
                            int i2 = (int) (floatToRawIntBits2 & 4294967295L);
                            mzVar.n.c.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (floatToRawIntBits3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (floatToRawIntBits3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (floatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits4 & 4294967295L)), mz.a(mzVar, j, c71Var, 3));
                        }
                    } else {
                        if (!(ya4Var instanceof mb3)) {
                            er1.n();
                            return;
                        }
                        ncVar = ((mb3) ya4Var).f;
                    }
                    e72Var2.c(ncVar, j, c71Var);
                }
                e72Var2.a();
            }
        } else if (!x40.c(this.B, x40.g)) {
            sv0.l(e72Var, this.B, 0L, 126);
            e72Var3 = e72Var;
        }
        e72Var2 = e72Var3;
        e72Var2.a();
    }

    @Override // defpackage.g94
    public final boolean c() {
        return false;
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        o94.b(q94Var, this.C);
    }
}
