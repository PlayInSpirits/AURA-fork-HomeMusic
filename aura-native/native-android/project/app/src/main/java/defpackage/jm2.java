package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm2 implements lm2, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ int p;
    public final /* synthetic */ jn2 q;

    public /* synthetic */ jm2(String str, int i, int i2, jn2 jn2Var) {
        this.n = 2;
        this.o = str;
        this.p = i2;
        this.q = jn2Var;
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        int i = 10;
        switch (this.n) {
            case 0:
                kj2 kj2Var = (kj2) bm2Var;
                if (kj2Var.Y()) {
                    bj2 bj2Var = kj2Var.J;
                    er1 er1Var = new er1(kj2Var, this.o, this.p, this.q, 16);
                    aj2 aj2Var = (aj2) bj2Var.e;
                    if (aj2Var != null) {
                        f35.W(bj2Var.f, new ws1(i, er1Var, aj2Var));
                    }
                    break;
                }
                break;
            default:
                kj2 kj2Var2 = (kj2) bm2Var;
                if (kj2Var2.Y()) {
                    bj2 bj2Var2 = kj2Var2.J;
                    er1 er1Var2 = new er1(kj2Var2, this.o, this.p, this.q, 17);
                    aj2 aj2Var2 = (aj2) bj2Var2.e;
                    if (aj2Var2 != null) {
                        f35.W(bj2Var2.f, new ws1(i, er1Var2, aj2Var2));
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        return tn2Var.r(fr2Var, this.o, this.p, this.q);
    }

    public /* synthetic */ jm2(String str, int i, jn2 jn2Var, int i2) {
        this.n = i2;
        this.o = str;
        this.p = i;
        this.q = jn2Var;
    }
}
