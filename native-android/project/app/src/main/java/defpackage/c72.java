package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.Arrays;
import java.util.List;

public final class c72
implements u70,
vb3,
e80 {
    public static final c34 a0 = new c34(1);
    public static final e90 b0 = new e90(28);
    public static final x62 c0 = new Object();
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

    public c72(int n16) {
        boolean bl5 = (n16 & 1) == 0;
        this(f94.a.addAndGet(1), bl5);
    }

    public c72(int n16, boolean bl5) {
        a72 a722;
        this.n = bl5;
        this.o = n16;
        this.q = 0x7FFFFFFF7FFFFFFFL;
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
        this.N = a722 = a72.p;
        this.O = a722;
        this.Q = new w12(this);
        this.R = new f72(this);
        this.U = true;
        this.V = ax2.a;
    }

    public static boolean P(c72 c722) {
        Object object = c722.R.p;
        object = ((ti2)object).w ? new nc0(((jg3)object).q) : null;
        return c722.O((nc0)object);
    }

    public static void U(c72 object, boolean bl5, int n16) {
        boolean bl6 = false;
        if ((n16 & 1) != 0) {
            bl5 = false;
        }
        boolean bl7 = (n16 & 2) != 0;
        if ((n16 & 4) != 0) {
            bl6 = true;
        }
        if (((c72)object).u == null) {
            cz1.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Object object2 = ((c72)object).A;
        if (object2 != null && !((c72)object).C && !((c72)object).n) {
            ((ra)object2).u((c72)object, true, bl5, bl7);
            if (bl6) {
                object = ((c72)object).R.q;
                object.getClass();
                object2 = ((if2)object).s;
                object = ((f72)object2).a.t();
                a72 a722 = ((f72)object2).a.N;
                if (object != null && a722 != a72.p) {
                    while (((c72)object).N == a722 && (object2 = ((c72)object).t()) != null) {
                        object = object2;
                    }
                    n16 = a722.ordinal();
                    if (n16 != 0) {
                        if (n16 == 1) {
                            if (((c72)object).u != null) {
                                ((c72)object).T(bl5);
                                return;
                            }
                            ((c72)object).V(bl5);
                            return;
                        }
                        kf2.o("Intrinsics isn't used by the parent");
                        return;
                    }
                    if (((c72)object).u != null) {
                        c72.U((c72)object, bl5, 6);
                        return;
                    }
                    c72.W((c72)object, bl5, 6);
                }
            }
        }
    }

    public static void W(c72 object, boolean bl5, int n16) {
        Object object2;
        if ((n16 & 1) != 0) {
            bl5 = false;
        }
        boolean bl6 = (n16 & 2) != 0;
        n16 = (n16 & 4) != 0 ? 1 : 0;
        if (!((c72)object).C && !((c72)object).n && (object2 = ((c72)object).A) != null) {
            ((ra)object2).u((c72)object, false, bl5, bl6);
            if (n16 != 0) {
                object2 = ((c72)object).R.p.s;
                object = ((f72)object2).a.t();
                a72 a722 = ((f72)object2).a.N;
                if (object != null && a722 != a72.p) {
                    while (((c72)object).N == a722 && (object2 = ((c72)object).t()) != null) {
                        object = object2;
                    }
                    n16 = a722.ordinal();
                    if (n16 != 0) {
                        if (n16 == 1) {
                            ((c72)object).V(bl5);
                            return;
                        }
                        kf2.o("Intrinsics isn't used by the parent");
                        return;
                    }
                    c72.W((c72)object, bl5, 6);
                }
            }
        }
    }

    public static void X(c72 c722) {
        Object object = c722.R.d;
        int n16 = b72.a[object.ordinal()];
        object = c722.R;
        if (n16 == 1) {
            if (((f72)object).e) {
                c72.U(c722, true, 6);
                return;
            }
            if (((f72)object).f) {
                c722.T(true);
            }
            if (c722.q()) {
                c72.W(c722, true, 6);
                return;
            }
            if (c722.p()) {
                c722.V(true);
            }
            return;
        }
        nz2.x((Object)((f72)object).d, "Unexpected state ");
    }

    private final String k(c72 c722) {
        String string = this.g(0);
        Object object = c722.z;
        object = object != null ? ((c72)object).g(0) : null;
        StringBuilder stringBuilder = new StringBuilder("Cannot insert ");
        stringBuilder.append(c722);
        stringBuilder.append(" because it already has a parent or an owner. This tree: ");
        stringBuilder.append(string);
        stringBuilder.append(" Other tree: ");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public final void A(int n16, c72 c722) {
        if (c722.z != null && c722.A != null) {
            cz1.b(this.k(c722));
        }
        c722.z = this;
        Object object = this.w;
        ((f13)((gp3)object).o).a(n16, c722);
        ((wc)((gp3)object).p).invoke();
        this.N();
        if (c722.n) {
            ++this.v;
        }
        this.F();
        object = this.A;
        if (object != null) {
            c722.d((ub3)object);
        }
        if (c722.R.l > 0) {
            object = this.R;
            ((f72)object).d(((f72)object).l + 1);
        }
        if (c722.Y > 0) {
            this.b0(this.Y + 1);
        }
    }

    public final void B() {
        Object object;
        if (this.U) {
            Object object2 = this.Q;
            object = (iz1)((w12)object2).d;
            f63 f632 = ((f63)((w12)object2).e).J;
            this.T = null;
            while (!h12.c(object, f632)) {
                object2 = object != null ? ((f63)object).g0 : null;
                if (object2 != null) {
                    this.T = object;
                    break;
                }
                if (object != null) {
                    object = ((f63)object).J;
                    continue;
                }
                object = null;
            }
            this.U = false;
        }
        if ((object = this.T) != null && ((f63)object).g0 == null) {
            throw xa3.l("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (object != null) {
            ((f63)object).I0();
            return;
        }
        object = this.t();
        if (object != null) {
            ((c72)object).B();
            return;
        }
        object = this.A;
        if (object != null) {
            ((ra)object).invalidate();
        }
    }

    public final void C() {
        w12 w122 = this.Q;
        Object object = (f63)w122.e;
        iz1 iz12 = (iz1)w122.d;
        while (object != iz12) {
            object.getClass();
            w62 w622 = (w62)object;
            object = w622.g0;
            if (object != null) {
                ((vj1)object).c();
            }
            object = w622.I;
        }
        object = ((iz1)w122.d).g0;
        if (object != null) {
            ((vj1)object).c();
        }
    }

    public final void D() {
        if (this.n) {
            c72 c722 = this.t();
            if (c722 != null) {
                c722.D();
            }
            return;
        }
        if (this.u != null) {
            c72.U(this, false, 7);
            return;
        }
        c72.W(this, false, 7);
    }

    public final void E() {
        if (this.F) {
            return;
        }
        if (((b63)this.Q.c).s != null || this.W != null) {
            this.D = true;
            return;
        }
        e94 e942 = this.E;
        this.F = true;
        Object object = new Object();
        ((jx3)object).n = new e94();
        wb3 wb32 = ((ra)h12.L(this)).getSnapshotObserver();
        Object object2 = new fa(10, this, object);
        k52 k522 = wb32.d;
        wb32.a.e(this, k522, (gf1)object2);
        this.F = false;
        this.E = (e94)((jx3)object).n;
        this.D = false;
        object2 = (ra)h12.L(this);
        ((ra)object2).getSemanticsOwner().b(this, e942);
        ((ra)object2).w();
    }

    public final void F() {
        c72 c722;
        if (this.v > 0) {
            this.y = true;
        }
        if (this.n && (c722 = this.z) != null) {
            c722.F();
        }
    }

    public final boolean G() {
        return this.A != null;
    }

    public final boolean H() {
        return this.R.p.C;
    }

    public final Boolean I() {
        if2 if22 = this.R.q;
        if (if22 != null) {
            boolean bl5 = if22.C != hf2.p;
            return bl5;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void J() {
        Throwable throwable2;
        block6: {
            c72 c722;
            boolean bl5;
            if2 if22;
            block5: {
                if (this.N == a72.p) {
                    this.f();
                }
                if22 = this.R.q;
                if22.getClass();
                bl5 = true;
                try {
                    if22.t = true;
                    if (if22.x) break block5;
                    cz1.b("replace() called on item that was not placed");
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            if22.L = false;
            if (if22.C == hf2.p) {
                bl5 = false;
            }
            if22.d0(if22.A, if22.B);
            if (bl5 && !if22.L && (c722 = if22.s.a.t()) != null) {
                c722.T(false);
            }
            if22.t = false;
            return;
        }
        if22.t = false;
        throw throwable2;
    }

    public final void K(int n16, int n17, int n18) {
        if (n16 == n17) {
            return;
        }
        for (int i16 = 0; i16 < n18; ++i16) {
            int n19 = n16 > n17 ? n16 + i16 : n16;
            int n26 = n16 > n17 ? n17 + i16 : n17 + n18 - 2;
            gp3 gp32 = this.w;
            Object object = (f13)gp32.o;
            wc wc6 = (wc)gp32.p;
            object = ((f13)object).k(n19);
            wc6.invoke();
            object = (c72)object;
            ((f13)gp32.o).a(n26, object);
            wc6.invoke();
        }
        this.N();
        this.F();
        this.D();
    }

    public final void L(c72 objectArray) {
        Object object;
        if (objectArray.R.l > 0) {
            object = this.R;
            ((f72)object).d(((f72)object).l - 1);
        }
        if (this.A != null) {
            objectArray.h();
        }
        objectArray.z = null;
        if (objectArray.Y > 0) {
            this.b0(this.Y - 1);
        }
        ((f63)objectArray.Q.e).J = null;
        if (objectArray.n) {
            --this.v;
            object = (f13)objectArray.w.o;
            objectArray = ((f13)object).n;
            int n16 = ((f13)object).p;
            for (int i16 = 0; i16 < n16; ++i16) {
                ((f63)((c72)objectArray[i16]).Q.e).J = null;
            }
        }
        this.F();
        this.N();
    }

    public final void M(f63 objectArray) {
        Object object = this.A;
        object = object != null ? ((ra)object).getRectManager() : null;
        f72 f722 = this.R;
        Object object2 = f722.d;
        y62 y622 = y62.r;
        int n16 = 0;
        int n17 = object2 == y622 && !this.q() && !this.p() ? 0 : 1;
        if (this.t != -4 && object != null) {
            if (objectArray == (f63)this.Q.e) {
                this.s = true;
                if (n17 == 0) {
                    ((yv3)object).h(this);
                }
            } else {
                this.r = true;
                object2 = this.y();
                objectArray = ((f13)object2).n;
                int n18 = ((f13)object2).p;
                while (n16 < n18) {
                    object2 = (c72)objectArray[n16];
                    ((c72)object2).s = true;
                    if (n17 == 0) {
                        ((yv3)object).h((c72)object2);
                    }
                    ++n16;
                }
                if (this.t != -4) {
                    ((yv3)object).f = true;
                    n17 = ((yv3)object).e(this);
                    objectArray = (long[])((yv3)object).c.p;
                    Object object3 = objectArray[n17 += 2];
                    objectArray[n17] = object3 | (object3 >> 63 & 1L) << 60;
                }
                ((yv3)object).k();
            }
        }
        f722.p.e0();
    }

    public final void N() {
        if (this.n) {
            c72 c722 = this.t();
            if (c722 != null) {
                c722.N();
            }
            return;
        }
        this.H = true;
    }

    public final boolean O(nc0 nc02) {
        if (nc02 != null) {
            if (this.N == a72.p) {
                this.e();
            }
            return this.R.p.d0(nc02.a);
        }
        return false;
    }

    public final void Q() {
        f13 f132;
        gp3 gp32 = this.w;
        int n16 = ((f13)gp32.o).p - 1;
        while (true) {
            f132 = (f13)gp32.o;
            if (-1 >= n16) break;
            this.L((c72)f132.n[n16]);
            --n16;
        }
        f132.g();
        ((wc)gp32.p).invoke();
    }

    public final void R(int n16, int n17) {
        Object object;
        if (n17 < 0) {
            object = new StringBuilder("count (");
            ((StringBuilder)object).append(n17);
            ((StringBuilder)object).append(") must be greater than 0");
            cz1.a(((StringBuilder)object).toString());
        }
        n17 = n17 + n16 - 1;
        if (n16 <= n17) {
            while (true) {
                object = this.w;
                this.L((c72)((f13)((gp3)object).o).n[n17]);
                Object object2 = ((f13)((gp3)object).o).k(n17);
                ((wc)((gp3)object).p).invoke();
                object = (c72)object2;
                if (n17 == n16) break;
                --n17;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void S() {
        Throwable throwable2;
        f72 f722;
        block7: {
            c72 c722;
            ti2 ti22;
            block6: {
                if (this.N == a72.p) {
                    this.f();
                }
                ti22 = this.R.p;
                f722 = ti22.s;
                try {
                    ti22.t = true;
                    if (ti22.x) break block6;
                    cz1.b("replace called on unplaced item");
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            boolean bl5 = ti22.C;
            ti22.c0(ti22.z, ti22.B, ti22.A);
            if (bl5 && !ti22.P && (c722 = f722.a.t()) != null) {
                c722.V(false);
            }
            ti22.t = false;
            return;
        }
        try {
            f722.a.Z(throwable2);
            throw null;
        }
        catch (Throwable throwable3) {
            ti22.t = false;
            throw throwable3;
        }
    }

    public final void T(boolean bl5) {
        ub3 ub32;
        if (!this.n && (ub32 = this.A) != null) {
            ((ra)ub32).v(this, true, bl5);
        }
    }

    public final void V(boolean bl5) {
        ub3 ub32;
        if (!this.n && (ub32 = this.A) != null) {
            ((ra)ub32).v(this, false, bl5);
        }
    }

    public final void Y() {
        Object object = this.y();
        Object[] objectArray = ((f13)object).n;
        int n16 = ((f13)object).p;
        for (int i16 = 0; i16 < n16; ++i16) {
            a72 a722;
            object = (c72)objectArray[i16];
            ((c72)object).N = a722 = ((c72)object).O;
            if (a722 == a72.p) continue;
            ((c72)object).Y();
        }
    }

    public final void Z(Throwable throwable) {
        c90 c902 = this.M;
        Object object = y80.a;
        c902 = (mf3)c902;
        c902.getClass();
        object = (x80)vr1.C((mf3)c902, (qr3)object);
        if (object != null) {
            si0.T(throwable, new fa(4, object, this));
        }
        throw throwable;
    }

    @Override
    public final void a() {
        Object object = this.S;
        if (object != null) {
            ((o72)object).a();
        }
        Object object2 = this.Q;
        object = (f63)((w12)object2).e;
        object2 = ((iz1)((w12)object2).d).I;
        while (!h12.c(object, object2) && object != null) {
            ((f63)object).O0();
            object = ((f63)object).I;
        }
    }

    public final void a0(oo0 object) {
        if (!h12.c(this.J, object)) {
            this.J = object;
            this.D();
            object = this.t();
            if (object != null) {
                ((c72)object).B();
            } else {
                object = this.A;
                if (object != null) {
                    ((ra)object).invalidate();
                }
            }
            this.C();
            object = (cx2)this.Q.g;
            while (object != null) {
                object.b();
                object = ((cx2)object).s;
            }
        }
    }

    @Override
    public final void b() {
        Object object = this.S;
        if (object != null) {
            ((o72)object).i(true);
        }
        this.Z = true;
        Object object2 = object = (sq4)this.Q.f;
        while (object2 != null) {
            if (((cx2)object2).A) {
                ((cx2)object2).l0();
            }
            object2 = ((cx2)object2).r;
        }
        Object object3 = object;
        while (true) {
            object2 = object;
            if (object3 == null) break;
            if (((cx2)object3).A) {
                ((cx2)object3).n0();
            }
            object3 = ((cx2)object3).r;
        }
        while (object2 != null) {
            if (((cx2)object2).A) {
                ((cx2)object2).h0();
            }
            object2 = ((cx2)object2).r;
        }
        if (this.G()) {
            this.E = null;
            this.D = false;
        }
        if ((object = this.A) != null) {
            object = (ra)object;
            if (ra.d() && (object = ((ra)object).getAutofillManager()) != null && ((y9)object).t.f(this.o)) {
                ((y9)object).n.p((View)((y9)object).p, this.o, false);
            }
        }
    }

    public final void b0(int n16) {
        int n17 = this.Y;
        if (n17 != n16) {
            c72 c722;
            if (n16 > 0 && n17 == 0 && (c722 = this.t()) != null) {
                c722.b0(c722.Y + 1);
            }
            if (n16 == 0 && this.Y > 0 && (c722 = this.t()) != null) {
                c722.b0(c722.Y - 1);
            }
            this.Y = n16;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void c(dx2 var1_1) {
        var15_2 = this.Q;
        var5_3 = var15_2.d(16);
        var14_4 = (sq4)var15_2.f;
        var4_5 = var15_2.d(1024);
        this.V = var1_1;
        var17_6 = (iz1)var15_2.d;
        var12_7 = (c72)var15_2.b;
        var7_8 = (cx2)var15_2.g;
        var13_9 = (b63)var15_2.c;
        if (var7_8 == var13_9) {
            cz1.b("padChain called on already padded chain");
        }
        var7_8 = (cx2)var15_2.g;
        var7_8.r = var13_9;
        var13_9.s = var7_8;
        var8_10 = (q03)var15_2.h;
        var6_11 = var8_10.b;
        var7_8 = var12_7.t();
        var9_12 = var12_7;
        while (var7_8 != null) {
            var10_13 = var7_8.t();
            var9_12 = var7_8;
            var7_8 = var10_13;
        }
        var16_14 = var9_12.Q;
        var10_13 = var7_8 = (q03)var16_14.i;
        if (var7_8 == null) {
            var16_14.i = var10_13 = new q03();
        }
        var7_8 = (var2_15 = var10_13.b - 1) >= 0 ? (q03)var10_13.k(var2_15) : new q03();
        var11_16 = var9_12 = (q03)var16_14.j;
        if (var9_12 == null) {
            var11_16 = new q03();
        }
        var16_14.j = null;
        var11_16.a(var1_1);
        var9_12 = null;
        var1_1 = var15_2;
        while (var11_16.i()) {
            var15_2 = (dx2)var11_16.k(var11_16.b - 1);
            if (var15_2 instanceof h60) {
                var15_2 = (h60)var15_2;
                var11_16.a(var15_2.b);
                var11_16.a(var15_2.a);
                continue;
            }
            if (var15_2 instanceof bx2) {
                var7_8.a(var15_2);
                continue;
            }
            if (var9_12 == null) {
                var9_12 = new x(26, var7_8);
            }
            var15_2.a((if1)var9_12);
        }
        var2_15 = var7_8.b;
        if (var2_15 != var6_11) ** GOTO lbl-1000
        var9_12 = var13_9.s;
        for (var3_17 = 0; var9_12 != null && var3_17 < var6_11; ++var3_17) {
            var15_2 = (bx2)var8_10.f(var3_17);
            var2_15 = h12.c(var15_2, var17_6 = (bx2)var7_8.f(var3_17)) != false ? 2 : (var15_2.getClass() == var17_6.getClass() ? 1 : 0);
            if (var2_15 != 0) {
                if (var2_15 == 1) {
                    w12.h((bx2)var15_2, (bx2)var17_6, (cx2)var9_12);
                }
                var9_12 = var9_12.s;
                continue;
            }
            var9_12 = var9_12.r;
            break;
        }
        if (var3_17 < var6_11) {
            if (var9_12 != null) {
                var2_15 = var12_7.W != null ? 1 : 0;
                var12_7 = var8_10;
                var1_1.f(var3_17, (q03)var12_7, (q03)var7_8, (cx2)var9_12, (boolean)(var2_15 ^ 1));
                var8_10 = var7_8;
                var7_8 = var12_7;
lbl71:
                // 2 sources

                while (true) {
                    var9_12 = var1_1;
                    var2_15 = 1;
                    ** GOTO lbl122
                    break;
                }
            } else {
                throw xa3.l("structuralUpdate requires a non-null tail");
            }
        }
        ** GOTO lbl103
lbl-1000:
        // 1 sources

        {
            var3_17 = 0;
            var9_12 = var12_7.W;
            if (var9_12 != null && var6_11 == 0) {
                var9_12 = var13_9;
                for (var2_15 = 0; var2_15 < var7_8.b; ++var2_15) {
                    var9_12 = w12.b((bx2)var7_8.f(var2_15), (cx2)var9_12);
                }
                var9_12 = var14_4.r;
                var2_15 = var3_17;
                while (var9_12 != null && var9_12 != var13_9) {
                    var9_12.q = var2_15 |= var9_12.p;
                    var9_12 = var9_12.r;
                }
                var9_12 = var7_8;
                var7_8 = var8_10;
                var8_10 = var9_12;
                ** continue;
            }
            if (var2_15 == 0) {
                var9_12 = var13_9.s;
                for (var2_15 = 0; var9_12 != null && var2_15 < var8_10.b; ++var2_15) {
                    var9_12 = w12.c((cx2)var9_12).s;
                }
                var9_12 = var12_7.t();
                var9_12 = var9_12 != null ? (iz1)var9_12.Q.d : null;
                var17_6.J = var9_12;
                var1_1.e = var17_6;
lbl103:
                // 2 sources

                var9_12 = var1_1;
                var9_12 = var7_8;
                var2_15 = 0;
                var7_8 = var8_10;
                var8_10 = var9_12;
            } else {
                if (var9_12 != null) {
                    var2_15 = 1;
lbl111:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var2_15 = 0;
                ** continue;
                var3_17 = 1;
                var12_7 = var1_1;
                var9_12 = var8_10;
                var12_7.f(0, (q03)var9_12, (q03)var7_8, var13_9, (boolean)(var2_15 ^ 1));
                var2_15 = var3_17;
                var8_10 = var7_8;
                var7_8 = var9_12;
            }
        }
lbl122:
        // 3 sources

        var9_12 = var1_1;
        var9_12.h = var8_10;
        var7_8.d();
        var10_13.a(var7_8);
        var11_16.d();
        var16_14.j = var11_16;
        var1_1 = var13_9.s;
        if (var1_1 == null) {
            var1_1 = var14_4;
        }
        var1_1.r = null;
        var13_9.s = null;
        var13_9.q = -1;
        var13_9.u = null;
        if (var1_1 == var13_9) {
            cz1.b("trimChain did not update the head");
        }
        var9_12.g = var1_1;
        if (var2_15 != 0) {
            var9_12.g();
        }
        var2_15 = (int)var9_12.d(16);
        var3_17 = (int)var9_12.d(1024);
        this.R.j();
        if (this.u == null && var9_12.d(512)) {
            this.c0(this);
        }
        if (var5_3 != var2_15 || var4_5 != var3_17) {
            var1_1 = ((ra)h12.L(this)).getRectManager();
            var1_1.getClass();
            if (this.G() && this.t != -4) {
                var7_8 = var1_1.c;
                var4_5 = var1_1.e(this);
                var1_1 = (long[])var7_8.p;
                var1_1[var4_5 += 2] = var1_1[var4_5] & -6917529027641081857L | (long)var3_17 * 0x2000000000000000L | (long)var2_15 * 0x4000000000000000L;
            }
        }
    }

    public final void c0(c72 vb32) {
        if (!h12.c(vb32, this.u)) {
            this.u = vb32;
            Object object = this.R;
            if (vb32 != null) {
                if (((f72)object).q == null) {
                    ((f72)object).q = new if2((f72)object);
                }
                object = this.Q;
                vb32 = (f63)((w12)object).e;
                object = ((iz1)((w12)object).d).I;
                while (!h12.c(vb32, object) && vb32 != null) {
                    ((f63)vb32).v0();
                    vb32 = ((f63)vb32).I;
                }
            } else {
                ((f72)object).q = null;
                ((f72)object).f = false;
                ((f72)object).e = false;
            }
            this.D();
        }
    }

    public final void d(ub3 object) {
        int n16;
        w12 w122;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        block17: {
            block16: {
                object5 = this.A;
                int n17 = 0;
                if (object5 != null) {
                    object5 = this.g(0);
                    object4 = new StringBuilder("Cannot attach ");
                    object4.append(this);
                    object4.append(" as it already is attached.  Tree: ");
                    object4.append((String)object5);
                    cz1.b(object4.toString());
                }
                object5 = this.z;
                if (object5 != null && !h12.c(((c72)object5).A, object)) {
                    object5 = this.t();
                    object5 = object5 != null ? ((c72)object5).A : null;
                    object3 = this.g(0);
                    object4 = this.z;
                    object4 = object4 != null ? object4.g(0) : null;
                    object2 = new StringBuilder("Attaching to a different owner(");
                    ((StringBuilder)object2).append(object);
                    ((StringBuilder)object2).append(") than the parent's owner(");
                    ((StringBuilder)object2).append(object5);
                    ((StringBuilder)object2).append("). This tree: ");
                    ((StringBuilder)object2).append((String)object3);
                    ((StringBuilder)object2).append(" Parent tree: ");
                    ((StringBuilder)object2).append((String)object4);
                    cz1.b(((StringBuilder)object2).toString());
                }
                object3 = this.t();
                object2 = this.R;
                if (object3 == null) {
                    ((f72)object2).p.C = true;
                    ((ra)object).getRectManager().h(this);
                    object5 = ((f72)object2).q;
                    if (object5 != null) {
                        ((if2)object5).C = hf2.n;
                    }
                }
                w122 = this.Q;
                object4 = (f63)w122.e;
                object5 = object3 != null ? (iz1)((c72)object3).Q.d : null;
                object4.J = object5;
                this.A = object;
                n16 = object3 != null ? ((c72)object3).B : -1;
                this.B = n16 + 1;
                object5 = this.W;
                if (object5 != null) {
                    this.c((dx2)object5);
                }
                this.W = null;
                ((i03)((ra)object).getLayoutNodes()).i(this.o, this);
                object5 = this.z;
                if (object5 == null) break block16;
                object4 = ((c72)object5).u;
                object5 = object4;
                if (object4 != null) break block17;
            }
            object5 = this.u;
        }
        this.c0((c72)object5);
        if (this.u == null && w122.d(512)) {
            this.c0(this);
        }
        if (!this.Z) {
            object5 = (cx2)w122.g;
            while (object5 != null) {
                ((cx2)object5).g0();
                object5 = ((cx2)object5).s;
            }
        }
        object5 = (f13)this.w.o;
        object4 = ((f13)object5).n;
        int n18 = ((f13)object5).p;
        for (n16 = n17; n16 < n18; ++n16) {
            ((c72)object4[n16]).d((ub3)object);
        }
        if (!this.Z) {
            w122.e();
        }
        this.D();
        if (object3 != null) {
            ((c72)object3).D();
        }
        ((f72)object2).j();
        if (!this.Z && w122.d(8)) {
            this.E();
        }
        object = (ra)object;
        if (ra.d() && (object = ((ra)object).getAutofillManager()) != null && (object5 = this.v()) != null && ((e94)object5).n.b(n94.q)) {
            ((y9)object).t.a(this.o);
            ((y9)object).n.p((View)((y9)object).p, this.o, true);
        }
    }

    public final void d0(dx2 dx22) {
        if (this.n && this.V != ax2.a) {
            cz1.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.Z) {
            cz1.a("modifier is updated when deactivated");
        }
        if (this.G()) {
            this.c(dx22);
            if (this.D) {
                this.E();
            }
            return;
        }
        this.W = dx22;
    }

    public final void e() {
        a72 a722;
        this.O = this.N;
        this.N = a722 = a72.p;
        Object object = this.y();
        Object[] objectArray = ((f13)object).n;
        int n16 = ((f13)object).p;
        for (int i16 = 0; i16 < n16; ++i16) {
            object = (c72)objectArray[i16];
            if (((c72)object).N == a722) continue;
            ((c72)object).e();
        }
    }

    public final void e0(m65 object) {
        if (!h12.c(this.L, object)) {
            this.L = object;
            cx2 cx22 = (cx2)this.Q.g;
            if ((cx22.q & 0x10) != 0) {
                while (cx22 != null) {
                    if ((cx22.p & 0x10) != 0) {
                        cx2 cx23 = cx22;
                        object = null;
                        while (cx23 != null) {
                            Object object2;
                            if (cx23 instanceof rn3) {
                                ((rn3)((Object)cx23)).Z();
                                object2 = object;
                            } else {
                                object2 = object;
                                if ((cx23.p & 0x10) != 0) {
                                    object2 = object;
                                    if (cx23 instanceof fo0) {
                                        object2 = ((fo0)cx23).C;
                                        int n16 = 0;
                                        while (object2 != null) {
                                            Object object3 = cx23;
                                            Object object4 = object;
                                            int n17 = n16;
                                            if ((((cx2)object2).p & 0x10) != 0) {
                                                n17 = n16 + 1;
                                                if (n17 == 1) {
                                                    object3 = object2;
                                                    object4 = object;
                                                } else {
                                                    object3 = object;
                                                    if (object == null) {
                                                        object3 = new f13(new cx2[16]);
                                                    }
                                                    object = cx23;
                                                    if (cx23 != null) {
                                                        ((f13)object3).b(cx23);
                                                        object = null;
                                                    }
                                                    ((f13)object3).b(object2);
                                                    object4 = object3;
                                                    object3 = object;
                                                }
                                            }
                                            object2 = ((cx2)object2).s;
                                            cx23 = object3;
                                            object = object4;
                                            n16 = n17;
                                        }
                                        object2 = object;
                                        if (n16 == 1) continue;
                                    }
                                }
                            }
                            cx23 = j51.c((f13)object2);
                            object = object2;
                        }
                    }
                    if ((cx22.q & 0x10) == 0) break;
                    cx22 = cx22.s;
                }
            }
        }
    }

    public final void f() {
        this.O = this.N;
        this.N = a72.p;
        Object object = this.y();
        Object[] objectArray = ((f13)object).n;
        int n16 = ((f13)object).p;
        for (int i16 = 0; i16 < n16; ++i16) {
            object = (c72)objectArray[i16];
            if (((c72)object).N != a72.o) continue;
            ((c72)object).f();
        }
    }

    public final void f0() {
        if (this.v > 0 && this.y) {
            int n16 = 0;
            this.y = false;
            Object[] objectArray = this.x;
            Object object = objectArray;
            if (objectArray == null) {
                object = new f13(new c72[16]);
                this.x = object;
            }
            ((f13)object).g();
            Object object2 = (f13)this.w.o;
            objectArray = ((f13)object2).n;
            int n17 = ((f13)object2).p;
            while (n16 < n17) {
                object2 = (c72)objectArray[n16];
                if (((c72)object2).n) {
                    object2 = ((c72)object2).y();
                    ((f13)object).c(((f13)object).p, (f13)object2);
                } else {
                    ((f13)object).b(object2);
                }
                ++n16;
            }
            object = this.R;
            ((f72)object).p.J = true;
            object = ((f72)object).q;
            if (object != null) {
                ((if2)object).F = true;
            }
        }
    }

    public final String g(int n16) {
        int n17;
        CharSequence charSequence = new StringBuilder();
        for (n17 = 0; n17 < n16; ++n17) {
            ((StringBuilder)charSequence).append("  ");
        }
        ((StringBuilder)charSequence).append("|-");
        ((StringBuilder)charSequence).append(this.toString());
        ((StringBuilder)charSequence).append('\n');
        Object object = this.y();
        Object[] objectArray = ((f13)object).n;
        int n18 = ((f13)object).p;
        for (n17 = 0; n17 < n18; ++n17) {
            ((StringBuilder)charSequence).append(((c72)objectArray[n17]).g(n16 + 1));
        }
        charSequence = ((StringBuilder)charSequence).toString();
        object = charSequence;
        if (n16 == 0) {
            object = ((String)charSequence).substring(0, ((String)charSequence).length() - 1);
        }
        return object;
    }

    public final void h() {
        Object object;
        Object object2 = this.A;
        Object object3 = null;
        if (object2 == null) {
            Object object4 = this.t();
            if (object4 != null) {
                object3 = ((c72)object4).g(0);
            }
            object4 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            ((StringBuilder)object4).append((String)object3);
            cz1.c(((StringBuilder)object4).toString());
            er1.a();
            return;
        }
        object3 = this.t();
        f72 f722 = this.R;
        if (object3 != null) {
            ((c72)object3).B();
            ((c72)object3).D();
            object = f722.p;
            object3 = a72.p;
            ((ti2)object).y = object3;
            object = f722.q;
            if (object != null) {
                ((if2)object).w = object3;
            }
        }
        object3 = f722.p.H;
        ((d72)object3).b = true;
        ((d72)object3).c = false;
        ((d72)object3).d = false;
        ((d72)object3).e = false;
        ((d72)object3).f = null;
        object3 = f722.q;
        if (object3 != null && (object3 = ((if2)object3).D) != null) {
            ((d72)object3).b = true;
            ((d72)object3).c = false;
            ((d72)object3).d = false;
            ((d72)object3).e = false;
            ((d72)object3).f = null;
        }
        w12 w122 = this.Q;
        object = (f63)w122.e;
        object3 = (sq4)w122.f;
        Object object5 = ((iz1)w122.d).I;
        while (!h12.c(object, object5) && object != null) {
            ((f63)object).U0();
            if (((f63)object).H.H()) {
                ((f63)object).P0();
            }
            object = ((f63)object).I;
        }
        object = object3;
        while (object != null) {
            if (((cx2)object).A) {
                ((cx2)object).n0();
            }
            object = ((cx2)object).r;
        }
        this.C = true;
        object5 = (f13)this.w.o;
        object = ((f13)object5).n;
        int n16 = ((f13)object5).p;
        for (int i16 = 0; i16 < n16; ++i16) {
            ((c72)object[i16]).h();
        }
        this.C = false;
        while (object3 != null) {
            if (((cx2)object3).A) {
                ((cx2)object3).h0();
            }
            object3 = ((cx2)object3).r;
        }
        object3 = (ra)object2;
        ((i03)((ra)object3).getLayoutNodes()).g(this.o);
        object = ((ra)object3).f0;
        object2 = ((ri2)object).b;
        ((d34)((i61)object2).o).H(this);
        ((d34)((i61)object2).p).H(this);
        ((d34)((i61)object2).q).H(this);
        ((f13)((ri2)object).e.n).j(this);
        ((ra)object3).W = true;
        if (ra.d() && (object = ((ra)object3).getAutofillManager()) != null && ((y9)object).t.f(this.o)) {
            ((y9)object).n.p((View)((y9)object).p, this.o, false);
        }
        ((ra)object3).getRectManager().i(this);
        this.A = null;
        this.c0(null);
        this.B = 0;
        object = f722.p;
        ((ti2)object).v = Integer.MAX_VALUE;
        ((ti2)object).u = Integer.MAX_VALUE;
        ((ti2)object).C = false;
        object = f722.q;
        if (object != null) {
            ((if2)object).v = Integer.MAX_VALUE;
            ((if2)object).u = Integer.MAX_VALUE;
            ((if2)object).C = hf2.p;
        }
        if (w122.d(8)) {
            object = this.E;
            this.E = null;
            this.D = false;
            ((ra)object3).getSemanticsOwner().b(this, (e94)object);
            ((ra)object3).w();
        }
    }

    public final void i(jz jz5, sj1 sj12) {
        try {
            ((f63)this.Q.e).t0(jz5, sj12);
            return;
        }
        catch (Throwable throwable) {
            this.Z(throwable);
            throw null;
        }
    }

    @Override
    public final boolean j() {
        return this.G();
    }

    public final void l() {
        if (this.u != null) {
            c72.U(this, false, 5);
        } else {
            c72.W(this, false, 5);
        }
        Object object = this.R.p;
        object = ((ti2)object).w ? new nc0(((jg3)object).q) : null;
        ub3 ub32 = this.A;
        if (object != null) {
            if (ub32 != null) {
                long l16 = ((nc0)object).a;
                ((ra)ub32).r(this, l16);
                return;
            }
        } else if (ub32 != null) {
            ((ra)ub32).q(true);
        }
    }

    public final List m() {
        if2 if22 = this.R.q;
        if22.getClass();
        f13 f132 = if22.E;
        Object object = if22.s;
        ((f72)object).a.n();
        if (!if22.F) {
            return f132.f();
        }
        object = ((f72)object).a;
        Object object2 = ((c72)object).y();
        Object[] objectArray = ((f13)object2).n;
        int n16 = ((f13)object2).p;
        for (int i16 = 0; i16 < n16; ++i16) {
            object2 = (c72)objectArray[i16];
            if (f132.p <= i16) {
                object2 = ((c72)object2).R.q;
                object2.getClass();
                f132.b(object2);
                continue;
            }
            object2 = ((c72)object2).R.q;
            object2.getClass();
            Object[] objectArray2 = f132.n;
            Object object3 = objectArray2[i16];
            objectArray2[i16] = object2;
        }
        f132.l(((c13)((c72)object).n()).n.p, f132.p);
        if22.F = false;
        return f132.f();
    }

    public final List n() {
        return this.y().f();
    }

    public final List o() {
        return ((f13)this.w.o).f();
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
        Object object = this.R.q;
        if (object != null && (object = object.w) != null) {
            return object;
        }
        return a72.p;
    }

    public final c72 t() {
        c72 c722 = this.z;
        while (c722 != null && c722.n) {
            c722 = c722.z;
        }
        return c722;
    }

    public final String toString() {
        String string = xl.L(this);
        int n16 = ((c13)this.n()).n.p;
        ui2 ui22 = this.I;
        boolean bl5 = this.Z;
        boolean bl6 = this.H();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" children: ");
        stringBuilder.append(n16);
        stringBuilder.append(" measurePolicy: ");
        stringBuilder.append(ui22);
        stringBuilder.append(" deactivated: ");
        stringBuilder.append(bl5);
        stringBuilder.append(" isVirtual: ");
        stringBuilder.append(this.n);
        stringBuilder.append(" isPlaced: ");
        stringBuilder.append(bl6);
        return stringBuilder.toString();
    }

    public final int u() {
        return this.R.p.v;
    }

    public final e94 v() {
        if (this.G() && !this.Z && this.Q.d(8)) {
            return this.E;
        }
        return null;
    }

    public final float w() {
        return this.R.p.O;
    }

    public final f13 x() {
        boolean bl5 = this.H;
        f13 f132 = this.G;
        if (bl5) {
            f132.g();
            f13 f133 = this.y();
            f132.c(f132.p, f133);
            Arrays.sort(f132.n, 0, f132.p, d0);
            this.H = false;
        }
        return f132;
    }

    public final f13 y() {
        this.f0();
        if (this.v == 0) {
            return (f13)this.w.o;
        }
        f13 f132 = this.x;
        f132.getClass();
        return f132;
    }

    public final void z(long l16, fm1 fm12, int n16, boolean bl5) {
        w12 w122 = this.Q;
        f63 f632 = (f63)w122.e;
        k52 k522 = f63.h0;
        l16 = f632.x0(l16);
        ((f63)w122.e).G0(f63.l0, l16, fm12, n16, bl5);
    }
}

