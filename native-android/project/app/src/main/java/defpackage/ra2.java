package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra2 {
    public static final ra2 d = null;
    public final float a;
    public final int b;
    public final int c;

    static {
        d = new ra2(17, oa2.c, 0);
    }

    public ra2(int r1, float r2, int r3) {
        this.a = r2;
        this.b = r1;
        this.c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ra2) == true) goto L8;
        return false;
    L8:
        ra2 r6 = (ra2) r5;
        float r1 = r6.a;
        float r3 = oa2.b;
        if (Float.compare(this.a, r1) == 0) goto L11;
    L15:
        return false;
    L11:
        if (this.b != r6.b) goto L15;
        if (this.c != r6.c) goto L15;
        return true;
    }

    public final int hashCode() {
        float r0 = oa2.b;
        int r1 = Float.hashCode(this.a) * 31;
        int r2 = f34.d(this.b, r1, 31);
        return Integer.hashCode(this.c) + r2;
    }

    public final String toString() {
        String r0 = oa2.b(this.a);
        String r1 = "Invalid";
        int r2 = this.b;
        if (r2 != 1) goto L6;
        String r3 = "LineHeightStyle.Trim.FirstLineTop";
    L14:
        int r5 = this.c;
        if (r5 != 0) goto L17;
        r1 = "LineHeightStyle.Mode.Fixed";
    L23:
        return b11.q(b11.u("LineHeightStyle(alignment=", r0, ", trim=", r3, ",mode="), r1, ")");
    L17:
        if (r5 != 1) goto L20;
        r1 = "LineHeightStyle.Mode.Minimum";
        goto L23
    L20:
        if (r5 != 2) goto L23;
        r1 = "LineHeightStyle.Mode.Tight";
        goto L23
    L6:
        if (r2 != 16) goto L9;
        r3 = "LineHeightStyle.Trim.LastLineBottom";
        goto L14
    L9:
        if (r2 != 17) goto L11;
        r3 = "LineHeightStyle.Trim.Both";
        goto L14
    L11:
        if (r2 != 0) goto L13;
        r3 = "LineHeightStyle.Trim.None";
        goto L14
    L13:
        r3 = "Invalid";
        goto L14
    }
}
