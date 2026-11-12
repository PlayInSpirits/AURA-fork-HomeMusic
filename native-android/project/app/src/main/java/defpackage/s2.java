package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements mz0 {
    public final /* synthetic */ int a;
    public final h00 b;
    public final be3 c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public wv4 h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public tb1 m;
    public int n;
    public long o;

    public s2(int r6, int r7, String r8, String r9) {
        this.a = r7;
        switch(r7) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        h00 r10 = new h00(128, new byte[128]);
        this.b = r10;
        this.c = new be3(r10.b);
        this.i = 0;
        this.o = -9223372036854775807L;
        this.d = r8;
        this.e = r6;
        this.f = r9;
        return;
    L6:
        h00 r11 = new h00(16, new byte[16]);
        this.b = r11;
        this.c = new be3(r11.b);
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.o = -9223372036854775807L;
        this.d = r8;
        this.e = r6;
        this.f = r9;
    }

    private final void b(boolean r1) {
    }

    private final void g(boolean r1) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mz0
    public final void a(be3 r31) {
        r31 = r31;
        int r2 = this.a;
        int r5 = this.e;
        String r6 = this.d;
        String r7 = this.f;
        h00 r8 = this.b;
        long r9 = -9223372036854775807L;
        int r11 = 0;
        int r12 = 1;
        int r13 = 2;
        be3 r14 = this.c;
        int r15 = 16;
        switch(r2) {
            case 0: goto L57;
            default: goto L4;
        };
    L4:
        this.h.getClass();
    L6:
        if (r31.a() <= 0) goto L56;
        int r3 = this.i;
        if (r3 == 0) goto L32;
        if (r3 == 1) goto L20;
        if (r3 != 2) goto L6;
        int r4 = Math.min(r31.a(), this.n - this.j);
        this.h.e(r4, r31);
        int r10 = this.j + r4;
        this.j = r10;
        if (r10 != this.n) goto L6;
        if (this.o == r9) goto L17;
        boolean r16 = true;
    L18:
        rr2.w(r16);
        long r25 = r9;
        this.h.a(this.o, 1, this.n, 0, null);
        this.o += this.l;
        this.i = 0;
    L19:
        r9 = r25;
        goto L6
    L17:
        r16 = false;
        goto L18
    L20:
        r25 = r9;
        byte[] r17 = r14.a;
        int r18 = Math.min(r31.a(), 16 - this.j);
        r31.k(r17, this.j, r18);
        int r19 = this.j + r18;
        this.j = r19;
        if (r19 != 16) goto L19;
        r8.q(0);
        v2 r20 = hw.D(r8);
        int r21 = r20.a;
        tb1 r22 = this.m;
        if (r22 != null) goto L25;
    L30:
        sb1 r23 = new sb1();
        r23.a = this.g;
        r23.l = lw2.m(r7);
        r23.m = lw2.m("audio/ac4");
        r23.E = 2;
        r23.F = r21;
        r23.d = r6;
        r23.f = r5;
        tb1 r24 = new tb1(r23);
        this.m = r24;
        this.h.g(r24);
    L31:
        this.n = r20.b;
        this.l = (((long) r20.c) * 1000000) / ((long) this.m.G);
        r14.N(0);
        this.h.e(16, r14);
        this.i = 2;
        goto L19
    L25:
        if (2 != r22.F) goto L30;
        if (r21 != r22.G) goto L30;
        if ("audio/ac4".equals(r22.n) == true) goto L31;
    L32:
        r25 = r9;
    L34:
        if (r31.a() <= 0) goto L19;
        if (this.k == false) goto L38;
        int r26 = r31.A();
        if (r26 != 172) goto L45;
        boolean r27 = true;
    L46:
        this.k = r27;
        int r28 = 64;
        if (r26 == 64) goto L49;
        if (r26 != 65) goto L34;
    L49:
        if (r26 != 65) goto L51;
        Object[] r29 = true;
    L52:
        this.i = 1;
        byte[] r30 = r14.a;
        r30[0] = -84;
        if (r29 == false) goto L55;
        r28 = 65;
    L55:
        r30[1] = (byte) r28;
        this.j = 2;
        goto L19
    L51:
        r29 = false;
        goto L52
    L45:
        r27 = false;
        goto L46
    L38:
        if (r31.A() != 172) goto L40;
        boolean r32 = true;
    L41:
        this.k = r32;
        goto L34
    L40:
        r32 = false;
        goto L41
    L56:
        return;
    L57:
        this.h.getClass();
    L59:
        if (r31.a() <= 0) goto L298;
        int r33 = this.i;
        if (r33 == 0) goto L281;
        if (r33 != r12) goto L63;
        byte[] r34 = r14.a;
        int r35 = Math.min(r31.a(), 128 - this.j);
        r31.k(r34, this.j, r35);
        int r36 = this.j + r35;
        this.j = r36;
        if (r36 == 128) goto L74;
        r31 = r31;
        goto L59
    L74:
        r8.q(r11);
        int[] r37 = fu.q;
        int[] r38 = fu.o;
        int r39 = r8.g();
        r8.t(40);
        if (r8.i(5) <= 10) goto L77;
        int r110 = r12;
    L78:
        r8.q(r39);
        int r210 = -1;
        if (r110 == 0) goto L245;
        r8.t(r15);
        int r111 = r8.i(r13);
        if (r111 == 0) goto L87;
        if (r111 == r12) goto L86;
        if (r111 == r13) goto L85;
        int r112 = -1;
    L88:
        r8.t(3);
        int r40 = (r8.i(11) + r12) * r13;
        int r113 = r8.i(r13);
        if (r113 != 3) goto L91;
        int r41 = fu.p[r8.i(r13)];
        int r211 = 3;
        int r114 = 6;
    L92:
        int r115 = r114 * 256;
        int r212 = (r40 * r41) / (r114 * 32);
        int r1 = r8.i(3);
        boolean r213 = r8.h();
        int r42 = r37[r1] + (r213 ? 1 : 0);
        r8.t(10);
        if (r8.h() == false) goto L96;
        r8.t(8);
    L96:
        if (r1 != 0) goto L101;
        r8.t(5);
        if (r8.h() == false) goto L101;
        r8.t(8);
    L101:
        if (r112 != 1) goto L107;
        if (r8.h() == false) goto L107;
        r8.t(16);
    L107:
        if (r8.h() == true) goto L109;
    L204:
        int r214 = r42;
        int r116 = r211;
    L206:
        if (r8.h() == false) goto L224;
        r8.t(5);
        if (r1 != 2) goto L211;
        r8.t(4);
    L211:
        if (r1 < 6) goto L214;
        r8.t(2);
    L214:
        if (r8.h() == false) goto L216;
        int r43 = 8;
        r8.t(8);
    L217:
        if (r1 == 0) goto L219;
    L221:
        int r44 = 3;
        if (r113 >= 3) goto L225;
        r8.s();
    L225:
        if (r112 != 0) goto L229;
        if (r116 == r44) goto L229;
        r8.s();
    L229:
        if (r112 != 2) goto L234;
        if (r116 != r44) goto L232;
    L233:
        int r117 = 6;
        r8.t(6);
    L237:
        if (r8.h() == true) goto L239;
    L243:
        String r45 = "audio/eac3";
    L244:
        int r118 = r212;
        int r46 = r214;
    L265:
        tb1 r119 = this.m;
        if (r119 != null) goto L268;
    L273:
        sb1 r120 = new sb1();
        r120.a = this.g;
        r120.l = lw2.m(r7);
        r120.m = lw2.m(r45);
        r120.E = r46;
        r120.F = r41;
        r120.d = r6;
        r120.f = r5;
        r120.i = r118;
        if ("audio/ac3".equals(r45) == false) goto L276;
        r120.h = r118;
    L276:
        tb1 r47 = new tb1(r120);
        this.m = r47;
        this.h.g(r47);
    L277:
        this.n = r40;
        this.l = (((long) r115) * 1000000) / ((long) this.m.G);
        r14.N(0);
        this.h.e(128, r14);
        this.i = 2;
        r13 = 2;
        r11 = 0;
        r12 = 1;
    L278:
        r15 = 16;
        goto L59
    L268:
        if (r46 != r119.F) goto L273;
        if (r41 != r119.G) goto L273;
        if (Objects.equals(r45, r119.n) == true) goto L277;
    L239:
        if (r8.i(r117) != 1) goto L243;
        if (r8.i(8) != 1) goto L243;
        r45 = "audio/eac3-joc";
        goto L244
    L232:
        if (r8.h() == true) goto L233;
    L234:
        r117 = 6;
        goto L237
    L219:
        if (r8.h() == false) goto L221;
        r8.t(r43);
        goto L221
    L216:
        r43 = 8;
        goto L217
    L224:
        r44 = 3;
        goto L225
    L109:
        if (r1 <= 2) goto L112;
        r8.t(2);
    L112:
        if ((r1 & 1) == 0) goto L115;
        if (r1 <= 2) goto L115;
        int r121 = 6;
        r8.t(6);
    L117:
        if ((r1 & 4) == 0) goto L119;
        r8.t(r121);
    L119:
        if (r213 == true) goto L121;
    L123:
        if (r112 != 0) goto L204;
        if (r8.h() == false) goto L127;
        int r122 = 6;
        r8.t(6);
    L128:
        if (r1 != 0) goto L133;
        if (r8.h() == false) goto L133;
        r8.t(r122);
    L133:
        if (r8.h() == false) goto L135;
        r8.t(r122);
    L135:
        r214 = r42;
        int r48 = r8.i(2);
        if (r48 != 1) goto L140;
        r8.t(5);
    L138:
        int r123 = 2;
    L185:
        if (r1 < r123) goto L187;
    L193:
        r116 = r211;
        if (r8.h() == false) goto L206;
        if (r116 != 0) goto L197;
        r8.t(5);
        goto L206
    L197:
        int r49 = 0;
    L198:
        if (r49 >= r114) goto L206;
        if (r8.h() == false) goto L203;
        r8.t(5);
    L203:
        r49 = r49 + 1;
        goto L198
    L187:
        if (r8.h() == false) goto L189;
        r8.t(14);
    L189:
        if (r1 != 0) goto L193;
        if (r8.h() == false) goto L193;
        r8.t(14);
        goto L193
    L140:
        if (r48 != 2) goto L143;
        r8.t(12);
        goto L138
    L143:
        if (r48 != 3) goto L138;
        int r50 = r8.i(5);
        if (r8.h() == false) goto L177;
        r8.t(5);
        if (r8.h() == false) goto L149;
        int r124 = 4;
        r8.t(4);
    L151:
        if (r8.h() == false) goto L154;
        r8.t(r124);
    L154:
        if (r8.h() == false) goto L157;
        r8.t(r124);
    L157:
        if (r8.h() == false) goto L160;
        r8.t(r124);
    L160:
        if (r8.h() == false) goto L163;
        r8.t(r124);
    L163:
        if (r8.h() == false) goto L166;
        r8.t(r124);
    L166:
        if (r8.h() == false) goto L169;
        r8.t(r124);
    L169:
        if (r8.h() == false) goto L177;
        if (r8.h() == false) goto L174;
        r8.t(r124);
    L174:
        if (r8.h() == false) goto L177;
        r8.t(r124);
        goto L177
    L149:
        r124 = 4;
    L177:
        if (r8.h() == false) goto L183;
        r8.t(5);
        if (r8.h() == false) goto L183;
        r8.t(7);
        if (r8.h() == false) goto L183;
        r8.t(8);
        r123 = 2;
    L184:
        r8.t((r50 + r123) * 8);
        r8.c();
    L183:
        r123 = 2;
        goto L184
    L127:
        r122 = 6;
        goto L128
    L121:
        if (r8.h() == false) goto L123;
        r8.t(5);
    L115:
        r121 = 6;
        goto L117
    L91:
        int r215 = r8.i(r13);
        int r216 = fu.n[r215];
        r41 = r38[r113];
        r211 = r215;
        r114 = r216;
        goto L92
    L85:
        r112 = r13;
        goto L88
    L86:
        r112 = r12;
        goto L88
    L87:
        r112 = 0;
        goto L88
    L245:
        r8.t(32);
        int r51 = r8.i(2);
        if (r51 != 3) goto L249;
        String r52 = null;
    L250:
        int r125 = r8.i(6);
        r118 = fu.r[r125 / 2] * 1000;
        int r126 = fu.t(r51, r125);
        r8.t(8);
        int r127 = r8.i(3);
        if ((r127 & 1) != 0) goto L253;
    L255:
        int r128 = 2;
    L257:
        if ((r127 & 4) == 0) goto L259;
        r8.t(r128);
    L259:
        if (r127 != r128) goto L262;
        r8.t(r128);
    L262:
        if (r51 >= 3) goto L264;
        r210 = r38[r51];
    L264:
        r46 = r37[r127] + (r8.h() ? 1 : 0);
        r115 = 1536;
        r45 = r52;
        r40 = r126;
        r41 = r210;
        goto L265
    L253:
        if (r127 == 1) goto L255;
        r128 = 2;
        r8.t(2);
        goto L257
    L249:
        r52 = "audio/ac3";
        goto L250
    L77:
        r110 = 0;
        goto L78
    L63:
        if (r33 != r13) goto L59;
        int r53 = Math.min(r31.a(), this.n - this.j);
        this.h.e(r53, r31);
        int r54 = this.j + r53;
        this.j = r54;
        if (r54 != this.n) goto L59;
        if (this.o == (-9223372036854775807L)) goto L70;
        boolean r55 = r12;
    L71:
        rr2.w(r55);
        this.h.a(this.o, 1, this.n, 0, null);
        this.o += this.l;
        this.i = r11;
        goto L59
    L70:
        r55 = r11;
    L281:
        if (r31.a() <= 0) goto L297;
        if (this.k == false) goto L285;
        int r56 = r31.A();
        if (r56 == 119) goto L291;
        if (r56 != 11) goto L295;
        boolean r57 = true;
    L296:
        this.k = r57;
        goto L281
    L295:
        r57 = false;
        goto L296
    L291:
        this.k = false;
        r12 = 1;
        this.i = 1;
        byte[] r58 = r14.a;
        r58[0] = 11;
        r58[1] = 119;
        this.j = 2;
        r13 = 2;
        r11 = 0;
        goto L278
    L285:
        if (r31.A() != 11) goto L287;
        boolean r129 = true;
    L288:
        this.k = r129;
        goto L281
    L287:
        r129 = false;
        goto L288
    L297:
        r11 = 0;
        r12 = 1;
        r13 = 2;
        goto L278
    }

    @Override // defpackage.mz0
    public final void c() {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.o = -9223372036854775807L;
        return;
    L6:
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.o = -9223372036854775807L;
    }

    @Override // defpackage.mz0
    public final void d(boolean r1) {
        int r0 = this.a;
    }

    @Override // defpackage.mz0
    public final void e(int r1, long r2) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.o = r2;
        return;
    L6:
        this.o = r2;
    }

    @Override // defpackage.mz0
    public final void f(m51 r3, sy4 r4) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r4.a();
        r4.b();
        this.g = r4.e;
        r4.b();
        this.h = r3.t(r4.d, 1);
        return;
    L6:
        r4.a();
        r4.b();
        this.g = r4.e;
        r4.b();
        this.h = r3.t(r4.d, 1);
    }

    public s2(String r3) {
        this.a = 0;
        this(0, 0, null, r3);
    }
}
