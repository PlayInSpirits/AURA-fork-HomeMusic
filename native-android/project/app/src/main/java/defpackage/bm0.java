package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bm0 implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ bm0(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.go4
    public final Object get() {
        int r0 = this.n;
        Object r1 = this.p;
        Object r4 = this.o;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        pe4 r2 = (pe4) r1;
        oe4 r3 = r2.a();
        r3.d = 1;
        r3.J = ne4.k;
        bu4 r5 = ((qe4) r4).b;
        r3.H = new xm(qe4.h1(r2.D.get(), r2, r5));
        r3.I = r2.E;
        return new pe4(r3);
    L7:
        return new jr3((bi0) r1, (n51) ((au) r4).b);
    }
}
