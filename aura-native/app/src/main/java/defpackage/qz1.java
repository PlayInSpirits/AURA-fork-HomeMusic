/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class qz1 {
    public final int a;

    public qz1(int n16) {
        this.a = n16;
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof qz1 && this.a == (n16 = ((qz1)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int n16 = this.a;
        if (n16 == 1) {
            return "Touch";
        }
        if (n16 == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}

