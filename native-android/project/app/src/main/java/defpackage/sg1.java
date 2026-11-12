package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sg1 implements w80 {
    public final t80 n;

    public sg1(t80 r1) {
        this.n = r1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof sg1) == false) goto L8;
        t80 r3 = ((sg1) r2).n;
        if (this.n.equals(r3) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() * 31;
    }
}
