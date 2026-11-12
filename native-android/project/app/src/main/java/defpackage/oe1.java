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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oe1 implements k51 {
    public static final byte[] N = null;
    public static final tb1 O = null;
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
    public final SparseArray d;
    public final be3 e;
    public final be3 f;
    public final be3 g;
    public final byte[] h;
    public final be3 i;
    public final iu4 j;
    public final rf2 k;
    public final be3 l;
    public final ArrayDeque m;
    public final ArrayDeque n;
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

    static {
        N = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        sb1 r0 = new sb1();
        r0.m = lw2.m("application/x-emsg");
        O = new tb1(r0);
    }

    public oe1(xn4 r1, int r2, iu4 r3, List r4) {
        this.a = r1;
        this.b = r2;
        this.j = r3;
        this.c = Collections.unmodifiableList(r4);
        this.k = new rf2(8);
        this.l = new be3(16);
        this.e = new be3(uc5.c);
        this.f = new be3(6);
        this.g = new be3();
        byte[] r5 = new byte[16];
        this.h = r5;
        this.i = new be3(r5);
        this.m = new ArrayDeque();
        this.n = new ArrayDeque();
        this.d = new SparseArray();
        vw1 r6 = yw1.o;
        this.q = gy3.r;
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.H = m51.i;
        this.I = new wv4[0];
        this.J = new wv4[0];
        this.o = new c6(new cn(14, this));
        this.p = new hg3(10);
        this.M = -1;
    }

    public static ow0 h(List r9) {
        int r0 = r9.size();
        ArrayList r4 = null;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L16;
        py2 r5 = (py2) r9.get(r3);
        if (r5.o != 1886614376) goto L15;
        if (r4 != null) goto L8;
        r4 = new ArrayList();
    L8:
        byte[] r6 = r5.p.a;
        gc r7 = te5.G(r6);
        if (r7 != null) goto L11;
        UUID r8 = null;
    L12:
        if (r8 != null) goto L14;
        l93.q0("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
        goto L15
    L14:
        r4.add(new nw0(r8, null, "video/mp4", r6));
        goto L15
    L11:
        r8 = (UUID) r7.b;
    L15:
        r3 = r3 + 1;
        goto L3
    L16:
        if (r4 != null) goto L19;
        return null;
    L19:
        return new ow0(null, false, (nw0[]) r4.toArray(new nw0[0]));
    }

    public static void i(be3 r5, int r6, rv4 r7) {
        r5.N(r6 + 8);
        int r8 = r5.m();
        byte[] r0 = wu.a;
        if ((r8 & 1) != 0) goto L19;
        if ((r8 & 2) == 0) goto L7;
        boolean r9 = true;
    L8:
        int r2 = r5.E();
        if (r2 != 0) goto L12;
        Arrays.fill(r7.l, 0, r7.e, false);
        return;
    L12:
        int r3 = r7.e;
        be3 r4 = r7.n;
        if (r2 != r3) goto L16;
        Arrays.fill(r7.l, 0, r2, r9);
        r4.K(r5.a());
        r7.k = true;
        r7.o = true;
        r5.k(r4.a, 0, r4.c);
        r4.N(0);
        r7.o = false;
        return;
    L16:
        StringBuilder r10 = f34.j(r2, "Senc sample count ", " is different from fragment sample count");
        r10.append(r7.e);
        throw ParserException.a(null, r10.toString());
    L7:
        r9 = false;
        goto L8
    L19:
        throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair j(long r22, be3 r24) {
        be3 r0 = r24;
        r0.N(8);
        int r1 = wu.e(r0.m());
        r0.O(4);
        long r7 = r0.C();
        if (r1 != 0) goto L6;
        long r3 = r0.C();
        long r5 = r0.C();
    L5:
        long r6 = r5 + r22;
        String r2 = f35.a;
        long r12 = f35.a0(r3, 1000000, r7, RoundingMode.DOWN);
        r0.O(2);
        int r4 = r0.H();
        int[] r14 = new int[r4];
        long[] r15 = new long[r4];
        long[] r8 = new long[r4];
        long[] r9 = new long[r4];
        long r16 = r6;
        long r18 = r12;
        int r10 = 0;
    L8:
        if (r10 >= r4) goto L15;
        int r11 = r0.m();
        if ((Integer.MIN_VALUE & r11) != 0) goto L13;
        long r20 = r0.C();
        r14[r10] = r11 & Integer.MAX_VALUE;
        r15[r10] = r16;
        r9[r10] = r18;
        r3 = r3 + r20;
        long[] r13 = r8;
        long[] r17 = r9;
        long r19 = f35.a0(r3, 1000000, r7, RoundingMode.DOWN);
        r13[r10] = r19 - r17[r10];
        r0.O(4);
        r16 = r16 + ((long) r14[r10]);
        r10 = r10 + 1;
        r4 = r4;
        r0 = r24;
        r18 = r19;
        r8 = r13;
        r9 = r17;
        goto L8
    L13:
        throw ParserException.a(null, "Unhandled indirect reference");
    L15:
        return Pair.create(Long.valueOf(r12), new t20(r14, r15, r8, r9));
    L6:
        r3 = r0.G();
        r5 = r0.G();
        goto L5
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r33, t71 r34) {
        l51 r1 = r33;
    L3:
        int r2 = this.r;
        ArrayDeque r5 = this.m;
        c6 r7 = this.o;
        be3 r8 = this.i;
        hg3 r9 = this.p;
        SparseArray r10 = this.d;
        boolean r15 = true;
        if (r2 != 0) goto L5;
        int r3 = this.u;
        long r4 = 0;
        be3 r6 = this.l;
        if (r3 != 0) goto L284;
        if (r1.a(r6.a, 0, 8, true) == false) goto L262;
        this.u = 8;
        r6.N(0);
        this.t = r6.C();
        this.s = r6.m();
        goto L284
    L262:
        long r11 = this.M;
        if (r11 == (-1)) goto L280;
        r34.a = r11;
        this.M = -1;
        m51 r12 = this.H;
        r9.getClass();
        ArrayList r13 = new ArrayList();
        ArrayList r14 = new ArrayList();
        ArrayList r16 = new ArrayList();
        ArrayList r17 = new ArrayList();
        Iterator r18 = ((LinkedHashMap) r9.o).values().iterator();
    L266:
        if (r18.hasNext() == false) goto L268;
        t20 r19 = (t20) r18.next();
        r13.add(r19.b);
        r14.add(r19.c);
        r16.add(r19.d);
        r17.add(r19.e);
        goto L266
    L268:
        int[][] r20 = (int[][]) r13.toArray(new int[r13.size()][]);
        int r21 = r20.length;
        int r110 = 0;
    L269:
        if (r110 >= r21) goto L271;
        r4 = r4 + ((long) r20[r110].length);
        r110 = r110 + 1;
        goto L269
    L271:
        int r22 = (int) r4;
        if (r4 != r22) goto L274;
        boolean r111 = true;
    L275:
        rr2.m(r111, "the total number of elements (%s) in the arrays must fit in an int", r4);
        int[] r23 = new int[r22];
        int r24 = r20.length;
        int r25 = 0;
        int r112 = 0;
    L276:
        if (r25 >= r24) goto L278;
        int[] r113 = r20[r25];
        System.arraycopy(r113, 0, r23, r112, r113.length);
        r112 = r112 + r113.length;
        r25 = r25 + 1;
        goto L276
    L278:
        r12.w(new t20(r23, si0.n((long[][]) r14.toArray(new long[r14.size()][])), si0.n((long[][]) r16.toArray(new long[r16.size()][])), si0.n((long[][]) r17.toArray(new long[r17.size()][]))));
        this.L = true;
        return 1;
    L274:
        r111 = false;
        goto L275
    L280:
        r7.j(0);
        return -1;
    L284:
        long r114 = this.t;
        if (r114 != 1) goto L288;
        r1.readFully(r6.a, 8, 8);
        this.u += 8;
        this.t = r6.G();
    L297:
        long r26 = this.t;
        int r27 = this.u;
        long r115 = r27;
        if (r26 >= r115) goto L307;
        if (this.s != 1718773093) goto L305;
        if (r27 != 8) goto L305;
        this.t = r115;
    L305:
        throw ParserException.c("Atom size less than header length (unsupported).");
    L307:
        if (this.M != (-1)) goto L308;
        long r28 = r1.getPosition() - ((long) this.u);
        int r29 = this.s;
        if (r29 == 1836019558) goto L317;
        if (r29 == 1835295092) goto L317;
    L320:
        if (this.s != 1836019558) goto L324;
        int r30 = r10.size();
        int r116 = 0;
    L322:
        if (r116 >= r30) goto L324;
        rv4 r117 = ((ne1) r10.valueAt(r116)).b;
        r117.getClass();
        r117.c = r28;
        r117.b = r28;
        r116 = r116 + 1;
    L324:
        int r31 = this.s;
        if (r31 == 1835295092) goto L326;
        if (r31 == 1836019574) goto L423;
        if (r31 == 1953653099) goto L423;
        if (r31 == 1835297121) goto L423;
        if (r31 == 1835626086) goto L423;
        if (r31 == 1937007212) goto L423;
        if (r31 == 1836019558) goto L423;
        if (r31 == 1953653094) goto L423;
        if (r31 == 1836475768) goto L423;
        if (r31 == 1701082227) goto L423;
        if (r31 == 1835365473) goto L423;
        if (r31 == 1751411826) goto L415;
        if (r31 == 1835296868) goto L415;
        if (r31 == 1836476516) goto L415;
        if (r31 == 1936286840) goto L415;
        if (r31 == 1937011556) goto L415;
        if (r31 == 1937011827) goto L415;
        if (r31 == 1668576371) goto L415;
        if (r31 == 1937011555) goto L415;
        if (r31 == 1937011578) goto L415;
        if (r31 == 1937013298) goto L415;
        if (r31 == 1937007471) goto L415;
        if (r31 == 1668232756) goto L415;
        if (r31 == 1937011571) goto L415;
        if (r31 == 1952867444) goto L415;
        if (r31 == 1952868452) goto L415;
        if (r31 == 1953196132) goto L415;
        if (r31 == 1953654136) goto L415;
        if (r31 == 1953658222) goto L415;
        if (r31 == 1886614376) goto L415;
        if (r31 == 1935763834) goto L415;
        if (r31 == 1935763823) goto L415;
        if (r31 == 1936027235) goto L415;
        if (r31 == 1970628964) goto L415;
        if (r31 == 1935828848) goto L415;
        if (r31 == 1936158820) goto L415;
        if (r31 == 1701606260) goto L415;
        if (r31 == 1835362404) goto L415;
        if (r31 == 1701671783) goto L415;
        if (r31 == 1969517665) goto L415;
        if (r31 == 1801812339) goto L415;
        if (r31 == 1768715124) goto L415;
        if (this.t > 2147483647L) goto L413;
        this.v = null;
        this.r = 1;
        goto L3
    L413:
        throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
    L415:
        if (this.u != 8) goto L422;
        if (this.t > 2147483647L) goto L420;
        be3 r32 = new be3((int) this.t);
        System.arraycopy(r6.a, 0, r32.a, 0, 8);
        this.v = r32;
        this.r = 1;
        goto L3
    L420:
        throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
    L422:
        throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
    L423:
        long r35 = r1.getPosition();
        long r36 = this.t;
        long r37 = (r35 + r36) - 8;
        if (r36 != this.u) goto L426;
    L428:
        r5.push(new oy2(this.s, r37));
        if (this.t == this.u) goto L430;
        g();
        goto L3
    L430:
        k(r37);
        goto L3
    L426:
        if (this.s != 1835365473) goto L428;
        r8.K(8);
        r1.n(r8.a, 0, 8);
        wu.a(r8);
        r1.l(r8.b);
        r1.k();
        goto L428
    L326:
        this.B = null;
        this.w = r28 + this.t;
        this.r = 2;
    L317:
        if (this.K == true) goto L320;
        this.H.w(new bo(this.z, r28));
        this.K = true;
        goto L320
    L308:
        int r38 = this.s;
        long r39 = this.t;
        if (r38 != 1936286840) goto L311;
        r8.K((int) r39);
        System.arraycopy(r6.a, 0, r8.a, 0, 8);
        r1.readFully(r8.a, 8, (int) (this.t - ((long) this.u)));
        r9.A((t20) j(r1.f(), r8).second);
    L312:
        g();
        goto L3
    L311:
        r1.d((int) (r39 - r115), true);
        goto L312
    L288:
        if (r114 != 0) goto L297;
        long r40 = r1.getLength();
        if (r40 != (-1)) goto L295;
        if (r5.isEmpty() == true) goto L295;
        r40 = ((oy2) r5.peek()).p;
    L295:
        if (r40 == (-1)) goto L297;
        this.t = (r40 - r1.getPosition()) + ((long) this.u);
        goto L297
    L5:
        ArrayDeque r41 = this.n;
        int r42 = this.b;
        iu4 r118 = this.j;
        if (r2 != 1) goto L7;
        int r43 = (int) (this.t - ((long) this.u));
        be3 r44 = this.v;
        if (r44 == null) goto L256;
        r1.readFully(r44.a, 8, r43);
        int r45 = this.s;
        py2 r46 = new py2(r45, r44);
        if (r5.isEmpty() == true) goto L205;
        ((oy2) r5.peek()).q.add(r46);
    L255:
        r1 = r33;
    L257:
        k(r1.getPosition());
        goto L3
    L205:
        if (r45 != 1936286840) goto L217;
        Pair r47 = j(r1.getPosition(), r44);
        r9.A((t20) r47.second);
        if (this.K == true) goto L210;
        this.A = ((Long) r47.first).longValue();
        this.H.w((m84) r47.second);
        this.K = true;
        goto L255
    L210:
        if ((r42 & 256) == 0) goto L255;
        if (this.L == true) goto L255;
        if (((LinkedHashMap) r9.o).size() <= 1) goto L255;
        this.M = r1.getPosition();
        goto L255
    L217:
        if (r45 != 1701671783) goto L255;
        if (this.I.length == 0) goto L255;
        r44.N(8);
        int r48 = wu.e(r44.m());
        if (r48 != 0) goto L224;
        String r49 = r44.v();
        r49.getClass();
        String r50 = r44.v();
        r50.getClass();
        long r210 = r44.C();
        long r211 = r44.C();
        RoundingMode r212 = RoundingMode.DOWN;
        long r51 = f35.a0(r211, 1000000, r210, r212);
        long r119 = this.A;
        if (r119 == (-9223372036854775807L)) goto L230;
        long r120 = r119 + r51;
    L231:
        long r121 = f35.a0(r44.C(), 1000, r210, r212);
        long r122 = r120;
        long r123 = r51;
        long r52 = r122;
        long r124 = -9223372036854775807L;
        long r53 = r44.C();
    L232:
        byte[] r125 = new byte[r44.a()];
        r44.k(r125, 0, r44.a());
        rf2 r54 = this.k;
        DataOutputStream r126 = (DataOutputStream) r54.o;
        ByteArrayOutputStream r55 = (ByteArrayOutputStream) r54.n;
        r55.reset();
        r126.writeBytes(r49);     // Catch: IOException -> L253
        r126.writeByte(0);     // Catch: IOException -> L253
        r126.writeBytes(r50);     // Catch: IOException -> L253
        r126.writeByte(0);     // Catch: IOException -> L253
        r126.writeLong(r121);     // Catch: IOException -> L253
        r126.writeLong(r53);     // Catch: IOException -> L253
        r126.write(r125);     // Catch: IOException -> L253
        r126.flush();     // Catch: IOException -> L253
        be3 r56 = new be3(r55.toByteArray());
        int r57 = r56.a();
        wv4[] r58 = this.I;
        int r59 = r58.length;
        int r60 = 0;
    L235:
        if (r60 >= r59) goto L238;
        wv4 r61 = r58[r60];
        r56.N(0);
        r61.e(r57, r56);
        r60 = r60 + 1;
        goto L235
    L238:
        if (r52 != r124) goto L241;
        r41.addLast(new me1(r57, r123, true));
        this.x += r57;
        goto L255
    L241:
        if (r41.isEmpty() == true) goto L244;
        r41.addLast(new me1(r57, r52, false));
        this.x += r57;
        goto L255
    L244:
        if (r118 != null) goto L246;
    L248:
        if (r118 == null) goto L250;
        r52 = r118.a(r52);
    L250:
        long r213 = r52;
        wv4[] r62 = this.I;
        int r63 = r62.length;
        int r127 = 0;
    L251:
        if (r127 >= r63) goto L255;
        r62[r127].a(r213, 1, r57, 0, null);
        r127 = r127 + 1;
        goto L251
    L246:
        if (r118.e() == true) goto L248;
        r41.addLast(new me1(r57, r52, false));
        this.x += r57;
    L253:
        e = move-exception;
        er1.m(e);
        return 0;
    L230:
        r120 = -9223372036854775807L;
        goto L231
    L224:
        if (r48 == 1) goto L226;
        xa3.m(r48, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
        goto L255
    L226:
        long r214 = r44.C();
        long r215 = r44.G();
        RoundingMode r216 = RoundingMode.DOWN;
        r52 = f35.a0(r215, 1000000, r214, r216);
        long r128 = f35.a0(r44.C(), 1000, r214, r216);
        long r129 = r44.C();
        r49 = r44.v();
        r49.getClass();
        r50 = r44.v();
        r50.getClass();
        r124 = -9223372036854775807L;
        r53 = r129;
        r121 = r128;
        r123 = -9223372036854775807L;
        goto L232
    L256:
        r1.l(r43);
        goto L257
    L7:
        long r130 = Long.MAX_VALUE;
        if (r2 != 2) goto L9;
        int r64 = r10.size();
        int r65 = 0;
        ne1 r66 = null;
    L185:
        if (r65 >= r64) goto L192;
        rv4 r67 = ((ne1) r10.valueAt(r65)).b;
        if (r67.o == false) goto L191;
        long r68 = r67.c;
        if (r68 >= r130) goto L191;
        r66 = (ne1) r10.valueAt(r65);
        r130 = r68;
    L191:
        r65 = r65 + 1;
        goto L185
    L192:
        if (r66 == null) goto L193;
        int r69 = (int) (r130 - r1.getPosition());
        if (r69 < 0) goto L198;
        r1.l(r69);
        rv4 r70 = r66.b;
        be3 r71 = r70.n;
        r1.readFully(r71.a, 0, r71.c);
        r71.N(0);
        r70.o = false;
        goto L3
    L198:
        throw ParserException.a(null, "Offset to encryption data was negative.");
    L193:
        this.r = 3;
        goto L3
    L9:
        ne1 r72 = this.B;
        if (r72 != null) goto L45;
        int r73 = r10.size();
        int r131 = 0;
        ne1 r74 = null;
    L12:
        if (r131 >= r73) goto L30;
        ne1 r132 = (ne1) r10.valueAt(r131);
        boolean r217 = r15;
        boolean r133 = r132.m;
        rv4 r75 = r132.b;
        if (r133 == true) goto L18;
        int r218 = r73;
        if (r132.f == r132.d.b) goto L29;
    L19:
        if (r133 == true) goto L21;
    L23:
        if (r133 == true) goto L25;
        long r219 = r132.d.c[r132.f];
    L27:
        if (r219 >= r130) goto L29;
        r74 = r132;
        r130 = r219;
        goto L29
    L25:
        r219 = r75.f[r132.h];
        goto L27
    L21:
        if (r132.h != r75.d) goto L23;
    L29:
        r131 = r131 + 1;
        r15 = r217;
        r73 = r218;
        goto L12
    L18:
        r218 = r73;
        goto L19
    L30:
        boolean r220 = r15;
        int r221 = 8;
        if (r74 != null) goto L38;
        int r76 = (int) (this.w - r1.getPosition());
        if (r76 < 0) goto L36;
        r1.l(r76);
        g();
        goto L3
    L36:
        throw ParserException.a(null, "Offset to end of mdat was negative.");
    L38:
        if (r74.m == true) goto L40;
        long r134 = r74.d.c[r74.f];
    L41:
        int r77 = (int) (r134 - r1.getPosition());
        if (r77 >= 0) goto L44;
        l93.q0("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
        r77 = 0;
    L44:
        r1.l(r77);
        this.B = r74;
        r72 = r74;
    L46:
        wv4 r78 = r72.a;
        rv4 r79 = r72.b;
        String r135 = "video/avc";
        if (this.r == 3) goto L49;
    L89:
        xv4 r80 = r72.d;
        pv4 r81 = r80.a;
        if (r72.m == true) goto L93;
        long r136 = r80.f[r72.f];
    L92:
        Object r310 = "video/hevc";
        long r137 = r136;
        if (r118 == null) goto L96;
        r137 = r118.a(r137);
    L96:
        int r82 = r81.k;
        tb1 r83 = r81.g;
        if (r82 == 0) goto L156;
        be3 r84 = this.f;
        byte[] r138 = r84.a;
        r138[0] = 0;
        r138[1] = 0;
        r138[2] = 0;
        int r85 = 4 - r82;
    L99:
        ne1 r222 = r72;
        if (this.D >= this.C) goto L160;
        int r86 = this.E;
        if (r86 == 0) goto L104;
        int r223 = r82;
        int r224 = r85;
        String r225 = r135;
        Object r87 = r310;
        if (this.G == false) goto L154;
        be3 r88 = this.g;
        r88.K(r86);
        r1.readFully(r88.a, 0, this.E);
        r78.e(this.E, r88);
        int r89 = this.E;
        int r90 = uc5.b0(r88.c, r88.a);
        r88.N(0);
        r88.M(r90);
        int r91 = r83.p;
        if (r91 != (-1)) goto L148;
        if (r7.a == 0) goto L150;
        r7.x(0);
    L150:
        r7.a(r137, r88);
        if ((r222.a() & 4) == 0) goto L153;
        r7.j(0);
    L153:
        int r92 = r89;
    L155:
        this.D += r92;
        this.E -= r92;
    L137:
        r310 = r87;
        r85 = r224;
        r72 = r222;
        r82 = r223;
        r135 = r225;
        goto L99
    L148:
        if (r7.a == r91) goto L150;
        r7.x(r91);
        goto L150
    L154:
        r92 = r78.f(r1, r86, false);
        goto L155
    L104:
        if (this.J.length <= 0) goto L106;
    L107:
        int r93 = uc5.C(r83);
        if ((r82 + r93) > (this.C - this.D)) goto L110;
        int r94 = r93;
    L111:
        r1.readFully(r138, r85, r82 + r94);
        r84.N(0);
        int r139 = r84.m();
        if (r139 < 0) goto L139;
        this.E = r139 - r94;
        be3 r140 = this.e;
        r223 = r82;
        r140.N(0);
        r78.e(4, r140);
        this.D += 4;
        this.C += r85;
        if (this.J.length <= 0) goto L128;
        if (r94 <= 0) goto L128;
        byte r141 = r138[4];
        String r95 = uc5.r(r83);
        if (Objects.equals(r95, r135) == false) goto L122;
        r224 = r85;
        r225 = r135;
        if ((r141 & 31) == 6) goto L121;
    L120:
        r87 = r310;
        if (Objects.equals(r95, r87) == true) goto L126;
    L129:
        boolean r96 = false;
    L130:
        this.G = r96;
        r78.e(r94, r84);
        this.D += r94;
        if (r94 <= 0) goto L137;
        if (this.F == true) goto L137;
        if (uc5.y(r138, r94, r83) == false) goto L137;
        this.F = true;
        goto L137
    L126:
        if (((r141 & 126) >> 1) != 39) goto L129;
    L127:
        r96 = true;
        goto L130
    L121:
        r87 = r310;
        goto L127
    L122:
        r224 = r85;
        r225 = r135;
    L128:
        r224 = r85;
        r225 = r135;
        r87 = r310;
        goto L129
    L139:
        throw ParserException.a(null, "Invalid NAL length");
    L110:
        r94 = 0;
        goto L111
    L106:
        if (this.F == true) goto L110;
    L160:
        int r97 = r222.a();
        if (this.F == true) goto L163;
        r97 = r97 | 67108864;
    L163:
        int r226 = r97;
        qv4 r98 = r222.b();
        if (r98 == null) goto L166;
        vv4 r311 = r98.c;
    L167:
        long r227 = r137;
        r78.a(r227, r226, this.C, 0, r311);
    L169:
        if (r41.isEmpty() == true) goto L179;
        me1 r99 = (me1) r41.removeFirst();
        this.x -= r99.c;
        long r100 = r99.a;
        if (r99.b == false) goto L173;
        r100 = r100 + r227;
    L173:
        if (r118 == null) goto L175;
        r100 = r118.a(r100);
    L175:
        long r101 = r100;
        wv4[] r102 = this.I;
        int r103 = r102.length;
        int r104 = 0;
    L176:
        if (r104 >= r103) goto L169;
        r102[r104].a(r101, 1, r99.c, this.x, null);
        r104 = r104 + 1;
        goto L176
    L179:
        if (r222.c() == true) goto L181;
        this.B = null;
    L181:
        this.r = 3;
        return 0;
    L166:
        r311 = null;
        goto L167
    L156:
        r222 = r72;
    L157:
        int r105 = this.D;
        int r106 = this.C;
        if (r105 >= r106) goto L160;
        this.D += r78.f(r1, r106 - r105, false);
        goto L157
    L93:
        r136 = r79.i[r72.f];
        goto L92
    L49:
        if (r72.m == true) goto L51;
        int r107 = r72.d.d[r72.f];
    L52:
        this.C = r107;
        tb1 r108 = r72.d.a.g;
        if (Objects.equals(r108.n, "video/avc") == false) goto L59;
        if ((r42 & 64) == 0) goto L57;
    L56:
        boolean r109 = r220;
    L63:
        this.F = !r109;
        if (r72.f >= r72.i) goto L82;
        r1.l(this.C);
        qv4 r142 = r72.b();
        if (r142 == null) goto L77;
        be3 r143 = r79.n;
        int r144 = r142.d;
        if (r144 == 0) goto L71;
        r143.O(r144);
    L71:
        int r145 = r72.f;
        if (r79.k == false) goto L77;
        if (r79.l[r145] == false) goto L77;
        r143.O(r143.H() * 6);
    L77:
        if (r72.c() == true) goto L79;
        this.B = null;
    L79:
        this.r = 3;
        return 0;
    L82:
        if (r72.d.a.h != r220) goto L84;
        this.C -= 8;
        r1.l(r221);
    L84:
        boolean r146 = "audio/ac4".equals(r72.d.a.g.n);
        int r147 = this.C;
        if (r146 == false) goto L87;
        this.D = r72.d(r147, 7);
        hw.g(this.C, r8);
        r78.e(7, r8);
        this.D += 7;
        int r148 = 0;
    L88:
        this.C += this.D;
        this.r = 4;
        this.E = r148;
        goto L89
    L87:
        r148 = 0;
        this.D = r72.d(r147, 0);
    L57:
        r109 = false;
        goto L63
    L59:
        if (Objects.equals(r108.n, "video/hevc") == false) goto L57;
        if ((r42 & 128) == 0) goto L57;
    L51:
        r107 = r79.h[r72.f];
        goto L52
    L40:
        r134 = r74.b.f[r74.h];
        goto L41
    L45:
        r220 = true;
        r221 = 8;
        goto L46
    }

    @Override // defpackage.k51
    public final boolean c(l51 r4) {
        th4 r5 = ud3.F0(r4, true, false);
        if (r5 == null) goto L5;
        gy3 r2 = yw1.o(r5);
    L6:
        this.q = r2;
        if (r5 != null) goto L9;
        return true;
    L9:
        return false;
    L5:
        vw1 r3 = yw1.o;
        r2 = gy3.r;
        goto L6
    }

    @Override // defpackage.k51
    public final void d(long r4, long r6) {
        SparseArray r5 = this.d;
        int r7 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L5;
        ((ne1) r5.valueAt(r1)).e();
        r1 = r1 + 1;
        goto L3
    L5:
        this.n.clear();
        this.x = 0;
        ((PriorityQueue) this.o.e).clear();
        this.y = r6;
        this.m.clear();
        g();
    }

    @Override // defpackage.k51
    public final List e() {
        return this.q;
    }

    @Override // defpackage.k51
    public final void f(m51 r7) {
        int r0 = this.b;
        if ((r0 & 32) != 0) goto L5;
        r7 = new ll(r7, this.a);
    L5:
        this.H = r7;
        g();
        wv4[] r8 = new wv4[2];
        this.I = r8;
        int r1 = 100;
        int r2 = 0;
        if ((r0 & 4) == 0) goto L8;
        r8[0] = this.H.t(100, 5);
        int r9 = 1;
        r1 = 101;
    L9:
        wv4[] r10 = (wv4[]) f35.S(r9, this.I);
        this.I = r10;
        int r3 = r10.length;
        int r4 = 0;
    L10:
        if (r4 >= r3) goto L12;
        r10[r4].g(O);
        r4 = r4 + 1;
        goto L10
    L12:
        List r11 = this.c;
        this.J = new wv4[r11.size()];
    L14:
        if (r2 >= this.J.length) goto L16;
        wv4 r5 = this.H.t(r1, 3);
        r5.g((tb1) r11.get(r2));
        this.J[r2] = r5;
        r2 = r2 + 1;
        r1 = r1 + 1;
        goto L14
    L16:
        return;
    L8:
        r9 = 0;
        goto L9
    }

    public final void g() {
        this.r = 0;
        this.u = 0;
    }

    public final void k(long r56) {
    L3:
        ArrayDeque r1 = this.m;
        if (r1.isEmpty() == true) goto L345;
        if (((oy2) r1.peek()).p != r56) goto L345;
        oy2 r3 = (oy2) r1.pop();
        int r2 = r3.o;
        ArrayList r4 = r3.r;
        ArrayList r5 = r3.q;
        int r8 = this.b;
        int r10 = 12;
        SparseArray r11 = this.d;
        if (r2 == 1836019574) goto L9;
        if (r2 == 1836019558) goto L65;
        if (r1.isEmpty() == true) goto L3;
        ((oy2) r1.peek()).r.add(r3);
        goto L3
    L65:
        int r6 = r4.size();
        int r7 = 0;
    L66:
        if (r7 >= r6) goto L318;
        oy2 r9 = (oy2) r4.get(r7);
        if (r9.o != 1953653094) goto L316;
        py2 r12 = r9.s(1952868452);
        ArrayList r13 = r9.q;
        r12.getClass();
        be3 r14 = r12.p;
        r14.N(8);
        int r15 = r14.m();
        byte[] r16 = wu.a;
        ne1 r17 = (ne1) r11.get(r14.m());
        if (r17 != null) goto L72;
        r6 = r6;
        r17 = null;
    L92:
        if (r17 != null) goto L95;
        int r24 = r7;
        ArrayList r30 = r4;
        ArrayList r31 = r5;
        int r32 = r8;
    L317:
        r7 = r24 + 1;
        r6 = r6;
        r4 = r30;
        r5 = r31;
        r8 = r32;
        goto L66
    L95:
        rv4 r18 = r17.b;
        long r19 = r18.p;
        boolean r20 = r18.q;
        r17.e();
        r17.m = true;
        py2 r110 = r9.s(1952867444);
        if (r110 != null) goto L98;
    L104:
        r18.p = r19;
        r18.q = r20;
    L105:
        int r21 = r13.size();
        int r111 = 0;
        int r112 = 0;
        int r113 = 0;
    L106:
        int r114 = 1953658222;
        if (r111 >= r21) goto L114;
        py2 r115 = (py2) r13.get(r111);
        int r25 = r7;
        if (r115.o != 1953658222) goto L113;
        be3 r22 = r115.p;
        r22.N(12);
        int r23 = r22.E();
        if (r23 <= 0) goto L113;
        r113 = r113 + r23;
        r112 = r112 + 1;
    L113:
        r111 = r111 + 1;
        r7 = r25;
        goto L106
    L114:
        r24 = r7;
        r17.h = 0;
        r17.g = 0;
        r17.f = 0;
        r18.d = r112;
        r18.e = r113;
        if (r18.g.length >= r112) goto L118;
        r18.f = new long[r112];
        r18.g = new int[r112];
    L118:
        if (r18.h.length >= r113) goto L120;
        int r116 = (r113 * 125) / 100;
        r18.h = new int[r116];
        r18.i = new long[r116];
        r18.j = new boolean[r116];
        r18.l = new boolean[r116];
    L120:
        int r26 = 0;
        int r117 = 0;
        int r118 = 0;
    L121:
        long r27 = 0;
        if (r26 >= r21) goto L209;
        py2 r119 = (py2) r13.get(r26);
        if (r119.o != r114) goto L207;
        int r120 = r117 + 1;
        be3 r121 = r119.p;
        r121.N(8);
        int r122 = r121.m();
        byte[] r29 = wu.a;
        pv4 r28 = r17.d.a;
        qm0 r33 = r18.a;
        String r34 = f35.a;
        r18.g[r117] = r121.E();
        long[] r35 = r18.f;
        int r36 = r8;
        long r37 = r18.b;
        r35[r117] = r37;
        if ((r122 & 1) == 0) goto L129;
        r35[r117] = r37 + ((long) r121.m());
    L129:
        if ((r122 & 4) == 0) goto L131;
        boolean r38 = true;
    L132:
        int r39 = r33.d;
        if (r38 == false) goto L136;
        r39 = r121.m();
    L136:
        if ((r122 & 256) == 0) goto L138;
        boolean r40 = true;
    L139:
        boolean r310 = r38;
        if ((r122 & 512) == 0) goto L142;
        boolean r41 = true;
    L143:
        boolean r311 = r41;
        if ((r122 & 1024) == 0) goto L146;
        boolean r42 = true;
    L148:
        if ((r122 & 2048) == 0) goto L151;
        boolean r123 = true;
    L150:
        boolean r312 = r42;
        long[] r43 = r28.i;
        int r313 = r39;
        long[] r44 = r28.j;
        if (r43 != null) goto L155;
    L157:
        boolean r45 = r40;
    L164:
        int[] r46 = r18.h;
        long[] r47 = r18.i;
        boolean r314 = r45;
        boolean[] r48 = r18.j;
        if (r28.b == 2) goto L167;
    L169:
        boolean r49 = false;
    L170:
        int r50 = r18.g[r117] + r118;
        int r210 = r118;
        long r124 = r28.c;
        boolean r51 = r123;
        long r125 = r18.p;
        int r126 = r210;
    L171:
        if (r126 >= r50) goto L206;
        if (r314 == false) goto L175;
        int r127 = r121.m();
    L174:
        boolean r211 = r51;
        if (r127 < 0) goto L205;
        if (r311 == false) goto L180;
        int r52 = r121.m();
    L181:
        if (r52 < 0) goto L203;
        if (r312 == false) goto L184;
        int r53 = r121.m();
    L188:
        if (r211 == false) goto L191;
        int r54 = r121.m();
    L190:
        int r55 = r50;
        long[] r57 = r47;
        long r58 = f35.a0((((long) r54) + r125) - r27, 1000000, r124, RoundingMode.DOWN);
        r57[r126] = r58;
        if (r18.q == true) goto L195;
        r57[r126] = r58 + r17.d.i;
    L195:
        r46[r126] = r52;
        if (((r53 >> 16) & 1) != 0) goto L200;
        if (r49 == false) goto L199;
        if (r126 != 0) goto L200;
    L199:
        boolean r59 = true;
    L201:
        r48[r126] = r59;
        r125 = r125 + ((long) r127);
        r126 = r126 + 1;
        r51 = r211;
        r49 = r49;
        r47 = r57;
        r50 = r55;
    L200:
        r59 = false;
        goto L201
    L191:
        r54 = 0;
        goto L190
    L184:
        if (r126 != 0) goto L187;
        if (r310 == false) goto L187;
        r53 = r313;
    L187:
        r53 = r33.d;
        goto L188
    L203:
        throw ParserException.a(null, "Unexpected negative value: " + r52);
    L180:
        r52 = r33.c;
        goto L181
    L205:
        throw ParserException.a(null, "Unexpected negative value: " + r127);
    L175:
        r127 = r33.b;
        goto L174
    L206:
        r18.p = r125;
        r117 = r120;
        r118 = r50;
    L208:
        r26 = r26 + 1;
        r4 = r4;
        r5 = r5;
        r8 = r36;
        r21 = r21;
        r114 = 1953658222;
        goto L121
    L167:
        if ((r36 & 1) == 0) goto L169;
        r49 = true;
        goto L170
    L155:
        if (r43.length != 1) goto L157;
        if (r44 == null) goto L157;
        long r410 = r43[0];
        if (r410 != 0) goto L161;
        r45 = r40;
    L163:
        r27 = r44[0];
        goto L164
    L161:
        r45 = r40;
        long r60 = r28.d;
        RoundingMode r411 = RoundingMode.DOWN;
        if ((f35.a0(r410, 1000000, r60, r411) + f35.a0(r44[0], 1000000, r28.c, r411)) < r28.e) goto L164;
    L151:
        r123 = false;
        goto L150
    L146:
        r42 = false;
        goto L148
    L142:
        r41 = false;
        goto L143
    L138:
        r40 = false;
        goto L139
    L131:
        r38 = false;
        goto L132
    L207:
        r36 = r8;
        goto L208
    L209:
        r30 = r4;
        r31 = r5;
        r32 = r8;
        pv4 r61 = r17.d.a;
        qm0 r62 = r18.a;
        r62.getClass();
        qv4 r63 = r61.l[r62.a];
        py2 r64 = r9.s(1935763834);
        if (r64 == null) goto L234;
        r63.getClass();
        be3 r65 = r64.p;
        int r66 = r63.d;
        r65.N(8);
        int r67 = r65.m();
        byte[] r68 = wu.a;
        if ((r67 & 1) != 1) goto L214;
        r65.O(8);
    L214:
        int r69 = r65.A();
        int r70 = r65.E();
        if (r70 > r18.e) goto L232;
        if (r69 != 0) goto L225;
        boolean[] r71 = r18.l;
        int r128 = 0;
        int r129 = 0;
    L218:
        if (r128 >= r70) goto L224;
        int r130 = r65.A();
        r129 = r129 + r130;
        if (r130 <= r66) goto L222;
        boolean r131 = true;
    L223:
        r71[r128] = r131;
        r128 = r128 + 1;
        goto L218
    L222:
        r131 = false;
        goto L223
    L224:
        boolean r72 = false;
    L229:
        Arrays.fill(r18.l, r70, r18.e, r72);
        if (r129 <= 0) goto L234;
        r18.n.K(r129);
        r18.k = true;
        r18.o = true;
        goto L234
    L225:
        if (r69 <= r66) goto L227;
        boolean r73 = true;
    L228:
        r129 = r69 * r70;
        r72 = false;
        Arrays.fill(r18.l, 0, r70, r73);
        goto L229
    L227:
        r73 = false;
        goto L228
    L232:
        StringBuilder r0 = f34.j(r70, "Saiz sample count ", " is greater than fragment sample count");
        r0.append(r18.e);
        throw ParserException.a(null, r0.toString());
    L234:
        py2 r74 = r9.s(1935763823);
        if (r74 == null) goto L249;
        be3 r75 = r74.p;
        r75.N(8);
        int r76 = r75.m();
        byte[] r77 = wu.a;
        if ((r76 & 1) != 1) goto L239;
        r75.O(8);
    L239:
        int r78 = r75.E();
        if (r78 != 1) goto L248;
        int r79 = wu.e(r76);
        long r80 = r18.c;
        if (r79 != 0) goto L244;
        long r81 = r75.C();
    L245:
        r18.c = r80 + r81;
        goto L249
    L244:
        r81 = r75.G();
        goto L245
    L248:
        throw ParserException.a(null, "Unexpected saio entry count: " + r78);
    L249:
        py2 r82 = r9.s(1936027235);
        if (r82 == null) goto L252;
        i(r82.p, 0, r18);
    L252:
        if (r63 == null) goto L254;
        String r315 = r63.b;
    L255:
        be3 r83 = null;
        be3 r84 = null;
        int r85 = 0;
    L257:
        if (r85 >= r13.size()) goto L270;
        py2 r86 = (py2) r13.get(r85);
        be3 r87 = r86.p;
        int r88 = r86.o;
        if (r88 != 1935828848) goto L264;
        r87.N(12);
        if (r87.m() != 1936025959) goto L268;
        r83 = r87;
    L268:
        r85 = r85 + 1;
        goto L257
    L264:
        if (r88 != 1936158820) goto L268;
        r87.N(12);
        if (r87.m() != 1936025959) goto L268;
        r84 = r87;
        goto L268
    L270:
        if (r83 == null) goto L306;
        if (r84 == null) goto L306;
        r83.N(8);
        int r89 = wu.e(r83.m());
        r83.O(4);
        if (r89 != 1) goto L277;
        r83.O(4);
    L277:
        if (r83.m() != 1) goto L305;
        r84.N(8);
        int r90 = wu.e(r84.m());
        r84.O(4);
        if (r90 != 1) goto L286;
        if (r84.C() == 0) goto L284;
    L289:
        if (r84.C() != 1) goto L303;
        r84.O(1);
        int r91 = r84.A();
        int r316 = (r91 & 240) >> 4;
        int r317 = r91 & 15;
        if (r84.A() != 1) goto L293;
        boolean r318 = true;
    L294:
        if (r318 == false) goto L306;
        int r319 = r84.A();
        byte[] r92 = new byte[16];
        r84.k(r92, 0, 16);
        if (r319 != 0) goto L300;
        int r93 = r84.A();
        byte[] r94 = new byte[r93];
        r84.k(r94, 0, r93);
        byte[] r412 = r94;
    L301:
        r18.k = true;
        r18.m = new qv4(r318, r315, r319, r92, r316, r317, r412);
        goto L306
    L300:
        r412 = null;
        goto L301
    L293:
        r318 = false;
        goto L294
    L303:
        throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
    L284:
        throw ParserException.c("Variable length description in sgpd found (unsupported)");
    L286:
        if (r90 < 2) goto L289;
        r84.O(4);
        goto L289
    L305:
        throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
    L306:
        int r95 = r13.size();
        int r96 = 0;
    L307:
        if (r96 >= r95) goto L317;
        py2 r97 = (py2) r13.get(r96);
        if (r97.o != 1970628964) goto L315;
        be3 r98 = r97.p;
        r98.N(8);
        byte[] r99 = this.h;
        r98.k(r99, 0, 16);
        if (Arrays.equals(r99, N) == false) goto L315;
        i(r98, 16, r18);
    L315:
        r96 = r96 + 1;
        goto L307
    L254:
        r315 = null;
        goto L255
    L98:
        if ((r8 & 2) != 0) goto L104;
        be3 r100 = r110.p;
        r100.N(8);
        if (wu.e(r100.m()) != 1) goto L102;
        long r132 = r100.G();
    L103:
        r18.p = r132;
        r18.q = true;
        goto L105
    L102:
        r132 = r100.C();
        goto L103
    L72:
        rv4 r133 = r17.b;
        if ((r15 & 1) == 0) goto L75;
        long r134 = r14.G();
        r133.b = r134;
        r133.c = r134;
    L75:
        qm0 r135 = r17.e;
        if ((r15 & 2) == 0) goto L78;
        int r136 = r14.m() - 1;
    L80:
        if ((r15 & 8) == 0) goto L82;
        int r137 = r14.m();
    L84:
        if ((r15 & 16) == 0) goto L86;
        int r101 = r14.m();
    L88:
        if ((r15 & 32) == 0) goto L90;
        int r102 = r14.m();
    L91:
        r133.a = new qm0(r136, r137, r101, r102);
        goto L92
    L90:
        r102 = r135.d;
        goto L91
    L86:
        r101 = r135.c;
        goto L88
    L82:
        r137 = r135.b;
        goto L84
    L78:
        r136 = r135.a;
        goto L80
    L316:
        r6 = r6;
        r24 = r7;
        r30 = r4;
        r31 = r5;
        r32 = r8;
        goto L317
    L318:
        ow0 r103 = h(r5);
        if (r103 == null) goto L328;
        int r104 = r11.size();
        int r105 = 0;
    L321:
        if (r105 >= r104) goto L328;
        ne1 r106 = (ne1) r11.valueAt(r105);
        pv4 r107 = r106.d.a;
        qm0 r108 = r106.b.a;
        String r138 = f35.a;
        qv4 r109 = r107.l[r108.a];
        if (r109 == null) goto L325;
        String r139 = r109.b;
    L326:
        ow0 r140 = r103.a(r139);
        sb1 r141 = r106.j.a();
        r141.q = r140;
        r106.a.g(new tb1(r141));
        r105 = r105 + 1;
        goto L321
    L325:
        r139 = null;
    L328:
        if (this.y == (-9223372036854775807L)) goto L3;
        int r142 = r11.size();
        int r143 = 0;
    L330:
        if (r143 >= r142) goto L341;
        ne1 r144 = (ne1) r11.valueAt(r143);
        long r145 = this.y;
        int r146 = r144.f;
    L332:
        rv4 r147 = r144.b;
        if (r146 >= r147.e) goto L340;
        if (r147.i[r146] > r145) goto L340;
        if (r147.j[r146] == false) goto L339;
        r144.i = r146;
    L339:
        r146 = r146 + 1;
    L340:
        r143 = r143 + 1;
        goto L330
    L341:
        this.y = -9223372036854775807L;
        goto L3
    L9:
        ow0 r148 = h(r5);
        oy2 r149 = r3.r(1836475768);
        r149.getClass();
        SparseArray r150 = new SparseArray();
        ArrayList r151 = r149.q;
        int r152 = r151.size();
        int r153 = 0;
        long r154 = -9223372036854775807L;
    L10:
        if (r153 >= r152) goto L22;
        py2 r155 = (py2) r151.get(r153);
        int r156 = r155.o;
        be3 r157 = r155.p;
        if (r156 != 1953654136) goto L14;
        r157.N(r10);
        ArrayList r212 = r151;
        Pair r158 = Pair.create(Integer.valueOf(r157.m()), new qm0(r157.m() - 1, r157.m(), r157.m(), r157.m()));
        r150.put(((Integer) r158.first).intValue(), (qm0) r158.second);
    L21:
        r153 = r153 + 1;
        r151 = r212;
        r10 = 12;
        goto L10
    L14:
        r212 = r151;
        if (r156 != 1835362404) goto L21;
        r157.N(8);
        if (wu.e(r157.m()) != 0) goto L19;
        long r159 = r157.C();
    L20:
        r154 = r159;
        goto L21
    L19:
        r159 = r157.G();
        goto L20
    L22:
        int r160 = 0;
        oy2 r161 = r3.r(1835365473);
        if (r161 == null) goto L25;
        qv2 r162 = wu.f(r161);
    L26:
        zg1 r163 = new zg1();
        py2 r164 = r3.s(1969517665);
        if (r164 == null) goto L29;
        qv2 r165 = wu.k(r164);
        r163.b(r165);
        qv2 r166 = r165;
    L30:
        py2 r167 = r3.s(1836476516);
        r167.getClass();
        qv2 r168 = new qv2(new pv2[]{wu.g(r167.p)});
        if ((r8 & 16) == 0) goto L33;
        boolean r169 = true;
    L34:
        ArrayList r170 = wu.j(r3, r163, r154, r148, r169, false, new mj0(this), false);
        int r171 = r170.size();
        if (r11.size() == 0) goto L36;
        ArrayList r213 = r170;
        if (r11.size() != r171) goto L55;
        boolean r172 = true;
    L56:
        rr2.w(r172);
        int r173 = 0;
    L57:
        if (r173 >= r171) goto L3;
        ArrayList r174 = r213;
        xv4 r175 = (xv4) r174.get(r173);
        pv4 r176 = r175.a;
        ne1 r177 = (ne1) r11.get(r176.a);
        int r178 = r176.a;
        if (r150.size() != 1) goto L61;
        qm0 r179 = (qm0) r150.valueAt(0);
    L62:
        r177.d = r175;
        r177.e = r179;
        r177.a.g(r177.j);
        r177.e();
        r173 = r173 + 1;
        r213 = r174;
        goto L57
    L61:
        r179 = (qm0) r150.get(r178);
        r179.getClass();
        goto L62
    L55:
        r172 = false;
        goto L56
    L36:
        String r180 = au0.r(r170);
        int r181 = 0;
    L37:
        if (r181 >= r171) goto L51;
        xv4 r182 = (xv4) r170.get(r181);
        pv4 r183 = r182.a;
        m51 r184 = this.H;
        int r185 = r183.b;
        int r186 = r183.a;
        String r187 = r180;
        tb1 r188 = r183.g;
        long r189 = r183.e;
        wv4 r190 = r184.t(r181, r185);
        r190.d(r189);
        int r214 = r181;
        sb1 r191 = r188.a();
        ArrayList r215 = r170;
        r191.l = lw2.m(r187);
        if (r185 != 1) goto L45;
        int r192 = r163.a;
        int r216 = r171;
        long r217 = r189;
        if (r192 == (-1)) goto L46;
        int r193 = r163.b;
        if (r193 == (-1)) goto L46;
        r191.H = r192;
        r191.I = r193;
    L46:
        gh0.D(r185, r162, r191, r188.l, new qv2[]{r166, r168});
        if (r150.size() != 1) goto L49;
        qm0 r194 = (qm0) r150.valueAt(r160);
    L50:
        r11.put(r186, new ne1(r190, r182, r194, new tb1(r191)));
        this.z = Math.max(this.z, r217);
        r181 = r214 + 1;
        r180 = r187;
        r170 = r215;
        r171 = r216;
        r160 = 0;
        goto L37
    L49:
        r194 = (qm0) r150.get(r186);
        r194.getClass();
        goto L50
    L45:
        r216 = r171;
        r217 = r189;
        goto L46
    L51:
        this.H.p();
        goto L3
    L33:
        r169 = false;
        goto L34
    L29:
        r166 = null;
        goto L30
    L25:
        r162 = null;
    L345:
        g();
    }
}
