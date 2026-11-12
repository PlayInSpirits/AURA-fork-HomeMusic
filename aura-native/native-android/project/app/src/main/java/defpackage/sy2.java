package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sy2 implements k51 {
    public long A;
    public m51 B;
    public ry2[] C;
    public long[][] D;
    public int E;
    public xx2 F;
    public final xn4 a;
    public final int b;
    public final boolean c;
    public final be3 d;
    public final be3 e;
    public final be3 f;
    public final be3 g;
    public final ArrayDeque h;
    public final s84 i;
    public final ArrayList j;
    public gy3 k;
    public int l;
    public int m;
    public long n;
    public int o;
    public be3 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public sy2(xn4 xn4Var, int i) {
        this.a = xn4Var;
        this.b = i;
        this.c = (i & 256) != 0;
        vw1 vw1Var = yw1.o;
        this.k = gy3.r;
        this.l = (i & 4) != 0 ? 3 : 0;
        this.i = new s84();
        this.j = new ArrayList();
        this.g = new be3(16);
        this.h = new ArrayDeque();
        this.d = new be3(uc5.c);
        this.e = new be3(6);
        this.f = new be3();
        this.q = -1;
        this.B = m51.i;
        this.C = new ry2[0];
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:277:0x0562  */
    /* JADX WARN: Code duplicated, block: B:278:0x056e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int iC;
        int i4;
        be3 be3Var;
        int i5;
        char c3;
        boolean z;
        boolean z2;
        oy2 oy2Var;
        if (!this.c || !this.z) {
            while (true) {
                int i6 = this.l;
                ArrayDeque arrayDeque = this.h;
                int i7 = this.b;
                be3 be3Var2 = this.f;
                int i8 = 4;
                int i9 = 0;
                char c4 = 2;
                if (i6 == 0) {
                    int i10 = this.o;
                    be3 be3Var3 = this.g;
                    if (i10 == 0) {
                        if (l51Var.a(be3Var3.a, 0, 8, true)) {
                            this.o = 8;
                            be3Var3.N(0);
                            this.n = be3Var3.C();
                            this.m = be3Var3.m();
                        } else if (this.E == 2 && (i7 & 2) != 0) {
                            wv4 wv4VarT = this.B.t(0, 4);
                            xx2 xx2Var = this.F;
                            qv2 qv2Var = xx2Var == null ? null : new qv2(xx2Var);
                            sb1 sb1Var = new sb1();
                            sb1Var.k = qv2Var;
                            f34.l(sb1Var, wv4VarT);
                            this.B.p();
                            this.B.w(new bo(-9223372036854775807L));
                            return -1;
                        }
                    }
                    long j = this.n;
                    if (j == 1) {
                        l51Var.readFully(be3Var3.a, 8, 8);
                        this.o += 8;
                        this.n = be3Var3.G();
                    } else if (j == 0) {
                        long length = l51Var.getLength();
                        if (length == -1 && (oy2Var = (oy2) arrayDeque.peek()) != null) {
                            length = oy2Var.p;
                        }
                        if (length != -1) {
                            this.n = (length - l51Var.getPosition()) + ((long) this.o);
                        }
                    }
                    long j2 = this.n;
                    int i11 = this.o;
                    long j3 = i11;
                    if (j2 < j3) {
                        if (this.m != 1718773093 || i11 != 8) {
                            throw ParserException.c("Atom size less than header length (unsupported).");
                        }
                        this.n = j3;
                    }
                    int i12 = this.m;
                    if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473 || i12 == 1635284069) {
                        long position = l51Var.getPosition();
                        long j4 = this.n;
                        long j5 = this.o;
                        long j6 = (position + j4) - j5;
                        if (j4 != j5 && this.m == 1835365473) {
                            be3Var2.K(8);
                            l51Var.n(be3Var2.a, 0, 8);
                            wu.a(be3Var2);
                            l51Var.l(be3Var2.b);
                            l51Var.k();
                        }
                        arrayDeque.push(new oy2(this.m, j6));
                        if (this.n == this.o) {
                            g(j6);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i12 == 1835296868 || i12 == 1836476516 || i12 == 1751411826 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1937011571 || i12 == 1668576371 || i12 == 1701606260 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1953196132 || i12 == 1718909296 || i12 == 1969517665 || i12 == 1801812339 || i12 == 1768715124) {
                        rr2.w(i11 == 8);
                        rr2.w(this.n <= 2147483647L);
                        be3 be3Var4 = new be3((int) this.n);
                        System.arraycopy(be3Var3.a, 0, be3Var4.a, 0, 8);
                        this.p = be3Var4;
                        this.l = 1;
                    } else {
                        long position2 = l51Var.getPosition();
                        long j7 = this.o;
                        long j8 = position2 - j7;
                        if (this.m == 1836086884) {
                            this.F = new xx2(0L, j8, -9223372036854775807L, j8 + j7, this.n - j7);
                        }
                        this.p = null;
                        this.l = 1;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                tb4.a();
                                return 0;
                            }
                            s84 s84Var = this.i;
                            ArrayList arrayList = s84Var.a;
                            int i13 = s84Var.b;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    short s = 2817;
                                    short s2 = 2816;
                                    short s3 = 2192;
                                    if (i13 == 2) {
                                        long length2 = l51Var.getLength();
                                        int i14 = s84Var.c - 20;
                                        be3 be3Var5 = new be3(i14);
                                        l51Var.readFully(be3Var5.a, 0, i14);
                                        int i15 = 0;
                                        while (i15 < i14 / 12) {
                                            be3Var5.O(2);
                                            short sQ = be3Var5.q();
                                            if (sQ != s3 && sQ != s2 && sQ != s && sQ != 2819) {
                                                if (sQ != 2820) {
                                                    be3Var5.O(8);
                                                    be3Var = be3Var5;
                                                }
                                                i15++;
                                                be3Var5 = be3Var;
                                                s = 2817;
                                                s3 = 2192;
                                                s2 = 2816;
                                            }
                                            be3Var = be3Var5;
                                            arrayList.add(new r84(be3Var.o(), (length2 - ((long) s84Var.c)) - ((long) be3Var5.o())));
                                            i15++;
                                            be3Var5 = be3Var;
                                            s = 2817;
                                            s3 = 2192;
                                            s2 = 2816;
                                        }
                                        if (arrayList.isEmpty()) {
                                            t71Var.a = 0L;
                                        } else {
                                            s84Var.b = 3;
                                            t71Var.a = ((r84) arrayList.get(0)).a;
                                        }
                                    } else {
                                        if (i13 != 3) {
                                            tb4.a();
                                            return 0;
                                        }
                                        long position3 = l51Var.getPosition();
                                        int length3 = (int) ((l51Var.getLength() - l51Var.getPosition()) - ((long) s84Var.c));
                                        be3 be3Var6 = new be3(length3);
                                        l51Var.readFully(be3Var6.a, 0, length3);
                                        int i16 = 0;
                                        while (i16 < arrayList.size()) {
                                            r84 r84Var = (r84) arrayList.get(i16);
                                            int i17 = i9;
                                            be3Var6.N((int) (r84Var.a - position3));
                                            be3Var6.O(i8);
                                            int iO = be3Var6.o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            int i18 = i17;
                                            String strY = be3Var6.y(iO, charset);
                                            switch (strY.hashCode()) {
                                                case -1711564334:
                                                    if (!strY.equals("SlowMotion_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = i18;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (!strY.equals("Super_SlowMotion_Edit_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 1;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (!strY.equals("Super_SlowMotion_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 2;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (!strY.equals("Super_SlowMotion_Deflickering_On")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 3;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (!strY.equals("Super_SlowMotion_BGM")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 4;
                                                    }
                                                    break;
                                                default:
                                                    i5 = -1;
                                                    break;
                                            }
                                            switch (i5) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            int i19 = r84Var.b - (iO + 8);
                                            if (c3 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List listC = s84.e.C(be3Var6.y(i19, charset));
                                                int i20 = i18;
                                                while (i20 < listC.size()) {
                                                    List listC2 = s84.d.C((CharSequence) listC.get(i20));
                                                    if (listC2.size() != 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new mg4(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(i18)), Long.parseLong((String) listC2.get(1))));
                                                        i20++;
                                                        i18 = 0;
                                                    } catch (NumberFormatException e) {
                                                        throw ParserException.a(e, null);
                                                    }
                                                }
                                                this.j.add(new ng4(arrayList2));
                                            } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                                tb4.a();
                                                return i18;
                                            }
                                            i16++;
                                            i9 = 0;
                                            i8 = 4;
                                        }
                                        t71Var.a = 0L;
                                    }
                                } else {
                                    be3 be3Var7 = new be3(8);
                                    l51Var.readFully(be3Var7.a, 0, 8);
                                    s84Var.c = be3Var7.o() + 8;
                                    if (be3Var7.m() != 1397048916) {
                                        t71Var.a = 0L;
                                    } else {
                                        t71Var.a = l51Var.getPosition() - ((long) (s84Var.c - 12));
                                        s84Var.b = 2;
                                    }
                                }
                                i4 = 1;
                            } else {
                                long length4 = l51Var.getLength();
                                t71Var.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i4 = 1;
                                s84Var.b = 1;
                            }
                            if (t71Var.a != 0) {
                                return i4;
                            }
                            this.l = 0;
                            this.o = 0;
                            return i4;
                        }
                        long position4 = l51Var.getPosition();
                        if (this.q == -1) {
                            boolean z3 = true;
                            int i21 = 0;
                            int i22 = -1;
                            int i23 = -1;
                            boolean z4 = true;
                            long j9 = Long.MAX_VALUE;
                            long j10 = Long.MAX_VALUE;
                            long j11 = Long.MAX_VALUE;
                            while (true) {
                                ry2[] ry2VarArr = this.C;
                                if (i21 >= ry2VarArr.length) {
                                    break;
                                }
                                ry2 ry2Var = ry2VarArr[i21];
                                int i24 = ry2Var.e;
                                xv4 xv4Var = ry2Var.b;
                                char c5 = c4;
                                if (i24 != xv4Var.b) {
                                    long j12 = xv4Var.c[i24];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j13 = jArr[i21][i24];
                                    long j14 = j12 - position4;
                                    boolean z5 = j14 < 0 || j14 >= 262144;
                                    if ((!z5 && z3) || (z5 == z3 && j14 < j11)) {
                                        z3 = z5;
                                        i23 = i21;
                                        j11 = j14;
                                        j10 = j13;
                                    }
                                    if (j13 < j9) {
                                        z4 = z5;
                                        i22 = i21;
                                        j9 = j13;
                                    }
                                }
                                i21++;
                                c4 = c5;
                            }
                            c = c4;
                            if (j9 == Long.MAX_VALUE || !z4 || j10 < j9 + 10485760) {
                                i22 = i23;
                            }
                            this.q = i22;
                            if (i22 == -1) {
                                return -1;
                            }
                        } else {
                            c = 2;
                        }
                        ry2 ry2Var2 = this.C[this.q];
                        wv4 wv4Var = ry2Var2.c;
                        xv4 xv4Var2 = ry2Var2.b;
                        pv4 pv4Var = ry2Var2.a;
                        int i25 = ry2Var2.e;
                        long[] jArr2 = xv4Var2.c;
                        int[] iArr = xv4Var2.d;
                        long j15 = jArr2[i25] + this.A;
                        int i26 = iArr[i25];
                        my4 my4Var = ry2Var2.d;
                        long j16 = (j15 - position4) + ((long) this.r);
                        if (j16 < 0 || j16 >= 262144) {
                            t71Var.a = j15;
                            return 1;
                        }
                        int i27 = pv4Var.h;
                        int i28 = pv4Var.k;
                        tb1 tb1Var = pv4Var.g;
                        if (i27 == 1) {
                            j16 += 8;
                            i26 -= 8;
                        }
                        int i29 = i26;
                        l51Var.l((int) j16);
                        String str = tb1Var.n;
                        String str2 = tb1Var.n;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i7 & 128) == 0 : (i7 & 32) == 0) {
                            c2 = 1;
                            this.u = true;
                        } else {
                            c2 = 1;
                        }
                        if (i28 != 0) {
                            be3 be3Var8 = this.e;
                            byte[] bArr = be3Var8.a;
                            bArr[0] = 0;
                            bArr[c2] = 0;
                            bArr[c] = 0;
                            int i30 = 4 - i28;
                            int i31 = i29 + i30;
                            while (this.s < i31) {
                                int i32 = this.t;
                                if (i32 == 0) {
                                    if (this.u || uc5.C(tb1Var) + i28 > iArr[i25] - this.r) {
                                        i3 = i28;
                                        iC = 0;
                                    } else {
                                        iC = uc5.C(tb1Var);
                                        i3 = i28 + iC;
                                    }
                                    l51Var.readFully(bArr, i30, i3);
                                    i2 = i31;
                                    this.r += i3;
                                    be3Var8.N(0);
                                    int iM = be3Var8.m();
                                    if (iM < 0) {
                                        throw ParserException.a(null, "Invalid NAL length");
                                    }
                                    this.t = iM - iC;
                                    be3 be3Var9 = this.d;
                                    be3Var9.N(0);
                                    int i33 = iC;
                                    wv4Var.e(4, be3Var9);
                                    this.s += 4;
                                    if (i33 > 0) {
                                        wv4Var.e(i33, be3Var8);
                                        this.s += i33;
                                        if (uc5.y(bArr, i33, tb1Var)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    i2 = i31;
                                    int iF = wv4Var.f(l51Var, i32, false);
                                    this.r += iF;
                                    this.s += iF;
                                    this.t -= iF;
                                }
                                i31 = i2;
                            }
                            i = i31;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    hw.g(i29, be3Var2);
                                    wv4Var.e(7, be3Var2);
                                    this.s += 7;
                                }
                                i29 += 7;
                            } else if (ry2Var2.f != null && Objects.equals(str2, "audio/mpeg")) {
                                tb1 tb1Var2 = ry2Var2.f;
                                be3Var2.K(4);
                                l51Var.n(be3Var2.a, 0, 4);
                                l51Var.k();
                                wy2 wy2Var = new wy2();
                                wv4 wv4Var2 = ry2Var2.c;
                                if (wy2Var.a(be3Var2.m()) && !Objects.equals(tb1Var2.n, (String) wy2Var.g)) {
                                    sb1 sb1VarA = tb1Var2.a();
                                    String str3 = (String) wy2Var.g;
                                    str3.getClass();
                                    sb1VarA.m = lw2.m(str3);
                                    tb1Var2 = new tb1(sb1VarA);
                                }
                                wv4Var2.g(tb1Var2);
                                ry2Var2.f = null;
                            } else if (my4Var != null) {
                                my4Var.c(l51Var);
                            }
                            while (true) {
                                int i34 = this.s;
                                if (i34 >= i29) {
                                    break;
                                }
                                int iF2 = wv4Var.f(l51Var, i29 - i34, false);
                                this.r += iF2;
                                this.s += iF2;
                                this.t -= iF2;
                            }
                            i = i29;
                        }
                        long j17 = xv4Var2.f[i25];
                        int i35 = xv4Var2.g[i25];
                        if (!this.u) {
                            i35 |= 67108864;
                        }
                        int i36 = i35;
                        if (my4Var != null) {
                            my4Var.b(wv4Var, j17, i36, i, 0, null);
                            if (i25 + 1 == xv4Var2.b) {
                                my4Var.a(wv4Var, null);
                            }
                        } else {
                            wv4Var.a(j17, i36, i, 0, null);
                        }
                        ry2Var2.e++;
                        this.q = -1;
                        this.r = 0;
                        this.s = 0;
                        this.t = 0;
                        this.u = false;
                        return 0;
                    }
                    long j18 = this.n - ((long) this.o);
                    long position5 = l51Var.getPosition() + j18;
                    be3 be3Var10 = this.p;
                    if (be3Var10 != null) {
                        l51Var.readFully(be3Var10.a, this.o, (int) j18);
                        if (this.m == 1718909296) {
                            this.v = true;
                            be3Var10.N(8);
                            int iM2 = be3Var10.m();
                            int i37 = iM2 != 1751476579 ? iM2 != 1903435808 ? 0 : 1 : 2;
                            if (i37 == 0) {
                                be3Var10.O(4);
                                do {
                                    if (be3Var10.a() <= 0) {
                                        i37 = 0;
                                        break;
                                    }
                                    int iM3 = be3Var10.m();
                                    i37 = iM3 != 1751476579 ? iM3 != 1903435808 ? 0 : 1 : 2;
                                } while (i37 == 0);
                            }
                            this.E = i37;
                        } else if (!arrayDeque.isEmpty()) {
                            ((oy2) arrayDeque.peek()).q.add(new py2(this.m, be3Var10));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j18 < 262144) {
                            l51Var.l((int) j18);
                        } else {
                            t71Var.a = l51Var.getPosition() + j18;
                            z = true;
                        }
                        g(position5);
                        if (this.w) {
                            this.y = true;
                            t71Var.a = this.x;
                            this.w = false;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2 && this.l != 2) {
                            return 1;
                        }
                    }
                    z = false;
                    g(position5);
                    if (this.w) {
                        this.y = true;
                        t71Var.a = this.x;
                        this.w = false;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        continue;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        gy3 gy3VarO;
        th4 th4VarF0 = ud3.F0(l51Var, false, (this.b & 2) != 0);
        if (th4VarF0 != null) {
            gy3VarO = yw1.o(th4VarF0);
        } else {
            vw1 vw1Var = yw1.o;
            gy3VarO = gy3.r;
        }
        this.k = gy3VarO;
        return th4VarF0 == null;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                s84 s84Var = this.i;
                s84Var.a.clear();
                s84Var.b = 0;
                this.j.clear();
                return;
            }
        }
        for (ry2 ry2Var : this.C) {
            xv4 xv4Var = ry2Var.b;
            int iA = xv4Var.a(j2);
            if (iA == -1) {
                iA = xv4Var.b(j2);
            }
            ry2Var.e = iA;
            my4 my4Var = ry2Var.d;
            if (my4Var != null) {
                my4Var.b = false;
                my4Var.c = 0;
            }
        }
    }

    @Override // defpackage.k51
    public final List e() {
        return this.k;
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        if ((this.b & 16) == 0) {
            m51Var = new ll(m51Var, this.a);
        }
        this.B = m51Var;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0309  */
    /* JADX WARN: Code duplicated, block: B:163:0x0319  */
    /* JADX WARN: Code duplicated, block: B:172:0x0334  */
    /* JADX WARN: Code duplicated, block: B:174:0x033a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0355  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:262:0x0134 A[EDGE_INSN: B:262:0x0134->B:74:0x0134 BREAK  A[LOOP:9: B:62:0x0102->B:72:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c A[LOOP:9: B:62:0x0102->B:72:0x012c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(long j) throws ParserException {
        int i;
        ArrayList arrayList;
        qv2 qv2VarF;
        boolean z;
        ArrayDeque arrayDeque;
        boolean z2;
        qv2 qv2VarK;
        long[][] jArr;
        int i2;
        String str;
        qv2 qv2Var;
        int i3;
        long j2;
        int i4;
        int i5;
        int i6;
        qv2 qv2Var2;
        ArrayList arrayList2;
        qv2 qv2Var3;
        qv2 qv2Var4;
        qv2 qv2Var5;
        int i7;
        int i8;
        int i9;
        pv2 pv2Var;
        pv2 pv2Var2;
        pv2 pv2Var3;
        int i10;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            int i11 = 0;
            if (arrayDeque2.isEmpty() || ((oy2) arrayDeque2.peek()).p != j) {
                break;
            }
            oy2 oy2Var = (oy2) arrayDeque2.pop();
            if (oy2Var.o == 1836019574) {
                oy2 oy2VarR = oy2Var.r(1835365473);
                ArrayList arrayList3 = new ArrayList();
                boolean z3 = this.c;
                long j3 = 0;
                int i12 = this.b;
                if (oy2VarR != null) {
                    qv2VarF = wu.f(oy2VarR);
                    if (this.y) {
                        qv2VarF.getClass();
                        pv2[] pv2VarArr = qv2VarF.a;
                        int length = pv2VarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                pv2Var2 = null;
                                break;
                            }
                            pv2 pv2Var4 = pv2VarArr[i13];
                            if (oi2.class.isAssignableFrom(pv2Var4.getClass())) {
                                pv2Var2 = (pv2) oi2.class.cast(pv2Var4);
                                if (!((oi2) pv2Var2).a.equals("auxiliary.tracks.interleaved")) {
                                    pv2Var2 = null;
                                }
                            } else {
                                pv2Var2 = null;
                            }
                            if (pv2Var2 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        oi2 oi2Var = (oi2) pv2Var2;
                        if (oi2Var != null && oi2Var.b[0] == 0) {
                            this.A = this.x + 16;
                        }
                        int length2 = pv2VarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                pv2Var3 = null;
                                break;
                            }
                            pv2 pv2Var5 = pv2VarArr[i14];
                            if (oi2.class.isAssignableFrom(pv2Var5.getClass())) {
                                pv2Var3 = (pv2) oi2.class.cast(pv2Var5);
                                if (!((oi2) pv2Var3).a.equals("auxiliary.tracks.map")) {
                                    pv2Var3 = null;
                                }
                            } else {
                                pv2Var3 = null;
                            }
                            if (pv2Var3 != null) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        oi2 oi2Var2 = (oi2) pv2Var3;
                        oi2Var2.getClass();
                        ArrayList arrayListD = oi2Var2.d();
                        ArrayList arrayList4 = new ArrayList(arrayListD.size());
                        for (int i15 = 0; i15 < arrayListD.size(); i15++) {
                            int iIntValue = ((Integer) arrayListD.get(i15)).intValue();
                            if (iIntValue == 0) {
                                i10 = 1;
                            } else if (iIntValue != 1) {
                                i10 = 3;
                                if (iIntValue != 2) {
                                    i10 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i10 = 2;
                            }
                            arrayList4.add(Integer.valueOf(i10));
                        }
                        i = 0;
                        arrayList = arrayList4;
                    } else {
                        if (qv2VarF == null || (i12 & 64) == 0) {
                            i = 0;
                        } else {
                            pv2[] pv2VarArr2 = qv2VarF.a;
                            int length3 = pv2VarArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length3) {
                                    i = i11;
                                    pv2Var = null;
                                    break;
                                }
                                pv2 pv2Var6 = pv2VarArr2[i16];
                                if (oi2.class.isAssignableFrom(pv2Var6.getClass())) {
                                    pv2Var = (pv2) oi2.class.cast(pv2Var6);
                                    i = i11;
                                    if (!((oi2) pv2Var).a.equals("auxiliary.tracks.offset")) {
                                    }
                                    if (pv2Var != null) {
                                        break;
                                    }
                                    i16++;
                                    i11 = i;
                                } else {
                                    i = i11;
                                }
                                pv2Var = null;
                                if (pv2Var != null) {
                                    break;
                                    break;
                                } else {
                                    i16++;
                                    i11 = i;
                                }
                            }
                            oi2 oi2Var3 = (oi2) pv2Var;
                            if (oi2Var3 != null) {
                                long jG = new be3(oi2Var3.b).G();
                                if (jG > 0) {
                                    this.x = jG;
                                    this.w = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = true;
                                    z = z3;
                                }
                                arrayDeque.clear();
                                this.z = z2;
                                if (this.w && !z) {
                                    this.l = 2;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                } else {
                    i = 0;
                    arrayList = arrayList3;
                    qv2VarF = null;
                }
                ArrayList arrayList5 = new ArrayList();
                boolean z4 = this.E == 1 ? 1 : i;
                zg1 zg1Var = new zg1();
                py2 py2VarS = oy2Var.s(1969517665);
                if (py2VarS != null) {
                    qv2VarK = wu.k(py2VarS);
                    zg1Var.b(qv2VarK);
                } else {
                    qv2VarK = null;
                }
                py2 py2VarS2 = oy2Var.s(1836476516);
                py2VarS2.getClass();
                pv2[] pv2VarArr3 = new pv2[1];
                pv2VarArr3[i] = wu.g(py2VarS2.p);
                qv2 qv2Var6 = new qv2(pv2VarArr3);
                qv2 qv2Var7 = qv2VarK;
                ArrayList arrayListJ = wu.j(oy2Var, zg1Var, -9223372036854775807L, null, (i12 & 1) != 0 ? 1 : i, z4, new zr2(27), this.c);
                if (this.y) {
                    boolean z5 = arrayList.size() == arrayListJ.size() ? 1 : i;
                    Locale locale = Locale.US;
                    rr2.v(b11.n("The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", arrayList.size(), arrayListJ.size(), ")"), z5);
                }
                String strR = au0.r(arrayListJ);
                int i17 = i;
                int i18 = i17;
                long j4 = -9223372036854775807L;
                int size = -1;
                while (i17 < arrayListJ.size()) {
                    xv4 xv4Var = (xv4) arrayListJ.get(i17);
                    int i19 = xv4Var.b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    pv4 pv4Var = xv4Var.a;
                    if (i19 == 0) {
                        arrayList = arrayList;
                        str = strR;
                        i3 = i17;
                        i2 = i18;
                        qv2Var4 = qv2Var7;
                        qv2Var5 = qv2Var6;
                        qv2Var = qv2VarF;
                    } else {
                        m51 m51Var = this.B;
                        i2 = i18 + 1;
                        str = strR;
                        int i20 = pv4Var.b;
                        tb1 tb1Var = pv4Var.g;
                        wv4 wv4VarT = m51Var.t(i18, i20);
                        ry2 ry2Var = new ry2(pv4Var, xv4Var, wv4VarT);
                        qv2Var = qv2VarF;
                        long j5 = pv4Var.e;
                        if (j5 == -9223372036854775807L) {
                            j5 = xv4Var.i;
                        }
                        wv4VarT.d(j5);
                        long jMax = Math.max(j4, j5);
                        String str2 = tb1Var.n;
                        String str3 = tb1Var.n;
                        boolean zEquals = "audio/true-hd".equals(str2);
                        int i21 = xv4Var.e;
                        int i22 = zEquals ? i21 * 16 : i21 + 30;
                        sb1 sb1VarA = tb1Var.a();
                        sb1VarA.n = i22;
                        if (i20 == 2) {
                            int i23 = tb1Var.f;
                            if ((i12 & 8) != 0) {
                                i23 |= size == -1 ? 1 : 2;
                            }
                            int i24 = i23;
                            if (this.y) {
                                i9 = i24 | 32768;
                                sb1VarA.g = ((Integer) arrayList.get(i17)).intValue();
                            } else {
                                i9 = i24;
                            }
                            sb1VarA.f = i9;
                        } else {
                            arrayList = arrayList;
                        }
                        long[] jArr2 = xv4Var.f;
                        int[] iArr = xv4Var.h;
                        boolean z6 = xv4Var.j;
                        if (lw2.l(str3)) {
                            int iMin = Math.min(z6 ? xv4Var.b : iArr.length, 20);
                            rr2.w(j5 != -9223372036854775807L ? 1 : i);
                            i3 = i17;
                            long jMin = Math.min(j5, 10000000L);
                            int i25 = i;
                            int i26 = i25;
                            int i27 = -1;
                            while (i25 < iMin) {
                                int i28 = z6 ? i25 : iArr[i25];
                                long j6 = jArr2[i28];
                                if (j6 > jMin) {
                                    break;
                                }
                                if (j6 >= 0 && (i5 = xv4Var.d[(i4 = i28)]) > i26) {
                                    i26 = i5;
                                    i27 = i4;
                                }
                                i25++;
                            }
                            if (i27 != -1) {
                                j2 = jArr2[i27];
                            }
                            if (j2 != -9223372036854775807L) {
                                rt4 rt4Var = new rt4(j2);
                                i6 = 1;
                                pv2[] pv2VarArr4 = new pv2[1];
                                pv2VarArr4[i] = rt4Var;
                                qv2Var2 = new qv2(pv2VarArr4);
                            } else {
                                i6 = 1;
                                qv2Var2 = null;
                            }
                            if (i20 == i6 && (i7 = zg1Var.a) != -1 && (i8 = zg1Var.b) != -1) {
                                sb1VarA.H = i7;
                                sb1VarA.I = i8;
                            }
                            qv2 qv2Var8 = tb1Var.l;
                            arrayList2 = this.j;
                            if (arrayList2.isEmpty()) {
                                qv2Var3 = null;
                            } else {
                                qv2Var3 = new qv2(arrayList2);
                            }
                            qv2Var4 = qv2Var7;
                            qv2Var5 = qv2Var6;
                            gh0.D(i20, qv2Var, sb1VarA, qv2Var8, qv2Var3, qv2Var4, qv2Var5, qv2Var2);
                            sb1VarA.l = lw2.m(str);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                ry2Var.f = new tb1(sb1VarA);
                            } else {
                                f34.l(sb1VarA, ry2Var.c);
                            }
                            if (i20 == 2 && size == -1) {
                                size = arrayList5.size();
                            }
                            arrayList5.add(ry2Var);
                            j4 = jMax;
                        } else {
                            i3 = i17;
                        }
                        j2 = -9223372036854775807L;
                        if (j2 != -9223372036854775807L) {
                            rt4 rt4Var2 = new rt4(j2);
                            i6 = 1;
                            pv2[] pv2VarArr5 = new pv2[1];
                            pv2VarArr5[i] = rt4Var2;
                            qv2Var2 = new qv2(pv2VarArr5);
                        } else {
                            i6 = 1;
                            qv2Var2 = null;
                        }
                        if (i20 == i6) {
                            sb1VarA.H = i7;
                            sb1VarA.I = i8;
                        }
                        qv2 qv2Var9 = tb1Var.l;
                        arrayList2 = this.j;
                        if (arrayList2.isEmpty()) {
                            qv2Var3 = null;
                        } else {
                            qv2Var3 = new qv2(arrayList2);
                        }
                        qv2Var4 = qv2Var7;
                        qv2Var5 = qv2Var6;
                        gh0.D(i20, qv2Var, sb1VarA, qv2Var9, qv2Var3, qv2Var4, qv2Var5, qv2Var2);
                        sb1VarA.l = lw2.m(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                            ry2Var.f = new tb1(sb1VarA);
                        } else {
                            f34.l(sb1VarA, ry2Var.c);
                        }
                        if (i20 == 2) {
                            size = arrayList5.size();
                        }
                        arrayList5.add(ry2Var);
                        j4 = jMax;
                    }
                    qv2Var7 = qv2Var4;
                    qv2Var6 = qv2Var5;
                    qv2VarF = qv2Var;
                    arrayDeque2 = arrayDeque3;
                    arrayListJ = arrayListJ;
                    i18 = i2;
                    strR = str;
                    z3 = z3;
                    i17 = i3 + 1;
                    arrayList = arrayList;
                }
                arrayDeque = arrayDeque2;
                z = z3;
                boolean z7 = true;
                int i29 = -1;
                ry2[] ry2VarArr = (ry2[]) arrayList5.toArray(new ry2[i]);
                this.C = ry2VarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[ry2VarArr.length][];
                    int[] iArr2 = new int[ry2VarArr.length];
                    long[] jArr3 = new long[ry2VarArr.length];
                    boolean[] zArr = new boolean[ry2VarArr.length];
                    for (int i30 = 0; i30 < ry2VarArr.length; i30++) {
                        jArr[i30] = new long[ry2VarArr[i30].b.b];
                        jArr3[i30] = ry2VarArr[i30].b.f[0];
                    }
                    int i31 = 0;
                    while (i31 < ry2VarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i32 = i29;
                        for (int i33 = 0; i33 < ry2VarArr.length; i33++) {
                            if (!zArr[i33]) {
                                long j8 = jArr3[i33];
                                if (j8 <= j7) {
                                    i32 = i33;
                                    j7 = j8;
                                }
                            }
                        }
                        int i34 = iArr2[i32];
                        long[] jArr4 = jArr[i32];
                        jArr4[i34] = j3;
                        xv4 xv4Var2 = ry2VarArr[i32].b;
                        boolean z8 = z7;
                        j3 += (long) xv4Var2.d[i34];
                        int i35 = i34 + 1;
                        iArr2[i32] = i35;
                        if (i35 < jArr4.length) {
                            jArr3[i32] = xv4Var2.f[i35];
                        } else {
                            zArr[i32] = z8;
                            i31++;
                        }
                        z7 = z8;
                        i29 = -1;
                    }
                }
                z2 = z7;
                this.D = jArr;
                this.B.p();
                this.B.w(new qy2(j4, this.C, size));
                arrayDeque.clear();
                this.z = z2;
                if (this.w) {
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((oy2) arrayDeque2.peek()).r.add(oy2Var);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }
}
