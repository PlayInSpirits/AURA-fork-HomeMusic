package defpackage;

import java.io.FilterInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mg2 extends FilterInputStream {
    public int n;

    public mg2(n21 r1) {
        super(r1);
        this.n = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int r0 = this.n;
        if (r0 != Integer.MIN_VALUE) goto L7;
        return super.available();
    L7:
        return Math.min(r0, super.available());
    }

    public final long b(long r3) {
        int r2 = this.n;
        if (r2 != 0) goto L7;
        return -1;
    L7:
        if (r2 != Integer.MIN_VALUE) goto L9;
    L12:
        return r3;
    L9:
        if (r3 <= r2) goto L12;
        return r2;
    }

    public final void f(long r4) {
        int r0 = this.n;
        if (r0 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (r4 == (-1)) goto L9;
        this.n = (int) (((long) r0) - r4);
        return;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r1) {
        monitor-enter(this);
        super.mark(r1);     // Catch: Throwable -> L6
        this.n = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (b(1) != (-1)) goto L6;
        return -1;
    L6:
        int r2 = super.read();
        f(1);
        return r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        super.reset();     // Catch: Throwable -> L6
        this.n = Integer.MIN_VALUE;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
        long r4 = b(r3);
        if (r4 != (-1)) goto L6;
        return 0;
    L6:
        long r5 = super.skip(r4);
        f(r5);
        return r5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        int r6 = (int) b(r5);
        if (r6 != (-1)) goto L5;
        return -1;
    L5:
        int r7 = super.read(r3, r4, r6);
        f(r7);
        return r7;
    }
}
