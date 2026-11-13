package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ty1 {
    public final f13 a = new f13(new qy1[16]);
    public final zd3 b = uc5.B(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final zd3 d = uc5.B(Boolean.TRUE);

    public final void a(int i, rg1 rg1Var) {
        rg1Var.S(-318043801);
        int i2 = (rg1Var.g(this) ? 4 : 2) | i;
        if (rg1Var.K(i2 & 1, (i2 & 3) != 2)) {
            Object H = rg1Var.H();
            i80 i80Var = j80.a;
            if (H == i80Var) {
                H = uc5.B(null);
                rg1Var.b0(H);
            }
            b13 b13Var = (b13) H;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                rg1Var.R(-144841960);
                boolean g = rg1Var.g(this);
                Object H2 = rg1Var.H();
                if (g || H2 == i80Var) {
                    H2 = new x70(b13Var, this, null);
                    rg1Var.b0(H2);
                }
                bu.c((wf1) H2, rg1Var, this);
                rg1Var.o(false);
            } else {
                rg1Var.R(-143455237);
                rg1Var.o(false);
            }
        } else {
            rg1Var.N();
        }
        lv3 p = rg1Var.p();
        if (p != null) {
            p.d = new z(i, 5, this);
        }
    }
}
