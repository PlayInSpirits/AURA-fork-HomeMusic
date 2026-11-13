/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class fb1 {
    public final int a;

    public fb1(int n16) {
        this.a = n16;
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof fb1 && this.a == (n16 = ((fb1)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int n16 = this.a;
        if (n16 == 0) {
            return "None";
        }
        if (n16 == 1) {
            return "Weight";
        }
        if (n16 == 2) {
            return "Style";
        }
        if (n16 == 65535) {
            return "All";
        }
        return "Invalid";
    }
}

