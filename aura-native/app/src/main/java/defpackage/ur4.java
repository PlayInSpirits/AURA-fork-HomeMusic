/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class ur4 {
    public final int a;

    public ur4(int n16) {
        this.a = n16;
    }

    public static String a(int n16) {
        if (n16 == 1) {
            return "Ltr";
        }
        if (n16 == 2) {
            return "Rtl";
        }
        if (n16 == 3) {
            return "Content";
        }
        if (n16 == 4) {
            return "ContentOrLtr";
        }
        if (n16 == 5) {
            return "ContentOrRtl";
        }
        if (n16 == 0) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof ur4 && this.a == (n16 = ((ur4)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ur4.a(this.a);
    }
}

