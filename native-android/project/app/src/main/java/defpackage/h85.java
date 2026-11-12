package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h85 {
    public static final h85 k = null;
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

    static {
        k = a(50.0d);
    }

    public h85(double r1, double r3, double r5, double r7, double r9, double r11, double[] r13, double r14, double r16, double r18) {
        this.f = r1;
        this.a = r3;
        this.b = r5;
        this.c = r7;
        this.d = r9;
        this.e = r11;
        this.g = r13;
        this.h = r14;
        this.i = r16;
        this.j = r18;
    }

    public static h85 a(double r45) {
        double[] r0 = h12.b;
        double r1 = (h12.R(50.0d) * 63.66197723675813d) / 100.0d;
        double r7 = Math.max(0.1d, r45);
        double r10 = r0[0];
        double[][] r12 = sy.d;
        double[] r13 = r12[0];
        double r14 = r13[0] * r10;
        double r17 = r0[1];
        double r19 = (r13[1] * r17) + r14;
        double r21 = r0[2];
        double r23 = (r13[2] * r21) + r19;
        double[] r15 = r12[1];
        double r110 = (r15[2] * r21) + ((r15[1] * r17) + (r15[0] * r10));
        double[] r16 = r12[2];
        double r22 = (r21 * r16[2]) + ((r17 * r16[1]) + (r10 * r16[0]));
        double r11 = (1.0d - (Math.exp(((-r1) - 42.0d) / 92.0d) * 0.2777777777777778d)) * 1.0d;
        if (r11 >= 0.0d) goto L6;
        r11 = 0.0d;
    L8:
        double[] r18 = {(((100.0d / r23) * r11) + 1.0d) - r11, (((100.0d / r110) * r11) + 1.0d) - r11, (((100.0d / r22) * r11) + 1.0d) - r11};
        double r111 = 5.0d * r1;
        double r25 = 1.0d / (r111 + 1.0d);
        double r27 = ((r25 * r25) * r25) * r25;
        double r112 = 1.0d - r27;
        double r2 = (Math.cbrt(r111) * ((0.1d * r112) * r112)) + (r27 * r1);
        double r5 = h12.R(r7) / r0[1];
        double r43 = Math.sqrt(r5) + 1.48d;
        double r30 = 0.725d / Math.pow(r5, 0.2d);
        double[] r3 = {Math.pow(((r18[0] * r2) * r23) / 100.0d, 0.42d), Math.pow(((r18[1] * r2) * r110) / 100.0d, 0.42d), Math.pow(((r18[2] * r2) * r22) / 100.0d, 0.42d)};
        double r4 = r3[0];
        double r113 = (r4 * 400.0d) / (r4 + 27.13d);
        double r6 = r3[1];
        double r114 = (r6 * 400.0d) / (r6 + 27.13d);
        double r8 = r3[2];
        double[] r9 = {r113, r114, (400.0d * r8) / (r8 + 27.13d)};
        return new h85(r5, ((r9[2] * 0.05d) + ((r9[0] * 2.0d) + r9[1])) * r30, r30, r30, 0.69d, 1.0d, r18, r2, Math.pow(r2, 0.25d), r43);
    L6:
        if (r11 <= 1.0d) goto L8;
        r11 = 1.0d;
        goto L8
    }
}
