package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ro2 {
    public final nj0 c;
    public final yp4 d;
    public final cn e;
    public long f;
    public int g;
    public boolean h;
    public oo2 i;
    public oo2 j;
    public oo2 k;
    public oo2 l;
    public oo2 m;
    public int n;
    public Object o;
    public long p;
    public final zt4 a = new zt4();
    public final bu4 b = new bu4();
    public ArrayList q = new ArrayList();

    public ro2(nj0 nj0Var, yp4 yp4Var, cn cnVar) {
        this.c = nj0Var;
        this.d = yp4Var;
        this.e = cnVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[LOOP:0: B:3:0x0013->B:28:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[EDGE_INSN: B:40:0x006d->B:29:0x006d BREAK  A[LOOP:0: B:3:0x0013->B:28:0x0062], SYNTHETIC] */
    public static mt2 p(cu4 cu4Var, Object obj, long j, long j2, bu4 bu4Var, zt4 zt4Var) {
        cu4Var.g(obj, zt4Var);
        cu4Var.n(zt4Var.c, bu4Var);
        int iB = cu4Var.b(obj);
        Object obj2 = obj;
        while (true) {
            int i = zt4Var.g.a;
            if (i == 0) {
                break;
            }
            if ((i == 1 && zt4Var.g(0)) || !zt4Var.h(zt4Var.g.d)) {
                break;
            }
            long j3 = 0;
            if (zt4Var.c(0L) != -1) {
                break;
            }
            if (zt4Var.d == 0) {
                if (iB <= bu4Var.n) {
                    break;
                    break;
                }
                cu4Var.f(iB, zt4Var, true);
                obj2 = zt4Var.b;
                obj2.getClass();
                iB++;
            } else {
                int i2 = i - (zt4Var.g(i + (-1)) ? 2 : 1);
                for (int i3 = 0; i3 <= i2; i3++) {
                    j3 += zt4Var.g.a(i3).j;
                }
                if (zt4Var.d > j3) {
                    break;
                }
                if (iB <= bu4Var.n) {
                    break;
                }
                cu4Var.f(iB, zt4Var, true);
                obj2 = zt4Var.b;
                obj2.getClass();
                iB++;
            }
        }
        cu4Var.g(obj2, zt4Var);
        int iC = zt4Var.c(j);
        return iC == -1 ? new mt2(obj2, j2, zt4Var.b(j)) : new mt2(obj2, iC, zt4Var.f(iC), j2, -1);
    }

    public final oo2 a() {
        oo2 oo2Var = this.i;
        if (oo2Var == null) {
            return null;
        }
        if (oo2Var == this.j) {
            this.j = oo2Var.m;
        }
        if (oo2Var == this.k) {
            this.k = oo2Var.m;
        }
        oo2Var.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            oo2 oo2Var2 = this.i;
            this.o = oo2Var2.b;
            this.p = oo2Var2.g.a.d;
        }
        this.i = this.i.m;
        m();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        oo2 oo2Var = this.i;
        oo2Var.getClass();
        this.o = oo2Var.b;
        this.p = oo2Var.g.a.d;
        while (oo2Var != null) {
            oo2Var.i();
            oo2Var = oo2Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        m();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    public final po2 c(cu4 cu4Var, oo2 oo2Var, long j) {
        Object obj;
        long j2;
        long j3;
        long j4;
        po2 po2Var = oo2Var.g;
        mt2 mt2Var = po2Var.a;
        long j5 = po2Var.c;
        int iD = cu4Var.d(cu4Var.b(mt2Var.a), this.a, this.b, this.g, this.h);
        if (iD == -1) {
            return null;
        }
        zt4 zt4Var = this.a;
        int i = cu4Var.f(iD, zt4Var, true).c;
        Object obj2 = zt4Var.b;
        obj2.getClass();
        long j6 = mt2Var.d;
        long j7 = 0;
        if (cu4Var.m(i, this.b, 0L).m == iD) {
            Pair pairJ = cu4Var.j(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j));
            if (pairJ == null) {
                return null;
            }
            Object obj3 = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            oo2 oo2Var2 = oo2Var.m;
            if (oo2Var2 == null || !oo2Var2.b.equals(obj3)) {
                long jR = r(obj3);
                if (jR == -1) {
                    jR = this.f;
                    this.f = 1 + jR;
                }
                j6 = jR;
            } else {
                j6 = oo2Var2.g.a.d;
            }
            obj = obj3;
            j2 = jLongValue;
            j7 = -9223372036854775807L;
        } else {
            obj = obj2;
            j2 = 0;
        }
        mt2 mt2VarP = p(cu4Var, obj, j2, j6, this.b, this.a);
        if (j7 == -9223372036854775807L || j5 == -9223372036854775807L) {
            j3 = j2;
            j4 = j7;
        } else {
            int i2 = cu4Var.g(mt2Var.a, zt4Var).g.a;
            int i3 = zt4Var.g.d;
            boolean z = i2 > 0 && zt4Var.h(i3) && (i2 > 1 || zt4Var.d(i3) != Long.MIN_VALUE);
            if (mt2VarP.b() && z) {
                j3 = j2;
                j4 = j5;
            } else {
                if (z) {
                    j3 = j5;
                } else {
                    j3 = j2;
                }
                j4 = j7;
            }
        }
        return e(cu4Var, mt2VarP, j4, j3);
    }

    public final po2 d(cu4 cu4Var, oo2 oo2Var, long j) {
        cu4 cu4Var2;
        po2 po2Var = oo2Var.g;
        long j2 = (oo2Var.p + po2Var.e) - j;
        if (po2Var.h) {
            return c(cu4Var, oo2Var, j2);
        }
        mt2 mt2Var = po2Var.a;
        Object obj = mt2Var.a;
        int i = mt2Var.e;
        zt4 zt4Var = this.a;
        cu4Var.g(obj, zt4Var);
        boolean z = po2Var.g;
        if (!mt2Var.b()) {
            if (i != -1 && zt4Var.g(i)) {
                return c(cu4Var, oo2Var, j2);
            }
            int iF = zt4Var.f(i);
            boolean z2 = zt4Var.h(i) && zt4Var.e(i, iF) == 3;
            if (iF != zt4Var.g.a(i).b && !z2) {
                return f(cu4Var, mt2Var.a, mt2Var.e, iF, po2Var.e, mt2Var.d, z);
            }
            cu4Var.g(obj, zt4Var);
            long jD = zt4Var.d(i);
            return g(cu4Var, mt2Var.a, jD == Long.MIN_VALUE ? zt4Var.d : zt4Var.g.a(i).j + jD, po2Var.e, mt2Var.d, false);
        }
        int i2 = mt2Var.b;
        int i3 = zt4Var.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int iA = zt4Var.g.a(i2).a(mt2Var.c);
        if (iA < i3) {
            return f(cu4Var, mt2Var.a, i2, iA, po2Var.c, mt2Var.d, z);
        }
        long jLongValue = po2Var.c;
        if (jLongValue == -9223372036854775807L) {
            Pair pairJ = cu4Var.j(this.b, zt4Var, zt4Var.c, -9223372036854775807L, Math.max(0L, j2));
            cu4Var2 = cu4Var;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            cu4Var2 = cu4Var;
        }
        int i4 = mt2Var.b;
        cu4Var2.g(obj, zt4Var);
        long jD2 = zt4Var.d(i4);
        return g(cu4Var, mt2Var.a, Math.max(jD2 == Long.MIN_VALUE ? zt4Var.d : zt4Var.g.a(i4).j + jD2, jLongValue), po2Var.c, mt2Var.d, z);
    }

    public final po2 e(cu4 cu4Var, mt2 mt2Var, long j, long j2) {
        cu4Var.g(mt2Var.a, this.a);
        boolean zB = mt2Var.b();
        Object obj = mt2Var.a;
        return zB ? f(cu4Var, obj, mt2Var.b, mt2Var.c, j, mt2Var.d, false) : g(cu4Var, obj, j2, j, mt2Var.d, false);
    }

    public final po2 f(cu4 cu4Var, Object obj, int i, int i2, long j, long j2, boolean z) {
        mt2 mt2Var = new mt2(obj, i, i2, j2, -1);
        zt4 zt4Var = this.a;
        long jA = cu4Var.g(obj, zt4Var).a(i, i2);
        long jMax = i2 == zt4Var.f(i) ? zt4Var.g.b : 0L;
        boolean zH = zt4Var.h(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new po2(mt2Var, jMax, j, -9223372036854775807L, jA, z, zH, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    public final po2 g(cu4 cu4Var, Object obj, long j, long j2, long j3, boolean z) {
        boolean z2;
        boolean z3;
        long j4;
        long jD;
        long j5;
        long jMax;
        zt4 zt4Var = this.a;
        cu4Var.g(obj, zt4Var);
        int iB = zt4Var.b(j);
        int i = 1;
        if (iB == -1) {
            z5 z5Var = zt4Var.g;
            if (z5Var.a <= 0 || !zt4Var.h(z5Var.d)) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else if (zt4Var.h(iB) && zt4Var.d(iB) == zt4Var.d) {
            x5 x5VarA = zt4Var.g.a(iB);
            int i2 = x5VarA.b;
            if (i2 == -1) {
                z2 = true;
                break;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z2 = false;
                    break;
                }
                int i4 = x5VarA.f[i3];
                if (i4 == 0 || i4 == 1) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                z3 = false;
            } else {
                z3 = true;
                iB = -1;
            }
        } else {
            z3 = false;
        }
        mt2 mt2Var = new mt2(obj, j3, iB);
        boolean z4 = !mt2Var.b() && iB == -1;
        boolean zK = k(cu4Var, mt2Var);
        boolean zJ = j(cu4Var, mt2Var, z4);
        boolean z5 = (iB == -1 || !zt4Var.h(iB) || zt4Var.g(iB)) ? false : true;
        boolean z6 = iB != -1 && zt4Var.g(iB) && zt4Var.h(iB);
        if (iB == -1 || z6) {
            if (z3) {
                jD = zt4Var.d;
            } else {
                j4 = -9223372036854775807L;
            }
            if (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) {
                j5 = zt4Var.d;
            } else {
                j5 = j4;
            }
            if (j5 != -9223372036854775807L || j < j5) {
                jMax = j;
            } else {
                if (!zJ && z3) {
                    i = 0;
                }
                jMax = Math.max(0L, j5 - ((long) i));
            }
            return new po2(mt2Var, jMax, j2, j4, j5, z, z5, z4, zK, zJ);
        }
        jD = zt4Var.d(iB);
        j4 = jD;
        if (j4 != -9223372036854775807L) {
            j5 = zt4Var.d;
        } else {
            j5 = zt4Var.d;
        }
        if (j5 != -9223372036854775807L) {
            jMax = j;
        } else {
            jMax = j;
        }
        return new po2(mt2Var, jMax, j2, j4, j5, z, z5, z4, zK, zJ);
    }

    public final oo2 h() {
        return this.k;
    }

    public final po2 i(cu4 cu4Var, po2 po2Var) {
        long jA;
        boolean z;
        mt2 mt2Var = po2Var.a;
        boolean zB = mt2Var.b();
        int i = mt2Var.e;
        boolean zH = false;
        boolean z2 = !zB && i == -1;
        int i2 = mt2Var.b;
        boolean zK = k(cu4Var, mt2Var);
        boolean zJ = j(cu4Var, mt2Var, z2);
        Object obj = mt2Var.a;
        zt4 zt4Var = this.a;
        cu4Var.g(obj, zt4Var);
        long jD = (mt2Var.b() || i == -1) ? -9223372036854775807L : zt4Var.d(i);
        if (mt2Var.b()) {
            jA = zt4Var.a(i2, mt2Var.c);
        } else {
            jA = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? zt4Var.d : jD;
        }
        if (!mt2Var.b()) {
            if (i != -1 && zt4Var.h(i)) {
                z = true;
            }
            return new po2(mt2Var, po2Var.b, po2Var.c, jD, jA, po2Var.f, z, z2, zK, zJ);
        }
        zH = zt4Var.h(i2);
        z = zH;
        return new po2(mt2Var, po2Var.b, po2Var.c, jD, jA, po2Var.f, z, z2, zK, zJ);
    }

    public final boolean j(cu4 cu4Var, mt2 mt2Var, boolean z) {
        int iB = cu4Var.b(mt2Var.a);
        if (!cu4Var.m(cu4Var.f(iB, this.a, false).c, this.b, 0L).h) {
            if (cu4Var.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(cu4 cu4Var, mt2 mt2Var) {
        boolean z = !mt2Var.b() && mt2Var.e == -1;
        Object obj = mt2Var.a;
        if (z) {
            if (cu4Var.m(cu4Var.g(obj, this.a).c, this.b, 0L).n == cu4Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        oo2 oo2Var = this.m;
        if (oo2Var == null || oo2Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                oo2 oo2Var2 = (oo2) this.q.get(i);
                if (!oo2Var2.h()) {
                    this.m = oo2Var2;
                    return;
                }
            }
        }
    }

    public final void m() {
        uw1 uw1VarJ = yw1.j();
        for (oo2 oo2Var = this.i; oo2Var != null; oo2Var = oo2Var.m) {
            uw1VarJ.c(oo2Var.g.a);
        }
        oo2 oo2Var2 = this.j;
        this.d.d(new qo2(this, uw1VarJ, oo2Var2 == null ? null : oo2Var2.g.a, 0));
    }

    public final void n(long j) {
        oo2 oo2Var = this.l;
        if (oo2Var != null) {
            rr2.w(oo2Var.m == null);
            if (oo2Var.e) {
                oo2Var.a.u(j - oo2Var.p);
            }
        }
    }

    public final int o(oo2 oo2Var) {
        oo2Var.getClass();
        int i = 0;
        if (oo2Var != this.l) {
            this.l = oo2Var;
            while (true) {
                oo2Var = oo2Var.m;
                if (oo2Var == null) {
                    break;
                }
                if (oo2Var == this.j) {
                    oo2 oo2Var2 = this.i;
                    this.j = oo2Var2;
                    this.k = oo2Var2;
                    i = 3;
                }
                if (oo2Var == this.k) {
                    this.k = this.j;
                    i |= 2;
                }
                oo2Var.i();
                this.n--;
            }
            oo2 oo2Var3 = this.l;
            oo2Var3.getClass();
            if (oo2Var3.m != null) {
                oo2Var3.b();
                oo2Var3.m = null;
                oo2Var3.c();
            }
            m();
        }
        return i;
    }

    public final mt2 q(cu4 cu4Var, Object obj, long j) {
        long jR;
        int iB;
        Object obj2 = obj;
        zt4 zt4Var = this.a;
        int i = cu4Var.g(obj2, zt4Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (iB = cu4Var.b(obj3)) == -1 || cu4Var.f(iB, zt4Var, false).c != i) {
            oo2 oo2Var = this.i;
            while (true) {
                if (oo2Var == null) {
                    oo2 oo2Var2 = this.i;
                    while (true) {
                        if (oo2Var2 == null) {
                            jR = r(obj2);
                            if (jR != -1) {
                                break;
                            }
                            jR = this.f;
                            this.f = 1 + jR;
                            if (this.i != null) {
                                break;
                            }
                            this.o = obj2;
                            this.p = jR;
                            break;
                        }
                        int iB2 = cu4Var.b(oo2Var2.b);
                        if (iB2 != -1 && cu4Var.f(iB2, zt4Var, false).c == i) {
                            jR = oo2Var2.g.a.d;
                            break;
                        }
                        oo2Var2 = oo2Var2.m;
                    }
                } else {
                    if (oo2Var.b.equals(obj2)) {
                        jR = oo2Var.g.a.d;
                        break;
                    }
                    oo2Var = oo2Var.m;
                }
            }
        } else {
            jR = this.p;
        }
        cu4Var.g(obj2, zt4Var);
        int i2 = zt4Var.c;
        bu4 bu4Var = this.b;
        cu4Var.n(i2, bu4Var);
        boolean z = false;
        for (int iB3 = cu4Var.b(obj); iB3 >= bu4Var.m; iB3--) {
            cu4Var.f(iB3, zt4Var, true);
            boolean z2 = zt4Var.g.a > 0;
            z |= z2;
            if (zt4Var.c(zt4Var.d) != -1) {
                obj2 = zt4Var.b;
                obj2.getClass();
            }
            if (z && (!z2 || zt4Var.d != 0)) {
                break;
            }
        }
        return p(cu4Var, obj2, j, jR, this.b, this.a);
    }

    public final long r(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            oo2 oo2Var = (oo2) this.q.get(i);
            if (oo2Var.b.equals(obj)) {
                return oo2Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int s(cu4 cu4Var) {
        cu4 cu4Var2;
        oo2 oo2Var;
        oo2 oo2Var2 = this.i;
        if (oo2Var2 == null) {
            return 0;
        }
        int iB = cu4Var.b(oo2Var2.b);
        while (true) {
            cu4Var2 = cu4Var;
            iB = cu4Var2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                oo2Var = oo2Var2.m;
                if (oo2Var == null || oo2Var2.g.h) {
                    break;
                }
                oo2Var2 = oo2Var;
            }
            if (iB == -1 || oo2Var == null || cu4Var2.b(oo2Var.b) != iB) {
                break;
            }
            oo2Var2 = oo2Var;
            cu4Var = cu4Var2;
        }
        int iO = o(oo2Var2);
        oo2Var2.g = i(cu4Var2, oo2Var2.g);
        return iO;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    public final int t(cu4 cu4Var, long j, long j2, long j3) {
        po2 po2VarI;
        boolean z;
        oo2 oo2Var = this.i;
        oo2 oo2Var2 = null;
        while (true) {
            int i = 0;
            if (oo2Var == null) {
                return 0;
            }
            po2 po2Var = oo2Var.g;
            if (oo2Var2 == null) {
                po2VarI = i(cu4Var, po2Var);
            } else {
                po2 po2VarD = d(cu4Var, oo2Var2, j);
                if (po2VarD == null || po2Var.b != po2VarD.b || !po2Var.a.equals(po2VarD.a)) {
                    return o(oo2Var2);
                }
                po2VarI = po2VarD;
            }
            long j4 = po2VarI.e;
            long j5 = po2Var.c;
            long j6 = po2Var.e;
            oo2Var.g = po2VarI.a(j5);
            if (j6 != j4) {
                oo2Var.k();
                long j7 = j4 == -9223372036854775807L ? Long.MAX_VALUE : j4 + oo2Var.p;
                boolean z2 = oo2Var == this.j && !oo2Var.g.g && (j2 == Long.MIN_VALUE || j2 >= j7);
                boolean z3 = oo2Var == this.k && (j3 == Long.MIN_VALUE || j3 >= j7);
                int iO = o(oo2Var);
                if (iO != 0) {
                    return iO;
                }
                if (j6 == -9223372036854775807L && po2Var.d == Long.MIN_VALUE) {
                    long j8 = po2VarI.d;
                    if (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z2 && (j6 != -9223372036854775807L || z)) {
                    i = 1;
                }
                return z3 ? i | 2 : i;
            }
            oo2Var2 = oo2Var;
            oo2Var = oo2Var.m;
        }
    }
}
