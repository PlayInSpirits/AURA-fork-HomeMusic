package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra2 {
    public static final ra2 d = new ra2(17, oa2.c, 0);
    public final float a;
    public final int b;
    public final int c;

    public ra2(int i, float f, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra2)) {
            return false;
        }
        ra2 ra2Var = (ra2) obj;
        float f = ra2Var.a;
        float f2 = oa2.b;
        return Float.compare(this.a, f) == 0 && this.b == ra2Var.b && this.c == ra2Var.c;
    }

    public final int hashCode() {
        float f = oa2.b;
        return Integer.hashCode(this.c) + f34.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        String str;
        String strB = oa2.b(this.a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return b11.q(b11.u("LineHeightStyle(alignment=", strB, ", trim=", str, ",mode="), str2, ")");
    }
}
