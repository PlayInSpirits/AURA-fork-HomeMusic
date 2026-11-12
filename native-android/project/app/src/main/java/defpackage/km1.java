package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {
    public final xk0 a;
    public final ci0 b;
    public final ci0 c;
    public final si1 d;
    public final Uri[] e;
    public final tb1[] f;
    public final al0 g;
    public final sv4 h;
    public final List i;
    public final ik3 k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public Uri p;
    public boolean q;
    public t41 r;
    public final zh0 j = new zh0(27);
    public byte[] m = f35.b;
    public long s = -9223372036854775807L;

    public km1(xk0 xk0Var, al0 al0Var, Uri[] uriArr, tb1[] tb1VarArr, zh0 zh0Var, rw4 rw4Var, si1 si1Var, List list, ik3 ik3Var) {
        this.a = xk0Var;
        this.g = al0Var;
        this.e = uriArr;
        this.f = tb1VarArr;
        this.d = si1Var;
        this.i = list;
        this.k = ik3Var;
        ci0 ci0VarM = ((bi0) zh0Var.o).m();
        this.b = ci0VarM;
        if (rw4Var != null) {
            ci0VarM.c(rw4Var);
        }
        this.c = ((bi0) zh0Var.o).m();
        this.h = new sv4("", tb1VarArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((tb1VarArr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        sv4 sv4Var = this.h;
        int[] iArrN = jz4.N(arrayList);
        im1 im1Var = new im1(0, sv4Var, iArrN);
        tb1 tb1Var = sv4Var.d[iArrN[0]];
        while (i < im1Var.b) {
            if (im1Var.d[i] == tb1Var) {
                im1Var.g = i;
                this.r = im1Var;
            }
            i++;
        }
        i = -1;
        im1Var.g = i;
        this.r = im1Var;
    }

    public static jm1 d(ym1 ym1Var, long j, int i) {
        long j2 = ym1Var.k;
        yw1 yw1Var = ym1Var.s;
        int i2 = (int) (j - j2);
        yw1 yw1Var2 = ym1Var.r;
        if (i2 == yw1Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < yw1Var.size()) {
                return new jm1((wm1) yw1Var.get(i), j, i);
            }
            return null;
        }
        vm1 vm1Var = (vm1) yw1Var2.get(i2);
        if (i == -1) {
            return new jm1(vm1Var, j, -1);
        }
        if (i < vm1Var.z.size()) {
            return new jm1((wm1) vm1Var.z.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < yw1Var2.size()) {
            return new jm1((wm1) yw1Var2.get(i3), j + 1, -1);
        }
        if (yw1Var.isEmpty()) {
            return null;
        }
        return new jm1((wm1) yw1Var.get(0), j + 1, 0);
    }

    public final xj2[] a(nm1 nm1Var, long j) {
        List listUnmodifiableList;
        km1 km1Var = this;
        nm1 nm1Var2 = nm1Var;
        int iB = nm1Var2 == null ? -1 : km1Var.h.b(nm1Var2.d);
        int length = km1Var.r.length();
        xj2[] xj2VarArr = new xj2[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int i2 = km1Var.r.i(i);
            Uri uri = km1Var.e[i2];
            al0 al0Var = km1Var.g;
            if (al0Var.d(uri)) {
                ym1 ym1VarA = al0Var.a(z, uri);
                ym1VarA.getClass();
                long j2 = ym1VarA.h - al0Var.A;
                Pair pairC = km1Var.c(nm1Var2, i2 != iB ? true : z, ym1VarA, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j3 = ym1VarA.k;
                yw1 yw1Var = ym1VarA.s;
                yw1 yw1Var2 = ym1VarA.r;
                int i3 = (int) (jLongValue - j3);
                if (i3 < 0 || yw1Var2.size() < i3) {
                    vw1 vw1Var = yw1.o;
                    listUnmodifiableList = gy3.r;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i3 < yw1Var2.size()) {
                        if (iIntValue != -1) {
                            vm1 vm1Var = (vm1) yw1Var2.get(i3);
                            if (iIntValue == 0) {
                                arrayList.add(vm1Var);
                            } else if (iIntValue < vm1Var.z.size()) {
                                yw1 yw1Var3 = vm1Var.z;
                                arrayList.addAll(yw1Var3.subList(iIntValue, yw1Var3.size()));
                            }
                            i3++;
                        }
                        arrayList.addAll(yw1Var2.subList(i3, yw1Var2.size()));
                        iIntValue = 0;
                    }
                    if (ym1VarA.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < yw1Var.size()) {
                            arrayList.addAll(yw1Var.subList(iIntValue, yw1Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                xj2VarArr[i] = new hm1(j2, listUnmodifiableList);
            } else {
                xj2VarArr[i] = xj2.j;
            }
            i++;
            km1Var = this;
            nm1Var2 = nm1Var;
            z = false;
        }
        return xj2VarArr;
    }

    public final int b(nm1 nm1Var) {
        int i = nm1Var.o;
        if (i == -1) {
            return 1;
        }
        ym1 ym1VarA = this.g.a(false, this.e[this.h.b(nm1Var.d)]);
        ym1VarA.getClass();
        yw1 yw1Var = ym1VarA.r;
        int i2 = (int) (nm1Var.j - ym1VarA.k);
        if (i2 < 0) {
            return 1;
        }
        yw1 yw1Var2 = i2 < yw1Var.size() ? ((vm1) yw1Var.get(i2)).z : ym1VarA.s;
        if (i >= yw1Var2.size()) {
            return 2;
        }
        tm1 tm1Var = (tm1) yw1Var2.get(i);
        if (tm1Var.z) {
            return 0;
        }
        return Objects.equals(Uri.parse(jz4.G(ym1VarA.a, tm1Var.n)), nm1Var.b.a) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    public final Pair c(nm1 nm1Var, boolean z, ym1 ym1Var, long j, long j2) {
        int i;
        yw1 yw1Var;
        boolean z2 = true;
        if (nm1Var != null) {
            long j3 = nm1Var.j;
            int i2 = nm1Var.o;
            if (!z) {
                if (!nm1Var.H) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    j3 = j3 != -1 ? j3 + 1 : -1L;
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j4 = ym1Var.u;
        long j5 = ym1Var.k;
        yw1 yw1Var2 = ym1Var.s;
        yw1 yw1Var3 = ym1Var.r;
        long j6 = j + j4;
        long j7 = (nm1Var == null || this.q) ? j2 : nm1Var.g;
        if (!ym1Var.o && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + ((long) yw1Var3.size())), -1);
        }
        long j8 = j7 - j;
        Long lValueOf = Long.valueOf(j8);
        al0 al0Var = this.g;
        if (al0Var.z && nm1Var != null) {
            z2 = false;
        }
        int iD = f35.d(yw1Var3, lValueOf, z2);
        long j9 = ((long) iD) + j5;
        if (!al0Var.z) {
            return new Pair(Long.valueOf(j9), -1);
        }
        if (iD < 0) {
            i = -1;
        } else {
            if (yw1Var3.isEmpty()) {
                yw1Var = yw1Var2;
            } else {
                vm1 vm1Var = (vm1) yw1Var3.get(iD);
                if (j8 < vm1Var.r + vm1Var.p) {
                    yw1Var = vm1Var.z;
                } else {
                    yw1Var = yw1Var2;
                }
            }
            for (int i3 = 0; i3 < yw1Var.size(); i3++) {
                tm1 tm1Var = (tm1) yw1Var.get(i3);
                if (j8 < tm1Var.r + tm1Var.p) {
                    if (tm1Var.y) {
                        j9 += (yw1Var != yw1Var2 || yw1Var3.isEmpty()) ? 0L : 1L;
                        i = i3;
                    }
                }
            }
            i = -1;
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gm1 e(Uri uri, int i, boolean z) {
        if (uri == null) {
            return null;
        }
        zh0 zh0Var = this.j;
        byte[] bArr = (byte[]) ((ef1) zh0Var.o).remove(uri);
        if (bArr != null) {
            return null;
        }
        ii0 ii0Var = new ii0(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        tb1 tb1Var = this.f[i];
        int iN = this.r.n();
        Object objQ = this.r.q();
        byte[] bArr2 = this.m;
        gm1 gm1Var = new gm1(this.c, ii0Var, 3, tb1Var, iN, objQ, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = f35.b;
        }
        gm1Var.j = bArr2;
        return gm1Var;
    }
}
