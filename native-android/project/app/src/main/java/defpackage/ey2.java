package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey2 implements if1 {
    public final /* synthetic */ hy2 n;
    public final /* synthetic */ jx3 o;
    public final /* synthetic */ gx3 p;
    public final /* synthetic */ g74 q;
    public final /* synthetic */ fx3 r;

    public /* synthetic */ ey2(hy2 hy2Var, jx3 jx3Var, gx3 gx3Var, g74 g74Var, fx3 fx3Var) {
        this.n = hy2Var;
        this.o = jx3Var;
        this.p = gx3Var;
        this.q = g74Var;
        this.r = fx3Var;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        hy2 hy2Var = this.n;
        cy2 cy2VarI = hy2.I(hy2Var.g);
        if (cy2VarI != null) {
            rf2 rf2Var = (rf2) hy2Var.e;
            long j = cy2VarI.b;
            long j2 = cy2VarI.a;
            ((m45) rf2Var.n).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
            ((m45) rf2Var.o).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
            jx3 jx3Var = this.o;
            cy2 cy2VarA = ((cy2) jx3Var.n).a(cy2VarI);
            jx3Var.n = cy2VarA;
            long j3 = cy2VarA.a;
            g74 g74Var = this.q;
            float fJ = g74Var.j(g74Var.f(j3));
            this.p.n = fJ;
            this.r.n = !h12.b(fJ - fFloatValue);
        }
        return Boolean.valueOf(cy2VarI != null);
    }
}
