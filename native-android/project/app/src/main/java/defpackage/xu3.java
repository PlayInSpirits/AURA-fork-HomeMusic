package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xu3 implements fw {
    public final ej4 n;
    public final tv o;
    public boolean p;

    public xu3(ej4 r1) {
        r1.getClass();
        this.n = r1;
        this.o = new tv();
    }

    @Override // defpackage.fw
    public final String B(Charset r3) {
        r3.getClass();
        ej4 r0 = this.n;
        tv r2 = this.o;
        r2.p(r0);
        return r2.K(r2.o, r3);
    }

    @Override // defpackage.fw
    public final yw E() {
        ej4 r0 = this.n;
        tv r2 = this.o;
        r2.p(r0);
        return r2.g(r2.o);
    }

    @Override // defpackage.fw
    public final boolean G(long r7) {
        if (r7 >= 0) goto L5;
        kf2.e(b11.k("byteCount < 0: ", r7));
        return false;
    L5:
        if (this.p == true) goto L13;
    L6:
        tv r0 = this.o;
        if (r0.o >= r7) goto L11;
        if (this.n.read(r0, 8192) != (-1)) goto L6;
        return false;
    L11:
        return true;
    L13:
        kf2.o("closed");
        return false;
    }

    @Override // defpackage.fw
    public final String I() {
        return t(Long.MAX_VALUE);
    }

    @Override // defpackage.fw
    public final long N(tv r11) {
        long r2 = 0;
    L3:
        ej4 r4 = this.n;
        tv r7 = this.o;
        if (r4.read(r7, 8192) == (-1)) goto L8;
        long r5 = r7.j();
        if (r5 <= 0) goto L3;
        r2 = r2 + r5;
        r11.L(r7, r5);
        goto L3
    L8:
        long r6 = r7.o;
        if (r6 <= 0) goto L17;
        long r3 = r2 + r6;
        r11.L(r7, r6);
        return r3;
    L17:
        return r2;
    }

    @Override // defpackage.fw
    public final void P(long r1) {
        if (G(r1) == false) goto L6;
        return;
    L6:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final long S() {
        P(1);
        int r0 = 0;
    L3:
        int r1 = r0 + 1;
        boolean r2 = G(r1);
        tv r3 = this.o;
        if (r2 == false) goto L24;
        byte r4 = r3.q(r0);
        if (r4 < 48) goto L10;
        if (r4 > 57) goto L10;
    L18:
        r0 = r1;
    L10:
        if (r4 < 97) goto L14;
        if (r4 <= 102) goto L18;
    L14:
        if (r4 < 65) goto L19;
        if (r4 <= 70) goto L18;
    L19:
        if (r0 != 0) goto L24;
        ya4.g(16);
        String r5 = Integer.toString(r4, 16);
        r5.getClass();
        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r5));
    L24:
        return r3.S();
    }

    @Override // defpackage.fw
    public final InputStream V() {
        return new rv(this, 1);
    }

    @Override // defpackage.fw, defpackage.ew
    public final tv a() {
        return this.o;
    }

    public final long b(byte r9, long r10, long r12) {
        if (this.p == false) goto L5;
        kf2.o("closed");
        return 0;
    L5:
        if (0 > r12) goto L19;
        long r4 = 0;
    L8:
        if (r4 >= r12) goto L18;
        tv r2 = this.o;
        byte r3 = r9;
        long r6 = r12;
        long r11 = r2.s(r3, r4, r6);
        if (r11 != (-1)) goto L11;
        long r13 = r2.o;
        if (r13 >= r6) goto L18;
        if (this.n.read(r2, 8192) == (-1)) goto L18;
        r4 = Math.max(r4, r13);
        r9 = r3;
        r12 = r6;
        goto L8
    L11:
        return r11;
    L18:
        return -1;
    L19:
        kf2.e(b11.k("fromIndex=0 toIndex=", r12));
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.p == true) goto L6;
        this.p = true;
        this.n.close();
        this.o.b();
        return;
    }

    public final int f() {
        P(4);
        return zz1.G(this.o.readInt());
    }

    @Override // defpackage.fw
    public final yw g(long r1) {
        P(r1);
        return this.o.g(r1);
    }

    @Override // defpackage.fw
    public final byte[] i() {
        ej4 r0 = this.n;
        tv r2 = this.o;
        r2.p(r0);
        return r2.F(r2.o);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.p;
    }

    public final long j() {
        P(8);
        tv r0 = this.o;
        if (r0.o < 8) goto L15;
        t84 r3 = r0.n;
        r3.getClass();
        int r4 = r3.b;
        int r5 = r3.c;
        if ((r5 - r4) >= 8) goto L7;
        long r1 = ((((long) r0.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) r0.readInt()));
        char r19 = 24;
        char r18 = '(';
    L13:
        return ((r1 & 255) << 56) | (((((((((-72057594037927936L) & r1) >>> 56) | ((71776119061217280L & r1) >>> r18)) | ((280375465082880L & r1) >>> r19)) | ((1095216660480L & r1) >>> 8)) | ((4278190080L & r1) << 8)) | ((16711680 & r1) << r19)) | ((65280 & r1) << r18));
    L7:
        byte[] r6 = r3.a;
        r19 = 24;
        r18 = '(';
        int r7 = r4 + 7;
        long r2 = (((((((((long) r6[r4]) & 255) << 56) | ((((long) r6[r4 + 1]) & 255) << 48)) | ((((long) r6[r4 + 2]) & 255) << 40)) | ((((long) r6[r4 + 3]) & 255) << 32)) | ((((long) r6[r4 + 4]) & 255) << 24)) | ((((long) r6[r4 + 5]) & 255) << 16)) | ((((long) r6[r4 + 6]) & 255) << 8);
        int r8 = r4 + 8;
        long r9 = r2 | (((long) r6[r7]) & 255);
        r0.o -= 8;
        if (r8 != r5) goto L11;
        r0.n = r3.a();
        a94.a(r3);
    L10:
        r1 = r9;
        goto L13
    L11:
        r3.b = r8;
        goto L10
    L15:
        throw new EOFException();
    }

    @Override // defpackage.fw
    public final boolean l() {
        if (this.p == true) goto L11;
        tv r0 = this.o;
        if (r0.l() == true) goto L7;
    L10:
        return false;
    L7:
        if (this.n.read(r0, 8192) != (-1)) goto L10;
        return true;
    L11:
        kf2.o("closed");
        return false;
    }

    @Override // defpackage.fw
    public final int m(cb3 r7) {
        r7.getClass();
        if (this.p == true) goto L12;
    L4:
        tv r1 = this.o;
        int r0 = e.b(r1, r7, true);
        if (r0 != (-2)) goto L6;
        if (this.n.read(r1, 8192) != (-1)) goto L4;
    L11:
        return -1;
    L6:
        if (r0 == (-1)) goto L11;
        r1.skip(r7.n[r0].d());
        return r0;
    L12:
        kf2.o("closed");
        return 0;
    }

    public final short n() {
        P(2);
        return this.o.J();
    }

    @Override // defpackage.fw
    public final String o() {
        long r1 = b((byte) 10, 0, Long.MAX_VALUE);
        tv r3 = this.o;
        if (r1 != (-1)) goto L11;
        long r2 = r3.o;
        if (r2 != 0) goto L7;
        return null;
    L7:
        return q(r2);
    L11:
        return e.a(r3, r1);
    }

    public final String q(long r2) {
        P(r2);
        return this.o.K(r2, w10.a);
    }

    @Override // defpackage.ej4
    public final long read(tv r6, long r7) {
        r6.getClass();
        if (r7 >= 0) goto L5;
        kf2.e(b11.k("byteCount < 0: ", r7));
        return 0;
    L5:
        if (this.p == true) goto L13;
        tv r2 = this.o;
        if (r2.o != 0) goto L12;
        if (this.n.read(r2, 8192) != (-1)) goto L12;
        return -1;
    L12:
        return r2.read(r6, Math.min(r7, r2.o));
    L13:
        kf2.o("closed");
        return 0;
    }

    @Override // defpackage.fw
    public final byte readByte() {
        P(1);
        return this.o.readByte();
    }

    @Override // defpackage.fw
    public final int readInt() {
        P(4);
        return this.o.readInt();
    }

    @Override // defpackage.fw
    public final short readShort() {
        P(2);
        return this.o.readShort();
    }

    @Override // defpackage.fw
    public final void skip(long r6) {
        if (this.p == false) goto L5;
        kf2.o("closed");
        return;
    L5:
        if (r6 <= 0) goto L14;
        tv r2 = this.o;
        if (r2.o != 0) goto L13;
        if (this.n.read(r2, 8192) != (-1)) goto L13;
        throw new EOFException();
    L13:
        long r0 = Math.min(r6, r2.o);
        r2.skip(r0);
        r6 = r6 - r0;
        goto L5
    }

    @Override // defpackage.fw
    public final String t(long r19) {
        if (r19 >= 0) goto L5;
        kf2.e(b11.k("limit < 0: ", r19));
        return null;
    L5:
        if (r19 != Long.MAX_VALUE) goto L7;
        long r4 = Long.MAX_VALUE;
    L8:
        long r1 = b((byte) 10, 0, r4);
        tv r12 = this.o;
        if (r1 == (-1)) goto L13;
        return e.a(r12, r1);
    L13:
        if (r4 < Long.MAX_VALUE) goto L15;
    L24:
        tv r13 = new tv();
        r12.n(r13, 0, Math.min(32, r12.o));
        throw new EOFException("\\n not found: limit=" + Math.min(r12.o, r19) + " content=" + r13.g(r13.o).e() + 8230);
    L15:
        if (G(r4) == false) goto L24;
        if (r12.q(r4 - 1) != 13) goto L24;
        if (G(r4 + 1) == false) goto L24;
        if (r12.q(r4) != 10) goto L24;
        return e.a(r12, r4);
    L7:
        r4 = r19 + 1;
        goto L8
    }

    @Override // defpackage.ej4
    public final fu4 timeout() {
        return this.n.timeout();
    }

    public final String toString() {
        return "buffer(" + this.n + ')';
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer r6) {
        r6.getClass();
        tv r0 = this.o;
        if (r0.o != 0) goto L9;
        if (this.n.read(r0, 8192) != (-1)) goto L9;
        return -1;
    L9:
        return r0.read(r6);
    }
}
