package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 implements no2, gn1 {
    public final int A;
    public final ik3 B;
    public final om1 C = new om1(0, this);
    public mo2 D;
    public int E;
    public tv4 F;
    public ln1[] G;
    public ln1[] H;
    public int I;
    public s80 J;
    public final xk0 n;
    public final al0 o;
    public final zh0 p;
    public final rw4 q;
    public final ww0 r;
    public final sw0 s;
    public final i80 t;
    public final ue1 u;
    public final n9 v;
    public final IdentityHashMap w;
    public final si1 x;
    public final i80 y;
    public final boolean z;

    public pm1(xk0 xk0Var, al0 al0Var, zh0 zh0Var, rw4 rw4Var, ww0 ww0Var, sw0 sw0Var, i80 i80Var, ue1 ue1Var, n9 n9Var, i80 i80Var2, boolean z, int i, ik3 ik3Var) {
        this.n = xk0Var;
        this.o = al0Var;
        this.p = zh0Var;
        this.q = rw4Var;
        this.r = ww0Var;
        this.s = sw0Var;
        this.t = i80Var;
        this.u = ue1Var;
        this.v = n9Var;
        this.y = i80Var2;
        this.z = z;
        this.A = i;
        this.B = ik3Var;
        i80Var2.getClass();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        this.J = new s80(gy3Var, gy3Var);
        this.w = new IdentityHashMap();
        this.x = new si1(27);
        this.G = new ln1[0];
        this.H = new ln1[0];
    }

    public static tb1 j(tb1 tb1Var, tb1 tb1Var2, boolean z) {
        qv2 qv2Var;
        int i;
        String str;
        String str2;
        yw1 yw1Var;
        int i2;
        int i3;
        String str3;
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        if (tb1Var2 != null) {
            str2 = tb1Var2.k;
            qv2Var = tb1Var2.l;
            i2 = tb1Var2.F;
            i = tb1Var2.e;
            i3 = tb1Var2.f;
            str = tb1Var2.d;
            str3 = tb1Var2.b;
            yw1Var = tb1Var2.c;
        } else {
            String strV = f35.v(1, tb1Var.k);
            qv2Var = tb1Var.l;
            if (z) {
                i2 = tb1Var.F;
                i = tb1Var.e;
                i3 = tb1Var.f;
                str = tb1Var.d;
                str3 = tb1Var.b;
                str2 = strV;
                yw1Var = tb1Var.c;
            } else {
                i = 0;
                str = null;
                str2 = strV;
                yw1Var = gy3Var;
                i2 = -1;
                i3 = 0;
                str3 = null;
            }
        }
        String strD = lw2.d(str2);
        int i4 = z ? tb1Var.h : -1;
        int i5 = z ? tb1Var.i : -1;
        sb1 sb1Var = new sb1();
        sb1Var.a = tb1Var.a;
        sb1Var.b = str3;
        sb1Var.c = yw1.k(yw1Var);
        sb1Var.l = lw2.m(tb1Var.m);
        sb1Var.m = lw2.m(strD);
        sb1Var.j = str2;
        sb1Var.k = qv2Var;
        sb1Var.h = i4;
        sb1Var.i = i5;
        sb1Var.E = i2;
        sb1Var.e = i;
        sb1Var.f = i3;
        sb1Var.d = str;
        return new tb1(sb1Var);
    }

    @Override // defpackage.gn1
    public final void a() {
        for (ln1 ln1Var : this.G) {
            i61 i61Var = ln1Var.w;
            km1 km1Var = ln1Var.q;
            ArrayList arrayList = ln1Var.A;
            if (!arrayList.isEmpty()) {
                nm1 nm1Var = (nm1) te5.w(arrayList);
                int iB = km1Var.b(nm1Var);
                int i = nm1Var.o;
                if (iB == 1) {
                    if (!nm1Var.f()) {
                        rr2.w(i != -1);
                        ym1 ym1VarA = km1Var.g.a(false, km1Var.e[km1Var.h.b(nm1Var.d)]);
                        ym1VarA.getClass();
                        yw1 yw1Var = ym1VarA.r;
                        int i2 = (int) (nm1Var.j - ym1VarA.k);
                        nm1Var.K = i2 < 0 ? 0L : ((tm1) (i2 < yw1Var.size() ? ((vm1) yw1Var.get(i2)).z : ym1VarA.s).get(i)).p;
                    }
                } else if (iB == 0) {
                    ln1Var.E.post(new k6(25, ln1Var, nm1Var));
                } else if (iB == 2 && !ln1Var.g0 && i61Var.l()) {
                    i61Var.d();
                }
            }
        }
        this.D.j(this);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[LOOP:1: B:18:0x0042->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0053 A[EDGE_INSN: B:48:0x0053->B:25:0x0053 BREAK  A[LOOP:1: B:18:0x0042->B:23:0x004f], SYNTHETIC] */
    @Override // defpackage.gn1
    public final boolean b(Uri uri, x7 x7Var, boolean z) {
        long j;
        int i;
        int iT;
        boolean z2;
        zk0 zk0Var;
        boolean zA;
        boolean z3 = true;
        for (ln1 ln1Var : this.G) {
            km1 km1Var = ln1Var.q;
            Uri[] uriArr = km1Var.e;
            if (f35.m(uriArr, uri)) {
                if (!z) {
                    i80 i80Var = ln1Var.v;
                    n50 n50VarN = uo.n(km1Var.r);
                    i80Var.getClass();
                    dd2 dd2VarC = i80.C(n50VarN, x7Var);
                    if (dd2VarC != null && dd2VarC.a == 2) {
                        j = dd2VarC.b;
                    }
                    i = 0;
                    while (true) {
                        if (i < uriArr.length) {
                            i = -1;
                            break;
                        }
                        if (uriArr[i].equals(uri)) {
                            break;
                        }
                        i++;
                    }
                    if (i != -1 && (iT = km1Var.r.t(i)) != -1) {
                        km1Var.o = uri;
                        if (j != -9223372036854775807L && km1Var.r.o(iT, j)) {
                            zk0Var = (zk0) km1Var.g.q.get(uri);
                            if (zk0Var != null) {
                                zA = zk0.a(zk0Var, j);
                            } else {
                                zA = false;
                            }
                            if (zA) {
                            }
                        }
                        z2 = false;
                    }
                    z3 &= z2;
                }
                j = -9223372036854775807L;
                i = 0;
                while (true) {
                    if (i < uriArr.length) {
                        i = -1;
                        break;
                    }
                    if (uriArr[i].equals(uri)) {
                        break;
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    km1Var.o = uri;
                    if (j != -9223372036854775807L) {
                        zk0Var = (zk0) km1Var.g.q.get(uri);
                        if (zk0Var != null) {
                            zA = zk0.a(zk0Var, j);
                        } else {
                            zA = false;
                        }
                        if (zA) {
                        }
                    }
                    z2 = false;
                }
                z3 &= z2;
            }
            z2 = true;
            z3 &= z2;
        }
        this.D.j(this);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x027f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0287  */
    /* JADX WARN: Code duplicated, block: B:124:0x028b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0291  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:195:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [int] */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        Object[] objArr;
        int[] iArr;
        boolean z;
        km1 km1Var;
        int i;
        int i2;
        Object[] objArr2;
        int i3;
        int[] iArr2;
        ln1[] ln1VarArr;
        ln1 ln1Var;
        boolean z2;
        boolean z3;
        Object[] objArr3;
        int i4;
        int i5;
        Object[] objArr4;
        Object[] objArr5;
        int i6;
        int r30;
        int[] iArr3 = new int[t41VarArr.length];
        int[] iArr4 = new int[t41VarArr.length];
        int i7 = 0;
        while (true) {
            int length = t41VarArr.length;
            identityHashMap = this.w;
            if (i7 >= length) {
                break;
            }
            q44 q44Var = q44VarArr[i7];
            iArr3[i7] = q44Var == null ? -1 : ((Integer) identityHashMap.get(q44Var)).intValue();
            iArr4[i7] = -1;
            t41 t41Var = t41VarArr[i7];
            if (t41Var != null) {
                sv4 sv4VarC = t41Var.c();
                int i8 = 0;
                while (true) {
                    ln1[] ln1VarArr2 = this.G;
                    if (i8 >= ln1VarArr2.length) {
                        break;
                    }
                    ln1 ln1Var2 = ln1VarArr2[i8];
                    ln1Var2.v();
                    if (ln1Var2.V.b(sv4VarC) != -1) {
                        iArr4[i7] = i8;
                        break;
                    }
                    i8++;
                }
            }
            i7++;
        }
        identityHashMap.clear();
        int length2 = t41VarArr.length;
        int length3 = t41VarArr.length;
        q44[] q44VarArr2 = new q44[length3];
        int length4 = t41VarArr.length;
        t41[] t41VarArr2 = new t41[length4];
        boolean z4 = false;
        ln1[] ln1VarArr3 = new ln1[this.G.length];
        int i9 = length3;
        int i10 = 0;
        int i11 = 0;
        boolean z5 = false;
        Object[] objArr6 = new q44[length2];
        Object[] objArr7 = q44VarArr2;
        while (i10 < this.G.length) {
            int i12 = length2;
            int r7 = z4;
            Object[] objArr8 = objArr6;
            while (true) {
                objArr = objArr8;
                if (r7 >= t41VarArr.length) {
                    break;
                }
                objArr7[r7] = iArr3[r7] == i10 ? q44VarArr[r7] : null;
                t41VarArr2[r7] = iArr4[r7] == i10 ? t41VarArr[r7] : null;
                objArr8 = objArr;
                r7++;
            }
            ln1 ln1Var3 = this.G[i10];
            i61 i61Var = ln1Var3.w;
            int i13 = i10;
            km1 km1Var2 = ln1Var3.q;
            Uri[] uriArr = km1Var2.e;
            al0 al0Var = km1Var2.g;
            ArrayList arrayList = ln1Var3.A;
            ln1Var3.v();
            int i14 = ln1Var3.R;
            Object[] objArr9 = objArr7;
            int r8 = z4;
            while (r8 < length4) {
                hn1 hn1Var = (hn1) objArr9[r8];
                if (hn1Var == null || (t41VarArr2[r8] != null && zArr[r8])) {
                    r30 = r8;
                } else {
                    r30 = r8;
                    ln1Var3.R--;
                    if (hn1Var.p != -1) {
                        ln1 ln1Var4 = hn1Var.o;
                        int i15 = hn1Var.n;
                        ln1Var4.v();
                        ln1Var4.X.getClass();
                        int i16 = ln1Var4.X[i15];
                        rr2.w(ln1Var4.a0[i16]);
                        ln1Var4.a0[i16] = z4;
                        hn1Var.p = -1;
                    }
                    objArr9[r30] = null;
                }
                t41VarArr2 = t41VarArr2;
                r8 = r30 + 1;
            }
            t41[] t41VarArr3 = t41VarArr2;
            boolean z6 = true;
            if (z5) {
                iArr = iArr3;
                z = true;
            } else {
                if (ln1Var3.f0) {
                    if (i14 != 0) {
                        iArr = iArr3;
                    }
                    iArr = iArr3;
                    z = true;
                } else {
                    iArr = iArr3;
                    if (j != ln1Var3.c0) {
                        z = true;
                    }
                }
                z = z4;
            }
            t41 t41Var2 = km1Var2.r;
            boolean z7 = z;
            t41 t41Var3 = t41Var2;
            int r9 = z4;
            while (r9 < length4) {
                int r31 = r9;
                t41 t41Var4 = t41VarArr3[r31];
                if (t41Var4 == null) {
                    i6 = length4;
                } else {
                    i6 = length4;
                    boolean z8 = z7;
                    int iB = ln1Var3.V.b(t41Var4.c());
                    if (iB == ln1Var3.Y) {
                        zk0 zk0Var = (zk0) al0Var.q.get(uriArr[km1Var2.r.l()]);
                        if (zk0Var != null) {
                            zk0Var.x = z4;
                        }
                        km1Var2.r = t41Var4;
                        t41Var3 = t41Var4;
                    }
                    if (objArr9[r31 == true ? 1 : 0] == null) {
                        ln1Var3.R++;
                        hn1 hn1Var2 = new hn1(ln1Var3, iB);
                        objArr9[r31 == true ? 1 : 0] = hn1Var2;
                        zArr2[r31 == true ? 1 : 0] = z6;
                        if (ln1Var3.X != null) {
                            hn1Var2.a();
                            if (z8) {
                                z7 = z8;
                            } else {
                                kn1 kn1Var = ln1Var3.I[ln1Var3.X[iB]];
                                z7 = (kn1Var.o() == 0 || kn1Var.z(z6, j)) ? false : true;
                            }
                        } else {
                            z7 = z8;
                        }
                    } else {
                        z7 = z8;
                    }
                }
                length4 = i6;
                z4 = false;
                z6 = true;
                r9 = (r31 == true ? 1 : 0) + 1;
            }
            int i17 = length4;
            boolean z9 = z7;
            if (ln1Var3.R == 0) {
                zk0 zk0Var2 = (zk0) al0Var.q.get(uriArr[km1Var2.r.l()]);
                if (zk0Var2 != null) {
                    zk0Var2.x = false;
                }
                km1Var2.n = null;
                ln1Var3.T = null;
                ln1Var3.e0 = true;
                arrayList.clear();
                if (i61Var.l()) {
                    if (ln1Var3.P) {
                        for (kn1 kn1Var2 : ln1Var3.I) {
                            kn1Var2.j();
                        }
                    }
                    i61Var.d();
                } else {
                    ln1Var3.I();
                }
                km1Var = km1Var2;
                i4 = i9;
                i2 = i12;
                objArr3 = objArr;
                i3 = i13;
                z3 = z9;
                iArr2 = iArr4;
                ln1VarArr = ln1VarArr3;
                ln1Var = ln1Var3;
            } else {
                boolean z10 = true;
                if (arrayList.isEmpty() || Objects.equals(t41Var3, t41Var2)) {
                    km1Var = km1Var2;
                    i = i9;
                    i2 = i12;
                    objArr2 = objArr;
                    i3 = i13;
                    iArr2 = iArr4;
                    ln1VarArr = ln1VarArr3;
                    ln1Var = ln1Var3;
                } else {
                    if (ln1Var3.f0) {
                        km1Var = km1Var2;
                        i = i9;
                        i2 = i12;
                        objArr4 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        ln1VarArr = ln1VarArr3;
                        ln1Var = ln1Var3;
                    } else {
                        long j2 = j < 0 ? -j : 0L;
                        nm1 nm1VarC = ln1Var3.C();
                        long j3 = j2;
                        xj2[] xj2VarArrA = km1Var2.a(nm1VarC, j);
                        km1Var = km1Var2;
                        List list = ln1Var3.B;
                        i = i9;
                        i2 = i12;
                        Object[] objArr10 = objArr;
                        i3 = i13;
                        iArr2 = iArr4;
                        ln1VarArr = ln1VarArr3;
                        ln1Var = ln1Var3;
                        t41 t41Var5 = t41Var3;
                        t41Var5.b(j, j3, -9223372036854775807L, list, xj2VarArrA);
                        if (t41Var5.l() != km1Var.h.b(nm1VarC.d)) {
                            z10 = true;
                            objArr4 = objArr10;
                        } else {
                            z10 = true;
                            objArr2 = objArr10;
                        }
                    }
                    ln1Var.e0 = z10;
                    z2 = z10;
                    z3 = z2;
                    objArr3 = objArr4;
                    if (z3) {
                        ln1Var.J(z2, j);
                        i4 = i;
                        i5 = 0;
                        while (i5 < i4) {
                            if (objArr9[i5] != null) {
                                zArr2[i5] = z10;
                            }
                            i5++;
                            z10 = true;
                        }
                    } else {
                        i4 = i;
                    }
                }
                z2 = z5;
                z3 = z9;
                objArr3 = objArr2;
                if (z3) {
                    ln1Var.J(z2, j);
                    i4 = i;
                    i5 = 0;
                    while (i5 < i4) {
                        if (objArr9[i5] != null) {
                            zArr2[i5] = z10;
                        }
                        i5++;
                        z10 = true;
                    }
                } else {
                    i4 = i;
                }
            }
            ArrayList arrayList2 = ln1Var.F;
            arrayList2.clear();
            for (int i18 = 0; i18 < i4; i18++) {
                Object obj = objArr9[i18];
                if (obj != null) {
                    arrayList2.add((hn1) obj);
                }
            }
            ln1Var.f0 = true;
            int i19 = 0;
            boolean z11 = false;
            Object[] objArr11 = objArr3;
            while (i19 < t41VarArr.length) {
                Object obj2 = objArr9[i19];
                int i20 = i3;
                if (iArr2[i19] == i20) {
                    obj2.getClass();
                    objArr5 = objArr11;
                    objArr5[i19] = obj2;
                    identityHashMap.put(obj2, Integer.valueOf(i20));
                    z11 = true;
                } else {
                    objArr5 = objArr11;
                    if (iArr[i19] == i20) {
                        rr2.w(obj2 == null);
                    }
                }
                i19++;
                objArr11 = objArr5;
                i3 = i20;
            }
            Object[] objArr12 = objArr11;
            int i21 = i3;
            int i22 = i11;
            if (z11) {
                ln1VarArr[i22] = ln1Var;
                i11 = i22 + 1;
                if (i22 == 0) {
                    km1Var.l = true;
                    if (z3) {
                        ((SparseArray) this.x.o).clear();
                        z5 = true;
                    } else {
                        ln1[] ln1VarArr4 = this.H;
                        if (ln1VarArr4.length == 0 || ln1Var != ln1VarArr4[0]) {
                            ((SparseArray) this.x.o).clear();
                            z5 = true;
                        }
                    }
                } else {
                    km1Var.l = i21 < this.I;
                }
            }
            i10 = i21 + 1;
            iArr4 = iArr2;
            iArr3 = iArr;
            ln1VarArr3 = ln1VarArr;
            objArr7 = objArr9;
            t41VarArr2 = t41VarArr3;
            length2 = i2;
            z4 = false;
            i9 = i4;
            objArr6 = objArr12;
            length4 = i17;
        }
        boolean z12 = z4;
        System.arraycopy(objArr6, z12 ? 1 : 0, q44VarArr, z12 ? 1 : 0, length2);
        ln1[] ln1VarArr5 = (ln1[]) f35.S(i11, ln1VarArr3);
        this.H = ln1VarArr5;
        gy3 gy3VarL = yw1.l(ln1VarArr5);
        AbstractList abstractListP = hw.P(new mj0(27), gy3VarL);
        this.y.getClass();
        this.J = new s80(gy3VarL, abstractListP);
        return j;
    }

    @Override // defpackage.da4
    public final long d() {
        return this.J.d();
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        for (ln1 ln1Var : this.H) {
            if (ln1Var.N == 2) {
                km1 km1Var = ln1Var.q;
                al0 al0Var = km1Var.g;
                int iD = km1Var.r.d();
                Uri[] uriArr = km1Var.e;
                ym1 ym1VarA = (iD >= uriArr.length || iD == -1) ? null : al0Var.a(true, uriArr[km1Var.r.l()]);
                if (ym1VarA == null) {
                    break;
                }
                yw1 yw1Var = ym1VarA.r;
                if (yw1Var.isEmpty()) {
                    break;
                }
                long j2 = ym1VarA.h - al0Var.A;
                long j3 = j - j2;
                int iD2 = f35.d(yw1Var, Long.valueOf(j3), true);
                long j4 = ((vm1) yw1Var.get(iD2)).r;
                return n84Var.a(j3, j4, (!ym1VarA.c || iD2 == yw1Var.size() - 1) ? j4 : ((vm1) yw1Var.get(iD2 + 1)).r) + j2;
            }
        }
        return j;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.J.f();
    }

    public final ln1 g(String str, int i, Uri[] uriArr, tb1[] tb1VarArr, tb1 tb1Var, List list, Map map, long j) {
        return new ln1(str, i, this.C, new km1(this.n, this.o, uriArr, tb1VarArr, this.p, this.q, this.x, list, this.B), map, this.v, j, tb1Var, this.r, this.s, this.t, this.u, this.A, null);
    }

    @Override // defpackage.no2
    public final void h() throws IOException {
        for (ln1 ln1Var : this.G) {
            ln1Var.G();
            if (ln1Var.g0 && !ln1Var.Q) {
                throw ParserException.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.no2
    public final long i(long j) {
        ln1[] ln1VarArr = this.H;
        if (ln1VarArr.length > 0) {
            boolean zJ = ln1VarArr[0].J(false, j);
            int i = 1;
            while (true) {
                ln1[] ln1VarArr2 = this.H;
                if (i >= ln1VarArr2.length) {
                    break;
                }
                ln1VarArr2[i].J(zJ, j);
                i++;
            }
            if (zJ) {
                ((SparseArray) this.x.o).clear();
            }
        }
        return j;
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) throws Throwable {
        for (ln1 ln1Var : this.H) {
            if (ln1Var.P && !ln1Var.E()) {
                int length = ln1Var.I.length;
                for (int i = 0; i < length; i++) {
                    ln1Var.I[i].i(j, z, ln1Var.a0[i]);
                }
            }
        }
    }

    @Override // defpackage.no2
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        xk0 xk0Var;
        boolean z;
        List list;
        List list2;
        ln1[] ln1VarArr;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Uri[] uriArr;
        this.D = mo2Var;
        al0 al0Var = this.o;
        al0Var.getClass();
        al0Var.r.add(this);
        cn1 cn1Var = al0Var.w;
        cn1Var.getClass();
        List list3 = cn1Var.f;
        List list4 = cn1Var.e;
        Map map = Collections.EMPTY_MAP;
        boolean zIsEmpty = list4.isEmpty();
        List list5 = cn1Var.g;
        int i4 = 0;
        this.E = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xk0 xk0Var2 = this.n;
        boolean z4 = this.z;
        if (zIsEmpty) {
            xk0Var = xk0Var2;
            z = z4;
            list = list3;
            list2 = list5;
        } else {
            tb1 tb1Var = cn1Var.h;
            int size = list4.size();
            int[] iArr = new int[size];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                list2 = list5;
                if (i5 >= list4.size()) {
                    break;
                }
                tb1 tb1Var2 = ((bn1) list4.get(i5)).b;
                int i7 = tb1Var2.v;
                String str = tb1Var2.k;
                if (i7 > 0 || f35.v(2, str) != null) {
                    iArr[i5] = 2;
                    i6++;
                } else if (f35.v(1, str) != null) {
                    iArr[i5] = 1;
                    i4++;
                } else {
                    iArr[i5] = -1;
                }
                i5++;
                list5 = list2;
            }
            if (i6 > 0) {
                z3 = false;
                i3 = i6;
                z2 = true;
            } else if (i4 < size) {
                z2 = false;
                i3 = size - i4;
                z3 = true;
            } else {
                z2 = false;
                i3 = size;
                z3 = false;
            }
            Uri[] uriArr2 = new Uri[i3];
            tb1[] tb1VarArr = new tb1[i3];
            int[] iArr2 = new int[i3];
            int i8 = 0;
            int i9 = 0;
            while (i8 < list4.size()) {
                if (z2) {
                    uriArr = uriArr2;
                    if (iArr[i8] == 2) {
                    }
                    i8++;
                    uriArr2 = uriArr;
                } else {
                    uriArr = uriArr2;
                }
                if (!z3 || iArr[i8] != 1) {
                    bn1 bn1Var = (bn1) list4.get(i8);
                    uriArr[i9] = bn1Var.a;
                    tb1VarArr[i9] = bn1Var.b;
                    iArr2[i9] = i8;
                    i9++;
                }
                i8++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = tb1VarArr[0].k;
            int iU = f35.u(2, str2);
            int iU2 = f35.u(1, str2);
            boolean z5 = (iU2 == 1 || (iU2 == 0 && list3.isEmpty())) && iU <= 1 && iU2 + iU > 0;
            xk0Var = xk0Var2;
            list = list3;
            z = z4;
            ln1 ln1VarG = g("main", (z2 || iU2 <= 0) ? 0 : 1, uriArr3, tb1VarArr, cn1Var.h, cn1Var.i, map, j);
            arrayList.add(ln1VarG);
            arrayList2.add(iArr2);
            if (z && z5) {
                ArrayList arrayList3 = new ArrayList();
                if (iU > 0) {
                    tb1[] tb1VarArr2 = new tb1[i3];
                    int i10 = 0;
                    while (i10 < i3) {
                        tb1 tb1Var3 = tb1VarArr[i10];
                        String strV = f35.v(2, tb1Var3.k);
                        String strD = lw2.d(strV);
                        sb1 sb1Var = new sb1();
                        sb1Var.a = tb1Var3.a;
                        sb1Var.b = tb1Var3.b;
                        sb1Var.c = yw1.k(tb1Var3.c);
                        sb1Var.l = lw2.m(tb1Var3.m);
                        sb1Var.m = lw2.m(strD);
                        sb1Var.j = strV;
                        sb1Var.k = tb1Var3.l;
                        sb1Var.h = tb1Var3.h;
                        sb1Var.i = tb1Var3.i;
                        sb1Var.t = tb1Var3.u;
                        sb1Var.u = tb1Var3.v;
                        sb1Var.x = tb1Var3.y;
                        sb1Var.e = tb1Var3.e;
                        sb1Var.f = tb1Var3.f;
                        tb1VarArr2[i10] = new tb1(sb1Var);
                        i10++;
                        tb1VarArr = tb1VarArr;
                    }
                    tb1[] tb1VarArr3 = tb1VarArr;
                    arrayList3.add(new sv4("main", tb1VarArr2));
                    if (iU2 > 0 && (tb1Var != null || list.isEmpty())) {
                        arrayList3.add(new sv4("main:audio", j(tb1VarArr3[0], tb1Var, false)));
                    }
                    List list6 = cn1Var.i;
                    if (list6 != null) {
                        for (int i11 = 0; i11 < list6.size(); i11++) {
                            arrayList3.add(new sv4(f34.f(i11, "main:cc:"), xk0Var.i((tb1) list6.get(i11))));
                        }
                    }
                } else {
                    tb1[] tb1VarArr4 = new tb1[i3];
                    for (int i12 = 0; i12 < i3; i12++) {
                        tb1VarArr4[i12] = j(tb1VarArr[i12], tb1Var, true);
                    }
                    arrayList3.add(new sv4("main", tb1VarArr4));
                }
                sb1 sb1Var2 = new sb1();
                sb1Var2.a = "ID3";
                sb1Var2.m = lw2.m("application/id3");
                sv4 sv4Var = new sv4("main:id3", new tb1(sb1Var2));
                arrayList3.add(sv4Var);
                ln1VarG.H((sv4[]) arrayList3.toArray(new sv4[0]), arrayList3.indexOf(sv4Var));
            } else {
                xk0Var = xk0Var;
            }
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i13 = 0;
        while (i13 < list.size()) {
            List list7 = list;
            String str3 = ((an1) list7.get(i13)).c;
            if (hashSet3.add(str3)) {
                arrayList4.clear();
                arrayList5.clear();
                arrayList6.clear();
                boolean z6 = true;
                for (int i14 = 0; i14 < list7.size(); i14++) {
                    if (str3.equals(((an1) list7.get(i14)).c)) {
                        an1 an1Var = (an1) list7.get(i14);
                        arrayList6.add(Integer.valueOf(i14));
                        Uri uri = an1Var.a;
                        tb1 tb1Var4 = an1Var.b;
                        arrayList4.add(uri);
                        arrayList5.add(tb1Var4);
                        z6 &= f35.u(1, tb1Var4.k) == 1;
                    }
                }
                String strConcat = "audio:".concat(str3);
                String str4 = f35.a;
                list = list7;
                hashSet2 = hashSet3;
                i2 = i13;
                ln1 ln1VarG2 = g(strConcat, 1, (Uri[]) arrayList4.toArray(new Uri[0]), (tb1[]) arrayList5.toArray(new tb1[0]), null, Collections.EMPTY_LIST, map, j);
                arrayList2.add(jz4.N(arrayList6));
                arrayList.add(ln1VarG2);
                if (z && z6) {
                    ln1VarG2.H(new sv4[]{new sv4(strConcat, (tb1[]) arrayList5.toArray(new tb1[0]))}, new int[0]);
                }
            } else {
                hashSet2 = hashSet3;
                i2 = i13;
                list = list7;
            }
            i13 = i2 + 1;
            hashSet3 = hashSet2;
        }
        this.I = arrayList.size();
        ArrayList arrayList7 = new ArrayList(list2.size());
        ArrayList arrayList8 = new ArrayList(list2.size());
        ArrayList arrayList9 = new ArrayList(list2.size());
        HashSet hashSet4 = new HashSet();
        int i15 = 0;
        while (i15 < list2.size()) {
            list2 = list2;
            String str5 = ((an1) list2.get(i15)).c;
            if (hashSet4.add(str5)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                for (int i16 = 0; i16 < list2.size(); i16++) {
                    if (str5.equals(((an1) list2.get(i16)).c)) {
                        an1 an1Var2 = (an1) list2.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(an1Var2.a);
                        arrayList8.add(an1Var2.b);
                    }
                }
                String strConcat2 = "subtitle:".concat(str5);
                tb1[] tb1VarArr5 = (tb1[]) arrayList8.toArray(new tb1[0]);
                String str6 = f35.a;
                Uri[] uriArr4 = (Uri[]) arrayList7.toArray(new Uri[0]);
                vw1 vw1Var = yw1.o;
                hashSet = hashSet4;
                i = i15;
                ln1 ln1VarG3 = g(strConcat2, 3, uriArr4, tb1VarArr5, null, gy3.r, map, j);
                arrayList2.add(jz4.N(arrayList9));
                arrayList.add(ln1VarG3);
                int length = tb1VarArr5.length;
                tb1[] tb1VarArr6 = new tb1[length];
                for (int i17 = 0; i17 < length; i17++) {
                    tb1VarArr6[i17] = xk0Var.i(tb1VarArr5[i17]);
                }
                ln1VarG3.H(new sv4[]{new sv4(strConcat2, tb1VarArr6)}, new int[0]);
            } else {
                hashSet = hashSet4;
                i = i15;
            }
            i15 = i + 1;
            hashSet4 = hashSet;
        }
        this.G = (ln1[]) arrayList.toArray(new ln1[0]);
        this.E = this.G.length;
        int i18 = 0;
        while (true) {
            int i19 = this.I;
            ln1VarArr = this.G;
            if (i18 >= i19) {
                break;
            }
            ln1VarArr[i18].q.l = true;
            i18++;
        }
        for (ln1 ln1Var : ln1VarArr) {
            if (!ln1Var.Q) {
                od2 od2Var = new od2();
                od2Var.a = ln1Var.c0;
                ln1Var.o(new pd2(od2Var));
            }
        }
        this.H = this.G;
    }

    @Override // defpackage.no2
    public final tv4 n() {
        tv4 tv4Var = this.F;
        tv4Var.getClass();
        return tv4Var;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        if (this.F != null) {
            return this.J.o(pd2Var);
        }
        for (ln1 ln1Var : this.G) {
            if (!ln1Var.Q) {
                od2 od2Var = new od2();
                od2Var.a = ln1Var.c0;
                ln1Var.o(new pd2(od2Var));
            }
        }
        return false;
    }

    @Override // defpackage.da4
    public final long q() {
        return this.J.q();
    }

    @Override // defpackage.da4
    public final void u(long j) {
        this.J.u(j);
    }
}
