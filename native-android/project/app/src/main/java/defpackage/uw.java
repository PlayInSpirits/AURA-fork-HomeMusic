package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uw extends InputStream {
    public final ByteBuffer n;
    public int o;

    public uw(ByteBuffer r2) {
        this.o = -1;
        this.n = r2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.n.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r1) {
        monitor-enter(this);
        this.o = this.n.position();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        ByteBuffer r1 = this.n;
        if (r1.hasRemaining() == true) goto L6;
        return -1;
    L6:
        int r5 = Math.min(r4, r1.remaining());
        r1.get(r2, r3, r5);
        return r5;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        int r0 = this.o;     // Catch: Throwable -> L8
        if (r0 == (-1)) goto L11;
        this.n.position(r0);     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L11:
        throw new IOException("Cannot reset to unset mark position");     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final long skip(long r3) {
        ByteBuffer r2 = this.n;
        if (r2.hasRemaining() == true) goto L6;
        return -1;
    L6:
        long r4 = Math.min(r3, r2.remaining());
        r2.position((int) (((long) r2.position()) + r4));
        return r4;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer r1 = this.n;
        if (r1.hasRemaining() == true) goto L7;
        return -1;
    L7:
        return r1.get() & 255;
    }
}
