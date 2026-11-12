package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a41 implements qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ gn2 o;
    public final /* synthetic */ int p;

    public /* synthetic */ a41(gn2 r1, int r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.qc2
    public final void invoke(Object r2) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        oi3 r3 = (oi3) r2;
        r3.t(this.p, this.o);
        return;
    L6:
        oi3 r4 = (oi3) r2;
        r4.t(this.p, this.o);
    }
}
