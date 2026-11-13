/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class eb1 {
    public final int a;

    public eb1(int n16) {
        this.a = n16;
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof eb1 && this.a == (n16 = ((eb1)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int n16 = this.a;
        if (n16 == 0) {
            return "Normal";
        }
        if (n16 == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}

