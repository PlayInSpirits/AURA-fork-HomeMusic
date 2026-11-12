package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ge5 implements q84 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public ge5(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // defpackage.q84
    public final long a() {
        return this.f;
    }

    @Override // defpackage.m84
    public final boolean b() {
        return this.g != null;
    }

    @Override // defpackage.q84
    public final long c(long j) {
        long j2 = j - this.a;
        if (!b() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iF = f35.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iF) * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iF == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // defpackage.m84
    public final l84 e(long j) {
        double d;
        double d2;
        boolean zB = b();
        int i = this.b;
        long j2 = this.a;
        if (!zB) {
            o84 o84Var = new o84(0L, j2 + ((long) i));
            return new l84(o84Var, o84Var);
        }
        long jK = f35.k(j, 0L, this.c);
        double d3 = (jK * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.e;
        o84 o84Var2 = new o84(jK, j2 + f35.k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new l84(o84Var2, o84Var2);
    }

    @Override // defpackage.q84
    public final int f() {
        return this.d;
    }

    @Override // defpackage.m84
    public final long g() {
        return this.c;
    }
}
