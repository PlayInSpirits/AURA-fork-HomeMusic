package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 extends ir2 {
    public final zh0 f;
    public final aw g;
    public sk4 h;

    public hy2(g74 g74Var, zh0 zh0Var, q70 q70Var, oo0 oo0Var) {
        super(g74Var, q70Var, oo0Var);
        this.f = zh0Var;
        this.g = su3.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public static final Object E(hy2 hy2Var, g74 g74Var, cy2 cy2Var, float f, float f2, wd0 wd0Var) {
        dy2 dy2Var;
        j15 j15Var;
        jx3 jx3Var;
        Object obj;
        gx3 gx3Var;
        float f3;
        g74 g74Var2;
        rf2 rf2Var = (rf2) hy2Var.e;
        if (wd0Var instanceof dy2) {
            dy2Var = (dy2) wd0Var;
            int i = dy2Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                dy2Var.s = i - Integer.MIN_VALUE;
            } else {
                dy2Var = new dy2(hy2Var, wd0Var);
            }
        } else {
            dy2Var = new dy2(hy2Var, wd0Var);
        }
        dy2 dy2Var2 = dy2Var;
        Object obj2 = dy2Var2.q;
        int i2 = dy2Var2.s;
        j15 j15Var2 = j15.a;
        Object obj3 = xe0.n;
        if (i2 == 0) {
            kb4.X(obj2);
            jx3 jx3Var2 = new jx3();
            jx3Var2.n = cy2Var;
            j15Var = j15Var2;
            long j = cy2Var.b;
            long j2 = cy2Var.a;
            ((m45) rf2Var.n).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
            ((m45) rf2Var.o).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
            cy2 cy2VarI = I(hy2Var.g);
            if (cy2VarI != null) {
                long j3 = cy2VarI.b;
                long j4 = cy2VarI.a;
                ((m45) rf2Var.n).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                ((m45) rf2Var.o).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                jx3Var = jx3Var2;
                jx3Var.n = ((cy2) jx3Var.n).a(cy2VarI);
            } else {
                jx3Var = jx3Var2;
            }
            gx3 gx3Var2 = new gx3();
            float fH = g74Var.h(g74Var.f(((cy2) jx3Var.n).a));
            gx3Var2.n = fH;
            if (!h12.b(fH)) {
                jx3 jx3Var3 = new jx3();
                jx3Var3.n = j51.a(0.0f, 0.0f, 30);
                obj = obj3;
                wf1 fy2Var = new fy2(gx3Var2, jx3Var3, jx3Var, f, hy2Var, f2, g74Var, null);
                dy2Var2.n = g74Var;
                dy2Var2.o = gx3Var2;
                dy2Var2.p = f2;
                dy2Var2.s = 1;
                if (hy2Var.D(fy2Var, dy2Var2) != obj) {
                    gx3Var = gx3Var2;
                    f3 = f2;
                    g74Var2 = g74Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                kb4.X(obj2);
                return j15Var2;
            }
            kf2.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = dy2Var2.p;
        gx3Var = dy2Var2.o;
        g74Var2 = dy2Var2.n;
        kb4.X(obj2);
        obj = obj3;
        j15Var = j15Var2;
        long jH = e35.h(((m45) rf2Var.n).b(Float.MAX_VALUE), ((m45) rf2Var.o).b(Float.MAX_VALUE));
        if (jH == 0) {
            float fE = g74Var2.e(Math.signum(gx3Var.n)) * Math.min(Math.abs(gx3Var.n) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                jH = 0;
            } else {
                jH = g74Var2.d == hb3.o ? e35.h(fE, 0.0f) : e35.h(0.0f, fE);
            }
        }
        wf1 wf1Var = (wf1) hy2Var.c;
        k45 k45Var = new k45(jH);
        dy2Var2.n = null;
        dy2Var2.o = null;
        dy2Var2.s = 2;
        return wf1Var.invoke(k45Var, dy2Var2) == obj ? obj : j15Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object F(hy2 hy2Var, jx3 jx3Var, gx3 gx3Var, g74 g74Var, jx3 jx3Var2, long j, wd0 wd0Var) throws Throwable {
        gy2 gy2Var;
        gx3 gx3Var2;
        g74 g74Var2;
        jx3 jx3Var3;
        boolean z;
        if (wd0Var instanceof gy2) {
            gy2Var = (gy2) wd0Var;
            int i = gy2Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                gy2Var.t = i - Integer.MIN_VALUE;
            } else {
                gy2Var = new gy2(wd0Var);
            }
        } else {
            gy2Var = new gy2(wd0Var);
        }
        Object objJ0 = gy2Var.s;
        int i2 = gy2Var.t;
        vd0 vd0Var = null;
        if (i2 == 0) {
            kb4.X(objJ0);
            if (j < 0) {
                return Boolean.FALSE;
            }
            ac0 ac0Var = new ac0(hy2Var, vd0Var, 4);
            gy2Var.n = hy2Var;
            gy2Var.o = jx3Var;
            gy2Var.p = gx3Var;
            gy2Var.q = g74Var;
            gy2Var.r = jx3Var2;
            gy2Var.t = 1;
            objJ0 = gb.j0(j, ac0Var, gy2Var);
            xe0 xe0Var = xe0.n;
            if (objJ0 == xe0Var) {
                return xe0Var;
            }
            gx3Var2 = gx3Var;
            g74Var2 = g74Var;
            jx3Var3 = jx3Var2;
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jx3 jx3Var4 = gy2Var.r;
            g74 g74Var3 = gy2Var.q;
            gx3Var2 = gy2Var.p;
            jx3 jx3Var5 = gy2Var.o;
            hy2 hy2Var2 = gy2Var.n;
            kb4.X(objJ0);
            jx3Var3 = jx3Var4;
            g74Var2 = g74Var3;
            jx3Var = jx3Var5;
            hy2Var = hy2Var2;
        }
        cy2 cy2Var = (cy2) objJ0;
        if (cy2Var != null) {
            boolean z2 = ((cy2) jx3Var.n).c;
            long j2 = cy2Var.a;
            jx3Var.n = new cy2(j2, cy2Var.b, z2);
            gx3Var2.n = g74Var2.j(g74Var2.f(j2));
            jx3Var3.n = j51.a(0.0f, 0.0f, 30);
            rf2 rf2Var = (rf2) hy2Var.e;
            long j3 = cy2Var.b;
            long j4 = cy2Var.a;
            ((m45) rf2Var.n).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((m45) rf2Var.o).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            z = !h12.b(gx3Var2.n);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static cy2 I(aw awVar) {
        cy2 cy2Var = null;
        ba4 ba4VarC = si0.C(new kb1(new by2(awVar, 0), null));
        while (ba4VarC.hasNext()) {
            cy2 cy2VarA = (cy2) ba4VarC.next();
            if (cy2Var != null) {
                cy2VarA = cy2Var.a(cy2VarA);
            }
            cy2Var = cy2VarA;
        }
        return cy2Var;
    }

    public final float G(e74 e74Var, float f) {
        g74 g74Var = (g74) this.b;
        long jI = g74Var.i(g74Var.e(f));
        g74 g74Var2 = e74Var.a;
        return g74Var.h(g74Var.f(g74Var2.d(g74Var2.k, jI, 1)));
    }

    public final boolean H(kn3 kn3Var) {
        long j;
        oo0 oo0Var = (oo0) this.d;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.o;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? r50.h(viewConfiguration) : oo0Var.M(64.0f));
        float f2 = -(i > 26 ? r50.e(viewConfiguration) : oo0Var.M(64.0f));
        List list = kn3Var.a;
        g83 g83Var = new g83(0L);
        int size = list.size();
        boolean zC = false;
        int i2 = 0;
        while (true) {
            j = g83Var.a;
            if (i2 >= size) {
                break;
            }
            g83Var = new g83(g83.e(j, ((on3) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        g74 g74Var = (g74) this.b;
        float fJ = g74Var.j(g74Var.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            a74 a74Var = g74Var.a;
            zC = fJ > 0.0f ? a74Var.c() : a74Var.b();
        }
        if (zC) {
            return !(this.g.d(new cy2(jFloatToRawIntBits, ((on3) q40.w0(kn3Var.a)).b, false)) instanceof i10);
        }
        return this.a;
    }
}
