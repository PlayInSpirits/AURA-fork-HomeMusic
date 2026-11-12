package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m35 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ n35 o;

    public /* synthetic */ m35(n35 n35Var, int i) {
        this.n = i;
        this.o = n35Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        j15 j15Var = j15.a;
        n35 n35Var = this.o;
        switch (i) {
            case 0:
                n35Var.d = true;
                n35Var.f.invoke();
                return j15Var;
            default:
                sv0 sv0Var = (sv0) obj;
                gk1 gk1Var = n35Var.b;
                float f = n35Var.k;
                float f2 = n35Var.l;
                i61 i61VarO = sv0Var.O();
                long j = i61VarO.j();
                i61VarO.g().e();
                try {
                    ((zg5) i61VarO.o).B(f, f2, 0L);
                    gk1Var.a(sv0Var);
                    return j15Var;
                } finally {
                    i61VarO.g().k();
                    i61VarO.t(j);
                }
        }
    }
}
