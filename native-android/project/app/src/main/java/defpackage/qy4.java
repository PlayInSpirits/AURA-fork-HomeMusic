package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy4 implements k51 {
    public final int a;
    public final int b;
    public final List c;
    public final be3 d;
    public final SparseIntArray e;
    public final qn0 f;
    public final xn4 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final sr3 k;
    public r71 l;
    public m51 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ty4 r;
    public int s;
    public int t;

    public qy4(int i, int i2, xn4 xn4Var, iu4 iu4Var, qn0 qn0Var) {
        this.f = qn0Var;
        this.a = i;
        this.b = i2;
        this.g = xn4Var;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(iu4Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(iu4Var);
        }
        this.d = new be3(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new sr3(1);
        this.m = m51.i;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (ty4) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new h84(new xc5(this)));
        this.r = null;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ty4] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        l51 l51Var2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        ty4 ty4Var;
        boolean z;
        long jP;
        long length = l51Var.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            sr3 sr3Var = this.k;
            if (length != -1 && !z2 && !sr3Var.d) {
                int i6 = this.t;
                iu4 iu4Var = sr3Var.b;
                be3 be3Var = sr3Var.c;
                if (i6 <= 0) {
                    sr3Var.a(l51Var);
                    return 0;
                }
                if (sr3Var.f) {
                    if (sr3Var.h == -9223372036854775807L) {
                        sr3Var.a(l51Var);
                        return 0;
                    }
                    if (sr3Var.e) {
                        long j2 = sr3Var.g;
                        if (j2 == -9223372036854775807L) {
                            sr3Var.a(l51Var);
                            return 0;
                        }
                        sr3Var.i = iu4Var.c(sr3Var.h) - iu4Var.b(j2);
                        sr3Var.a(l51Var);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, l51Var.getLength());
                    if (l51Var.getPosition() != 0) {
                        t71Var.a = 0L;
                        return 1;
                    }
                    be3Var.K(iMin);
                    l51Var.k();
                    l51Var.n(be3Var.a, 0, iMin);
                    int i7 = be3Var.c;
                    for (int i8 = be3Var.b; i8 < i7; i8++) {
                        if (be3Var.a[i8] == 71) {
                            jP = au0.P(be3Var, i8, i6);
                            if (jP != -9223372036854775807L) {
                                sr3Var.g = jP;
                                sr3Var.e = true;
                                return 0;
                            }
                        }
                    }
                    jP = -9223372036854775807L;
                    sr3Var.g = jP;
                    sr3Var.e = true;
                    return 0;
                }
                long length2 = l51Var.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (l51Var.getPosition() != j3) {
                    t71Var.a = j3;
                    return 1;
                }
                be3Var.K(iMin2);
                l51Var.k();
                l51Var.n(be3Var.a, 0, iMin2);
                int i9 = be3Var.b;
                int i10 = be3Var.c;
                for (int i11 = i10 - 188; i11 >= i9; i11--) {
                    byte[] bArr = be3Var.a;
                    int i12 = 0;
                    for (int i13 = -4; i13 <= 4; i13++) {
                        int i14 = (i13 * 188) + i11;
                        if (i14 >= i9 && i14 < i10 && bArr[i14] == 71) {
                            i12++;
                            if (i12 == 5) {
                                long jP2 = au0.P(be3Var, i11, i6);
                                if (jP2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jP2;
                                break;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                }
                sr3Var.h = j;
                sr3Var.f = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j4 = sr3Var.i;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    r71 r71Var = new r71(new pa(18), new ue1(this.t, sr3Var.b), j4, j4 + 1, 0L, length, 188L, 940);
                    this.l = r71Var;
                    this.m.w(r71Var.a);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.w(new bo(j4));
                }
            }
            if (this.q) {
                this.q = z;
                d(0L, 0L);
                if (l51Var.getPosition() != 0) {
                    t71Var.a = 0L;
                    return i;
                }
            }
            r71 r71Var2 = this.l;
            if (r71Var2 != null && r71Var2.c != null) {
                return r71Var2.b(l51Var, t71Var);
            }
            l51Var2 = l51Var;
            r1 = z;
        } else {
            l51Var2 = l51Var;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        be3 be3Var2 = this.d;
        byte[] bArr2 = be3Var2.a;
        if (9400 - be3Var2.b < 188) {
            int iA = be3Var2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, be3Var2.b, bArr2, r1, iA);
            }
            be3Var2.L(iA, bArr2);
        }
        while (true) {
            int iA2 = be3Var2.a();
            ?? r7 = this.h;
            if (iA2 >= 188) {
                int i15 = be3Var2.b;
                int i16 = be3Var2.c;
                byte[] bArr3 = be3Var2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                be3Var2.N(i17);
                int i18 = i17 + 188;
                ?? r8 = 0;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = be3Var2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iM = be3Var2.m();
                if ((8388608 & iM) != 0) {
                    be3Var2.N(i18);
                    return r1;
                }
                ?? r10 = (4194304 & iM) != 0 ? 1 : r1;
                int i21 = (2096896 & iM) >> 8;
                ?? r14 = (iM & 32) != 0 ? 1 : r1;
                if ((iM & 16) != 0) {
                    ty4Var = (ty4) r7.get(i21);
                }
                if (r8 == 0) {
                    r8 = ty4Var;
                    be3Var2.N(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iM & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        be3Var2.N(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.c();
                    }
                }
                if (r14 != 0) {
                    int iA3 = be3Var2.A();
                    r10 = (r10 == true ? 1 : 0) | ((be3Var2.A() & 64) != 0 ? i4 : r1);
                    be3Var2.O(iA3 - 1);
                }
                boolean z3 = this.o;
                if (i3 == i4 || z3 || !this.j.get(i21, r1)) {
                    be3Var2.M(i18);
                    r8.a(r10, be3Var2);
                    be3Var2.M(i20);
                }
                if (i3 != i4 && !z3 && this.o && length != -1) {
                    this.q = true;
                }
                be3Var2.N(i18);
                return r1;
            }
            int i24 = be3Var2.c;
            int i25 = l51Var2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < r7.size(); r4++) {
                    ty4 ty4Var2 = (ty4) r7.valueAt(r4);
                    if (ty4Var2 instanceof ag3) {
                        ag3 ag3Var = (ag3) ty4Var2;
                        ?? r3 = (!z2 || ag3Var.e()) ? i : r1;
                        if (ag3Var.c == 3 && ag3Var.j == -1 && ((!z2 || !(ag3Var.a instanceof vk1)) && r3 != 0)) {
                            ag3Var.a(i, new be3());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            be3Var2.M(i24 + i25);
            i = 1;
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) throws EOFException, InterruptedIOException {
        byte[] bArr = this.d.a;
        rk0 rk0Var = (rk0) l51Var;
        rk0Var.e(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    rk0Var.d(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        r71 r71Var;
        long j3;
        SparseArray sparseArray = this.h;
        List list = this.c;
        rr2.w(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iu4 iu4Var = (iu4) list.get(i);
            synchronized (iu4Var) {
                j3 = iu4Var.b;
            }
            boolean z = j3 == -9223372036854775807L;
            if (!z) {
                long jD = iu4Var.d();
                z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
            }
            if (z) {
                iu4Var.f(j2);
            }
        }
        if (j2 != 0 && (r71Var = this.l) != null) {
            r71Var.d(j2);
        }
        this.d.K(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ty4) sparseArray.valueAt(i2)).c();
        }
        this.s = 0;
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        if ((this.b & 1) == 0) {
            m51Var = new ll(m51Var, this.g);
        }
        this.m = m51Var;
    }
}
