package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nl2 implements xl2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    public /* synthetic */ nl2(bm2 r1, int r2, int r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.xl2
    public final void d(pu1 r4, int r5) {
        int r0 = this.n;
        int r1 = this.q;
        int r2 = this.p;
        bm2 r3 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r4.F0(r3.c, r5, r2, r1);
        return;
    L6:
        r4.t(r3.c, r5, r2, r1);
        return;
    L8:
        r4.M(r3.c, r5, r2, r1);
    }
}
