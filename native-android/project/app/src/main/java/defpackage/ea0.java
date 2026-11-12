package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends q42 implements xf1 {
    public final /* synthetic */ gr4 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ rm2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(gr4 gr4Var, int i, int i2, int i3, int i4, boolean z, boolean z2, rm2 rm2Var) {
        super(3);
        this.n = gr4Var;
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = i4;
        this.s = z;
        this.t = z2;
        this.u = rm2Var;
    }

    @Override // defpackage.xf1
    public final Object a(Object obj, Object obj2, Object obj3) {
        dv3 dv3Var = (dv3) obj;
        f6 f6Var = (f6) obj2;
        hy hyVar = (hy) obj3;
        dv3Var.getClass();
        f6Var.getClass();
        hyVar.getClass();
        boolean z = this.t;
        rm2 rm2Var = this.u;
        gr4 gr4Var = this.n;
        return new lr0(new hg3(18, new gv3(gr4Var, dv3Var, this.o, this.p, this.q, this.r, this.s, z, f6Var, rm2Var, hyVar)), gr4Var);
    }
}
