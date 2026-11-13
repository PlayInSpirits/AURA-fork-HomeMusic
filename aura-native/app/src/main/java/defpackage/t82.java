package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
final class t82 extends gx2 {
    public final gf1 a;
    public final s82 b;
    public final boolean c;

    public t82(gf1 gf1Var, s82 s82Var, boolean z) {
        this.a = gf1Var;
        this.b = s82Var;
        this.c = z;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        return new x82(this.a, this.b, this.c);
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        x82 x82Var = (x82) cx2Var;
        x82Var.B = this.a;
        x82Var.C = this.b;
        boolean z = x82Var.D;
        boolean z2 = this.c;
        if (z == z2) {
            return;
        }
        x82Var.D = z2;
        x82Var.q0();
        fu.C(x82Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t82)) {
            return false;
        }
        t82 t82Var = (t82) obj;
        return this.a == t82Var.a && h12.c(this.b, t82Var.b) && this.c == t82Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xa3.c((hb3.o.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.c);
    }
}
