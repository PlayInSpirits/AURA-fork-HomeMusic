package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yv3 {
    public final e02 a;
    public final ra b;
    public final ue1 c;
    public final pt4 d;
    public final q03 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ga i;
    public long j;
    public final wc k;
    public final v03 l;

    public yv3(i03 i03Var, ra raVar) {
        this.a = i03Var;
        this.b = raVar;
        ue1 ue1Var = new ue1(11, (byte) 0);
        ue1Var.p = new long[192];
        ue1Var.q = new long[192];
        this.c = ue1Var;
        this.d = new pt4();
        this.e = new q03();
        this.j = -1L;
        this.k = new wc(18, this);
        this.l = new v03();
    }

    public static boolean c(f63 f63Var) {
        tb3 tb3Var = f63Var.g0;
        return (tb3Var == null || jz4.B(((vj1) tb3Var).b())) ? false : true;
    }

    public static boolean d(c72 c72Var) {
        return c72Var.t != -4;
    }

    public static long g(c72 c72Var) {
        w12 w12Var = c72Var.Q;
        f63 f63Var = (f63) w12Var.e;
        long jC = 0;
        for (f63 f63Var2 = (iz1) w12Var.d; f63Var2 != null && f63Var2 != f63Var; f63Var2 = f63Var2.J) {
            if (c(f63Var2)) {
                return 9223372034707292159L;
            }
            jC = g02.c(jC, f63Var2.S);
        }
        return jC;
    }

    public static void j(c72 c72Var) {
        if (!c72Var.p || c((f63) c72Var.Q.e)) {
            return;
        }
        c72Var.p = false;
        if (c72Var.r) {
            c72Var.q = g(c72Var);
            c72Var.r = false;
        }
        if (g02.a(c72Var.q, 9223372034707292159L)) {
            return;
        }
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i = f13VarY.p;
        for (int i2 = 0; i2 < i; i2++) {
            j((c72) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x024b A[LOOP:11: B:102:0x0249->B:103:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0254 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0256 A[LOOP:9: B:95:0x0225->B:107:0x0256, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x025d A[ADDED_TO_REGION, LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_START, PHI: r1
  0x025d: PHI (r1v9 ot4) = (r1v8 ot4), (r1v10 ot4) binds: [B:109:0x025b, B:111:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x025f A[LOOP:12: B:110:0x025d->B:111:0x025f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x026c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0259 A[EDGE_INSN: B:136:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0259 A[EDGE_INSN: B:137:0x0259->B:108:0x0259 BREAK  A[LOOP:9: B:95:0x0225->B:107:0x0256], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189 A[ADDED_TO_REGION, LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_START, PHI: r3
  0x0189: PHI (r3v7 ot4) = (r3v6 ot4), (r3v8 ot4) binds: [B:72:0x0187, B:74:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x018b A[LOOP:7: B:73:0x0189->B:74:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0211  */
    /* JADX WARN: Code duplicated, block: B:92:0x0219  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x023c  */
    public final void a() {
        boolean z;
        long j;
        int i;
        long j2;
        long j3;
        int i2;
        Object[] objArr;
        long[] jArr;
        int length;
        ot4 ot4Var;
        int i3;
        long j4;
        int i4;
        long j5;
        int i5;
        ot4 ot4Var2;
        long[] jArr2;
        long[] jArr3;
        int i6;
        int i7;
        int i8;
        long j6;
        long j7;
        float[] fArr;
        ot4 ot4Var3;
        long[] jArr4;
        long j8;
        long j9;
        ga gaVar = this.i;
        if (gaVar != null) {
            this.b.removeCallbacks(gaVar);
            this.i = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.f;
        boolean z3 = z2 || this.g;
        ue1 ue1Var = this.c;
        boolean z4 = true;
        pt4 pt4Var = this.d;
        if (z2) {
            this.f = false;
            q03 q03Var = this.e;
            Object[] objArr2 = q03Var.a;
            int i9 = q03Var.b;
            for (int i10 = 0; i10 < i9; i10++) {
                ((gf1) objArr2[i10]).invoke();
            }
            long[] jArr5 = (long[]) ue1Var.p;
            int i11 = ue1Var.o;
            int i12 = 0;
            while (i12 < jArr5.length - 2 && i12 < i11) {
                long j10 = jArr5[i12 + 2];
                boolean z5 = z4;
                int i13 = i11;
                if ((((int) (j10 >> 60)) & 1) != 0) {
                    long j11 = jArr5[i12];
                    long j12 = jArr5[i12 + 1];
                    ot4 ot4Var4 = (ot4) pt4Var.a.b(((int) j10) & 33554431);
                    while (ot4Var4 != null) {
                        ot4 ot4Var5 = ot4Var4.d;
                        boolean z6 = z3;
                        long j13 = ot4Var4.g;
                        boolean z7 = (jCurrentTimeMillis - j13 >= 0 || j13 == Long.MIN_VALUE) ? z5 : false;
                        ot4Var4.e = j11;
                        ot4Var4.f = j12;
                        if (z7) {
                            ot4Var4.g = jCurrentTimeMillis;
                            j8 = j11;
                            j9 = j12;
                            ot4Var4.a(j8, j9, pt4Var.d, pt4Var.e, pt4Var.g);
                        } else {
                            j8 = j11;
                            j9 = j12;
                        }
                        ot4Var4 = ot4Var5;
                        j11 = j8;
                        j12 = j9;
                        z3 = z6;
                    }
                }
                i12 += 3;
                z4 = z5;
                i11 = i13;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr6 = (long[]) ue1Var.p;
            int i14 = ue1Var.o;
            for (int i15 = 0; i15 < jArr6.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr6[i16] = jArr6[i16] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.g) {
            this.g = false;
            long j14 = pt4Var.d;
            long j15 = pt4Var.e;
            float[] fArr2 = pt4Var.g;
            i03 i03Var = pt4Var.a;
            j2 = 128;
            Object[] objArr3 = i03Var.c;
            long[] jArr7 = i03Var.a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                int i18 = 8;
                j3 = 255;
                while (true) {
                    long j16 = j14;
                    long j17 = jArr7[i17];
                    int i19 = i18;
                    ue1Var = ue1Var;
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i20 = 8 - ((~(i17 - length2)) >>> 31);
                        long j18 = j17;
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j18 & 255) < 128) {
                                ot4 ot4Var6 = (ot4) objArr3[(i17 << 3) + i21];
                                while (ot4Var6 != null) {
                                    pt4Var.a(ot4Var6, j16, j15, fArr2, jCurrentTimeMillis);
                                    ot4Var6 = ot4Var6.d;
                                    i19 = i19;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i22 = i19;
                            j18 >>= i22;
                            i21++;
                            j16 = j16;
                            i19 = i22;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                        if (i20 != i) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i = i19;
                        j14 = j16;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i18 = i;
                    ue1Var = ue1Var;
                    jArr7 = jArr4;
                }
            } else {
                i = 8;
            }
            if (z) {
                j6 = pt4Var.d;
                j7 = pt4Var.e;
                fArr = pt4Var.g;
                ot4Var3 = pt4Var.b;
                if (ot4Var3 != null) {
                    while (ot4Var3 != null) {
                        c72 c72VarO = j51.O(ot4Var3.b);
                        long jB = ((ra) h12.L(c72VarO)).getRectManager().b(c72VarO);
                        ot4Var3.e = jB;
                        ti2 ti2Var = c72VarO.R.p;
                        ot4Var3.f = (((long) (ti2Var.n + ((int) (jB >> 32)))) << 32) | (((long) (ti2Var.o + ((int) (jB & 4294967295L)))) & 4294967295L);
                        pt4Var.a(ot4Var3, j6, j7, fArr, jCurrentTimeMillis);
                        ot4Var3 = ot4Var3.d;
                    }
                }
            }
            if (this.h) {
                i2 = 0;
                this.h = false;
                ue1 ue1Var2 = ue1Var;
                jArr2 = (long[]) ue1Var2.p;
                int i23 = ue1Var2.o;
                jArr3 = (long[]) ue1Var2.q;
                i7 = 0;
                for (i6 = 0; i6 < jArr2.length - 2 && i7 < jArr3.length - 2 && i6 < i23; i6 += 3) {
                    i8 = i6 + 2;
                    if (jArr2[i8] != xv3.a) {
                        jArr3[i7] = jArr2[i6];
                        jArr3[i7 + 1] = jArr2[i6 + 1];
                        jArr3[i7 + 2] = jArr2[i8];
                        i7 += 3;
                    }
                }
                ue1Var2.o = i7;
                ue1Var2.p = jArr3;
                ue1Var2.q = jArr2;
            } else {
                i2 = 0;
            }
            if (pt4Var.c <= jCurrentTimeMillis) {
                i03 i03Var2 = pt4Var.a;
                objArr = i03Var2.c;
                jArr = i03Var2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i3 = i2;
                    while (true) {
                        j4 = jArr[i3];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        } else {
                            i4 = 8 - ((~(i3 - length)) >>> 31);
                            j5 = j4;
                            for (i5 = i2; i5 < i4; i5++) {
                                if ((j5 & j3) < j2) {
                                    for (ot4Var2 = (ot4) objArr[(i3 << 3) + i5]; ot4Var2 != null; ot4Var2 = ot4Var2.d) {
                                    }
                                }
                                j5 >>= i;
                            }
                            if (i4 == i) {
                                break;
                            } else if (i3 != length) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                ot4Var = pt4Var.b;
                if (ot4Var != null) {
                    while (ot4Var != null) {
                        ot4Var = ot4Var.d;
                    }
                }
                pt4Var.c = -1L;
            }
            if (pt4Var.c > j) {
                k();
            }
        }
        i = 8;
        j2 = 128;
        j3 = 255;
        if (z) {
            j6 = pt4Var.d;
            j7 = pt4Var.e;
            fArr = pt4Var.g;
            ot4Var3 = pt4Var.b;
            if (ot4Var3 != null) {
                while (ot4Var3 != null) {
                    c72 c72VarO2 = j51.O(ot4Var3.b);
                    long jB2 = ((ra) h12.L(c72VarO2)).getRectManager().b(c72VarO2);
                    ot4Var3.e = jB2;
                    ti2 ti2Var2 = c72VarO2.R.p;
                    ot4Var3.f = (((long) (ti2Var2.n + ((int) (jB2 >> 32)))) << 32) | (((long) (ti2Var2.o + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    pt4Var.a(ot4Var3, j6, j7, fArr, jCurrentTimeMillis);
                    ot4Var3 = ot4Var3.d;
                }
            }
        }
        if (this.h) {
            i2 = 0;
            this.h = false;
            ue1 ue1Var3 = ue1Var;
            jArr2 = (long[]) ue1Var3.p;
            int i24 = ue1Var3.o;
            jArr3 = (long[]) ue1Var3.q;
            i7 = 0;
            while (i6 < jArr2.length - 2) {
                i8 = i6 + 2;
                if (jArr2[i8] != xv3.a) {
                    jArr3[i7] = jArr2[i6];
                    jArr3[i7 + 1] = jArr2[i6 + 1];
                    jArr3[i7 + 2] = jArr2[i8];
                    i7 += 3;
                }
            }
            ue1Var3.o = i7;
            ue1Var3.p = jArr3;
            ue1Var3.q = jArr2;
        } else {
            i2 = 0;
        }
        if (pt4Var.c <= jCurrentTimeMillis) {
            i03 i03Var3 = pt4Var.a;
            objArr = i03Var3.c;
            jArr = i03Var3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                i3 = i2;
                while (true) {
                    j4 = jArr[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        i4 = 8 - ((~(i3 - length)) >>> 31);
                        j5 = j4;
                        while (i5 < i4) {
                            if ((j5 & j3) < j2) {
                                while (ot4Var2 != null) {
                                }
                            }
                            j5 >>= i;
                        }
                        if (i4 == i) {
                            break;
                            break;
                        } else {
                            if (i3 != length) {
                                break;
                                break;
                            }
                            i3++;
                        }
                    }
                }
            }
            ot4Var = pt4Var.b;
            if (ot4Var != null) {
                while (ot4Var != null) {
                    ot4Var = ot4Var.d;
                }
            }
            pt4Var.c = -1L;
        }
        if (pt4Var.c > j) {
            k();
        }
    }

    public final long b(c72 c72Var) {
        if (!d(c72Var)) {
            return 9223372034707292159L;
        }
        long j = ((long[]) this.c.p)[e(c72Var)];
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    public final int e(c72 c72Var) {
        int i = c72Var.t;
        if (i != -4) {
            int i2 = c72Var.o;
            ue1 ue1Var = this.c;
            long[] jArr = (long[]) ue1Var.p;
            if (i < 0 || i >= ue1Var.o - 2 || (((int) jArr[i + 2]) & 33554431) != (i2 & 33554431)) {
                int i3 = i2 & 33554431;
                int i4 = ue1Var.o;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4 - 2) {
                        i = -4;
                        break;
                    }
                    if ((((int) jArr[i5 + 2]) & 33554431) == i3) {
                        i = i5;
                        break;
                    }
                    i5 += 3;
                }
            }
        } else {
            i = -4;
            break;
        }
        if (i == -4) {
            cz1.a("LayoutNode " + c72Var.o + " not found in RectList");
        }
        c72Var.t = i;
        return i;
    }

    public final void f(c72 c72Var) {
        c72Var.p = true;
        w12 w12Var = c72Var.Q;
        ti2 ti2Var = c72Var.R.p;
        int iG = ti2Var.G();
        float F = ti2Var.F();
        v03 v03Var = this.l;
        v03Var.b = 0.0f;
        v03Var.c = 0.0f;
        v03Var.d = iG;
        v03Var.e = F;
        for (f63 f63Var = (f63) w12Var.e; f63Var != null; f63Var = f63Var.J) {
            c72 c72Var2 = f63Var.H;
            if (f63Var == ((f63) c72Var2.Q.e) && !c72Var2.p) {
                long jB = b(c72Var2);
                if (!g02.a(jB, 9223372034707292159L)) {
                    v03Var.d((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            tb3 tb3Var = f63Var.g0;
            if (tb3Var != null) {
                float[] fArrB = ((vj1) tb3Var).b();
                if (!jz4.B(fArrB)) {
                    ya4.B(fArrB, v03Var);
                }
            }
            long j = f63Var.S;
            v03Var.d((4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
        }
        int i = (int) v03Var.b;
        int i2 = (int) v03Var.c;
        int i3 = (int) v03Var.d;
        int i4 = (int) v03Var.e;
        int i5 = c72Var.o;
        int i6 = c72Var.t;
        ue1 ue1Var = this.c;
        if (i6 != -4) {
            int iE = e(c72Var);
            long[] jArr = (long[]) ue1Var.p;
            jArr[iE] = (((long) i) << 32) | (((long) i2) & 4294967295L);
            jArr[iE + 1] = (4294967295L & ((long) i4)) | (((long) i3) << 32);
            int i7 = iE + 2;
            long j2 = jArr[i7];
            jArr[i7] = j2 | (((j2 >> 63) & 1) << 60);
        } else {
            c72 c72VarT = c72Var.t();
            c72Var.t = ue1Var.m(i5, i, i2, i3, i4, c72VarT != null ? c72VarT.o : -1, c72VarT != null ? e(c72VarT) : -4, w12Var.d(1024), w12Var.d(16), this.d.a.a(i5));
        }
        c72Var.s = false;
        this.f = true;
        f13 f13VarY = c72Var.y();
        Object[] objArr = f13VarY.n;
        int i8 = f13VarY.p;
        for (int i9 = 0; i9 < i8; i9++) {
            c72 c72Var3 = (c72) objArr[i9];
            if (c72Var3.H()) {
                f(c72Var3);
            }
        }
    }

    public final void h(c72 c72Var) {
        long j;
        boolean zH = c72Var.H();
        w12 w12Var = c72Var.Q;
        if (zH && c72Var.s) {
            c72 c72VarT = c72Var.t();
            if (c72VarT == null || c72VarT.p) {
                j = c72VarT == null ? 0L : 9223372034707292159L;
            } else {
                if (c72VarT.r) {
                    c72VarT.r = false;
                    c72VarT.q = g(c72VarT);
                }
                j = c72VarT.q;
            }
            f63 f63Var = (f63) w12Var.e;
            if (g02.a(j, 9223372034707292159L) || c(f63Var)) {
                f(c72Var);
            } else if (c72Var.p) {
                f(c72Var);
                j(c72Var);
            } else {
                long jC = g02.c(j, f63Var.S);
                ti2 ti2Var = c72Var.R.p;
                int iG = ti2Var.G();
                int iF = ti2Var.F();
                int i = c72Var.t;
                ue1 ue1Var = this.c;
                if (i != -4) {
                    int iE = e(c72Var);
                    if (c72VarT != null) {
                        int iE2 = e(c72VarT);
                        long[] jArr = (long[]) ue1Var.p;
                        long j2 = jArr[iE2];
                        int i2 = ((int) (j2 >> 32)) + ((int) (jC >> 32));
                        int i3 = ((int) j2) + ((int) (jC & 4294967295L));
                        long j3 = jArr[iE];
                        int i4 = i2 - ((int) (j3 >> 32));
                        int i5 = i3 - ((int) j3);
                        int i6 = iE + 2;
                        long j4 = jArr[i6];
                        jArr[iE] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
                        jArr[iE + 1] = (((long) (iG + i2)) << 32) | (((long) (iF + i3)) & 4294967295L);
                        jArr[i6] = j4 | (((j4 >> 63) & 1) << 60);
                        if (i4 != 0 || i5 != 0) {
                            ue1Var.E(iE, i4, i5, j4);
                        }
                    } else {
                        int iE3 = e(c72Var);
                        int i7 = (int) (jC >> 32);
                        int i8 = (int) (jC & 4294967295L);
                        long[] jArr2 = (long[]) ue1Var.p;
                        long j5 = jArr2[iE3];
                        jArr2[iE3] = (((long) i8) & 4294967295L) | (((long) i7) << 32);
                        jArr2[iE3 + 1] = (((long) (iF + i8)) & 4294967295L) | (((long) (iG + i7)) << 32);
                        int i9 = iE3 + 2;
                        long j6 = jArr2[i9];
                        jArr2[i9] = (((j6 >> 63) & 1) << 60) | j6;
                        int i10 = i7 - ((int) (j5 >> 32));
                        int i11 = i8 - ((int) j5);
                        if (i10 != 0 || i11 != 0) {
                            ue1Var.E(iE3, i10, i11, j6);
                        }
                    }
                } else {
                    int i12 = c72Var.o;
                    boolean zD = w12Var.d(1024);
                    boolean zD2 = w12Var.d(16);
                    boolean zA = this.d.a.a(i12);
                    if (c72VarT != null) {
                        int i13 = c72VarT.o;
                        int iE4 = e(c72VarT);
                        int i14 = (int) (jC >> 32);
                        int i15 = (int) (jC & 4294967295L);
                        int i16 = i12 & 33554431;
                        long[] jArr3 = (long[]) ue1Var.p;
                        if ((((int) jArr3[iE4 + 2]) & 33554431) != (33554431 & i13)) {
                            cz1.a("Inserted child " + i16 + " without valid parent index or parent " + i13 + " not found");
                        }
                        long j7 = jArr3[iE4];
                        int i17 = ((int) (j7 >> 32)) + i14;
                        int i18 = ((int) j7) + i15;
                        c72Var.t = ue1Var.m(i16, i17, i18, i17 + iG, i18 + iF, i13, iE4, zD, zD2, zA);
                    } else {
                        int i19 = (int) (jC >> 32);
                        int i20 = (int) (jC & 4294967295L);
                        c72Var.t = ue1Var.m(i12, i19, i20, i19 + iG, i20 + iF, -1, -4, zD, zD2, zA);
                    }
                }
            }
            c72Var.s = false;
            this.f = true;
            k();
        }
    }

    public final void i(c72 c72Var) {
        if (d(c72Var)) {
            int iE = e(c72Var);
            long[] jArr = (long[]) this.c.p;
            jArr[iE] = -1;
            jArr[iE + 1] = -1;
            jArr[iE + 2] = xv3.a;
            c72Var.t = -4;
            c72Var.s = true;
            this.f = true;
            this.h = true;
        }
    }

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
    public final void k() {
        ga gaVar = this.i;
        boolean z = gaVar != null;
        long j = this.d.c;
        if (j >= 0 || !z) {
            if (this.j == j && z) {
                return;
            }
            ra raVar = this.b;
            if (gaVar != null) {
                raVar.removeCallbacks(gaVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.j = jMax;
            ga gaVar2 = new ga(1, this.k);
            raVar.postDelayed(gaVar2, jMax - jCurrentTimeMillis);
            this.i = gaVar2;
        }
    }
}
