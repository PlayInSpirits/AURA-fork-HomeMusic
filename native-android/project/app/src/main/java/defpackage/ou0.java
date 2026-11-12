package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 implements if1 {
    public final /* synthetic */ jx3 n;
    public final /* synthetic */ pu0 o;
    public final /* synthetic */ zg5 p;

    public ou0(jx3 jx3Var, pu0 pu0Var, zg5 zg5Var) {
        this.n = jx3Var;
        this.o = pu0Var;
        this.p = zg5Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        rx4 rx4Var = (rx4) obj;
        pu0 pu0Var = (pu0) rx4Var;
        if (!((qb) ((ra) j51.P(this.o)).getDragAndDropManager()).b.contains(pu0Var) || !ud3.a(pu0Var, su3.u(this.p))) {
            return qx4.n;
        }
        this.n.n = rx4Var;
        return qx4.p;
    }
}
