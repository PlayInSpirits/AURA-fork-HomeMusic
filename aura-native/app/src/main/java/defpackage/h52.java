package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h52 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public h52(String str, String str2, long j, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h52)) {
            return false;
        }
        h52 h52Var = (h52) obj;
        return this.a.equals(h52Var.a) && this.b.equals(h52Var.b) && this.c.equals(h52Var.c) && this.d == h52Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + f34.e(this.c, f34.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder u = b11.u("PairRequest(fingerprint=", this.a, ", name=", this.b, ", code=");
        u.append(this.c);
        u.append(", time=");
        u.append(this.d);
        u.append(")");
        return u.toString();
    }
}
