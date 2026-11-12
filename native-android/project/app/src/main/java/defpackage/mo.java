package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mo extends i90 {
    public static final /* synthetic */ int J = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public char H;
    public lo I;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final cx s;
    public int t;
    public qs u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public mo(ByteArrayInputStream r5) {
        cx r0 = new cx();
        r0.a = -1;
        this.s = r0;
        this.v = 1;
        InputStream r6 = r5;
        if (r5 != System.in) goto L5;
        r6 = new f40(r5);
    L5:
        this.u = new qs(r6, ByteOrder.BIG_ENDIAN);
        qs r7 = this.u;
        if (r7 == null) goto L21;
        int r8 = (int) r7.b(8);
        int r1 = (int) this.u.b(8);
        int r2 = (int) this.u.b(8);
        if (r8 != 66) goto L20;
        if (r1 != 90) goto L20;
        if (r2 != 104) goto L20;
        int r9 = (int) this.u.b(8);
        if (r9 >= 49) goto L16;
    L18:
        mj0.i("BZip2 block size is invalid");
    L22:
        q();
        return;
    L16:
        if (r9 > 57) goto L18;
        this.q = r9 - 48;
        this.y = 0;
    L20:
        throw new IOException("Stream is not in the BZip2 format");
    L21:
        mj0.i("No InputStream");
        goto L22
    }

    public static int f(qs r2, int r3) {
        long r4 = r2.b(r3);
        if (r4 >= 0) goto L5;
        mj0.i("Unexpected end of stream");
        return 0;
    L5:
        return (int) r4;
    }

    public static void j(String r1, int r2, int r3) {
        if (r2 < 0) goto L8;
        if (r2 >= r3) goto L6;
        return;
    L6:
        mj0.i(xa3.h("Corrupted input, ", r1, " value too big"));
        return;
    L8:
        mj0.i(xa3.h("Corrupted input, ", r1, " value negative"));
    }

    public final int F() {
        if (this.D >= this.H) goto L6;
        int r0 = this.A;
        this.s.j(r0);
        this.D++;
        this.v = 7;
        return r0;
    L6:
        this.C++;
        this.z = 0;
        return v();
    }

    public final int H() {
        if (this.C > this.o) goto L15;
        this.B = this.A;
        lo r0 = this.I;
        byte[] r1 = (byte[]) r0.f;
        int r2 = this.G;
        int r3 = r1[r2] & 255;
        j("su_tPos", r2, ((int[]) r0.j).length);
        this.G = ((int[]) this.I.j)[this.G];
        int r4 = this.E;
        int r5 = 0;
        if (r4 != 0) goto L9;
        int r6 = this.F;
        this.E = j51.g[r6] - 1;
        int r7 = r6 + 1;
        this.F = r7;
        if (r7 != 512) goto L11;
        this.F = 0;
    L11:
        if (this.E != 1) goto L13;
        r5 = 1;
    L13:
        int r8 = r3 ^ r5;
        this.A = r8;
        this.C++;
        this.v = 3;
        this.s.j(r8);
        return r8;
    L9:
        this.E = r4 - 1;
        goto L11
    L15:
        n();
        q();
        return u();
    }

    public final int J() {
        if (this.D >= this.H) goto L6;
        this.s.j(this.A);
        this.D++;
        return this.A;
    L6:
        this.v = 2;
        this.C++;
        this.z = 0;
        return H();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qs r0 = this.u;
        if (r0 != null) goto L12;
        return;
    L12:
        r0.close();     // Catch: Throwable -> L8
        this.I = null;
        this.u = null;
        return;
    L8:
        th = move-exception;
        this.I = null;
        this.u = null;
        throw th;
    }

    public final void n() {
        int r0 = ~this.s.a;
        int r1 = this.w;
        if (r1 != r0) goto L6;
        int r2 = this.y;
        int r3 = r2 << 1;
        this.y = r0 ^ ((r2 >>> 31) | r3);
        return;
    L6:
        int r4 = this.x;
        int r5 = r4 << 1;
        this.y = ((r4 >>> 31) | r5) ^ r1;
        mj0.i("BZip2 CRC error");
    }

    public final void q() {
        qs r1 = this.u;
        char r3 = (char) f(r1, 8);
        char r4 = (char) f(r1, 8);
        char r5 = (char) f(r1, 8);
        char r6 = (char) f(r1, 8);
        char r7 = (char) f(r1, 8);
        char r2 = (char) f(r1, 8);
        char r10 = 0;
        if (r3 != 23) goto L21;
        if (r4 != 'r') goto L21;
        if (r5 != 'E') goto L21;
        if (r6 != '8') goto L21;
        if (r7 != 'P') goto L21;
        if (r2 != 144) goto L21;
        int r8 = f(this.u, 32);
        this.x = r8;
        this.v = 0;
        this.I = null;
        if (r8 != this.y) goto L18;
        return;
    L18:
        mj0.i("BZip2 CRC error");
        return;
    L21:
        if (r3 == '1') goto L23;
    L199:
        this.v = 0;
        mj0.i("Bad block header");
        return;
    L23:
        if (r4 != 'A') goto L199;
        if (r5 != 'Y') goto L199;
        if (r6 != '&') goto L199;
        if (r7 != 'S') goto L199;
        if (r2 != 'Y') goto L199;
        this.w = f(r1, 32);
        int r9 = 1;
        if (f(r1, 1) != 1) goto L34;
        boolean r11 = true;
    L35:
        this.r = r11;
        if (this.I != null) goto L38;
        this.I = new lo(this.q);
    L38:
        qs r12 = this.u;
        this.p = f(r12, 24);
        qs r13 = this.u;
        lo r14 = this.I;
        boolean[] r15 = (boolean[]) r14.a;
        byte[] r16 = (byte[]) r14.e;
        byte[] r17 = (byte[]) r14.c;
        byte[] r18 = (byte[]) r14.d;
        int r19 = 0;
        int r110 = 0;
    L40:
        if (r19 >= 16) goto L45;
        if (f(r13, 1) == 0) goto L44;
        r110 = r110 | (1 << r19);
    L44:
        r19 = r19 + 1;
        goto L40
    L45:
        Arrays.fill(r15, false);
        int r111 = 0;
    L46:
        if (r111 >= 16) goto L56;
        if ((r110 & (1 << r111)) == 0) goto L55;
        int r112 = r111 << 4;
        int r20 = 0;
    L50:
        if (r20 >= 16) goto L55;
        if (f(r13, 1) == 0) goto L54;
        r15[r112 + r20] = true;
    L54:
        r20 = r20 + 1;
    L55:
        r111 = r111 + 1;
        goto L46
    L56:
        lo r21 = this.I;
        boolean[] r22 = (boolean[]) r21.a;
        byte[] r23 = (byte[]) r21.b;
        int r113 = 0;
        int r114 = 0;
    L58:
        if (r113 >= 256) goto L64;
        if (r22[r113] == false) goto L63;
        r23[r114] = (byte) r113;
        r114 = r114 + 1;
    L63:
        r113 = r113 + 1;
        r10 = r10;
        goto L58
    L64:
        char r115 = r10;
        this.t = r114;
        int r116 = r114 + 2;
        int r24 = f(r13, 3);
        int r25 = f(r13, 15);
        if (r25 < 0) goto L197;
        j("alphaSize", r116, 259);
        j("nGroups", r24, 7);
        int r117 = r115;
    L68:
        if (r117 >= r25) goto L76;
        int r118 = r115;
    L71:
        if (f(r13, 1) == 0) goto L73;
        r118 = r118 + 1;
        goto L71
    L73:
        if (r117 >= 18002) goto L75;
        r18[r117] = (byte) r118;
    L75:
        r117 = r117 + 1;
        goto L68
    L76:
        if (r25 <= 18002) goto L78;
        r25 = 18002;
    L78:
        int r119 = r24;
    L79:
        r119 = r119 - 1;
        if (r119 < 0) goto L82;
        r16[r119] = (byte) r119;
        goto L79
    L82:
        int r120 = r115;
    L84:
        if (r120 >= r25) goto L89;
        int r121 = r18[r120] & 255;
        j("selectorMtf", r121, 6);
        byte r122 = r16[r121];
    L86:
        if (r121 <= 0) goto L88;
        r16[r121] = r16[r121 - 1];
        r121 = r121 - 1;
        goto L86
    L88:
        r16[r115] = r122;
        r17[r120] = r122;
        r120 = r120 + 1;
        goto L84
    L89:
        char[][] r26 = (char[][]) r14.o;
        int r27 = r115;
    L90:
        if (r27 >= r24) goto L102;
        int r28 = f(r13, 5);
        char[] r29 = r26[r27];
        int r123 = r115;
    L92:
        if (r123 >= r116) goto L101;
    L94:
        if (f(r13, 1) == 0) goto L100;
        if (f(r13, 1) == 0) goto L98;
        int r124 = -1;
    L99:
        r28 = r28 + r124;
        goto L94
    L98:
        r124 = 1;
        goto L99
    L100:
        r29[r123] = (char) r28;
        r123 = r123 + 1;
        goto L92
    L101:
        r27 = r27 + 1;
        goto L90
    L102:
        lo r30 = this.I;
        char[][] r31 = (char[][]) r30.o;
        int[] r32 = (int[]) r30.h;
        int[][] r33 = (int[][]) r30.k;
        int[][] r34 = (int[][]) r30.l;
        int[][] r35 = (int[][]) r30.m;
        int r125 = r115;
    L103:
        if (r125 >= r24) goto L139;
        char[] r126 = r31[r125];
        int r210 = r9;
        int r211 = r116;
        char r127 = r115;
        char r36 = ' ';
    L105:
        r211 = r211 - 1;
        if (r211 < 0) goto L113;
        char r128 = r126[r211];
        if (r128 <= r127) goto L110;
        r127 = r128;
    L110:
        if (r128 >= r36) goto L105;
        r36 = r128;
        goto L105
    L113:
        int[] r129 = r33[r125];
        int[] r130 = r34[r125];
        int[] r212 = r35[r125];
        char[] r213 = r31[r125];
        int r37 = r36;
        int r214 = r115;
    L114:
        if (r37 > r127) goto L122;
        int r131 = r115;
    L116:
        if (r131 >= r116) goto L121;
        char r215 = r36;
        if (r213[r131] != r37) goto L120;
        r212[r214] = r131;
        r214 = r214 + 1;
    L120:
        r131 = r131 + 1;
        r36 = r215;
        goto L116
    L121:
        r37 = r37 + 1;
        goto L114
    L122:
        char r216 = r36;
        int r38 = 23;
    L123:
        r38 = r38 - 1;
        if (r38 <= 0) goto L126;
        r130[r38] = r115;
        r129[r38] = r115;
        goto L123
    L126:
        int r39 = r115;
    L127:
        if (r39 >= r116) goto L129;
        char r40 = r213[r39];
        j("length", r40, 258);
        int r41 = r40 + 1;
        r130[r41] = r130[r41] + 1;
        r39 = r39 + 1;
        goto L127
    L129:
        int r42 = r130[r115];
        int r43 = r210;
    L130:
        if (r43 >= 23) goto L132;
        r42 = r42 + r130[r43];
        r130[r43] = r42;
        r43 = r43 + 1;
        goto L130
    L132:
        int r44 = r130[r216];
        int r45 = r115;
        int r132 = r216;
    L133:
        if (r132 > r127) goto L135;
        int r217 = r132 + 1;
        int r218 = r130[r217];
        int r46 = (r218 - r44) + r45;
        r129[r132] = r46 - 1;
        r45 = r46 << 1;
        r132 = r217;
        r44 = r218;
        goto L133
    L135:
        int r47 = r216 + 1;
    L136:
        if (r47 > r127) goto L138;
        r130[r47] = ((r129[r47 - 1] + 1) << 1) - r130[r47];
        r47 = r47 + 1;
        goto L136
    L138:
        r32[r125] = r216;
        r125 = r125 + 1;
        r9 = r210;
        goto L103
    L139:
        int r219 = r9;
        lo r48 = this.I;
        byte[] r49 = (byte[]) r48.f;
        int[] r50 = (int[]) r48.g;
        byte[] r51 = (byte[]) r48.c;
        byte[] r52 = (byte[]) r48.b;
        char[] r53 = (char[]) r48.n;
        int[] r54 = (int[]) r48.h;
        int[][] r55 = (int[][]) r48.k;
        int[][] r133 = (int[][]) r48.l;
        int[][] r56 = (int[][]) r48.m;
        int r134 = this.q * 100000;
        int r135 = 256;
    L140:
        r135 = r135 - 1;
        if (r135 < 0) goto L143;
        r53[r135] = (char) r135;
        r50[r135] = r115;
        goto L140
    L143:
        int r136 = this.t + 1;
        lo r137 = this.I;
        int r138 = ((byte[]) r137.c)[r115] & 255;
        j("zt", r138, 6);
        int[] r57 = ((int[][]) r137.k)[r138];
        int r58 = ((int[]) r137.h)[r138];
        j("zn", r58, 258);
        int r59 = f(this.u, r58);
        int r220 = r58;
    L145:
        if (r59 <= r57[r220]) goto L147;
        int r60 = r220 + 1;
        j("zn", r60, 258);
        r220 = r60;
        r59 = (r59 << 1) | f(this.u, r219);
        r219 = 1;
        goto L145
    L147:
        int r61 = r59 - ((int[][]) r137.l)[r138][r220];
        j("zvec", r61, 258);
        int r62 = ((int[][]) r137.m)[r138][r61];
        int r63 = r51[r115] & 255;
        j("zt", r63, 6);
        int[] r139 = r133[r63];
        int[] r140 = r55[r63];
        int[] r221 = r56[r63];
        int r310 = r54[r63];
        int r64 = -1;
        int[] r222 = r221;
        int r311 = 49;
        int r223 = r115;
    L148:
        if (r62 == r136) goto L195;
        r54 = r54;
        r55 = r55;
        r133 = r133;
        r136 = r136;
        if (r62 != 0) goto L152;
    L153:
        int[] r312 = r139;
        int r141 = -1;
        int r142 = 1;
    L176:
        if (r62 != 0) goto L179;
        r141 = r141 + r142;
    L181:
        if (r311 != 0) goto L184;
        int r65 = r223 + 1;
        j("groupNo", r65, 18002);
        int r143 = r51[r65] & 255;
        j("zt", r143, 6);
        r312 = r133[r143];
        int[] r224 = r55[r143];
        r222 = r56[r143];
        r310 = r54[r143];
        r223 = r65;
        r140 = r224;
        r311 = 49;
    L183:
        int r66 = r310;
        j("zn", r66, 258);
        r310 = r66;
        int r144 = f(r12, r66);
        int r225 = r310;
    L187:
        if (r144 <= r140[r225]) goto L189;
        int r67 = r225 + 1;
        j("zn", r67, 258);
        r144 = (r144 << 1) | f(r12, 1);
        r225 = r67;
        r53 = r53;
        goto L187
    L189:
        int r145 = r144 - r312[r225];
        j("zvec", r145, 258);
        r62 = r222[r145];
        r142 = r142 << 1;
        r53 = r53;
        goto L176
    L184:
        r311 = r311 - 1;
        goto L183
    L179:
        if (r62 != 1) goto L190;
        r141 = r141 + (r142 << 1);
        goto L181
    L190:
        char[] r313 = r53;
        char r68 = r313[0];
        j("yy", r68, 256);
        byte r69 = r52[r68];
        int r70 = r69 & 255;
        r50[r70] = (r141 + 1) + r50[r70];
        int r71 = r64 + 1;
        int r72 = r71 + r141;
        Arrays.fill(r49, r71, r72 + 1, r69);
        if (r72 >= r134) goto L193;
        r64 = r72;
        r139 = r312;
        r53 = r313;
    L172:
        r115 = 0;
        goto L148
    L193:
        mj0.i(xa3.e(r72, r134, "Block overrun while expanding RLE in MTF, ", " exceeds "));
        return;
    L152:
        if (r62 == 1) goto L153;
        r64 = r64 + 1;
        if (r64 >= r134) goto L173;
        j("nextSym", r62, 257);
        int r146 = r62 - 1;
        char r147 = r53[r146];
        int[] r314 = r139;
        j("yy", r147, 256);
        byte r73 = r52[r147];
        int r148 = r73 & 255;
        r50[r148] = r50[r148] + 1;
        r49[r64] = r73;
        if (r62 > 16) goto L161;
    L158:
        if (r146 <= 0) goto L160;
        int r74 = r146 - 1;
        r53[r146] = r53[r74];
        r146 = r74;
        goto L158
    L160:
        char r75 = r115;
    L162:
        r53[r75] = r147;
        if (r311 != 0) goto L166;
        int r76 = r223 + 1;
        j("groupNo", r76, 18002);
        int r77 = r51[r76] & 255;
        j("zt", r77, 6);
        int[] r78 = r133[r77];
        int[] r149 = r55[r77];
        int[] r150 = r56[r77];
        int r79 = r54[r77];
        r223 = r76;
        r314 = r78;
        r140 = r149;
        r222 = r150;
        r311 = 49;
    L167:
        j("zn", r79, 258);
        int r80 = f(r12, r79);
        int r151 = r79;
    L169:
        if (r80 <= r140[r151]) goto L171;
        r151 = r151 + 1;
        j("zn", r151, 258);
        r80 = (r80 << 1) | f(r12, 1);
        goto L169
    L171:
        int r81 = r80 - r314[r151];
        j("zvec", r81, 258);
        r62 = r222[r81];
        r310 = r79;
        r139 = r314;
        goto L172
    L166:
        r311 = r311 - 1;
        r79 = r310;
        goto L167
    L161:
        r75 = r115;
        System.arraycopy(r53, r75, r53, 1, r146);
        goto L162
    L173:
        mj0.i(xa3.e(r64, r134, "Block overrun in MTF, ", " exceeds "));
        return;
    L195:
        this.o = r64;
        this.s.a = -1;
        this.v = 1;
        return;
    L197:
        mj0.i("Corrupted input, nSelectors value negative");
        return;
    L34:
        r11 = false;
        goto L35
    }

    @Override // java.io.InputStream
    public final int read(byte[] r6, int r7, int r8) {
        if (r7 < 0) goto L27;
        if (r8 < 0) goto L25;
        int r1 = r7 + r8;
        if (r1 <= r6.length) goto L8;
        kf2.h(f34.i(b11.t("offs(", ") + len(", r7, r8, ") > dest.length("), r6.length, ")."));
        return 0;
    L8:
        if (this.u == null) goto L21;
        if (r8 != 0) goto L11;
        return 0;
    L11:
        int r9 = r7;
    L12:
        if (r9 >= r1) goto L16;
        int r0 = s();
        if (r0 < 0) goto L16;
        r6[r9] = (byte) r0;
        b(1);
        r9 = r9 + 1;
    L16:
        if (r9 != r7) goto L20;
        return -1;
    L20:
        return r9 - r7;
    L21:
        mj0.i("Stream closed");
        return 0;
    L25:
        kf2.h(b11.j(r8, "len(", ") < 0."));
        return 0;
    L27:
        kf2.h(b11.j(r7, "offs(", ") < 0."));
        return 0;
    }

    public final int s() {
        switch(this.v) {
            case 0: goto L45;
            case 1: goto L44;
            case 2: goto L41;
            case 3: goto L23;
            case 4: goto L21;
            case 5: goto L18;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L4;
        };
    L4:
        tb4.a();
        return 0;
    L18:
        tb4.a();
        return 0;
    L41:
        tb4.a();
        return 0;
    L45:
        return -1;
    L7:
        return F();
    L9:
        if (this.A == this.B) goto L12;
        this.z = 1;
        return v();
    L12:
        int r0 = this.z + 1;
        this.z = r0;
        if (r0 < 4) goto L17;
        j("su_tPos", this.G, ((byte[]) this.I.f).length);
        lo r1 = this.I;
        byte[] r2 = (byte[]) r1.f;
        int r3 = this.G;
        this.H = (char) (r2[r3] & 255);
        this.G = ((int[]) r1.j)[r3];
        this.D = 0;
        return F();
    L17:
        return v();
    L21:
        return J();
    L23:
        if (this.A == this.B) goto L26;
        this.v = 2;
        this.z = 1;
        return H();
    L26:
        int r4 = this.z + 1;
        this.z = r4;
        if (r4 < 4) goto L39;
        lo r5 = this.I;
        byte[] r6 = (byte[]) r5.f;
        int r7 = this.G;
        this.H = (char) (r6[r7] & 255);
        j("su_tPos", r7, ((int[]) r5.j).length);
        this.G = ((int[]) this.I.j)[this.G];
        int r8 = this.E;
        if (r8 != 0) goto L33;
        int r9 = this.F;
        this.E = j51.g[r9] - 1;
        int r10 = r9 + 1;
        this.F = r10;
        if (r10 != 512) goto L34;
        this.F = 0;
    L34:
        this.D = 0;
        this.v = 4;
        if (this.E != 1) goto L38;
        this.H = (char) (this.H ^ 1);
    L38:
        return J();
    L33:
        this.E = r8 - 1;
        goto L34
    L39:
        this.v = 2;
        return H();
    L44:
        return u();
    }

    public final int u() {
        if (this.v == 0) goto L30;
        lo r0 = this.I;
        if (r0 == null) goto L34;
        int[] r1 = (int[]) r0.i;
        int r3 = 1;
        int r2 = this.o + 1;
        int[] r4 = (int[]) r0.j;
        if (r4 != null) goto L10;
    L11:
        r4 = new int[r2];
        r0.j = r4;
    L12:
        byte[] r5 = (byte[]) r0.f;
        r1[0] = 0;
        System.arraycopy((int[]) r0.g, 0, r1, 1, 256);
        int r6 = r1[0];
    L13:
        if (r3 > 256) goto L15;
        r6 = r6 + r1[r3];
        r1[r3] = r6;
        r3 = r3 + 1;
        goto L13
    L15:
        int r7 = this.o;
        int r8 = 0;
    L16:
        if (r8 > r7) goto L18;
        int r9 = r5[r8] & 255;
        int r10 = r1[r9];
        r1[r9] = r10 + 1;
        j("tt index", r10, r2);
        r4[r10] = r8;
        r8 = r8 + 1;
        goto L16
    L18:
        int r11 = this.p;
        if (r11 >= 0) goto L21;
    L28:
        mj0.i("Stream corrupted");
        return 0;
    L21:
        if (r11 >= r4.length) goto L28;
        this.G = r4[r11];
        this.z = 0;
        this.C = 0;
        this.A = 256;
        if (this.r == false) goto L27;
        this.E = 0;
        this.F = 0;
        return H();
    L27:
        return v();
    L10:
        if (r4.length >= r2) goto L12;
    L34:
        return -1;
    L30:
        return -1;
    }

    public final int v() {
        if (this.C > this.o) goto L6;
        this.B = this.A;
        lo r0 = this.I;
        byte[] r1 = (byte[]) r0.f;
        int r2 = this.G;
        int r3 = r1[r2] & 255;
        this.A = r3;
        j("su_tPos", r2, ((int[]) r0.j).length);
        this.G = ((int[]) this.I.j)[this.G];
        this.C++;
        this.v = 6;
        this.s.j(r3);
        return r3;
    L6:
        this.v = 5;
        n();
        q();
        return u();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.u == null) goto L10;
        int r0 = s();
        if (r0 >= 0) goto L7;
        int r1 = -1;
    L8:
        b(r1);
        return r0;
    L7:
        r1 = 1;
        goto L8
    L10:
        mj0.i("Stream closed");
        return 0;
    }
}
