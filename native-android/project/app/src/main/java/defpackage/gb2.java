package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gb2 extends ib2 {
    public final String a;
    public final os4 b;

    public gb2(String str, os4 os4Var) {
        this.a = str;
        this.b = os4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb2)) {
            return false;
        }
        gb2 gb2Var = (gb2) obj;
        return this.a.equals(gb2Var.a) && h12.c(this.b, gb2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        os4 os4Var = this.b;
        return (iHashCode + (os4Var != null ? os4Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return xa3.h("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
