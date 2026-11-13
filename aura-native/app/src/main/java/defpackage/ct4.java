/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class ct4 {
    public final long a;

    public ct4(long l16) {
        this.a = l16;
    }

    public static final boolean a(long l16, long l17) {
        return l16 == l17;
    }

    public final boolean equals(Object object) {
        long l16;
        return object instanceof ct4 && this.a == (l16 = ((ct4)object).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long l16 = this.a;
        if (ct4.a(l16, 0L)) {
            return "Unspecified";
        }
        if (ct4.a(l16, 0x100000000L)) {
            return "Sp";
        }
        if (ct4.a(l16, 0x200000000L)) {
            return "Em";
        }
        return "Invalid";
    }
}

