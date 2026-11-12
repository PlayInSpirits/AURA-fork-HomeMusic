package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jx0 implements mz0 {
    public final be3 a;
    public final AtomicInteger b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public wv4 g;
    public int h;
    public int i;
    public int j;
    public long k;
    public tb1 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;

    public jx0(String r3, int r4, int r5) {
        this.a = new be3(new byte[r5]);
        this.h = 0;
        this.q = -9223372036854775807L;
        this.b = new AtomicInteger();
        this.o = -1;
        this.p = -1;
        this.c = r3;
        this.d = r4;
        this.e = "video/mp2t";
    }

    @Override // defpackage.mz0
    public final void a(be3 r39) {
        this.g.getClass();
    L4:
        if (r39.a() <= 0) goto L191;
        int r2 = this.h;
        be3 r5 = this.a;
        switch(r2) {
            case 0: goto L180;
            case 1: goto L151;
            case 2: goto L144;
            case 3: goto L86;
            case 4: goto L81;
            case 5: goto L21;
            case 6: goto L9;
            default: goto L7;
        };
    L7:
        tb4.a();
        return;
    L21:
        if (b(r39, r5.a, this.p) == false) goto L4;
        byte[] r3 = r5.a;
        h00 r14 = e35.A(r3);
        if (r14.i(32) != 1078008818) goto L25;
        int r6 = 1;
    L26:
        int r15 = e35.O(r14, e35.i);
        int r24 = r15 + 1;
        if (r6 != 0) goto L29;
        long r11 = -9223372036854775807L;
        int r9 = -2147483647;
    L62:
        int r4 = 0;
        int r7 = 0;
    L63:
        if (r4 >= r6) goto L65;
        r7 = r7 + e35.O(r14, e35.j);
        r4 = r4 + 1;
        goto L63
    L65:
        AtomicInteger r8 = this.b;
        if (r6 == 0) goto L69;
        r8.set(e35.O(r14, e35.k));
    L69:
        if (r8.get() == 0) goto L71;
        int r10 = e35.O(r14, e35.l);
    L72:
        int r12 = (r7 + r10) + r24;
        g r13 = new g("audio/vnd.dts.uhd;profile=p2", 2, r9, r12, r11);
        if (this.n != 3) goto L75;
        g(r13);
    L75:
        this.m = r12;
        if (r11 != (-9223372036854775807L)) goto L78;
        long r16 = 0;
    L79:
        this.k = r16;
        r5.N(0);
        this.g.e(this.p, r5);
        this.h = 6;
        goto L4
    L78:
        r16 = r11;
        goto L79
    L71:
        r10 = 0;
        goto L72
    L29:
        if (r14.h() == false) goto L60;
        int r17 = r15 - 1;
        int r18 = ((r3[r17] << 8) & 65535) | (r3[r15] & 255);
        String r23 = f35.a;
        int r19 = 0;
        int r110 = 65535;
    L31:
        if (r19 >= r17) goto L33;
        byte r20 = r3[r19];
        int[] r111 = f35.k;
        int r21 = (r111[(((r20 & 255) >> 4) ^ ((r110 >> 12) & 255)) & 255] ^ ((r110 << 4) & 65535)) & 65535;
        r110 = (r111[((r20 & 15) ^ ((r21 >> 12) & 255)) & 255] ^ ((r21 << 4) & 65535)) & 65535;
        r19 = r19 + 1;
        goto L31
    L33:
        if (r18 != r110) goto L58;
        int r22 = r14.i(2);
        if (r22 == 0) goto L43;
        if (r22 == 1) goto L42;
        if (r22 != 2) goto L41;
        int r112 = 384;
    L39:
        int r25 = 3;
    L44:
        int r26 = (r14.i(r25) + 1) * r112;
        int r27 = r14.i(2);
        if (r27 == 0) goto L52;
        if (r27 == 1) goto L51;
        if (r27 != 2) goto L50;
        int r28 = 48000;
    L54:
        if (r14.h() == false) goto L56;
        r14.t(36);
    L56:
        int r113 = r28 * (1 << r14.i(2));
        r11 = f35.a0(r26, 1000000, r28, RoundingMode.DOWN);
        r9 = r113;
        goto L62
    L50:
        throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + r27);
    L51:
        r28 = 44100;
        goto L54
    L52:
        r28 = 32000;
        goto L54
    L41:
        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + r22);
    L42:
        r112 = 480;
        goto L39
    L43:
        r25 = 3;
        r112 = 512;
        goto L44
    L58:
        throw ParserException.a(null, "CRC check failed");
    L60:
        throw ParserException.c("Only supports full channel mask-based audio presentation");
    L25:
        r6 = 0;
        goto L26
    L81:
        if (b(r39, r5.a, 6) == false) goto L4;
        h00 r29 = e35.A(r5.a);
        r29.t(32);
        int r30 = e35.O(r29, e35.m) + 1;
        this.p = r30;
        int r31 = this.i;
        if (r31 <= r30) goto L85;
        int r32 = r31 - r30;
        this.i = r31 - r32;
        r39.N(r39.b - r32);
    L85:
        this.h = 5;
        goto L4
    L86:
        int r210 = 8;
        if (b(r39, r5.a, this.o) == false) goto L4;
        h00 r33 = e35.A(r5.a);
        r33.t(40);
        int r34 = r33.i(2);
        if (r33.h() == true) goto L91;
        int r35 = 16;
        int r36 = 8;
    L92:
        r33.t(r36);
        int r37 = r33.i(r35) + 1;
        boolean r38 = r33.h();
        if (r38 == false) goto L113;
        int r40 = r33.i(2);
        int r114 = (r33.i(3) + 1) * 512;
        if (r33.h() == false) goto L97;
        r33.t(36);
    L97:
        int r115 = r33.i(3) + 1;
        int r116 = r33.i(3) + 1;
        if (r115 != 1) goto L112;
        if (r116 != 1) goto L112;
        int r41 = r34 + 1;
        int r117 = r33.i(r41);
        int r118 = 0;
    L101:
        if (r118 >= r41) goto L107;
        if (((r117 >> r118) & 1) != 1) goto L105;
        r33.t(r210);
    L105:
        r118 = r118 + 1;
        r210 = 8;
        goto L101
    L107:
        if (r33.h() == false) goto L114;
        r33.t(2);
        int r42 = (r33.i(2) + 1) << 2;
        int r119 = r33.i(2) + 1;
        int r120 = 0;
    L109:
        if (r120 >= r119) goto L114;
        r33.t(r42);
        r120 = r120 + 1;
    L114:
        r33.t(r35);
        r33.t(12);
        if (r38 == true) goto L117;
        int r310 = -1;
        int r311 = -2147483647;
    L127:
        if (r38 == false) goto L137;
        if (r40 == 0) goto L135;
        if (r40 == 1) goto L134;
        if (r40 != 2) goto L133;
        int r43 = 48000;
    L136:
        String r44 = f35.a;
        long r312 = f35.a0(r114, 1000000, r43, RoundingMode.DOWN);
    L138:
        g(new g("audio/vnd.dts.hd;profile=lbr", r310, r311, r37, r312));
        this.m = r37;
        if (r312 != (-9223372036854775807L)) goto L141;
        long r45 = 0;
    L142:
        this.k = r45;
        r5.N(0);
        this.g.e(this.o, r5);
        this.h = 6;
        goto L4
    L141:
        r45 = r312;
        goto L142
    L133:
        throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + r40);
    L134:
        r43 = 44100;
        goto L136
    L135:
        r43 = 32000;
        goto L136
    L137:
        r312 = -9223372036854775807L;
        goto L138
    L117:
        if (r33.h() == false) goto L120;
        r33.t(4);
    L120:
        if (r33.h() == false) goto L123;
        r33.t(24);
    L123:
        if (r33.h() == false) goto L125;
        r33.u(r33.i(10) + 1);
    L125:
        r33.t(5);
        r311 = e35.h[r33.i(4)];
        r310 = r33.i(8) + 1;
    L112:
        throw ParserException.c("Multiple audio presentations or assets not supported");
    L113:
        r40 = -1;
        r114 = 0;
        goto L114
    L91:
        r35 = 20;
        r36 = 12;
        goto L92
    L144:
        if (b(r39, r5.a, 7) == false) goto L4;
        h00 r46 = e35.A(r5.a);
        r46.t(42);
        if (r46.h() == false) goto L148;
        int r47 = 12;
    L149:
        this.o = r46.i(r47) + 1;
        this.h = 3;
        goto L4
    L148:
        r47 = 8;
        goto L149
    L151:
        if (b(r39, r5.a, 18) == false) goto L4;
        byte[] r48 = r5.a;
        if (this.l != null) goto L165;
        String r49 = this.f;
        h00 r121 = e35.A(r48);
        r121.t(60);
        int r122 = e35.e[r121.i(6)];
        int r123 = e35.f[r121.i(4)];
        int r124 = r121.i(5);
        int[] r125 = e35.g;
        if (r124 < 29) goto L158;
        int r50 = -1;
    L159:
        r121.t(10);
        if (r121.i(2) <= 0) goto L162;
        int r126 = 1;
    L163:
        int r127 = r122 + r126;
        sb1 r128 = new sb1();
        r128.a = r49;
        r128.l = lw2.m(this.e);
        r128.m = lw2.m("audio/vnd.dts");
        r128.h = r50;
        r128.E = r127;
        r128.F = r123;
        r128.q = null;
        r128.d = this.c;
        r128.f = this.d;
        tb1 r51 = new tb1(r128);
        this.l = r51;
        this.g.g(r51);
        goto L165
    L162:
        r126 = 0;
        goto L163
    L158:
        r50 = (r125[r124] * 1000) / 2;
    L165:
        this.m = e35.y(r48);
        byte r52 = r48[0];
        if (r52 != (-2)) goto L168;
        int r53 = (r48[5] & 1) << 6;
        byte r54 = r48[4];
    L172:
        int r55 = r54 & 252;
    L178:
        this.k = jz4.m(f35.Y(this.l.G, (((r55 >> 2) | r53) + 1) * 32));
        r5.N(0);
        this.g.e(18, r5);
        this.h = 6;
        goto L4
    L168:
        if (r52 != (-1)) goto L170;
        r53 = (r48[4] & 7) << 4;
        byte r56 = r48[7];
    L175:
        r55 = r56 & 60;
        goto L178
    L170:
        if (r52 == 31) goto L174;
        r53 = (r48[4] & 1) << 6;
        r54 = r48[5];
        goto L172
    L174:
        r53 = (r48[5] & 7) << 4;
        r56 = r48[6];
    L180:
        if (r39.a() <= 0) goto L4;
        int r57 = this.j << 8;
        this.j = r57;
        int r58 = r57 | r39.A();
        this.j = r58;
        int r59 = e35.z(r58);
        this.n = r59;
        if (r59 == 0) goto L180;
        byte[] r60 = r5.a;
        int r61 = this.j;
        r60[0] = (byte) ((r61 >> 24) & 255);
        r60[1] = (byte) ((r61 >> 16) & 255);
        r60[2] = (byte) ((r61 >> 8) & 255);
        r60[3] = (byte) (r61 & 255);
        this.i = 4;
        this.j = 0;
        if (r59 == 3) goto L190;
        if (r59 == 4) goto L190;
        if (r59 == 1) goto L188;
        this.h = 2;
        goto L4
    L188:
        this.h = 1;
    L190:
        this.h = 4;
        goto L4
    L9:
        int r62 = Math.min(r39.a(), this.m - this.i);
        this.g.e(r62, r39);
        int r63 = this.i + r62;
        this.i = r63;
        if (r63 != this.m) goto L4;
        if (this.q == (-9223372036854775807L)) goto L14;
        boolean r64 = true;
    L15:
        rr2.w(r64);
        wv4 r65 = this.g;
        long r66 = this.q;
        if (this.n != 4) goto L18;
        int r67 = 0;
    L19:
        r65.a(r66, r67, this.m, 0, null);
        this.q += this.k;
        this.h = 0;
        goto L4
    L18:
        r67 = 1;
        goto L19
    L14:
        r64 = false;
        goto L15
    }

    public final boolean b(be3 r3, byte[] r4, int r5) {
        int r0 = Math.min(r3.a(), r5 - this.i);
        r3.k(r4, this.i, r0);
        int r6 = this.i + r0;
        this.i = r6;
        if (r6 != r5) goto L6;
        return true;
    L6:
        return false;
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
    public final void d(boolean r1) {
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        this.q = r2;
    }

    @Override // defpackage.mz0
    public final void f(m51 r2, sy4 r3) {
        r3.a();
        r3.b();
        this.f = r3.e;
        r3.b();
        this.g = r2.t(r3.d, 1);
    }

    public final void g(g r5) {
        int r0 = r5.b;
        String r1 = r5.a;
        int r6 = r5.c;
        if (r0 != (-2147483647)) goto L5;
        return;
    L5:
        if (r6 == (-1)) goto L23;
        tb1 r2 = this.l;
        if (r2 != null) goto L10;
    L15:
        tb1 r3 = this.l;
        if (r3 != null) goto L18;
        sb1 r4 = new sb1();
    L19:
        r4.a = this.f;
        r4.l = lw2.m(this.e);
        r4.m = lw2.m(r1);
        r4.E = r6;
        r4.F = r0;
        r4.d = this.c;
        r4.f = this.d;
        tb1 r7 = new tb1(r4);
        this.l = r7;
        this.g.g(r7);
        return;
    L18:
        r4 = r3.a();
        goto L19
    L10:
        if (r6 != r2.F) goto L15;
        if (r0 != r2.G) goto L15;
        if (r1.equals(r2.n) == false) goto L15;
        return;
    }
}
