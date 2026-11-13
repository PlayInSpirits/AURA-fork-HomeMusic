/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ez1;
import defpackage.qc0;

public final class nc0 {
    public final long a;

    public nc0(long l16) {
        this.a = l16;
    }

    public static long a(int n16, int n17, long l16) {
        int n18 = nc0.h(l16);
        int n19 = nc0.g(l16);
        if (n18 < n16 || n19 < n17 || n16 < 0 || n17 < 0) {
            ez1.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return qc0.g(n16, n18, n17, n19);
    }

    public static final boolean b(long l16, long l17) {
        return l16 == l17;
    }

    public static final boolean c(long l16) {
        int n16 = (int)(3L & l16);
        return ((int)(l16 >> (n16 = ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1)) + 46) & (1 << 18 - n16) - 1) != 0;
    }

    public static final boolean d(long l16) {
        int n16 = (int)(3L & l16);
        return ((int)(l16 >> 33) & (1 << ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1) + 13) - 1) != 0;
    }

    public static final boolean e(long l16) {
        int n16 = (int)(3L & l16);
        n16 = ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1);
        int n17 = (1 << 18 - n16) - 1;
        int n18 = (int)(l16 >> n16 + 15);
        n16 = (n16 = (int)(l16 >> n16 + 46) & n17) == 0 ? Integer.MAX_VALUE : --n16;
        return (n18 & n17) == n16;
    }

    public static final boolean f(long l16) {
        int n16 = (int)(3L & l16);
        int n17 = (1 << ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1) + 13) - 1;
        int n18 = (int)(l16 >> 2);
        n16 = (int)(l16 >> 33) & n17;
        n16 = n16 == 0 ? Integer.MAX_VALUE : --n16;
        return (n18 & n17) == n16;
    }

    public static final int g(long l16) {
        int n16 = (int)(3L & l16);
        n16 = ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1);
        if ((n16 = (int)(l16 >> n16 + 46) & (1 << 18 - n16) - 1) == 0) {
            return Integer.MAX_VALUE;
        }
        return n16 - 1;
    }

    public static final int h(long l16) {
        int n16 = (int)(3L & l16);
        if ((n16 = (int)(l16 >> 33) & (1 << ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1) + 13) - 1) == 0) {
            return Integer.MAX_VALUE;
        }
        return n16 - 1;
    }

    public static final int i(long l16) {
        int n16 = (int)(3L & l16);
        n16 = ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1);
        return (int)(l16 >> n16 + 15) & (1 << 18 - n16) - 1;
    }

    public static final int j(long l16) {
        int n16 = (int)(3L & l16);
        return (int)(l16 >> 2) & (1 << ((n16 & 2) >> 1) * 3 + ((n16 & 1) << 1) + 13) - 1;
    }

    public static String k(long l16) {
        int n16 = nc0.h(l16);
        String string = "Infinity";
        String string2 = n16 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(n16);
        n16 = nc0.g(l16);
        if (n16 != Integer.MAX_VALUE) {
            string = String.valueOf(n16);
        }
        n16 = nc0.j(l16);
        int n17 = nc0.i(l16);
        StringBuilder stringBuilder = new StringBuilder("Constraints(minWidth = ");
        stringBuilder.append(n16);
        stringBuilder.append(", maxWidth = ");
        stringBuilder.append(string2);
        stringBuilder.append(", minHeight = ");
        stringBuilder.append(n17);
        stringBuilder.append(", maxHeight = ");
        stringBuilder.append(string);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof nc0 && this.a == (l16 = ((nc0)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nc0.k(this.a);
    }
}

