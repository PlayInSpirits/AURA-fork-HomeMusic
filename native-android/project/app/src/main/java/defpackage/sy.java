package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sy {
    public static final double[][] d = null;
    public static final double[][] e = null;
    public final double a;
    public final double b;
    public final double c;

    static {
        d = new double[][]{new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
        e = new double[][]{new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};
    }

    public sy(double r1, double r3, double r5) {
        this.a = r1;
        this.b = r3;
        this.c = r5;
    }

    public static sy a(int r13) {
        h85 r6 = h85.k;
        int r0 = (16711680 & r13) >> 16;
        int r1 = (65280 & r13) >> 8;
        double r2 = h12.E(r0);
        double r3 = h12.E(r1);
        double r4 = h12.E(r13 & 255);
        double r9 = 0.35762064d * r3;
        double r10 = r9 + (0.41233895d * r2);
        double r7 = (0.18051042d * r4) + r10;
        double r11 = 0.7152d * r3;
        double r12 = r11 + (0.2126d * r2);
        double r14 = (0.0722d * r4) + r12;
        double r5 = r3 * 0.11916382d;
        double r8 = r4 * 0.95034478d;
        return b(r7, r14, r8 + (r5 + (r2 * 0.01932141d)), r6);
    }

    public static sy b(double r35, double r37, double r39, h85 r41) {
        double[][] r1 = d;
        double[] r3 = r1[0];
        double r4 = r3[0] * r35;
        double r7 = (r3[1] * r37) + r4;
        double r9 = (r3[2] * r39) + r7;
        double[] r5 = r1[1];
        double r8 = r5[0] * r35;
        double r11 = (r5[1] * r37) + r8;
        double r10 = (r5[2] * r39) + r11;
        double[] r2 = r1[2];
        double r12 = r2[0] * r35;
        double r13 = (r2[1] * r37) + r12;
        double r14 = (r2[2] * r39) + r13;
        double[] r6 = r41.g;
        double r15 = r41.i;
        double r16 = r41.d;
        double r17 = r41.a;
        double r18 = r6[0] * r9;
        double r19 = r6[1] * r10;
        double r20 = r6[2] * r14;
        double r110 = r41.h;
        double r21 = Math.pow((Math.abs(r18) * r110) / 100.0d, 0.42d);
        double r22 = Math.pow((Math.abs(r19) * r110) / 100.0d, 0.42d);
        double r23 = Math.pow((Math.abs(r20) * r110) / 100.0d, 0.42d);
        double r111 = ((Math.signum(r18) * 400.0d) * r21) / (r21 + 27.13d);
        double r24 = ((Math.signum(r19) * 400.0d) * r22) / (r22 + 27.13d);
        double r25 = ((Math.signum(r20) * 400.0d) * r23) / (r23 + 27.13d);
        double r112 = (-12.0d) * r24;
        double r26 = ((r112 + (r111 * 11.0d)) + r25) / 11.0d;
        double r27 = ((r111 + r24) - (r25 * 2.0d)) / 9.0d;
        double r28 = r24 * 20.0d;
        double r29 = 21.0d * r25;
        double r210 = (r29 + ((r111 * 20.0d) + r28)) / 20.0d;
        double r113 = (((r111 * 40.0d) + r28) + r25) / 20.0d;
        double r30 = Math.toDegrees(Math.atan2(r27, r26));
        if (r30 >= 0.0d) goto L7;
        r30 = r30 + 360.0d;
    L5:
        double r211 = r30;
        double r31 = Math.toRadians(r211);
        double r33 = Math.pow((r113 * r41.b) / r17, r41.j * r16) * 100.0d;
        double r32 = r33 / 100.0d;
        Math.sqrt(r32);
        double r34 = r17 + 4.0d;
        if (r211 >= 20.14d) goto L12;
        double r114 = r211 + 360.0d;
    L13:
        double r115 = ((((Math.cos(Math.toRadians(r114) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * r41.e) * r41.c;
        double r36 = (Math.hypot(r26, r27) * r115) / (r210 + 0.305d);
        double r38 = Math.pow(1.64d - Math.pow(0.29d, r41.f), 0.73d);
        double r0 = Math.pow(r36, 0.9d) * r38;
        double r310 = Math.sqrt(r32) * r0;
        Math.sqrt((r0 * r16) / r34);
        Math.log1p((r15 * r310) * 0.0228d);
        Math.cos(r31);
        Math.sin(r31);
        return new sy(r211, r310, r33);
    L12:
        r114 = r211;
        goto L13
    L7:
        if (r30 < 360.0d) goto L5;
        r30 = r30 - 360.0d;
        goto L5
    }
}
