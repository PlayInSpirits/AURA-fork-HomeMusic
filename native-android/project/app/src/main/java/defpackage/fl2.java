package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl2 implements xl2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ List p;

    public /* synthetic */ fl2(bm2 bm2Var, List list, int i) {
        this.n = i;
        this.o = bm2Var;
        this.p = list;
    }

    @Override // defpackage.xl2
    public final void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        int i3 = 0;
        List list = this.p;
        bm2 bm2Var = this.o;
        switch (i2) {
            case 0:
                mm2 mm2Var = bm2Var.c;
                uw1 uw1VarJ = yw1.j();
                while (i3 < list.size()) {
                    uw1VarJ.c(((gn2) list.get(i3)).c(true));
                    i3++;
                }
                pu1Var.L(mm2Var, i, new iw(uw1VarJ.f()), true);
                break;
            default:
                mm2 mm2Var2 = bm2Var.c;
                uw1 uw1VarJ2 = yw1.j();
                while (i3 < list.size()) {
                    uw1VarJ2.c(((gn2) list.get(i3)).c(true));
                    i3++;
                }
                pu1Var.T(mm2Var2, i, new iw(uw1VarJ2.f()));
                break;
        }
    }
}
