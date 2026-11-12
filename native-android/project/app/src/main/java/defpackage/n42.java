package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n42 extends p50 {
    public final /* synthetic */ int d;

    public /* synthetic */ n42(int r1, int r2, long r3, String r5) {
        this.d = r2;
        super(r1, r3, r5);
    }

    @Override // defpackage.p50
    public final float a(int r1) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 2.0f;
    L6:
        if (r1 != 0) goto L8;
        return 100.0f;
    L8:
        return 128.0f;
    }

    @Override // defpackage.p50
    public final float b(int r1) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return -2.0f;
    L6:
        if (r1 != 0) goto L8;
        return 0.0f;
    L8:
        return -128.0f;
    }

    @Override // defpackage.p50
    public final long d(float r6, float r7, float r8) {
        switch(this.d) {
            case 0: goto L21;
            default: goto L5;
        };
    L5:
        if (r6 >= (-2.0f)) goto L7;
        r6 = -2.0f;
    L7:
        float r2 = 2.0f;
        if (r6 <= 2.0f) goto L11;
        r6 = 2.0f;
    L11:
        if (r7 >= (-2.0f)) goto L14;
        r7 = -2.0f;
    L14:
        if (r7 > 2.0f) goto L17;
        r2 = r7;
    L17:
        long r5 = Float.floatToRawIntBits(r6);
        long r3 = Float.floatToRawIntBits(r2);
        long r9 = r5 << 32;
    L19:
        return r9 | (r3 & 4294967295L);
    L21:
        if (r6 >= 0.0f) goto L24;
        r6 = 0.0f;
    L24:
        if (r6 <= 100.0f) goto L27;
        r6 = 100.0f;
    L27:
        if (r7 >= (-128.0f)) goto L30;
        r7 = -128.0f;
    L30:
        if (r7 <= 128.0f) goto L32;
        r7 = 128.0f;
    L32:
        float r10 = (r6 + 16.0f) / 116.0f;
        float r11 = (r7 * 0.002f) + r10;
        if (r11 <= 0.20689656f) goto L35;
        float r4 = (r11 * r11) * r11;
    L37:
        if (r10 <= 0.20689656f) goto L39;
        float r12 = (r10 * r10) * r10;
    L40:
        float[] r13 = wr1.e;
        float r14 = r4 * r13[0];
        float r15 = r12 * r13[1];
        long r16 = Float.floatToRawIntBits(r14);
        r3 = Float.floatToRawIntBits(r15);
        r9 = r16 << 32;
        goto L19
    L39:
        r12 = (r10 - 0.13793103f) * 0.12841855f;
        goto L40
    L35:
        r4 = (r11 - 0.13793103f) * 0.12841855f;
        goto L37
    }

    @Override // defpackage.p50
    public final float e(float r1, float r2, float r3) {
        switch(this.d) {
            case 0: goto L12;
            default: goto L5;
        };
    L5:
        if (r3 >= (-2.0f)) goto L8;
        r3 = -2.0f;
    L8:
        if (r3 > 2.0f) goto L10;
        return r3;
    L10:
        return 2.0f;
    L12:
        if (r1 >= 0.0f) goto L15;
        r1 = 0.0f;
    L15:
        if (r1 <= 100.0f) goto L18;
        r1 = 100.0f;
    L18:
        if (r3 >= (-128.0f)) goto L21;
        r3 = -128.0f;
    L21:
        if (r3 <= 128.0f) goto L23;
        r3 = 128.0f;
    L23:
        float r4 = ((r1 + 16.0f) / 116.0f) - (r3 * 0.005f);
        if (r4 <= 0.20689656f) goto L26;
        float r0 = (r4 * r4) * r4;
    L28:
        return r0 * wr1.e[2];
    L26:
        r0 = 0.12841855f * (r4 - 0.13793103f);
        goto L28
    }

    @Override // defpackage.p50
    public final long f(float r6, float r7, float r8, float r9, p50 r10) {
        switch(this.d) {
            case 0: goto L25;
            default: goto L5;
        };
    L25:
        float[] r5 = wr1.e;
        float r11 = r6 / r5[0];
        float r12 = r7 / r5[1];
        float r13 = r8 / r5[2];
        if (r11 <= 0.008856452f) goto L28;
        float r14 = (float) Math.cbrt(r11);
    L30:
        if (r12 <= 0.008856452f) goto L32;
        float r15 = (float) Math.cbrt(r12);
    L34:
        if (r13 <= 0.008856452f) goto L36;
        float r16 = (float) Math.cbrt(r13);
    L37:
        float r17 = (116.0f * r15) - 16.0f;
        float r18 = (r14 - r15) * 500.0f;
        float r19 = (r15 - r16) * 200.0f;
        if (r17 >= 0.0f) goto L41;
        r17 = 0.0f;
    L41:
        if (r17 <= 100.0f) goto L44;
        r17 = 100.0f;
    L44:
        if (r18 >= (-128.0f)) goto L46;
        r18 = -128.0f;
    L46:
        float r0 = 128.0f;
        if (r18 <= 128.0f) goto L50;
        r18 = 128.0f;
    L50:
        if (r19 >= (-128.0f)) goto L53;
        r19 = -128.0f;
    L53:
        if (r19 > 128.0f) goto L57;
        r0 = r19;
    L57:
        return e35.a(r17, r18, r0, r9, r10);
    L36:
        r16 = (r13 * 7.787037f) + 0.13793103f;
        goto L37
    L32:
        r15 = (r12 * 7.787037f) + 0.13793103f;
        goto L34
    L28:
        r14 = (r11 * 7.787037f) + 0.13793103f;
        goto L30
    L5:
        if (r6 >= (-2.0f)) goto L7;
        r6 = -2.0f;
    L7:
        float r1 = 2.0f;
        if (r6 <= 2.0f) goto L11;
        r6 = 2.0f;
    L11:
        if (r7 >= (-2.0f)) goto L14;
        r7 = -2.0f;
    L14:
        if (r7 <= 2.0f) goto L17;
        r7 = 2.0f;
    L17:
        if (r8 >= (-2.0f)) goto L20;
        r8 = -2.0f;
    L20:
        if (r8 > 2.0f) goto L24;
        r1 = r8;
    L24:
        return e35.a(r6, r7, r1, r9, r10);
    }
}
