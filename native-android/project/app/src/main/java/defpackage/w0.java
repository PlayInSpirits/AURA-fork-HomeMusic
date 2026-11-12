package defpackage;

import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends i90 {
    public final int o;
    public final byte[] p;
    public int q;
    public int r;
    public final df0 s;
    public long t;
    public int u;
    public final byte[] v;
    public final hg3 w;

    public w0(InputStream r3, int r4) {
        this.v = new byte[1];
        this.w = new hg3(2, this);
        this.s = new df0(r3);
        if (r4 <= 0) goto L6;
        this.o = r4;
        this.p = new byte[r4 * 3];
        this.r = 0;
        this.q = 0;
        this.t = 0;
        return;
    L6:
        kf2.n("windowSize must be bigger than 0");
        throw null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.q - this.r;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
    }

    public final int f(byte[] r8, int r9, int r10) {
        int r0 = available();
        if (r10 <= r0) goto L20;
        int r1 = (int) Math.min(r10 - r0, this.t);
        byte[] r2 = this.p;
        int r3 = Math.min(r1, r2.length - this.q);
        if (r3 == 0) goto L18;
        int r4 = this.u;
        if (r4 != 1) goto L10;
        int r5 = this.q;
        Arrays.fill(r2, r5, r5 + r3, r2[r5 - 1]);
        this.q += r3;
        goto L18
    L10:
        if (r3 >= r4) goto L12;
        int r6 = this.q;
        System.arraycopy(r2, r6 - r4, r2, r6, r3);
        this.q += r3;
        goto L18
    L12:
        int r7 = r3 / r4;
        int r11 = 0;
    L13:
        if (r11 >= r7) goto L15;
        int r12 = this.q;
        int r13 = this.u;
        System.arraycopy(r2, r12 - r13, r2, r12, r13);
        this.q += this.u;
        r11 = r11 + 1;
        goto L13
    L15:
        int r14 = this.u;
        int r15 = r3 - (r7 * r14);
        if (r15 <= 0) goto L18;
        int r16 = this.q;
        System.arraycopy(r2, r16 - r14, r2, r16, r15);
        this.q += r15;
    L18:
        this.t -= (long) r3;
    L20:
        return j(r8, r9, r10);
    }

    public final int j(byte[] r3, int r4, int r5) {
        int r6 = Math.min(r5, available());
        if (r6 <= 0) goto L7;
        int r0 = this.r;
        byte[] r1 = this.p;
        System.arraycopy(r1, r0, r3, r4, r6);
        int r7 = this.r + r6;
        this.r = r7;
        int r8 = this.o;
        int r2 = r8 * 2;
        if (r7 <= r2) goto L7;
        System.arraycopy(r1, r8, r1, 0, r2);
        this.q -= r8;
        this.r -= r8;
    L7:
        return r6;
    }

    public final int n(byte[] r6, int r7, int r8) {
        int r0 = available();
        if (r8 <= r0) goto L14;
        int r1 = (int) Math.min(r8 - r0, this.t);
        byte[] r2 = this.p;
        int r3 = Math.min(r1, r2.length - this.q);
        if (r3 <= 0) goto L7;
        int r4 = vr1.D(this.s, r2, this.q, r3);
    L8:
        b(r4);
        if (r3 != r4) goto L11;
        this.q += r3;
        this.t -= (long) r3;
        goto L14
    L11:
        mj0.i("Premature end of stream reading literal");
        return 0;
    L7:
        r4 = 0;
    L14:
        return j(r6, r7, r8);
    }

    public final int q() {
        int r0 = this.s.read();
        if (r0 == (-1)) goto L6;
        b(1);
        return r0 & 255;
    L6:
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] r1 = this.v;
        if (read(r1, 0, 1) != (-1)) goto L6;
        return -1;
    L6:
        return r1[0] & 255;
    }

    public final void s(int r3, long r4) {
        if (r3 > 0) goto L4;
    L11:
        kf2.n("offset must be bigger than 0 but not bigger than the number of bytes available for back-references");
        return;
    L4:
        if (r3 > this.q) goto L11;
        if (r4 < 0) goto L9;
        this.u = r3;
        this.t = r4;
        return;
    L9:
        kf2.n("length must not be negative");
    }
}
