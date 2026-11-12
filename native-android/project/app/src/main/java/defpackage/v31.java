package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v31 implements qc2, lm2, yr2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ v31(int i, int i2, int i3) {
        this.n = i3;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        switch (this.n) {
            case 4:
                ((al3) obj).H(this.o, this.p);
                break;
            default:
                ((al3) obj).t0(this.o, this.p);
                break;
        }
    }

    @Override // defpackage.lm2
    public void c(bm2 bm2Var) {
        bm2Var.p1(this.o, this.p);
    }

    @Override // defpackage.yr2
    public void f(er2 er2Var, int i) {
        er2Var.i(i, this.o, this.p);
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        switch (this.n) {
            case 0:
                ((oi3) obj).T(this.o, this.p);
                break;
            default:
                ((oi3) obj).T(this.o, this.p);
                break;
        }
    }
}
