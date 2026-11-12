package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qr1 {
    public final String a;
    public final String b;

    public qr1(String r1, String r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof qr1) == false) goto L16;
        qr1 r4 = (qr1) r3;
        if (this.a.equals(r4.a) == true) goto L11;
        return false;
    L11:
        if (this.b.equals(r4.b) == true) goto L14;
        return false;
    L14:
        return true;
    L16:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return this.b.hashCode() + r0;
    }

    public final String toString() {
        return f34.h("AccountSession(base=", this.a, ", cookie=", this.b, ")");
    }
}
