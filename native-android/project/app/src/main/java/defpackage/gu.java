package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gu extends InputStream {
    public final InputStream n;
    public long o;

    public gu(InputStream r1, long r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] r5, int r6, int r7) {
        if (r7 != 0) goto L5;
        return 0;
    L5:
        long r0 = this.o;
        if (r0 != 0) goto L10;
        return -1;
    L10:
        if (r7 <= r0) goto L12;
        r7 = (int) r0;
    L12:
        int r8 = this.n.read(r5, r6, r7);
        if (r8 < 0) goto L15;
        this.o -= (long) r8;
    L15:
        return r8;
    }

    @Override // java.io.InputStream
    public final long skip(long r3) {
        long r4 = this.n.skip(Math.min(this.o, r3));
        this.o -= r4;
        return r4;
    }

    @Override // java.io.InputStream
    public final int read() {
        long r0 = this.o;
        if (r0 <= 0) goto L6;
        this.o = r0 - 1;
        return this.n.read();
    L6:
        return -1;
    }
}
