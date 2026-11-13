package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class p54 implements wf1 {
    public static final p54 o = new p54(0);
    public static final p54 p = new p54(1);
    public final /* synthetic */ int n;

    public /* synthetic */ p54(int i) {
        this.n = i;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        String str;
        sf1 sf1Var;
        switch (this.n) {
            case 0:
                long j = ((x40) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(e35.U(j));
            default:
                w2 w2Var = (w2) obj;
                w2 w2Var2 = (w2) obj2;
                if (w2Var == null || (str = w2Var.a) == null) {
                    str = w2Var2.a;
                }
                if (w2Var == null || (sf1Var = w2Var.b) == null) {
                    sf1Var = w2Var2.b;
                }
                return new w2(str, sf1Var);
        }
    }
}
