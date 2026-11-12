package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 extends e35 {
    public final int p;

    public r9(int r1) {
        this.p = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof r9) == true) goto L5;
        return false;
    L5:
        if (((r9) r2).p != this.p) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.p * 31;
    }
}
