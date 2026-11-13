/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.b11;

public final class g02 {
    public final long a;

    public g02(long l16) {
        this.a = l16;
    }

    public static final boolean a(long l16, long l17) {
        return l16 == l17;
    }

    public static final long b(long l16, long l17) {
        int n16 = (int)(l16 >> 32);
        int n17 = (int)(l17 >> 32);
        int n18 = (int)(l16 & 0xFFFFFFFFL);
        int n19 = (int)(l17 & 0xFFFFFFFFL);
        return (long)(n16 - n17) << 32 | (long)(n18 - n19) & 0xFFFFFFFFL;
    }

    public static final long c(long l16, long l17) {
        int n16 = (int)(l16 >> 32);
        int n17 = (int)(l17 >> 32);
        int n18 = (int)(l16 & 0xFFFFFFFFL);
        int n19 = (int)(l17 & 0xFFFFFFFFL);
        return (long)(n16 + n17) << 32 | (long)(n18 + n19) & 0xFFFFFFFFL;
    }

    public static String d(long l16) {
        return b11.n("(", ", ", (int)(l16 >> 32), (int)(l16 & 0xFFFFFFFFL), ")");
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof g02 && this.a == (l16 = ((g02)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return g02.d(this.a);
    }
}

