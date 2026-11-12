package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vk4 {
    public int[] a;
    public final int[] b;
    public final rm3 c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public ci1 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public Bitmap.Config t;

    public vk4(rm3 r4, ci1 r5, ByteBuffer r6, int r7) {
        this.b = new int[256];
        this.t = Bitmap.Config.ARGB_8888;
        this.c = r4;
        this.l = new ci1();
        monitor-enter(this);
        if (r7 <= 0) goto L24;
        int r8 = Integer.highestOneBit(r7);     // Catch: Throwable -> L10
        int r9 = 0;
        this.o = 0;     // Catch: Throwable -> L10
        this.l = r5;     // Catch: Throwable -> L10
        this.k = -1;     // Catch: Throwable -> L10
        ByteBuffer r10 = r6.asReadOnlyBuffer();     // Catch: Throwable -> L10
        this.d = r10;     // Catch: Throwable -> L10
        r10.position(0);     // Catch: Throwable -> L10
        this.d.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Throwable -> L10
        this.n = false;     // Catch: Throwable -> L10
        ArrayList r11 = r5.e;     // Catch: Throwable -> L10
        int r0 = r11.size();     // Catch: Throwable -> L10
    L6:
        if (r9 >= r0) goto L12;
        Object r1 = r11.get(r9);     // Catch: Throwable -> L10
        r9 = r9 + 1;     // Catch: Throwable -> L10
        if (((yh1) r1).g != 3) goto L6;
        this.n = true;     // Catch: Throwable -> L10
    L12:
        this.p = r8;     // Catch: Throwable -> L10
        int r12 = r5.f;     // Catch: Throwable -> L10
        this.r = r12 / r8;     // Catch: Throwable -> L10
        int r13 = r5.g;     // Catch: Throwable -> L10
        this.q = r13 / r8;     // Catch: Throwable -> L10
        int r14 = r12 * r13;     // Catch: Throwable -> L10
        qj0 r15 = (qj0) this.c.o;     // Catch: Throwable -> L10
        if (r15 != null) goto L15;
        byte[] r16 = new byte[r14];     // Catch: Throwable -> L10
    L16:
        this.i = r16;     // Catch: Throwable -> L10
        rm3 r17 = this.c;     // Catch: Throwable -> L10
        int r18 = this.r * this.q;     // Catch: Throwable -> L10
        qj0 r19 = (qj0) r17.o;     // Catch: Throwable -> L10
        if (r19 != null) goto L19;
        int[] r20 = new int[r18];     // Catch: Throwable -> L10
    L20:
        this.j = r20;     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L19:
        r20 = (int[]) r19.d(r18, int[].class);     // Catch: Throwable -> L10
        goto L20
    L15:
        r16 = (byte[]) r15.d(r14, byte[].class);     // Catch: Throwable -> L10
        goto L16
    L24:
        throw new IllegalArgumentException("Sample size must be >=0, not: " + r7);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public final Bitmap a() {
        Boolean r0 = this.s;
        if (r0 != null) goto L5;
    L8:
        Bitmap.Config r1 = Bitmap.Config.ARGB_8888;
    L9:
        Bitmap r3 = ((zs) this.c.n).c(this.r, this.q, r1);
        r3.setHasAlpha(true);
        return r3;
    L5:
        if (r0.booleanValue() == true) goto L8;
        r1 = this.t;
        goto L9
    }

    public final synchronized Bitmap b() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L5:
        if (this.l.c <= 0) goto L12;
        if (this.k < 0) goto L12;
    L15:
        int r2 = this.o;     // Catch: Throwable -> L9
        if (r2 == 1) goto L54;
        if (r2 == 2) goto L54;
        this.o = 0;     // Catch: Throwable -> L9
        if (this.e != null) goto L27;
        qj0 r3 = (qj0) this.c.o;     // Catch: Throwable -> L9
        if (r3 != null) goto L25;
        byte[] r4 = new byte[255];     // Catch: Throwable -> L9
    L26:
        this.e = r4;     // Catch: Throwable -> L9
        goto L27
    L25:
        r4 = (byte[]) r3.d(255, byte[].class);     // Catch: Throwable -> L9
    L27:
        yh1 r5 = (yh1) this.l.e.get(this.k);     // Catch: Throwable -> L9
        int r7 = this.k - 1;     // Catch: Throwable -> L9
        if (r7 < 0) goto L30;
        yh1 r8 = (yh1) this.l.e.get(r7);     // Catch: Throwable -> L9
    L31:
        int[] r9 = r5.k;     // Catch: Throwable -> L9
        if (r9 != null) goto L35;
        r9 = this.l.a;     // Catch: Throwable -> L9
    L35:
        this.a = r9;     // Catch: Throwable -> L9
        if (r9 != null) goto L44;
        if (Log.isLoggable("vk4", 3) == false) goto L40;
        Log.d("vk4", "No valid color table found for frame #" + this.k);     // Catch: Throwable -> L9
    L40:
        this.o = 1;     // Catch: Throwable -> L9
        monitor-exit(this);
        return null;
    L44:
        if (r5.f == false) goto L50;
        System.arraycopy(r9, 0, this.b, 0, r9.length);     // Catch: Throwable -> L9
        int[] r1 = this.b;     // Catch: Throwable -> L9
        this.a = r1;     // Catch: Throwable -> L9
        r1[r5.h] = 0;     // Catch: Throwable -> L9
        if (r5.g != 2) goto L50;
        if (this.k != 0) goto L50;
        this.s = Boolean.TRUE;     // Catch: Throwable -> L9
    L50:
        Bitmap r0 = d(r5, r8);     // Catch: Throwable -> L9
        monitor-exit(this);
        return r0;
    L30:
        r8 = null;
    L54:
        if (Log.isLoggable("vk4", 3) == false) goto L56;
        Log.d("vk4", "Unable to decode frame, status=" + this.o);     // Catch: Throwable -> L9
    L56:
        monitor-exit(this);
        return null;
    L12:
        if (Log.isLoggable("vk4", 3) == false) goto L14;
        Log.d("vk4", "Unable to decode frame, frameCount=" + this.l.c + ", framePointer=" + this.k);     // Catch: Throwable -> L9
    L14:
        this.o = 1;     // Catch: Throwable -> L9
        goto L15
    }

    public final void c(Bitmap.Config r5) {
        Bitmap.Config r0 = Bitmap.Config.ARGB_8888;
        if (r5 == r0) goto L9;
        Bitmap.Config r1 = Bitmap.Config.RGB_565;
        if (r5 == r1) goto L9;
        throw new IllegalArgumentException("Unsupported format: " + r5 + ", must be one of " + r0 + " or " + r1);
    L9:
        this.t = r5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [short] */
    /* JADX WARN: Type inference failed for: r8v31 */
    public final Bitmap d(yh1 r37, yh1 r38) {
        rm3 r3 = this.c;
        byte r4 = 0;
        int[] r6 = this.j;
        if (r38 != null) goto L9;
        Bitmap r5 = this.m;
        if (r5 == null) goto L7;
        ((zs) r3.n).d(r5);
    L7:
        this.m = null;
        Arrays.fill(r6, 0);
    L9:
        if (r38 != null) goto L11;
    L15:
        int r14 = this.r;
        int r15 = this.p;
        if (r38 == null) goto L38;
        int r7 = r38.g;
        if (r7 <= 0) goto L38;
        if (r7 == 2) goto L21;
        if (r7 != 3) goto L38;
        Bitmap r8 = this.m;
        if (r8 == null) goto L38;
        int r12 = this.q;
        int r9 = this.r;
        r8.getPixels(r6, 0, r9, 0, 0, r9, r12);
        goto L38
    L21:
        if (r37.f == true) goto L26;
        ci1 r10 = this.l;
        int r11 = r10.k;
        if (r37.k != null) goto L25;
    L27:
        int r13 = r38.d / r15;
        int r16 = r38.b / r15;
        int r17 = r38.c / r15;
        int r18 = (r16 * r14) + (r38.a / r15);
        int r19 = (r13 * r14) + r18;
    L28:
        if (r18 >= r19) goto L38;
        int r2 = r18 + r17;
        int r110 = r18;
    L30:
        if (r110 >= r2) goto L32;
        r6[r110] = r11;
        r110 = r110 + 1;
        goto L30
    L32:
        r18 = r18 + r14;
        goto L28
    L25:
        if (r10.j != r37.h) goto L27;
    L26:
        r11 = 0;
    L38:
        this.d.position(r37.j);
        int r20 = r37.c * r37.d;
        byte[] r21 = this.i;
        if (r21 != null) goto L41;
    L42:
        qj0 r22 = (qj0) r3.o;
        if (r22 != null) goto L45;
        byte[] r23 = new byte[r20];
    L46:
        this.i = r23;
    L47:
        byte[] r24 = this.i;
        if (this.f != null) goto L50;
        this.f = new short[4096];
    L50:
        short[] r25 = this.f;
        if (this.g != null) goto L53;
        this.g = new byte[4096];
    L53:
        byte[] r26 = this.g;
        if (this.h != null) goto L56;
        this.h = new byte[4097];
    L56:
        byte[] r111 = this.h;
        int r112 = this.d.get() & 255;
        int r27 = 1 << r112;
        int r113 = r27 + 1;
        int r114 = r27 + 2;
        int r115 = r112 + 1;
        int r116 = (1 << r115) - 1;
        int r28 = 0;
    L57:
        if (r28 >= r27) goto L59;
        r25[r28] = 0;
        r26[r28] = (byte) r28;
        r28 = r28 + 1;
        goto L57
    L59:
        byte[] r29 = this.e;
        int r117 = 0;
        int r210 = 0;
        int r211 = 0;
        int r212 = 0;
        int r213 = 0;
        int r214 = 0;
        int r30 = 0;
        int r31 = 0;
        int r215 = r115;
        int r216 = r114;
        int r217 = r116;
        int r218 = -1;
        int r219 = -1;
    L61:
        if (r117 >= r20) goto L103;
        if (r210 != 0) goto L71;
        r210 = this.d.get() & 255;
        if (r210 <= 0) goto L67;
        ByteBuffer r32 = this.d;
        r32.get(this.e, 0, Math.min(r210, r32.remaining()));
    L67:
        if (r210 <= 0) goto L68;
        r211 = 0;
    L72:
        r213 = r213 + ((r29[r211] & 255) << r212);
        r211 = r211 + 1;
        r210 = r210 - 1;
        r219 = r219;
        r212 = r212 + 8;
        r216 = r216;
        int r33 = r215;
        r26 = r26;
        r30 = r30;
    L73:
        r212 = r212;
        if (r212 < r33) goto L102;
        int r34 = r213 & r217;
        r213 = r213 >> r33;
        r212 = r212 - r33;
        if (r34 == r27) goto L77;
        if (r34 == r113) goto L79;
        int r220 = r33;
        if (r219 != r218) goto L85;
        r24[r214] = r26[r34];
        r214 = r214 + 1;
        r117 = r117 + 1;
        r219 = r34;
        r30 = r219;
        r33 = r220;
    L84:
        r218 = -1;
        goto L73
    L85:
        if (r34 < r216) goto L87;
        r111[r31] = (byte) r30;
        r31 = r31 + 1;
        short r35 = r219;
    L88:
        if (r35 < r27) goto L90;
        r111[r31] = r26[r35];
        r31 = r31 + 1;
        r35 = r25[r35];
        goto L88
    L90:
        r30 = r26[r35] & 255;
        byte r36 = (byte) r30;
        r24[r214] = r36;
    L91:
        r214 = r214 + 1;
        r117 = r117 + 1;
        if (r31 <= 0) goto L94;
        r31 = r31 - 1;
        r24[r214] = r111[r31];
        goto L91
    L94:
        int r221 = r27;
        if (r216 >= 4096) goto L100;
        r25[r216] = (short) r219;
        r26[r216] = r36;
        r216 = r216 + 1;
        if ((r216 & r217) != 0) goto L100;
        if (r216 >= 4096) goto L100;
        r33 = r220 + 1;
        r217 = r217 + r216;
    L101:
        r219 = r34;
        r27 = r221;
    L100:
        r33 = r220;
        goto L101
    L87:
        r35 = r34;
        goto L88
    L79:
        r215 = r33;
    L80:
        r4 = 0;
        goto L61
    L77:
        r33 = r115;
        r216 = r114;
        r217 = r116;
        r219 = r218;
        r212 = r212;
        goto L73
    L102:
        r215 = r33;
        r218 = -1;
        goto L80
    L68:
        this.o = 3;
        r4 = 0;
    L104:
        Arrays.fill(r24, r214, r20, r4);
        boolean r39 = r37.e;
        int[] r40 = this.j;
        if (r39 == true) goto L140;
        if (r15 != 1) goto L140;
        int r41 = r37.d;
        int r42 = r37.b;
        int r43 = r37.c;
        int r44 = r37.a;
        if (this.k != 0) goto L112;
        byte r45 = 1;
    L113:
        byte[] r46 = this.i;
        int[] r118 = this.a;
        int r119 = r4;
        byte r120 = -1;
    L114:
        if (r119 >= r41) goto L128;
        int r121 = (r119 + r42) * r14;
        int r122 = r121 + r44;
        int r47 = r122 + r43;
        int r123 = r121 + r14;
        if (r123 >= r47) goto L118;
        r47 = r123;
    L118:
        int r124 = r37.c * r119;
    L119:
        if (r122 >= r47) goto L127;
        int r125 = r41;
        byte r48 = r46[r124];
        int[] r126 = r40;
        int r49 = r48 & 255;
        if (r49 == r120) goto L126;
        int r50 = r118[r49];
        if (r50 == 0) goto L125;
        r126[r122] = r50;
        goto L126
    L125:
        r120 = r48;
    L126:
        r124 = r124 + 1;
        r122 = r122 + 1;
        r41 = r125;
        r40 = r126;
        goto L119
    L127:
        r119 = r119 + 1;
        goto L114
    L128:
        Boolean r51 = this.s;
        if (r51 == null) goto L133;
        if (r51.booleanValue() == false) goto L133;
    L137:
        boolean r52 = true;
    L139:
        this.s = Boolean.valueOf(r52);
    L224:
        if (this.n == false) goto L230;
        int r1 = r37.g;
        if (r1 == 0) goto L232;
        if (r1 != 1) goto L230;
    L232:
        if (this.m != null) goto L234;
        this.m = a();
    L234:
        Bitmap r53 = this.m;
        int r127 = this.q;
        int r54 = this.r;
        int[] r55 = r6;
        r53.setPixels(r55, 0, r54, 0, 0, r54, r127);
    L235:
        Bitmap r56 = a();
        int r128 = this.q;
        int r57 = this.r;
        r56.setPixels(r55, 0, r57, 0, 0, r57, r128);
        return r56;
    L230:
        r55 = r6;
    L133:
        if (this.s != null) goto L138;
        if (r45 == 0) goto L138;
        if (r120 != (-1)) goto L137;
    L138:
        r52 = false;
        goto L139
    L112:
        r45 = r4;
    L140:
        int r58 = r37.d / r15;
        int r59 = r37.b / r15;
        int r60 = r37.c / r15;
        int r61 = r37.a / r15;
        if (this.k != 0) goto L143;
        boolean r62 = true;
    L144:
        byte[] r63 = this.i;
        int[] r64 = this.a;
        Boolean r129 = this.s;
        int r130 = 8;
        int r65 = 0;
        int r131 = 0;
        int r132 = 1;
    L145:
        if (r65 >= r58) goto L218;
        int r133 = r59;
        if (r37.e == false) goto L160;
        if (r131 < r58) goto L159;
        r132 = r132 + 1;
        if (r132 != 2) goto L152;
        r131 = 4;
        goto L159
    L152:
        if (r132 != 3) goto L154;
        r130 = 4;
        r131 = 2;
        goto L159
    L154:
        if (r132 != 4) goto L159;
        r131 = 1;
        r130 = 2;
    L159:
        int r66 = r131 + r130;
    L161:
        int r134 = r131 + r133;
        int r135 = r58;
        if (r15 != 1) goto L164;
        boolean r222 = true;
    L166:
        if (r134 >= this.q) goto L215;
        int r136 = r134 * r14;
        int r67 = r136 + r61;
        int r68 = r67 + r60;
        int r137 = r136 + r14;
        if (r137 >= r68) goto L170;
        r68 = r137;
    L170:
        int r223 = r66;
        int r138 = (r65 * r15) * r37.c;
        if (r222 == false) goto L182;
        int r69 = r67;
    L173:
        if (r69 >= r68) goto L181;
        int r224 = r69;
        int r70 = r64[r63[r138] & 255];
        if (r70 == 0) goto L177;
        r40[r224] = r70;
    L180:
        r138 = r138 + r15;
        r69 = r224 + 1;
        goto L173
    L177:
        if (r62 == false) goto L180;
        if (r129 != null) goto L180;
        r129 = Boolean.TRUE;
    L181:
        int r225 = r60;
        int r310 = r61;
    L216:
        r65 = r65 + 1;
        r59 = r133;
        r58 = r135;
        r131 = r223;
        r60 = r225;
        r61 = r310;
        goto L145
    L182:
        int r71 = ((r68 - r67) * r15) + r138;
        Boolean r226 = r129;
        int r139 = r138;
        int r140 = r67;
    L183:
        if (r140 >= r68) goto L214;
        int r227 = r68;
        int r72 = r37.c;
        int r228 = r60;
        int r73 = r139;
        int r229 = 0;
        int r230 = 0;
        int r231 = 0;
        int r232 = 0;
        int r233 = 0;
    L186:
        if (r73 >= (r139 + r15)) goto L194;
        byte[] r74 = this.i;
        int r311 = r61;
        if (r73 >= r74.length) goto L195;
        if (r73 >= r71) goto L195;
        int r75 = this.a[r74[r73] & 255];
        if (r75 == 0) goto L193;
        r229 = r229 + ((r75 >> 24) & 255);
        r230 = r230 + ((r75 >> 16) & 255);
        r231 = r231 + ((r75 >> 8) & 255);
        r232 = r232 + (r75 & 255);
        r233 = r233 + 1;
    L193:
        r73 = r73 + 1;
        r61 = r311;
    L195:
        int r76 = r139 + r72;
        int r77 = r76;
    L197:
        if (r77 >= (r76 + r15)) goto L205;
        byte[] r78 = this.i;
        int r234 = r76;
        if (r77 >= r78.length) goto L205;
        if (r77 >= r71) goto L205;
        int r79 = this.a[r78[r77] & 255];
        if (r79 == 0) goto L204;
        r229 = r229 + ((r79 >> 24) & 255);
        r230 = r230 + ((r79 >> 16) & 255);
        r231 = r231 + ((r79 >> 8) & 255);
        r232 = r232 + (r79 & 255);
        r233 = r233 + 1;
    L204:
        r77 = r77 + 1;
        r76 = r234;
    L205:
        if (r233 != 0) goto L207;
        int r80 = 0;
    L208:
        if (r80 == 0) goto L210;
        r40[r140] = r80;
    L213:
        r139 = r139 + r15;
        r140 = r140 + 1;
        r68 = r227;
        r60 = r228;
        r61 = r311;
        goto L183
    L210:
        if (r62 == false) goto L213;
        if (r226 != null) goto L213;
        r226 = Boolean.TRUE;
        goto L213
    L207:
        r80 = ((((r229 / r233) << 24) | ((r230 / r233) << 16)) | ((r231 / r233) << 8)) | (r232 / r233);
        goto L208
    L194:
        r311 = r61;
        goto L195
    L214:
        r225 = r60;
        r310 = r61;
        r129 = r226;
        goto L216
    L215:
        r223 = r66;
        goto L181
    L164:
        r222 = false;
        goto L166
    L160:
        r66 = r131;
        r131 = r65;
        goto L161
    L218:
        if (this.s != null) goto L224;
        if (r129 != null) goto L221;
        boolean r81 = false;
    L222:
        this.s = Boolean.valueOf(r81);
        goto L224
    L221:
        r81 = r129.booleanValue();
        goto L222
    L143:
        r62 = false;
        goto L144
    L71:
        r6 = r6;
        r25 = r25;
        r29 = r29;
        goto L72
    L103:
        r6 = r6;
        goto L104
    L45:
        r23 = (byte[]) r22.d(r20, byte[].class);
        goto L46
    L41:
        if (r21.length >= r20) goto L47;
    L11:
        if (r38.g != 3) goto L15;
        if (this.m != null) goto L15;
        Arrays.fill(r6, 0);
        goto L15
    }
}
