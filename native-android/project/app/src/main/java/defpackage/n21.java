package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n21 extends InputStream {
    public static final ArrayDeque p = new ArrayDeque(0);
    public aw3 n;
    public IOException o;

    @Override // java.io.InputStream
    public final int available() {
        return this.n.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.n.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.n.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.n.read();
        } catch (IOException e) {
            this.o = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.n.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.n.skip(j);
        } catch (IOException e) {
            this.o = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.n.read(bArr);
        } catch (IOException e) {
            this.o = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.n.read(bArr, i, i2);
        } catch (IOException e) {
            this.o = e;
            throw e;
        }
    }
}
