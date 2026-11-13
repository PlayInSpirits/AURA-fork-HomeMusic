package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class sx implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ fc3 o;
    public final /* synthetic */ qp4 p;

    public /* synthetic */ sx(fc3 fc3Var, qp4 qp4Var, int i) {
        this.n = i;
        this.o = fc3Var;
        this.p = qp4Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.n;
        j15 j15Var = j15.a;
        qp4 qp4Var = this.p;
        fc3 fc3Var = this.o;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                fc3Var.b(qp4Var, intValue, intValue2);
                break;
            default:
                fc3Var.b(qp4Var, intValue, intValue2);
                break;
        }
        return j15Var;
    }
}
