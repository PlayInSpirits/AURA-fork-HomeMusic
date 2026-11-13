package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
final class w72 extends gx2 {
    public final dc3 a;
    public final hg3 b;

    public w72(dc3 dc3Var, hg3 hg3Var) {
        this.a = dc3Var;
        this.b = hg3Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        z72 z72Var = new z72();
        z72Var.B = this.a;
        z72Var.C = this.b;
        z72Var.D = hb3.o;
        return z72Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        z72 z72Var = (z72) cx2Var;
        z72Var.B = this.a;
        z72Var.C = this.b;
        z72Var.D = hb3.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w72)) {
            return false;
        }
        w72 w72Var = (w72) obj;
        return h12.c(this.a, w72Var.a) && h12.c(this.b, w72Var.b);
    }

    public final int hashCode() {
        return hb3.o.hashCode() + xa3.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
