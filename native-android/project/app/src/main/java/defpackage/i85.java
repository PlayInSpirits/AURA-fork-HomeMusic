package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i85 {
    public static final i85 k = null;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] r0 = gi1.c;
        float r1 = (float) ((((double) gi1.c0()) * 63.66197723675813d) / 100.0d);
        float[][] r2 = gi1.a;
        float r6 = r0[0];
        float[] r7 = r2[0];
        float r8 = r7[0] * r6;
        float r10 = r0[1];
        float r11 = (r7[1] * r10) + r8;
        float r12 = r0[2];
        float r9 = (r7[2] * r12) + r11;
        float[] r13 = r2[1];
        float r14 = (r13[2] * r12) + ((r13[1] * r10) + (r13[0] * r6));
        float[] r3 = r2[2];
        float r15 = (r12 * r3[2]) + ((r10 * r3[1]) + (r6 * r3[0]));
        float r4 = (1.0f - (((float) Math.exp(((-r1) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double r16 = r4;
        if (r16 <= 1.0d) goto L6;
        r4 = 1.0f;
    L8:
        float[] r17 = {(((100.0f / r9) * r4) + 1.0f) - r4, (((100.0f / r14) * r4) + 1.0f) - r4, (((100.0f / r15) * r4) + 1.0f) - r4};
        float r18 = 1.0f / ((5.0f * r1) + 1.0f);
        float r19 = ((r18 * r18) * r18) * r18;
        float r20 = 1.0f - r19;
        float r110 = (((0.1f * r20) * r20) * ((float) Math.cbrt(((double) r1) * 5.0d))) + (r19 * r1);
        float r111 = gi1.c0() / r0[1];
        double r5 = r111;
        float r23 = ((float) Math.sqrt(r5)) + 1.48f;
        float r112 = 0.725f / ((float) Math.pow(r5, 0.2d));
        float[] r21 = {(float) Math.pow(((double) ((r17[0] * r110) * r9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((r17[1] * r110) * r14)) / 100.0d, 0.42d), (float) Math.pow(((double) ((r17[2] * r110) * r15)) / 100.0d, 0.42d)};
        float r22 = r21[0];
        float r24 = (r22 * 400.0f) / (r22 + 27.13f);
        float r25 = r21[1];
        float r26 = (r25 * 400.0f) / (r25 + 27.13f);
        float r27 = r21[2];
        float[] r28 = {r24, r26, (400.0f * r27) / (r27 + 27.13f)};
        k = new i85(r111, ((r28[2] * 0.05f) + ((r28[0] * 2.0f) + r28[1])) * r112, r112, r112, 0.69f, 1.0f, r17, r110, (float) Math.pow(r110, 0.25d), r23);
        return;
    L6:
        if (r16 >= 0.0d) goto L8;
        r4 = 0.0f;
        goto L8
    }

    public i85(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
        this.f = r1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
    }
}
