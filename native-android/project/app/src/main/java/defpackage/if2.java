package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class if2 extends jg3 implements pi2, k9, yx2 {
    public if1 B;
    public boolean G;
    public final gf2 H;
    public long I;
    public final gf2 J;
    public final gf2 K;
    public boolean L;
    public final f72 s;
    public boolean t;
    public boolean x;
    public boolean y;
    public nc0 z;
    public int u = Integer.MAX_VALUE;
    public int v = Integer.MAX_VALUE;
    public a72 w = a72.p;
    public long A = 0;
    public hf2 C = hf2.p;
    public final d72 D = new d72(this, 1);
    public final f13 E = new f13(new if2[16]);
    public boolean F = true;

    /* JADX WARN: Type inference failed for: r0v6, types: [gf2] */
    /* JADX WARN: Type inference failed for: r5v3, types: [gf2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gf2] */
    public if2(f72 f72Var) {
        this.s = f72Var;
        final int i = 1;
        final int i2 = 0;
        this.H = new gf1(this) { // from class: gf2
            public final /* synthetic */ if2 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                ef2 ef2VarY0;
                int i3 = i2;
                j15 j15Var = j15.a;
                q03 q03Var = null;
                placementScope = null;
                placementScope = null;
                ig3 placementScope = null;
                if2 if2Var = this.o;
                switch (i3) {
                    case 0:
                        f72 f72Var2 = if2Var.s;
                        f72Var2.h = 0;
                        c72 c72Var = f72Var2.a;
                        f13 f13VarY = c72Var.y();
                        Object[] objArr = f13VarY.n;
                        int i4 = f13VarY.p;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if2 if2Var2 = ((c72) objArr[i5]).R.q;
                            if2Var2.getClass();
                            if2Var2.u = if2Var2.v;
                            if2Var2.v = Integer.MAX_VALUE;
                            if (if2Var2.w == a72.o) {
                                if2Var2.w = a72.p;
                            }
                        }
                        f13 f13VarY2 = c72Var.y();
                        Object[] objArr2 = f13VarY2.n;
                        int i6 = f13VarY2.p;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if2 if2Var3 = ((c72) objArr2[i7]).R.q;
                            if2Var3.getClass();
                            if2Var3.D.getClass();
                        }
                        hz1 hz1Var = if2Var.c().o0;
                        if (hz1Var == null) {
                            kf2.o("Expected lookahead delegate");
                            return null;
                        }
                        c13 c13Var = (c13) c72Var.n();
                        int i8 = c13Var.n.p;
                        for (int i9 = 0; i9 < i8; i9++) {
                            c72 c72Var2 = (c72) c13Var.get(i9);
                            ef2 ef2VarY1 = ((f63) c72Var2.Q.e).y0();
                            if (ef2VarY1 != null) {
                                if (ef2VarY1.B) {
                                    if (q03Var == null) {
                                        q03Var = new q03();
                                    }
                                    q03Var.a(c72Var2);
                                }
                                ef2VarY1.B = hz1Var.B;
                            }
                        }
                        hz1Var.h0().c();
                        c13 c13Var2 = (c13) c72Var.n();
                        int i10 = c13Var2.n.p;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= i10) {
                                f13 f13VarY3 = c72Var.y();
                                Object[] objArr3 = f13VarY3.n;
                                int i12 = f13VarY3.p;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if2 if2Var4 = ((c72) objArr3[i13]).R.q;
                                    if2Var4.getClass();
                                    int i14 = if2Var4.u;
                                    int i15 = if2Var4.v;
                                    if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                        if2Var4.X(true);
                                    }
                                }
                                f13 f13VarY4 = c72Var.y();
                                Object[] objArr4 = f13VarY4.n;
                                int i16 = f13VarY4.p;
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if2 if2Var5 = ((c72) objArr4[i17]).R.q;
                                    if2Var5.getClass();
                                    d72 d72Var = if2Var5.D;
                                    d72Var.getClass();
                                    d72Var.c = false;
                                }
                                return j15Var;
                            }
                            c72 c72Var3 = (c72) c13Var2.get(i11);
                            boolean z = q03Var != null && q03Var.g(c72Var3) >= 0;
                            ef2 ef2VarY2 = ((f63) c72Var3.Q.e).y0();
                            if (ef2VarY2 != null) {
                                ef2VarY2.B = z;
                            }
                            i11++;
                        }
                        break;
                    case 1:
                        ef2 ef2VarY3 = if2Var.s.a().y0();
                        ef2VarY3.getClass();
                        ef2VarY3.r(if2Var.I);
                        return j15Var;
                    default:
                        f72 f72Var3 = if2Var.s;
                        if (h12.A(f72Var3.a) || f72Var3.c) {
                            f63 f63Var = f72Var3.a().J;
                            if (f63Var != null) {
                                placementScope = f63Var.C;
                            }
                        } else {
                            f63 f63Var2 = f72Var3.a().J;
                            if (f63Var2 != null && (ef2VarY0 = f63Var2.y0()) != null) {
                                placementScope = ef2VarY0.C;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((ra) h12.L(f72Var3.a)).getPlacementScope();
                        }
                        ef2 ef2VarY4 = f72Var3.a().y0();
                        ef2VarY4.getClass();
                        ig3.j(placementScope, ef2VarY4, if2Var.A);
                        return j15Var;
                }
            }
        };
        f72Var.p.getClass();
        this.I = qc0.b(0, 0, 15);
        this.J = new gf1(this) { // from class: gf2
            public final /* synthetic */ if2 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                ef2 ef2VarY0;
                int i3 = i;
                j15 j15Var = j15.a;
                q03 q03Var = null;
                placementScope = null;
                placementScope = null;
                ig3 placementScope = null;
                if2 if2Var = this.o;
                switch (i3) {
                    case 0:
                        f72 f72Var2 = if2Var.s;
                        f72Var2.h = 0;
                        c72 c72Var = f72Var2.a;
                        f13 f13VarY = c72Var.y();
                        Object[] objArr = f13VarY.n;
                        int i4 = f13VarY.p;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if2 if2Var2 = ((c72) objArr[i5]).R.q;
                            if2Var2.getClass();
                            if2Var2.u = if2Var2.v;
                            if2Var2.v = Integer.MAX_VALUE;
                            if (if2Var2.w == a72.o) {
                                if2Var2.w = a72.p;
                            }
                        }
                        f13 f13VarY2 = c72Var.y();
                        Object[] objArr2 = f13VarY2.n;
                        int i6 = f13VarY2.p;
                        for (int i7 = 0; i7 < i6; i7++) {
                            if2 if2Var3 = ((c72) objArr2[i7]).R.q;
                            if2Var3.getClass();
                            if2Var3.D.getClass();
                        }
                        hz1 hz1Var = if2Var.c().o0;
                        if (hz1Var == null) {
                            kf2.o("Expected lookahead delegate");
                            return null;
                        }
                        c13 c13Var = (c13) c72Var.n();
                        int i8 = c13Var.n.p;
                        for (int i9 = 0; i9 < i8; i9++) {
                            c72 c72Var2 = (c72) c13Var.get(i9);
                            ef2 ef2VarY1 = ((f63) c72Var2.Q.e).y0();
                            if (ef2VarY1 != null) {
                                if (ef2VarY1.B) {
                                    if (q03Var == null) {
                                        q03Var = new q03();
                                    }
                                    q03Var.a(c72Var2);
                                }
                                ef2VarY1.B = hz1Var.B;
                            }
                        }
                        hz1Var.h0().c();
                        c13 c13Var2 = (c13) c72Var.n();
                        int i10 = c13Var2.n.p;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= i10) {
                                f13 f13VarY3 = c72Var.y();
                                Object[] objArr3 = f13VarY3.n;
                                int i12 = f13VarY3.p;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if2 if2Var4 = ((c72) objArr3[i13]).R.q;
                                    if2Var4.getClass();
                                    int i14 = if2Var4.u;
                                    int i15 = if2Var4.v;
                                    if (i14 != i15 && i15 == Integer.MAX_VALUE) {
                                        if2Var4.X(true);
                                    }
                                }
                                f13 f13VarY4 = c72Var.y();
                                Object[] objArr4 = f13VarY4.n;
                                int i16 = f13VarY4.p;
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if2 if2Var5 = ((c72) objArr4[i17]).R.q;
                                    if2Var5.getClass();
                                    d72 d72Var = if2Var5.D;
                                    d72Var.getClass();
                                    d72Var.c = false;
                                }
                                return j15Var;
                            }
                            c72 c72Var3 = (c72) c13Var2.get(i11);
                            boolean z = q03Var != null && q03Var.g(c72Var3) >= 0;
                            ef2 ef2VarY2 = ((f63) c72Var3.Q.e).y0();
                            if (ef2VarY2 != null) {
                                ef2VarY2.B = z;
                            }
                            i11++;
                        }
                        break;
                    case 1:
                        ef2 ef2VarY3 = if2Var.s.a().y0();
                        ef2VarY3.getClass();
                        ef2VarY3.r(if2Var.I);
                        return j15Var;
                    default:
                        f72 f72Var3 = if2Var.s;
                        if (h12.A(f72Var3.a) || f72Var3.c) {
                            f63 f63Var = f72Var3.a().J;
                            if (f63Var != null) {
                                placementScope = f63Var.C;
                            }
                        } else {
                            f63 f63Var2 = f72Var3.a().J;
                            if (f63Var2 != null && (ef2VarY0 = f63Var2.y0()) != null) {
                                placementScope = ef2VarY0.C;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((ra) h12.L(f72Var3.a)).getPlacementScope();
                        }
                        ef2 ef2VarY4 = f72Var3.a().y0();
                        ef2VarY4.getClass();
                        ig3.j(placementScope, ef2VarY4, if2Var.A);
                        return j15Var;
                }
            }
        };
        final int i3 = 2;
        this.K = new gf1(this) { // from class: gf2
            public final /* synthetic */ if2 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                ef2 ef2VarY0;
                int i4 = i3;
                j15 j15Var = j15.a;
                q03 q03Var = null;
                placementScope = null;
                placementScope = null;
                ig3 placementScope = null;
                if2 if2Var = this.o;
                switch (i4) {
                    case 0:
                        f72 f72Var2 = if2Var.s;
                        f72Var2.h = 0;
                        c72 c72Var = f72Var2.a;
                        f13 f13VarY = c72Var.y();
                        Object[] objArr = f13VarY.n;
                        int i5 = f13VarY.p;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if2 if2Var2 = ((c72) objArr[i6]).R.q;
                            if2Var2.getClass();
                            if2Var2.u = if2Var2.v;
                            if2Var2.v = Integer.MAX_VALUE;
                            if (if2Var2.w == a72.o) {
                                if2Var2.w = a72.p;
                            }
                        }
                        f13 f13VarY2 = c72Var.y();
                        Object[] objArr2 = f13VarY2.n;
                        int i7 = f13VarY2.p;
                        for (int i8 = 0; i8 < i7; i8++) {
                            if2 if2Var3 = ((c72) objArr2[i8]).R.q;
                            if2Var3.getClass();
                            if2Var3.D.getClass();
                        }
                        hz1 hz1Var = if2Var.c().o0;
                        if (hz1Var == null) {
                            kf2.o("Expected lookahead delegate");
                            return null;
                        }
                        c13 c13Var = (c13) c72Var.n();
                        int i9 = c13Var.n.p;
                        for (int i10 = 0; i10 < i9; i10++) {
                            c72 c72Var2 = (c72) c13Var.get(i10);
                            ef2 ef2VarY1 = ((f63) c72Var2.Q.e).y0();
                            if (ef2VarY1 != null) {
                                if (ef2VarY1.B) {
                                    if (q03Var == null) {
                                        q03Var = new q03();
                                    }
                                    q03Var.a(c72Var2);
                                }
                                ef2VarY1.B = hz1Var.B;
                            }
                        }
                        hz1Var.h0().c();
                        c13 c13Var2 = (c13) c72Var.n();
                        int i11 = c13Var2.n.p;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= i11) {
                                f13 f13VarY3 = c72Var.y();
                                Object[] objArr3 = f13VarY3.n;
                                int i13 = f13VarY3.p;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if2 if2Var4 = ((c72) objArr3[i14]).R.q;
                                    if2Var4.getClass();
                                    int i15 = if2Var4.u;
                                    int i16 = if2Var4.v;
                                    if (i15 != i16 && i16 == Integer.MAX_VALUE) {
                                        if2Var4.X(true);
                                    }
                                }
                                f13 f13VarY4 = c72Var.y();
                                Object[] objArr4 = f13VarY4.n;
                                int i17 = f13VarY4.p;
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if2 if2Var5 = ((c72) objArr4[i18]).R.q;
                                    if2Var5.getClass();
                                    d72 d72Var = if2Var5.D;
                                    d72Var.getClass();
                                    d72Var.c = false;
                                }
                                return j15Var;
                            }
                            c72 c72Var3 = (c72) c13Var2.get(i12);
                            boolean z = q03Var != null && q03Var.g(c72Var3) >= 0;
                            ef2 ef2VarY2 = ((f63) c72Var3.Q.e).y0();
                            if (ef2VarY2 != null) {
                                ef2VarY2.B = z;
                            }
                            i12++;
                        }
                        break;
                    case 1:
                        ef2 ef2VarY3 = if2Var.s.a().y0();
                        ef2VarY3.getClass();
                        ef2VarY3.r(if2Var.I);
                        return j15Var;
                    default:
                        f72 f72Var3 = if2Var.s;
                        if (h12.A(f72Var3.a) || f72Var3.c) {
                            f63 f63Var = f72Var3.a().J;
                            if (f63Var != null) {
                                placementScope = f63Var.C;
                            }
                        } else {
                            f63 f63Var2 = f72Var3.a().J;
                            if (f63Var2 != null && (ef2VarY0 = f63Var2.y0()) != null) {
                                placementScope = ef2VarY0.C;
                            }
                        }
                        if (placementScope == null) {
                            placementScope = ((ra) h12.L(f72Var3.a)).getPlacementScope();
                        }
                        ef2 ef2VarY4 = f72Var3.a().y0();
                        ef2VarY4.getClass();
                        ig3.j(placementScope, ef2VarY4, if2Var.A);
                        return j15Var;
                }
            }
        };
    }

    @Override // defpackage.k9
    public final void E() {
        c72.U(this.s.a, false, 7);
    }

    @Override // defpackage.jg3
    public final void N(long j, float f, if1 if1Var) {
        d0(j, if1Var);
    }

    public final boolean S() {
        f72 f72Var = this.s;
        return h12.A(f72Var.a) || f72Var.c;
    }

    public final void X(boolean z) {
        if (z && S()) {
            return;
        }
        if (z || S()) {
            this.C = hf2.p;
            f13 f13VarY = this.s.a.y();
            Object[] objArr = f13VarY.n;
            int i = f13VarY.p;
            for (int i2 = 0; i2 < i; i2++) {
                if2 if2Var = ((c72) objArr[i2]).R.q;
                if2Var.getClass();
                if2Var.X(true);
            }
        }
    }

    public final void Z() {
        hf2 hf2Var = this.C;
        f72 f72Var = this.s;
        boolean z = f72Var.c;
        c72 c72Var = f72Var.a;
        hf2 hf2Var2 = hf2.n;
        if (z) {
            this.C = hf2.o;
        } else {
            this.C = hf2Var2;
        }
        if (hf2Var != hf2Var2 && f72Var.e) {
            c72.U(c72Var, true, 6);
        }
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if2 if2Var = c72Var2.R.q;
            if (if2Var == null) {
                kf2.n("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (if2Var.v != Integer.MAX_VALUE) {
                if2Var.Z();
                c72.X(c72Var2);
            }
        }
    }

    @Override // defpackage.k9
    public final d72 a() {
        return this.D;
    }

    public final void b0() {
        f72 f72Var = this.s;
        if (f72Var.o > 0) {
            f13 f13VarY = f72Var.a.y();
            Object[] objArr = f13VarY.n;
            int i = f13VarY.p;
            for (int i2 = 0; i2 < i; i2++) {
                c72 c72Var = (c72) objArr[i2];
                f72 f72Var2 = c72Var.R;
                if ((f72Var2.m || f72Var2.n) && !f72Var2.f) {
                    c72Var.T(false);
                }
                if2 if2Var = f72Var2.q;
                if (if2Var != null) {
                    if2Var.b0();
                }
            }
        }
    }

    @Override // defpackage.k9
    public final iz1 c() {
        return (iz1) this.s.a.Q.d;
    }

    public final void c0() {
        y62 y62Var;
        this.L = true;
        f72 f72Var = this.s;
        c72 c72VarT = f72Var.a.t();
        hf2 hf2Var = this.C;
        if ((hf2Var != hf2.n && !f72Var.c) || (hf2Var != hf2.o && f72Var.c)) {
            Z();
            if (this.t && c72VarT != null) {
                c72VarT.T(false);
            }
        }
        if (c72VarT != null) {
            f72 f72Var2 = c72VarT.R;
            if (!this.t && ((y62Var = f72Var2.d) == y62.p || y62Var == y62.q)) {
                if (this.v != Integer.MAX_VALUE) {
                    cz1.b("Place was called on a node which was placed already");
                }
                int i = f72Var2.h;
                this.v = i;
                f72Var2.h = i + 1;
            }
        } else {
            this.v = 0;
        }
        y();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    public final void d0(long j, if1 if1Var) {
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        c72 c72Var2 = f72Var.a;
        try {
            c72 c72VarT = c72Var.t();
            y62 y62Var = c72VarT != null ? c72VarT.R.d : null;
            y62 y62Var2 = y62.q;
            if (y62Var == y62Var2) {
                f72Var.c = false;
            }
            if (c72Var2.Z) {
                cz1.a("place is called on a deactivated node");
            }
            f72Var.d = y62Var2;
            boolean z = true;
            this.x = true;
            this.L = false;
            if (!g02.a(j, this.A)) {
                if (f72Var.n || f72Var.m) {
                    f72Var.f = true;
                }
                b0();
            }
            ub3 ub3VarL = h12.L(c72Var2);
            this.A = j;
            if (f72Var.f) {
                f72Var.h(false);
                this.D.e = false;
                wb3 snapshotObserver = ((ra) ub3VarL).getSnapshotObserver();
                snapshotObserver.a.e(c72Var2, snapshotObserver.g, this.K);
            } else {
                if (this.C == hf2.p) {
                    z = false;
                }
                if (z) {
                    ef2 ef2VarY0 = f72Var.a().y0();
                    ef2VarY0.getClass();
                    ef2VarY0.r0(g02.c(j, ef2VarY0.r));
                    c0();
                } else {
                    f72Var.h(false);
                    this.D.e = false;
                    wb3 snapshotObserver2 = ((ra) ub3VarL).getSnapshotObserver();
                    snapshotObserver2.a.e(c72Var2, snapshotObserver2.g, this.K);
                }
            }
            this.B = if1Var;
            f72Var.d = y62.r;
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
        return f72Var.q;
    }

    public final boolean e0(long j) {
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        c72 c72Var2 = f72Var.a;
        try {
            if (c72Var.Z) {
                cz1.a("measure is called on a deactivated node");
            }
            c72 c72VarT = c72Var2.t();
            c72Var2.P = c72Var2.P || (c72VarT != null && c72VarT.P);
            if (!c72Var2.R.e) {
                nc0 nc0Var = this.z;
                if (nc0Var == null ? false : nc0.b(nc0Var.a, j)) {
                    ub3 ub3Var = c72Var2.A;
                    if (ub3Var != null) {
                        ((ra) ub3Var).g(c72Var2, true);
                    }
                    c72Var2.Y();
                    return false;
                }
            }
            this.z = new nc0(j);
            R(j);
            this.D.d = false;
            f13 f13VarY = c72Var2.y();
            Object[] objArr = f13VarY.n;
            int i = f13VarY.p;
            for (int i2 = 0; i2 < i; i2++) {
                if2 if2Var = ((c72) objArr[i2]).R.q;
                if2Var.getClass();
                if2Var.D.getClass();
            }
            long j2 = this.y ? this.p : -9223372034707292160L;
            this.y = true;
            ef2 ef2VarY0 = f72Var.a().y0();
            if (ef2VarY0 == null) {
                cz1.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            f72Var.c(j);
            Q((((long) ef2VarY0.n) << 32) | (((long) ef2VarY0.o) & 4294967295L));
            return (((int) (j2 >> 32)) == ef2VarY0.n && ((int) (j2 & 4294967295L)) == ef2VarY0.o) ? false : true;
        } catch (Throwable th) {
            c72Var.Z(th);
            throw null;
        }
    }

    @Override // defpackage.k9
    public final int n() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.pi2
    public final jg3 r(long j) {
        a72 a72Var;
        f72 f72Var = this.s;
        c72 c72Var = f72Var.a;
        c72 c72Var2 = f72Var.a;
        c72 c72VarT = c72Var.t();
        if ((c72VarT != null ? c72VarT.R.d : null) == y62.o) {
            f72Var.b = false;
        } else {
            c72 c72VarT2 = c72Var2.t();
            if ((c72VarT2 != null ? c72VarT2.R.d : null) == y62.q) {
                f72Var.b = false;
            }
        }
        c72 c72VarT3 = c72Var2.t();
        a72 a72Var2 = a72.p;
        if (c72VarT3 != null) {
            f72 f72Var2 = c72VarT3.R;
            if (this.w != a72Var2 && !c72Var2.P) {
                cz1.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = f72Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                a72Var = a72.n;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    nz2.x(f72Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                a72Var = a72.o;
            }
            this.w = a72Var;
        } else {
            this.w = a72Var2;
        }
        if (c72Var2.N == a72Var2) {
            c72Var2.e();
        }
        e0(j);
        return this;
    }

    @Override // defpackage.k9
    public final void requestLayout() {
        this.s.a.T(false);
    }

    @Override // defpackage.k9
    public final void s(x xVar) {
        f13 f13VarY = this.s.a.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            if2 if2Var = ((c72) objArr[i2]).R.q;
            if2Var.getClass();
            xVar.invoke(if2Var);
        }
    }

    @Override // defpackage.jg3, defpackage.pi2
    public final Object t() {
        return null;
    }

    @Override // defpackage.yx2
    public final void x(boolean z) {
        ef2 ef2VarY0;
        f72 f72Var = this.s;
        ef2 ef2VarY1 = f72Var.a().y0();
        if (Boolean.valueOf(z).equals(ef2VarY1 != null ? Boolean.valueOf(ef2VarY1.y) : null) || (ef2VarY0 = f72Var.a().y0()) == null) {
            return;
        }
        ef2VarY0.y = z;
    }

    @Override // defpackage.k9
    public final void y() {
        this.G = true;
        d72 d72Var = this.D;
        d72Var.h();
        f72 f72Var = this.s;
        boolean z = f72Var.f;
        c72 c72Var = f72Var.a;
        if (z) {
            f13 f13VarY = c72Var.y();
            Object[] objArr = f13VarY.n;
            int i = f13VarY.p;
            for (int i2 = 0; i2 < i; i2++) {
                c72 c72Var2 = (c72) objArr[i2];
                f72 f72Var2 = c72Var2.R;
                if (f72Var2.e && c72Var2.s() == a72.n) {
                    if2 if2Var = f72Var2.q;
                    if2Var.getClass();
                    if2 if2Var2 = f72Var2.q;
                    nc0 nc0Var = if2Var2 != null ? if2Var2.z : null;
                    nc0Var.getClass();
                    if (if2Var.e0(nc0Var.a)) {
                        c72.U(c72Var, false, 7);
                    }
                }
            }
        }
        hz1 hz1Var = c().o0;
        hz1Var.getClass();
        if (f72Var.g || (!hz1Var.B && f72Var.f)) {
            f72Var.f = false;
            y62 y62Var = f72Var.d;
            f72Var.d = y62.q;
            f72Var.i(false);
            wb3 snapshotObserver = ((ra) h12.L(c72Var)).getSnapshotObserver();
            snapshotObserver.a.e(c72Var, snapshotObserver.h, this.H);
            f72Var.d = y62Var;
            if (f72Var.m && hz1Var.B) {
                requestLayout();
            }
            f72Var.g = false;
        }
        if (d72Var.b && d72Var.e()) {
            d72Var.g();
        }
        this.G = false;
    }
}
