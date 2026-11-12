package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s50 {
    public static final float[] a = null;
    public static final float[] b = null;
    public static final sw4 c = null;
    public static final sw4 d = null;
    public static final k24 e = null;
    public static final k24 f = null;
    public static final k24 g = null;
    public static final k24 h = null;
    public static final k24 i = null;
    public static final k24 j = null;
    public static final k24 k = null;
    public static final k24 l = null;
    public static final k24 m = null;
    public static final k24 n = null;
    public static final k24 o = null;
    public static final k24 p = null;
    public static final k24 q = null;
    public static final k24 r = null;
    public static final n42 s = null;
    public static final n42 t = null;
    public static final k24 u = null;
    public static final k24 v = null;
    public static final k24 w = null;
    public static final q83 x = null;
    public static final p50[] y = null;

    static {
        float[] r3 = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = r3;
        float[] r12 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = r12;
        float[] r15 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        sw4 r16 = new sw4(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        sw4 r17 = new sw4(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        sw4 r18 = new sw4(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = r18;
        sw4 r19 = new sw4(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = r19;
        z95 r4 = wr1.d;
        k24 r1 = new k24("sRGB IEC61966-2.1", r3, r4, r16, 0);
        e = r1;
        k24 r2 = new k24("sRGB IEC61966-2.1 (Linear)", r3, r4, 1.0d, 0.0f, 1.0f, 1);
        f = r2;
        k24 r5 = new k24("scRGB-nl IEC 61966-2-2:2003", r3, r4, null, new kf2(19), new kf2(20), -0.799f, 2.399f, r16, 2);
        g = r5;
        k24 r6 = new k24("scRGB IEC 61966-2-2:2003", r3, r4, 1.0d, -0.5f, 7.499f, 3);
        h = r6;
        k24 r7 = new k24("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, r4, new sw4(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = r7;
        k24 r8 = new k24("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, r4, new sw4(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = r8;
        k24 r25 = new k24("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new z95(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = r25;
        k24 r9 = new k24("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, r4, r16, 7);
        l = r9;
        double r47 = 0.2222222222222222d;
        double r49 = 0.081d;
        double r41 = 2.2222222222222223d;
        double r43 = 0.9099181073703367d;
        double r45 = 0.09008189262966333d;
        k24 r10 = new k24("NTSC (1953)", r12, wr1.a, new sw4(r41, r43, r45, r47, r49), 8);
        m = r10;
        k24 r11 = new k24("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, r4, new sw4(r41, r43, r45, r47, r49), 9);
        n = r11;
        k24 r26 = new k24("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, r4, 2.2d, 0.0f, 1.0f, 10);
        o = r26;
        k24 r27 = new k24("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, wr1.b, new sw4(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = r27;
        z95 r44 = wr1.c;
        k24 r40 = new k24("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, r44, 1.0d, -65504.0f, 65504.0f, 12);
        q = r40;
        k24 r42 = new k24("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, r44, 1.0d, -65504.0f, 65504.0f, 13);
        r = r42;
        int r28 = 14;
        n42 r29 = new n42(r28, 1, 12884901889L, "Generic XYZ");
        s = r29;
        n42 r210 = new n42(15, 0, 12884901890L, "Generic L*a*b*");
        t = r210;
        k24 r13 = new k24("None", r3, r4, r17, 16);
        u = r13;
        k24 r14 = new k24("Hybrid Log Gamma encoding", r15, r4, null, new kf2(21), new kf2(22), 0.0f, 1.0f, r18, 17);
        v = r14;
        k24 r110 = new k24("Perceptual Quantizer encoding", r15, r4, null, new kf2(23), new kf2(24), 0.0f, 1.0f, r19, 18);
        w = r110;
        q83 r0 = new q83(19, 12884901890L, "Oklab");
        x = r0;
        y = new p50[]{r1, r2, r5, r6, r7, r8, r25, r9, r10, r11, r26, r27, r40, r42, r29, r210, r13, r14, r110, r0};
    }

    public static double a(sw4 r18, double r19) {
        if (r19 >= 0.0d) goto L5;
        double r4 = -1.0d;
    L6:
        double r6 = r19 * r4;
        double r8 = r18.b;
        double r10 = r18.c;
        double r12 = r18.d;
        double r14 = r18.e;
        double r2 = r18.f;
        double r0 = r18.g + 1.0d;
        double r9 = r8 * r6;
        if (r9 > 1.0d) goto L9;
        double r3 = Math.pow(r9, r10);
    L11:
        return (r0 * r4) * r3;
    L9:
        r3 = Math.exp((r6 - r2) * r12) + r14;
        goto L11
    L5:
        r4 = 1.0d;
        goto L6
    }

    public static double b(sw4 r18, double r19) {
        if (r19 >= 0.0d) goto L5;
        double r4 = -1.0d;
    L6:
        double r8 = 1.0d / r18.b;
        double r10 = 1.0d / r18.c;
        double r12 = 1.0d / r18.d;
        double r14 = r18.e;
        double r2 = r18.f;
        double r6 = (r19 * r4) / (r18.g + 1.0d);
        if (r6 > 1.0d) goto L9;
        double r0 = Math.pow(r6, r10) * r8;
    L11:
        return r4 * r0;
    L9:
        r0 = (Math.log(r6 - r14) * r12) + r2;
        goto L11
    L5:
        r4 = 1.0d;
        goto L6
    }

    public static double c(sw4 r12, double r13) {
        double r0 = 0.0d;
        if (r13 >= 0.0d) goto L5;
        double r2 = -1.0d;
    L6:
        double r14 = r13 * r2;
        double r4 = r12.b;
        double r6 = r12.d;
        double r8 = r12.c;
        double r10 = (Math.pow(r14, r6) * r8) + r4;
        if (r10 < 0.0d) goto L10;
        r0 = r10;
    L10:
        double r5 = r12.e;
        double r9 = r12.f;
        return Math.pow(r0 / ((Math.pow(r14, r6) * r9) + r5), r12.g) * r2;
    L5:
        r2 = 1.0d;
        goto L6
    }

    public static double d(sw4 r18, double r19) {
        if (r19 >= 0.0d) goto L5;
        double r6 = -1.0d;
    L6:
        double r8 = r19 * r6;
        double r10 = -r18.b;
        double r12 = r18.e;
        double r14 = 1.0d / r18.g;
        double r4 = r18.c;
        double r1 = -r18.f;
        return Math.pow(Math.max((Math.pow(r8, r14) * r12) + r10, 0.0d) / ((Math.pow(r8, r14) * r1) + r4), 1.0d / r18.d) * r6;
    L5:
        r6 = 1.0d;
        goto L6
    }
}
