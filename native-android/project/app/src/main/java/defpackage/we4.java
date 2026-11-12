package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class we4 extends cx2 implements u62, g94 {
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
        jg3 jg3VarR = pi2Var.r(j);
        return cf2Var.v(jg3VarR.n, jg3VarR.o, v01.n, new o(28, jg3VarR, this));
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
        String strH = x40.h(this.I);
        String strH2 = x40.h(this.J);
        String strX = e35.X(this.K);
        m62 m62Var = this.L;
        StringBuilder sbR = b11.r("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        sbR.append(f3);
        sbR.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sbR.append(f4);
        sbR.append(", transformOrigin=");
        sbR.append("TransformOrigin(packedValue=" + j + ")");
        sbR.append(", shape=");
        sbR.append(ac4Var);
        sbR.append(", clip=");
        sbR.append(z);
        sbR.append(", renderEffect=null, ambientShadowColor=");
        sbR.append(strH);
        sbR.append(", spotShadowColor=");
        f34.n(sbR, strH2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", strX, ", colorFilter=nulloutsets=");
        sbR.append(m62Var);
        sbR.append(")");
        return sbR.toString();
    }
}
