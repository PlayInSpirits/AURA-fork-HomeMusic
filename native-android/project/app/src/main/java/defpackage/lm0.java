package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lm0 extends ad3 {
    public static final xc5 H = null;
    public final zd3 G;

    static {
        d60 r0 = new d60(13, 0);
        k2 r1 = new k2(12, 0);
        z r2 = new z(7, r0);
        jz4.j(1, r1);
        H = new xc5(19, r2, r1);
    }

    public lm0(int r1, float r2, gf1 r3) {
        super(r1, r2);
        this.G = uc5.B(r3);
    }

    @Override // defpackage.ad3
    public final int n() {
        return ((Number) ((gf1) this.G.getValue()).invoke()).intValue();
    }
}
