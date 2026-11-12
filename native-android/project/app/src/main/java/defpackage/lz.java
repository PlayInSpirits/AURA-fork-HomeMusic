package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz {
    public oo0 a;
    public r62 b;
    public jz c;
    public long d;

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof lz) == false) goto L22;
        lz r4 = (lz) r3;
        if (h12.c(this.a, r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b == r4.b) goto L14;
        return false;
    L14:
        if (h12.c(this.c, r4.c) == true) goto L17;
        return false;
    L17:
        if (qf4.a(this.d, r4.d) == true) goto L20;
        return false;
    L20:
        return true;
    L22:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = (this.b.hashCode() + r0) * 31;
        int r2 = (this.c.hashCode() + r1) * 31;
        return Long.hashCode(this.d) + r2;
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + qf4.c(this.d) + ")";
    }
}
