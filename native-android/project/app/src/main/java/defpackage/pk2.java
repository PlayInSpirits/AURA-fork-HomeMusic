package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pk2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bl2 o;
    public final /* synthetic */ sk2 p;

    public /* synthetic */ pk2(bl2 r1, sk2 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        bl2 r0 = this.o;
        sk2 r3 = this.p;
        if ((r0.n instanceof f0) == false) goto L13;
        r3.Y0();
        return;
    L13:
        return;
    L8:
        bl2 r1 = this.o;
        sk2 r4 = this.p;
        r1.v = r4;
        if (r1.w == false) goto L11;
        r1.l(r4);
    L11:
        r1.f(new pk2(r1, r4, 1), new h41(1, r1));
    }
}
