package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class os4 {
    public final ij4 a;
    public final ij4 b;
    public final ij4 c;
    public final ij4 d;

    public os4(ij4 ij4Var, ij4 ij4Var2, ij4 ij4Var3, ij4 ij4Var4) {
        this.a = ij4Var;
        this.b = ij4Var2;
        this.c = ij4Var3;
        this.d = ij4Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof os4)) {
            return false;
        }
        os4 os4Var = (os4) obj;
        return h12.c(this.a, os4Var.a) && h12.c(this.b, os4Var.b) && h12.c(this.c, os4Var.c) && h12.c(this.d, os4Var.d);
    }

    public final int hashCode() {
        ij4 ij4Var = this.a;
        int iHashCode = (ij4Var != null ? ij4Var.hashCode() : 0) * 31;
        ij4 ij4Var2 = this.b;
        int iHashCode2 = (iHashCode + (ij4Var2 != null ? ij4Var2.hashCode() : 0)) * 31;
        ij4 ij4Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (ij4Var3 != null ? ij4Var3.hashCode() : 0)) * 31;
        ij4 ij4Var4 = this.d;
        return iHashCode3 + (ij4Var4 != null ? ij4Var4.hashCode() : 0);
    }
}
