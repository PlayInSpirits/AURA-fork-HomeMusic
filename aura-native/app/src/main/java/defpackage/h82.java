package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class h82 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ lm0 o;

    public /* synthetic */ h82(lm0 lm0Var, int i) {
        this.n = i;
        this.o = lm0Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int i = this.n;
        lm0 lm0Var = this.o;
        switch (i) {
            case 0:
                return Integer.valueOf(lm0Var.n());
            case 1:
                return Integer.valueOf(lm0Var.n());
            default:
                return Boolean.valueOf(lm0Var.k.a());
        }
    }
}
