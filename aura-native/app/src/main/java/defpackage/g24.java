package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class g24 implements ks0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ k24 o;

    public /* synthetic */ g24(k24 k24Var, int i) {
        this.n = i;
        this.o = k24Var;
    }

    @Override // defpackage.ks0
    public final double b(double d) {
        int i = this.n;
        k24 k24Var = this.o;
        switch (i) {
            case 0:
                return gb.k(k24Var.k.b(d), k24Var.e, k24Var.f);
            default:
                return k24Var.n.b(gb.k(d, k24Var.e, k24Var.f));
        }
    }
}
