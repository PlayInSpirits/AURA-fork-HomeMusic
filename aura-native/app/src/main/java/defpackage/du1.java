/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class du1 {
    public final int a;

    public du1(int n16) {
        this.a = n16;
    }

    public static String a(int n16) {
        if (n16 == 1) {
            return "Hyphens.None";
        }
        if (n16 == 2) {
            return "Hyphens.Auto";
        }
        if (n16 == 0) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof du1 && this.a == (n16 = ((du1)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return du1.a(this.a);
    }
}

