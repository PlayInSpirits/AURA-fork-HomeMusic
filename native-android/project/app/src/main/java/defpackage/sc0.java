package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sc0 extends tc0 {
    public final int a;

    public sc0(int r1) {
        this.a = r1;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof sc0) == true) goto L9;
        return false;
    L9:
        if (this.a == ((sc0) r4).a) goto L11;
        return false;
    L11:
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
