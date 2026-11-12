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
    public final void c0(q94 r2) {
        if (this.H == true) goto L5;
        return;
    L5:
        o94.b(r2, this.G);
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 r3, pi2 r4, long r5) {
        jg3 r6 = r4.r(r5);
        int r7 = r6.n;
        int r8 = r6.o;
        o r0 = new o(28, r6, this);
        return r3.v(r7, r8, v01.n, r0);
    }

    public final String toString() {
        float r0 = this.B;
        float r1 = this.C;
        float r2 = this.D;
        float r3 = this.E;
        long r4 = this.F;
        int r6 = tw4.b;
        ac4 r7 = this.G;
        boolean r8 = this.H;
        String r9 = x40.h(this.I);
        String r10 = x40.h(this.J);
        String r11 = e35.X(this.K);
        m62 r14 = this.L;
        StringBuilder r5 = b11.r("SimpleGraphicsLayerModifier(scaleX=", r0, ", scaleY=", r1, ", alpha = ");
        r5.append(r2);
        r5.append(", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        r5.append(r3);
        r5.append(", transformOrigin=");
        r5.append("TransformOrigin(packedValue=" + r4 + ")");
        r5.append(", shape=");
        r5.append(r7);
        r5.append(", clip=");
        r5.append(r8);
        r5.append(", renderEffect=null, ambientShadowColor=");
        r5.append(r9);
        r5.append(", spotShadowColor=");
        f34.n(r5, r10, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", r11, ", colorFilter=nulloutsets=");
        r5.append(r14);
        r5.append(")");
        return r5.toString();
    }
}
