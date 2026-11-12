package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mv2 implements no2, mo2 {
    public final no2[] n;
    public final boolean[] o;
    public final IdentityHashMap p;
    public final i80 q;
    public final ArrayList r = new ArrayList();
    public final HashMap s = new HashMap();
    public mo2 t;
    public tv4 u;
    public no2[] v;
    public s80 w;

    public mv2(i80 i80Var, long[] jArr, no2... no2VarArr) {
        this.q = i80Var;
        this.n = no2VarArr;
        i80Var.getClass();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        this.w = new s80(gy3Var, gy3Var);
        this.p = new IdentityHashMap();
        this.v = new no2[0];
        this.o = new boolean[no2VarArr.length];
        for (int i = 0; i < no2VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.o[i] = true;
                this.n[i] = new wt4(no2VarArr[i], j);
            }
        }
    }

    @Override // defpackage.mo2
    public final void b(no2 no2Var) {
        ArrayList arrayList = this.r;
        arrayList.remove(no2Var);
        if (arrayList.isEmpty()) {
            no2[] no2VarArr = this.n;
            int i = 0;
            for (no2 no2Var2 : no2VarArr) {
                i += no2Var2.n().a;
            }
            sv4[] sv4VarArr = new sv4[i];
            int i2 = 0;
            for (int i3 = 0; i3 < no2VarArr.length; i3++) {
                tv4 tv4VarN = no2VarArr[i3].n();
                int i4 = tv4VarN.a;
                int i5 = 0;
                while (i5 < i4) {
                    sv4 sv4VarA = tv4VarN.a(i5);
                    int i6 = sv4VarA.a;
                    tb1[] tb1VarArr = new tb1[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        tb1 tb1Var = sv4VarA.d[i7];
                        sb1 sb1VarA = tb1Var.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = tb1Var.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb1VarA.a = sb.toString();
                        tb1VarArr[i7] = new tb1(sb1VarA);
                    }
                    sv4 sv4Var = new sv4(i3 + ":" + sv4VarA.b, tb1VarArr);
                    this.s.put(sv4Var, sv4VarA);
                    sv4VarArr[i2] = sv4Var;
                    i5++;
                    i2++;
                }
            }
            this.u = new tv4(sv4VarArr);
            mo2 mo2Var = this.t;
            mo2Var.getClass();
            mo2Var.b(this);
        }
    }

    @Override // defpackage.no2
    public final long c(t41[] t41VarArr, boolean[] zArr, q44[] q44VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[t41VarArr.length];
        int[] iArr2 = new int[t41VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = t41VarArr.length;
            identityHashMap = this.p;
            if (i2 >= length) {
                break;
            }
            q44 q44Var = q44VarArr[i2];
            Integer num = q44Var == null ? null : (Integer) identityHashMap.get(q44Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            t41 t41Var = t41VarArr[i2];
            if (t41Var != null) {
                String str = t41Var.c().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = t41VarArr.length;
        q44[] q44VarArr2 = new q44[length2];
        q44[] q44VarArr3 = new q44[t41VarArr.length];
        t41[] t41VarArr2 = new t41[t41VarArr.length];
        no2[] no2VarArr = this.n;
        ArrayList arrayList = new ArrayList(no2VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < no2VarArr.length) {
            int i4 = i;
            while (i4 < t41VarArr.length) {
                q44VarArr3[i4] = iArr[i4] == i3 ? q44VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    t41 t41Var2 = t41VarArr[i4];
                    t41Var2.getClass();
                    sv4 sv4Var = (sv4) this.s.get(t41Var2.c());
                    sv4Var.getClass();
                    t41VarArr2[i4] = new lv2(t41Var2, sv4Var);
                } else {
                    t41VarArr2[i4] = null;
                }
                i4++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            no2[] no2VarArr2 = no2VarArr;
            int i5 = i3;
            long jC = no2VarArr2[i3].c(t41VarArr2, zArr, q44VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jC;
            } else if (jC != j2) {
                kf2.o("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < t41VarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    q44 q44Var2 = q44VarArr3[i6];
                    q44Var2.getClass();
                    q44VarArr2[i6] = q44VarArr3[i6];
                    identityHashMap.put(q44Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr3[i6] == i5) {
                    rr2.w(q44VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(no2VarArr2[i5]);
            }
            i3 = i5 + 1;
            no2VarArr = no2VarArr2;
            iArr = iArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(q44VarArr2, i7, q44VarArr, i7, length2);
        this.v = (no2[]) arrayList.toArray(new no2[i7]);
        AbstractList abstractListP = hw.P(new zr2(25), arrayList);
        this.q.getClass();
        this.w = new s80(arrayList, abstractListP);
        return j2;
    }

    @Override // defpackage.da4
    public final long d() {
        return this.w.d();
    }

    @Override // defpackage.no2
    public final long e(long j, n84 n84Var) {
        no2[] no2VarArr = this.v;
        return (no2VarArr.length > 0 ? no2VarArr[0] : this.n[0]).e(j, n84Var);
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.w.f();
    }

    @Override // defpackage.no2
    public final void h() {
        for (no2 no2Var : this.n) {
            no2Var.h();
        }
    }

    @Override // defpackage.no2
    public final long i(long j) {
        long jI = this.v[0].i(j);
        int i = 1;
        while (true) {
            no2[] no2VarArr = this.v;
            if (i >= no2VarArr.length) {
                return jI;
            }
            if (no2VarArr[i].i(jI) != jI) {
                kf2.o("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // defpackage.ca4
    public final void j(da4 da4Var) {
        mo2 mo2Var = this.t;
        mo2Var.getClass();
        mo2Var.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean z, long j) {
        for (no2 no2Var : this.v) {
            no2Var.k(z, j);
        }
    }

    @Override // defpackage.no2
    public final long l() {
        long j;
        no2 no2Var;
        no2[] no2VarArr = this.v;
        int length = no2VarArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            no2 no2Var2 = no2VarArr[i];
            long jL = no2Var2.l();
            if (jL == j2) {
                j = j2;
                if (j3 != j && no2Var2.i(j3) != j3) {
                    kf2.o("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                no2[] no2VarArr2 = this.v;
                int length2 = no2VarArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (no2Var = no2VarArr2[i2]) == no2Var2) {
                        break;
                    }
                    if (no2Var.i(jL) != jL) {
                        kf2.o("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = jL;
            } else {
                j = j2;
                if (jL != j3) {
                    kf2.o("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // defpackage.no2
    public final void m(mo2 mo2Var, long j) {
        this.t = mo2Var;
        ArrayList arrayList = this.r;
        no2[] no2VarArr = this.n;
        Collections.addAll(arrayList, no2VarArr);
        for (no2 no2Var : no2VarArr) {
            no2Var.m(this, j);
        }
    }

    @Override // defpackage.no2
    public final tv4 n() {
        tv4 tv4Var = this.u;
        tv4Var.getClass();
        return tv4Var;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        ArrayList arrayList = this.r;
        if (arrayList.isEmpty()) {
            return this.w.o(pd2Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((no2) arrayList.get(i)).o(pd2Var);
        }
        return false;
    }

    @Override // defpackage.da4
    public final long q() {
        return this.w.q();
    }

    @Override // defpackage.da4
    public final void u(long j) {
        this.w.u(j);
    }
}
