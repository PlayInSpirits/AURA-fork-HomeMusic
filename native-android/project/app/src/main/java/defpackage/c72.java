package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 implements u70, vb3, e80 {
    public static final c34 a0 = new c34(1);
    public static final e90 b0 = new e90(28);
    public static final x62 c0 = new x62();
    public static final n7 d0 = new n7(16);
    public ub3 A;
    public int B;
    public boolean C;
    public boolean D;
    public e94 E;
    public boolean F;
    public final f13 G;
    public boolean H;
    public ui2 I;
    public oo0 J;
    public r62 K;
    public m65 L;
    public c90 M;
    public a72 N;
    public a72 O;
    public boolean P;
    public final w12 Q;
    public final f72 R;
    public o72 S;
    public f63 T;
    public boolean U;
    public dx2 V;
    public dx2 W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final boolean n;
    public int o;
    public boolean p;
    public long q;
    public boolean r;
    public boolean s;
    public int t;
    public c72 u;
    public int v;
    public final gp3 w;
    public f13 x;
    public boolean y;
    public c72 z;

    public c72(int i, boolean z) {
        this.n = z;
        this.o = i;
        this.q = 9223372034707292159L;
        this.r = true;
        this.s = true;
        this.t = -4;
        this.w = new gp3(15, new f13(new c72[16]), new wc(10, this));
        this.G = new f13(new c72[16]);
        this.H = true;
        this.I = a0;
        this.J = h12.c;
        this.K = r62.n;
        this.L = c0;
        c90.f.getClass();
        this.M = b90.b;
        a72 a72Var = a72.p;
        this.N = a72Var;
        this.O = a72Var;
        this.Q = new w12(this);
        this.R = new f72(this);
        this.U = true;
        this.V = ax2.a;
    }

    public static boolean P(c72 c72Var) {
        ti2 ti2Var = c72Var.R.p;
        return c72Var.O(ti2Var.w ? new nc0(ti2Var.q) : null);
    }

    public static void U(c72 c72Var, boolean z, int i) {
        c72 c72VarT;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (c72Var.u == null) {
            cz1.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        ub3 ub3Var = c72Var.A;
        if (ub3Var == null || c72Var.C || c72Var.n) {
            return;
        }
        ((ra) ub3Var).u(c72Var, true, z, z2);
        if (z3) {
            if2 if2Var = c72Var.R.q;
            if2Var.getClass();
            f72 f72Var = if2Var.s;
            c72 c72VarT2 = f72Var.a.t();
            a72 a72Var = f72Var.a.N;
            if (c72VarT2 == null || a72Var == a72.p) {
                return;
            }
            while (c72VarT2.N == a72Var && (c72VarT = c72VarT2.t()) != null) {
                c72VarT2 = c72VarT;
            }
            int iOrdinal = a72Var.ordinal();
            if (iOrdinal == 0) {
                if (c72VarT2.u != null) {
                    U(c72VarT2, z, 6);
                    return;
                } else {
                    W(c72VarT2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                kf2.o("Intrinsics isn't used by the parent");
            } else if (c72VarT2.u != null) {
                c72VarT2.T(z);
            } else {
                c72VarT2.V(z);
            }
        }
    }

    public static void W(c72 c72Var, boolean z, int i) {
        ub3 ub3Var;
        c72 c72VarT;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (c72Var.C || c72Var.n || (ub3Var = c72Var.A) == null) {
            return;
        }
        ((ra) ub3Var).u(c72Var, false, z, z2);
        if (z3) {
            f72 f72Var = c72Var.R.p.s;
            c72 c72VarT2 = f72Var.a.t();
            a72 a72Var = f72Var.a.N;
            if (c72VarT2 == null || a72Var == a72.p) {
                return;
            }
            while (c72VarT2.N == a72Var && (c72VarT = c72VarT2.t()) != null) {
                c72VarT2 = c72VarT;
            }
            int iOrdinal = a72Var.ordinal();
            if (iOrdinal == 0) {
                W(c72VarT2, z, 6);
            } else if (iOrdinal == 1) {
                c72VarT2.V(z);
            } else {
                kf2.o("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void X(c72 c72Var) {
        int i = b72.a[c72Var.R.d.ordinal()];
        f72 f72Var = c72Var.R;
        if (i != 1) {
            nz2.x(f72Var.d, "Unexpected state ");
            return;
        }
        if (f72Var.e) {
            U(c72Var, true, 6);
            return;
        }
        if (f72Var.f) {
            c72Var.T(true);
        }
        if (c72Var.q()) {
            W(c72Var, true, 6);
        } else if (c72Var.p()) {
            c72Var.V(true);
        }
    }

    private final String k(c72 c72Var) {
        String strG = g(0);
        c72 c72Var2 = c72Var.z;
        return "Cannot insert " + c72Var + " because it already has a parent or an owner. This tree: " + strG + " Other tree: " + (c72Var2 != null ? c72Var2.g(0) : null);
    }

    public final void A(int i, c72 c72Var) throws IOException {
        if (c72Var.z != null && c72Var.A != null) {
            cz1.b(k(c72Var));
        }
        c72Var.z = this;
        gp3 gp3Var = this.w;
        ((f13) gp3Var.o).a(i, c72Var);
        ((wc) gp3Var.p).invoke();
        N();
        if (c72Var.n) {
            this.v++;
        }
        F();
        ub3 ub3Var = this.A;
        if (ub3Var != null) {
            c72Var.d(ub3Var);
        }
        if (c72Var.R.l > 0) {
            f72 f72Var = this.R;
            f72Var.d(f72Var.l + 1);
        }
        if (c72Var.Y > 0) {
            b0(this.Y + 1);
        }
    }

    public final void B() {
        if (this.U) {
            w12 w12Var = this.Q;
            f63 f63Var = (iz1) w12Var.d;
            f63 f63Var2 = ((f63) w12Var.e).J;
            this.T = null;
            while (!h12.c(f63Var, f63Var2)) {
                if ((f63Var != null ? f63Var.g0 : null) != null) {
                    this.T = f63Var;
                    break;
                }
                f63Var = f63Var != null ? f63Var.J : null;
            }
            this.U = false;
        }
        f63 f63Var3 = this.T;
        if (f63Var3 != null && f63Var3.g0 == null) {
            throw xa3.l("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (f63Var3 != null) {
            f63Var3.I0();
            return;
        }
        c72 c72VarT = t();
        if (c72VarT != null) {
            c72VarT.B();
            return;
        }
        ub3 ub3Var = this.A;
        if (ub3Var != null) {
            ((ra) ub3Var).invalidate();
        }
    }

    public final void C() {
        w12 w12Var = this.Q;
        f63 f63Var = (f63) w12Var.e;
        iz1 iz1Var = (iz1) w12Var.d;
        while (f63Var != iz1Var) {
            f63Var.getClass();
            w62 w62Var = (w62) f63Var;
            tb3 tb3Var = w62Var.g0;
            if (tb3Var != null) {
                ((vj1) tb3Var).c();
            }
            f63Var = w62Var.I;
        }
        tb3 tb3Var2 = ((iz1) w12Var.d).g0;
        if (tb3Var2 != null) {
            ((vj1) tb3Var2).c();
        }
    }

    public final void D() {
        if (this.n) {
            c72 c72VarT = t();
            if (c72VarT != null) {
                c72VarT.D();
                return;
            }
            return;
        }
        if (this.u != null) {
            U(this, false, 7);
        } else {
            W(this, false, 7);
        }
    }

    public final void E() {
        if (this.F) {
            return;
        }
        if (((b63) this.Q.c).s != null || this.W != null) {
            this.D = true;
            return;
        }
        e94 e94Var = this.E;
        this.F = true;
        jx3 jx3Var = new jx3();
        jx3Var.n = new e94();
        wb3 snapshotObserver = ((ra) h12.L(this)).getSnapshotObserver();
        fa faVar = new fa(10, this, jx3Var);
        snapshotObserver.a.e(this, snapshotObserver.d, faVar);
        this.F = false;
        this.E = (e94) jx3Var.n;
        this.D = false;
        ra raVar = (ra) h12.L(this);
        raVar.getSemanticsOwner().b(this, e94Var);
        raVar.w();
    }

    public final void F() {
        c72 c72Var;
        if (this.v > 0) {
            this.y = true;
        }
        if (!this.n || (c72Var = this.z) == null) {
            return;
        }
        c72Var.F();
    }

    public final boolean G() {
        return this.A != null;
    }

    public final boolean H() {
        return this.R.p.C;
    }

    public final Boolean I() {
        if2 if2Var = this.R.q;
        if (if2Var != null) {
            return Boolean.valueOf(if2Var.C != hf2.p);
        }
        return null;
    }

    public final void J() {
        c72 c72VarT;
        if (this.N == a72.p) {
            f();
        }
        if2 if2Var = this.R.q;
        if2Var.getClass();
        boolean z = true;
        try {
            if2Var.t = true;
            if (!if2Var.x) {
                cz1.b("replace() called on item that was not placed");
            }
            if2Var.L = false;
            if (if2Var.C == hf2.p) {
                z = false;
            }
            if2Var.d0(if2Var.A, if2Var.B);
            if (z && !if2Var.L && (c72VarT = if2Var.s.a.t()) != null) {
                c72VarT.T(false);
            }
        } finally {
            if2Var.t = false;
        }
    }

    public final void K(int i, int i2, int i3) throws IOException {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            gp3 gp3Var = this.w;
            f13 f13Var = (f13) gp3Var.o;
            wc wcVar = (wc) gp3Var.p;
            Object objK = f13Var.k(i5);
            wcVar.invoke();
            ((f13) gp3Var.o).a(i6, (c72) objK);
            wcVar.invoke();
        }
        N();
        F();
        D();
    }

    public final void L(c72 c72Var) {
        if (c72Var.R.l > 0) {
            f72 f72Var = this.R;
            f72Var.d(f72Var.l - 1);
        }
        if (this.A != null) {
            c72Var.h();
        }
        c72Var.z = null;
        if (c72Var.Y > 0) {
            b0(this.Y - 1);
        }
        ((f63) c72Var.Q.e).J = null;
        if (c72Var.n) {
            this.v--;
            f13 f13Var = (f13) c72Var.w.o;
            Object[] objArr = f13Var.n;
            int i = f13Var.p;
            for (int i2 = 0; i2 < i; i2++) {
                ((f63) ((c72) objArr[i2]).Q.e).J = null;
            }
        }
        F();
        N();
    }

    public final void M(f63 f63Var) {
        ub3 ub3Var = this.A;
        yv3 rectManager = ub3Var != null ? ((ra) ub3Var).getRectManager() : null;
        f72 f72Var = this.R;
        boolean z = f72Var.d != y62.r || q() || p();
        if (this.t != -4 && rectManager != null) {
            if (f63Var == ((f63) this.Q.e)) {
                this.s = true;
                if (!z) {
                    rectManager.h(this);
                }
            } else {
                this.r = true;
                f13 f13VarY = y();
                Object[] objArr = f13VarY.n;
                int i = f13VarY.p;
                for (int i2 = 0; i2 < i; i2++) {
                    c72 c72Var = (c72) objArr[i2];
                    c72Var.s = true;
                    if (!z) {
                        rectManager.h(c72Var);
                    }
                }
                if (this.t != -4) {
                    rectManager.f = true;
                    int iE = rectManager.e(this);
                    long[] jArr = (long[]) rectManager.c.p;
                    int i3 = iE + 2;
                    long j = jArr[i3];
                    jArr[i3] = j | (((j >> 63) & 1) << 60);
                }
                rectManager.k();
            }
        }
        f72Var.p.e0();
    }

    public final void N() {
        if (!this.n) {
            this.H = true;
            return;
        }
        c72 c72VarT = t();
        if (c72VarT != null) {
            c72VarT.N();
        }
    }

    public final boolean O(nc0 nc0Var) {
        if (nc0Var == null) {
            return false;
        }
        if (this.N == a72.p) {
            e();
        }
        return this.R.p.d0(nc0Var.a);
    }

    public final void Q() throws IOException {
        gp3 gp3Var = this.w;
        int i = ((f13) gp3Var.o).p;
        while (true) {
            i--;
            f13 f13Var = (f13) gp3Var.o;
            if (-1 >= i) {
                f13Var.g();
                ((wc) gp3Var.p).invoke();
                return;
            }
            L((c72) f13Var.n[i]);
        }
    }

    public final void R(int i, int i2) throws IOException {
        if (i2 < 0) {
            cz1.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            gp3 gp3Var = this.w;
            L((c72) ((f13) gp3Var.o).n[i3]);
            Object objK = ((f13) gp3Var.o).k(i3);
            ((wc) gp3Var.p).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void S() {
        c72 c72VarT;
        if (this.N == a72.p) {
            f();
        }
        ti2 ti2Var = this.R.p;
        f72 f72Var = ti2Var.s;
        try {
            ti2Var.t = true;
            if (!ti2Var.x) {
                cz1.b("replace called on unplaced item");
            }
            boolean z = ti2Var.C;
            ti2Var.c0(ti2Var.z, ti2Var.B, ti2Var.A);
            if (z && !ti2Var.P && (c72VarT = f72Var.a.t()) != null) {
                c72VarT.V(false);
            }
            ti2Var.t = false;
        } catch (Throwable th) {
            try {
                f72Var.a.Z(th);
                throw null;
            } catch (Throwable th2) {
                ti2Var.t = false;
                throw th2;
            }
        }
    }

    public final void T(boolean z) {
        ub3 ub3Var;
        if (this.n || (ub3Var = this.A) == null) {
            return;
        }
        ((ra) ub3Var).v(this, true, z);
    }

    public final void V(boolean z) {
        ub3 ub3Var;
        if (this.n || (ub3Var = this.A) == null) {
            return;
        }
        ((ra) ub3Var).v(this, false, z);
    }

    public final void Y() {
        f13 f13VarY = y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var = (c72) objArr[i2];
            a72 a72Var = c72Var.O;
            c72Var.N = a72Var;
            if (a72Var != a72.p) {
                c72Var.Y();
            }
        }
    }

    public final void Z(Throwable th) {
        c90 c90Var = this.M;
        wl4 wl4Var = y80.a;
        mf3 mf3Var = (mf3) c90Var;
        mf3Var.getClass();
        x80 x80Var = (x80) vr1.C(mf3Var, wl4Var);
        if (x80Var == null) {
            throw th;
        }
        si0.T(th, new fa(4, x80Var, this));
        throw th;
    }

    @Override // defpackage.u70
    public final void a() {
        o72 o72Var = this.S;
        if (o72Var != null) {
            o72Var.a();
        }
        w12 w12Var = this.Q;
        f63 f63Var = ((iz1) w12Var.d).I;
        for (f63 f63Var2 = (f63) w12Var.e; !h12.c(f63Var2, f63Var) && f63Var2 != null; f63Var2 = f63Var2.I) {
            f63Var2.O0();
        }
    }

    public final void a0(oo0 oo0Var) {
        if (h12.c(this.J, oo0Var)) {
            return;
        }
        this.J = oo0Var;
        D();
        c72 c72VarT = t();
        if (c72VarT != null) {
            c72VarT.B();
        } else {
            ub3 ub3Var = this.A;
            if (ub3Var != null) {
                ((ra) ub3Var).invalidate();
            }
        }
        C();
        for (cx2 cx2Var = (cx2) this.Q.g; cx2Var != null; cx2Var = cx2Var.s) {
            cx2Var.b();
        }
    }

    @Override // defpackage.u70
    public final void b() {
        y9 autofillManager;
        o72 o72Var = this.S;
        if (o72Var != null) {
            o72Var.i(true);
        }
        this.Z = true;
        cx2 cx2Var = (sq4) this.Q.f;
        for (cx2 cx2Var2 = cx2Var; cx2Var2 != null; cx2Var2 = cx2Var2.r) {
            if (cx2Var2.A) {
                cx2Var2.l0();
            }
        }
        for (cx2 cx2Var3 = cx2Var; cx2Var3 != null; cx2Var3 = cx2Var3.r) {
            if (cx2Var3.A) {
                cx2Var3.n0();
            }
        }
        while (cx2Var != null) {
            if (cx2Var.A) {
                cx2Var.h0();
            }
            cx2Var = cx2Var.r;
        }
        if (G()) {
            this.E = null;
            this.D = false;
        }
        ub3 ub3Var = this.A;
        if (ub3Var != null) {
            ra raVar = (ra) ub3Var;
            if (ra.d() && (autofillManager = raVar.getAutofillManager()) != null && autofillManager.t.f(this.o)) {
                autofillManager.n.p(autofillManager.p, this.o, false);
            }
        }
    }

    public final void b0(int i) {
        c72 c72VarT;
        c72 c72VarT2;
        int i2 = this.Y;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (c72VarT2 = t()) != null) {
                c72VarT2.b0(c72VarT2.Y + 1);
            }
            if (i == 0 && this.Y > 0 && (c72VarT = t()) != null) {
                c72VarT.b0(c72VarT.Y - 1);
            }
            this.Y = i;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6031. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(defpackage.dx2 r24) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c72.c(dx2):void");
    }

    public final void c0(c72 c72Var) {
        if (h12.c(c72Var, this.u)) {
            return;
        }
        this.u = c72Var;
        f72 f72Var = this.R;
        if (c72Var != null) {
            if (f72Var.q == null) {
                f72Var.q = new if2(f72Var);
            }
            w12 w12Var = this.Q;
            f63 f63Var = ((iz1) w12Var.d).I;
            for (f63 f63Var2 = (f63) w12Var.e; !h12.c(f63Var2, f63Var) && f63Var2 != null; f63Var2 = f63Var2.I) {
                f63Var2.v0();
            }
        } else {
            f72Var.q = null;
            f72Var.f = false;
            f72Var.e = false;
        }
        D();
    }

    public final void d(ub3 ub3Var) {
        c72 c72Var;
        y9 autofillManager;
        e94 e94VarV;
        if (this.A != null) {
            cz1.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        c72 c72Var2 = this.z;
        if (c72Var2 != null && !h12.c(c72Var2.A, ub3Var)) {
            c72 c72VarT = t();
            ub3 ub3Var2 = c72VarT != null ? c72VarT.A : null;
            String strG = g(0);
            c72 c72Var3 = this.z;
            cz1.b("Attaching to a different owner(" + ub3Var + ") than the parent's owner(" + ub3Var2 + "). This tree: " + strG + " Parent tree: " + (c72Var3 != null ? c72Var3.g(0) : null));
        }
        c72 c72VarT2 = t();
        f72 f72Var = this.R;
        if (c72VarT2 == null) {
            f72Var.p.C = true;
            ((ra) ub3Var).getRectManager().h(this);
            if2 if2Var = f72Var.q;
            if (if2Var != null) {
                if2Var.C = hf2.n;
            }
        }
        w12 w12Var = this.Q;
        ((f63) w12Var.e).J = c72VarT2 != null ? (iz1) c72VarT2.Q.d : null;
        this.A = ub3Var;
        this.B = (c72VarT2 != null ? c72VarT2.B : -1) + 1;
        dx2 dx2Var = this.W;
        if (dx2Var != null) {
            c(dx2Var);
        }
        this.W = null;
        ((ra) ub3Var).getLayoutNodes().i(this.o, this);
        c72 c72Var4 = this.z;
        if (c72Var4 == null || (c72Var = c72Var4.u) == null) {
            c72Var = this.u;
        }
        c0(c72Var);
        if (this.u == null && w12Var.d(512)) {
            c0(this);
        }
        if (!this.Z) {
            for (cx2 cx2Var = (cx2) w12Var.g; cx2Var != null; cx2Var = cx2Var.s) {
                cx2Var.g0();
            }
        }
        f13 f13Var = (f13) this.w.o;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            ((c72) objArr[i2]).d(ub3Var);
        }
        if (!this.Z) {
            w12Var.e();
        }
        D();
        if (c72VarT2 != null) {
            c72VarT2.D();
        }
        f72Var.j();
        if (!this.Z && w12Var.d(8)) {
            E();
        }
        ra raVar = (ra) ub3Var;
        if (!ra.d() || (autofillManager = raVar.getAutofillManager()) == null || (e94VarV = v()) == null || !e94VarV.n.b(n94.q)) {
            return;
        }
        autofillManager.t.a(this.o);
        autofillManager.n.p(autofillManager.p, this.o, true);
    }

    public final void d0(dx2 dx2Var) {
        if (this.n && this.V != ax2.a) {
            cz1.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.Z) {
            cz1.a("modifier is updated when deactivated");
        }
        if (!G()) {
            this.W = dx2Var;
            return;
        }
        c(dx2Var);
        if (this.D) {
            E();
        }
    }

    public final void e() {
        this.O = this.N;
        a72 a72Var = a72.p;
        this.N = a72Var;
        f13 f13VarY = y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var = (c72) objArr[i2];
            if (c72Var.N != a72Var) {
                c72Var.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [cx2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [f13] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [f13] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void e0(m65 m65Var) {
        if (h12.c(this.L, m65Var)) {
            return;
        }
        this.L = m65Var;
        cx2 cx2Var = (cx2) this.Q.g;
        if ((cx2Var.q & 16) != 0) {
            while (cx2Var != null) {
                if ((cx2Var.p & 16) != 0) {
                    ?? C = cx2Var;
                    ?? f13Var = 0;
                    while (C != 0) {
                        if (C instanceof rn3) {
                            ((rn3) C).Z();
                        } else if ((C.p & 16) != 0 && (C instanceof fo0)) {
                            cx2 cx2Var2 = ((fo0) C).C;
                            int i = 0;
                            C = C;
                            f13Var = f13Var;
                            while (cx2Var2 != null) {
                                if ((cx2Var2.p & 16) != 0) {
                                    i++;
                                    if (i == 1) {
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
                                }
                                cx2Var2 = cx2Var2.s;
                                C = C;
                                f13Var = f13Var;
                            }
                            if (i == 1) {
                            }
                        }
                        C = j51.c(f13Var);
                    }
                }
                if ((cx2Var.q & 16) == 0) {
                    return;
                } else {
                    cx2Var = cx2Var.s;
                }
            }
        }
    }

    public final void f() {
        this.O = this.N;
        this.N = a72.p;
        f13 f13VarY = y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var = (c72) objArr[i2];
            if (c72Var.N == a72.o) {
                c72Var.f();
            }
        }
    }

    public final void f0() {
        if (this.v <= 0 || !this.y) {
            return;
        }
        this.y = false;
        f13 f13Var = this.x;
        if (f13Var == null) {
            f13Var = new f13(new c72[16]);
            this.x = f13Var;
        }
        f13Var.g();
        f13 f13Var2 = (f13) this.w.o;
        Object[] objArr = f13Var2.n;
        int i = f13Var2.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var = (c72) objArr[i2];
            if (c72Var.n) {
                f13Var.c(f13Var.p, c72Var.y());
            } else {
                f13Var.b(c72Var);
            }
        }
        f72 f72Var = this.R;
        f72Var.p.J = true;
        if2 if2Var = f72Var.q;
        if (if2Var != null) {
            if2Var.F = true;
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        f13 f13VarY = y();
        Object[] objArr = f13VarY.n;
        int i3 = f13VarY.p;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((c72) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void h() {
        y9 autofillManager;
        d72 d72Var;
        ub3 ub3Var = this.A;
        if (ub3Var == null) {
            c72 c72VarT = t();
            cz1.c("Cannot detach node that is already detached!  Tree: " + (c72VarT != null ? c72VarT.g(0) : null));
            er1.a();
            return;
        }
        c72 c72VarT2 = t();
        f72 f72Var = this.R;
        if (c72VarT2 != null) {
            c72VarT2.B();
            c72VarT2.D();
            ti2 ti2Var = f72Var.p;
            a72 a72Var = a72.p;
            ti2Var.y = a72Var;
            if2 if2Var = f72Var.q;
            if (if2Var != null) {
                if2Var.w = a72Var;
            }
        }
        d72 d72Var2 = f72Var.p.H;
        d72Var2.b = true;
        d72Var2.c = false;
        d72Var2.d = false;
        d72Var2.e = false;
        d72Var2.f = null;
        if2 if2Var2 = f72Var.q;
        if (if2Var2 != null && (d72Var = if2Var2.D) != null) {
            d72Var.b = true;
            d72Var.c = false;
            d72Var.d = false;
            d72Var.e = false;
            d72Var.f = null;
        }
        w12 w12Var = this.Q;
        cx2 cx2Var = (sq4) w12Var.f;
        f63 f63Var = ((iz1) w12Var.d).I;
        for (f63 f63Var2 = (f63) w12Var.e; !h12.c(f63Var2, f63Var) && f63Var2 != null; f63Var2 = f63Var2.I) {
            f63Var2.U0();
            if (f63Var2.H.H()) {
                f63Var2.P0();
            }
        }
        for (cx2 cx2Var2 = cx2Var; cx2Var2 != null; cx2Var2 = cx2Var2.r) {
            if (cx2Var2.A) {
                cx2Var2.n0();
            }
        }
        this.C = true;
        f13 f13Var = (f13) this.w.o;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            ((c72) objArr[i2]).h();
        }
        this.C = false;
        while (cx2Var != null) {
            if (cx2Var.A) {
                cx2Var.h0();
            }
            cx2Var = cx2Var.r;
        }
        ra raVar = (ra) ub3Var;
        raVar.getLayoutNodes().g(this.o);
        ri2 ri2Var = raVar.f0;
        i61 i61Var = ri2Var.b;
        ((d34) i61Var.o).H(this);
        ((d34) i61Var.p).H(this);
        ((d34) i61Var.q).H(this);
        ((f13) ri2Var.e.n).j(this);
        raVar.W = true;
        if (ra.d() && (autofillManager = raVar.getAutofillManager()) != null && autofillManager.t.f(this.o)) {
            autofillManager.n.p(autofillManager.p, this.o, false);
        }
        raVar.getRectManager().i(this);
        this.A = null;
        c0(null);
        this.B = 0;
        ti2 ti2Var2 = f72Var.p;
        ti2Var2.v = Integer.MAX_VALUE;
        ti2Var2.u = Integer.MAX_VALUE;
        ti2Var2.C = false;
        if2 if2Var3 = f72Var.q;
        if (if2Var3 != null) {
            if2Var3.v = Integer.MAX_VALUE;
            if2Var3.u = Integer.MAX_VALUE;
            if2Var3.C = hf2.p;
        }
        if (w12Var.d(8)) {
            e94 e94Var = this.E;
            this.E = null;
            this.D = false;
            raVar.getSemanticsOwner().b(this, e94Var);
            raVar.w();
        }
    }

    public final void i(jz jzVar, sj1 sj1Var) {
        try {
            ((f63) this.Q.e).t0(jzVar, sj1Var);
        } catch (Throwable th) {
            Z(th);
            throw null;
        }
    }

    @Override // defpackage.vb3
    public final boolean j() {
        return G();
    }

    public final void l() {
        if (this.u != null) {
            U(this, false, 5);
        } else {
            W(this, false, 5);
        }
        ti2 ti2Var = this.R.p;
        nc0 nc0Var = ti2Var.w ? new nc0(ti2Var.q) : null;
        ub3 ub3Var = this.A;
        if (nc0Var != null) {
            if (ub3Var != null) {
                ((ra) ub3Var).r(this, nc0Var.a);
            }
        } else if (ub3Var != null) {
            ((ra) ub3Var).q(true);
        }
    }

    public final List m() {
        if2 if2Var = this.R.q;
        if2Var.getClass();
        f13 f13Var = if2Var.E;
        f72 f72Var = if2Var.s;
        f72Var.a.n();
        if (!if2Var.F) {
            return f13Var.f();
        }
        c72 c72Var = f72Var.a;
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            c72 c72Var2 = (c72) objArr[i2];
            if (f13Var.p <= i2) {
                if2 if2Var2 = c72Var2.R.q;
                if2Var2.getClass();
                f13Var.b(if2Var2);
            } else {
                if2 if2Var3 = c72Var2.R.q;
                if2Var3.getClass();
                Object[] objArr2 = f13Var.n;
                Object obj = objArr2[i2];
                objArr2[i2] = if2Var3;
            }
        }
        f13Var.l(((c13) c72Var.n()).n.p, f13Var.p);
        if2Var.F = false;
        return f13Var.f();
    }

    public final List n() {
        return y().f();
    }

    public final List o() {
        return ((f13) this.w.o).f();
    }

    public final boolean p() {
        return this.R.p.F;
    }

    public final boolean q() {
        return this.R.p.E;
    }

    public final a72 r() {
        return this.R.p.y;
    }

    public final a72 s() {
        a72 a72Var;
        if2 if2Var = this.R.q;
        return (if2Var == null || (a72Var = if2Var.w) == null) ? a72.p : a72Var;
    }

    public final c72 t() {
        c72 c72Var = this.z;
        while (c72Var != null && c72Var.n) {
            c72Var = c72Var.z;
        }
        return c72Var;
    }

    public final String toString() {
        return xl.L(this) + " children: " + ((c13) n()).n.p + " measurePolicy: " + this.I + " deactivated: " + this.Z + " isVirtual: " + this.n + " isPlaced: " + H();
    }

    public final int u() {
        return this.R.p.v;
    }

    public final e94 v() {
        if (G() && !this.Z && this.Q.d(8)) {
            return this.E;
        }
        return null;
    }

    public final float w() {
        return this.R.p.O;
    }

    public final f13 x() {
        boolean z = this.H;
        f13 f13Var = this.G;
        if (z) {
            f13Var.g();
            f13Var.c(f13Var.p, y());
            Arrays.sort(f13Var.n, 0, f13Var.p, d0);
            this.H = false;
        }
        return f13Var;
    }

    public final f13 y() {
        f0();
        if (this.v == 0) {
            return (f13) this.w.o;
        }
        f13 f13Var = this.x;
        f13Var.getClass();
        return f13Var;
    }

    public final void z(long j, fm1 fm1Var, int i, boolean z) {
        w12 w12Var = this.Q;
        f63 f63Var = (f63) w12Var.e;
        k52 k52Var = f63.h0;
        ((f63) w12Var.e).G0(f63.l0, f63Var.x0(j), fm1Var, i, z);
    }

    public c72(int i) {
        this(f94.a.addAndGet(1), (i & 1) == 0);
    }
}
