package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x60 extends a32 {
    public final Object j0(wd0 wd0Var) {
        Object objH;
        do {
            objH = H();
            if (!(objH instanceof mx1)) {
                if (objH instanceof a70) {
                    throw ((a70) objH).a;
                }
                return zz1.M(objH);
            }
        } while (d0(objH) < 0);
        x22 x22Var = new x22(ya4.x(wd0Var), this);
        x22Var.u();
        x22Var.x(new wy(2, gb.K(this, true, new w14(x22Var))));
        return x22Var.q();
    }
}
