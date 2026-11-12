package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oo2 {
    public final no2 a;
    public final Object b;
    public final q44[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public po2 g;
    public boolean h;
    public final boolean[] i;
    public final kq[] j;
    public final pn0 k;
    public final fo1 l;
    public oo2 m;
    public tv4 n;
    public ew4 o;
    public long p;

    public oo2(kq[] kqVarArr, long j, pn0 pn0Var, n9 n9Var, fo1 fo1Var, po2 po2Var, ew4 ew4Var) {
        this.j = kqVarArr;
        this.p = j;
        this.k = pn0Var;
        this.l = fo1Var;
        mt2 mt2Var = po2Var.a;
        this.b = mt2Var.a;
        this.g = po2Var;
        this.n = tv4.d;
        this.o = ew4Var;
        this.c = new q44[kqVarArr.length];
        this.i = new boolean[kqVarArr.length];
        long j2 = po2Var.b;
        long j3 = po2Var.d;
        boolean z = po2Var.f;
        fo1Var.getClass();
        Object obj = mt2Var.a;
        int i = tm3.n;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        mt2 mt2VarA = mt2Var.a(pair.second);
        bu2 bu2Var = (bu2) ((HashMap) fo1Var.e).get(obj2);
        bu2Var.getClass();
        ((HashSet) fo1Var.h).add(bu2Var);
        au2 au2Var = (au2) ((HashMap) fo1Var.g).get(bu2Var);
        if (au2Var != null) {
            au2Var.a.e(au2Var.b);
        }
        bu2Var.c.add(mt2VarA);
        no2 no2VarB = bu2Var.a.b(mt2VarA, n9Var, j2);
        ((IdentityHashMap) fo1Var.d).put(no2VarB, bu2Var);
        fo1Var.g();
        this.a = j3 != -9223372036854775807L ? new b40(no2VarB, !z, 0L, j3) : no2VarB;
    }

    public final long a(ew4 ew4Var, long j, boolean z, boolean[] zArr) {
        kq[] kqVarArr;
        q44[] q44VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= ew4Var.o) {
                break;
            }
            if (z || !ew4Var.m(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            kqVarArr = this.j;
            int length = kqVarArr.length;
            q44VarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (kqVarArr[i2].o == -2) {
                q44VarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = ew4Var;
        c();
        long jC = this.a.c((t41[]) ew4Var.q, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < kqVarArr.length; i3++) {
            if (kqVarArr[i3].o == -2 && this.o.n(i3)) {
                q44VarArr[i3] = new om0(24);
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < q44VarArr.length; i4++) {
            if (q44VarArr[i4] != null) {
                rr2.w(ew4Var.n(i4));
                if (kqVarArr[i4].o != -2) {
                    this.f = true;
                }
            } else {
                rr2.w(((t41[]) ew4Var.q)[i4] == null);
            }
        }
        return jC;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ew4 ew4Var = this.o;
            if (i >= ew4Var.o) {
                return;
            }
            boolean zN = ew4Var.n(i);
            t41 t41Var = ((t41[]) this.o.q)[i];
            if (zN && t41Var != null) {
                t41Var.k();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            ew4 ew4Var = this.o;
            if (i >= ew4Var.o) {
                return;
            }
            boolean zN = ew4Var.n(i);
            t41 t41Var = ((t41[]) this.o.q)[i];
            if (zN && t41Var != null) {
                t41Var.h();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jQ = this.f ? this.a.q() : Long.MIN_VALUE;
        return jQ == Long.MIN_VALUE ? this.g.e : jQ;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, cu4 cu4Var, boolean z) {
        this.e = true;
        this.n = this.a.n();
        ew4 ew4VarJ = j(f, cu4Var, z);
        po2 po2Var = this.g;
        long jMax = po2Var.b;
        long j = po2Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(ew4VarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        po2 po2Var2 = this.g;
        this.p = (po2Var2.b - jA) + j2;
        this.g = po2Var2.b(jA);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.q() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        no2 no2Var = this.a;
        try {
            boolean z = no2Var instanceof b40;
            fo1 fo1Var = this.l;
            if (z) {
                fo1Var.n(((b40) no2Var).n);
            } else {
                fo1Var.n(no2Var);
            }
        } catch (RuntimeException e) {
            l93.G("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ew4 j(float f, cu4 cu4Var, boolean z) {
        final jn0 jn0Var;
        final boolean z2;
        String str;
        int i;
        Pair pairI;
        String languageTag;
        Pair pairI2;
        CaptioningManager captioningManager;
        Locale locale;
        byte b;
        boolean z3;
        gy3 gy3VarO;
        int i2;
        aw4 aw4Var;
        r41 r41Var;
        aw4 aw4Var2;
        Context context;
        int[] iArr;
        final pn0 pn0Var = this.k;
        kq[] kqVarArr = this.j;
        tv4 tv4Var = this.n;
        pn0Var.getClass();
        int i3 = 1;
        int[] iArr2 = new int[kqVarArr.length + 1];
        int length = kqVarArr.length + 1;
        sv4[][] sv4VarArr = new sv4[length][];
        int[][][] iArr3 = new int[kqVarArr.length + 1][][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = tv4Var.a;
            sv4VarArr[i4] = new sv4[i5];
            iArr3[i4] = new int[i5][];
        }
        int length2 = kqVarArr.length;
        final int[] iArr4 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr4[i6] = kqVarArr[i6].F();
        }
        int i7 = 0;
        while (i7 < tv4Var.a) {
            sv4 sv4VarA = tv4Var.a(i7);
            int i8 = sv4VarA.c == 5 ? i3 : 0;
            int length3 = kqVarArr.length;
            int i9 = i3;
            int i10 = 0;
            int i11 = 0;
            while (i11 < kqVarArr.length) {
                kq kqVar = kqVarArr[i11];
                tv4 tv4Var2 = tv4Var;
                int[] iArr5 = iArr2;
                int i12 = i3;
                int iMax = 0;
                for (int i13 = 0; i13 < sv4VarA.a; i13++) {
                    iMax = Math.max(iMax, kqVar.E(sv4VarA.d[i13]) & 7);
                }
                int i14 = iArr5[i11] == 0 ? i12 : 0;
                if (iMax > i10 || (iMax == i10 && i8 != 0 && i9 == 0 && i14 != 0)) {
                    i10 = iMax;
                    i9 = i14;
                    length3 = i11;
                }
                i11++;
                tv4Var = tv4Var2;
                iArr2 = iArr5;
                i3 = i12;
            }
            tv4 tv4Var3 = tv4Var;
            int[] iArr6 = iArr2;
            int i15 = i3;
            if (length3 == kqVarArr.length) {
                iArr = new int[sv4VarA.a];
            } else {
                kq kqVar2 = kqVarArr[length3];
                int[] iArr7 = new int[sv4VarA.a];
                for (int i16 = 0; i16 < sv4VarA.a; i16++) {
                    iArr7[i16] = kqVar2.E(sv4VarA.d[i16]);
                }
                iArr = iArr7;
            }
            int i17 = iArr6[length3];
            sv4VarArr[length3][i17] = sv4VarA;
            iArr3[length3][i17] = iArr;
            iArr6[length3] = i17 + 1;
            i7++;
            tv4Var = tv4Var3;
            iArr2 = iArr6;
            i3 = i15;
        }
        int[] iArr8 = iArr2;
        int i18 = i3;
        int i19 = 0;
        tv4[] tv4VarArr = new tv4[kqVarArr.length];
        String[] strArr = new String[kqVarArr.length];
        int[] iArr9 = new int[kqVarArr.length];
        for (int i20 = 0; i20 < kqVarArr.length; i20++) {
            int i21 = iArr8[i20];
            tv4VarArr[i20] = new tv4((sv4[]) f35.S(i21, sv4VarArr[i20]));
            iArr3[i20] = (int[][]) f35.S(i21, iArr3[i20]);
            strArr[i20] = kqVarArr[i20].h();
            iArr9[i20] = kqVarArr[i20].o;
        }
        gg2 gg2Var = new gg2(iArr9, tv4VarArr, iArr4, iArr3, new tv4((sv4[]) f35.S(iArr8[kqVarArr.length], sv4VarArr[kqVarArr.length])));
        synchronized (pn0Var.c) {
            pn0Var.g = Thread.currentThread();
            jn0Var = pn0Var.f;
        }
        if (pn0Var.j == null && (context = pn0Var.d) != null) {
            pn0Var.j = Boolean.valueOf(f35.O(context));
        }
        if (jn0Var.A0 && Build.VERSION.SDK_INT >= 32 && pn0Var.h == null) {
            pn0Var.h = new ll(pn0Var.d, pn0Var, pn0Var.j);
        }
        int i22 = gg2Var.a;
        Context context2 = pn0Var.d;
        r41[] r41VarArr = new r41[i22];
        int i23 = 0;
        while (true) {
            if (i23 >= gg2Var.a) {
                z2 = 0;
                break;
            }
            if (2 == iArr9[i23] && tv4VarArr[i23].a > 0) {
                z2 = i18;
                break;
            }
            i23++;
        }
        Pair pairI3 = pn0.i(i18, gg2Var, iArr3, new mn0() { // from class: dn0
            @Override // defpackage.mn0
            public final gy3 g(int i24, sv4 sv4Var, int[] iArr10) {
                pn0 pn0Var2 = pn0Var;
                pn0Var2.getClass();
                jn0 jn0Var2 = jn0Var;
                en0 en0Var = new en0(pn0Var2, jn0Var2);
                int i25 = iArr4[i24];
                uw1 uw1VarJ = yw1.j();
                for (int i26 = 0; i26 < sv4Var.a; i26++) {
                    uw1VarJ.c(new fn0(i24, sv4Var, i26, jn0Var2, iArr10[i26], z2, en0Var, i25));
                }
                return uw1VarJ.f();
            }
        }, new n7(7));
        if (pairI3 != null) {
            r41VarArr[((Integer) pairI3.second).intValue()] = (r41) pairI3.first;
        }
        if (pairI3 == null) {
            str = null;
        } else {
            r41 r41Var2 = (r41) pairI3.first;
            str = r41Var2.a.d[r41Var2.b[0]].d;
        }
        aw4 aw4Var3 = jn0Var.w;
        if (aw4Var3.a == 2) {
            i = 2;
            pairI = null;
        } else {
            i = 2;
            pairI = pn0.i(2, gg2Var, iArr3, new dg0(jn0Var, str, iArr4, (!jn0Var.k || context2 == null) ? null : f35.w(context2), 2), new n7(6));
        }
        int i24 = 4;
        Pair pairI4 = ((jn0Var.E || pairI == null) && aw4Var3.a != i) ? pn0.i(4, gg2Var, iArr3, new cn(6, jn0Var), new n7(5)) : null;
        if (pairI4 != null) {
            r41VarArr[((Integer) pairI4.second).intValue()] = (r41) pairI4.first;
        } else if (pairI != null) {
            r41VarArr[((Integer) pairI.second).intValue()] = (r41) pairI.first;
        }
        int i25 = 3;
        if (aw4Var3.a == 2) {
            pairI2 = null;
        } else {
            if (!jn0Var.B || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = f35.a;
                languageTag = locale.toLanguageTag();
            }
            pairI2 = pn0.i(3, gg2Var, iArr3, new eg0(jn0Var, str, languageTag, 1), new n7(8));
        }
        if (pairI2 != null) {
            r41VarArr[((Integer) pairI2.second).intValue()] = (r41) pairI2.first;
        }
        int i26 = 0;
        while (i26 < i22) {
            int i27 = iArr9[i26];
            if (i27 == 2 || i27 == 1 || i27 == i25 || i27 == i24) {
                i2 = i26;
                aw4Var = aw4Var3;
            } else {
                tv4 tv4Var4 = tv4VarArr[i26];
                int[][] iArr10 = iArr3[i26];
                if (aw4Var3.a == 2) {
                    i2 = i26;
                    aw4Var = aw4Var3;
                } else {
                    int i28 = 0;
                    int i29 = 0;
                    sv4 sv4Var = null;
                    hn0 hn0Var = null;
                    while (i28 < tv4Var4.a) {
                        sv4 sv4VarA2 = tv4Var4.a(i28);
                        int[] iArr11 = iArr10[i28];
                        int i30 = i26;
                        tv4 tv4Var5 = tv4Var4;
                        hn0 hn0Var2 = hn0Var;
                        int i31 = 0;
                        while (i31 < sv4VarA2.a) {
                            int i32 = i31;
                            if (kq.n(iArr11[i31], jn0Var.B0)) {
                                aw4Var2 = aw4Var3;
                                hn0 hn0Var3 = new hn0(sv4VarA2.d[i32], iArr11[i32]);
                                if (hn0Var2 == null || v60.a.c(hn0Var3.o, hn0Var2.o).c(hn0Var3.n, hn0Var2.n).e() > 0) {
                                    hn0Var2 = hn0Var3;
                                    sv4Var = sv4VarA2;
                                    i29 = i32;
                                }
                                i31 = i32 + 1;
                                aw4Var3 = aw4Var2;
                            } else {
                                aw4Var2 = aw4Var3;
                            }
                            sv4Var = sv4Var;
                            i31 = i32 + 1;
                            aw4Var3 = aw4Var2;
                        }
                        i28++;
                        hn0Var = hn0Var2;
                        i26 = i30;
                        tv4Var4 = tv4Var5;
                    }
                    i2 = i26;
                    aw4Var = aw4Var3;
                    if (sv4Var != null) {
                        r41Var = new r41(sv4Var, i29);
                    }
                    r41VarArr[i2] = r41Var;
                }
                r41Var = null;
                r41VarArr[i2] = r41Var;
            }
            i26 = i2 + 1;
            aw4Var3 = aw4Var;
            i24 = 4;
            i25 = 3;
        }
        int i33 = gg2Var.a;
        tv4[] tv4VarArr2 = gg2Var.c;
        HashMap map = new HashMap();
        for (int i34 = 0; i34 < i33; i34++) {
            pn0.b(tv4VarArr2[i34], jn0Var, map);
        }
        pn0.b(gg2Var.f, jn0Var, map);
        int i35 = 0;
        while (true) {
            b = -1;
            if (i35 >= i33) {
                break;
            }
            yv4 yv4Var = (yv4) map.get(Integer.valueOf(gg2Var.b[i35]));
            if (yv4Var != null) {
                sv4 sv4Var2 = yv4Var.a;
                yw1 yw1Var = yv4Var.b;
                r41VarArr[i35] = (yw1Var.isEmpty() || tv4VarArr2[i35].b(sv4Var2) == -1) ? null : new r41(sv4Var2, jz4.N(yw1Var));
            }
            i35++;
        }
        int i36 = gg2Var.a;
        for (int i37 = 0; i37 < i36; i37++) {
            tv4 tv4Var6 = gg2Var.c[i37];
            Map map2 = (Map) jn0Var.D0.get(i37);
            if (map2 != null && map2.containsKey(tv4Var6)) {
                Map map3 = (Map) jn0Var.D0.get(i37);
                if (map3 != null && map3.get(tv4Var6) != null) {
                    kf2.k();
                    return null;
                }
                r41VarArr[i37] = null;
            }
        }
        for (int i38 = 0; i38 < i22; i38++) {
            int i39 = gg2Var.b[i38];
            if (jn0Var.E0.get(i38) || jn0Var.I.contains(Integer.valueOf(i39))) {
                r41VarArr[i38] = null;
            }
        }
        s41 s41Var = pn0Var.e;
        cp cpVar = pn0Var.b;
        cpVar.getClass();
        t41[] t41VarArrK = s41Var.k(r41VarArr, cpVar);
        dz3[] dz3VarArr = new dz3[i22];
        for (int i40 = 0; i40 < i22; i40++) {
            dz3VarArr[i40] = (jn0Var.E0.get(i40) || jn0Var.I.contains(Integer.valueOf(gg2Var.b[i40])) || (gg2Var.b[i40] != -2 && t41VarArrK[i40] == null)) ? null : dz3.c;
        }
        if (jn0Var.w.a != 0) {
            int i41 = -1;
            int i42 = 0;
            int i43 = 0;
            while (true) {
                if (i42 >= gg2Var.a) {
                    if (i43 != 1) {
                        break;
                    }
                    int i44 = jn0Var.w.b ? 1 : 2;
                    dz3 dz3Var = dz3VarArr[i41];
                    dz3VarArr[i41] = new dz3(i44, dz3Var != null && dz3Var.b);
                    break;
                }
                int i45 = gg2Var.b[i42];
                t41 t41Var = t41VarArrK[i42];
                if (i45 != 1 && t41Var != null) {
                    break;
                }
                if (i45 == 1 && t41Var != null && t41Var.length() == 1) {
                    if (pn0.h(jn0Var, iArr3[i42][gg2Var.c[i42].b(t41Var.c())][t41Var.i(i19)], t41Var.m())) {
                        i43++;
                        i41 = i42;
                    }
                }
                i42++;
                i19 = 0;
            }
        }
        Pair pairCreate = Pair.create(dz3VarArr, t41VarArrK);
        t41[] t41VarArr = (t41[]) pairCreate.second;
        List[] listArr = new List[t41VarArr.length];
        for (int i46 = 0; i46 < t41VarArr.length; i46++) {
            t41 t41Var2 = t41VarArr[i46];
            if (t41Var2 != null) {
                gy3VarO = yw1.o(t41Var2);
            } else {
                vw1 vw1Var = yw1.o;
                gy3VarO = gy3.r;
            }
            listArr[i46] = gy3VarO;
        }
        uw1 uw1Var = new uw1(4);
        int i47 = 0;
        while (true) {
            int i48 = gg2Var.a;
            tv4[] tv4VarArr3 = gg2Var.c;
            if (i47 >= i48) {
                break;
            }
            tv4 tv4Var7 = tv4VarArr3[i47];
            List list = listArr[i47];
            int i49 = 0;
            while (i49 < tv4Var7.a) {
                sv4 sv4VarA3 = tv4Var7.a(i49);
                int i50 = tv4VarArr3[i47].a(i49).a;
                int[] iArr12 = new int[i50];
                int i51 = 0;
                int i52 = 0;
                while (i52 < i50) {
                    List[] listArr2 = listArr;
                    if ((gg2Var.e[i47][i49][i52] & 7) == 4) {
                        iArr12[i51] = i52;
                        i51++;
                    }
                    i52++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr12, i51);
                int iMin = 16;
                tv4 tv4Var8 = tv4Var7;
                String str3 = null;
                int i53 = 0;
                boolean z4 = false;
                int i54 = 0;
                while (i53 < iArrCopyOf.length) {
                    String str4 = tv4VarArr3[i47].a(i49).d[iArrCopyOf[i53]].n;
                    int i55 = i54 + 1;
                    if (i54 == 0) {
                        str3 = str4;
                    } else {
                        z4 = (!Objects.equals(str3, str4)) | z4;
                    }
                    iMin = Math.min(iMin, gg2Var.e[i47][i49][i53] & 24);
                    i53++;
                    i54 = i55;
                }
                if (z4) {
                    iMin = Math.min(iMin, gg2Var.d[i47]);
                }
                boolean z5 = iMin != 0;
                int i56 = sv4VarA3.a;
                int[] iArr13 = new int[i56];
                boolean[] zArr = new boolean[i56];
                for (int i57 = 0; i57 < sv4VarA3.a; i57++) {
                    iArr13[i57] = gg2Var.e[i47][i49][i57] & 7;
                    int i58 = 0;
                    while (true) {
                        if (i58 >= list.size()) {
                            z3 = false;
                            break;
                        }
                        t41 t41Var3 = (t41) list.get(i58);
                        if (t41Var3.c().equals(sv4VarA3) && t41Var3.t(i57) != -1) {
                            z3 = true;
                            break;
                        }
                        i58++;
                    }
                    zArr[i57] = z3;
                }
                uw1Var.c(new iw4(sv4VarA3, z5, iArr13, zArr));
                i49++;
                b = -1;
                listArr = listArr3;
                tv4Var7 = tv4Var8;
            }
            i47++;
        }
        tv4 tv4Var9 = gg2Var.f;
        for (int i59 = 0; i59 < tv4Var9.a; i59++) {
            sv4 sv4VarA4 = tv4Var9.a(i59);
            int[] iArr14 = new int[sv4VarA4.a];
            Arrays.fill(iArr14, 0);
            uw1Var.c(new iw4(sv4VarA4, false, iArr14, new boolean[sv4VarA4.a]));
        }
        ew4 ew4Var = new ew4((dz3[]) pairCreate.first, (t41[]) pairCreate.second, new jw4(uw1Var.f()), gg2Var);
        for (int i60 = 0; i60 < ew4Var.o; i60++) {
            boolean zN = ew4Var.n(i60);
            t41[] t41VarArr2 = (t41[]) ew4Var.q;
            if (zN) {
                rr2.w(t41VarArr2[i60] != null || this.j[i60].o == -2);
            } else {
                rr2.w(t41VarArr2[i60] == null);
            }
        }
        for (t41 t41Var4 : (t41[]) ew4Var.q) {
            if (t41Var4 != null) {
                t41Var4.p(f);
                t41Var4.f(z);
            }
        }
        return ew4Var;
    }

    public final void k() {
        no2 no2Var = this.a;
        if (no2Var instanceof b40) {
            long j = this.g.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            b40 b40Var = (b40) no2Var;
            b40Var.s = 0L;
            b40Var.t = j;
        }
    }
}
