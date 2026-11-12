package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 {
    public final String a;
    public final String b;
    public final boolean c;

    public y42(String r1, String r2, boolean r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof y42) == false) goto L19;
        y42 r4 = (y42) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        if (this.c == r4.c) goto L17;
        return false;
    L17:
        return true;
    L19:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        int r1 = f34.e(this.b, r0, 31);
        return Boolean.hashCode(this.c) + r1;
    }

    public final String toString() {
        StringBuilder r0 = b11.u("Reply(fingerprint=", this.a, ", code=", this.b, ", approved=");
        r0.append(this.c);
        r0.append(")");
        return r0.toString();
    }
}
