package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us2 implements gt2, ht2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ kt2 o;
    public final /* synthetic */ int p;

    public /* synthetic */ us2(kt2 kt2Var, int i, int i2) {
        this.n = i2;
        this.o = kt2Var;
        this.p = i;
    }

    @Override // defpackage.ht2
    public void b(al3 al3Var, fr2 fr2Var, List list) {
        int i = this.n;
        int i2 = this.p;
        kt2 kt2Var = this.o;
        switch (i) {
            case 1:
                al3Var.N0(list, kt2Var.L0(fr2Var, al3Var, i2));
                break;
            case 2:
                if (list.size() != 1) {
                    al3Var.L(kt2Var.L0(fr2Var, al3Var, i2), kt2Var.L0(fr2Var, al3Var, i2 + 1), list);
                } else {
                    al3Var.z0(kt2Var.L0(fr2Var, al3Var, i2), (gn2) list.get(0));
                }
                break;
            default:
                al3Var.N0(list, kt2Var.L0(fr2Var, al3Var, i2));
                break;
        }
    }

    @Override // defpackage.gt2
    public void e(al3 al3Var, fr2 fr2Var) {
        int i = this.n;
        int i2 = this.p;
        kt2 kt2Var = this.o;
        switch (i) {
            case 0:
                al3Var.W(kt2Var.L0(fr2Var, al3Var, i2));
                break;
            default:
                al3Var.N(kt2Var.L0(fr2Var, al3Var, i2));
                break;
        }
    }
}
