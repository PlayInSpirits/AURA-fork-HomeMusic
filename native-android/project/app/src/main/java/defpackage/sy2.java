package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

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

    static {
    }

    public sy2(xn4 r2, int r3) {
        this.a = r2;
        this.b = r3;
        if ((r3 & 256) == 0) goto L5;
        boolean r4 = true;
    L6:
        this.c = r4;
        vw1 r5 = yw1.o;
        this.k = gy3.r;
        if ((r3 & 4) == 0) goto L9;
        int r6 = 3;
    L10:
        this.l = r6;
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
        return;
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    @Override // defpackage.k51
    public final void a() {
    }

    @Override // defpackage.k51
    public final int b(l51 r43, t71 r44) {
        if (this.c == false) goto L7;
        if (this.z == false) goto L7;
    L6:
        return -1;
    L7:
        int r3 = this.l;
        ArrayDeque r6 = this.h;
        int r7 = this.b;
        be3 r8 = this.f;
        int r15 = 4;
        int r9 = 0;
        char r10 = 2;
        if (r3 != 0) goto L10;
        int r4 = this.o;
        be3 r5 = this.g;
        if (r4 != 0) goto L299;
        if (r43.a(r5.a, 0, 8, true) == false) goto L288;
        this.o = 8;
        r5.N(0);
        this.n = r5.C();
        this.m = r5.m();
        goto L299
    L288:
        if (this.E != 2) goto L6;
        if ((r7 & 2) == 0) goto L6;
        wv4 r1 = this.B.t(0, 4);
        xx2 r2 = this.F;
        if (r2 != null) goto L294;
        qv2 r11 = null;
    L295:
        sb1 r12 = new sb1();
        r12.k = r11;
        f34.l(r12, r1);
        this.B.p();
        this.B.w(new bo(-9223372036854775807L));
        return -1;
    L294:
        r11 = new qv2(new pv2[]{r2});
    L299:
        long r13 = this.n;
        if (r13 != 1) goto L303;
        r43.readFully(r5.a, 8, 8);
        this.o += 8;
        this.n = r5.G();
    L312:
        long r14 = this.n;
        int r16 = this.o;
        long r17 = r16;
        if (r14 < r17) goto L315;
    L321:
        int r18 = this.m;
        if (r18 == 1836019574) goto L386;
        if (r18 == 1953653099) goto L386;
        if (r18 == 1835297121) goto L386;
        if (r18 == 1835626086) goto L386;
        if (r18 == 1937007212) goto L386;
        if (r18 == 1701082227) goto L386;
        if (r18 == 1835365473) goto L386;
        if (r18 == 1635284069) goto L386;
        if (r18 == 1835296868) goto L378;
        if (r18 == 1836476516) goto L378;
        if (r18 == 1751411826) goto L378;
        if (r18 == 1937011556) goto L378;
        if (r18 == 1937011827) goto L378;
        if (r18 == 1937011571) goto L378;
        if (r18 == 1668576371) goto L378;
        if (r18 == 1701606260) goto L378;
        if (r18 == 1937011555) goto L378;
        if (r18 == 1937011578) goto L378;
        if (r18 == 1937013298) goto L378;
        if (r18 == 1937007471) goto L378;
        if (r18 == 1668232756) goto L378;
        if (r18 == 1953196132) goto L378;
        if (r18 == 1718909296) goto L378;
        if (r18 == 1969517665) goto L378;
        if (r18 == 1801812339) goto L378;
        if (r18 == 1768715124) goto L378;
        long r19 = r43.getPosition();
        long r20 = this.o;
        long r110 = r19 - r20;
        if (this.m != 1836086884) goto L377;
        this.F = new xx2(0, r110, -9223372036854775807L, r110 + r20, this.n - r20);
    L377:
        this.p = null;
        this.l = 1;
    L378:
        if (r16 != 8) goto L380;
        boolean r21 = true;
    L381:
        rr2.w(r21);
        if (this.n > 2147483647L) goto L384;
        boolean r22 = true;
    L385:
        rr2.w(r22);
        be3 r23 = new be3((int) this.n);
        System.arraycopy(r5.a, 0, r23.a, 0, 8);
        this.p = r23;
        this.l = 1;
        goto L7
    L384:
        r22 = false;
        goto L385
    L380:
        r21 = false;
    L386:
        long r24 = r43.getPosition();
        long r111 = this.n;
        long r112 = this.o;
        long r25 = (r24 + r111) - r112;
        if (r111 != r112) goto L389;
    L391:
        r6.push(new oy2(this.m, r25));
        if (this.n == this.o) goto L393;
        this.l = 0;
        this.o = 0;
        goto L7
    L393:
        g(r25);
        goto L7
    L389:
        if (this.m != 1835365473) goto L391;
        r8.K(8);
        r43.n(r8.a, 0, 8);
        wu.a(r8);
        r43.l(r8.b);
        r43.k();
        goto L391
    L315:
        if (this.m != 1718773093) goto L320;
        if (r16 != 8) goto L320;
        this.n = r17;
    L320:
        throw ParserException.c("Atom size less than header length (unsupported).");
    L303:
        if (r13 != 0) goto L312;
        long r26 = r43.getLength();
        if (r26 != (-1)) goto L310;
        oy2 r27 = (oy2) r6.peek();
        if (r27 == null) goto L310;
        r26 = r27.p;
    L310:
        if (r26 == (-1)) goto L312;
        this.n = (r26 - r43.getPosition()) + ((long) this.o);
        goto L312
    L10:
        if (r3 != 1) goto L12;
        long r28 = this.n - ((long) this.o);
        long r29 = r43.getPosition() + r28;
        be3 r30 = this.p;
        if (r30 == null) goto L266;
        r43.readFully(r30.a, this.o, (int) r28);
        if (this.m != 1718909296) goto L263;
        this.v = true;
        r30.N(8);
        int r31 = r30.m();
        if (r31 == 1751476579) goto L246;
        if (r31 == 1903435808) goto L245;
        int r32 = 0;
    L247:
        if (r32 != 0) goto L261;
        r30.O(4);
    L251:
        if (r30.a() <= 0) goto L260;
        int r33 = r30.m();
        if (r33 == 1751476579) goto L257;
        if (r33 == 1903435808) goto L256;
        r32 = 0;
    L258:
        if (r32 == 0) goto L251;
    L256:
        r32 = 1;
        goto L258
    L257:
        r32 = 2;
        goto L258
    L260:
        r32 = 0;
    L261:
        this.E = r32;
    L273:
        boolean r34 = false;
    L275:
        g(r29);
        if (this.w == false) goto L278;
        this.y = true;
        r44.a = this.x;
        this.w = false;
        boolean r210 = true;
    L279:
        if (r210 == false) goto L7;
        if (this.l == 2) goto L7;
        return 1;
    L278:
        r210 = r34;
        goto L279
    L245:
        r32 = 1;
        goto L247
    L246:
        r32 = 2;
        goto L247
    L263:
        if (r6.isEmpty() == true) goto L273;
        ((oy2) r6.peek()).q.add(new py2(this.m, r30));
        goto L273
    L266:
        if (this.v == true) goto L271;
        if (this.m != 1835295092) goto L271;
        this.E = 1;
    L271:
        if (r28 >= 262144) goto L274;
        r43.l((int) r28);
        goto L273
    L274:
        r44.a = r43.getPosition() + r28;
        r34 = true;
        goto L275
    L12:
        if (r3 != 2) goto L14;
        long r35 = r43.getPosition();
        if (this.q != (-1)) goto L157;
        boolean r36 = true;
        int r37 = 0;
        int r113 = -1;
        int r114 = -1;
        boolean r115 = true;
        long r211 = Long.MAX_VALUE;
        long r212 = Long.MAX_VALUE;
        long r38 = Long.MAX_VALUE;
    L126:
        ry2[] r39 = this.C;
        if (r37 >= r39.length) goto L148;
        ry2 r40 = r39[r37];
        int r116 = r40.e;
        xv4 r41 = r40.b;
        char r310 = r10;
        if (r116 == r41.b) goto L147;
        long r311 = r41.c[r116];
        long[][] r42 = this.D;
        r42.getClass();
        long r312 = r42[r37][r116];
        long r313 = r311 - r35;
        if (r313 >= 0) goto L134;
    L137:
        boolean r45 = true;
    L138:
        if (r45 == true) goto L140;
        if (r36 == false) goto L140;
    L143:
        r36 = r45;
        r114 = r37;
        r38 = r313;
        r212 = r312;
    L145:
        if (r312 >= r211) goto L147;
        r115 = r45;
        r113 = r37;
        r211 = r312;
    L140:
        if (r45 != r36) goto L145;
        if (r313 >= r38) goto L145;
    L134:
        if (r313 >= 262144) goto L137;
        r45 = false;
    L147:
        r37 = r37 + 1;
        r10 = r310;
        goto L126
    L148:
        char r314 = r10;
        if (r211 == Long.MAX_VALUE) goto L153;
        if (r115 == false) goto L153;
        if (r212 < (r211 + 10485760)) goto L153;
    L154:
        this.q = r113;
        if (r113 == (-1)) goto L476;
    L158:
        ry2 r46 = this.C[this.q];
        wv4 r47 = r46.c;
        xv4 r48 = r46.b;
        pv4 r117 = r46.a;
        int r118 = r46.e;
        long[] r119 = r48.c;
        int[] r120 = r48.d;
        long r121 = r119[r118] + this.A;
        int r122 = r120[r118];
        my4 r123 = r46.d;
        long r49 = (r121 - r35) + ((long) this.r);
        if (r49 < 0) goto L235;
        if (r49 >= 262144) goto L235;
        int r50 = r117.h;
        int r124 = r117.k;
        tb1 r125 = r117.g;
        if (r50 != 1) goto L166;
        r49 = r49 + 8;
        r122 = r122 - 8;
    L166:
        int r51 = r122;
        r43.l((int) r49);
        String r52 = r125.n;
        String r53 = r125.n;
        if (Objects.equals(r52, "video/avc") == false) goto L173;
        if ((r7 & 32) != 0) goto L176;
    L171:
        char r126 = 1;
        this.u = true;
    L178:
        if (r124 == 0) goto L203;
        be3 r54 = this.e;
        byte[] r55 = r54.a;
        r55[0] = 0;
        r55[r126] = 0;
        r55[r314] = 0;
        int r56 = 4 - r124;
        int r57 = r51 + r56;
    L181:
        if (this.s >= r57) goto L201;
        int r58 = this.t;
        if (r58 == 0) goto L185;
        int r410 = r57;
        int r59 = r47.f(r43, r58, false);
        this.r += r59;
        this.s += r59;
        this.t -= r59;
    L197:
        r57 = r410;
        goto L181
    L185:
        if (this.u == false) goto L187;
    L189:
        int r60 = r124;
        int r127 = 0;
    L190:
        r43.readFully(r55, r56, r60);
        r410 = r57;
        this.r += r60;
        r54.N(0);
        int r61 = r54.m();
        if (r61 < 0) goto L199;
        this.t = r61 - r127;
        be3 r62 = this.d;
        r62.N(0);
        int r63 = r127;
        r47.e(4, r62);
        this.s += 4;
        if (r63 <= 0) goto L197;
        r47.e(r63, r54);
        this.s += r63;
        if (uc5.y(r55, r63, r125) == false) goto L197;
        this.u = true;
        goto L197
    L199:
        throw ParserException.a(null, "Invalid NAL length");
    L187:
        if ((uc5.C(r125) + r124) > (r120[r118] - this.r)) goto L189;
        r127 = uc5.C(r125);
        r60 = r124 + r127;
        goto L190
    L201:
        int r315 = r57;
    L224:
        long r316 = r48.f[r118];
        int r64 = r48.g[r118];
        if (this.u == true) goto L227;
        r64 = r64 | 67108864;
    L227:
        int r317 = r64;
        if (r123 == null) goto L232;
        r123.b(r47, r316, r317, r315, 0, null);
        if ((r118 + 1) != r48.b) goto L233;
        r123.a(r47, null);
    L233:
        r46.e++;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        return 0;
    L232:
        r47.a(r316, r317, r315, 0, null);
        goto L233
    L203:
        if ("audio/ac4".equals(r53) == false) goto L209;
        if (this.s != 0) goto L207;
        hw.g(r51, r8);
        r47.e(7, r8);
        this.s += 7;
    L207:
        r51 = r51 + 7;
    L220:
        int r65 = this.s;
        if (r65 >= r51) goto L223;
        int r66 = r47.f(r43, r51 - r65, false);
        this.r += r66;
        this.s += r66;
        this.t -= r66;
        goto L220
    L223:
        r315 = r51;
        goto L224
    L209:
        if (r46.f != null) goto L211;
    L218:
        if (r123 == null) goto L220;
        r123.c(r43);
        goto L220
    L211:
        if (Objects.equals(r53, "audio/mpeg") == false) goto L218;
        tb1 r67 = r46.f;
        r8.K(4);
        r43.n(r8.a, 0, 4);
        r43.k();
        wy2 r68 = new wy2();
        wv4 r69 = r46.c;
        if (r68.a(r8.m()) == true) goto L215;
    L217:
        r69.g(r67);
        r46.f = null;
        goto L220
    L215:
        if (Objects.equals(r67.n, (String) r68.g) == true) goto L217;
        sb1 r70 = r67.a();
        String r71 = (String) r68.g;
        r71.getClass();
        r70.m = lw2.m(r71);
        r67 = new tb1(r70);
    L176:
        r126 = 1;
        goto L178
    L173:
        if (Objects.equals(r53, "video/hevc") == false) goto L171;
        if ((r7 & 128) == 0) goto L171;
    L235:
        r44.a = r121;
        return 1;
    L476:
        return -1;
    L153:
        r113 = r114;
        goto L154
    L157:
        r314 = 2;
        goto L158
    L14:
        if (r3 != 3) goto L121;
        s84 r72 = this.i;
        ArrayList r73 = r72.a;
        int r74 = r72.b;
        if (r74 == 0) goto L108;
        if (r74 == 1) goto L104;
        short r75 = 2817;
        short r128 = 2816;
        short r76 = 2192;
        if (r74 == 2) goto L85;
        if (r74 != 3) goto L83;
        long r129 = r43.getPosition();
        int r77 = (int) ((r43.getLength() - r43.getPosition()) - ((long) r72.c));
        be3 r130 = new be3(r77);
        r43.readFully(r130.a, 0, r77);
        int r78 = 0;
    L23:
        if (r78 >= r73.size()) goto L81;
        r84 r79 = (r84) r73.get(r78);
        int r131 = r9;
        r130.N((int) (r79.a - r129));
        r130.O(r15);
        int r80 = r130.o();
        Charset r81 = StandardCharsets.UTF_8;
        int r411 = r131;
        String r132 = r130.y(r80, r81);
        switch(r132.hashCode()) {
            case -1711564334: goto L44;
            case -1332107749: goto L40;
            case -1251387154: goto L36;
            case -830665521: goto L32;
            case 1760745220: goto L28;
            default: goto L26;
        };
    L26:
        int r133 = -1;
    L47:
        switch(r133) {
            case 0: goto L54;
            case 1: goto L53;
            case 2: goto L52;
            case 3: goto L51;
            case 4: goto L50;
            default: goto L49;
        };
    L50:
        char r134 = 2817;
    L55:
        int r82 = r79.b - (r80 + 8);
        if (r134 == 2192) goto L66;
        if (r134 == 2816) goto L80;
        if (r134 == 2817) goto L80;
        if (r134 == 2819) goto L80;
        if (r134 == 2820) goto L80;
        tb4.a();
        return r411;
    L80:
        r78 = r78 + 1;
        r9 = 0;
        r15 = 4;
        goto L23
    L66:
        ArrayList r135 = new ArrayList();
        List r83 = s84.e.C(r130.y(r82, r81));
        int r84 = r411;
    L68:
        if (r84 >= r83.size()) goto L79;
        List r85 = s84.d.C((CharSequence) r83.get(r84));
        if (r85.size() != 3) goto L78;
        r135.add(new mg4(1 << (Integer.parseInt((String) r85.get(2)) - 1), Long.parseLong((String) r85.get(r411)), Long.parseLong((String) r85.get(1))));     // Catch: NumberFormatException -> L74
        r84 = r84 + 1;
        r411 = 0;
    L74:
        e = move-exception;
        throw ParserException.a(e, null);
    L78:
        throw ParserException.a(null, null);
    L79:
        this.j.add(new ng4(r135));
        goto L80
    L51:
        r134 = 2820;
        goto L55
    L52:
        r134 = 2816;
        goto L55
    L53:
        r134 = 2819;
        goto L55
    L54:
        r134 = 2192;
        goto L55
    L49:
        throw ParserException.a(null, "Invalid SEF name");
    L28:
        if (r132.equals("Super_SlowMotion_BGM") == false) goto L26;
        r133 = 4;
        goto L47
    L32:
        if (r132.equals("Super_SlowMotion_Deflickering_On") == false) goto L26;
        r133 = 3;
        goto L47
    L36:
        if (r132.equals("Super_SlowMotion_Data") == false) goto L26;
        r133 = 2;
        goto L47
    L40:
        if (r132.equals("Super_SlowMotion_Edit_Data") == false) goto L26;
        r133 = 1;
        goto L47
    L44:
        if (r132.equals("SlowMotion_Data") == false) goto L26;
        r133 = r411;
        goto L47
    L81:
        r44.a = 0;
    L82:
        int r86 = 1;
    L117:
        if (r44.a != 0) goto L282;
        this.l = 0;
        this.o = 0;
        return r86;
    L282:
        return r86;
    L83:
        tb4.a();
        return 0;
    L85:
        long r87 = r43.getLength();
        int r136 = r72.c - 20;
        be3 r137 = new be3(r136);
        r43.readFully(r137.a, 0, r136);
        int r88 = 0;
    L87:
        if (r88 >= (r136 / 12)) goto L101;
        r137.O(2);
        short r138 = r137.q();
        if (r138 == r76) goto L98;
        if (r138 == r128) goto L98;
        if (r138 == r75) goto L98;
        if (r138 == 2819) goto L98;
        if (r138 == 2820) goto L98;
        r137.O(8);
        be3 r213 = r137;
    L99:
        r88 = r88 + 1;
        r137 = r213;
        r75 = 2817;
        r76 = 2192;
        r128 = 2816;
    L98:
        r213 = r137;
        r73.add(new r84(r213.o(), (r87 - ((long) r72.c)) - ((long) r137.o())));
        goto L99
    L101:
        if (r73.isEmpty() == false) goto L103;
        r44.a = 0;
        goto L82
    L103:
        r72.b = 3;
        r44.a = ((r84) r73.get(0)).a;
        goto L82
    L104:
        be3 r89 = new be3(8);
        r43.readFully(r89.a, 0, 8);
        r72.c = r89.o() + 8;
        if (r89.m() == 1397048916) goto L107;
        r44.a = 0;
        goto L82
    L107:
        r44.a = r43.getPosition() - ((long) (r72.c - 12));
        r72.b = 2;
        goto L82
    L108:
        long r90 = r43.getLength();
        if (r90 != (-1)) goto L111;
    L114:
        long r91 = 0;
    L115:
        r44.a = r91;
        r86 = 1;
        r72.b = 1;
        goto L117
    L111:
        if (r90 < 8) goto L114;
        r91 = r90 - 8;
        goto L115
    L121:
        tb4.a();
        return 0;
    }

    @Override // defpackage.k51
    public final boolean c(l51 r4) {
        if ((this.b & 2) == 0) goto L5;
        boolean r0 = true;
    L6:
        th4 r5 = ud3.F0(r4, false, r0);
        if (r5 == null) goto L9;
        gy3 r1 = yw1.o(r5);
    L10:
        this.k = r1;
        if (r5 != null) goto L13;
        return true;
    L13:
        return false;
    L9:
        vw1 r2 = yw1.o;
        r1 = gy3.r;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.k51
    public final void d(long r6, long r8) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (r6 == 0) goto L5;
        ry2[] r5 = this.C;
        int r7 = r5.length;
        int r9 = 0;
    L11:
        if (r9 >= r7) goto L19;
        ry2 r2 = r5[r9];
        xv4 r3 = r2.b;
        int r4 = r3.a(r8);
        if (r4 != (-1)) goto L15;
        r4 = r3.b(r8);
    L15:
        r2.e = r4;
        my4 r10 = r2.d;
        if (r10 == null) goto L18;
        r10.b = false;
        r10.c = 0;
    L18:
        r9 = r9 + 1;
        goto L11
    L19:
        return;
    L5:
        if (this.l == 3) goto L8;
        this.l = 0;
        this.o = 0;
        return;
    L8:
        s84 r11 = this.i;
        r11.a.clear();
        r11.b = 0;
        this.j.clear();
    }

    @Override // defpackage.k51
    public final List e() {
        return this.k;
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        if ((this.b & 16) != 0) goto L5;
        r3 = new ll(r3, this.a);
    L5:
        this.B = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(long r43) {
    L3:
        ArrayDeque r1 = this.h;
        int r3 = 0;
        if (r1.isEmpty() == true) goto L220;
        if (((oy2) r1.peek()).p != r43) goto L220;
        oy2 r5 = (oy2) r1.pop();
        if (r5.o == 1836019574) goto L9;
        if (r1.isEmpty() == true) goto L3;
        ((oy2) r1.peek()).r.add(r5);
        goto L3
    L9:
        oy2 r2 = r5.r(1835365473);
        ArrayList r6 = new ArrayList();
        boolean r15 = this.c;
        long r16 = 0;
        int r8 = this.b;
        if (r2 == null) goto L82;
        qv2 r4 = wu.f(r2);
        if (this.y == false) goto L57;
        r4.getClass();
        pv2[] r7 = r4.a;
        int r9 = r7.length;
        int r11 = 0;
    L14:
        if (r11 >= r9) goto L24;
        pv2 r12 = r7[r11];
        if (oi2.class.isAssignableFrom(r12.getClass()) == false) goto L20;
        pv2 r13 = (pv2) oi2.class.cast(r12);
        if (((oi2) r13).a.equals("auxiliary.tracks.interleaved") == false) goto L20;
    L21:
        if (r13 != null) goto L25;
        r11 = r11 + 1;
    L25:
        oi2 r14 = (oi2) r13;
        if (r14 != null) goto L28;
    L30:
        int r10 = r7.length;
        int r17 = 0;
    L31:
        if (r17 >= r10) goto L41;
        pv2 r18 = r7[r17];
        if (oi2.class.isAssignableFrom(r18.getClass()) == false) goto L37;
        pv2 r19 = (pv2) oi2.class.cast(r18);
        if (((oi2) r19).a.equals("auxiliary.tracks.map") == false) goto L37;
    L38:
        if (r19 != null) goto L42;
        r17 = r17 + 1;
    L42:
        oi2 r110 = (oi2) r19;
        r110.getClass();
        ArrayList r20 = r110.d();
        ArrayList r21 = new ArrayList(r20.size());
        int r111 = 0;
    L44:
        if (r111 >= r20.size()) goto L56;
        int r112 = ((Integer) r20.get(r111)).intValue();
        if (r112 == 0) goto L54;
        if (r112 == 1) goto L53;
        int r113 = 3;
        if (r112 == 2) goto L55;
        if (r112 == 3) goto L52;
        r113 = 0;
        goto L55
    L52:
        r113 = 4;
    L55:
        r21.add(Integer.valueOf(r113));
        r111 = r111 + 1;
        goto L44
    L53:
        r113 = 2;
        goto L55
    L54:
        r113 = 1;
        goto L55
    L56:
        int r114 = 0;
        ArrayList r22 = r21;
    L83:
        ArrayList r115 = new ArrayList();
        if (this.E != 1) goto L86;
        boolean r116 = 1;
    L87:
        zg1 r23 = new zg1();
        py2 r24 = r5.s(1969517665);
        if (r24 == null) goto L90;
        qv2 r25 = wu.k(r24);
        r23.b(r25);
    L91:
        py2 r117 = r5.s(1836476516);
        r117.getClass();
        pv2[] r118 = new pv2[1];
        r118[r114] = wu.g(r117.p);
        qv2 r119 = new qv2(r118);
        if ((r8 & 1) == 0) goto L94;
        boolean r120 = 1;
    L95:
        qv2 r26 = r119;
        qv2 r27 = r25;
        ArrayList r28 = wu.j(r5, r23, -9223372036854775807L, null, r120, r116, new zr2(27), this.c);
        if (this.y == true) goto L98;
    L102:
        String r29 = au0.r(r28);
        int r121 = r114;
        int r122 = r121;
        long r30 = -9223372036854775807L;
        int r123 = -1;
    L104:
        if (r121 >= r28.size()) goto L186;
        xv4 r31 = (xv4) r28.get(r121);
        int r32 = r31.b;
        ArrayDeque r210 = r1;
        pv4 r33 = r31.a;
        if (r32 != 0) goto L108;
        r22 = r22;
        String r211 = r29;
        int r36 = r121;
        int r212 = r122;
        qv2 r34 = r27;
        qv2 r124 = r26;
        qv2 r125 = r4;
    L185:
        r27 = r34;
        r26 = r124;
        r4 = r125;
        r1 = r210;
        r28 = r28;
        r122 = r212;
        r29 = r211;
        r15 = r15;
        r121 = r36 + 1;
        r22 = r22;
        goto L104
    L108:
        m51 r35 = this.B;
        r212 = r122 + 1;
        r211 = r29;
        int r37 = r33.b;
        tb1 r126 = r33.g;
        wv4 r38 = r35.t(r122, r37);
        ry2 r39 = new ry2(r33, r31, r38);
        r125 = r4;
        long r40 = r33.e;
        if (r40 != (-9223372036854775807L)) goto L112;
        r40 = r31.i;
    L112:
        r38.d(r40);
        long r41 = Math.max(r30, r40);
        String r42 = r126.n;
        String r44 = r126.n;
        boolean r45 = "audio/true-hd".equals(r42);
        int r127 = r31.e;
        if (r45 == false) goto L115;
        int r128 = r127 * 16;
    L116:
        sb1 r46 = r126.a();
        r46.n = r128;
        if (r37 != 2) goto L130;
        int r129 = r126.f;
        if ((r8 & 8) != 0) goto L121;
    L125:
        int r310 = r129;
        if (this.y == false) goto L128;
        int r130 = r310 | 32768;
        r46.g = ((Integer) r22.get(r121)).intValue();
    L129:
        r46.f = r130;
    L131:
        long[] r47 = r31.f;
        int[] r131 = r31.h;
        boolean r48 = r31.j;
        if (lw2.l(r44) == true) goto L135;
        r36 = r121;
    L134:
        long r49 = -9223372036854775807L;
    L161:
        if (r49 == (-9223372036854775807L)) goto L163;
        rt4 r50 = new rt4(r49);
        int r51 = 1;
        pv2[] r52 = new pv2[1];
        r52[r114] = r50;
        qv2 r53 = new qv2(r52);
    L164:
        if (r37 != r51) goto L170;
        int r54 = r23.a;
        if (r54 == (-1)) goto L170;
        int r55 = r23.b;
        if (r55 == (-1)) goto L170;
        r46.H = r54;
        r46.I = r55;
    L170:
        qv2 r56 = r126.l;
        ArrayList r57 = this.j;
        if (r57.isEmpty() == false) goto L174;
        qv2 r132 = null;
    L173:
        r34 = r27;
        r124 = r26;
        gh0.D(r37, r125, r46, r56, new qv2[]{r132, r34, r124, r53});
        r46.l = lw2.m(r211);
        if (Objects.equals(r44, "audio/mpeg") == false) goto L179;
        r39.f = new tb1(r46);
    L181:
        if (r37 != 2) goto L184;
        if (r123 != (-1)) goto L184;
        r123 = r115.size();
    L184:
        r115.add(r39);
        r30 = r41;
        goto L185
    L179:
        f34.l(r46, r39.c);
        goto L181
    L174:
        r132 = new qv2(r57);
        goto L173
    L163:
        r51 = 1;
        r53 = null;
        goto L164
    L135:
        if (r48 == false) goto L138;
        int r58 = r31.b;
    L139:
        int r59 = Math.min(r58, 20);
        if (r40 == (-9223372036854775807L)) goto L142;
        boolean r133 = 1;
    L143:
        rr2.w(r133);
        r36 = r121;
        long r60 = Math.min(r40, 10000000);
        int r134 = r114;
        int r135 = r134;
        int r61 = -1;
    L144:
        if (r134 >= r59) goto L157;
        if (r48 == false) goto L147;
        int r62 = r134;
    L148:
        long r311 = r47[r62];
        if (r311 > r60) goto L157;
        if (r311 < 0) goto L156;
        int r312 = r62;
        int r63 = r31.d[r312];
        if (r63 <= r135) goto L156;
        r135 = r63;
        r61 = r312;
    L156:
        r134 = r134 + 1;
        goto L144
    L147:
        r62 = r131[r134];
    L157:
        if (r61 == (-1)) goto L134;
        r49 = r47[r61];
        goto L161
    L142:
        r133 = r114;
        goto L143
    L138:
        r58 = r131.length;
        goto L139
    L128:
        r130 = r310;
        goto L129
    L121:
        if (r123 != (-1)) goto L123;
        int r136 = 1;
    L124:
        r129 = r129 | r136;
        goto L125
    L123:
        r136 = 2;
        goto L124
    L130:
        r22 = r22;
        goto L131
    L115:
        r128 = r127 + 30;
        goto L116
    L186:
        ArrayDeque r213 = r1;
        boolean r214 = r15;
        boolean r64 = true;
        int r65 = -1;
        ry2[] r66 = (ry2[]) r115.toArray(new ry2[r114]);
        this.C = r66;
        if (r214 == true) goto L210;
        long[][] r137 = new long[r66.length][];
        int[] r67 = new int[r66.length];
        long[] r68 = new long[r66.length];
        boolean[] r69 = new boolean[r66.length];
        int r70 = 0;
    L190:
        if (r70 >= r66.length) goto L192;
        r137[r70] = new long[r66[r70].b.b];
        r68[r70] = r66[r70].b.f[0];
        r70 = r70 + 1;
        goto L190
    L192:
        int r71 = 0;
    L194:
        if (r71 >= r66.length) goto L209;
        long r138 = Long.MAX_VALUE;
        int r72 = 0;
        int r139 = r65;
    L197:
        if (r72 >= r66.length) goto L204;
        if (r69[r72] == true) goto L203;
        long r215 = r68[r72];
        if (r215 > r138) goto L203;
        r139 = r72;
        r138 = r215;
    L203:
        r72 = r72 + 1;
        goto L197
    L204:
        int r73 = r67[r139];
        long[] r140 = r137[r139];
        r140[r73] = r16;
        xv4 r141 = r66[r139].b;
        boolean r142 = r64;
        r16 = r16 + ((long) r141.d[r73]);
        int r74 = r73 + 1;
        r67[r139] = r74;
        if (r74 >= r140.length) goto L207;
        r68[r139] = r141.f[r74];
    L208:
        r64 = r142;
        r65 = -1;
        goto L194
    L207:
        r69[r139] = r142;
        r71 = r71 + 1;
    L209:
        boolean r143 = r64;
        this.D = r137;
        this.B.p();
        this.B.w(new qy2(r30, this.C, r123));
    L212:
        r213.clear();
        this.z = r143;
        if (this.w == true) goto L3;
        if (r214 == true) goto L3;
        this.l = 2;
        goto L3
    L210:
        r137 = null;
        goto L209
    L98:
        if (r22.size() != r28.size()) goto L100;
        boolean r75 = 1;
    L101:
        Locale r76 = Locale.US;
        rr2.v(b11.n("The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", r22.size(), r28.size(), ")"), r75);
        goto L102
    L100:
        r75 = r114;
        goto L101
    L94:
        r120 = r114;
        goto L95
    L90:
        r25 = null;
        goto L91
    L86:
        r116 = r114;
    L37:
        r19 = null;
        goto L38
    L41:
        r19 = null;
        goto L42
    L28:
        if (r14.b[0] != 0) goto L30;
        this.A = this.x + 16;
    L20:
        r13 = null;
        goto L21
    L24:
        r13 = null;
        goto L25
    L57:
        if (r4 != null) goto L59;
    L60:
        r114 = 0;
    L81:
        r22 = r6;
        goto L83
    L59:
        if ((r8 & 64) == 0) goto L60;
        pv2[] r77 = r4.a;
        int r144 = r77.length;
        int r145 = 0;
    L62:
        if (r145 >= r144) goto L73;
        pv2 r146 = r77[r145];
        if (oi2.class.isAssignableFrom(r146.getClass()) == false) goto L68;
        pv2 r147 = (pv2) oi2.class.cast(r146);
        r114 = r3;
        if (((oi2) r147).a.equals("auxiliary.tracks.offset") == true) goto L70;
    L69:
        r147 = null;
    L70:
        if (r147 != null) goto L74;
        r145 = r145 + 1;
        r3 = r114;
    L74:
        oi2 r148 = (oi2) r147;
        if (r148 == null) goto L81;
        long r78 = new be3(r148.b).G();
        if (r78 <= 0) goto L81;
        this.x = r78;
        this.w = true;
        r213 = r1;
        r143 = true;
        r214 = r15;
        goto L212
    L68:
        r114 = r3;
        goto L69
    L73:
        r114 = r3;
        r147 = null;
        goto L74
    L82:
        r114 = 0;
        r22 = r6;
        r4 = null;
    L220:
        if (this.l == 2) goto L264;
        this.l = 0;
        this.o = 0;
        return;
    }
}
