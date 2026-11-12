package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fc3 {
    public final om1 a;
    public final i03 b;
    public final j03 c;
    public final g03 d;
    public final i03 e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public final q82 n;
    public final qp4 o;

    public fc3(om1 om1Var, q82 q82Var, vc3 vc3Var) {
        this.a = om1Var;
        i03 i03Var = f02.a;
        this.b = new i03();
        this.c = new j03();
        int i = a02.a;
        this.d = new g03();
        this.e = new i03();
        this.g = -1;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.n = q82Var;
        this.o = new qp4(vc3Var);
    }

    public final int a(qp4 qp4Var, int i, boolean z) {
        Object obj;
        List list;
        List list2;
        i03 i03Var = this.e;
        if (i03Var.a(i)) {
            Object objB = i03Var.b(i);
            objB.getClass();
            return ((zx) objB).b;
        }
        i03 i03Var2 = this.b;
        int i2 = 0;
        if (i03Var2.a(i)) {
            if (!z || (list2 = (List) i03Var2.b(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((p82) list2.get(i2)).a();
                i2++;
            }
            return -1;
        }
        sx sxVar = new sx(this, qp4Var, 0);
        long j = qp4Var.e().u;
        q82 q82Var = (q82) qp4Var.c;
        if (q82Var == null) {
            h12.Q("state");
            throw null;
        }
        o oVar = new o(20, sxVar, qp4Var);
        ll llVar = q82Var.c;
        if (llVar != null) {
            rm3 rm3Var = q82Var.b;
            wp3 wp3Var = (wp3) llVar.r;
            boolean z2 = wp3Var instanceof sc;
            vp3 vp3Var = new vp3(llVar, i, rm3Var, oVar);
            vp3Var.d = new nc0(j);
            if (z2) {
                sc scVar = (sc) wp3Var;
                scVar.o.add(new gq3(1, vp3Var));
                if (!scVar.p) {
                    scVar.p = true;
                    scVar.n.post(scVar);
                }
            } else {
                wp3Var.a(vp3Var);
            }
            si0.R("compose:lazy:schedule_prefetch:index", i);
            obj = vp3Var;
        } else {
            obj = kx0.a;
        }
        i03Var2.i(i, gb.O(obj));
        if (!z || (list = (List) i03Var2.b(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((p82) list.get(i2)).a();
            i2++;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
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
    public final void b(qp4 qp4Var, int i, int i2) {
        int i3;
        Object obj;
        i03 i03Var = this.e;
        zx zxVar = (zx) i03Var.b(i);
        pa paVar = zx.c;
        if (zxVar != null) {
            zxVar.b = i2;
            zxVar.a = paVar;
        } else {
            zxVar = new zx();
            zxVar.a = paVar;
            zxVar.b = i2;
        }
        i03Var.i(i, zxVar);
        if (i > this.i) {
            this.i = i;
            this.k -= i2;
        } else if (i < this.h) {
            this.h = i;
            this.j -= i2;
        }
        if (Math.signum(this.f) <= 0.0f) {
            if (this.k > 0) {
                i3 = this.i + 1;
            } else {
                i3 = -1;
            }
        } else if (Math.signum(this.f) <= 0.0f || this.j <= 0) {
            i3 = -1;
        } else {
            i3 = this.h - 1;
        }
        if (i3 > 0) {
            qp4Var.getClass();
            if (i3 != -1 && i3 < this.m) {
                sx sxVar = new sx(this, qp4Var, 1);
                long j = qp4Var.e().u;
                q82 q82Var = (q82) qp4Var.c;
                if (q82Var == null) {
                    h12.Q("state");
                    throw null;
                }
                o oVar = new o(20, sxVar, qp4Var);
                ll llVar = q82Var.c;
                if (llVar != null) {
                    rm3 rm3Var = q82Var.b;
                    wp3 wp3Var = (wp3) llVar.r;
                    boolean z = wp3Var instanceof sc;
                    vp3 vp3Var = new vp3(llVar, i3, rm3Var, oVar);
                    vp3Var.d = new nc0(j);
                    if (z) {
                        sc scVar = (sc) wp3Var;
                        scVar.o.add(new gq3(1, vp3Var));
                        if (!scVar.p) {
                            scVar.p = true;
                            scVar.n.post(scVar);
                        }
                    } else {
                        wp3Var.a(vp3Var);
                    }
                    si0.R("compose:lazy:schedule_prefetch:index", i3);
                    obj = vp3Var;
                } else {
                    obj = kx0.a;
                }
                this.b.i(i3, gb.O(obj));
            }
        }
        g();
    }

    public final void c(qp4 qp4Var, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.f);
        if (!z) {
            if (!z2 || this.l) {
                this.j = i3 - i5;
                this.h = i;
            } else {
                int iL = ji2.L(Math.abs(f)) + this.j;
                int i8 = i3 - i5;
                if (iL > i8) {
                    iL = i8;
                }
                this.j = iL;
            }
            while (this.j > 0 && (i6 = this.h) > 0) {
                int iA = a(qp4Var, this.h - 1, i6 + (-1) == i + (-1) && f != 0.0f && Math.abs(f) >= ((float) i5));
                if (iA == -1) {
                    return;
                }
                this.h--;
                this.j -= iA;
            }
            return;
        }
        if (!z2 || this.l) {
            this.k = i3 - i4;
            this.i = i2;
        } else {
            int iL2 = ji2.L(Math.abs(f)) + this.k;
            int i9 = i3 - i4;
            if (iL2 > i9) {
                iL2 = i9;
            }
            this.k = iL2;
        }
        while (this.k > 0) {
            int i10 = this.i;
            qp4Var.getClass();
            if (i10 == -1 || (i7 = this.i) >= this.m - 1) {
                return;
            }
            int iA2 = a(qp4Var, this.i + 1, i7 + 1 == i2 + 1 && f != 0.0f && Math.abs(f) >= ((float) i4));
            if (iA2 == -1) {
                return;
            }
            this.i++;
            this.k -= iA2;
        }
    }

    public final void d(float f, qc3 qc3Var) {
        fc3 fc3Var;
        boolean z;
        int i;
        int i2;
        int i3;
        qp4 qp4Var = this.o;
        qp4Var.b = qc3Var;
        qp4Var.c = this.n;
        float f2 = -f;
        g();
        if (qp4Var.c()) {
            te5.x(qp4Var.e());
            qp4Var.e();
            this.m = qp4Var.h();
            int iB = qp4Var.b();
            int iD = qp4Var.d();
            int iH = qp4Var.h();
            int iG = qp4Var.g();
            int iF = qp4Var.f();
            i03 i03Var = this.e;
            if (f2 <= 0.0f) {
                this.j = 0 - iG;
                this.h = iB;
                while (this.j > 0 && (i3 = this.h) > 0 && i03Var.a(i3 - 1)) {
                    Object objB = i03Var.b(this.h - 1);
                    objB.getClass();
                    int i4 = ((zx) objB).b;
                    this.h--;
                    this.j -= i4;
                }
                e(0, this.h - 1);
            } else {
                this.k = 0 - iF;
                this.i = iD;
                while (this.k > 0 && (i2 = this.i) < iH - 1 && i03Var.a(i2 + 1)) {
                    Object objB2 = i03Var.b(this.i + 1);
                    objB2.getClass();
                    int i5 = ((zx) objB2).b;
                    this.i++;
                    this.k -= i5;
                }
                e(this.i + 1, iH - 1);
            }
        }
        if (qp4Var.c()) {
            te5.x(qp4Var.e());
            if (qp4Var.e().t != null) {
                i = ((ad3) this.a.o).o;
                z = false;
            } else {
                z = false;
                i = 0;
            }
            fc3Var = this;
            fc3Var.c(qp4Var, qp4Var.b(), qp4Var.d(), i, qp4Var.f(), qp4Var.g(), f2, f2 <= 0.0f ? true : z);
        } else {
            fc3Var = this;
        }
        fc3Var.f = f2;
        fc3Var.g();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00f5 A[EDGE_INSN: B:102:0x00f5->B:59:0x00f5 BREAK  A[LOOP:4: B:45:0x00c1->B:58:0x00f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[LOOP:0: B:5:0x0020->B:18:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2 A[LOOP:4: B:45:0x00c1->B:58:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0063 A[EDGE_INSN: B:88:0x0063->B:20:0x0063 BREAK  A[LOOP:0: B:5:0x0020->B:18:0x0056], SYNTHETIC] */
    public final void e(int i, int i2) {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        int[] iArr;
        long[] jArr;
        int i3;
        char c3;
        int i4;
        j03 j03Var = this.c;
        j03Var.b();
        i03 i03Var = this.b;
        int[] iArr2 = i03Var.b;
        long[] jArr2 = i03Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j4 = jArr2[i5];
                c = 7;
                j3 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i5 != length) {
                        break;
                        break;
                    }
                    i5++;
                } else {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & 255) < 128 && i <= (i4 = iArr2[(i5 << 3) + i7]) && i4 <= i2) {
                            j03Var.a(i4);
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 != length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
        }
        g03 g03Var = this.d;
        int[] iArr3 = g03Var.b;
        long[] jArr3 = g03Var.a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j5 = jArr3[i8];
                if ((((~j5) << c) & j5 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j5 & j2) < j) {
                            c3 = c;
                            int i11 = iArr3[(i8 << 3) + i10];
                            if (i <= i11 && i11 <= i2) {
                                j03Var.a(i11);
                            }
                        } else {
                            c3 = c;
                        }
                        j5 >>= 8;
                        i10++;
                        c = c3;
                    }
                    c2 = c;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c2 = c;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                c = c2;
            }
        } else {
            c2 = c;
        }
        i03 i03Var2 = this.e;
        int[] iArr4 = i03Var2.b;
        long[] jArr4 = i03Var2.a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j6 = jArr4[i12];
                if ((((~j6) << c2) & j6 & j3) == j3) {
                    if (i12 != length3) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j6 & j2) < j && i <= (i3 = iArr4[(i12 << 3) + i14]) && i3 <= i2) {
                            j03Var.a(i3);
                        }
                        j6 >>= 8;
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
        int[] iArr5 = j03Var.b;
        long[] jArr5 = j03Var.a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j7 = jArr5[i15];
            if ((((~j7) << c2) & j7 & j3) != j3) {
                int i16 = 8 - ((~(i15 - length4)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((j7 & j2) < j) {
                        int i18 = iArr5[(i15 << 3) + i17];
                        List list = (List) i03Var.g(i18);
                        if (list != null) {
                            int size = list.size();
                            for (int i19 = 0; i19 < size; i19++) {
                                ((p82) list.get(i19)).cancel();
                            }
                        }
                        int iC = g03Var.c(i18);
                        if (iC >= 0) {
                            g03Var.e--;
                            long[] jArr6 = g03Var.a;
                            int i20 = g03Var.d;
                            int i21 = iC >> 3;
                            int i22 = (iC & 7) << 3;
                            long j8 = (jArr6[i21] & (~(j2 << i22))) | (254 << i22);
                            jArr6[i21] = j8;
                            jArr6[(((iC - 7) & i20) + (i20 & 7)) >> 3] = j8;
                        }
                        i03Var2.g(i18);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j7 >>= 8;
                    i17++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i16 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i15 == length4) {
                return;
            }
            i15++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    public final void f() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.d.a();
        this.e.c();
        i03 i03Var = this.b;
        long[] jArr = i03Var.a;
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
                        int i4 = (i << 3) + i3;
                        int i5 = i03Var.b[i4];
                        List list = (List) i03Var.c[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((p82) list.get(i6)).cancel();
                        }
                        i03Var.h(i4);
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

    public final void g() {
        si0.R("prefetchWindowStartExtraSpace", this.j);
        si0.R("prefetchWindowEndExtraSpace", this.k);
        si0.R("prefetchWindowStartIndex", this.h);
        si0.R("prefetchWindowEndIndex", this.i);
    }
}
