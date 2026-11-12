package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j62 implements mz0 {
    public final String a;
    public final int b;
    public final be3 c;
    public final h00 d;
    public wv4 e;
    public String f;
    public tb1 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public j62(int i, String str) {
        this.a = str;
        this.b = i;
        be3 be3Var = new be3(1024);
        this.c = be3Var;
        byte[] bArr = be3Var.a;
        this.d = new h00(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void a(be3 be3Var) throws ParserException {
        int i;
        boolean zH;
        this.e.getClass();
        while (be3Var.a() > 0) {
            int i2 = this.h;
            if (i2 != 0) {
                if (i2 != 1) {
                    be3 be3Var2 = this.c;
                    h00 h00Var = this.d;
                    if (i2 == 2) {
                        int iA = ((this.k & (-225)) << 8) | be3Var.A();
                        this.j = iA;
                        if (iA > be3Var2.a.length) {
                            be3Var2.K(iA);
                            byte[] bArr = be3Var2.a;
                            h00Var.getClass();
                            h00Var.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i2 != 3) {
                            tb4.a();
                            return;
                        }
                        int iMin = Math.min(be3Var.a(), this.j - this.i);
                        be3Var.k(h00Var.b, this.i, iMin);
                        int i3 = this.i + iMin;
                        this.i = i3;
                        if (i3 == this.j) {
                            h00Var.q(0);
                            if (h00Var.h()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int i4 = h00Var.i(1);
                                int i5 = i4 == 1 ? h00Var.i(1) : 0;
                                this.n = i5;
                                if (i5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 1) {
                                    h00Var.i((h00Var.i(2) + 1) * 8);
                                }
                                if (!h00Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = h00Var.i(6);
                                int i6 = h00Var.i(4);
                                int i7 = h00Var.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 0) {
                                    int iG = h00Var.g();
                                    int iB = h00Var.b();
                                    g gVarD = xl.D(h00Var, true);
                                    this.v = gVarD.a;
                                    this.s = gVarD.b;
                                    this.u = gVarD.c;
                                    int iB2 = iB - h00Var.b();
                                    h00Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    h00Var.j(iB2, bArr2);
                                    sb1 sb1Var = new sb1();
                                    sb1Var.a = this.f;
                                    sb1Var.l = lw2.m("video/mp2t");
                                    sb1Var.m = lw2.m("audio/mp4a-latm");
                                    sb1Var.j = this.v;
                                    sb1Var.E = this.u;
                                    sb1Var.F = this.s;
                                    sb1Var.p = Collections.singletonList(bArr2);
                                    sb1Var.d = this.a;
                                    sb1Var.f = this.b;
                                    tb1 tb1Var = new tb1(sb1Var);
                                    if (!tb1Var.equals(this.g)) {
                                        this.g = tb1Var;
                                        this.t = 1024000000 / ((long) tb1Var.G);
                                        this.e.g(tb1Var);
                                    }
                                } else {
                                    int i8 = h00Var.i((h00Var.i(2) + 1) * 8);
                                    int iB3 = h00Var.b();
                                    g gVarD2 = xl.D(h00Var, true);
                                    this.v = gVarD2.a;
                                    this.s = gVarD2.b;
                                    this.u = gVarD2.c;
                                    h00Var.t(i8 - (iB3 - h00Var.b()));
                                }
                                int i9 = h00Var.i(3);
                                this.p = i9;
                                if (i9 == 0) {
                                    h00Var.t(8);
                                } else if (i9 == 1) {
                                    h00Var.t(9);
                                } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                    h00Var.t(6);
                                } else {
                                    if (i9 != 6 && i9 != 7) {
                                        tb4.a();
                                        return;
                                    }
                                    h00Var.t(1);
                                }
                                boolean zH2 = h00Var.h();
                                this.q = zH2;
                                this.r = 0L;
                                if (zH2) {
                                    if (i4 == 1) {
                                        this.r = h00Var.i((h00Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = h00Var.h();
                                            this.r = (this.r << 8) + ((long) h00Var.i(8));
                                        } while (zH);
                                    }
                                }
                                if (h00Var.h()) {
                                    h00Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                i = h00Var.i(8);
                                i10 += i;
                            } while (i == 255);
                            int iG2 = h00Var.g();
                            if ((iG2 & 7) == 0) {
                                be3Var2.N(iG2 >> 3);
                            } else {
                                h00Var.j(i10 * 8, be3Var2.a);
                                be3Var2.N(0);
                            }
                            this.e.e(i10, be3Var2);
                            rr2.w(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i10, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                h00Var.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iA2 = be3Var.A();
                    if ((iA2 & 224) == 224) {
                        this.k = iA2;
                        this.h = 2;
                    } else if (iA2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (be3Var.A() == 86) {
                this.h = 1;
            }
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.e = m51Var.t(sy4Var.d, 1);
        sy4Var.b();
        this.f = sy4Var.e;
    }
}
