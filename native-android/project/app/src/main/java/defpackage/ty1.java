package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 {
    public final f13 a = new f13(new qy1[16]);
    public final zd3 b = uc5.B(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final zd3 d = uc5.B(Boolean.TRUE);

    public final void a(int i, rg1 rg1Var) {
        rg1Var.S(-318043801);
        int i2 = (rg1Var.g(this) ? 4 : 2) | i;
        if (rg1Var.K(i2 & 1, (i2 & 3) != 2)) {
            Object objH = rg1Var.H();
            i80 i80Var = j80.a;
            if (objH == i80Var) {
                objH = uc5.B(null);
                rg1Var.b0(objH);
            }
            b13 b13Var = (b13) objH;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                rg1Var.R(-144841960);
                boolean zG = rg1Var.g(this);
                Object objH2 = rg1Var.H();
                if (zG || objH2 == i80Var) {
                    objH2 = new x70(b13Var, this, null);
                    rg1Var.b0(objH2);
                }
                bu.c((wf1) objH2, rg1Var, this);
                rg1Var.o(false);
            } else {
                rg1Var.R(-143455237);
                rg1Var.o(false);
            }
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new z(i, 5, this);
        }
    }
}
