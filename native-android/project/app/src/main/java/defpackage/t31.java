package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t31 implements qc2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;

    public /* synthetic */ t31(int r1, boolean r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.wc0
    public void accept(Object r2) {
        int r0 = this.n;
        boolean r1 = this.o;
        al3 r3 = (al3) r2;
        switch(r0) {
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        r3.s(r1);
        return;
    L6:
        r3.q0(r1);
        return;
    L8:
        r3.V(r1);
    }

    @Override // defpackage.qc2
    public void invoke(Object r2) {
        int r0 = this.n;
        boolean r1 = this.o;
        oi3 r3 = (oi3) r2;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r3.x(r1);
        return;
    L6:
        r3.d(r1);
        return;
    L8:
        r3.x(r1);
    }
}
