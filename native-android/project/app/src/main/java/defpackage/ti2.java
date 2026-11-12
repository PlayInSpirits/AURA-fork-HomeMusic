package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ti2 extends jg3 implements pi2, k9, yx2 {
    public if1 A;
    public float B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean K;
    public final si2 M;
    public final si2 N;
    public float O;
    public boolean P;
    public if1 Q;
    public float S;
    public final si2 T;
    public boolean U;
    public final f72 s;
    public boolean t;
    public boolean w;
    public boolean x;
    public int u = Integer.MAX_VALUE;
    public int v = Integer.MAX_VALUE;
    public a72 y = a72.p;
    public long z = 0;
    public final d72 H = new d72(this, 0);
    public final f13 I = new f13(new ti2[16]);
    public boolean J = true;
    public long L = qc0.b(0, 0, 15);
    public long R = 0;

    /* JADX WARN: Type inference failed for: r2v1, types: [si2] */
    /* JADX WARN: Type inference failed for: r3v4, types: [si2] */
    /* JADX WARN: Type inference failed for: r6v6, types: [si2] */
    public ti2(f72 f72Var) {
        this.s = f72Var;
        final int i = 0;
        final int i2 = 1;
        this.M = new gf1(this) { // from class: si2
            public final /* synthetic */ ti2 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                ig3 placementScope;
                int i3 = i;
                j15 j15Var = j15.a;
                ti2 ti2Var = this.o;
                switch (i3) {
                    case 0:
                        ti2Var.s.a().r(ti2Var.L);
                        break;
                    case 1:
                        f72 f72Var2 = ti2Var.s;
                        f72Var2.i = 0;
                        c72 c72Var = f72Var2.a;
                        f13 f13VarY = c72Var.y();
                        Object[] objArr = f13VarY.n;
                        int i4 = f13VarY.p;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ti2 ti2Var2 = ((c72) objArr[i5]).R.p;
                            ti2Var2.u = ti2Var2.v;
                            ti2Var2.v = Integer.MAX_VALUE;
                            ti2Var2.D = false;
                            if (ti2Var2.y == a72.o) {
                                ti2Var2.y = a72.p;
                            }
                        }
                        f13 f13VarY2 = c72Var.y();
                        Object[] objArr2 = f13VarY2.n;
                        int i6 = f13VarY2.p;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((c72) objArr2[i7]).R.p.H.getClass();
                        }
                        if (ti2Var.c().B) {
                            c13 c13Var = (c13) c72Var.n();
                            int i8 = c13Var.n.p;
                            for (int i9 = 0; i9 < i8; i9++) {
                                ((f63) ((c72) c13Var.get(i9)).Q.e).B = true;
                            }
                        }
                        ti2Var.c().h0().c();
                        if (ti2Var.c().B) {
                            c13 c13Var2 = (c13) c72Var.n();
                            int i10 = c13Var2.n.p;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((f63) ((c72) c13Var2.get(i11)).Q.e).B = false;
                            }
                        }
                        f13 f13VarY3 = c72Var.y();
                        Object[] objArr3 = f13VarY3.n;
                        int i12 = f13VarY3.p;
                        for (int i13 = 0; i13 < i12; i13++) {
                            c72 c72Var2 = (c72) objArr3[i13];
                            f72 f72Var3 = c72Var2.R;
                            if (f72Var3.p.u != c72Var2.u()) {
                                c72Var.N();
                                c72Var.B();
                                if (c72Var2.u() == Integer.MAX_VALUE) {
                                    if (f72Var3.c || h12.A(c72Var2)) {
                                        if2 if2Var = f72Var3.q;
                                        if2Var.getClass();
                                        if2Var.X(false);
                                    }
                                    f72Var3.p.Z();
                                }
                            }
                        }
                        f13 f13VarY4 = c72Var.y();
                        Object[] objArr4 = f13VarY4.n;
                        int i14 = f13VarY4.p;
                        for (int i15 = 0; i15 < i14; i15++) {
                            d72 d72Var = ((c72) objArr4[i15]).R.p.H;
                            d72Var.getClass();
                            d72Var.c = false;
                        }
                        break;
                    default:
                        f72 f72Var4 = ti2Var.s;
                        f63 f63Var = f72Var4.a().J;
                        if (f63Var == null || (placementScope = f63Var.C) == null) {
                            placementScope = ((ra) h12.L(f72Var4.a)).getPlacementScope();
                        }
                        if1 if1Var = ti2Var.Q;
                        if (if1Var == null) {
                            f63 f63VarA = f72Var4.a();
                            long j = ti2Var.R;
                            float f = ti2Var.S;
                            placementScope.getClass();
                            ig3.a(placementScope, f63VarA);
                            f63VarA.N(g02.c(j, f63VarA.r), f, null);
                        } else {
                            f63 f63VarA2 = f72Var4.a();
                            long j2 = ti2Var.R;
                            float f2 = ti2Var.S;
                            placementScope.getClass();
                            ig3.a(placementScope, f63VarA2);
                            f63VarA2.N(g02.c(j2, f63VarA2.r), f2, if1Var);
                        }
                        break;
                }
                return j15Var;
            }
        };
        this.N = new gf1(this) { // from class: si2
            public final /* synthetic */ ti2 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                ig3 placementScope;
                int i3 = i2;
                j15 j15Var = j15.a;
                ti2 ti2Var = this.o;
                switch (i3) {
                    case 0:
                        ti2Var.s.a().r(ti2Var.L);
                        break;
                    case 1:
                        f72 f72Var2 = ti2Var.s;
                        f72Var2.i = 0;
                        c72 c72Var = f72Var2.a;
                        f13 f13VarY = c72Var.y();
                        Object[] objArr = f13VarY.n;
                        int i4 = f13VarY.p;
                        for (int i5 = 0; i5 < i4; i5++) {
                            ti2 ti2Var2 = ((c72) objArr[i5]).R.p;
                            ti2Var2.u = ti2Var2.v;
                            ti2Var2.v = Integer.MAX_VALUE;
                            ti2Var2.D = false;
                            if (ti2Var2.y == a72.o) {
                                ti2Var2.y = a72.p;
                            }
                        }
                        f13 f13VarY2 = c72Var.y();
                        Object[] objArr2 = f13VarY2.n;
                        int i6 = f13VarY2.p;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((c72) objArr2[i7]).R.p.H.getClass();
                        }
                        if (ti2Var.c().B) {
                            c13 c13Var = (c13) c72Var.n();
                            int i8 = c13Var.n.p;
                            for (int i9 = 0; i9 < i8; i9++) {
                                ((f63) ((c72) c13Var.get(i9)).Q.e).B = true;
                            }
                        }
                        ti2Var.c().h0().c();
                        if (ti2Var.c().B) {
                            c13 c13Var2 = (c13) c72Var.n();
                            int i10 = c13Var2.n.p;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((f63) ((c72) c13Var2.get(i11)).Q.e).B = false;
                            }
                        }
                        f13 f13VarY3 = c72Var.y();
                        Object[] objArr3 = f13VarY3.n;
                        int i12 = f13VarY3.p;
                        for (int i13 = 0; i13 < i12; i13++) {
                            c72 c72Var2 = (c72) objArr3[i13];
                            f72 f72Var3 = c72Var2.R;
                            if (f72Var3.p.u != c72Var2.u()) {
                                c72Var.N();
                                c72Var.B();
                                if (c72Var2.u() == Integer.MAX_VALUE) {
                                    if (f72Var3.c || h12.A(c72Var2)) {
                                        if2 if2Var = f72Var3.q;
                                        if2Var.getClass();
                                        if2Var.X(false);
                                    }
                                    f72Var3.p.Z();
                                }
                            }
                        }
                        f13 f13VarY4 = c72Var.y();
                        Object[] objArr4 = f13VarY4.n;
                        int i14 = f13VarY4.p;
                        for (int i15 = 0; i15 < i14; i15++) {
                            d72 d72Var = ((c72) objArr4[i15]).R.p.H;
                            d72Var.getClass();
                            d72Var.c = false;
                        }
                        break;
                    default:
                        f72 f72Var4 = ti2Var.s;
                        f63 f63Var = f72Var4.a().J;
                        if (f63Var == null || (placementScope = f63Var.C) == null) {
                            placementScope = ((ra) h12.L(f72Var4.a)).getPlacementScope();
                        }
                        if1 if1Var = ti2Var.Q;
                        if (if1Var == null) {
                            f63 f63VarA = f72Var4.a();
                            long j = ti2Var.R;
                            float f = ti2Var.S;
                            placementScope.getClass();
                            ig3.a(placementScope, f63VarA);
                            f63VarA.N(g02.c(j, f63VarA.r), f, null);
                        } else {
                            f63 f63VarA2 = f72Var4.a();
                            long j2 = ti2Var.R;
                            float f2 = ti2Var.S;
                            placementScope.getClass();
                            ig3.a(placementScope, f63VarA2);
                            f63VarA2.N(g02.c(j2, f63VarA2.r), f2, if1Var);
                        }
                        break;
                }
                return j15Var;
            }
        };
        final int i3 = 2;
        this.T = new gf1(this) { // from class: si2
            public final /* synthetic */ ti2 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                ig3 placementScope;
                int i4 = i3;
                j15 j15Var = j15.a;
                ti2 ti2Var = this.o;
                switch (i4) {
                    case 0:
                        ti2Var.s.a().r(ti2Var.L);
                        break;
                    case 1:
                        f72 f72Var2 = ti2Var.s;
                        f72Var2.i = 0;
                        c72 c72Var = f72Var2.a;
                        f13 f13VarY = c72Var.y();
                        Object[] objArr = f13VarY.n;
                        int i5 = f13VarY.p;
                        for (int i6 = 0; i6 < i5; i6++) {
                            ti2 ti2Var2 = ((c72) objArr[i6]).R.p;
                            ti2Var2.u = ti2Var2.v;
                            ti2Var2.v = Integer.MAX_VALUE;
                            ti2Var2.D = false;
                            if (ti2Var2.y == a72.o) {
                                ti2Var2.y = a72.p;
                            }
                        }
                        f13 f13VarY2 = c72Var.y();
                        Object[] objArr2 = f13VarY2.n;
                        int i7 = f13VarY2.p;
                        for (int i8 = 0; i8 < i7; i8++) {
                            ((c72) objArr2[i8]).R.p.H.getClass();
                        }
                        if (ti2Var.c().B) {
                            c13 c13Var = (c13) c72Var.n();
                            int i9 = c13Var.n.p;
                            for (int i10 = 0; i10 < i9; i10++) {
                                ((f63) ((c72) c13Var.get(i10)).Q.e).B = true;
                            }
                        }
                        ti2Var.c().h0().c();
                        if (ti2Var.c().B) {
                            c13 c13Var2 = (c13) c72Var.n();
                            int i11 = c13Var2.n.p;
                            for (int i12 = 0; i12 < i11; i12++) {
                                ((f63) ((c72) c13Var2.get(i12)).Q.e).B = false;
                            }
                        }
                        f13 f13VarY3 = c72Var.y();
                        Object[] objArr3 = f13VarY3.n;
                        int i13 = f13VarY3.p;
                        for (int i14 = 0; i14 < i13; i14++) {
                            c72 c72Var2 = (c72) objArr3[i14];
                            f72 f72Var3 = c72Var2.R;
                            if (f72Var3.p.u != c72Var2.u()) {
                                c72Var.N();
                                c72Var.B();
                                if (c72Var2.u() == Integer.MAX_VALUE) {
                                    if (f72Var3.c || h12.A(c72Var2)) {
                                        if2 if2Var = f72Var3.q;
                                        if2Var.getClass();
                                        if2Var.X(false);
                                    }
                                    f72Var3.p.Z();
                                }
                            }
                        }
                        f13 f13VarY4 = c72Var.y();
                        Object[] objArr4 = f13VarY4.n;
                        int i15 = f13VarY4.p;
                        for (int i16 = 0; i16 < i15; i16++) {
                            d72 d72Var = ((c72) objArr4[i16]).R.p.H;
                            d72Var.getClass();
                            d72Var.c = false;
                        }
                        break;
                    default:
                        f72 f72Var4 = ti2Var.s;
                        f63 f63Var = f72Var4.a().J;
                        if (f63Var == null || (placementScope = f63Var.C) == null) {
                            placementScope = ((ra) h12.L(f72Var4.a)).getPlacementScope();
                        }
                        if1 if1Var = ti2Var.Q;
                        if (if1Var == null) {
                            f63 f63VarA = f72Var4.a();
                            long j = ti2Var.R;
                            float f = ti2Var.S;
                            placementScope.getClass();
                            ig3.a(placementScope, f63VarA);
                            f63VarA.N(g02.c(j, f63VarA.r), f, null);
                        } else {
                            f63 f63VarA2 = f72Var4.a();
                            long j2 = ti2Var.R;
                            float f2 = ti2Var.S;
                            placementScope.getClass();
                            ig3.a(placementScope, f63VarA2);
                            f63VarA2.N(g02.c(j2, f63VarA2.r), f2, if1Var);
                        }
                        break;
                }
                return j15Var;
            }
        };
    }

    @Override // defpackage.k9
    public final void E() {
        c72.W(this.s.a, false, 7);
    }

    @Override // defpackage.jg3
    public final int F() {
        return this.s.a().F();
    }

    @Override // defpackage.jg3
    public final int G() {
        return this.s.a().G();
    }

    @Override // defpackage.jg3
    public final void N(long j, float f, if1 if1Var) {
        ig3 placementScope;
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        try {
            this.D = true;
            if (!g02.a(j, this.z) || if1Var != this.A || this.U) {
                if (f72Var.k || f72Var.j || this.U) {
                    this.F = true;
                    this.U = false;
                }
            }
            if2 if2Var = f72Var.q;
            if (if2Var != null) {
                f72 f72Var2 = if2Var.s;
                if (if2Var.C == hf2.p && !h12.A(f72Var2.a)) {
                    f72Var2.c = true;
                }
            }
            if2 if2Var2 = f72Var.q;
            if (if2Var2 != null && if2Var2.S()) {
                f63 f63Var = f72Var.a().J;
                if (f63Var == null || (placementScope = f63Var.C) == null) {
                    placementScope = ((ra) h12.L(c72Var)).getPlacementScope();
                }
                if2 if2Var3 = f72Var.q;
                if2Var3.getClass();
                c72 c72VarT = c72Var.t();
                if (c72VarT != null) {
                    c72VarT.R.h = 0;
                }
                if2Var3.v = Integer.MAX_VALUE;
                ig3.f(placementScope, if2Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            if2 if2Var4 = f72Var.q;
            if (if2Var4 != null && !if2Var4.x) {
                cz1.b("Error: Placement happened before lookahead.");
            }
            c0(j, f, if1Var);
        } catch (Throwable th) {
            c72Var.Z(th);
            throw null;
        }
    }

    public final List S() {
        f72 f72Var = this.s;
        f72Var.a.f0();
        boolean z = this.J;
        f13 f13Var = this.I;
        if (!z) {
            return f13Var.f();
        }
        c72 c72Var = f72Var.a;
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if (f13Var.p <= i2) {
                f13Var.b(c72Var2.R.p);
            } else {
                ti2 ti2Var = c72Var2.R.p;
                Object[] objArr2 = f13Var.n;
                Object obj = objArr2[i2];
                objArr2[i2] = ti2Var;
            }
        }
        f13Var.l(((c13) c72Var.n()).n.p, f13Var.p);
        this.J = false;
        return f13Var.f();
    }

    public final void X() {
        boolean z = this.C;
        this.C = true;
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        w12 w12Var = c72Var.Q;
        if (!z) {
            ((iz1) w12Var.d).N0();
            ((ra) h12.L(c72Var)).getRectManager().h(f72Var.a);
            if (c72Var.q()) {
                c72.W(c72Var, true, 6);
            } else if (c72Var.R.e) {
                c72.U(c72Var, true, 6);
            }
        }
        f63 f63Var = ((iz1) w12Var.d).I;
        for (f63 f63Var2 = (f63) w12Var.e; !h12.c(f63Var2, f63Var) && f63Var2 != null; f63Var2 = f63Var2.I) {
            if (f63Var2.f0) {
                f63Var2.I0();
            }
        }
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if (c72Var2.u() != Integer.MAX_VALUE) {
                c72Var2.R.p.X();
                c72.X(c72Var2);
            }
        }
    }

    public final void Z() {
        if (this.C) {
            this.C = false;
            f72 f72Var = this.s;
            c72 c72Var = f72Var.a;
            c72 c72Var2 = f72Var.a;
            ((ra) h12.L(c72Var)).getRectManager().i(c72Var2);
            w12 w12Var = c72Var2.Q;
            f63 f63Var = ((iz1) w12Var.d).I;
            for (f63 f63Var2 = (f63) w12Var.e; !h12.c(f63Var2, f63Var) && f63Var2 != null; f63Var2 = f63Var2.I) {
                f63Var2.P0();
                f63Var2.U0();
            }
            f13 f13VarY = c72Var2.y();
            Object[] objArr = f13VarY.n;
            int i = f13VarY.p;
            for (int i2 = 0; i2 < i; i2++) {
                ((c72) objArr[i2]).R.p.Z();
            }
        }
    }

    @Override // defpackage.k9
    public final d72 a() {
        return this.H;
    }

    public final void b0() {
        this.P = true;
        f72 f72Var = this.s;
        c72 c72VarT = f72Var.a.t();
        float f = c().T;
        c72 c72Var = f72Var.a;
        w12 w12Var = c72Var.Q;
        f63 f63Var = (f63) w12Var.e;
        iz1 iz1Var = (iz1) w12Var.d;
        while (f63Var != iz1Var) {
            f63Var.getClass();
            w62 w62Var = (w62) f63Var;
            f += w62Var.T;
            f63Var = w62Var.I;
        }
        if (f != this.O) {
            this.O = f;
            if (c72VarT != null) {
                c72VarT.N();
            }
            if (c72VarT != null) {
                c72VarT.B();
            }
        }
        if (!c().B) {
            boolean z = this.C;
            if (!z || this.H.d()) {
                X();
            }
            if (z) {
                ((iz1) c72Var.Q.d).N0();
            } else {
                if (c72VarT != null) {
                    c72VarT.B();
                }
                if (this.t && c72VarT != null) {
                    c72VarT.V(false);
                }
            }
        }
        if (c72VarT != null) {
            f72 f72Var2 = c72VarT.R;
            if (!this.t && f72Var2.d == y62.p) {
                if (this.v != Integer.MAX_VALUE) {
                    cz1.b("Place was called on a node which was placed already");
                }
                int i = f72Var2.i;
                this.v = i;
                f72Var2.i = i + 1;
            }
        } else {
            this.v = 0;
        }
        y();
    }

    @Override // defpackage.k9
    public final iz1 c() {
        return (iz1) this.s.a.Q.d;
    }

    public final void c0(long j, float f, if1 if1Var) {
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        c72 c72Var2 = f72Var.a;
        if (c72Var.Z) {
            cz1.a("place is called on a deactivated node");
        }
        f72Var.d = y62.p;
        this.z = j;
        this.B = f;
        this.A = if1Var;
        this.P = false;
        ub3 ub3VarL = h12.L(c72Var2);
        if (this.F || !this.C) {
            this.H.e = false;
            f72Var.f(false);
            this.Q = if1Var;
            this.R = j;
            this.S = f;
            wb3 snapshotObserver = ((ra) ub3VarL).getSnapshotObserver();
            snapshotObserver.a.e(c72Var2, snapshotObserver.f, this.T);
        } else {
            f63 f63VarA = f72Var.a();
            f63VarA.S0(g02.c(j, f63VarA.r), f, if1Var);
            b0();
        }
        f72Var.d = y62.r;
        if (f72Var.a().B && (f72Var.k || f72Var.j)) {
            requestLayout();
        }
        this.x = true;
    }

    public final boolean d0(long j) {
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        c72 c72Var2 = f72Var.a;
        try {
            if (c72Var.Z) {
                cz1.a("measure is called on a deactivated node");
            }
            ub3 ub3VarL = h12.L(c72Var2);
            c72 c72VarT = c72Var2.t();
            boolean z = true;
            c72Var2.P = c72Var2.P || (c72VarT != null && c72VarT.P);
            if (!c72Var2.q() && nc0.b(this.q, j)) {
                ((ra) ub3VarL).g(c72Var2, false);
                c72Var2.Y();
                return false;
            }
            this.H.d = false;
            f13 f13VarY = c72Var2.y();
            Object[] objArr = f13VarY.n;
            int i = f13VarY.p;
            for (int i2 = 0; i2 < i; i2++) {
                ((c72) objArr[i2]).R.p.H.getClass();
            }
            this.w = true;
            long j2 = f72Var.a().p;
            R(j);
            y62 y62Var = f72Var.d;
            y62 y62Var2 = y62.r;
            if (y62Var != y62Var2) {
                cz1.b("layout state is not idle before measure starts");
            }
            this.L = j;
            y62 y62Var3 = y62.n;
            f72Var.d = y62Var3;
            this.E = false;
            wb3 snapshotObserver = ((ra) h12.L(c72Var2)).getSnapshotObserver();
            snapshotObserver.a.e(c72Var2, snapshotObserver.c, this.M);
            if (f72Var.d == y62Var3) {
                this.F = true;
                this.G = true;
                f72Var.d = y62Var2;
            }
            if (n02.a(f72Var.a().p, j2) && f72Var.a().n == this.n && f72Var.a().o == this.o) {
                z = false;
            }
            Q((((long) f72Var.a().o) & 4294967295L) | (((long) f72Var.a().n) << 32));
            return z;
        } catch (Throwable th) {
            c72Var.Z(th);
            throw null;
        }
    }

    @Override // defpackage.k9
    public final k9 e() {
        f72 f72Var;
        c72 c72VarT = this.s.a.t();
        if (c72VarT == null || (f72Var = c72VarT.R) == null) {
            return null;
        }
        return f72Var.p;
    }

    public final void e0() {
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        c72 c72Var2 = f72Var.a;
        if (!c72Var.H() || f72Var.l <= 0) {
            return;
        }
        f72 f72Var2 = c72Var2.R;
        if ((f72Var2.j || f72Var2.k) && !f72Var2.p.F) {
            c72Var2.V(false);
        }
        f13 f13VarY = c72Var2.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            ((c72) objArr[i2]).R.p.e0();
        }
    }

    @Override // defpackage.k9
    public final int n() {
        return this.v;
    }

    @Override // defpackage.pi2
    public final jg3 r(long j) {
        a72 a72Var;
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        c72 c72Var2 = f72Var.a;
        a72 a72Var2 = c72Var.N;
        a72 a72Var3 = a72.p;
        if (a72Var2 == a72Var3) {
            c72Var.e();
        }
        if (h12.A(c72Var2)) {
            if2 if2Var = f72Var.q;
            if2Var.getClass();
            if2Var.w = a72Var3;
            if2Var.r(j);
        }
        c72 c72VarT = c72Var2.t();
        if (c72VarT != null) {
            f72 f72Var2 = c72VarT.R;
            if (this.y != a72Var3 && !c72Var2.P) {
                cz1.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = f72Var2.d.ordinal();
            if (iOrdinal == 0) {
                a72Var = a72.n;
            } else {
                if (iOrdinal != 2) {
                    nz2.x(f72Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                a72Var = a72.o;
            }
            this.y = a72Var;
        } else {
            this.y = a72Var3;
        }
        d0(j);
        return this;
    }

    @Override // defpackage.k9
    public final void requestLayout() {
        this.s.a.V(false);
    }

    @Override // defpackage.k9
    public final void s(x xVar) {
        f13 f13VarY = this.s.a.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            xVar.invoke(((c72) objArr[i2]).R.p);
        }
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        return null;
    }

    @Override // defpackage.yx2
    public final void x(boolean z) {
        f72 f72Var = this.s;
        if (z != f72Var.a().y) {
            f72Var.a().y = z;
            this.U = true;
        }
    }

    @Override // defpackage.k9
    public final void y() {
        this.K = true;
        d72 d72Var = this.H;
        d72Var.h();
        boolean z = this.F;
        f72 f72Var = this.s;
        if (z) {
            f13 f13VarY = f72Var.a.y();
            Object[] objArr = f13VarY.n;
            int i = f13VarY.p;
            for (int i2 = 0; i2 < i; i2++) {
                c72 c72Var = (c72) objArr[i2];
                if (c72Var.q() && c72Var.r() == a72.n && c72.P(c72Var)) {
                    c72.W(f72Var.a, false, 7);
                }
            }
        }
        if (this.G || (!c().B && this.F)) {
            this.F = false;
            y62 y62Var = f72Var.d;
            f72Var.d = y62.p;
            f72Var.g(false);
            c72 c72Var2 = f72Var.a;
            wb3 snapshotObserver = ((ra) h12.L(c72Var2)).getSnapshotObserver();
            snapshotObserver.a.e(c72Var2, snapshotObserver.e, this.N);
            f72Var.d = y62Var;
            this.G = false;
        }
        if (d72Var.b && d72Var.e()) {
            d72Var.g();
        }
        this.K = false;
    }
}
