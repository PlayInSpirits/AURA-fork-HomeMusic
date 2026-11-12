package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k24 extends p50 {
    public static final nz2 r = null;
    public final z95 d;
    public final float e;
    public final float f;
    public final sw4 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final ks0 k;
    public final j24 l;
    public final g24 m;
    public final ks0 n;
    public final j24 o;
    public final g24 p;
    public final boolean q;

    static {
        r = new nz2(23);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k24(String r36, float[] r37, z95 r38, float[] r39, ks0 r40, ks0 r41, float r42, float r43, sw4 r44, int r45) {
        super(r45, 12884901888L, r36);
        this.d = r38;
        this.e = r42;
        this.f = r43;
        this.g = r44;
        this.k = r40;
        int r10 = 1;
        this.l = new j24(this, r10);
        int r11 = 0;
        this.m = new g24(this, r11);
        this.n = r41;
        this.o = new j24(this, r11);
        this.p = new g24(this, r10);
        if (r37.length == 6) goto L10;
        if (r37.length == 9) goto L10;
        kf2.n("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        throw null;
    L10:
        if (r42 >= r43) goto L74;
        float[] r9 = new float[6];
        if (r37.length != 9) goto L14;
        float r15 = r37[0];
        float r22 = r37[1];
        float r23 = (r15 + r22) + r37[2];
        r9[0] = r15 / r23;
        r9[1] = r22 / r23;
        float r16 = r37[3];
        float r24 = r37[4];
        float r25 = (r16 + r24) + r37[5];
        r9[2] = r16 / r25;
        r9[3] = r24 / r25;
        float r17 = r37[6];
        float r26 = r37[7];
        float r27 = (r17 + r26) + r37[8];
        r9[4] = r17 / r27;
        r9[5] = r26 / r27;
    L15:
        this.h = r9;
        if (r39 != null) goto L18;
        float r3 = r9[0];
        float r12 = r9[1];
        float r18 = r9[2];
        float r28 = r9[3];
        float r29 = r9[4];
        float r210 = r9[5];
        float r310 = 1.0f;
        float r1 = r38.a;
        char r46 = 1;
        float r13 = r38.b;
        float r211 = 1.0f - r3;
        float r212 = r211 / r12;
        float r213 = 1.0f - r18;
        float r214 = 1.0f - r29;
        float r31 = (1.0f - r1) / r13;
        float r32 = r3 / r12;
        float r33 = (r18 / r28) - r32;
        float r2 = (r1 / r13) - r32;
        float r215 = (r213 / r28) - r212;
        float r34 = (r29 / r210) - r32;
        float r35 = (((r31 - r212) * r33) - (r2 * r215)) / ((((r214 / r210) - r212) * r33) - (r215 * r34));
        float r4 = (r2 - (r34 * r35)) / r33;
        float r14 = (1.0f - r4) - r35;
        float r216 = r14 / r12;
        float r217 = r4 / r28;
        float r30 = r35 / r210;
        this.i = new float[]{r3 * r216, r14, (r211 - r12) * r216, r18 * r217, r4, (r213 - r28) * r217, r29 * r30, r35, (r214 - r210) * r30};
    L21:
        this.j = uo.w(this.i);
        float r5 = gi1.e(r9);
        float[] r6 = s50.a;
        if ((r5 / gi1.e(s50.b)) <= 0.9f) goto L38;
        float[] r7 = s50.a;
        float r19 = r9[0];
        float r110 = r7[0];
        float r111 = r9[r46];
        float r112 = r7[r46];
        float r113 = r9[2];
        float r114 = r7[2];
        float r218 = r9[3];
        float r219 = r7[3];
        float r220 = r9[4];
        float r221 = r7[4];
        float r222 = r9[5];
        float r8 = r7[5];
        float r311 = 0.0f;
        float[] r20 = new float[6];
        r20[0] = r19 - r110;
        r20[r46] = r111 - r112;
        r20[2] = r113 - r114;
        r20[3] = r218 - r219;
        r20[4] = r220 - r221;
        r20[5] = r222 - r8;
        float r115 = r20[0];
        float r116 = r20[r46];
        if ((((r112 - r8) * r115) - ((r110 - r221) * r116)) >= 0.0f) goto L26;
    L39:
        int r21 = (r42 > r311 ? 1 : (r42 == r311 ? 0 : -1));
    L40:
        if (r45 == 0) goto L68;
        float[] r47 = s50.a;
        if (r9 == r47) goto L54;
        int r48 = 0;
    L46:
        if (r48 >= 6) goto L54;
        if (Float.compare(r9[r48], r47[r48]) == 0) goto L52;
        if (Math.abs(r9[r48] - r47[r48]) <= 0.001f) goto L52;
    L69:
        boolean r117 = 0;
    L70:
        this.q = r117;
        return;
    L52:
        r48 = r48 + 1;
    L54:
        if (uo.l(r38, wr1.d) == false) goto L69;
        if (r42 != r311) goto L69;
        if (r43 != r310) goto L69;
        float[] r49 = s50.a;
        k24 r50 = s50.e;
        double r51 = 0.0d;
    L62:
        if (r51 > 1.0d) goto L68;
        if (Math.abs(r40.b(r51) - r50.k.b(r51)) > 0.001d) goto L69;
        if (Math.abs(r41.b(r51) - r50.n.b(r51)) > 0.001d) goto L69;
        r51 = r51 + 0.00392156862745098d;
    L68:
        r117 = r46;
        goto L70
    L26:
        if ((((r110 - r114) * r116) - ((r112 - r219) * r115)) < 0.0f) goto L39;
        float r118 = r20[2];
        float r119 = r20[3];
        if ((((r219 - r112) * r118) - ((r114 - r110) * r119)) < 0.0f) goto L39;
        if ((((r114 - r221) * r119) - ((r219 - r8) * r118)) < 0.0f) goto L39;
        float r120 = r20[4];
        float r52 = r20[5];
        if ((((r8 - r219) * r120) - ((r221 - r114) * r52)) < 0.0f) goto L39;
        if ((((r221 - r110) * r52) - ((r8 - r112) * r120)) < 0.0f) goto L39;
    L38:
        r311 = 0.0f;
        goto L39
    L18:
        r46 = 1;
        r310 = 1.0f;
        if (r39.length != 9) goto L72;
        this.i = r39;
        goto L21
    L72:
        kf2.n(f34.f(r39.length, "Transform must have 9 entries! Has "));
        throw null;
    L14:
        System.arraycopy(r37, 0, r9, 0, 6);
        goto L15
    L74:
        kf2.n(xa3.f("Invalid range: min=", r42, ", max=", r43, "; min must be strictly < max"));
        throw null;
    }

    @Override // defpackage.p50
    public final float a(int r1) {
        return this.f;
    }

    @Override // defpackage.p50
    public final float b(int r1) {
        return this.e;
    }

    @Override // defpackage.p50
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.p50
    public final long d(float r4, float r5, float r6) {
        double r0 = r4;
        g24 r7 = this.p;
        float r1 = (float) r7.b(r0);
        float r8 = (float) r7.b(r5);
        float r9 = (float) r7.b(r6);
        float[] r3 = this.i;
        if (r3.length >= 9) goto L6;
        return 0;
    L6:
        float r10 = (r3[6] * r9) + ((r3[3] * r8) + (r3[0] * r1));
        float r11 = (r3[7] * r9) + ((r3[4] * r8) + (r3[1] * r1));
        return (Float.floatToRawIntBits(r10) << 32) | (4294967295L & Float.floatToRawIntBits(r11));
    }

    @Override // defpackage.p50
    public final float e(float r4, float r5, float r6) {
        double r0 = r4;
        g24 r7 = this.p;
        float r1 = (float) r7.b(r0);
        float r8 = (float) r7.b(r5);
        float r9 = (float) r7.b(r6);
        float[] r3 = this.i;
        return (r3[8] * r9) + ((r3[5] * r8) + (r3[2] * r1));
    }

    @Override // defpackage.p50
    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L36:
        return false;
    L8:
        if (k24.class != r5.getClass()) goto L36;
        if (super.equals(r5) == true) goto L13;
        return false;
    L13:
        k24 r6 = (k24) r5;
        if (Float.compare(r6.e, this.e) == 0) goto L17;
        return false;
    L17:
        if (Float.compare(r6.f, this.f) == 0) goto L20;
        return false;
    L20:
        if (h12.c(this.d, r6.d) == true) goto L23;
        return false;
    L23:
        if (Arrays.equals(this.h, r6.h) == true) goto L25;
        return false;
    L25:
        sw4 r2 = r6.g;
        sw4 r3 = this.g;
        if (r3 != null) goto L28;
        if (r2 != null) goto L32;
        return true;
    L32:
        if (h12.c(this.k, r6.k) == true) goto L35;
        return false;
    L35:
        return h12.c(this.n, r6.n);
    L28:
        return h12.c(r3, r2);
    }

    @Override // defpackage.p50
    public final long f(float r5, float r6, float r7, float r8, p50 r9) {
        float[] r1 = this.j;
        float r0 = (r1[6] * r7) + ((r1[3] * r6) + (r1[0] * r5));
        float r2 = (r1[7] * r7) + ((r1[4] * r6) + (r1[1] * r5));
        float r10 = (r1[8] * r7) + ((r1[5] * r6) + (r1[2] * r5));
        g24 r4 = this.m;
        return e35.a((float) r4.b(r0), (float) r4.b(r2), (float) r4.b(r10), r8, r9);
    }

    @Override // defpackage.p50
    public final int hashCode() {
        int r0 = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float r1 = this.e;
        int r4 = 0;
        if (r1 != 0.0f) goto L5;
        int r2 = 0;
    L6:
        int r3 = (r0 + r2) * 31;
        float r5 = this.f;
        if (r5 != 0.0f) goto L9;
        int r6 = 0;
    L10:
        int r7 = (r3 + r6) * 31;
        sw4 r8 = this.g;
        if (r8 == null) goto L13;
        r4 = r8.hashCode();
    L13:
        int r9 = r7 + r4;
        if (r8 != null) goto L17;
        int r10 = this.k.hashCode();
        return this.n.hashCode() + ((r10 + (r9 * 31)) * 31);
    L17:
        return r9;
    L9:
        r6 = Float.floatToIntBits(r5);
        goto L10
    L5:
        r2 = Float.floatToIntBits(r1);
        goto L6
    }

    public k24(String r19, float[] r20, z95 r21, final sw4 r22, int r23) {
        double r0 = r22.a;
        final int r5 = 0;
        final int r6 = 1;
        if (r0 != (-3.0d)) goto L5;
        boolean r4 = true;
    L6:
        double r7 = r22.g;
        double r10 = r22.f;
        if (r4 == false) goto L9;
        double r16 = -3.0d;
        final int r2 = 4;
        ks0 r8 = new i24(r22, r2);
    L19:
        if (r0 != r16) goto L23;
        ks0 r1 = new i24(r22, r5);
    L31:
        this(r19, r20, r21, null, r8, r1, 0.0f, 1.0f, r22, r23);
        return;
    L23:
        if (r0 != (-2.0d)) goto L26;
        r1 = new i24(r22, r6);
        goto L31
    L26:
        if (r10 == 0.0d) goto L28;
    L30:
        final int r3 = 3;
        r1 = new i24(r22, r3);
        goto L31
    L28:
        if (r7 != 0.0d) goto L30;
        final int r9 = 2;
        r1 = new i24(r22, r9);
        goto L31
    L9:
        r16 = -3.0d;
        if (r0 != (-2.0d)) goto L13;
        final int r11 = 5;
        r8 = new i24(r22, r11);
        goto L19
    L13:
        if (r10 == 0.0d) goto L15;
    L17:
        final int r12 = 7;
        r8 = new i24(r22, r12);
        goto L19
    L15:
        if (r7 != 0.0d) goto L17;
        final int r13 = 6;
        r8 = new i24(r22, r13);
        goto L19
    L5:
        r4 = false;
        goto L6
    }

    public k24(String r18, float[] r19, z95 r20, final double r21, float r23, float r24, int r25) {
        ks0 r3 = r;
        if (r21 != 1.0d) goto L5;
        ks0 r11 = r3;
    L6:
        if (r21 != 1.0d) goto L8;
    L7:
        ks0 r12 = r3;
        double r4 = 1.0d;
        double r5 = 0.0d;
        this(r18, r19, r20, null, r11, r12, r23, r24, new sw4(r21, r4, r5, 0.0d, 0.0d), r25);
        return;
    L8:
        final int r0 = 1;
        r3 = new h24(r21, r0);
        goto L7
    L5:
        final int r6 = 0;
        r11 = new h24(r21, r6);
        goto L6
    }
}
