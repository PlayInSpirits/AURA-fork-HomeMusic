package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr2 implements yr2, ks2 {
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ tr2(ls2 ls2Var, gn2 gn2Var, boolean z, boolean z2) {
        this.p = ls2Var;
        this.q = gn2Var;
        this.n = z;
        this.o = z2;
    }

    @Override // defpackage.ks2
    public void b(fr2 fr2Var) {
        ls2 ls2Var = (ls2) this.p;
        lb4 lb4VarX = ls2Var.g.x(fr2Var, yw1.o((gn2) this.q), -1, -9223372036854775807L);
        la0 la0Var = new la0();
        la0Var.q = ls2Var;
        la0Var.p = fr2Var;
        la0Var.n = this.n;
        la0Var.o = this.o;
        lb4VarX.f(new lg1(0, lb4VarX, la0Var), gq0.n);
    }

    @Override // defpackage.yr2
    public void f(er2 er2Var, int i) {
        er2Var.B(i, (za4) this.p, this.n, this.o, ((fr2) this.q).c);
    }

    public /* synthetic */ tr2(za4 za4Var, boolean z, boolean z2, fr2 fr2Var) {
        this.p = za4Var;
        this.n = z;
        this.o = z2;
        this.q = fr2Var;
    }
}
