package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl2 implements xl2, qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ bm2 o;
    public final /* synthetic */ int p;

    public /* synthetic */ kl2(bm2 r1, int r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.xl2
    public void d(pu1 r3, int r4) {
        int r0 = this.n;
        int r1 = this.p;
        bm2 r2 = this.o;
        switch(r0) {
            case 0: goto L14;
            case 1: goto L12;
            case 5: goto L10;
            case 7: goto L8;
            case 10: goto L6;
            default: goto L4;
        };
    L4:
        r3.N(r2.c, r4, r1);
        return;
    L6:
        r3.f0(r2.c, r4, r1);
        return;
    L8:
        r3.q0(r2.c, r4, r1);
        return;
    L10:
        r3.F(r2.c, r4, r1);
        return;
    L12:
        r3.K(r2.c, r4, r1);
        return;
    L14:
        r3.D0(r2.c, r4, r1);
    }

    @Override // defpackage.qc2
    public void invoke(Object r3) {
        int r0 = this.n;
        int r1 = this.p;
        bm2 r2 = this.o;
        oi3 r4 = (oi3) r3;
        switch(r0) {
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L4;
            case 6: goto L8;
            case 7: goto L4;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        r4.C(r1, r2.q.u);
        return;
    L6:
        r4.C(r1, r2.q.u);
        return;
    L8:
        r4.C(r1, r2.q.u);
        return;
    L10:
        r4.C(r1, r2.q.u);
        return;
    L12:
        r4.C(r1, r2.q.u);
        return;
    L14:
        r4.C(r1, r2.q.u);
    }
}
