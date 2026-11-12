package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 implements k51 {
    public final be3 a = new be3(4);
    public final be3 b = new be3(9);
    public final be3 c = new be3(11);
    public final be3 d = new be3();
    public final g64 e;
    public m51 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public tm o;
    public t55 p;

    public n91() {
        g64 g64Var = new g64(new tq0());
        g64Var.b = -9223372036854775807L;
        g64Var.c = new long[0];
        g64Var.d = new long[0];
        this.e = g64Var;
        this.g = 1;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x029d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b2  */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        int i2;
        this.f.getClass();
        while (true) {
            int i3 = this.g;
            boolean z3 = true;
            if (i3 == 1) {
                be3 be3Var = this.b;
                if (!l51Var.a(be3Var.a, 0, 9, true)) {
                    return -1;
                }
                be3Var.N(0);
                be3Var.O(4);
                int iA = be3Var.A();
                boolean z4 = (iA & 4) != 0;
                boolean z5 = (iA & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new tm(this.f.t(8, 1));
                }
                if (z5 && this.p == null) {
                    i2 = 2;
                    this.p = new t55(this.f.t(9, 2));
                } else {
                    i2 = 2;
                }
                this.f.p();
                this.j = be3Var.m() - 5;
                this.g = i2;
            } else if (i3 == 2) {
                l51Var.l(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                be3 be3Var2 = this.c;
                if (!l51Var.a(be3Var2.a, 0, 11, true)) {
                    return -1;
                }
                be3Var2.N(0);
                this.k = be3Var2.A();
                this.l = be3Var2.D();
                this.m = be3Var2.D();
                this.m = (((long) (be3Var2.A() << 24)) | this.m) * 1000;
                be3Var2.O(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    tb4.a();
                    return 0;
                }
                boolean z6 = this.h;
                g64 g64Var = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else {
                    if (g64Var.b == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        int i4 = 4;
                        if (i != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.w(new bo(-9223372036854775807L));
                                this.n = true;
                            }
                            t55 t55Var = this.p;
                            be3 be3VarG = g(l51Var);
                            t55Var.getClass();
                            int iA2 = be3VarG.A();
                            int i5 = (iA2 >> 4) & 15;
                            int i6 = iA2 & 15;
                            if (i6 != 7) {
                                final String strF = f34.f(i6, "Video format not supported: ");
                                throw new ParserException(strF) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            t55Var.g = i5;
                            if (i5 != 5) {
                                be3 be3Var3 = t55Var.b;
                                wv4 wv4Var = (wv4) t55Var.a;
                                be3 be3Var4 = t55Var.c;
                                int iA3 = be3VarG.A();
                                be3VarG.f(3);
                                byte[] bArr = be3VarG.a;
                                int i7 = be3VarG.b;
                                int i8 = i7 + 1;
                                be3VarG.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                int i10 = i7 + 2;
                                be3VarG.b = i10;
                                int i11 = ((bArr[i8] & 255) << 8) | i9;
                                be3VarG.b = i7 + 3;
                                long j4 = (((long) (i11 | (bArr[i10] & 255))) * 1000) + j2;
                                if (iA3 != 0 || t55Var.e) {
                                    if (iA3 == 1 && t55Var.e) {
                                        int i12 = t55Var.g == 1 ? 1 : 0;
                                        if (t55Var.f || i12 != 0) {
                                            byte[] bArr2 = be3Var4.a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - t55Var.d;
                                            int i14 = 0;
                                            while (be3VarG.a() > 0) {
                                                be3VarG.k(be3Var4.a, i13, t55Var.d);
                                                be3Var4.N(0);
                                                int iE = be3Var4.E();
                                                be3Var3.N(0);
                                                wv4Var.e(i4, be3Var3);
                                                wv4Var.e(iE, be3VarG);
                                                i14 = i14 + 4 + iE;
                                                i4 = 4;
                                            }
                                            ((wv4) t55Var.a).a(j4, i12, i14, 0, null);
                                            t55Var.f = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[be3VarG.a()];
                                    be3 be3Var5 = new be3(bArr3);
                                    be3VarG.k(bArr3, 0, be3VarG.a());
                                    yn ynVarA = yn.a(be3Var5);
                                    t55Var.d = ynVarA.b;
                                    sb1 sb1Var = new sb1();
                                    sb1Var.l = lw2.m("video/x-flv");
                                    sb1Var.m = lw2.m("video/avc");
                                    sb1Var.j = ynVarA.l;
                                    sb1Var.t = ynVarA.c;
                                    sb1Var.u = ynVarA.d;
                                    sb1Var.z = ynVarA.k;
                                    sb1Var.p = ynVarA.a;
                                    f34.l(sb1Var, wv4Var);
                                    t55Var.e = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (i == 18 || this.n) {
                            l51Var.l(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            be3 be3VarG2 = g(l51Var);
                            g64Var.getClass();
                            if (be3VarG2.A() == 2 && "onMetaData".equals(g64.w(be3VarG2)) && be3VarG2.a() != 0 && be3VarG2.A() == 8) {
                                HashMap mapV = g64.v(be3VarG2);
                                Object obj = mapV.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        g64Var.b = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapV.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        g64Var.c = new long[size];
                                        g64Var.d = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                g64Var.c = new long[0];
                                                g64Var.d = new long[0];
                                                break;
                                            }
                                            g64Var.c[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            g64Var.d[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = g64Var.b;
                            if (j5 != -9223372036854775807L) {
                                this.f.w(new ux1(j5, g64Var.d, g64Var.c));
                                this.n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.w(new bo(-9223372036854775807L));
                            this.n = true;
                        }
                        tm tmVar = this.o;
                        be3 be3VarG3 = g(l51Var);
                        wv4 wv4Var2 = (wv4) tmVar.a;
                        if (tmVar.b) {
                            be3VarG3.O(1);
                        } else {
                            int iA4 = be3VarG3.A();
                            int i16 = (iA4 >> 4) & 15;
                            tmVar.d = i16;
                            if (i16 == 2) {
                                int i17 = tm.e[(iA4 >> 2) & 3];
                                sb1 sb1Var2 = new sb1();
                                sb1Var2.l = lw2.m("video/x-flv");
                                sb1Var2.m = lw2.m("audio/mpeg");
                                sb1Var2.E = 1;
                                sb1Var2.F = i17;
                                f34.l(sb1Var2, wv4Var2);
                                tmVar.c = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                sb1 sb1Var3 = new sb1();
                                sb1Var3.l = lw2.m("video/x-flv");
                                sb1Var3.m = lw2.m(str);
                                sb1Var3.E = 1;
                                sb1Var3.F = 8000;
                                f34.l(sb1Var3, wv4Var2);
                                tmVar.c = true;
                            } else if (i16 != 10) {
                                final String str2 = "Audio format not supported: " + tmVar.d;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            tmVar.b = true;
                        }
                        wv4 wv4Var3 = (wv4) tmVar.a;
                        if (tmVar.d == 2) {
                            int iA5 = be3VarG3.a();
                            wv4Var3.e(iA5, be3VarG3);
                            ((wv4) tmVar.a).a(j2, 1, iA5, 0, null);
                        } else {
                            int iA6 = be3VarG3.A();
                            if (iA6 == 0 && !tmVar.c) {
                                int iA7 = be3VarG3.a();
                                byte[] bArr4 = new byte[iA7];
                                be3VarG3.k(bArr4, 0, iA7);
                                g gVarD = xl.D(new h00(iA7, bArr4), false);
                                sb1 sb1Var4 = new sb1();
                                sb1Var4.l = lw2.m("video/x-flv");
                                sb1Var4.m = lw2.m("audio/mp4a-latm");
                                sb1Var4.j = gVarD.a;
                                sb1Var4.E = gVarD.c;
                                sb1Var4.F = gVarD.b;
                                sb1Var4.p = Collections.singletonList(bArr4);
                                f34.l(sb1Var4, wv4Var3);
                                tmVar.c = true;
                            } else if (tmVar.d != 10 || iA6 == 1) {
                                int iA8 = be3VarG3.a();
                                wv4Var3.e(iA8, be3VarG3);
                                ((wv4) tmVar.a).a(j2, 1, iA8, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (g64Var.b == -9223372036854775807L) {
                            j3 = -this.m;
                        } else {
                            j3 = 0;
                        }
                        this.i = j3;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                    int i18 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        l51Var.l(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        l51Var.l(this.l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i19 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        l51Var.l(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        l51Var.l(this.l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (g64Var.b == -9223372036854775807L) {
                        j3 = -this.m;
                    } else {
                        j3 = 0;
                    }
                    this.i = j3;
                }
                this.j = 4;
                this.g = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        be3 be3Var = this.a;
        rk0 rk0Var = (rk0) l51Var;
        rk0Var.e(be3Var.a, 0, 3, false);
        be3Var.N(0);
        if (be3Var.D() == 4607062) {
            rk0Var.e(be3Var.a, 0, 2, false);
            be3Var.N(0);
            if ((be3Var.H() & 250) == 0) {
                rk0Var.e(be3Var.a, 0, 4, false);
                be3Var.N(0);
                int iM = be3Var.m();
                rk0Var.s = 0;
                rk0Var.o(iM, false);
                rk0Var.e(be3Var.a, 0, 4, false);
                be3Var.N(0);
                if (be3Var.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.f = m51Var;
    }

    public final be3 g(l51 l51Var) {
        int i = this.l;
        be3 be3Var = this.d;
        byte[] bArr = be3Var.a;
        if (i > bArr.length) {
            be3Var.L(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            be3Var.N(0);
        }
        be3Var.M(this.l);
        l51Var.readFully(be3Var.a, 0, this.l);
        return be3Var;
    }
}
