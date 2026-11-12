package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tv implements fw, ew, Cloneable, ByteChannel {
    public t84 n;
    public long o;

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew A(yw r1) {
        X(r1);
        return this;
    }

    @Override // defpackage.fw
    public final String B(Charset r3) {
        r3.getClass();
        return K(this.o, r3);
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew C(long r1) {
        a0(r1);
        return this;
    }

    @Override // defpackage.fw
    public final yw E() {
        return g(this.o);
    }

    public final byte[] F(long r4) {
        if (r4 >= 0) goto L5;
    L18:
        kf2.e(b11.k("byteCount: ", r4));
        return null;
    L5:
        if (r4 > 2147483647L) goto L18;
        if (this.o < r4) goto L17;
        int r5 = (int) r4;
        byte[] r6 = new byte[r5];
        int r0 = 0;
    L9:
        if (r0 >= r5) goto L15;
        int r1 = read(r6, r0, r5 - r0);
        if (r1 == (-1)) goto L14;
        r0 = r0 + r1;
        goto L9
    L14:
        throw new EOFException();
    L15:
        return r6;
    L17:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final boolean G(long r3) {
        if (this.o < r3) goto L6;
        return true;
    L6:
        return false;
    }

    public final long H() {
        long r3 = 0;
        if (this.o == 0) goto L58;
        int r1 = 0;
        boolean r2 = false;
        long r8 = 0;
        long r6 = -7;
        boolean r5 = false;
    L5:
        t84 r10 = this.n;
        r10.getClass();
        byte[] r11 = r10.a;
        int r12 = r10.b;
        int r13 = r10.c;
    L6:
        if (r12 >= r13) goto L30;
        byte r15 = r11[r12];
        if (r15 >= 48) goto L10;
    L24:
        long r17 = r3;
        if (r15 != 45) goto L29;
        if (r1 != 0) goto L29;
        r6 = r6 - 1;
        r2 = true;
    L28:
        r12 = r12 + 1;
        r1 = r1 + 1;
        r3 = r17;
    L29:
        r5 = true;
    L31:
        if (r12 != r13) goto L33;
        this.n = r10.a();
        a94.a(r10);
    L34:
        if (r5 == true) goto L39;
        if (this.n == null) goto L39;
        r3 = r17;
    L39:
        long r4 = this.o - ((long) r1);
        this.o = r4;
        if (r2 == false) goto L42;
        int r14 = 2;
    L43:
        if (r1 < r14) goto L45;
        if (r2 == false) goto L56;
        return r8;
    L56:
        return -r8;
    L45:
        if (r4 == r17) goto L52;
        if (r2 == false) goto L48;
        String r7 = "Expected a digit";
    L49:
        StringBuilder r9 = b11.s(r7, " but was 0x");
        r9.append(zz1.K(q(r17)));
        throw new NumberFormatException(r9.toString());
    L48:
        r7 = "Expected a digit or '-'";
        goto L49
    L52:
        throw new EOFException();
    L42:
        r14 = 1;
        goto L43
    L33:
        r10.b = r12;
        goto L34
    L10:
        if (r15 > 57) goto L24;
        int r16 = 48 - r15;
        if (r8 < (-922337203685477580L)) goto L19;
        r17 = r3;
        if (r8 == (-922337203685477580L)) goto L16;
    L18:
        r8 = (r8 * 10) + ((long) r16);
        goto L28
    L16:
        if (r16 >= r6) goto L18;
    L19:
        tv r0 = new tv();
        r0.Z(r8);
        r0.Y(r15);
        if (r2 == true) goto L23;
        r0.readByte();
    L23:
        throw new NumberFormatException("Number too large: ".concat(r0.M()));
    L30:
        r17 = r3;
        goto L31
    L58:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final String I() {
        return t(Long.MAX_VALUE);
    }

    public final short J() {
        short r1 = readShort();
        int r0 = (65280 & r1) >>> 8;
        return (short) (((r1 & 255) << 8) | r0);
    }

    public final String K(long r7, Charset r9) {
        r9.getClass();
        if (r7 >= 0) goto L5;
    L21:
        kf2.e(b11.k("byteCount: ", r7));
        return null;
    L5:
        if (r7 > 2147483647L) goto L21;
        if (this.o < r7) goto L20;
        if (r7 != 0) goto L11;
        return "";
    L11:
        t84 r0 = this.n;
        r0.getClass();
        int r1 = r0.b;
        if ((((long) r1) + r7) > r0.c) goto L14;
        int r4 = (int) r7;
        String r2 = new String(r0.a, r1, r4, r9);
        int r10 = r0.b + r4;
        r0.b = r10;
        this.o -= r7;
        if (r10 != r0.c) goto L18;
        this.n = r0.a();
        a94.a(r0);
    L18:
        return r2;
    L14:
        return new String(F(r7), r9);
    L20:
        throw new EOFException();
    }

    @Override // defpackage.of4
    public final void L(tv r9, long r10) {
        r9.getClass();
        if (r9 == this) goto L54;
        zz1.i(r9.o, 0, r10);
    L6:
        if (r10 <= 0) goto L65;
        t84 r0 = r9.n;
        r0.getClass();
        int r1 = r0.c;
        t84 r2 = r9.n;
        r2.getClass();
        long r3 = r1 - r2.b;
        int r4 = 0;
        if (r10 >= r3) goto L35;
        t84 r5 = this.n;
        if (r5 == null) goto L12;
        t84 r6 = r5.g;
    L13:
        if (r6 != null) goto L15;
    L24:
        t84 r7 = r9.n;
        r7.getClass();
        int r8 = (int) r10;
        if (r8 <= 0) goto L33;
        if (r8 > (r7.c - r7.b)) goto L33;
        if (r8 < 1024) goto L31;
        t84 r11 = r7.c();
    L32:
        r11.c = r11.b + r8;
        r7.b += r8;
        t84 r12 = r7.g;
        r12.getClass();
        r12.b(r11);
        r9.n = r11;
        goto L35
    L31:
        r11 = a94.b();
        byte[] r13 = r7.a;
        byte[] r14 = r11.a;
        int r15 = r7.b;
        ti.X(0, r15, r15 + r8, r13, r14);
    L33:
        kf2.n("byteCount out of range");
        return;
    L15:
        if (r6.e == false) goto L24;
        long r16 = ((long) r6.c) + r10;
        if (r6.d == false) goto L19;
        int r17 = 0;
    L21:
        if ((r16 - ((long) r17)) > 8192) goto L24;
        t84 r18 = r9.n;
        r18.getClass();
        r18.d(r6, (int) r10);
        r9.o -= r10;
        this.o += r10;
        return;
    L19:
        r17 = r6.b;
        goto L21
    L12:
        r6 = null;
    L35:
        t84 r19 = r9.n;
        r19.getClass();
        long r20 = r19.c - r19.b;
        r9.n = r19.a();
        t84 r21 = this.n;
        if (r21 != null) goto L38;
        this.n = r19;
        r19.g = r19;
        r19.f = r19;
    L51:
        r9.o -= r20;
        this.o += r20;
        r10 = r10 - r20;
        goto L6
    L38:
        t84 r22 = r21.g;
        r22.getClass();
        r22.b(r19);
        t84 r23 = r19.g;
        if (r23 == r19) goto L52;
        r23.getClass();
        if (r23.e == false) goto L51;
        int r24 = r19.c - r19.b;
        t84 r25 = r19.g;
        r25.getClass();
        int r26 = 8192 - r25.c;
        t84 r27 = r19.g;
        r27.getClass();
        if (r27.d == true) goto L48;
        t84 r28 = r19.g;
        r28.getClass();
        r4 = r28.b;
    L48:
        if (r24 > (r26 + r4)) goto L51;
        t84 r29 = r19.g;
        r29.getClass();
        r19.d(r29, r24);
        r19.a();
        a94.a(r19);
        goto L51
    L52:
        kf2.o("cannot compact");
        return;
    L65:
        return;
    L54:
        kf2.n("source == this");
    }

    public final String M() {
        return K(this.o, w10.a);
    }

    @Override // defpackage.fw
    public final long N(tv r5) {
        long r0 = this.o;
        if (r0 <= 0) goto L5;
        r5.L(this, r0);
    L5:
        return r0;
    }

    @Override // defpackage.fw
    public final void P(long r3) {
        if (this.o < r3) goto L6;
        return;
    L6:
        throw new EOFException();
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew Q(long r1) {
        Z(r1);
        return this;
    }

    public final int R() {
        if (this.o == 0) goto L40;
        byte r0 = q(0);
        int r2 = 1;
        if ((r0 & 128) != 0) goto L8;
        int r1 = r0 & 127;
        int r6 = 0;
        int r5 = 1;
    L16:
        long r9 = r5;
        if (this.o < r9) goto L35;
    L18:
        if (r2 >= r5) goto L24;
        long r7 = r2;
        byte r3 = q(r7);
        if ((r3 & 192) != 128) goto L22;
        r1 = (r1 << 6) | (r3 & 63);
        r2 = r2 + 1;
        goto L18
    L22:
        skip(r7);
        return 65533;
    L24:
        skip(r9);
        if (r1 <= 1114111) goto L28;
        return 65533;
    L28:
        if (55296 <= r1) goto L30;
    L32:
        if (r1 >= r6) goto L34;
        return 65533;
    L34:
        return r1;
    L30:
        if (r1 >= 57344) goto L32;
        return 65533;
    L35:
        StringBuilder r4 = f34.j(r5, "size < ", ": ");
        r4.append(this.o);
        r4.append(" (to read code point prefixed 0x");
        r4.append(zz1.K(r0));
        r4.append(')');
        throw new EOFException(r4.toString());
    L8:
        if ((r0 & 224) != 192) goto L11;
        r1 = r0 & 31;
        r5 = 2;
        r6 = 128;
        goto L16
    L11:
        if ((r0 & 240) != 224) goto L14;
        r1 = r0 & 15;
        r5 = 3;
        r6 = 2048;
        goto L16
    L14:
        if ((r0 & 248) != 240) goto L37;
        r1 = r0 & 7;
        r5 = 4;
        r6 = 65536;
        goto L16
    L37:
        skip(1);
        return 65533;
    L40:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final long S() {
        if (this.o == 0) goto L40;
        int r0 = 0;
        boolean r1 = false;
        long r4 = 0;
    L5:
        t84 r6 = this.n;
        r6.getClass();
        byte[] r7 = r6.a;
        int r8 = r6.b;
        int r9 = r6.c;
    L6:
        if (r8 >= r9) goto L31;
        byte r10 = r7[r8];
        if (r10 < 48) goto L13;
        if (r10 > 57) goto L13;
        int r11 = r10 - 48;
    L23:
        if (((-1152921504606846976L) & r4) != 0) goto L25;
        r4 = (r4 << 4) | ((long) r11);
        r8 = r8 + 1;
        r0 = r0 + 1;
        goto L6
    L25:
        tv r14 = new tv();
        r14.a0(r4);
        r14.Y(r10);
        throw new NumberFormatException("Number too large: ".concat(r14.M()));
    L13:
        if (r10 < 97) goto L18;
        if (r10 > 102) goto L18;
        r11 = r10 - 87;
    L18:
        if (r10 < 65) goto L27;
        if (r10 > 70) goto L27;
        r11 = r10 - 55;
    L27:
        if (r0 == 0) goto L30;
        r1 = true;
        goto L31
    L30:
        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(zz1.K(r10)));
    L31:
        if (r8 != r9) goto L33;
        this.n = r6.a();
        a94.a(r6);
    L34:
        if (r1 == true) goto L37;
        if (this.n != null) goto L5;
    L37:
        this.o -= (long) r0;
        return r4;
    L33:
        r6.b = r8;
        goto L34
    L40:
        throw new EOFException();
    }

    public final yw T(int r8) {
        if (r8 == 0) goto L4;
        zz1.i(this.o, 0, r8);
        t84 r0 = this.n;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r2 >= r8) goto L12;
        r0.getClass();
        int r4 = r0.c;
        int r5 = r0.b;
        if (r4 == r5) goto L11;
        r2 = r2 + (r4 - r5);
        r3 = r3 + 1;
        r0 = r0.f;
        goto L6
    L11:
        throw new AssertionError("s.limit == s.pos");
    L12:
        byte[][] r6 = new byte[r3][];
        int[] r7 = new int[r3 * 2];
        t84 r9 = this.n;
        int r10 = 0;
    L13:
        if (r1 >= r8) goto L16;
        r9.getClass();
        r6[r10] = r9.a;
        r1 = r1 + (r9.c - r9.b);
        r7[r10] = Math.min(r1, r8);
        r7[r10 + r3] = r9.b;
        r9.d = true;
        r10 = r10 + 1;
        r9 = r9.f;
        goto L13
    L16:
        return new b94(r6, r7);
    L4:
        return yw.q;
    }

    @Override // defpackage.fw
    public final InputStream V() {
        return new rv(this, 0);
    }

    public final t84 W(int r3) {
        if (r3 >= 1) goto L5;
    L18:
        kf2.n("unexpected capacity");
        return null;
    L5:
        if (r3 > 8192) goto L18;
        t84 r1 = this.n;
        if (r1 != null) goto L10;
        t84 r4 = a94.b();
        this.n = r4;
        r4.g = r4;
        r4.f = r4;
        return r4;
    L10:
        t84 r2 = r1.g;
        r2.getClass();
        if ((r2.c + r3) <= 8192) goto L13;
    L16:
        t84 r5 = a94.b();
        r2.b(r5);
        return r5;
    L13:
        if (r2.e == false) goto L16;
        return r2;
    }

    public final void X(yw r2) {
        r2.getClass();
        r2.r(this, r2.d());
    }

    public final void Y(int r5) {
        t84 r0 = W(1);
        byte[] r1 = r0.a;
        int r2 = r0.c;
        r0.c = r2 + 1;
        r1[r2] = (byte) r5;
        this.o++;
    }

    public final void Z(long r12) {
        if (r12 != 0) goto L6;
        Y(48);
        return;
    L6:
        int r3 = 1;
        if (r12 >= 0) goto L13;
        r12 = -r12;
        if (r12 >= 0) goto L12;
        d0("-9223372036854775808");
        return;
    L12:
        boolean r2 = true;
    L15:
        if (r12 >= 100000000) goto L39;
        if (r12 >= 10000) goto L29;
        if (r12 >= 100) goto L25;
        if (r12 < 10) goto L69;
        r3 = 2;
    L69:
        if (r2 == false) goto L71;
        r3 = r3 + 1;
    L71:
        t84 r4 = W(r3);
        byte[] r7 = r4.a;
        int r8 = r4.c + r3;
    L73:
        if (r12 == 0) goto L75;
        r8 = r8 - 1;
        r7[r8] = e.a[(int) (r12 % 10)];
        r12 = r12 / 10;
        goto L73
    L75:
        if (r2 == false) goto L77;
        r7[r8 - 1] = 45;
    L77:
        r4.c += r3;
        this.o += (long) r3;
        return;
    L25:
        if (r12 >= 1000) goto L27;
        r3 = 3;
        goto L69
    L27:
        r3 = 4;
        goto L69
    L29:
        if (r12 >= 1000000) goto L35;
        if (r12 >= 100000) goto L33;
        r3 = 5;
        goto L69
    L33:
        r3 = 6;
        goto L69
    L35:
        if (r12 >= 10000000) goto L37;
        r3 = 7;
        goto L69
    L37:
        r3 = 8;
        goto L69
    L39:
        if (r12 >= 1000000000000L) goto L51;
        if (r12 >= 10000000000L) goto L47;
        if (r12 >= 1000000000) goto L45;
        r3 = 9;
        goto L69
    L45:
        r3 = 10;
        goto L69
    L47:
        if (r12 >= 100000000000L) goto L49;
        r3 = 11;
        goto L69
    L49:
        r3 = 12;
        goto L69
    L51:
        if (r12 >= 1000000000000000L) goto L60;
        if (r12 >= 10000000000000L) goto L56;
        r3 = 13;
        goto L69
    L56:
        if (r12 >= 100000000000000L) goto L58;
        r3 = 14;
        goto L69
    L58:
        r3 = 15;
        goto L69
    L60:
        if (r12 >= 100000000000000000L) goto L66;
        if (r12 >= 10000000000000000L) goto L64;
        r3 = 16;
        goto L69
    L64:
        r3 = 17;
        goto L69
    L66:
        if (r12 >= 1000000000000000000L) goto L68;
        r3 = 18;
        goto L69
    L68:
        r3 = 19;
        goto L69
    L13:
        r2 = false;
        goto L15
    }

    @Override // defpackage.fw, defpackage.ew
    public final tv a() {
        return this;
    }

    public final void a0(long r13) {
        if (r13 != 0) goto L6;
        Y(48);
        return;
    L6:
        long r1 = (r13 >>> 1) | r13;
        long r2 = r1 | (r1 >>> 2);
        long r3 = r2 | (r2 >>> 4);
        long r4 = r3 | (r3 >>> 8);
        long r5 = r4 | (r4 >>> 16);
        long r6 = r5 | (r5 >>> 32);
        long r7 = r6 - ((r6 >>> 1) & 6148914691236517205L);
        long r8 = ((r7 >>> 2) & 3689348814741910323L) + (r7 & 3689348814741910323L);
        long r9 = ((r8 >>> 4) + r8) & 1085102592571150095L;
        long r10 = r9 + (r9 >>> 8);
        long r11 = r10 + (r10 >>> 16);
        int r12 = (int) ((((r11 & 63) + ((r11 >>> 32) & 63)) + 3) / 4);
        t84 r14 = W(r12);
        byte[] r15 = r14.a;
        int r16 = r14.c;
        int r17 = (r16 + r12) - 1;
    L7:
        if (r17 < r16) goto L9;
        r15[r17] = e.a[(int) (15 & r13)];
        r13 = r13 >>> 4;
        r17 = r17 - 1;
        goto L7
    L9:
        r14.c += r12;
        this.o += (long) r12;
    }

    public final void b() {
        skip(this.o);
    }

    public final void b0(int r8) {
        t84 r1 = W(4);
        byte[] r2 = r1.a;
        int r3 = r1.c;
        r2[r3] = (byte) ((r8 >>> 24) & 255);
        r2[r3 + 1] = (byte) ((r8 >>> 16) & 255);
        r2[r3 + 2] = (byte) ((r8 >>> 8) & 255);
        r2[r3 + 3] = (byte) (r8 & 255);
        r1.c = r3 + 4;
        this.o += 4;
    }

    public final void c0(int r7) {
        t84 r1 = W(2);
        byte[] r2 = r1.a;
        int r3 = r1.c;
        r2[r3] = (byte) ((r7 >>> 8) & 255);
        r2[r3 + 1] = (byte) (r7 & 255);
        r1.c = r3 + 2;
        this.o += 2;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.of4
    public final void close() {
    }

    public final void d0(String r3) {
        r3.getClass();
        e0(r3, 0, r3.length());
    }

    public final void e0(String r10, int r11, int r12) {
        r10.getClass();
        if (r11 < 0) goto L44;
        if (r12 >= r11) goto L6;
        kf2.e(xa3.e(r12, r11, "endIndex < beginIndex: ", " < "));
        return;
    L6:
        if (r12 > r10.length()) goto L40;
    L7:
        if (r11 >= r12) goto L39;
        char r0 = r10.charAt(r11);
        if (r0 < 128) goto L10;
        if (r0 < 2048) goto L19;
        if (r0 < 55296) goto L38;
        if (r0 > 57343) goto L38;
        int r2 = r11 + 1;
        if (r2 >= r12) goto L29;
        char r4 = r10.charAt(r2);
    L31:
        if (r0 > 56319) goto L37;
        if (56320 > r4) goto L37;
        if (r4 >= 57344) goto L37;
        int r1 = (((r0 & 1023) << 10) | (r4 & 1023)) + 65536;
        t84 r5 = W(4);
        byte[] r6 = r5.a;
        int r7 = r5.c;
        r6[r7] = (byte) ((r1 >> 18) | 240);
        r6[r7 + 1] = (byte) (((r1 >> 12) & 63) | 128);
        r6[r7 + 2] = (byte) (((r1 >> 6) & 63) | 128);
        r6[r7 + 3] = (byte) ((r1 & 63) | 128);
        r5.c = r7 + 4;
        this.o += 4;
        r11 = r11 + 2;
    L37:
        Y(63);
        r11 = r2;
        goto L7
    L29:
        r4 = 0;
    L38:
        t84 r8 = W(3);
        byte[] r9 = r8.a;
        int r13 = r8.c;
        r9[r13] = (byte) ((r0 >> '\f') | 224);
        r9[r13 + 1] = (byte) ((63 & (r0 >> 6)) | 128);
        r9[r13 + 2] = (byte) ((r0 & '?') | 128);
        r8.c = r13 + 3;
        this.o += 3;
    L20:
        r11 = r11 + 1;
        goto L7
    L19:
        t84 r3 = W(2);
        byte[] r14 = r3.a;
        int r15 = r3.c;
        r14[r15] = (byte) ((r0 >> 6) | 192);
        r14[r15 + 1] = (byte) ((r0 & '?') | 128);
        r3.c = r15 + 2;
        this.o += 2;
        goto L20
    L10:
        t84 r16 = W(1);
        byte[] r17 = r16.a;
        int r18 = r16.c - r11;
        int r19 = Math.min(r12, 8192 - r18);
        int r20 = r11 + 1;
        r17[r11 + r18] = (byte) r0;
    L11:
        r11 = r20;
        if (r11 >= r19) goto L16;
        char r21 = r10.charAt(r11);
        if (r21 >= 128) goto L16;
        r20 = r11 + 1;
        r17[r11 + r18] = (byte) r21;
    L16:
        int r22 = r16.c;
        int r23 = (r18 + r11) - r22;
        r16.c = r22 + r23;
        this.o += (long) r23;
        goto L7
    L39:
        return;
    L40:
        StringBuilder r24 = f34.j(r12, "endIndex > string.length: ", " > ");
        r24.append(r10.length());
        throw new IllegalArgumentException(r24.toString().toString());
    L44:
        kf2.e(f34.f(r11, "beginIndex < 0: "));
    }

    public final boolean equals(Object r19) {
        if (this != r19) goto L6;
        return true;
    L6:
        if ((r19 instanceof tv) == true) goto L8;
        return false;
    L8:
        long r5 = this.o;
        tv r1 = (tv) r19;
        if (r5 == r1.o) goto L12;
        return false;
    L12:
        if (r5 != 0) goto L14;
        return true;
    L14:
        t84 r3 = this.n;
        r3.getClass();
        t84 r2 = r1.n;
        r2.getClass();
        int r6 = r3.b;
        int r7 = r2.b;
        long r9 = 0;
    L16:
        if (r9 >= this.o) goto L31;
        long r11 = Math.min(r3.c - r6, r2.c - r7);
        long r13 = 0;
    L19:
        if (r13 >= r11) goto L25;
        int r16 = r6 + 1;
        int r17 = r7 + 1;
        if (r3.a[r6] != r2.a[r7]) goto L22;
        r13 = r13 + 1;
        r6 = r16;
        r7 = r17;
        goto L19
    L22:
        return false;
    L25:
        if (r6 != r3.c) goto L28;
        r3 = r3.f;
        r3.getClass();
        r6 = r3.b;
    L28:
        if (r7 != r2.c) goto L30;
        r2 = r2.f;
        r2.getClass();
        r7 = r2.b;
    L30:
        r9 = r9 + r11;
        goto L16
    L31:
        return true;
    }

    public final tv f() {
        tv r0 = new tv();
        if (this.o != 0) goto L5;
        return r0;
    L5:
        t84 r1 = this.n;
        r1.getClass();
        t84 r2 = r1.c();
        r0.n = r2;
        r2.g = r2;
        r2.f = r2;
        t84 r3 = r1.f;
    L6:
        if (r3 == r1) goto L8;
        t84 r4 = r2.g;
        r4.getClass();
        r3.getClass();
        r4.b(r3.c());
        r3 = r3.f;
        goto L6
    L8:
        r0.o = this.o;
        return r0;
    }

    public final void f0(int r9) {
        if (r9 >= 128) goto L7;
        Y(r9);
        return;
    L7:
        if (r9 >= 2048) goto L11;
        t84 r3 = W(2);
        byte[] r4 = r3.a;
        int r5 = r3.c;
        r4[r5] = (byte) ((r9 >> 6) | 192);
        r4[r5 + 1] = (byte) ((r9 & 63) | 128);
        r3.c = r5 + 2;
        this.o += 2;
        return;
    L11:
        if (55296 > r9) goto L17;
        if (r9 >= 57344) goto L17;
        Y(63);
        return;
    L17:
        if (r9 >= 65536) goto L21;
        t84 r6 = W(3);
        byte[] r7 = r6.a;
        int r8 = r6.c;
        r7[r8] = (byte) ((r9 >> 12) | 224);
        r7[r8 + 1] = (byte) (((r9 >> 6) & 63) | 128);
        r7[r8 + 2] = (byte) ((r9 & 63) | 128);
        r6.c = r8 + 3;
        this.o += 3;
        return;
    L21:
        if (r9 > 1114111) goto L24;
        t84 r10 = W(4);
        byte[] r11 = r10.a;
        int r12 = r10.c;
        r11[r12] = (byte) ((r9 >> 18) | 240);
        r11[r12 + 1] = (byte) (((r9 >> 12) & 63) | 128);
        r11[r12 + 2] = (byte) (((r9 >> 6) & 63) | 128);
        r11[r12 + 3] = (byte) ((r9 & 63) | 128);
        r10.c = r12 + 4;
        this.o += 4;
        return;
    L24:
        kf2.n("Unexpected code point: 0x".concat(zz1.L(r9)));
    }

    @Override // defpackage.ew, defpackage.of4, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.fw
    public final yw g(long r3) {
        if (r3 >= 0) goto L5;
    L16:
        kf2.e(b11.k("byteCount: ", r3));
        return null;
    L5:
        if (r3 > 2147483647L) goto L16;
        if (this.o < r3) goto L15;
        if (r3 < 4096) goto L13;
        yw r0 = T((int) r3);
        skip(r3);
        return r0;
    L13:
        return new yw(F(r3));
    L15:
        throw new EOFException();
    }

    public final int hashCode() {
        t84 r0 = this.n;
        if (r0 != null) goto L6;
        return 0;
    L6:
        int r1 = 1;
    L7:
        int r2 = r0.b;
        int r3 = r0.c;
    L8:
        if (r2 >= r3) goto L10;
        r1 = (r1 * 31) + r0.a[r2];
        r2 = r2 + 1;
        goto L8
    L10:
        r0 = r0.f;
        r0.getClass();
        if (r0 != this.n) goto L7;
        return r1;
    }

    @Override // defpackage.fw
    public final byte[] i() {
        return F(this.o);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long r0 = this.o;
        if (r0 != 0) goto L5;
        return 0;
    L5:
        t84 r5 = this.n;
        r5.getClass();
        t84 r6 = r5.g;
        r6.getClass();
        int r2 = r6.c;
        if (r2 < 8192) goto L8;
        return r0;
    L8:
        if (r6.e == true) goto L10;
        return r0;
    L10:
        return r0 - ((long) (r2 - r6.b));
    }

    @Override // defpackage.fw
    public final boolean l() {
        if (this.o != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.fw
    public final int m(cb3 r4) {
        r4.getClass();
        int r0 = e.b(this, r4, false);
        if (r0 != (-1)) goto L5;
        return -1;
    L5:
        skip(r4.n[r0].d());
        return r0;
    }

    public final void n(tv r7, long r8, long r10) {
        r7.getClass();
        long r2 = r8;
        zz1.i(this.o, r2, r10);
        if (r10 == 0) goto L17;
        r7.o += r10;
        t84 r6 = this.n;
    L6:
        r6.getClass();
        long r11 = r6.c - r6.b;
        if (r2 < r11) goto L9;
        r2 = r2 - r11;
        r6 = r6.f;
        goto L6
    L9:
        long r12 = r10;
    L11:
        if (r12 <= 0) goto L22;
        r6.getClass();
        t84 r0 = r6.c();
        int r1 = r0.b + ((int) r2);
        r0.b = r1;
        r0.c = Math.min(r1 + ((int) r12), r0.c);
        t84 r3 = r7.n;
        if (r3 != null) goto L15;
        r0.g = r0;
        r0.f = r0;
        r7.n = r0;
    L16:
        r12 = r12 - ((long) (r0.c - r0.b));
        r6 = r6.f;
        r2 = 0;
        goto L11
    L15:
        t84 r4 = r3.g;
        r4.getClass();
        r4.b(r0);
        goto L16
    L22:
        return;
    }

    @Override // defpackage.fw
    public final String o() {
        long r1 = s((byte) 10, 0, Long.MAX_VALUE);
        if (r1 != (-1)) goto L5;
        long r2 = this.o;
        if (r2 != 0) goto L9;
        return null;
    L9:
        return K(r2, w10.a);
    L5:
        return e.a(this, r1);
    }

    @Override // defpackage.ew
    public final long p(ej4 r7) {
        r7.getClass();
        long r0 = 0;
    L3:
        long r2 = r7.read(this, 8192);
        if (r2 == (-1)) goto L6;
        r0 = r0 + r2;
        goto L3
    L6:
        return r0;
    }

    public final byte q(long r7) {
        zz1.i(this.o, r7, 1);
        t84 r8 = this.n;
        r8.getClass();
        long r0 = this.o;
        if ((r0 - r7) < r7) goto L5;
        long r1 = 0;
    L10:
        int r6 = r8.c;
        int r9 = r8.b;
        long r4 = ((long) (r6 - r9)) + r1;
        if (r4 > r7) goto L14;
        r8 = r8.f;
        r8.getClass();
        r1 = r4;
        goto L10
    L14:
        return r8.a[(int) ((((long) r9) + r7) - r1)];
    L5:
        if (r0 <= r7) goto L8;
        r8 = r8.g;
        r8.getClass();
        r0 = r0 - ((long) (r8.c - r8.b));
        goto L5
    L8:
        return r8.a[(int) ((((long) r8.b) + r7) - r0)];
    }

    public final int read(byte[] r8, int r9, int r10) {
        zz1.i(r8.length, r9, r10);
        t84 r0 = this.n;
        if (r0 != null) goto L6;
        return -1;
    L6:
        int r11 = Math.min(r10, r0.c - r0.b);
        byte[] r1 = r0.a;
        int r2 = r0.b;
        ti.X(r9, r2, r2 + r11, r1, r8);
        int r12 = r0.b + r11;
        r0.b = r12;
        this.o -= (long) r11;
        if (r12 != r0.c) goto L9;
        this.n = r0.a();
        a94.a(r0);
    L9:
        return r11;
    }

    @Override // defpackage.fw
    public final byte readByte() {
        if (this.o == 0) goto L11;
        t84 r0 = this.n;
        r0.getClass();
        int r1 = r0.b;
        int r2 = r0.c;
        int r4 = r1 + 1;
        byte r3 = r0.a[r1];
        this.o--;
        if (r4 != r2) goto L8;
        this.n = r0.a();
        a94.a(r0);
        return r3;
    L8:
        r0.b = r4;
        return r3;
    L11:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final int readInt() {
        if (this.o < 4) goto L15;
        t84 r0 = this.n;
        r0.getClass();
        int r1 = r0.b;
        int r4 = r0.c;
        if ((r4 - r1) < 4) goto L7;
        byte[] r5 = r0.a;
        int r6 = ((r5[r1 + 1] & 255) << 16) | ((r5[r1] & 255) << 24);
        int r7 = r1 + 3;
        int r8 = r6 | ((r5[r1 + 2] & 255) << 8);
        int r2 = r1 + 4;
        int r9 = (r5[r7] & 255) | r8;
        this.o -= 4;
        if (r2 != r4) goto L12;
        this.n = r0.a();
        a94.a(r0);
        return r9;
    L12:
        r0.b = r2;
        return r9;
    L7:
        return (readByte() & 255) | ((((readByte() & 255) << 24) | ((readByte() & 255) << 16)) | ((readByte() & 255) << 8));
    L15:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final short readShort() {
        if (this.o < 2) goto L15;
        t84 r0 = this.n;
        r0.getClass();
        int r1 = r0.b;
        int r4 = r0.c;
        if ((r4 - r1) < 2) goto L7;
        byte[] r5 = r0.a;
        int r7 = r1 + 1;
        int r8 = (r5[r1] & 255) << 8;
        int r2 = r1 + 2;
        int r6 = (r5[r7] & 255) | r8;
        this.o -= 2;
        if (r2 != r4) goto L11;
        this.n = r0.a();
        a94.a(r0);
    L13:
        return (short) r6;
    L11:
        r0.b = r2;
        goto L13
    L7:
        return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
    L15:
        throw new EOFException();
    }

    public final long s(byte r9, long r10, long r12) {
        long r0 = 0;
        if (0 > r10) goto L46;
        if (r10 > r12) goto L46;
        long r2 = this.o;
        if (r12 <= r2) goto L10;
        r12 = r2;
    L10:
        if (r10 == r12) goto L43;
        t84 r8 = this.n;
        if (r8 != null) goto L16;
        return -1;
    L16:
        if ((r2 - r10) < r10) goto L18;
    L30:
        long r3 = ((long) (r8.c - r8.b)) + r0;
        if (r3 > r10) goto L34;
        r8 = r8.f;
        r8.getClass();
        r0 = r3;
    L34:
        if (r0 >= r12) goto L57;
        byte[] r4 = r8.a;
        int r5 = (int) Math.min(r8.c, (((long) r8.b) + r12) - r0);
        int r11 = (int) ((((long) r8.b) + r10) - r0);
    L36:
        if (r11 >= r5) goto L42;
        if (r4[r11] == r9) goto L40;
        r11 = r11 + 1;
        goto L36
    L40:
        return ((long) (r11 - r8.b)) + r0;
    L42:
        r0 = r0 + ((long) (r8.c - r8.b));
        r8 = r8.f;
        r8.getClass();
        r10 = r0;
        goto L34
    L57:
        return -1;
    L18:
        if (r2 <= r10) goto L21;
        r8 = r8.g;
        r8.getClass();
        r2 = r2 - ((long) (r8.c - r8.b));
    L21:
        if (r2 >= r12) goto L56;
        byte[] r1 = r8.a;
        int r6 = (int) Math.min(r8.c, (((long) r8.b) + r12) - r2);
        int r13 = (int) ((((long) r8.b) + r10) - r2);
    L23:
        if (r13 >= r6) goto L29;
        if (r1[r13] == r9) goto L27;
        r13 = r13 + 1;
        goto L23
    L27:
        return ((long) (r13 - r8.b)) + r2;
    L29:
        r2 = r2 + ((long) (r8.c - r8.b));
        r8 = r8.f;
        r8.getClass();
        r10 = r2;
        goto L21
    L56:
        return -1;
    L43:
        return -1;
    L46:
        throw new IllegalArgumentException(("size=" + this.o + " fromIndex=" + r10 + " toIndex=" + r12).toString());
    }

    @Override // defpackage.fw
    public final void skip(long r7) {
    L3:
        if (r7 <= 0) goto L11;
        t84 r0 = this.n;
        if (r0 == null) goto L10;
        int r1 = (int) Math.min(r7, r0.c - r0.b);
        long r4 = r1;
        this.o -= r4;
        r7 = r7 - r4;
        int r2 = r0.b + r1;
        r0.b = r2;
        if (r2 != r0.c) goto L3;
        this.n = r0.a();
        a94.a(r0);
        goto L3
    L10:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final String t(long r12) {
        if (r12 < 0) goto L22;
        long r0 = Long.MAX_VALUE;
        if (r12 != Long.MAX_VALUE) goto L7;
    L6:
        long r4 = r0;
        long r1 = s((byte) 10, 0, r4);
        if (r1 == (-1)) goto L13;
        return e.a(this, r1);
    L13:
        if (r4 < this.o) goto L15;
    L20:
        tv r2 = new tv();
        n(r2, 0, Math.min(32, this.o));
        throw new EOFException("\\n not found: limit=" + Math.min(this.o, r12) + " content=" + r2.g(r2.o).e() + 8230);
    L15:
        if (q(r4 - 1) != 13) goto L20;
        if (q(r4) != 10) goto L20;
        return e.a(this, r4);
    L7:
        r0 = r12 + 1;
        goto L6
    L22:
        kf2.e(b11.k("limit < 0: ", r12));
        return null;
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return fu4.d;
    }

    public final String toString() {
        long r0 = this.o;
        if (r0 > 2147483647L) goto L7;
        return T((int) r0).toString();
    L7:
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.o).toString());
    }

    public final long u(yw r12) {
        r12.getClass();
        t84 r0 = this.n;
        if (r0 == null) goto L69;
        long r1 = this.o;
        long r3 = 0;
        if (r1 < 0) goto L8;
        r1 = 0;
    L40:
        long r9 = ((long) (r0.c - r0.b)) + r1;
        if (r9 > 0) goto L44;
        r0 = r0.f;
        r0.getClass();
        r1 = r9;
        goto L40
    L44:
        if (r12.d() != 2) goto L56;
        byte r5 = r12.i(0);
        byte r13 = r12.i(1);
    L47:
        if (r1 >= this.o) goto L91;
        byte[] r6 = r0.a;
        int r4 = (int) ((((long) r0.b) + r3) - r1);
        int r7 = r0.c;
    L49:
        if (r4 >= r7) goto L55;
        byte r8 = r6[r4];
        if (r8 == r5) goto L22;
        if (r8 == r13) goto L22;
        r4 = r4 + 1;
    L22:
        int r11 = r0.b;
    L24:
        return ((long) (r4 - r11)) + r1;
    L55:
        r3 = ((long) (r0.c - r0.b)) + r1;
        r0 = r0.f;
        r0.getClass();
        r1 = r3;
        goto L47
    L91:
        return -1;
    L56:
        byte[] r14 = r12.h();
    L58:
        if (r1 >= this.o) goto L92;
        byte[] r10 = r0.a;
        r4 = (int) ((((long) r0.b) + r3) - r1);
        int r15 = r0.c;
    L60:
        if (r4 >= r15) goto L68;
        byte r16 = r10[r4];
        int r17 = r14.length;
        int r18 = 0;
    L62:
        if (r18 >= r17) goto L67;
        if (r16 == r14[r18]) goto L35;
        r18 = r18 + 1;
    L35:
        r11 = r0.b;
        goto L24
    L67:
        r4 = r4 + 1;
        goto L60
    L68:
        r3 = ((long) (r0.c - r0.b)) + r1;
        r0 = r0.f;
        r0.getClass();
        r1 = r3;
        goto L58
    L92:
        return -1;
    L8:
        if (r1 <= 0) goto L11;
        r0 = r0.g;
        r0.getClass();
        r1 = r1 - ((long) (r0.c - r0.b));
        goto L8
    L11:
        if (r12.d() != 2) goto L26;
        byte r19 = r12.i(0);
        byte r110 = r12.i(1);
    L14:
        if (r1 >= this.o) goto L89;
        byte[] r20 = r0.a;
        r4 = (int) ((((long) r0.b) + r3) - r1);
        int r21 = r0.c;
    L16:
        if (r4 >= r21) goto L25;
        byte r22 = r20[r4];
        if (r22 == r19) goto L22;
        if (r22 == r110) goto L22;
        r4 = r4 + 1;
        goto L16
    L25:
        r3 = ((long) (r0.c - r0.b)) + r1;
        r0 = r0.f;
        r0.getClass();
        r1 = r3;
        goto L14
    L89:
        return -1;
    L26:
        byte[] r111 = r12.h();
    L28:
        if (r1 >= this.o) goto L90;
        byte[] r23 = r0.a;
        r4 = (int) ((((long) r0.b) + r3) - r1);
        int r24 = r0.c;
    L30:
        if (r4 >= r24) goto L38;
        byte r25 = r23[r4];
        int r26 = r111.length;
        int r27 = 0;
    L32:
        if (r27 >= r26) goto L37;
        if (r25 == r111[r27]) goto L35;
        r27 = r27 + 1;
        goto L32
    L37:
        r4 = r4 + 1;
        goto L30
    L38:
        r3 = ((long) (r0.c - r0.b)) + r1;
        r0 = r0.f;
        r0.getClass();
        r1 = r3;
        goto L28
    L90:
        return -1;
    L69:
        return -1;
    }

    public final boolean v(yw r7) {
        r7.getClass();
        int r0 = r7.d();
        if (r0 >= 0) goto L5;
    L17:
        return false;
    L5:
        if (this.o < r0) goto L17;
        if (r7.d() < r0) goto L17;
        int r2 = 0;
    L10:
        if (r2 >= r0) goto L15;
        if (q(r2) != r7.i(r2)) goto L17;
        r2 = r2 + 1;
        goto L10
    L15:
        return true;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m78write(byte[] r8, int r9, int r10) {
        r8.getClass();
        long r5 = r10;
        zz1.i(r8.length, r9, r5);
        int r11 = r10 + r9;
    L3:
        if (r9 >= r11) goto L5;
        t84 r0 = W(1);
        int r1 = Math.min(r11 - r9, 8192 - r0.c);
        int r4 = r9 + r1;
        ti.X(r0.c, r9, r4, r8, r0.a);
        r0.c += r1;
        r9 = r4;
        goto L3
    L5:
        this.o += r5;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew writeByte(int r1) {
        Y(r1);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew writeInt(int r1) {
        b0(r1);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew writeShort(int r1) {
        c0(r1);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew y(String r1) {
        d0(r1);
        return this;
    }

    @Override // defpackage.ew
    public final /* bridge */ /* synthetic */ ew write(byte[] r1, int r2, int r3) {
        m78write(r1, r2, r3);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer r7) {
        r7.getClass();
        int r0 = r7.remaining();
        int r1 = r0;
    L3:
        if (r1 <= 0) goto L5;
        t84 r2 = W(1);
        int r3 = Math.min(r1, 8192 - r2.c);
        r7.get(r2.a, r2.c, r3);
        r1 = r1 - r3;
        r2.c += r3;
        goto L3
    L5:
        this.o += (long) r0;
        return r0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer r7) {
        r7.getClass();
        t84 r0 = this.n;
        if (r0 != null) goto L6;
        return -1;
    L6:
        int r1 = Math.min(r7.remaining(), r0.c - r0.b);
        r7.put(r0.a, r0.b, r1);
        int r8 = r0.b + r1;
        r0.b = r8;
        this.o -= (long) r1;
        if (r8 != r0.c) goto L9;
        this.n = r0.a();
        a94.a(r0);
    L9:
        return r1;
    }

    @Override // defpackage.ew
    public final ew write(byte[] r3) {
        r3.getClass();
        m78write(r3, 0, r3.length);
        return this;
    }

    @Override // defpackage.ej4
    public final long read(tv r5, long r6) {
        r5.getClass();
        if (r6 < 0) goto L13;
        long r2 = this.o;
        if (r2 != 0) goto L9;
        return -1;
    L9:
        if (r6 <= r2) goto L11;
        r6 = r2;
    L11:
        r5.L(this, r6);
        return r6;
    L13:
        kf2.e(b11.k("byteCount < 0: ", r6));
        return 0;
    }
}
