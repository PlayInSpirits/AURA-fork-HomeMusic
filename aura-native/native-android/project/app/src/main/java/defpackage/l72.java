package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l72 extends z62 {
    public final /* synthetic */ o72 a;
    public final /* synthetic */ wf1 b;

    public l72(o72 o72Var, wf1 wf1Var) {
        this.a = o72Var;
        this.b = wf1Var;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 cf2Var, List list, long j) {
        o72 o72Var = this.a;
        j72 j72Var = o72Var.u;
        j72Var.n = cf2Var.getLayoutDirection();
        j72Var.o = cf2Var.g();
        j72Var.p = cf2Var.J();
        boolean zK = cf2Var.K();
        wf1 wf1Var = this.b;
        if (zK || o72Var.n.u == null) {
            o72Var.q = 0;
            vi2 vi2Var = (vi2) wf1Var.invoke(j72Var, new nc0(j));
            return new k72(vi2Var, o72Var, o72Var.q, vi2Var, 1);
        }
        o72Var.r = 0;
        vi2 vi2Var2 = (vi2) wf1Var.invoke(o72Var.v, new nc0(j));
        return new k72(vi2Var2, o72Var, o72Var.r, vi2Var2, 0);
    }
}
