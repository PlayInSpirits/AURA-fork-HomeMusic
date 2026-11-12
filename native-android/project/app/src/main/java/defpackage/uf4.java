package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class uf4 extends gx2 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public uf4(float r1, float r2, float r3, float r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // defpackage.gx2
    public final cx2 d() {
        vf4 r0 = new vf4();
        r0.B = this.a;
        r0.C = this.b;
        r0.D = this.c;
        r0.E = this.d;
        r0.F = true;
        return r0;
    }

    @Override // defpackage.gx2
    public final void e(cx2 r2) {
        vf4 r3 = (vf4) r2;
        r3.B = this.a;
        r3.C = this.b;
        r3.D = this.c;
        r3.E = this.d;
        r3.F = true;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof uf4) == false) goto L22;
        uf4 r5 = (uf4) r4;
        float r1 = r5.a;
        if (ku0.b(this.a, r1) == true) goto L12;
        return false;
    L12:
        if (ku0.b(this.b, r5.b) == true) goto L15;
        return false;
    L15:
        if (ku0.b(this.c, r5.c) == true) goto L18;
        return false;
    L18:
        if (ku0.b(this.d, r5.d) == true) goto L21;
        return false;
    L21:
        return true;
    L22:
        return false;
    }

    public final int hashCode() {
        int r3 = b11.d(b11.d(b11.d(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
        return Boolean.hashCode(true) + r3;
    }
}
