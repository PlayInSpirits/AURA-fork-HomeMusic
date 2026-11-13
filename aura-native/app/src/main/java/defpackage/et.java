package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
final class et extends gx2 {
    public final if1 a;

    public et(if1 if1Var) {
        this.a = if1Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        ft ftVar = new ft();
        ftVar.B = this.a;
        return ftVar;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        f63 f63Var;
        ft ftVar = (ft) cx2Var;
        if1 if1Var = this.a;
        ftVar.B = if1Var;
        if (ftVar.n.A && (f63Var = j51.M(ftVar, 2).I) != null) {
            f63Var.Y0(if1Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof et) {
            return this.a == ((et) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
