package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class a13 extends ch4 {
    public static final int[] n = new int[0];
    public final if1 e;
    public final if1 f;
    public int g;
    public x03 h;
    public ArrayList i;
    public gh4 j;
    public int[] k;
    public int l;
    public boolean m;

    public a13(long j, gh4 gh4Var, if1 if1Var, if1 if1Var2) {
        super(j, gh4Var);
        this.e = if1Var;
        this.f = if1Var2;
        this.j = gh4.r;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (jh4.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(x03 x03Var) {
        this.h = x03Var;
    }

    public a13 C(if1 if1Var, if1 if1Var2) {
        w43 w43Var;
        if (this.c) {
            oo3.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            oo3.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = jh4.c;
        synchronized (obj) {
            long j = jh4.e;
            jh4.e = j + 1;
            jh4.d = jh4.d.f(j);
            gh4 gh4VarD = d();
            r(gh4VarD.f(j));
            w43Var = new w43(j, jh4.d(gh4VarD, g() + 1, j), jh4.k(if1Var, e(), true), jh4.l(if1Var2, i()), this);
        }
        if (this.m || this.c) {
            return w43Var;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = jh4.e;
            jh4.e = j2 + 1;
            s(j2);
            jh4.d = jh4.d.f(g());
        }
        r(jh4.d(d(), jG + 1, g()));
        return w43Var;
    }

    @Override // defpackage.ch4
    public final void b() {
        jh4.d = jh4.d.b(g()).a(this.j);
    }

    @Override // defpackage.ch4
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (jh4.c) {
            o();
        }
        l();
    }

    @Override // defpackage.ch4
    public boolean f() {
        return false;
    }

    @Override // defpackage.ch4
    public int h() {
        return this.g;
    }

    @Override // defpackage.ch4
    public if1 i() {
        return this.f;
    }

    @Override // defpackage.ch4
    public void k() {
        this.l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // defpackage.ch4
    public void l() {
        if (this.l <= 0) {
            oo3.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        x03 x03VarX = x();
        if (x03VarX != null) {
            if (this.m) {
                oo3.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = x03VarX.b;
            long[] jArr = x03VarX.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (tl4 tl4VarA = ((rl4) objArr[(i2 << 3) + i4]).a(); tl4VarA != null; tl4VarA = tl4VarA.b) {
                                    long j2 = tl4VarA.a;
                                    if (j2 == jG || q40.s0(this.j, Long.valueOf(j2))) {
                                        o54 o54Var = jh4.a;
                                        tl4VarA.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.ch4
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.ch4
    public void n(rl4 rl4Var) {
        x03 x03VarX = x();
        if (x03VarX == null) {
            x03 x03Var = w54.a;
            x03VarX = new x03();
            B(x03VarX);
        }
        x03VarX.a(rl4Var);
    }

    @Override // defpackage.ch4
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            jh4.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ch4
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ch4
    public ch4 u(if1 if1Var) {
        x43 x43Var;
        if (this.c) {
            oo3.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            oo3.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = jh4.c;
        synchronized (obj) {
            long j = jh4.e;
            jh4.e = j + 1;
            jh4.d = jh4.d.f(j);
            x43Var = new x43(j, jh4.d(d(), jG + 1, j), jh4.k(if1Var, e(), true), this);
        }
        if (this.m || this.c) {
            return x43Var;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = jh4.e;
            jh4.e = j2 + 1;
            s(j2);
            jh4.d = jh4.d.f(g());
        }
        r(jh4.d(d(), jG2 + 1, g()));
        return x43Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (jh4.c) {
            long j = jh4.e;
            jh4.e = j + 1;
            s(j);
            jh4.d = jh4.d.f(g());
        }
        r(jh4.d(d(), jG + 1, g()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014a A[EDGE_INSN: B:101:0x014a->B:77:0x014a BREAK  A[LOOP:4: B:66:0x011b->B:76:0x0147], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x00fe, LOOP:2: B:48:0x00d6->B:60:0x0108, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[Catch: all -> 0x00fe, LOOP:4: B:66:0x011b->B:76:0x0147, LOOP_END, TryCatch #1 {all -> 0x00fe, blocks: (B:43:0x00ba, B:45:0x00ca, B:48:0x00d6, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:57:0x0100, B:63:0x0111, B:66:0x011b, B:68:0x0125, B:70:0x012f, B:72:0x0135, B:73:0x013f, B:76:0x0147, B:77:0x014a, B:79:0x014e, B:81:0x0155, B:82:0x0161, B:60:0x0108), top: B:91:0x00ba }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010f A[EDGE_INSN: B:96:0x010f->B:62:0x010f BREAK  A[LOOP:2: B:48:0x00d6->B:60:0x0108], SYNTHETIC] */
    public jz4 w() {
        HashMap mapB;
        List list;
        x03 x03Var;
        long j;
        long j2;
        x03 x03VarX = x();
        if (x03VarX != null) {
            long j3 = jh4.j.b;
            mapB = jh4.b(j3, this, jh4.d.b(j3));
        } else {
            mapB = null;
        }
        u01 u01Var = u01.n;
        synchronized (jh4.c) {
            try {
                jh4.c(this);
                if (x03VarX == null || x03VarX.d == 0) {
                    b();
                    yi1 yi1Var = jh4.j;
                    x03 x03Var2 = yi1Var.h;
                    jh4.v(yi1Var, jh4.a);
                    if (x03Var2 == null || !x03Var2.h()) {
                        list = u01Var;
                        x03Var = null;
                    } else {
                        list = jh4.h;
                        x03Var = x03Var2;
                    }
                } else {
                    yi1 yi1Var2 = jh4.j;
                    jz4 jz4VarZ = z(jh4.e, x03VarX, mapB, jh4.d.b(yi1Var2.b));
                    if (!jz4VarZ.equals(eh4.j)) {
                        return jz4VarZ;
                    }
                    b();
                    x03Var = yi1Var2.h;
                    jh4.v(yi1Var2, jh4.a);
                    B(null);
                    yi1Var2.h = null;
                    list = jh4.h;
                }
                this.m = true;
                if (x03Var != null) {
                    x54 x54Var = new x54(x03Var);
                    if (!x03Var.g()) {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((wf1) list.get(i)).invoke(x54Var, this);
                        }
                    }
                }
                if (x03VarX != null && x03VarX.h()) {
                    x54 x54Var2 = new x54(x03VarX);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((wf1) list.get(i2)).invoke(x54Var2, this);
                    }
                }
                synchronized (jh4.c) {
                    try {
                        p();
                        jh4.f();
                        if (x03Var != null) {
                            Object[] objArr = x03Var.b;
                            long[] jArr = x03Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                j = 128;
                                while (true) {
                                    long j4 = jArr[i3];
                                    j2 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i3 != length) {
                                            break;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((j4 & 255) < 128) {
                                                jh4.q((rl4) objArr[(i3 << 3) + i5]);
                                            }
                                            j4 >>= 8;
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
                            } else {
                                j = 128;
                                j2 = 255;
                            }
                        } else {
                            j = 128;
                            j2 = 255;
                        }
                        if (x03VarX != null) {
                            Object[] objArr2 = x03VarX.b;
                            long[] jArr2 = x03VarX.a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j5 = jArr2[i6];
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i6 != length2) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j5 & j2) < j) {
                                                jh4.q((rl4) objArr2[(i6 << 3) + i8]);
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i6 != length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i9 = 0; i9 < size3; i9++) {
                                jh4.q((rl4) arrayList.get(i9));
                            }
                        }
                        this.i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return eh4.j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public x03 x() {
        return this.h;
    }

    @Override // defpackage.ch4
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public if1 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7 A[LOOP:3: B:79:0x01a5->B:80:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final jz4 z(long j, x03 x03Var, HashMap map, gh4 gh4Var) {
        ArrayList arrayList;
        ArrayList arrayListG0;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        rl4 rl4Var;
        tl4 tl4Var;
        gh4 gh4Var2;
        Object[] objArr;
        long[] jArr;
        gh4 gh4Var3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        ArrayList arrayList4;
        tl4 tl4VarB;
        gh4 gh4VarE = d().f(g()).e(this.j);
        Object[] objArr3 = x03Var.b;
        long[] jArr3 = x03Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList2 = null;
            arrayListG0 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            rl4 rl4Var2 = (rl4) objArr3[(i4 << 3) + i6];
                            jArr2 = jArr3;
                            tl4 tl4VarA = rl4Var2.a();
                            i3 = i6;
                            ArrayList arrayList5 = arrayList2;
                            tl4 tl4VarS = jh4.s(tl4VarA, j, gh4Var);
                            if (tl4VarS == null) {
                                arrayList4 = arrayListG0;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayListG0;
                                j2 = j3;
                                tl4 tl4VarS2 = jh4.s(tl4VarA, g(), gh4VarE);
                                if (tl4VarS2 != null && tl4VarS2.a != 1 && !tl4VarS.equals(tl4VarS2)) {
                                    gh4Var3 = gh4VarE;
                                    tl4 tl4VarS3 = jh4.s(tl4VarA, g(), d());
                                    if (tl4VarS3 == null) {
                                        jh4.r();
                                        throw null;
                                    }
                                    if (map == null || (tl4VarB = (tl4) map.get(tl4VarS)) == null) {
                                        tl4VarB = rl4Var2.b(tl4VarS2, tl4VarS, tl4VarS3);
                                    }
                                    if (tl4VarB == null) {
                                        return new dh4(this);
                                    }
                                    if (!tl4VarB.equals(tl4VarS3)) {
                                        if (tl4VarB.equals(tl4VarS)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new kd3(rl4Var2, tl4VarS.b(g())));
                                            arrayListG0 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayListG0.add(rl4Var2);
                                            arrayList2 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList2.add(!tl4VarB.equals(tl4VarS2) ? new kd3(rl4Var2, tl4VarB) : new kd3(rl4Var2, tl4VarS2.b(g())));
                                        }
                                    }
                                    arrayListG0 = arrayList4;
                                }
                                arrayList2 = arrayList5;
                                arrayListG0 = arrayList4;
                            }
                            gh4Var3 = gh4VarE;
                            arrayList2 = arrayList5;
                            arrayListG0 = arrayList4;
                        } else {
                            gh4Var3 = gh4VarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i6;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i6 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        gh4VarE = gh4Var3;
                    }
                    gh4Var2 = gh4VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    gh4Var2 = gh4VarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 != length) {
                    i4++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    gh4VarE = gh4Var2;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    kd3 kd3Var = (kd3) arrayList2.get(i2);
                    rl4Var = (rl4) kd3Var.n;
                    tl4Var = (tl4) kd3Var.o;
                    tl4Var.a = j;
                    synchronized (jh4.c) {
                        tl4Var.b = rl4Var.a();
                        rl4Var.d(tl4Var);
                    }
                }
            }
            if (arrayListG0 != null) {
                size = arrayListG0.size();
                for (i = 0; i < size; i++) {
                    x03Var.l((rl4) arrayListG0.get(i));
                }
                arrayList3 = this.i;
                if (arrayList3 != null) {
                    arrayListG0 = q40.G0(arrayList3, arrayListG0);
                }
                this.i = arrayListG0;
            }
            return eh4.j;
        }
        arrayList = null;
        arrayListG0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i2 < size2) {
                kd3 kd3Var2 = (kd3) arrayList2.get(i2);
                rl4Var = (rl4) kd3Var2.n;
                tl4Var = (tl4) kd3Var2.o;
                tl4Var.a = j;
                synchronized (jh4.c) {
                    tl4Var.b = rl4Var.a();
                    rl4Var.d(tl4Var);
                }
            }
        }
        if (arrayListG0 != null) {
            size = arrayListG0.size();
            while (i < size) {
                x03Var.l((rl4) arrayListG0.get(i));
            }
            arrayList3 = this.i;
            if (arrayList3 != null) {
                arrayListG0 = q40.G0(arrayList3, arrayListG0);
            }
            this.i = arrayListG0;
        }
        return eh4.j;
    }
}
