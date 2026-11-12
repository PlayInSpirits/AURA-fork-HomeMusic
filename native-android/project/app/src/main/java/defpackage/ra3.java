package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ra3 extends e22 {
    public static final ra3 f = new ra3(1, 0, 2);

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        int iC = x20Var.c(0);
        int i = lg4Var.v;
        int iN = lg4Var.N(lg4Var.b, lg4Var.r(i));
        int iG = lg4Var.g(lg4Var.b, lg4Var.r(i + 1));
        for (int iMax = Math.max(iN, iG - iC); iMax < iG; iMax++) {
            Object obj = lg4Var.c[lg4Var.h(iMax)];
            if (obj instanceof wg1) {
                uy3Var.e((wg1) obj);
            } else if (obj instanceof lv3) {
                ((lv3) obj).c();
            }
        }
        if (iC <= 0) {
            l80.a("Check failed");
        }
        int i2 = lg4Var.v;
        int iN2 = lg4Var.N(lg4Var.b, lg4Var.r(i2));
        int iG2 = lg4Var.g(lg4Var.b, lg4Var.r(i2 + 1)) - iC;
        if (iG2 < iN2) {
            l80.a("Check failed");
        }
        lg4Var.J(iG2, iC, i2);
        int i3 = lg4Var.i;
        if (i3 >= iN2) {
            lg4Var.i = i3 - iC;
        }
    }
}
