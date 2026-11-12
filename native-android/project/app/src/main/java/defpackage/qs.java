package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qs implements Closeable {
    public static final long[] r = null;
    public final df0 n;
    public final ByteOrder o;
    public long p;
    public int q;

    static {
        r = new long[64];
        int r1 = 1;
    L4:
        if (r1 > 63) goto L6;
        long[] r2 = r;
        r2[r1] = (r2[r1 - 1] << 1) + 1;
        r1 = r1 + 1;
        goto L4
    }

    public qs(InputStream r3, ByteOrder r4) {
        this.p = 0;
        this.q = 0;
        this.n = new df0(r3);
        this.o = r4;
    }

    public final long b(int r13) {
        if (r13 >= 0) goto L5;
    L31:
        kf2.n("count must not be negative or greater than 63");
        return 0;
    L5:
        if (r13 > 63) goto L31;
    L6:
        int r2 = this.q;
        ByteOrder r3 = this.o;
        df0 r4 = this.n;
        if (r2 >= r13) goto L19;
        if (r2 >= 57) goto L19;
        long r5 = r4.read();
        if (r5 < 0) goto L12;
        ByteOrder r6 = ByteOrder.LITTLE_ENDIAN;
        long r7 = this.p;
        if (r3 != r6) goto L17;
        this.p = (r5 << this.q) | r7;
    L18:
        this.q += 8;
        goto L6
    L17:
        this.p = (r7 << 8) | r5;
        goto L18
    L12:
        return -1;
    L19:
        if (r2 >= r13) goto L30;
        int r8 = r13 - r2;
        int r9 = 8 - r8;
        long r10 = r4.read();
        if (r10 >= 0) goto L23;
        return r10;
    L23:
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        long[] r1 = r;
        if (r3 != r0) goto L26;
        long r11 = r1[r8] & r10;
        this.p = (r11 << this.q) | this.p;
        long r12 = (r10 >>> r8) & r1[r9];
    L27:
        long r14 = r1[r13] & this.p;
        this.p = r12;
        this.q = r9;
        return r14;
    L26:
        long r15 = this.p << r8;
        this.p = r15;
        this.p = r15 | ((r10 >>> r9) & r1[r8]);
        r12 = r1[r9] & r10;
        goto L27
    L30:
        return f(r13);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    public final long f(int r7) {
        ByteOrder r0 = ByteOrder.LITTLE_ENDIAN;
        long r1 = this.p;
        long[] r3 = r;
        if (this.o != r0) goto L5;
        long r4 = r1 & r3[r7];
        this.p = r1 >>> r7;
    L6:
        this.q -= r7;
        return r4;
    L5:
        r4 = (r1 >> (this.q - r7)) & r3[r7];
        goto L6
    }
}
