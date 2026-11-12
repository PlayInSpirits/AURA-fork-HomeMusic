package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gd0 extends cx2 implements a90, yi2 {
    public hb3 B;
    public final g74 C;
    public boolean D;
    public fv E;
    public final x64 F;
    public boolean H;
    public boolean J;
    public final zg5 G = new zg5(11);
    public long I = -1;

    public gd0(hb3 hb3Var, g74 g74Var, boolean z, fv fvVar, x64 x64Var) {
        this.B = hb3Var;
        this.C = g74Var;
        this.D = z;
        this.E = fvVar;
        this.F = x64Var;
    }

    public static final float q0(gd0 gd0Var, fv fvVar, long j) {
        float f;
        wv3 wv3Var;
        int iCompare;
        long j2 = gd0Var.I;
        f13 f13Var = (f13) gd0Var.G.n;
        int i = f13Var.p - 1;
        Object[] objArr = f13Var.n;
        if (i < objArr.length) {
            wv3Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                wv3 wv3Var2 = (wv3) ((cd0) objArr[i]).a.invoke();
                if (wv3Var2 != null) {
                    long jB = wv3Var2.b();
                    long jO0 = l93.o0(gd0Var.r0());
                    f = 0.0f;
                    int iOrdinal = gd0Var.B.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jO0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            er1.n();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jO0 >> 32)));
                    }
                    if (iCompare > 0) {
                        if (wv3Var != null) {
                            break;
                        }
                        wv3Var = wv3Var2;
                        break;
                    }
                    wv3Var = wv3Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            wv3Var = null;
        }
        if (wv3Var == null) {
            wv3 wv3Var3 = gd0Var.H ? (wv3) gd0Var.F.invoke() : null;
            if (wv3Var3 == null) {
                return f;
            }
            wv3Var = wv3Var3;
        }
        long jO1 = l93.o0(j2);
        int iOrdinal2 = gd0Var.B.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = wv3Var.b;
            return fvVar.a(f2 - ((int) (j & 4294967295L)), wv3Var.d - f2, Float.intBitsToFloat((int) (jO1 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = wv3Var.a;
            return fvVar.a(f3 - ((int) (j >> 32)), wv3Var.c - f3, Float.intBitsToFloat((int) (jO1 >> 32)));
        }
        er1.n();
        return f;
    }

    public static boolean s0(gd0 gd0Var, wv3 wv3Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = gd0Var.r0();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jU0 = gd0Var.u0(wv3Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jU0 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jU0 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.yi2
    public final void a(long j) {
        int iJ;
        long j2;
        long jR0 = r0();
        this.I = j;
        int iOrdinal = this.B.ordinal();
        if (iOrdinal == 0) {
            iJ = h12.j((int) (j & 4294967295L), (int) (jR0 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                er1.n();
                return;
            }
            iJ = h12.j((int) (j >> 32), (int) (jR0 >> 32));
        }
        if (iJ >= 0) {
            return;
        }
        if (this.D) {
            j2 = 0;
        } else {
            j2 = this.B == hb3.n ? ((long) (((int) (jR0 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jR0 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        wv3 wv3Var = (wv3) this.F.invoke();
        if (wv3Var == null || this.J || this.H || !s0(this, wv3Var, jR0, 0L, 2) || s0(this, wv3Var, 0L, j3, 1)) {
            return;
        }
        this.H = true;
        t0(j3);
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    public final long r0() {
        long j = this.I;
        if (n02.a(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void t0(long j) {
        fv fvVar = this.E;
        if (fvVar == null) {
            fvVar = (fv) kb4.q(this, hv.a);
        }
        fv fvVar2 = fvVar;
        if (this.J) {
            fz1.c("launchAnimation called when previous animation was running");
        }
        fv fvVar3 = this.E;
        if (fvVar3 == null) {
            fvVar3 = (fv) kb4.q(this, hv.a);
        }
        fvVar3.getClass();
        fv.a.getClass();
        b25 b25Var = new b25(ev.b);
        fu.G(e0(), null, ze0.q, new fd0(this, b25Var, fvVar2, j, null), 1);
    }

    public final long u0(wv3 wv3Var, long j, long j2) {
        long jO0 = l93.o0(j);
        int iOrdinal = this.B.ordinal();
        if (iOrdinal == 0) {
            fv fvVar = this.E;
            if (fvVar == null) {
                fvVar = (fv) kb4.q(this, hv.a);
            }
            float f = wv3Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fvVar.a(f - ((int) (j2 & 4294967295L)), wv3Var.d - f, Float.intBitsToFloat((int) (jO0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            er1.n();
            return 0L;
        }
        fv fvVar2 = this.E;
        if (fvVar2 == null) {
            fvVar2 = (fv) kb4.q(this, hv.a);
        }
        float f2 = wv3Var.a;
        return (((long) Float.floatToRawIntBits(fvVar2.a(f2 - ((int) (j2 >> 32)), wv3Var.c - f2, Float.intBitsToFloat((int) (jO0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
