package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class r31 implements qc2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ do2 o;

    public /* synthetic */ r31(do2 do2Var, int i) {
        this.n = i;
        this.o = do2Var;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        ((al3) obj).l0(this.o);
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        do2 do2Var = this.o;
        oi3 oi3Var = (oi3) obj;
        switch (i) {
            case 0:
                oi3Var.F(do2Var);
                break;
            default:
                oi3Var.G(do2Var);
                break;
        }
    }
}
