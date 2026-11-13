package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class kj0 implements qc2 {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ s55 o;

    public /* synthetic */ kj0(q9 q9Var, s55 s55Var) {
        this.o = s55Var;
    }

    @Override // defpackage.qc2
    public final void invoke(Object obj) {
        int i = this.n;
        s55 s55Var = this.o;
        switch (i) {
            case 0:
                ho2 ho2Var = (ho2) obj;
                ue1 ue1Var = ho2Var.p;
                if (ue1Var != null) {
                    tb1 tb1Var = (tb1) ue1Var.p;
                    if (tb1Var.v == -1) {
                        sb1 a = tb1Var.a();
                        a.t = s55Var.a;
                        a.u = s55Var.b;
                        int i2 = 6;
                        ho2Var.p = new ue1(ue1Var.o, i2, new tb1(a), (String) ue1Var.q);
                    }
                }
                int i3 = s55Var.a;
                break;
            default:
                ((oi3) obj).a(s55Var);
                break;
        }
    }

    public /* synthetic */ kj0(s55 s55Var) {
        this.o = s55Var;
    }
}
