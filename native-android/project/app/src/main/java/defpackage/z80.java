package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z80 implements t80 {
    public w03 A;
    public boolean B;
    public md4 C;
    public ef3 D;
    public z80 E;
    public int F;
    public final zg5 G;
    public final uy3 H;
    public final rg1 I;
    public int J;
    public final u80 n;
    public final d15 o;
    public final AtomicReference p = new AtomicReference(null);
    public final Object q = new Object();
    public final z03 r;
    public final ig4 s;
    public final w03 t;
    public final x03 u;
    public final x03 v;
    public final w03 w;
    public final w00 x;
    public final w00 y;
    public final w03 z;

    public z80(u80 u80Var, d15 d15Var) {
        this.n = u80Var;
        this.o = d15Var;
        z03 z03Var = new z03(new x03());
        this.r = z03Var;
        ig4 ig4Var = new ig4();
        if (u80Var.d()) {
            ig4Var.x = new i03();
        }
        if (u80Var.f()) {
            ig4Var.b();
        }
        this.s = ig4Var;
        this.t = te5.i();
        this.u = new x03();
        this.v = new x03();
        this.w = te5.i();
        w00 w00Var = new w00();
        this.x = w00Var;
        w00 w00Var2 = new w00();
        this.y = w00Var2;
        this.z = te5.i();
        this.A = te5.i();
        zg5 zg5Var = new zg5(u80Var);
        this.G = zg5Var;
        this.H = new uy3();
        rg1 rg1Var = new rg1(d15Var, u80Var, kg4.d(ig4Var), z03Var, w00Var, w00Var2, zg5Var, this);
        u80Var.p(rg1Var);
        this.I = rg1Var;
    }

    public final void A(wf1 wf1Var) {
        boolean zI = i();
        q();
        u80 u80Var = this.n;
        if (!zI) {
            u80Var.a(this, wf1Var);
            return;
        }
        rg1 rg1Var = this.I;
        rg1Var.z = 0;
        rg1Var.y = true;
        u80Var.a(this, wf1Var);
        if (rg1Var.F || rg1Var.z != 0) {
            oo3.a("Cannot disable reuse from root if it was caused by other groups");
        }
        rg1Var.z = -1;
        rg1Var.y = false;
    }

    public final void a() {
        this.p.set(null);
        this.x.n.u0();
        this.y.n.u0();
        z03 z03Var = this.r;
        if (z03Var.n.g()) {
            return;
        }
        uy3 uy3Var = this.H;
        try {
            uy3Var.g(z03Var, this.I.v());
            uy3Var.b();
        } finally {
            uy3Var.a();
        }
    }

    public final void b(Object obj, boolean z) {
        Object objG = this.t.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof x03;
        p12 p12Var = p12.n;
        x03 x03Var = this.u;
        x03 x03Var2 = this.v;
        w03 w03Var = this.z;
        if (!z2) {
            lv3 lv3Var = (lv3) objG;
            if (te5.I(w03Var, obj, lv3Var) || lv3Var.b(obj) == p12Var) {
                return;
            }
            if (lv3Var.g == null || z) {
                x03Var.a(lv3Var);
                return;
            } else {
                x03Var2.a(lv3Var);
                return;
            }
        }
        x03 x03Var3 = (x03) objG;
        Object[] objArr = x03Var3.b;
        long[] jArr = x03Var3.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        lv3 lv3Var2 = (lv3) objArr[(i << 3) + i3];
                        if (!te5.I(w03Var, obj, lv3Var2) && lv3Var2.b(obj) != p12Var) {
                            if (lv3Var2.g == null || z) {
                                x03Var.a(lv3Var2);
                            } else {
                                x03Var2.a(lv3Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void c(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof x54;
        w03 w03Var = this.w;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            x03 x03Var = ((x54) set).n;
            Object[] objArr = x03Var.b;
            long[] jArr9 = x03Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof lv3) {
                                    ((lv3) obj2).b(obj);
                                } else {
                                    b(obj2, z);
                                    Object objG = w03Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof x03) {
                                            x03 x03Var2 = (x03) objG;
                                            Object[] objArr2 = x03Var2.b;
                                            long[] jArr10 = x03Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                b((dp0) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            b((dp0) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof lv3) {
                    ((lv3) obj3).b(null);
                } else {
                    b(obj3, z);
                    Object objG2 = w03Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof x03) {
                            x03 x03Var3 = (x03) objG2;
                            Object[] objArr3 = x03Var3.b;
                            long[] jArr12 = x03Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                b((dp0) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            b((dp0) objG2, z);
                        }
                    }
                }
            }
        }
        w03 w03Var2 = this.t;
        x03 x03Var4 = this.u;
        if (z) {
            x03 x03Var5 = this.v;
            if (x03Var5.h()) {
                long[] jArr13 = w03Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = w03Var2.b[i18];
                                    Object obj5 = w03Var2.c[i18];
                                    if (obj5 instanceof x03) {
                                        x03 x03Var6 = (x03) obj5;
                                        Object[] objArr4 = x03Var6.b;
                                        long[] jArr14 = x03Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            lv3 lv3Var = (lv3) objArr5[i22];
                                                            if (x03Var5.c(lv3Var) || x03Var4.c(lv3Var)) {
                                                                x03Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = x03Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        obj5.getClass();
                                        lv3 lv3Var2 = (lv3) obj5;
                                        zG = x03Var5.c(lv3Var2) || x03Var4.c(lv3Var2);
                                    }
                                    if (zG) {
                                        w03Var2.k(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                x03Var5.b();
                h();
                return;
            }
        }
        if (x03Var4.h()) {
            long[] jArr16 = w03Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = w03Var2.b[i26];
                                Object obj7 = w03Var2.c[i26];
                                if (obj7 instanceof x03) {
                                    x03 x03Var7 = (x03) obj7;
                                    Object[] objArr6 = x03Var7.b;
                                    long[] jArr17 = x03Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (x03Var4.c((lv3) objArr7[i30])) {
                                                            x03Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = x03Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    obj7.getClass();
                                    zC = x03Var4.c((lv3) obj7);
                                }
                                if (zC) {
                                    w03Var2.k(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            h();
            x03Var4.b();
        }
    }

    public final void d() {
        synchronized (this.q) {
            try {
                e(this.x);
                o();
            } catch (Throwable th) {
                try {
                    if (!this.r.n.g()) {
                        uy3 uy3Var = this.H;
                        try {
                            uy3Var.g(this.r, this.I.v());
                            uy3Var.b();
                        } finally {
                            uy3Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x013a A[EDGE_INSN: B:164:0x013a->B:82:0x013a BREAK  A[LOOP:2: B:140:0x00ed->B:80:0x0130], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0130 A[Catch: all -> 0x0120, LOOP:2: B:140:0x00ed->B:80:0x0130, LOOP_END, TryCatch #1 {all -> 0x0120, blocks: (B:64:0x00ed, B:66:0x00fc, B:68:0x0106, B:70:0x010c, B:72:0x011c, B:76:0x0125, B:82:0x013a, B:90:0x015c, B:93:0x016f, B:80:0x0130, B:85:0x0144, B:99:0x018d, B:101:0x0199), top: B:140:0x00ed }] */
    public final void e(w00 w00Var) throws Throwable {
        bi biVar;
        uy3 uy3Var;
        uy3 uy3Var2;
        long[] jArr;
        int i;
        long[] jArr2;
        uy3 uy3Var3;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        w00 w00Var2 = this.y;
        rg1 rg1Var = this.I;
        x80 x80VarV = rg1Var.v();
        uy3 uy3Var4 = this.H;
        uy3Var4.g(this.r, x80VarV);
        try {
            if (w00Var.n.w0()) {
                try {
                    if (w00Var2.n.w0() && this.D == null) {
                        uy3Var4.b();
                    }
                    return;
                } finally {
                    uy3Var4.a();
                }
            }
            ef3 ef3Var = this.D;
            if (ef3Var == null || (biVar = ef3Var.l) == null) {
                biVar = this.o;
            }
            try {
                Trace.beginSection(biVar.equals(ef3Var != null ? ef3Var.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    ef3 ef3Var2 = this.D;
                    if (ef3Var2 == null || (uy3Var = ef3Var2.k) == null) {
                        uy3Var = uy3Var4;
                    }
                    ig4 ig4Var = this.s;
                    x80 x80VarV2 = rg1Var.v();
                    lg4 lg4VarE = kg4.d(ig4Var).e();
                    int i3 = 0;
                    try {
                        w00Var.C(biVar, lg4VarE, uy3Var, x80VarV2);
                        lg4VarE.e(true);
                        biVar.i();
                        Trace.endSection();
                        uy3Var4.c();
                        uy3Var4.d();
                        if (this.B) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.B = false;
                                w03 w03Var = this.t;
                                long[] jArr3 = w03Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = w03Var.b[i8];
                                                    Object obj2 = w03Var.c[i8];
                                                    if (obj2 instanceof x03) {
                                                        x03 x03Var = (x03) obj2;
                                                        Object[] objArr = x03Var.b;
                                                        long[] jArr4 = x03Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        uy3Var3 = uy3Var4;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((lv3) objArr[i13]).a()) {
                                                                                    x03Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = x03Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        uy3Var3 = uy3Var4;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zG = !((lv3) obj2).a();
                                                    }
                                                    if (zG) {
                                                        w03Var.k(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    uy3Var3 = uy3Var4;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                uy3Var4 = uy3Var3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            uy3Var2 = uy3Var4;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            uy3Var2 = uy3Var4;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        uy3Var4 = uy3Var2;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    uy3Var2 = uy3Var4;
                                }
                                h();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            uy3Var2 = uy3Var4;
                        }
                        try {
                            if (w00Var2.n.w0() && this.D == null) {
                                uy3Var2.b();
                            }
                            return;
                        } finally {
                            uy3Var2.a();
                        }
                    } catch (Throwable th3) {
                        try {
                            lg4VarE.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (w00Var2.n.w0() && this.D == null) {
                uy3Var4.b();
            }
            throw th;
        } finally {
            uy3Var4.a();
        }
    }

    public final void f() {
        synchronized (this.q) {
            try {
                w00 w00Var = this.y;
                w00Var.getClass();
                if (!w00Var.n.w0()) {
                    e(this.y);
                }
            } catch (Throwable th) {
                try {
                    if (!this.r.n.g()) {
                        uy3 uy3Var = this.H;
                        try {
                            uy3Var.g(this.r, this.I.v());
                            uy3Var.b();
                        } finally {
                            uy3Var.a();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.q) {
            try {
                this.I.v = null;
                if (!this.r.n.g()) {
                    uy3 uy3Var = this.H;
                    try {
                        uy3Var.g(this.r, this.I.v());
                        uy3Var.b();
                        uy3Var.a();
                    } catch (Throwable th) {
                        uy3Var.a();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.r.n.g()) {
                        uy3 uy3Var2 = this.H;
                        try {
                            uy3Var2.g(this.r, this.I.v());
                            uy3Var2.b();
                        } finally {
                            uy3Var2.a();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        w03 w03Var = this.w;
        long[] jArr3 = w03Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = w03Var.b[i10];
                            Object obj2 = w03Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof x03;
                            j5 = j8;
                            w03 w03Var2 = this.t;
                            if (z) {
                                x03 x03Var = (x03) obj2;
                                Object[] objArr = x03Var.b;
                                long[] jArr4 = x03Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!w03Var2.c((dp0) objArr[i15])) {
                                                        x03Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = x03Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !w03Var2.c((dp0) obj2);
                            }
                            if (zG) {
                                w03Var.k(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        x03 x03Var2 = this.v;
        if (!x03Var2.h()) {
            return;
        }
        Object[] objArr2 = x03Var2.b;
        long[] jArr5 = x03Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((lv3) objArr2[i20]).g == null) {
                            x03Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean i() {
        boolean z;
        synchronized (this.q) {
            z = true;
            if (this.J != 1) {
                z = false;
            }
            if (z) {
                this.J = 0;
            }
        }
        return z;
    }

    public final void j(wf1 wf1Var) {
        try {
            synchronized (this.q) {
                n();
                w03 w03Var = this.A;
                this.A = te5.i();
                try {
                    rg1 rg1Var = this.I;
                    md4 md4Var = this.C;
                    if (!rg1Var.e.n.w0()) {
                        l80.a("Expected applyChanges() to have been called");
                    }
                    rg1Var.P = md4Var;
                    try {
                        rg1Var.m(w03Var, wf1Var);
                        rg1Var.P = null;
                    } catch (Throwable th) {
                        rg1Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.A = w03Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.r.n.g()) {
                    uy3 uy3Var = this.H;
                    try {
                        uy3Var.g(this.r, this.I.v());
                        uy3Var.b();
                    } finally {
                        uy3Var.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final ef3 k(boolean z, wf1 wf1Var) {
        if (this.D != null) {
            oo3.b("A pausable composition is in progress");
        }
        ef3 ef3Var = new ef3(this, this.n, this.I, this.r, wf1Var, z, this.o, this.q);
        this.D = ef3Var;
        return ef3Var;
    }

    public final void l() {
        synchronized (this.q) {
            try {
                if (this.D != null) {
                    oo3.b("Deactivate is not supported while pausable composition is in progress");
                }
                int i = 1;
                boolean z = this.s.o == 0;
                if (!z || !this.r.n.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        uy3 uy3Var = this.H;
                        try {
                            uy3Var.g(this.r, this.I.v());
                            if (!z) {
                                ig4 ig4Var = this.s;
                                uy3 uy3Var2 = this.H;
                                lg4 lg4VarE = ig4Var.e();
                                try {
                                    lg4VarE.n(lg4VarE.t, new ib(i, uy3Var2, lg4VarE));
                                    lg4VarE.e(true);
                                    this.o.i();
                                    uy3Var.c();
                                } catch (Throwable th) {
                                    lg4VarE.e(false);
                                    throw th;
                                }
                            }
                            uy3Var.b();
                            uy3Var.a();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            uy3Var.a();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                this.t.a();
                this.w.a();
                this.A.a();
                this.x.n.u0();
                this.y.n.u0();
                rg1 rg1Var = this.I;
                rg1Var.E.clear();
                rg1Var.s.clear();
                rg1Var.e.n.u0();
                rg1Var.v = null;
                this.J = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.q) {
            try {
                if (this.I.F) {
                    oo3.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                int i = 3;
                if (this.J != 3) {
                    this.J = 3;
                    w00 w00Var = this.I.L;
                    if (w00Var != null) {
                        e(w00Var);
                    }
                    boolean z = this.s.o == 0;
                    if (!z || !this.r.n.g()) {
                        uy3 uy3Var = this.H;
                        try {
                            uy3Var.g(this.r, this.I.v());
                            if (!z) {
                                ig4 ig4Var = this.s;
                                uy3 uy3Var2 = this.H;
                                lg4 lg4VarE = ig4Var.e();
                                try {
                                    lg4VarE.n(lg4VarE.t, new z(i, uy3Var2));
                                    lg4VarE.H();
                                    lg4VarE.e(true);
                                    this.o.f();
                                    this.o.i();
                                    uy3Var.c();
                                } catch (Throwable th) {
                                    lg4VarE.e(false);
                                    throw th;
                                }
                            }
                            uy3Var.b();
                            uy3Var.a();
                        } catch (Throwable th2) {
                            uy3Var.a();
                            throw th2;
                        }
                    }
                    this.z.a();
                    rg1 rg1Var = this.I;
                    rg1Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        rg1Var.b.u(rg1Var);
                        rg1Var.E.clear();
                        rg1Var.s.clear();
                        rg1Var.e.n.u0();
                        rg1Var.v = null;
                        rg1Var.a.f();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.n.v(this);
    }

    public final void n() {
        Object obj = l93.a;
        AtomicReference atomicReference = this.p;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                l80.b("pending composition has not been applied");
                er1.a();
                return;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                l80.b("corrupt pendingModifications drain: " + atomicReference);
                er1.a();
                return;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.p;
        Object andSet = atomicReference.getAndSet(null);
        if (h12.c(andSet, l93.a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.D == null) {
                l80.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            l80.b("corrupt pendingModifications drain: " + atomicReference);
            er1.a();
        }
    }

    public final void p() {
        z01 z01Var = z01.n;
        AtomicReference atomicReference = this.p;
        Object andSet = atomicReference.getAndSet(z01Var);
        if (h12.c(andSet, l93.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            l80.b("corrupt pendingModifications drain: " + atomicReference);
            er1.a();
            return;
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        String str;
        int i = this.J;
        if (i != 0) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            oo3.b(str);
        }
        if (this.D == null) {
            return;
        }
        oo3.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        z03 z03Var = this.r;
        rg1 rg1Var = this.I;
        if (arrayList.size() > 0) {
            ((jy2) ((kd3) arrayList.get(0)).n).getClass();
            l80.a("Check failed");
        }
        try {
            rg1Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    rg1Var.x(arrayList);
                    rg1Var.h();
                    Trace.endSection();
                } catch (Throwable th) {
                    rg1Var.a();
                    throw th;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!z03Var.n.g()) {
                    uy3 uy3Var = this.H;
                    try {
                        uy3Var.g(z03Var, rg1Var.v());
                        uy3Var.b();
                    } finally {
                        uy3Var.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final p12 s(lv3 lv3Var, Object obj) {
        z80 z80Var;
        int i = lv3Var.b;
        if ((i & 2) != 0) {
            lv3Var.b = i | 4;
        }
        mg1 mg1Var = lv3Var.c;
        if (mg1Var == null || !mg1Var.a()) {
            return p12.n;
        }
        ig4 ig4Var = this.s;
        ig4Var.getClass();
        mg1 mg1Var2 = lv3Var.c;
        if (mg1Var2 != null && ig4Var.f(fh0.d(mg1Var2))) {
            if (lv3Var.d == null) {
                return p12.n;
            }
            p12 p12VarT = t(lv3Var, mg1Var, obj);
            if (p12VarT != p12.n) {
                this.G.r();
            }
            return p12VarT;
        }
        synchronized (this.q) {
            z80Var = this.E;
        }
        if (z80Var != null) {
            rg1 rg1Var = z80Var.I;
            if (rg1Var.F && rg1Var.W(lv3Var, obj)) {
                return p12.q;
            }
        }
        return p12.n;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[Catch: all -> 0x0044, LOOP:0: B:48:0x008a->B:60:0x00c1, LOOP_END, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:64:0x00c9->B:65:0x00ce BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c9 A[SYNTHETIC] */
    public final p12 t(lv3 lv3Var, mg1 mg1Var, Object obj) {
        synchronized (this.q) {
            try {
                z80 z80Var = this.E;
                z80 z80Var2 = null;
                if (z80Var != null) {
                    ig4 ig4Var = this.s;
                    int i = this.F;
                    if (ig4Var.t) {
                        l80.a("Writer is active");
                    }
                    if (i < 0 || i >= ig4Var.o) {
                        l80.a("Invalid group index");
                    }
                    mg1 mg1VarD = fh0.d(mg1Var);
                    if (ig4Var.f(mg1VarD)) {
                        int i2 = ig4Var.n[(i * 5) + 3] + i;
                        int i3 = mg1VarD.a;
                        if (i > i3 || i3 >= i2) {
                            z80Var = null;
                        }
                    } else {
                        z80Var = null;
                    }
                    z80Var2 = z80Var;
                }
                if (z80Var2 == null) {
                    rg1 rg1Var = this.I;
                    if (rg1Var.F && rg1Var.W(lv3Var, obj)) {
                        return p12.q;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof dp0;
                        w03 w03Var = this.A;
                        if (z) {
                            Object objG = w03Var.g(lv3Var);
                            if (objG == null) {
                                te5.b(this.A, lv3Var, obj);
                                break;
                            }
                            if (objG instanceof x03) {
                                x03 x03Var = (x03) objG;
                                Object[] objArr = x03Var.b;
                                long[] jArr = x03Var.a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    te5.b(this.A, lv3Var, obj);
                                    break;
                                }
                                int i4 = 0;
                                loop0: while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == rv2.B) {
                                                break loop0;
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 == length) {
                                                i4++;
                                            }
                                        }
                                        te5.b(this.A, lv3Var, obj);
                                        break;
                                    }
                                    if (i4 == length) {
                                        te5.b(this.A, lv3Var, obj);
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                if (objG != rv2.B) {
                                    te5.b(this.A, lv3Var, obj);
                                    break;
                                }
                            }
                        } else {
                            w03Var.l(lv3Var, rv2.B);
                        }
                    } else {
                        this.A.l(lv3Var, rv2.B);
                    }
                }
                if (z80Var2 != null) {
                    return z80Var2.t(lv3Var, mg1Var, obj);
                }
                this.n.l(this);
                return this.I.F ? p12.p : p12.o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(Object obj) {
        Object objG = this.t.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof x03;
        p12 p12Var = p12.q;
        w03 w03Var = this.z;
        if (!z) {
            lv3 lv3Var = (lv3) objG;
            if (lv3Var.b(obj) != p12Var || (obj instanceof dp0)) {
                return;
            }
            te5.b(w03Var, obj, lv3Var);
            return;
        }
        x03 x03Var = (x03) objG;
        Object[] objArr = x03Var.b;
        long[] jArr = x03Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        lv3 lv3Var2 = (lv3) objArr[(i << 3) + i3];
                        if (lv3Var2.b(obj) == p12Var && !(obj instanceof dp0)) {
                            te5.b(w03Var, obj, lv3Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean v(Set set) {
        boolean z = set instanceof x54;
        w03 w03Var = this.w;
        w03 w03Var2 = this.t;
        if (z) {
            x03 x03Var = ((x54) set).n;
            Object[] objArr = x03Var.b;
            long[] jArr = x03Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (w03Var2.c(obj) || w03Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (w03Var2.c(obj2) || w03Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        synchronized (this.q) {
            ef3 ef3Var = this.D;
            boolean z = false;
            if (ef3Var != null && (ef3Var.h.get() != gf3.r || ef3Var.i != te5.m())) {
                AtomicReference atomicReference = ef3Var.h;
                gf3 gf3Var = gf3.s;
                gf3 gf3Var2 = gf3.q;
                while (!atomicReference.compareAndSet(gf3Var, gf3Var2) && atomicReference.get() == gf3Var) {
                }
                ef3Var.l.n.a(9);
                return false;
            }
            n();
            try {
                w03 w03Var = this.A;
                this.A = te5.i();
                try {
                    rg1 rg1Var = this.I;
                    md4 md4Var = this.C;
                    ya3 ya3Var = rg1Var.e.n;
                    if (!ya3Var.w0()) {
                        l80.a("Expected applyChanges() to have been called");
                    }
                    if (w03Var.e > 0 || !rg1Var.s.isEmpty()) {
                        rg1Var.P = md4Var;
                        try {
                            rg1Var.m(w03Var, null);
                            rg1Var.P = null;
                            z = !ya3Var.w0();
                        } catch (Throwable th) {
                            rg1Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        o();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.A = w03Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.r.n.g()) {
                        uy3 uy3Var = this.H;
                        try {
                            uy3Var.g(this.r, this.I.v());
                            uy3Var.b();
                        } finally {
                            uy3Var.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(x54 x54Var) {
        Object obj;
        while (true) {
            Object obj2 = this.p.get();
            if (obj2 == null || obj2.equals(l93.a)) {
                obj = x54Var;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, x54Var};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.p).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = x54Var;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.p;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.q) {
                            o();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public final void y(Object obj) {
        lv3 lv3VarU;
        int i;
        boolean z;
        rg1 rg1Var = this.I;
        if (rg1Var.A <= 0 && (lv3VarU = rg1Var.u()) != null) {
            int i2 = lv3VarU.b | 1;
            lv3VarU.b = i2;
            if ((i2 & 32) == 0) {
                p03 p03Var = lv3VarU.f;
                if (p03Var == null) {
                    p03Var = new p03();
                    lv3VarU.f = p03Var;
                }
                int i3 = lv3VarU.e;
                int iC = p03Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = p03Var.c[iC];
                }
                p03Var.b[iC] = obj;
                p03Var.c[iC] = i3;
                if (i == lv3VarU.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.G.r();
            if (z) {
                return;
            }
            if (obj instanceof sl4) {
                ((sl4) obj).f(1);
            }
            te5.b(this.t, obj, lv3VarU);
            if (obj instanceof dp0) {
                dp0 dp0Var = (dp0) obj;
                cp0 cp0VarH = dp0Var.h();
                w03 w03Var = this.w;
                te5.J(w03Var, obj);
                p03 p03Var2 = cp0VarH.e;
                Object[] objArr = p03Var2.b;
                long[] jArr = p03Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    rl4 rl4Var = (rl4) objArr[(i4 << 3) + i7];
                                    if (rl4Var instanceof sl4) {
                                        ((sl4) rl4Var).f(1);
                                    }
                                    te5.b(w03Var, rl4Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = cp0VarH.f;
                w03 w03Var2 = lv3VarU.g;
                if (w03Var2 == null) {
                    w03Var2 = new w03();
                    lv3VarU.g = w03Var2;
                }
                w03Var2.l(dp0Var, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.q) {
            try {
                u(obj);
                Object objG = this.w.g(obj);
                if (objG != null) {
                    if (objG instanceof x03) {
                        x03 x03Var = (x03) objG;
                        Object[] objArr = x03Var.b;
                        long[] jArr = x03Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            u((dp0) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        u((dp0) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
