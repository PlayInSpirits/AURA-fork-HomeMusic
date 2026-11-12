package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 extends jx4 {
    public static xv0 b() {
        xv0 r0 = new xv0();
        r0.n = new d34(23, false);
        return r0;
    }

    @Override // defpackage.jx4
    public final boolean equals(Object r2) {
        if ((r2 instanceof xv0) == true) goto L5;
        return false;
    L5:
        if (super.equals(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode();
    }
}
