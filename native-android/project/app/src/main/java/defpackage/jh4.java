package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jh4 {
    public static final o54 a = new o54(15);
    public static final z05 b = new z05(9);
    public static final Object c = new Object();
    public static gh4 d;
    public static long e;
    public static final fd f;
    public static final ue1 g;
    public static List h;
    public static List i;
    public static final yi1 j;
    public static final fl k;

    static {
        gh4 gh4Var = gh4.r;
        d = gh4Var;
        e = 2L;
        fd fdVar = new fd();
        fdVar.c = new long[16];
        fdVar.d = new int[16];
        int[] iArr = new int[16];
        byte b2 = 0;
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        fdVar.e = iArr;
        f = fdVar;
        ue1 ue1Var = new ue1(12, b2);
        ue1Var.p = new int[16];
        ue1Var.q = new i95[16];
        g = ue1Var;
        u01 u01Var = u01.n;
        h = u01Var;
        i = u01Var;
        long j2 = e;
        e = 1 + j2;
        yi1 yi1Var = new yi1(j2, gh4Var, null, new k2(20, b2));
        d = d.f(yi1Var.b);
        j = yi1Var;
        k = new fl(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, a13 a13Var, gh4 gh4Var) {
        long[] jArr;
        gh4 gh4Var2;
        long[] jArr2;
        int i2;
        int i3;
        tl4 tl4VarS;
        x03 x03VarX = a13Var.x();
        if (x03VarX != null) {
            long jG = a13Var.g();
            gh4 gh4VarE = a13Var.d().f(jG).e(a13Var.j);
            Object[] objArr = x03VarX.b;
            long[] jArr3 = x03VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                rl4 rl4Var = (rl4) objArr[(i4 << 3) + i7];
                                tl4 tl4VarA = rl4Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                tl4 tl4VarS2 = s(tl4VarA, j2, gh4Var);
                                if (tl4VarS2 != null && (tl4VarS = s(tl4VarA, jG, gh4VarE)) != null && !tl4VarS2.equals(tl4VarS)) {
                                    tl4 tl4VarS3 = s(tl4VarA, jG, a13Var.d());
                                    if (tl4VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    tl4 tl4VarB = rl4Var.b(tl4VarS, tl4VarS2, tl4VarS3);
                                    if (tl4VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(tl4VarS2, tl4VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            gh4VarE = gh4VarE;
                        }
                        jArr = jArr3;
                        gh4Var2 = gh4VarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        gh4Var2 = gh4VarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    gh4VarE = gh4Var2;
                }
            }
        }
        return null;
    }

    public static final void c(ch4 ch4Var) {
        Long lValueOf;
        if (d.d(ch4Var.g())) {
            return;
        }
        long jG = ch4Var.g();
        boolean z = ch4Var.c;
        a13 a13Var = ch4Var instanceof a13 ? (a13) ch4Var : null;
        Object objValueOf = a13Var != null ? Boolean.valueOf(a13Var.m) : "read-only";
        synchronized (c) {
            fd fdVar = f;
            lValueOf = Long.valueOf(fdVar.a > 0 ? ((long[]) fdVar.c)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + objValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final gh4 d(gh4 gh4Var, long j2, long j3) {
        while (h12.k(j2, j3) < 0) {
            gh4Var = gh4Var.f(j2);
            j2++;
        }
        return gh4Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[LOOP:1: B:30:0x0056->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0093 A[EDGE_INSN: B:58:0x0093->B:44:0x0093 BREAK  A[LOOP:1: B:30:0x0056->B:43:0x0090], SYNTHETIC] */
    public static final Object e(if1 if1Var) {
        x03 x03Var;
        Object objV;
        yi1 yi1Var = j;
        synchronized (c) {
            try {
                x03Var = yi1Var.h;
                if (x03Var != null) {
                    k.addAndGet(1);
                }
                objV = v(yi1Var, if1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (x03Var != null) {
            try {
                List list = h;
                x54 x54Var = new x54(x03Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((wf1) list.get(i2)).invoke(x54Var, yi1Var);
                }
                k.addAndGet(-1);
            } catch (Throwable th2) {
                k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (c) {
            f();
            if (x03Var != null) {
                Object[] objArr = x03Var.b;
                long[] jArr = x03Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    q((rl4) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                            if (i3 != length) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
        }
        return objV;
    }

    public static final void f() {
        ue1 ue1Var = g;
        int i2 = ue1Var.o;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            i95 i95Var = ((i95[]) ue1Var.q)[i3];
            Object obj = i95Var != null ? i95Var.get() : null;
            if (obj != null && p((rl4) obj)) {
                if (i4 != i3) {
                    ((i95[]) ue1Var.q)[i4] = i95Var;
                    int[] iArr = (int[]) ue1Var.p;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((i95[]) ue1Var.q)[i5] = null;
            ((int[]) ue1Var.p)[i5] = 0;
        }
        if (i4 != i2) {
            ue1Var.o = i4;
        }
    }

    public static final ch4 g(ch4 ch4Var, if1 if1Var, boolean z) {
        boolean z2 = ch4Var instanceof a13;
        if (z2 || ch4Var == null) {
            return new ox4(z2 ? (a13) ch4Var : null, if1Var, null, false, z);
        }
        return new px4(ch4Var, if1Var, false, z);
    }

    public static final tl4 h(tl4 tl4Var) {
        tl4 tl4VarS;
        ch4 ch4VarJ = j();
        tl4 tl4VarS2 = s(tl4Var, ch4VarJ.g(), ch4VarJ.d());
        if (tl4VarS2 != null) {
            return tl4VarS2;
        }
        synchronized (c) {
            ch4 ch4VarJ2 = j();
            tl4VarS = s(tl4Var, ch4VarJ2.g(), ch4VarJ2.d());
        }
        if (tl4VarS != null) {
            return tl4VarS;
        }
        r();
        throw null;
    }

    public static final tl4 i(tl4 tl4Var, ch4 ch4Var) {
        tl4 tl4VarS;
        tl4 tl4VarS2 = s(tl4Var, ch4Var.g(), ch4Var.d());
        if (tl4VarS2 != null) {
            return tl4VarS2;
        }
        synchronized (c) {
            tl4VarS = s(tl4Var, ch4Var.g(), ch4Var.d());
        }
        if (tl4VarS != null) {
            return tl4VarS;
        }
        r();
        throw null;
    }

    public static final ch4 j() {
        ch4 ch4Var = (ch4) b.f();
        return ch4Var == null ? j : ch4Var;
    }

    public static final if1 k(if1 if1Var, if1 if1Var2, boolean z) {
        if (!z) {
            if1Var2 = null;
        }
        if (if1Var == null || if1Var2 == null || if1Var == if1Var2) {
            return if1Var == null ? if1Var2 : if1Var;
        }
        return new hh4(if1Var, if1Var2, 0);
    }

    public static final if1 l(if1 if1Var, if1 if1Var2) {
        if (if1Var == null || if1Var2 == null || if1Var == if1Var2) {
            return if1Var == null ? if1Var2 : if1Var;
        }
        return new hh4(if1Var, if1Var2, 1);
    }

    public static final tl4 m(tl4 tl4Var, rl4 rl4Var) {
        long j2 = e;
        fd fdVar = f;
        if (fdVar.a > 0) {
            j2 = ((long[]) fdVar.c)[0];
        }
        long j3 = j2 - 1;
        tl4 tl4Var2 = null;
        tl4 tl4Var3 = null;
        for (tl4 tl4VarA = rl4Var.a(); tl4VarA != null; tl4VarA = tl4VarA.b) {
            long j4 = tl4VarA.a;
            if (j4 != 0) {
                if (j4 != 0 && h12.k(j4, j3) <= 0 && !gh4.r.d(j4)) {
                    if (tl4Var3 != null) {
                        if (h12.k(tl4VarA.a, tl4Var3.a) >= 0) {
                            tl4Var2 = tl4Var3;
                            break;
                        }
                        break;
                    }
                    tl4Var3 = tl4VarA;
                }
            }
            tl4Var2 = tl4VarA;
            break;
        }
        if (tl4Var2 != null) {
            tl4Var2.a = Long.MAX_VALUE;
            return tl4Var2;
        }
        tl4 tl4VarB = tl4Var.b(Long.MAX_VALUE);
        tl4VarB.b = rl4Var.a();
        rl4Var.d(tl4VarB);
        return tl4VarB;
    }

    public static final void n(ch4 ch4Var, rl4 rl4Var) {
        ch4Var.t(ch4Var.h() + 1);
        if1 if1VarI = ch4Var.i();
        if (if1VarI != null) {
            if1VarI.invoke(rl4Var);
        }
    }

    public static final tl4 o(tl4 tl4Var, sl4 sl4Var, ch4 ch4Var, tl4 tl4Var2) {
        tl4 tl4VarM;
        if (ch4Var.f()) {
            ch4Var.n(sl4Var);
        }
        long jG = ch4Var.g();
        if (tl4Var2.a == jG) {
            return tl4Var2;
        }
        synchronized (c) {
            tl4VarM = m(tl4Var, sl4Var);
        }
        tl4VarM.a = jG;
        ch4Var.n(sl4Var);
        return tl4VarM;
    }

    public static final boolean p(rl4 rl4Var) {
        tl4 tl4Var;
        long j2 = e;
        fd fdVar = f;
        if (fdVar.a > 0) {
            j2 = ((long[]) fdVar.c)[0];
        }
        tl4 tl4Var2 = null;
        tl4 tl4VarA = null;
        int i2 = 0;
        for (tl4 tl4VarA2 = rl4Var.a(); tl4VarA2 != null; tl4VarA2 = tl4VarA2.b) {
            long j3 = tl4VarA2.a;
            if (j3 != 0) {
                if (h12.k(j3, j2) >= 0) {
                    i2++;
                } else if (tl4Var2 == null) {
                    i2++;
                    tl4Var2 = tl4VarA2;
                } else {
                    if (h12.k(tl4VarA2.a, tl4Var2.a) < 0) {
                        tl4Var = tl4Var2;
                        tl4Var2 = tl4VarA2;
                    } else {
                        tl4Var = tl4VarA2;
                    }
                    if (tl4VarA == null) {
                        tl4VarA = rl4Var.a();
                        tl4 tl4Var3 = tl4VarA;
                        while (true) {
                            if (tl4VarA == null) {
                                tl4VarA = tl4Var3;
                                break;
                            }
                            if (h12.k(tl4VarA.a, j2) >= 0) {
                                break;
                            }
                            if (h12.k(tl4Var3.a, tl4VarA.a) < 0) {
                                tl4Var3 = tl4VarA;
                            }
                            tl4VarA = tl4VarA.b;
                        }
                    }
                    tl4Var2.a = 0L;
                    tl4Var2.a(tl4VarA);
                    tl4Var2 = tl4Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(rl4 rl4Var) {
        if (p(rl4Var)) {
            ue1 ue1Var = g;
            int i2 = ue1Var.o;
            int iIdentityHashCode = System.identityHashCode(rl4Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = ue1Var.o - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) ue1Var.p)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        i95 i95Var = ((i95[]) ue1Var.q)[i6];
                        if (rl4Var == (i95Var != null ? i95Var.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        int i8 = i6 - 1;
                        while (true) {
                            if (-1 >= i8 || ((int[]) ue1Var.p)[i8] != iIdentityHashCode) {
                                i6++;
                                int i9 = ue1Var.o;
                                while (true) {
                                    if (i6 >= i9) {
                                        i3 = -(ue1Var.o + 1);
                                        break;
                                    }
                                    if (((int[]) ue1Var.p)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    i95 i95Var2 = ((i95[]) ue1Var.q)[i6];
                                    if ((i95Var2 != null ? i95Var2.get() : null) == rl4Var) {
                                        i3 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                i95 i95Var3 = ((i95[]) ue1Var.q)[i8];
                                if ((i95Var3 != null ? i95Var3.get() : null) == rl4Var) {
                                    i3 = i8;
                                    break;
                                }
                                i8--;
                            }
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            i95[] i95VarArr = (i95[]) ue1Var.q;
            int length = i95VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                i95[] i95VarArr2 = new i95[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(i95VarArr, i10, i95VarArr2, i12, i2 - i10);
                System.arraycopy((i95[]) ue1Var.q, 0, i95VarArr2, 0, i10);
                ti.Y(i12, i10, i2, (int[]) ue1Var.p, iArr);
                ti.b0(0, i10, 6, (int[]) ue1Var.p, iArr);
                ue1Var.q = i95VarArr2;
                ue1Var.p = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(i95VarArr, i10, i95VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) ue1Var.p;
                ti.Y(i13, i10, i2, iArr2, iArr2);
            }
            ((i95[]) ue1Var.q)[i10] = new i95(rl4Var);
            ((int[]) ue1Var.p)[i10] = iIdentityHashCode;
            ue1Var.o++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final tl4 s(tl4 tl4Var, long j2, gh4 gh4Var) {
        tl4 tl4Var2 = null;
        while (tl4Var != null) {
            long j3 = tl4Var.a;
            if (j3 != 0 && h12.k(j3, j2) <= 0 && !gh4Var.d(j3) && (tl4Var2 == null || h12.k(tl4Var2.a, tl4Var.a) < 0)) {
                tl4Var2 = tl4Var;
            }
            tl4Var = tl4Var.b;
        }
        if (tl4Var2 != null) {
            return tl4Var2;
        }
        return null;
    }

    public static final tl4 t(tl4 tl4Var, rl4 rl4Var) {
        tl4 tl4VarS;
        ch4 ch4VarJ = j();
        if1 if1VarE = ch4VarJ.e();
        if (if1VarE != null) {
            if1VarE.invoke(rl4Var);
        }
        tl4 tl4VarS2 = s(tl4Var, ch4VarJ.g(), ch4VarJ.d());
        if (tl4VarS2 != null) {
            return tl4VarS2;
        }
        synchronized (c) {
            ch4 ch4VarJ2 = j();
            tl4 tl4VarA = rl4Var.a();
            tl4VarA.getClass();
            tl4VarS = s(tl4VarA, ch4VarJ2.g(), ch4VarJ2.d());
            if (tl4VarS == null) {
                r();
                throw null;
            }
        }
        return tl4VarS;
    }

    public static final void u(int i2) {
        fd fdVar = f;
        int i3 = ((int[]) fdVar.e)[i2];
        fdVar.d(i3, fdVar.a - 1);
        fdVar.a--;
        long[] jArr = (long[]) fdVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (h12.k(jArr[i5], j2) <= 0) {
                break;
            }
            fdVar.d(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) fdVar.c;
        int i6 = fdVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < fdVar.a && h12.k(jArr2[i7], jArr2[i8]) < 0) {
                if (h12.k(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                fdVar.d(i7, i3);
                i3 = i7;
            } else {
                if (h12.k(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                fdVar.d(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) fdVar.e)[i2] = fdVar.b;
        fdVar.b = i2;
    }

    public static final Object v(yi1 yi1Var, if1 if1Var) {
        long j2 = yi1Var.b;
        Object objInvoke = if1Var.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        gh4 gh4VarB = d.b(j2);
        d = gh4VarB;
        yi1Var.b = j3;
        yi1Var.a = gh4VarB;
        yi1Var.g = 0;
        yi1Var.h = null;
        yi1Var.o();
        d = d.f(j3);
        return objInvoke;
    }

    public static final tl4 w(tl4 tl4Var, rl4 rl4Var, ch4 ch4Var) {
        tl4 tl4VarS;
        tl4 tl4VarS2;
        if (ch4Var.f()) {
            ch4Var.n(rl4Var);
        }
        long jG = ch4Var.g();
        tl4 tl4VarS3 = s(tl4Var, jG, ch4Var.d());
        if (tl4VarS3 == null) {
            synchronized (c) {
                ch4 ch4VarJ = j();
                tl4 tl4VarA = rl4Var.a();
                tl4VarA.getClass();
                tl4VarS2 = s(tl4VarA, ch4VarJ.g(), ch4VarJ.d());
                if (tl4VarS2 == null) {
                    r();
                    throw null;
                }
            }
            tl4VarS3 = tl4VarS2;
        }
        if (tl4VarS3.a == ch4Var.g()) {
            return tl4VarS3;
        }
        synchronized (c) {
            tl4VarS = s(rl4Var.a(), jG, ch4Var.d());
            if (tl4VarS == null) {
                r();
                throw null;
            }
            if (tl4VarS.a != jG) {
                tl4 tl4VarM = m(tl4VarS, rl4Var);
                tl4VarM.a(tl4VarS);
                tl4VarM.a = ch4Var.g();
                tl4VarS = tl4VarM;
            }
        }
        ch4Var.n(rl4Var);
        return tl4VarS;
    }
}
