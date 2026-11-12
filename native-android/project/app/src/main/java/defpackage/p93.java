package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p93 extends e22 {
    public static final p93 f = new p93(0, 2, 1);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        mg1 mg1Var = (mg1) x20Var.d(0);
        Object objD = x20Var.d(1);
        if (objD instanceof wg1) {
            wg1 wg1Var = (wg1) objD;
            uy3Var.e.b(wg1Var);
            uy3Var.d.a(wg1Var);
        }
        if (lg4Var.n != 0) {
            l80.a("Can only append a slot if not current inserting");
        }
        int i = lg4Var.i;
        int i2 = lg4Var.j;
        int iC = lg4Var.c(mg1Var);
        int iG = lg4Var.g(lg4Var.b, lg4Var.r(iC + 1));
        lg4Var.i = iG;
        lg4Var.j = iG;
        lg4Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        lg4Var.c[iG] = objD;
        lg4Var.i = i;
        lg4Var.j = i2;
    }
}
