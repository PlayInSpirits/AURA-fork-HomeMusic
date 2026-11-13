package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ck0 extends cx2 implements rv0 {
    public final rm2 B;
    public boolean C;
    public boolean D;
    public boolean E;

    public ck0(rm2 rm2Var) {
        this.B = rm2Var;
    }

    @Override // defpackage.rv0
    public final void S(e72 e72Var) {
        e72Var.a();
        mz mzVar = e72Var.n;
        if (this.C) {
            sv0.l(e72Var, x40.b(x40.b, 0.3f), mzVar.P(), 122);
        } else if (this.D || this.E) {
            sv0.l(e72Var, x40.b(x40.b, 0.1f), mzVar.P(), 122);
        }
    }

    @Override // defpackage.cx2
    public final void i0() {
        fu.G(e0(), null, null, new ac0(this, null, 1), 3);
    }
}
