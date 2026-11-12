package defpackage;

import java.util.Arrays;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k24 extends p50 {
    public static final nz2 r = new nz2(23);
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

    /* JADX WARN: Code duplicated, block: B:42:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x0211  */
    /* JADX WARN: Code duplicated, block: B:56:0x021a  */
    /* JADX WARN: Code duplicated, block: B:63:0x022e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0246  */
    /* JADX WARN: Code duplicated, block: B:68:0x0260  */
    /* JADX WARN: Code duplicated, block: B:77:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0263 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public k24(String str, float[] fArr, z95 z95Var, float[] fArr2, ks0 ks0Var, ks0 ks0Var2, float f, float f2, sw4 sw4Var, int i) {
        char c;
        float f3;
        float f4;
        boolean z;
        float[] fArr3;
        k24 k24Var;
        double d;
        int i2;
        super(i, 12884901888L, str);
        this.d = z95Var;
        this.e = f;
        this.f = f2;
        this.g = sw4Var;
        this.k = ks0Var;
        int i3 = 1;
        this.l = new j24(this, i3);
        int i4 = 0;
        this.m = new g24(this, i4);
        this.n = ks0Var2;
        this.o = new j24(this, i4);
        this.p = new g24(this, i3);
        if (fArr.length != 6 && fArr.length != 9) {
            kf2.n("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            kf2.n(xa3.f("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max"));
            throw null;
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.h = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = z95Var.a;
            c = 1;
            float f21 = z95Var.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            this.i = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                kf2.n(f34.f(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.i = fArr2;
        }
        this.j = uo.w(this.i);
        float fE = gi1.e(fArr4);
        float[] fArr5 = s50.a;
        if (fE / gi1.e(s50.b) > 0.9f) {
            float[] fArr6 = s50.a;
            float f38 = fArr4[0];
            float f39 = fArr6[0];
            float f40 = fArr4[c];
            float f41 = fArr6[c];
            float f42 = fArr4[2];
            float f43 = fArr6[2];
            float f44 = fArr4[3];
            float f45 = fArr6[3];
            float f46 = fArr4[4];
            float f47 = fArr6[4];
            float f48 = fArr4[5];
            float f49 = fArr6[5];
            f4 = 0.0f;
            float[] fArr7 = new float[6];
            fArr7[0] = f38 - f39;
            fArr7[c] = f40 - f41;
            fArr7[2] = f42 - f43;
            fArr7[3] = f44 - f45;
            fArr7[4] = f46 - f47;
            fArr7[5] = f48 - f49;
            float f50 = fArr7[0];
            float f51 = fArr7[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr7[2];
                float f53 = fArr7[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr7[4];
                    float f55 = fArr7[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr3 = s50.a;
                if (fArr4 == fArr3) {
                    i2 = 0;
                    while (true) {
                        if (i2 < 6) {
                            if (Float.compare(fArr4[i2], fArr3[i2]) != 0 || Math.abs(fArr4[i2] - fArr3[i2]) <= 0.001f) {
                                i2++;
                            }
                        } else if (uo.l(z95Var, wr1.d)) {
                            float[] fArr8 = s50.a;
                            k24Var = s50.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c;
                                } else if (Math.abs(ks0Var.b(d) - k24Var.k.b(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (uo.l(z95Var, wr1.d) && f == f4 && f2 == f3) {
                    float[] fArr9 = s50.a;
                    k24Var = s50.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c;
                        } else if (Math.abs(ks0Var.b(d) - k24Var.k.b(d)) > 0.001d && Math.abs(ks0Var2.b(d) - k24Var.n.b(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = 0;
            } else {
                z = c;
            }
            this.q = z;
        }
        f4 = 0.0f;
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr3 = s50.a;
            if (fArr4 == fArr3) {
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr4[i2], fArr3[i2]) != 0) {
                        }
                        i2++;
                    } else if (uo.l(z95Var, wr1.d)) {
                        float[] fArr10 = s50.a;
                        k24Var = s50.e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = c;
                            } else if (Math.abs(ks0Var.b(d) - k24Var.k.b(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (uo.l(z95Var, wr1.d)) {
                float[] fArr11 = s50.a;
                k24Var = s50.e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = c;
                    } else if (Math.abs(ks0Var.b(d) - k24Var.k.b(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = 0;
        } else {
            z = c;
        }
        this.q = z;
    }

    @Override // defpackage.p50
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.p50
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.p50
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.p50
    public final long d(float f, float f2, float f3) {
        double d = f;
        g24 g24Var = this.p;
        float fB = (float) g24Var.b(d);
        float fB2 = (float) g24Var.b(f2);
        float fB3 = (float) g24Var.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fB3) + ((fArr[3] * fB2) + (fArr[0] * fB)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))));
    }

    @Override // defpackage.p50
    public final float e(float f, float f2, float f3) {
        double d = f;
        g24 g24Var = this.p;
        float fB = (float) g24Var.b(d);
        float fB2 = (float) g24Var.b(f2);
        float fB3 = (float) g24Var.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // defpackage.p50
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k24.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        k24 k24Var = (k24) obj;
        if (Float.compare(k24Var.e, this.e) != 0 || Float.compare(k24Var.f, this.f) != 0 || !h12.c(this.d, k24Var.d) || !Arrays.equals(this.h, k24Var.h)) {
            return false;
        }
        sw4 sw4Var = k24Var.g;
        sw4 sw4Var2 = this.g;
        if (sw4Var2 != null) {
            return h12.c(sw4Var2, sw4Var);
        }
        if (sw4Var == null) {
            return true;
        }
        if (h12.c(this.k, k24Var.k)) {
            return h12.c(this.n, k24Var.n);
        }
        return false;
    }

    @Override // defpackage.p50
    public final long f(float f, float f2, float f3, float f4, p50 p50Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        g24 g24Var = this.m;
        return e35.a((float) g24Var.b(f5), (float) g24Var.b(f6), (float) g24Var.b(f7), f4, p50Var);
    }

    @Override // defpackage.p50
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        sw4 sw4Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (sw4Var != null ? sw4Var.hashCode() : 0);
        if (sw4Var != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public k24(String str, float[] fArr, z95 z95Var, final sw4 sw4Var, int i) {
        double d;
        ks0 ks0Var;
        ks0 ks0Var2;
        double d2 = sw4Var.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = sw4Var.g;
        double d4 = sw4Var.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            ks0Var = new ks0() { // from class: i24
                @Override // defpackage.ks0
                public final double b(double d5) {
                    int i5 = i4;
                    sw4 sw4Var2 = sw4Var;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = s50.a;
                            return s50.a(sw4Var2, d5);
                        case 1:
                            float[] fArr3 = s50.a;
                            return s50.c(sw4Var2, d5);
                        case 2:
                            double d6 = sw4Var2.b;
                            return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            double d7 = sw4Var2.b;
                            double d8 = sw4Var2.c;
                            double d9 = sw4Var2.d;
                            return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                        case 4:
                            float[] fArr4 = s50.a;
                            return s50.b(sw4Var2, d5);
                        case 5:
                            float[] fArr5 = s50.a;
                            return s50.d(sw4Var2, d5);
                        case 6:
                            double d10 = sw4Var2.b;
                            double d11 = sw4Var2.c;
                            double d12 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = sw4Var2.b;
                            double d14 = sw4Var2.c;
                            double d15 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                ks0Var = new ks0() { // from class: i24
                    @Override // defpackage.ks0
                    public final double b(double d5) {
                        int i6 = i5;
                        sw4 sw4Var2 = sw4Var;
                        switch (i6) {
                            case 0:
                                float[] fArr2 = s50.a;
                                return s50.a(sw4Var2, d5);
                            case 1:
                                float[] fArr3 = s50.a;
                                return s50.c(sw4Var2, d5);
                            case 2:
                                double d6 = sw4Var2.b;
                                return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                double d7 = sw4Var2.b;
                                double d8 = sw4Var2.c;
                                double d9 = sw4Var2.d;
                                return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                            case 4:
                                float[] fArr4 = s50.a;
                                return s50.b(sw4Var2, d5);
                            case 5:
                                float[] fArr5 = s50.a;
                                return s50.d(sw4Var2, d5);
                            case 6:
                                double d10 = sw4Var2.b;
                                double d11 = sw4Var2.c;
                                double d12 = sw4Var2.d;
                                return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = sw4Var2.b;
                                double d14 = sw4Var2.c;
                                double d15 = sw4Var2.d;
                                return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                ks0Var = new ks0() { // from class: i24
                    @Override // defpackage.ks0
                    public final double b(double d5) {
                        int i7 = i6;
                        sw4 sw4Var2 = sw4Var;
                        switch (i7) {
                            case 0:
                                float[] fArr2 = s50.a;
                                return s50.a(sw4Var2, d5);
                            case 1:
                                float[] fArr3 = s50.a;
                                return s50.c(sw4Var2, d5);
                            case 2:
                                double d6 = sw4Var2.b;
                                return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                double d7 = sw4Var2.b;
                                double d8 = sw4Var2.c;
                                double d9 = sw4Var2.d;
                                return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                            case 4:
                                float[] fArr4 = s50.a;
                                return s50.b(sw4Var2, d5);
                            case 5:
                                float[] fArr5 = s50.a;
                                return s50.d(sw4Var2, d5);
                            case 6:
                                double d10 = sw4Var2.b;
                                double d11 = sw4Var2.c;
                                double d12 = sw4Var2.d;
                                return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = sw4Var2.b;
                                double d14 = sw4Var2.c;
                                double d15 = sw4Var2.d;
                                return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                ks0Var = new ks0() { // from class: i24
                    @Override // defpackage.ks0
                    public final double b(double d5) {
                        int i8 = i7;
                        sw4 sw4Var2 = sw4Var;
                        switch (i8) {
                            case 0:
                                float[] fArr2 = s50.a;
                                return s50.a(sw4Var2, d5);
                            case 1:
                                float[] fArr3 = s50.a;
                                return s50.c(sw4Var2, d5);
                            case 2:
                                double d6 = sw4Var2.b;
                                return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                double d7 = sw4Var2.b;
                                double d8 = sw4Var2.c;
                                double d9 = sw4Var2.d;
                                return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                            case 4:
                                float[] fArr4 = s50.a;
                                return s50.b(sw4Var2, d5);
                            case 5:
                                float[] fArr5 = s50.a;
                                return s50.d(sw4Var2, d5);
                            case 6:
                                double d10 = sw4Var2.b;
                                double d11 = sw4Var2.c;
                                double d12 = sw4Var2.d;
                                return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = sw4Var2.b;
                                double d14 = sw4Var2.c;
                                double d15 = sw4Var2.d;
                                return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            ks0Var2 = new ks0() { // from class: i24
                @Override // defpackage.ks0
                public final double b(double d5) {
                    int i8 = i2;
                    sw4 sw4Var2 = sw4Var;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = s50.a;
                            return s50.a(sw4Var2, d5);
                        case 1:
                            float[] fArr3 = s50.a;
                            return s50.c(sw4Var2, d5);
                        case 2:
                            double d6 = sw4Var2.b;
                            return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            double d7 = sw4Var2.b;
                            double d8 = sw4Var2.c;
                            double d9 = sw4Var2.d;
                            return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                        case 4:
                            float[] fArr4 = s50.a;
                            return s50.b(sw4Var2, d5);
                        case 5:
                            float[] fArr5 = s50.a;
                            return s50.d(sw4Var2, d5);
                        case 6:
                            double d10 = sw4Var2.b;
                            double d11 = sw4Var2.c;
                            double d12 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = sw4Var2.b;
                            double d14 = sw4Var2.c;
                            double d15 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            ks0Var2 = new ks0() { // from class: i24
                @Override // defpackage.ks0
                public final double b(double d5) {
                    int i8 = i3;
                    sw4 sw4Var2 = sw4Var;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = s50.a;
                            return s50.a(sw4Var2, d5);
                        case 1:
                            float[] fArr3 = s50.a;
                            return s50.c(sw4Var2, d5);
                        case 2:
                            double d6 = sw4Var2.b;
                            return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            double d7 = sw4Var2.b;
                            double d8 = sw4Var2.c;
                            double d9 = sw4Var2.d;
                            return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                        case 4:
                            float[] fArr4 = s50.a;
                            return s50.b(sw4Var2, d5);
                        case 5:
                            float[] fArr5 = s50.a;
                            return s50.d(sw4Var2, d5);
                        case 6:
                            double d10 = sw4Var2.b;
                            double d11 = sw4Var2.c;
                            double d12 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = sw4Var2.b;
                            double d14 = sw4Var2.c;
                            double d15 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            ks0Var2 = new ks0() { // from class: i24
                @Override // defpackage.ks0
                public final double b(double d5) {
                    int i9 = i8;
                    sw4 sw4Var2 = sw4Var;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = s50.a;
                            return s50.a(sw4Var2, d5);
                        case 1:
                            float[] fArr3 = s50.a;
                            return s50.c(sw4Var2, d5);
                        case 2:
                            double d6 = sw4Var2.b;
                            return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            double d7 = sw4Var2.b;
                            double d8 = sw4Var2.c;
                            double d9 = sw4Var2.d;
                            return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                        case 4:
                            float[] fArr4 = s50.a;
                            return s50.b(sw4Var2, d5);
                        case 5:
                            float[] fArr5 = s50.a;
                            return s50.d(sw4Var2, d5);
                        case 6:
                            double d10 = sw4Var2.b;
                            double d11 = sw4Var2.c;
                            double d12 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = sw4Var2.b;
                            double d14 = sw4Var2.c;
                            double d15 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            ks0Var2 = new ks0() { // from class: i24
                @Override // defpackage.ks0
                public final double b(double d5) {
                    int i10 = i9;
                    sw4 sw4Var2 = sw4Var;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = s50.a;
                            return s50.a(sw4Var2, d5);
                        case 1:
                            float[] fArr3 = s50.a;
                            return s50.c(sw4Var2, d5);
                        case 2:
                            double d6 = sw4Var2.b;
                            return d5 >= sw4Var2.e ? Math.pow((d6 * d5) + sw4Var2.c, sw4Var2.a) : sw4Var2.d * d5;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            double d7 = sw4Var2.b;
                            double d8 = sw4Var2.c;
                            double d9 = sw4Var2.d;
                            return d5 >= sw4Var2.e ? Math.pow((d7 * d5) + d8, sw4Var2.a) + sw4Var2.f : (d9 * d5) + sw4Var2.g;
                        case 4:
                            float[] fArr4 = s50.a;
                            return s50.b(sw4Var2, d5);
                        case 5:
                            float[] fArr5 = s50.a;
                            return s50.d(sw4Var2, d5);
                        case 6:
                            double d10 = sw4Var2.b;
                            double d11 = sw4Var2.c;
                            double d12 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d12 ? (Math.pow(d5, 1.0d / sw4Var2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = sw4Var2.b;
                            double d14 = sw4Var2.c;
                            double d15 = sw4Var2.d;
                            return d5 >= sw4Var2.e * d15 ? (Math.pow(d5 - sw4Var2.f, 1.0d / sw4Var2.a) - d14) / d13 : (d5 - sw4Var2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, z95Var, null, ks0Var, ks0Var2, 0.0f, 1.0f, sw4Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k24(String str, float[] fArr, z95 z95Var, final double d, float f, float f2, int i) {
        ks0 ks0Var;
        ks0 ks0Var2 = r;
        if (d == 1.0d) {
            ks0Var = ks0Var2;
        } else {
            final int i2 = 0;
            ks0Var = new ks0() { // from class: h24
                @Override // defpackage.ks0
                public final double b(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            ks0Var2 = new ks0() { // from class: h24
                @Override // defpackage.ks0
                public final double b(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        ks0 ks0Var3 = ks0Var2;
        this(str, fArr, z95Var, null, ks0Var, ks0Var3, f, f2, new sw4(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
