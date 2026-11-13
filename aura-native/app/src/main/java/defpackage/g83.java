/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.f34;
import defpackage.gh0;

public final class g83 {
    public final long a;

    public g83(long l16) {
        this.a = l16;
    }

    public static long a(int n16, long l16) {
        float f16 = 0.0f;
        float f17 = (n16 & 1) != 0 ? Float.intBitsToFloat((int)(l16 >> 32)) : 0.0f;
        if ((n16 & 2) != 0) {
            f16 = Float.intBitsToFloat((int)(l16 & 0xFFFFFFFFL));
        }
        return (long)Float.floatToRawIntBits(f17) << 32 | (long)Float.floatToRawIntBits(f16) & 0xFFFFFFFFL;
    }

    public static final boolean b(long l16, long l17) {
        return l16 == l17;
    }

    public static final float c(long l16) {
        float f16 = Float.intBitsToFloat((int)(l16 >> 32));
        float f17 = Float.intBitsToFloat((int)(l16 & 0xFFFFFFFFL));
        return (float)Math.sqrt(f17 * f17 + f16 * f16);
    }

    public static final long d(long l16, long l17) {
        float f16 = Float.intBitsToFloat((int)(l16 >> 32));
        float f17 = Float.intBitsToFloat((int)(l17 >> 32));
        float f18 = Float.intBitsToFloat((int)(l16 & 0xFFFFFFFFL));
        float f19 = Float.intBitsToFloat((int)(l17 & 0xFFFFFFFFL));
        return (long)Float.floatToRawIntBits(f16 - f17) << 32 | (long)Float.floatToRawIntBits(f18 - f19) & 0xFFFFFFFFL;
    }

    public static final long e(long l16, long l17) {
        float f16 = Float.intBitsToFloat((int)(l16 >> 32));
        float f17 = Float.intBitsToFloat((int)(l17 >> 32));
        float f18 = Float.intBitsToFloat((int)(l16 & 0xFFFFFFFFL));
        float f19 = Float.intBitsToFloat((int)(l17 & 0xFFFFFFFFL));
        l16 = Float.floatToRawIntBits(f17 + f16);
        return (long)Float.floatToRawIntBits(f19 + f18) & 0xFFFFFFFFL | l16 << 32;
    }

    public static final long f(long l16, float f16) {
        float f17 = Float.intBitsToFloat((int)(l16 >> 32));
        float f18 = Float.intBitsToFloat((int)(l16 & 0xFFFFFFFFL));
        return (long)Float.floatToRawIntBits(f17 * f16) << 32 | (long)Float.floatToRawIntBits(f18 * f16) & 0xFFFFFFFFL;
    }

    public static String g(long l16) {
        if ((0x7FFFFFFF7FFFFFFFL & l16) != 9205357640488583168L) {
            return f34.h("Offset(", gh0.F(Float.intBitsToFloat((int)(l16 >> 32))), ", ", gh0.F(Float.intBitsToFloat((int)(l16 & 0xFFFFFFFFL))), ")");
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof g83 && this.a == (l16 = ((g83)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g83.g(this.a);
    }
}

