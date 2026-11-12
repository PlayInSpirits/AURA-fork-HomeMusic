package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y84 extends w34 {
    public final x84 u;
    public final lx v;
    public final w84 w;
    public final byte[] x;
    public final ux y;

    public y84(x84 x84Var, lx lxVar, w84 w84Var, byte[] bArr) {
        this.u = x84Var;
        this.v = lxVar;
        this.w = w84Var;
        this.x = bArr;
        this.y = new ux(lxVar, x84Var.o, bArr, w84Var);
    }

    @Override // defpackage.w34
    public final void b() {
        this.y.j = true;
    }

    @Override // defpackage.w34
    public final Object c() throws Exception {
        this.y.a();
        w84 w84Var = this.w;
        if (w84Var == null) {
            return null;
        }
        w84Var.r++;
        w84Var.n.b(w84Var.o, w84Var.q, w84Var.a());
        return null;
    }
}
