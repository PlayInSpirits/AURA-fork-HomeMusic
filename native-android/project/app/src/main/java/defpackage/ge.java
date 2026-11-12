package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ge {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ge(int r1, int r2, Object r3, String r4) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
        this.d = r4;
        if (r1 > r2) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        dz1.a("Reversed range is not supported");
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ge) == true) goto L8;
        return false;
    L8:
        ge r6 = (ge) r5;
        if (h12.c(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (this.b == r6.b) goto L15;
        return false;
    L15:
        if (this.c == r6.c) goto L18;
        return false;
    L18:
        if (h12.c(this.d, r6.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        Object r0 = this.a;
        if (r0 != null) goto L5;
        int r1 = 0;
    L6:
        int r2 = this.b;
        int r3 = f34.d(r2, r1 * 31, 31);
        int r4 = f34.d(this.c, r3, 31);
        return this.d.hashCode() + r4;
    L5:
        r1 = r0.hashCode();
        goto L6
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public ge(int r2, int r3, Object r4) {
        this(r2, r3, r4, "");
    }
}
