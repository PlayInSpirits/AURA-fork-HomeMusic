package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z31 implements qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ pi3 p;
    public final /* synthetic */ pi3 q;

    public /* synthetic */ z31(int r1, pi3 r2, pi3 r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.qc2
    public final void invoke(Object r4) {
        int r0 = this.n;
        pi3 r1 = this.q;
        pi3 r2 = this.p;
        int r3 = this.o;
        oi3 r5 = (oi3) r4;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r5.j(r3);
        r5.k(r2, r1, r3);
        return;
    L6:
        r5.j(r3);
        r5.k(r2, r1, r3);
    }
}
