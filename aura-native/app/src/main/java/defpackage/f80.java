package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class f80 implements wf1 {
    public final /* synthetic */ int n = 1;
    public final /* synthetic */ h80 o;
    public final /* synthetic */ ra p;
    public final /* synthetic */ r70 q;

    public /* synthetic */ f80(ra raVar, h80 h80Var, r70 r70Var) {
        this.p = raVar;
        this.o = h80Var;
        this.q = r70Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        j15 j15Var = j15.a;
        r70 r70Var = this.q;
        ra raVar = this.p;
        h80 h80Var = this.o;
        rg1 rg1Var = (rg1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if (!rg1Var.K(intValue & 1, (intValue & 3) != 2)) {
                    rg1Var.N();
                    break;
                } else {
                    rg1Var.R(866651995);
                    g90.a(raVar, h80Var.l, r70Var, rg1Var, 0);
                    rg1Var.o(false);
                    break;
                }
            default:
                num.getClass();
                h80Var.a(raVar, r70Var, rg1Var, xl.O(1));
                break;
        }
        return j15Var;
    }

    public /* synthetic */ f80(h80 h80Var, ra raVar, r70 r70Var, int i) {
        this.o = h80Var;
        this.p = raVar;
        this.q = r70Var;
    }
}
