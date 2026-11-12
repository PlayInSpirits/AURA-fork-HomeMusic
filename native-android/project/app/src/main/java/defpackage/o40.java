package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o40 {
    public final int a;
    public final int b;

    public o40(int r1, int r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o40) == true) goto L8;
        return false;
    L8:
        o40 r6 = (o40) r5;
        int r1 = r6.a;
        if (this.a == r1) goto L12;
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
        return b11.n("CollectionInfo(rowCount=", ", columnCount=", this.a, this.b, ")");
    }
}
