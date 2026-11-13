package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class q70 extends a6 implements wf1 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q70(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.u = i3;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.u;
        j15 j15Var = j15.a;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                r70 r70Var = (r70) obj3;
                r70Var.b(((Number) obj2).intValue(), (rg1) obj);
                break;
            case 1:
                z64 z64Var = (z64) obj3;
                fu.G(z64Var.W.x(), null, null, new j2(z64Var, ((k45) obj).a, null, 2), 3);
                break;
            default:
                z64 z64Var2 = (z64) obj3;
                fu.G(z64Var2.W.x(), null, null, new j2(z64Var2, ((k45) obj).a, null, 3), 3);
                break;
        }
        return j15Var;
    }
}
