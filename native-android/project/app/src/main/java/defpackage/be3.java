package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class be3 {
    public static final char[] d = null;
    public static final char[] e = null;
    public static final jx1 f = null;
    public static final AtomicBoolean g = null;
    public byte[] a;
    public int b;
    public int c;

    static {
        d = new char[]{'\r', '\n'};
        e = new char[]{'\n'};
        f = jx1.j(5, new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE});
        g = new AtomicBoolean();
    }

    public be3(int r2) {
        this.a = new byte[r2];
        this.c = r2;
    }

    public static int b(int r2, int r3, int r4, int r5) {
        byte r6 = (byte) r4;
        return jz4.u((byte) 0, ji2.p(((r2 & 7) << 2) | ((r3 & 48) >> 4)), ji2.p(((((byte) r3) & 15) << 4) | ((r6 & 60) >> 2)), ji2.p(((r6 & 3) << 6) | (((byte) r5) & 63)));
    }

    public static int d(Charset r2) {
        rr2.o(f.contains(r2), "Unsupported charset: %s", r2);
        if (r2.equals(StandardCharsets.UTF_8) == false) goto L5;
        return 1;
    L5:
        if (r2.equals(StandardCharsets.US_ASCII) == true) goto L11;
        return 2;
    L11:
        return 1;
    }

    public static boolean e(byte r1) {
        if ((r1 & 192) != 128) goto L6;
        return true;
    L6:
        return false;
    }

    public final int A() {
        f(1);
        byte[] r0 = this.a;
        int r1 = this.b;
        this.b = r1 + 1;
        return r0[r1] & 255;
    }

    public final int B() {
        f(4);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = (r1[r2] & 255) << 8;
        this.b = r2 + 2;
        int r5 = (r1[r3] & 255) | r4;
        this.b = r2 + 4;
        return r5;
    }

    public final long C() {
        f(4);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        long r4 = (((long) r1[r2]) & 255) << 24;
        int r8 = r2 + 2;
        this.b = r8;
        long r5 = r4 | ((((long) r1[r3]) & 255) << 16);
        int r6 = r2 + 3;
        this.b = r6;
        long r7 = r5 | ((((long) r1[r8]) & 255) << 8);
        this.b = r2 + 4;
        return (((long) r1[r6]) & 255) | r7;
    }

    public final int D() {
        f(3);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = (r1[r2] & 255) << 16;
        int r5 = r2 + 2;
        this.b = r5;
        int r6 = ((r1[r3] & 255) << 8) | r4;
        this.b = r2 + 3;
        return (r1[r5] & 255) | r6;
    }

    public final int E() {
        int r1 = m();
        if (r1 < 0) goto L5;
        return r1;
    L5:
        kf2.o(f34.f(r1, "Top bit not zero: "));
        return 0;
    }

    public final int F() {
        int r2 = 0;
        long r3 = 0;
    L4:
        if (r2 >= 9) goto L14;
        if (this.b == this.c) goto L11;
        long r5 = A();
        r3 = r3 | ((127 & r5) << (r2 * 7));
        if ((r5 & 128) == 0) goto L14;
        r2 = r2 + 1;
        goto L4
    L11:
        kf2.o("Attempting to read a byte over the limit.");
        return 0;
    L14:
        return jz4.m(r3);
    }

    public final long G() {
        long r0 = u();
        if (r0 < 0) goto L5;
        return r0;
    L5:
        kf2.o(b11.k("Top bit not zero: ", r0));
        return 0;
    }

    public final int H() {
        f(2);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = (r1[r2] & 255) << 8;
        this.b = r2 + 2;
        return (r1[r3] & 255) | r4;
    }

    public final long I() {
        int r0 = 1;
        f(1);
        long r1 = this.a[this.b];
        int r4 = 7;
    L4:
        if (r4 < 0) goto L12;
        int r6 = 1 << r4;
        if ((((long) r6) & r1) == 0) goto L7;
        r4 = r4 - 1;
        goto L4
    L7:
        if (r4 >= 6) goto L9;
        r1 = r1 & ((long) (r6 - 1));
        int r3 = 7 - r4;
    L13:
        if (r3 == 0) goto L24;
        f(r3);
    L15:
        if (r0 >= r3) goto L21;
        byte r5 = this.a[this.b + r0];
        if ((r5 & 192) != 128) goto L20;
        r1 = (r1 << 6) | ((long) (r5 & 63));
        r0 = r0 + 1;
        goto L15
    L20:
        throw new NumberFormatException(b11.k("Invalid UTF-8 sequence continuation byte: ", r1));
    L21:
        this.b += r3;
        return r1;
    L24:
        throw new NumberFormatException(b11.k("Invalid UTF-8 sequence first byte: ", r1));
    L9:
        if (r4 != 7) goto L12;
        r3 = 1;
    L12:
        r3 = 0;
        goto L13
    }

    public final Charset J() {
        if (a() < 3) goto L13;
        byte[] r0 = this.a;
        int r2 = this.b;
        if (r0[r2] != (-17)) goto L13;
        if (r0[r2 + 1] != (-69)) goto L13;
        if (r0[r2 + 2] != (-65)) goto L13;
        this.b = r2 + 3;
        return StandardCharsets.UTF_8;
    L13:
        if (a() < 2) goto L25;
        byte[] r1 = this.a;
        int r3 = this.b;
        byte r4 = r1[r3];
        if (r4 == (-2)) goto L17;
    L20:
        if (r4 == (-1)) goto L22;
        return null;
    L22:
        if (r1[r3 + 1] != (-2)) goto L28;
        this.b = r3 + 2;
        return StandardCharsets.UTF_16LE;
    L28:
        return null;
    L17:
        if (r1[r3 + 1] != (-1)) goto L20;
        this.b = r3 + 2;
        return StandardCharsets.UTF_16BE;
    L25:
        return null;
    }

    public final void K(int r3) {
        byte[] r0 = this.a;
        if (r0.length >= r3) goto L5;
        r0 = new byte[r3];
    L5:
        L(r3, r0);
    }

    public final void L(int r1, byte[] r2) {
        this.a = r2;
        this.c = r1;
        this.b = 0;
    }

    public final void M(int r2) {
        if (r2 >= 0) goto L4;
    L6:
        boolean r0 = false;
    L7:
        rr2.l(r0);
        this.c = r2;
        return;
    L4:
        if (r2 > this.a.length) goto L6;
        r0 = true;
        goto L7
    }

    public final void N(int r2) {
        if (r2 >= 0) goto L4;
    L6:
        boolean r0 = false;
    L7:
        rr2.l(r0);
        this.b = r2;
        return;
    L4:
        if (r2 > this.c) goto L6;
        r0 = true;
        goto L7
    }

    public final void O(int r2) {
        N(this.b + r2);
    }

    public final int a() {
        return Math.max(this.c - this.b, 0);
    }

    public final void c(int r3) {
        byte[] r0 = this.a;
        if (r3 <= r0.length) goto L6;
        this.a = Arrays.copyOf(r0, r3);
        return;
    }

    public final void f(int r4) {
        if (g.get() == true) goto L5;
        return;
    L5:
        if (a() >= r4) goto L10;
        StringBuilder r5 = f34.j(r4, "bytesNeeded= ", ", bytesLeft=");
        r5.append(a());
        throw new IndexOutOfBoundsException(r5.toString());
    }

    public final char g(int r3, ByteOrder r4) {
        f(2);
        ByteOrder r0 = ByteOrder.BIG_ENDIAN;
        byte[] r1 = this.a;
        int r2 = this.b;
        if (r4 != r0) goto L7;
        int r5 = r2 + r3;
        byte r6 = r1[r5];
        byte r7 = r1[r5 + 1];
    L5:
        int r8 = r7 & 255;
        return (char) (r8 | (r6 << 8));
    L7:
        int r9 = r2 + r3;
        r6 = r1[r9 + 1];
        r7 = r1[r9];
        goto L5
    }

    public final int h(Charset r8) {
        rr2.o(f.contains(r8), "Unsupported charset: %s", r8);
        if (a() < d(r8)) goto L65;
        int r1 = 1;
        if (r8.equals(StandardCharsets.US_ASCII) == false) goto L11;
        byte r7 = this.a[this.b];
        if ((r7 & 128) != 0) goto L47;
        int r9 = r7 & 255;
    L64:
        return (r9 << 8) | r1;
    L47:
        return 0;
    L11:
        if (r8.equals(StandardCharsets.UTF_8) == false) goto L54;
        byte r10 = this.a[this.b];
        if ((r10 & 128) != 0) goto L16;
        int r11 = 1;
    L43:
        if (r11 == 1) goto L52;
        if (r11 == 2) goto L51;
        if (r11 == 3) goto L50;
        if (r11 != 4) goto L47;
        byte[] r0 = this.a;
        int r12 = this.b;
        r9 = b(r0[r12], r0[r12 + 1], r0[r12 + 2], r0[r12 + 3]);
    L49:
        r1 = r11;
        goto L64
    L50:
        byte[] r2 = this.a;
        int r13 = this.b;
        r9 = b(0, r2[r13] & 15, r2[r13 + 1], r2[r13 + 2]);
        goto L49
    L51:
        byte[] r3 = this.a;
        int r14 = this.b;
        r9 = b(0, 0, r3[r14], r3[r14 + 1]);
        goto L49
    L52:
        r9 = this.a[this.b] & 255;
        goto L49
    L16:
        if ((r10 & 224) != 192) goto L23;
        if (a() < 2) goto L23;
        if (e(this.a[this.b + 1]) == false) goto L23;
        r11 = 2;
    L23:
        if ((this.a[this.b] & 240) != 224) goto L32;
        if (a() < 3) goto L32;
        if (e(this.a[this.b + 1]) == false) goto L32;
        if (e(this.a[this.b + 2]) == false) goto L32;
        r11 = 3;
    L32:
        if ((this.a[this.b] & 248) == 240) goto L34;
    L42:
        r11 = 0;
        goto L43
    L34:
        if (a() < 4) goto L42;
        if (e(this.a[this.b + 1]) == false) goto L42;
        if (e(this.a[this.b + 2]) == false) goto L42;
        if (e(this.a[this.b + 3]) == false) goto L42;
        r11 = 4;
        goto L43
    L54:
        if (r8.equals(StandardCharsets.UTF_16LE) == false) goto L56;
        ByteOrder r15 = ByteOrder.LITTLE_ENDIAN;
    L57:
        char r4 = g(0, r15);
        if (Character.isHighSurrogate(r4) == true) goto L60;
    L62:
        r9 = r4;
        r1 = 2;
        goto L64
    L60:
        if (a() < 4) goto L62;
        r9 = Character.toCodePoint(r4, g(2, r15));
        r1 = 4;
        goto L64
    L56:
        r15 = ByteOrder.BIG_ENDIAN;
        goto L57
    L65:
        er1.h(this.b, this.c);
        return 0;
    }

    public final int i() {
        if (a() < 4) goto L6;
        int r0 = m();
        this.b -= 4;
        return r0;
    L6:
        er1.h(this.b, this.c);
        return 0;
    }

    public final int j() {
        f(1);
        return this.a[this.b] & 255;
    }

    public final void k(byte[] r3, int r4, int r5) {
        f(r5);
        System.arraycopy(this.a, this.b, r3, r4, r5);
        this.b += r5;
    }

    public final char l(Charset r8, char[] r9) {
        if (a() < d(r8)) goto L26;
        int r10 = h(r8);
        if (r10 == 0) goto L26;
        long r0 = r10 >>> 8;
        boolean r4 = true;
        if ((r0 >> 32) != 0) goto L11;
        boolean r3 = true;
    L12:
        rr2.m(r3, "out of range: %s", r0);
        int r1 = (int) r0;
        if (Character.isSupplementaryCodePoint(r1) == true) goto L26;
        long r2 = r1;
        char r5 = (char) r2;
        if (r5 == r2) goto L19;
        r4 = false;
    L19:
        rr2.m(r4, "Out of range: %s", r2);
        int r6 = r9.length;
        int r7 = 0;
    L20:
        if (r7 >= r6) goto L26;
        if (r9[r7] == r5) goto L23;
        r7 = r7 + 1;
        goto L20
    L23:
        this.b = jz4.m(r10 & 255) + this.b;
        return r5;
    L11:
        r3 = false;
    L26:
        return 0;
    }

    public final int m() {
        f(4);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = (r1[r2] & 255) << 24;
        int r5 = r2 + 2;
        this.b = r5;
        int r6 = ((r1[r3] & 255) << 16) | r4;
        int r7 = r2 + 3;
        this.b = r7;
        int r8 = r6 | ((r1[r5] & 255) << 8);
        this.b = r2 + 4;
        return (r1[r7] & 255) | r8;
    }

    public final String n(Charset r5) {
        rr2.o(f.contains(r5), "Unsupported charset: %s", r5);
        if (a() != 0) goto L5;
        return null;
    L5:
        Charset r0 = StandardCharsets.US_ASCII;
        if (r5.equals(r0) == true) goto L9;
        J();
    L9:
        if (r5.equals(StandardCharsets.UTF_8) == false) goto L11;
    L23:
        int r1 = 1;
    L24:
        int r2 = this.b;
    L25:
        int r3 = this.c;
        if (r2 >= (r3 - (r1 - 1))) goto L51;
        if (r5.equals(StandardCharsets.UTF_8) == true) goto L32;
        if (r5.equals(StandardCharsets.US_ASCII) == true) goto L32;
    L35:
        if (r5.equals(StandardCharsets.UTF_16) == false) goto L37;
    L38:
        byte[] r4 = this.a;
        if (r4[r2] == 0) goto L41;
    L44:
        if (r5.equals(StandardCharsets.UTF_16LE) == false) goto L50;
        byte[] r6 = this.a;
        if (r6[r2 + 1] != 0) goto L50;
        if (f35.N(r6[r2]) == false) goto L50;
    L52:
        String r7 = y(r2 - this.b, r5);
        if (this.b != this.c) goto L56;
    L58:
        return r7;
    L56:
        if (l(r5, d) != '\r') goto L58;
        l(r5, e);
    L50:
        r2 = r2 + r1;
        goto L25
    L41:
        if (f35.N(r4[r2 + 1]) == false) goto L44;
    L37:
        if (r5.equals(StandardCharsets.UTF_16BE) == false) goto L44;
    L32:
        if (f35.N(this.a[r2]) == false) goto L35;
    L51:
        r2 = r3;
        goto L52
    L11:
        if (r5.equals(r0) == true) goto L23;
        if (r5.equals(StandardCharsets.UTF_16) == false) goto L16;
    L22:
        r1 = 2;
        goto L24
    L16:
        if (r5.equals(StandardCharsets.UTF_16LE) == true) goto L22;
        if (r5.equals(StandardCharsets.UTF_16BE) == true) goto L22;
        mj0.l(r5, "Unsupported charset: ");
        return null;
    }

    public final int o() {
        f(4);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = r1[r2] & 255;
        int r5 = r2 + 2;
        this.b = r5;
        int r6 = ((r1[r3] & 255) << 8) | r4;
        int r7 = r2 + 3;
        this.b = r7;
        int r8 = r6 | ((r1[r5] & 255) << 16);
        this.b = r2 + 4;
        return ((r1[r7] & 255) << 24) | r8;
    }

    public final long p() {
        f(8);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        long r4 = ((long) r1[r2]) & 255;
        int r8 = r2 + 2;
        this.b = r8;
        long r5 = r4 | ((((long) r1[r3]) & 255) << 8);
        int r6 = r2 + 3;
        this.b = r6;
        long r7 = r5 | ((((long) r1[r8]) & 255) << 16);
        int r9 = r2 + 4;
        this.b = r9;
        long r10 = r7 | ((((long) r1[r6]) & 255) << 24);
        int r11 = r2 + 5;
        this.b = r11;
        long r12 = r10 | ((((long) r1[r9]) & 255) << 32);
        int r13 = r2 + 6;
        this.b = r13;
        long r14 = r12 | ((((long) r1[r11]) & 255) << 40);
        int r15 = r2 + 7;
        this.b = r15;
        long r16 = r14 | ((((long) r1[r13]) & 255) << 48);
        this.b = r2 + 8;
        return ((((long) r1[r15]) & 255) << 56) | r16;
    }

    public final short q() {
        f(2);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = r1[r2] & 255;
        this.b = r2 + 2;
        return (short) (((r1[r3] & 255) << 8) | r4);
    }

    public final long r() {
        f(4);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        long r4 = ((long) r1[r2]) & 255;
        int r8 = r2 + 2;
        this.b = r8;
        long r5 = r4 | ((((long) r1[r3]) & 255) << 8);
        int r6 = r2 + 3;
        this.b = r6;
        long r7 = r5 | ((((long) r1[r8]) & 255) << 16);
        this.b = r2 + 4;
        return ((((long) r1[r6]) & 255) << 24) | r7;
    }

    public final int s() {
        int r1 = o();
        if (r1 < 0) goto L5;
        return r1;
    L5:
        kf2.o(f34.f(r1, "Top bit not zero: "));
        return 0;
    }

    public final int t() {
        f(2);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = r1[r2] & 255;
        this.b = r2 + 2;
        return ((r1[r3] & 255) << 8) | r4;
    }

    public final long u() {
        f(8);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        long r4 = (((long) r1[r2]) & 255) << 56;
        int r8 = r2 + 2;
        this.b = r8;
        long r5 = r4 | ((((long) r1[r3]) & 255) << 48);
        int r6 = r2 + 3;
        this.b = r6;
        long r7 = r5 | ((((long) r1[r8]) & 255) << 40);
        int r9 = r2 + 4;
        this.b = r9;
        long r10 = r7 | ((((long) r1[r6]) & 255) << 32);
        int r11 = r2 + 5;
        this.b = r11;
        long r12 = r10 | ((((long) r1[r9]) & 255) << 24);
        int r13 = r2 + 6;
        this.b = r13;
        long r14 = r12 | ((((long) r1[r11]) & 255) << 16);
        int r15 = r2 + 7;
        this.b = r15;
        long r16 = r14 | ((((long) r1[r13]) & 255) << 8);
        this.b = r2 + 8;
        return (((long) r1[r15]) & 255) | r16;
    }

    public final String v() {
        if (a() != 0) goto L6;
        return null;
    L6:
        int r0 = this.b;
    L8:
        if (r0 >= this.c) goto L12;
        if (this.a[r0] == 0) goto L12;
        r0 = r0 + 1;
    L12:
        byte[] r1 = this.a;
        int r2 = this.b;
        String r4 = f35.a;
        String r5 = new String(r1, r2, r0 - r2, StandardCharsets.UTF_8);
        this.b = r0;
        if (r0 >= this.c) goto L15;
        this.b = r0 + 1;
    L15:
        return r5;
    }

    public final String w(int r6) {
        f(r6);
        if (r6 != 0) goto L6;
        return "";
    L6:
        int r0 = this.b;
        int r1 = (r0 + r6) - 1;
        if (r1 < this.c) goto L9;
    L11:
        int r2 = r6;
    L12:
        byte[] r3 = this.a;
        String r4 = f35.a;
        String r5 = new String(r3, r0, r2, StandardCharsets.UTF_8);
        this.b += r6;
        return r5;
    L9:
        if (this.a[r1] != 0) goto L11;
        r2 = r6 - 1;
        goto L12
    }

    public final short x() {
        f(2);
        byte[] r1 = this.a;
        int r2 = this.b;
        int r3 = r2 + 1;
        this.b = r3;
        int r4 = (r1[r2] & 255) << 8;
        this.b = r2 + 2;
        return (short) ((r1[r3] & 255) | r4);
    }

    public final String y(int r4, Charset r5) {
        f(r4);
        String r0 = new String(this.a, this.b, r4, r5);
        this.b += r4;
        return r0;
    }

    public final int z() {
        int r0 = A();
        int r1 = A();
        int r2 = A();
        return A() | (((r0 << 21) | (r1 << 14)) | (r2 << 7));
    }

    public be3() {
        this.a = f35.b;
    }

    public be3(byte[] r1) {
        this.a = r1;
        this.c = r1.length;
    }

    public be3(int r1, byte[] r2) {
        this.a = r2;
        this.c = r1;
    }
}
