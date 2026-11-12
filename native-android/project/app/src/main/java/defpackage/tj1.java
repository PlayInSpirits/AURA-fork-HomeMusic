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

    public tj1(float r1, long r2, ac4 r4, long r5, long r7, m62 r9) {
        this.a = r1;
        this.b = r2;
        this.c = r4;
        this.d = r5;
        this.e = r7;
        this.f = r9;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        we4 r0 = new we4();
        r0.B = 1.0f;
        r0.C = 1.0f;
        r0.D = this.a;
        r0.E = 8.0f;
        r0.F = this.b;
        r0.G = this.c;
        r0.H = true;
        r0.I = this.d;
        r0.J = this.e;
        r0.K = 3;
        r0.L = this.f;
        r0.M = new kl3(9, r0);
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r4) {
        we4 r5 = (we4) r4;
        r5.B = 1.0f;
        r5.C = 1.0f;
        r5.D = this.a;
        r5.E = 8.0f;
        r5.F = this.b;
        r5.G = this.c;
        r5.H = true;
        r5.I = this.d;
        r5.J = this.e;
        r5.K = 3;
        r5.L = this.f;
        kl3 r3 = r5.M;
        if (r5.n.A == false) goto L10;
        f63 r6 = j51.M(r5, 2).I;
        if (r6 == null) goto L9;
        r6.Y0(r3, true);
        return;
    L9:
        return;
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L5;
        return true;
    L5:
        if ((r7 instanceof tj1) == false) goto L50;
        tj1 r8 = (tj1) r7;
        if (Float.compare(1.0f, 1.0f) != 0) goto L50;
        if (Float.compare(1.0f, 1.0f) != 0) goto L50;
        if (Float.compare(this.a, r8.a) != 0) goto L50;
        if (Float.compare(0.0f, 0.0f) != 0) goto L50;
        if (Float.compare(0.0f, 0.0f) != 0) goto L50;
        if (Float.compare(0.0f, 0.0f) != 0) goto L50;
        if (Float.compare(0.0f, 0.0f) != 0) goto L50;
        if (Float.compare(0.0f, 0.0f) != 0) goto L50;
        if (Float.compare(0.0f, 0.0f) != 0) goto L50;
        if (Float.compare(8.0f, 8.0f) != 0) goto L50;
        long r2 = r8.b;
        int r0 = tw4.b;
        if (this.b == r2) goto L40;
        return false;
    L40:
        if (h12.c(this.c, r8.c) == false) goto L50;
        if (x40.c(this.d, r8.d) == false) goto L50;
        if (x40.c(this.e, r8.e) == false) goto L50;
        if (h12.c(this.f, r8.f) == false) goto L50;
        return true;
    L50:
        return false;
    }

    public final int hashCode() {
        int r0 = b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(Float.hashCode(1.0f) * 31, 1.0f, 31), this.a, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 8.0f, 31);
        int r1 = tw4.b;
        int r2 = xa3.b(r0, 31, this.b);
        int r3 = xa3.c((this.c.hashCode() + r2) * 31, 961, true);
        int r4 = x40.h;
        int r5 = f34.d(3, f34.d(0, xa3.b(xa3.b(r3, 31, this.d), 31, this.e), 31), 961);
        return this.f.hashCode() + r5;
    }

    public final String toString() {
        int r0 = tw4.b;
        String r1 = "TransformOrigin(packedValue=" + this.b + ")";
        String r2 = x40.h(this.d);
        String r3 = x40.h(this.e);
        String r4 = e35.X(3);
        StringBuilder r5 = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        r5.append(this.a);
        r5.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        r5.append(r1);
        r5.append(", shape=");
        r5.append(this.c);
        r5.append(", clip=true, renderEffect=null, ambientShadowColor=");
        r5.append(r2);
        r5.append(", spotShadowColor=");
        f34.n(r5, r3, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", r4, ", colorFilter=null, outsets=");
        r5.append(this.f);
        r5.append(")");
        return r5.toString();
    }
}
