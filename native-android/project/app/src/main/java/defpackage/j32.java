package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j32 extends h32 {
    public final nb2 n;

    public j32() {
        jb2 r1 = nb2.v;
        this.n = new nb2(false);
    }

    public final boolean equals(Object r2) {
        if (r2 != this) goto L4;
        return true;
    L4:
        if ((r2 instanceof j32) == true) goto L6;
        return false;
    L6:
        if (((j32) r2).n.equals(this.n) == true) goto L13;
        return false;
    L13:
        return true;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }
}
