package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class re1 extends i90 {
    public static final byte[] z = null;
    public final PushbackInputStream o;
    public final int p;
    public bh4 q;
    public final byte[] r;
    public boolean s;
    public boolean t;
    public int u;
    public long v;
    public final int w;
    public final es3 x;
    public final zg5 y;

    static {
        z = new byte[]{-1, 6, 0, 0, 115, 78, 97, 80, 112, 89};
    }

    public re1(ByteArrayInputStream r4) {
        this.r = new byte[1];
        this.v = -1;
        es3 r1 = new es3();
        r1.a = -1;
        this.x = r1;
        this.y = new zg5(this);
        this.o = new PushbackInputStream(new df0(r4), 1);
        this.w = 32768;
        this.p = 1;
        n();
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.t == true) goto L5;
        bh4 r1 = this.q;
        if (r1 != null) goto L9;
        return 0;
    L9:
        return r1.available();
    L5:
        return Math.min(this.u, this.o.available());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PushbackInputStream r0 = this.o;
        bh4 r1 = this.q;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.close();     // Catch: Throwable -> L7
        this.q = null;     // Catch: Throwable -> L7
    L9:
        r0.close();
        return;
    L7:
        th = move-exception;
        r0.close();
        throw th;
    }

    public final void f() {
        long r1 = this.v;
        es3 r6 = this.x;
        if (r1 >= 0) goto L5;
    L9:
        this.v = -1;
        r6.a = -1;
        this.t = false;
        PushbackInputStream r7 = this.o;
        int r8 = r7.read();
        if (r8 == (-1)) goto L12;
        b(1);
        int r9 = r8 & 255;
    L13:
        boolean r12 = true;
        if (r9 != (-1)) goto L17;
        this.s = true;
        return;
    L17:
        if (r9 != 255) goto L20;
        r7.unread(r9);
        this.n--;
        n();
        f();
        return;
    L20:
        zg5 r11 = this.y;
        if (r9 != 254) goto L23;
    L71:
        int r2 = (int) gh0.k(r11, 3);
        if (r2 < 0) goto L79;
        long r3 = r2;
        long r4 = vr1.G(r7, r3);
        b(r4);
        if (r4 != r3) goto L77;
        f();
        return;
    L77:
        mj0.i("Premature end of stream");
        return;
    L79:
        mj0.i("Found illegal chunk with negative size");
        return;
    L23:
        if (r9 <= 127) goto L28;
        if (r9 <= 253) goto L71;
    L28:
        if (r9 < 2) goto L34;
        if (r9 > 127) goto L34;
        StringBuilder r5 = f34.j(r9, "Unskippable chunk with type ", " (hex ");
        r5.append(Integer.toHexString(r9));
        r5.append(") detected.");
        throw new IOException(r5.toString());
    L34:
        if (r9 != 1) goto L45;
        this.t = true;
        int r10 = ((int) gh0.k(r11, 3)) - 4;
        this.u = r10;
        if (r10 < 0) goto L43;
        byte[] r13 = new byte[4];
        int r14 = vr1.D(r7, r13, 0, 4);
        b(r14);
        if (r14 != 4) goto L41;
        long r15 = (gh0.m(r13, 0, 4) - 2726488792L) & 4294967295L;
        this.v = ((r15 << 15) | (r15 >> 17)) & 4294967295L;
        return;
    L41:
        mj0.i("Premature end of stream");
        return;
    L43:
        mj0.i("Found illegal chunk with negative size");
        return;
    L45:
        if (r9 != 0) goto L69;
        int r16 = this.p;
        if (r16 == 1) goto L52;
        if (r16 != 2) goto L51;
        r12 = false;
        goto L52
    L51:
        throw null;
    L52:
        long r17 = (int) gh0.k(r11, 3);
        if (r12 == false) goto L55;
        long r22 = 4;
    L56:
        long r18 = r17 - r22;
        if (r18 < 0) goto L67;
        if (r12 == false) goto L64;
        byte[] r19 = new byte[4];
        int r20 = vr1.D(r7, r19, 0, 4);
        b(r20);
        if (r20 != 4) goto L62;
        long r21 = (gh0.m(r19, 0, 4) - 2726488792L) & 4294967295L;
        this.v = ((r21 << 15) | (r21 >> 17)) & 4294967295L;
    L65:
        bh4 r23 = new bh4(new gu(r7, r18), this.w);
        this.q = r23;
        b(r23.n);
        return;
    L62:
        mj0.i("Premature end of stream");
        return;
    L64:
        this.v = -1;
        goto L65
    L67:
        mj0.i("Found illegal chunk with negative size");
        return;
    L55:
        r22 = 0;
        goto L56
    L69:
        mj0.i(b11.j(r9, "Unknown chunk type ", " detected."));
        return;
    L12:
        r9 = -1;
        goto L13
    L5:
        if (r1 == r6.getValue()) goto L9;
        mj0.i("Checksum verification failed");
    }

    public final int j(byte[] r5, int r6, int r7) {
        int r1 = -1;
        if (this.t == false) goto L11;
        int r8 = Math.min(this.u, r7);
        if (r8 != 0) goto L7;
        return -1;
    L7:
        int r9 = this.o.read(r5, r6, r8);
        if (r9 == (-1)) goto L10;
        this.u -= r9;
        b(r9);
    L10:
        r1 = r9;
    L17:
        if (r1 <= 0) goto L19;
        this.x.update(r5, r6, r1);
    L19:
        return r1;
    L11:
        bh4 r0 = this.q;
        if (r0 == null) goto L17;
        long r2 = r0.n;
        r9 = r0.read(r5, r6, r7);
        bh4 r3 = this.q;
        if (r9 != (-1)) goto L16;
        r3.close();
        this.q = null;
        goto L10
    L16:
        b(r3.n - r2);
        goto L10
    }

    public final void n() {
        byte[] r1 = new byte[10];
        int r2 = vr1.D(this.o, r1, 0, 10);
        b(r2);
        if (10 == r2) goto L5;
    L7:
        mj0.i("Not a framed Snappy stream");
        return;
    L5:
        if (Arrays.equals(r1, z) == false) goto L7;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        if (r5 != 0) goto L5;
        return 0;
    L5:
        int r0 = j(r3, r4, r5);
        if (r0 != (-1)) goto L12;
        f();
        if (this.s == false) goto L11;
        return -1;
    L11:
        return j(r3, r4, r5);
    L12:
        return r0;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r1 = this.r;
        if (read(r1, 0, 1) != (-1)) goto L6;
        return -1;
    L6:
        return r1[0] & 255;
    }
}
