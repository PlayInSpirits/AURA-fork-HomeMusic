package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o24 extends uv {
    public final /* synthetic */ p24 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o24(p24 p24Var, int i) {
        super(i, 3);
        this.p = p24Var;
    }

    @Override // defpackage.uv
    public final void l(we1 we1Var) {
        this.p.d(new po4(we1Var));
    }

    @Override // defpackage.uv
    public final void o(we1 we1Var, int i, int i2) {
        q(we1Var, i, i2);
    }

    @Override // defpackage.uv
    public final void p(we1 we1Var) throws Throwable {
        po4 po4Var = new po4(we1Var);
        p24 p24Var = this.p;
        p24Var.f(po4Var);
        p24Var.g = we1Var;
    }

    @Override // defpackage.uv
    public final void q(we1 we1Var, int i, int i2) {
        this.p.e(new po4(we1Var), i, i2);
    }
}
