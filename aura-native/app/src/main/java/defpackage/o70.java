package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class o70 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ o70(r70 r70Var, Object obj, Object obj2, int i) {
        this.n = 0;
        this.r = r70Var;
        this.o = obj;
        this.q = obj2;
        this.p = i;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        int i2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.q;
        j15 j15Var = j15.a;
        Object obj5 = this.r;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((r70) obj5).e(obj3, obj4, (rg1) obj, xl.O(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O = xl.O(1);
                l93.b((nc3) obj5, this.o, this.p, this.q, (rg1) obj, O);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((z82) obj4).e(obj3, (r70) obj5, (rg1) obj, xl.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((w44) obj4).e(obj3, (r70) obj5, (rg1) obj, xl.O(i2 | 1));
                break;
        }
        return j15Var;
    }

    public /* synthetic */ o70(nc3 nc3Var, Object obj, int i, Object obj2, int i2) {
        this.n = 1;
        this.r = nc3Var;
        this.o = obj;
        this.p = i;
        this.q = obj2;
    }

    public /* synthetic */ o70(u44 u44Var, Object obj, r70 r70Var, int i, int i2) {
        this.n = i2;
        this.q = u44Var;
        this.o = obj;
        this.r = r70Var;
        this.p = i;
    }
}
