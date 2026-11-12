package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rs2 implements gt2, ht2, wc0 {
    public final /* synthetic */ kt2 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ rs2(kt2 kt2Var, int i, int i2) {
        this.n = kt2Var;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        kt2 kt2Var = this.n;
        ((tn2) kt2Var.e.get()).getClass();
        jt2 jt2Var = kt2Var.j;
        if (jt2Var != null) {
            jt2Var.setFixedSize(this.o, this.p);
        }
    }

    @Override // defpackage.ht2
    public void b(al3 al3Var, fr2 fr2Var, List list) {
        kt2 kt2Var = this.n;
        al3Var.L(kt2Var.L0(fr2Var, al3Var, this.o), kt2Var.L0(fr2Var, al3Var, this.p), list);
    }

    @Override // defpackage.gt2
    public void e(al3 al3Var, fr2 fr2Var) {
        kt2 kt2Var = this.n;
        al3Var.P(kt2Var.L0(fr2Var, al3Var, this.o), kt2Var.L0(fr2Var, al3Var, this.p));
    }
}
