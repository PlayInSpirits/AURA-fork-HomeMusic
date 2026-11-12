package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s85 extends im4 {
    public ew4 n;
    public int o;
    public boolean p;
    public wy2 q;
    public c05 r;

    @Override // defpackage.im4
    public final void a(long r3) {
        this.g = r3;
        int r4 = 0;
        if (r3 == 0) goto L5;
        boolean r5 = true;
    L6:
        this.p = r5;
        wy2 r6 = this.q;
        if (r6 == null) goto L9;
        r4 = r6.e;
    L9:
        this.o = r4;
        return;
    L5:
        r5 = false;
        goto L6
    }

    @Override // defpackage.im4
    public final long b(be3 r12) {
        int r1 = 0;
        byte r0 = r12.a[0];
        if ((r0 & 1) != 1) goto L6;
        return -1;
    L6:
        ew4 r2 = this.n;
        r2.getClass();
        boolean r3 = ((ox1[]) r2.s)[(r0 >> 1) & (255 >>> (8 - r2.o))].o;
        wy2 r4 = (wy2) r2.p;
        if (r3 == true) goto L9;
        int r5 = r4.e;
    L11:
        if (this.p == false) goto L13;
        r1 = (this.o + r5) / 4;
    L13:
        long r6 = r1;
        byte[] r7 = r12.a;
        int r8 = r7.length;
        int r9 = r12.c + 4;
        if (r8 >= r9) goto L16;
        byte[] r10 = Arrays.copyOf(r7, r9);
        r12.L(r10.length, r10);
    L17:
        byte[] r11 = r12.a;
        int r13 = r12.c;
        r11[r13 - 4] = (byte) (r6 & 255);
        r11[r13 - 3] = (byte) ((r6 >>> 8) & 255);
        r11[r13 - 2] = (byte) ((r6 >>> 16) & 255);
        r11[r13 - 1] = (byte) ((r6 >>> 24) & 255);
        this.p = true;
        this.o = r5;
        return r6;
    L16:
        r12.M(r9);
        goto L17
    L9:
        r5 = r4.f;
        goto L11
    }

    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [byte[], java.io.Serializable, java.lang.Object] */
    @Override // defpackage.im4
    public final boolean c(be3 r25, long r26, rf2 r28) {
        if (this.n == null) goto L6;
        ((tb1) r28.n).getClass();
        return false;
    L6:
        wy2 r6 = this.q;
        int r5 = 4;
        int r7 = -1;
        if (r6 != null) goto L17;
        zz1.N(1, r25, false);
        r25.s();
        int r4 = r25.A();
        int r8 = r25.s();
        int r9 = r25.o();
        if (r9 > 0) goto L11;
        r9 = -1;
    L11:
        int r10 = r25.o();
        if (r10 <= 0) goto L15;
        r7 = r10;
    L15:
        r25.o();
        int r11 = r25.A();
        int r12 = (int) Math.pow(2.0d, r11 & 15);
        int r13 = (int) Math.pow(2.0d, (r11 & 240) >> 4);
        r25.A();
        ?? r1 = Arrays.copyOf(r25.a, r25.c);
        wy2 r14 = new wy2();
        r14.a = r4;
        r14.b = r8;
        r14.c = r9;
        r14.d = r7;
        r14.e = r12;
        r14.f = r13;
        r14.g = r1;
        this.q = r14;
    L16:
        ew4 r15 = null;
    L164:
        this.n = r15;
        if (r15 != null) goto L168;
        return true;
    L168:
        wy2 r0 = (wy2) r15.p;
        ArrayList r2 = new ArrayList();
        r2.add((byte[]) r0.g);
        r2.add((byte[]) r15.r);
        qv2 r3 = zz1.w(yw1.l((String[]) ((c05) r15.q).n));
        sb1 r16 = new sb1();
        r16.l = lw2.m("audio/ogg");
        r16.m = lw2.m("audio/vorbis");
        r16.h = r0.d;
        r16.i = r0.c;
        r16.E = r0.a;
        r16.F = r0.b;
        r16.p = r2;
        r16.k = r3;
        r28.n = new tb1(r16);
        return true;
    L17:
        c05 r17 = this.r;
        if (r17 != null) goto L20;
        this.r = zz1.C(r25, true, true);
        goto L16
    L20:
        int r18 = r25.c;
        ?? r19 = new byte[r18];
        System.arraycopy(r25.a, 0, r19, 0, r18);
        int r20 = r6.a;
        int r110 = 5;
        zz1.N(5, r25, false);
        int r111 = r25.A() + 1;
        h00 r112 = new h00(r25.a);
        int r113 = 8;
        r112.t(r25.b * 8);
        int r21 = 0;
    L21:
        int r114 = 16;
        if (r21 >= r111) goto L58;
        int r27 = r113;
        if (r112.i(24) != 5653314) goto L57;
        int r22 = r112.i(16);
        int r23 = r112.i(24);
        if (r112.h() == true) goto L35;
        boolean r115 = r112.h();
        int r116 = 0;
    L28:
        if (r116 >= r23) goto L41;
        if (r115 == true) goto L31;
        r112.t(r110);
    L34:
        r116 = r116 + 1;
        goto L28
    L31:
        if (r112.h() == false) goto L34;
        r112.t(r110);
    L41:
        int r117 = r112.i(4);
        if (r117 > 2) goto L55;
        if (r117 == 1) goto L46;
        if (r117 == 2) goto L46;
    L53:
        r21 = r21 + 1;
        r113 = r27;
        r110 = 5;
    L46:
        r112.t(32);
        r112.t(32);
        int r118 = r112.i(4) + 1;
        r112.t(1);
        if (r117 != 1) goto L51;
        if (r22 == 0) goto L50;
        long r24 = (long) Math.floor(Math.pow(r23, 1.0d / ((double) r22)));
    L52:
        r112.t((int) (r24 * ((long) r118)));
        goto L53
    L50:
        r24 = 0;
        goto L52
    L51:
        r24 = r22 * ((long) r23);
        goto L52
    L55:
        throw ParserException.a(null, "lookup type greater than 2 not decodable: " + r117);
    L35:
        r112.t(r110);
        int r119 = 0;
    L36:
        if (r119 >= r23) goto L41;
        int r120 = r23 - r119;
        int r121 = 0;
    L38:
        if (r120 <= 0) goto L40;
        r121 = r121 + 1;
        r120 = r120 >>> 1;
        goto L38
    L40:
        r119 = r119 + r112.i(r121);
        goto L36
    L57:
        throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((r112.d * 8) + r112.e));
    L58:
        int r29 = r113;
        int r30 = 6;
        int r31 = r112.i(6) + 1;
        int r122 = 0;
    L59:
        if (r122 >= r31) goto L65;
        if (r112.i(16) != 0) goto L64;
        r122 = r122 + 1;
        goto L59
    L64:
        throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
    L65:
        int r123 = 1;
        int r32 = r112.i(6) + 1;
        int r124 = 0;
    L66:
        int r125 = 3;
        if (r124 >= r32) goto L99;
        int r33 = r112.i(r114);
        if (r33 == 0) goto L95;
        if (r33 != r123) goto L94;
        int r34 = r112.i(5);
        int[] r126 = new int[r34];
        int r35 = 0;
        int r127 = -1;
    L72:
        if (r35 >= r34) goto L77;
        int r128 = r112.i(r5);
        r126[r35] = r128;
        if (r128 <= r127) goto L76;
        r127 = r128;
    L76:
        r35 = r35 + 1;
        goto L72
    L77:
        int r129 = r127 + 1;
        int[] r36 = new int[r129];
        int r130 = 0;
    L78:
        if (r130 >= r129) goto L87;
        int r131 = 1;
        r36[r130] = r112.i(r125) + 1;
        int r210 = r112.i(2);
        int r132 = r29;
        if (r210 <= 0) goto L82;
        r112.t(r132);
    L82:
        int[] r211 = r36;
        int r37 = 0;
    L84:
        if (r37 >= (r131 << r210)) goto L86;
        r112.t(r132);
        r37 = r37 + 1;
        r132 = 8;
        r131 = 1;
        goto L84
    L86:
        r130 = r130 + 1;
        r36 = r211;
        r29 = 8;
        r125 = 3;
        goto L78
    L87:
        int[] r212 = r36;
        r112.t(2);
        int r38 = r112.i(4);
        int r39 = 0;
        int r133 = 0;
        int r134 = 0;
    L88:
        if (r39 >= r34) goto L98;
        r133 = r133 + r212[r126[r39]];
    L90:
        if (r134 >= r133) goto L92;
        r112.t(r38);
        r134 = r134 + 1;
        goto L90
    L92:
        r39 = r39 + 1;
    L98:
        r124 = r124 + 1;
        r29 = 8;
        r30 = 6;
        r5 = 4;
        r114 = 16;
        r123 = 1;
        goto L66
    L94:
        throw ParserException.a(null, "floor type greater than 1 not decodable: " + r33);
    L95:
        int r135 = r29;
        r112.t(r135);
        r112.t(16);
        r112.t(16);
        r112.t(6);
        r112.t(r135);
        int r40 = r112.i(4) + 1;
        int r41 = 0;
    L96:
        if (r41 >= r40) goto L98;
        r112.t(r135);
        r41 = r41 + 1;
        r135 = 8;
        goto L96
    L99:
        int r42 = r112.i(r30) + 1;
        int r43 = 0;
    L100:
        if (r43 >= r42) goto L122;
        if (r112.i(16) > 2) goto L121;
        r112.t(24);
        r112.t(24);
        r112.t(24);
        int r136 = r112.i(r30) + 1;
        int r137 = 8;
        r112.t(8);
        int[] r44 = new int[r136];
        int r138 = 0;
    L104:
        if (r138 >= r136) goto L110;
        int r139 = r112.i(3);
        if (r112.h() == false) goto L108;
        int r140 = r112.i(5);
    L109:
        r44[r138] = (r140 * 8) + r139;
        r138 = r138 + 1;
        goto L104
    L108:
        r140 = 0;
        goto L109
    L110:
        int r141 = 0;
    L111:
        if (r141 >= r136) goto L119;
        int r142 = 0;
    L113:
        if (r142 >= r137) goto L118;
        if ((r44[r141] & (1 << r142)) == 0) goto L117;
        r112.t(r137);
    L117:
        r142 = r142 + 1;
        r137 = 8;
        goto L113
    L118:
        r141 = r141 + 1;
        r137 = 8;
        goto L111
    L119:
        r43 = r43 + 1;
        r30 = 6;
        goto L100
    L121:
        throw ParserException.a(null, "residueType greater than 2 is not decodable");
    L122:
        int r45 = r112.i(r30) + 1;
        int r46 = 0;
    L123:
        if (r46 >= r45) goto L155;
        int r47 = r112.i(16);
        if (r47 == 0) goto L128;
        l93.F("VorbisUtil", "mapping type other than 0 not supported: " + r47);
    L152:
        r46 = r46 + 1;
        goto L123
    L128:
        if (r112.h() == false) goto L130;
        int r48 = r112.i(4) + 1;
    L132:
        if (r112.h() == false) goto L143;
        int r49 = r112.i(8) + 1;
        int r143 = 0;
    L134:
        if (r143 >= r49) goto L143;
        int r144 = r20 - 1;
        int r145 = r144;
        int r146 = 0;
    L136:
        if (r145 <= 0) goto L138;
        r146 = r146 + 1;
        r145 = r145 >>> 1;
        goto L136
    L138:
        r112.t(r146);
        int r147 = 0;
    L139:
        if (r144 <= 0) goto L141;
        r147 = r147 + 1;
        r144 = r144 >>> 1;
        goto L139
    L141:
        r112.t(r147);
        r143 = r143 + 1;
    L143:
        if (r112.i(2) != 0) goto L154;
        if (r48 <= 1) goto L149;
        int r50 = 0;
    L147:
        if (r50 >= r20) goto L149;
        r112.t(4);
        r50 = r50 + 1;
    L149:
        int r51 = 0;
    L150:
        if (r51 >= r48) goto L152;
        r112.t(8);
        r112.t(8);
        r112.t(8);
        r51 = r51 + 1;
        goto L150
    L154:
        throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
    L130:
        r48 = 1;
        goto L132
    L155:
        int r52 = r112.i(6);
        int r53 = r52 + 1;
        ox1[] r54 = new ox1[r53];
        int r55 = 0;
    L156:
        if (r55 >= r53) goto L159;
        boolean r56 = r112.h();
        r112.i(16);
        r112.i(16);
        r112.i(8);
        r54[r55] = new ox1(2, r56);
        r55 = r55 + 1;
        goto L156
    L159:
        if (r112.h() == false) goto L171;
        int r148 = 0;
    L161:
        if (r52 <= 0) goto L163;
        r148 = r148 + 1;
        r52 = r52 >>> 1;
        goto L161
    L163:
        r15 = new ew4(r6, r17, r19, r54, r148, 7);
        goto L164
    L171:
        throw ParserException.a(null, "framing bit after modes not set as expected");
    }

    @Override // defpackage.im4
    public final void d(boolean r1) {
        super.d(r1);
        if (r1 == false) goto L5;
        this.n = null;
        this.q = null;
        this.r = null;
    L5:
        this.o = 0;
        this.p = false;
    }
}
