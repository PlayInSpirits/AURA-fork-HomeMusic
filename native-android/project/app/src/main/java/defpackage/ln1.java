package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 implements hd2, kd2, da4, m51, o44 {
    public static final Set l0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList A;
    public final List B;
    public final in1 C;
    public final in1 D;
    public final Handler E;
    public final ArrayList F;
    public final Map G;
    public s20 H;
    public kn1[] I;
    public int[] J;
    public final HashSet K;
    public final SparseIntArray L;
    public jn1 M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public tb1 S;
    public tb1 T;
    public boolean U;
    public tv4 V;
    public Set W;
    public int[] X;
    public int Y;
    public boolean Z;
    public boolean[] a0;
    public boolean[] b0;
    public long c0;
    public long d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public long i0;
    public ow0 j0;
    public nm1 k0;
    public final String n;
    public final int o;
    public final om1 p;
    public final km1 q;
    public final n9 r;
    public final tb1 s;
    public final ww0 t;
    public final sw0 u;
    public final i80 v;
    public final i61 w;
    public final ue1 x;
    public final int y;
    public final mf4 z;

    /* JADX WARN: Type inference failed for: r2v13, types: [in1] */
    /* JADX WARN: Type inference failed for: r2v14, types: [in1] */
    public ln1(String str, int i, om1 om1Var, km1 km1Var, Map map, n9 n9Var, long j, tb1 tb1Var, ww0 ww0Var, sw0 sw0Var, i80 i80Var, ue1 ue1Var, int i2, ty3 ty3Var) {
        this.n = str;
        this.o = i;
        this.p = om1Var;
        this.q = km1Var;
        this.G = map;
        this.r = n9Var;
        this.s = tb1Var;
        this.t = ww0Var;
        this.u = sw0Var;
        this.v = i80Var;
        this.x = ue1Var;
        this.y = i2;
        this.w = ty3Var != null ? new i61(ty3Var) : new i61("Loader:HlsSampleStreamWrapper");
        mf4 mf4Var = new mf4(4);
        mf4Var.p = null;
        final int i3 = 0;
        mf4Var.o = false;
        mf4Var.q = null;
        this.z = mf4Var;
        this.J = new int[0];
        Set set = l0;
        this.K = new HashSet(set.size());
        this.L = new SparseIntArray(set.size());
        this.I = new kn1[0];
        this.b0 = new boolean[0];
        this.a0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.A = arrayList;
        this.B = Collections.unmodifiableList(arrayList);
        this.F = new ArrayList();
        this.C = new Runnable(this) { // from class: in1
            public final /* synthetic */ ln1 o;

            {
                this.o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                ln1 ln1Var = this.o;
                switch (i4) {
                    case 0:
                        ln1Var.F();
                        break;
                    default:
                        ln1Var.P = true;
                        ln1Var.F();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.D = new Runnable(this) { // from class: in1
            public final /* synthetic */ ln1 o;

            {
                this.o = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i4;
                ln1 ln1Var = this.o;
                switch (i5) {
                    case 0:
                        ln1Var.F();
                        break;
                    default:
                        ln1Var.P = true;
                        ln1Var.F();
                        break;
                }
            }
        };
        this.E = f35.p(null);
        this.c0 = j;
        this.d0 = j;
    }

    public static tb1 A(tb1 tb1Var, tb1 tb1Var2, boolean z) {
        String strB;
        if (tb1Var == null) {
            return tb1Var2;
        }
        String str = tb1Var.k;
        String strD = tb1Var2.n;
        int iH = lw2.h(strD);
        if (f35.u(iH, str) == 1) {
            strB = f35.v(iH, str);
            strD = lw2.d(strB);
        } else {
            strB = lw2.b(str, strD);
        }
        sb1 sb1VarA = tb1Var2.a();
        sb1VarA.a = tb1Var.a;
        sb1VarA.b = tb1Var.b;
        sb1VarA.c = yw1.k(tb1Var.c);
        sb1VarA.d = tb1Var.d;
        sb1VarA.e = tb1Var.e;
        sb1VarA.f = tb1Var.f;
        sb1VarA.h = z ? tb1Var.h : -1;
        sb1VarA.i = z ? tb1Var.i : -1;
        sb1VarA.j = strB;
        if (iH == 2) {
            sb1VarA.t = tb1Var.u;
            sb1VarA.u = tb1Var.v;
            sb1VarA.x = tb1Var.y;
        }
        if (strD != null) {
            sb1VarA.m = lw2.m(strD);
        }
        int i = tb1Var.F;
        if (i != -1 && iH == 1) {
            sb1VarA.E = i;
        }
        qv2 qv2VarB = tb1Var.l;
        if (qv2VarB != null) {
            qv2 qv2Var = tb1Var2.l;
            if (qv2Var != null) {
                qv2VarB = qv2Var.b(qv2VarB);
            }
            sb1VarA.k = qv2VarB;
        }
        return new tb1(sb1VarA);
    }

    public static int D(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    public static tq0 y(int i, int i2) {
        l93.q0("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new tq0();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    public final void B(int i) {
        ArrayList arrayList;
        ru ruVar;
        ru ruVar2;
        boolean z = true;
        rr2.w(!this.w.l());
        int i2 = i;
        while (true) {
            arrayList = this.A;
            if (i2 >= arrayList.size()) {
                i2 = -1;
                break;
            } else if (x(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j = C().h;
        nm1 nm1Var = (nm1) arrayList.get(i2);
        f35.X(arrayList, i2, arrayList.size());
        int i3 = 0;
        while (i3 < this.I.length) {
            int iE = nm1Var.e(i3);
            kn1 kn1Var = this.I[i3];
            m44 m44Var = kn1Var.a;
            long jK = kn1Var.k(iE);
            int i4 = m44Var.b;
            n9 n9Var = m44Var.a;
            rr2.l(jK <= m44Var.g ? z : false);
            m44Var.g = jK;
            if (jK != 0) {
                ru ruVar3 = m44Var.d;
                if (jK == ruVar3.n) {
                    ruVar = m44Var.d;
                    if (((m9) ruVar.p) != null) {
                        n9Var.a(ruVar);
                        ruVar.p = null;
                        ruVar.q = null;
                    }
                    ru ruVar4 = new ru(i4, m44Var.g);
                    m44Var.d = ruVar4;
                    m44Var.e = ruVar4;
                    m44Var.f = ruVar4;
                } else {
                    while (true) {
                        long j2 = m44Var.g;
                        long j3 = ruVar3.o;
                        ruVar2 = (ru) ruVar3.q;
                        if (j2 <= j3) {
                            break;
                        } else {
                            ruVar3 = ruVar2;
                        }
                    }
                    ruVar2.getClass();
                    if (((m9) ruVar2.p) != null) {
                        n9Var.a(ruVar2);
                        ruVar2.p = null;
                        ruVar2.q = null;
                    }
                    ru ruVar5 = new ru(i4, ruVar3.o);
                    ruVar3.q = ruVar5;
                    if (m44Var.g == ruVar3.o) {
                        ruVar3 = ruVar5;
                    }
                    m44Var.f = ruVar3;
                    if (m44Var.e == ruVar2) {
                        m44Var.e = ruVar5;
                    }
                }
            } else {
                ruVar = m44Var.d;
                if (((m9) ruVar.p) != null) {
                    n9Var.a(ruVar);
                    ruVar.p = null;
                    ruVar.q = null;
                }
                ru ruVar6 = new ru(i4, m44Var.g);
                m44Var.d = ruVar6;
                m44Var.e = ruVar6;
                m44Var.f = ruVar6;
            }
            i3++;
            z = true;
        }
        if (arrayList.isEmpty()) {
            this.d0 = this.c0;
        } else {
            ((nm1) te5.w(arrayList)).J = true;
        }
        this.g0 = false;
        un2 un2Var = new un2(1, this.N, null, 3, null, f35.i0(nm1Var.g), f35.i0(j));
        ue1 ue1Var = this.x;
        mt2 mt2Var = (mt2) ue1Var.p;
        mt2Var.getClass();
        ue1Var.i(new eg0(ue1Var, mt2Var, un2Var, 10));
    }

    public final nm1 C() {
        ArrayList arrayList = this.A;
        return (nm1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean E() {
        return this.d0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        int i;
        if (!this.U && this.X == null && this.P) {
            int i2 = 0;
            for (kn1 kn1Var : this.I) {
                if (kn1Var.r() == null) {
                    return;
                }
            }
            tv4 tv4Var = this.V;
            if (tv4Var != null) {
                int i3 = tv4Var.a;
                int[] iArr = new int[i3];
                this.X = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        kn1[] kn1VarArr = this.I;
                        if (i5 >= kn1VarArr.length) {
                            break;
                        }
                        tb1 tb1VarR = kn1VarArr[i5].r();
                        tb1VarR.getClass();
                        tb1 tb1Var = this.V.a(i4).d[0];
                        String str = tb1VarR.n;
                        String str2 = tb1Var.n;
                        int iH = lw2.h(str);
                        if (iH != 3) {
                            if (iH == lw2.h(str2)) {
                                this.X[i4] = i5;
                                break;
                            }
                            i5++;
                        } else {
                            if (Objects.equals(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || tb1VarR.K == tb1Var.K)) {
                                this.X[i4] = i5;
                                break;
                                break;
                            }
                            i5++;
                        }
                    }
                }
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((hn1) obj).a();
                }
                return;
            }
            int length = this.I.length;
            int i6 = 0;
            int i7 = -1;
            int i8 = -2;
            while (true) {
                int i9 = 1;
                if (i6 >= length) {
                    break;
                }
                tb1 tb1VarR2 = this.I[i6].r();
                tb1VarR2.getClass();
                String str3 = tb1VarR2.n;
                if (lw2.l(str3)) {
                    i9 = 2;
                } else if (!lw2.i(str3)) {
                    i9 = lw2.k(str3) ? 3 : -2;
                }
                if (D(i9) > D(i8)) {
                    i7 = i6;
                    i8 = i9;
                } else if (i9 == i8 && i7 != -1) {
                    i7 = -1;
                }
                i6++;
            }
            sv4 sv4Var = this.q.h;
            int i10 = sv4Var.a;
            this.Y = -1;
            this.X = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.X[i11] = i11;
            }
            sv4[] sv4VarArr = new sv4[length];
            int i12 = 0;
            while (i12 < length) {
                tb1 tb1VarR3 = this.I[i12].r();
                tb1VarR3.getClass();
                String str4 = this.n;
                tb1 tb1Var2 = this.s;
                if (i12 == i7) {
                    tb1[] tb1VarArr = new tb1[i10];
                    for (int i13 = i2; i13 < i10; i13++) {
                        tb1 tb1VarD = sv4Var.d[i13];
                        if (i8 == 1 && tb1Var2 != null) {
                            tb1VarD = tb1VarD.d(tb1Var2);
                        }
                        tb1VarArr[i13] = i10 == 1 ? tb1VarR3.d(tb1VarD) : A(tb1VarD, tb1VarR3, true);
                    }
                    sv4VarArr[i12] = new sv4(str4, tb1VarArr);
                    this.Y = i12;
                    i = 0;
                } else {
                    if (i8 != 2 || !lw2.i(tb1VarR3.n)) {
                        tb1Var2 = null;
                    }
                    StringBuilder sbS = b11.s(str4, ":muxed:");
                    sbS.append(i12 < i7 ? i12 : i12 - 1);
                    i = 0;
                    sv4VarArr[i12] = new sv4(sbS.toString(), A(tb1Var2, tb1VarR3, false));
                }
                i12++;
                i2 = i;
            }
            int i14 = i2;
            this.V = z(sv4VarArr);
            rr2.w(this.W == null ? 1 : i14);
            this.W = Collections.EMPTY_SET;
            this.Q = true;
            this.p.k();
        }
    }

    public final void G() throws IOException {
        i61 i61Var = this.w;
        IOException iOException = (IOException) i61Var.q;
        if (iOException != null) {
            throw iOException;
        }
        id2 id2Var = (id2) i61Var.p;
        if (id2Var != null) {
            int i = id2Var.n;
            IOException iOException2 = id2Var.r;
            if (iOException2 != null && id2Var.s > i) {
                throw iOException2;
            }
        }
        km1 km1Var = this.q;
        BehindLiveWindowException behindLiveWindowException = km1Var.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = km1Var.o;
        if (uri == null || !uri.equals(km1Var.p)) {
            return;
        }
        al0 al0Var = km1Var.g;
        zk0 zk0Var = (zk0) al0Var.q.get(km1Var.o);
        i61 i61Var2 = zk0Var.o;
        IOException iOException3 = (IOException) i61Var2.q;
        if (iOException3 != null) {
            throw iOException3;
        }
        id2 id2Var2 = (id2) i61Var2.p;
        if (id2Var2 != null) {
            int i2 = id2Var2.n;
            IOException iOException4 = id2Var2.r;
            if (iOException4 != null && id2Var2.s > i2) {
                throw iOException4;
            }
        }
        IOException iOException5 = zk0Var.w;
        if (iOException5 != null) {
            throw iOException5;
        }
    }

    public final void H(sv4[] sv4VarArr, int... iArr) {
        this.V = z(sv4VarArr);
        this.W = new HashSet();
        for (int i : iArr) {
            this.W.add(this.V.a(i));
        }
        this.Y = 0;
        this.E.post(new qa1(3, this.p));
        this.Q = true;
    }

    public final void I() {
        for (kn1 kn1Var : this.I) {
            kn1Var.x(this.e0);
        }
        this.e0 = false;
    }

    public final boolean J(boolean z, long j) {
        nm1 nm1Var;
        boolean z2;
        this.c0 = j;
        if (E()) {
            this.d0 = j;
            return true;
        }
        boolean z3 = this.q.q;
        ArrayList arrayList = this.A;
        if (!z3) {
            nm1Var = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                nm1Var = null;
                break;
            }
            nm1Var = (nm1) arrayList.get(i);
            if (nm1Var.g == j) {
                break;
            }
            i++;
        }
        if (this.P && !z && !arrayList.isEmpty()) {
            int length = this.I.length;
            for (int i2 = 0; i2 < length; i2++) {
                kn1 kn1Var = this.I[i2];
                if (nm1Var != null) {
                    z2 = kn1Var.y(nm1Var.e(i2));
                } else {
                    long jD = d();
                    z2 = kn1Var.z(jD == Long.MIN_VALUE || j < jD, j);
                }
                if (z2 || (!this.b0[i2] && this.Z)) {
                }
            }
            return false;
        }
        this.d0 = j;
        this.g0 = false;
        arrayList.clear();
        i61 i61Var = this.w;
        if (!i61Var.l()) {
            i61Var.q = null;
            I();
            return true;
        }
        if (this.P) {
            for (kn1 kn1Var2 : this.I) {
                kn1Var2.j();
            }
        }
        i61Var.d();
        return true;
    }

    @Override // defpackage.kd2
    public final void a() {
        for (kn1 kn1Var : this.I) {
            kn1Var.x(true);
            pw0 pw0Var = kn1Var.h;
            if (pw0Var != null) {
                pw0Var.d(kn1Var.e);
                kn1Var.h = null;
                kn1Var.g = null;
            }
        }
    }

    @Override // defpackage.hd2
    public final void b(jd2 jd2Var, long j, long j2, boolean z) {
        s20 s20Var = (s20) jd2Var;
        this.H = null;
        long j3 = s20Var.a;
        ii0 ii0Var = s20Var.b;
        yl4 yl4Var = s20Var.i;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        this.v.getClass();
        this.x.q(ed2Var, s20Var.c, this.o, s20Var.d, s20Var.e, s20Var.f, s20Var.g, s20Var.h);
        if (z) {
            return;
        }
        if (E() || this.R == 0) {
            I();
        }
        if (this.R > 0) {
            this.p.j(this);
        }
    }

    @Override // defpackage.da4
    public final long d() {
        if (E()) {
            return this.d0;
        }
        if (this.g0) {
            return Long.MIN_VALUE;
        }
        return C().h;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.w.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hd2
    public final void g(jd2 jd2Var, long j, long j2) {
        s20 s20Var = (s20) jd2Var;
        this.H = null;
        if (s20Var instanceof gm1) {
            gm1 gm1Var = (gm1) s20Var;
            byte[] bArr = gm1Var.j;
            km1 km1Var = this.q;
            km1Var.m = bArr;
            zh0 zh0Var = km1Var.j;
            Uri uri = gm1Var.b.a;
            byte[] bArr2 = gm1Var.l;
            bArr2.getClass();
            ef1 ef1Var = (ef1) zh0Var.o;
            uri.getClass();
        }
        long j3 = s20Var.a;
        ii0 ii0Var = s20Var.b;
        yl4 yl4Var = s20Var.i;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        this.v.getClass();
        this.x.r(ed2Var, s20Var.c, this.o, s20Var.d, s20Var.e, s20Var.f, s20Var.g, s20Var.h);
        if (this.Q) {
            this.p.j(this);
            return;
        }
        od2 od2Var = new od2();
        od2Var.a = this.c0;
        o(new pd2(od2Var));
    }

    @Override // defpackage.hd2
    public final void j(jd2 jd2Var, long j, long j2, int i) {
        ed2 ed2Var;
        s20 s20Var = (s20) jd2Var;
        if (i == 0) {
            long j3 = s20Var.a;
            ed2Var = new ed2(j, s20Var.b);
        } else {
            long j4 = s20Var.a;
            ii0 ii0Var = s20Var.b;
            yl4 yl4Var = s20Var.i;
            ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, yl4Var.o);
        }
        this.x.u(ed2Var, s20Var.c, this.o, s20Var.d, s20Var.e, s20Var.f, s20Var.g, s20Var.h, i);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0214  */
    /* JADX WARN: Code duplicated, block: B:103:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0226  */
    /* JADX WARN: Code duplicated, block: B:106:0x022c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238  */
    /* JADX WARN: Code duplicated, block: B:116:0x0260  */
    /* JADX WARN: Code duplicated, block: B:124:0x0282  */
    /* JADX WARN: Code duplicated, block: B:128:0x028e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0292  */
    /* JADX WARN: Code duplicated, block: B:132:0x0295  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x02be  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:165:0x0302  */
    /* JADX WARN: Code duplicated, block: B:166:0x0309  */
    /* JADX WARN: Code duplicated, block: B:168:0x0317  */
    /* JADX WARN: Code duplicated, block: B:169:0x0319  */
    /* JADX WARN: Code duplicated, block: B:172:0x033e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0343  */
    /* JADX WARN: Code duplicated, block: B:176:0x035d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0360  */
    /* JADX WARN: Code duplicated, block: B:179:0x0364  */
    /* JADX WARN: Code duplicated, block: B:180:0x036e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0371  */
    /* JADX WARN: Code duplicated, block: B:183:0x037c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0382 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0384  */
    /* JADX WARN: Code duplicated, block: B:188:0x0386  */
    /* JADX WARN: Code duplicated, block: B:190:0x0389  */
    /* JADX WARN: Code duplicated, block: B:191:0x0393  */
    /* JADX WARN: Code duplicated, block: B:194:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:197:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:200:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:202:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:213:0x0408  */
    /* JADX WARN: Code duplicated, block: B:216:0x040e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0415 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:225:0x0422  */
    /* JADX WARN: Code duplicated, block: B:228:0x042a  */
    /* JADX WARN: Code duplicated, block: B:231:0x0456  */
    /* JADX WARN: Code duplicated, block: B:235:0x048c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0496  */
    /* JADX WARN: Code duplicated, block: B:239:0x049b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x049d  */
    /* JADX WARN: Code duplicated, block: B:242:0x04b3 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:245:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:247:0x04c4 A[EDGE_INSN: B:247:0x04c4->B:266:0x0514 BREAK  A[LOOP:3: B:257:0x04ed->B:265:0x050f], PHI: r32
  0x04c4: PHI (r32v6 java.util.ArrayList) = (r32v3 java.util.ArrayList), (r32v3 java.util.ArrayList), (r32v3 java.util.ArrayList), (r32v4 java.util.ArrayList) binds: [B:246:0x04c2, B:253:0x04e1, B:255:0x04e5, B:286:0x04c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:248:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:250:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:251:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:268:0x052e A[LOOP:1: B:267:0x052c->B:268:0x052e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x054d  */
    /* JADX WARN: Code duplicated, block: B:273:0x055b  */
    /* JADX WARN: Code duplicated, block: B:285:0x055e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.da4
    public final boolean o(pd2 pd2Var) {
        long jMax;
        long j;
        long j2;
        long j3;
        List list;
        long j4;
        List list2;
        long jMax2;
        long j5;
        Uri[] uriArr;
        al0 al0Var;
        long j6;
        long jMax3;
        long j7;
        nm1 nm1Var;
        Uri[] uriArr2;
        al0 al0Var2;
        ArrayList arrayList;
        int iL;
        boolean z;
        Uri uri;
        ym1 ym1VarA;
        long j8;
        long j9;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        int i;
        ym1 ym1Var;
        jm1 jm1VarD;
        String str;
        boolean z2;
        long j10;
        jm1 jm1VarD2;
        mf4 mf4Var;
        boolean z3;
        wm1 wm1Var;
        vm1 vm1Var;
        long j11;
        Uri uriH;
        gm1 gm1VarE;
        String str2;
        Uri uriH2;
        gm1 gm1VarE2;
        boolean z4;
        boolean z5;
        ci0 ci0Var;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i2;
        boolean z6;
        byte[] bArrD;
        ci0 j6Var;
        vm1 vm1Var2;
        ii0 ii0Var;
        ci0 ci0Var2;
        boolean z7;
        int i3;
        mv1 mv1Var;
        be3 be3Var;
        jw jwVar;
        SparseArray sparseArray;
        iu4 iu4Var;
        ii0 ii0Var2;
        boolean z8;
        boolean z9;
        jw jwVar2;
        boolean z10;
        byte[] bArrD2;
        ci0 j6Var2;
        String str3;
        zk0 zk0Var;
        boolean z11;
        s20 s20Var;
        Uri uri2;
        nm1 nm1Var2;
        ArrayList arrayList2;
        uw1 uw1VarJ;
        int i4;
        int i5;
        ArrayList arrayList3 = this.A;
        mf4 mf4Var2 = this.z;
        i61 i61Var = this.w;
        if (this.g0 || i61Var.l()) {
            return false;
        }
        if (((IOException) i61Var.q) != null) {
            return false;
        }
        long j12 = -9223372036854775807L;
        if (E()) {
            List list3 = Collections.EMPTY_LIST;
            long j13 = this.d0;
            for (kn1 kn1Var : this.I) {
                kn1Var.t = this.d0;
            }
            list = list3;
            j = -9223372036854775807L;
            j2 = j13;
            j3 = j2;
        } else {
            List list4 = this.B;
            nm1 nm1VarC = C();
            boolean z12 = nm1VarC.H;
            long j14 = nm1VarC.g;
            if (z12 && nm1VarC.f()) {
                long j15 = nm1VarC.K;
                jMax = j15 != -9223372036854775807L ? j14 + j15 : -9223372036854775807L;
            } else {
                jMax = Math.max(this.c0, j14);
            }
            long jMax4 = this.c0;
            if (this.P) {
                kn1[] kn1VarArr = this.I;
                int length = kn1VarArr.length;
                int i6 = 0;
                while (i6 < length) {
                    kn1 kn1Var2 = kn1VarArr[i6];
                    synchronized (kn1Var2) {
                        j4 = j12;
                        list2 = list4;
                        jMax2 = Math.max(kn1Var2.u, kn1Var2.n(kn1Var2.s));
                    }
                    jMax4 = Math.max(jMax4, jMax2);
                    i6++;
                    j12 = j4;
                    list4 = list2;
                }
            }
            j = j12;
            j2 = jMax;
            j3 = jMax4;
            list = list4;
        }
        mf4Var2.p = null;
        mf4Var2.o = false;
        mf4Var2.q = null;
        km1 km1Var = this.q;
        boolean z13 = this.Q || !list.isEmpty();
        zh0 zh0Var = km1Var.j;
        Uri[] uriArr3 = km1Var.e;
        al0 al0Var3 = km1Var.g;
        nm1 nm1Var3 = list.isEmpty() ? null : (nm1) te5.w(list);
        int iB = nm1Var3 == null ? -1 : km1Var.h.b(nm1Var3.d);
        List list5 = list;
        long j16 = pd2Var.a;
        long jMax5 = j2 - j16;
        int i7 = iB;
        long j17 = km1Var.s;
        long j18 = j17 != j ? j17 - j16 : j;
        if (nm1Var3 != null && !km1Var.q) {
            j5 = j18;
            long j19 = nm1Var3.h - nm1Var3.g;
            uriArr = uriArr3;
            al0Var = al0Var3;
            jMax5 = Math.max(0L, jMax5 - j19);
            if (j5 != j) {
                jMax3 = Math.max(0L, j5 - j19);
                j6 = jMax5;
            }
            j7 = j2;
            nm1Var = nm1Var3;
            uriArr2 = uriArr;
            al0Var2 = al0Var;
            arrayList = arrayList3;
            km1Var.r.b(j16, j6, jMax3, list5, km1Var.a(nm1Var3, j2));
            iL = km1Var.r.l();
            if (i7 != iL) {
                z = true;
            } else {
                z = false;
            }
            uri = uriArr2[iL];
            if (al0Var2.d(uri)) {
                ym1VarA = al0Var2.a(true, uri);
                ym1VarA.getClass();
                km1Var.q = ym1VarA.c;
                if (ym1VarA.o) {
                    j8 = j;
                } else {
                    j8 = (ym1VarA.h + ym1VarA.u) - al0Var2.A;
                }
                km1Var.s = j8;
                j9 = ym1VarA.h - al0Var2.A;
                Pair pairC = km1Var.c(nm1Var, z, ym1VarA, j9, j7);
                jLongValue = ((Long) pairC.first).longValue();
                iIntValue = ((Integer) pairC.second).intValue();
                if (z || nm1Var == null || (jLongValue >= ym1VarA.k && ((jm1VarD = km1.d(ym1VarA, jLongValue, iIntValue)) == null || j9 + jm1VarD.a.r >= j3))) {
                    iIntValue2 = iIntValue;
                    ym1Var = ym1VarA;
                    i = iL;
                } else {
                    uri = uriArr2[i7];
                    ym1 ym1VarA2 = al0Var2.a(true, uri);
                    ym1VarA2.getClass();
                    j9 = ym1VarA2.h - al0Var2.A;
                    Pair pairC2 = km1Var.c(nm1Var, false, ym1VarA2, j9, j7);
                    jLongValue = ((Long) pairC2.first).longValue();
                    iIntValue2 = ((Integer) pairC2.second).intValue();
                    i = i7;
                    ym1Var = ym1VarA2;
                }
                str = ym1Var.a;
                z2 = ym1Var.c;
                j10 = ym1Var.k;
                yw1 yw1Var = ym1Var.r;
                if (i != i7 && i7 != -1) {
                    zk0Var = (zk0) al0Var2.q.get(uriArr2[i7]);
                    if (zk0Var != null) {
                        zk0Var.x = false;
                    }
                }
                if (jLongValue < j10) {
                    km1Var.n = new BehindLiveWindowException();
                    mf4Var = mf4Var2;
                } else {
                    jm1VarD2 = km1.d(ym1Var, jLongValue, iIntValue2);
                    if (jm1VarD2 == null) {
                        mf4Var = mf4Var2;
                    } else if (ym1Var.o) {
                        mf4Var = mf4Var2;
                        if (!z13 || yw1Var.isEmpty()) {
                            mf4Var.o = true;
                        } else {
                            jm1VarD2 = new jm1((wm1) te5.w(yw1Var), (j10 + ((long) yw1Var.size())) - 1, -1);
                        }
                    } else {
                        mf4Var = mf4Var2;
                        mf4Var.q = uri;
                        r19.p = uri;
                    }
                    z3 = jm1VarD2.d;
                    wm1Var = jm1VarD2.a;
                    r19.p = null;
                    SystemClock.elapsedRealtime();
                    vm1Var = wm1Var.o;
                    j11 = wm1Var.r;
                    if (vm1Var != null || (str3 = vm1Var.t) == null) {
                        uriH = null;
                    } else {
                        uriH = jz4.H(ym1Var.a, str3);
                    }
                    gm1VarE = r19.e(uriH, i, true);
                    mf4Var.p = gm1VarE;
                    if (gm1VarE == null) {
                        str2 = wm1Var.t;
                        if (str2 == null) {
                            uriH2 = null;
                        } else {
                            uriH2 = jz4.H(ym1Var.a, str2);
                        }
                        gm1VarE2 = r19.e(uriH2, i, false);
                        mf4Var.p = gm1VarE2;
                        if (gm1VarE2 == null) {
                            if (wm1Var instanceof tm1) {
                                z4 = z2;
                            } else if (!((tm1) wm1Var).y || (jm1VarD2.c == 0 && z2)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (nm1Var == 0) {
                                AtomicInteger atomicInteger = nm1.M;
                            } else {
                                if (uri.equals(nm1Var.m) || !nm1Var.H) {
                                    z5 = z4 || j9 + j11 < j7;
                                }
                                if (z5 || !z3) {
                                    xk0 xk0Var = r19.a;
                                    ci0Var = r19.b;
                                    tb1 tb1Var = r19.f[i];
                                    List list6 = r19.i;
                                    int iN = r19.r.n();
                                    Object objQ = r19.r.q();
                                    boolean z14 = r19.l;
                                    si1 si1Var = r19.d;
                                    if (uriH2 == null) {
                                        zh0Var.getClass();
                                        bArr = null;
                                    } else {
                                        bArr = (byte[]) ((ef1) zh0Var.o).get(uriH2);
                                    }
                                    if (uriH == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((ef1) zh0Var.o).get(uriH);
                                    }
                                    ik3 ik3Var = r19.k;
                                    AtomicInteger atomicInteger2 = nm1.M;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriH3 = jz4.H(str, wm1Var.n);
                                    jm1 jm1Var = jm1VarD2;
                                    long j20 = wm1Var.v;
                                    long j21 = wm1Var.w;
                                    if (z3) {
                                        i2 = 8;
                                    } else {
                                        i2 = 0;
                                    }
                                    rr2.s(uriH3, "The uri must be set.");
                                    ii0 ii0Var3 = new ii0(uriH3, 0L, 1, null, map, j20, j21, null, i2);
                                    if (bArr != null) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        String str4 = wm1Var.u;
                                        str4.getClass();
                                        bArrD = nm1.d(str4);
                                    } else {
                                        bArrD = null;
                                    }
                                    if (bArr != null) {
                                        bArrD.getClass();
                                        j6Var = new j6(ci0Var, bArr, bArrD);
                                    } else {
                                        j6Var = ci0Var;
                                    }
                                    vm1Var2 = wm1Var.o;
                                    if (vm1Var2 != null) {
                                        if (bArr2 != null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            String str5 = vm1Var2.u;
                                            str5.getClass();
                                            bArrD2 = nm1.d(str5);
                                        } else {
                                            bArrD2 = null;
                                        }
                                        Uri uriH4 = jz4.H(str, vm1Var2.n);
                                        long j22 = vm1Var2.v;
                                        boolean z15 = z10;
                                        long j23 = vm1Var2.w;
                                        rr2.s(uriH4, "The uri must be set.");
                                        ii0 ii0Var4 = new ii0(uriH4, 0L, 1, null, map, j22, j23, null, 0);
                                        if (bArr2 != null) {
                                            bArrD2.getClass();
                                            j6Var2 = new j6(ci0Var, bArr2, bArrD2);
                                        } else {
                                            j6Var2 = ci0Var;
                                        }
                                        z7 = z15;
                                        ci0Var2 = j6Var2;
                                        ii0Var = ii0Var4;
                                    } else {
                                        ii0Var = null;
                                        ci0Var2 = null;
                                        z7 = false;
                                    }
                                    long j24 = j9 + j11;
                                    long j25 = j24 + wm1Var.p;
                                    i3 = ym1Var.j + wm1Var.q;
                                    if (nm1Var != 0) {
                                        ii0Var2 = nm1Var.q;
                                        if (ii0Var != ii0Var2 || (ii0Var != null && ii0Var2 != null && ii0Var.a.equals(ii0Var2.a) && ii0Var.f == ii0Var2.f)) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (uri.equals(nm1Var.m) || !nm1Var.H) {
                                            z9 = false;
                                        } else {
                                            z9 = true;
                                        }
                                        mv1Var = nm1Var.y;
                                        be3Var = nm1Var.z;
                                        if (z8 || !z9 || nm1Var.J || nm1Var.l != i3) {
                                            jwVar2 = null;
                                        } else {
                                            jwVar2 = nm1Var.C;
                                        }
                                        jwVar = jwVar2;
                                    } else {
                                        mv1Var = new mv1(null);
                                        be3Var = new be3(10);
                                        jwVar = null;
                                    }
                                    mv1 mv1Var2 = mv1Var;
                                    be3 be3Var2 = be3Var;
                                    long j26 = jm1Var.b;
                                    int i8 = jm1Var.c;
                                    boolean z16 = !z3;
                                    boolean z17 = wm1Var.x;
                                    sparseArray = (SparseArray) si1Var.o;
                                    iu4Var = (iu4) sparseArray.get(i3);
                                    if (iu4Var == null) {
                                        iu4Var = new iu4(9223372036854775806L);
                                        sparseArray.put(i3, iu4Var);
                                    }
                                    mf4Var.p = new nm1(xk0Var, j6Var, ii0Var3, tb1Var, z6, ci0Var2, ii0Var, z7, uri, list6, iN, objQ, j24, j25, j26, i8, z16, i3, z17, z14, iu4Var, wm1Var.s, jwVar, mv1Var2, be3Var2, z5, z4, ik3Var);
                                }
                            }
                            if (z5) {
                                xk0 xk0Var2 = r19.a;
                                ci0Var = r19.b;
                                tb1 tb1Var2 = r19.f[i];
                                List list7 = r19.i;
                                int iN2 = r19.r.n();
                                Object objQ2 = r19.r.q();
                                boolean z18 = r19.l;
                                si1 si1Var2 = r19.d;
                                if (uriH2 == null) {
                                    zh0Var.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((ef1) zh0Var.o).get(uriH2);
                                }
                                if (uriH == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((ef1) zh0Var.o).get(uriH);
                                }
                                ik3 ik3Var2 = r19.k;
                                AtomicInteger atomicInteger3 = nm1.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriH5 = jz4.H(str, wm1Var.n);
                                jm1 jm1Var2 = jm1VarD2;
                                long j27 = wm1Var.v;
                                long j28 = wm1Var.w;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                rr2.s(uriH5, "The uri must be set.");
                                ii0 ii0Var5 = new ii0(uriH5, 0L, 1, null, map, j27, j28, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str6 = wm1Var.u;
                                    str6.getClass();
                                    bArrD = nm1.d(str6);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    j6Var = new j6(ci0Var, bArr, bArrD);
                                } else {
                                    j6Var = ci0Var;
                                }
                                vm1Var2 = wm1Var.o;
                                if (vm1Var2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str7 = vm1Var2.u;
                                        str7.getClass();
                                        bArrD2 = nm1.d(str7);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriH6 = jz4.H(str, vm1Var2.n);
                                    long j29 = vm1Var2.v;
                                    boolean z19 = z10;
                                    long j210 = vm1Var2.w;
                                    rr2.s(uriH6, "The uri must be set.");
                                    ii0 ii0Var6 = new ii0(uriH6, 0L, 1, null, map, j29, j210, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        j6Var2 = new j6(ci0Var, bArr2, bArrD2);
                                    } else {
                                        j6Var2 = ci0Var;
                                    }
                                    z7 = z19;
                                    ci0Var2 = j6Var2;
                                    ii0Var = ii0Var6;
                                } else {
                                    ii0Var = null;
                                    ci0Var2 = null;
                                    z7 = false;
                                }
                                long j211 = j9 + j11;
                                long j212 = j211 + wm1Var.p;
                                i3 = ym1Var.j + wm1Var.q;
                                if (nm1Var != 0) {
                                    ii0Var2 = nm1Var.q;
                                    if (ii0Var != ii0Var2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(nm1Var.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    mv1Var = nm1Var.y;
                                    be3Var = nm1Var.z;
                                    if (z8) {
                                        jwVar2 = null;
                                    } else {
                                        jwVar2 = null;
                                    }
                                    jwVar = jwVar2;
                                } else {
                                    mv1Var = new mv1(null);
                                    be3Var = new be3(10);
                                    jwVar = null;
                                }
                                mv1 mv1Var3 = mv1Var;
                                be3 be3Var3 = be3Var;
                                long j213 = jm1Var2.b;
                                int i9 = jm1Var2.c;
                                boolean z110 = !z3;
                                boolean z111 = wm1Var.x;
                                sparseArray = (SparseArray) si1Var2.o;
                                iu4Var = (iu4) sparseArray.get(i3);
                                if (iu4Var == null) {
                                    iu4Var = new iu4(9223372036854775806L);
                                    sparseArray.put(i3, iu4Var);
                                }
                                mf4Var.p = new nm1(xk0Var2, j6Var, ii0Var5, tb1Var2, z6, ci0Var2, ii0Var, z7, uri, list7, iN2, objQ2, j211, j212, j213, i9, z110, i3, z111, z18, iu4Var, wm1Var.s, jwVar, mv1Var3, be3Var3, z5, z4, ik3Var2);
                            } else {
                                xk0 xk0Var3 = r19.a;
                                ci0Var = r19.b;
                                tb1 tb1Var3 = r19.f[i];
                                List list8 = r19.i;
                                int iN3 = r19.r.n();
                                Object objQ3 = r19.r.q();
                                boolean z112 = r19.l;
                                si1 si1Var3 = r19.d;
                                if (uriH2 == null) {
                                    zh0Var.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((ef1) zh0Var.o).get(uriH2);
                                }
                                if (uriH == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((ef1) zh0Var.o).get(uriH);
                                }
                                ik3 ik3Var3 = r19.k;
                                AtomicInteger atomicInteger4 = nm1.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriH7 = jz4.H(str, wm1Var.n);
                                jm1 jm1Var3 = jm1VarD2;
                                long j214 = wm1Var.v;
                                long j215 = wm1Var.w;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                rr2.s(uriH7, "The uri must be set.");
                                ii0 ii0Var7 = new ii0(uriH7, 0L, 1, null, map, j214, j215, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str8 = wm1Var.u;
                                    str8.getClass();
                                    bArrD = nm1.d(str8);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    j6Var = new j6(ci0Var, bArr, bArrD);
                                } else {
                                    j6Var = ci0Var;
                                }
                                vm1Var2 = wm1Var.o;
                                if (vm1Var2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str9 = vm1Var2.u;
                                        str9.getClass();
                                        bArrD2 = nm1.d(str9);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriH8 = jz4.H(str, vm1Var2.n);
                                    long j216 = vm1Var2.v;
                                    boolean z113 = z10;
                                    long j217 = vm1Var2.w;
                                    rr2.s(uriH8, "The uri must be set.");
                                    ii0 ii0Var8 = new ii0(uriH8, 0L, 1, null, map, j216, j217, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        j6Var2 = new j6(ci0Var, bArr2, bArrD2);
                                    } else {
                                        j6Var2 = ci0Var;
                                    }
                                    z7 = z113;
                                    ci0Var2 = j6Var2;
                                    ii0Var = ii0Var8;
                                } else {
                                    ii0Var = null;
                                    ci0Var2 = null;
                                    z7 = false;
                                }
                                long j218 = j9 + j11;
                                long j219 = j218 + wm1Var.p;
                                i3 = ym1Var.j + wm1Var.q;
                                if (nm1Var != 0) {
                                    ii0Var2 = nm1Var.q;
                                    if (ii0Var != ii0Var2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(nm1Var.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    mv1Var = nm1Var.y;
                                    be3Var = nm1Var.z;
                                    if (z8) {
                                        jwVar2 = null;
                                    } else {
                                        jwVar2 = null;
                                    }
                                    jwVar = jwVar2;
                                } else {
                                    mv1Var = new mv1(null);
                                    be3Var = new be3(10);
                                    jwVar = null;
                                }
                                mv1 mv1Var4 = mv1Var;
                                be3 be3Var4 = be3Var;
                                long j2110 = jm1Var3.b;
                                int i10 = jm1Var3.c;
                                boolean z114 = !z3;
                                boolean z115 = wm1Var.x;
                                sparseArray = (SparseArray) si1Var3.o;
                                iu4Var = (iu4) sparseArray.get(i3);
                                if (iu4Var == null) {
                                    iu4Var = new iu4(9223372036854775806L);
                                    sparseArray.put(i3, iu4Var);
                                }
                                mf4Var.p = new nm1(xk0Var3, j6Var, ii0Var7, tb1Var3, z6, ci0Var2, ii0Var, z7, uri, list8, iN3, objQ3, j218, j219, j2110, i10, z114, i3, z115, z112, iu4Var, wm1Var.s, jwVar, mv1Var4, be3Var4, z5, z4, ik3Var3);
                            }
                        }
                    }
                }
            } else {
                mf4Var2.q = uri;
                km1Var.p = uri;
                mf4Var = mf4Var2;
            }
            z11 = mf4Var.o;
            s20Var = (s20) mf4Var.p;
            uri2 = (Uri) mf4Var.q;
            if (z11) {
                this.d0 = j;
                this.g0 = true;
                return true;
            }
            if (s20Var == null) {
                if (uri2 != null) {
                    return false;
                }
                ((zk0) ((pm1) this.p.o).o.q.get(uri2)).d(true);
                return false;
            }
            if (s20Var instanceof nm1) {
                nm1Var2 = (nm1) s20Var;
                if (!arrayList.isEmpty()) {
                    arrayList2 = arrayList;
                    break;
                }
                if (!C().f()) {
                    B(arrayList.size() - 1);
                }
                if (!nm1Var2.n || !nm1Var2.L) {
                    arrayList2 = arrayList;
                    break;
                }
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        arrayList2 = arrayList;
                        break;
                    }
                    arrayList2 = arrayList;
                    long j30 = ((nm1) arrayList2.get(size)).g;
                    long j31 = nm1Var2.g;
                    if (j30 < j31) {
                        break;
                    }
                    if (j30 == j31 && x(size)) {
                        B(size);
                        nm1Var2.L = false;
                        break;
                    }
                    size--;
                    arrayList = arrayList2;
                }
                this.k0 = nm1Var2;
                this.S = nm1Var2.d;
                this.d0 = -9223372036854775807L;
                arrayList2.add(nm1Var2);
                uw1VarJ = yw1.j();
                for (kn1 kn1Var3 : this.I) {
                    uw1VarJ.c(Integer.valueOf(kn1Var3.q + kn1Var3.p));
                }
                gy3 gy3VarF = uw1VarJ.f();
                nm1Var2.D = this;
                nm1Var2.I = gy3VarF;
                for (kn1 kn1Var4 : this.I) {
                    kn1Var4.getClass();
                    kn1Var4.C = nm1Var2.k;
                    if (nm1Var2.L) {
                        kn1Var4.G = true;
                    }
                }
            }
            this.H = s20Var;
            i61Var.u(s20Var, this, this.v.D(s20Var.c));
            return true;
        }
        j5 = j18;
        uriArr = uriArr3;
        al0Var = al0Var3;
        j6 = jMax5;
        jMax3 = j5;
        j7 = j2;
        nm1Var = nm1Var3;
        uriArr2 = uriArr;
        al0Var2 = al0Var;
        arrayList = arrayList3;
        km1Var.r.b(j16, j6, jMax3, list5, km1Var.a(nm1Var3, j2));
        iL = km1Var.r.l();
        if (i7 != iL) {
            z = true;
        } else {
            z = false;
        }
        uri = uriArr2[iL];
        if (al0Var2.d(uri)) {
            mf4Var2.q = uri;
            km1Var.p = uri;
            mf4Var = mf4Var2;
        } else {
            ym1VarA = al0Var2.a(true, uri);
            ym1VarA.getClass();
            km1Var.q = ym1VarA.c;
            if (ym1VarA.o) {
                j8 = j;
            } else {
                j8 = (ym1VarA.h + ym1VarA.u) - al0Var2.A;
            }
            km1Var.s = j8;
            j9 = ym1VarA.h - al0Var2.A;
            Pair pairC3 = km1Var.c(nm1Var, z, ym1VarA, j9, j7);
            jLongValue = ((Long) pairC3.first).longValue();
            iIntValue = ((Integer) pairC3.second).intValue();
            if (z) {
                iIntValue2 = iIntValue;
                ym1Var = ym1VarA;
                i = iL;
            } else {
                uri = uriArr2[i7];
                ym1 ym1VarA3 = al0Var2.a(true, uri);
                ym1VarA3.getClass();
                j9 = ym1VarA3.h - al0Var2.A;
                Pair pairC4 = km1Var.c(nm1Var, false, ym1VarA3, j9, j7);
                jLongValue = ((Long) pairC4.first).longValue();
                iIntValue2 = ((Integer) pairC4.second).intValue();
                i = i7;
                ym1Var = ym1VarA3;
            }
            str = ym1Var.a;
            z2 = ym1Var.c;
            j10 = ym1Var.k;
            yw1 yw1Var2 = ym1Var.r;
            if (i != i7) {
                zk0Var = (zk0) al0Var2.q.get(uriArr2[i7]);
                if (zk0Var != null) {
                    zk0Var.x = false;
                }
            }
            if (jLongValue < j10) {
                km1Var.n = new BehindLiveWindowException();
                mf4Var = mf4Var2;
            } else {
                jm1VarD2 = km1.d(ym1Var, jLongValue, iIntValue2);
                if (jm1VarD2 == null) {
                    mf4Var = mf4Var2;
                } else if (ym1Var.o) {
                    mf4Var = mf4Var2;
                    mf4Var.q = uri;
                    r19.p = uri;
                } else {
                    mf4Var = mf4Var2;
                    if (z13) {
                    }
                    mf4Var.o = true;
                }
                z3 = jm1VarD2.d;
                wm1Var = jm1VarD2.a;
                r19.p = null;
                SystemClock.elapsedRealtime();
                vm1Var = wm1Var.o;
                j11 = wm1Var.r;
                if (vm1Var != null) {
                    uriH = null;
                } else {
                    uriH = null;
                }
                gm1VarE = r19.e(uriH, i, true);
                mf4Var.p = gm1VarE;
                if (gm1VarE == null) {
                    str2 = wm1Var.t;
                    if (str2 == null) {
                        uriH2 = null;
                    } else {
                        uriH2 = jz4.H(ym1Var.a, str2);
                    }
                    gm1VarE2 = r19.e(uriH2, i, false);
                    mf4Var.p = gm1VarE2;
                    if (gm1VarE2 == null) {
                        if (wm1Var instanceof tm1) {
                            z4 = z2;
                        } else if (((tm1) wm1Var).y) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        if (nm1Var == 0) {
                            AtomicInteger atomicInteger5 = nm1.M;
                        } else {
                            if (uri.equals(nm1Var.m)) {
                                if (z4) {
                                }
                            } else if (z4) {
                            }
                            if (z5) {
                                xk0 xk0Var4 = r19.a;
                                ci0Var = r19.b;
                                tb1 tb1Var4 = r19.f[i];
                                List list9 = r19.i;
                                int iN4 = r19.r.n();
                                Object objQ4 = r19.r.q();
                                boolean z116 = r19.l;
                                si1 si1Var4 = r19.d;
                                if (uriH2 == null) {
                                    zh0Var.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((ef1) zh0Var.o).get(uriH2);
                                }
                                if (uriH == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((ef1) zh0Var.o).get(uriH);
                                }
                                ik3 ik3Var4 = r19.k;
                                AtomicInteger atomicInteger6 = nm1.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriH9 = jz4.H(str, wm1Var.n);
                                jm1 jm1Var4 = jm1VarD2;
                                long j2111 = wm1Var.v;
                                long j2112 = wm1Var.w;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                rr2.s(uriH9, "The uri must be set.");
                                ii0 ii0Var9 = new ii0(uriH9, 0L, 1, null, map, j2111, j2112, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str10 = wm1Var.u;
                                    str10.getClass();
                                    bArrD = nm1.d(str10);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    j6Var = new j6(ci0Var, bArr, bArrD);
                                } else {
                                    j6Var = ci0Var;
                                }
                                vm1Var2 = wm1Var.o;
                                if (vm1Var2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str11 = vm1Var2.u;
                                        str11.getClass();
                                        bArrD2 = nm1.d(str11);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriH10 = jz4.H(str, vm1Var2.n);
                                    long j2113 = vm1Var2.v;
                                    boolean z117 = z10;
                                    long j2114 = vm1Var2.w;
                                    rr2.s(uriH10, "The uri must be set.");
                                    ii0 ii0Var10 = new ii0(uriH10, 0L, 1, null, map, j2113, j2114, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        j6Var2 = new j6(ci0Var, bArr2, bArrD2);
                                    } else {
                                        j6Var2 = ci0Var;
                                    }
                                    z7 = z117;
                                    ci0Var2 = j6Var2;
                                    ii0Var = ii0Var10;
                                } else {
                                    ii0Var = null;
                                    ci0Var2 = null;
                                    z7 = false;
                                }
                                long j2115 = j9 + j11;
                                long j2116 = j2115 + wm1Var.p;
                                i3 = ym1Var.j + wm1Var.q;
                                if (nm1Var != 0) {
                                    ii0Var2 = nm1Var.q;
                                    if (ii0Var != ii0Var2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(nm1Var.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    mv1Var = nm1Var.y;
                                    be3Var = nm1Var.z;
                                    if (z8) {
                                        jwVar2 = null;
                                    } else {
                                        jwVar2 = null;
                                    }
                                    jwVar = jwVar2;
                                } else {
                                    mv1Var = new mv1(null);
                                    be3Var = new be3(10);
                                    jwVar = null;
                                }
                                mv1 mv1Var5 = mv1Var;
                                be3 be3Var5 = be3Var;
                                long j2117 = jm1Var4.b;
                                int i11 = jm1Var4.c;
                                boolean z118 = !z3;
                                boolean z119 = wm1Var.x;
                                sparseArray = (SparseArray) si1Var4.o;
                                iu4Var = (iu4) sparseArray.get(i3);
                                if (iu4Var == null) {
                                    iu4Var = new iu4(9223372036854775806L);
                                    sparseArray.put(i3, iu4Var);
                                }
                                mf4Var.p = new nm1(xk0Var4, j6Var, ii0Var9, tb1Var4, z6, ci0Var2, ii0Var, z7, uri, list9, iN4, objQ4, j2115, j2116, j2117, i11, z118, i3, z119, z116, iu4Var, wm1Var.s, jwVar, mv1Var5, be3Var5, z5, z4, ik3Var4);
                            } else {
                                xk0 xk0Var5 = r19.a;
                                ci0Var = r19.b;
                                tb1 tb1Var5 = r19.f[i];
                                List list10 = r19.i;
                                int iN5 = r19.r.n();
                                Object objQ5 = r19.r.q();
                                boolean z1110 = r19.l;
                                si1 si1Var5 = r19.d;
                                if (uriH2 == null) {
                                    zh0Var.getClass();
                                    bArr = null;
                                } else {
                                    bArr = (byte[]) ((ef1) zh0Var.o).get(uriH2);
                                }
                                if (uriH == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = (byte[]) ((ef1) zh0Var.o).get(uriH);
                                }
                                ik3 ik3Var5 = r19.k;
                                AtomicInteger atomicInteger7 = nm1.M;
                                map = Collections.EMPTY_MAP;
                                Uri uriH11 = jz4.H(str, wm1Var.n);
                                jm1 jm1Var5 = jm1VarD2;
                                long j2118 = wm1Var.v;
                                long j2119 = wm1Var.w;
                                if (z3) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                rr2.s(uriH11, "The uri must be set.");
                                ii0 ii0Var11 = new ii0(uriH11, 0L, 1, null, map, j2118, j2119, null, i2);
                                if (bArr != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    String str12 = wm1Var.u;
                                    str12.getClass();
                                    bArrD = nm1.d(str12);
                                } else {
                                    bArrD = null;
                                }
                                if (bArr != null) {
                                    bArrD.getClass();
                                    j6Var = new j6(ci0Var, bArr, bArrD);
                                } else {
                                    j6Var = ci0Var;
                                }
                                vm1Var2 = wm1Var.o;
                                if (vm1Var2 != null) {
                                    if (bArr2 != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        String str13 = vm1Var2.u;
                                        str13.getClass();
                                        bArrD2 = nm1.d(str13);
                                    } else {
                                        bArrD2 = null;
                                    }
                                    Uri uriH12 = jz4.H(str, vm1Var2.n);
                                    long j21110 = vm1Var2.v;
                                    boolean z1111 = z10;
                                    long j21111 = vm1Var2.w;
                                    rr2.s(uriH12, "The uri must be set.");
                                    ii0 ii0Var12 = new ii0(uriH12, 0L, 1, null, map, j21110, j21111, null, 0);
                                    if (bArr2 != null) {
                                        bArrD2.getClass();
                                        j6Var2 = new j6(ci0Var, bArr2, bArrD2);
                                    } else {
                                        j6Var2 = ci0Var;
                                    }
                                    z7 = z1111;
                                    ci0Var2 = j6Var2;
                                    ii0Var = ii0Var12;
                                } else {
                                    ii0Var = null;
                                    ci0Var2 = null;
                                    z7 = false;
                                }
                                long j21112 = j9 + j11;
                                long j21113 = j21112 + wm1Var.p;
                                i3 = ym1Var.j + wm1Var.q;
                                if (nm1Var != 0) {
                                    ii0Var2 = nm1Var.q;
                                    if (ii0Var != ii0Var2) {
                                        z8 = true;
                                    } else {
                                        z8 = true;
                                    }
                                    if (uri.equals(nm1Var.m)) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    mv1Var = nm1Var.y;
                                    be3Var = nm1Var.z;
                                    if (z8) {
                                        jwVar2 = null;
                                    } else {
                                        jwVar2 = null;
                                    }
                                    jwVar = jwVar2;
                                } else {
                                    mv1Var = new mv1(null);
                                    be3Var = new be3(10);
                                    jwVar = null;
                                }
                                mv1 mv1Var6 = mv1Var;
                                be3 be3Var6 = be3Var;
                                long j21114 = jm1Var5.b;
                                int i12 = jm1Var5.c;
                                boolean z1112 = !z3;
                                boolean z1113 = wm1Var.x;
                                sparseArray = (SparseArray) si1Var5.o;
                                iu4Var = (iu4) sparseArray.get(i3);
                                if (iu4Var == null) {
                                    iu4Var = new iu4(9223372036854775806L);
                                    sparseArray.put(i3, iu4Var);
                                }
                                mf4Var.p = new nm1(xk0Var5, j6Var, ii0Var11, tb1Var5, z6, ci0Var2, ii0Var, z7, uri, list10, iN5, objQ5, j21112, j21113, j21114, i12, z1112, i3, z1113, z1110, iu4Var, wm1Var.s, jwVar, mv1Var6, be3Var6, z5, z4, ik3Var5);
                            }
                        }
                        if (z5) {
                            xk0 xk0Var6 = r19.a;
                            ci0Var = r19.b;
                            tb1 tb1Var6 = r19.f[i];
                            List list11 = r19.i;
                            int iN6 = r19.r.n();
                            Object objQ6 = r19.r.q();
                            boolean z1114 = r19.l;
                            si1 si1Var6 = r19.d;
                            if (uriH2 == null) {
                                zh0Var.getClass();
                                bArr = null;
                            } else {
                                bArr = (byte[]) ((ef1) zh0Var.o).get(uriH2);
                            }
                            if (uriH == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) ((ef1) zh0Var.o).get(uriH);
                            }
                            ik3 ik3Var6 = r19.k;
                            AtomicInteger atomicInteger8 = nm1.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriH13 = jz4.H(str, wm1Var.n);
                            jm1 jm1Var6 = jm1VarD2;
                            long j21115 = wm1Var.v;
                            long j21116 = wm1Var.w;
                            if (z3) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            rr2.s(uriH13, "The uri must be set.");
                            ii0 ii0Var13 = new ii0(uriH13, 0L, 1, null, map, j21115, j21116, null, i2);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str14 = wm1Var.u;
                                str14.getClass();
                                bArrD = nm1.d(str14);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                j6Var = new j6(ci0Var, bArr, bArrD);
                            } else {
                                j6Var = ci0Var;
                            }
                            vm1Var2 = wm1Var.o;
                            if (vm1Var2 != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str15 = vm1Var2.u;
                                    str15.getClass();
                                    bArrD2 = nm1.d(str15);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriH14 = jz4.H(str, vm1Var2.n);
                                long j21117 = vm1Var2.v;
                                boolean z1115 = z10;
                                long j21118 = vm1Var2.w;
                                rr2.s(uriH14, "The uri must be set.");
                                ii0 ii0Var14 = new ii0(uriH14, 0L, 1, null, map, j21117, j21118, null, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    j6Var2 = new j6(ci0Var, bArr2, bArrD2);
                                } else {
                                    j6Var2 = ci0Var;
                                }
                                z7 = z1115;
                                ci0Var2 = j6Var2;
                                ii0Var = ii0Var14;
                            } else {
                                ii0Var = null;
                                ci0Var2 = null;
                                z7 = false;
                            }
                            long j21119 = j9 + j11;
                            long j211110 = j21119 + wm1Var.p;
                            i3 = ym1Var.j + wm1Var.q;
                            if (nm1Var != 0) {
                                ii0Var2 = nm1Var.q;
                                if (ii0Var != ii0Var2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uri.equals(nm1Var.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                mv1Var = nm1Var.y;
                                be3Var = nm1Var.z;
                                if (z8) {
                                    jwVar2 = null;
                                } else {
                                    jwVar2 = null;
                                }
                                jwVar = jwVar2;
                            } else {
                                mv1Var = new mv1(null);
                                be3Var = new be3(10);
                                jwVar = null;
                            }
                            mv1 mv1Var7 = mv1Var;
                            be3 be3Var7 = be3Var;
                            long j211111 = jm1Var6.b;
                            int i13 = jm1Var6.c;
                            boolean z1116 = !z3;
                            boolean z1117 = wm1Var.x;
                            sparseArray = (SparseArray) si1Var6.o;
                            iu4Var = (iu4) sparseArray.get(i3);
                            if (iu4Var == null) {
                                iu4Var = new iu4(9223372036854775806L);
                                sparseArray.put(i3, iu4Var);
                            }
                            mf4Var.p = new nm1(xk0Var6, j6Var, ii0Var13, tb1Var6, z6, ci0Var2, ii0Var, z7, uri, list11, iN6, objQ6, j21119, j211110, j211111, i13, z1116, i3, z1117, z1114, iu4Var, wm1Var.s, jwVar, mv1Var7, be3Var7, z5, z4, ik3Var6);
                        } else {
                            xk0 xk0Var7 = r19.a;
                            ci0Var = r19.b;
                            tb1 tb1Var7 = r19.f[i];
                            List list12 = r19.i;
                            int iN7 = r19.r.n();
                            Object objQ7 = r19.r.q();
                            boolean z1118 = r19.l;
                            si1 si1Var7 = r19.d;
                            if (uriH2 == null) {
                                zh0Var.getClass();
                                bArr = null;
                            } else {
                                bArr = (byte[]) ((ef1) zh0Var.o).get(uriH2);
                            }
                            if (uriH == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = (byte[]) ((ef1) zh0Var.o).get(uriH);
                            }
                            ik3 ik3Var7 = r19.k;
                            AtomicInteger atomicInteger9 = nm1.M;
                            map = Collections.EMPTY_MAP;
                            Uri uriH15 = jz4.H(str, wm1Var.n);
                            jm1 jm1Var7 = jm1VarD2;
                            long j211112 = wm1Var.v;
                            long j211113 = wm1Var.w;
                            if (z3) {
                                i2 = 8;
                            } else {
                                i2 = 0;
                            }
                            rr2.s(uriH15, "The uri must be set.");
                            ii0 ii0Var15 = new ii0(uriH15, 0L, 1, null, map, j211112, j211113, null, i2);
                            if (bArr != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                String str16 = wm1Var.u;
                                str16.getClass();
                                bArrD = nm1.d(str16);
                            } else {
                                bArrD = null;
                            }
                            if (bArr != null) {
                                bArrD.getClass();
                                j6Var = new j6(ci0Var, bArr, bArrD);
                            } else {
                                j6Var = ci0Var;
                            }
                            vm1Var2 = wm1Var.o;
                            if (vm1Var2 != null) {
                                if (bArr2 != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    String str17 = vm1Var2.u;
                                    str17.getClass();
                                    bArrD2 = nm1.d(str17);
                                } else {
                                    bArrD2 = null;
                                }
                                Uri uriH16 = jz4.H(str, vm1Var2.n);
                                long j211114 = vm1Var2.v;
                                boolean z1119 = z10;
                                long j211115 = vm1Var2.w;
                                rr2.s(uriH16, "The uri must be set.");
                                ii0 ii0Var16 = new ii0(uriH16, 0L, 1, null, map, j211114, j211115, null, 0);
                                if (bArr2 != null) {
                                    bArrD2.getClass();
                                    j6Var2 = new j6(ci0Var, bArr2, bArrD2);
                                } else {
                                    j6Var2 = ci0Var;
                                }
                                z7 = z1119;
                                ci0Var2 = j6Var2;
                                ii0Var = ii0Var16;
                            } else {
                                ii0Var = null;
                                ci0Var2 = null;
                                z7 = false;
                            }
                            long j211116 = j9 + j11;
                            long j211117 = j211116 + wm1Var.p;
                            i3 = ym1Var.j + wm1Var.q;
                            if (nm1Var != 0) {
                                ii0Var2 = nm1Var.q;
                                if (ii0Var != ii0Var2) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                if (uri.equals(nm1Var.m)) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                mv1Var = nm1Var.y;
                                be3Var = nm1Var.z;
                                if (z8) {
                                    jwVar2 = null;
                                } else {
                                    jwVar2 = null;
                                }
                                jwVar = jwVar2;
                            } else {
                                mv1Var = new mv1(null);
                                be3Var = new be3(10);
                                jwVar = null;
                            }
                            mv1 mv1Var8 = mv1Var;
                            be3 be3Var8 = be3Var;
                            long j211118 = jm1Var7.b;
                            int i14 = jm1Var7.c;
                            boolean z11110 = !z3;
                            boolean z11111 = wm1Var.x;
                            sparseArray = (SparseArray) si1Var7.o;
                            iu4Var = (iu4) sparseArray.get(i3);
                            if (iu4Var == null) {
                                iu4Var = new iu4(9223372036854775806L);
                                sparseArray.put(i3, iu4Var);
                            }
                            mf4Var.p = new nm1(xk0Var7, j6Var, ii0Var15, tb1Var7, z6, ci0Var2, ii0Var, z7, uri, list12, iN7, objQ7, j211116, j211117, j211118, i14, z11110, i3, z11111, z1118, iu4Var, wm1Var.s, jwVar, mv1Var8, be3Var8, z5, z4, ik3Var7);
                        }
                    }
                }
            }
        }
        z11 = mf4Var.o;
        s20Var = (s20) mf4Var.p;
        uri2 = (Uri) mf4Var.q;
        if (z11) {
            this.d0 = j;
            this.g0 = true;
            return true;
        }
        if (s20Var == null) {
            if (uri2 != null) {
                return false;
            }
            ((zk0) ((pm1) this.p.o).o.q.get(uri2)).d(true);
            return false;
        }
        if (s20Var instanceof nm1) {
            nm1Var2 = (nm1) s20Var;
            if (!arrayList.isEmpty()) {
                arrayList2 = arrayList;
                break;
            }
            if (!C().f()) {
                B(arrayList.size() - 1);
            }
            if (!nm1Var2.n) {
                arrayList2 = arrayList;
                break;
            }
            arrayList2 = arrayList;
            break;
            this.k0 = nm1Var2;
            this.S = nm1Var2.d;
            this.d0 = -9223372036854775807L;
            arrayList2.add(nm1Var2);
            uw1VarJ = yw1.j();
            while (i4 < r5) {
                uw1VarJ.c(Integer.valueOf(kn1Var3.q + kn1Var3.p));
            }
            gy3 gy3VarF2 = uw1VarJ.f();
            nm1Var2.D = this;
            nm1Var2.I = gy3VarF2;
            while (i5 < r4) {
                kn1Var4.getClass();
                kn1Var4.C = nm1Var2.k;
                if (nm1Var2.L) {
                    kn1Var4.G = true;
                }
            }
        }
        this.H = s20Var;
        i61Var.u(s20Var, this, this.v.D(s20Var.c));
        return true;
    }

    @Override // defpackage.m51
    public final void p() {
        this.h0 = true;
        this.E.post(this.D);
    }

    @Override // defpackage.da4
    public final long q() {
        long j;
        ArrayList arrayList = this.A;
        if (this.g0) {
            return Long.MIN_VALUE;
        }
        if (E()) {
            return this.d0;
        }
        long jMax = this.c0;
        nm1 nm1VarC = C();
        if (!nm1VarC.H) {
            nm1VarC = arrayList.size() > 1 ? (nm1) arrayList.get(arrayList.size() - 2) : null;
        }
        if (nm1VarC != null) {
            jMax = Math.max(jMax, nm1VarC.h);
        }
        if (this.P) {
            for (kn1 kn1Var : this.I) {
                synchronized (kn1Var) {
                    j = kn1Var.v;
                }
                jMax = Math.max(jMax, j);
            }
        }
        return jMax;
    }

    @Override // defpackage.o44
    public final void r() {
        this.E.post(this.C);
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 jd2Var, long j, long j2, IOException iOException, int i) {
        boolean zO;
        dd2 dd2Var;
        int i2;
        s20 s20Var = (s20) jd2Var;
        boolean z = s20Var instanceof nm1;
        if (z && !((nm1) s20Var).f() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).p) == 410 || i2 == 404)) {
            return i61.r;
        }
        long j3 = s20Var.i.o;
        ii0 ii0Var = s20Var.b;
        yl4 yl4Var = s20Var.i;
        ed2 ed2Var = new ed2(ii0Var, yl4Var.p, yl4Var.q, j, j2, j3);
        f35.i0(s20Var.g);
        f35.i0(s20Var.h);
        x7 x7Var = new x7(i, 8, iOException);
        km1 km1Var = this.q;
        n50 n50VarN = uo.n(km1Var.r);
        this.v.getClass();
        dd2 dd2VarC = i80.C(n50VarN, x7Var);
        if (dd2VarC == null || dd2VarC.a != 2) {
            zO = false;
        } else {
            long j4 = dd2VarC.b;
            t41 t41Var = km1Var.r;
            zO = t41Var.o(t41Var.t(km1Var.h.b(s20Var.d)), j4);
        }
        if (zO) {
            if (z && j3 == 0) {
                ArrayList arrayList = this.A;
                rr2.w(((nm1) arrayList.remove(arrayList.size() - 1)) == s20Var);
                if (arrayList.isEmpty()) {
                    this.d0 = this.c0;
                } else {
                    ((nm1) te5.w(arrayList)).J = true;
                }
            }
            dd2Var = i61.s;
        } else {
            long jE = i80.E(x7Var);
            dd2Var = jE != -9223372036854775807L ? new dd2(0, jE, false) : i61.t;
        }
        dd2 dd2Var2 = dd2Var;
        int i3 = dd2Var2.a;
        boolean z2 = i3 == 0 || i3 == 1;
        this.x.s(ed2Var, s20Var.c, this.o, s20Var.d, s20Var.e, s20Var.f, s20Var.g, s20Var.h, iOException, !z2);
        if (!z2) {
            this.H = null;
        }
        if (zO) {
            if (!this.Q) {
                od2 od2Var = new od2();
                od2Var.a = this.c0;
                o(new pd2(od2Var));
                return dd2Var2;
            }
            this.p.j(this);
        }
        return dd2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [kn1[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kn1[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wv4] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kn1, p44] */
    /* JADX WARN: Type inference failed for: r5v6, types: [tq0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.m51
    public final wv4 t(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Set set = l0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.K;
        SparseIntArray sparseIntArray = this.L;
        ?? kn1Var = 0;
        kn1Var = 0;
        if (zContains) {
            rr2.l(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.J[i3] = i;
                }
                kn1Var = this.J[i3] == i ? this.I[i3] : y(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.I;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.J[i4] == i) {
                    kn1Var = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (kn1Var == 0) {
            if (this.h0) {
                return y(i, i2);
            }
            int length = this.I.length;
            boolean z = i2 == 1 || i2 == 2;
            kn1Var = new kn1(this.r, this.t, this.u, this.G);
            kn1Var.t = this.c0;
            if (z) {
                kn1Var.I = this.j0;
                kn1Var.z = true;
            }
            long j = this.i0;
            if (kn1Var.F != j) {
                kn1Var.F = j;
                kn1Var.z = true;
            }
            nm1 nm1Var = this.k0;
            if (nm1Var != null) {
                kn1Var.C = nm1Var.k;
            }
            kn1Var.f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.J, i5);
            this.J = iArrCopyOf;
            iArrCopyOf[length] = i;
            kn1[] kn1VarArr = this.I;
            String str = f35.a;
            ?? CopyOf = Arrays.copyOf(kn1VarArr, kn1VarArr.length + 1);
            CopyOf[kn1VarArr.length] = kn1Var;
            this.I = (kn1[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.b0, i5);
            this.b0 = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.Z |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (D(i2) > D(this.N)) {
                this.O = length;
                this.N = i2;
            }
            this.a0 = Arrays.copyOf(this.a0, i5);
        }
        if (i2 != 5) {
            return kn1Var;
        }
        if (this.M == null) {
            this.M = new jn1(kn1Var, this.y);
        }
        return this.M;
    }

    @Override // defpackage.da4
    public final void u(long j) {
        i61 i61Var = this.w;
        if (((IOException) i61Var.q) == null && !E()) {
            boolean zL = i61Var.l();
            km1 km1Var = this.q;
            List list = this.B;
            if (zL) {
                this.H.getClass();
                if (km1Var.n != null ? false : km1Var.r.e(j, this.H, list)) {
                    i61Var.d();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && km1Var.b((nm1) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                B(size);
            }
            int size2 = (km1Var.n != null || km1Var.r.length() < 2) ? list.size() : km1Var.r.j(j, list);
            if (size2 < this.A.size()) {
                B(size2);
            }
        }
    }

    public final void v() {
        rr2.w(this.Q);
        this.V.getClass();
        this.W.getClass();
    }

    @Override // defpackage.m51
    public final void w(m84 m84Var) {
    }

    public final boolean x(int i) {
        int i2 = i;
        while (true) {
            ArrayList arrayList = this.A;
            if (i2 >= arrayList.size()) {
                nm1 nm1Var = (nm1) arrayList.get(i);
                for (int i3 = 0; i3 < this.I.length; i3++) {
                    if (this.I[i3].o() > nm1Var.e(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (((nm1) arrayList.get(i2)).L) {
                return false;
            }
            i2++;
        }
    }

    public final tv4 z(sv4[] sv4VarArr) {
        for (int i = 0; i < sv4VarArr.length; i++) {
            sv4 sv4Var = sv4VarArr[i];
            tb1[] tb1VarArr = new tb1[sv4Var.a];
            for (int i2 = 0; i2 < sv4Var.a; i2++) {
                tb1 tb1Var = sv4Var.d[i2];
                int iF = this.t.f(tb1Var);
                sb1 sb1VarA = tb1Var.a();
                sb1VarA.N = iF;
                tb1VarArr[i2] = new tb1(sb1VarA);
            }
            sv4VarArr[i] = new sv4(sv4Var.b, tb1VarArr);
        }
        return new tv4(sv4VarArr);
    }
}
