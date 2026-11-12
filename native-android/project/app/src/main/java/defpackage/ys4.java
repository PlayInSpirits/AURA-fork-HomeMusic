package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ys4 extends cx2 implements u62, rv0, g94 {
    public String B;
    public zs4 C;
    public ha1 D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public HashMap I;
    public rd3 J;
    public ws4 K;
    public xs4 L;

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.rv0
    public final void S(e72 e72Var) {
        rd3 rd3VarQ0;
        if (this.A) {
            xs4 xs4Var = this.L;
            if (xs4Var == null) {
                rd3VarQ0 = q0();
            } else {
                if (!xs4Var.c) {
                    xs4Var = null;
                }
                if (xs4Var == null || (rd3VarQ0 = xs4Var.d) == null) {
                    rd3VarQ0 = q0();
                }
            }
            ic icVar = rd3VarQ0.j;
            if (icVar == null) {
                fz1.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.J + ", textSubstitution=" + this.L + ")");
                er1.a();
                return;
            }
            jz jzVarG = e72Var.n.o.g();
            boolean z = rd3VarQ0.k;
            if (z) {
                long j = rd3VarQ0.l;
                jzVarG.e();
                jzVarG.m(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
            }
            try {
                zs4 zs4Var = this.C;
                ij4 ij4Var = zs4Var.a;
                ij4 ij4Var2 = zs4Var.a;
                sr4 sr4Var = ij4Var.m;
                if (sr4Var == null) {
                    sr4Var = sr4.b;
                }
                sr4 sr4Var2 = sr4Var;
                xb4 xb4Var = ij4Var.n;
                if (xb4Var == null) {
                    xb4Var = xb4.d;
                }
                xb4 xb4Var2 = xb4Var;
                q05 q05Var = ij4Var.o;
                if (q05Var == null) {
                    q05Var = c71.d;
                }
                q05 q05Var2 = q05Var;
                uo uoVarF = ij4Var.a.f();
                if (uoVarF != null) {
                    icVar.e(jzVarG, uoVarF, ij4Var2.a.b(), xb4Var2, sr4Var2, q05Var2);
                } else {
                    long jC = x40.g;
                    if (jC == 16) {
                        jC = ij4Var2.a.c() != 16 ? ij4Var2.a.c() : x40.b;
                    }
                    icVar.d(jzVarG, jC, xb4Var2, sr4Var2, q05Var2);
                }
            } finally {
                if (z) {
                    jzVarG.k();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [sf1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ws4] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.g94
    public final void c0(q94 q94Var) {
        ws4 ws4Var = this.K;
        ?? r0 = ws4Var;
        if (ws4Var == null) {
            final int i = 0;
            ?? r1 = new if1(this) { // from class: ws4
                public final /* synthetic */ ys4 o;

                {
                    this.o = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
                @Override // defpackage.if1
                public final Object invoke(Object obj) {
                    oo0 oo0Var;
                    ms4 ms4Var;
                    rd3 rd3Var;
                    int i2;
                    ms4 ms4Var2;
                    wv3 wv3VarF;
                    int iG;
                    ms4 ms4Var3;
                    boolean z;
                    int i3 = i;
                    ys4 ys4Var = this.o;
                    switch (i3) {
                        case 0:
                            List list = (List) obj;
                            rd3 rd3VarQ0 = ys4Var.q0();
                            zs4 zs4VarA = zs4.a(ys4Var.C, x40.g);
                            r62 r62Var = rd3VarQ0.o;
                            if (r62Var == null || (oo0Var = rd3VarQ0.i) == null) {
                                ms4Var = null;
                                ms4Var2 = null;
                            } else {
                                he heVar = new he(rd3VarQ0.a);
                                if (rd3VarQ0.j == null || rd3VarQ0.n == null) {
                                    ms4Var = null;
                                    ms4Var2 = null;
                                } else {
                                    long j = rd3VarQ0.p & (-8589934589L);
                                    int i4 = rd3VarQ0.f;
                                    boolean z2 = rd3VarQ0.e;
                                    int i5 = rd3VarQ0.d;
                                    ha1 ha1Var = rd3VarQ0.c;
                                    u01 u01Var = u01.n;
                                    ls4 ls4Var = new ls4(heVar, zs4VarA, u01Var, i4, z2, i5, oo0Var, r62Var, ha1Var, j);
                                    bq4 bq4Var = new bq4(heVar, zs4VarA, u01Var, oo0Var, ha1Var, z2);
                                    int i6 = rd3VarQ0.f;
                                    int i7 = rd3VarQ0.d;
                                    fd fdVar = new fd();
                                    fdVar.c = bq4Var;
                                    fdVar.a = i6;
                                    if (nc0.j(j) != 0 || nc0.i(j) != 0) {
                                        dz1.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    ArrayList arrayList2 = (ArrayList) bq4Var.q;
                                    int size = arrayList2.size();
                                    float f = 0.0f;
                                    int i8 = 0;
                                    int i9 = 0;
                                    while (true) {
                                        if (i8 < size) {
                                            pd3 pd3Var = (pd3) arrayList2.get(i8);
                                            int i10 = i8;
                                            mc mcVar = pd3Var.a;
                                            int iH = nc0.h(j);
                                            if (nc0.c(j)) {
                                                rd3Var = rd3VarQ0;
                                                iG = nc0.g(j) - ((int) Math.ceil(f));
                                                if (iG < 0) {
                                                    iG = 0;
                                                }
                                            } else {
                                                rd3Var = rd3VarQ0;
                                                iG = nc0.g(j);
                                            }
                                            long jB = qc0.b(iH, iG, 5);
                                            float f2 = f;
                                            int i11 = size;
                                            ic icVar = new ic(mcVar, fdVar.a - i9, i7, jB);
                                            float f3 = f2 + icVar.f;
                                            ks4 ks4Var = icVar.d;
                                            int i12 = i9 + ks4Var.f;
                                            i2 = i12;
                                            arrayList.add(new od3(icVar, pd3Var.b, pd3Var.c, i9, i12, f2, f3));
                                            if (!ks4Var.d && (i2 != fdVar.a || i10 == gb.E((ArrayList) ((bq4) fdVar.c).q))) {
                                                i8 = i10 + 1;
                                                size = i11;
                                                i9 = i2;
                                                f = f3;
                                                rd3VarQ0 = rd3Var;
                                            }
                                        } else {
                                            rd3Var = rd3VarQ0;
                                            i2 = i9;
                                        }
                                    }
                                    fdVar.b = i2;
                                    fdVar.e = arrayList;
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size2 = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        od3 od3Var = (od3) arrayList.get(i13);
                                        List list2 = od3Var.a.g;
                                        ArrayList arrayList4 = new ArrayList(list2.size());
                                        int size3 = list2.size();
                                        int i14 = 0;
                                        while (i14 < size3) {
                                            wv3 wv3Var = (wv3) list2.get(i14);
                                            if (wv3Var != null) {
                                                wv3VarF = wv3Var.f((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(od3Var.f)) & 4294967295L));
                                            } else {
                                                wv3VarF = null;
                                            }
                                            arrayList4.add(wv3VarF);
                                            i14++;
                                            size2 = size2;
                                            i13 = i13;
                                        }
                                        v40.n0(arrayList4, arrayList3);
                                        i13++;
                                    }
                                    if (arrayList3.size() < ((List) ((bq4) fdVar.c).o).size()) {
                                        int size4 = ((List) ((bq4) fdVar.c).o).size() - arrayList3.size();
                                        ArrayList arrayList5 = new ArrayList(size4);
                                        int i15 = 0;
                                        while (true) {
                                            ms4Var2 = null;
                                            if (i15 < size4) {
                                                arrayList5.add(null);
                                                i15++;
                                            } else {
                                                arrayList3 = q40.G0(arrayList3, arrayList5);
                                            }
                                        }
                                    } else {
                                        ms4Var2 = null;
                                    }
                                    fdVar.d = arrayList3;
                                    ms4Var = new ms4(ls4Var, fdVar, rd3Var.l);
                                }
                            }
                            if (ms4Var != null) {
                                list.add(ms4Var);
                                ms4Var3 = ms4Var;
                            } else {
                                ms4Var3 = ms4Var2;
                            }
                            return Boolean.valueOf(ms4Var3 != null);
                        case 1:
                            String str = ((he) obj).o;
                            xs4 xs4Var = ys4Var.L;
                            if (xs4Var == null) {
                                xs4 xs4Var2 = new xs4(ys4Var.B, str);
                                rd3 rd3Var2 = new rd3(str, ys4Var.C, ys4Var.D, ys4Var.E, ys4Var.F, ys4Var.G, ys4Var.H);
                                rd3Var2.c(ys4Var.q0().i);
                                xs4Var2.d = rd3Var2;
                                ys4Var.L = xs4Var2;
                            } else if (!h12.c(str, xs4Var.b)) {
                                xs4Var.b = str;
                                rd3 rd3Var3 = xs4Var.d;
                                if (rd3Var3 != null) {
                                    zs4 zs4Var = ys4Var.C;
                                    ha1 ha1Var2 = ys4Var.D;
                                    int i16 = ys4Var.E;
                                    boolean z3 = ys4Var.F;
                                    int i17 = ys4Var.G;
                                    int i18 = ys4Var.H;
                                    rd3Var3.a = str;
                                    rd3Var3.b = zs4Var;
                                    rd3Var3.c = ha1Var2;
                                    rd3Var3.d = i16;
                                    rd3Var3.e = z3;
                                    rd3Var3.f = i17;
                                    rd3Var3.g = i18;
                                    rd3Var3.q = (rd3Var3.q << 2) | 2;
                                    rd3Var3.b();
                                }
                            }
                            fu.C(ys4Var);
                            g12.A(ys4Var);
                            jz4.z(ys4Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            xs4 xs4Var3 = ys4Var.L;
                            if (xs4Var3 == null) {
                                z = false;
                            } else {
                                xs4Var3.c = zBooleanValue;
                                fu.C(ys4Var);
                                g12.A(ys4Var);
                                jz4.z(ys4Var);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.K = r1;
            r0 = r1;
        }
        he heVar = new he(this.B);
        c42[] c42VarArr = o94.a;
        q94Var.a(n94.z, gb.O(heVar));
        xs4 xs4Var = this.L;
        if (xs4Var != null) {
            boolean z = xs4Var.c;
            p94 p94Var = n94.B;
            c42[] c42VarArr2 = o94.a;
            c42 c42Var = c42VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            p94Var.getClass();
            q94Var.a(p94Var, boolValueOf);
            he heVar2 = new he(xs4Var.b);
            p94 p94Var2 = n94.A;
            c42 c42Var2 = c42VarArr2[16];
            p94Var2.getClass();
            q94Var.a(p94Var2, heVar2);
        }
        final int i2 = 1;
        q94Var.a(d94.l, new w2(null, new if1(this) { // from class: ws4
            public final /* synthetic */ ys4 o;

            {
                this.o = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                oo0 oo0Var;
                ms4 ms4Var;
                rd3 rd3Var;
                int i3;
                ms4 ms4Var2;
                wv3 wv3VarF;
                int iG;
                ms4 ms4Var3;
                boolean z2;
                int i4 = i2;
                ys4 ys4Var = this.o;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        rd3 rd3VarQ0 = ys4Var.q0();
                        zs4 zs4VarA = zs4.a(ys4Var.C, x40.g);
                        r62 r62Var = rd3VarQ0.o;
                        if (r62Var == null || (oo0Var = rd3VarQ0.i) == null) {
                            ms4Var = null;
                            ms4Var2 = null;
                        } else {
                            he heVar3 = new he(rd3VarQ0.a);
                            if (rd3VarQ0.j == null || rd3VarQ0.n == null) {
                                ms4Var = null;
                                ms4Var2 = null;
                            } else {
                                long j = rd3VarQ0.p & (-8589934589L);
                                int i5 = rd3VarQ0.f;
                                boolean z3 = rd3VarQ0.e;
                                int i6 = rd3VarQ0.d;
                                ha1 ha1Var = rd3VarQ0.c;
                                u01 u01Var = u01.n;
                                ls4 ls4Var = new ls4(heVar3, zs4VarA, u01Var, i5, z3, i6, oo0Var, r62Var, ha1Var, j);
                                bq4 bq4Var = new bq4(heVar3, zs4VarA, u01Var, oo0Var, ha1Var, z3);
                                int i7 = rd3VarQ0.f;
                                int i8 = rd3VarQ0.d;
                                fd fdVar = new fd();
                                fdVar.c = bq4Var;
                                fdVar.a = i7;
                                if (nc0.j(j) != 0 || nc0.i(j) != 0) {
                                    dz1.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) bq4Var.q;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i9 = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i9 < size) {
                                        pd3 pd3Var = (pd3) arrayList2.get(i9);
                                        int i11 = i9;
                                        mc mcVar = pd3Var.a;
                                        int iH = nc0.h(j);
                                        if (nc0.c(j)) {
                                            rd3Var = rd3VarQ0;
                                            iG = nc0.g(j) - ((int) Math.ceil(f));
                                            if (iG < 0) {
                                                iG = 0;
                                            }
                                        } else {
                                            rd3Var = rd3VarQ0;
                                            iG = nc0.g(j);
                                        }
                                        long jB = qc0.b(iH, iG, 5);
                                        float f2 = f;
                                        int i12 = size;
                                        ic icVar = new ic(mcVar, fdVar.a - i10, i8, jB);
                                        float f3 = f2 + icVar.f;
                                        ks4 ks4Var = icVar.d;
                                        int i13 = i10 + ks4Var.f;
                                        i3 = i13;
                                        arrayList.add(new od3(icVar, pd3Var.b, pd3Var.c, i10, i13, f2, f3));
                                        if (!ks4Var.d && (i3 != fdVar.a || i11 == gb.E((ArrayList) ((bq4) fdVar.c).q))) {
                                            i9 = i11 + 1;
                                            size = i12;
                                            i10 = i3;
                                            f = f3;
                                            rd3VarQ0 = rd3Var;
                                        }
                                    } else {
                                        rd3Var = rd3VarQ0;
                                        i3 = i10;
                                    }
                                }
                                fdVar.b = i3;
                                fdVar.e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i14 = 0;
                                while (i14 < size2) {
                                    od3 od3Var = (od3) arrayList.get(i14);
                                    List list2 = od3Var.a.g;
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    int i15 = 0;
                                    while (i15 < size3) {
                                        wv3 wv3Var = (wv3) list2.get(i15);
                                        if (wv3Var != null) {
                                            wv3VarF = wv3Var.f((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(od3Var.f)) & 4294967295L));
                                        } else {
                                            wv3VarF = null;
                                        }
                                        arrayList4.add(wv3VarF);
                                        i15++;
                                        size2 = size2;
                                        i14 = i14;
                                    }
                                    v40.n0(arrayList4, arrayList3);
                                    i14++;
                                }
                                if (arrayList3.size() < ((List) ((bq4) fdVar.c).o).size()) {
                                    int size4 = ((List) ((bq4) fdVar.c).o).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    int i16 = 0;
                                    while (true) {
                                        ms4Var2 = null;
                                        if (i16 < size4) {
                                            arrayList5.add(null);
                                            i16++;
                                        } else {
                                            arrayList3 = q40.G0(arrayList3, arrayList5);
                                        }
                                    }
                                } else {
                                    ms4Var2 = null;
                                }
                                fdVar.d = arrayList3;
                                ms4Var = new ms4(ls4Var, fdVar, rd3Var.l);
                            }
                        }
                        if (ms4Var != null) {
                            list.add(ms4Var);
                            ms4Var3 = ms4Var;
                        } else {
                            ms4Var3 = ms4Var2;
                        }
                        return Boolean.valueOf(ms4Var3 != null);
                    case 1:
                        String str = ((he) obj).o;
                        xs4 xs4Var2 = ys4Var.L;
                        if (xs4Var2 == null) {
                            xs4 xs4Var3 = new xs4(ys4Var.B, str);
                            rd3 rd3Var2 = new rd3(str, ys4Var.C, ys4Var.D, ys4Var.E, ys4Var.F, ys4Var.G, ys4Var.H);
                            rd3Var2.c(ys4Var.q0().i);
                            xs4Var3.d = rd3Var2;
                            ys4Var.L = xs4Var3;
                        } else if (!h12.c(str, xs4Var2.b)) {
                            xs4Var2.b = str;
                            rd3 rd3Var3 = xs4Var2.d;
                            if (rd3Var3 != null) {
                                zs4 zs4Var = ys4Var.C;
                                ha1 ha1Var2 = ys4Var.D;
                                int i17 = ys4Var.E;
                                boolean z4 = ys4Var.F;
                                int i18 = ys4Var.G;
                                int i19 = ys4Var.H;
                                rd3Var3.a = str;
                                rd3Var3.b = zs4Var;
                                rd3Var3.c = ha1Var2;
                                rd3Var3.d = i17;
                                rd3Var3.e = z4;
                                rd3Var3.f = i18;
                                rd3Var3.g = i19;
                                rd3Var3.q = (rd3Var3.q << 2) | 2;
                                rd3Var3.b();
                            }
                        }
                        fu.C(ys4Var);
                        g12.A(ys4Var);
                        jz4.z(ys4Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        xs4 xs4Var4 = ys4Var.L;
                        if (xs4Var4 == null) {
                            z2 = false;
                        } else {
                            xs4Var4.c = zBooleanValue;
                            fu.C(ys4Var);
                            g12.A(ys4Var);
                            jz4.z(ys4Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        q94Var.a(d94.m, new w2(null, new if1(this) { // from class: ws4
            public final /* synthetic */ ys4 o;

            {
                this.o = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00ad  */
            @Override // defpackage.if1
            public final Object invoke(Object obj) {
                oo0 oo0Var;
                ms4 ms4Var;
                rd3 rd3Var;
                int i4;
                ms4 ms4Var2;
                wv3 wv3VarF;
                int iG;
                ms4 ms4Var3;
                boolean z2;
                int i5 = i3;
                ys4 ys4Var = this.o;
                switch (i5) {
                    case 0:
                        List list = (List) obj;
                        rd3 rd3VarQ0 = ys4Var.q0();
                        zs4 zs4VarA = zs4.a(ys4Var.C, x40.g);
                        r62 r62Var = rd3VarQ0.o;
                        if (r62Var == null || (oo0Var = rd3VarQ0.i) == null) {
                            ms4Var = null;
                            ms4Var2 = null;
                        } else {
                            he heVar3 = new he(rd3VarQ0.a);
                            if (rd3VarQ0.j == null || rd3VarQ0.n == null) {
                                ms4Var = null;
                                ms4Var2 = null;
                            } else {
                                long j = rd3VarQ0.p & (-8589934589L);
                                int i6 = rd3VarQ0.f;
                                boolean z3 = rd3VarQ0.e;
                                int i7 = rd3VarQ0.d;
                                ha1 ha1Var = rd3VarQ0.c;
                                u01 u01Var = u01.n;
                                ls4 ls4Var = new ls4(heVar3, zs4VarA, u01Var, i6, z3, i7, oo0Var, r62Var, ha1Var, j);
                                bq4 bq4Var = new bq4(heVar3, zs4VarA, u01Var, oo0Var, ha1Var, z3);
                                int i8 = rd3VarQ0.f;
                                int i9 = rd3VarQ0.d;
                                fd fdVar = new fd();
                                fdVar.c = bq4Var;
                                fdVar.a = i8;
                                if (nc0.j(j) != 0 || nc0.i(j) != 0) {
                                    dz1.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
                                }
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = (ArrayList) bq4Var.q;
                                int size = arrayList2.size();
                                float f = 0.0f;
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i10 < size) {
                                        pd3 pd3Var = (pd3) arrayList2.get(i10);
                                        int i12 = i10;
                                        mc mcVar = pd3Var.a;
                                        int iH = nc0.h(j);
                                        if (nc0.c(j)) {
                                            rd3Var = rd3VarQ0;
                                            iG = nc0.g(j) - ((int) Math.ceil(f));
                                            if (iG < 0) {
                                                iG = 0;
                                            }
                                        } else {
                                            rd3Var = rd3VarQ0;
                                            iG = nc0.g(j);
                                        }
                                        long jB = qc0.b(iH, iG, 5);
                                        float f2 = f;
                                        int i13 = size;
                                        ic icVar = new ic(mcVar, fdVar.a - i11, i9, jB);
                                        float f3 = f2 + icVar.f;
                                        ks4 ks4Var = icVar.d;
                                        int i14 = i11 + ks4Var.f;
                                        i4 = i14;
                                        arrayList.add(new od3(icVar, pd3Var.b, pd3Var.c, i11, i14, f2, f3));
                                        if (!ks4Var.d && (i4 != fdVar.a || i12 == gb.E((ArrayList) ((bq4) fdVar.c).q))) {
                                            i10 = i12 + 1;
                                            size = i13;
                                            i11 = i4;
                                            f = f3;
                                            rd3VarQ0 = rd3Var;
                                        }
                                    } else {
                                        rd3Var = rd3VarQ0;
                                        i4 = i11;
                                    }
                                }
                                fdVar.b = i4;
                                fdVar.e = arrayList;
                                ArrayList arrayList3 = new ArrayList(arrayList.size());
                                int size2 = arrayList.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    od3 od3Var = (od3) arrayList.get(i15);
                                    List list2 = od3Var.a.g;
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    int i16 = 0;
                                    while (i16 < size3) {
                                        wv3 wv3Var = (wv3) list2.get(i16);
                                        if (wv3Var != null) {
                                            wv3VarF = wv3Var.f((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(od3Var.f)) & 4294967295L));
                                        } else {
                                            wv3VarF = null;
                                        }
                                        arrayList4.add(wv3VarF);
                                        i16++;
                                        size2 = size2;
                                        i15 = i15;
                                    }
                                    v40.n0(arrayList4, arrayList3);
                                    i15++;
                                }
                                if (arrayList3.size() < ((List) ((bq4) fdVar.c).o).size()) {
                                    int size4 = ((List) ((bq4) fdVar.c).o).size() - arrayList3.size();
                                    ArrayList arrayList5 = new ArrayList(size4);
                                    int i17 = 0;
                                    while (true) {
                                        ms4Var2 = null;
                                        if (i17 < size4) {
                                            arrayList5.add(null);
                                            i17++;
                                        } else {
                                            arrayList3 = q40.G0(arrayList3, arrayList5);
                                        }
                                    }
                                } else {
                                    ms4Var2 = null;
                                }
                                fdVar.d = arrayList3;
                                ms4Var = new ms4(ls4Var, fdVar, rd3Var.l);
                            }
                        }
                        if (ms4Var != null) {
                            list.add(ms4Var);
                            ms4Var3 = ms4Var;
                        } else {
                            ms4Var3 = ms4Var2;
                        }
                        return Boolean.valueOf(ms4Var3 != null);
                    case 1:
                        String str = ((he) obj).o;
                        xs4 xs4Var2 = ys4Var.L;
                        if (xs4Var2 == null) {
                            xs4 xs4Var3 = new xs4(ys4Var.B, str);
                            rd3 rd3Var2 = new rd3(str, ys4Var.C, ys4Var.D, ys4Var.E, ys4Var.F, ys4Var.G, ys4Var.H);
                            rd3Var2.c(ys4Var.q0().i);
                            xs4Var3.d = rd3Var2;
                            ys4Var.L = xs4Var3;
                        } else if (!h12.c(str, xs4Var2.b)) {
                            xs4Var2.b = str;
                            rd3 rd3Var3 = xs4Var2.d;
                            if (rd3Var3 != null) {
                                zs4 zs4Var = ys4Var.C;
                                ha1 ha1Var2 = ys4Var.D;
                                int i18 = ys4Var.E;
                                boolean z4 = ys4Var.F;
                                int i19 = ys4Var.G;
                                int i110 = ys4Var.H;
                                rd3Var3.a = str;
                                rd3Var3.b = zs4Var;
                                rd3Var3.c = ha1Var2;
                                rd3Var3.d = i18;
                                rd3Var3.e = z4;
                                rd3Var3.f = i19;
                                rd3Var3.g = i110;
                                rd3Var3.q = (rd3Var3.q << 2) | 2;
                                rd3Var3.b();
                            }
                        }
                        fu.C(ys4Var);
                        g12.A(ys4Var);
                        jz4.z(ys4Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        xs4 xs4Var4 = ys4Var.L;
                        if (xs4Var4 == null) {
                            z2 = false;
                        } else {
                            xs4Var4.c = zBooleanValue;
                            fu.C(ys4Var);
                            g12.A(ys4Var);
                            jz4.z(ys4Var);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        q94Var.a(d94.n, new w2(null, new wc(29, this)));
        q94Var.a(d94.a, new w2(null, r0));
    }

    @Override // defpackage.cx2
    public final boolean f0() {
        return false;
    }

    public final rd3 q0() {
        zs4 zs4Var = this.C;
        if (this.J == null) {
            this.J = new rd3(this.B, zs4Var, this.D, this.E, this.F, this.G, this.H);
        }
        rd3 rd3Var = this.J;
        rd3Var.getClass();
        return rd3Var;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x0073, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.u62
    public final vi2 r(cf2 cf2Var, pi2 pi2Var, long j) {
        rd3 rd3VarQ0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            xs4 xs4Var = this.L;
            if (xs4Var == null) {
                rd3VarQ0 = q0();
            } else {
                if (!xs4Var.c) {
                    xs4Var = null;
                }
                if (xs4Var == null || (rd3VarQ0 = xs4Var.d) == null) {
                    rd3VarQ0 = q0();
                }
            }
            rd3VarQ0.c(cf2Var);
            boolean zA = rd3VarQ0.a(j, cf2Var.getLayoutDirection());
            qd3 qd3Var = rd3VarQ0.n;
            if (qd3Var != null) {
                qd3Var.a();
            }
            ic icVar = rd3VarQ0.j;
            icVar.getClass();
            ks4 ks4Var = icVar.d;
            long j2 = rd3VarQ0.l;
            if (zA) {
                j51.M(this, 2).I0();
                HashMap map = this.I;
                if (map == null) {
                    map = new HashMap(2);
                    this.I = map;
                }
                map.put(j9.a, Integer.valueOf(Math.round(ks4Var.c(0) + 0.0f)));
                map.put(j9.b, Integer.valueOf(Math.round(ks4Var.c(ks4Var.f - 1) + 0.0f)));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (4294967295L & j2);
            jg3 jg3VarR = pi2Var.r(zz1.m(i, i, i2, i2));
            HashMap map2 = this.I;
            map2.getClass();
            return cf2Var.T(i, i2, map2, null, new la(jg3VarR, 6));
        } finally {
            Trace.endSection();
        }
    }
}
