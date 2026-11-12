package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ u30 o;

    public /* synthetic */ n(u30 u30Var, int i) {
        this.n = i;
        this.o = u30Var;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        ck0 ck0Var;
        int i = this.n;
        u30 u30Var = this.o;
        switch (i) {
            case 0:
                dk0 dk0Var = (dk0) kb4.q(u30Var, zx1.a);
                if (!(dk0Var instanceof dk0)) {
                    fz1.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + dk0Var);
                }
                dk0 dk0Var2 = u30Var.I;
                u30Var.I = dk0Var;
                if (dk0Var2 != null && !h12.c(dk0Var, dk0Var2) && ((ck0Var = u30Var.L) != null || !u30Var.R)) {
                    if (ck0Var != null) {
                        u30Var.r0(ck0Var);
                    }
                    u30Var.L = null;
                    u30Var.x0();
                }
                return j15.a;
            default:
                u30Var.y0();
                return Boolean.TRUE;
        }
    }
}
