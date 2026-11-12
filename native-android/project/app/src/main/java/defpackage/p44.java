package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class p44 implements wv4 {
    public tb1 A;
    public tb1 B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final m44 a;
    public final ww0 d;
    public final sw0 e;
    public o44 f;
    public tb1 g;
    public pw0 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final cw1 b = new cw1();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public vv4[] o = new vv4[1000];
    public final ue1 c = new ue1(new nz2(25));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public p44(n9 n9Var, ww0 ww0Var, sw0 sw0Var) {
        this.d = ww0Var;
        this.e = sw0Var;
        this.a = new m44(n9Var);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void A(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        rr2.l(z);
        this.s += i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0179 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x019f, B:112:0x01a8, B:89:0x013f, B:91:0x0148, B:93:0x0151, B:95:0x0165, B:99:0x016e, B:100:0x0173, B:102:0x0179, B:106:0x0187, B:108:0x018c, B:109:0x019c, B:92:0x014f), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0184  */
    /* JADX WARN: Code duplicated, block: B:105:0x0186  */
    /* JADX WARN: Code duplicated, block: B:108:0x018c A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x019f, B:112:0x01a8, B:89:0x013f, B:91:0x0148, B:93:0x0151, B:95:0x0165, B:99:0x016e, B:100:0x0173, B:102:0x0179, B:106:0x0187, B:108:0x018c, B:109:0x019c, B:92:0x014f), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:89:0x013f A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x019f, B:112:0x01a8, B:89:0x013f, B:91:0x0148, B:93:0x0151, B:95:0x0165, B:99:0x016e, B:100:0x0173, B:102:0x0179, B:106:0x0187, B:108:0x018c, B:109:0x019c, B:92:0x014f), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0148 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x019f, B:112:0x01a8, B:89:0x013f, B:91:0x0148, B:93:0x0151, B:95:0x0165, B:99:0x016e, B:100:0x0173, B:102:0x0179, B:106:0x0187, B:108:0x018c, B:109:0x019c, B:92:0x014f), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x014f A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x019f, B:112:0x01a8, B:89:0x013f, B:91:0x0148, B:93:0x0151, B:95:0x0165, B:99:0x016e, B:100:0x0173, B:102:0x0179, B:106:0x0187, B:108:0x018c, B:109:0x019c, B:92:0x014f), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0165 A[Catch: all -> 0x00de, TryCatch #1 {all -> 0x00de, blocks: (B:69:0x00c0, B:71:0x00c4, B:75:0x00da, B:78:0x00e1, B:82:0x00e9, B:87:0x0124, B:110:0x019f, B:112:0x01a8, B:89:0x013f, B:91:0x0148, B:93:0x0151, B:95:0x0165, B:99:0x016e, B:100:0x0173, B:102:0x0179, B:106:0x0187, B:108:0x018c, B:109:0x019c, B:92:0x014f), top: B:118:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x016b  */
    /* JADX WARN: Code duplicated, block: B:98:0x016d  */
    @Override // defpackage.wv4
    public void a(long j, int i, int i2, int i3, vv4 vv4Var) {
        int i4;
        tb1 tb1Var;
        ww0 ww0Var;
        vw0 vw0VarD;
        ue1 ue1Var;
        int i5;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.z) {
            tb1 tb1Var2 = this.A;
            tb1Var2.getClass();
            g(tb1Var2);
        }
        int i6 = i & 1;
        boolean z4 = i6 != 0;
        if (this.x) {
            if (!z4) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = j + this.F;
        if (!this.D) {
            i4 = i;
        } else {
            if (j2 < this.t) {
                return;
            }
            if (i6 == 0) {
                if (!this.E) {
                    l93.q0("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.G) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.p == 0) {
                        z3 = j2 > this.u;
                    } else {
                        synchronized (this) {
                            long jMax = Math.max(this.u, n(this.s));
                            if (jMax >= j2) {
                                z3 = false;
                            } else {
                                int i7 = this.p;
                                int iP = p(i7 - 1);
                                while (i7 > this.s && this.n[iP] >= j2) {
                                    i7--;
                                    iP--;
                                    if (iP == -1) {
                                        iP = this.i - 1;
                                    }
                                }
                                k(this.q + i7);
                                z3 = true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3) {
                return;
            } else {
                this.G = false;
            }
        }
        long j3 = (this.a.g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i8 = this.p;
                if (i8 > 0) {
                    int iP2 = p(i8 - 1);
                    rr2.l(this.k[iP2] + ((long) this.l[iP2]) <= j3);
                }
                this.w = (536870912 & i4) != 0;
                this.v = Math.max(this.v, j2);
                int iP3 = p(this.p);
                this.n[iP3] = j2;
                this.k[iP3] = j3;
                this.l[iP3] = i2;
                this.m[iP3] = i4;
                this.o[iP3] = vv4Var;
                this.j[iP3] = this.C;
                if (((SparseArray) this.c.p).size() == 0) {
                    tb1Var = this.B;
                    tb1Var.getClass();
                    ww0Var = this.d;
                    if (ww0Var != null) {
                        vw0VarD = ww0Var.d(this.e, tb1Var);
                    } else {
                        vw0VarD = vw0.h;
                    }
                    ue1Var = this.c;
                    i5 = this.q + this.p;
                    n44 n44Var = new n44(tb1Var, vw0VarD);
                    sparseArray = (SparseArray) ue1Var.p;
                    if (ue1Var.o == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        rr2.w(z2);
                        ue1Var.o = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i5 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        rr2.l(z);
                        if (iKeyAt == i5) {
                            ((nz2) ue1Var.q).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i5, n44Var);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.c.p;
                    if (!((n44) sparseArray2.valueAt(sparseArray2.size() - 1)).a.equals(this.B)) {
                        tb1Var = this.B;
                        tb1Var.getClass();
                        ww0Var = this.d;
                        if (ww0Var != null) {
                            vw0VarD = ww0Var.d(this.e, tb1Var);
                        } else {
                            vw0VarD = vw0.h;
                        }
                        ue1Var = this.c;
                        i5 = this.q + this.p;
                        n44 n44Var2 = new n44(tb1Var, vw0VarD);
                        sparseArray = (SparseArray) ue1Var.p;
                        if (ue1Var.o == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            rr2.w(z2);
                            ue1Var.o = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i5 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            rr2.l(z);
                            if (iKeyAt == i5) {
                                ((nz2) ue1Var.q).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i5, n44Var2);
                    }
                }
                int i9 = this.p + 1;
                this.p = i9;
                int i10 = this.i;
                if (i9 == i10) {
                    int i11 = i10 + 1000;
                    long[] jArr = new long[i11];
                    long[] jArr2 = new long[i11];
                    long[] jArr3 = new long[i11];
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    vv4[] vv4VarArr = new vv4[i11];
                    int i12 = this.r;
                    int i13 = i10 - i12;
                    System.arraycopy(this.k, i12, jArr2, 0, i13);
                    System.arraycopy(this.n, this.r, jArr3, 0, i13);
                    System.arraycopy(this.m, this.r, iArr, 0, i13);
                    System.arraycopy(this.l, this.r, iArr2, 0, i13);
                    System.arraycopy(this.o, this.r, vv4VarArr, 0, i13);
                    System.arraycopy(this.j, this.r, jArr, 0, i13);
                    int i14 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i13, i14);
                    System.arraycopy(this.n, 0, jArr3, i13, i14);
                    System.arraycopy(this.m, 0, iArr, i13, i14);
                    System.arraycopy(this.l, 0, iArr2, i13, i14);
                    System.arraycopy(this.o, 0, vv4VarArr, i13, i14);
                    System.arraycopy(this.j, 0, jArr, i13, i14);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = vv4VarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.wv4
    public final void b(be3 be3Var, int i, int i2) {
        while (true) {
            m44 m44Var = this.a;
            if (i <= 0) {
                m44Var.getClass();
                return;
            }
            int iB = m44Var.b(i);
            ru ruVar = m44Var.f;
            m9 m9Var = (m9) ruVar.p;
            be3Var.k(m9Var.a, ((int) (m44Var.g - ruVar.n)) + m9Var.b, iB);
            i -= iB;
            long j = m44Var.g + ((long) iB);
            m44Var.g = j;
            ru ruVar2 = m44Var.f;
            if (j == ruVar2.o) {
                m44Var.f = (ru) ruVar2.q;
            }
        }
    }

    @Override // defpackage.wv4
    public final int c(wh0 wh0Var, int i, boolean z) throws EOFException {
        m44 m44Var = this.a;
        int iB = m44Var.b(i);
        ru ruVar = m44Var.f;
        m9 m9Var = (m9) ruVar.p;
        int i2 = wh0Var.read(m9Var.a, ((int) (m44Var.g - ruVar.n)) + m9Var.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = m44Var.g + ((long) i2);
        m44Var.g = j;
        ru ruVar2 = m44Var.f;
        if (j == ruVar2.o) {
            m44Var.f = (ru) ruVar2.q;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:18:0x0059), top: B:29:0x000a }] */
    @Override // defpackage.wv4
    public final void g(tb1 tb1Var) {
        tb1 tb1VarM = m(tb1Var);
        boolean z = false;
        this.z = false;
        this.A = tb1Var;
        synchronized (this) {
            try {
                this.y = false;
                if (!Objects.equals(tb1VarM, this.B)) {
                    if (((SparseArray) this.c.p).size() == 0) {
                        this.B = tb1VarM;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.c.p;
                        if (((n44) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(tb1VarM)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.p;
                            this.B = ((n44) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        } else {
                            this.B = tb1VarM;
                        }
                    }
                    boolean z2 = this.D;
                    tb1 tb1Var2 = this.B;
                    this.D = z2 & lw2.a(tb1Var2.n, tb1Var2.k);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o44 o44Var = this.f;
        if (o44Var == null || !z) {
            return;
        }
        o44Var.r();
    }

    public final long h(int i) {
        this.u = Math.max(this.u, n(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        ue1 ue1Var = this.c;
        SparseArray sparseArray = (SparseArray) ue1Var.p;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((nz2) ue1Var.q).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = ue1Var.o;
            if (i8 > 0) {
                ue1Var.o = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void i(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        m44 m44Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long jH = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z2) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iL = l(i2, i, j, z);
                            if (iL != -1) {
                                jH = h(iL);
                            }
                        }
                    }
                    m44Var.a(jH);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void j() {
        long jH;
        m44 m44Var = this.a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        m44Var.a(jH);
    }

    public final long k(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        rr2.l(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, n(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        ue1 ue1Var = this.c;
        SparseArray sparseArray = (SparseArray) ue1Var.p;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((nz2) ue1Var.q).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        ue1Var.o = sparseArray.size() > 0 ? Math.min(ue1Var.o, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        int iP = p(i6 - 1);
        return this.k[iP] + ((long) this.l[iP]);
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public tb1 m(tb1 tb1Var) {
        if (this.F == 0 || tb1Var.s == Long.MAX_VALUE) {
            return tb1Var;
        }
        sb1 sb1VarA = tb1Var.a();
        sb1VarA.r = tb1Var.s + this.F;
        return new tb1(sb1VarA);
    }

    public final long n(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iP = p(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iP]);
            if ((this.m[iP] & 1) != 0) {
                return jMax;
            }
            iP--;
            if (iP == -1) {
                iP = this.i - 1;
            }
        }
        return jMax;
    }

    public final int o() {
        return this.q + this.s;
    }

    public final int p(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int q(boolean z, long j) {
        try {
            try {
                int iP = p(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iP]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iL = l(iP, i2 - i, j, true);
                if (iL == -1) {
                    return 0;
                }
                return iL;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized tb1 r() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean s(boolean z) {
        tb1 tb1Var;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((n44) this.c.l(o())).a != this.g) {
                return true;
            }
            return t(p(this.s));
        }
        if (z || this.w || ((tb1Var = this.B) != null && tb1Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean t(int i) {
        pw0 pw0Var = this.h;
        if (pw0Var == null || pw0Var.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.c();
    }

    public final void u(tb1 tb1Var, gp3 gp3Var) {
        tb1 tb1Var2;
        tb1 tb1Var3 = this.g;
        boolean z = tb1Var3 == null;
        ow0 ow0Var = tb1Var3 == null ? null : tb1Var3.r;
        this.g = tb1Var;
        ow0 ow0Var2 = tb1Var.r;
        ww0 ww0Var = this.d;
        if (ww0Var != null) {
            int iF = ww0Var.f(tb1Var);
            sb1 sb1VarA = tb1Var.a();
            sb1VarA.N = iF;
            tb1Var2 = new tb1(sb1VarA);
        } else {
            tb1Var2 = tb1Var;
        }
        gp3Var.p = tb1Var2;
        gp3Var.o = this.h;
        if (ww0Var == null) {
            return;
        }
        if (z || !Objects.equals(ow0Var, ow0Var2)) {
            pw0 pw0Var = this.h;
            sw0 sw0Var = this.e;
            pw0 pw0VarC = ww0Var.c(sw0Var, tb1Var);
            this.h = pw0VarC;
            gp3Var.o = pw0VarC;
            if (pw0Var != null) {
                pw0Var.d(sw0Var);
            }
        }
    }

    public final synchronized long v() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[p(this.s)] : this.C;
    }

    public final int w(gp3 gp3Var, cj0 cj0Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        cw1 cw1Var = this.b;
        synchronized (this) {
            try {
                cj0Var.s = false;
                i2 = -3;
                if (this.s != this.p) {
                    tb1 tb1Var = ((n44) this.c.l(o())).a;
                    if (z2 || tb1Var != this.g) {
                        u(tb1Var, gp3Var);
                        i2 = -5;
                    } else {
                        int iP = p(this.s);
                        if (t(iP)) {
                            cj0Var.o = this.m[iP];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                cj0Var.a(536870912);
                            }
                            cj0Var.t = this.n[iP];
                            cw1Var.a = this.l[iP];
                            cw1Var.b = this.k[iP];
                            cw1Var.c = this.o[iP];
                            i2 = -4;
                        } else {
                            cj0Var.s = true;
                        }
                    }
                } else if (z || this.w) {
                    cj0Var.o = 4;
                    cj0Var.t = Long.MIN_VALUE;
                    i2 = -4;
                } else {
                    tb1 tb1Var2 = this.B;
                    if (tb1Var2 != null && (z2 || tb1Var2 != this.g)) {
                        u(tb1Var2, gp3Var);
                        i2 = -5;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !cj0Var.d(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                m44 m44Var = this.a;
                cw1 cw1Var2 = this.b;
                if (z3) {
                    m44.e(m44Var.e, cj0Var, cw1Var2, m44Var.c);
                } else {
                    m44Var.e = m44.e(m44Var.e, cj0Var, cw1Var2, m44Var.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void x(boolean z) {
        m44 m44Var = this.a;
        ru ruVar = m44Var.d;
        n9 n9Var = m44Var.a;
        if (((m9) ruVar.p) != null) {
            n9Var.a(ruVar);
            ruVar.p = null;
            ruVar.q = null;
        }
        ru ruVar2 = m44Var.d;
        int i = m44Var.b;
        rr2.w(((m9) ruVar2.p) == null);
        ruVar2.n = 0L;
        ruVar2.o = i;
        ru ruVar3 = m44Var.d;
        m44Var.e = ruVar3;
        m44Var.f = ruVar3;
        m44Var.g = 0L;
        n9Var.h();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        ue1 ue1Var = this.c;
        SparseArray sparseArray = (SparseArray) ue1Var.p;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((nz2) ue1Var.q).accept(sparseArray.valueAt(i2));
        }
        ue1Var.o = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean y(int i) {
        synchronized (this) {
            this.s = 0;
            m44 m44Var = this.a;
            m44Var.e = m44Var.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean z(boolean z, long j) {
        Throwable th;
        p44 p44Var;
        long j2;
        int iL;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                m44 m44Var = this.a;
                                m44Var.e = m44Var.d;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        throw th;
                                    }
                                }
                            }
                        }
                        return false;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            int iP = p(0);
            int i = this.s;
            int i2 = this.p;
            if (!(i != i2) || j < this.n[iP] || (j > this.v && !z)) {
                return false;
            }
            if (this.D) {
                iL = i2 - i;
                int i3 = 0;
                while (true) {
                    if (i3 >= iL) {
                        if (!z) {
                            iL = -1;
                            break;
                        }
                        break;
                    }
                    try {
                        if (this.n[iP] >= j) {
                            iL = i3;
                            break;
                        }
                        iP++;
                        if (iP == this.i) {
                            iP = 0;
                        }
                        i3++;
                    } catch (Throwable th7) {
                        th = th7;
                        this = this;
                    }
                }
                p44Var = this;
                j2 = j;
            } else {
                p44Var = this;
                j2 = j;
                iL = p44Var.l(iP, i2 - i, j2, true);
            }
            if (iL == -1) {
                return false;
            }
            p44Var.t = j2;
            p44Var.s += iL;
            return true;
        } catch (Throwable th8) {
            th = th8;
            this = this;
            th = th;
        }
        throw th;
    }
}
