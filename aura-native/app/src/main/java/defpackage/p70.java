package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class p70 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ r70 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ p70(r70 r70Var, Object obj, int i) {
        this.n = 0;
        this.o = r70Var;
        this.q = obj;
        this.p = i;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        j15 j15Var = j15.a;
        int i2 = this.p;
        r70 r70Var = this.o;
        Object obj3 = this.q;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r70Var.c(obj3, (rg1) obj, xl.O(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                gi1.b((rr3[]) obj3, r70Var, (rg1) obj, xl.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                gi1.a((rr3) obj3, r70Var, (rg1) obj, xl.O(i2 | 1));
                break;
        }
        return j15Var;
    }

    public /* synthetic */ p70(Object obj, r70 r70Var, int i, int i2) {
        this.n = i2;
        this.q = obj;
        this.o = r70Var;
        this.p = i;
    }
}
