package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h85 {
    public static final h85 k = a(50.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;

    public h85(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f = d;
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.g = dArr;
        this.h = d7;
        this.i = d8;
        this.j = d9;
    }

    public static h85 a(double d) {
        double[] dArr = h12.b;
        double R = (h12.R(50.0d) * 63.66197723675813d) / 100.0d;
        double max = Math.max(0.1d, d);
        double d2 = dArr[0];
        double[][] dArr2 = sy.d;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double exp = (1.0d - (Math.exp(((-R) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (exp < 0.0d) {
            exp = 0.0d;
        } else if (exp > 1.0d) {
            exp = 1.0d;
        }
        double[] dArr6 = {(((100.0d / d7) * exp) + 1.0d) - exp, (((100.0d / d8) * exp) + 1.0d) - exp, (((100.0d / d9) * exp) + 1.0d) - exp};
        double d10 = 5.0d * R;
        double d11 = 1.0d / (d10 + 1.0d);
        double d12 = d11 * d11 * d11 * d11;
        double d13 = 1.0d - d12;
        double cbrt = (Math.cbrt(d10) * 0.1d * d13 * d13) + (d12 * R);
        double R2 = h12.R(max) / dArr[1];
        double sqrt = Math.sqrt(R2) + 1.48d;
        double pow = 0.725d / Math.pow(R2, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * cbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[1] * cbrt) * d8) / 100.0d, 0.42d), Math.pow(((dArr6[2] * cbrt) * d9) / 100.0d, 0.42d)};
        double d14 = dArr7[0];
        double d15 = (d14 * 400.0d) / (d14 + 27.13d);
        double d16 = dArr7[1];
        double d17 = (d16 * 400.0d) / (d16 + 27.13d);
        double d18 = dArr7[2];
        double[] dArr8 = {d15, d17, (400.0d * d18) / (d18 + 27.13d)};
        return new h85(R2, ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * pow, pow, pow, 0.69d, 1.0d, dArr6, cbrt, Math.pow(cbrt, 0.25d), sqrt);
    }
}
