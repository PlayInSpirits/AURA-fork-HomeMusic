package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 extends i90 {
    public static final byte[] B = null;
    public static final byte[] C = null;
    public byte[] A;
    public final byte[] o;
    public final hg3 p;
    public final df0 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public InputStream v;
    public boolean w;
    public boolean x;
    public final de5 y;
    public final de5 z;

    static {
        B = new byte[]{4, 34, 77, 24};
        C = new byte[]{42, 77, 24};
    }

    public qe1(ByteArrayInputStream r11) {
        boolean r0 = true;
        this.o = new byte[1];
        this.p = new hg3(20, this);
        this.y = new de5();
        this.z = new de5();
        this.q = new df0(r11);
        df0 r12 = this.q;
        byte[] r2 = new byte[4];
        int r4 = vr1.D(r12, r2, 0, 4);
        b(r4);
        if (4 != r4) goto L71;
        int r5 = 4;
    L5:
        if (r5 != 4) goto L22;
        if ((r2[0] & 80) != 80) goto L22;
        int r6 = 1;
    L10:
        if (r6 >= 4) goto L15;
        if (r2[r6] != C[r6 - 1]) goto L22;
        r6 = r6 + 1;
        goto L10
    L15:
        long r7 = gh0.k(this.p, 4);
        if (r7 < 0) goto L21;
        long r8 = vr1.G(r12, r7);
        b(r8);
        if (r7 != r8) goto L20;
        r5 = vr1.D(r12, r2, 0, 4);
        b(r5);
        goto L5
    L20:
        mj0.i("Premature end of stream while skipping frame");
        return;
    L21:
        mj0.i("Found illegal skippable frame with negative size");
        return;
    L22:
        if (4 == r5) goto L24;
    L70:
        mj0.i("Not a LZ4 frame stream");
        return;
    L24:
        if (Arrays.equals(r2, B) == false) goto L70;
        de5 r3 = this.y;
        int r9 = n();
        if (r9 == (-1)) goto L69;
        r3.update(r9);
        if ((r9 & 192) != 64) goto L68;
        if ((r9 & 32) != 0) goto L32;
        boolean r10 = true;
    L33:
        this.s = r10;
        if (r10 == true) goto L36;
        this.A = null;
    L40:
        if ((r9 & 16) == 0) goto L42;
        boolean r13 = true;
    L43:
        this.r = r13;
        if ((r9 & 8) == 0) goto L46;
        boolean r14 = true;
    L47:
        this.t = r14;
        if ((4 & r9) != 0) goto L51;
        r0 = false;
    L51:
        this.u = r0;
        int r1 = n();
        if (r1 == (-1)) goto L66;
        r3.update(r1);
        if (this.t == false) goto L59;
        byte[] r15 = new byte[8];
        int r16 = vr1.D(r12, r15, 0, 8);
        b(r16);
        if (8 != r16) goto L58;
        r3.update(r15, 0, 8);
        goto L59
    L58:
        mj0.i("Premature end of stream while reading content size");
        return;
    L59:
        int r17 = n();
        if (r17 == (-1)) goto L65;
        int r18 = (int) ((r3.getValue() >> 8) & 255);
        r3.reset();
        if (r17 != r18) goto L64;
        f();
        return;
    L64:
        mj0.i("Frame header checksum mismatch");
        return;
    L65:
        mj0.i("Premature end of stream while reading frame header checksum");
        return;
    L66:
        mj0.i("Premature end of stream while reading frame BD byte");
        return;
    L46:
        r14 = false;
        goto L47
    L42:
        r13 = false;
        goto L43
    L36:
        if (this.A != null) goto L40;
        this.A = new byte[65536];
        goto L40
    L32:
        r10 = false;
        goto L33
    L68:
        throw new IOException("Unsupported version " + (r9 >> 6));
    L69:
        mj0.i("Premature end of stream while reading frame flags");
        return;
    L71:
        mj0.i("Not a LZ4 frame stream");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        df0 r0 = this.q;
        InputStream r1 = this.v;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        r1.close();     // Catch: Throwable -> L7
        this.v = null;     // Catch: Throwable -> L7
    L9:
        r0.close();
        return;
    L7:
        th = move-exception;
        r0.close();
        throw th;
    }

    public final void f() {
        InputStream r0 = this.v;
        de5 r1 = this.z;
        if (r0 == null) goto L7;
        r0.close();
        this.v = null;
        if (this.r == false) goto L7;
        q(r1, "block");
        r1.reset();
    L7:
        long r2 = gh0.k(this.p, 4);
        if (((-2147483648L) & r2) == 0) goto L10;
        boolean r3 = true;
    L11:
        int r4 = (int) (r2 & 2147483647L);
        if (r4 < 0) goto L34;
        if (r4 != 0) goto L19;
        boolean r5 = this.u;
        de5 r6 = this.y;
        if (r5 == false) goto L17;
        q(r6, "content");
    L17:
        r6.reset();
        this.w = true;
        return;
    L19:
        gu r7 = new gu(this.q, r4);
        InputStream r8 = r7;
        if (this.r == false) goto L22;
        r8 = new a20(r1, r7);
    L22:
        if (r3 == false) goto L25;
        this.x = true;
        this.v = r8;
        return;
    L25:
        this.x = false;
        gt r9 = new gt(r8);
        if (this.s == false) goto L32;
        byte[] r10 = this.A;
        if (r9.q != 0) goto L30;
        int r11 = Math.min(r9.o, r10.length);
        System.arraycopy(r10, r10.length - r11, r9.p, 0, r11);
        r9.q += r11;
        r9.r += r11;
        goto L32
    L30:
        kf2.o("The stream has already been read from, can't prefill anymore");
        return;
    L32:
        this.v = r9;
        return;
    L34:
        mj0.i("Found illegal block with negative size");
        return;
    L10:
        r3 = false;
        goto L11
    }

    public final int j(byte[] r5, int r6, int r7) {
        boolean r0 = this.x;
        InputStream r1 = this.v;
        if (r0 == false) goto L6;
        int r8 = r1.read(r5, r6, r7);
        b(r8);
        return r8;
    L6:
        gt r2 = (gt) r1;
        long r3 = r2.n;
        int r9 = r1.read(r5, r6, r7);
        b(r2.n - r3);
        return r9;
    }

    public final int n() {
        int r0 = this.q.read();
        if (r0 == (-1)) goto L6;
        b(1);
        return r0 & 255;
    L6:
        return -1;
    }

    public final void q(de5 r7, String r8) {
        byte[] r1 = new byte[4];
        int r2 = vr1.D(this.q, r1, 0, 4);
        b(r2);
        if (4 == r2) goto L5;
        mj0.i(xa3.h("Premature end of stream while reading ", r8, " checksum"));
        return;
    L5:
        if (r7.getValue() != gh0.m(r1, 0, 4)) goto L7;
        return;
    L7:
        mj0.i(r8.concat(" checksum mismatch."));
    }

    @Override // java.io.InputStream
    public final int read(byte[] r5, int r6, int r7) {
        if (r7 != 0) goto L6;
        return 0;
    L6:
        if (this.w == false) goto L8;
        return -1;
    L8:
        int r1 = j(r5, r6, r7);
        if (r1 != (-1)) goto L13;
        f();
        if (this.w == true) goto L13;
        r1 = j(r5, r6, r7);
    L13:
        if (r1 != (-1)) goto L15;
    L25:
        return r1;
    L15:
        if (this.s == false) goto L23;
        int r8 = Math.min(r1, this.A.length);
        if (r8 <= 0) goto L23;
        byte[] r2 = this.A;
        int r3 = r2.length - r8;
        if (r3 <= 0) goto L21;
        System.arraycopy(r2, r8, r2, 0, r3);
    L21:
        System.arraycopy(r5, r6, this.A, r3, r8);
    L23:
        if (this.u == false) goto L25;
        this.y.update(r5, r6, r1);
        goto L25
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r1 = this.o;
        if (read(r1, 0, 1) != (-1)) goto L6;
        return -1;
    L6:
        return r1[0] & 255;
    }
}
