package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.tukaani.xz.LZMAInputStream;
import org.tukaani.xz.MemoryLimitException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l42 extends i90 {
    public static final /* synthetic */ int p = 0;
    public final InputStream o;

    public l42(ByteArrayInputStream r4) {
        this.o = new LZMAInputStream(new df0(r4), -1);     // Catch: MemoryLimitException -> L5
        return;
    L5:
        e = move-exception;
        throw new org.apache.commons.compress.MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
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
    public final long skip(long r1) {
        return vr1.G(this.o, r1);
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        int r5 = this.o.read(r2, r3, r4);
        b(r5);
        return r5;
    }
}
