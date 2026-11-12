package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class tj1 extends gx2 {
    public final float a;
    public final long b;
    public final ac4 c;
    public final long d;
    public final long e;
    public final m62 f;

    public tj1(float f, long j, ac4 ac4Var, long j2, long j3, m62 m62Var) {
        this.a = f;
        this.b = j;
        this.c = ac4Var;
        this.d = j2;
        this.e = j3;
        this.f = m62Var;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        we4 we4Var = new we4();
        we4Var.B = 1.0f;
        we4Var.C = 1.0f;
        we4Var.D = this.a;
        we4Var.E = 8.0f;
        we4Var.F = this.b;
        we4Var.G = this.c;
        we4Var.H = true;
        we4Var.I = this.d;
        we4Var.J = this.e;
        we4Var.K = 3;
        we4Var.L = this.f;
        we4Var.M = new kl3(9, we4Var);
        return we4Var;
    }

    @Override // defpackage.gx2
    public final void e(cx2 cx2Var) {
        f63 f63Var;
        we4 we4Var = (we4) cx2Var;
        we4Var.B = 1.0f;
        we4Var.C = 1.0f;
        we4Var.D = this.a;
        we4Var.E = 8.0f;
        we4Var.F = this.b;
        we4Var.G = this.c;
        we4Var.H = true;
        we4Var.I = this.d;
        we4Var.J = this.e;
        we4Var.K = 3;
        we4Var.L = this.f;
        kl3 kl3Var = we4Var.M;
        if (we4Var.n.A && (f63Var = j51.M(we4Var, 2).I) != null) {
            f63Var.Y0(kl3Var, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tj1) {
            tj1 tj1Var = (tj1) obj;
            if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.a, tj1Var.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = tj1Var.b;
                int i = tw4.b;
                if (this.b == j && h12.c(this.c, tj1Var.c) && x40.c(this.d, tj1Var.d) && x40.c(this.e, tj1Var.e) && h12.c(this.f, tj1Var.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(Float.hashCode(1.0f) * 31, 1.0f, 31), this.a, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 8.0f, 31);
        int i = tw4.b;
        int iC = xa3.c((this.c.hashCode() + xa3.b(iD, 31, this.b)) * 31, 961, true);
        int i2 = x40.h;
        return this.f.hashCode() + f34.d(3, f34.d(0, xa3.b(xa3.b(iC, 31, this.d), 31, this.e), 31), 961);
    }

    public final String toString() {
        int i = tw4.b;
        String str = "TransformOrigin(packedValue=" + this.b + ")";
        String strH = x40.h(this.d);
        String strH2 = x40.h(this.e);
        String strX = e35.X(3);
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append(str);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=true, renderEffect=null, ambientShadowColor=");
        sb.append(strH);
        sb.append(", spotShadowColor=");
        f34.n(sb, strH2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", strX, ", colorFilter=null, outsets=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
