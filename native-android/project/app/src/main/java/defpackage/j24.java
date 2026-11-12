package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j24 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ k24 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j24(k24 k24Var, int i) {
        super(1);
        this.n = i;
        this.o = k24Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        k24 k24Var = this.o;
        switch (i) {
            case 0:
                return Double.valueOf(k24Var.n.b(gb.k(((Number) obj).doubleValue(), k24Var.e, k24Var.f)));
            default:
                return Double.valueOf(gb.k(k24Var.k.b(((Number) obj).doubleValue()), k24Var.e, k24Var.f));
        }
    }
}
