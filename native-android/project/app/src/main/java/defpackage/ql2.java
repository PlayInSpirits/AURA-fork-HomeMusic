package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql2 implements qc2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ qh3 o;

    public /* synthetic */ ql2(qh3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.wc0
    public void accept(Object r1) {
        al3 r2 = (al3) r1;
        r2.d(this.o);
    }

    @Override // defpackage.qc2
    public void invoke(Object r2) {
        int r0 = this.n;
        qh3 r1 = this.o;
        oi3 r3 = (oi3) r2;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.N(r1);
        return;
    L6:
        r3.N(r1);
    }
}
