package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cf2 extends jg3 implements wi2, yx2, vb3 {
    public static final k52 F = new k52(9);
    public static final k52 G = new k52(10);
    public boolean A;
    public boolean B;
    public final df2 C = new df2(0, this);
    public c6 D;
    public w03 E;
    public af2 s;
    public if1 t;
    public wf1 u;
    public if1 v;
    public lg3 w;
    public w03 x;
    public boolean y;
    public w03 z;

    public static void l0(f63 f63Var) {
        d72 d72Var;
        f63 f63Var2 = f63Var.I;
        c72 c72Var = f63Var.H;
        if (!h12.c(f63Var2 != null ? f63Var2.H : null, c72Var)) {
            c72Var.R.p.H.f();
            return;
        }
        k9 k9VarE = c72Var.R.p.e();
        if (k9VarE == null || (d72Var = ((ti2) k9VarE).H) == null) {
            return;
        }
        d72Var.f();
    }

    @Override // defpackage.wi2
    public boolean K() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void S(c72 c72Var, rp1 rp1Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        w03 w03Var = this.E;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (w03Var != null) {
            Object[] objArr = w03Var.c;
            long[] jArr3 = w03Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                x03 x03Var = (x03) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = x03Var.b;
                                long[] jArr4 = x03Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    c72 c72Var2 = (c72) ((g95) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (c72Var2 != null) {
                                                        boolean zG = c72Var2.G();
                                                        i4 = i8;
                                                        if (zG) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    x03Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        w03 w03Var2 = this.E;
        if (w03Var2 != null) {
            long[] jArr5 = w03Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((x03) w03Var2.c[i18]).g()) {
                                    w03Var2.k(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        w03 w03Var3 = this.E;
        if (w03Var3 == null) {
            w03Var3 = new w03();
            this.E = w03Var3;
        }
        Object objG = w03Var3.g(rp1Var);
        if (objG == null) {
            objG = new x03();
            w03Var3.l(rp1Var, objG);
        }
        ((x03) objG).k(new g95(c72Var));
    }

    @Override // defpackage.wi2
    public final vi2 T(int i, int i2, Map map, if1 if1Var, if1 if1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            cz1.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new bf2(i, i2, map, if1Var, if1Var2, this);
    }

    public abstract int X(pp1 pp1Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(final lg3 lg3Var, final long j, final long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        c72 c72Var;
        int i;
        char c2;
        long j6;
        cf2 cf2VarI0;
        wb3 snapshotObserver;
        w03 w03Var = this.E;
        c6 c6Var = this.D;
        if (c6Var == null) {
            c6Var = new c6();
            this.D = c6Var;
        }
        c6 c6Var2 = c6Var;
        ub3 ub3Var = g0().A;
        if (ub3Var != null && (snapshotObserver = ((ra) ub3Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.e(lg3Var, F, new gf1() { // from class: ze2
                @Override // defpackage.gf1
                public final Object invoke() {
                    cf2 cf2Var = this.n;
                    cf2Var.k0().n = false;
                    cf2Var.k0().o = j;
                    cf2Var.k0().p = j2;
                    if1 if1VarG = lg3Var.n.g();
                    if (if1VarG != null) {
                        if1VarG.invoke(cf2Var.k0());
                    }
                    return j15.a;
                }
            });
        }
        boolean zK = K();
        x03 x03Var = (x03) c6Var2.e;
        x03 x03Var2 = (x03) c6Var2.f;
        int i2 = c6Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c6Var2.d)[i3];
            if (b == 3) {
                rp1 rp1Var = ((rp1[]) c6Var2.b)[i3];
                rp1Var.getClass();
                x03Var2.k(rp1Var);
            } else if (b != 0 && w03Var != null) {
                rp1 rp1Var2 = ((rp1[]) c6Var2.b)[i3];
                rp1Var2.getClass();
                x03 x03Var3 = (x03) w03Var.j(rp1Var2);
                if (x03Var3 != null) {
                    x03Var.j(x03Var3);
                }
            }
        }
        int i4 = c6Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c6Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                rp1[] rp1VarArr = (rp1[]) c6Var2.b;
                rp1VarArr[i6 - i5] = rp1VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c6Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((rp1[]) c6Var2.b)[i8] = null;
        }
        c6Var2.a -= i5;
        cf2 cf2VarI1 = i0();
        Object[] objArr = x03Var2.b;
        long[] jArr = x03Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            rp1 rp1Var3 = (rp1) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            cf2 cf2Var = cf2VarI1 == null ? this : cf2VarI1;
                            i = i9;
                            cf2 cf2Var2 = cf2Var;
                            while (true) {
                                c6 c6Var3 = cf2Var2.D;
                                if ((c6Var3 != null && ti.m0((rp1[]) c6Var3.b, rp1Var3) >= 0) || (cf2VarI0 = cf2Var2.i0()) == null) {
                                    break;
                                } else {
                                    cf2Var2 = cf2VarI0;
                                }
                            }
                            w03 w03Var2 = cf2Var2.E;
                            x03 x03Var4 = w03Var2 != null ? (x03) w03Var2.j(rp1Var3) : null;
                            if (x03Var4 != null) {
                                cf2Var.m0(x03Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        x03Var2.b();
        Object[] objArr2 = x03Var.b;
        long[] jArr2 = x03Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (c72Var = (c72) ((g95) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zK) {
                                c72Var.T(false);
                            } else {
                                c72Var.V(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        x03Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x011f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    public final void b0(vi2 vi2Var) {
        long j;
        char c;
        long j2;
        long j3;
        af2 af2Var;
        w03 w03Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        c6 c6Var;
        w03 w03Var2;
        x03 x03Var;
        af2 af2Var2;
        long j4;
        if (this.B) {
            return;
        }
        if1 if1VarG = vi2Var.g();
        wf1 wf1VarF = vi2Var.f();
        if1 if1VarE = vi2Var.e();
        long jK = 0;
        if (wf1VarF == null) {
            long jK2 = 9223372034707292159L;
            if (if1VarG == null) {
                o0();
                this.t = null;
                this.u = null;
                this.v = null;
                af2 af2Var3 = this.s;
                if (af2Var3 != null) {
                    af2Var3.n = false;
                }
                if (af2Var3 != null) {
                    af2Var3.o = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.u = null;
            this.v = null;
            boolean z2 = this.t != if1VarG;
            if (!z2 && k0().n) {
                q62 q62VarE0 = e0();
                jK2 = ji2.K(q62VarE0.q(0L));
                jK = q62VarE0.k();
                z2 = (g02.a(jK2, k0().o) && n02.a(jK, k0().p)) ? false : true;
            }
            if (z2) {
                lg3 lg3Var = this.w;
                if (lg3Var != null) {
                    lg3Var.n = vi2Var;
                } else {
                    lg3Var = new lg3(vi2Var, this, null);
                    this.w = lg3Var;
                }
                Z(lg3Var, jK2, jK);
                this.t = vi2Var.g();
                return;
            }
            return;
        }
        if (wf1VarF != this.u || if1VarE != this.v) {
            this.u = wf1VarF;
            this.v = if1VarE;
            o0();
            return;
        }
        w03 w03Var3 = this.z;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (w03Var3 != null) {
            Object[] objArr3 = w03Var3.c;
            long[] jArr3 = w03Var3.a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                af2Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                af2 af2Var4 = (af2) objArr3[(i4 << 3) + i6];
                                if (af2Var4.n) {
                                    af2Var2 = af2Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                af2Var2 = null;
            }
            af2Var = af2Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            af2Var = null;
        }
        if (af2Var == null) {
            return;
        }
        q62 q62VarE1 = e0();
        long jK3 = ji2.K(q62VarE1.q(0L));
        long jK4 = q62VarE1.k();
        if ((g02.a(jK3, af2Var.o) && n02.a(jK4, af2Var.p)) || (w03Var = this.z) == null) {
            return;
        }
        Object[] objArr4 = w03Var.b;
        Object[] objArr5 = w03Var.c;
        long[] jArr4 = w03Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        af2 af2Var5 = (af2) objArr5[i11];
                        i2 = i3;
                        rp1 rp1Var = (rp1) obj;
                        jArr2 = jArr4;
                        if (af2Var5.n) {
                            objArr2 = objArr4;
                            z = (n02.a(af2Var5.p, jK4) && g02.a(af2Var5.o, jK3)) ? false : true;
                            af2Var5.p = jK4;
                            af2Var5.o = jK3;
                            af2Var5.n = false;
                            if (!z) {
                                c6Var = this.D;
                                if (c6Var != null) {
                                    c6Var.u(rp1Var);
                                }
                                w03Var2 = this.E;
                                if (w03Var2 != null) {
                                    x03Var = (x03) w03Var2.g(rp1Var);
                                } else {
                                    x03Var = null;
                                }
                                if (x03Var != null) {
                                    m0(x03Var);
                                    x03Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        af2Var5.p = jK4;
                        af2Var5.o = jK3;
                        af2Var5.n = false;
                        if (!z) {
                            c6Var = this.D;
                            if (c6Var != null) {
                                c6Var.u(rp1Var);
                            }
                            w03Var2 = this.E;
                            if (w03Var2 != null) {
                                x03Var = (x03) w03Var2.g(rp1Var);
                            } else {
                                x03Var = null;
                            }
                            if (x03Var != null) {
                                m0(x03Var);
                                x03Var.b();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
    }

    public final int c0(pp1 pp1Var) {
        int iX;
        if (f0() && (iX = X(pp1Var)) != Integer.MIN_VALUE) {
            return iX + ((int) (this.r & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract cf2 d0();

    public abstract q62 e0();

    public abstract boolean f0();

    public abstract c72 g0();

    public abstract vi2 h0();

    public abstract cf2 i0();

    @Override // defpackage.vb3
    public boolean j() {
        return g0().G();
    }

    public abstract long j0();

    public final af2 k0() {
        af2 af2Var = this.s;
        if (af2Var != null) {
            return af2Var;
        }
        af2 af2Var2 = new af2(this);
        this.s = af2Var2;
        return af2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(x03 x03Var) {
        c72 c72Var;
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
                    if ((255 & j) < 128 && (c72Var = (c72) ((g95) objArr[(i << 3) + i3]).get()) != null) {
                        if (K()) {
                            c72Var.T(false);
                        } else {
                            c72Var.V(false);
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

    public abstract void n0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void o0() {
        c6 c6Var = this.D;
        if (c6Var != null) {
            int i = c6Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((rp1[]) c6Var.b)[i2] = null;
                ((float[]) c6Var.c)[i2] = Float.NaN;
                ((byte[]) c6Var.d)[i2] = 0;
            }
            c6Var.a = 0;
        }
        w03 w03Var = this.E;
        if (w03Var == null) {
            return;
        }
        Object[] objArr = w03Var.c;
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
                            m0((x03) objArr[(i3 << 3) + i5]);
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
        w03Var.a();
    }

    @Override // defpackage.yx2
    public final void x(boolean z) {
        cf2 cf2VarI0 = i0();
        c72 c72VarG0 = cf2VarI0 != null ? cf2VarI0.g0() : null;
        if (h12.c(c72VarG0, g0())) {
            this.y = z;
            return;
        }
        if ((c72VarG0 != null ? c72VarG0.R.d : null) != y62.p) {
            if ((c72VarG0 != null ? c72VarG0.R.d : null) != y62.q) {
                return;
            }
        }
        this.y = z;
    }
}
