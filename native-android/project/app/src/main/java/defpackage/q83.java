package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q83 extends p50 {
    public static final float[] d = null;
    public static final float[] e = null;
    public static final float[] f = null;
    public static final float[] g = null;

    static {
        float[] r1 = uo.A(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, uo.k((float[]) d34.r.o, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = r1;
        float[] r0 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = r0;
        f = uo.w(r1);
        g = uo.w(r0);
    }

    @Override // defpackage.p50
    public final float a(int r1) {
        if (r1 != 0) goto L5;
        return 1.0f;
    L5:
        return 0.5f;
    }

    @Override // defpackage.p50
    public final float b(int r1) {
        if (r1 != 0) goto L5;
        return 0.0f;
    L5:
        return -0.5f;
    }

    @Override // defpackage.p50
    public final long d(float r10, float r11, float r12) {
        if (r10 >= 0.0f) goto L6;
        r10 = 0.0f;
    L6:
        if (r10 <= 1.0f) goto L9;
        r10 = 1.0f;
    L9:
        if (r11 >= (-0.5f)) goto L11;
        r11 = -0.5f;
    L11:
        float r0 = 0.5f;
        if (r11 <= 0.5f) goto L15;
        r11 = 0.5f;
    L15:
        if (r12 >= (-0.5f)) goto L18;
        r12 = -0.5f;
    L18:
        if (r12 > 0.5f) goto L21;
        r0 = r12;
    L21:
        float[] r9 = g;
        float r4 = (r9[6] * r0) + ((r9[3] * r11) + (r9[0] * r10));
        float r8 = (r9[7] * r0) + ((r9[4] * r11) + (r9[1] * r10));
        float r13 = (r9[8] * r0) + ((r9[5] * r11) + (r9[2] * r10));
        float r14 = (r4 * r4) * r4;
        float r15 = (r8 * r8) * r8;
        float r1 = (r13 * r13) * r13;
        float[] r16 = f;
        float r17 = (r16[6] * r1) + ((r16[3] * r15) + (r16[0] * r14));
        float r18 = (r16[7] * r1) + ((r16[4] * r15) + (r16[1] * r14));
        return (Float.floatToRawIntBits(r17) << 32) | (4294967295L & Float.floatToRawIntBits(r18));
    }

    @Override // defpackage.p50
    public final float e(float r6, float r7, float r8) {
        if (r6 >= 0.0f) goto L6;
        r6 = 0.0f;
    L6:
        if (r6 <= 1.0f) goto L9;
        r6 = 1.0f;
    L9:
        if (r7 >= (-0.5f)) goto L11;
        r7 = -0.5f;
    L11:
        float r0 = 0.5f;
        if (r7 <= 0.5f) goto L15;
        r7 = 0.5f;
    L15:
        if (r8 >= (-0.5f)) goto L18;
        r8 = -0.5f;
    L18:
        if (r8 > 0.5f) goto L21;
        r0 = r8;
    L21:
        float[] r9 = g;
        float r5 = (r9[6] * r0) + ((r9[3] * r7) + (r9[0] * r6));
        float r1 = (r9[7] * r0) + ((r9[4] * r7) + (r9[1] * r6));
        float r10 = (r9[8] * r0) + ((r9[5] * r7) + (r9[2] * r6));
        float r2 = (r5 * r5) * r5;
        float r11 = (r1 * r1) * r1;
        float r3 = (r10 * r10) * r10;
        float[] r12 = f;
        return (r12[8] * r3) + ((r12[5] * r11) + (r12[2] * r2));
    }

    @Override // defpackage.p50
    public final long f(float r12, float r13, float r14, float r15, p50 r16) {
        float[] r11 = d;
        float r1 = r11[0] * r12;
        float r3 = (r11[3] * r13) + r1;
        float r4 = (r11[6] * r14) + r3;
        float r5 = r11[1] * r12;
        float r7 = (r11[4] * r13) + r5;
        float r8 = (r11[7] * r14) + r7;
        float r9 = r11[2] * r12;
        float r10 = (r11[5] * r13) + r9;
        float r17 = (r11[8] * r14) + r10;
        float r6 = rr2.B(r4);
        float r18 = rr2.B(r8);
        float r19 = rr2.B(r17);
        float[] r20 = e;
        float r0 = r20[0] * r6;
        float r2 = (r20[3] * r18) + r0;
        float r21 = (r20[6] * r19) + r2;
        float r22 = r20[1] * r6;
        float r23 = (r20[4] * r18) + r22;
        float r24 = (r20[7] * r19) + r23;
        float r25 = r20[2] * r6;
        float r110 = (r20[5] * r18) + r25;
        return e35.a(r21, r24, (r20[8] * r19) + r110, r15, r16);
    }
}
