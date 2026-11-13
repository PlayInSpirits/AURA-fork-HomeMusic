/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class mr4 {
    public final int a;

    public mr4(int n16) {
        this.a = n16;
    }

    public static String a(int n16) {
        if (n16 == 1) {
            return "Left";
        }
        if (n16 == 2) {
            return "Right";
        }
        if (n16 == 3) {
            return "Center";
        }
        if (n16 == 4) {
            return "Justify";
        }
        if (n16 == 5) {
            return "Start";
        }
        if (n16 == 6) {
            return "End";
        }
        if (n16 == 0) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof mr4 && this.a == (n16 = ((mr4)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return mr4.a(this.a);
    }
}

