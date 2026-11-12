package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jm2 implements lm2, it2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ int p;
    public final /* synthetic */ jn2 q;

    public /* synthetic */ jm2(String r1, int r2, int r3, jn2 r4) {
        this.n = 2;
        this.o = r1;
        this.p = r3;
        this.q = r4;
    }

    @Override // defpackage.lm2
    public void c(bm2 r10) {
        int r1 = 10;
        switch(this.n) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        kj2 r3 = (kj2) r10;
        if (r3.Y() == false) goto L19;
        bj2 r11 = r3.J;
        er1 r2 = new er1(r3, this.o, this.p, this.q, 17);
        aj2 r9 = (aj2) r11.e;
        if (r9 == null) goto L18;
        f35.W(r11.f, new ws1(r1, r2, r9));
        return;
    L18:
        return;
    L19:
        return;
    L11:
        kj2 r4 = (kj2) r10;
        if (r4.Y() == false) goto L21;
        bj2 r12 = r4.J;
        er1 r5 = new er1(r4, this.o, this.p, this.q, 16);
        aj2 r13 = (aj2) r12.e;
        if (r13 == null) goto L20;
        f35.W(r12.f, new ws1(r1, r5, r13));
        return;
    L20:
        return;
    }

    @Override // defpackage.it2
    public Object h(tn2 r2, fr2 r3, int r4) {
        jn2 r5 = this.q;
        return r2.r(r3, this.o, this.p, r5);
    }

    public /* synthetic */ jm2(String r1, int r2, jn2 r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }
}
