package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln2 implements mk {
    public final /* synthetic */ int n;
    public final /* synthetic */ pn2 o;

    public /* synthetic */ ln2(pn2 pn2Var, int i) {
        this.n = i;
        this.o = pn2Var;
    }

    @Override // defpackage.mk
    public final ic2 apply(Object obj) {
        Object obj2;
        int i = this.n;
        pn2 pn2Var = this.o;
        m92 m92Var = (m92) obj;
        switch (i) {
            case 0:
                rr2.s(m92Var, "LibraryResult must not be null");
                lb4 lb4Var = new lb4();
                if (m92Var.a != 0 || (obj2 = m92Var.c) == null) {
                    lb4Var.l(null);
                } else {
                    gn2 gn2Var = (gn2) obj2;
                    byte[] bArr = gn2Var.d.k;
                    if (bArr == null) {
                        lb4Var.l(f92.a(gn2Var, null));
                    } else {
                        ic2 ic2VarJ = pn2Var.z.m.j(bArr);
                        mn2 mn2Var = new mn2(lb4Var, ic2VarJ, 0);
                        gq0 gq0Var = gq0.n;
                        lb4Var.f(mn2Var, gq0Var);
                        ((k91) ic2VarJ).f(new v6(ic2VarJ, lb4Var, gn2Var, 25), gq0Var);
                    }
                }
                return lb4Var;
            default:
                return pn2.a(pn2Var, m92Var);
        }
    }
}
