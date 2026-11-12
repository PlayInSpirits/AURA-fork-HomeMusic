package defpackage;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ty {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ty(float r1, float r2, float r3, float r4, float r5, float r6) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
    }

    public static ty a(int r26) {
        i85 r0 = i85.k;
        float r1 = gi1.D(Color.red(r26));
        float r2 = gi1.D(Color.green(r26));
        float r3 = gi1.D(Color.blue(r26));
        float[][] r4 = gi1.d;
        float[] r6 = r4[0];
        float r7 = (r6[2] * r3) + ((r6[1] * r2) + (r6[0] * r1));
        float[] r9 = r4[1];
        float r10 = (r9[2] * r3) + ((r9[1] * r2) + (r9[0] * r1));
        float[] r5 = r4[2];
        float r8 = (r3 * r5[2]) + ((r2 * r5[1]) + (r1 * r5[0]));
        float[][] r11 = gi1.a;
        float[] r12 = r11[0];
        float r13 = (r12[2] * r8) + ((r12[1] * r10) + (r12[0] * r7));
        float[] r14 = r11[1];
        float r15 = (r14[2] * r8) + ((r14[1] * r10) + (r14[0] * r7));
        float[] r16 = r11[2];
        float r17 = (r8 * r16[2]) + ((r10 * r16[1]) + (r7 * r16[0]));
        float[] r18 = r0.g;
        float r19 = r0.i;
        float r20 = r0.d;
        float r110 = r0.a;
        float r21 = r18[0] * r13;
        float r22 = r18[1] * r15;
        float r23 = r18[2] * r17;
        float r24 = r0.h;
        float r25 = (float) Math.pow(((double) (Math.abs(r21) * r24)) / 100.0d, 0.42d);
        float r27 = (float) Math.pow(((double) (Math.abs(r22) * r24)) / 100.0d, 0.42d);
        float r28 = (float) Math.pow(((double) (Math.abs(r23) * r24)) / 100.0d, 0.42d);
        float r29 = ((Math.signum(r21) * 400.0f) * r25) / (r25 + 27.13f);
        float r30 = ((Math.signum(r22) * 400.0f) * r27) / (r27 + 27.13f);
        float r31 = ((Math.signum(r23) * 400.0f) * r28) / (r28 + 27.13f);
        double r32 = r31;
        float r33 = ((float) (((((double) r30) * (-12.0d)) + (((double) r29) * 11.0d)) + r32)) / 11.0f;
        float r34 = ((float) (((double) (r29 + r30)) - (r32 * 2.0d))) / 9.0f;
        float r35 = r30 * 20.0f;
        float r111 = ((21.0f * r31) + ((r29 * 20.0f) + r35)) / 20.0f;
        float r36 = (((r29 * 40.0f) + r35) + r31) / 20.0f;
        float r37 = (((float) Math.atan2(r34, r33)) * 180.0f) / 3.1415927f;
        if (r37 >= 0.0f) goto L6;
        r37 = r37 + 360.0f;
    L8:
        float r38 = (3.1415927f * r37) / 180.0f;
        float r39 = ((float) Math.pow((r36 * r0.b) / r110, r0.j * r20)) * 100.0f;
        Math.sqrt(r39 / 100.0f);
        float r112 = r110 + 4.0f;
        if (r37 >= 20.14d) goto L11;
        float r113 = 360.0f + r37;
    L12:
        float r40 = ((float) Math.pow(1.64d - Math.pow(0.29d, r0.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) r113) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * r0.e) * r0.c) * ((float) Math.sqrt((r34 * r34) + (r33 * r33)))) / (r111 + 0.305f), 0.9d));
        float r210 = r40 * ((float) Math.sqrt(((double) r39) / 100.0d));
        Math.sqrt((r40 * r20) / r112);
        float r211 = (1.7f * r39) / ((0.007f * r39) + 1.0f);
        float r41 = ((float) Math.log(((r19 * r210) * 0.0228f) + 1.0f)) * 43.85965f;
        double r42 = r38;
        return new ty(r37, r210, r39, r211, r41 * ((float) Math.cos(r42)), r41 * ((float) Math.sin(r42)));
    L11:
        r113 = r37;
        goto L12
    L6:
        if (r37 < 360.0f) goto L8;
        r37 = r37 - 360.0f;
        goto L8
    }

    public static ty b(float r12, float r13, float r14) {
        i85 r0 = i85.k;
        float r1 = r0.d;
        double r2 = ((double) r12) / 100.0d;
        Math.sqrt(r2);
        float r3 = r0.a + 4.0f;
        float r4 = r0.i * r13;
        Math.sqrt(((r13 / ((float) Math.sqrt(r2))) * r0.d) / r3);
        float r9 = (1.7f * r12) / ((0.007f * r12) + 1.0f);
        float r5 = ((float) Math.log((((double) r4) * 0.0228d) + 1.0d)) * 43.85965f;
        double r6 = (3.1415927f * r14) / 180.0f;
        return new ty(r14, r13, r12, r9, r5 * ((float) Math.cos(r6)), r5 * ((float) Math.sin(r6)));
    }

    public final int c(i85 r20) {
        float r2 = this.b;
        double r3 = r2;
        float r4 = this.c;
        if (r3 == 0.0d) goto L8;
        double r9 = r4;
        if (r9 == 0.0d) goto L8;
        float r5 = r2 / ((float) Math.sqrt(r9 / 100.0d));
    L9:
        float r10 = r20.f;
        float r11 = r20.h;
        float r6 = (float) Math.pow(((double) r5) / Math.pow(1.64d - Math.pow(0.29d, r10), 0.73d), 1.1111111111111112d);
        double r12 = (this.a * 3.1415927f) / 180.0f;
        float r0 = ((float) (Math.cos(2.0d + r12) + 3.8d)) * 0.25f;
        float r7 = r20.a * ((float) Math.pow(((double) r4) / 100.0d, (1.0d / ((double) r20.d)) / ((double) r20.j)));
        float r1 = ((r0 * 3846.1538f) * r20.e) * r20.c;
        float r8 = r7 / r20.b;
        float r13 = (float) Math.sin(r12);
        float r14 = (float) Math.cos(r12);
        float r15 = (11.0f * r6) * r14;
        float r16 = (((0.305f + r8) * 23.0f) * r6) / (((r6 * 108.0f) * r13) + (r15 + (r1 * 23.0f)));
        float r17 = r14 * r16;
        float r18 = r16 * r13;
        float r19 = r8 * 460.0f;
        float r21 = ((288.0f * r18) + ((451.0f * r17) + r19)) / 1403.0f;
        float r22 = ((r19 - (891.0f * r17)) - (261.0f * r18)) / 1403.0f;
        float r23 = ((r19 - (r17 * 220.0f)) - (r18 * 6300.0f)) / 1403.0f;
        float r24 = 100.0f / r11;
        float r25 = (Math.signum(r21) * r24) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r21)) * 27.13d) / (400.0d - ((double) Math.abs(r21)))), 2.380952380952381d));
        float r26 = (Math.signum(r22) * r24) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r22)) * 27.13d) / (400.0d - ((double) Math.abs(r22)))), 2.380952380952381d));
        float r27 = (Math.signum(r23) * r24) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r23)) * 27.13d) / (400.0d - ((double) Math.abs(r23)))), 2.380952380952381d));
        float[] r28 = r20.g;
        float r29 = r25 / r28[0];
        float r30 = r26 / r28[1];
        float r31 = r27 / r28[2];
        float[][] r32 = gi1.b;
        float[] r33 = r32[0];
        float r34 = (r33[2] * r31) + ((r33[1] * r30) + (r33[0] * r29));
        float[] r35 = r32[1];
        float r36 = (r35[2] * r31) + ((r35[1] * r30) + (r35[0] * r29));
        float[] r37 = r32[2];
        return v50.b(r34, r36, (r31 * r37[2]) + ((r30 * r37[1]) + (r29 * r37[0])));
    L8:
        r5 = 0.0f;
        goto L9
    }
}
