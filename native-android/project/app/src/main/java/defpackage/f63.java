package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f63 extends cf2 implements pi2, q62 {
    public static final k52 h0 = new k52(13);
    public static final k52 i0 = new k52(14);
    public static final b24 j0 = new b24();
    public static final n62 k0 = new n62();
    public static final d63 l0 = new d63();
    public static final tv1 m0 = new tv1();
    public final c72 H;
    public f63 I;
    public f63 J;
    public boolean K;
    public boolean L;
    public if1 M;
    public oo0 N;
    public r62 O;
    public vi2 Q;
    public p03 R;
    public float T;
    public v03 U;
    public n62 V;
    public wv3 X;
    public wv3 Y;
    public boolean Z;
    public boolean a0;
    public sj1 b0;
    public jz c0;
    public ib d0;
    public final c63 e0;
    public boolean f0;
    public tb3 g0;
    public float P = 0.8f;
    public long S = 0;
    public ac4 W = kb4.b;

    public f63(c72 c72Var) {
        this.H = c72Var;
        this.N = c72Var.J;
        this.O = c72Var.K;
        wv3 wv3Var = wv3.e;
        this.X = wv3Var;
        this.Y = wv3Var;
        this.e0 = new c63(this, 1);
    }

    @Override // defpackage.q62
    public final long A(q62 q62Var, long j) {
        f63 f63Var;
        boolean z = q62Var instanceof ff2;
        if (z) {
            ff2 ff2Var = (ff2) q62Var;
            ff2Var.n.H.L0();
            return ff2Var.A(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        ff2 ff2Var2 = z ? (ff2) q62Var : null;
        if (ff2Var2 == null || (f63Var = ff2Var2.n.H) == null) {
            q62Var.getClass();
            f63Var = (f63) q62Var;
        }
        f63Var.L0();
        f63 f63VarW0 = w0(f63Var);
        while (f63Var != f63VarW0) {
            tb3 tb3Var = f63Var.g0;
            if (tb3Var != null) {
                vj1 vj1Var = (vj1) tb3Var;
                float[] fArrB = vj1Var.b();
                if (!vj1Var.F) {
                    j = ya4.A(j, fArrB);
                }
            }
            j = ji2.z(j, f63Var.S);
            f63Var = f63Var.J;
            f63Var.getClass();
        }
        return q0(f63VarW0, j);
    }

    public abstract cx2 A0();

    public final boolean B0() {
        return this.Z && !this.X.d();
    }

    @Override // defpackage.q62
    public final wv3 C(q62 q62Var, boolean z) {
        f63 f63Var;
        if (!A0().A) {
            cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!q62Var.f()) {
            cz1.b("LayoutCoordinates " + q62Var + " is not attached!");
        }
        ff2 ff2Var = q62Var instanceof ff2 ? (ff2) q62Var : null;
        if (ff2Var == null || (f63Var = ff2Var.n.H) == null) {
            f63Var = (f63) q62Var;
        }
        f63Var.L0();
        f63 f63VarW0 = w0(f63Var);
        v03 v03Var = this.U;
        if (v03Var == null) {
            v03Var = new v03();
            this.U = v03Var;
        }
        v03Var.b = 0.0f;
        v03Var.c = 0.0f;
        v03Var.d = (int) (q62Var.k() >> 32);
        v03Var.e = (int) (q62Var.k() & 4294967295L);
        while (f63Var != f63VarW0) {
            f63Var.T0(v03Var, z, false);
            if (v03Var.c()) {
                return wv3.e;
            }
            f63Var = f63Var.J;
            f63Var.getClass();
        }
        p0(f63VarW0, v03Var, z);
        return new wv3(v03Var.b, v03Var.c, v03Var.d, v03Var.e);
    }

    public final cx2 C0(int i) {
        boolean zF = g63.f(i);
        cx2 cx2VarA0 = A0();
        if (!zF && (cx2VarA0 = cx2VarA0.r) == null) {
            return null;
        }
        for (cx2 cx2VarD0 = D0(zF); cx2VarD0 != null && (cx2VarD0.q & i) != 0; cx2VarD0 = cx2VarD0.s) {
            if ((cx2VarD0.p & i) != 0) {
                return cx2VarD0;
            }
            if (cx2VarD0 == cx2VarA0) {
                return null;
            }
        }
        return null;
    }

    public final cx2 D0(boolean z) {
        cx2 cx2VarA0;
        w12 w12Var = this.H.Q;
        if (((f63) w12Var.e) == this) {
            return (cx2) w12Var.g;
        }
        f63 f63Var = this.J;
        if (!z) {
            if (f63Var != null) {
                return f63Var.A0();
            }
            return null;
        }
        if (f63Var == null || (cx2VarA0 = f63Var.A0()) == null) {
            return null;
        }
        return cx2VarA0.s;
    }

    public final void E0(cx2 cx2Var, e63 e63Var, long j, fm1 fm1Var, int i, boolean z) {
        if (cx2Var == null) {
            H0(e63Var, j, fm1Var, i, z);
            return;
        }
        if (!e63Var.f(cx2Var)) {
            E0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z);
            return;
        }
        int i2 = fm1Var.p;
        q03 q03Var = fm1Var.n;
        fm1Var.b(i2 + 1, q03Var.b);
        fm1Var.p++;
        q03Var.a(cx2Var);
        fm1Var.o.a(rr2.c(-1.0f, z, false));
        E0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z);
        fm1Var.p = i2;
    }

    public final void F0(cx2 cx2Var, e63 e63Var, long j, fm1 fm1Var, int i, boolean z, float f) {
        if (cx2Var == null) {
            H0(e63Var, j, fm1Var, i, z);
            return;
        }
        if (!e63Var.f(cx2Var)) {
            F0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f);
            return;
        }
        int i2 = fm1Var.p;
        q03 q03Var = fm1Var.n;
        fm1Var.b(i2 + 1, q03Var.b);
        fm1Var.p++;
        q03Var.a(cx2Var);
        fm1Var.o.a(rr2.c(f, z, false));
        Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f, true);
        fm1Var.p = i2;
    }

    public final void G0(e63 e63Var, long j, fm1 fm1Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        cx2 cx2VarC0 = C0(e63Var.d());
        if (!a1(j)) {
            if (i == 1) {
                float fS0 = s0(j, z0());
                if ((Float.floatToRawIntBits(fS0) & Integer.MAX_VALUE) < 2139095040) {
                    if (fm1Var.p != fm1Var.n.b - 1) {
                        if (g12.k(fm1Var.a(), rr2.c(fS0, false, false)) <= 0) {
                            return;
                        }
                    }
                    F0(cx2VarC0, e63Var, j, fm1Var, i, false, fS0);
                    return;
                }
                return;
            }
            return;
        }
        if (cx2VarC0 == null) {
            H0(e63Var, j, fm1Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < G() && fIntBitsToFloat2 < F()) {
            E0(cx2VarC0, e63Var, j, fm1Var, i, z);
            return;
        }
        float fS1 = i == 1 ? s0(j, z0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fS1) & Integer.MAX_VALUE) < 2139095040) {
            if (fm1Var.p != fm1Var.n.b - 1) {
                z2 = z;
                if (g12.k(fm1Var.a(), rr2.c(fS1, z2, false)) > 0) {
                }
                Q0(cx2VarC0, e63Var, j, fm1Var, i, z2, fS1, z3);
            }
            z2 = z;
            z3 = true;
            Q0(cx2VarC0, e63Var, j, fm1Var, i, z2, fS1, z3);
        }
        z2 = z;
        z3 = false;
        Q0(cx2VarC0, e63Var, j, fm1Var, i, z2, fS1, z3);
    }

    public void H0(e63 e63Var, long j, fm1 fm1Var, int i, boolean z) {
        f63 f63Var = this.I;
        if (f63Var != null) {
            f63Var.G0(e63Var, f63Var.x0(j), fm1Var, i, z);
        }
    }

    public final void I0() {
        tb3 tb3Var = this.g0;
        if (tb3Var != null) {
            ((vj1) tb3Var).c();
            return;
        }
        f63 f63Var = this.J;
        if (f63Var != null) {
            f63Var.I0();
        }
    }

    @Override // defpackage.oo0
    public final float J() {
        return this.H.J.J();
    }

    public final boolean J0() {
        if (this.g0 != null && this.P <= 0.0f) {
            return true;
        }
        f63 f63Var = this.J;
        if (f63Var != null) {
            return f63Var.J0();
        }
        return false;
    }

    public final long K0(long j) {
        if (!A0().A) {
            cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        L0();
        while (this != null) {
            c72 c72Var = this.H;
            if (this == ((f63) c72Var.Q.e) && !c72Var.p) {
                long jB = ((ra) h12.L(c72Var)).getRectManager().b(c72Var);
                if (!g02.a(jB, 9223372034707292159L)) {
                    return ji2.z(j, jB);
                }
            }
            tb3 tb3Var = this.g0;
            if (tb3Var != null) {
                vj1 vj1Var = (vj1) tb3Var;
                float[] fArrB = vj1Var.b();
                if (!vj1Var.F) {
                    j = ya4.A(j, fArrB);
                }
            }
            j = ji2.z(j, this.S);
            this = this.J;
        }
        return j;
    }

    public final void L0() {
        this.H.R.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v7, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void M0() {
        cx2 cx2VarA0;
        boolean zF = g63.f(128);
        cx2 cx2VarD0 = D0(zF);
        if (cx2VarD0 == null || (cx2VarD0.n.q & 128) == 0) {
            return;
        }
        ch4 ch4VarT = ya4.t();
        if1 if1VarE = ch4VarT != null ? ch4VarT.e() : null;
        ch4 ch4VarZ = ya4.z(ch4VarT);
        try {
            if (!zF) {
                cx2VarA0 = A0().r;
                if (cx2VarA0 == null) {
                }
                ya4.H(ch4VarT, ch4VarZ, if1VarE);
            }
            cx2VarA0 = A0();
            for (cx2 cx2VarD1 = D0(zF); cx2VarD1 != null && (cx2VarD1.q & 128) != 0; cx2VarD1 = cx2VarD1.s) {
                if ((cx2VarD1.p & 128) != 0) {
                    ?? C = cx2VarD1;
                    ?? f13Var = 0;
                    while (C != 0) {
                        if (C instanceof yi2) {
                            ((yi2) C).a(this.p);
                        } else if ((C.p & 128) != 0 && (C instanceof fo0)) {
                            cx2 cx2Var = ((fo0) C).C;
                            int i = 0;
                            C = C;
                            f13Var = f13Var;
                            while (cx2Var != null) {
                                if ((cx2Var.p & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        f13Var = f13Var;
                                        C = cx2Var;
                                    } else {
                                        if (f13Var == 0) {
                                            f13Var = new f13(new cx2[16]);
                                        }
                                        if (C != 0) {
                                            f13Var.b(C);
                                            C = 0;
                                        }
                                        f13Var.b(cx2Var);
                                    }
                                }
                                cx2Var = cx2Var.s;
                                C = C;
                                f13Var = f13Var;
                            }
                            if (i == 1) {
                            }
                        }
                        C = j51.c(f13Var);
                    }
                }
                if (cx2VarD1 == cx2VarA0) {
                    break;
                }
            }
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
        } catch (Throwable th) {
            ya4.H(ch4VarT, ch4VarZ, if1VarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void N0() {
        boolean zF = g63.f(4194304);
        cx2 cx2VarA0 = A0();
        if (!zF && (cx2VarA0 = cx2VarA0.r) == null) {
            return;
        }
        for (cx2 cx2VarD0 = D0(zF); cx2VarD0 != null && (cx2VarD0.q & 4194304) != 0; cx2VarD0 = cx2VarD0.s) {
            if ((cx2VarD0.p & 4194304) != 0) {
                ?? C = cx2VarD0;
                ?? f13Var = 0;
                while (C != 0) {
                    if (C instanceof o62) {
                        ((o62) C).e(this);
                    } else if ((C.p & 4194304) != 0 && (C instanceof fo0)) {
                        cx2 cx2Var = ((fo0) C).C;
                        int i = 0;
                        C = C;
                        f13Var = f13Var;
                        while (cx2Var != null) {
                            if ((cx2Var.p & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    f13Var = f13Var;
                                    C = cx2Var;
                                } else {
                                    if (f13Var == 0) {
                                        f13Var = new f13(new cx2[16]);
                                    }
                                    if (C != 0) {
                                        f13Var.b(C);
                                        C = 0;
                                    }
                                    f13Var.b(cx2Var);
                                }
                            }
                            cx2Var = cx2Var.s;
                            C = C;
                            f13Var = f13Var;
                        }
                        if (i == 1) {
                        }
                    }
                    C = j51.c(f13Var);
                }
            }
            if (cx2VarD0 == cx2VarA0) {
                return;
            }
        }
    }

    public final void O0() {
        this.K = true;
        this.e0.invoke();
        U0();
        if (g02.a(this.S, 0L)) {
            return;
        }
        this.H.M(this);
    }

    public final void P0() {
        boolean zF = g63.f(1048576);
        cx2 cx2VarD0 = D0(zF);
        if (cx2VarD0 == null || (cx2VarD0.n.q & 1048576) == 0) {
            return;
        }
        cx2 cx2VarA0 = A0();
        if (!zF && (cx2VarA0 = cx2VarA0.r) == null) {
            return;
        }
        for (cx2 cx2VarD1 = D0(zF); cx2VarD1 != null && (cx2VarD1.q & 1048576) != 0; cx2VarD1 = cx2VarD1.s) {
            if ((cx2VarD1.p & 1048576) != 0) {
                cx2 cx2VarC = cx2VarD1;
                f13 f13Var = null;
                while (cx2VarC != null) {
                    if (cx2VarC instanceof ba1) {
                    } else if ((cx2VarC.p & 1048576) != 0 && (cx2VarC instanceof fo0)) {
                        int i = 0;
                        for (cx2 cx2Var = ((fo0) cx2VarC).C; cx2Var != null; cx2Var = cx2Var.s) {
                            if ((cx2Var.p & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    cx2VarC = cx2Var;
                                } else {
                                    if (f13Var == null) {
                                        f13Var = new f13(new cx2[16]);
                                    }
                                    if (cx2VarC != null) {
                                        f13Var.b(cx2VarC);
                                        cx2VarC = null;
                                    }
                                    f13Var.b(cx2Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    cx2VarC = j51.c(f13Var);
                }
            }
            if (cx2VarD1 == cx2VarA0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01cd A[PHI: r4
  0x01cd: PHI (r4v5 ??) = (r4v1 ??), (r4v1 ??), (r4v7 ??) binds: [B:55:0x0197, B:57:0x019b, B:71:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v27, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v5, types: [f13] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [f13] */
    public final void Q0(cx2 cx2Var, e63 e63Var, long j, fm1 fm1Var, int i, boolean z, float f, boolean z2) {
        ?? C;
        if (cx2Var == null) {
            H0(e63Var, j, fm1Var, i, z);
            return;
        }
        if (!e63Var.f(cx2Var)) {
            Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        char c = 3;
        if (i2 == 3 || i2 == 4) {
            ?? r3 = cx2Var;
            ?? f13Var = 0;
            while (r3 != 0) {
                int i3 = 0;
                if (r3 instanceof rn3) {
                    int i4 = e35.o;
                    long j2 = e35.n;
                    int i5 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i5);
                    c72 c72Var = this.H;
                    r62 r62Var = c72Var.K;
                    long j3 = Long.MIN_VALUE & Long.MIN_VALUE;
                    r62 r62Var2 = r62.n;
                    if (fIntBitsToFloat < (-((j3 == 0 || r62Var == r62Var2) ? xi4.i(0, Long.MIN_VALUE) : xi4.i(2, Long.MIN_VALUE)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i5) >= G() + ((j3 == 0 || c72Var.K == r62Var2) ? xi4.i(2, Long.MIN_VALUE) : xi4.i(0, Long.MIN_VALUE))) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i6) < (-xi4.i(1, Long.MIN_VALUE))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= xi4.i(3, Long.MIN_VALUE) + F()) {
                        break;
                    }
                    l03 l03Var = fm1Var.o;
                    q03 q03Var = fm1Var.n;
                    int i7 = fm1Var.p;
                    int i8 = q03Var.b;
                    if (i7 == i8 - 1) {
                        fm1Var.b(i7 + 1, i8);
                        fm1Var.p++;
                        q03Var.a(cx2Var);
                        l03Var.a(rr2.c(0.0f, z, true));
                        Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i2, z, f, z2);
                        fm1Var.p = i7;
                        return;
                    }
                    long jA = fm1Var.a();
                    int i9 = fm1Var.p;
                    if (!g12.D(jA)) {
                        if (g12.u(jA) > 0.0f) {
                            int i10 = fm1Var.p;
                            fm1Var.b(i10 + 1, q03Var.b);
                            fm1Var.p++;
                            q03Var.a(cx2Var);
                            l03Var.a(rr2.c(0.0f, z, true));
                            Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f, z2);
                            fm1Var.p = i10;
                            return;
                        }
                        return;
                    }
                    int i11 = q03Var.b;
                    int i12 = i11 - 1;
                    fm1Var.p = i12;
                    fm1Var.b(i11, q03Var.b);
                    fm1Var.p++;
                    q03Var.a(cx2Var);
                    l03Var.a(rr2.c(0.0f, z, true));
                    Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f, z2);
                    fm1Var.p = i12;
                    if (g12.u(fm1Var.a()) < 0.0f) {
                        fm1Var.b(i9 + 1, fm1Var.p + 1);
                    }
                    fm1Var.p = i9;
                    return;
                }
                char c2 = c;
                if ((r3.p & 16) == 0 || !(r3 instanceof fo0)) {
                    C = r3;
                    f13Var = f13Var;
                    C = j51.c(f13Var);
                } else {
                    cx2 cx2Var2 = ((fo0) r3).C;
                    while (cx2Var2 != null) {
                        if ((cx2Var2.p & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                C = r3;
                                f13Var = f13Var;
                                f13Var = f13Var;
                                C = cx2Var2;
                            } else {
                                if (f13Var == 0) {
                                    f13Var = new f13(new cx2[16]);
                                }
                                if (C != 0) {
                                    f13Var.b(C);
                                    C = 0;
                                }
                                f13Var.b(cx2Var2);
                            }
                        } else {
                            C = r3;
                            f13Var = f13Var;
                        }
                        cx2Var2 = cx2Var2.s;
                        C = C;
                        f13Var = f13Var;
                    }
                    if (i3 == 1) {
                        C = r3;
                        f13Var = f13Var;
                    } else {
                        C = r3;
                        f13Var = f13Var;
                        C = j51.c(f13Var);
                    }
                }
                i2 = i;
                c = c2;
                r3 = C;
                f13Var = f13Var;
            }
        }
        if (z2) {
            F0(cx2Var, e63Var, j, fm1Var, i, z, f);
        } else {
            W0(cx2Var, e63Var, j, fm1Var, i, z, f);
        }
    }

    public abstract void R0(jz jzVar, sj1 sj1Var);

    public final void S0(long j, float f, if1 if1Var) {
        Y0(if1Var, false);
        boolean zA = g02.a(this.S, j);
        c72 c72Var = this.H;
        if (!zA) {
            ((ra) h12.L(c72Var)).J(-4.0f);
            this.S = j;
            tb3 tb3Var = this.g0;
            if (tb3Var != null) {
                ((vj1) tb3Var).d(j);
            } else {
                f63 f63Var = this.J;
                if (f63Var != null) {
                    f63Var.I0();
                }
            }
            c72Var.M(this);
            cf2.l0(this);
            ub3 ub3Var = c72Var.A;
            if (ub3Var != null) {
                ((ra) ub3Var).t(c72Var);
            }
        }
        this.T = f;
        if (this == ((f63) c72Var.Q.e)) {
            ((ra) h12.L(c72Var)).getRectManager().h(c72Var);
        }
        if (this.B) {
            return;
        }
        b0(h0());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void T0(v03 v03Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        tb3 tb3Var = this.g0;
        if (tb3Var != null) {
            if (this.L) {
                if (z2) {
                    long jZ0 = z0();
                    float f = v03Var.b;
                    float f2 = v03Var.c;
                    if (v03Var.d >= 0.0f) {
                        long j = this.p;
                        if (f > ((int) (j >> 32)) || v03Var.e < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jZ0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (v03Var.d - v03Var.b)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (v03Var.e - v03Var.c)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.p;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jZ0 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jZ0 & 4294967295L);
                    v03Var.b(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.p;
                    v03Var.b(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (v03Var.c()) {
                    return;
                }
            }
            vj1 vj1Var = (vj1) tb3Var;
            float[] fArrB = vj1Var.b();
            if (!vj1Var.F) {
                if (fArrB == null) {
                    v03Var.b = 0.0f;
                    v03Var.c = 0.0f;
                    v03Var.d = 0.0f;
                    v03Var.e = 0.0f;
                } else {
                    ya4.B(fArrB, v03Var);
                }
            }
        }
        long j4 = this.S;
        float f9 = (int) (j4 >> 32);
        v03Var.b += f9;
        v03Var.d += f9;
        float f10 = (int) (j4 & 4294967295L);
        v03Var.c += f10;
        v03Var.e += f10;
    }

    public final void U0() {
        if (this.g0 != null) {
            Y0(null, false);
            this.H.V(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [f13] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [f13] */
    public final void V0(vi2 vi2Var) {
        f63 f63Var;
        vi2 vi2Var2 = this.Q;
        if (vi2Var != vi2Var2) {
            this.Q = vi2Var;
            c72 c72Var = this.H;
            int i = 0;
            if (vi2Var2 == null || vi2Var.d() != vi2Var2.d() || vi2Var.b() != vi2Var2.b()) {
                int iD = vi2Var.d();
                int iB = vi2Var.b();
                tb3 tb3Var = this.g0;
                if (tb3Var != null) {
                    ((vj1) tb3Var).e((((long) iD) << 32) | (((long) iB) & 4294967295L));
                } else if (c72Var.H() && (f63Var = this.J) != null) {
                    f63Var.I0();
                }
                Q((((long) iB) & 4294967295L) | (((long) iD) << 32));
                if (this.M != null) {
                    Z0(false);
                }
                boolean zF = g63.f(4);
                cx2 cx2VarA0 = A0();
                if (zF || (cx2VarA0 = cx2VarA0.r) != null) {
                    for (cx2 cx2VarD0 = D0(zF); cx2VarD0 != null && (cx2VarD0.q & 4) != 0; cx2VarD0 = cx2VarD0.s) {
                        if ((cx2VarD0.p & 4) != 0) {
                            ?? C = cx2VarD0;
                            ?? f13Var = 0;
                            while (C != 0) {
                                if (C instanceof rv0) {
                                    ((rv0) C).y();
                                } else if ((C.p & 4) != 0 && (C instanceof fo0)) {
                                    cx2 cx2Var = ((fo0) C).C;
                                    int i2 = 0;
                                    C = C;
                                    f13Var = f13Var;
                                    while (cx2Var != null) {
                                        if ((cx2Var.p & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                f13Var = f13Var;
                                                C = cx2Var;
                                            } else {
                                                if (f13Var == 0) {
                                                    f13Var = new f13(new cx2[16]);
                                                }
                                                if (C != 0) {
                                                    f13Var.b(C);
                                                    C = 0;
                                                }
                                                f13Var.b(cx2Var);
                                            }
                                        }
                                        cx2Var = cx2Var.s;
                                        C = C;
                                        f13Var = f13Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                C = j51.c(f13Var);
                            }
                        }
                        if (cx2VarD0 == cx2VarA0) {
                            break;
                        }
                    }
                }
                ub3 ub3Var = c72Var.A;
                if (ub3Var != null) {
                    ((ra) ub3Var).t(c72Var);
                }
                c72Var.M(this);
            }
            p03 p03Var = this.R;
            if ((p03Var == null || p03Var.e == 0) && vi2Var.a().isEmpty()) {
                return;
            }
            p03 p03Var2 = this.R;
            Map mapA = vi2Var.a();
            if (p03Var2 != null && p03Var2.e == mapA.size()) {
                Object[] objArr = p03Var2.b;
                int[] iArr = p03Var2.c;
                long[] jArr = p03Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((pp1) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            c72Var.R.p.H.f();
            p03 p03Var3 = this.R;
            if (p03Var3 == null) {
                p03 p03Var4 = r73.a;
                p03Var3 = new p03();
                this.R = p03Var3;
            }
            p03Var3.a();
            for (Map.Entry entry : vi2Var.a().entrySet()) {
                p03Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void W0(cx2 cx2Var, e63 e63Var, long j, fm1 fm1Var, int i, boolean z, float f) {
        int i2;
        if (cx2Var == null) {
            H0(e63Var, j, fm1Var, i, z);
            return;
        }
        if (!e63Var.f(cx2Var)) {
            W0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f);
            return;
        }
        if (!e63Var.a(cx2Var)) {
            Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f, false);
            return;
        }
        l03 l03Var = fm1Var.o;
        q03 q03Var = fm1Var.n;
        int i3 = fm1Var.p;
        int i4 = q03Var.b;
        if (i3 != i4 - 1) {
            long jA = fm1Var.a();
            int i5 = fm1Var.p;
            int i6 = q03Var.b;
            int i7 = i6 - 1;
            fm1Var.p = i7;
            fm1Var.b(i6, q03Var.b);
            fm1Var.p++;
            q03Var.a(cx2Var);
            l03Var.a(rr2.c(f, z, false));
            Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f, false);
            fm1Var.p = i7;
            long jA2 = fm1Var.a();
            if (fm1Var.p + 1 >= q03Var.b - 1 || g12.k(jA, jA2) <= 0) {
                fm1Var.b(fm1Var.p + 1, q03Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zD = g12.D(jA2);
                int i9 = fm1Var.p;
                fm1Var.b(i8, zD ? i9 + 2 : i9 + 1);
            }
            fm1Var.p = i5;
            return;
        }
        int i10 = i3 + 1;
        fm1Var.b(i10, i4);
        fm1Var.p++;
        q03Var.a(cx2Var);
        l03Var.a(rr2.c(f, z, false));
        Q0(fh0.c(cx2Var, e63Var.d()), e63Var, j, fm1Var, i, z, f, false);
        fm1Var.p = i3;
        if (i10 == q03Var.b - 1 || g12.D(fm1Var.a())) {
            int i11 = fm1Var.p;
            int i12 = i11 + 1;
            q03Var.k(i12);
            if (i12 < 0 || i12 >= (i2 = l03Var.b)) {
                kf2.h("Index must be between 0 and size");
                return;
            }
            long[] jArr = l03Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                ti.a0(jArr, jArr, i12, i11 + 2, i2);
            }
            l03Var.b--;
        }
    }

    public final wv3 X0() {
        if (A0().A) {
            q62 q62VarN = wr1.n(this);
            v03 v03Var = this.U;
            if (v03Var == null) {
                v03Var = new v03();
                this.U = v03Var;
            }
            long jR0 = r0(z0());
            float f = B0() ? this.X.a : 0.0f;
            float f2 = B0() ? this.X.b : 0.0f;
            float fG = B0() ? this.X.c : G();
            float F = B0() ? this.X.d : F();
            int i = (int) (jR0 >> 32);
            v03Var.b = f - Float.intBitsToFloat(i);
            int i2 = (int) (jR0 & 4294967295L);
            v03Var.c = f2 - Float.intBitsToFloat(i2);
            v03Var.d = Float.intBitsToFloat(i) + fG;
            v03Var.e = Float.intBitsToFloat(i2) + F;
            while (this != q62VarN) {
                this.T0(v03Var, false, true);
                if (!v03Var.c()) {
                    this = this.J;
                    this.getClass();
                }
            }
            return new wv3(v03Var.b, v03Var.c, v03Var.d, v03Var.e);
        }
        return wv3.e;
    }

    public final void Y0(if1 if1Var, boolean z) {
        ub3 ub3Var;
        Reference referencePoll;
        ib ibVar;
        f13 f13Var;
        Reference referencePoll2;
        Object obj;
        c72 c72Var = this.H;
        int i = 0;
        boolean z2 = (!z && this.M == if1Var && h12.c(this.N, c72Var.J) && this.O == c72Var.K) ? false : true;
        this.N = c72Var.J;
        this.O = c72Var.K;
        if (!c72Var.G() || if1Var == null) {
            this.M = null;
            tb3 tb3Var = this.g0;
            if (tb3Var != null) {
                vj1 vj1Var = (vj1) tb3Var;
                if (!jz4.B(vj1Var.b())) {
                    c72Var.M(this);
                }
                vj1Var.q = null;
                vj1Var.r = null;
                vj1Var.t = true;
                vj1Var.f(false);
                rj1 rj1Var = vj1Var.o;
                if (rj1Var != null) {
                    sj1 sj1Var = vj1Var.n;
                    synchronized (((jw) rj1Var).p) {
                        if (!sj1Var.s) {
                            sj1Var.s = true;
                            sj1Var.b();
                        }
                    }
                    ra raVar = vj1Var.p;
                    hd5 hd5Var = raVar.B0;
                    do {
                        referencePoll = ((ReferenceQueue) hd5Var.p).poll();
                        if (referencePoll != null) {
                            ((f13) hd5Var.o).j(referencePoll);
                        }
                    } while (referencePoll != null);
                    ((f13) hd5Var.o).b(new WeakReference(vj1Var, (ReferenceQueue) hd5Var.p));
                    raVar.N.j(vj1Var);
                }
                this.g0 = null;
                c72Var.U = true;
                this.e0.invoke();
                if (A0().A && c72Var.H() && (ub3Var = c72Var.A) != null) {
                    ((ra) ub3Var).t(c72Var);
                }
            }
            this.f0 = false;
            return;
        }
        this.M = if1Var;
        if (this.g0 != null) {
            if (z2) {
                Z0(true);
                return;
            }
            return;
        }
        ub3 ub3VarL = h12.L(c72Var);
        ib ibVar2 = this.d0;
        if (ibVar2 == null) {
            ib ibVar3 = new ib(6, this, new c63(this, i));
            this.d0 = ibVar3;
            ibVar = ibVar3;
        } else {
            ibVar = ibVar2;
        }
        c63 c63Var = this.e0;
        ra raVar2 = (ra) ub3VarL;
        hd5 hd5Var2 = raVar2.B0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) hd5Var2.p;
            f13Var = (f13) hd5Var2.o;
            referencePoll2 = referenceQueue.poll();
            if (referencePoll2 != null) {
                f13Var.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        do {
            int i2 = f13Var.p;
            if (i2 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) f13Var.k(i2 - 1)).get();
        } while (obj == null);
        tb3 vj1Var2 = (tb3) obj;
        if (vj1Var2 != null) {
            vj1 vj1Var3 = (vj1) vj1Var2;
            rj1 rj1Var2 = vj1Var3.o;
            if (rj1Var2 == null) {
                throw xa3.l("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!vj1Var3.n.s) {
                cz1.a("layer should have been released before reuse");
            }
            vj1Var3.n = ((jw) rj1Var2).m();
            vj1Var3.t = false;
            vj1Var3.q = ibVar;
            vj1Var3.r = c63Var;
            vj1Var3.D = false;
            vj1Var3.E = false;
            vj1Var3.F = true;
            ya4.G(vj1Var3.u);
            float[] fArr = vj1Var3.v;
            if (fArr != null) {
                ya4.G(fArr);
            }
            vj1Var3.B = tw4.a;
            vj1Var3.s = 9223372034707292159L;
            vj1Var3.C = null;
            vj1Var3.A = 0;
        } else {
            vj1Var2 = new vj1(((jw) raVar2.getGraphicsContext()).m(), raVar2.getGraphicsContext(), raVar2, ibVar, c63Var);
        }
        vj1 vj1Var4 = (vj1) vj1Var2;
        vj1Var4.e(this.p);
        vj1Var4.d(this.S);
        this.g0 = vj1Var2;
        Z0(true);
        c72Var.U = true;
        this.e0.invoke();
    }

    public final void Z0(boolean z) {
        float f;
        boolean z2;
        c72 c72Var;
        gf1 gf1Var;
        tb3 tb3Var = this.g0;
        if1 if1Var = this.M;
        if (tb3Var == null) {
            if (if1Var == null) {
                return;
            }
            cz1.b("null layer with a non-null layerBlock");
            return;
        }
        if (if1Var == null) {
            throw xa3.l("updateLayerParameters requires a non-null layerBlock");
        }
        b24 b24Var = j0;
        b24Var.a();
        c72 c72Var2 = this.H;
        b24Var.z = c72Var2.J;
        b24Var.A = c72Var2.K;
        b24Var.x = l93.o0(this.p);
        fx3 fx3Var = new fx3();
        ((ra) h12.L(c72Var2)).getSnapshotObserver().a.e(this, h0, new jo(if1Var, this, fx3Var, 7));
        n62 n62Var = this.V;
        if (n62Var == null) {
            n62Var = new n62();
            this.V = n62Var;
        }
        n62 n62Var2 = k0;
        n62Var2.getClass();
        n62Var2.a = n62Var.a;
        n62Var2.b = n62Var.b;
        n62Var2.c = n62Var.c;
        n62Var2.d = n62Var.d;
        n62Var.a = b24Var.o;
        n62Var.b = b24Var.p;
        n62Var.c = b24Var.t;
        n62Var.d = b24Var.u;
        vj1 vj1Var = (vj1) tb3Var;
        ra raVar = vj1Var.p;
        int i = b24Var.n | vj1Var.A;
        vj1Var.y = b24Var.A;
        oo0 oo0Var = b24Var.z;
        vj1Var.x = oo0Var;
        if ((1048576 & i) != 0) {
            sj1 sj1Var = vj1Var.n;
            b24Var.y.getClass();
            int iV = oo0Var.V(0.0f);
            b24Var.y.getClass();
            int iV2 = oo0Var.V(0.0f);
            b24Var.y.getClass();
            int iV3 = oo0Var.V(0.0f);
            b24Var.y.getClass();
            int iV4 = oo0Var.V(0.0f);
            sj1Var.v = iV;
            sj1Var.w = iV2;
            sj1Var.x = iV3;
            sj1Var.y = iV4;
            sj1Var.a.t(iV, iV2, iV3, iV4);
            vj1Var.c();
        }
        int i2 = i & 4096;
        if (i2 != 0) {
            vj1Var.B = b24Var.u;
        }
        if ((i & 1) != 0) {
            sj1 sj1Var2 = vj1Var.n;
            float f2 = b24Var.o;
            uj1 uj1Var = sj1Var2.a;
            if (uj1Var.c() != f2) {
                uj1Var.A(f2);
            }
        }
        if ((i & 2) != 0) {
            sj1 sj1Var3 = vj1Var.n;
            float f3 = b24Var.p;
            uj1 uj1Var2 = sj1Var3.a;
            if (uj1Var2.N() != f3) {
                uj1Var2.j(f3);
            }
        }
        if ((i & 4) != 0) {
            sj1 sj1Var4 = vj1Var.n;
            float f4 = b24Var.q;
            uj1 uj1Var3 = sj1Var4.a;
            if (uj1Var3.b() != f4) {
                uj1Var3.s(f4);
            }
        }
        if ((i & 8) != 0) {
            uj1 uj1Var4 = vj1Var.n.a;
            if (uj1Var4.D() != 0.0f) {
                uj1Var4.E();
            }
        }
        if ((i & 16) != 0) {
            uj1 uj1Var5 = vj1Var.n.a;
            if (uj1Var5.u() != 0.0f) {
                uj1Var5.v();
            }
        }
        if ((i & 32) != 0) {
            sj1 sj1Var5 = vj1Var.n;
            uj1 uj1Var6 = sj1Var5.a;
            if (uj1Var6.M() != 0.0f) {
                uj1Var6.C();
                sj1Var5.g = true;
                sj1Var5.a();
            }
        }
        if ((i & 64) != 0) {
            sj1 sj1Var6 = vj1Var.n;
            long j = b24Var.r;
            uj1 uj1Var7 = sj1Var6.a;
            f = 0.0f;
            if (!x40.c(j, uj1Var7.p())) {
                uj1Var7.y(j);
            }
        } else {
            f = 0.0f;
        }
        if ((i & 128) != 0) {
            sj1 sj1Var7 = vj1Var.n;
            long j2 = b24Var.s;
            uj1 uj1Var8 = sj1Var7.a;
            if (!x40.c(j2, uj1Var8.x())) {
                uj1Var8.J(j2);
            }
        }
        if ((i & 1024) != 0) {
            uj1 uj1Var9 = vj1Var.n.a;
            if (uj1Var9.n() != f) {
                uj1Var9.I();
            }
        }
        if ((i & 256) != 0) {
            uj1 uj1Var10 = vj1Var.n.a;
            if (uj1Var10.G() != f) {
                uj1Var10.r();
            }
        }
        if ((i & 512) != 0) {
            uj1 uj1Var11 = vj1Var.n.a;
            if (uj1Var11.l() != f) {
                uj1Var11.w();
            }
        }
        if ((i & 2048) != 0) {
            sj1 sj1Var8 = vj1Var.n;
            float f5 = b24Var.t;
            uj1 uj1Var12 = sj1Var8.a;
            if (uj1Var12.B() != f5) {
                uj1Var12.L(f5);
            }
        }
        if (i2 != 0) {
            long j3 = vj1Var.B;
            boolean z3 = j3 == tw4.a;
            sj1 sj1Var9 = vj1Var.n;
            if (!z3) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (vj1Var.B & 4294967295L)) * ((int) (vj1Var.s & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) * ((int) (vj1Var.s >> 32)))) << 32);
                if (!g83.b(sj1Var9.z, jFloatToRawIntBits)) {
                    sj1Var9.z = jFloatToRawIntBits;
                    sj1Var9.a.o(jFloatToRawIntBits);
                }
            } else if (!g83.b(sj1Var9.z, 9205357640488583168L)) {
                sj1Var9.z = 9205357640488583168L;
                sj1Var9.a.o(9205357640488583168L);
            }
        }
        if ((i & 16384) != 0) {
            sj1 sj1Var10 = vj1Var.n;
            boolean z4 = b24Var.w;
            if (sj1Var10.A != z4) {
                sj1Var10.A = z4;
                sj1Var10.g = true;
                sj1Var10.a();
            }
        }
        if ((131072 & i) != 0) {
            uj1 uj1Var13 = vj1Var.n.a;
        }
        if ((262144 & i) != 0) {
            uj1 uj1Var14 = vj1Var.n.a;
            if (!h12.c(uj1Var14.i(), null)) {
                uj1Var14.z();
            }
        }
        if ((524288 & i) != 0) {
            sj1 sj1Var11 = vj1Var.n;
            int i3 = b24Var.B;
            uj1 uj1Var15 = sj1Var11.a;
            if (uj1Var15.O() != i3) {
                uj1Var15.e(i3);
            }
        }
        if ((32768 & i) != 0) {
            uj1 uj1Var16 = vj1Var.n.a;
            if (uj1Var16.h() != 0) {
                uj1Var16.H(0);
            }
        }
        if ((i & 7963) != 0) {
            vj1Var.D = true;
            vj1Var.E = true;
        }
        if (h12.c(vj1Var.C, b24Var.C)) {
            c72Var2 = c72Var2;
            fx3Var = fx3Var;
            z2 = false;
        } else {
            ya4 ya4Var = b24Var.C;
            vj1Var.C = ya4Var;
            if (ya4Var == null) {
                c72Var2 = c72Var2;
                fx3Var = fx3Var;
            } else {
                sj1 sj1Var12 = vj1Var.n;
                if (ya4Var instanceof nb3) {
                    wv3 wv3Var = ((nb3) ya4Var).f;
                    float f6 = wv3Var.a;
                    float f7 = wv3Var.b;
                    sj1Var12.f((((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(wv3Var.c - f6)) << 32) | (((long) Float.floatToRawIntBits(wv3Var.d - f7)) & 4294967295L), 0.0f);
                } else {
                    if (ya4Var instanceof mb3) {
                        nc ncVar = ((mb3) ya4Var).f;
                        sj1Var12.k = null;
                        sj1Var12.i = 9205357640488583168L;
                        sj1Var12.h = 0L;
                        sj1Var12.j = 0.0f;
                        sj1Var12.g = true;
                        sj1Var12.n = false;
                        sj1Var12.l = ncVar;
                        sj1Var12.a();
                    } else {
                        if (!(ya4Var instanceof ob3)) {
                            er1.n();
                            return;
                        }
                        ob3 ob3Var = (ob3) ya4Var;
                        nc ncVar2 = ob3Var.g;
                        if (ncVar2 != null) {
                            sj1Var12.k = null;
                            sj1Var12.i = 9205357640488583168L;
                            sj1Var12.h = 0L;
                            sj1Var12.j = 0.0f;
                            sj1Var12.g = true;
                            sj1Var12.n = false;
                            sj1Var12.l = ncVar2;
                            sj1Var12.a();
                        } else {
                            g34 g34Var = ob3Var.f;
                            float f8 = g34Var.b;
                            float f9 = g34Var.a;
                            sj1Var12.f((((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (((long) Float.floatToRawIntBits(g34Var.c - f9)) << 32) | (((long) Float.floatToRawIntBits(g34Var.d - f8)) & 4294967295L), Float.intBitsToFloat((int) (g34Var.h >> 32)));
                        }
                    }
                    if (Build.VERSION.SDK_INT < 33 && (((ya4Var instanceof mb3) || ((ya4Var instanceof ob3) && !wr1.K(((ob3) ya4Var).f))) && (gf1Var = vj1Var.r) != null)) {
                        gf1Var.invoke();
                    }
                }
                if (Build.VERSION.SDK_INT < 33) {
                    gf1Var.invoke();
                }
            }
            z2 = true;
        }
        vj1Var.A = b24Var.n;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = raVar.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(raVar, raVar);
                }
            } else {
                raVar.invalidate();
            }
            if (ra.l()) {
                raVar.J(0.0f);
            }
        }
        boolean z5 = this.L;
        boolean z6 = b24Var.w;
        this.L = z6;
        this.P = b24Var.q;
        boolean z7 = n62Var2.a == n62Var.a && n62Var2.b == n62Var.b && n62Var2.c == n62Var.c && n62Var2.d == n62Var.d;
        if (!z || (z7 && z5 == z6 && !fx3Var.n)) {
            c72Var = c72Var2;
        } else {
            c72Var = c72Var2;
            ub3 ub3Var = c72Var.A;
            if (ub3Var != null) {
                ((ra) ub3Var).t(c72Var);
            }
        }
        if (z7) {
            return;
        }
        c72Var.M(this);
        if (c72Var.Y > 0) {
            ra raVar2 = (ra) h12.L(c72Var);
            rm3 rm3Var = raVar2.f0.e;
            rm3Var.getClass();
            if (c72Var.Y > 0) {
                ((f13) rm3Var.n).b(c72Var);
                c72Var.X = true;
            }
            raVar2.D(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017d  */
    public final boolean a1(long j) {
        boolean z;
        boolean z2;
        boolean zC;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        tb3 tb3Var = this.g0;
        if (tb3Var == null || !this.L) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        sj1 sj1Var = ((vj1) tb3Var).n;
        if (sj1Var.A) {
            ya4 ya4VarD = sj1Var.d();
            if (ya4VarD instanceof nb3) {
                wv3 wv3Var = ((nb3) ya4VarD).f;
                if (wv3Var.a > fIntBitsToFloat || fIntBitsToFloat >= wv3Var.c || wv3Var.b > fIntBitsToFloat2 || fIntBitsToFloat2 >= wv3Var.d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (ya4VarD instanceof ob3) {
                g34 g34Var = ((ob3) ya4VarD).f;
                float f = g34Var.c;
                float f2 = g34Var.b;
                float f3 = g34Var.d;
                float f4 = g34Var.a;
                long j2 = g34Var.f;
                long j3 = g34Var.h;
                z = false;
                z2 = true;
                long j4 = g34Var.g;
                long j5 = g34Var.e;
                if (fIntBitsToFloat >= f4 && fIntBitsToFloat < f && fIntBitsToFloat2 >= f2 && fIntBitsToFloat2 < f3) {
                    int i = (int) (j5 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + fIntBitsToFloat3 <= f - f4) {
                        int i3 = (int) (j3 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i3);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + fIntBitsToFloat4 <= f - f4) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                    float fIntBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                    if (fIntBitsToFloat < fIntBitsToFloat5 && fIntBitsToFloat2 < fIntBitsToFloat6) {
                                        zC = gi1.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, g34Var.e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat12 && fIntBitsToFloat2 > fIntBitsToFloat11) {
                                        zC = gi1.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, g34Var.h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) {
                                        zC = (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z2 : gi1.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, g34Var.g);
                                    } else {
                                        zC = gi1.C(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, g34Var.f);
                                    }
                                } else {
                                    nc ncVarA = pc.a();
                                    nc.b(ncVarA, g34Var);
                                    zC = gi1.y(fIntBitsToFloat, fIntBitsToFloat2, ncVarA);
                                }
                            } else {
                                nc ncVarA2 = pc.a();
                                nc.b(ncVarA2, g34Var);
                                zC = gi1.y(fIntBitsToFloat, fIntBitsToFloat2, ncVarA2);
                            }
                        } else {
                            nc ncVarA3 = pc.a();
                            nc.b(ncVarA3, g34Var);
                            zC = gi1.y(fIntBitsToFloat, fIntBitsToFloat2, ncVarA3);
                        }
                    } else {
                        nc ncVarA4 = pc.a();
                        nc.b(ncVarA4, g34Var);
                        zC = gi1.y(fIntBitsToFloat, fIntBitsToFloat2, ncVarA4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(ya4VarD instanceof mb3)) {
                    er1.n();
                    return false;
                }
                zC = gi1.y(fIntBitsToFloat, fIntBitsToFloat2, ((mb3) ya4VarD).f);
            }
            zC = z;
        } else {
            z = false;
            z2 = true;
        }
        return zC ? z2 : z;
    }

    @Override // defpackage.q62
    public final long b(long j) {
        long jK0 = K0(j);
        ra raVar = (ra) h12.L(this.H);
        raVar.y();
        return ya4.A(jK0, raVar.k0);
    }

    @Override // defpackage.cf2
    public final cf2 d0() {
        return this.I;
    }

    @Override // defpackage.cf2
    public final q62 e0() {
        return this;
    }

    @Override // defpackage.q62
    public final boolean f() {
        return A0().A;
    }

    @Override // defpackage.cf2
    public final boolean f0() {
        return this.Q != null;
    }

    @Override // defpackage.oo0
    public final float g() {
        return this.H.J.g();
    }

    @Override // defpackage.cf2
    public final c72 g0() {
        return this.H;
    }

    @Override // defpackage.wi2
    public final r62 getLayoutDirection() {
        return this.H.K;
    }

    @Override // defpackage.cf2
    public final vi2 h0() {
        vi2 vi2Var = this.Q;
        if (vi2Var != null) {
            return vi2Var;
        }
        kf2.o("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.cf2
    public final cf2 i0() {
        return this.J;
    }

    @Override // defpackage.cf2, defpackage.vb3
    public final boolean j() {
        return (this.g0 == null || this.K || !this.H.G()) ? false : true;
    }

    @Override // defpackage.cf2
    public final long j0() {
        return this.S;
    }

    @Override // defpackage.q62
    public final long k() {
        return this.p;
    }

    @Override // defpackage.cf2
    public final void n0() {
        N(this.S, this.T, this.M);
    }

    public final void p0(f63 f63Var, v03 v03Var, boolean z) {
        if (f63Var == this) {
            return;
        }
        f63 f63Var2 = this.J;
        if (f63Var2 != null) {
            f63Var2.p0(f63Var, v03Var, z);
        }
        long j = this.S;
        float f = (int) (j >> 32);
        v03Var.b -= f;
        v03Var.d -= f;
        float f2 = (int) (j & 4294967295L);
        v03Var.c -= f2;
        v03Var.e -= f2;
        tb3 tb3Var = this.g0;
        if (tb3Var != null) {
            vj1 vj1Var = (vj1) tb3Var;
            float[] fArrA = vj1Var.a();
            if (!vj1Var.F) {
                if (fArrA == null) {
                    v03Var.b = 0.0f;
                    v03Var.c = 0.0f;
                    v03Var.d = 0.0f;
                    v03Var.e = 0.0f;
                } else {
                    ya4.B(fArrA, v03Var);
                }
            }
            if (this.L && z) {
                long j2 = this.p;
                v03Var.b(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // defpackage.q62
    public final long q(long j) {
        if (!A0().A) {
            cz1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ra) h12.L(this.H)).p(K0(j));
    }

    public final long q0(f63 f63Var, long j) {
        if (f63Var == this) {
            return j;
        }
        f63 f63Var2 = this.J;
        return (f63Var2 == null || h12.c(f63Var, f63Var2)) ? x0(j) : x0(f63Var2.q0(f63Var, j));
    }

    public final long r0(long j) {
        float fG;
        float F;
        if (B0()) {
            wv3 wv3Var = this.X;
            fG = wv3Var.c - wv3Var.a;
        } else {
            fG = G();
        }
        if (B0()) {
            wv3 wv3Var2 = this.X;
            F = wv3Var2.d - wv3Var2.b;
        } else {
            F = F();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fG;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - F;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float s0(long j, long j2) {
        if (G() >= Float.intBitsToFloat((int) (j2 >> 32)) && F() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR0 = r0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - G());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - F()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        c72 c72Var = this.H;
        if (c72Var.Q.d(64)) {
            A0();
            for (cx2 cx2Var = (sq4) c72Var.Q.f; cx2Var != null; cx2Var = cx2Var.r) {
                if ((cx2Var.p & 64) != 0) {
                    cx2 cx2VarC = cx2Var;
                    f13 f13Var = null;
                    while (cx2VarC != null) {
                        if (cx2VarC instanceof xo) {
                            ((xo) cx2VarC).B.getClass();
                            kf2.k();
                            return null;
                        }
                        if ((cx2VarC.p & 64) != 0 && (cx2VarC instanceof fo0)) {
                            int i = 0;
                            for (cx2 cx2Var2 = ((fo0) cx2VarC).C; cx2Var2 != null; cx2Var2 = cx2Var2.s) {
                                if ((cx2Var2.p & 64) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cx2VarC = cx2Var2;
                                    } else {
                                        if (f13Var == null) {
                                            f13Var = new f13(new cx2[16]);
                                        }
                                        if (cx2VarC != null) {
                                            f13Var.b(cx2VarC);
                                            cx2VarC = null;
                                        }
                                        f13Var.b(cx2Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cx2VarC = j51.c(f13Var);
                    }
                }
            }
        }
        return null;
    }

    public final void t0(jz jzVar, sj1 sj1Var) {
        int i;
        Canvas canvas;
        int i2;
        float f;
        float f2;
        tb3 tb3Var = this.g0;
        if (tb3Var == null) {
            long j = this.S;
            float f3 = (int) (j >> 32);
            float f4 = (int) (j & 4294967295L);
            jzVar.j(f3, f4);
            u0(jzVar, sj1Var);
            jzVar.j(-f3, -f4);
            return;
        }
        vj1 vj1Var = (vj1) tb3Var;
        mz mzVar = vj1Var.z;
        vj1Var.g();
        vj1Var.n.a.M();
        i61 i61Var = mzVar.o;
        i61 i61Var2 = mzVar.o;
        i61Var.q(jzVar);
        i61Var.p = sj1Var;
        sj1 sj1Var2 = vj1Var.n;
        jz jzVarG = i61Var2.g();
        sj1 sj1Var3 = (sj1) i61Var2.p;
        uj1 uj1Var = sj1Var2.a;
        if (sj1Var2.s) {
            return;
        }
        long j2 = sj1Var2.h;
        Canvas canvasA = ba.a(jzVarG);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            i = 1;
        } else {
            long j3 = sj1Var2.t;
            float f5 = (int) (j3 >> 32);
            float f6 = f5 - sj1Var2.v;
            float f7 = (int) (j3 & 4294967295L);
            float f8 = f7 - sj1Var2.w;
            long j4 = sj1Var2.u;
            float f9 = f5 + ((int) (j4 >> 32)) + sj1Var2.x;
            float f10 = f7 + ((int) (j4 & 4294967295L)) + sj1Var2.y;
            float fB = uj1Var.b();
            dt dtVarI = uj1Var.i();
            int iO = uj1Var.O();
            if (fB >= 1.0f && iO == 3 && dtVarI == null) {
                canvas = canvasA;
                i2 = 1;
                if (uj1Var.h() != 1) {
                    canvas.save();
                    i = 1;
                    f = f8;
                    f2 = f6;
                    canvasA = canvas;
                }
                canvasA.translate(f2, f);
                Matrix matrixK = uj1Var.K();
                matrixK.preTranslate(sj1Var2.v, sj1Var2.w);
                canvasA.concat(matrixK);
                sj1Var2.h = g83.d(sj1Var2.h, (((long) Float.floatToRawIntBits(sj1Var2.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(sj1Var2.v)) << 32));
            } else {
                canvas = canvasA;
                i2 = 1;
            }
            gc gcVarB = sj1Var2.p;
            if (gcVarB == null) {
                gcVarB = fh0.b();
                sj1Var2.p = gcVarB;
            }
            gcVarB.d(fB);
            gcVarB.e(iO);
            gcVarB.g(dtVarI);
            Paint paint = (Paint) gcVarB.b;
            f = f8;
            f2 = f6;
            i = i2;
            canvasA = canvas;
            canvasA.saveLayer(f2, f, f9, f10, paint);
            canvasA.translate(f2, f);
            Matrix matrixK2 = uj1Var.K();
            matrixK2.preTranslate(sj1Var2.v, sj1Var2.w);
            canvasA.concat(matrixK2);
            sj1Var2.h = g83.d(sj1Var2.h, (((long) Float.floatToRawIntBits(sj1Var2.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(sj1Var2.v)) << 32));
        }
        sj1Var2.a();
        if (!uj1Var.m()) {
            try {
                sj1Var2.a.q(sj1Var2.b, sj1Var2.c, sj1Var2, sj1Var2.e);
            } catch (Throwable unused) {
            }
        }
        int i3 = 0;
        int i4 = uj1Var.M() > 0.0f ? i : 0;
        if (i4 != 0) {
            jzVarG.n();
        }
        int i5 = (zIsHardwareAccelerated || !sj1Var2.A) ? 0 : i;
        if (i5 != 0) {
            jzVarG.e();
            ya4 ya4VarD = sj1Var2.d();
            if (ya4VarD instanceof nb3) {
                wv3 wv3Var = ((nb3) ya4VarD).f;
                jzVarG.m(wv3Var.a, wv3Var.b, wv3Var.c, wv3Var.d);
            } else if (ya4VarD instanceof ob3) {
                nc ncVarA = sj1Var2.m;
                if (ncVarA != null) {
                    ncVarA.a.rewind();
                } else {
                    ncVarA = pc.a();
                    sj1Var2.m = ncVarA;
                }
                nc.b(ncVarA, ((ob3) ya4VarD).f);
                jzVarG.i(ncVarA);
            } else {
                if (!(ya4VarD instanceof mb3)) {
                    er1.n();
                    return;
                }
                jzVarG.i(((mb3) ya4VarD).f);
            }
        }
        if (sj1Var3 != null) {
            jw jwVar = sj1Var3.r;
            if (!jwVar.n) {
                bz1.a("Only add dependencies during a tracking");
            }
            x03 x03Var = (x03) jwVar.q;
            if (x03Var != null) {
                x03Var.a(sj1Var2);
            } else if (((sj1) jwVar.o) != null) {
                x03 x03Var2 = w54.a;
                x03 x03Var3 = new x03();
                Object obj = (sj1) jwVar.o;
                obj.getClass();
                x03Var3.a(obj);
                x03Var3.a(sj1Var2);
                jwVar.q = x03Var3;
                jwVar.o = null;
            } else {
                jwVar.o = sj1Var2;
            }
            x03 x03Var4 = (x03) jwVar.r;
            if (x03Var4 != null) {
                i3 = !x03Var4.l(sj1Var2) ? 1 : 0;
            } else if (((sj1) jwVar.p) != sj1Var2) {
                i3 = i;
            } else {
                jwVar.p = null;
            }
            if (i3 != 0) {
                sj1Var2.q += i;
            }
        }
        if (((aa) jzVarG).a.isHardwareAccelerated()) {
            uj1Var.g(jzVarG);
        } else {
            mz mzVar2 = sj1Var2.o;
            if (mzVar2 == null) {
                mzVar2 = new mz();
                sj1Var2.o = mzVar2;
            }
            i61 i61Var3 = mzVar2.o;
            oo0 oo0Var = sj1Var2.b;
            r62 r62Var = sj1Var2.c;
            long jO0 = l93.o0(sj1Var2.u);
            oo0 oo0VarH = i61Var3.h();
            r62 r62VarI = i61Var3.i();
            jz jzVarG2 = i61Var3.g();
            long j5 = i61Var3.j();
            sj1 sj1Var4 = (sj1) i61Var3.p;
            i61Var3.r(oo0Var);
            i61Var3.s(r62Var);
            i61Var3.q(jzVarG);
            i61Var3.t(jO0);
            i61Var3.p = sj1Var2;
            jzVarG.e();
            try {
                sj1Var2.c(mzVar2);
                jzVarG.k();
                i61Var3.r(oo0VarH);
                i61Var3.s(r62VarI);
                i61Var3.q(jzVarG2);
                i61Var3.t(j5);
                i61Var3.p = sj1Var4;
            } catch (Throwable th) {
                jzVarG.k();
                i61Var3.r(oo0VarH);
                i61Var3.s(r62VarI);
                i61Var3.q(jzVarG2);
                i61Var3.t(j5);
                i61Var3.p = sj1Var4;
                throw th;
            }
        }
        if (i5 != 0) {
            jzVarG.k();
        }
        if (i4 != 0) {
            jzVarG.f();
        }
        if (!zIsHardwareAccelerated) {
            canvasA.restore();
        }
        sj1Var2.h = j2;
    }

    @Override // defpackage.q62
    public final q62 u() {
        boolean z = A0().A;
        c72 c72Var = this.H;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (c72 c72VarT = c72Var; c72VarT != null; c72VarT = c72VarT.t()) {
                sb.append("\n|");
                sb.append(c72VarT);
                sb.append(" isAttached=");
                sb.append(c72VarT.G());
                sb.append(" modifier=");
                sb.append(c72VarT.V);
                sb.append(" tail=");
                sb.append(A0());
            }
            cz1.b(sb.toString());
        }
        L0();
        return ((f63) c72Var.Q.e).J;
    }

    public final void u0(jz jzVar, sj1 sj1Var) {
        f63 f63Var;
        jz jzVar2;
        sj1 sj1Var2;
        cx2 cx2VarC0 = C0(4);
        if (cx2VarC0 == null) {
            R0(jzVar, sj1Var);
            return;
        }
        c72 c72Var = this.H;
        c72Var.getClass();
        e72 sharedDrawScope = ((ra) h12.L(c72Var)).getSharedDrawScope();
        long jO0 = l93.o0(this.p);
        sharedDrawScope.getClass();
        f13 f13Var = null;
        while (cx2VarC0 != null) {
            if (cx2VarC0 instanceof rv0) {
                f63Var = this;
                jzVar2 = jzVar;
                sj1Var2 = sj1Var;
                sharedDrawScope.b(jzVar2, jO0, f63Var, (rv0) cx2VarC0, sj1Var2);
            } else {
                f63Var = this;
                jzVar2 = jzVar;
                sj1Var2 = sj1Var;
                if ((cx2VarC0.p & 4) != 0 && (cx2VarC0 instanceof fo0)) {
                    int i = 0;
                    for (cx2 cx2Var = ((fo0) cx2VarC0).C; cx2Var != null; cx2Var = cx2Var.s) {
                        if ((cx2Var.p & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cx2VarC0 = cx2Var;
                            } else {
                                if (f13Var == null) {
                                    f13Var = new f13(new cx2[16]);
                                }
                                if (cx2VarC0 != null) {
                                    f13Var.b(cx2VarC0);
                                    cx2VarC0 = null;
                                }
                                f13Var.b(cx2Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                jzVar = jzVar2;
                this = f63Var;
                sj1Var = sj1Var2;
            }
            cx2VarC0 = j51.c(f13Var);
            jzVar = jzVar2;
            this = f63Var;
            sj1Var = sj1Var2;
        }
    }

    public abstract void v0();

    public final f63 w0(f63 f63Var) {
        c72 c72VarT = f63Var.H;
        c72 c72Var = this.H;
        if (c72VarT == c72Var) {
            cx2 cx2VarA0 = f63Var.A0();
            cx2 cx2VarA1 = A0();
            if (!cx2VarA1.n.A) {
                cz1.b("visitLocalAncestors called on an unattached node");
            }
            for (cx2 cx2Var = cx2VarA1.n.r; cx2Var != null; cx2Var = cx2Var.r) {
                if ((cx2Var.p & 2) != 0 && cx2Var == cx2VarA0) {
                    return f63Var;
                }
            }
            return this;
        }
        while (c72VarT.B > c72Var.B) {
            c72VarT = c72VarT.t();
            c72VarT.getClass();
        }
        c72 c72VarT2 = c72Var;
        while (c72VarT2.B > c72VarT.B) {
            c72VarT2 = c72VarT2.t();
            c72VarT2.getClass();
        }
        while (c72VarT != c72VarT2) {
            c72VarT = c72VarT.t();
            c72VarT2 = c72VarT2.t();
            if (c72VarT == null || c72VarT2 == null) {
                kf2.n("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c72VarT2 != c72Var) {
            if (c72VarT != f63Var.H) {
                return (iz1) c72VarT.Q.d;
            }
            return f63Var;
        }
        return this;
    }

    public final long x0(long j) {
        long j2 = this.S;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        tb3 tb3Var = this.g0;
        if (tb3Var != null) {
            vj1 vj1Var = (vj1) tb3Var;
            float[] fArrA = vj1Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!vj1Var.F) {
                return ya4.A(jFloatToRawIntBits, fArrA);
            }
        }
        return jFloatToRawIntBits;
    }

    public abstract ef2 y0();

    @Override // defpackage.q62
    public final long z(q62 q62Var, long j) {
        return A(q62Var, j);
    }

    public final long z0() {
        return this.N.Y(this.H.L.a());
    }
}
