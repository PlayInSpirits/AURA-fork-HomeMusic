package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class we4 extends cx2 implements u62, g94 {
    public we4() {
        super();
    }

    public float B;
    public float C;
    public float D;
    public float E;
    public long F;
    public ac4 G;
    public boolean H;
    public long I;
    public long J;
    public int K;
    public m62 L;
    public kl3 M;

    @Override // defpackage.g94
    public final boolean c() {
        return false;
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        if (this.H) {
            o94.b(q94Var, this.G);
        }
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        jg3 r = pi2Var.r(j);
        return cf2Var.v(r.n, r.o, v01.n, new o(28, r, this));
    }

    public final String toString() {
        float f = this.B;
        float f2 = this.C;
        float f3 = this.D;
        float f4 = this.E;
        long j = this.F;
        int i = tw4.b;
        ac4 ac4Var = this.G;
        boolean z = this.H;
        String h = x40.h(this.I);
        String h2 = x40.h(this.J);
        String X = e35.X(this.K);
        m62 m62Var = this.L;
        StringBuilder r = b11.r("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        r.append(f3);
        r.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        r.append(f4);
        r.append(", transformOrigin=");
        r.append("TransformOrigin(packedValue=" + j + ")");
        r.append(", shape=");
        r.append(ac4Var);
        r.append(", clip=");
        r.append(z);
        r.append(", renderEffect=null, ambientShadowColor=");
        r.append(h);
        r.append(", spotShadowColor=");
        f34.n(r, h2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", X, ", colorFilter=nulloutsets=");
        r.append(m62Var);
        r.append(")");
        return r.toString();
    }
}
