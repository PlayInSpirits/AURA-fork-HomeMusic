package defpackage;

import java.io.ByteArrayInputStream;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mv extends i90 {
    public final BrotliInputStream o;

    public mv(ByteArrayInputStream byteArrayInputStream) {
        this.o = new BrotliInputStream(new df0(byteArrayInputStream));
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.o.close();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.o.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.o.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.o.read();
        b(i == -1 ? 0 : 1);
        return i;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.o.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return vr1.G(this.o, j);
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.o.read(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.o.read(bArr, i, i2);
        b(i3);
        return i3;
    }
}
