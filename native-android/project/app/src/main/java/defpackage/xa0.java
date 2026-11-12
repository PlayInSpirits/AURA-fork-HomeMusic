package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class xa0 {
    public final p50 a;
    public final p50 b;
    public final p50 c;
    public final float[] d;

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Illegal instructions before constructor call */
    public xa0(p50 p50Var, p50 p50Var2, int i) {
        float[] fArr;
        p50 p50VarB = xl.m(p50Var.b, 12884901888L) ? uo.b(p50Var) : p50Var;
        p50 p50VarB2 = xl.m(p50Var2.b, 12884901888L) ? uo.b(p50Var2) : p50Var2;
        float[] fArrA = wr1.e;
        if (i == 3) {
            boolean zM = xl.m(p50Var.b, 12884901888L);
            boolean zM2 = xl.m(p50Var2.b, 12884901888L);
            if (!(zM && zM2) && (zM || zM2)) {
                z95 z95Var = ((k24) (zM ? p50Var : p50Var2)).d;
                float[] fArrA2 = zM ? z95Var.a() : fArrA;
                fArrA = zM2 ? z95Var.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(p50Var2, p50VarB, p50VarB2, fArr);
    }

    public long a(long j) {
        float fG = x40.g(j);
        float f = x40.f(j);
        float fE = x40.e(j);
        float fD = x40.d(j);
        p50 p50Var = this.b;
        long jD = p50Var.d(fG, f, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = p50Var.e(fG, f, fE);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE2, fD, this.a);
    }

    public xa0(p50 p50Var, p50 p50Var2, p50 p50Var3, float[] fArr) {
        this.a = p50Var;
        this.b = p50Var2;
        this.c = p50Var3;
        this.d = fArr;
    }
}
