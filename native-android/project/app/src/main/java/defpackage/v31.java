package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v31 implements qc2, lm2, yr2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ v31(int r1, int r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.wc0
    public void accept(Object r2) {
        switch(this.n) {
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.p;
        ((al3) r2).t0(this.o, r0);
        return;
    L6:
        int r1 = this.p;
        ((al3) r2).H(this.o, r1);
    }

    @Override // defpackage.lm2
    public void c(bm2 r2) {
        r2.p1(this.o, this.p);
    }

    @Override // defpackage.yr2
    public void f(er2 r2, int r3) {
        r2.i(r3, this.o, this.p);
    }

    @Override // defpackage.qc2
    public void invoke(Object r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int r0 = this.p;
        ((oi3) r2).T(this.o, r0);
        return;
    L6:
        int r1 = this.p;
        ((oi3) r2).T(this.o, r1);
    }
}
