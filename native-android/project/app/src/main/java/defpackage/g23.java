package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class g23 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ v23 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g23(v23 v23Var, int i) {
        super(1);
        this.n = i;
        this.o = v23Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        v23 v23Var = this.o;
        switch (i) {
            case 0:
                r23 r23Var = (r23) obj;
                r23Var.getClass();
                return Boolean.valueOf(!v23Var.l.containsKey(Integer.valueOf(r23Var.u)));
            default:
                r23 r23Var2 = (r23) obj;
                r23Var2.getClass();
                return Boolean.valueOf(!v23Var.l.containsKey(Integer.valueOf(r23Var2.u)));
        }
    }
}
