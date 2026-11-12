package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d90 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ d90(Object obj, Object obj2, wf1 wf1Var, int i, int i2) {
        this.n = i2;
        this.o = obj;
        this.p = obj2;
        this.q = wf1Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        j15 j15Var = j15.a;
        int i2 = 1;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                g90.a((ub3) obj5, (pa) obj4, (r70) obj3, (rg1) obj, xl.O(1));
                break;
            case 1:
                gx3 gx3Var = (gx3) obj5;
                g74 g74Var = (g74) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = g74Var.i(g74Var.e(fFloatValue - gx3Var.n));
                g74 g74Var2 = ((e74) obj3).a;
                gx3Var.n += g74Var.e(g74Var.h(g74Var2.d(g74Var2.k, jI, 1)));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gn4.a((kn4) obj5, (dx2) obj4, (wf1) obj3, (rg1) obj, xl.O(9));
                break;
            default:
                wd5 wd5Var = (wd5) obj5;
                h80 h80Var = (h80) obj4;
                r70 r70Var = (r70) obj3;
                rg1 rg1Var = (rg1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 0;
                if (!rg1Var.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rg1Var.N();
                } else {
                    ra raVar = wd5Var.n;
                    boolean zG = rg1Var.g(wd5Var);
                    Object objH = rg1Var.H();
                    vd0 vd0Var = null;
                    i80 i80Var = j80.a;
                    if (zG || objH == i80Var) {
                        objH = new vd5(wd5Var, vd0Var, i3);
                        rg1Var.b0(objH);
                    }
                    bu.c((wf1) objH, rg1Var, raVar);
                    boolean zG2 = rg1Var.g(wd5Var);
                    Object objH2 = rg1Var.H();
                    if (zG2 || objH2 == i80Var) {
                        objH2 = new vd5(wd5Var, vd0Var, i2);
                        rg1Var.b0(objH2);
                    }
                    bu.c((wf1) objH2, rg1Var, raVar);
                    h80Var.a(raVar, r70Var, rg1Var, 0);
                }
                break;
        }
        return j15Var;
    }

    public /* synthetic */ d90(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }
}
