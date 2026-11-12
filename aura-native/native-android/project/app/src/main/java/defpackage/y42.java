package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 {
    public final String a;
    public final String b;
    public final boolean c;

    public y42(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y42)) {
            return false;
        }
        y42 y42Var = (y42) obj;
        return this.a.equals(y42Var.a) && this.b.equals(y42Var.b) && this.c == y42Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f34.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbU = b11.u("Reply(fingerprint=", this.a, ", code=", this.b, ", approved=");
        sbU.append(this.c);
        sbU.append(")");
        return sbU.toString();
    }
}
