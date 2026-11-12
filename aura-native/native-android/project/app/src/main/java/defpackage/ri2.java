package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 {
    public final c72 a;
    public boolean c;
    public boolean d;
    public nc0 i;
    public final i61 b = new i61(4);
    public final rm3 e = new rm3(16);
    public final f13 f = new f13(new c72[16]);
    public final long g = 1;
    public final f13 h = new f13(new qi2[16]);

    public ri2(c72 c72Var) {
        this.a = c72Var;
    }

    public static final boolean a(ri2 ri2Var, c72 c72Var, boolean z) {
        nc0 nc0Var;
        ig3 placementScope;
        iz1 iz1Var;
        c72 c72VarT;
        c72 c72Var2 = ri2Var.a;
        boolean z2 = c72Var.Z;
        f72 f72Var = c72Var.R;
        boolean zD = false;
        if (!z2 && k(c72Var)) {
            if (c72Var == c72Var2) {
                nc0Var = ri2Var.i;
                nc0Var.getClass();
            } else {
                nc0Var = null;
            }
            if (z) {
                zD = f72Var.e ? c(c72Var, nc0Var) : false;
                if ((zD || f72Var.f) && h12.c(c72Var.I(), Boolean.TRUE)) {
                    c72Var.J();
                }
            } else {
                zD = c72Var.q() ? d(c72Var, nc0Var) : false;
                if (c72Var.p() && (c72Var == c72Var2 || ((c72VarT = c72Var.t()) != null && c72VarT.H() && f72Var.p.D))) {
                    if (c72Var == c72Var2) {
                        if (c72Var.N == a72.p) {
                            c72Var.f();
                        }
                        c72 c72VarT2 = c72Var.t();
                        if (c72VarT2 == null || (iz1Var = (iz1) c72VarT2.Q.d) == null || (placementScope = iz1Var.C) == null) {
                            placementScope = ((ra) h12.L(c72Var)).getPlacementScope();
                        }
                        ig3.k(placementScope, f72Var.p);
                    } else {
                        c72Var.S();
                    }
                    rm3 rm3Var = ri2Var.e;
                    rm3Var.getClass();
                    if (c72Var.Y > 0) {
                        ((f13) rm3Var.n).b(c72Var);
                        c72Var.X = true;
                    }
                }
            }
            ri2Var.e();
        }
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean c(c72 c72Var, nc0 nc0Var) {
        boolean zE0;
        c72 c72Var2 = c72Var.u;
        f72 f72Var = c72Var.R;
        if (c72Var2 == null) {
            return false;
        }
        if (nc0Var == null) {
            if2 if2Var = f72Var.q;
            nc0 nc0Var2 = if2Var != null ? if2Var.z : null;
            if (nc0Var2 == null || c72Var2 == null) {
                zE0 = false;
            } else {
                if2Var.getClass();
                zE0 = if2Var.e0(nc0Var2.a);
            }
        } else if (c72Var2 != null) {
            if2 if2Var2 = f72Var.q;
            if2Var2.getClass();
            zE0 = if2Var2.e0(nc0Var.a);
        } else {
            zE0 = false;
        }
        c72 c72VarT = c72Var.t();
        if (zE0 && c72VarT != null) {
            if (c72VarT.u == null) {
                c72.W(c72VarT, false, 3);
                return zE0;
            }
            if (c72Var.s() == a72.n) {
                c72.U(c72VarT, false, 3);
                return zE0;
            }
            if (c72Var.s() == a72.o) {
                c72VarT.T(false);
            }
        }
        return zE0;
    }

    public static boolean d(c72 c72Var, nc0 nc0Var) {
        boolean zO = nc0Var != null ? c72Var.O(nc0Var) : c72.P(c72Var);
        c72 c72VarT = c72Var.t();
        if (zO && c72VarT != null) {
            if (c72Var.r() == a72.n) {
                c72.W(c72VarT, false, 3);
                return zO;
            }
            if (c72Var.r() == a72.o) {
                c72VarT.V(false);
            }
        }
        return zO;
    }

    public static boolean i(c72 c72Var) {
        if2 if2Var;
        d72 d72Var;
        if (c72Var.R.e) {
            return (c72Var.s() == a72.p && ((if2Var = c72Var.R.q) == null || (d72Var = if2Var.D) == null || !d72Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean j(c72 c72Var) {
        if (!c72Var.q()) {
            return false;
        }
        do {
            if (c72Var.r() == a72.p && !c72Var.R.p.H.e()) {
                c72 c72VarT = c72Var.t();
                if ((c72VarT != null ? c72VarT.R.d : null) != y62.n) {
                    return false;
                }
            }
            c72Var = c72Var.t();
            if (c72Var == null) {
                return false;
            }
        } while (!c72Var.H());
        return true;
    }

    public static boolean k(c72 c72Var) {
        if2 if2Var;
        d72 d72Var;
        f72 f72Var = c72Var.R;
        return c72Var.H() || f72Var.p.D || j(c72Var) || h12.c(c72Var.I(), Boolean.TRUE) || i(c72Var) || f72Var.p.H.e() || !((if2Var = f72Var.q) == null || (d72Var = if2Var.D) == null || !d72Var.e());
    }

    public final void b(boolean z) {
        rm3 rm3Var = this.e;
        if (z) {
            f13 f13Var = (f13) rm3Var.n;
            c72 c72Var = this.a;
            if (c72Var.Y > 0) {
                f13Var.g();
                f13Var.b(c72Var);
                c72Var.X = true;
            }
        }
        if (((f13) rm3Var.n).p != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                rm3Var.C();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        f13 f13Var = this.h;
        int i = f13Var.p;
        if (i != 0) {
            Object[] objArr = f13Var.n;
            for (int i2 = 0; i2 < i; i2++) {
                qi2 qi2Var = (qi2) objArr[i2];
                if (qi2Var.a.G()) {
                    boolean z = qi2Var.b;
                    c72 c72Var = qi2Var.a;
                    boolean z2 = qi2Var.c;
                    if (z) {
                        c72.U(c72Var, z2, 2);
                    } else {
                        c72.W(c72Var, z2, 2);
                    }
                }
            }
            f13Var.g();
        }
    }

    public final void f(c72 c72Var) {
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if (h12.c(c72Var2.I(), Boolean.TRUE) && !c72Var2.Z) {
                if (this.b.f(c72Var2)) {
                    c72Var2.J();
                }
                f(c72Var2);
            }
        }
    }

    public final void g(c72 c72Var, boolean z) {
        if (!this.c) {
            cz1.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? c72Var.R.e : c72Var.q()) {
            cz1.a("node not yet measured");
        }
        h(c72Var, z);
    }

    public final void h(c72 c72Var, boolean z) {
        if2 if2Var;
        d72 d72Var;
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            a72 a72Var = a72.n;
            if ((!z && (c72Var2.r() == a72Var || c72Var2.R.p.H.e())) || (z && (c72Var2.s() == a72Var || ((if2Var = c72Var2.R.q) != null && (d72Var = if2Var.D) != null && d72Var.e())))) {
                boolean zA = h12.A(c72Var2);
                f72 f72Var = c72Var2.R;
                if (zA && !z) {
                    if (f72Var.e && this.b.f(c72Var2)) {
                        o(c72Var2, true);
                    } else {
                        g(c72Var2, true);
                    }
                }
                if (z ? f72Var.e : c72Var2.q()) {
                    o(c72Var2, z);
                }
                if (!(z ? f72Var.e : c72Var2.q())) {
                    h(c72Var2, z);
                }
            }
        }
        if (z ? c72Var.R.e : c72Var.q()) {
            o(c72Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [cx2] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [f13] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [f13] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final boolean l(gf1 gf1Var) {
        boolean z;
        cx2 cx2Var;
        cx2 C;
        boolean z2;
        c72 c72Var;
        boolean z3;
        boolean zO;
        i61 i61Var = this.b;
        c72 c72Var2 = this.a;
        if (!c72Var2.G()) {
            cz1.a("performMeasureAndLayout called with unattached root");
        }
        if (!c72Var2.H()) {
            cz1.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            cz1.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zO2 = i61Var.o();
                d34 d34Var = (d34) i61Var.o;
                if (zO2) {
                    z = false;
                    while (true) {
                        d34 d34Var2 = (d34) i61Var.q;
                        d34 d34Var3 = (d34) i61Var.p;
                        if (!((cj4) d34Var.o).isEmpty()) {
                            c72Var = (c72) ((cj4) d34Var.o).first();
                            d34Var.H(c72Var);
                            z3 = c72Var.u != null;
                            z2 = false;
                        } else if (!((cj4) d34Var3.o).isEmpty()) {
                            c72Var = (c72) ((cj4) d34Var3.o).first();
                            d34Var3.H(c72Var);
                            z3 = c72Var.u != null;
                            z2 = true;
                        } else {
                            if (((cj4) d34Var2.o).isEmpty()) {
                                break;
                            }
                            c72 c72Var3 = (c72) ((cj4) d34Var2.o).first();
                            d34Var2.H(c72Var3);
                            z2 = true;
                            c72Var = c72Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zO = a(this, c72Var, z3);
                        } else {
                            zO = o(c72Var, z3);
                            if (c72Var.R.f) {
                                i61Var.c(c72Var, n12.o);
                            }
                            if (c72Var.p()) {
                                i61Var.c(c72Var, n12.q);
                            }
                        }
                        if (c72Var == c72Var2 && zO) {
                            z = true;
                        }
                    }
                    if (gf1Var != null) {
                        gf1Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        f13 f13Var = this.f;
        Object[] objArr = f13Var.n;
        int i2 = f13Var.p;
        int i3 = 0;
        while (i3 < i2) {
            w12 w12Var = ((c72) objArr[i3]).Q;
            iz1 iz1Var = (iz1) w12Var.d;
            boolean zF = g63.f(4194304);
            if (zF) {
                cx2Var = iz1Var.n0;
            } else {
                cx2Var = iz1Var.n0.r;
                if (cx2Var == null) {
                }
                i3++;
                i = 0;
            }
            k52 k52Var = f63.h0;
            cx2 cx2VarD0 = iz1Var.D0(zF);
            while (cx2VarD0 != null && (cx2VarD0.q & 4194304) != 0) {
                if ((cx2VarD0.p & 4194304) != 0) {
                    cx2 r12 = cx2VarD0;
                    f13 f13Var2 = null;
                    while (r12 != null) {
                        if (r12 instanceof o62) {
                            ((o62) r12).e((iz1) w12Var.d);
                        } else {
                            if ((r12.p & 4194304) != 0 && (r12 instanceof fo0)) {
                                cx2 cx2Var2 = ((fo0) r12).C;
                                int i4 = i;
                                while (cx2Var2 != null) {
                                    if ((cx2Var2.p & 4194304) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            C = r12;
                                            f13Var2 = f13Var2;
                                            f13Var2 = f13Var2;
                                            C = cx2Var2;
                                        } else {
                                            if (f13Var2 == null) {
                                                f13Var2 = new f13(new cx2[16]);
                                            }
                                            if (C != null) {
                                                f13Var2.b(C);
                                                C = null;
                                            }
                                            f13Var2.b(cx2Var2);
                                        }
                                    } else {
                                        C = r12;
                                        f13Var2 = f13Var2;
                                    }
                                    cx2Var2 = cx2Var2.s;
                                    C = C;
                                    f13Var2 = f13Var2;
                                }
                                if (i4 == 1) {
                                    C = r12;
                                    f13Var2 = f13Var2;
                                }
                            }
                            i = 0;
                            r12 = C;
                            f13Var2 = f13Var2;
                        }
                        C = r12;
                        f13Var2 = f13Var2;
                        C = j51.c(f13Var2);
                        i = 0;
                        r12 = C;
                        f13Var2 = f13Var2;
                    }
                }
                if (cx2VarD0 == cx2Var) {
                    break;
                }
                cx2VarD0 = cx2VarD0.s;
                i = 0;
            }
            i3++;
            i = 0;
        }
        f13Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [cx2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void m(c72 c72Var, long j) {
        cx2 cx2Var;
        if (c72Var.Z) {
            return;
        }
        c72 c72Var2 = this.a;
        if (c72Var == c72Var2) {
            cz1.a("measureAndLayout called on root");
        }
        if (!c72Var2.G()) {
            cz1.a("performMeasureAndLayout called with unattached root");
        }
        if (!c72Var2.H()) {
            cz1.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            cz1.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                i61 i61Var = this.b;
                ((d34) i61Var.o).H(c72Var);
                ((d34) i61Var.p).H(c72Var);
                ((d34) i61Var.q).H(c72Var);
                if ((c(c72Var, new nc0(j)) || c72Var.R.f) && h12.c(c72Var.I(), Boolean.TRUE)) {
                    c72Var.J();
                }
                f(c72Var);
                d(c72Var, new nc0(j));
                if (c72Var.p() && c72Var.H()) {
                    c72Var.S();
                    rm3 rm3Var = this.e;
                    rm3Var.getClass();
                    if (c72Var.Y > 0) {
                        ((f13) rm3Var.n).b(c72Var);
                        c72Var.X = true;
                    }
                }
                e();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        }
        f13 f13Var = this.f;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            w12 w12Var = ((c72) objArr[i2]).Q;
            iz1 iz1Var = (iz1) w12Var.d;
            boolean zF = g63.f(4194304);
            if (zF) {
                cx2Var = iz1Var.n0;
            } else {
                cx2Var = iz1Var.n0.r;
                if (cx2Var == null) {
                }
            }
            k52 k52Var = f63.h0;
            for (cx2 cx2VarD0 = iz1Var.D0(zF); cx2VarD0 != null && (cx2VarD0.q & 4194304) != 0; cx2VarD0 = cx2VarD0.s) {
                if ((cx2VarD0.p & 4194304) != 0) {
                    ?? C = cx2VarD0;
                    f13 f13Var2 = null;
                    while (C != null) {
                        if (C instanceof o62) {
                            ((o62) C).e((iz1) w12Var.d);
                        } else if ((C.p & 4194304) != 0 && (C instanceof fo0)) {
                            cx2 cx2Var2 = ((fo0) C).C;
                            int i3 = 0;
                            while (cx2Var2 != null) {
                                if ((cx2Var2.p & 4194304) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        C = C;
                                        f13Var2 = f13Var2;
                                        f13Var2 = f13Var2;
                                        C = cx2Var2;
                                    } else {
                                        if (f13Var2 == null) {
                                            f13Var2 = new f13(new cx2[16]);
                                        }
                                        if (C != null) {
                                            f13Var2.b(C);
                                            C = null;
                                        }
                                        f13Var2.b(cx2Var2);
                                    }
                                } else {
                                    C = C;
                                    f13Var2 = f13Var2;
                                }
                                cx2Var2 = cx2Var2.s;
                                C = C;
                                f13Var2 = f13Var2;
                            }
                            if (i3 == 1) {
                                C = C;
                                f13Var2 = f13Var2;
                            } else {
                                C = C;
                                f13Var2 = f13Var2;
                            }
                        }
                        C = j51.c(f13Var2);
                    }
                }
                if (cx2VarD0 == cx2Var) {
                    break;
                }
            }
        }
        f13Var.g();
    }

    public final void n() {
        i61 i61Var = this.b;
        if (i61Var.o()) {
            c72 c72Var = this.a;
            if (!c72Var.G()) {
                cz1.a("performMeasureAndLayout called with unattached root");
            }
            if (!c72Var.H()) {
                cz1.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                cz1.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if ((((cj4) ((d34) i61Var.q).o).isEmpty() || ((cj4) ((d34) i61Var.o).o).isEmpty()) ? false : true) {
                        if (c72Var.u != null) {
                            q(c72Var, true);
                        } else {
                            p(c72Var);
                        }
                    }
                    q(c72Var, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.c = false;
                        this.d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean o(c72 c72Var, boolean z) {
        nc0 nc0Var;
        boolean zD = false;
        if (!c72Var.Z && k(c72Var)) {
            if (c72Var == this.a) {
                nc0Var = this.i;
                nc0Var.getClass();
            } else {
                nc0Var = null;
            }
            if (z) {
                if (c72Var.R.e) {
                    zD = c(c72Var, nc0Var);
                }
            } else if (c72Var.q()) {
                zD = d(c72Var, nc0Var);
            }
            e();
        }
        return zD;
    }

    public final void p(c72 c72Var) {
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if (c72Var2.r() == a72.n || c72Var2.R.p.H.e()) {
                if (h12.A(c72Var2)) {
                    q(c72Var2, true);
                } else {
                    p(c72Var2);
                }
            }
        }
    }

    public final void q(c72 c72Var, boolean z) {
        nc0 nc0Var;
        if (c72Var.Z) {
            return;
        }
        if (c72Var == this.a) {
            nc0Var = this.i;
            nc0Var.getClass();
        } else {
            nc0Var = null;
        }
        if (z) {
            c(c72Var, nc0Var);
        } else {
            d(c72Var, nc0Var);
        }
    }

    public final boolean r(c72 c72Var, boolean z) {
        int iOrdinal = c72Var.R.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new qi2(c72Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    er1.n();
                    return false;
                }
                if (!c72Var.q() || z) {
                    c72Var.R.p.E = true;
                    if (!c72Var.Z && (c72Var.H() || j(c72Var))) {
                        c72 c72VarT = c72Var.t();
                        if (c72VarT == null || !c72VarT.q()) {
                            this.b.c(c72Var, n12.p);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j) {
        nc0 nc0Var = this.i;
        if (nc0Var == null ? false : nc0.b(nc0Var.a, j)) {
            return;
        }
        if (this.c) {
            cz1.a("updateRootConstraints called while measuring");
        }
        this.i = new nc0(j);
        c72 c72Var = this.a;
        boolean zG = c72Var.G();
        f72 f72Var = c72Var.R;
        if (zG) {
            c72 c72Var2 = c72Var.u;
            if (c72Var2 != null) {
                f72Var.e = true;
            }
            f72Var.p.E = true;
            this.b.c(c72Var, c72Var2 != null ? n12.n : n12.p);
        }
    }
}
