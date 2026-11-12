package defpackage;

import java.io.InputStream;
import java.util.Objects;
import java.util.zip.Checksum;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a20 extends InputStream {
    public final gu n;
    public final Checksum o;

    public a20(Checksum r2, gu r3) {
        Objects.requireNonNull(r2, "checksum");
        this.o = r2;
        this.n = r3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        if (r4 != 0) goto L5;
        return 0;
    L5:
        int r5 = this.n.read(r2, r3, r4);
        if (r5 < 0) goto L8;
        this.o.update(r2, r3, r5);
    L8:
        return r5;
    }

    @Override // java.io.InputStream
    public final long skip(long r1) {
        if (read() < 0) goto L6;
        return 1;
    L6:
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        int r0 = this.n.read();
        if (r0 < 0) goto L5;
        this.o.update(r0);
    L5:
        return r0;
    }
}
