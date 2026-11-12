package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ck5 implements Closeable {
    public final ByteArrayInputStream n;
    public bk5 o;
    public final byte[] p;
    public final qw q;

    public ck5(ByteArrayInputStream r3) {
        this.p = new byte[8];
        this.q = new qw(1);
        this.n = r3;
    }

    public final void F(int r4, byte[] r5) {
        int r0 = 0;
    L3:
        if (r0 == r4) goto L9;
        int r1 = this.n.read(r5, r0, r4 - r0);
        if (r1 == (-1)) goto L8;
        r0 = r0 + r1;
        goto L3
    L8:
        throw new EOFException();
    L9:
        this.o = null;
    }

    public final byte[] H() {
        u();
        long r0 = s();
        if (r0 >= 0) goto L5;
    L12:
        er1.l("the maximum supported byte/text string length is 2147483647 bytes");
        return null;
    L5:
        if (r0 > 2147483647L) goto L12;
        if (this.n.available() < r0) goto L11;
        int r1 = (int) r0;
        byte[] r2 = new byte[r1];
        F(r1, r2);
        return r2;
    L11:
        throw new EOFException();
    }

    public final long b() {
        v((byte) -128);
        u();
        long r0 = s();
        if (r0 < 0) goto L7;
        if (r0 <= 0) goto L6;
        this.q.a.push(Long.valueOf(r0));
    L6:
        return r0;
    L7:
        er1.l("the maximum supported array length is 9223372036854775807");
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
        this.q.b();
    }

    public final long f() {
        n();
        byte r0 = this.o.a;
        if (r0 != 0) goto L6;
        boolean r1 = true;
    L8:
        long r2 = s();
        if (r2 < 0) goto L14;
        if (r1 == false) goto L13;
        return r2;
    L13:
        return ~r2;
    L14:
        er1.l("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0;
    L6:
        if (r0 != 32) goto L17;
        r1 = false;
        goto L8
    L17:
        kf2.o(f34.f((r0 >> 5) & 7, "expected major type 0 or 1 but found "));
        return 0;
    }

    public final long j() {
        v((byte) -96);
        u();
        long r0 = s();
        if (r0 >= 0) goto L5;
    L9:
        er1.l("the maximum supported map length is 4611686018427387903L");
        return 0;
    L5:
        if (r0 > 4611686018427387903L) goto L9;
        if (r0 <= 0) goto L8;
        this.q.a.push(Long.valueOf(r0 + r0));
    L8:
        return r0;
    }

    public final bk5 n() {
        if (this.o != null) goto L57;
        int r0 = this.n.read();
        qw r3 = this.q;
        if (r0 != (-1)) goto L8;
        r3.b();
        return null;
    L8:
        bk5 r1 = new bk5(r0);
        this.o = r1;
        long r6 = -2;
        byte r10 = r1.a;
        if (r10 != (-128)) goto L11;
    L38:
        long r2 = r3.d();
        if (r2 != (-1)) goto L41;
        r6 = r2;
    L54:
        mj0.i(b11.k("expected non-string scope but found ", r6));
        return null;
    L41:
        if (r2 == (-2)) goto L54;
    L42:
        long r4 = r3.d();
        ArrayDeque r5 = r3.a;
        if (r4 != 1) goto L45;
        r5.pop();
        goto L57
    L45:
        if (r4 <= 1) goto L48;
        r5.pop();
        r5.push(Long.valueOf(r4 - 1));
        goto L57
    L48:
        if (r4 != (-4)) goto L51;
        r5.pop();
        r5.push(-5L);
        goto L57
    L51:
        if (r4 != (-5)) goto L57;
        r5.pop();
        r5.push(-4L);
        goto L57
    L11:
        if (r10 == (-96)) goto L38;
        if (r10 == (-64)) goto L38;
        if (r10 == (-32)) goto L28;
        if (r10 == 0) goto L38;
        if (r10 == 32) goto L38;
        if (r10 != 64) goto L22;
        r3.c(-1);
        goto L42
    L22:
        if (r10 != 96) goto L24;
        r3.c(-2);
        goto L42
    L24:
        kf2.o(f34.f((r10 >> 5) & 7, "invalid major type: "));
        return null;
    L28:
        if (r1.b != 31) goto L38;
        long r7 = r3.d();
        if (r7 < 0) goto L32;
        mj0.i(b11.k("expected indefinite length scope but found ", r7));
        return null;
    L32:
        if (r7 == (-5)) goto L34;
        r3.a.pop();
        goto L57
    L34:
        mj0.i("expected a value for dangling key in indefinite-length map");
        return null;
    L57:
        return this.o;
    }

    public final boolean q() {
        v((byte) -32);
        if (this.o.b > 24) goto L15;
        int r2 = (int) s();
        if (r2 != 20) goto L9;
        return false;
    L9:
        if (r2 != 21) goto L12;
        return true;
    L12:
        kf2.o("expected FALSE or TRUE");
        return false;
    L15:
        kf2.o("expected simple value");
        return false;
    }

    public final long s() {
        bk5 r1 = this.o;
        byte r2 = r1.b;
        if (r2 >= 24) goto L7;
        long r3 = r2;
        this.o = null;
        return r3;
    L7:
        if (r2 != 24) goto L14;
        int r4 = this.n.read();
        if (r4 == (-1)) goto L13;
        this.o = null;
        return ((long) r4) & 255;
    L13:
        throw new EOFException();
    L14:
        byte[] r11 = this.p;
        if (r2 != 25) goto L19;
        F(2, r11);
        return ((r11[0] & 255) << 8) | (((long) r11[1]) & 255);
    L19:
        if (r2 != 26) goto L23;
        F(4, r11);
        return ((((r11[0] & 255) << 24) | ((r11[1] & 255) << 16)) | ((r11[2] & 255) << 8)) | (((long) r11[3]) & 255);
    L23:
        if (r2 != 27) goto L26;
        F(8, r11);
        long r0 = r11[0];
        long r5 = r11[1];
        long r7 = r11[2];
        long r6 = r11[3];
        long r10 = r11[4];
        long r12 = r11[5];
        long r14 = r11[6];
        long r8 = ((((r5 & 255) << 48) | ((r0 & 255) << 56)) | ((r7 & 255) << 40)) | ((r6 & 255) << 32);
        return (r11[7] & 255) | (((r8 | ((r10 & 255) << 24)) | ((r12 & 255) << 16)) | ((r14 & 255) << 8));
    L26:
        mj0.i(xa3.e(r2, (r1.a >> 5) & 7, "invalid additional information ", " for major type "));
        return 0;
    }

    public final void u() {
        n();
        byte r1 = this.o.b;
        if (r1 == 31) goto L5;
        return;
    L5:
        kf2.o(f34.f(r1, "expected definite length but found "));
    }

    public final void v(byte r3) {
        n();
        byte r2 = this.o.a;
        if (r2 != r3) goto L5;
        return;
    L5:
        kf2.o(xa3.e((r3 >> 5) & 7, (r2 >> 5) & 7, "expected major type ", " but found "));
    }
}
