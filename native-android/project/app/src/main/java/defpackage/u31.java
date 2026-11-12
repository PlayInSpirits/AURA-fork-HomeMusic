package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u31 implements rc2, qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ i41 o;

    public /* synthetic */ u31(i41 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.rc2
    public void f(Object r2, w71 r3) {
        ((oi3) r2).B(this.o.g, new ni3(r3));
    }

    @Override // defpackage.qc2
    public void invoke(Object r2) {
        int r0 = this.n;
        i41 r1 = this.o;
        oi3 r3 = (oi3) r2;
        switch(r0) {
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        r3.G(r1.T);
        return;
    L6:
        r3.O(r1.R);
    }
}
