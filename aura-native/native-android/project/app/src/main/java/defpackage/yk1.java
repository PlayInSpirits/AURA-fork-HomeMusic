package defpackage;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yk1 implements mz0 {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final r20 a;
    public final be3 b;
    public final boolean[] c = new boolean[4];
    public final wk1 d;
    public final n41 e;
    public xk1 f;
    public long g;
    public String h;
    public wv4 i;
    public boolean j;
    public long k;

    public yk1(r20 r20Var) {
        this.a = r20Var;
        wk1 wk1Var = new wk1();
        wk1Var.e = new byte[128];
        this.d = wk1Var;
        this.k = -9223372036854775807L;
        this.e = new n41(178);
        this.b = new be3();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0234  */
    @Override // defpackage.mz0
    public final void a(be3 be3Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = be3Var.b;
        int i6 = be3Var.c;
        byte[] bArr = be3Var.a;
        this.g += (long) be3Var.a();
        this.i.e(be3Var.a(), be3Var);
        while (true) {
            int iO = uc5.o(bArr, i5, i6, this.c);
            wk1 wk1Var = this.d;
            n41 n41Var = this.e;
            if (iO == i6) {
                if (!this.j) {
                    wk1Var.a(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (n41Var != null) {
                    n41Var.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iO + 3;
            byte b = be3Var.a[i7];
            int i8 = b & 255;
            int i9 = iO - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    wk1Var.a(bArr, i5, iO);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = wk1Var.b;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            l93.q0("H263Reader", "Unexpected start code value");
                            wk1Var.a = false;
                            wk1Var.c = 0;
                            wk1Var.b = 0;
                        } else {
                            wk1Var.b = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                tb4.a();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                wk1Var.c -= i10;
                                wk1Var.a = false;
                                wv4 wv4Var = this.i;
                                int i12 = wk1Var.d;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(wk1Var.e, wk1Var.c);
                                h00 h00Var = new h00(bArrCopyOf.length, bArrCopyOf);
                                h00Var.u(i12);
                                h00Var.u(4);
                                h00Var.s();
                                h00Var.t(8);
                                if (h00Var.h()) {
                                    h00Var.t(4);
                                    h00Var.t(3);
                                }
                                int i13 = h00Var.i(4);
                                if (i13 == 15) {
                                    int i14 = h00Var.i(8);
                                    int i15 = h00Var.i(8);
                                    if (i15 == 0) {
                                        l93.q0("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = i14 / i15;
                                    }
                                } else if (i13 < 7) {
                                    f = l[i13];
                                } else {
                                    l93.q0("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (h00Var.h()) {
                                    h00Var.t(2);
                                    h00Var.t(1);
                                    if (h00Var.h()) {
                                        h00Var.t(15);
                                        h00Var.s();
                                        h00Var.t(15);
                                        h00Var.s();
                                        h00Var.t(15);
                                        h00Var.s();
                                        h00Var.t(3);
                                        h00Var.t(11);
                                        h00Var.s();
                                        h00Var.t(15);
                                        h00Var.s();
                                    }
                                }
                                if (h00Var.i(2) != 0) {
                                    l93.q0("H263Reader", "Unhandled video object layer shape");
                                }
                                h00Var.s();
                                int i16 = h00Var.i(16);
                                h00Var.s();
                                if (h00Var.h()) {
                                    if (i16 == 0) {
                                        l93.q0("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i17 = 0;
                                        for (int i18 = i16 - 1; i18 > 0; i18 >>= 1) {
                                            i17++;
                                        }
                                        h00Var.t(i17);
                                    }
                                }
                                h00Var.s();
                                int i19 = h00Var.i(13);
                                h00Var.s();
                                int i20 = h00Var.i(13);
                                h00Var.s();
                                h00Var.s();
                                sb1 sb1Var = new sb1();
                                sb1Var.a = str;
                                sb1Var.l = lw2.m("video/mp2t");
                                sb1Var.m = lw2.m("video/mp4v-es");
                                sb1Var.t = i19;
                                sb1Var.u = i20;
                                sb1Var.z = f;
                                sb1Var.p = Collections.singletonList(bArrCopyOf);
                                f34.l(sb1Var, wv4Var);
                                this.j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            l93.q0("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            wk1Var.a = false;
                            wk1Var.c = 0;
                            wk1Var.b = 0;
                        } else {
                            i4 = 0;
                            wk1Var.d = wk1Var.c;
                            wk1Var.b = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            l93.q0("H263Reader", "Unexpected start code value");
                            wk1Var.a = false;
                            wk1Var.c = 0;
                            wk1Var.b = 0;
                        } else {
                            wk1Var.b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        wk1Var.b = 1;
                        wk1Var.a = true;
                    }
                }
                wk1Var.a(wk1.f, i4, 3);
            }
            this.f.a(bArr, i5, iO);
            if (n41Var == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    n41Var.a(bArr, i5, iO);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (n41Var.d(i3)) {
                    int iB0 = uc5.b0(n41Var.c, (byte[]) n41Var.f);
                    String str2 = f35.a;
                    byte[] bArr2 = (byte[]) n41Var.f;
                    be3 be3Var2 = this.b;
                    be3Var2.L(iB0, bArr2);
                    this.a.n(this.k, be3Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (be3Var.a[iO + 2] == 1) {
                        n41Var.g(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i21 = i - iO;
            this.f.b(i21, this.g - ((long) i21), this.j);
            xk1 xk1Var = this.f;
            long j = this.k;
            xk1Var.e = i8;
            xk1Var.d = false;
            xk1Var.b = (i8 == 182 || i8 == 179) ? z : false;
            xk1Var.c = i8 == 182 ? z : false;
            xk1Var.f = 0;
            xk1Var.h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        uc5.i(this.c);
        wk1 wk1Var = this.d;
        wk1Var.a = false;
        wk1Var.c = 0;
        wk1Var.b = 0;
        xk1 xk1Var = this.f;
        if (xk1Var != null) {
            xk1Var.b = false;
            xk1Var.c = false;
            xk1Var.d = false;
            xk1Var.e = -1;
        }
        n41 n41Var = this.e;
        if (n41Var != null) {
            n41Var.f();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
        this.f.getClass();
        if (z) {
            this.f.b(0, this.g, this.j);
            xk1 xk1Var = this.f;
            xk1Var.b = false;
            xk1Var.c = false;
            xk1Var.d = false;
            xk1Var.e = -1;
        }
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.k = j;
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.h = sy4Var.e;
        sy4Var.b();
        wv4 wv4VarT = m51Var.t(sy4Var.d, 2);
        this.i = wv4VarT;
        this.f = new xk1(wv4VarT);
        this.a.p(m51Var, sy4Var);
    }
}
