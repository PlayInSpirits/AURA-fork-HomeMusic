package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class md0 extends FilterInputStream {
    public final long n;
    public int o;

    public md0(InputStream r1, long r2) {
        super(r1);
        this.n = r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        monitor-enter(this);
        int r0 = (int) Math.max(this.n - ((long) this.o), ((FilterInputStream) this).in.available());
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    public final void b(int r7) {
        int r0 = this.o;
        if (r7 < 0) goto L6;
        this.o = r0 + r7;
        return;
    L6:
        long r2 = this.n;
        if ((r2 - ((long) r0)) > 0) goto L10;
        return;
    L10:
        throw new IOException("Failed to read all expected data, expected: " + r2 + ", but read: " + this.o);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        monitor-enter(this);
        int r0 = super.read();     // Catch: Throwable -> L10
        if (r0 < 0) goto L6;
        int r1 = 1;
    L7:
        b(r1);     // Catch: Throwable -> L10
        monitor-exit(this);
        return r0;
    L6:
        r1 = -1;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] r1, int r2, int r3) {
        monitor-enter(this);
        int r4 = super.read(r1, r2, r3);     // Catch: Throwable -> L6
        b(r4);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r4;
    L6:
        th = move-exception;
        throw th;
    }
}
