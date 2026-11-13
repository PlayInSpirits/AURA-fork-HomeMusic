package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ad3
implements a74 {
    public final b13 A;
    public final b13 B;
    public final zd3 C;
    public final zd3 D;
    public final zd3 E;
    public final zd3 F;
    public boolean a;
    public qc3 b;
    public final zd3 c;
    public final nq d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final ml3 k;
    public final boolean l;
    public final zd3 m;
    public oo0 n;
    public int o;
    public final rm2 p;
    public final wd3 q;
    public final wd3 r;
    public final dp0 s;
    public final q82 t;
    public final fc3 u;
    public final hg3 v;
    public final io w;
    public final zd3 x;
    public final yc3 y;
    public final n82 z;

    public ad3(int n16, float f16) {
        Object object;
        double d16 = f16;
        if (!(-0.5 <= d16) || !(d16 <= 0.5)) {
            object = new StringBuilder("currentPageOffsetFraction ");
            ((StringBuilder)object).append(f16);
            ((StringBuilder)object).append(" is not within the range -0.5 to 0.5");
            fz1.a(((StringBuilder)object).toString());
        }
        this.c = uc5.B(new g83(0L));
        this.d = new nq(n16, f16, this);
        this.e = n16;
        this.g = Long.MAX_VALUE;
        this.k = new ml3(new uc3(this, 0));
        this.l = true;
        Object object2 = ed3.b;
        object = rv2.s;
        this.m = new zd3(object2, (rv2)object);
        this.n = ed3.a;
        this.p = new rm2(4);
        this.q = new wd3(-1);
        this.r = new wd3(n16);
        object2 = rv2.D;
        z05 z052 = ph4.a;
        new AtomicInteger(0);
        new cp0(jh4.j().g());
        this.s = new dp0(new vc3(this, 0), (rv2)object2);
        this.t = object2 = new q82(new uc3(this, 1));
        this.u = new fc3(new om1(15, this), (q82)object2, new vc3(this, 1));
        this.v = new hg3(25);
        this.w = new io();
        this.x = uc5.B(null);
        this.y = new yc3(this);
        qc0.b(0, 0, 15);
        this.z = new n82();
        object2 = j15.a;
        this.A = new zd3(object2, (rv2)object);
        this.B = new zd3(object2, (rv2)object);
        object = Boolean.FALSE;
        this.C = uc5.B(object);
        this.D = uc5.B(object);
        this.E = uc5.B(object);
        this.F = uc5.B(object);
    }

    public static /* synthetic */ Object g(lm0 lm02, int n16, yy4 wd6, ep4 ep42, int n17) {
        if ((n17 & 4) != 0) {
            wd6 = au0.S(7);
        }
        return lm02.f(n16, wd6, ep42);
    }

    /*
     * Unable to fully structure code
     */
    public static Object s(ad3 var0, h13 var1_1, wf1 var2_2, wd0 var3_3) {
        block9: {
            block11: {
                block10: {
                    block6: {
                        block7: {
                            block8: {
                                if (!(var3_3 instanceof zc3)) ** GOTO lbl-1000
                                var5_4 = (zc3)var3_3;
                                var4_5 = var5_4.s;
                                if ((var4_5 & -2147483648) != 0) {
                                    var5_4.s = var4_5 + -2147483648;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var5_4 = new zc3((ad3)var0, (wd0)var3_3);
                                }
                                var7_6 = var5_4.q;
                                var4_5 = var5_4.s;
                                var6_7 = xe0.n;
                                if (var4_5 == 0) break block6;
                                if (var4_5 == 1) break block7;
                                if (var4_5 != 2) break block8;
                                var3_3 = var5_4.n;
                                kb4.X(var7_6);
                                break block9;
                            }
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        var2_2 = (wf1)var5_4.p;
                        var1_1 = var5_4.o;
                        var3_3 = var5_4.n;
                        kb4.X(var7_6);
                        break block10;
                    }
                    kb4.X(var7_6);
                    var5_4.n = var0;
                    var5_4.o = var1_1;
                    var5_4.p = (ep4)var2_2;
                    var5_4.s = 1;
                    var3_3 = var0;
                    if (var0.i(var5_4) == var6_7) break block11;
                }
                if (!var3_3.k.a()) {
                    var4_5 = var3_3.k();
                    var3_3.r.h(var4_5);
                }
                var0 = var3_3.k;
                var5_4.n = var3_3;
                var5_4.o = null;
                var5_4.p = null;
                var5_4.s = 2;
                if (var0.e(var1_1, var2_2, var5_4) != var6_7) break block9;
            }
            return var6_7;
        }
        var3_3.q.h(-1);
        return j15.a;
    }

    @Override
    public final boolean a() {
        return this.k.a();
    }

    @Override
    public final boolean b() {
        return (Boolean)this.D.getValue();
    }

    @Override
    public final boolean c() {
        return (Boolean)this.C.getValue();
    }

    @Override
    public final float d(float f16) {
        return this.k.d(f16);
    }

    @Override
    public final Object e(h13 h132, wf1 wf12, wd0 wd02) {
        return ad3.s(this, h132, wf12, wd02);
    }

    /*
     * Unable to fully structure code
     */
    public final Object f(int var1_1, wd var2_2, wd0 var3_3) {
        block9: {
            block10: {
                block8: {
                    block7: {
                        if (!(var3_3 instanceof wc3)) ** GOTO lbl-1000
                        var5_4 = (wc3)var3_3;
                        var4_5 = var5_4.r;
                        if ((var4_5 & -2147483648) != 0) {
                            var5_4.r = var4_5 + -2147483648;
                            var3_3 = var5_4;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_3 = new wc3(this, var3_3);
                        }
                        var7_6 = var3_3.p;
                        var4_5 = var3_3.r;
                        var5_4 = j15.a;
                        var6_7 = xe0.n;
                        if (var4_5 == 0) break block7;
                        if (var4_5 != 1) {
                            if (var4_5 == 2) {
                                kb4.X(var7_6);
                                return var5_4;
                            }
                            kf2.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        var1_1 = var3_3.n;
                        var2_2 = var3_3.o;
                        kb4.X(var7_6);
                        break block8;
                    }
                    kb4.X(var7_6);
                    if (var1_1 == this.k() && this.l() == 0.0f || this.n() == 0) break block9;
                    var3_3.o = var2_2;
                    var3_3.n = var1_1;
                    var3_3.r = 1;
                    if (this.i(var3_3) == var6_7) break block10;
                }
                var2_2 = new xc3(this, this.j(var1_1), (float)this.p() * 0.0f, (wd)var2_2, null);
                var3_3.o = null;
                var3_3.r = 2;
                if (ad3.s(this, h13.n, (wf1)var2_2, var3_3) != var6_7) break block9;
            }
            return var6_7;
        }
        return var5_4;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(qc3 qc32, boolean bl5, boolean bl6) {
        Throwable throwable222222;
        Object object;
        Object object2;
        ch4 ch42;
        block36: {
            long l16;
            int n16;
            block37: {
                block34: {
                    block35: {
                        block29: {
                            boolean bl7;
                            fc3 fc32;
                            float f16;
                            xi2 xi22;
                            int n17;
                            block33: {
                                int n18;
                                qp4 qp42;
                                Object object3;
                                Object object4;
                                block32: {
                                    block31: {
                                        block30: {
                                            object4 = qc32.a;
                                            n17 = qc32.l;
                                            xi22 = qc32.i;
                                            object3 = qc32.j;
                                            f16 = qc32.k;
                                            this.t.d = n16 = object4.size();
                                            this.o = qc32.b + qc32.c;
                                            if (!bl5 && this.a) {
                                                this.b = qc32;
                                                return;
                                            }
                                            if (bl5) {
                                                this.a = true;
                                            }
                                            fc32 = this.u;
                                            bl7 = this.l;
                                            ch42 = null;
                                            object2 = this.d;
                                            if (!bl6) break block30;
                                            ((vd3)((nq)object2).q).h(f16);
                                            break block31;
                                        }
                                        object2.getClass();
                                        object = object3 != null ? ((xi2)object3).d : null;
                                        ((nq)object2).r = object;
                                        if (((nq)object2).n || !object4.isEmpty()) {
                                            ((nq)object2).n = true;
                                            n16 = object3 != null ? ((xi2)object3).a : 0;
                                            ((wd3)((nq)object2).p).h(n16);
                                            object4 = (g82)((nq)object2).s;
                                            if (n16 != ((g82)object4).o) {
                                                ((g82)object4).o = n16;
                                                n16 = n16 / 30 * 30;
                                                object = gb.g0(Math.max(n16 - 100, 0), n16 + 130);
                                                ((g82)object4).n.setValue(object);
                                            }
                                            ((vd3)((nq)object2).q).h(f16);
                                        }
                                        if (!bl7) break block31;
                                        qp42 = fc32.o;
                                        object3 = fc32.e;
                                        qp42.b = qc32;
                                        qp42.c = fc32.n;
                                        object4 = fc32.a;
                                        n16 = fc32.g;
                                        f16 = 0.0f;
                                        if (n16 != -1 && n16 != qp42.h()) {
                                            fc32.l = true;
                                            if (qp42.c()) {
                                                n16 = n18 = fc32.h;
                                                if (n18 < 0) {
                                                    n16 = 0;
                                                }
                                                fc32.h = n16;
                                            }
                                        }
                                        break block32;
                                    }
                                    bl5 = true;
                                    break block33;
                                    n16 = qp42.e().a.isEmpty() ? -1 : qp42.h() - 1;
                                    if (n16 != -1) {
                                        n18 = fc32.i;
                                        if (n18 <= n16) {
                                            n16 = n18;
                                        }
                                        fc32.i = n16;
                                    }
                                    if (fc32.f <= 0.0f) {
                                        fc32.e(qp42.d(), fc32.m - 1);
                                    } else {
                                        fc32.e(0, qp42.b());
                                    }
                                }
                                fc32.m = qp42.h();
                                if (!qp42.c()) {
                                    bl5 = true;
                                    fc32.f();
                                } else {
                                    int n19 = qp42.e().q.size();
                                    int n26 = qp42.e().a.size();
                                    int n27 = qp42.e().r.size();
                                    for (n18 = 0; n18 < n27 + (n26 + n19); ++n18) {
                                        n16 = qp42.e().q.size();
                                        int n28 = qp42.e().a.size();
                                        n16 = n18 < n16 ? ((xi2)qp42.e().q.get((int)n18)).a : (n18 >= n16 && n18 < n16 + n28 ? ((xi2)qp42.e().a.get((int)(n18 - n16))).a : (n18 >= n16 + n28 ? ((xi2)qp42.e().r.get((int)(n18 - n16 - n28))).a : -1));
                                        int n29 = qp42.e().q.size();
                                        n28 = qp42.e().a.size();
                                        object = n18 < n29 ? ((xi2)qp42.e().q.get((int)n18)).d : (n18 >= n29 && n18 < n29 + n28 ? ((xi2)qp42.e().a.get((int)(n18 - n29))).d : (n18 >= n29 + n28 ? ((xi2)qp42.e().r.get((int)(n18 - n29 - n28))).d : zx.c));
                                        n29 = qp42.e().b;
                                        if (n16 == -1) continue;
                                        if (((e02)object3).a(n16)) {
                                            object2 = ((e02)object3).b(n16);
                                            object2.getClass();
                                            n28 = ((zx)object2).b;
                                            object2 = ((e02)object3).b(n16);
                                            object2.getClass();
                                            object2 = ((zx)object2).a;
                                            if (n28 != n29 || !h12.c(object2, object)) {
                                                fc32.l = true;
                                            }
                                        }
                                        if ((object2 = (zx)((e02)object3).b(n16)) != null) {
                                            ((zx)object2).b = n29;
                                            ((zx)object2).a = object;
                                            object = object2;
                                        } else {
                                            object2 = new Object();
                                            ((zx)object2).a = object;
                                            ((zx)object2).b = n29;
                                            object = object2;
                                        }
                                        ((i03)object3).i(n16, object);
                                        fc32.h = Math.min(fc32.h, n16);
                                        fc32.i = Math.max(fc32.i, n16);
                                        object = (List)fc32.b.g(n16);
                                        if (object == null) continue;
                                        n28 = object.size();
                                        for (n16 = 0; n16 < n28; ++n16) {
                                            ((p82)object.get(n16)).cancel();
                                        }
                                    }
                                    if (fc32.l) {
                                        bl5 = fc32.f <= f16;
                                        if (qp42.c()) {
                                            te5.x(qp42.e());
                                            n16 = qp42.e().t != null ? ((ad3)((om1)object4).o).o : 0;
                                            n26 = qp42.b();
                                            n18 = qp42.d();
                                            n27 = qp42.g();
                                            fc32.c(qp42, n26, n18, n16, qp42.f(), n27, 0.0f, bl5);
                                        }
                                        bl5 = true;
                                        fc32.l = false;
                                    } else {
                                        bl5 = true;
                                    }
                                }
                                fc32.g = qp42.h();
                            }
                            this.m.setValue(qc32);
                            bl6 = qc32.m;
                            this.C.setValue(bl6);
                            n16 = xi22 != null ? xi22.a : 0;
                            if (n16 == 0 && n17 == 0) {
                                bl5 = false;
                            }
                            this.D.setValue(bl5);
                            if (xi22 != null) {
                                this.e = xi22.a;
                            }
                            this.f = n17;
                            object2 = ya4.t();
                            object = ch42;
                            if (object2 != null) {
                                object = ((ch4)object2).e();
                            }
                            ch42 = ya4.z((ch4)object2);
                            if (bl7) {
                                if (qc32.h >= this.n() || Math.abs(this.j) <= 0.5f) break block29;
                                f16 = this.j;
                                if (!(this.m().e != hb3.n ? Math.signum(f16) == Math.signum(-Float.intBitsToFloat((int)(this.q() >> 32))) : Math.signum(f16) == Math.signum(-Float.intBitsToFloat((int)(this.q() & 0xFFFFFFFFL)))) && !this.r()) break block29;
                                fc32.d(this.j, qc32);
                            }
                        }
                        ya4.H((ch4)object2, ch42, (if1)object);
                        this.g = ed3.a(qc32, this.n());
                        this.n();
                        if (qc32.e != hb3.o) break block34;
                        break block35;
                        catch (Throwable throwable222222) {}
                        break block36;
                    }
                    l16 = qc32.i() >> 32;
                    break block37;
                }
                l16 = qc32.i() & 0xFFFFFFFFL;
            }
            n16 = (int)l16;
            qc32.n.getClass();
            long l17 = gb.m(0, 0, n16);
            long l18 = this.g;
            l16 = l17;
            if (l17 > l18) {
                l16 = l18;
            }
            this.h = l16;
            return;
        }
        ya4.H((ch4)object2, ch42, (if1)object);
        throw throwable222222;
    }

    public final Object i(wd0 object) {
        Object object2 = this.m.getValue();
        Object object3 = ed3.b;
        j15 j152 = j15.a;
        if (object2 == object3) {
            Object object4 = this.w;
            object2 = object3 = ((io)object4).b;
            if (object3 == null) {
                object3 = new a32(true);
                ((a32)object3).N(null);
                ((io)object4).b = object3;
                ho ho5 = ((io)object4).a;
                object2 = object3;
                if (ho5 != null) {
                    object2 = object3;
                    if (ho5.A) {
                        Object object5;
                        object2 = new o(1, ho5, ho5.C);
                        object4 = j51.O(ho5);
                        int n16 = ((c72)object4).o;
                        yv3 yv32 = ((ra)h12.L((c72)object4)).getRectManager();
                        object4 = yv32.d;
                        object4.getClass();
                        i03 i032 = ((pt4)object4).a;
                        object4 = new ot4((pt4)object4, n16, ho5, (o)object2);
                        object2 = object5 = i032.b(n16);
                        if (object5 == null) {
                            i032.i(n16, object4);
                            object2 = object4;
                        }
                        if ((object2 = (ot4)object2) != object4) {
                            while ((object5 = ((ot4)object2).d) != null) {
                                object2 = object5;
                            }
                            ((ot4)object2).d = object4;
                        }
                        if (yv3.d((c72)(object2 = j51.O(ho5.n)))) {
                            object5 = yv32.c;
                            n16 = yv32.e((c72)object2);
                            object2 = (long[])((ue1)object5).p;
                            object2[n16 += 2] = object2[n16] & 0x6FFFFFFFFFFFFFFFL | 0x9000000000000000L;
                        }
                        yv32.f = true;
                        yv32.k();
                        ho5.B = object4;
                        object2 = object3;
                    }
                }
            }
            if ((object = ((x60)object2).j0((wd0)object)) != (object2 = xe0.n)) {
                object = j152;
            }
            if (object == object2) {
                return object;
            }
        }
        return j152;
    }

    public final int j(int n16) {
        if (this.n() > 0) {
            return gb.m(n16, 0, this.n() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((wd3)this.d.p).g();
    }

    public final float l() {
        return ((vd3)this.d.q).g();
    }

    public final qc3 m() {
        return (qc3)this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((qc3)this.m.getValue()).b;
    }

    public final int p() {
        int n16 = this.o();
        return ((qc3)this.m.getValue()).c + n16;
    }

    public final long q() {
        return ((g83)this.c.getValue()).a;
    }

    public final boolean r() {
        return (int)Float.intBitsToFloat((int)(this.q() >> 32)) == 0 && (int)Float.intBitsToFloat((int)(this.q() & 0xFFFFFFFFL)) == 0;
    }

    public final void t(float f16, int n16, boolean bl5) {
        nq nq5 = this.d;
        Object object = (wd3)nq5.p;
        Object object2 = (vd3)nq5.q;
        if (((wd3)object).g() != n16 || ((vd3)object2).g() != f16) {
            this.u.f();
        }
        ((wd3)nq5.p).h(n16);
        g82 g822 = (g82)nq5.s;
        if (n16 != g822.o) {
            g822.o = n16;
            n16 = n16 / 30 * 30;
            object = gb.g0(Math.max(n16 - 100, 0), n16 + 130);
            g822.n.setValue(object);
        }
        ((vd3)object2).h(f16);
        nq5.r = null;
        if (bl5) {
            object2 = (c72)this.x.getValue();
            if (object2 != null) {
                ((c72)object2).l();
            }
            return;
        }
        this.B.setValue(j15.a);
    }
}

