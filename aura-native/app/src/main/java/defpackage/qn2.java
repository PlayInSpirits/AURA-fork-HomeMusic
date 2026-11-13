package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class qn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn2 o;
    public final /* synthetic */ mw1 p;
    public final /* synthetic */ fr2 q;
    public final /* synthetic */ int r;

    public /* synthetic */ qn2(tn2 tn2Var, mw1 mw1Var, fr2 fr2Var, int i, int i2) {
        this.n = i2;
        this.o = tn2Var;
        this.p = mw1Var;
        this.q = fr2Var;
        this.r = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        int i2 = this.r;
        fr2 fr2Var = this.q;
        mw1 mw1Var = this.p;
        tn2 tn2Var = this.o;
        tn2Var.getClass();
        switch (i) {
            case 0:
                m92 m92Var = (m92) tn2.E(mw1Var);
                if (m92Var != null) {
                    tn2Var.n(fr2Var, m92Var);
                    tn2.G(i2, m92Var);
                    break;
                }
                break;
            default:
                m92 m92Var2 = (m92) tn2.E(mw1Var);
                if (m92Var2 != null) {
                    tn2Var.n(fr2Var, m92Var2);
                    tn2.G(i2, m92Var2);
                    break;
                }
                break;
        }
    }
}
