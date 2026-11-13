package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lm0 extends ad3 {
    public static final xc5 H;
    public final zd3 G;

    static {
        d60 d60Var = new d60(13, (byte) 0);
        k2 k2Var = new k2(12, (byte) 0);
        z zVar = new z(7, d60Var);
        jz4.j(1, k2Var);
        H = new xc5(19, zVar, k2Var);
    }

    public lm0(int i, float f, gf1 gf1Var) {
        super(i, f);
        this.G = uc5.B(gf1Var);
    }

    @Override // defpackage.ad3
    public final int n() {
        return ((Number) ((gf1) this.G.getValue()).invoke()).intValue();
    }
}
