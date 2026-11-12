package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class th5 extends bb3 {
    public final zr3 n;

    public th5(zr3 r1) {
        this.n = r1;
    }

    @Override // defpackage.bb3
    public final Object c() {
        return this.n;
    }

    @Override // defpackage.bb3
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof th5) == true) goto L5;
        return false;
    L5:
        return this.n.equals(((th5) r2).n);
    }

    public final int hashCode() {
        return this.n.hashCode() + 1502476572;
    }

    public final String toString() {
        return xa3.h("Optional.of(", this.n.toString(), ")");
    }
}
