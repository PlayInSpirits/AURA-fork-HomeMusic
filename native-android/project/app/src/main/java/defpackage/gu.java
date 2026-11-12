package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gu extends InputStream {
    public final InputStream n;
    public long o;

    public gu(InputStream inputStream, long j) {
        this.n = inputStream;
        this.o = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.o;
        if (j == 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        int i3 = this.n.read(bArr, i, i2);
        if (i3 >= 0) {
            this.o -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.n.skip(Math.min(this.o, j));
        this.o -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.o;
        if (j <= 0) {
            return -1;
        }
        this.o = j - 1;
        return this.n.read();
    }
}
