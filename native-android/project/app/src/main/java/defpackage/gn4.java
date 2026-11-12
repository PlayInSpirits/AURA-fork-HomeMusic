package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gn4 {
    public static final xi4 a = new xi4(11);
    public static final Object b = new Object();

    public static final void a(kn4 kn4Var, dx2 dx2Var, wf1 wf1Var, rg1 rg1Var, int i) {
        rg1Var.S(-511989831);
        int i2 = i | (rg1Var.g(kn4Var) ? 4 : 2) | (rg1Var.e(dx2Var) ? 32 : 16) | (rg1Var.g(wf1Var) ? 256 : 128);
        if (rg1Var.K(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Long.hashCode(rg1Var.T);
            rg1Var.P(206, l80.e);
            if (rg1Var.S) {
                lg4.z(rg1Var.I);
            }
            Object objZ = rg1Var.z();
            wg1 a24Var = objZ instanceof wg1 ? (wg1) objZ : null;
            if (a24Var == null) {
                a24Var = new a24(new og1(new pg1(rg1Var, rg1Var.T, rg1Var.q, rg1Var.C, rg1Var.h.G)), -1);
                rg1Var.c0(a24Var);
            }
            vy3 vy3Var = a24Var.a;
            vy3Var.getClass();
            pg1 pg1Var = ((og1) vy3Var).n;
            pg1Var.f.setValue(rg1Var.k());
            rg1Var.o(false);
            dx2 dx2VarE = j51.E(rg1Var, dx2Var);
            mf3 mf3VarK = rg1Var.k();
            rg1Var.U();
            if (rg1Var.S) {
                rg1Var.j();
            } else {
                rg1Var.e0();
            }
            l93.c0(kn4Var.c, rg1Var, kn4Var);
            l93.c0(kn4Var.d, rg1Var, pg1Var);
            l93.c0(kn4Var.e, rg1Var, wf1Var);
            e80.e.getClass();
            l93.c0(fz0.H, rg1Var, mf3VarK);
            l93.a0(rg1Var);
            l93.c0(fz0.G, rg1Var, dx2VarE);
            l93.c0(fz0.J, rg1Var, Integer.valueOf(iHashCode));
            rg1Var.o(true);
            if (rg1Var.w()) {
                rg1Var.R(-1259187287);
                rg1Var.o(false);
            } else {
                rg1Var.R(-1259245908);
                boolean zG = rg1Var.g(kn4Var);
                Object objH = rg1Var.H();
                if (zG || objH == j80.a) {
                    objH = new wc(27, kn4Var);
                    rg1Var.b0(objH);
                }
                ya3 ya3Var = rg1Var.M.b.n;
                ya3Var.x0(ma3.f);
                rr2.R(ya3Var, 0, (gf1) objH);
                rg1Var.o(false);
            }
        } else {
            rg1Var.N();
        }
        lv3 lv3VarP = rg1Var.p();
        if (lv3VarP != null) {
            lv3VarP.d = new d90(kn4Var, dx2Var, wf1Var, i, 2);
        }
    }
}
