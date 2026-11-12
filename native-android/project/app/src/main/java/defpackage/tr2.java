package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr2 implements yr2, ks2 {
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ tr2(ls2 r1, gn2 r2, boolean r3, boolean r4) {
        this.p = r1;
        this.q = r2;
        this.n = r3;
        this.o = r4;
    }

    @Override // defpackage.ks2
    public void b(fr2 r9) {
        ls2 r0 = (ls2) this.p;
        gn2 r1 = (gn2) this.q;
        lb4 r10 = r0.g.x(r9, yw1.o(r1), -1, -9223372036854775807L);
        la0 r2 = new la0();
        r2.q = r0;
        r2.p = r9;
        r2.n = this.n;
        r2.o = this.o;
        r10.f(new lg1(0, r10, r2), gq0.n);
    }

    @Override // defpackage.yr2
    public void f(er2 r8, int r9) {
        za4 r3 = (za4) this.p;
        int r6 = ((fr2) this.q).c;
        r8.B(r9, r3, this.n, this.o, r6);
    }

    public /* synthetic */ tr2(za4 r1, boolean r2, boolean r3, fr2 r4) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
        this.q = r4;
    }
}
