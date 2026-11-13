/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ct4;
import defpackage.su3;

public final class bt4 {
    public static final ct4[] b = new ct4[]{new ct4(0L), new ct4(0x100000000L), new ct4(0x200000000L)};
    public static final long c = su3.z(0L, Float.NaN);
    public final long a;

    public bt4(long l16) {
        this.a = l16;
    }

    public static final boolean a(long l16, long l17) {
        return l16 == l17;
    }

    public static final long b(long l16) {
        int n16 = (int)((l16 & 0xFF00000000L) >>> 32);
        return bt4.b[n16].a;
    }

    public static final float c(long l16) {
        return Float.intBitsToFloat((int)(l16 & 0xFFFFFFFFL));
    }

    public static String d(long l16) {
        long l17 = bt4.b(l16);
        if (ct4.a(l17, 0L)) {
            return "Unspecified";
        }
        if (ct4.a(l17, 0x100000000L)) {
            float f16 = bt4.c(l16);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f16);
            stringBuilder.append(".sp");
            return stringBuilder.toString();
        }
        if (ct4.a(l17, 0x200000000L)) {
            float f17 = bt4.c(l16);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f17);
            stringBuilder.append(".em");
            return stringBuilder.toString();
        }
        return "Invalid";
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof bt4 && this.a == (l16 = ((bt4)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return bt4.d(this.a);
    }
}

