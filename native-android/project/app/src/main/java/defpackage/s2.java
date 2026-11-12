package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements mz0 {
    public final /* synthetic */ int a;
    public final h00 b;
    public final be3 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public wv4 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public tb1 m;
    public int n;
    public long o;

    public s2(int i, int i2, String str, String str2) {
        this.a = i2;
        switch (i2) {
            case 1:
                h00 h00Var = new h00(16, new byte[16]);
                this.b = h00Var;
                this.c = new be3(h00Var.b);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                h00 h00Var2 = new h00(128, new byte[128]);
                this.b = h00Var2;
                this.c = new be3(h00Var2.b);
                this.i = 0;
                this.o = -9223372036854775807L;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    private final void b(boolean z) {
    }

    private final void g(boolean z) {
    }

    /* JADX WARN: Code duplicated, block: B:183:0x0369  */
    /* JADX WARN: Code duplicated, block: B:186:0x0377  */
    /* JADX WARN: Code duplicated, block: B:188:0x037f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0395 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:196:0x0397  */
    /* JADX WARN: Code duplicated, block: B:197:0x039c  */
    /* JADX WARN: Code duplicated, block: B:199:0x039f  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mz0
    public final void a(be3 be3Var) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j;
        be3Var = be3Var;
        int i20 = this.a;
        int i21 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        h00 h00Var = this.b;
        long j2 = -9223372036854775807L;
        int i22 = 0;
        int i23 = 1;
        int i24 = 2;
        be3 be3Var2 = this.c;
        int i25 = 16;
        switch (i20) {
            case 0:
                this.h.getClass();
                while (be3Var.a() > 0) {
                    int i26 = this.i;
                    if (i26 == 0) {
                        while (true) {
                            if (be3Var.a() <= 0) {
                                i22 = 0;
                                i23 = 1;
                                i24 = 2;
                            } else if (this.k) {
                                int iA = be3Var.A();
                                if (iA == 119) {
                                    this.k = false;
                                    i23 = 1;
                                    this.i = 1;
                                    byte[] bArr = be3Var2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    i24 = 2;
                                    i22 = 0;
                                } else {
                                    this.k = iA == 11;
                                }
                            } else {
                                this.k = be3Var.A() == 11;
                            }
                        }
                    } else if (i26 == i23) {
                        byte[] bArr2 = be3Var2.a;
                        int iMin = Math.min(be3Var.a(), 128 - this.j);
                        be3Var.k(bArr2, this.j, iMin);
                        int i27 = this.j + iMin;
                        this.j = i27;
                        if (i27 == 128) {
                            h00Var.q(i22);
                            int[] iArr = fu.q;
                            int[] iArr2 = fu.o;
                            int iG = h00Var.g();
                            h00Var.t(40);
                            int i28 = h00Var.i(5) > 10 ? i23 : 0;
                            h00Var.q(iG);
                            if (i28 != 0) {
                                h00Var.t(i25);
                                int i29 = h00Var.i(i24);
                                if (i29 == 0) {
                                    i7 = 0;
                                } else if (i29 != i23) {
                                    i7 = i29 != i24 ? -1 : i24;
                                } else {
                                    i7 = i23;
                                }
                                h00Var.t(3);
                                i5 = (h00Var.i(11) + i23) * i24;
                                int i30 = h00Var.i(i24);
                                if (i30 == 3) {
                                    i6 = fu.p[h00Var.i(i24)];
                                    i8 = 3;
                                    i9 = 6;
                                } else {
                                    int i31 = h00Var.i(i24);
                                    int i32 = fu.n[i31];
                                    i6 = iArr2[i30];
                                    i8 = i31;
                                    i9 = i32;
                                }
                                i4 = i9 * 256;
                                int i33 = (i5 * i6) / (i9 * 32);
                                int i34 = h00Var.i(3);
                                boolean zH = h00Var.h();
                                int i35 = iArr[i34] + (zH ? 1 : 0);
                                h00Var.t(10);
                                if (h00Var.h()) {
                                    h00Var.t(8);
                                }
                                if (i34 == 0) {
                                    h00Var.t(5);
                                    if (h00Var.h()) {
                                        h00Var.t(8);
                                    }
                                }
                                if (i7 == 1 && h00Var.h()) {
                                    h00Var.t(16);
                                }
                                if (h00Var.h()) {
                                    if (i34 > 2) {
                                        h00Var.t(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i15 = 6;
                                    } else {
                                        i15 = 6;
                                        h00Var.t(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        h00Var.t(i15);
                                    }
                                    if (zH && h00Var.h()) {
                                        h00Var.t(5);
                                    }
                                    if (i7 == 0) {
                                        if (h00Var.h()) {
                                            i16 = 6;
                                            h00Var.t(6);
                                        } else {
                                            i16 = 6;
                                        }
                                        if (i34 == 0 && h00Var.h()) {
                                            h00Var.t(i16);
                                        }
                                        if (h00Var.h()) {
                                            h00Var.t(i16);
                                        }
                                        i10 = i35;
                                        int i36 = h00Var.i(2);
                                        if (i36 == 1) {
                                            h00Var.t(5);
                                        } else if (i36 == 2) {
                                            h00Var.t(12);
                                        } else {
                                            if (i36 == 3) {
                                                int i37 = h00Var.i(5);
                                                if (h00Var.h()) {
                                                    h00Var.t(5);
                                                    if (h00Var.h()) {
                                                        i18 = 4;
                                                        h00Var.t(4);
                                                    } else {
                                                        i18 = 4;
                                                    }
                                                    if (h00Var.h()) {
                                                        h00Var.t(i18);
                                                    }
                                                    if (h00Var.h()) {
                                                        h00Var.t(i18);
                                                    }
                                                    if (h00Var.h()) {
                                                        h00Var.t(i18);
                                                    }
                                                    if (h00Var.h()) {
                                                        h00Var.t(i18);
                                                    }
                                                    if (h00Var.h()) {
                                                        h00Var.t(i18);
                                                    }
                                                    if (h00Var.h()) {
                                                        h00Var.t(i18);
                                                    }
                                                    if (h00Var.h()) {
                                                        if (h00Var.h()) {
                                                            h00Var.t(i18);
                                                        }
                                                        if (h00Var.h()) {
                                                            h00Var.t(i18);
                                                        }
                                                    }
                                                }
                                                if (h00Var.h()) {
                                                    h00Var.t(5);
                                                    if (h00Var.h()) {
                                                        h00Var.t(7);
                                                        if (h00Var.h()) {
                                                            h00Var.t(8);
                                                            i17 = 2;
                                                        } else {
                                                            i17 = 2;
                                                        }
                                                    } else {
                                                        i17 = 2;
                                                    }
                                                } else {
                                                    i17 = 2;
                                                }
                                                h00Var.t((i37 + i17) * 8);
                                                h00Var.c();
                                            }
                                            if (i34 < i17) {
                                                if (h00Var.h()) {
                                                    h00Var.t(14);
                                                }
                                                if (i34 == 0 && h00Var.h()) {
                                                    h00Var.t(14);
                                                }
                                            }
                                            i11 = i8;
                                            if (h00Var.h()) {
                                                if (i11 == 0) {
                                                    h00Var.t(5);
                                                } else {
                                                    for (i19 = 0; i19 < i9; i19++) {
                                                        if (h00Var.h()) {
                                                            h00Var.t(5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i17 = 2;
                                        if (i34 < i17) {
                                            if (h00Var.h()) {
                                                h00Var.t(14);
                                            }
                                            if (i34 == 0) {
                                                h00Var.t(14);
                                            }
                                        }
                                        i11 = i8;
                                        if (h00Var.h()) {
                                            if (i11 == 0) {
                                                h00Var.t(5);
                                            } else {
                                                while (i19 < i9) {
                                                    if (h00Var.h()) {
                                                        h00Var.t(5);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i10 = i35;
                                        i11 = i8;
                                    }
                                } else {
                                    i10 = i35;
                                    i11 = i8;
                                }
                                if (h00Var.h()) {
                                    h00Var.t(5);
                                    if (i34 == 2) {
                                        h00Var.t(4);
                                    }
                                    if (i34 >= 6) {
                                        h00Var.t(2);
                                    }
                                    if (h00Var.h()) {
                                        i14 = 8;
                                        h00Var.t(8);
                                    } else {
                                        i14 = 8;
                                    }
                                    if (i34 == 0 && h00Var.h()) {
                                        h00Var.t(i14);
                                    }
                                    i12 = 3;
                                    if (i30 < 3) {
                                        h00Var.s();
                                    }
                                } else {
                                    i12 = 3;
                                }
                                if (i7 == 0 && i11 != i12) {
                                    h00Var.s();
                                }
                                if (i7 == 2 && (i11 == i12 || h00Var.h())) {
                                    i13 = 6;
                                    h00Var.t(6);
                                } else {
                                    i13 = 6;
                                }
                                str = (h00Var.h() && h00Var.i(i13) == 1 && h00Var.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i = i33;
                                i3 = i10;
                            } else {
                                h00Var.t(32);
                                int i38 = h00Var.i(2);
                                String str4 = i38 == 3 ? null : "audio/ac3";
                                int i39 = h00Var.i(6);
                                i = fu.r[i39 / 2] * 1000;
                                int iT = fu.t(i38, i39);
                                h00Var.t(8);
                                int i40 = h00Var.i(3);
                                if ((i40 & 1) == 0 || i40 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    h00Var.t(2);
                                }
                                if ((i40 & 4) != 0) {
                                    h00Var.t(i2);
                                }
                                if (i40 == i2) {
                                    h00Var.t(i2);
                                }
                                int i41 = i38 < 3 ? iArr2[i38] : -1;
                                i3 = iArr[i40] + (h00Var.h() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                i5 = iT;
                                i6 = i41;
                            }
                            tb1 tb1Var = this.m;
                            if (tb1Var == null || i3 != tb1Var.F || i6 != tb1Var.G || !Objects.equals(str, tb1Var.n)) {
                                sb1 sb1Var = new sb1();
                                sb1Var.a = this.g;
                                sb1Var.l = lw2.m(str3);
                                sb1Var.m = lw2.m(str);
                                sb1Var.E = i3;
                                sb1Var.F = i6;
                                sb1Var.d = str2;
                                sb1Var.f = i21;
                                sb1Var.i = i;
                                if ("audio/ac3".equals(str)) {
                                    sb1Var.h = i;
                                }
                                tb1 tb1Var2 = new tb1(sb1Var);
                                this.m = tb1Var2;
                                this.h.g(tb1Var2);
                            }
                            this.n = i5;
                            this.l = (((long) i4) * 1000000) / ((long) this.m.G);
                            be3Var2.N(0);
                            this.h.e(128, be3Var2);
                            this.i = 2;
                            i24 = 2;
                            i22 = 0;
                            i23 = 1;
                        } else {
                            be3Var = be3Var;
                        }
                    } else if (i26 == i24) {
                        int iMin2 = Math.min(be3Var.a(), this.n - this.j);
                        this.h.e(iMin2, be3Var);
                        int i42 = this.j + iMin2;
                        this.j = i42;
                        if (i42 == this.n) {
                            rr2.w(this.o != -9223372036854775807L ? i23 : i22);
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = i22;
                        }
                    }
                    i25 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (be3Var.a() > 0) {
                    int i43 = this.i;
                    if (i43 == 0) {
                        j = j2;
                        while (be3Var.a() > 0) {
                            if (this.k) {
                                int iA2 = be3Var.A();
                                this.k = iA2 == 172;
                                if (iA2 == 64 || iA2 == 65) {
                                    Object[] objArr = iA2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = be3Var2.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = be3Var.A() == 172;
                            }
                        }
                    } else if (i43 == 1) {
                        j = j2;
                        byte[] bArr4 = be3Var2.a;
                        int iMin3 = Math.min(be3Var.a(), 16 - this.j);
                        be3Var.k(bArr4, this.j, iMin3);
                        int i44 = this.j + iMin3;
                        this.j = i44;
                        if (i44 == 16) {
                            h00Var.q(0);
                            v2 v2VarD = hw.D(h00Var);
                            int i45 = v2VarD.a;
                            tb1 tb1Var3 = this.m;
                            if (tb1Var3 == null || 2 != tb1Var3.F || i45 != tb1Var3.G || !"audio/ac4".equals(tb1Var3.n)) {
                                sb1 sb1Var2 = new sb1();
                                sb1Var2.a = this.g;
                                sb1Var2.l = lw2.m(str3);
                                sb1Var2.m = lw2.m("audio/ac4");
                                sb1Var2.E = 2;
                                sb1Var2.F = i45;
                                sb1Var2.d = str2;
                                sb1Var2.f = i21;
                                tb1 tb1Var4 = new tb1(sb1Var2);
                                this.m = tb1Var4;
                                this.h.g(tb1Var4);
                            }
                            this.n = v2VarD.b;
                            this.l = (((long) v2VarD.c) * 1000000) / ((long) this.m.G);
                            be3Var2.N(0);
                            this.h.e(16, be3Var2);
                            this.i = 2;
                        }
                    } else if (i43 == 2) {
                        int iMin4 = Math.min(be3Var.a(), this.n - this.j);
                        this.h.e(iMin4, be3Var);
                        int i46 = this.j + iMin4;
                        this.j = i46;
                        if (i46 == this.n) {
                            rr2.w(this.o != j2);
                            j = j2;
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        switch (this.a) {
            case 0:
                sy4Var.a();
                sy4Var.b();
                this.g = sy4Var.e;
                sy4Var.b();
                this.h = m51Var.t(sy4Var.d, 1);
                break;
            default:
                sy4Var.a();
                sy4Var.b();
                this.g = sy4Var.e;
                sy4Var.b();
                this.h = m51Var.t(sy4Var.d, 1);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s2(String str) {
        this(0, 0, null, str);
        this.a = 0;
    }
}
