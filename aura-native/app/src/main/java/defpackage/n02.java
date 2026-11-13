/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class n02 {
    public final long a;

    public n02(long l16) {
        this.a = l16;
    }

    public static final boolean a(long l16, long l17) {
        return l16 == l17;
    }

    public static String b(long l16) {
        int n16 = (int)(l16 >> 32);
        int n17 = (int)(l16 & 0xFFFFFFFFL);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n16);
        stringBuilder.append(" x ");
        stringBuilder.append(n17);
        return stringBuilder.toString();
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof n02 && this.a == (l16 = ((n02)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return n02.b(this.a);
    }
}

