package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ea3 extends e22 {
    public static final ea3 f = new ea3(0, 3, 1);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        hd5 hd5Var;
        ig4 ig4Var = (ig4) x20Var.d(1);
        mg1 mg1Var = (mg1) x20Var.d(0);
        p71 p71Var = (p71) x20Var.d(2);
        lg4 lg4VarE = ig4Var.e();
        if (wa3Var != null) {
            try {
                hd5Var = new hd5(16, wa3Var, lg4Var);
            } catch (Throwable th) {
                lg4VarE.e(false);
                throw th;
            }
        } else {
            hd5Var = null;
        }
        if (!p71Var.e.w0()) {
            l80.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        p71Var.d.v0(biVar, lg4VarE, uy3Var, hd5Var);
        lg4VarE.e(true);
        lg4Var.d();
        mg1Var.getClass();
        lg4Var.A(ig4Var, ig4Var.a(mg1Var));
        lg4Var.k();
    }
}
