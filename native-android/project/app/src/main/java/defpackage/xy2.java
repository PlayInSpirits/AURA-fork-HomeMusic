package defpackage;

import androidx.media3.common.ParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xy2 implements mz0 {
    public final be3 a;
    public final h00 b;
    public final be3 c;
    public int d;
    public String e;
    public wv4 f;
    public double g;
    public double h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public final dl p;
    public int q;
    public int r;
    public int s;
    public long t;
    public boolean u;

    public xy2() {
        this.d = 0;
        this.a = new be3(2, new byte[15]);
        this.b = new h00();
        this.c = new be3();
        this.p = new dl();
        this.q = -2147483647;
        this.r = -1;
        this.t = -1;
        this.j = true;
        this.m = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.mz0
    public final void a(be3 r24) {
        this.f.getClass();
    L4:
        if (r24.a() <= 0) goto L254;
        int r2 = this.d;
        int r3 = 8;
        int r4 = 3;
        int r6 = 1;
        if (r2 != 0) goto L7;
        int r5 = this.k;
        if ((r5 & 2) == 0) goto L243;
        if ((r5 & 4) != 0) goto L253;
    L247:
        if (r24.a() <= 0) goto L4;
        int r7 = this.l << 8;
        this.l = r7;
        int r8 = r7 | r24.A();
        this.l = r8;
        if ((r8 & 16777215) != 12583333) goto L247;
        r24.N(r24.b - 3);
        this.l = 0;
    L253:
        this.d = 1;
        goto L4
    L243:
        r24.N(r24.c);
        goto L4
    L7:
        be3 r11 = this.c;
        dl r12 = this.p;
        if (r2 != 1) goto L9;
        int r9 = r24.a();
        be3 r10 = this.a;
        int r13 = Math.min(r9, r10.a());
        r24.k(r10.a, r10.b, r13);
        r10.O(r13);
        if (r10.a() == 0) goto L187;
        this.m = false;
        goto L4
    L187:
        int r14 = r10.c;
        byte[] r15 = r10.a;
        h00 r16 = this.b;
        r16.o(r14, r15);
        r16.f();
        int r17 = ji2.G(r16, 3, 8, 8);
        r12.o = r17;
        if (r17 != (-1)) goto L191;
    L189:
        boolean r18 = false;
    L230:
        if (r18 == false) goto L232;
        int r19 = 0;
        this.n = 0;
        this.o = (r12.q + r14) + this.o;
    L233:
        if (r18 == true) goto L234;
        int r20 = r10.c;
        if (r20 >= 15) goto L4;
        r10.M(r20 + 1);
        this.m = false;
        goto L4
    L234:
        r10.N(r19);
        this.f.e(r10.c, r10);
        r10.K(2);
        r11.K(r12.q);
        this.m = true;
        this.d = 2;
        goto L4
    L232:
        r19 = 0;
        goto L233
    L191:
        if (Math.max(Math.max(2, 8), 32) > 63) goto L193;
        boolean r21 = true;
    L194:
        rr2.l(r21);
        gh0.g(gh0.g(3, 255), 4294967296L);
        if (r16.b() >= 2) goto L197;
    L196:
        long r110 = -1;
    L209:
        r12.p = r110;
        if (r110 == (-1)) goto L189;
        if (r110 > 16) goto L239;
        if (r110 != 0) goto L227;
        int r22 = r12.o;
        if (r22 == 1) goto L226;
        if (r22 == 2) goto L224;
        if (r22 != 17) goto L227;
        throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
    L224:
        throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
    L226:
        throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
    L227:
        int r23 = ji2.G(r16, 11, 24, 24);
        r12.q = r23;
        if (r23 == (-1)) goto L189;
        r18 = true;
        goto L230
    L239:
        throw ParserException.c("Contains sub-stream with an invalid packet label " + r12.p);
    L197:
        long r25 = r16.k(2);
        if (r25 == 3) goto L200;
    L208:
        r110 = r25;
        goto L209
    L200:
        if (r16.b() < 8) goto L196;
        long r111 = r16.k(8);
        r25 = r25 + r111;
        if (r111 != 255) goto L208;
        if (r16.b() < 32) goto L196;
        r25 = r16.k(32) + r25;
        goto L208
    L193:
        r21 = false;
        goto L194
    L9:
        if (r2 != 2) goto L183;
        int r26 = r12.o;
        if (r26 == 1) goto L13;
        if (r26 == 17) goto L13;
    L14:
        int r27 = Math.min(r24.a(), r12.q - this.n);
        this.f.e(r27, r24);
        int r28 = this.n + r27;
        this.n = r28;
        if (r28 != r12.q) goto L4;
        int r29 = r12.o;
        if (r29 != 1) goto L165;
        byte[] r112 = r11.a;
        h00 r30 = new h00(r112.length, r112);
        int r113 = r30.i(8);
        int r114 = r30.i(5);
        if (r114 != 31) goto L21;
        int r31 = r30.i(24);
    L50:
        int r115 = r30.i(3);
        if (r115 == 0) goto L62;
        if (r115 == 1) goto L61;
        if (r115 == 2) goto L60;
        if (r115 == 3) goto L60;
        if (r115 != 4) goto L59;
        int r116 = 4096;
    L57:
        int r117 = r116;
        if (r115 == 0) goto L73;
        if (r115 == 1) goto L73;
        if (r115 == 2) goto L72;
        if (r115 == 3) goto L71;
        if (r115 != 4) goto L70;
        char r32 = 1;
    L74:
        r30.t(2);
        ji2.R(r30);
        int r118 = r30.i(5);
        int r33 = 0;
        int r119 = 0;
    L75:
        int r120 = r6;
        int r34 = 16;
        if (r33 >= (r118 + 1)) goto L84;
        int r35 = r30.i(3);
        r119 = (ji2.G(r30, 5, 8, 16) + 1) + r119;
        if (r35 == 0) goto L81;
        if (r35 == 2) goto L81;
    L83:
        r33 = r33 + 1;
        r6 = r120;
    L81:
        if (r30.h() == false) goto L83;
        ji2.R(r30);
        goto L83
    L84:
        int r36 = ji2.G(r30, 4, 8, 16) + 1;
        r30.s();
        int r37 = 0;
    L85:
        double r210 = 2.0d;
        if (r37 >= r36) goto L135;
        int r121 = r30.i(2);
        if (r121 != 0) goto L90;
        r30.t(r4);
        if (r30.h() == false) goto L131;
        r30.t(13);
    L131:
        if (r32 <= 0) goto L133;
        ji2.Q(r30);
    L133:
        r37 = r37 + 1;
        r3 = 8;
        r4 = 3;
        r34 = 16;
        r120 = 1;
        goto L85
    L90:
        if (r121 == r120) goto L99;
        if (r121 != r4) goto L133;
        ji2.G(r30, 4, r3, r34);
        int r122 = ji2.G(r30, 4, r3, r34);
        if (r30.h() == false) goto L96;
        ji2.G(r30, r3, r34, 0);
    L96:
        r30.s();
        if (r122 <= 0) goto L133;
        r30.t(r122 * 8);
        goto L133
    L99:
        r30.t(r4);
        boolean r123 = r30.h();
        if (r123 == false) goto L102;
        r30.t(13);
    L102:
        if (r123 == false) goto L104;
        r30.s();
    L104:
        if (r32 <= 0) goto L106;
        ji2.Q(r30);
        int r124 = r30.i(2);
    L107:
        if (r124 <= 0) goto L117;
        r30.t(6);
        int r38 = r30.i(2);
        r30.t(4);
        if (r30.h() == false) goto L111;
        r30.t(5);
    L111:
        if (r124 == 2) goto L113;
        if (r124 == r4) goto L113;
    L114:
        if (r38 != 2) goto L117;
        r30.s();
    L113:
        r30.t(6);
    L117:
        int r39 = ((int) Math.floor(Math.log(r119 - 1) / Math.log(2.0d))) + 1;
        int r40 = r30.i(2);
        if (r40 <= 0) goto L123;
        if (r30.h() == false) goto L123;
        r30.t(r39);
    L123:
        if (r30.h() == false) goto L125;
        r30.t(r39);
    L125:
        if (r32 != 0) goto L133;
        if (r40 != 0) goto L133;
        r30.s();
        goto L133
    L106:
        r124 = 0;
        goto L107
    L135:
        if (r30.h() == false) goto L146;
        int r41 = 8;
        int r42 = ji2.G(r30, 2, 4, 8) + 1;
        int r43 = 0;
        byte[] r44 = null;
    L137:
        if (r43 >= r42) goto L147;
        int r45 = ji2.G(r30, 4, r41, 16);
        int r125 = ji2.G(r30, 4, r41, 16);
        if (r45 != 7) goto L144;
        int r46 = r30.i(4) + 1;
        r30.t(4);
        byte[] r47 = new byte[r46];
        int r126 = 0;
    L141:
        if (r126 >= r46) goto L143;
        r47[r126] = (byte) r30.i(r41);
        r126 = r126 + 1;
        goto L141
    L143:
        r44 = r47;
    L145:
        r43 = r43 + 1;
        r41 = 8;
        goto L137
    L144:
        r30.t(r125 * r41);
    L147:
        switch(r31) {
            case 14700: goto L152;
            case 16000: goto L152;
            case 22050: goto L153;
            case 24000: goto L153;
            case 29400: goto L151;
            case 32000: goto L151;
            case 44100: goto L150;
            case 48000: goto L150;
            case 58800: goto L151;
            case 64000: goto L151;
            case 88200: goto L150;
            case 96000: goto L150;
            default: goto L149;
        };
    L150:
        r210 = 1.0d;
        goto L153
    L151:
        r210 = 1.5d;
        goto L153
    L152:
        r210 = 3.0d;
    L153:
        this.q = (int) (((double) r31) * r210);
        this.r = (int) (((double) r117) * r210);
        long r48 = this.t;
        long r49 = r12.p;
        if (r48 == r49) goto L164;
        this.t = r49;
        String r50 = "mhm1";
        if (r113 == (-1)) goto L158;
        r50 = "mhm1".concat(String.format(".%02X", new Object[]{Integer.valueOf(r113)}));
    L158:
        if (r44 != null) goto L160;
    L162:
        gy3 r51 = null;
    L163:
        sb1 r52 = new sb1();
        r52.a = this.e;
        r52.l = lw2.m("video/mp2t");
        r52.m = lw2.m("audio/mhm1");
        r52.F = this.q;
        r52.j = r50;
        r52.p = r51;
        this.f.g(new tb1(r52));
        goto L164
    L160:
        if (r44.length <= 0) goto L162;
        r51 = yw1.p(f35.b, r44);
    L164:
        int r127 = 1;
        this.u = true;
    L182:
        this.d = r127;
        goto L4
    L149:
        throw ParserException.c("Unsupported sampling rate " + r31);
    L146:
        r44 = null;
        goto L147
    L70:
        throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + r115);
    L71:
        r32 = 3;
        goto L74
    L72:
        r32 = 2;
    L73:
        r32 = 0;
        goto L74
    L59:
        throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + r115);
    L60:
        r116 = 2048;
        goto L57
    L61:
        r116 = 1024;
        goto L57
    L62:
        r116 = 768;
        goto L57
    L21:
        switch(r114) {
            case 0: goto L49;
            case 1: goto L48;
            case 2: goto L47;
            case 3: goto L46;
            case 4: goto L45;
            case 5: goto L44;
            case 6: goto L43;
            case 7: goto L42;
            case 8: goto L41;
            case 9: goto L40;
            case 10: goto L39;
            case 11: goto L38;
            case 12: goto L37;
            case 13: goto L23;
            case 14: goto L23;
            case 15: goto L36;
            case 16: goto L35;
            case 17: goto L34;
            case 18: goto L33;
            case 19: goto L32;
            case 20: goto L31;
            case 21: goto L30;
            case 22: goto L29;
            case 23: goto L28;
            case 24: goto L27;
            case 25: goto L26;
            case 26: goto L25;
            case 27: goto L24;
            default: goto L23;
        };
    L24:
        r31 = 9600;
        goto L50
    L25:
        r31 = 12800;
        goto L50
    L26:
        r31 = 14400;
        goto L50
    L27:
        r31 = 17075;
        goto L50
    L28:
        r31 = 19200;
        goto L50
    L29:
        r31 = 20000;
        goto L50
    L30:
        r31 = 25600;
        goto L50
    L31:
        r31 = 28800;
        goto L50
    L32:
        r31 = 34150;
        goto L50
    L33:
        r31 = 38400;
        goto L50
    L34:
        r31 = 40000;
        goto L50
    L35:
        r31 = 51200;
        goto L50
    L36:
        r31 = 57600;
        goto L50
    L37:
        r31 = 7350;
        goto L50
    L38:
        r31 = 8000;
        goto L50
    L39:
        r31 = 11025;
        goto L50
    L40:
        r31 = 12000;
        goto L50
    L41:
        r31 = 16000;
        goto L50
    L42:
        r31 = 22050;
        goto L50
    L43:
        r31 = 24000;
        goto L50
    L44:
        r31 = 32000;
        goto L50
    L45:
        r31 = 44100;
        goto L50
    L46:
        r31 = 48000;
        goto L50
    L47:
        r31 = 64000;
        goto L50
    L48:
        r31 = 88200;
        goto L50
    L49:
        r31 = 96000;
        goto L50
    L23:
        throw ParserException.c("Unsupported sampling rate index " + r114);
    L165:
        if (r29 != 17) goto L172;
        byte[] r53 = r11.a;
        h00 r54 = new h00(r53.length, r53);
        if (r54.h() == false) goto L169;
        r54.t(2);
        int r55 = r54.i(13);
    L170:
        this.s = r55;
    L171:
        r127 = 1;
        goto L182
    L169:
        r55 = 0;
        goto L170
    L172:
        if (r29 != 2) goto L171;
        if (this.u == false) goto L176;
        this.j = false;
        int r56 = 1;
    L177:
        double r57 = (((double) (this.r - this.s)) * 1000000.0d) / ((double) this.q);
        long r58 = Math.round(this.g);
        if (this.i == false) goto L180;
        this.i = false;
        this.g = this.h;
    L181:
        this.f.a(r58, r56, this.o, 0, null);
        this.u = false;
        this.s = 0;
        this.o = 0;
        goto L171
    L180:
        this.g += r57;
        goto L181
    L176:
        r56 = 0;
    L13:
        int r59 = r24.b;
        int r128 = Math.min(r24.a(), r11.a());
        r24.k(r11.a, r11.b, r128);
        r11.O(r128);
        r24.N(r59);
        goto L14
    L183:
        tb4.a();
        return;
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
        this.t = -1;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9.223372036854776E18d;
        this.h = -9.223372036854776E18d;
    }

    @Override // defpackage.mz0
    public final void d(boolean r1) {
    }

    @Override // defpackage.mz0
    public final void e(int r3, long r4) {
        this.k = r3;
        if (this.j == true) goto L10;
        if (this.o == 0) goto L7;
    L8:
        this.i = true;
        goto L10
    L7:
        if (this.m == false) goto L8;
    L10:
        if (r4 != (-9223372036854775807L)) goto L12;
        return;
    L12:
        if (this.i == false) goto L15;
        this.h = r4;
        return;
    L15:
        this.g = r4;
    }

    @Override // defpackage.mz0
    public final void f(m51 r2, sy4 r3) {
        r3.a();
        r3.b();
        this.e = r3.e;
        r3.b();
        this.f = r2.t(r3.d, 1);
    }
}
