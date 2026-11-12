package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x64 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ z64 o;

    public /* synthetic */ x64(z64 z64Var, int i) {
        this.n = i;
        this.o = z64Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        z64 z64Var = this.o;
        switch (i) {
            case 0:
                return Boolean.valueOf(z64Var.A);
            default:
                ba1 ba1Var = z64Var.g0;
                if (!ba1Var.n.A) {
                    return null;
                }
                z91 z91VarV0 = ba1Var.v0();
                int iOrdinal = z91VarV0.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return null;
                    }
                    er1.n();
                    return null;
                }
                if (z91VarV0.a()) {
                    return ba1Var.t0(null);
                }
                ba1 ba1VarF = ((ey) ((ra) j51.P(ba1Var)).getFocusOwner()).f();
                if (ba1VarF != null) {
                    return ba1VarF.t0(j51.N(ba1Var));
                }
                return null;
        }
    }
}
