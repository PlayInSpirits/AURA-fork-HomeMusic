package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class q83 extends p50 {
    public q83(int a0, long a1, java.lang.String a2) {
        super(a0, a1, a2);
    }

    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        float[] A = uo.A(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, uo.k((float[]) d34.r.o, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        d = A;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        e = fArr;
        f = uo.w(A);
        g = uo.w(fArr);
    }

    @Override // defpackage.p50
    public final float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // defpackage.p50
    public final float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // defpackage.p50
    public final long d(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (Float.floatToRawIntBits((fArr2[6] * f11) + ((fArr2[3] * f10) + (fArr2[0] * f9))) << 32) | (4294967295L & Float.floatToRawIntBits((fArr2[7] * f11) + (fArr2[4] * f10) + (fArr2[1] * f9)));
    }

    @Override // defpackage.p50
    public final float e(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = g;
        float f6 = (fArr[6] * f5) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f5) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f5) + (fArr[5] * f3) + (fArr[2] * f2);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = f;
        return (fArr2[8] * f11) + (fArr2[5] * f10) + (fArr2[2] * f9);
    }

    @Override // defpackage.p50
    public final long f(float f2, float f3, float f4, float f5, p50 p50Var) {
        float[] fArr = d;
        float f6 = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        float f7 = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f8 = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        float B = rr2.B(f6);
        float B2 = rr2.B(f7);
        float B3 = rr2.B(f8);
        float[] fArr2 = e;
        return e35.a((fArr2[6] * B3) + (fArr2[3] * B2) + (fArr2[0] * B), (fArr2[7] * B3) + (fArr2[4] * B2) + (fArr2[1] * B), (fArr2[8] * B3) + (fArr2[5] * B2) + (fArr2[2] * B), f5, p50Var);
    }
}
