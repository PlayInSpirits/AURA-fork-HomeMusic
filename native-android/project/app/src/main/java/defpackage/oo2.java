package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oo2 {
    public final no2 a;
    public final Object b;
    public final q44[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public po2 g;
    public boolean h;
    public final boolean[] i;
    public final kq[] j;
    public final pn0 k;
    public final fo1 l;
    public oo2 m;
    public tv4 n;
    public ew4 o;
    public long p;

    public oo2(kq[] r8, long r9, pn0 r11, n9 r12, fo1 r13, po2 r14, ew4 r15) {
        this.j = r8;
        this.p = r9;
        this.k = r11;
        this.l = r13;
        mt2 r10 = r14.a;
        this.b = r10.a;
        this.g = r14;
        this.n = tv4.d;
        this.o = r15;
        this.c = new q44[r8.length];
        this.i = new boolean[r8.length];
        long r16 = r14.b;
        long r5 = r14.d;
        boolean r17 = r14.f;
        r13.getClass();
        Object r18 = r10.a;
        int r19 = tm3.n;
        Pair r110 = (Pair) r18;
        Object r111 = r110.first;
        mt2 r20 = r10.a(r110.second);
        bu2 r112 = (bu2) ((HashMap) r13.e).get(r111);
        r112.getClass();
        ((HashSet) r13.h).add(r112);
        au2 r113 = (au2) ((HashMap) r13.g).get(r112);
        if (r113 == null) goto L5;
        r113.a.e(r113.b);
    L5:
        r112.c.add(r20);
        no2 r1 = r112.a.D(r20, r12, r16);
        ((IdentityHashMap) r13.d).put(r1, r112);
        r13.g();
        if (r5 == (-9223372036854775807L)) goto L8;
        r1 = new b40(r1, !r17, 0, r5);
    L8:
        this.a = r1;
    }

    public final long a(ew4 r17, long r18, boolean r20, boolean[] r21) {
        int r3 = 0;
    L3:
        boolean r5 = true;
        if (r3 >= r17.o) goto L11;
        if (r20 == false) goto L7;
    L9:
        r5 = false;
    L10:
        this.i[r3] = r5;
        r3 = r3 + 1;
        goto L3
    L7:
        if (r17.m(this.o, r3) == false) goto L9;
    L11:
        int r4 = 0;
    L12:
        kq[] r6 = this.j;
        int r7 = r6.length;
        q44[] r8 = this.c;
        if (r4 >= r7) goto L18;
        if (r6[r4].o != (-2)) goto L17;
        r8[r4] = null;
    L17:
        r4 = r4 + 1;
        goto L12
    L18:
        b();
        this.o = r17;
        c();
        long r9 = this.a.c((t41[]) r17.q, this.i, this.c, r21, r18);
        int r10 = 0;
    L20:
        if (r10 >= r6.length) goto L27;
        if (r6[r10].o != (-2)) goto L26;
        if (this.o.n(r10) == false) goto L26;
        r8[r10] = new om0(24);
    L26:
        r10 = r10 + 1;
        goto L20
    L27:
        this.f = false;
        int r11 = 0;
    L29:
        if (r11 >= r8.length) goto L41;
        if (r8[r11] == null) goto L36;
        rr2.w(r17.n(r11));
        if (r6[r11].o == (-2)) goto L40;
        this.f = true;
    L40:
        r11 = r11 + 1;
        goto L29
    L36:
        if (((t41[]) r17.q)[r11] != null) goto L38;
        boolean r12 = true;
    L39:
        rr2.w(r12);
        goto L40
    L38:
        r12 = false;
        goto L39
    L41:
        return r9;
    }

    public final void b() {
        if (this.m != null) goto L12;
        int r0 = 0;
    L5:
        ew4 r1 = this.o;
        if (r0 >= r1.o) goto L17;
        boolean r2 = r1.n(r0);
        t41 r3 = ((t41[]) this.o.q)[r0];
        if (r2 == false) goto L11;
        if (r3 == null) goto L11;
        r3.k();
    L11:
        r0 = r0 + 1;
        goto L5
    L17:
        return;
    }

    public final void c() {
        if (this.m != null) goto L12;
        int r0 = 0;
    L5:
        ew4 r1 = this.o;
        if (r0 >= r1.o) goto L17;
        boolean r2 = r1.n(r0);
        t41 r3 = ((t41[]) this.o.q)[r0];
        if (r2 == false) goto L11;
        if (r3 == null) goto L11;
        r3.h();
    L11:
        r0 = r0 + 1;
        goto L5
    L17:
        return;
    }

    public final long d() {
        if (this.e == true) goto L7;
        return this.g.b;
    L7:
        if (this.f == false) goto L9;
        long r3 = this.a.q();
    L11:
        if (r3 == Long.MIN_VALUE) goto L13;
        return r3;
    L13:
        return this.g.e;
    L9:
        r3 = Long.MIN_VALUE;
        goto L11
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float r8, cu4 r9, boolean r10) {
        this.e = true;
        this.n = this.a.n();
        ew4 r2 = j(r8, r9, r10);
        po2 r11 = this.g;
        long r12 = r11.b;
        long r0 = r11.e;
        if (r0 != (-9223372036854775807L)) goto L5;
    L7:
        long r7 = a(r2, r12, false, new boolean[this.j.length]);
        long r13 = this.p;
        po2 r1 = this.g;
        this.p = (r1.b - r7) + r13;
        this.g = r1.b(r7);
        return;
    L5:
        if (r12 < r0) goto L7;
        r12 = Math.max(0, r0 - 1);
        goto L7
    }

    public final boolean g() {
        if (this.e == true) goto L5;
        return false;
    L5:
        if (this.f == true) goto L7;
        return true;
    L7:
        if (this.a.q() != Long.MIN_VALUE) goto L13;
        return true;
    L13:
        return false;
    }

    public final boolean h() {
        if (this.e == true) goto L5;
        return false;
    L5:
        if (g() == false) goto L7;
        return true;
    L7:
        if ((d() - this.g.b) < (-9223372036854775807L)) goto L13;
        return true;
    L13:
        return false;
    }

    public final void i() {
        b();
        no2 r0 = this.a;
        boolean r1 = r0 instanceof b40;     // Catch: RuntimeException -> L10
        fo1 r2 = this.l;
        if (r1 == false) goto L8;
        r2.n(((b40) r0).n);     // Catch: RuntimeException -> L10
        return;
    L8:
        r2.n(r0);     // Catch: RuntimeException -> L10
        return;
    L10:
        e = move-exception;
        l93.G("MediaPeriodHolder", "Period release failed.", e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ew4 j(float r31, cu4 r32, boolean r33) {
        final pn0 r1 = this.k;
        kq[] r2 = this.j;
        tv4 r3 = this.n;
        r1.getClass();
        int r5 = 1;
        int[] r4 = new int[r2.length + 1];
        int r6 = r2.length + 1;
        sv4[][] r7 = new sv4[r6][];
        int[][][] r13 = new int[r2.length + 1][][];
        int r9 = 0;
    L3:
        if (r9 >= r6) goto L5;
        int r10 = r3.a;
        r7[r9] = new sv4[r10];
        r13[r9] = new int[r10][];
        r9 = r9 + 1;
        goto L3
    L5:
        int r8 = r2.length;
        final int[] r12 = new int[r8];
        int r11 = 0;
    L6:
        if (r11 >= r8) goto L8;
        r12[r11] = r2[r11].F();
        r11 = r11 + 1;
        goto L6
    L8:
        int r14 = 0;
    L10:
        if (r14 >= r3.a) goto L42;
        sv4 r15 = r3.a(r14);
        if (r15.c != 5) goto L14;
        int r16 = r5;
    L15:
        int r17 = r2.length;
        int r18 = r5;
        int r19 = 0;
        int r110 = 0;
    L17:
        if (r110 >= r2.length) goto L33;
        kq r20 = r2[r110];
        tv4 r111 = r3;
        int[] r112 = r4;
        int r21 = r5;
        int r22 = 0;
        int r23 = 0;
    L20:
        if (r23 >= r15.a) goto L23;
        r22 = Math.max(r22, r20.E(r15.d[r23]) & 7);
        r23 = r23 + 1;
        goto L20
    L23:
        if (r112[r110] != 0) goto L25;
        int r24 = r21;
    L26:
        if (r22 > r19) goto L31;
        if (r22 != r19) goto L32;
        if (r16 == 0) goto L32;
        if (r18 != 0) goto L32;
        if (r24 != 0) goto L31;
    L32:
        r110 = r110 + 1;
        r3 = r111;
        r4 = r112;
        r5 = r21;
    L31:
        r19 = r22;
        r18 = r24;
        r17 = r110;
        goto L32
    L25:
        r24 = 0;
        goto L26
    L33:
        tv4 r113 = r3;
        int[] r114 = r4;
        int r25 = r5;
        if (r17 != r2.length) goto L36;
        int[] r26 = new int[r15.a];
    L41:
        int r27 = r114[r17];
        r7[r17][r27] = r15;
        r13[r17][r27] = r26;
        r114[r17] = r27 + 1;
        r14 = r14 + 1;
        r3 = r113;
        r4 = r114;
        r5 = r25;
        goto L10
    L36:
        kq r28 = r2[r17];
        int[] r29 = new int[r15.a];
        int r30 = 0;
    L38:
        if (r30 >= r15.a) goto L40;
        r29[r30] = r28.E(r15.d[r30]);
        r30 = r30 + 1;
        goto L38
    L40:
        r26 = r29;
        goto L41
    L14:
        r16 = 0;
        goto L15
    L42:
        int[] r115 = r4;
        int r210 = r5;
        int r211 = 0;
        tv4[] r116 = new tv4[r2.length];
        String[] r34 = new String[r2.length];
        int[] r117 = new int[r2.length];
        int r35 = 0;
    L44:
        if (r35 >= r2.length) goto L46;
        int r36 = r115[r35];
        r116[r35] = new tv4((sv4[]) f35.S(r36, r7[r35]));
        r13[r35] = (int[][]) f35.S(r36, r13[r35]);
        r34[r35] = r2[r35].h();
        r117[r35] = r2[r35].o;
        r35 = r35 + 1;
        goto L44
    L46:
        gg2 r37 = new gg2(r117, r116, r12, r13, new tv4((sv4[]) f35.S(r115[r2.length], r7[r2.length])));
        Object r38 = r1.c;
        monitor-enter(r38);
        r1.g = Thread.currentThread();     // Catch: Throwable -> L326
        final jn0 r118 = r1.f;     // Catch: Throwable -> L326
        monitor-exit(r38);     // Catch: Throwable -> L326
        if (r1.j != null) goto L56;
        Context r39 = r1.d;
        if (r39 == null) goto L56;
        r1.j = Boolean.valueOf(f35.O(r39));
    L56:
        if (r118.A0 == true) goto L58;
    L62:
        int r40 = r37.a;
        Context r41 = r1.d;
        r41[] r42 = new r41[r40];
        int r43 = 0;
    L64:
        if (r43 >= r37.a) goto L71;
        if (2 != r117[r43]) goto L70;
        if (r116[r43].a <= 0) goto L70;
        final boolean r44 = r210;
    L72:
        Pair r45 = pn0.i(r210, r37, r13, new dn0(r1, r118, r44, r12), new n7(7));
        if (r45 == null) goto L75;
        r42[((Integer) r45.second).intValue()] = (r41) r45.first;
    L75:
        if (r45 != null) goto L77;
        String r119 = null;
    L78:
        aw4 r46 = r118.w;
        if (r46.a != 2) goto L82;
        int r47 = 2;
        Pair r48 = null;
    L88:
        int r49 = 4;
        if (r118.E == true) goto L94;
        if (r48 == null) goto L94;
    L92:
        Pair r50 = null;
    L97:
        if (r50 == null) goto L99;
        r42[((Integer) r50.second).intValue()] = (r41) r50.first;
    L101:
        int r51 = 3;
        if (r46.a != 2) goto L105;
        Pair r52 = null;
    L119:
        if (r52 == null) goto L121;
        r42[((Integer) r52.second).intValue()] = (r41) r52.first;
    L121:
        int r53 = 0;
    L122:
        if (r53 >= r40) goto L157;
        int r54 = r117[r53];
        if (r54 != 2) goto L126;
    L155:
        int r212 = r53;
        aw4 r213 = r46;
    L156:
        r53 = r212 + 1;
        r46 = r213;
        r49 = 4;
        r51 = 3;
        goto L122
    L126:
        if (r54 == 1) goto L155;
        if (r54 == r51) goto L155;
        if (r54 == r49) goto L155;
        tv4 r55 = r116[r53];
        int[][] r120 = r13[r53];
        if (r46.a != 2) goto L133;
        r212 = r53;
        r213 = r46;
    L132:
        r41 r56 = null;
    L154:
        r42[r212] = r56;
        goto L156
    L133:
        int r121 = 0;
        int r122 = 0;
        sv4 r57 = null;
        hn0 r123 = null;
    L135:
        if (r121 >= r55.a) goto L150;
        sv4 r124 = r55.a(r121);
        int[] r214 = r120[r121];
        int r215 = r53;
        tv4 r216 = r55;
        hn0 r58 = r123;
        int r59 = 0;
    L138:
        if (r59 >= r124.a) goto L149;
        int r217 = r59;
        if (kq.n(r214[r59], r118.B0) == false) goto L146;
        aw4 r218 = r46;
        hn0 r60 = new hn0(r124.d[r217], r214[r217]);
        if (r58 != null) goto L144;
    L145:
        r58 = r60;
        r57 = r124;
        r122 = r217;
    L148:
        r59 = r217 + 1;
        r46 = r218;
        goto L138
    L144:
        if (v60.a.c(r60.o, r58.o).c(r60.n, r58.n).e() > 0) goto L145;
    L147:
        r57 = r57;
        goto L148
    L146:
        r218 = r46;
        goto L147
    L149:
        r121 = r121 + 1;
        r123 = r58;
        r53 = r215;
        r55 = r216;
        goto L135
    L150:
        r212 = r53;
        r213 = r46;
        if (r57 == null) goto L132;
        r56 = new r41(r57, new int[]{r122});
        goto L154
    L157:
        int r61 = r37.a;
        tv4[] r62 = r37.c;
        HashMap r63 = new HashMap();
        int r64 = 0;
    L158:
        if (r64 >= r61) goto L160;
        pn0.b(r62[r64], r118, r63);
        r64 = r64 + 1;
        goto L158
    L160:
        pn0.b(r37.f, r118, r63);
        int r65 = 0;
    L161:
        byte r66 = -1;
        if (r65 >= r61) goto L174;
        yv4 r125 = (yv4) r63.get(Integer.valueOf(r37.b[r65]));
        if (r125 == null) goto L173;
        sv4 r126 = r125.a;
        yw1 r127 = r125.b;
        if (r127.isEmpty() == false) goto L169;
    L171:
        r41 r67 = null;
    L172:
        r42[r65] = r67;
        goto L173
    L169:
        if (r62[r65].b(r126) == (-1)) goto L171;
        r67 = new r41(r126, jz4.N(r127));
    L173:
        r65 = r65 + 1;
        goto L161
    L174:
        int r68 = r37.a;
        int r69 = 0;
    L175:
        if (r69 >= r68) goto L189;
        tv4 r70 = r37.c[r69];
        Map r71 = (Map) r118.D0.get(r69);
        if (r71 == null) goto L188;
        if (r71.containsKey(r70) == false) goto L188;
        Map r72 = (Map) r118.D0.get(r69);
        if (r72 != null) goto L183;
    L187:
        r42[r69] = null;
        goto L188
    L183:
        if (r72.get(r70) == null) goto L187;
        kf2.k();
        return null;
    L188:
        r69 = r69 + 1;
        goto L175
    L189:
        int r73 = 0;
    L190:
        if (r73 >= r40) goto L197;
        int r74 = r37.b[r73];
        if (r118.E0.get(r73) == false) goto L194;
    L195:
        r42[r73] = null;
    L196:
        r73 = r73 + 1;
        goto L190
    L194:
        if (r118.I.contains(Integer.valueOf(r74)) == false) goto L196;
    L197:
        s41 r75 = r1.e;
        cp r76 = r1.b;
        r76.getClass();
        t41[] r77 = r75.k(r42, r76);
        dz3[] r78 = new dz3[r40];
        int r79 = 0;
    L199:
        if (r79 >= r40) goto L213;
        int r80 = r37.b[r79];
        if (r118.E0.get(r79) == false) goto L203;
    L210:
        dz3 r81 = null;
    L211:
        r78[r79] = r81;
        r79 = r79 + 1;
        goto L199
    L203:
        if (r118.I.contains(Integer.valueOf(r80)) == true) goto L210;
        if (r37.b[r79] != (-2)) goto L208;
    L209:
        r81 = dz3.c;
        goto L211
    L208:
        if (r77[r79] == null) goto L210;
    L213:
        if (r118.w.a == 0) goto L242;
        int r82 = -1;
        int r83 = 0;
        int r84 = 0;
    L216:
        if (r83 >= r37.a) goto L230;
        int r85 = r37.b[r83];
        t41 r128 = r77[r83];
        if (r85 == 1) goto L221;
        if (r128 != null) goto L242;
    L221:
        if (r85 != 1) goto L228;
        if (r128 == null) goto L228;
        if (r128.length() != 1) goto L228;
        if (pn0.h(r118, r13[r83][r37.c[r83].b(r128.c())][r128.i(r211)], r128.m()) == false) goto L228;
        r84 = r84 + 1;
        r82 = r83;
    L228:
        r83 = r83 + 1;
        r211 = 0;
        goto L216
    L230:
        if (r84 != 1) goto L242;
        if (r118.w.b == false) goto L234;
        int r129 = 1;
    L235:
        dz3 r86 = r78[r82];
        if (r86 != null) goto L238;
    L240:
        boolean r87 = false;
    L241:
        r78[r82] = new dz3(r129, r87);
        goto L242
    L238:
        if (r86.b == false) goto L240;
        r87 = true;
        goto L241
    L234:
        r129 = 2;
    L242:
        Pair r88 = Pair.create(r78, r77);
        t41[] r89 = (t41[]) r88.second;
        List[] r90 = new List[r89.length];
        int r130 = 0;
    L244:
        if (r130 >= r89.length) goto L250;
        t41 r91 = r89[r130];
        if (r91 == null) goto L248;
        gy3 r92 = yw1.o(r91);
    L249:
        r90[r130] = r92;
        r130 = r130 + 1;
        goto L244
    L248:
        vw1 r93 = yw1.o;
        r92 = gy3.r;
        goto L249
    L250:
        uw1 r94 = new uw1(4);
        int r131 = 0;
    L251:
        int r95 = r37.a;
        tv4[] r96 = r37.c;
        if (r131 >= r95) goto L294;
        tv4 r97 = r96[r131];
        List r98 = r90[r131];
        int r132 = 0;
    L255:
        if (r132 >= r97.a) goto L293;
        sv4 r133 = r97.a(r132);
        int r134 = r96[r131].a(r132).a;
        int[] r135 = new int[r134];
        int r99 = 0;
        int r136 = 0;
    L257:
        if (r136 >= r134) goto L263;
        List[] r137 = r90;
        if ((r37.e[r131][r132][r136] & 7) != 4) goto L262;
        r135[r99] = r136;
        r99 = r99 + 1;
    L262:
        r136 = r136 + 1;
        r90 = r137;
        goto L257
    L263:
        List[] r138 = r90;
        int[] r100 = Arrays.copyOf(r135, r99);
        int r101 = 16;
        tv4 r219 = r97;
        String r102 = null;
        int r139 = 0;
        boolean r140 = false;
        int r141 = 0;
    L265:
        if (r139 >= r100.length) goto L272;
        String r103 = r96[r131].a(r132).d[r100[r139]].n;
        int r220 = r141 + 1;
        if (r141 != 0) goto L269;
        r102 = r103;
    L270:
        r101 = Math.min(r101, r37.e[r131][r132][r139] & 24);
        r139 = r139 + 1;
        r141 = r220;
        goto L265
    L269:
        r140 = (!Objects.equals(r102, r103)) | r140;
        goto L270
    L272:
        if (r140 == false) goto L274;
        r101 = Math.min(r101, r37.d[r131]);
    L274:
        if (r101 == 0) goto L276;
        boolean r104 = true;
    L277:
        int r105 = r133.a;
        int[] r106 = new int[r105];
        boolean[] r107 = new boolean[r105];
        int r108 = 0;
    L279:
        if (r108 >= r133.a) goto L292;
        r106[r108] = r37.e[r131][r132][r108] & 7;
        int r142 = 0;
    L282:
        if (r142 >= r98.size()) goto L290;
        t41 r143 = (t41) r98.get(r142);
        if (r143.c().equals(r133) == false) goto L289;
        if (r143.t(r108) == (-1)) goto L289;
        boolean r144 = true;
    L291:
        r107[r108] = r144;
        r108 = r108 + 1;
    L289:
        r142 = r142 + 1;
        goto L282
    L290:
        r144 = false;
        goto L291
    L292:
        r94.c(new iw4(r133, r104, r106, r107));
        r132 = r132 + 1;
        r66 = -1;
        r90 = r138;
        r97 = r219;
        goto L255
    L276:
        r104 = false;
        goto L277
    L293:
        r131 = r131 + 1;
        goto L251
    L294:
        tv4 r109 = r37.f;
        int r145 = 0;
    L296:
        if (r145 >= r109.a) goto L298;
        sv4 r146 = r109.a(r145);
        int[] r147 = new int[r146.a];
        Arrays.fill(r147, 0);
        r94.c(new iw4(r146, false, r147, new boolean[r146.a]));
        r145 = r145 + 1;
        goto L296
    L298:
        ew4 r148 = new ew4((dz3[]) r88.first, (t41[]) r88.second, new jw4(r94.f()), r37);
        int r149 = 0;
    L300:
        if (r149 >= r148.o) goto L318;
        boolean r150 = r148.n(r149);
        t41[] r151 = (t41[]) r148.q;
        if (r150 == false) goto L313;
        if (r151[r149] != null) goto L310;
        if (this.j[r149].o == (-2)) goto L310;
        boolean r152 = false;
    L311:
        rr2.w(r152);
    L317:
        r149 = r149 + 1;
    L310:
        r152 = true;
        goto L311
    L313:
        if (r151[r149] != null) goto L315;
        boolean r153 = true;
    L316:
        rr2.w(r153);
        goto L317
    L315:
        r153 = false;
        goto L316
    L318:
        t41[] r0 = (t41[]) r148.q;
        int r154 = r0.length;
        int r155 = 0;
    L319:
        if (r155 >= r154) goto L325;
        t41 r156 = r0[r155];
        if (r156 == null) goto L324;
        r156.p(r31);
        r156.f(r33);
    L324:
        r155 = r155 + 1;
        goto L319
    L325:
        return r148;
    L105:
        if (r118.B == false) goto L117;
        if (r41 == null) goto L117;
        CaptioningManager r157 = (CaptioningManager) r41.getSystemService("captioning");
        if (r157 == null) goto L117;
        if (r157.isEnabled() == false) goto L117;
        Locale r158 = r157.getLocale();
        if (r158 == null) goto L117;
        String r159 = f35.a;
        String r160 = r158.toLanguageTag();
    L118:
        r52 = pn0.i(3, r37, r13, new eg0(r118, r119, r160, 1), new n7(8));
    L117:
        r160 = null;
        goto L118
    L99:
        if (r48 == null) goto L101;
        r42[((Integer) r48.second).intValue()] = (r41) r48.first;
    L94:
        if (r46.a == r47) goto L92;
        r50 = pn0.i(4, r37, r13, new cn(6, r118), new n7(5));
        goto L97
    L82:
        if (r118.k == false) goto L86;
        if (r41 == null) goto L86;
        Point r161 = f35.w(r41);
    L85:
        r47 = 2;
        r48 = pn0.i(2, r37, r13, new dg0(r118, r119, r12, r161, 2), new n7(6));
    L86:
        r161 = null;
        goto L85
    L77:
        r41 r162 = (r41) r45.first;
        sv4 r163 = r162.a;
        r119 = r163.d[r162.b[0]].d;
    L70:
        r43 = r43 + 1;
        goto L64
    L71:
        r44 = 0;
        goto L72
    L58:
        if (Build.VERSION.SDK_INT < 32) goto L62;
        if (r1.h != null) goto L62;
        r1.h = new ll(r1.d, r1, r1.j);
    L326:
        th = move-exception;
        throw th;
    }

    public final void k() {
        no2 r0 = this.a;
        if ((r0 instanceof b40) == false) goto L9;
        long r1 = this.g.d;
        if (r1 != (-9223372036854775807L)) goto L7;
        r1 = Long.MIN_VALUE;
    L7:
        b40 r2 = (b40) r0;
        r2.s = 0;
        r2.t = r1;
        return;
    }
}
