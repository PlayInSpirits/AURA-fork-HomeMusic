package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j31 extends FilterInputStream {
    public static final byte[] p = null;
    public static final int q = 0;
    public final byte n;
    public int o;

    static {
        p = new byte[]{-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        q = 31;
    }

    public j31(InputStream r1, int r2) {
        super(r1);
        if (r2 >= (-1)) goto L5;
    L8:
        kf2.n(f34.f(r2, "Cannot add invalid orientation: "));
        throw null;
    L5:
        if (r2 > 8) goto L8;
        this.n = (byte) r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r4, int r5, int r6) {
        int r0 = this.o;
        int r1 = q;
        if (r0 <= r1) goto L5;
        int r7 = super.read(r4, r5, r6);
    L11:
        if (r7 <= 0) goto L13;
        this.o += r7;
    L13:
        return r7;
    L5:
        if (r0 != r1) goto L8;
        r4[r5] = this.n;
        r7 = 1;
        goto L11
    L8:
        if (r0 >= 2) goto L10;
        r7 = super.read(r4, r5, 2 - r0);
        goto L11
    L10:
        int r8 = Math.min(r1 - r0, r6);
        System.arraycopy(p, this.o - 2, r4, r5, r8);
        r7 = r8;
        goto L11
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
        long r4 = super.skip(r3);
        if (r4 <= 0) goto L5;
        this.o = (int) (((long) this.o) + r4);
    L5:
        return r4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int r0 = this.o;
        if (r0 < 2) goto L10;
        int r2 = q;
        if (r0 > r2) goto L10;
        if (r0 != r2) goto L9;
        int r1 = this.n;
    L12:
        if (r1 == (-1)) goto L14;
        this.o++;
    L14:
        return r1;
    L9:
        r1 = p[r0 - 2] & 255;
    L10:
        r1 = super.read();
        goto L12
    }
}
