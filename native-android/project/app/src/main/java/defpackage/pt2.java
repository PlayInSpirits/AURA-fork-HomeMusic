package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt2 implements wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ue1 o;
    public final /* synthetic */ ed2 p;
    public final /* synthetic */ un2 q;

    public /* synthetic */ pt2(ue1 r1, ed2 r2, un2 r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.wc0
    public final void accept(Object r4) {
        int r0 = this.n;
        un2 r1 = this.q;
        ed2 r2 = this.p;
        ue1 r3 = this.o;
        st2 r5 = (st2) r4;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r5.u(r3.o, (mt2) r3.p, r2, r1);
        return;
    L6:
        r5.w(r3.o, (mt2) r3.p, r2, r1);
    }
}
