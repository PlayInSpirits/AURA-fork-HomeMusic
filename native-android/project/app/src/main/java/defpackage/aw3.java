package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class aw3 extends FilterInputStream {
    public volatile byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public final qj0 s;

    public aw3(InputStream r2, qj0 r3) {
        super(r2);
        this.q = -1;
        this.s = r3;
        this.n = (byte[]) r3.d(65536, byte[].class);
    }

    public static void j() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        monitor-enter(this);
        InputStream r0 = ((FilterInputStream) this).in;     // Catch: Throwable -> L10
        if (this.n == null) goto L12;
        if (r0 == null) goto L12;
        int r1 = (this.o - this.r) + r0.available();
        monitor-exit(this);
        return r1;
    L12:
        j();     // Catch: Throwable -> L10
        throw null;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public final int b(InputStream r6, byte[] r7) {
        int r0 = this.q;
        if (r0 == (-1)) goto L25;
        int r3 = this.r - r0;
        int r4 = this.p;
        if (r3 >= r4) goto L25;
        if (r0 == 0) goto L9;
    L17:
        if (r0 <= 0) goto L19;
        System.arraycopy(r7, r0, r7, 0, r7.length - r0);
    L19:
        int r1 = this.r - this.q;
        this.r = r1;
        this.q = 0;
        this.o = 0;
        int r8 = r6.read(r7, r1, r7.length - r1);
        int r9 = this.r;
        if (r8 <= 0) goto L23;
        r9 = r9 + r8;
    L23:
        this.o = r9;
        return r8;
    L9:
        if (r4 <= r7.length) goto L17;
        if (this.o != r7.length) goto L17;
        int r2 = r7.length * 2;
        if (r2 > r4) goto L16;
        r4 = r2;
    L16:
        byte[] r5 = (byte[]) this.s.d(r4, byte[].class);
        System.arraycopy(r7, 0, r5, 0, r7.length);
        this.n = r5;
        this.s.h(r7);
        r7 = r5;
    L25:
        int r10 = r6.read(r7);
        if (r10 <= 0) goto L28;
        this.q = -1;
        this.r = 0;
        this.o = r10;
    L28:
        return r10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n == null) goto L5;
        this.s.h(this.n);
        this.n = null;
    L5:
        InputStream r0 = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (r0 == null) goto L9;
        r0.close();
        return;
    }

    public final synchronized void f() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.n == null) goto L9;
        this.s.h(this.n);     // Catch: Throwable -> L7
        this.n = null;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r2) {
        monitor-enter(this);
        this.p = Math.max(this.p, r2);     // Catch: Throwable -> L6
        this.q = this.r;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] r7, int r8, int r9) {
        monitor-enter(this);
        byte[] r0 = this.n;     // Catch: Throwable -> L23
        if (r0 == null) goto L69;
        if (r9 != 0) goto L10;
        monitor-exit(this);
        return 0;
    L10:
        InputStream r2 = ((FilterInputStream) this).in;     // Catch: Throwable -> L23
        if (r2 == null) goto L67;
        int r3 = this.r;     // Catch: Throwable -> L23
        int r4 = this.o;     // Catch: Throwable -> L23
        if (r3 >= r4) goto L27;
        int r5 = r4 - r3;     // Catch: Throwable -> L23
        if (r5 < r9) goto L17;
        r5 = r9;
    L17:
        System.arraycopy(r0, r3, r7, r8, r5);     // Catch: Throwable -> L23
        this.r += r5;     // Catch: Throwable -> L23
        if (r5 != r9) goto L20;
    L25:
        monitor-exit(this);
        return r5;
    L20:
        if (r2.available() == 0) goto L25;
        r8 = r8 + r5;
        int r6 = r9 - r5;
    L28:
        int r10 = -1;
        if (this.q != (-1)) goto L40;
        if (r6 < r0.length) goto L40;
        int r11 = r2.read(r7, r8, r6);     // Catch: Throwable -> L23
        if (r11 == (-1)) goto L34;
    L57:
        r6 = r6 - r11;
        if (r6 == 0) goto L59;
        if (r2.available() == 0) goto L63;
        r8 = r8 + r11;
        goto L28
    L63:
        int r12 = r9 - r6;
        monitor-exit(this);
        return r12;
    L59:
        monitor-exit(this);
        return r9;
    L34:
        if (r6 == r9) goto L37;
        r10 = r9 - r6;
    L37:
        monitor-exit(this);
        return r10;
    L40:
        if (b(r2, r0) == (-1)) goto L41;
        if (r0 == this.n) goto L53;
        r0 = this.n;     // Catch: Throwable -> L23
        if (r0 != null) goto L53;
        j();     // Catch: Throwable -> L23
        throw null;     // Catch: Throwable -> L23
    L53:
        int r13 = this.o;     // Catch: Throwable -> L23
        int r14 = this.r;     // Catch: Throwable -> L23
        r11 = r13 - r14;     // Catch: Throwable -> L23
        if (r11 < r6) goto L56;
        r11 = r6;
    L56:
        System.arraycopy(r0, r14, r7, r8, r11);     // Catch: Throwable -> L23
        this.r += r11;     // Catch: Throwable -> L23
        goto L57
    L41:
        if (r6 == r9) goto L44;
        r10 = r9 - r6;
    L44:
        monitor-exit(this);
        return r10;
    L27:
        r6 = r9;
        goto L28
    L67:
        j();     // Catch: Throwable -> L23
        throw null;     // Catch: Throwable -> L23
    L69:
        j();     // Catch: Throwable -> L23
        throw null;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.n == null) goto L16;
        int r1 = this.q;     // Catch: Throwable -> L11
        if ((-1) == r1) goto L14;
        this.r = r1;     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L14:
        throw new zv3("Mark has been invalidated, pos: " + this.r + " markLimit: " + this.p);     // Catch: Throwable -> L11
    L16:
        throw new IOException("Stream is closed");     // Catch: Throwable -> L11
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long r11) {
        monitor-enter(this);
        if (r11 >= 1) goto L49;
        monitor-exit(this);
        return 0;
    L49:
        byte[] r0 = this.n;     // Catch: Throwable -> L16
        if (r0 == null) goto L45;
        InputStream r4 = ((FilterInputStream) this).in;     // Catch: Throwable -> L16
        if (r4 == null) goto L43;
        int r3 = this.o;     // Catch: Throwable -> L16
        int r5 = this.r;     // Catch: Throwable -> L16
        if ((r3 - r5) < r11) goto L18;
        this.r = (int) (((long) r5) + r11);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r11;
    L18:
        long r6 = ((long) r3) - ((long) r5);
        this.r = r3;     // Catch: Throwable -> L16
        if (this.q == (-1)) goto L37;
        if (r11 > this.p) goto L37;
        if (b(r4, r0) != (-1)) goto L27;
        monitor-exit(this);
        return r6;
    L27:
        int r1 = this.o;     // Catch: Throwable -> L16
        int r2 = this.r;     // Catch: Throwable -> L16
        if ((r1 - r2) < (r11 - r6)) goto L32;
        this.r = (int) ((((long) r2) + r11) - r6);     // Catch: Throwable -> L16
        monitor-exit(this);
        return r11;
    L32:
        long r7 = (r6 + ((long) r1)) - ((long) r2);
        this.r = r1;     // Catch: Throwable -> L16
        monitor-exit(this);
        return r7;
    L37:
        long r12 = r4.skip(r11 - r6);     // Catch: Throwable -> L16
        if (r12 <= 0) goto L40;
        this.q = -1;     // Catch: Throwable -> L16
    L40:
        long r8 = r6 + r12;
        monitor-exit(this);
        return r8;
    L43:
        j();     // Catch: Throwable -> L16
        throw null;     // Catch: Throwable -> L16
    L45:
        j();     // Catch: Throwable -> L16
        throw null;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        monitor-enter(this);
        byte[] r0 = this.n;     // Catch: Throwable -> L12
        InputStream r1 = ((FilterInputStream) this).in;     // Catch: Throwable -> L12
        if (r0 == null) goto L29;
        if (r1 == null) goto L29;
        if (this.r < this.o) goto L15;
        if (b(r1, r0) != (-1)) goto L15;
        monitor-exit(this);
        return -1;
    L15:
        if (r0 == this.n) goto L21;
        r0 = this.n;     // Catch: Throwable -> L12
        if (r0 != null) goto L21;
        j();     // Catch: Throwable -> L12
        throw null;     // Catch: Throwable -> L12
    L21:
        int r2 = this.o;     // Catch: Throwable -> L12
        int r3 = this.r;     // Catch: Throwable -> L12
        if ((r2 - r3) <= 0) goto L27;
        this.r = r3 + 1;     // Catch: Throwable -> L12
        int r4 = r0[r3] & 255;
        monitor-exit(this);
        return r4;
    L27:
        monitor-exit(this);
        return -1;
    L29:
        j();     // Catch: Throwable -> L12
        throw null;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }
}
