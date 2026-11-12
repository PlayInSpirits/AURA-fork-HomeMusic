package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij0 implements qc2, eg1, lm2, wc0, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ ij0(String str, int i, int i2, jn2 jn2Var) {
        this.n = 9;
        this.o = i2;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        int i = this.n;
        int i2 = this.o;
        al3 al3Var = (al3) obj;
        switch (i) {
            case 6:
                al3Var.d0(i2);
                break;
            case 7:
                al3Var.J(i2);
                break;
            case 8:
                al3Var.p0(i2);
                break;
            default:
                al3Var.G0(i2);
                break;
        }
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object obj) {
        return Integer.valueOf(this.o);
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        if (bm2Var.Y() && bm2Var.l.get(this.o) != null) {
            kf2.k();
        }
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        pq pqVar = tn2Var.D;
        tn2Var.B(fr2Var);
        pqVar.getClass();
        mw1 mw1Var = new mw1(m92.b(-6));
        mw1Var.f(new qn2(tn2Var, mw1Var, fr2Var, this.o, 1), new rn2(tn2Var, 0));
        return mw1Var;
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        int i2 = this.o;
        switch (i) {
            case 0:
                ho2 ho2Var = (ho2) obj;
                ho2Var.getClass();
                if (i2 == 1) {
                    ho2Var.v = true;
                }
                ho2Var.l = i2;
                break;
            case 1:
                ((oi3) obj).f(i2);
                break;
            case 2:
                ((oi3) obj).b(i2);
                break;
            default:
                ((oi3) obj).f(i2);
                break;
        }
    }

    public /* synthetic */ ij0(int i, va4 va4Var, Bundle bundle, Bundle bundle2) {
        this.n = 5;
        this.o = i;
    }

    public /* synthetic */ ij0(q9 q9Var, int i, pi3 pi3Var, pi3 pi3Var2) {
        this.n = 0;
        this.o = i;
    }

    public /* synthetic */ ij0(int i, int i2) {
        this.n = i2;
        this.o = i;
    }
}
