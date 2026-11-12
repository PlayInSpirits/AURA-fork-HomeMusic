package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x22 extends cz {
    public final x60 x;

    public x22(vd0 vd0Var, x60 x60Var) {
        super(1, vd0Var);
        this.x = x60Var;
    }

    @Override // defpackage.cz
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.cz
    public final Throwable o(a32 a32Var) {
        Throwable thE;
        Object objH = this.x.H();
        if (!(objH instanceof z22) || (thE = ((z22) objH).e()) == null) {
            return objH instanceof a70 ? ((a70) objH).a : a32Var.q();
        }
        return thE;
    }
}
