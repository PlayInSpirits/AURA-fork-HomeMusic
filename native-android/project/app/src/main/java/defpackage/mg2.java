package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mg2 extends FilterInputStream {
    public int n;

    public mg2(n21 n21Var) {
        super(n21Var);
        this.n = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.n;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long b(long j) {
        int i = this.n;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void f(long j) {
        int i = this.n;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.n = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.n = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (b(1L) == -1) {
            return -1;
        }
        int i = super.read();
        f(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.n = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jB = b(j);
        if (jB == -1) {
            return 0L;
        }
        long jSkip = super.skip(jB);
        f(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iB = (int) b(i2);
        if (iB == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iB);
        f(i3);
        return i3;
    }
}
