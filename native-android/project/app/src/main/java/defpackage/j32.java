package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j32 extends h32 {
    public final nb2 n;

    public j32() {
        jb2 jb2Var = nb2.v;
        this.n = new nb2(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof j32) && ((j32) obj).n.equals(this.n);
        }
        return true;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }
}
