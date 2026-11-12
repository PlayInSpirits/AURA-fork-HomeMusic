package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 extends xa0 {
    public final k24 e;
    public final k24 f;
    public final float[] g;

    public wa0(k24 k24Var, k24 k24Var2) {
        float[] fArrA;
        super(k24Var2, k24Var, k24Var2, null);
        this.e = k24Var;
        this.f = k24Var2;
        float[] fArr = (float[]) d34.r.o;
        z95 z95Var = k24Var.d;
        float[] fArr2 = k24Var.i;
        z95 z95Var2 = k24Var2.d;
        float[] fArr3 = k24Var2.j;
        if (uo.l(z95Var, z95Var2)) {
            fArrA = uo.A(fArr3, fArr2);
        } else {
            float[] fArrA2 = z95Var.a();
            float[] fArrA3 = z95Var2.a();
            z95 z95Var3 = wr1.b;
            fArrA = uo.A(uo.l(z95Var2, z95Var3) ? fArr3 : uo.w(uo.A(uo.k(fArr, fArrA3, new float[]{0.964212f, 1.0f, 0.825188f}), k24Var2.i)), uo.l(z95Var, z95Var3) ? fArr2 : uo.A(uo.k(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrA;
    }

    @Override // defpackage.xa0
    public final long a(long j) {
        float fG = x40.g(j);
        float f = x40.f(j);
        float fE = x40.e(j);
        float fD = x40.d(j);
        g24 g24Var = this.e.p;
        float fB = (float) g24Var.b(fG);
        float fB2 = (float) g24Var.b(f);
        float fB3 = (float) g24Var.b(fE);
        float[] fArr = this.g;
        float f2 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f3 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f4 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        k24 k24Var = this.f;
        float fB4 = (float) k24Var.m.b(f2);
        g24 g24Var2 = k24Var.m;
        return e35.a(fB4, (float) g24Var2.b(f3), (float) g24Var2.b(f4), fD, k24Var);
    }
}
