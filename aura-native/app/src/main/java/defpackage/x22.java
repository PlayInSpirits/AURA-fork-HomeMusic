package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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
        Throwable e;
        Object H = this.x.H();
        return (!(H instanceof z22) || (e = ((z22) H).e()) == null) ? H instanceof a70 ? ((a70) H).a : a32Var.q() : e;
    }
}
