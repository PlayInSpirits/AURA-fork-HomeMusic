package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v72 {
    public final int a;
    public final int b;

    public v72(int r3, int r4) {
        this.a = r3;
        this.b = r4;
        boolean r2 = false;
        if (r3 < 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L8;
        fz1.a("negative start index");
    L8:
        if (r4 < r3) goto L10;
        r2 = true;
    L10:
        if (r2 == true) goto L13;
        fz1.a("end index greater than start");
        return;
    L13:
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v72) == true) goto L8;
        return false;
    L8:
        v72 r6 = (v72) r5;
        if (this.a == r6.a) goto L12;
        return false;
    L12:
        if (this.b == r6.b) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.a) * 31;
        return Integer.hashCode(this.b) + r0;
    }

    public final String toString() {
        return b11.n("Interval(start=", ", end=", this.a, this.b, ")");
    }
}
