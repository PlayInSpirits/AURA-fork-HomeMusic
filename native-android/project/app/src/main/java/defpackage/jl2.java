package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl2 implements xl2, qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ boolean p;

    public /* synthetic */ jl2(bm2 r1, boolean r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.xl2
    public void d(pu1 r3, int r4) {
        int r0 = this.n;
        boolean r1 = this.p;
        bm2 r2 = this.o;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L4;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r3.B0(r2.c, r4, r1);
        return;
    L6:
        r3.H0(r2.c, r4, r1);
        return;
    L8:
        r3.h0(r2.c, r4, r1);
    }

    @Override // defpackage.qc2
    public void invoke(Object r3) {
        int r0 = this.n;
        boolean r1 = this.p;
        bm2 r2 = this.o;
        oi3 r4 = (oi3) r3;
        switch(r0) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r4.C(r2.q.t, r1);
        return;
    L6:
        r4.C(r2.q.t, r1);
    }
}
