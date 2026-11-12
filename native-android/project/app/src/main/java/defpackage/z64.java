package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z64 extends fo0 implements j42, g94, rn3, my1, a90, mv0 {
    public hb3 D;
    public k2 E;
    public boolean F;
    public rm2 G;
    public aw H;
    public jv0 I;
    public boolean J;
    public boolean K;
    public su0 L;
    public long M;
    public jh1 N;
    public jh1 O;
    public vu0 P;
    public uu0 Q;
    public tu0 R;
    public ya4 S;
    public rm2 T;
    public e20 U;
    public ly1 V;
    public final na4 W;
    public z X;
    public j2 Y;
    public boolean Z;
    public boolean a0;
    public hy2 b0;
    public hw4 c0;
    public final uk0 d0;
    public final g74 e0;
    public final xk0 f0;
    public final ba1 g0;
    public final gd0 h0;

    public z64(tb tbVar, fv fvVar, y71 y71Var, rm2 rm2Var, hb3 hb3Var, a74 a74Var, boolean z, boolean z2) {
        k2 k2Var = uo.p;
        this.D = hb3Var;
        this.E = k2Var;
        this.F = z;
        this.G = rm2Var;
        this.M = 0L;
        this.W = new na4(10);
        uk0 uk0Var = new uk0(new ui0(new rm2(v64.c)));
        this.d0 = uk0Var;
        g74 g74Var = new g74(a74Var, tbVar, y71Var == null ? uk0Var : y71Var, hb3Var, z2, this.W, this, new x64(this, 0));
        this.e0 = g74Var;
        xk0 xk0Var = new xk0(g74Var, z, 7);
        this.f0 = xk0Var;
        ba1 ba1Var = new ba1(2, null, 10);
        q0(ba1Var);
        this.g0 = ba1Var;
        gd0 gd0Var = new gd0(hb3Var, g74Var, z2, fvVar, new x64(this, 1));
        q0(gd0Var);
        this.h0 = gd0Var;
        q0(new e53(xk0Var, this.W));
        cv cvVar = new cv();
        cvVar.B = gd0Var;
        q0(cvVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t0(z64 z64Var, wd0 wd0Var) throws Throwable {
        ev0 ev0Var;
        zu0 zu0Var;
        if (wd0Var instanceof ev0) {
            ev0Var = (ev0) wd0Var;
            int i = ev0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                ev0Var.p = i - Integer.MIN_VALUE;
            } else {
                ev0Var = new ev0(z64Var, wd0Var);
            }
        } else {
            ev0Var = new ev0(z64Var, wd0Var);
        }
        Object obj = ev0Var.n;
        int i2 = ev0Var.p;
        vd0 vd0Var = null;
        if (i2 == 0) {
            kb4.X(obj);
            jv0 jv0Var = z64Var.I;
            if (jv0Var != null) {
                rm2 rm2Var = z64Var.G;
                if (rm2Var != null) {
                    iv0 iv0Var = new iv0(jv0Var);
                    ev0Var.p = 1;
                    Object objE = rm2Var.e(iv0Var, ev0Var);
                    xe0 xe0Var = xe0.n;
                    if (objE == xe0Var) {
                        return xe0Var;
                    }
                }
            }
            zu0Var = new zu0(false, 0L);
            if (z64Var.A) {
                fu.G(z64Var.W.x(), null, null, new p(zu0Var, z64Var, vd0Var, 16), 3);
            }
            return j15.a;
        }
        if (i2 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kb4.X(obj);
        z64Var.I = null;
        zu0Var = new zu0(false, 0L);
        if (z64Var.A) {
            fu.G(z64Var.W.x(), null, null, new p(zu0Var, z64Var, vd0Var, 16), 3);
        }
        return j15.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u0(z64 z64Var, yu0 yu0Var, wd0 wd0Var) {
        fv0 fv0Var;
        rm2 rm2Var;
        jv0 jv0Var;
        yu0 yu0Var2;
        jv0 jv0Var2;
        if (wd0Var instanceof fv0) {
            fv0Var = (fv0) wd0Var;
            int i = fv0Var.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                fv0Var.r = i - Integer.MIN_VALUE;
            } else {
                fv0Var = new fv0(z64Var, wd0Var);
            }
        } else {
            fv0Var = new fv0(z64Var, wd0Var);
        }
        Object obj = fv0Var.p;
        int i2 = fv0Var.r;
        xe0 xe0Var = xe0.n;
        if (i2 == 0) {
            kb4.X(obj);
            jv0 jv0Var3 = z64Var.I;
            if (jv0Var3 != null && (rm2Var = z64Var.G) != null) {
                iv0 iv0Var = new iv0(jv0Var3);
                fv0Var.n = yu0Var;
                fv0Var.r = 1;
                if (rm2Var.e(iv0Var, fv0Var) != xe0Var) {
                }
                return xe0Var;
            }
            z64Var.I = jv0Var;
            long j = yu0Var.a;
            return j15.a;
        }
        if (i2 == 1) {
            yu0Var = fv0Var.n;
            kb4.X(obj);
        } else {
            if (i2 != 2) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jv0Var2 = fv0Var.o;
            yu0Var2 = fv0Var.n;
            kb4.X(obj);
        }
        jv0Var = jv0Var2;
        yu0Var = yu0Var2;
        z64Var.I = jv0Var;
        long j2 = yu0Var.a;
        return j15.a;
        jv0Var = new jv0();
        rm2 rm2Var2 = z64Var.G;
        if (rm2Var2 != null) {
            fv0Var.n = yu0Var;
            fv0Var.o = jv0Var;
            fv0Var.r = 2;
            if (rm2Var2.e(jv0Var, fv0Var) != xe0Var) {
                yu0Var2 = yu0Var;
                jv0Var2 = jv0Var;
                jv0Var = jv0Var2;
                yu0Var = yu0Var2;
            }
            return xe0Var;
        }
        z64Var.I = jv0Var;
        long j3 = yu0Var.a;
        return j15.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v0(z64 z64Var, zu0 zu0Var, wd0 wd0Var) throws Throwable {
        gv0 gv0Var;
        if (wd0Var instanceof gv0) {
            gv0Var = (gv0) wd0Var;
            int i = gv0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                gv0Var.q = i - Integer.MIN_VALUE;
            } else {
                gv0Var = new gv0(z64Var, wd0Var);
            }
        } else {
            gv0Var = new gv0(z64Var, wd0Var);
        }
        Object obj = gv0Var.o;
        int i2 = gv0Var.q;
        vd0 vd0Var = null;
        if (i2 == 0) {
            kb4.X(obj);
            jv0 jv0Var = z64Var.I;
            if (jv0Var != null) {
                rm2 rm2Var = z64Var.G;
                if (rm2Var != null) {
                    kv0 kv0Var = new kv0(jv0Var);
                    gv0Var.n = zu0Var;
                    gv0Var.q = 1;
                    Object objE = rm2Var.e(kv0Var, gv0Var);
                    xe0 xe0Var = xe0.n;
                    if (objE == xe0Var) {
                        return xe0Var;
                    }
                }
            }
            if (z64Var.A) {
                fu.G(z64Var.W.x(), null, null, new p(zu0Var, z64Var, vd0Var, 16), 3);
            }
            return j15.a;
        }
        if (i2 != 1) {
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zu0Var = gv0Var.n;
        kb4.X(obj);
        z64Var.I = null;
        if (z64Var.A) {
            fu.G(z64Var.W.x(), null, null, new p(zu0Var, z64Var, vd0Var, 16), 3);
        }
        return j15.a;
    }

    public static void z0(z64 z64Var, on3 on3Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        uu0 uu0Var = z64Var.Q;
        if (uu0Var == null) {
            uu0Var = new uu0();
            uu0Var.f = null;
            uu0Var.g = Long.MAX_VALUE;
            uu0Var.h = false;
            z64Var.Q = uu0Var;
        }
        uu0Var.f = on3Var;
        uu0Var.g = j;
        e20 e20Var = z64Var.U;
        hb3 hb3Var = z64Var.D;
        if (e20Var == null) {
            z64Var.U = new e20(hb3Var, 0);
        } else {
            e20Var.p = hb3Var;
            e20Var.o = j2;
        }
        uu0Var.h = false;
        z64Var.S = uu0Var;
    }

    @Override // defpackage.ih1
    public final String A() {
        if (!this.F) {
            return "idle";
        }
        ya4 ya4Var = this.S;
        if (ya4Var instanceof su0) {
            return ((su0) ya4Var).h ? "waiting" : "idle";
        }
        if ((ya4Var instanceof uu0) || (ya4Var instanceof tu0)) {
            return "waiting";
        }
        return ya4Var instanceof vu0 ? "recognized" : "idle";
    }

    public final void A0(av0 av0Var) {
        if ((av0Var instanceof yu0) && !this.J) {
            this.J = true;
            F0();
        }
        B0().d(av0Var);
    }

    public final y00 B0() {
        aw awVar = this.H;
        if (awVar != null) {
            return awVar;
        }
        kf2.n("Events channel not initialized.");
        return null;
    }

    public final rm2 C0() {
        rm2 rm2Var = this.T;
        if (rm2Var != null) {
            return rm2Var;
        }
        kf2.n("Velocity Tracker not initialized.");
        return null;
    }

    public final void D0(on3 on3Var, long j) {
        this.M = g83.e(this.M, j);
        xl.e(C0(), on3Var);
        B0().d(new xu0(false, j));
    }

    public final void E0(on3 on3Var, on3 on3Var2, long j) {
        if (this.T == null) {
            this.T = new rm2(28);
        }
        xl.e(C0(), on3Var);
        long jD = g83.d(on3Var2.c, j);
        k2 k2Var = this.E;
        int i = on3Var.i;
        k2Var.getClass();
        if (i == 2) {
            return;
        }
        if (!this.J) {
            if (this.H == null) {
                this.H = su3.a(Integer.MAX_VALUE, 6, null);
            }
            F0();
        }
        B0().d(new yu0(jD));
    }

    @Override // defpackage.mv0
    public final hb3 F() {
        return this.D;
    }

    public final void F0() {
        this.J = true;
        if (this.H == null) {
            this.H = su3.a(Integer.MAX_VALUE, 6, null);
        }
        fu.G(e0(), null, null, new hv0(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    @Override // defpackage.my1
    public final void G(ue1 ue1Var, ln3 ln3Var) {
        Object obj;
        float f;
        Object obj2;
        char c;
        float fIntBitsToFloat;
        boolean z;
        ln3 ln3Var2;
        Object obj3;
        Object obj4;
        Object obj5;
        fy1 fy1Var;
        int i = ue1Var.o;
        ArrayList arrayList = (ArrayList) ue1Var.p;
        if (this.F) {
            if (this.V == null) {
                this.V = new ly1(this);
            }
            if (this.O == null) {
                ly1 ly1Var = this.V;
                ly1Var.getClass();
                jh1 jh1Var = new jh1(ly1Var);
                q0(jh1Var);
                this.O = jh1Var;
            }
            ly1 ly1Var2 = this.V;
            if (ly1Var2 != null) {
                z64 z64Var = ly1Var2.n;
                if (ly1Var2.s == null) {
                    gy1 gy1Var = ly1Var2.o;
                    if (gy1Var == null) {
                        gy1Var = new gy1();
                        gy1Var.j = fy1.p;
                        gy1Var.k = false;
                        gy1Var.l = false;
                        ly1Var2.o = gy1Var;
                    }
                    ly1Var2.s = gy1Var;
                }
                wr1 wr1Var = ly1Var2.s;
                if (wr1Var == null) {
                    kf2.n("currentDragState should not be null");
                    return;
                }
                boolean z2 = wr1Var instanceof gy1;
                ln3 ln3Var3 = ln3.n;
                ln3 ln3Var4 = ln3.o;
                if (z2) {
                    gy1 gy1Var2 = (gy1) wr1Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!zz1.h((ey1) arrayList.get(i2))) {
                            return;
                        }
                    }
                    ey1 ey1Var = (ey1) q40.w0(arrayList);
                    int i3 = ky1.a[gy1Var2.j.ordinal()];
                    fy1 fy1Var2 = fy1.o;
                    fy1 fy1Var3 = fy1.n;
                    if (i3 == 1) {
                        g74 g74Var = z64Var.e0;
                        if (g74Var.a.a()) {
                            fy1Var = fy1Var2;
                        } else {
                            tb tbVar = g74Var.b;
                            if (tbVar != null ? tbVar.e() : false) {
                                fy1Var = fy1Var2;
                            } else {
                                fy1Var = fy1Var3;
                            }
                        }
                    } else {
                        fy1Var = gy1Var2.j;
                    }
                    gy1Var2.j = fy1Var;
                    if (ln3Var == ln3Var3) {
                        if (fy1Var == fy1Var2) {
                            ey1Var.i = true;
                            gy1Var2.k = true;
                        }
                        gy1Var2.l = true;
                    }
                    if (ln3Var == ln3Var4) {
                        if (fy1Var == fy1Var3) {
                            ly1.c(ly1Var2, ey1Var, ey1Var.a, 0L, 12);
                            return;
                        }
                        if (gy1Var2.k) {
                            ly1Var2.f(ey1Var, ey1Var, new dy1(i), 0L);
                            ly1Var2.e(ey1Var, new dy1(i), 0L);
                            long j = ey1Var.a;
                            jy1 jy1Var = ly1Var2.p;
                            if (jy1Var == null) {
                                jy1Var = new jy1();
                                jy1Var.j = Long.MAX_VALUE;
                                ly1Var2.p = jy1Var;
                            }
                            jy1Var.j = j;
                            ly1Var2.s = jy1Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = wr1Var instanceof iy1;
                ln3 ln3Var5 = ln3.p;
                if (z3) {
                    iy1 iy1Var = (iy1) wr1Var;
                    if (ln3Var == ln3Var3) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            ln3Var2 = ln3Var4;
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i4);
                        ln3Var2 = ln3Var4;
                        if (vr1.n(((ey1) obj3).a, iy1Var.k)) {
                            break;
                        }
                        i4++;
                        ln3Var4 = ln3Var2;
                    }
                    ey1 ey1Var2 = (ey1) obj3;
                    if (ey1Var2 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                obj5 = null;
                                break;
                            }
                            obj5 = arrayList.get(i5);
                            if (((ey1) obj5).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        ey1Var2 = (ey1) obj5;
                        if (ey1Var2 == null) {
                            ly1Var2.a();
                            return;
                        }
                        iy1Var.k = ey1Var2.a;
                    }
                    ey1 ey1Var3 = ey1Var2;
                    if (ln3Var == ln3Var2) {
                        if (ey1Var3.i) {
                            ey1 ey1Var4 = iy1Var.j;
                            if (ey1Var4 == null) {
                                kf2.n("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j2 = iy1Var.k;
                            e20 e20Var = ly1Var2.u;
                            if (e20Var == null) {
                                kf2.n("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            ly1Var2.b(ey1Var4, j2, e20Var);
                        } else if (zz1.b(ey1Var3)) {
                            int size4 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size4) {
                                    obj4 = null;
                                    break;
                                }
                                Object obj6 = arrayList.get(i6);
                                if (((ey1) obj6).d) {
                                    obj4 = obj6;
                                    break;
                                }
                                i6++;
                            }
                            ey1 ey1Var5 = (ey1) obj4;
                            if (ey1Var5 == null) {
                                ly1Var2.a();
                            } else {
                                iy1Var.k = ey1Var5.a;
                            }
                        } else {
                            m65 m65Var = (m65) kb4.q(z64Var, g90.t);
                            float f2 = bv0.a;
                            float fC = m65Var.c();
                            e20 e20Var2 = ly1Var2.u;
                            if (e20Var2 == null) {
                                kf2.n("Touch slop detector not initialized.");
                                return;
                            }
                            long jU = e20.u(e20Var2, zz1.A(ey1Var3, z64Var.D, new dy1(i), true), fC);
                            if ((9223372034707292159L & jU) != 9205357640488583168L) {
                                ey1Var3.i = true;
                                ey1 ey1Var6 = iy1Var.j;
                                ey1Var6.getClass();
                                ly1Var2.f(ey1Var6, ey1Var3, new dy1(i), jU);
                                ly1Var2.e(ey1Var3, new dy1(i), jU);
                                long j3 = ey1Var3.a;
                                jy1 jy1Var2 = ly1Var2.p;
                                if (jy1Var2 == null) {
                                    jy1Var2 = new jy1();
                                    jy1Var2.j = Long.MAX_VALUE;
                                    ly1Var2.p = jy1Var2;
                                }
                                jy1Var2.j = j3;
                                ly1Var2.s = jy1Var2;
                            } else {
                                iy1Var.l = true;
                            }
                        }
                    }
                    if (ln3Var == ln3Var5 && iy1Var.l) {
                        if (!ey1Var3.i) {
                            iy1Var.l = false;
                            return;
                        }
                        ey1 ey1Var7 = iy1Var.j;
                        if (ey1Var7 == null) {
                            kf2.n("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j4 = iy1Var.k;
                        e20 e20Var3 = ly1Var2.u;
                        if (e20Var3 != null) {
                            ly1Var2.b(ey1Var7, j4, e20Var3);
                            return;
                        } else {
                            kf2.n("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (wr1Var instanceof hy1) {
                    hy1 hy1Var = (hy1) wr1Var;
                    if (ln3Var != ln3Var5) {
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            z = true;
                            break;
                        } else {
                            if (((ey1) arrayList.get(i7)).i) {
                                z = false;
                                break;
                            }
                            i7++;
                        }
                    }
                    int size6 = arrayList.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        if (((ey1) arrayList.get(i8)).d) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jB = zz1.B((ey1) q40.w0(arrayList), z64Var.D, new dy1(i));
                                ey1 ey1Var8 = hy1Var.j;
                                ey1Var8.getClass();
                                long jD = g83.d(jB, zz1.B(ey1Var8, z64Var.D, new dy1(i)));
                                ey1 ey1Var9 = hy1Var.j;
                                if (ey1Var9 != null) {
                                    ly1.c(ly1Var2, ey1Var9, hy1Var.k, jD, 8);
                                    return;
                                } else {
                                    kf2.n("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    ly1Var2.a();
                    return;
                }
                if (!(wr1Var instanceof jy1)) {
                    er1.n();
                    return;
                }
                jy1 jy1Var3 = (jy1) wr1Var;
                if (ln3Var != ln3Var4) {
                    return;
                }
                long j5 = jy1Var3.j;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i9);
                    if (vr1.n(((ey1) obj).a, j5)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                ey1 ey1Var10 = (ey1) obj;
                if (ey1Var10 == null) {
                    return;
                }
                long j6 = ey1Var10.c;
                boolean zB = zz1.b(ey1Var10);
                wu0 wu0Var = wu0.a;
                if (!zB) {
                    if (ey1Var10.i) {
                        z64Var.A0(wu0Var);
                        return;
                    } else {
                        if (g83.c(zz1.A(ey1Var10, z64Var.D, new dy1(i), true)) == 0.0f) {
                            return;
                        }
                        ly1Var2.e(ey1Var10, new dy1(i), zz1.A(ey1Var10, z64Var.D, new dy1(i), false));
                        ey1Var10.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        f = 0.0f;
                        obj2 = null;
                        break;
                    } else {
                        obj2 = arrayList.get(i10);
                        f = 0.0f;
                        if (((ey1) obj2).d) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                ey1 ey1Var11 = (ey1) obj2;
                if (ey1Var11 != null) {
                    jy1Var3.j = ey1Var11.a;
                    return;
                }
                if (ey1Var10.i || !zz1.b(ey1Var10)) {
                    z64Var.A0(wu0Var);
                } else {
                    rm2 rm2VarD = ly1Var2.d();
                    hb3 hb3Var = z64Var.D;
                    x7 x7Var = ly1Var2.v;
                    q03 q03Var = (q03) x7Var.p;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    if (zz1.h(ey1Var10)) {
                        x7Var.o = 0;
                        q03Var.d();
                    }
                    if (zz1.b(ey1Var10) || zz1.h(ey1Var10)) {
                        c = ' ';
                    } else {
                        if (q03Var.b == 3) {
                            int i11 = x7Var.o;
                            x7Var.o = i11 + 1;
                            q03Var.n(i11, ey1Var10);
                        } else {
                            q03Var.a(ey1Var10);
                        }
                        if (x7Var.o == 3) {
                            x7Var.o = 0;
                        }
                        Object[] objArr = q03Var.a;
                        int i12 = q03Var.b;
                        float fIntBitsToFloat4 = f;
                        int i13 = 0;
                        while (i13 < i12) {
                            char c3 = c2;
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (((ey1) objArr[i13]).c >> c3)) + fIntBitsToFloat4;
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        int i14 = q03Var.b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i14;
                        Object[] objArr2 = q03Var.a;
                        float fIntBitsToFloat5 = f;
                        for (int i15 = 0; i15 < i14; i15++) {
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((ey1) objArr2[i15]).c & 4294967295L));
                        }
                        fIntBitsToFloat3 = fIntBitsToFloat5 / q03Var.b;
                    }
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                    if (hb3Var != null) {
                        if (i == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
                        } else if (i == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                        }
                        jFloatToRawIntBits = hb3Var == hb3.o ? (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) : (((long) Float.floatToRawIntBits(f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                    }
                    ((qf2) rm2VarD.o).a(ey1Var10.b, jFloatToRawIntBits);
                    float fB = ((m65) kb4.q(z64Var, g90.t)).b();
                    long jC = ly1Var2.d().c(e35.h(fB, fB));
                    qf2 qf2Var = (qf2) ly1Var2.d().o;
                    m45 m45Var = qf2Var.a;
                    vh0[] vh0VarArr = m45Var.d;
                    ti.f0(0, vh0VarArr.length, null, vh0VarArr);
                    m45Var.e = 0;
                    m45 m45Var2 = qf2Var.b;
                    vh0[] vh0VarArr2 = m45Var2.d;
                    ti.f0(0, vh0VarArr2.length, null, vh0VarArr2);
                    m45Var2.e = 0;
                    qf2Var.c = 0L;
                    z64Var.A0(new zu0(true, ov0.a(jC)));
                }
                ly1Var2.a();
            }
        }
    }

    public final void G0(tb tbVar, fv fvVar, y71 y71Var, rm2 rm2Var, hb3 hb3Var, a74 a74Var, boolean z, boolean z2) {
        boolean z3;
        if (this.F != z) {
            this.f0.o = z;
            this.X = null;
            this.Y = null;
            fu.C(this);
        }
        if (y71Var == null) {
            y71Var = this.d0;
        }
        g74 g74Var = this.e0;
        boolean z4 = true;
        if (h12.c(g74Var.a, a74Var)) {
            z3 = false;
        } else {
            g74Var.a = a74Var;
            z3 = true;
        }
        g74Var.b = tbVar;
        if (g74Var.d != hb3Var) {
            g74Var.d = hb3Var;
            z3 = true;
        }
        if (g74Var.e != z2) {
            g74Var.e = z2;
            z3 = true;
        }
        g74Var.c = y71Var;
        g74Var.f = this.W;
        gd0 gd0Var = this.h0;
        gd0Var.B = hb3Var;
        gd0Var.D = z2;
        gd0Var.E = fvVar;
        k2 k2Var = uo.p;
        hb3 hb3Var2 = g74Var.d;
        hb3 hb3Var3 = hb3.n;
        if (hb3Var2 != hb3Var3) {
            hb3Var3 = hb3.o;
        }
        this.E = k2Var;
        if (this.F != z) {
            this.F = z;
            if (!z) {
                jh1 jh1Var = this.O;
                if (jh1Var != null) {
                    r0(jh1Var);
                }
                jh1 jh1Var2 = this.N;
                if (jh1Var2 != null) {
                    r0(jh1Var2);
                }
                this.O = null;
                this.N = null;
                w0();
                this.V = null;
            }
            z3 = true;
        }
        if (!h12.c(this.G, rm2Var)) {
            w0();
            this.G = rm2Var;
        }
        if (this.D != hb3Var3) {
            this.D = hb3Var3;
        } else {
            z4 = z3;
        }
        if (z4) {
            boolean z5 = this.K;
            wu0 wu0Var = wu0.a;
            if (z5) {
                x0();
                if (this.J) {
                    B0().d(wu0Var);
                }
                this.T = null;
            }
            ly1 ly1Var = this.V;
            if (ly1Var != null) {
                ly1Var.a();
                z64 z64Var = ly1Var.n;
                if (z64Var.J) {
                    z64Var.A0(wu0Var);
                }
                ly1Var.t = null;
                x7 x7Var = ly1Var.w;
                x7Var.o = 0;
                ((l03) x7Var.p).b = 0;
            }
        }
    }

    @Override // defpackage.my1
    public final void N() {
        ly1 ly1Var = this.V;
        if (ly1Var != null) {
            ly1Var.a();
            z64 z64Var = ly1Var.n;
            if (z64Var.J) {
                z64Var.A0(wu0.a);
            }
            ly1Var.t = null;
            x7 x7Var = ly1Var.w;
            x7Var.o = 0;
            ((l03) x7Var.p).b = 0;
        }
    }

    @Override // defpackage.eo0, defpackage.rn3
    public final void b() {
        t();
        hy2 hy2Var = this.b0;
        if (hy2Var != null) {
            hy2Var.d = j51.O(this).J;
        }
        hw4 hw4Var = this.c0;
        if (hw4Var != null) {
            hw4Var.d = j51.O(this).J;
        }
        t();
        if (this.A) {
            oo0 oo0Var = j51.O(this).J;
            uk0 uk0Var = this.d0;
            uk0Var.getClass();
            uk0Var.a = new ui0(new rm2(oo0Var));
        }
    }

    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        if (this.F && (this.X == null || this.Y == null)) {
            this.X = new z(1, this);
            this.Y = new j2(this, null);
        }
        z zVar = this.X;
        if (zVar != null) {
            c42[] c42VarArr = o94.a;
            q94Var.a(d94.d, new w2(null, zVar));
        }
        j2 j2Var = this.Y;
        if (j2Var != null) {
            c42[] c42VarArr2 = o94.a;
            q94Var.a(d94.e, j2Var);
        }
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    @Override // defpackage.cx2
    public final void i0() {
        hy2 hy2Var = this.b0;
        if (hy2Var != null) {
            hy2Var.d = j51.O(this).J;
        }
        hw4 hw4Var = this.c0;
        if (hw4Var != null) {
            hw4Var.d = j51.O(this).J;
        }
        if (this.A) {
            oo0 oo0Var = j51.O(this).J;
            uk0 uk0Var = this.d0;
            uk0Var.getClass();
            uk0Var.a = new ui0(new rm2(oo0Var));
        }
    }

    @Override // defpackage.cx2
    public final void j0() {
        this.J = false;
        w0();
        jh1 jh1Var = this.O;
        if (jh1Var != null) {
            r0(jh1Var);
        }
        jh1 jh1Var2 = this.N;
        if (jh1Var2 != null) {
            r0(jh1Var2);
        }
        this.O = null;
        this.N = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0182  */
    /* JADX WARN: Code duplicated, block: B:103:0x0191  */
    /* JADX WARN: Code duplicated, block: B:104:0x0199  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:125:0x0222  */
    /* JADX WARN: Code duplicated, block: B:128:0x0231  */
    /* JADX WARN: Code duplicated, block: B:130:0x023f A[ADDED_TO_REGION, LOOP:7: B:130:0x023f->B:177:0x02da, LOOP_START, PHI: r1 r3 r5 r7 r11
  0x023f: PHI (r1v77 cx2) = (r1v66 cx2), (r1v78 cx2) binds: [B:129:0x023d, B:177:0x02da] A[DONT_GENERATE, DONT_INLINE]
  0x023f: PHI (r3v48 java.lang.String) = (r3v45 java.lang.String), (r3v49 java.lang.String) binds: [B:129:0x023d, B:177:0x02da] A[DONT_GENERATE, DONT_INLINE]
  0x023f: PHI (r5v22 java.lang.String) = (r5v19 java.lang.String), (r5v24 java.lang.String) binds: [B:129:0x023d, B:177:0x02da] A[DONT_GENERATE, DONT_INLINE]
  0x023f: PHI (r7v37 boolean) = (r7v33 boolean), (r7v39 boolean) binds: [B:129:0x023d, B:177:0x02da] A[DONT_GENERATE, DONT_INLINE]
  0x023f: PHI (r11v22 if1) = (r11v17 if1), (r11v24 if1) binds: [B:129:0x023d, B:177:0x02da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:133:0x0249  */
    /* JADX WARN: Code duplicated, block: B:135:0x024d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0253  */
    /* JADX WARN: Code duplicated, block: B:139:0x025f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0261  */
    /* JADX WARN: Code duplicated, block: B:142:0x0265  */
    /* JADX WARN: Code duplicated, block: B:145:0x026c  */
    /* JADX WARN: Code duplicated, block: B:156:0x028b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0303  */
    /* JADX WARN: Code duplicated, block: B:190:0x031e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0332  */
    /* JADX WARN: Code duplicated, block: B:194:0x0345  */
    /* JADX WARN: Code duplicated, block: B:195:0x035b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0361  */
    /* JADX WARN: Code duplicated, block: B:199:0x036b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0371  */
    /* JADX WARN: Code duplicated, block: B:202:0x0375  */
    /* JADX WARN: Code duplicated, block: B:204:0x0379  */
    /* JADX WARN: Code duplicated, block: B:388:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:389:0x016e A[EDGE_INSN: B:389:0x016e->B:96:0x016e BREAK  A[LOOP:5: B:90:0x015c->B:94:0x016a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0314 A[EDGE_INSN: B:391:0x0314->B:186:0x0314 BREAK  A[LOOP:6: B:127:0x022f->B:184:0x0304, LOOP_LABEL: LOOP:6: B:127:0x022f->B:184:0x0304], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x02da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0151  */
    /* JADX WARN: Code duplicated, block: B:89:0x0157  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:94:0x016a A[LOOP:5: B:90:0x015c->B:94:0x016a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x0172  */
    /* JADX WARN: Code duplicated, block: B:99:0x0175  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [f13] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [f13] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58, types: [cx2] */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // defpackage.rn3
    public final void n(kn3 kn3Var, ln3 ln3Var, long j) {
        ln3 ln3Var2;
        ln3 ln3Var3;
        int i;
        Object obj;
        Object obj2;
        boolean z;
        ln3 ln3Var4;
        Object obj3;
        String str;
        String str2;
        String str3;
        String str4;
        on3 on3Var;
        long j2;
        e20 e20Var;
        m65 m65Var;
        int i2;
        float fC;
        e20 e20Var2;
        long jU;
        hb3 hb3Var;
        boolean z2;
        if1 if1Var;
        cx2 cx2Var;
        c72 c72VarO;
        boolean z3;
        vu0 vu0Var;
        w12 w12Var;
        ?? r15;
        ?? r3;
        ?? f13Var;
        ?? C;
        if1 if1Var2;
        rx4 rx4Var;
        ih1 ih1Var;
        boolean zBooleanValue;
        int size;
        int i3;
        Object obj4;
        on3 on3Var2;
        Object obj5;
        ru0 ru0Var;
        z64 z64Var = this;
        kn3 kn3Var2 = kn3Var;
        List list = kn3Var2.a;
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            ln3 ln3Var5 = ln3.o;
            ln3 ln3Var6 = ln3.n;
            if (i4 < size2) {
                on3 on3Var3 = (on3) list.get(i4);
                k2 k2Var = z64Var.E;
                int i5 = on3Var3.i;
                k2Var.getClass();
                if (i5 == 2) {
                    i4++;
                    kn3Var2 = kn3Var;
                } else {
                    z64Var.K = true;
                    if (!z64Var.F) {
                        break;
                    }
                    if (z64Var.N == null) {
                        jh1 jh1Var = new jh1(z64Var);
                        z64Var.q0(jh1Var);
                        z64Var.N = jh1Var;
                    }
                    if (z64Var.S == null) {
                        su0 su0Var = z64Var.L;
                        if (su0Var == null) {
                            su0Var = new su0();
                            su0Var.f = ru0.p;
                            su0Var.g = false;
                            su0Var.h = false;
                            z64Var.L = su0Var;
                        }
                        z64Var.S = su0Var;
                    }
                    ya4 ya4Var = z64Var.S;
                    if (ya4Var == null) {
                        kf2.n("currentDragState should not be null");
                        return;
                    }
                    if (!(ya4Var instanceof su0)) {
                        boolean z4 = ya4Var instanceof uu0;
                        ln3 ln3Var7 = ln3.p;
                        if (!z4) {
                            ln3Var2 = ln3Var5;
                            ln3Var3 = ln3Var6;
                            if (!(ya4Var instanceof tu0)) {
                                if (!(ya4Var instanceof vu0)) {
                                    er1.n();
                                    return;
                                }
                                vu0 vu0Var2 = (vu0) ya4Var;
                                if (ln3Var != ln3Var2) {
                                    break;
                                }
                                long j3 = vu0Var2.f;
                                int size3 = list.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size3) {
                                        obj = null;
                                        break;
                                    }
                                    obj = list.get(i6);
                                    if (vr1.n(((on3) obj).a, j3)) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                on3 on3Var4 = (on3) obj;
                                if (on3Var4 == null) {
                                    break;
                                }
                                boolean zI = gi1.i(on3Var4);
                                wu0 wu0Var = wu0.a;
                                if (!zI) {
                                    if (!on3Var4.c()) {
                                        if (g83.c(gi1.S(on3Var4, true)) != 0.0f) {
                                            z64Var.D0(on3Var4, gi1.S(on3Var4, false));
                                            on3Var4.a();
                                            break;
                                        }
                                        break;
                                    }
                                    z64Var.B0().d(wu0Var);
                                } else {
                                    int size4 = list.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= size4) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = list.get(i7);
                                        if (((on3) obj2).d) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                    on3 on3Var5 = (on3) obj2;
                                    if (on3Var5 == null) {
                                        if (on3Var4.c() || !gi1.i(on3Var4)) {
                                            z64Var.B0().d(wu0Var);
                                        } else {
                                            float fB = ((m65) kb4.q(z64Var, g90.t)).b();
                                            xl.e(z64Var.C0(), on3Var4);
                                            long jC = z64Var.C0().c(e35.h(fB, fB));
                                            qf2 qf2Var = (qf2) z64Var.C0().o;
                                            m45 m45Var = qf2Var.a;
                                            vh0[] vh0VarArr = m45Var.d;
                                            ti.f0(0, vh0VarArr.length, null, vh0VarArr);
                                            m45Var.e = 0;
                                            m45 m45Var2 = qf2Var.b;
                                            vh0[] vh0VarArr2 = m45Var2.d;
                                            ti.f0(0, vh0VarArr2.length, null, vh0VarArr2);
                                            m45Var2.e = 0;
                                            qf2Var.c = 0L;
                                            z64Var.B0().d(new zu0(false, ov0.a(jC)));
                                            z64Var.K = false;
                                        }
                                        z64Var.x0();
                                    } else {
                                        vu0Var2.f = on3Var5.a;
                                    }
                                }
                            } else {
                                tu0 tu0Var = (tu0) ya4Var;
                                if (ln3Var == ln3Var7) {
                                    int size5 = list.size();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= size5) {
                                            z = true;
                                            break;
                                        } else {
                                            if (((on3) list.get(i8)).c()) {
                                                z = false;
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                    int size6 = list.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < size6) {
                                            if (((on3) list.get(i9)).d) {
                                                if (!list.isEmpty()) {
                                                    if (!z) {
                                                        break;
                                                    }
                                                    long j4 = ((on3) q40.w0(list)).c;
                                                    on3 on3Var6 = tu0Var.f;
                                                    on3Var6.getClass();
                                                    long jD = g83.d(j4, on3Var6.c);
                                                    on3 on3Var7 = tu0Var.f;
                                                    if (on3Var7 != null) {
                                                        z0(z64Var, on3Var7, tu0Var.g, jD, 8);
                                                        break;
                                                    } else {
                                                        kf2.n("AwaitGesturePickup.initialDown was not initialized.");
                                                        return;
                                                    }
                                                }
                                                break;
                                            }
                                            i9++;
                                        }
                                        z64Var.x0();
                                        break;
                                    }
                                }
                            }
                            break;
                            break;
                        }
                        uu0 uu0Var = (uu0) ya4Var;
                        if (ln3Var != ln3Var6) {
                            int size7 = list.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size7) {
                                    ln3Var4 = ln3Var5;
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i10);
                                ln3Var4 = ln3Var5;
                                if (vr1.n(((on3) obj3).a, uu0Var.g)) {
                                    break;
                                }
                                i10++;
                                ln3Var5 = ln3Var4;
                            }
                            on3 on3Var8 = (on3) obj3;
                            if (on3Var8 != null) {
                                str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                str2 = "AwaitTouchSlop.initialDown was not initialized";
                                ln3Var2 = ln3Var4;
                                if (ln3Var != ln3Var2) {
                                    str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    str4 = "AwaitTouchSlop.initialDown was not initialized";
                                    ln3Var3 = ln3Var6;
                                } else if (!on3Var8.c()) {
                                    str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    str4 = "AwaitTouchSlop.initialDown was not initialized";
                                    ln3Var3 = ln3Var6;
                                    on3Var = uu0Var.f;
                                    if (on3Var != null) {
                                        kf2.n(str4);
                                        return;
                                    }
                                    j2 = uu0Var.g;
                                    e20Var = z64Var.U;
                                    if (e20Var != null) {
                                        kf2.n(str3);
                                        return;
                                    }
                                    z64Var.y0(on3Var, j2, e20Var);
                                } else if (gi1.i(on3Var8)) {
                                    size = list.size();
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < size) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = list.get(i3);
                                        if (((on3) obj4).d) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    }
                                    on3Var2 = (on3) obj4;
                                    if (on3Var2 == null) {
                                        z64Var.x0();
                                    } else {
                                        uu0Var.g = on3Var2.a;
                                    }
                                    str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    str4 = "AwaitTouchSlop.initialDown was not initialized";
                                    ln3Var3 = ln3Var6;
                                } else {
                                    m65Var = (m65) kb4.q(z64Var, g90.t);
                                    i2 = on3Var8.i;
                                    float f = bv0.a;
                                    if (i2 == 2) {
                                        fC = m65Var.c() * bv0.a;
                                    } else {
                                        fC = m65Var.c();
                                    }
                                    e20Var2 = z64Var.U;
                                    if (e20Var2 != null) {
                                        kf2.n("Touch slop detector not initialized.");
                                        return;
                                    }
                                    jU = e20.u(e20Var2, gi1.S(on3Var8, true), fC);
                                    if ((jU & 9223372034707292159L) != 9205357640488583168L) {
                                        ln3Var3 = ln3Var6;
                                        long jE = g83.e(z64Var.M, gi1.S(on3Var8, false));
                                        z64Var.M = jE;
                                        final float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (z64Var.M & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jE >> 32))))) * 57.29578f;
                                        hb3Var = z64Var.D;
                                        if (hb3Var == null) {
                                            z2 = true;
                                        } else {
                                            int i11 = ov0.a;
                                            z2 = hb3Var == hb3.o ? false : false;
                                        }
                                        final fx3 fx3Var = new fx3();
                                        if1Var = new if1() { // from class: cv0
                                            /* JADX WARN: Code duplicated, block: B:4:0x0014  */
                                            @Override // defpackage.if1
                                            public final Object invoke(Object obj6) {
                                                boolean z5;
                                                mv0 mv0Var = (mv0) obj6;
                                                boolean zC = h12.c(mv0Var.A(), "waiting");
                                                boolean z6 = false;
                                                if (mv0Var.F() == null) {
                                                    z5 = false;
                                                } else {
                                                    hb3 hb3VarF = mv0Var.F();
                                                    hb3VarF.getClass();
                                                    int i12 = ov0.a;
                                                    hb3 hb3Var2 = hb3.o;
                                                    float f2 = fAtan2;
                                                    if (hb3VarF != hb3Var2 ? f2 <= 30.0f || f2 > 90.0f : f2 > 30.0f) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = true;
                                                    }
                                                }
                                                fx3 fx3Var2 = fx3Var;
                                                if (fx3Var2.n || (zC && z5)) {
                                                    z6 = true;
                                                }
                                                fx3Var2.n = z6;
                                                return Boolean.valueOf(!z6);
                                            }
                                        };
                                        int i12 = ov0.a;
                                        if (!z64Var.n.A) {
                                            cz1.b("visitAncestors called on an unattached node");
                                        }
                                        cx2Var = z64Var.n.r;
                                        c72VarO = j51.O(z64Var);
                                        loop6: while (true) {
                                            if (c72VarO != null) {
                                                str3 = str;
                                                str4 = str2;
                                                z3 = z2;
                                                break;
                                            }
                                            if ((((cx2) c72VarO.Q.g).q & 262144) != 0) {
                                                while (cx2Var != null) {
                                                    str3 = str;
                                                    if ((cx2Var.p & 262144) != 0) {
                                                        r15 = 0;
                                                        r3 = cx2Var;
                                                        while (r3 != 0) {
                                                            str4 = str2;
                                                            if (r3 instanceof rx4) {
                                                                rx4Var = (rx4) r3;
                                                                z3 = z2;
                                                                if (jh1.C == rx4Var.f()) {
                                                                    zBooleanValue = true;
                                                                } else {
                                                                    if (rx4Var instanceof jh1) {
                                                                        kf2.o("Node is not a GestureNode instance");
                                                                        return;
                                                                    }
                                                                    ih1Var = ((jh1) rx4Var).B;
                                                                    if (ih1Var == null) {
                                                                        ih1Var = null;
                                                                    }
                                                                    if (ih1Var == null) {
                                                                        zBooleanValue = true;
                                                                    } else {
                                                                        zBooleanValue = ((Boolean) if1Var.invoke(ih1Var)).booleanValue();
                                                                    }
                                                                }
                                                                if (!zBooleanValue) {
                                                                    break loop6;
                                                                    break loop6;
                                                                }
                                                            } else {
                                                                z3 = z2;
                                                                if ((r3.p & 262144) == 0) {
                                                                }
                                                                str2 = str4;
                                                                z2 = z3;
                                                                if1Var = if1Var2;
                                                                r3 = C;
                                                                r15 = f13Var;
                                                            }
                                                            if1Var2 = if1Var;
                                                            f13Var = r15;
                                                            C = j51.c(f13Var);
                                                            str2 = str4;
                                                            z2 = z3;
                                                            if1Var = if1Var2;
                                                            r3 = C;
                                                            r15 = f13Var;
                                                        }
                                                    }
                                                    cx2Var = cx2Var.r;
                                                    str = str3;
                                                    str2 = str2;
                                                    z2 = z2;
                                                    if1Var = if1Var;
                                                }
                                            }
                                            String str5 = str;
                                            String str6 = str2;
                                            boolean z5 = z2;
                                            if1 if1Var3 = if1Var;
                                            c72VarO = c72VarO.t();
                                            if (c72VarO != null) {
                                                cx2Var = null;
                                            } else {
                                                cx2Var = null;
                                            }
                                            str = str5;
                                            str2 = str6;
                                            z2 = z5;
                                            if1Var = if1Var3;
                                        }
                                        if (z3) {
                                            on3Var8.a();
                                            on3 on3Var9 = uu0Var.f;
                                            on3Var9.getClass();
                                            z64Var.E0(on3Var9, on3Var8, jU);
                                            z64Var.D0(on3Var8, jU);
                                            long j5 = on3Var8.a;
                                            vu0Var = z64Var.P;
                                            if (vu0Var == null) {
                                                vu0Var = new vu0();
                                                vu0Var.f = Long.MAX_VALUE;
                                                z64Var.P = vu0Var;
                                            }
                                            vu0Var.f = j5;
                                            z64Var.S = vu0Var;
                                        } else {
                                            on3Var8.a();
                                            on3 on3Var10 = uu0Var.f;
                                            on3Var10.getClass();
                                            z64Var.E0(on3Var10, on3Var8, jU);
                                            z64Var.D0(on3Var8, jU);
                                            long j6 = on3Var8.a;
                                            vu0Var = z64Var.P;
                                            if (vu0Var == null) {
                                                vu0Var = new vu0();
                                                vu0Var.f = Long.MAX_VALUE;
                                                z64Var.P = vu0Var;
                                            }
                                            vu0Var.f = j6;
                                            z64Var.S = vu0Var;
                                        }
                                    } else {
                                        str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                        str4 = "AwaitTouchSlop.initialDown was not initialized";
                                        ln3Var3 = ln3Var6;
                                        uu0Var.h = true;
                                        z64Var.M = g83.e(z64Var.M, gi1.S(on3Var8, true));
                                    }
                                }
                                if (ln3Var == ln3Var7) {
                                    break;
                                    break;
                                } else {
                                    break;
                                    break;
                                }
                            }
                            int size8 = list.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size8) {
                                    obj5 = null;
                                    break;
                                }
                                obj5 = list.get(i13);
                                if (((on3) obj5).d) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            on3Var8 = (on3) obj5;
                            if (on3Var8 != null) {
                                uu0Var.g = on3Var8.a;
                                str = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                str2 = "AwaitTouchSlop.initialDown was not initialized";
                                ln3Var2 = ln3Var4;
                                if (ln3Var != ln3Var2) {
                                    str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    str4 = "AwaitTouchSlop.initialDown was not initialized";
                                    ln3Var3 = ln3Var6;
                                } else if (!on3Var8.c()) {
                                    str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    str4 = "AwaitTouchSlop.initialDown was not initialized";
                                    ln3Var3 = ln3Var6;
                                    on3Var = uu0Var.f;
                                    if (on3Var != null) {
                                        kf2.n(str4);
                                        return;
                                    }
                                    j2 = uu0Var.g;
                                    e20Var = z64Var.U;
                                    if (e20Var != null) {
                                        kf2.n(str3);
                                        return;
                                    }
                                    z64Var.y0(on3Var, j2, e20Var);
                                } else if (gi1.i(on3Var8)) {
                                    size = list.size();
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < size) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = list.get(i3);
                                        if (((on3) obj4).d) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    on3Var2 = (on3) obj4;
                                    if (on3Var2 == null) {
                                        z64Var.x0();
                                    } else {
                                        uu0Var.g = on3Var2.a;
                                    }
                                    str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                    str4 = "AwaitTouchSlop.initialDown was not initialized";
                                    ln3Var3 = ln3Var6;
                                } else {
                                    m65Var = (m65) kb4.q(z64Var, g90.t);
                                    i2 = on3Var8.i;
                                    float f2 = bv0.a;
                                    if (i2 == 2) {
                                        fC = m65Var.c() * bv0.a;
                                    } else {
                                        fC = m65Var.c();
                                    }
                                    e20Var2 = z64Var.U;
                                    if (e20Var2 != null) {
                                        kf2.n("Touch slop detector not initialized.");
                                        return;
                                    }
                                    jU = e20.u(e20Var2, gi1.S(on3Var8, true), fC);
                                    if ((jU & 9223372034707292159L) != 9205357640488583168L) {
                                        ln3Var3 = ln3Var6;
                                        long jE2 = g83.e(z64Var.M, gi1.S(on3Var8, false));
                                        z64Var.M = jE2;
                                        final float fAtan3 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (z64Var.M & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jE2 >> 32))))) * 57.29578f;
                                        hb3Var = z64Var.D;
                                        if (hb3Var == null) {
                                            z2 = true;
                                        } else {
                                            int i14 = ov0.a;
                                            if (hb3Var == hb3.o ? !(fAtan3 <= 30.0f || fAtan3 > 90.0f) : fAtan3 <= 30.0f) {
                                                z2 = true;
                                            }
                                        }
                                        final fx3 fx3Var2 = new fx3();
                                        if1Var = new if1() { // from class: cv0
                                            /* JADX WARN: Code duplicated, block: B:4:0x0014  */
                                            @Override // defpackage.if1
                                            public final Object invoke(Object obj6) {
                                                boolean z6;
                                                mv0 mv0Var = (mv0) obj6;
                                                boolean zC = h12.c(mv0Var.A(), "waiting");
                                                boolean z7 = false;
                                                if (mv0Var.F() == null) {
                                                    z6 = false;
                                                } else {
                                                    hb3 hb3VarF = mv0Var.F();
                                                    hb3VarF.getClass();
                                                    int i15 = ov0.a;
                                                    hb3 hb3Var2 = hb3.o;
                                                    float f3 = fAtan3;
                                                    if (hb3VarF != hb3Var2 ? f3 <= 30.0f || f3 > 90.0f : f3 > 30.0f) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = true;
                                                    }
                                                }
                                                fx3 fx3Var3 = fx3Var2;
                                                if (fx3Var3.n || (zC && z6)) {
                                                    z7 = true;
                                                }
                                                fx3Var3.n = z7;
                                                return Boolean.valueOf(!z7);
                                            }
                                        };
                                        int i15 = ov0.a;
                                        if (!z64Var.n.A) {
                                            cz1.b("visitAncestors called on an unattached node");
                                        }
                                        cx2Var = z64Var.n.r;
                                        c72VarO = j51.O(z64Var);
                                        loop6: while (true) {
                                            if (c72VarO != null) {
                                                str3 = str;
                                                str4 = str2;
                                                z3 = z2;
                                                break;
                                            }
                                            if ((((cx2) c72VarO.Q.g).q & 262144) != 0) {
                                                while (cx2Var != null) {
                                                    str3 = str;
                                                    if ((cx2Var.p & 262144) != 0) {
                                                        r15 = 0;
                                                        r3 = cx2Var;
                                                        while (r3 != 0) {
                                                            str4 = str2;
                                                            if (r3 instanceof rx4) {
                                                                rx4Var = (rx4) r3;
                                                                z3 = z2;
                                                                if (jh1.C == rx4Var.f()) {
                                                                    zBooleanValue = true;
                                                                } else {
                                                                    if (rx4Var instanceof jh1) {
                                                                        kf2.o("Node is not a GestureNode instance");
                                                                        return;
                                                                    }
                                                                    ih1Var = ((jh1) rx4Var).B;
                                                                    if (ih1Var == null) {
                                                                        ih1Var = null;
                                                                    }
                                                                    if (ih1Var == null && (ih1Var instanceof mv0)) {
                                                                        zBooleanValue = ((Boolean) if1Var.invoke(ih1Var)).booleanValue();
                                                                    } else {
                                                                        zBooleanValue = true;
                                                                    }
                                                                }
                                                                if (!zBooleanValue) {
                                                                    break loop6;
                                                                }
                                                            } else {
                                                                z3 = z2;
                                                                if ((r3.p & 262144) == 0 && (r3 instanceof fo0)) {
                                                                    cx2 cx2Var2 = ((fo0) r3).C;
                                                                    int i16 = 0;
                                                                    while (cx2Var2 != null) {
                                                                        if1 if1Var4 = if1Var;
                                                                        if ((cx2Var2.p & 262144) != 0) {
                                                                            i16++;
                                                                            if (i16 == 1) {
                                                                                C = r3;
                                                                                f13Var = r15;
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
                                                                            f13Var = r15;
                                                                        }
                                                                        cx2Var2 = cx2Var2.s;
                                                                        if1Var = if1Var4;
                                                                        C = C;
                                                                        f13Var = f13Var;
                                                                    }
                                                                    C = r3;
                                                                    f13Var = r15;
                                                                    if1Var2 = if1Var;
                                                                    f13Var = f13Var;
                                                                    if (i16 == 1) {
                                                                    }
                                                                    str2 = str4;
                                                                    z2 = z3;
                                                                    if1Var = if1Var2;
                                                                    r3 = C;
                                                                    r15 = f13Var;
                                                                }
                                                                C = j51.c(f13Var);
                                                                str2 = str4;
                                                                z2 = z3;
                                                                if1Var = if1Var2;
                                                                r3 = C;
                                                                r15 = f13Var;
                                                            }
                                                            if1Var2 = if1Var;
                                                            f13Var = r15;
                                                            C = j51.c(f13Var);
                                                            str2 = str4;
                                                            z2 = z3;
                                                            if1Var = if1Var2;
                                                            r3 = C;
                                                            r15 = f13Var;
                                                        }
                                                    }
                                                    cx2Var = cx2Var.r;
                                                    str = str3;
                                                    str2 = str2;
                                                    z2 = z2;
                                                    if1Var = if1Var;
                                                }
                                            }
                                            String str7 = str;
                                            String str8 = str2;
                                            boolean z6 = z2;
                                            if1 if1Var5 = if1Var;
                                            c72VarO = c72VarO.t();
                                            if (c72VarO != null || (w12Var = c72VarO.Q) == null) {
                                                cx2Var = null;
                                            } else {
                                                cx2Var = (sq4) w12Var.f;
                                            }
                                            str = str7;
                                            str2 = str8;
                                            z2 = z6;
                                            if1Var = if1Var5;
                                        }
                                        if (z3 || !fx3Var2.n) {
                                            on3Var8.a();
                                            on3 on3Var11 = uu0Var.f;
                                            on3Var11.getClass();
                                            z64Var.E0(on3Var11, on3Var8, jU);
                                            z64Var.D0(on3Var8, jU);
                                            long j7 = on3Var8.a;
                                            vu0Var = z64Var.P;
                                            if (vu0Var == null) {
                                                vu0Var = new vu0();
                                                vu0Var.f = Long.MAX_VALUE;
                                                z64Var.P = vu0Var;
                                            }
                                            vu0Var.f = j7;
                                            z64Var.S = vu0Var;
                                        } else {
                                            uu0Var.h = true;
                                        }
                                    } else {
                                        str3 = "AwaitTouchSlop.touchSlopDetector was not initialized";
                                        str4 = "AwaitTouchSlop.initialDown was not initialized";
                                        ln3Var3 = ln3Var6;
                                        uu0Var.h = true;
                                        z64Var.M = g83.e(z64Var.M, gi1.S(on3Var8, true));
                                    }
                                }
                                if (ln3Var == ln3Var7 || !uu0Var.h) {
                                    break;
                                }
                                if (!on3Var8.c()) {
                                    uu0Var.h = false;
                                    break;
                                }
                                on3 on3Var12 = uu0Var.f;
                                if (on3Var12 == null) {
                                    kf2.n(str4);
                                    return;
                                }
                                long j8 = uu0Var.g;
                                e20 e20Var3 = z64Var.U;
                                if (e20Var3 == null) {
                                    kf2.n(str3);
                                    return;
                                }
                                z64Var.y0(on3Var12, j8, e20Var3);
                            } else {
                                z64Var.x0();
                                ln3Var3 = ln3Var6;
                                ln3Var2 = ln3Var4;
                            }
                            break;
                        }
                        break;
                    }
                    su0 su0Var2 = (su0) ya4Var;
                    if (!list.isEmpty() && vq4.b(kn3Var2, false)) {
                        on3 on3Var13 = (on3) q40.w0(list);
                        int i17 = dv0.a[su0Var2.f.ordinal()];
                        ru0 ru0Var2 = ru0.o;
                        ru0 ru0Var3 = ru0.n;
                        if (i17 == 1) {
                            g74 g74Var = z64Var.e0;
                            if (g74Var.a.a()) {
                                ru0Var = ru0Var2;
                            } else {
                                tb tbVar = g74Var.b;
                                if (tbVar != null ? tbVar.e() : false) {
                                    ru0Var = ru0Var2;
                                } else {
                                    ru0Var = ru0Var3;
                                }
                            }
                        } else {
                            ru0Var = su0Var2.f;
                        }
                        su0Var2.f = ru0Var;
                        if (ln3Var == ln3Var6) {
                            if (ru0Var == ru0Var2) {
                                on3Var13.a();
                                su0Var2.g = true;
                            }
                            su0Var2.h = true;
                        }
                        if (ln3Var == ln3Var5) {
                            if (ru0Var == ru0Var3) {
                                z0(z64Var, on3Var13, on3Var13.a, 0L, 12);
                            } else if (su0Var2.g) {
                                z64Var.E0(on3Var13, on3Var13, 0L);
                                z64Var.D0(on3Var13, 0L);
                                long j9 = on3Var13.a;
                                vu0 vu0Var3 = z64Var.P;
                                if (vu0Var3 == null) {
                                    vu0Var3 = new vu0();
                                    vu0Var3.f = Long.MAX_VALUE;
                                    z64Var.P = vu0Var3;
                                }
                                vu0Var3.f = j9;
                                z64Var.S = vu0Var3;
                            }
                        }
                    }
                }
            }
            ln3Var2 = ln3Var5;
            ln3Var3 = ln3Var6;
            break;
        }
        if (z64Var.F) {
            if (z64Var.N == null) {
                jh1 jh1Var2 = new jh1(z64Var);
                z64Var.q0(jh1Var2);
                z64Var.N = jh1Var2;
            }
            int i18 = 12;
            ln3 ln3Var8 = ln3Var3;
            if (ln3Var == ln3Var8 && kn3Var.c == 6) {
                if (!z64Var.Z) {
                    if (!z64Var.n.A) {
                        cz1.b("Cannot get View because the Modifier node is not currently attached.");
                    }
                    z64Var = this;
                    z64Var.b0 = new hy2(z64Var.e0, new zh0(4, ViewConfiguration.get(((View) h12.L(j51.O(z64Var))).getContext())), new q70(2, this, z64.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, 1), j51.O(z64Var).J);
                    z64Var.Z = true;
                }
                hy2 hy2Var = z64Var.b0;
                if (hy2Var != null) {
                    we0 we0VarE0 = z64Var.e0();
                    if (hy2Var.h == null) {
                        hy2Var.h = fu.G(we0VarE0, null, null, new p(hy2Var, null, i18), 3);
                    }
                }
            }
            hy2 hy2Var2 = z64Var.b0;
            if (hy2Var2 != null && kn3Var.c == 6) {
                List list2 = kn3Var.a;
                int size9 = list2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size9) {
                        if (ln3Var == ln3Var8 && hy2Var2.a) {
                            hy2Var2.H(kn3Var);
                            ir2.a(kn3Var);
                        }
                        if (ln3Var != ln3Var2 || hy2Var2.a || !hy2Var2.H(kn3Var)) {
                            break;
                            break;
                            break;
                        } else {
                            ir2.a(kn3Var);
                            break;
                        }
                    }
                    if (((on3) list2.get(i19)).c()) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            if (ln3Var == ln3Var8 && ((i = kn3Var.c) == 10 || i == 11 || i == 12)) {
                if (!z64Var.a0) {
                    z64Var = this;
                    z64Var.c0 = new hw4(z64Var.e0, new q70(2, this, z64.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), j51.O(z64Var).J);
                    z64Var.a0 = true;
                }
                hw4 hw4Var = z64Var.c0;
                if (hw4Var != null) {
                    we0 we0VarE1 = z64Var.e0();
                    if (hw4Var.g == null) {
                        hw4Var.g = fu.G(we0VarE1, null, null, new x70(hw4Var, null), 3);
                    }
                }
            }
            hw4 hw4Var2 = z64Var.c0;
            if (hw4Var2 != null) {
                int i20 = kn3Var.c;
                if (i20 == 10 || i20 == 11 || i20 == 12) {
                    List list3 = kn3Var.a;
                    int size10 = list3.size();
                    for (int i21 = 0; i21 < size10; i21++) {
                        if (((on3) list3.get(i21)).c()) {
                            return;
                        }
                    }
                    if (ln3Var == ln3Var8 && hw4Var2.a) {
                        hw4Var2.F(kn3Var);
                        ir2.a(kn3Var);
                    }
                    if (ln3Var == ln3Var2 && !hw4Var2.a && hw4Var2.F(kn3Var)) {
                        ir2.a(kn3Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.j42
    public final boolean q(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.F || ((!g42.a(fh0.a(keyEvent.getKeyCode()), g42.n) && !g42.a(fh0.a(keyEvent.getKeyCode()), g42.m)) || hw.n(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.e0.d == hb3.n;
        gd0 gd0Var = this.h0;
        if (z) {
            int iR0 = (int) (gd0Var.r0() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(g42.a(fh0.a(keyEvent.getKeyCode()), g42.m) ? iR0 : -iR0)));
        } else {
            int iR1 = (int) (gd0Var.r0() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(g42.a(fh0.a(keyEvent.getKeyCode()), g42.m) ? iR1 : -iR1)) << 32);
        }
        fu.G(e0(), null, null, new j2(this, jFloatToRawIntBits, null, 1), 3);
        return true;
    }

    @Override // defpackage.rn3
    public final void t() {
        if (this.K) {
            x0();
            if (this.J) {
                B0().d(wu0.a);
            }
            this.T = null;
        }
        this.K = false;
    }

    public final void w0() {
        jv0 jv0Var = this.I;
        if (jv0Var != null) {
            rm2 rm2Var = this.G;
            if (rm2Var != null) {
                rm2Var.l(new iv0(jv0Var));
            }
            this.I = null;
        }
    }

    public final void x0() {
        this.M = 0L;
        su0 su0Var = this.L;
        ru0 ru0Var = ru0.p;
        if (su0Var == null) {
            su0Var = new su0();
            su0Var.f = ru0Var;
            su0Var.g = false;
            su0Var.h = false;
            this.L = su0Var;
        }
        su0Var.f = ru0Var;
        su0Var.g = false;
        su0Var.h = false;
        this.S = su0Var;
    }

    public final void y0(on3 on3Var, long j, e20 e20Var) {
        tu0 tu0Var = this.R;
        if (tu0Var == null) {
            tu0Var = new tu0();
            tu0Var.f = null;
            tu0Var.g = Long.MAX_VALUE;
            this.R = tu0Var;
        }
        tu0Var.f = on3Var;
        tu0Var.g = j;
        e20Var.o = 0L;
        this.S = tu0Var;
    }
}
