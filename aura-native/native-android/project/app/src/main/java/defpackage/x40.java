package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x40 {
    public static final long b = e35.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;
    public final long a;

    static {
        e35.c(4282664004L);
        c = e35.c(4287137928L);
        e35.c(4291611852L);
        e35.c(4294967295L);
        d = e35.c(4294901760L);
        e35.c(4278255360L);
        e = e35.c(4278190335L);
        e35.c(4294967040L);
        e35.c(4278255615L);
        e35.c(4294902015L);
        f = e35.b(0);
        g = e35.a(0.0f, 0.0f, 0.0f, 0.0f, s50.u);
    }

    public static final long a(long j, p50 p50Var) {
        xa0 xa0VarM;
        p50 p50Var2 = s50.y[(int) (63 & j)];
        int i = p50Var2.c;
        int i2 = p50Var.c;
        if ((i | i2) < 0) {
            xa0VarM = uo.m(p50Var2, p50Var);
        } else {
            i03 i03Var = ya0.a;
            int i3 = i | (i2 << 6);
            Object objB = i03Var.b(i3);
            if (objB == null) {
                objB = uo.m(p50Var2, p50Var);
                i03Var.i(i3, objB);
            }
            xa0VarM = (xa0) objB;
        }
        return xa0VarM.a(j);
    }

    public static long b(long j, float f2) {
        return e35.a(g(j), f(j), e(j), f2, s50.y[(int) (j & 63)]);
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final float d(long j) {
        float fW;
        float f2;
        if ((63 & j) == 0) {
            fW = (float) rr2.W((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fW = (float) rr2.W((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fW / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) rr2.W((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - b81.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float f(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) rr2.W((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - b81.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) rr2.W((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - b81.a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String h(long j) {
        float fG = g(j);
        float f2 = f(j);
        float fE = e(j);
        float fD = d(j);
        String str = s50.y[(int) (j & 63)].a;
        StringBuilder sbR = b11.r("Color(", fG, ", ", f2, ", ");
        sbR.append(fE);
        sbR.append(", ");
        sbR.append(fD);
        sbR.append(", ");
        return b11.q(sbR, str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x40) {
            return this.a == ((x40) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
