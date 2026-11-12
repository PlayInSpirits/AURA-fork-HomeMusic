package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class r64 extends gx2 {
    public final lm0 a;
    public final boolean b;
    public final y71 c;
    public final rm2 d;
    public final fv e;
    public final tb f;

    public r64(lm0 lm0Var, boolean z, y71 y71Var, rm2 rm2Var, fv fvVar, tb tbVar) {
        this.a = lm0Var;
        this.b = z;
        this.c = y71Var;
        this.d = rm2Var;
        this.e = fvVar;
        this.f = tbVar;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        s64 s64Var = new s64();
        s64Var.D = this.a;
        s64Var.E = hb3.o;
        s64Var.F = this.b;
        s64Var.G = this.c;
        s64Var.H = this.d;
        s64Var.I = this.e;
        s64Var.J = this.f;
        return s64Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        ((s64) cx2Var).v0(this.a, hb3.o, this.f, this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r64.class == obj.getClass()) {
            r64 r64Var = (r64) obj;
            if (this.a == r64Var.a && this.b == r64Var.b && h12.c(this.c, r64Var.c) && h12.c(this.d, r64Var.d) && h12.c(this.e, r64Var.e) && h12.c(this.f, r64Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = xa3.c(xa3.c((hb3.o.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.b), 31, false);
        y71 y71Var = this.c;
        int iHashCode = (iC + (y71Var != null ? y71Var.hashCode() : 0)) * 31;
        rm2 rm2Var = this.d;
        int iHashCode2 = (iHashCode + (rm2Var != null ? rm2Var.hashCode() : 0)) * 31;
        fv fvVar = this.e;
        int iC2 = xa3.c((iHashCode2 + (fvVar != null ? fvVar.hashCode() : 0)) * 31, 31, false);
        tb tbVar = this.f;
        return iC2 + (tbVar != null ? tbVar.hashCode() : 0);
    }
}
