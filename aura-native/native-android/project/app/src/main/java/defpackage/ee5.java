package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.MemoryLimitException;
import org.tukaani.xz.SingleXZInputStream;
import org.tukaani.xz.XZ;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ee5 extends i90 {
    public final InputStream o;

    public ee5(ByteArrayInputStream byteArrayInputStream) {
        this.o = new SingleXZInputStream(new df0(byteArrayInputStream), -1);
    }

    public static void f() {
        if (XZ.HEADER_MAGIC.length <= 0 && XZ.HEADER_MAGIC.length > 0) {
            throw null;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.o.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.o.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            int i = this.o.read();
            int i2 = -1;
            if (i != -1) {
                i2 = 1;
            }
            b(i2);
            return i;
        } catch (MemoryLimitException e) {
            throw new org.apache.commons.compress.MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws org.apache.commons.compress.MemoryLimitException {
        try {
            return vr1.G(this.o, j);
        } catch (MemoryLimitException e) {
            throw new org.apache.commons.compress.MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            int i3 = this.o.read(bArr, i, i2);
            b(i3);
            return i3;
        } catch (MemoryLimitException e) {
            throw new org.apache.commons.compress.MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
        }
    }
}
