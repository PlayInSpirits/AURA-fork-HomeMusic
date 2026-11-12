package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xb3 extends i90 {
    public static final byte[] q = null;
    public static final int r = 0;
    public final ByteArrayInputStream o;
    public final kx1 p;

    static {
        byte[] r0 = {-54, -2, -48, 13};
        q = r0;
        r = r0.length;
    }

    public xb3(ByteArrayInputStream r3) {
        this.o = r3;
        kx1 r0 = new kx1(new ByteArrayOutputStream());
        this.p = r0;
        JarOutputStream r2 = new JarOutputStream(r0);
        Pack200.newUnpacker().unpack(new f40(r3), r2);     // Catch: Throwable -> L6
        r2.close();
        return;
    L6:
        th = move-exception;
        throw th;     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L11
    L13:
        throw th;
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.p.b().available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kx1 r0 = this.p;     // Catch: Throwable -> L16
        r0.close();     // Catch: Throwable -> L16
        Object r1 = r0.o;     // Catch: Throwable -> L16
        monitor-enter(r1);     // Catch: Throwable -> L16
        InputStream r2 = r0.n;     // Catch: Throwable -> L7
        if (r2 == null) goto L9;
        r2.close();     // Catch: Throwable -> L7
        r0.n = null;     // Catch: Throwable -> L7
    L9:
        monitor-exit(r1);     // Catch: Throwable -> L7
        ByteArrayInputStream r3 = this.o;
        if (r3 == null) goto L24;
        r3.close();
        return;
    L24:
        return;
    L7:
        th = move-exception;
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        ByteArrayInputStream r4 = this.o;
        if (r4 == null) goto L20;
        r4.close();
    L20:
        throw th;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r2) {
        monitor-enter(this);
        this.p.b().mark(r2);     // Catch: Throwable -> L6 IOException -> L8
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    L8:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: Throwable -> L6
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.p.b().markSupported();
    L4:
        return false;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.p.b().read();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        this.p.b().reset();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final long skip(long r1) {
        return vr1.G(this.p.b(), r1);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r1) {
        return this.p.b().read(r1);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r1, int r2, int r3) {
        return this.p.b().read(r1, r2, r3);
    }
}
