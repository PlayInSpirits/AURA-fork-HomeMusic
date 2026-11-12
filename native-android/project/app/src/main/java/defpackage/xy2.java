package defpackage;

import androidx.media3.common.ParserException;
import com.eddyizm.tempus.homemusic.WaveRetry;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xy2 implements mz0 {
    public String e;
    public wv4 f;
    public boolean i;
    public int k;
    public int l;
    public int n;
    public int o;
    public int s;
    public boolean u;
    public int d = 0;
    public final be3 a = new be3(2, new byte[15]);
    public final h00 b = new h00();
    public final be3 c = new be3();
    public final dl p = new dl();
    public int q = -2147483647;
    public int r = -1;
    public long t = -1;
    public boolean j = true;
    public boolean m = true;
    public double g = -9.223372036854776E18d;
    public double h = -9.223372036854776E18d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02db  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c0, please report this as an issue */
    @Override // defpackage.mz0
    public final void a(be3 be3Var) throws ParserException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        byte[] bArr;
        long j;
        long j2;
        gy3 gy3VarP;
        int i6;
        long j3;
        boolean z;
        int i7;
        this.f.getClass();
        while (be3Var.a() > 0) {
            int i8 = this.d;
            int i9 = 8;
            int i10 = 3;
            int i11 = 1;
            if (i8 != 0) {
                be3 be3Var2 = this.c;
                dl dlVar = this.p;
                if (i8 == 1) {
                    int iA = be3Var.a();
                    be3 be3Var3 = this.a;
                    int iMin = Math.min(iA, be3Var3.a());
                    be3Var.k(be3Var3.a, be3Var3.b, iMin);
                    be3Var3.O(iMin);
                    if (be3Var3.a() == 0) {
                        int i12 = be3Var3.c;
                        byte[] bArr2 = be3Var3.a;
                        h00 h00Var = this.b;
                        h00Var.o(i12, bArr2);
                        h00Var.f();
                        int iG = ji2.G(h00Var, 3, 8, 8);
                        dlVar.o = iG;
                        if (iG != -1) {
                            rr2.l(Math.max(Math.max(2, 8), 32) <= 63);
                            gh0.g(gh0.g(3L, 255L), 4294967296L);
                            if (h00Var.b() < 2) {
                                j3 = -1;
                            } else {
                                long jK = h00Var.k(2);
                                if (jK == 3) {
                                    if (h00Var.b() >= 8) {
                                        long jK2 = h00Var.k(8);
                                        jK += jK2;
                                        if (jK2 == 255) {
                                            if (h00Var.b() >= 32) {
                                                jK = h00Var.k(32) + jK;
                                            }
                                        }
                                    }
                                    j3 = -1;
                                }
                                j3 = jK;
                            }
                            dlVar.p = j3;
                            if (j3 == -1) {
                                z = false;
                            } else {
                                if (j3 > 16) {
                                    throw ParserException.c("Contains sub-stream with an invalid packet label " + dlVar.p);
                                }
                                if (j3 == 0) {
                                    int i13 = dlVar.o;
                                    if (i13 == 1) {
                                        throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i13 == 2) {
                                        throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i13 == 17) {
                                        throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iG2 = ji2.G(h00Var, 11, 24, 24);
                                dlVar.q = iG2;
                                if (iG2 != -1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            i7 = 0;
                            this.n = 0;
                            this.o = dlVar.q + i12 + this.o;
                        } else {
                            i7 = 0;
                        }
                        if (z) {
                            be3Var3.N(i7);
                            this.f.e(be3Var3.c, be3Var3);
                            be3Var3.K(2);
                            be3Var2.K(dlVar.q);
                            this.m = true;
                            this.d = 2;
                        } else {
                            int i14 = be3Var3.c;
                            if (i14 < 15) {
                                be3Var3.M(i14 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i8 != 2) {
                        tb4.a();
                        return;
                    }
                    int i15 = dlVar.o;
                    if (i15 == 1 || i15 == 17) {
                        int i16 = be3Var.b;
                        int iMin2 = Math.min(be3Var.a(), be3Var2.a());
                        be3Var.k(be3Var2.a, be3Var2.b, iMin2);
                        be3Var2.O(iMin2);
                        be3Var.N(i16);
                    }
                    int iMin3 = Math.min(be3Var.a(), dlVar.q - this.n);
                    this.f.e(iMin3, be3Var);
                    int i17 = this.n + iMin3;
                    this.n = i17;
                    if (i17 != dlVar.q) {
                        continue;
                    } else {
                        int i18 = dlVar.o;
                        if (i18 == 1) {
                            byte[] bArr3 = be3Var2.a;
                            h00 h00Var2 = new h00(bArr3.length, bArr3);
                            int i19 = h00Var2.i(8);
                            int i20 = h00Var2.i(5);
                            if (i20 != 31) {
                                switch (i20) {
                                    case 0:
                                        i4 = 96000;
                                        break;
                                    case 1:
                                        i4 = 88200;
                                        break;
                                    case 2:
                                        i4 = 64000;
                                        break;
                                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                        i4 = 48000;
                                        break;
                                    case 4:
                                        i4 = 44100;
                                        break;
                                    case 5:
                                        i4 = 32000;
                                        break;
                                    case 6:
                                        i4 = 24000;
                                        break;
                                    case 7:
                                        i4 = 22050;
                                        break;
                                    case 8:
                                        i4 = 16000;
                                        break;
                                    case 9:
                                        i4 = 12000;
                                        break;
                                    case 10:
                                        i4 = 11025;
                                        break;
                                    case 11:
                                        i4 = 8000;
                                        break;
                                    case 12:
                                        i4 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.c("Unsupported sampling rate index " + i20);
                                    case 15:
                                        i4 = 57600;
                                        break;
                                    case WaveRetry.MAX_FAILURES /* 16 */:
                                        i4 = 51200;
                                        break;
                                    case 17:
                                        i4 = 40000;
                                        break;
                                    case 18:
                                        i4 = 38400;
                                        break;
                                    case 19:
                                        i4 = 34150;
                                        break;
                                    case 20:
                                        i4 = 28800;
                                        break;
                                    case 21:
                                        i4 = 25600;
                                        break;
                                    case 22:
                                        i4 = 20000;
                                        break;
                                    case 23:
                                        i4 = 19200;
                                        break;
                                    case 24:
                                        i4 = 17075;
                                        break;
                                    case 25:
                                        i4 = 14400;
                                        break;
                                    case 26:
                                        i4 = 12800;
                                        break;
                                    case 27:
                                        i4 = 9600;
                                        break;
                                }
                            } else {
                                i4 = h00Var2.i(24);
                            }
                            int i21 = h00Var2.i(3);
                            if (i21 == 0) {
                                i5 = 768;
                            } else if (i21 == 1) {
                                i5 = 1024;
                            } else if (i21 == 2 || i21 == 3) {
                                i5 = 2048;
                            } else {
                                if (i21 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                i5 = 4096;
                            }
                            int i22 = i5;
                            if (i21 == 0 || i21 == 1) {
                                c = 0;
                            } else if (i21 == 2) {
                                c = 2;
                            } else if (i21 == 3) {
                                c = 3;
                            } else {
                                if (i21 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i21);
                                }
                                c = 1;
                            }
                            h00Var2.t(2);
                            ji2.R(h00Var2);
                            int i23 = h00Var2.i(5);
                            int i24 = 0;
                            int iG3 = 0;
                            while (true) {
                                int i25 = i11;
                                int i26 = 16;
                                if (i24 < i23 + 1) {
                                    int i27 = h00Var2.i(3);
                                    iG3 = ji2.G(h00Var2, 5, 8, 16) + 1 + iG3;
                                    if ((i27 == 0 || i27 == 2) && h00Var2.h()) {
                                        ji2.R(h00Var2);
                                    }
                                    i24++;
                                    i11 = i25;
                                } else {
                                    int iG4 = ji2.G(h00Var2, 4, 8, 16) + 1;
                                    h00Var2.s();
                                    int i28 = 0;
                                    while (true) {
                                        double d = 2.0d;
                                        if (i28 < iG4) {
                                            int i29 = h00Var2.i(2);
                                            if (i29 == 0) {
                                                h00Var2.t(i10);
                                                if (h00Var2.h()) {
                                                    h00Var2.t(13);
                                                }
                                                if (c > 0) {
                                                    ji2.Q(h00Var2);
                                                }
                                            } else if (i29 == i25) {
                                                h00Var2.t(i10);
                                                boolean zH = h00Var2.h();
                                                if (zH) {
                                                    h00Var2.t(13);
                                                }
                                                if (zH) {
                                                    h00Var2.s();
                                                }
                                                if (c > 0) {
                                                    ji2.Q(h00Var2);
                                                    i6 = h00Var2.i(2);
                                                } else {
                                                    i6 = 0;
                                                }
                                                if (i6 > 0) {
                                                    h00Var2.t(6);
                                                    int i30 = h00Var2.i(2);
                                                    h00Var2.t(4);
                                                    if (h00Var2.h()) {
                                                        h00Var2.t(5);
                                                    }
                                                    if (i6 == 2 || i6 == i10) {
                                                        h00Var2.t(6);
                                                    }
                                                    if (i30 == 2) {
                                                        h00Var2.s();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iG3 - 1) / Math.log(2.0d))) + 1;
                                                int i31 = h00Var2.i(2);
                                                if (i31 > 0 && h00Var2.h()) {
                                                    h00Var2.t(iFloor);
                                                }
                                                if (h00Var2.h()) {
                                                    h00Var2.t(iFloor);
                                                }
                                                if (c == 0 && i31 == 0) {
                                                    h00Var2.s();
                                                }
                                            } else if (i29 == i10) {
                                                ji2.G(h00Var2, 4, i9, i26);
                                                int iG5 = ji2.G(h00Var2, 4, i9, i26);
                                                if (h00Var2.h()) {
                                                    ji2.G(h00Var2, i9, i26, 0);
                                                }
                                                h00Var2.s();
                                                if (iG5 > 0) {
                                                    h00Var2.t(iG5 * 8);
                                                }
                                            }
                                            i28++;
                                            i9 = 8;
                                            i10 = 3;
                                            i26 = 16;
                                            i25 = 1;
                                        } else {
                                            if (h00Var2.h()) {
                                                int i32 = 8;
                                                int iG6 = ji2.G(h00Var2, 2, 4, 8) + 1;
                                                int i33 = 0;
                                                bArr = null;
                                                while (i33 < iG6) {
                                                    int iG7 = ji2.G(h00Var2, 4, i32, 16);
                                                    int iG8 = ji2.G(h00Var2, 4, i32, 16);
                                                    if (iG7 == 7) {
                                                        int i34 = h00Var2.i(4) + 1;
                                                        h00Var2.t(4);
                                                        byte[] bArr4 = new byte[i34];
                                                        for (int i35 = 0; i35 < i34; i35++) {
                                                            bArr4[i35] = (byte) h00Var2.i(i32);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        h00Var2.t(iG8 * i32);
                                                    }
                                                    i33++;
                                                    i32 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i4) {
                                                case 14700:
                                                case 16000:
                                                    d = 3.0d;
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = dlVar.p;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        String strConcat = i19 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i19))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            gy3VarP = null;
                                                        } else {
                                                            gy3VarP = yw1.p(f35.b, bArr);
                                                        }
                                                        sb1 sb1Var = new sb1();
                                                        sb1Var.a = this.e;
                                                        sb1Var.l = lw2.m("video/mp2t");
                                                        sb1Var.m = lw2.m("audio/mhm1");
                                                        sb1Var.F = this.q;
                                                        sb1Var.j = strConcat;
                                                        sb1Var.p = gy3VarP;
                                                        this.f.g(new tb1(sb1Var));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = dlVar.p;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (i19 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            gy3VarP = null;
                                                        } else {
                                                            gy3VarP = null;
                                                        }
                                                        sb1 sb1Var2 = new sb1();
                                                        sb1Var2.a = this.e;
                                                        sb1Var2.l = lw2.m("video/mp2t");
                                                        sb1Var2.m = lw2.m("audio/mhm1");
                                                        sb1Var2.F = this.q;
                                                        sb1Var2.j = strConcat;
                                                        sb1Var2.p = gy3VarP;
                                                        this.f.g(new tb1(sb1Var2));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d = 1.5d;
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = dlVar.p;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (i19 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            gy3VarP = null;
                                                        } else {
                                                            gy3VarP = null;
                                                        }
                                                        sb1 sb1Var3 = new sb1();
                                                        sb1Var3.a = this.e;
                                                        sb1Var3.l = lw2.m("video/mp2t");
                                                        sb1Var3.m = lw2.m("audio/mhm1");
                                                        sb1Var3.F = this.q;
                                                        sb1Var3.j = strConcat;
                                                        sb1Var3.p = gy3VarP;
                                                        this.f.g(new tb1(sb1Var3));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d = 1.0d;
                                                    this.q = (int) (((double) i4) * d);
                                                    this.r = (int) (((double) i22) * d);
                                                    j = this.t;
                                                    j2 = dlVar.p;
                                                    if (j != j2) {
                                                        this.t = j2;
                                                        if (i19 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            gy3VarP = null;
                                                        } else {
                                                            gy3VarP = null;
                                                        }
                                                        sb1 sb1Var4 = new sb1();
                                                        sb1Var4.a = this.e;
                                                        sb1Var4.l = lw2.m("video/mp2t");
                                                        sb1Var4.m = lw2.m("audio/mhm1");
                                                        sb1Var4.F = this.q;
                                                        sb1Var4.j = strConcat;
                                                        sb1Var4.p = gy3VarP;
                                                        this.f.g(new tb1(sb1Var4));
                                                    }
                                                    i2 = 1;
                                                    this.u = true;
                                                    break;
                                                default:
                                                    throw ParserException.c("Unsupported sampling rate " + i4);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i18 == 17) {
                                byte[] bArr5 = be3Var2.a;
                                h00 h00Var3 = new h00(bArr5.length, bArr5);
                                if (h00Var3.h()) {
                                    h00Var3.t(2);
                                    i3 = h00Var3.i(13);
                                } else {
                                    i3 = 0;
                                }
                                this.s = i3;
                            } else if (i18 == 2) {
                                if (this.u) {
                                    this.j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                double d2 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
                                long jRound = Math.round(this.g);
                                if (this.i) {
                                    this.i = false;
                                    this.g = this.h;
                                } else {
                                    this.g += d2;
                                }
                                this.f.a(jRound, i, this.o, 0, null);
                                this.u = false;
                                this.s = 0;
                                this.o = 0;
                            }
                            i2 = 1;
                        }
                        this.d = i2;
                    }
                }
            } else {
                int i36 = this.k;
                if ((i36 & 2) == 0) {
                    be3Var.N(be3Var.c);
                } else {
                    if ((i36 & 4) == 0) {
                        while (true) {
                            if (be3Var.a() > 0) {
                                int i37 = this.l << 8;
                                this.l = i37;
                                int iA2 = i37 | be3Var.A();
                                this.l = iA2;
                                if ((iA2 & 16777215) == 12583333) {
                                    be3Var.N(be3Var.b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.d = 1;
                }
            }
        }
    }

    @Override // defpackage.mz0
    public final void c() {
        this.d = 0;
        this.l = 0;
        this.a.K(2);
        this.n = 0;
        this.o = 0;
        this.q = -2147483647;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.mz0
    public final void d(boolean z) {
    }

    @Override // defpackage.mz0
    public final void e(int i, long j) {
        this.k = i;
        if (!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if (j != -9223372036854775807L) {
            if (this.i) {
                this.h = j;
            } else {
                this.g = j;
            }
        }
    }

    @Override // defpackage.mz0
    public final void f(m51 m51Var, sy4 sy4Var) {
        sy4Var.a();
        sy4Var.b();
        this.e = sy4Var.e;
        sy4Var.b();
        this.f = m51Var.t(sy4Var.d, 1);
    }
}
