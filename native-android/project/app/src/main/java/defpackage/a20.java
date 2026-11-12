package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.Checksum;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a20 extends InputStream {
    public final gu n;
    public final Checksum o;

    public a20(Checksum checksum, gu guVar) {
        Objects.requireNonNull(checksum, "checksum");
        this.o = checksum;
        this.n = guVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.n.read(bArr, i, i2);
        if (i3 >= 0) {
            this.o.update(bArr, i, i3);
        }
        return i3;
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
        int i = this.n.read();
        if (i >= 0) {
            this.o.update(i);
        }
        return i;
    }
}
