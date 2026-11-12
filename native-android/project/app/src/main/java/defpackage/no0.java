package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class no0 {
    public int a;

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof no0) == true) goto L9;
        return false;
    L9:
        if (this.a == ((no0) r4).a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b11.j(this.a, "DeltaCounter(count=", ")");
    }
}
