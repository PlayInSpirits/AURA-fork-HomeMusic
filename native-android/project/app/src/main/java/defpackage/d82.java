package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d82 implements wf1 {
    public final /* synthetic */ int n = 0;
    public final /* synthetic */ nc3 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ d82(int i, nc3 nc3Var, Object obj) {
        this.o = nc3Var;
        this.p = i;
        this.q = obj;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        j15 j15Var = j15.a;
        Object obj3 = this.q;
        int i2 = this.p;
        nc3 nc3Var = this.o;
        rg1 rg1Var = (rg1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!rg1Var.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rg1Var.N();
                } else {
                    nc3Var.a(i2, obj3, rg1Var, 0);
                }
                break;
            default:
                num.getClass();
                nc3Var.a(i2, obj3, rg1Var, xl.O(1));
                break;
        }
        return j15Var;
    }

    public /* synthetic */ d82(nc3 nc3Var, int i, Object obj, int i2) {
        this.o = nc3Var;
        this.p = i;
        this.q = obj;
    }
}
