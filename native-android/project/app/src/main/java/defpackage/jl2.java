package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl2 implements xl2, qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ boolean p;

    public /* synthetic */ jl2(bm2 bm2Var, boolean z, int i) {
        this.n = i;
        this.o = bm2Var;
        this.p = z;
    }

    @Override // defpackage.xl2
    public void d(pu1 pu1Var, int i) {
        int i2 = this.n;
        boolean z = this.p;
        bm2 bm2Var = this.o;
        switch (i2) {
            case 0:
                pu1Var.h0(bm2Var.c, i, z);
                break;
            case 1:
            default:
                pu1Var.B0(bm2Var.c, i, z);
                break;
            case 2:
                pu1Var.H0(bm2Var.c, i, z);
                break;
        }
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        int i = this.n;
        boolean z = this.p;
        bm2 bm2Var = this.o;
        oi3 oi3Var = (oi3) obj;
        switch (i) {
            case 1:
                oi3Var.C(bm2Var.q.t, z);
                break;
            default:
                oi3Var.C(bm2Var.q.t, z);
                break;
        }
    }
}
