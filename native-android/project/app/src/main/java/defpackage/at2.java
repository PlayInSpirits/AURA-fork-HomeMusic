package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class at2 implements it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ it2 o;

    public /* synthetic */ at2(it2 it2Var, int i) {
        this.n = i;
        this.o = it2Var;
    }

    @Override // defpackage.it2
    public final Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        int i2 = this.n;
        it2 it2Var = this.o;
        switch (i2) {
            case 0:
                return kt2.K0(tn2Var, fr2Var, i, it2Var, new q31(i, 5, fr2Var));
            default:
                return kt2.K0(tn2Var, fr2Var, i, it2Var, new vl2(tn2Var, fr2Var, i, 4));
        }
    }
}
