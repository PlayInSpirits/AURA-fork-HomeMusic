package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wa0 extends xa0 {
    public final k24 e;
    public final k24 f;
    public final float[] g;

    public wa0(k24 k24Var, k24 k24Var2) {
        super(k24Var2, k24Var, k24Var2, null);
        float[] A;
        this.e = k24Var;
        this.f = k24Var2;
        float[] fArr = (float[]) d34.r.o;
        z95 z95Var = k24Var.d;
        float[] fArr2 = k24Var.i;
        z95 z95Var2 = k24Var2.d;
        float[] fArr3 = k24Var2.j;
        if (uo.l(z95Var, z95Var2)) {
            A = uo.A(fArr3, fArr2);
        } else {
            float[] a = z95Var.a();
            float[] a2 = z95Var2.a();
            z95 z95Var3 = wr1.b;
            A = uo.A(uo.l(z95Var2, z95Var3) ? fArr3 : uo.w(uo.A(uo.k(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), k24Var2.i)), uo.l(z95Var, z95Var3) ? fArr2 : uo.A(uo.k(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = A;
    }

    @Override // defpackage.xa0
    public final long a(long j) {
        float g = x40.g(j);
        float f = x40.f(j);
        float e = x40.e(j);
        float d = x40.d(j);
        g24 g24Var = this.e.p;
        float b = (float) g24Var.b(g);
        float b2 = (float) g24Var.b(f);
        float b3 = (float) g24Var.b(e);
        float[] fArr = this.g;
        float f2 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f3 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f4 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        k24 k24Var = this.f;
        float b4 = (float) k24Var.m.b(f2);
        g24 g24Var2 = k24Var.m;
        return e35.a(b4, (float) g24Var2.b(f3), (float) g24Var2.b(f4), d, k24Var);
    }
}
