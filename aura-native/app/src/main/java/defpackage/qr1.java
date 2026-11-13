package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qr1 {
    public final String a;
    public final String b;

    public qr1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr1)) {
            return false;
        }
        qr1 qr1Var = (qr1) obj;
        return this.a.equals(qr1Var.a) && this.b.equals(qr1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f34.h("AccountSession(base=", this.a, ", cookie=", this.b, ")");
    }
}
