package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements ry0 {
    public final float n;
    public final float o;
    public final float p;
    public final float q;

    public gg0(float f, float f2) {
        this.n = f;
        this.o = f2;
        if (Float.isNaN(f) || Float.isNaN(0.0f) || Float.isNaN(f2) || Float.isNaN(1.0f)) {
            qo3.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", 0.0, " + f2 + ", 1.0.");
        }
        float[] fArr = new float[5];
        double d = -Math.sqrt(9.0d);
        int iS = te5.S((float) ((-(d + 3.0d)) / (-6.0d)), fArr, 0);
        int iS2 = te5.S((float) ((d - 3.0d) / (-6.0d)), fArr, iS) + iS;
        if (iS2 > 1) {
            float f3 = fArr[0];
            float f4 = fArr[1];
            if (f3 > f4) {
                fArr[0] = f4;
                fArr[1] = f3;
            } else if (f3 == f4) {
                iS2--;
            }
        }
        int iS3 = te5.S(0.5f, fArr, iS2) + iS2;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iS3; i++) {
            float f5 = fArr[i];
            float f6 = ((((((-2.0f) * f5) + 3.0f) * f5) + 0.0f) * f5) + 0.0f;
            fMin = Math.min(fMin, f6);
            fMax = Math.max(fMax, f6);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.p = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.q = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e A[PHI: r3
  0x008e: PHI (r3v23 float) = (r3v5 float), (r3v12 float), (r3v18 float), (r3v27 float), (r3v33 float) binds: [B:123:0x022b, B:113:0x01fd, B:89:0x01b5, B:45:0x00df, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x015e A[PHI: r12
  0x015e: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:66:0x015c, B:79:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ry0
    public final float b(float f) {
        float f2;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = Math.max(f, 1.1920929E-7f);
        float f3 = 0.0f - fMax;
        float f4 = this.n;
        float f5 = f4 - fMax;
        float f6 = this.o;
        float f7 = f6 - fMax;
        double d = f3;
        double d2 = ((d - (((double) f5) * 2.0d)) + ((double) f7)) * 3.0d;
        double d3 = ((double) (f5 - f3)) * 3.0d;
        double d4 = (((double) (f5 - f7)) * 3.0d) + ((double) (-f3)) + ((double) (1.0f - fMax));
        float f8 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double dSqrt = Math.sqrt(-d10);
                double d13 = (-d9) / dSqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double dAcos = Math.acos(d13);
                double dB = rr2.B((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dB) - d12);
                float f9 = fCos < 0.0f ? 0.0f : fCos;
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                if (Math.abs(f9 - fCos) > 1.05E-6f) {
                    f9 = Float.NaN;
                }
                if (Float.isNaN(f9)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dB) - d12);
                    f9 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f9 > 1.0f) {
                        f9 = 1.0f;
                    }
                    if (Math.abs(f9 - fCos2) > 1.05E-6f) {
                        f9 = Float.NaN;
                    }
                    if (Float.isNaN(f9)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dB) - d12);
                        f2 = fCos3 < 0.0f ? 0.0f : fCos3;
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                        if (Math.abs(f2 - fCos3) <= 1.05E-6f) {
                            f8 = f2;
                        }
                    } else {
                        f8 = f9;
                    }
                } else {
                    f8 = f9;
                }
            } else if (d11 == 0.0d) {
                float f10 = -rr2.B((float) d9);
                float f11 = (float) d12;
                float f12 = (2.0f * f10) - f11;
                float f13 = f12 < 0.0f ? 0.0f : f12;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (Math.abs(f13 - f12) > 1.05E-6f) {
                    f13 = Float.NaN;
                }
                if (Float.isNaN(f13)) {
                    float f14 = (-f10) - f11;
                    f2 = f14 < 0.0f ? 0.0f : f14;
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (Math.abs(f2 - f14) <= 1.05E-6f) {
                        f8 = f2;
                    }
                } else {
                    f8 = f13;
                }
            } else {
                double dSqrt2 = Math.sqrt(d11);
                float fB = (float) (((double) (rr2.B((float) ((-d9) + dSqrt2)) - rr2.B((float) (d9 + dSqrt2)))) - d12);
                f2 = fB < 0.0f ? 0.0f : fB;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (Math.abs(f2 - fB) <= 1.05E-6f) {
                    f8 = f2;
                }
            }
        } else if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f15 = (float) ((dSqrt3 - d3) / d14);
            float f16 = f15 < 0.0f ? 0.0f : f15;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            if (Math.abs(f16 - f15) > 1.05E-6f) {
                f16 = Float.NaN;
            }
            if (Float.isNaN(f16)) {
                float f17 = (float) (((-d3) - dSqrt3) / d14);
                f2 = f17 < 0.0f ? 0.0f : f17;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (Math.abs(f2 - f17) <= 1.05E-6f) {
                    f8 = f2;
                }
            } else {
                f8 = f16;
            }
        } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
            float f18 = (float) ((-d) / d3);
            f2 = f18 < 0.0f ? 0.0f : f18;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (Math.abs(f2 - f18) <= 1.05E-6f) {
                f8 = f2;
            }
        }
        if (Float.isNaN(f8)) {
            StringBuilder sbR = b11.r("The cubic curve with parameters (", f4, ", 0.0, ", f6, ", 1.0) has no solution at ");
            sbR.append(f);
            throw new IllegalArgumentException(sbR.toString());
        }
        float f19 = (((((-0.6666666f) * f8) + 1.0f) * f8) + 0.0f) * 3.0f * f8;
        float f20 = this.p;
        if (f19 < f20) {
            f19 = f20;
        }
        float f21 = this.q;
        return f19 > f21 ? f21 : f19;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gg0)) {
            return false;
        }
        gg0 gg0Var = (gg0) obj;
        return this.n == gg0Var.n && this.o == gg0Var.o;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + b11.d(b11.d(Float.hashCode(this.n) * 31, 0.0f, 31), this.o, 31);
    }

    public final String toString() {
        return xa3.f("CubicBezierEasing(a=", this.n, ", b=0.0, c=", this.o, ", d=1.0)");
    }
}
