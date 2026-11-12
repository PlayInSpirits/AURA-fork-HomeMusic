package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class py3 extends e35 {
    public final e35 p;
    public final int q;

    public py3(e35 r1, int r2) {
        this.p = r1;
        this.q = r2;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof py3) == false) goto L10;
        py3 r4 = (py3) r3;
        if (r4.p.equals(this.p) == true) goto L7;
        return false;
    L7:
        if (r4.q != this.q) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.q * 31;
        return this.p.hashCode() + r0;
    }
}
