package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sy {
    public static final double[][] d = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public static final double[][] e = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};
    public final double a;
    public final double b;
    public final double c;

    public sy(double d2, double d3, double d4) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }

    public static sy a(int i) {
        h85 h85Var = h85.k;
        double dE = h12.E((16711680 & i) >> 16);
        double dE2 = h12.E((65280 & i) >> 8);
        double dE3 = h12.E(i & 255);
        return b((0.18051042d * dE3) + (0.35762064d * dE2) + (0.41233895d * dE), (0.0722d * dE3) + (0.7152d * dE2) + (0.2126d * dE), (dE3 * 0.95034478d) + (dE2 * 0.11916382d) + (dE * 0.01932141d), h85Var);
    }

    public static sy b(double d2, double d3, double d4, h85 h85Var) {
        double[][] dArr = d;
        double[] dArr2 = dArr[0];
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        double d7 = (dArr4[2] * d4) + (dArr4[1] * d3) + (dArr4[0] * d2);
        double[] dArr5 = h85Var.g;
        double d8 = h85Var.i;
        double d9 = h85Var.d;
        double d10 = h85Var.a;
        double d11 = dArr5[0] * d5;
        double d12 = dArr5[1] * d6;
        double d13 = dArr5[2] * d7;
        double d14 = h85Var.h;
        double dPow = Math.pow((Math.abs(d11) * d14) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d12) * d14) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d13) * d14) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d11) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d12) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d13) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d15 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double d16 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d17 = dSignum2 * 20.0d;
        double d18 = ((21.0d * dSignum3) + ((dSignum * 20.0d) + d17)) / 20.0d;
        double d19 = (((dSignum * 40.0d) + d17) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d16, d15));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d20 = degrees;
        double radians = Math.toRadians(d20);
        double dPow4 = Math.pow((d19 * h85Var.b) / d10, h85Var.j * d9) * 100.0d;
        double d21 = dPow4 / 100.0d;
        Math.sqrt(d21);
        double d22 = d10 + 4.0d;
        double dPow5 = Math.pow((Math.hypot(d15, d16) * (((((Math.cos(Math.toRadians(d20 < 20.14d ? d20 + 360.0d : d20) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * h85Var.e) * h85Var.c)) / (d18 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, h85Var.f), 0.73d);
        double dSqrt = Math.sqrt(d21) * dPow5;
        Math.sqrt((dPow5 * d9) / d22);
        Math.log1p(d8 * dSqrt * 0.0228d);
        Math.cos(radians);
        Math.sin(radians);
        return new sy(d20, dSqrt, dPow4);
    }
}
