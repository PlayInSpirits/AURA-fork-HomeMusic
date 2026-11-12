package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yp {
    public final int a;
    public final int b;
    public final int c;

    public yp(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp)) {
            return false;
        }
        yp ypVar = (yp) obj;
        return this.a == ypVar.a && this.b == ypVar.b && this.c == ypVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f34.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return f34.i(b11.t("PlayNextRequest(insertPos=", ", count=", this.a, this.b, ", target="), this.c, ")");
    }
}
