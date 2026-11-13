/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class ps4 {
    public final int a;

    public ps4(int n16) {
        this.a = n16;
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof ps4 && this.a == (n16 = ((ps4)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int n16 = this.a;
        if (n16 == 1) {
            return "Linearity.Linear";
        }
        if (n16 == 2) {
            return "Linearity.FontHinting";
        }
        if (n16 == 3) {
            return "Linearity.None";
        }
        return "Invalid";
    }
}

