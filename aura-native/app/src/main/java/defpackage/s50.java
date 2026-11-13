package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class s50 {
    public static final float[] a;
    public static final float[] b;
    public static final sw4 c;
    public static final sw4 d;
    public static final k24 e;
    public static final k24 f;
    public static final k24 g;
    public static final k24 h;
    public static final k24 i;
    public static final k24 j;
    public static final k24 k;
    public static final k24 l;
    public static final k24 m;
    public static final k24 n;
    public static final k24 o;
    public static final k24 p;
    public static final k24 q;
    public static final k24 r;
    public static final n42 s;
    public static final n42 t;
    public static final k24 u;
    public static final k24 v;
    public static final k24 w;
    public static final q83 x;
    public static final p50[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        sw4 sw4Var = new sw4(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        sw4 sw4Var2 = new sw4(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        sw4 sw4Var3 = new sw4(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = sw4Var3;
        sw4 sw4Var4 = new sw4(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = sw4Var4;
        z95 z95Var = wr1.d;
        k24 k24Var = new k24("sRGB IEC61966-2.1", fArr, z95Var, sw4Var, 0);
        e = k24Var;
        k24 k24Var2 = new k24("sRGB IEC61966-2.1 (Linear)", fArr, z95Var, 1.0d, 0.0f, 1.0f, 1);
        f = k24Var2;
        k24 k24Var3 = new k24("scRGB-nl IEC 61966-2-2:2003", fArr, z95Var, null, new kf2(19), new kf2(20), -0.799f, 2.399f, sw4Var, 2);
        g = k24Var3;
        k24 k24Var4 = new k24("scRGB IEC 61966-2-2:2003", fArr, z95Var, 1.0d, -0.5f, 7.499f, 3);
        h = k24Var4;
        k24 k24Var5 = new k24("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, z95Var, new sw4(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = k24Var5;
        k24 k24Var6 = new k24("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, z95Var, new sw4(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = k24Var6;
        k24 k24Var7 = new k24("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new z95(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = k24Var7;
        k24 k24Var8 = new k24("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, z95Var, sw4Var, 7);
        l = k24Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        k24 k24Var9 = new k24("NTSC (1953)", fArr2, wr1.a, new sw4(d4, d5, d6, d2, d3), 8);
        m = k24Var9;
        k24 k24Var10 = new k24("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, z95Var, new sw4(d4, d5, d6, d2, d3), 9);
        n = k24Var10;
        k24 k24Var11 = new k24("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, z95Var, 2.2d, 0.0f, 1.0f, 10);
        o = k24Var11;
        k24 k24Var12 = new k24("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, wr1.b, new sw4(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = k24Var12;
        z95 z95Var2 = wr1.c;
        k24 k24Var13 = new k24("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, z95Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = k24Var13;
        k24 k24Var14 = new k24("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, z95Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = k24Var14;
        n42 n42Var = new n42(14, 1, 12884901889L, "Generic XYZ");
        s = n42Var;
        n42 n42Var2 = new n42(15, 0, 12884901890L, "Generic L*a*b*");
        t = n42Var2;
        k24 k24Var15 = new k24("None", fArr, z95Var, sw4Var2, 16);
        u = k24Var15;
        k24 k24Var16 = new k24("Hybrid Log Gamma encoding", fArr3, z95Var, null, new kf2(21), new kf2(22), 0.0f, 1.0f, sw4Var3, 17);
        v = k24Var16;
        k24 k24Var17 = new k24("Perceptual Quantizer encoding", fArr3, z95Var, null, new kf2(23), new kf2(24), 0.0f, 1.0f, sw4Var4, 18);
        w = k24Var17;
        q83 q83Var = new q83(19, 12884901890L, "Oklab");
        x = q83Var;
        y = new p50[]{k24Var, k24Var2, k24Var3, k24Var4, k24Var5, k24Var6, k24Var7, k24Var8, k24Var9, k24Var10, k24Var11, k24Var12, k24Var13, k24Var14, n42Var, n42Var2, k24Var15, k24Var16, k24Var17, q83Var};
    }

    public static double a(sw4 sw4Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = sw4Var.b;
        double d6 = sw4Var.c;
        double d7 = sw4Var.d;
        double d8 = sw4Var.e;
        double d9 = sw4Var.f;
        double d10 = d5 * d4;
        return (sw4Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(sw4 sw4Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / sw4Var.b;
        double d5 = 1.0d / sw4Var.c;
        double d6 = 1.0d / sw4Var.d;
        double d7 = sw4Var.e;
        double d8 = sw4Var.f;
        double d9 = (d2 * d3) / (sw4Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(sw4 sw4Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = sw4Var.b;
        double d6 = sw4Var.d;
        double pow = (Math.pow(d4, d6) * sw4Var.c) + d5;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d4, d6) * sw4Var.f) + sw4Var.e), sw4Var.g) * d3;
    }

    public static double d(sw4 sw4Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -sw4Var.b;
        double d6 = sw4Var.e;
        double d7 = 1.0d / sw4Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-sw4Var.f)) + sw4Var.c), 1.0d / sw4Var.d) * d3;
    }
}
