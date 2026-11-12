package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ fc3 o;
    public final /* synthetic */ qp4 p;

    public /* synthetic */ sx(fc3 r1, qp4 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r4, Object r5) {
        int r0 = this.n;
        j15 r1 = j15.a;
        qp4 r2 = this.p;
        fc3 r3 = this.o;
        int r6 = ((Integer) r4).intValue();
        int r7 = ((Integer) r5).intValue();
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.b(r2, r6, r7);
        return r1;
    L6:
        r3.b(r2, r6, r7);
        return r1;
    }
}
