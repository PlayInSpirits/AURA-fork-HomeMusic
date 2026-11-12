package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zp3 extends bb3 {
    public final Object n;

    public zp3(Object r1) {
        this.n = r1;
    }

    @Override // defpackage.bb3
    public final Object b(m91 r1) {
        return this.n;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zp3) == true) goto L5;
        return false;
    L5:
        return this.n.equals(((zp3) r2).n);
    }

    public final int hashCode() {
        return this.n.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.n + ")";
    }
}
