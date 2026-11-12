package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u93 extends e22 {
    public static final u93 f = new u93(0, 2, 1);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        int i;
        l02 l02Var = (l02) x20Var.d(0);
        int iC = lg4Var.c((mg1) x20Var.d(1));
        if (lg4Var.t >= iC) {
            l80.a("Check failed");
        }
        ji2.A(lg4Var, biVar, iC);
        int i2 = lg4Var.t;
        int iE = lg4Var.v;
        while (iE >= 0 && !lg4Var.y(iE)) {
            iE = lg4Var.E(lg4Var.b, iE);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (lg4Var.v(i2, iU)) {
                if (lg4Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += lg4Var.y(iU) ? 1 : lg4Var.b[(lg4Var.r(iU) * 5) + 1] & 67108863;
                iU += lg4Var.u(iU);
            }
        }
        while (true) {
            i = lg4Var.t;
            if (i >= iC) {
                break;
            }
            if (lg4Var.v(iC, i)) {
                int i3 = lg4Var.t;
                if (i3 < lg4Var.u && (lg4Var.b[(lg4Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    biVar.b(lg4Var.D(lg4Var.t));
                    iL = 0;
                }
                lg4Var.P();
            } else {
                iL += lg4Var.L();
            }
        }
        if (i != iC) {
            l80.a("Check failed");
        }
        l02Var.a = iL;
    }
}
