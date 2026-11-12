package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n21 extends InputStream {
    public static final ArrayDeque p = null;
    public aw3 n;
    public IOException o;

    static {
        p = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.n.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.n.close();
    }

    @Override // java.io.InputStream
    public final void mark(int r1) {
        this.n.mark(r1);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.n.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.n.read();
    L4:
        e = move-exception;
        this.o = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        this.n.reset();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final long skip(long r2) {
        return this.n.skip(r2);
    L4:
        e = move-exception;
        this.o = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2) {
        return this.n.read(r2);
    L4:
        e = move-exception;
        this.o = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        return this.n.read(r2, r3, r4);
    L4:
        e = move-exception;
        this.o = e;
        throw e;
    }
}
