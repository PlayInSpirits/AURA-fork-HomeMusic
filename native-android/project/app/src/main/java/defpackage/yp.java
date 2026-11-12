package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yp {
    public final int a;
    public final int b;
    public final int c;

    public yp(int r1, int r2, int r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof yp) == true) goto L8;
        return false;
    L8:
        yp r6 = (yp) r5;
        if (this.a == r6.a) goto L12;
        return false;
    L12:
        if (this.b == r6.b) goto L15;
        return false;
    L15:
        if (this.c == r6.c) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r0 = Integer.hashCode(this.a) * 31;
        int r1 = f34.d(this.b, r0, 31);
        return Integer.hashCode(this.c) + r1;
    }

    public final String toString() {
        return f34.i(b11.t("PlayNextRequest(insertPos=", ", count=", this.a, this.b, ", target="), this.c, ")");
    }
}
