package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jd3 extends cx2 implements u62, rv0 {
    public hd3 B;
    public boolean C;
    public hs D;
    public i80 E;
    public float F;
    public dt G;

    public static boolean q0(long j) {
        return !qf4.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean r0(long j) {
        return !qf4.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.rv0
    public final void S(e72 e72Var) {
        mz mzVar = e72Var.n;
        long jD = this.B.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(r0(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (mzVar.P() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(q0(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (mzVar.P() & 4294967295L)))) & 4294967295L);
        long jZ = (Float.intBitsToFloat((int) (mzVar.P() >> 32)) == 0.0f || Float.intBitsToFloat((int) (mzVar.P() & 4294967295L)) == 0.0f) ? 0L : q05.z(jFloatToRawIntBits, this.E.h(jFloatToRawIntBits, mzVar.P()));
        long jA = this.D.a((((long) Math.round(Float.intBitsToFloat((int) (jZ >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jZ & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (mzVar.P() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (mzVar.P() & 4294967295L)))) & 4294967295L), e72Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((zg5) mzVar.o.o).C(f, f2);
        try {
            this.B.c(e72Var, jZ, this.F, this.G);
            ((zg5) mzVar.o.o).C(-f, -f2);
            e72Var.a();
        } catch (Throwable th) {
            ((zg5) mzVar.o.o).C(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        long jA;
        boolean z = false;
        boolean z2 = nc0.d(j) && nc0.c(j);
        if (nc0.f(j) && nc0.e(j)) {
            z = true;
        }
        if (((!this.C || this.B.d() == 9205357640488583168L) && z2) || z) {
            jA = nc0.a(nc0.h(j), nc0.g(j), j);
        } else {
            long jD = this.B.d();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(qc0.f(r0(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : nc0.j(j), j))) << 32) | (((long) Float.floatToRawIntBits(qc0.e(q0(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : nc0.i(j), j))) & 4294967295L);
            if (this.C && this.B.d() != 9205357640488583168L) {
                float fIntBitsToFloat = !r0(this.B.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.B.d() >> 32));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!q0(this.B.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.B.d() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
                jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : q05.z(jFloatToRawIntBits2, this.E.h(jFloatToRawIntBits2, jFloatToRawIntBits));
            }
            jA = nc0.a(qc0.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), qc0.e(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), j);
        }
        jg3 jg3VarR = pi2Var.r(jA);
        return cf2Var.v(jg3VarR.n, jg3VarR.o, v01.n, new la(jg3VarR, 3));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.B + ", sizeToIntrinsics=" + this.C + ", alignment=" + this.D + ", alpha=" + this.F + ", colorFilter=" + this.G + ")";
    }
}
