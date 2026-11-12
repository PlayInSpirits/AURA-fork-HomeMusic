package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u82 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ x82 o;

    public /* synthetic */ u82(x82 x82Var, int i) {
        this.n = i;
        this.o = x82Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        int i2 = 0;
        x82 x82Var = this.o;
        switch (i) {
            case 0:
                nc3 nc3Var = (nc3) x82Var.B.invoke();
                int iB = nc3Var.b();
                while (i2 < iB) {
                    if (nc3Var.c(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                nc3 nc3Var2 = (nc3) x82Var.B.invoke();
                if (iIntValue < 0 || iIntValue >= nc3Var2.b()) {
                    fz1.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + nc3Var2.b() + ")");
                }
                fu.G(x82Var.e0(), null, null, new w82(x82Var, iIntValue, null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
