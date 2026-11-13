package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jd3 extends cx2 implements u62, rv0 {
    public jd3() {
        super();
    }

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
        long d = this.B.d();
        long floatToRawIntBits = (Float.floatToRawIntBits(r0(d) ? Float.intBitsToFloat((int) (d >> 32)) : Float.intBitsToFloat((int) (mzVar.P() >> 32))) << 32) | (Float.floatToRawIntBits(q0(d) ? Float.intBitsToFloat((int) (d & 4294967295L)) : Float.intBitsToFloat((int) (mzVar.P() & 4294967295L))) & 4294967295L);
        long z = (Float.intBitsToFloat((int) (mzVar.P() >> 32)) == 0.0f || Float.intBitsToFloat((int) (mzVar.P() & 4294967295L)) == 0.0f) ? 0L : q05.z(floatToRawIntBits, this.E.h(floatToRawIntBits, mzVar.P()));
        long a = this.D.a((Math.round(Float.intBitsToFloat((int) (z >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (z & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (mzVar.P() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (mzVar.P() & 4294967295L))) & 4294967295L), e72Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((zg5) mzVar.o.o).C(f, f2);
        try {
            this.B.c(e72Var, z, this.F, this.G);
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
        long a;
        boolean z = false;
        boolean z2 = nc0.d(j) && nc0.c(j);
        if (nc0.f(j) && nc0.e(j)) {
            z = true;
        }
        if (((!this.C || this.B.d() == 9205357640488583168L) && z2) || z) {
            a = nc0.a(nc0.h(j), nc0.g(j), j);
        } else {
            long d = this.B.d();
            int round = r0(d) ? Math.round(Float.intBitsToFloat((int) (d >> 32))) : nc0.j(j);
            int round2 = q0(d) ? Math.round(Float.intBitsToFloat((int) (d & 4294967295L))) : nc0.i(j);
            long floatToRawIntBits = (Float.floatToRawIntBits(qc0.f(round, j)) << 32) | (Float.floatToRawIntBits(qc0.e(round2, j)) & 4294967295L);
            if (this.C && this.B.d() != 9205357640488583168L) {
                float intBitsToFloat = !r0(this.B.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.B.d() >> 32));
                float intBitsToFloat2 = !q0(this.B.d()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.B.d() & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : q05.z(floatToRawIntBits2, this.E.h(floatToRawIntBits2, floatToRawIntBits));
            }
            a = nc0.a(qc0.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), qc0.e(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), j);
        }
        jg3 r = pi2Var.r(a);
        return cf2Var.v(r.n, r.o, v01.n, new la(r, 3));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.B + ", sizeToIntrinsics=" + this.C + ", alignment=" + this.D + ", alpha=" + this.F + ", colorFilter=" + this.G + ")";
    }
}
