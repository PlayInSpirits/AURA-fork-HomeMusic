package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class df0 extends FilterInputStream {
    public long n;

    public df0(InputStream r1) {
        super(r1);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        if (r5 != 0) goto L5;
        return 0;
    L5:
        int r6 = ((FilterInputStream) this).in.read(r3, r4, r5);
        if (r6 < 0) goto L10;
        long r7 = r6;
        if (r7 == (-1)) goto L10;
        this.n += r7;
    L10:
        return r6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int r0 = ((FilterInputStream) this).in.read();
        if (r0 < 0) goto L5;
        this.n++;
    L5:
        return r0;
    }
}
