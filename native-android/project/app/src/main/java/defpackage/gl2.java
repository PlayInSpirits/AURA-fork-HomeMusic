package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gl2 implements xl2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ gn2 p;

    public /* synthetic */ gl2(bm2 r1, gn2 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.xl2
    public final void d(pu1 r4, int r5) {
        int r0 = this.n;
        gn2 r2 = this.p;
        bm2 r3 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r4.G(r3.c, r5, r2.c(true));
        return;
    L6:
        r4.i0(r3.c, r5, r2.c(true));
        return;
    L8:
        r4.o0(r3.c, r5, r2.c(true), true);
    }
}
