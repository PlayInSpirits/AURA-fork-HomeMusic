package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.MemoryLimitException;
import org.tukaani.xz.LZMAInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l42 extends i90 {
    public static final /* synthetic */ int p = 0;
    public final InputStream o;

    public l42(ByteArrayInputStream byteArrayInputStream) throws MemoryLimitException {
        try {
            this.o = new LZMAInputStream(new df0(byteArrayInputStream), -1);
        } catch (org.tukaani.xz.MemoryLimitException e) {
            throw new MemoryLimitException(e.getMemoryNeeded(), e.getMemoryLimit(), e);
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
        int i = this.o.read();
        b(i == -1 ? 0 : 1);
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return vr1.G(this.o, j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.o.read(bArr, i, i2);
        b(i3);
        return i3;
    }
}
