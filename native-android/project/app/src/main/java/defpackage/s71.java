package defpackage;

import androidx.media3.common.ParserException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s71 implements k51 {
    public m51 e;
    public wv4 f;
    public qv2 h;
    public v71 i;
    public int j;
    public int k;
    public r71 l;
    public int m;
    public long n;
    public final byte[] a = new byte[42];
    public final be3 b = new be3(0, new byte[32768]);
    public final boolean c = false;
    public final t71 d = new t71();
    public int g = 0;

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        v71 v71Var;
        m84 boVar;
        long j;
        long j2;
        boolean zH;
        int i = this.g;
        qv2 qv2Var = null;
        boolean z = true;
        int i2 = 0;
        if (i == 0) {
            l51Var.k();
            long jF = l51Var.f();
            qv2 qv2VarA = new ov1(0).a(l51Var, !this.c ? null : mv1.o, 0);
            if (qv2VarA != null && qv2VarA.a.length != 0) {
                qv2Var = qv2VarA;
            }
            l51Var.l((int) (l51Var.f() - jF));
            this.h = qv2Var;
            this.g = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            l51Var.n(bArr, 0, bArr.length);
            l51Var.k();
            this.g = 2;
            return 0;
        }
        int i3 = 4;
        int i4 = 3;
        if (i == 2) {
            be3 be3Var = new be3(4);
            l51Var.readFully(be3Var.a, 0, 4);
            if (be3Var.C() != 1716281667) {
                throw ParserException.a(null, "Failed to read FLAC stream marker.");
            }
            this.g = 3;
            return 0;
        }
        int i5 = 7;
        int i6 = 6;
        if (i == 3) {
            int i7 = 0;
            v71 v71Var2 = this.i;
            boolean z2 = false;
            while (!z2) {
                l51Var.k();
                byte[] bArr2 = new byte[i3];
                h00 h00Var = new h00(i3, bArr2);
                int i8 = i7;
                l51Var.n(bArr2, i8, i3);
                boolean zH2 = h00Var.h();
                int i9 = h00Var.i(i5);
                int i10 = h00Var.i(24) + i3;
                if (i9 == 0) {
                    byte[] bArr3 = new byte[38];
                    l51Var.readFully(bArr3, i8, 38);
                    v71Var2 = new v71(i3, bArr3);
                } else {
                    if (v71Var2 == null) {
                        nz2.c();
                        return 0;
                    }
                    qv2 qv2Var2 = v71Var2.l;
                    if (i9 == i4) {
                        be3 be3Var2 = new be3(i10);
                        l51Var.readFully(be3Var2.a, i8, i10);
                        v71Var2 = new v71(v71Var2.a, v71Var2.b, v71Var2.c, v71Var2.d, v71Var2.e, v71Var2.g, v71Var2.h, v71Var2.j, l93.Y(be3Var2), v71Var2.l);
                    } else {
                        if (i9 == i3) {
                            be3 be3Var3 = new be3(i10);
                            l51Var.readFully(be3Var3.a, 0, i10);
                            be3Var3.O(i3);
                            qv2 qv2VarW = zz1.w(Arrays.asList((String[]) zz1.C(be3Var3, false, false).n));
                            if (qv2Var2 != null) {
                                qv2VarW = qv2Var2.b(qv2VarW);
                            }
                            v71Var = new v71(v71Var2.a, v71Var2.b, v71Var2.c, v71Var2.d, v71Var2.e, v71Var2.g, v71Var2.h, v71Var2.j, v71Var2.k, qv2VarW);
                        } else if (i9 == i6) {
                            be3 be3Var4 = new be3(i10);
                            l51Var.readFully(be3Var4.a, 0, i10);
                            be3Var4.O(4);
                            qv2 qv2Var3 = new qv2(yw1.o(dg3.d(be3Var4)));
                            if (qv2Var2 != null) {
                                qv2Var3 = qv2Var2.b(qv2Var3);
                            }
                            v71Var = new v71(v71Var2.a, v71Var2.b, v71Var2.c, v71Var2.d, v71Var2.e, v71Var2.g, v71Var2.h, v71Var2.j, v71Var2.k, qv2Var3);
                        } else {
                            l51Var.l(i10);
                        }
                        v71Var2 = v71Var;
                    }
                }
                String str = f35.a;
                this.i = v71Var2;
                z2 = zH2;
                i3 = 4;
                i4 = 3;
                i5 = 7;
                i6 = 6;
                i7 = 0;
            }
            this.i.getClass();
            this.j = Math.max(this.i.c, 6);
            tb1 tb1VarC = this.i.c(bArr, this.h);
            wv4 wv4Var = this.f;
            sb1 sb1VarA = tb1VarC.a();
            sb1VarA.l = lw2.m("audio/flac");
            f34.l(sb1VarA, wv4Var);
            this.f.d(this.i.b());
            this.g = 4;
            return 0;
        }
        long j3 = 0;
        if (i == 4) {
            l51Var.k();
            be3 be3Var5 = new be3(2);
            l51Var.n(be3Var5.a, 0, 2);
            int iH = be3Var5.H();
            if ((iH >> 2) != 16382) {
                l51Var.k();
                throw ParserException.a(null, "First frame does not start with sync code.");
            }
            l51Var.k();
            this.k = iH;
            m51 m51Var = this.e;
            String str2 = f35.a;
            long position = l51Var.getPosition();
            long length = l51Var.getLength();
            this.i.getClass();
            v71 v71Var3 = this.i;
            rm3 rm3Var = v71Var3.k;
            if (rm3Var != null && ((long[]) rm3Var.n).length > 0) {
                boVar = new bo(v71Var3, position, 1);
                i2 = 0;
            } else if (length == -1 || v71Var3.j <= 0) {
                i2 = 0;
                boVar = new bo(v71Var3.b());
            } else {
                int i11 = this.k;
                int i12 = v71Var3.c;
                cn cnVar = new cn(13, v71Var3);
                q71 q71Var = new q71(v71Var3, i11);
                long jB = v71Var3.b();
                long j4 = v71Var3.j;
                int i13 = v71Var3.d;
                if (i13 > 0) {
                    j = ((((long) i13) + ((long) i12)) / 2) + 1;
                } else {
                    int i14 = v71Var3.a;
                    j = 64 + (((((i14 != v71Var3.b || i14 <= 0) ? 4096L : i14) * ((long) v71Var3.g)) * ((long) v71Var3.h)) / 8);
                }
                r71 r71Var = new r71(cnVar, q71Var, jB, j4, position, length, j, Math.max(6, i12));
                this.l = r71Var;
                boVar = r71Var.a;
            }
            m51Var.w(boVar);
            this.g = 5;
            return i2;
        }
        if (i != 5) {
            tb4.a();
            return 0;
        }
        this.f.getClass();
        this.i.getClass();
        r71 r71Var2 = this.l;
        if (r71Var2 != null && r71Var2.c != null) {
            return r71Var2.b(l51Var, t71Var);
        }
        if (this.n == -1) {
            v71 v71Var4 = this.i;
            l51Var.k();
            l51Var.g(1);
            byte[] bArr4 = new byte[1];
            l51Var.n(bArr4, 0, 1);
            boolean z3 = (bArr4[0] & 1) == 1;
            l51Var.g(2);
            i5 = z3 ? 7 : 6;
            be3 be3Var6 = new be3(i5);
            byte[] bArr5 = be3Var6.a;
            int i15 = 0;
            while (i15 < i5) {
                int i16 = l51Var.i(bArr5, i15, i5 - i15);
                if (i16 == -1) {
                    break;
                }
                i15 += i16;
            }
            be3Var6.M(i15);
            l51Var.k();
            try {
                long jI = be3Var6.I();
                if (!z3) {
                    jI *= (long) v71Var4.b;
                }
                long j5 = v71Var4.j;
                if (j5 == 0 || jI <= j5) {
                    j3 = jI;
                } else {
                    z = false;
                }
            } catch (NumberFormatException unused) {
            }
            if (!z) {
                throw ParserException.a(null, null);
            }
            this.n = j3;
        } else {
            be3 be3Var7 = this.b;
            int i17 = be3Var7.c;
            if (i17 < 32768) {
                int i18 = l51Var.read(be3Var7.a, i17, 32768 - i17);
                z = i18 == -1;
                if (!z) {
                    be3Var7.M(i17 + i18);
                } else if (be3Var7.a() == 0) {
                    long j6 = this.n * 1000000;
                    v71 v71Var5 = this.i;
                    String str3 = f35.a;
                    this.f.a(j6 / ((long) v71Var5.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i19 = be3Var7.b;
            int i20 = this.m;
            int i21 = this.j;
            if (i20 < i21) {
                be3Var7.O(Math.min(i21 - i20, be3Var7.a()));
            }
            this.i.getClass();
            int i22 = be3Var7.b;
            while (true) {
                int i23 = be3Var7.c - 16;
                t71 t71Var2 = this.d;
                if (i22 > i23) {
                    if (z) {
                        while (true) {
                            int i24 = be3Var7.c;
                            if (i22 <= i24 - this.j) {
                                be3Var7.N(i22);
                                try {
                                    zH = rr2.h(be3Var7, this.i, this.k, t71Var2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zH = false;
                                }
                                if (be3Var7.b > be3Var7.c) {
                                    zH = false;
                                }
                                if (zH) {
                                    be3Var7.N(i22);
                                    j2 = t71Var2.a;
                                    break;
                                }
                                i22++;
                            } else {
                                be3Var7.N(i24);
                            }
                        }
                    } else {
                        be3Var7.N(i22);
                    }
                    j2 = -1;
                    break;
                }
                be3Var7.N(i22);
                if (rr2.h(be3Var7, this.i, this.k, t71Var2)) {
                    be3Var7.N(i22);
                    j2 = t71Var2.a;
                    break;
                }
                i22++;
            }
            int i25 = be3Var7.b - i19;
            be3Var7.N(i19);
            this.f.e(i25, be3Var7);
            int i26 = this.m + i25;
            this.m = i26;
            if (j2 != -1) {
                long j7 = this.n * 1000000;
                v71 v71Var6 = this.i;
                String str4 = f35.a;
                this.f.a(j7 / ((long) v71Var6.e), 1, i26, 0, null);
                this.m = 0;
                this.n = j2;
            }
            int length2 = be3Var7.a.length - be3Var7.c;
            if (be3Var7.a() < 16 && length2 < 16) {
                int iA = be3Var7.a();
                byte[] bArr6 = be3Var7.a;
                System.arraycopy(bArr6, be3Var7.b, bArr6, 0, iA);
                be3Var7.N(0);
                be3Var7.M(iA);
            }
        }
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        qv2 qv2VarA = new ov1(0).a(l51Var, mv1.o, 0);
        if (qv2VarA != null) {
            int length = qv2VarA.a.length;
        }
        be3 be3Var = new be3(4);
        ((rk0) l51Var).e(be3Var.a, 0, 4, false);
        return be3Var.C() == 1716281667;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            r71 r71Var = this.l;
            if (r71Var != null) {
                r71Var.d(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.K(0);
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.e = m51Var;
        this.f = m51Var.t(0, 1);
        m51Var.p();
    }
}
