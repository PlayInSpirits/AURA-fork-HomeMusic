package defpackage;

import java.io.ByteArrayInputStream;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mv extends i90 {
    public final BrotliInputStream o;

    public mv(ByteArrayInputStream r3) {
        this.o = new BrotliInputStream(new df0(r3));
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
    public final synchronized void mark(int r2) {
        monitor-enter(this);
        this.o.mark(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.o.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        int r0 = this.o.read();
        if (r0 != (-1)) goto L5;
        int r1 = 0;
    L6:
        b(r1);
        return r0;
    L5:
        r1 = 1;
        goto L6
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        this.o.reset();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final long skip(long r1) {
        return vr1.G(this.o, r1);
    }

    public final String toString() {
        return this.o.toString();
    }

    @Override // java.io.InputStream
    public final int read(byte[] r1) {
        return this.o.read(r1);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        int r5 = this.o.read(r2, r3, r4);
        b(r5);
        return r5;
    }
}
