package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy1 implements kl4 {
    public Float n;
    public Float o;
    public final zd3 p;
    public yq4 q;
    public boolean r;
    public boolean s;
    public long t;
    public final /* synthetic */ ty1 u;

    public qy1(ty1 r2, Float r3, Float r4, py1 r5) {
        this.u = r2;
        this.n = r3;
        this.o = r4;
        this.p = uc5.B(r3);
        this.q = new yq4(r5, this.n, this.o, null);
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return this.p.getValue();
    }
}
