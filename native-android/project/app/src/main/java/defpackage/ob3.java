package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ob3 extends ya4 {
    public final g34 f;
    public final nc g;

    public ob3(g34 g34Var) {
        nc ncVarA;
        this.f = g34Var;
        if (wr1.K(g34Var)) {
            ncVarA = null;
        } else {
            ncVarA = pc.a();
            nc.b(ncVarA, g34Var);
        }
        this.g = ncVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ob3) {
            return this.f.equals(((ob3) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.ya4
    public final wv3 s() {
        g34 g34Var = this.f;
        return new wv3(g34Var.a, g34Var.b, g34Var.c, g34Var.d);
    }
}
