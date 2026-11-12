package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class co implements k51 {
    public final be3 a;
    public final v2 b;
    public final boolean c;
    public final om0 d;
    public int e;
    public m51 f;
    public eo g;
    public long h;
    public u20[] i;
    public long j;
    public u20 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public co(int i, om0 om0Var) {
        this.d = om0Var;
        this.c = (i & 1) == 0;
        this.a = new be3(12);
        this.b = new v2();
        this.f = new tv1();
        this.i = new u20[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        boolean z;
        int i;
        u20 u20Var;
        long j;
        int i2;
        u20 u20Var2;
        int i3 = 0;
        if (this.j != -1) {
            long position = l51Var.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > 262144 + position) {
                t71Var.a = j2;
                z = true;
            } else {
                l51Var.l((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.e;
        int i5 = 4;
        u20 u20Var3 = null;
        v2 v2Var = this.b;
        int i6 = 2;
        be3 be3Var = this.a;
        switch (i4) {
            case 0:
                if (!c(l51Var)) {
                    throw ParserException.a(null, "AVI Header List not found");
                }
                l51Var.l(12);
                this.e = 1;
                return 0;
            case 1:
                l51Var.readFully(be3Var.a, 0, 12);
                be3Var.N(0);
                v2Var.getClass();
                v2Var.a = be3Var.o();
                v2Var.b = be3Var.o();
                v2Var.c = 0;
                if (v2Var.a != 1414744396) {
                    throw ParserException.a(null, "LIST expected, found: " + v2Var.a);
                }
                int iO = be3Var.o();
                v2Var.c = iO;
                if (iO == 1819436136) {
                    this.l = v2Var.b;
                    this.e = 2;
                    return 0;
                }
                throw ParserException.a(null, "hdrl expected, found: " + v2Var.c);
            case 2:
                int i7 = this.l - 4;
                be3 be3Var2 = new be3(i7);
                l51Var.readFully(be3Var2.a, 0, i7);
                rb2 rb2VarB = rb2.b(1819436136, be3Var2);
                int i8 = rb2VarB.b;
                if (i8 != 1819436136) {
                    throw ParserException.a(null, "Unexpected header list type " + i8);
                }
                eo eoVar = (eo) rb2VarB.a(eo.class);
                if (eoVar == null) {
                    throw ParserException.a(null, "AviHeader not found");
                }
                this.g = eoVar;
                this.h = ((long) eoVar.c) * ((long) eoVar.a);
                ArrayList arrayList = new ArrayList();
                vw1 vw1VarListIterator = rb2VarB.a.listIterator(0);
                int i9 = 0;
                while (vw1VarListIterator.hasNext()) {
                    ao aoVar = (ao) vw1VarListIterator.next();
                    if (aoVar.getType() == 1819440243) {
                        rb2 rb2Var = (rb2) aoVar;
                        int i10 = i9 + 1;
                        fo foVar = (fo) rb2Var.a(fo.class);
                        dm4 dm4Var = (dm4) rb2Var.a(dm4.class);
                        if (foVar == null) {
                            l93.q0("AviExtractor", "Missing Stream Header");
                        } else {
                            if (dm4Var == null) {
                                l93.q0("AviExtractor", "Missing Stream Format");
                            } else {
                                long j3 = foVar.d;
                                long j4 = ((long) foVar.b) * 1000000;
                                i = i10;
                                long j5 = foVar.c;
                                String str = f35.a;
                                long jA0 = f35.a0(j3, j4, j5, RoundingMode.DOWN);
                                tb1 tb1Var = dm4Var.a;
                                sb1 sb1VarA = tb1Var.a();
                                sb1VarA.a = Integer.toString(i9);
                                int i11 = foVar.e;
                                if (i11 != 0) {
                                    sb1VarA.n = i11;
                                }
                                hm4 hm4Var = (hm4) rb2Var.a(hm4.class);
                                if (hm4Var != null) {
                                    sb1VarA.b = hm4Var.a;
                                }
                                int iH = lw2.h(tb1Var.n);
                                if (iH == 1 || iH == i6) {
                                    wv4 wv4VarT = this.f.t(i9, iH);
                                    wv4VarT.g(new tb1(sb1VarA));
                                    wv4VarT.d(jA0);
                                    this.h = Math.max(this.h, jA0);
                                    u20Var = new u20(i9, foVar, wv4VarT);
                                } else {
                                    u20Var = null;
                                }
                            }
                            if (u20Var != null) {
                                arrayList.add(u20Var);
                            }
                            i9 = i;
                        }
                        i = i10;
                        u20Var = null;
                        if (u20Var != null) {
                            arrayList.add(u20Var);
                        }
                        i9 = i;
                    }
                    i3 = 0;
                    i6 = 2;
                }
                int i12 = i3;
                this.i = (u20[]) arrayList.toArray(new u20[i12]);
                this.f.p();
                this.e = 3;
                return i12;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                if (this.m != -1) {
                    long position2 = l51Var.getPosition();
                    long j6 = this.m;
                    if (position2 != j6) {
                        this.j = j6;
                        return 0;
                    }
                }
                l51Var.n(be3Var.a, 0, 12);
                l51Var.k();
                be3Var.N(0);
                v2Var.getClass();
                v2Var.a = be3Var.o();
                v2Var.b = be3Var.o();
                v2Var.c = 0;
                int iO2 = be3Var.o();
                int i13 = v2Var.a;
                if (i13 == 1179011410) {
                    l51Var.l(12);
                    return 0;
                }
                if (i13 != 1414744396 || iO2 != 1769369453) {
                    this.j = l51Var.getPosition() + ((long) v2Var.b) + 8;
                    return 0;
                }
                long position3 = l51Var.getPosition();
                this.m = position3;
                this.n = position3 + ((long) v2Var.b) + 8;
                if (!this.p) {
                    eo eoVar2 = this.g;
                    eoVar2.getClass();
                    if ((eoVar2.b & 16) == 16) {
                        this.e = 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.w(new bo(this.h));
                    this.p = true;
                }
                this.j = l51Var.getPosition() + 12;
                this.e = 6;
                return 0;
            case 4:
                l51Var.readFully(be3Var.a, 0, 8);
                be3Var.N(0);
                int iO3 = be3Var.o();
                int iO4 = be3Var.o();
                if (iO3 != 829973609) {
                    this.j = l51Var.getPosition() + ((long) iO4);
                    return 0;
                }
                this.e = 5;
                this.o = iO4;
                return 0;
            case 5:
                be3 be3Var3 = new be3(this.o);
                l51Var.readFully(be3Var3.a, 0, this.o);
                if (be3Var3.a() < 16) {
                    j = 0;
                } else {
                    int i14 = be3Var3.b;
                    be3Var3.O(8);
                    long jO = be3Var3.o();
                    long j7 = this.m;
                    j = jO > j7 ? 0L : j7 + 8;
                    be3Var3.N(i14);
                }
                while (be3Var3.a() >= 16) {
                    int iO5 = be3Var3.o();
                    int iO6 = be3Var3.o();
                    long jO2 = ((long) be3Var3.o()) + j;
                    be3Var3.O(i5);
                    u20[] u20VarArr = this.i;
                    int length = u20VarArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            u20Var2 = u20VarArr[i15];
                            if (u20Var2.c != iO5 && u20Var2.d != iO5) {
                                i15++;
                            }
                        } else {
                            u20Var2 = null;
                        }
                    }
                    if (u20Var2 != null) {
                        boolean z2 = (iO6 & 16) == 16;
                        if (u20Var2.l == -1) {
                            u20Var2.l = jO2;
                        }
                        if (z2) {
                            if (u20Var2.k == u20Var2.n.length) {
                                long[] jArr = u20Var2.m;
                                u20Var2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = u20Var2.n;
                                u20Var2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = u20Var2.m;
                            int i16 = u20Var2.k;
                            jArr2[i16] = jO2;
                            u20Var2.n[i16] = u20Var2.j;
                            u20Var2.k = i16 + 1;
                        }
                        u20Var2.j++;
                    }
                    i5 = 4;
                }
                for (u20 u20Var4 : this.i) {
                    u20Var4.m = Arrays.copyOf(u20Var4.m, u20Var4.k);
                    u20Var4.n = Arrays.copyOf(u20Var4.n, u20Var4.k);
                    if ((u20Var4.c & 1651965952) == 1651965952 && u20Var4.a.f != 0 && (i2 = u20Var4.k) > 0) {
                        u20Var4.f = i2;
                    }
                }
                this.p = true;
                int length2 = this.i.length;
                m51 m51Var = this.f;
                long j8 = this.h;
                if (length2 == 0) {
                    m51Var.w(new bo(j8));
                } else {
                    m51Var.w(new bo(this, j8, 0));
                }
                this.e = 6;
                this.j = this.m;
                return 0;
            case 6:
                if (l51Var.getPosition() >= this.n) {
                    return -1;
                }
                u20 u20Var5 = this.k;
                if (u20Var5 != null) {
                    int i17 = u20Var5.h;
                    int iF = i17 - u20Var5.b.f(l51Var, i17, false);
                    u20Var5.h = iF;
                    boolean z3 = iF == 0;
                    if (z3) {
                        if (u20Var5.g > 0) {
                            wv4 wv4Var = u20Var5.b;
                            int i18 = u20Var5.i;
                            wv4Var.a((u20Var5.e * ((long) i18)) / ((long) u20Var5.f), Arrays.binarySearch(u20Var5.n, i18) >= 0 ? 1 : 0, u20Var5.g, 0, null);
                        }
                        u20Var5.i++;
                    }
                    if (z3) {
                        this.k = null;
                    }
                    return 0;
                }
                if ((l51Var.getPosition() & 1) == 1) {
                    l51Var.l(1);
                }
                l51Var.n(be3Var.a, 0, 12);
                be3Var.N(0);
                int iO7 = be3Var.o();
                if (iO7 == 1414744396) {
                    be3Var.N(8);
                    l51Var.l(be3Var.o() == 1769369453 ? 12 : 8);
                    l51Var.k();
                    return 0;
                }
                int iO8 = be3Var.o();
                if (iO7 == 1263424842) {
                    this.j = l51Var.getPosition() + ((long) iO8) + 8;
                    return 0;
                }
                l51Var.l(8);
                l51Var.k();
                for (u20 u20Var6 : this.i) {
                    if (u20Var6.c == iO7 || u20Var6.d == iO7) {
                        u20Var3 = u20Var6;
                        if (u20Var3 == null) {
                            this.j = l51Var.getPosition() + ((long) iO8);
                            return 0;
                        }
                        u20Var3.g = iO8;
                        u20Var3.h = iO8;
                        this.k = u20Var3;
                        return 0;
                    }
                }
                if (u20Var3 == null) {
                    this.j = l51Var.getPosition() + ((long) iO8);
                    return 0;
                }
                u20Var3.g = iO8;
                u20Var3.h = iO8;
                this.k = u20Var3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        be3 be3Var = this.a;
        l51Var.n(be3Var.a, 0, 12);
        be3Var.N(0);
        if (be3Var.o() != 1179011410) {
            return false;
        }
        be3Var.O(4);
        return be3Var.o() == 541677121;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (u20 u20Var : this.i) {
            if (u20Var.k == 0) {
                u20Var.i = 0;
            } else {
                u20Var.i = u20Var.n[f35.f(u20Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        this.e = 0;
        if (this.c) {
            m51Var = new ll(m51Var, this.d);
        }
        this.f = m51Var;
        this.j = -1L;
    }
}
