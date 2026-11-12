package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe1 implements k51 {
    public static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final tb1 O;
    public long A;
    public ne1 B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public m51 H;
    public wv4[] I;
    public wv4[] J;
    public boolean K;
    public boolean L;
    public long M;
    public final xn4 a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final be3 i;
    public final iu4 j;
    public final c6 o;
    public final hg3 p;
    public gy3 q;
    public int r;
    public int s;
    public long t;
    public int u;
    public be3 v;
    public long w;
    public int x;
    public long y;
    public long z;
    public final rf2 k = new rf2(8);
    public final be3 l = new be3(16);
    public final be3 e = new be3(uc5.c);
    public final be3 f = new be3(6);
    public final be3 g = new be3();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        sb1 sb1Var = new sb1();
        sb1Var.m = lw2.m("application/x-emsg");
        O = new tb1(sb1Var);
    }

    public oe1(xn4 xn4Var, int i, iu4 iu4Var, List list) {
        this.a = xn4Var;
        this.b = i;
        this.j = iu4Var;
        this.c = Collections.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new be3(bArr);
        vw1 vw1Var = yw1.o;
        this.q = gy3.r;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = m51.i;
        this.I = new wv4[0];
        this.J = new wv4[0];
        this.o = new c6(new cn(14, this));
        this.p = new hg3(10);
        this.M = -1L;
    }

    public static ow0 h(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            py2 py2Var = (py2) list.get(i);
            if (py2Var.o == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = py2Var.p.a;
                gc gcVarG = te5.G(bArr);
                UUID uuid = gcVarG == null ? null : (UUID) gcVarG.b;
                if (uuid == null) {
                    l93.q0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new nw0(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new ow0(null, false, (nw0[]) arrayList.toArray(new nw0[0]));
    }

    public static void i(be3 be3Var, int i, rv4 rv4Var) throws ParserException {
        be3Var.N(i + 8);
        int iM = be3Var.m();
        byte[] bArr = wu.a;
        if ((iM & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iE = be3Var.E();
        if (iE == 0) {
            Arrays.fill(rv4Var.l, 0, rv4Var.e, false);
            return;
        }
        int i2 = rv4Var.e;
        be3 be3Var2 = rv4Var.n;
        if (iE != i2) {
            StringBuilder sbJ = f34.j(iE, "Senc sample count ", " is different from fragment sample count");
            sbJ.append(rv4Var.e);
            throw ParserException.a(null, sbJ.toString());
        }
        Arrays.fill(rv4Var.l, 0, iE, z);
        be3Var2.K(be3Var.a());
        rv4Var.k = true;
        rv4Var.o = true;
        be3Var.k(be3Var2.a, 0, be3Var2.c);
        be3Var2.N(0);
        rv4Var.o = false;
    }

    public static Pair j(long j, be3 be3Var) throws ParserException {
        long jG;
        long jG2;
        be3 be3Var2 = be3Var;
        be3Var2.N(8);
        int iE = wu.e(be3Var2.m());
        be3Var2.O(4);
        long jC = be3Var2.C();
        if (iE == 0) {
            jG = be3Var2.C();
            jG2 = be3Var2.C();
        } else {
            jG = be3Var2.G();
            jG2 = be3Var2.G();
        }
        long j2 = jG2 + j;
        String str = f35.a;
        long jA0 = f35.a0(jG, 1000000L, jC, RoundingMode.DOWN);
        be3Var2.O(2);
        int iH = be3Var2.H();
        int[] iArr = new int[iH];
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        long[] jArr3 = new long[iH];
        long j3 = j2;
        long j4 = jA0;
        int i = 0;
        while (i < iH) {
            int iM = be3Var2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw ParserException.a(null, "Unhandled indirect reference");
            }
            long jC2 = be3Var2.C();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jG += jC2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jA1 = f35.a0(jG, 1000000L, jC, RoundingMode.DOWN);
            jArr4[i] = jA1 - jArr5[i];
            be3Var2.O(4);
            j3 += (long) iArr[i];
            i++;
            iH = iH;
            be3Var2 = be3Var;
            j4 = jA1;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jA0), new t20(iArr, jArr, jArr2, jArr3));
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:132:0x027f  */
    /* JADX WARN: Code duplicated, block: B:530:0x028c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.k51
    public final int b(l51 l51Var, t71 t71Var) throws ParserException {
        c6 c6Var;
        be3 be3Var;
        ArrayDeque arrayDeque;
        int i;
        iu4 iu4Var;
        ne1 ne1Var;
        boolean z;
        int i2;
        ne1 ne1Var2;
        int i3;
        int i4;
        String str;
        Object obj;
        int iF;
        int i5;
        boolean z2;
        int i6;
        int i7;
        String strV;
        String strV2;
        long jA0;
        long j;
        long jA;
        long j2;
        long jC;
        l51 l51Var2 = l51Var;
        while (true) {
            int i8 = this.r;
            ArrayDeque arrayDeque2 = this.m;
            c6Var = this.o;
            be3Var = this.i;
            hg3 hg3Var = this.p;
            SparseArray sparseArray = this.d;
            boolean z3 = true;
            if (i8 != 0) {
                arrayDeque = this.n;
                i = this.b;
                iu4Var = this.j;
                if (i8 != 1) {
                    long j3 = Long.MAX_VALUE;
                    if (i8 != 2) {
                        ne1Var = this.B;
                        if (ne1Var != null) {
                            z = true;
                            i2 = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        int i9 = 0;
                        ne1 ne1Var3 = null;
                        while (i9 < size) {
                            ne1 ne1Var4 = (ne1) sparseArray.valueAt(i9);
                            boolean z4 = z3;
                            boolean z5 = ne1Var4.m;
                            rv4 rv4Var = ne1Var4.b;
                            if (z5) {
                                i7 = size;
                            } else {
                                i7 = size;
                                if (ne1Var4.f != ne1Var4.d.b) {
                                }
                                i9++;
                                z3 = z4;
                                size = i7;
                            }
                            if (!z5 || ne1Var4.h != rv4Var.d) {
                                long j4 = !z5 ? ne1Var4.d.c[ne1Var4.f] : rv4Var.f[ne1Var4.h];
                                if (j4 < j3) {
                                    ne1Var3 = ne1Var4;
                                    j3 = j4;
                                }
                            }
                            i9++;
                            z3 = z4;
                            size = i7;
                        }
                        z = z3;
                        i2 = 8;
                        if (ne1Var3 != null) {
                            int position = (int) ((!ne1Var3.m ? ne1Var3.d.c[ne1Var3.f] : ne1Var3.b.f[ne1Var3.h]) - l51Var2.getPosition());
                            if (position < 0) {
                                l93.q0("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position = 0;
                            }
                            l51Var2.l(position);
                            this.B = ne1Var3;
                            ne1Var = ne1Var3;
                            break;
                        }
                        int position2 = (int) (this.w - l51Var2.getPosition());
                        if (position2 < 0) {
                            throw ParserException.a(null, "Offset to end of mdat was negative.");
                        }
                        l51Var2.l(position2);
                        g();
                    } else {
                        int size2 = sparseArray.size();
                        ne1 ne1Var5 = null;
                        for (int i10 = 0; i10 < size2; i10++) {
                            rv4 rv4Var2 = ((ne1) sparseArray.valueAt(i10)).b;
                            if (rv4Var2.o) {
                                long j5 = rv4Var2.c;
                                if (j5 < j3) {
                                    ne1Var5 = (ne1) sparseArray.valueAt(i10);
                                    j3 = j5;
                                }
                            }
                        }
                        if (ne1Var5 == null) {
                            this.r = 3;
                        } else {
                            int position3 = (int) (j3 - l51Var2.getPosition());
                            if (position3 < 0) {
                                throw ParserException.a(null, "Offset to encryption data was negative.");
                            }
                            l51Var2.l(position3);
                            rv4 rv4Var3 = ne1Var5.b;
                            be3 be3Var2 = rv4Var3.n;
                            l51Var2.readFully(be3Var2.a, 0, be3Var2.c);
                            be3Var2.N(0);
                            rv4Var3.o = false;
                        }
                    }
                } else {
                    int i11 = (int) (this.t - ((long) this.u));
                    be3 be3Var3 = this.v;
                    if (be3Var3 != null) {
                        l51Var2.readFully(be3Var3.a, 8, i11);
                        int i12 = this.s;
                        py2 py2Var = new py2(i12, be3Var3);
                        if (!arrayDeque2.isEmpty()) {
                            ((oy2) arrayDeque2.peek()).q.add(py2Var);
                        } else if (i12 == 1936286840) {
                            Pair pairJ = j(l51Var2.getPosition(), be3Var3);
                            hg3Var.A((t20) pairJ.second);
                            if (!this.K) {
                                this.A = ((Long) pairJ.first).longValue();
                                this.H.w((m84) pairJ.second);
                                this.K = true;
                            } else if ((i & 256) != 0 && !this.L && ((LinkedHashMap) hg3Var.o).size() > 1) {
                                this.M = l51Var2.getPosition();
                            }
                        } else if (i12 == 1701671783 && this.I.length != 0) {
                            be3Var3.N(8);
                            int iE = wu.e(be3Var3.m());
                            if (iE == 0) {
                                strV = be3Var3.v();
                                strV.getClass();
                                strV2 = be3Var3.v();
                                strV2.getClass();
                                long jC2 = be3Var3.C();
                                long jC3 = be3Var3.C();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long jA1 = f35.a0(jC3, 1000000L, jC2, roundingMode);
                                long j6 = this.A;
                                long j7 = j6 != -9223372036854775807L ? j6 + jA1 : -9223372036854775807L;
                                jA0 = f35.a0(be3Var3.C(), 1000L, jC2, roundingMode);
                                long j8 = j7;
                                j = jA1;
                                jA = j8;
                                j2 = -9223372036854775807L;
                                jC = be3Var3.C();
                            } else if (iE != 1) {
                                xa3.m(iE, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jC4 = be3Var3.C();
                                long jG = be3Var3.G();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                jA = f35.a0(jG, 1000000L, jC4, roundingMode2);
                                long jA2 = f35.a0(be3Var3.C(), 1000L, jC4, roundingMode2);
                                long jC5 = be3Var3.C();
                                strV = be3Var3.v();
                                strV.getClass();
                                strV2 = be3Var3.v();
                                strV2.getClass();
                                j2 = -9223372036854775807L;
                                jC = jC5;
                                jA0 = jA2;
                                j = -9223372036854775807L;
                            }
                            byte[] bArr = new byte[be3Var3.a()];
                            be3Var3.k(bArr, 0, be3Var3.a());
                            rf2 rf2Var = this.k;
                            DataOutputStream dataOutputStream = (DataOutputStream) rf2Var.o;
                            ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) rf2Var.n;
                            byteArrayOutputStream.reset();
                            try {
                                dataOutputStream.writeBytes(strV);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeBytes(strV2);
                                dataOutputStream.writeByte(0);
                                dataOutputStream.writeLong(jA0);
                                dataOutputStream.writeLong(jC);
                                dataOutputStream.write(bArr);
                                dataOutputStream.flush();
                                be3 be3Var4 = new be3(byteArrayOutputStream.toByteArray());
                                int iA = be3Var4.a();
                                for (wv4 wv4Var : this.I) {
                                    be3Var4.N(0);
                                    wv4Var.e(iA, be3Var4);
                                }
                                if (jA == j2) {
                                    arrayDeque.addLast(new me1(iA, j, true));
                                    this.x += iA;
                                } else if (!arrayDeque.isEmpty()) {
                                    arrayDeque.addLast(new me1(iA, jA, false));
                                    this.x += iA;
                                } else if (iu4Var == null || iu4Var.e()) {
                                    if (iu4Var != null) {
                                        jA = iu4Var.a(jA);
                                    }
                                    long j9 = jA;
                                    for (wv4 wv4Var2 : this.I) {
                                        wv4Var2.a(j9, 1, iA, 0, null);
                                    }
                                } else {
                                    arrayDeque.addLast(new me1(iA, jA, false));
                                    this.x += iA;
                                }
                            } catch (IOException e) {
                                er1.m(e);
                                return 0;
                            }
                        }
                        l51Var2 = l51Var;
                    } else {
                        l51Var2.l(i11);
                    }
                    k(l51Var2.getPosition());
                }
            } else {
                int i13 = this.u;
                long length = 0;
                be3 be3Var5 = this.l;
                if (i13 == 0) {
                    if (!l51Var2.a(be3Var5.a, 0, 8, true)) {
                        long j10 = this.M;
                        if (j10 == -1) {
                            c6Var.j(0);
                            return -1;
                        }
                        t71Var.a = j10;
                        this.M = -1L;
                        m51 m51Var = this.H;
                        hg3Var.getClass();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (t20 t20Var : ((LinkedHashMap) hg3Var.o).values()) {
                            arrayList.add(t20Var.b);
                            arrayList2.add(t20Var.c);
                            arrayList3.add(t20Var.d);
                            arrayList4.add(t20Var.e);
                        }
                        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
                        for (int[] iArr2 : iArr) {
                            length += (long) iArr2.length;
                        }
                        int i14 = (int) length;
                        rr2.m(length == ((long) i14), "the total number of elements (%s) in the arrays must fit in an int", length);
                        int[] iArr3 = new int[i14];
                        int length2 = 0;
                        for (int[] iArr4 : iArr) {
                            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
                            length2 += iArr4.length;
                        }
                        m51Var.w(new t20(iArr3, si0.n((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), si0.n((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), si0.n((long[][]) arrayList4.toArray(new long[arrayList4.size()][]))));
                        this.L = true;
                        return 1;
                    }
                    this.u = 8;
                    be3Var5.N(0);
                    this.t = be3Var5.C();
                    this.s = be3Var5.m();
                }
                long j11 = this.t;
                if (j11 == 1) {
                    l51Var2.readFully(be3Var5.a, 8, 8);
                    this.u += 8;
                    this.t = be3Var5.G();
                } else if (j11 == 0) {
                    long length3 = l51Var2.getLength();
                    if (length3 == -1 && !arrayDeque2.isEmpty()) {
                        length3 = ((oy2) arrayDeque2.peek()).p;
                    }
                    if (length3 != -1) {
                        this.t = (length3 - l51Var2.getPosition()) + ((long) this.u);
                    }
                }
                long j12 = this.t;
                int i15 = this.u;
                long j13 = i15;
                if (j12 < j13) {
                    if (this.s != 1718773093 || i15 != 8) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    this.t = j13;
                }
                if (this.M != -1) {
                    int i16 = this.s;
                    long j14 = this.t;
                    if (i16 == 1936286840) {
                        be3Var.K((int) j14);
                        System.arraycopy(be3Var5.a, 0, be3Var.a, 0, 8);
                        l51Var2.readFully(be3Var.a, 8, (int) (this.t - ((long) this.u)));
                        hg3Var.A((t20) j(l51Var2.f(), be3Var).second);
                    } else {
                        l51Var2.d((int) (j14 - j13), true);
                    }
                    g();
                } else {
                    long position4 = l51Var2.getPosition() - ((long) this.u);
                    int i17 = this.s;
                    if ((i17 == 1836019558 || i17 == 1835295092) && !this.K) {
                        this.H.w(new bo(this.z, position4));
                        this.K = true;
                    }
                    if (this.s == 1836019558) {
                        int size3 = sparseArray.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            rv4 rv4Var4 = ((ne1) sparseArray.valueAt(i18)).b;
                            rv4Var4.getClass();
                            rv4Var4.c = position4;
                            rv4Var4.b = position4;
                        }
                    }
                    int i19 = this.s;
                    if (i19 == 1835295092) {
                        this.B = null;
                        this.w = position4 + this.t;
                        this.r = 2;
                    } else if (i19 == 1836019574 || i19 == 1953653099 || i19 == 1835297121 || i19 == 1835626086 || i19 == 1937007212 || i19 == 1836019558 || i19 == 1953653094 || i19 == 1836475768 || i19 == 1701082227 || i19 == 1835365473) {
                        long position5 = l51Var2.getPosition();
                        long j15 = this.t;
                        long j16 = (position5 + j15) - 8;
                        if (j15 != this.u && this.s == 1835365473) {
                            be3Var.K(8);
                            l51Var2.n(be3Var.a, 0, 8);
                            wu.a(be3Var);
                            l51Var2.l(be3Var.b);
                            l51Var2.k();
                        }
                        arrayDeque2.push(new oy2(this.s, j16));
                        if (this.t == this.u) {
                            k(j16);
                        } else {
                            g();
                        }
                    } else if (i19 == 1751411826 || i19 == 1835296868 || i19 == 1836476516 || i19 == 1936286840 || i19 == 1937011556 || i19 == 1937011827 || i19 == 1668576371 || i19 == 1937011555 || i19 == 1937011578 || i19 == 1937013298 || i19 == 1937007471 || i19 == 1668232756 || i19 == 1937011571 || i19 == 1952867444 || i19 == 1952868452 || i19 == 1953196132 || i19 == 1953654136 || i19 == 1953658222 || i19 == 1886614376 || i19 == 1935763834 || i19 == 1935763823 || i19 == 1936027235 || i19 == 1970628964 || i19 == 1935828848 || i19 == 1936158820 || i19 == 1701606260 || i19 == 1835362404 || i19 == 1701671783 || i19 == 1969517665 || i19 == 1801812339 || i19 == 1768715124) {
                        if (this.u != 8) {
                            throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.t > 2147483647L) {
                            throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        be3 be3Var6 = new be3((int) this.t);
                        System.arraycopy(be3Var5.a, 0, be3Var6.a, 0, 8);
                        this.v = be3Var6;
                        this.r = 1;
                    } else {
                        if (this.t > 2147483647L) {
                            throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.v = null;
                        this.r = 1;
                    }
                }
            }
        }
        wv4 wv4Var3 = ne1Var.a;
        rv4 rv4Var5 = ne1Var.b;
        String str2 = "video/avc";
        if (this.r == 3) {
            this.C = !ne1Var.m ? ne1Var.d.d[ne1Var.f] : rv4Var5.h[ne1Var.f];
            tb1 tb1Var = ne1Var.d.a.g;
            this.F = !((!Objects.equals(tb1Var.n, "video/avc") ? !(!Objects.equals(tb1Var.n, "video/hevc") || (i & 128) == 0) : (i & 64) != 0) ? false : z);
            if (ne1Var.f < ne1Var.i) {
                l51Var2.l(this.C);
                qv4 qv4VarB = ne1Var.b();
                if (qv4VarB != null) {
                    be3 be3Var7 = rv4Var5.n;
                    int i20 = qv4VarB.d;
                    if (i20 != 0) {
                        be3Var7.O(i20);
                    }
                    int i21 = ne1Var.f;
                    if (rv4Var5.k && rv4Var5.l[i21]) {
                        be3Var7.O(be3Var7.H() * 6);
                    }
                }
                if (!ne1Var.c()) {
                    this.B = null;
                }
                this.r = 3;
                return 0;
            }
            if (ne1Var.d.a.h == z) {
                this.C -= 8;
                l51Var2.l(i2);
            }
            boolean zEquals = "audio/ac4".equals(ne1Var.d.a.g.n);
            int i22 = this.C;
            if (zEquals) {
                this.D = ne1Var.d(i22, 7);
                hw.g(this.C, be3Var);
                wv4Var3.e(7, be3Var);
                this.D += 7;
                i6 = 0;
            } else {
                i6 = 0;
                this.D = ne1Var.d(i22, 0);
            }
            this.C += this.D;
            this.r = 4;
            this.E = i6;
        }
        xv4 xv4Var = ne1Var.d;
        pv4 pv4Var = xv4Var.a;
        Object obj2 = "video/hevc";
        long jA3 = ne1Var.m ? rv4Var5.i[ne1Var.f] : xv4Var.f[ne1Var.f];
        if (iu4Var != null) {
            jA3 = iu4Var.a(jA3);
        }
        int i23 = pv4Var.k;
        tb1 tb1Var2 = pv4Var.g;
        if (i23 == 0) {
            ne1Var2 = ne1Var;
            while (true) {
                int i24 = this.D;
                int i25 = this.C;
                if (i24 >= i25) {
                    break;
                }
                this.D += wv4Var3.f(l51Var2, i25 - i24, false);
            }
        } else {
            be3 be3Var8 = this.f;
            byte[] bArr2 = be3Var8.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i26 = 4 - i23;
            while (true) {
                ne1Var2 = ne1Var;
                if (this.D >= this.C) {
                    break;
                }
                int i27 = this.E;
                if (i27 == 0) {
                    if (this.J.length > 0 || !this.F) {
                        int iC = uc5.C(tb1Var2);
                        if (i23 + iC <= this.C - this.D) {
                            i5 = iC;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i5 = 0;
                    }
                    l51Var2.readFully(bArr2, i26, i23 + i5);
                    be3Var8.N(0);
                    int iM = be3Var8.m();
                    if (iM < 0) {
                        throw ParserException.a(null, "Invalid NAL length");
                    }
                    this.E = iM - i5;
                    be3 be3Var9 = this.e;
                    i3 = i23;
                    be3Var9.N(0);
                    wv4Var3.e(4, be3Var9);
                    this.D += 4;
                    this.C += i26;
                    if (this.J.length <= 0 || i5 <= 0) {
                        i4 = i26;
                        str = str2;
                        obj = obj2;
                    } else {
                        byte b = bArr2[4];
                        String strR = uc5.r(tb1Var2);
                        if (Objects.equals(strR, str2)) {
                            i4 = i26;
                            str = str2;
                            if ((b & 31) == 6) {
                                obj = obj2;
                            }
                            z2 = true;
                            this.G = z2;
                            wv4Var3.e(i5, be3Var8);
                            this.D += i5;
                            if (i5 <= 0 && !this.F && uc5.y(bArr2, i5, tb1Var2)) {
                                this.F = true;
                            }
                        } else {
                            i4 = i26;
                            str = str2;
                        }
                        obj = obj2;
                        if (Objects.equals(strR, obj) && ((b & 126) >> 1) == 39) {
                            z2 = true;
                        }
                        this.G = z2;
                        wv4Var3.e(i5, be3Var8);
                        this.D += i5;
                        if (i5 <= 0) {
                        }
                    }
                    z2 = false;
                    this.G = z2;
                    wv4Var3.e(i5, be3Var8);
                    this.D += i5;
                    if (i5 <= 0) {
                    }
                } else {
                    i3 = i23;
                    i4 = i26;
                    str = str2;
                    obj = obj2;
                    if (this.G) {
                        be3 be3Var10 = this.g;
                        be3Var10.K(i27);
                        l51Var2.readFully(be3Var10.a, 0, this.E);
                        wv4Var3.e(this.E, be3Var10);
                        int i28 = this.E;
                        int iB0 = uc5.b0(be3Var10.c, be3Var10.a);
                        be3Var10.N(0);
                        be3Var10.M(iB0);
                        int i29 = tb1Var2.p;
                        if (i29 == -1) {
                            if (c6Var.a != 0) {
                                c6Var.x(0);
                            }
                        } else if (c6Var.a != i29) {
                            c6Var.x(i29);
                        }
                        c6Var.a(jA3, be3Var10);
                        if ((ne1Var2.a() & 4) != 0) {
                            c6Var.j(0);
                        }
                        iF = i28;
                    } else {
                        iF = wv4Var3.f(l51Var2, i27, false);
                    }
                    this.D += iF;
                    this.E -= iF;
                }
                obj2 = obj;
                i26 = i4;
                ne1Var = ne1Var2;
                i23 = i3;
                str2 = str;
            }
        }
        int iA2 = ne1Var2.a();
        if (!this.F) {
            iA2 |= 67108864;
        }
        int i30 = iA2;
        qv4 qv4VarB2 = ne1Var2.b();
        long j17 = jA3;
        wv4Var3.a(j17, i30, this.C, 0, qv4VarB2 != null ? qv4VarB2.c : null);
        while (!arrayDeque.isEmpty()) {
            me1 me1Var = (me1) arrayDeque.removeFirst();
            this.x -= me1Var.c;
            long jA4 = me1Var.a;
            if (me1Var.b) {
                jA4 += j17;
            }
            if (iu4Var != null) {
                jA4 = iu4Var.a(jA4);
            }
            long j18 = jA4;
            for (wv4 wv4Var4 : this.I) {
                wv4Var4.a(j18, 1, me1Var.c, this.x, null);
            }
        }
        if (!ne1Var2.c()) {
            this.B = null;
        }
        this.r = 3;
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 l51Var) {
        gy3 gy3VarO;
        th4 th4VarF0 = ud3.F0(l51Var, true, false);
        if (th4VarF0 != null) {
            gy3VarO = yw1.o(th4VarF0);
        } else {
            vw1 vw1Var = yw1.o;
            gy3VarO = gy3.r;
        }
        this.q = gy3VarO;
        return th4VarF0 == null;
    }

    @Override // defpackage.k51
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((ne1) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.x = 0;
        ((PriorityQueue) this.o.e).clear();
        this.y = j2;
        this.m.clear();
        g();
    }

    @Override // defpackage.k51
    public final List e() {
        return this.q;
    }

    @Override // defpackage.k51
    public final void f(m51 m51Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            m51Var = new ll(m51Var, this.a);
        }
        this.H = m51Var;
        g();
        wv4[] wv4VarArr = new wv4[2];
        this.I = wv4VarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            wv4VarArr[0] = this.H.t(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        wv4[] wv4VarArr2 = (wv4[]) f35.S(i, this.I);
        this.I = wv4VarArr2;
        for (wv4 wv4Var : wv4VarArr2) {
            wv4Var.g(O);
        }
        List list = this.c;
        this.J = new wv4[list.size()];
        while (i4 < this.J.length) {
            wv4 wv4VarT = this.H.t(i3, 3);
            wv4VarT.g((tb1) list.get(i4));
            this.J[i4] = wv4VarT;
            i4++;
            i3++;
        }
    }

    public final void g() {
        this.r = 0;
        this.u = 0;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x066d  */
    public final void k(long j) throws ParserException {
        qv2 qv2Var;
        int i;
        long j2;
        qm0 qm0Var;
        int i2;
        qm0 qm0Var2;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        boolean z;
        int i7;
        boolean z2;
        while (true) {
            ArrayDeque arrayDeque = this.m;
            if (arrayDeque.isEmpty() || ((oy2) arrayDeque.peek()).p != j) {
                break;
            }
            oy2 oy2Var = (oy2) arrayDeque.pop();
            int i8 = oy2Var.o;
            ArrayList arrayList4 = oy2Var.r;
            ArrayList arrayList5 = oy2Var.q;
            int i9 = this.b;
            int i10 = 12;
            SparseArray sparseArray = this.d;
            if (i8 == 1836019574) {
                ow0 ow0VarH = h(arrayList5);
                oy2 oy2VarR = oy2Var.r(1836475768);
                oy2VarR.getClass();
                SparseArray sparseArray2 = new SparseArray();
                ArrayList arrayList6 = oy2VarR.q;
                int size = arrayList6.size();
                int i11 = 0;
                long jC = -9223372036854775807L;
                while (i11 < size) {
                    py2 py2Var = (py2) arrayList6.get(i11);
                    int i12 = py2Var.o;
                    be3 be3Var = py2Var.p;
                    if (i12 == 1953654136) {
                        be3Var.N(i10);
                        arrayList = arrayList6;
                        Pair pairCreate = Pair.create(Integer.valueOf(be3Var.m()), new qm0(be3Var.m() - 1, be3Var.m(), be3Var.m(), be3Var.m()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (qm0) pairCreate.second);
                    } else {
                        arrayList = arrayList6;
                        if (i12 == 1835362404) {
                            be3Var.N(8);
                            jC = wu.e(be3Var.m()) == 0 ? be3Var.C() : be3Var.G();
                        }
                    }
                    i11++;
                    arrayList6 = arrayList;
                    i10 = 12;
                }
                int i13 = 0;
                oy2 oy2VarR2 = oy2Var.r(1835365473);
                qv2 qv2VarF = oy2VarR2 != null ? wu.f(oy2VarR2) : null;
                zg1 zg1Var = new zg1();
                py2 py2VarS = oy2Var.s(1969517665);
                if (py2VarS != null) {
                    qv2 qv2VarK = wu.k(py2VarS);
                    zg1Var.b(qv2VarK);
                    qv2Var = qv2VarK;
                } else {
                    qv2Var = null;
                }
                py2 py2VarS2 = oy2Var.s(1836476516);
                py2VarS2.getClass();
                qv2 qv2Var2 = new qv2(wu.g(py2VarS2.p));
                ArrayList arrayListJ = wu.j(oy2Var, zg1Var, jC, ow0VarH, (i9 & 16) != 0, false, new mj0(this), false);
                int size2 = arrayListJ.size();
                if (sparseArray.size() == 0) {
                    String strR = au0.r(arrayListJ);
                    int i14 = 0;
                    while (i14 < size2) {
                        xv4 xv4Var = (xv4) arrayListJ.get(i14);
                        pv4 pv4Var = xv4Var.a;
                        m51 m51Var = this.H;
                        int i15 = pv4Var.b;
                        int i16 = pv4Var.a;
                        String str = strR;
                        tb1 tb1Var = pv4Var.g;
                        long j3 = pv4Var.e;
                        wv4 wv4VarT = m51Var.t(i14, i15);
                        wv4VarT.d(j3);
                        int i17 = i14;
                        sb1 sb1VarA = tb1Var.a();
                        ArrayList arrayList7 = arrayListJ;
                        sb1VarA.l = lw2.m(str);
                        if (i15 == 1) {
                            int i18 = zg1Var.a;
                            i = size2;
                            j2 = j3;
                            if (i18 != -1 && (i2 = zg1Var.b) != -1) {
                                sb1VarA.H = i18;
                                sb1VarA.I = i2;
                            }
                        } else {
                            i = size2;
                            j2 = j3;
                        }
                        gh0.D(i15, qv2VarF, sb1VarA, tb1Var.l, qv2Var, qv2Var2);
                        if (sparseArray2.size() == 1) {
                            qm0Var = (qm0) sparseArray2.valueAt(i13);
                        } else {
                            qm0Var = (qm0) sparseArray2.get(i16);
                            qm0Var.getClass();
                        }
                        sparseArray.put(i16, new ne1(wv4VarT, xv4Var, qm0Var, new tb1(sb1VarA)));
                        this.z = Math.max(this.z, j2);
                        i14 = i17 + 1;
                        strR = str;
                        arrayListJ = arrayList7;
                        size2 = i;
                        i13 = 0;
                    }
                    this.H.p();
                } else {
                    ArrayList arrayList8 = arrayListJ;
                    rr2.w(sparseArray.size() == size2);
                    int i19 = 0;
                    while (i19 < size2) {
                        ArrayList arrayList9 = arrayList8;
                        xv4 xv4Var2 = (xv4) arrayList9.get(i19);
                        pv4 pv4Var2 = xv4Var2.a;
                        ne1 ne1Var = (ne1) sparseArray.get(pv4Var2.a);
                        int i20 = pv4Var2.a;
                        if (sparseArray2.size() == 1) {
                            qm0Var2 = (qm0) sparseArray2.valueAt(0);
                        } else {
                            qm0Var2 = (qm0) sparseArray2.get(i20);
                            qm0Var2.getClass();
                        }
                        ne1Var.d = xv4Var2;
                        ne1Var.e = qm0Var2;
                        ne1Var.a.g(ne1Var.j);
                        ne1Var.e();
                        i19++;
                        arrayList8 = arrayList9;
                    }
                }
            } else if (i8 == 1836019558) {
                int size3 = arrayList4.size();
                int i21 = 0;
                while (i21 < size3) {
                    oy2 oy2Var2 = (oy2) arrayList4.get(i21);
                    if (oy2Var2.o == 1953653094) {
                        py2 py2VarS3 = oy2Var2.s(1952868452);
                        ArrayList arrayList10 = oy2Var2.q;
                        py2VarS3.getClass();
                        be3 be3Var2 = py2VarS3.p;
                        be3Var2.N(8);
                        int iM = be3Var2.m();
                        byte[] bArr2 = wu.a;
                        ne1 ne1Var2 = (ne1) sparseArray.get(be3Var2.m());
                        if (ne1Var2 == null) {
                            size3 = size3;
                            ne1Var2 = null;
                        } else {
                            rv4 rv4Var = ne1Var2.b;
                            if ((iM & 1) != 0) {
                                long jG = be3Var2.G();
                                rv4Var.b = jG;
                                rv4Var.c = jG;
                            }
                            qm0 qm0Var3 = ne1Var2.e;
                            rv4Var.a = new qm0((iM & 2) != 0 ? be3Var2.m() - 1 : qm0Var3.a, (iM & 8) != 0 ? be3Var2.m() : qm0Var3.b, (iM & 16) != 0 ? be3Var2.m() : qm0Var3.c, (iM & 32) != 0 ? be3Var2.m() : qm0Var3.d);
                        }
                        if (ne1Var2 != null) {
                            rv4 rv4Var2 = ne1Var2.b;
                            long j4 = rv4Var2.p;
                            boolean z3 = rv4Var2.q;
                            ne1Var2.e();
                            ne1Var2.m = true;
                            py2 py2VarS4 = oy2Var2.s(1952867444);
                            if (py2VarS4 == null || (i9 & 2) != 0) {
                                rv4Var2.p = j4;
                                rv4Var2.q = z3;
                            } else {
                                be3 be3Var3 = py2VarS4.p;
                                be3Var3.N(8);
                                rv4Var2.p = wu.e(be3Var3.m()) == 1 ? be3Var3.G() : be3Var3.C();
                                rv4Var2.q = true;
                            }
                            int size4 = arrayList10.size();
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                i5 = 1953658222;
                                if (i22 >= size4) {
                                    break;
                                }
                                py2 py2Var2 = (py2) arrayList10.get(i22);
                                int i25 = i21;
                                if (py2Var2.o == 1953658222) {
                                    be3 be3Var4 = py2Var2.p;
                                    be3Var4.N(12);
                                    int iE = be3Var4.E();
                                    if (iE > 0) {
                                        i24 += iE;
                                        i23++;
                                    }
                                }
                                i22++;
                                i21 = i25;
                            }
                            i3 = i21;
                            ne1Var2.h = 0;
                            ne1Var2.g = 0;
                            ne1Var2.f = 0;
                            rv4Var2.d = i23;
                            rv4Var2.e = i24;
                            if (rv4Var2.g.length < i23) {
                                rv4Var2.f = new long[i23];
                                rv4Var2.g = new int[i23];
                            }
                            if (rv4Var2.h.length < i24) {
                                int i26 = (i24 * 125) / 100;
                                rv4Var2.h = new int[i26];
                                rv4Var2.i = new long[i26];
                                rv4Var2.j = new boolean[i26];
                                rv4Var2.l = new boolean[i26];
                            }
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                long j5 = 0;
                                if (i27 >= size4) {
                                    arrayList2 = arrayList4;
                                    arrayList3 = arrayList5;
                                    i4 = i9;
                                    pv4 pv4Var3 = ne1Var2.d.a;
                                    qm0 qm0Var4 = rv4Var2.a;
                                    qm0Var4.getClass();
                                    qv4 qv4Var = pv4Var3.l[qm0Var4.a];
                                    py2 py2VarS5 = oy2Var2.s(1935763834);
                                    if (py2VarS5 != null) {
                                        qv4Var.getClass();
                                        be3 be3Var5 = py2VarS5.p;
                                        int i30 = qv4Var.d;
                                        be3Var5.N(8);
                                        int iM2 = be3Var5.m();
                                        byte[] bArr3 = wu.a;
                                        if ((iM2 & 1) == 1) {
                                            be3Var5.O(8);
                                        }
                                        int iA = be3Var5.A();
                                        int iE2 = be3Var5.E();
                                        if (iE2 > rv4Var2.e) {
                                            StringBuilder sbJ = f34.j(iE2, "Saiz sample count ", " is greater than fragment sample count");
                                            sbJ.append(rv4Var2.e);
                                            throw ParserException.a(null, sbJ.toString());
                                        }
                                        if (iA == 0) {
                                            boolean[] zArr = rv4Var2.l;
                                            i6 = 0;
                                            for (int i31 = 0; i31 < iE2; i31++) {
                                                int iA2 = be3Var5.A();
                                                i6 += iA2;
                                                zArr[i31] = iA2 > i30;
                                            }
                                            z = false;
                                        } else {
                                            boolean z4 = iA > i30;
                                            i6 = iA * iE2;
                                            z = false;
                                            Arrays.fill(rv4Var2.l, 0, iE2, z4);
                                        }
                                        Arrays.fill(rv4Var2.l, iE2, rv4Var2.e, z);
                                        if (i6 > 0) {
                                            rv4Var2.n.K(i6);
                                            rv4Var2.k = true;
                                            rv4Var2.o = true;
                                        }
                                    }
                                    py2 py2VarS6 = oy2Var2.s(1935763823);
                                    if (py2VarS6 != null) {
                                        be3 be3Var6 = py2VarS6.p;
                                        be3Var6.N(8);
                                        int iM3 = be3Var6.m();
                                        byte[] bArr4 = wu.a;
                                        if ((iM3 & 1) == 1) {
                                            be3Var6.O(8);
                                        }
                                        int iE3 = be3Var6.E();
                                        if (iE3 != 1) {
                                            throw ParserException.a(null, "Unexpected saio entry count: " + iE3);
                                        }
                                        rv4Var2.c += wu.e(iM3) == 0 ? be3Var6.C() : be3Var6.G();
                                    }
                                    py2 py2VarS7 = oy2Var2.s(1936027235);
                                    if (py2VarS7 != null) {
                                        i(py2VarS7.p, 0, rv4Var2);
                                    }
                                    String str2 = qv4Var != null ? qv4Var.b : null;
                                    be3 be3Var7 = null;
                                    be3 be3Var8 = null;
                                    for (int i32 = 0; i32 < arrayList10.size(); i32++) {
                                        py2 py2Var3 = (py2) arrayList10.get(i32);
                                        be3 be3Var9 = py2Var3.p;
                                        int i33 = py2Var3.o;
                                        if (i33 == 1935828848) {
                                            be3Var9.N(12);
                                            if (be3Var9.m() == 1936025959) {
                                                be3Var7 = be3Var9;
                                            }
                                        } else if (i33 == 1936158820) {
                                            be3Var9.N(12);
                                            if (be3Var9.m() == 1936025959) {
                                                be3Var8 = be3Var9;
                                            }
                                        }
                                    }
                                    if (be3Var7 != null && be3Var8 != null) {
                                        be3Var7.N(8);
                                        int iE4 = wu.e(be3Var7.m());
                                        be3Var7.O(4);
                                        if (iE4 == 1) {
                                            be3Var7.O(4);
                                        }
                                        if (be3Var7.m() != 1) {
                                            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        be3Var8.N(8);
                                        int iE5 = wu.e(be3Var8.m());
                                        be3Var8.O(4);
                                        if (iE5 == 1) {
                                            if (be3Var8.C() == 0) {
                                                throw ParserException.c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (iE5 >= 2) {
                                            be3Var8.O(4);
                                        }
                                        if (be3Var8.C() != 1) {
                                            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        be3Var8.O(1);
                                        int iA3 = be3Var8.A();
                                        int i34 = (iA3 & 240) >> 4;
                                        int i35 = iA3 & 15;
                                        boolean z5 = be3Var8.A() == 1;
                                        if (z5) {
                                            int iA4 = be3Var8.A();
                                            byte[] bArr5 = new byte[16];
                                            be3Var8.k(bArr5, 0, 16);
                                            if (iA4 == 0) {
                                                int iA5 = be3Var8.A();
                                                byte[] bArr6 = new byte[iA5];
                                                be3Var8.k(bArr6, 0, iA5);
                                                bArr = bArr6;
                                            } else {
                                                bArr = null;
                                            }
                                            rv4Var2.k = true;
                                            rv4Var2.m = new qv4(z5, str2, iA4, bArr5, i34, i35, bArr);
                                        }
                                    }
                                    int size5 = arrayList10.size();
                                    for (int i36 = 0; i36 < size5; i36++) {
                                        py2 py2Var4 = (py2) arrayList10.get(i36);
                                        if (py2Var4.o == 1970628964) {
                                            be3 be3Var10 = py2Var4.p;
                                            be3Var10.N(8);
                                            byte[] bArr7 = this.h;
                                            be3Var10.k(bArr7, 0, 16);
                                            if (Arrays.equals(bArr7, N)) {
                                                i(be3Var10, 16, rv4Var2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                py2 py2Var5 = (py2) arrayList10.get(i27);
                                if (py2Var5.o == i5) {
                                    int i37 = i28 + 1;
                                    be3 be3Var11 = py2Var5.p;
                                    be3Var11.N(8);
                                    int iM4 = be3Var11.m();
                                    byte[] bArr8 = wu.a;
                                    pv4 pv4Var4 = ne1Var2.d.a;
                                    qm0 qm0Var5 = rv4Var2.a;
                                    String str3 = f35.a;
                                    rv4Var2.g[i28] = be3Var11.E();
                                    long[] jArr = rv4Var2.f;
                                    i7 = i9;
                                    long j6 = rv4Var2.b;
                                    jArr[i28] = j6;
                                    if ((iM4 & 1) != 0) {
                                        jArr[i28] = j6 + ((long) be3Var11.m());
                                    }
                                    boolean z6 = (iM4 & 4) != 0;
                                    int iM5 = qm0Var5.d;
                                    if (z6) {
                                        iM5 = be3Var11.m();
                                    }
                                    boolean z7 = (iM4 & 256) != 0;
                                    boolean z8 = z6;
                                    boolean z9 = (iM4 & 512) != 0;
                                    boolean z10 = (iM4 & 1024) != 0;
                                    boolean z11 = (iM4 & 2048) != 0;
                                    boolean z12 = z10;
                                    long[] jArr2 = pv4Var4.i;
                                    int i38 = iM5;
                                    long[] jArr3 = pv4Var4.j;
                                    if (jArr2 == null || jArr2.length != 1 || jArr3 == null) {
                                        z2 = z7;
                                    } else {
                                        long j7 = jArr2[0];
                                        if (j7 == 0) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            long j8 = pv4Var4.d;
                                            RoundingMode roundingMode = RoundingMode.DOWN;
                                            if (f35.a0(j7, 1000000L, j8, roundingMode) + f35.a0(jArr3[0], 1000000L, pv4Var4.c, roundingMode) >= pv4Var4.e) {
                                            }
                                        }
                                        j5 = jArr3[0];
                                    }
                                    int[] iArr = rv4Var2.h;
                                    long[] jArr4 = rv4Var2.i;
                                    boolean z13 = z2;
                                    boolean[] zArr2 = rv4Var2.j;
                                    boolean z14 = pv4Var4.b == 2 && (i7 & 1) != 0;
                                    int i39 = rv4Var2.g[i28] + i29;
                                    int i40 = i29;
                                    long j9 = pv4Var4.c;
                                    boolean z15 = z11;
                                    long j10 = rv4Var2.p;
                                    int i41 = i40;
                                    while (i41 < i39) {
                                        int iM6 = z13 ? be3Var11.m() : qm0Var5.b;
                                        boolean z16 = z15;
                                        if (iM6 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iM6);
                                        }
                                        int iM7 = z9 ? be3Var11.m() : qm0Var5.c;
                                        if (iM7 < 0) {
                                            throw ParserException.a(null, "Unexpected negative value: " + iM7);
                                        }
                                        int iM8 = z12 ? be3Var11.m() : (i41 == 0 && z8) ? i38 : qm0Var5.d;
                                        int i42 = i39;
                                        long[] jArr5 = jArr4;
                                        long jA0 = f35.a0((((long) (z16 ? be3Var11.m() : 0)) + j10) - j5, 1000000L, j9, RoundingMode.DOWN);
                                        jArr5[i41] = jA0;
                                        if (!rv4Var2.q) {
                                            jArr5[i41] = jA0 + ne1Var2.d.i;
                                        }
                                        iArr[i41] = iM7;
                                        zArr2[i41] = ((iM8 >> 16) & 1) == 0 && (!z14 || i41 == 0);
                                        j10 += (long) iM6;
                                        i41++;
                                        z15 = z16;
                                        z14 = z14;
                                        jArr4 = jArr5;
                                        i39 = i42;
                                    }
                                    rv4Var2.p = j10;
                                    i28 = i37;
                                    i29 = i39;
                                } else {
                                    i7 = i9;
                                }
                                i27++;
                                arrayList4 = arrayList4;
                                arrayList5 = arrayList5;
                                i9 = i7;
                                size4 = size4;
                                i5 = 1953658222;
                            }
                        } else {
                            i3 = i21;
                            arrayList2 = arrayList4;
                            arrayList3 = arrayList5;
                            i4 = i9;
                        }
                    } else {
                        size3 = size3;
                        i3 = i21;
                        arrayList2 = arrayList4;
                        arrayList3 = arrayList5;
                        i4 = i9;
                    }
                    i21 = i3 + 1;
                    size3 = size3;
                    arrayList4 = arrayList2;
                    arrayList5 = arrayList3;
                    i9 = i4;
                }
                ow0 ow0VarH2 = h(arrayList5);
                if (ow0VarH2 != null) {
                    int size6 = sparseArray.size();
                    for (int i43 = 0; i43 < size6; i43++) {
                        ne1 ne1Var3 = (ne1) sparseArray.valueAt(i43);
                        pv4 pv4Var5 = ne1Var3.d.a;
                        qm0 qm0Var6 = ne1Var3.b.a;
                        String str4 = f35.a;
                        qv4 qv4Var2 = pv4Var5.l[qm0Var6.a];
                        ow0 ow0VarA = ow0VarH2.a(qv4Var2 != null ? qv4Var2.b : null);
                        sb1 sb1VarA2 = ne1Var3.j.a();
                        sb1VarA2.q = ow0VarA;
                        ne1Var3.a.g(new tb1(sb1VarA2));
                    }
                }
                if (this.y != -9223372036854775807L) {
                    int size7 = sparseArray.size();
                    for (int i44 = 0; i44 < size7; i44++) {
                        ne1 ne1Var4 = (ne1) sparseArray.valueAt(i44);
                        long j11 = this.y;
                        int i45 = ne1Var4.f;
                        while (true) {
                            rv4 rv4Var3 = ne1Var4.b;
                            if (i45 >= rv4Var3.e || rv4Var3.i[i45] > j11) {
                                break;
                            }
                            if (rv4Var3.j[i45]) {
                                ne1Var4.i = i45;
                            }
                            i45++;
                        }
                    }
                    this.y = -9223372036854775807L;
                }
            } else if (!arrayDeque.isEmpty()) {
                ((oy2) arrayDeque.peek()).r.add(oy2Var);
            }
        }
        g();
    }
}
