package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class rl2 implements xl2, ks2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ float p;

    public /* synthetic */ rl2(Object obj, float f, int i) {
        this.n = i;
        this.o = obj;
        this.p = f;
    }

    @Override // defpackage.ks2
    public void b(fr2 fr2Var) {
        ((ls2) this.o).g.s.e(this.p);
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        float f = this.p;
        bm2 bm2Var = (bm2) this.o;
        switch (i2) {
            case 0:
                pu1Var.w(bm2Var.c, i, f);
                break;
            case 1:
                pu1Var.x(bm2Var.c, i, f);
                break;
            default:
                cb4 cb4Var = bm2Var.n;
                cb4Var.getClass();
                int f2 = cb4Var.a.f();
                mm2 mm2Var = bm2Var.c;
                if (f2 < 6) {
                    pu1Var.x(mm2Var, i, f);
                    break;
                } else {
                    pu1Var.p(mm2Var, i);
                    break;
                }
        }
    }
}
