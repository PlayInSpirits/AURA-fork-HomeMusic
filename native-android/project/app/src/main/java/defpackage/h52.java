package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h52 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public h52(String r1, String r2, long r3, String r5) {
        this.a = r1;
        this.b = r2;
        this.c = r5;
        this.d = r3;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof h52) == false) goto L22;
        h52 r4 = (h52) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c.equals(r4.c) == true) goto L17;
        return false;
    L17:
        if (this.d == r4.d) goto L20;
        return false;
    L20:
        return true;
    L22:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.e(this.b, r0, 31);
        int r2 = f34.e(this.c, r1, 31);
        return Long.hashCode(this.d) + r2;
    }

    public final String toString() {
        StringBuilder r0 = b11.u("PairRequest(fingerprint=", this.a, ", name=", this.b, ", code=");
        r0.append(this.c);
        r0.append(", time=");
        r0.append(this.d);
        r0.append(")");
        return r0.toString();
    }
}
