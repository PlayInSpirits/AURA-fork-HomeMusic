/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class pa2 {
    public final int a;

    public pa2(int n16) {
        this.a = n16;
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof pa2 && this.a == (n16 = ((pa2)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int n16 = this.a;
        if (n16 == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (n16 == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        if (n16 == 2) {
            return "LineHeightStyle.Mode.Tight";
        }
        return "Invalid";
    }
}

