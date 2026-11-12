package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 {
    public int A;
    public int B;
    public boolean C;
    public final qg1 D;
    public final ArrayList E;
    public boolean F;
    public hg4 G;
    public ig4 H;
    public lg4 I;
    public boolean J;
    public mf3 K;
    public w00 L;
    public final k80 M;
    public mg1 N;
    public p71 O;
    public md4 P;
    public final x80 Q;
    public final ne0 R;
    public boolean S;
    public long T;
    public sg1 U;
    public final d15 a;
    public final u80 b;
    public final ig4 c;
    public final z03 d;
    public final w00 e;
    public final w00 f;
    public final zg5 g;
    public final z80 h;
    public vg1 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public g03 p;
    public boolean q;
    public boolean r;
    public i03 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final o02 n = new o02();
    public final ArrayList s = new ArrayList();
    public final o02 t = new o02();
    public mf3 u = mf3.q;
    public final o02 x = new o02();
    public int z = -1;

    public rg1(d15 d15Var, u80 u80Var, ig4 ig4Var, z03 z03Var, w00 w00Var, w00 w00Var2, zg5 zg5Var, z80 z80Var) {
        this.a = d15Var;
        this.b = u80Var;
        this.c = ig4Var;
        this.d = z03Var;
        this.e = w00Var;
        this.f = w00Var2;
        this.g = zg5Var;
        this.h = z80Var;
        this.C = u80Var.f() || u80Var.d();
        this.D = new qg1(0, this);
        this.E = new ArrayList();
        hg4 hg4VarD = ig4Var.d();
        hg4VarD.c();
        this.G = hg4VarD;
        ig4 ig4Var2 = new ig4();
        if (u80Var.f()) {
            ig4Var2.b();
        }
        if (u80Var.d()) {
            ig4Var2.x = new i03();
        }
        this.H = ig4Var2;
        lg4 lg4VarE = ig4Var2.e();
        lg4VarE.e(true);
        this.I = lg4VarE;
        this.M = new k80(this, w00Var);
        hg4 hg4VarD2 = this.H.d();
        try {
            mg1 mg1VarA = hg4VarD2.a(0);
            hg4VarD2.c();
            this.N = mg1VarA;
            this.O = new p71();
            this.Q = new x80(this);
            ne0 ne0VarJ = u80Var.j();
            ne0 ne0VarV = v();
            this.R = ne0VarJ.J(ne0VarV == null ? q01.n : ne0VarV);
        } catch (Throwable th) {
            hg4VarD2.c();
            throw th;
        }
    }

    public static final int J(rg1 rg1Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        int i5;
        hg4 hg4Var;
        hg4 hg4Var2 = rg1Var.G;
        int i6 = 0;
        if (hg4Var2.j(i)) {
            int i7 = hg4Var2.i(i);
            Object objP = hg4Var2.p(hg4Var2.b, i);
            if (i7 == 206 && h12.c(objP, l80.e)) {
                Object objH = hg4Var2.h(i, 0);
                wg1 wg1Var = objH instanceof wg1 ? (wg1) objH : null;
                vy3 vy3Var = wg1Var != null ? wg1Var.a : null;
                og1 og1Var = vy3Var instanceof og1 ? (og1) vy3Var : null;
                if (og1Var != null) {
                    x03 x03Var = og1Var.n.e;
                    Object[] objArr = x03Var.b;
                    long[] jArr2 = x03Var.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr2[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i6;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        rg1 rg1Var2 = (rg1) objArr[(i8 << 3) + i11];
                                        ig4 ig4Var = rg1Var2.c;
                                        if (ig4Var.o <= 0 || (ig4Var.n[1] & 67108864) == 0) {
                                            i5 = i6;
                                        } else {
                                            z80 z80Var = rg1Var2.h;
                                            synchronized (z80Var.q) {
                                                z80Var.p();
                                                w03 w03Var = z80Var.A;
                                                z80Var.A = te5.i();
                                                try {
                                                    z80Var.I.X(w03Var);
                                                } catch (Throwable th) {
                                                    z80Var.A = w03Var;
                                                    throw th;
                                                }
                                            }
                                            w00 w00Var = new w00();
                                            rg1Var2.L = w00Var;
                                            hg4 hg4VarD = rg1Var2.c.d();
                                            try {
                                                rg1Var2.G = hg4VarD;
                                                k80 k80Var = rg1Var2.M;
                                                w00 w00Var2 = k80Var.b;
                                                try {
                                                    k80Var.b = w00Var;
                                                    rg1Var2.I(0);
                                                    k80 k80Var2 = rg1Var2.M;
                                                    k80Var2.b();
                                                    try {
                                                        if (k80Var2.c) {
                                                            hg4Var = hg4VarD;
                                                            try {
                                                                k80Var2.b.n.x0(na3.f);
                                                                if (k80Var2.c) {
                                                                    k80Var2.d(false);
                                                                    k80Var2.d(false);
                                                                    k80Var2.b.n.x0(x93.f);
                                                                    i5 = 0;
                                                                    k80Var2.c = false;
                                                                }
                                                                k80Var.b = w00Var2;
                                                                hg4Var.c();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                k80Var.b = w00Var2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            hg4Var = hg4VarD;
                                                        }
                                                        k80Var.b = w00Var2;
                                                        hg4Var.c();
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        hg4Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    hg4Var = hg4VarD;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                hg4Var = hg4VarD;
                                            }
                                        }
                                        rg1Var.b.r(rg1Var2.h);
                                    } else {
                                        jArr2 = jArr2;
                                        i5 = i6;
                                        i9 = i9;
                                    }
                                    j >>= i9;
                                    i11++;
                                    i9 = i9;
                                    i6 = i5;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                i4 = i6;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                i4 = i6;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i6 = i4;
                            jArr2 = jArr;
                        }
                    }
                }
                return hg4Var2.o(i);
            }
            i3 = 1;
            if (!hg4Var2.l(i)) {
                return hg4Var2.o(i);
            }
        } else {
            i3 = 1;
            if (hg4Var2.d(i)) {
                int i12 = hg4Var2.b[(i * 5) + 3] + i;
                int iJ = 0;
                for (int i13 = i + 1; i13 < i12; i13 += hg4Var2.b[(i13 * 5) + 3]) {
                    boolean zL = hg4Var2.l(i13);
                    if (zL) {
                        rg1Var.M.c();
                        k80 k80Var3 = rg1Var.M;
                        Object objN = hg4Var2.n(i13);
                        k80Var3.c();
                        k80Var3.h.add(objN);
                    }
                    iJ += J(rg1Var, i13, zL || z, zL ? 0 : i2 + iJ);
                    if (zL) {
                        rg1Var.M.c();
                        rg1Var.M.a();
                    }
                }
                if (!hg4Var2.l(i)) {
                    return iJ;
                }
            } else if (!hg4Var2.l(i)) {
                return hg4Var2.o(i);
            }
        }
        return i3;
    }

    public final List A() {
        u80 u80Var = this.b;
        t80 t80VarH = u80Var.h();
        z80 z80Var = t80VarH != null ? (z80) t80VarH : null;
        if (z80Var != null) {
            ig4 ig4Var = z80Var.s;
            hg4 hg4VarD = kg4.d(ig4Var).d();
            try {
                Integer numJ = gh0.j(hg4VarD, u80Var, 0, hg4VarD.c);
                hg4VarD.c();
                if (numJ != null) {
                    hg4 hg4VarD2 = kg4.d(ig4Var).d();
                    try {
                        return q40.G0(gh0.H(hg4VarD2, numJ.intValue(), 0), z80Var.I.A());
                    } finally {
                        hg4VarD2.c();
                    }
                }
            } catch (Throwable th) {
                hg4VarD.c();
                throw th;
            }
        }
        return u01.n;
    }

    public final int B(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    public final Object C(z80 z80Var, z80 z80Var2, Integer num, List list, gf1 gf1Var) {
        Object objInvoke;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                kd3 kd3Var = (kd3) list.get(i2);
                lv3 lv3Var = (lv3) kd3Var.n;
                Object obj = kd3Var.o;
                if (obj != null) {
                    W(lv3Var, obj);
                } else {
                    W(lv3Var, null);
                }
            }
            if (z80Var == null) {
                objInvoke = gf1Var.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (z80Var2 == null || z80Var2 == z80Var || iIntValue < 0) {
                    objInvoke = gf1Var.invoke();
                } else {
                    z80Var.E = z80Var2;
                    z80Var.F = iIntValue;
                    try {
                        objInvoke = gf1Var.invoke();
                        z80Var.E = null;
                        z80Var.F = 0;
                    } catch (Throwable th) {
                        z80Var.E = null;
                        z80Var.F = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = gf1Var.invoke();
                }
            }
            this.F = z;
            this.k = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[LOOP:7: B:37:0x00cb->B:56:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0177
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void D() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg1.D():void");
    }

    public final void E() throws Throwable {
        int i;
        I(this.G.g);
        k80 k80Var = this.M;
        k80Var.d(false);
        o02 o02Var = k80Var.d;
        rg1 rg1Var = k80Var.a;
        hg4 hg4Var = rg1Var.G;
        if (hg4Var.c > 0 && o02Var.a(-2) != (i = hg4Var.i)) {
            if (!k80Var.c && k80Var.e) {
                k80Var.d(false);
                k80Var.b.n.x0(ba3.f);
                k80Var.c = true;
            }
            if (i > 0) {
                mg1 mg1VarA = hg4Var.a(i);
                o02Var.c(i);
                k80Var.d(false);
                ya3 ya3Var = k80Var.b.n;
                ya3Var.x0(aa3.f);
                rr2.R(ya3Var, 0, mg1VarA);
                k80Var.c = true;
            }
        }
        k80Var.b.n.x0(ja3.f);
        int i2 = k80Var.f;
        hg4 hg4Var2 = rg1Var.G;
        k80Var.f = hg4Var2.b[(hg4Var2.g * 5) + 3] + i2;
    }

    public final void F(mf3 mf3Var) {
        i03 i03Var = this.v;
        if (i03Var == null) {
            i03Var = new i03();
            this.v = i03Var;
        }
        i03Var.i(this.G.g, mf3Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void G(int i, int i2, int i3) {
        hg4 hg4Var = this.G;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (hg4Var.q(i) == i2) {
                i3 = i2;
            } else if (hg4Var.q(i2) == i) {
                i3 = i;
            } else if (hg4Var.q(i) == hg4Var.q(i2)) {
                i3 = hg4Var.q(i);
            } else {
                int iQ = i;
                int i4 = 0;
                while (iQ > 0 && iQ != i3) {
                    iQ = hg4Var.q(iQ);
                    i4++;
                }
                int iQ2 = i2;
                int i5 = 0;
                while (iQ2 > 0 && iQ2 != i3) {
                    iQ2 = hg4Var.q(iQ2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iQ3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iQ3 = hg4Var.q(iQ3);
                }
                int i8 = i5 - i4;
                int iQ4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iQ4 = hg4Var.q(iQ4);
                }
                i3 = iQ3;
                for (int iQ5 = iQ4; i3 != iQ5; iQ5 = hg4Var.q(iQ5)) {
                    i3 = hg4Var.q(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (hg4Var.l(i)) {
                this.M.a();
            }
            i = hg4Var.q(i);
        }
        n(i2, i3);
    }

    public final Object H() {
        boolean z = this.S;
        i80 i80Var = j80.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof a24)) {
                return objM instanceof wg1 ? ((wg1) objM).a : objM;
            }
        } else if (this.r) {
            l80.a("A call to createNode(), emitNode() or useNode() expected");
            return i80Var;
        }
        return i80Var;
    }

    public final void I(int i) throws Throwable {
        boolean zL = this.G.l(i);
        k80 k80Var = this.M;
        if (zL) {
            k80Var.c();
            Object objN = this.G.n(i);
            k80Var.c();
            k80Var.h.add(objN);
        }
        J(this, i, zL, 0);
        k80Var.c();
        if (zL) {
            k80Var.a();
        }
    }

    public final boolean K(int i, boolean z) {
        lv3 lv3VarU;
        if ((i & 1) == 0 && (this.S || this.y)) {
            md4 md4Var = this.P;
            if (md4Var != null && (lv3VarU = u()) != null && md4Var.b()) {
                int i2 = lv3VarU.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                lv3VarU.b = i3;
                lv3VarU.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                ya3 ya3Var = this.M.b.n;
                ya3Var.x0(ia3.f);
                rr2.R(ya3Var, 0, lv3VarU);
                this.b.q(lv3VarU);
                return false;
            }
        } else if (!z && w()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    public final void L() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        hg4 hg4Var = this.G;
        int iG = hg4Var.g();
        int[] iArr = hg4Var.b;
        int i = hg4Var.g;
        Object objP = i < hg4Var.h ? hg4Var.p(iArr, i) : null;
        Object objF = hg4Var.f();
        int i2 = this.m;
        i80 i80Var = j80.a;
        if (objP == null) {
            if (objF == null || iG != 207 || objF.equals(i80Var)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
            }
            Q(null, (iArr[(hg4Var.g * 5) + 1] & 1073741824) != 0);
            D();
            hg4Var.e();
            if (objP != null) {
                if (objP instanceof Enum) {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                }
            }
            if (objF == null && iG == 207 && !objF.equals(i80Var)) {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                return;
            } else {
                this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        this.T = jRotateLeft;
        Q(null, (iArr[(hg4Var.g * 5) + 1] & 1073741824) != 0);
        D();
        hg4Var.e();
        if (objP != null) {
            if (objF == null) {
            }
            this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
        } else if (objP instanceof Enum) {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
        } else {
            this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
        }
    }

    public final void M() {
        hg4 hg4Var = this.G;
        int i = hg4Var.i;
        this.l = i >= 0 ? hg4Var.b[(i * 5) + 1] & 67108863 : 0;
        hg4Var.t();
    }

    public final void N() {
        if (this.l != 0) {
            l80.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        lv3 lv3VarU = u();
        if (lv3VarU != null) {
            int i = lv3VarU.b;
            if ((i & 128) == 0) {
                lv3VarU.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            M();
        } else {
            D();
        }
    }

    /* JADX WARN: Code duplicated, block: B:169:0x031c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0332  */
    /* JADX WARN: Code duplicated, block: B:175:0x034d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0355 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x0359  */
    /* JADX WARN: Code duplicated, block: B:181:0x0360  */
    /* JADX WARN: Code duplicated, block: B:183:0x0363  */
    /* JADX WARN: Code duplicated, block: B:184:0x0365  */
    /* JADX WARN: Code duplicated, block: B:188:0x0393  */
    /* JADX WARN: Code duplicated, block: B:189:0x0395  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x016b  */
    /* JADX WARN: Code duplicated, block: B:82:0x016f  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x018d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void O(int i, k93 k93Var, int i2, Object obj) {
        long jRotateLeft;
        boolean z;
        boolean z2;
        boolean z3;
        vg1 vg1Var;
        vg1 vg1Var2;
        ArrayList arrayList;
        i03 i03Var;
        int i3;
        Object objValueOf;
        w03 w03Var;
        Object objG;
        q03 q03Var;
        lg4 lg4Var;
        int i4;
        Object obj2;
        int i5;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        int i9;
        hg4 hg4Var;
        int[] iArr;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        hg4 hg4Var2;
        int i13;
        Object objP;
        lg4 lg4Var2;
        int i14;
        Object obj3;
        Object obj4;
        vg1 vg1Var3;
        k93 k93Var2 = k93Var;
        if (this.r) {
            l80.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.m;
        Object obj5 = j80.a;
        if (k93Var2 == null) {
            if (obj == null || i != 207 || obj.equals(obj5)) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i15);
            } else {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj.hashCode()), 3) ^ ((long) i15);
            }
            if (k93Var2 == null) {
                this.m++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.S) {
                this.G.k++;
                lg4Var2 = this.I;
                i14 = lg4Var2.t;
                if (z) {
                    obj4 = k93Var2;
                    obj3 = k93Var2;
                    lg4Var2.Q(obj5, obj5, true, i);
                } else if (obj != null) {
                    if (k93Var2 == null) {
                        obj4 = obj5;
                    }
                    lg4Var2.Q(obj4, obj, false, i);
                } else {
                    if (k93Var2 == null) {
                        obj3 = obj5;
                    }
                    lg4Var2.Q(obj3, obj5, false, i);
                }
                vg1Var3 = this.j;
                if (vg1Var3 != null) {
                    int i16 = (-2) - i14;
                    i42 i42Var = new i42(-1, i, i16, -1);
                    vg1Var3.e.i(i16, new hk1(-1, this.k - vg1Var3.b, 0));
                    vg1Var3.d.add(i42Var);
                }
                r(z, null);
                return;
            }
            if (i2 != 1 && this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.j == null) {
                int iG = this.G.g();
                if (!z2 && iG == i) {
                    hg4Var2 = this.G;
                    i13 = hg4Var2.g;
                    if (i13 < hg4Var2.h) {
                        objP = hg4Var2.p(hg4Var2.b, i13);
                    } else {
                        objP = null;
                    }
                    if (h12.c(k93Var2, objP)) {
                        Q(obj, z);
                        z3 = z2;
                    }
                }
                hg4Var = this.G;
                iArr = hg4Var.b;
                arrayList2 = new ArrayList();
                if (hg4Var.k <= 0) {
                    i10 = hg4Var.g;
                    while (i10 < hg4Var.h) {
                        int i17 = i10 * 5;
                        int i18 = iArr[i17];
                        Object objP2 = hg4Var.p(iArr, i10);
                        i11 = iArr[i17 + 1];
                        if ((i11 & 1073741824) != 0) {
                            i12 = 1;
                        } else {
                            i12 = i11 & 67108863;
                        }
                        arrayList2.add(new i42(objP2, i18, i10, i12));
                        i10 += iArr[i17 + 3];
                        z2 = z2;
                    }
                }
                z3 = z2;
                this.j = new vg1(this.k, arrayList2);
            } else {
                z3 = z2;
            }
            vg1Var = this.j;
            if (vg1Var != null) {
                arrayList = vg1Var.d;
                i03Var = vg1Var.e;
                i3 = vg1Var.b;
                if (k93Var2 != null) {
                    objValueOf = new b32(Integer.valueOf(i), k93Var2);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                w03Var = ((mz2) vg1Var.f.getValue()).a;
                objG = w03Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof q03) {
                    q03Var = (q03) objG;
                    Object objK = q03Var.k(0);
                    if (q03Var.h()) {
                        w03Var.j(objValueOf);
                    }
                    if (q03Var.b == 1) {
                        w03Var.l(objValueOf, q03Var.e());
                    }
                    objG = objK;
                } else {
                    w03Var.j(objValueOf);
                }
                i42 i42Var2 = (i42) objG;
                if (!z3 || i42Var2 == null) {
                    this.G.k++;
                    this.S = true;
                    this.K = null;
                    if (this.I.w) {
                        lg4 lg4VarE = this.H.e();
                        this.I = lg4VarE;
                        lg4VarE.M();
                        this.J = false;
                        this.K = null;
                    }
                    this.I.d();
                    lg4Var = this.I;
                    int i19 = lg4Var.t;
                    if (z) {
                        lg4Var.Q(obj5, obj5, true, i);
                        i4 = 0;
                    } else if (obj != null) {
                        if (k93Var != null) {
                            obj5 = k93Var;
                        }
                        i4 = 0;
                        lg4Var.Q(obj5, obj, false, i);
                    } else {
                        i4 = 0;
                        if (k93Var == null) {
                            obj2 = obj5;
                        } else {
                            obj2 = k93Var;
                        }
                        lg4Var.Q(obj2, obj5, false, i);
                    }
                    this.N = this.I.b(i19);
                    int i20 = (-2) - i19;
                    i42 i42Var3 = new i42(-1, i, i20, -1);
                    i03Var.i(i20, new hk1(-1, this.k - i3, i4));
                    arrayList.add(i42Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.k;
                    }
                    vg1Var2 = new vg1(i5, arrayList3);
                } else {
                    int i21 = i42Var2.c;
                    arrayList.add(i42Var2);
                    hk1 hk1Var = (hk1) i03Var.b(i21);
                    this.k = (hk1Var != null ? hk1Var.b : -1) + i3;
                    hk1 hk1Var2 = (hk1) i03Var.b(i21);
                    int i22 = hk1Var2 != null ? hk1Var2.a : -1;
                    int i23 = vg1Var.c;
                    int i24 = i22 - i23;
                    int i25 = 8;
                    if (i22 <= i23) {
                        i6 = i24;
                        if (i23 > i22) {
                            Object[] objArr3 = i03Var.c;
                            long[] jArr = i03Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i26 = 0;
                                while (true) {
                                    long j = jArr[i26];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j & 255) >= 128) {
                                                objArr2 = objArr3;
                                            } else {
                                                hk1 hk1Var3 = (hk1) objArr3[(i26 << 3) + i28];
                                                int i29 = hk1Var3.a;
                                                if (i29 == i22) {
                                                    hk1Var3.a = i23;
                                                    objArr2 = objArr3;
                                                } else {
                                                    objArr2 = objArr3;
                                                    if (i22 + 1 <= i29 && i29 < i23) {
                                                        hk1Var3.a = i29 - 1;
                                                    }
                                                }
                                            }
                                            j >>= 8;
                                            i28++;
                                            objArr3 = objArr2;
                                        }
                                        objArr = objArr3;
                                        if (i27 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr = objArr3;
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = i03Var.c;
                        long[] jArr2 = i03Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i30 = 0;
                            while (true) {
                                long j2 = jArr2[i30];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                    int i32 = 0;
                                    while (i32 < i31) {
                                        if ((j2 & 255) < 128) {
                                            i9 = i25;
                                            hk1 hk1Var4 = (hk1) objArr4[(i30 << 3) + i32];
                                            i8 = i24;
                                            int i33 = hk1Var4.a;
                                            if (i33 == i22) {
                                                hk1Var4.a = i23;
                                            } else if (i23 <= i33 && i33 < i22) {
                                                hk1Var4.a = i33 + 1;
                                            }
                                        } else {
                                            i8 = i24;
                                            i9 = i25;
                                        }
                                        j2 >>= i9;
                                        i32++;
                                        i24 = i8;
                                        i25 = i9;
                                    }
                                    i6 = i24;
                                    if (i31 != i25) {
                                        break;
                                    }
                                } else {
                                    i6 = i24;
                                }
                                if (i30 == length2) {
                                    break;
                                }
                                i30++;
                                i24 = i6;
                                i25 = 8;
                            }
                        } else {
                            i6 = i24;
                        }
                    }
                    k80 k80Var = this.M;
                    int i34 = k80Var.f;
                    rg1 rg1Var = k80Var.a;
                    k80Var.f = (i21 - rg1Var.G.g) + i34;
                    this.G.r(i21);
                    if (i6 > 0) {
                        k80Var.d(false);
                        o02 o02Var = k80Var.d;
                        hg4 hg4Var3 = rg1Var.G;
                        if (hg4Var3.c > 0 && o02Var.a(-2) != (i7 = hg4Var3.i)) {
                            if (!k80Var.c && k80Var.e) {
                                k80Var.d(false);
                                k80Var.b.n.x0(ba3.f);
                                k80Var.c = true;
                            }
                            if (i7 > 0) {
                                mg1 mg1VarA = hg4Var3.a(i7);
                                o02Var.c(i7);
                                k80Var.d(false);
                                ya3 ya3Var = k80Var.b.n;
                                ya3Var.x0(aa3.f);
                                rr2.R(ya3Var, 0, mg1VarA);
                                k80Var.c = true;
                            }
                        }
                        ya3 ya3Var2 = k80Var.b.n;
                        ya3Var2.x0(fa3.f);
                        ya3Var2.f[ya3Var2.g - ya3Var2.d[ya3Var2.e - 1].b] = i6;
                    }
                    Q(obj, z);
                    vg1Var2 = null;
                }
            } else {
                vg1Var2 = null;
            }
            r(z, vg1Var2);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) k93Var2.a.hashCode()), 3);
        this.T = jRotateLeft;
        if (k93Var2 == null) {
            this.m++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.S) {
            this.G.k++;
            lg4Var2 = this.I;
            i14 = lg4Var2.t;
            if (z) {
                obj4 = k93Var2;
                obj3 = k93Var2;
                lg4Var2.Q(obj5, obj5, true, i);
            } else if (obj != null) {
                if (k93Var2 == null) {
                    obj4 = obj5;
                }
                lg4Var2.Q(obj4, obj, false, i);
            } else {
                if (k93Var2 == null) {
                    obj3 = obj5;
                }
                lg4Var2.Q(obj3, obj5, false, i);
            }
            vg1Var3 = this.j;
            if (vg1Var3 != null) {
                int i110 = (-2) - i14;
                i42 i42Var4 = new i42(-1, i, i110, -1);
                vg1Var3.e.i(i110, new hk1(-1, this.k - vg1Var3.b, 0));
                vg1Var3.d.add(i42Var4);
            }
            r(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.j == null) {
            int iG2 = this.G.g();
            if (!z2) {
                hg4Var2 = this.G;
                i13 = hg4Var2.g;
                if (i13 < hg4Var2.h) {
                    objP = hg4Var2.p(hg4Var2.b, i13);
                } else {
                    objP = null;
                }
                if (h12.c(k93Var2, objP)) {
                    Q(obj, z);
                    z3 = z2;
                }
            }
            hg4Var = this.G;
            iArr = hg4Var.b;
            arrayList2 = new ArrayList();
            if (hg4Var.k <= 0) {
                i10 = hg4Var.g;
                while (i10 < hg4Var.h) {
                    int i111 = i10 * 5;
                    int i112 = iArr[i111];
                    Object objP3 = hg4Var.p(iArr, i10);
                    i11 = iArr[i111 + 1];
                    if ((i11 & 1073741824) != 0) {
                        i12 = 1;
                    } else {
                        i12 = i11 & 67108863;
                    }
                    arrayList2.add(new i42(objP3, i112, i10, i12));
                    i10 += iArr[i111 + 3];
                    z2 = z2;
                }
            }
            z3 = z2;
            this.j = new vg1(this.k, arrayList2);
        } else {
            z3 = z2;
        }
        vg1Var = this.j;
        if (vg1Var != null) {
            arrayList = vg1Var.d;
            i03Var = vg1Var.e;
            i3 = vg1Var.b;
            if (k93Var2 != null) {
                objValueOf = new b32(Integer.valueOf(i), k93Var2);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            w03Var = ((mz2) vg1Var.f.getValue()).a;
            objG = w03Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof q03) {
                q03Var = (q03) objG;
                Object objK2 = q03Var.k(0);
                if (q03Var.h()) {
                    w03Var.j(objValueOf);
                }
                if (q03Var.b == 1) {
                    w03Var.l(objValueOf, q03Var.e());
                }
                objG = objK2;
            } else {
                w03Var.j(objValueOf);
            }
            i42 i42Var5 = (i42) objG;
            if (z3) {
            }
            this.G.k++;
            this.S = true;
            this.K = null;
            if (this.I.w) {
                lg4 lg4VarE2 = this.H.e();
                this.I = lg4VarE2;
                lg4VarE2.M();
                this.J = false;
                this.K = null;
            }
            this.I.d();
            lg4Var = this.I;
            int i113 = lg4Var.t;
            if (z) {
                lg4Var.Q(obj5, obj5, true, i);
                i4 = 0;
            } else if (obj != null) {
                if (k93Var != null) {
                    obj5 = k93Var;
                }
                i4 = 0;
                lg4Var.Q(obj5, obj, false, i);
            } else {
                i4 = 0;
                if (k93Var == null) {
                    obj2 = obj5;
                } else {
                    obj2 = k93Var;
                }
                lg4Var.Q(obj2, obj5, false, i);
            }
            this.N = this.I.b(i113);
            int i210 = (-2) - i113;
            i42 i42Var6 = new i42(-1, i, i210, -1);
            i03Var.i(i210, new hk1(-1, this.k - i3, i4));
            arrayList.add(i42Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.k;
            }
            vg1Var2 = new vg1(i5, arrayList4);
        } else {
            vg1Var2 = null;
        }
        r(z, vg1Var2);
    }

    public final void P(int i, k93 k93Var) {
        O(i, k93Var, 0, null);
    }

    public final void Q(Object obj, boolean z) {
        if (z) {
            hg4 hg4Var = this.G;
            if (hg4Var.k <= 0) {
                if ((hg4Var.b[(hg4Var.g * 5) + 1] & 1073741824) == 0) {
                    oo3.a("Expected a node group");
                }
                hg4Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            k80 k80Var = this.M;
            k80Var.getClass();
            k80Var.d(false);
            ya3 ya3Var = k80Var.b.n;
            ya3Var.x0(sa3.f);
            rr2.R(ya3Var, 0, obj);
        }
        this.G.u();
    }

    public final void R(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            O(i, null, 0, null);
            return;
        }
        if (this.r) {
            l80.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        hg4 hg4Var = this.G;
        boolean z = this.S;
        i80 i80Var = j80.a;
        if (z) {
            hg4Var.k++;
            this.I.Q(i80Var, i80Var, false, i);
            r(false, null);
            return;
        }
        if (hg4Var.g() == i && ((i3 = hg4Var.g) >= hg4Var.h || (hg4Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            hg4Var.u();
            r(false, null);
            return;
        }
        if (hg4Var.k <= 0 && (i2 = hg4Var.g) != hg4Var.h) {
            int i4 = this.k;
            E();
            this.M.e(i4, hg4Var.s());
            si0.i(i2, hg4Var.g, this.s);
        }
        hg4Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            lg4 lg4VarE = this.H.e();
            this.I = lg4VarE;
            lg4VarE.M();
            this.J = false;
            this.K = null;
        }
        lg4 lg4Var = this.I;
        lg4Var.d();
        int i5 = lg4Var.t;
        lg4Var.Q(i80Var, i80Var, false, i);
        this.N = lg4Var.b(i5);
        r(false, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final rg1 S(int i) {
        lv3 lv3Var;
        boolean z;
        R(i);
        boolean z2 = this.S;
        zg5 zg5Var = this.g;
        ArrayList arrayList = this.E;
        z80 z80Var = this.h;
        if (z2) {
            lv3 lv3Var2 = new lv3(z80Var);
            arrayList.add(lv3Var2);
            c0(lv3Var2);
            lv3Var2.e = this.B;
            lv3Var2.b &= -17;
            zg5Var.r();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iT = si0.t(arrayList2, i2);
        o12 o12Var = iT >= 0 ? (o12) arrayList2.remove(iT) : null;
        Object objM = this.G.m();
        if (h12.c(objM, j80.a)) {
            lv3Var = new lv3(z80Var);
            c0(lv3Var);
        } else {
            objM.getClass();
            lv3Var = (lv3) objM;
        }
        if (o12Var == null) {
            int i3 = lv3Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                lv3Var.b = i3 & (-65);
            }
            if (z3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        int i4 = lv3Var.b;
        lv3Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(lv3Var);
        lv3Var.e = this.B;
        lv3Var.b &= -17;
        zg5Var.r();
        int i5 = lv3Var.b;
        if ((i5 & 256) != 0) {
            lv3Var.b = (i5 & (-257)) | 512;
            ya3 ya3Var = this.M.b.n;
            ya3Var.x0(oa3.f);
            rr2.R(ya3Var, 0, lv3Var);
            if (!this.y) {
                int i6 = lv3Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    lv3Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    public final void T(Object obj) {
        if (!this.S && this.G.g() == 207 && !h12.c(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        O(207, null, 0, obj);
    }

    public final void U() {
        O(125, null, 2, null);
        this.r = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void V() {
        this.m = 0;
        this.G = this.c.d();
        O(100, null, 0, null);
        u80 u80Var = this.b;
        u80Var.t();
        mf3 mf3VarI = u80Var.i();
        this.x.c(this.w ? 1 : 0);
        this.w = e(mf3VarI);
        this.K = null;
        if (!this.q) {
            this.q = u80Var.e();
        }
        if (!this.C) {
            this.C = u80Var.f();
        }
        if (this.C) {
            wl4 wl4Var = y80.a;
            wl4Var.getClass();
            mf3VarI = mf3VarI.b(wl4Var, new xl4(v()));
        }
        this.u = mf3VarI;
        Set set = (Set) vr1.C(mf3VarI, yz1.a);
        if (set != null) {
            set.add(t());
            u80Var.o(set);
        }
        O(Long.hashCode(u80Var.g()), null, 0, null);
    }

    public final boolean W(lv3 lv3Var, Object obj) {
        mg1 mg1Var = lv3Var.c;
        if (mg1Var == null) {
            return false;
        }
        int iA = this.G.a.a(fh0.d(mg1Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iT = si0.t(arrayList, iA);
        if (iT < 0) {
            int i = -(iT + 1);
            if (!(obj instanceof dp0)) {
                obj = null;
            }
            arrayList.add(i, new o12(lv3Var, iA, obj));
            return true;
        }
        o12 o12Var = (o12) arrayList.get(iT);
        if (!(obj instanceof dp0)) {
            o12Var.c = null;
            return true;
        }
        Object obj2 = o12Var.c;
        if (obj2 == null) {
            o12Var.c = obj;
            return true;
        }
        if (obj2 instanceof x03) {
            ((x03) obj2).a(obj);
            return true;
        }
        x03 x03Var = w54.a;
        x03 x03Var2 = new x03(2);
        x03Var2.k(obj2);
        x03Var2.k(obj);
        o12Var.c = x03Var2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:20:0x0043->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[EDGE_INSN: B:43:0x0096->B:36:0x0096 BREAK  A[LOOP:1: B:20:0x0043->B:35:0x0093], SYNTHETIC] */
    public final void X(w03 w03Var) {
        ArrayList arrayList = this.s;
        for (int iE = gb.E(arrayList); -1 < iE; iE--) {
            o12 o12Var = (o12) arrayList.get(iE);
            mg1 mg1Var = o12Var.a.c;
            mg1 mg1VarD = mg1Var != null ? fh0.d(mg1Var) : null;
            if (mg1VarD == null || !mg1VarD.a()) {
                arrayList.remove(iE);
            } else {
                int i = o12Var.b;
                int i2 = mg1VarD.a;
                if (i != i2) {
                    o12Var.b = i2;
                }
            }
        }
        Object[] objArr = w03Var.b;
        Object[] objArr2 = w03Var.c;
        long[] jArr = w03Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            lv3 lv3Var = (lv3) obj;
                            mg1 mg1Var2 = lv3Var.c;
                            if (mg1Var2 != null) {
                                int i7 = fh0.d(mg1Var2).a;
                                if (obj2 == rv2.B) {
                                    obj2 = null;
                                }
                                arrayList.add(new o12(lv3Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        u40.m0(arrayList, si0.b);
    }

    public final void Y(int i, int i2) {
        if (d0(i) != i2) {
            if (i < 0) {
                g03 g03Var = this.p;
                if (g03Var == null) {
                    g03Var = new g03();
                    this.p = g03Var;
                }
                g03Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void Z(int i, int i2) {
        int iD0 = d0(i);
        if (iD0 != i2) {
            int i3 = i2 - iD0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iD1 = d0(i) + i3;
                Y(i, iD1);
                for (int i4 = size; -1 < i4; i4--) {
                    vg1 vg1Var = (vg1) arrayList.get(i4);
                    if (vg1Var != null && vg1Var.a(i, iD1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                hg4 hg4Var = this.G;
                if (i < 0) {
                    i = hg4Var.i;
                } else if (hg4Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void a() {
        h();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        p71 p71Var = this.O;
        p71Var.e.u0();
        p71Var.d.u0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        hg4 hg4Var = this.G;
        if (!hg4Var.f) {
            hg4Var.c();
        }
        if (this.I.w) {
            return;
        }
        s();
    }

    public final mf3 a0(mf3 mf3Var, mf3 mf3Var2) {
        mf3Var.getClass();
        lf3 lf3Var = new lf3(mf3Var);
        lf3Var.putAll(mf3Var2);
        mf3 mf3VarA = lf3Var.a();
        P(204, l80.d);
        z();
        c0(mf3VarA);
        z();
        c0(mf3Var2);
        o(false);
        return mf3VarA;
    }

    public final void b(wf1 wf1Var, Object obj) {
        if (this.S) {
            ya3 ya3Var = this.O.d;
            ya3Var.x0(ta3.f);
            rr2.R(ya3Var, 0, obj);
            jz4.j(2, wf1Var);
            rr2.R(ya3Var, 1, wf1Var);
            return;
        }
        k80 k80Var = this.M;
        k80Var.b();
        ya3 ya3Var2 = k80Var.b.n;
        ya3Var2.x0(ta3.f);
        jz4.j(2, wf1Var);
        rr2.S(ya3Var2, 0, obj, 1, wf1Var);
    }

    public final void b0(Object obj) {
        if (obj instanceof vy3) {
            wg1 wg1Var = new wg1((vy3) obj, this.m - 1);
            if (this.S) {
                ya3 ya3Var = this.M.b.n;
                ya3Var.x0(ha3.f);
                rr2.R(ya3Var, 0, wg1Var);
            }
            this.d.add(obj);
            obj = wg1Var;
        }
        c0(obj);
    }

    public final boolean c(float f) {
        Object objZ = z();
        if ((objZ instanceof Float) && f == ((Number) objZ).floatValue()) {
            return false;
        }
        c0(Float.valueOf(f));
        return true;
    }

    public final void c0(Object obj) {
        if (this.S) {
            lg4 lg4Var = this.I;
            if (lg4Var.n <= 0 || lg4Var.i == lg4Var.k) {
                lg4Var.F(obj);
                return;
            }
            i03 i03Var = lg4Var.s;
            if (i03Var == null) {
                i03Var = new i03();
            }
            lg4Var.s = i03Var;
            int i = lg4Var.v;
            Object objB = i03Var.b(i);
            if (objB == null) {
                objB = new q03();
                i03Var.i(i, objB);
            }
            ((q03) objB).a(obj);
            return;
        }
        hg4 hg4Var = this.G;
        boolean z = hg4Var.n;
        k80 k80Var = this.M;
        if (!z) {
            mg1 mg1VarA = hg4Var.a(hg4Var.i);
            ya3 ya3Var = k80Var.b.n;
            ya3Var.x0(p93.f);
            rr2.S(ya3Var, 0, mg1VarA, 1, obj);
            return;
        }
        int iB = (hg4Var.l - kg4.b(hg4Var.b, hg4Var.i)) - 1;
        if (k80Var.a.G.i - k80Var.f >= 0) {
            k80Var.d(true);
            ya3 ya3Var2 = k80Var.b.n;
            ya3Var2.x0(ca3.j);
            rr2.R(ya3Var2, 0, obj);
            ya3Var2.f[ya3Var2.g - ya3Var2.d[ya3Var2.e - 1].b] = iB;
            return;
        }
        hg4 hg4Var2 = this.G;
        mg1 mg1VarA2 = hg4Var2.a(hg4Var2.i);
        ya3 ya3Var3 = k80Var.b.n;
        ya3Var3.x0(ca3.i);
        rr2.S(ya3Var3, 0, obj, 1, mg1VarA2);
        ya3Var3.f[ya3Var3.g - ya3Var3.d[ya3Var3.e - 1].b] = iB;
    }

    public final boolean d(int i) {
        Object objZ = z();
        if ((objZ instanceof Integer) && i == ((Number) objZ).intValue()) {
            return false;
        }
        c0(Integer.valueOf(i));
        return true;
    }

    public final int d0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        g03 g03Var = this.p;
        if (g03Var != null && g03Var.c(i) >= 0) {
            int iC = g03Var.c(i);
            if (iC >= 0) {
                return g03Var.c[iC];
            }
            kf2.m(f34.f(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final boolean e(Object obj) {
        if (h12.c(z(), obj)) {
            return false;
        }
        c0(obj);
        return true;
    }

    public final void e0() {
        if (!this.r) {
            l80.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            l80.a("useNode() called while inserting");
        }
        hg4 hg4Var = this.G;
        Object objN = hg4Var.n(hg4Var.i);
        k80 k80Var = this.M;
        k80Var.c();
        k80Var.h.add(objN);
        if (this.y && (objN instanceof u70)) {
            k80Var.b();
            k80Var.b.n.x0(va3.f);
        }
    }

    public final boolean f(boolean z) {
        Object objZ = z();
        if ((objZ instanceof Boolean) && z == ((Boolean) objZ).booleanValue()) {
            return false;
        }
        c0(Boolean.valueOf(z));
        return true;
    }

    public final boolean g(Object obj) {
        if (z() == obj) {
            return false;
        }
        c0(obj);
        return true;
    }

    public final void h() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        k80 k80Var = this.M;
        k80Var.c = false;
        k80Var.d.b = 0;
        k80Var.f = 0;
        k80Var.e = true;
        k80Var.g = 0;
        k80Var.h.clear();
        k80Var.i = -1;
        k80Var.j = -1;
        k80Var.k = -1;
        k80Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final Object i(qr3 qr3Var) {
        return vr1.C(k(), qr3Var);
    }

    public final void j() {
        if (!this.r) {
            l80.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            l80.a("createNode() can only be called when inserting");
        }
        o02 o02Var = this.n;
        int i = o02Var.a[o02Var.b - 1];
        lg4 lg4Var = this.I;
        mg1 mg1VarB = lg4Var.b(lg4Var.v);
        this.l++;
        p71 p71Var = this.O;
        ya3 ya3Var = p71Var.d;
        ya3Var.x0(ca3.g);
        rr2.R(ya3Var, 0, c72.b0);
        ya3Var.f[ya3Var.g - ya3Var.d[ya3Var.e - 1].b] = i;
        rr2.R(ya3Var, 1, mg1VarB);
        ya3 ya3Var2 = p71Var.e;
        ya3Var2.x0(ca3.h);
        ya3Var2.f[ya3Var2.g - ya3Var2.d[ya3Var2.e - 1].b] = i;
        rr2.R(ya3Var2, 0, mg1VarB);
    }

    public final mf3 k() {
        mf3 mf3Var;
        mf3 mf3Var2 = this.K;
        if (mf3Var2 != null) {
            return mf3Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        k93 k93Var = l80.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && h12.c(this.I.t(iE), k93Var)) {
                    Object objQ = this.I.q(iE);
                    objQ.getClass();
                    mf3 mf3Var3 = (mf3) objQ;
                    this.K = mf3Var3;
                    return mf3Var3;
                }
                lg4 lg4Var = this.I;
                iE = lg4Var.E(lg4Var.b, iE);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    hg4 hg4Var = this.G;
                    if (h12.c(hg4Var.p(hg4Var.b, iQ), k93Var)) {
                        i03 i03Var = this.v;
                        if (i03Var == null || (mf3Var = (mf3) i03Var.b(iQ)) == null) {
                            hg4 hg4Var2 = this.G;
                            Object objB = hg4Var2.b(hg4Var2.b, iQ);
                            objB.getClass();
                            mf3Var = (mf3) objB;
                        }
                        this.K = mf3Var;
                        return mf3Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        mf3 mf3Var4 = this.u;
        this.K = mf3Var4;
        return mf3Var4;
    }

    public final c80 l() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        qb2 qb2VarR = gb.r();
        lg4 lg4Var = this.I;
        qb2VarR.addAll(gh0.d(lg4Var, null, lg4Var.t, null));
        hg4 hg4Var = this.G;
        boolean z = hg4Var.f;
        int[] iArr = hg4Var.b;
        if (z || hg4Var.c == 0) {
            collection = u01.n;
        } else {
            tu3 tu3Var = new tu3(hg4Var);
            int iQ = hg4Var.i;
            Object objValueOf = Integer.valueOf(hg4Var.l - kg4.b(iArr, iQ));
            while (iQ >= 0) {
                tu3Var.l(hg4Var.i(iQ), hg4Var.k(iQ) ? hg4Var.p(iArr, iQ) : j80.a, hg4Var.a.g(iQ), objValueOf);
                objValueOf = hg4Var.a(iQ);
                iQ = hg4Var.q(iQ);
            }
            collection = (ArrayList) tu3Var.a;
        }
        qb2VarR.addAll(collection);
        qb2VarR.addAll(A());
        return new c80(gb.f(qb2VarR), this.C);
    }

    public final void m(w03 w03Var, wf1 wf1Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            l80.a("Reentrant composition is not supported");
        }
        this.g.r();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(jh4.j().g());
            this.v = null;
            X(w03Var);
            this.k = 0;
            this.F = true;
            try {
                V();
                Object objZ = z();
                if (objZ != wf1Var && wf1Var != null) {
                    c0(wf1Var);
                }
                qg1 qg1Var = this.D;
                f13 f13VarN = uc5.n();
                try {
                    f13VarN.b(qg1Var);
                    k93 k93Var = l80.a;
                    if (wf1Var != null) {
                        P(200, k93Var);
                        vr1.y(this, wf1Var);
                        o(false);
                    } else if (!this.w || objZ == null || objZ.equals(j80.a)) {
                        L();
                    } else {
                        P(200, k93Var);
                        jz4.j(2, objZ);
                        vr1.y(this, (wf1) objZ);
                        o(false);
                    }
                    f13VarN.k(f13VarN.p - 1);
                    q();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        l80.a("Check failed");
                    }
                    s();
                    Trace.endSection();
                } catch (Throwable th) {
                    f13VarN.k(f13VarN.p - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    si0.T(th2, new ng1(1, this));
                    throw th2;
                } catch (Throwable th3) {
                    this.F = false;
                    arrayList.clear();
                    a();
                    if (!this.I.w) {
                        l80.a("Check failed");
                    }
                    s();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void n(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        n(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            k80 k80Var = this.M;
            k80Var.c();
            k80Var.h.add(objN);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x039a  */
    /* JADX WARN: Code duplicated, block: B:202:0x050c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void o(boolean z) {
        long jRotateRight;
        o02 o02Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        o02 o02Var2;
        int i7;
        x03 x03Var;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        o02 o02Var3 = this.n;
        int i15 = o02Var3.a[o02Var3.b - 2] - 1;
        boolean z2 = this.S;
        i80 i80Var = j80.a;
        if (z2) {
            lg4 lg4Var = this.I;
            int i16 = lg4Var.v;
            int iS = lg4Var.s(i16);
            Object objT = this.I.t(i16);
            Object objQ = this.I.q(i16);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(i80Var)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            hg4 hg4Var = this.G;
            int i17 = hg4Var.i;
            int i18 = hg4Var.i(i17);
            hg4 hg4Var2 = this.G;
            Object objP = hg4Var2.p(hg4Var2.b, i17);
            hg4 hg4Var3 = this.G;
            Object objB = hg4Var3.b(hg4Var3.b, i17);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i18 != 207 || objB.equals(i80Var)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) i18);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i15), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.l;
        vg1 vg1Var = this.j;
        ArrayList arrayList4 = this.s;
        k80 k80Var = this.M;
        if (vg1Var != null) {
            i03 i03Var = vg1Var.e;
            int i20 = vg1Var.b;
            ArrayList arrayList5 = vg1Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = vg1Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList6.get(i21));
                }
                i = -1;
                x03 x03Var2 = w54.a;
                x03 x03Var3 = new x03();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    i42 i42Var = (i42) arrayList5.get(i22);
                    if (hashSet2.contains(i42Var)) {
                        o02Var2 = o02Var3;
                        i7 = i22;
                        if (!x03Var3.c(i42Var)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                i42 i42Var2 = (i42) arrayList6.get(i25);
                                if (i42Var2 != i42Var) {
                                    hk1 hk1Var = (hk1) i03Var.b(i42Var2.c);
                                    int i26 = hk1Var != null ? hk1Var.b : -1;
                                    x03Var3.a(i42Var2);
                                    i10 = i24;
                                    if (i26 != i10) {
                                        hk1 hk1Var2 = (hk1) i03Var.b(i42Var2.c);
                                        int i27 = hk1Var2 != null ? hk1Var2.c : i42Var2.d;
                                        x03Var = x03Var3;
                                        int i28 = i26 + i20;
                                        i8 = size2;
                                        int i29 = i10 + i20;
                                        if (i27 > 0) {
                                            i9 = i20;
                                            int i30 = k80Var.l;
                                            if (i30 > 0) {
                                                arrayList2 = arrayList5;
                                                if (k80Var.j == i28 - i30 && k80Var.k == i29 - i30) {
                                                    k80Var.l = i30 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            k80Var.c();
                                            k80Var.j = i28;
                                            k80Var.k = i29;
                                            k80Var.l = i27;
                                        } else {
                                            i9 = i20;
                                            arrayList2 = arrayList5;
                                            k80Var.getClass();
                                        }
                                        if (i26 <= i10) {
                                            int i31 = i27;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i26) {
                                                Object[] objArr5 = i03Var.c;
                                                long[] jArr5 = i03Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i32 = 0;
                                                    while (true) {
                                                        long j = jArr5[i32];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i33 = 8 - ((~(i32 - length)) >>> 31);
                                                            int i34 = 0;
                                                            while (i34 < i33) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    hk1 hk1Var3 = (hk1) objArr5[(i32 << 3) + i34];
                                                                    jArr2 = jArr5;
                                                                    int i35 = hk1Var3.b;
                                                                    i13 = i26;
                                                                    if (i26 <= i35 && i35 < i13 + i31) {
                                                                        hk1Var3.b = (i35 - i13) + i10;
                                                                    } else if (i13 + 1 <= i35 && i35 < i10) {
                                                                        hk1Var3.b = i35 - i31;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i26;
                                                                }
                                                                j >>= 8;
                                                                i34++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i26 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                            if (i33 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i26;
                                                        }
                                                        if (i32 == length) {
                                                            break;
                                                        }
                                                        i32++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i26 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = i03Var.c;
                                            long[] jArr6 = i03Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i36 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i36];
                                                    int i37 = i27;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i38 = 8 - ((~(i36 - length2)) >>> 31);
                                                        int i39 = 0;
                                                        while (i39 < i38) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i39;
                                                                hk1 hk1Var4 = (hk1) objArr6[(i36 << 3) + i39];
                                                                objArr4 = objArr6;
                                                                int i40 = hk1Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i26 <= i40 && i40 < i26 + i37) {
                                                                    hk1Var4.b = (i40 - i26) + i10;
                                                                } else if (i10 <= i40 && i40 < i26) {
                                                                    hk1Var4.b = i40 + i37;
                                                                }
                                                            } else {
                                                                i14 = i39;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i39 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i38 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i36 == length2) {
                                                        break;
                                                    }
                                                    i36++;
                                                    arrayList4 = arrayList4;
                                                    i27 = i37;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        x03Var = x03Var3;
                                        i8 = size2;
                                        i9 = i20;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    x03Var = x03Var3;
                                    i8 = size2;
                                    i9 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i24;
                                    i11 = i7 + 1;
                                }
                                i23 = i25 + 1;
                                hk1 hk1Var5 = (hk1) i03Var.b(i42Var2.c);
                                int i41 = i10 + (hk1Var5 != null ? hk1Var5.c : i42Var2.d);
                                i22 = i11;
                                vg1Var = vg1Var;
                                x03Var3 = x03Var;
                                size2 = i8;
                                i20 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i24 = i41;
                                o02Var3 = o02Var2;
                            } else {
                                i23 = i25;
                                o02Var3 = o02Var2;
                                i22 = i7;
                            }
                        }
                    } else {
                        o02Var2 = o02Var3;
                        hk1 hk1Var6 = (hk1) i03Var.b(i42Var.c);
                        int i42 = hk1Var6 != null ? hk1Var6.b : -1;
                        int i43 = i42Var.c;
                        i7 = i22;
                        k80Var.e(i42 + i20, i42Var.d);
                        vg1Var.a(i43, 0);
                        k80Var.f = (i43 - k80Var.a.G.g) + k80Var.f;
                        this.G.r(i43);
                        E();
                        this.G.s();
                        si0.i(i43, this.G.b[(i43 * 5) + 3] + i43, arrayList4);
                    }
                    i22 = i7 + 1;
                    o02Var3 = o02Var2;
                }
                o02Var = o02Var3;
                arrayList = arrayList4;
                k80Var.c();
                if (arrayList5.size() > 0) {
                    hg4 hg4Var4 = this.G;
                    k80Var.f = (hg4Var4.h - k80Var.a.G.g) + k80Var.f;
                    hg4Var4.t();
                }
            } else {
                o02Var = o02Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            o02Var = o02Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z3 = this.S;
        if (!z3) {
            hg4 hg4Var5 = this.G;
            int i44 = hg4Var5.m - hg4Var5.l;
            if (i44 > 0) {
                if (i44 > 0) {
                    k80Var.d(false);
                    o02 o02Var4 = k80Var.d;
                    hg4 hg4Var6 = k80Var.a.G;
                    if (hg4Var6.c > 0 && o02Var4.a(-2) != (i6 = hg4Var6.i)) {
                        if (!k80Var.c && k80Var.e) {
                            k80Var.d(false);
                            k80Var.b.n.x0(ba3.f);
                            k80Var.c = true;
                        }
                        if (i6 > 0) {
                            mg1 mg1VarA = hg4Var6.a(i6);
                            o02Var4.c(i6);
                            k80Var.d(false);
                            ya3 ya3Var = k80Var.b.n;
                            ya3Var.x0(aa3.f);
                            rr2.R(ya3Var, 0, mg1VarA);
                            k80Var.c = true;
                        }
                    }
                    ya3 ya3Var2 = k80Var.b.n;
                    ya3Var2.x0(ra3.f);
                    ya3Var2.f[ya3Var2.g - ya3Var2.d[ya3Var2.e - 1].b] = i44;
                } else {
                    k80Var.getClass();
                }
            }
        }
        int i45 = this.k;
        while (true) {
            hg4 hg4Var7 = this.G;
            if (hg4Var7.k > 0 || (i5 = hg4Var7.g) == hg4Var7.h) {
                break;
            }
            E();
            k80Var.e(i45, this.G.s());
            si0.i(i5, this.G.g, arrayList);
        }
        if (z3) {
            if (z) {
                p71 p71Var = this.O;
                ya3 ya3Var3 = p71Var.e;
                if (ya3Var3.e == 0) {
                    l80.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                ya3 ya3Var4 = p71Var.d;
                e22[] e22VarArr = ya3Var3.d;
                int i46 = ya3Var3.e - 1;
                ya3Var3.e = i46;
                e22 e22Var = e22VarArr[i46];
                e22VarArr[i46] = null;
                ya3Var4.x0(e22Var);
                Object[] objArr7 = ya3Var3.h;
                Object[] objArr8 = ya3Var4.h;
                int i47 = ya3Var4.i;
                int i48 = e22Var.c;
                int i49 = ya3Var3.i;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = ya3Var3.h;
                int i51 = ya3Var3.i;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = ya3Var3.f;
                int[] iArr2 = ya3Var4.f;
                int i52 = ya3Var4.g;
                int i53 = e22Var.b;
                int i54 = ya3Var3.g;
                ti.Y(i52 - i53, i54 - i53, i54, iArr, iArr2);
                ya3Var3.i -= i48;
                ya3Var3.g -= i53;
                i19 = 1;
            }
            hg4 hg4Var8 = this.G;
            if (hg4Var8.k <= 0) {
                oo3.a("Unbalanced begin/end empty");
            }
            hg4Var8.k--;
            lg4 lg4Var2 = this.I;
            int i55 = lg4Var2.v;
            lg4Var2.j();
            if (this.G.k <= 0) {
                int i56 = (-2) - i55;
                this.I.k();
                this.I.e(true);
                mg1 mg1Var = this.N;
                boolean zW0 = this.O.d.w0();
                ig4 ig4Var = this.H;
                if (zW0) {
                    k80Var.b();
                    k80Var.d(false);
                    o02 o02Var5 = k80Var.d;
                    hg4 hg4Var9 = k80Var.a.G;
                    if (hg4Var9.c <= 0 || o02Var5.a(-2) == (i4 = hg4Var9.i)) {
                        i3 = 1;
                    } else {
                        if (!k80Var.c && k80Var.e) {
                            k80Var.d(false);
                            k80Var.b.n.x0(ba3.f);
                            k80Var.c = true;
                        }
                        if (i4 > 0) {
                            mg1 mg1VarA2 = hg4Var9.a(i4);
                            o02Var5.c(i4);
                            k80Var.d(false);
                            ya3 ya3Var5 = k80Var.b.n;
                            ya3Var5.x0(aa3.f);
                            rr2.R(ya3Var5, 0, mg1VarA2);
                            i3 = 1;
                            k80Var.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    k80Var.c();
                    ya3 ya3Var6 = k80Var.b.n;
                    ya3Var6.x0(da3.f);
                    rr2.S(ya3Var6, 0, mg1Var, i3, ig4Var);
                    r3 = 0;
                } else {
                    p71 p71Var2 = this.O;
                    k80Var.b();
                    k80Var.d(false);
                    o02 o02Var6 = k80Var.d;
                    hg4 hg4Var10 = k80Var.a.G;
                    if (hg4Var10.c > 0 && o02Var6.a(-2) != (i2 = hg4Var10.i)) {
                        if (!k80Var.c && k80Var.e) {
                            k80Var.d(false);
                            k80Var.b.n.x0(ba3.f);
                            k80Var.c = true;
                        }
                        if (i2 > 0) {
                            mg1 mg1VarA3 = hg4Var10.a(i2);
                            o02Var6.c(i2);
                            k80Var.d(false);
                            ya3 ya3Var7 = k80Var.b.n;
                            ya3Var7.x0(aa3.f);
                            rr2.R(ya3Var7, 0, mg1VarA3);
                            k80Var.c = true;
                        }
                    }
                    k80Var.c();
                    ya3 ya3Var8 = k80Var.b.n;
                    ya3Var8.x0(ea3.f);
                    int i57 = ya3Var8.i - ya3Var8.d[ya3Var8.e - 1].c;
                    Object[] objArr10 = ya3Var8.h;
                    objArr10[i57] = mg1Var;
                    objArr10[i57 + 1] = ig4Var;
                    objArr10[i57 + 2] = p71Var2;
                    this.O = new p71();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.o != 0) {
                    Y(i56, r3);
                    Z(i56, i19);
                }
            }
        } else {
            if (z) {
                k80Var.a();
            }
            int i58 = k80Var.a.G.i;
            o02 o02Var7 = k80Var.d;
            int i59 = i;
            if (o02Var7.a(i59) > i58) {
                l80.a("Missed recording an endGroup");
            }
            if (o02Var7.a(i59) == i58) {
                k80Var.d(false);
                o02Var7.b();
                k80Var.b.n.x0(x93.f);
            }
            int i60 = this.G.i;
            if (i19 != d0(i60)) {
                Z(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.G.e();
            k80Var.c();
        }
        ArrayList arrayList7 = this.i;
        vg1 vg1Var2 = (vg1) arrayList7.remove(arrayList7.size() - 1);
        if (vg1Var2 != null && !z3) {
            vg1Var2.c++;
        }
        this.j = vg1Var2;
        this.k = o02Var.b() + i19;
        this.m = o02Var.b();
        this.l = o02Var.b() + i19;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007f A[LOOP:0: B:15:0x003e->B:27:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[EDGE_INSN: B:28:0x0082->B:29:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0082 A[SYNTHETIC] */
    public final lv3 p() {
        lv3 lv3Var;
        mg1 mg1VarA;
        kv3 kv3Var;
        ArrayList arrayList = this.E;
        lv3 lv3Var2 = !arrayList.isEmpty() ? (lv3) arrayList.remove(arrayList.size() - 1) : null;
        if (lv3Var2 != null) {
            lv3Var2.b &= -9;
            this.g.r();
            int i = this.B;
            p03 p03Var = lv3Var2.f;
            if (p03Var == null || (lv3Var2.b & 16) != 0) {
                kv3Var = null;
                break;
            }
            Object[] objArr = p03Var.b;
            int[] iArr = p03Var.c;
            long[] jArr = p03Var.a;
            int length = jArr.length - 2;
            if (length < 0) {
                kv3Var = null;
                break;
            }
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = objArr[i5];
                            if (iArr[i5] != i) {
                                kv3Var = new kv3(lv3Var2, i, p03Var);
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 == 8) {
                        if (i2 == length) {
                            i2++;
                        }
                    }
                    kv3Var = null;
                    break;
                }
                if (i2 == length) {
                    kv3Var = null;
                    break;
                }
                i2++;
            }
            k80 k80Var = this.M;
            if (kv3Var != null) {
                ya3 ya3Var = k80Var.b.n;
                ya3Var.x0(w93.f);
                rr2.S(ya3Var, 0, kv3Var, 1, this.h);
            }
            int i6 = lv3Var2.b;
            if ((i6 & 512) != 0) {
                lv3Var2.b = i6 & (-513);
                ya3 ya3Var2 = k80Var.b.n;
                ya3Var2.x0(z93.f);
                rr2.R(ya3Var2, 0, lv3Var2);
                int i7 = lv3Var2.b;
                lv3Var2.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    lv3Var2.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (lv3Var2 != null) {
            int i8 = lv3Var2.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (lv3Var2.c == null) {
                    if (this.S) {
                        lg4 lg4Var = this.I;
                        mg1VarA = lg4Var.b(lg4Var.v);
                    } else {
                        hg4 hg4Var = this.G;
                        mg1VarA = hg4Var.a(hg4Var.i);
                    }
                    lv3Var2.c = mg1VarA;
                }
                lv3Var2.b &= -5;
                lv3Var = lv3Var2;
            } else {
                lv3Var = null;
            }
        } else {
            lv3Var = null;
        }
        o(false);
        return lv3Var;
    }

    public final void q() {
        o(false);
        this.b.c();
        o(false);
        k80 k80Var = this.M;
        if (k80Var.c) {
            k80Var.d(false);
            k80Var.d(false);
            k80Var.b.n.x0(x93.f);
            k80Var.c = false;
        }
        k80Var.b();
        if (k80Var.d.b != 0) {
            l80.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            l80.a("Start/end imbalance");
        }
        h();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void r(boolean z, vg1 vg1Var) {
        this.i.add(this.j);
        this.j = vg1Var;
        int i = this.l;
        o02 o02Var = this.n;
        o02Var.c(i);
        o02Var.c(this.m);
        o02Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void s() {
        ig4 ig4Var = new ig4();
        if (this.C) {
            ig4Var.b();
        }
        if (this.b.d()) {
            ig4Var.x = new i03();
        }
        this.H = ig4Var;
        lg4 lg4VarE = ig4Var.e();
        lg4VarE.e(true);
        this.I = lg4VarE;
    }

    public final w80 t() {
        sg1 sg1Var = this.U;
        if (sg1Var != null) {
            return sg1Var;
        }
        sg1 sg1Var2 = new sg1(this.h);
        this.U = sg1Var2;
        return sg1Var2;
    }

    public final lv3 u() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (lv3) arrayList.get(arrayList.size() - 1);
    }

    public final x80 v() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }

    public final boolean w() {
        lv3 lv3VarU;
        return (this.S || this.y || this.w || (lv3VarU = u()) == null || (lv3VarU.b & 8) != 0) ? false : true;
    }

    public final void x(ArrayList arrayList) {
        rg1 rg1Var = this;
        w00 w00Var = rg1Var.f;
        k80 k80Var = rg1Var.M;
        w00 w00Var2 = k80Var.b;
        try {
            k80Var.b = w00Var;
            w00Var.n.x0(la3.f);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                kd3 kd3Var = (kd3) arrayList.get(i);
                jy2 jy2Var = (jy2) kd3Var.n;
                jy2Var.getClass();
                mg1 mg1VarD = fh0.d(null);
                ig4 ig4VarD = kg4.d(null);
                int iA = ig4VarD.a(mg1VarD);
                l02 l02Var = new l02();
                k80Var.b();
                ya3 ya3Var = k80Var.b.n;
                ya3Var.x0(u93.f);
                rr2.S(ya3Var, 0, l02Var, 1, mg1VarD);
                if (ig4VarD == rg1Var.H) {
                    if (!rg1Var.I.w) {
                        l80.a("Check failed");
                    }
                    rg1Var.s();
                }
                hg4 hg4VarD = ig4VarD.d();
                try {
                    hg4VarD.r(iA);
                    k80Var.f = iA;
                    w00 w00Var3 = new w00();
                    rg1Var.C(null, null, null, u01.n, new jo(rg1Var, w00Var3, hg4VarD, jy2Var));
                    w00 w00Var4 = k80Var.b;
                    w00Var4.getClass();
                    if (!w00Var3.n.w0()) {
                        ya3 ya3Var2 = w00Var4.n;
                        ya3Var2.x0(q93.f);
                        rr2.S(ya3Var2, 0, w00Var3, 1, l02Var);
                    }
                    hg4VarD.c();
                    k80Var.b.n.x0(na3.f);
                    i++;
                    rg1Var = this;
                } catch (Throwable th) {
                    hg4VarD.c();
                    throw th;
                }
            }
            k80Var.b();
            k80Var.b.n.x0(y93.f);
            k80Var.f = 0;
            k80Var.b = w00Var2;
        } catch (Throwable th2) {
            k80Var.b = w00Var2;
            throw th2;
        }
    }

    public final void y(mf3 mf3Var, Object obj) {
        O(126665345, null, 0, null);
        z();
        c0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                lg4.z(this.I);
            }
            boolean z = (this.S || h12.c(this.G.f(), mf3Var)) ? false : true;
            if (z) {
                F(mf3Var);
            }
            O(202, l80.c, 0, mf3Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            vr1.y(this, new r70(-59194059, true, new z(4, obj)));
            this.w = z2;
            o(false);
            this.K = null;
            this.T = j;
            o(false);
        } catch (Throwable th) {
            try {
                si0.T(th, new ng1(2, this));
                throw th;
            } catch (Throwable th2) {
                o(false);
                this.K = null;
                this.T = j;
                o(false);
                throw th2;
            }
        }
    }

    public final Object z() {
        boolean z = this.S;
        i80 i80Var = j80.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof a24)) {
                return objM;
            }
        } else if (this.r) {
            l80.a("A call to createNode(), emitNode() or useNode() expected");
            return i80Var;
        }
        return i80Var;
    }
}
