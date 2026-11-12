package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt2 implements wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ue1 o;
    public final /* synthetic */ ed2 p;
    public final /* synthetic */ un2 q;

    public /* synthetic */ pt2(ue1 ue1Var, ed2 ed2Var, un2 un2Var, int i) {
        this.n = i;
        this.o = ue1Var;
        this.p = ed2Var;
        this.q = un2Var;
    }

    @Override // defpackage.wc0
    public final void accept(Object obj) {
        int i = this.n;
        un2 un2Var = this.q;
        ed2 ed2Var = this.p;
        ue1 ue1Var = this.o;
        st2 st2Var = (st2) obj;
        switch (i) {
            case 0:
                st2Var.w(ue1Var.o, (mt2) ue1Var.p, ed2Var, un2Var);
                break;
            default:
                st2Var.u(ue1Var.o, (mt2) ue1Var.p, ed2Var, un2Var);
                break;
        }
    }
}
