package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class hb2 extends ib2 {
    public final String a;
    public final os4 b;

    public hb2(String str, os4 os4Var) {
        this.a = str;
        this.b = os4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb2)) {
            return false;
        }
        hb2 hb2Var = (hb2) obj;
        return this.a.equals(hb2Var.a) && h12.c(this.b, hb2Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        os4 os4Var = this.b;
        return (hashCode + (os4Var != null ? os4Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return xa3.h("LinkAnnotation.Url(url=", this.a, ")");
    }
}
