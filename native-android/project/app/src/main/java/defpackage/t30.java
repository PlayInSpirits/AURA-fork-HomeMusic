package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class t30 extends gx2 {
    public final gf1 a;

    public t30(gf1 gf1Var) {
        this.a = gf1Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        return new u30(this.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        boolean z;
        boolean z2;
        ck0 ck0Var;
        u30 u30Var = (u30) cx2Var;
        ea1 ea1Var = u30Var.H;
        if (h12.c(u30Var.Q, null)) {
            z = false;
        } else {
            u30Var.v0();
            u30Var.Q = null;
            u30Var.D = null;
            z = true;
        }
        if (!u30Var.E) {
            u30Var.E = true;
            u30Var.Q();
            z = true;
        }
        if (!u30Var.F) {
            u30Var.q0(ea1Var);
            fu.C(u30Var);
            u30Var.F = true;
        }
        u30Var.G = this.a;
        boolean z3 = u30Var.R;
        rm2 rm2Var = u30Var.Q;
        if (z3 != (rm2Var == null)) {
            boolean z4 = rm2Var == null;
            u30Var.R = z4;
            z2 = (z4 || u30Var.L != null) ? z : true;
        }
        if (z2 && ((ck0Var = u30Var.L) != null || !u30Var.R)) {
            if (ck0Var != null) {
                u30Var.r0(ck0Var);
            }
            u30Var.L = null;
            u30Var.x0();
        }
        ea1Var.v0(u30Var.D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t30.class == obj.getClass() && this.a == ((t30) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode() + xa3.c(Boolean.hashCode(true) * 31, 29791, true);
    }
}
