/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class o91 {
    public final int a;

    public o91(int n16) {
        this.a = n16;
    }

    public static String a(int n16) {
        if (n16 == 1) {
            return "Next";
        }
        if (n16 == 2) {
            return "Previous";
        }
        if (n16 == 3) {
            return "Left";
        }
        if (n16 == 4) {
            return "Right";
        }
        if (n16 == 5) {
            return "Up";
        }
        if (n16 == 6) {
            return "Down";
        }
        if (n16 == 7) {
            return "Enter";
        }
        if (n16 == 8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof o91 && this.a == (n16 = ((o91)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return o91.a(this.a);
    }
}

