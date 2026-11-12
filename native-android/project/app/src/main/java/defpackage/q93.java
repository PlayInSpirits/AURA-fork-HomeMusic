package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q93 extends e22 {
    public static final q93 f = new q93(0, 2, 1);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        l02 l02Var = (l02) x20Var.d(1);
        int i = l02Var != null ? l02Var.a : 0;
        w00 w00Var = (w00) x20Var.d(0);
        if (i > 0) {
            j83 j83Var = new j83();
            j83Var.p = biVar;
            j83Var.n = i;
            biVar = j83Var;
        }
        w00Var.C(biVar, lg4Var, uy3Var, wa3Var != null ? new hd5(16, wa3Var, lg4Var) : null);
    }
}
