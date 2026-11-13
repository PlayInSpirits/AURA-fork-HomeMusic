package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qy1 implements kl4 {
    public Float n;
    public Float o;
    public final zd3 p;
    public yq4 q;
    public boolean r;
    public boolean s;
    public long t;
    public final /* synthetic */ ty1 u;

    public qy1(ty1 ty1Var, Float f, Float f2, py1 py1Var) {
        this.u = ty1Var;
        this.n = f;
        this.o = f2;
        this.p = uc5.B(f);
        this.q = new yq4(py1Var, this.n, this.o, null);
    }

    @Override // defpackage.kl4
    public final Object getValue() {
        return this.p.getValue();
    }
}
