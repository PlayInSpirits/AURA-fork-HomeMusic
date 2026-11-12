package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 implements c81 {
    public final float a;
    public final bk4 b;

    public d81(float f, float f2) {
        this.a = f2;
        bk4 bk4Var = new bk4();
        bk4Var.a = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        bk4Var.b = dSqrt;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            qo3.a("Spring stiffness constant must be positive.");
        }
        bk4Var.b = Math.sqrt(f);
        this.b = bk4Var;
    }

    @Override // defpackage.c81
    public final float b(long j, float f, float f2, float f3) {
        bk4 bk4Var = this.b;
        bk4Var.a = f2;
        return Float.intBitsToFloat((int) (bk4Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.c81
    public final long c(float f, float f2, float f3) {
        long j;
        double d = this.b.b;
        float f4 = this.a;
        float f5 = (f - f2) / f4;
        double d2 = (float) (d * d);
        double d3 = f3 / f4;
        double d4 = f5;
        double dSqrt = Math.sqrt(d2) * 2.0d;
        double d5 = (dSqrt * dSqrt) - (d2 * 4.0d);
        double dSqrt2 = d5 < 0.0d ? 0.0d : Math.sqrt(d5);
        if (d5 < 0.0d) {
            Math.sqrt(Math.abs(d5));
        }
        double d6 = ((-dSqrt) + dSqrt2) * 0.5d;
        if (d4 == 0.0d && d3 == 0.0d) {
            j = 0;
        } else {
            if (d4 < 0.0d) {
                d3 = -d3;
            }
            double dAbs = Math.abs(d4);
            double d7 = d6 * dAbs;
            double d8 = d3 - d7;
            double dLog = Math.log(Math.abs(1.0d / dAbs)) / d6;
            double dLog2 = Math.log(Math.abs(1.0d / d8));
            double dLog3 = dLog2;
            for (int i = 0; i < 6; i++) {
                dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d6));
            }
            double d9 = dLog3 / d6;
            if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                dLog = d9;
            } else if ((Double.doubleToRawLongBits(d9) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, d9);
            }
            double d10 = (-(d7 + d8)) / (d6 * d8);
            double d11 = d6 * d10;
            double dExp = (Math.exp(d11) * d8 * d10) + (Math.exp(d11) * dAbs);
            double d12 = -1.0d;
            if (!Double.isNaN(d10) && d10 > 0.0d) {
                if (d10 <= 0.0d || (-dExp) >= 1.0d) {
                    dLog = (-(2.0d / d6)) - (dAbs / d8);
                    d12 = 1.0d;
                } else if (d8 < 0.0d && dAbs > 0.0d) {
                    dLog = 0.0d;
                }
            }
            double dAbs2 = Double.MAX_VALUE;
            int i2 = 0;
            while (dAbs2 > 0.001d && i2 < 100) {
                i2++;
                double d13 = d6 * dLog;
                double dExp2 = dLog - (((Math.exp(d13) * ((d8 * dLog) + dAbs)) + d12) / (Math.exp(d13) * (((d13 + 1.0d) * d8) + d7)));
                dAbs2 = Math.abs(dLog - dExp2);
                dLog = dExp2;
            }
            j = (long) (dLog * 1000.0d);
        }
        return j * 1000000;
    }

    @Override // defpackage.c81
    public final float d(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.c81
    public final float e(long j, float f, float f2, float f3) {
        bk4 bk4Var = this.b;
        bk4Var.a = f2;
        return Float.intBitsToFloat((int) (bk4Var.a(f, f3, j / 1000000) >> 32));
    }

    public /* synthetic */ d81(float f) {
        this(f, 0.01f);
    }
}
