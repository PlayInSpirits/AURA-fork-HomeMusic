package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jx0 implements mz0 {
    public final be3 a;
    public final String c;
    public final int d;
    public String f;
    public wv4 g;
    public int i;
    public int j;
    public long k;
    public tb1 l;
    public int m;
    public int n;
    public int h = 0;
    public long q = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int o = -1;
    public int p = -1;
    public final String e = "video/mp2t";

    public jx0(String str, int i, int i2) {
        this.a = new be3(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.mz0
    public final void a(be3 be3Var) throws ParserException {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long jA0;
        int i9;
        long jA1;
        int i10;
        int i11;
        int i12;
        int i13;
        this.g.getClass();
        while (be3Var.a() > 0) {
            int i14 = this.h;
            be3 be3Var2 = this.a;
            switch (i14) {
                case 0:
                    while (be3Var.a() > 0) {
                        int i15 = this.j << 8;
                        this.j = i15;
                        int iA = i15 | be3Var.A();
                        this.j = iA;
                        int iZ = e35.z(iA);
                        this.n = iZ;
                        if (iZ != 0) {
                            byte[] bArr = be3Var2.a;
                            int i16 = this.j;
                            bArr[0] = (byte) ((i16 >> 24) & 255);
                            bArr[1] = (byte) ((i16 >> 16) & 255);
                            bArr[2] = (byte) ((i16 >> 8) & 255);
                            bArr[3] = (byte) (i16 & 255);
                            this.i = 4;
                            this.j = 0;
                            if (iZ != 3 && iZ != 4) {
                                if (iZ == 1) {
                                    this.h = 1;
                                } else {
                                    this.h = 2;
                                }
                            }
                            this.h = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (b(be3Var, be3Var2.a, 18)) {
                        byte[] bArr2 = be3Var2.a;
                        if (this.l == null) {
                            String str = this.f;
                            h00 h00VarA = e35.A(bArr2);
                            h00VarA.t(60);
                            int i17 = e35.e[h00VarA.i(6)];
                            int i18 = e35.f[h00VarA.i(4)];
                            int i19 = h00VarA.i(5);
                            int i20 = i19 >= 29 ? -1 : (e35.g[i19] * 1000) / 2;
                            h00VarA.t(10);
                            int i21 = i17 + (h00VarA.i(2) > 0 ? 1 : 0);
                            sb1 sb1Var = new sb1();
                            sb1Var.a = str;
                            sb1Var.l = lw2.m(this.e);
                            sb1Var.m = lw2.m("audio/vnd.dts");
                            sb1Var.h = i20;
                            sb1Var.E = i21;
                            sb1Var.F = i18;
                            sb1Var.q = null;
                            sb1Var.d = this.c;
                            sb1Var.f = this.d;
                            tb1 tb1Var = new tb1(sb1Var);
                            this.l = tb1Var;
                            this.g.g(tb1Var);
                        }
                        this.m = e35.y(bArr2);
                        byte b3 = bArr2[0];
                        if (b3 != -2) {
                            if (b3 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b3 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.k = jz4.m(f35.Y(this.l.G, (((i2 >> 2) | i) + 1) * 32));
                            be3Var2.N(0);
                            this.g.e(18, be3Var2);
                            this.h = 6;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.k = jz4.m(f35.Y(this.l.G, (((i2 >> 2) | i) + 1) * 32));
                        be3Var2.N(0);
                        this.g.e(18, be3Var2);
                        this.h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (b(be3Var, be3Var2.a, 7)) {
                        h00 h00VarA2 = e35.A(be3Var2.a);
                        h00VarA2.t(42);
                        this.o = h00VarA2.i(h00VarA2.h() ? 12 : 8) + 1;
                        this.h = 3;
                    }
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    int i22 = 8;
                    if (b(be3Var, be3Var2.a, this.o)) {
                        h00 h00VarA3 = e35.A(be3Var2.a);
                        h00VarA3.t(40);
                        int i23 = h00VarA3.i(2);
                        if (h00VarA3.h()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        h00VarA3.t(i4);
                        int i24 = h00VarA3.i(i3) + 1;
                        boolean zH = h00VarA3.h();
                        if (zH) {
                            i5 = h00VarA3.i(2);
                            i6 = (h00VarA3.i(3) + 1) * 512;
                            if (h00VarA3.h()) {
                                h00VarA3.t(36);
                            }
                            int i25 = h00VarA3.i(3) + 1;
                            int i26 = h00VarA3.i(3) + 1;
                            if (i25 != 1 || i26 != 1) {
                                throw ParserException.c("Multiple audio presentations or assets not supported");
                            }
                            int i27 = i23 + 1;
                            int i28 = h00VarA3.i(i27);
                            int i29 = 0;
                            while (i29 < i27) {
                                if (((i28 >> i29) & 1) == 1) {
                                    h00VarA3.t(i22);
                                }
                                i29++;
                                i22 = 8;
                            }
                            if (h00VarA3.h()) {
                                h00VarA3.t(2);
                                int i30 = (h00VarA3.i(2) + 1) << 2;
                                int i31 = h00VarA3.i(2) + 1;
                                for (int i32 = 0; i32 < i31; i32++) {
                                    h00VarA3.t(i30);
                                }
                            }
                        } else {
                            i5 = -1;
                            i6 = 0;
                        }
                        h00VarA3.t(i3);
                        h00VarA3.t(12);
                        if (zH) {
                            if (h00VarA3.h()) {
                                h00VarA3.t(4);
                            }
                            if (h00VarA3.h()) {
                                h00VarA3.t(24);
                            }
                            if (h00VarA3.h()) {
                                h00VarA3.u(h00VarA3.i(10) + 1);
                            }
                            h00VarA3.t(5);
                            i8 = e35.h[h00VarA3.i(4)];
                            i7 = h00VarA3.i(8) + 1;
                        } else {
                            i7 = -1;
                            i8 = -2147483647;
                        }
                        if (zH) {
                            if (i5 == 0) {
                                i9 = 32000;
                            } else if (i5 == 1) {
                                i9 = 44100;
                            } else {
                                if (i5 != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + i5);
                                }
                                i9 = 48000;
                            }
                            String str2 = f35.a;
                            jA0 = f35.a0(i6, 1000000L, i9, RoundingMode.DOWN);
                        } else {
                            jA0 = -9223372036854775807L;
                        }
                        g(new g("audio/vnd.dts.hd;profile=lbr", i7, i8, i24, jA0));
                        this.m = i24;
                        this.k = jA0 == -9223372036854775807L ? 0L : jA0;
                        be3Var2.N(0);
                        this.g.e(this.o, be3Var2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (b(be3Var, be3Var2.a, 6)) {
                        h00 h00VarA4 = e35.A(be3Var2.a);
                        h00VarA4.t(32);
                        int iO = e35.O(h00VarA4, e35.m) + 1;
                        this.p = iO;
                        int i33 = this.i;
                        if (i33 > iO) {
                            int i34 = i33 - iO;
                            this.i = i33 - i34;
                            be3Var.N(be3Var.b - i34);
                        }
                        this.h = 5;
                    }
                    break;
                case 5:
                    if (b(be3Var, be3Var2.a, this.p)) {
                        byte[] bArr3 = be3Var2.a;
                        h00 h00VarA5 = e35.A(bArr3);
                        int i35 = h00VarA5.i(32) == 1078008818 ? 1 : 0;
                        int iO2 = e35.O(h00VarA5, e35.i);
                        int i36 = iO2 + 1;
                        if (i35 == 0) {
                            jA1 = -9223372036854775807L;
                            i10 = -2147483647;
                        } else {
                            if (!h00VarA5.h()) {
                                throw ParserException.c("Only supports full channel mask-based audio presentation");
                            }
                            int i37 = iO2 - 1;
                            int i38 = ((bArr3[i37] << 8) & 65535) | (bArr3[iO2] & 255);
                            String str3 = f35.a;
                            int i39 = 65535;
                            for (int i40 = 0; i40 < i37; i40++) {
                                byte b4 = bArr3[i40];
                                int[] iArr = f35.k;
                                int i41 = (iArr[(((b4 & 255) >> 4) ^ ((i39 >> 12) & 255)) & 255] ^ ((i39 << 4) & 65535)) & 65535;
                                i39 = (iArr[((b4 & 15) ^ ((i41 >> 12) & 255)) & 255] ^ ((i41 << 4) & 65535)) & 65535;
                            }
                            if (i38 != i39) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int i42 = h00VarA5.i(2);
                            if (i42 != 0) {
                                if (i42 == 1) {
                                    i12 = 480;
                                } else {
                                    if (i42 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + i42);
                                    }
                                    i12 = 384;
                                }
                                i11 = 3;
                            } else {
                                i11 = 3;
                                i12 = 512;
                            }
                            int i43 = (h00VarA5.i(i11) + 1) * i12;
                            int i44 = h00VarA5.i(2);
                            if (i44 == 0) {
                                i13 = 32000;
                            } else if (i44 == 1) {
                                i13 = 44100;
                            } else {
                                if (i44 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + i44);
                                }
                                i13 = 48000;
                            }
                            if (h00VarA5.h()) {
                                h00VarA5.t(36);
                            }
                            int i45 = i13 * (1 << h00VarA5.i(2));
                            jA1 = f35.a0(i43, 1000000L, i13, RoundingMode.DOWN);
                            i10 = i45;
                        }
                        int iO3 = 0;
                        for (int i46 = 0; i46 < i35; i46++) {
                            iO3 += e35.O(h00VarA5, e35.j);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i35 != 0) {
                            atomicInteger.set(e35.O(h00VarA5, e35.k));
                        }
                        int iO4 = iO3 + (atomicInteger.get() != 0 ? e35.O(h00VarA5, e35.l) : 0) + i36;
                        g gVar = new g("audio/vnd.dts.uhd;profile=p2", 2, i10, iO4, jA1);
                        if (this.n == 3) {
                            g(gVar);
                        }
                        this.m = iO4;
                        this.k = jA1 == -9223372036854775807L ? 0L : jA1;
                        be3Var2.N(0);
                        this.g.e(this.p, be3Var2);
                        this.h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(be3Var.a(), this.m - this.i);
                    this.g.e(iMin, be3Var);
                    int i47 = this.i + iMin;
                    this.i = i47;
                    if (i47 == this.m) {
                        rr2.w(this.q != -9223372036854775807L);
                        this.g.a(this.q, this.n == 4 ? 0 : 1, this.m, 0, null);
                        this.q += this.k;
                        this.h = 0;
                    }
                    break;
                default:
                    tb4.a();
                    return;
            }
        }
    }

    public final boolean b(be3 be3Var, byte[] bArr, int i) {
        int iMin = Math.min(be3Var.a(), i - this.i);
        be3Var.k(bArr, this.i, iMin);
        int i2 = this.i + iMin;
        this.i = i2;
        return i2 == i;
    }

    @Override // defpackage.mz0
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.q = -9223372036854775807L;
        this.b.set(0);
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.q = j;
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.f = sy4Var.e;
        sy4Var.b();
        this.g = m51Var.t(sy4Var.d, 1);
    }

    public final void g(g gVar) {
        int i = gVar.b;
        String str = gVar.a;
        int i2 = gVar.c;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        tb1 tb1Var = this.l;
        if (tb1Var != null && i2 == tb1Var.F && i == tb1Var.G && str.equals(tb1Var.n)) {
            return;
        }
        tb1 tb1Var2 = this.l;
        sb1 sb1Var = tb1Var2 == null ? new sb1() : tb1Var2.a();
        sb1Var.a = this.f;
        sb1Var.l = lw2.m(this.e);
        sb1Var.m = lw2.m(str);
        sb1Var.E = i2;
        sb1Var.F = i;
        sb1Var.d = this.c;
        sb1Var.f = this.d;
        tb1 tb1Var3 = new tb1(sb1Var);
        this.l = tb1Var3;
        this.g.g(tb1Var3);
    }
}
