package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class y22 extends u22 {
    public final a32 u;
    public final z22 v;
    public final d20 w;
    public final Object x;

    public y22(a32 a32Var, z22 z22Var, d20 d20Var, Object obj) {
        this.u = a32Var;
        this.v = z22Var;
        this.w = d20Var;
        this.x = obj;
    }

    @Override // defpackage.u22
    public final boolean r() {
        return false;
    }

    @Override // defpackage.u22
    public final void s(Throwable th) {
        d20 d20Var = this.w;
        d20 V = a32.V(d20Var);
        a32 a32Var = this.u;
        z22 z22Var = this.v;
        Object obj = this.x;
        if (V == null || !a32Var.i0(z22Var, V, obj)) {
            z22Var.n.e(new sb2(2), 2);
            d20 V2 = a32.V(d20Var);
            if (V2 == null || !a32Var.i0(z22Var, V2, obj)) {
                a32Var.l(a32Var.B(z22Var, obj));
            }
        }
    }
}
