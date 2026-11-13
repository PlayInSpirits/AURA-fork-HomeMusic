package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class o40 {
    public final int a;
    public final int b;

    public o40(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return this.a == o40Var.a && this.b == o40Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b11.n("CollectionInfo(rowCount=", ", columnCount=", this.a, this.b, ")");
    }
}
