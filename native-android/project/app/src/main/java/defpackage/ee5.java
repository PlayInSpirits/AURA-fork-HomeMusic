package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.tukaani.xz.MemoryLimitException;
import org.tukaani.xz.SingleXZInputStream;
import org.tukaani.xz.XZ;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ee5 extends i90 {
    public final InputStream o;

    public ee5(ByteArrayInputStream r3) {
        this.o = new SingleXZInputStream(new df0(r3), -1);
    }

    public static void f() {
        if (XZ.HEADER_MAGIC.length <= 0) goto L6;
        return;
    L6:
        if (XZ.HEADER_MAGIC.length > 0) goto L9;
        return;
    L9:
        throw null;
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
    public final int read() {
        int r0 = this.o.read();     // Catch: MemoryLimitException -> L8
        int r1 = -1;
        if (r0 == (-1)) goto L6;
        r1 = 1;
    L6:
        b(r1);     // Catch: MemoryLimitException -> L8
        return r0;
    L8:
        e = move-exception;
        throw new org.apache.commons.compress.MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
    }

    @Override // java.io.InputStream
    public final long skip(long r3) {
        return vr1.G(this.o, r3);
    L4:
        e = move-exception;
        throw new org.apache.commons.compress.MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        if (r4 != 0) goto L10;
        return 0;
    L10:
        int r5 = this.o.read(r2, r3, r4);     // Catch: MemoryLimitException -> L7
        b(r5);     // Catch: MemoryLimitException -> L7
        return r5;
    L7:
        e = move-exception;
        throw new org.apache.commons.compress.MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
    }
}
