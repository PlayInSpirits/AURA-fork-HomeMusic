/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class qa2 {
    public final int a;

    public qa2(int n16) {
        this.a = n16;
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof qa2 && this.a == (n16 = ((qa2)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int n16 = this.a;
        if (n16 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (n16 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (n16 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        if (n16 == 0) {
            return "LineHeightStyle.Trim.None";
        }
        return "Invalid";
    }
}

