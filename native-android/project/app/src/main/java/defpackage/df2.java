package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class df2 extends ig3 {
    public final /* synthetic */ int o;
    public final Object p;

    public /* synthetic */ df2(int i, Object obj) {
        this.o = i;
        this.p = obj;
    }

    @Override // defpackage.oo0
    public final float J() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                return ((cf2) obj).J();
            default:
                return ((ra) obj).getDensity().J();
        }
    }

    @Override // defpackage.ig3
    public float b(rp1 rp1Var) {
        if1 if1Var;
        int iM0;
        wb3 snapshotObserver;
        int iM1;
        switch (this.o) {
            case 0:
                wf1 wf1Var = rp1Var.a;
                if (wf1Var != null) {
                    return ((Number) wf1Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                cf2 cf2Var = (cf2) this.p;
                if (cf2Var.B) {
                    return Float.NaN;
                }
                jx3 jx3Var = new jx3();
                jx3Var.n = cf2Var;
                while (true) {
                    c6 c6Var = ((cf2) jx3Var.n).D;
                    float f = (c6Var == null || (iM1 = ti.m0((rp1[]) c6Var.b, rp1Var)) < 0) ? Float.NaN : ((float[]) c6Var.c)[iM1];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = jx3Var.n;
                    if (!zIsNaN) {
                        ((cf2) obj).S(cf2Var.g0(), rp1Var);
                        return rp1Var.a(f, ((cf2) jx3Var.n).e0(), cf2Var.e0());
                    }
                    cf2 cf2Var2 = (cf2) obj;
                    wf1 wf1Var2 = cf2Var2.u;
                    if (wf1Var2 != null && (if1Var = cf2Var2.v) != null && ((Boolean) if1Var.invoke(rp1Var)).booleanValue()) {
                        cf2 cf2Var3 = (cf2) jx3Var.n;
                        w03 w03Var = cf2Var3.x;
                        if (w03Var == null) {
                            long[] jArr = v54.a;
                            w03Var = new w03();
                            cf2Var3.x = w03Var;
                        }
                        Object objG = w03Var.g(rp1Var);
                        if (objG == null) {
                            objG = new lg3(cf2Var3.h0(), cf2Var3, rp1Var);
                            w03Var.l(rp1Var, objG);
                        }
                        lg3 lg3Var = (lg3) objG;
                        lg3Var.n = cf2Var3.h0();
                        ub3 ub3Var = cf2Var.g0().A;
                        if (ub3Var != null && (snapshotObserver = ((ra) ub3Var).getSnapshotObserver()) != null) {
                            snapshotObserver.a.e(lg3Var, cf2.G, new jo(wf1Var2, jx3Var, rp1Var, 6));
                        }
                        ((cf2) jx3Var.n).S(cf2Var.g0(), rp1Var);
                        c6 c6Var2 = ((cf2) jx3Var.n).D;
                        float f2 = (c6Var2 == null || (iM0 = ti.m0((rp1[]) c6Var2.b, rp1Var)) < 0) ? Float.NaN : ((float[]) c6Var2.c)[iM0];
                        if (!Float.isNaN(f2)) {
                            return rp1Var.a(f2, ((cf2) jx3Var.n).e0(), cf2Var.e0());
                        }
                    }
                    cf2 cf2VarI0 = ((cf2) jx3Var.n).i0();
                    if (cf2VarI0 == null) {
                        ((cf2) jx3Var.n).S(cf2Var.g0(), rp1Var);
                        return Float.NaN;
                    }
                    jx3Var.n = cf2VarI0;
                }
                break;
            default:
                return super.b(rp1Var);
        }
    }

    @Override // defpackage.ig3
    public final r62 c() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                return ((cf2) obj).getLayoutDirection();
            default:
                return ((ra) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.ig3
    public final int e() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                return ((cf2) obj).G();
            default:
                return ((ra) obj).getRoot().R.p.n;
        }
    }

    @Override // defpackage.oo0
    public final float g() {
        int i = this.o;
        Object obj = this.p;
        switch (i) {
            case 0:
                return ((cf2) obj).g();
            default:
                return ((ra) obj).getDensity().g();
        }
    }
}
