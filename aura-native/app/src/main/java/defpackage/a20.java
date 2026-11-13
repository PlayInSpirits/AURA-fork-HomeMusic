package defpackage;

import java.io.InputStream;
import java.util.Objects;
import java.util.zip.Checksum;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a20 extends InputStream {
    public final gu n;
    public final Checksum o;

    public a20(Checksum checksum, gu guVar) {
        Objects.requireNonNull(checksum, "checksum");
        this.o = checksum;
        this.n = guVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int read = this.n.read(bArr, i, i2);
        if (read >= 0) {
            this.o.update(bArr, i, read);
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return read() >= 0 ? 1L : 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.n.read();
        if (read >= 0) {
            this.o.update(read);
        }
        return read;
    }
}
