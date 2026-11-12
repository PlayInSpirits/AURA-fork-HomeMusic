package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ca3 extends e22 {
    public static final ca3 g;
    public static final ca3 h;
    public static final ca3 i;
    public static final ca3 j;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        g = new ca3(i2, 2, 0);
        int i3 = 1;
        h = new ca3(i3, i3, 1);
        i = new ca3(i2, 2, 2);
        int i4 = 1;
        j = new ca3(i4, i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca3(int i2, int i3, int i4) {
        super(i2, i3);
        this.f = i4;
    }

    @Override // defpackage.e22
    public final void d(x20 x20Var, bi biVar, lg4 lg4Var, uy3 uy3Var, wa3 wa3Var) {
        switch (this.f) {
            case 0:
                Object objInvoke = ((gf1) x20Var.d(0)).invoke();
                mg1 mg1Var = (mg1) x20Var.d(1);
                int iC = x20Var.c(0);
                mg1Var.getClass();
                lg4Var.U(lg4Var.c(mg1Var), objInvoke);
                biVar.h(iC, objInvoke);
                biVar.b(objInvoke);
                break;
            case 1:
                mg1 mg1Var2 = (mg1) x20Var.d(0);
                int iC2 = x20Var.c(0);
                biVar.g();
                mg1Var2.getClass();
                biVar.a(iC2, lg4Var.D(lg4Var.c(mg1Var2)));
                break;
            case 2:
                Object objD = x20Var.d(0);
                mg1 mg1Var3 = (mg1) x20Var.d(1);
                int iC3 = x20Var.c(0);
                if (objD instanceof wg1) {
                    wg1 wg1Var = (wg1) objD;
                    uy3Var.e.b(wg1Var);
                    uy3Var.d.a(wg1Var);
                }
                Object objK = lg4Var.K(lg4Var.c(mg1Var3), iC3, objD);
                if (objK instanceof wg1) {
                    uy3Var.e((wg1) objK);
                } else if (objK instanceof lv3) {
                    ((lv3) objK).c();
                }
                break;
            default:
                Object objD2 = x20Var.d(0);
                int iC4 = x20Var.c(0);
                if (objD2 instanceof wg1) {
                    wg1 wg1Var2 = (wg1) objD2;
                    uy3Var.e.b(wg1Var2);
                    uy3Var.d.a(wg1Var2);
                }
                Object objK2 = lg4Var.K(lg4Var.t, iC4, objD2);
                if (objK2 instanceof wg1) {
                    uy3Var.e((wg1) objK2);
                } else if (objK2 instanceof lv3) {
                    ((lv3) objK2).c();
                }
                break;
        }
    }

    @Override // defpackage.e22
    public mg1 e(x20 x20Var) {
        switch (this.f) {
            case 0:
                return (mg1) x20Var.d(1);
            case 1:
                return (mg1) x20Var.d(0);
            default:
                return super.e(x20Var);
        }
    }
}
