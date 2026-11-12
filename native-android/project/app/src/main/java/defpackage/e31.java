package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e31 extends a31 {
    public e31(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.n.mark(Integer.MAX_VALUE);
        } else {
            kf2.n("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void f(long j) throws IOException {
        int i = this.p;
        if (i > j) {
            this.p = 0;
            this.n.reset();
        } else {
            j -= (long) i;
        }
        b((int) j);
    }

    public e31(byte[] bArr) {
        super(bArr);
        this.n.mark(Integer.MAX_VALUE);
    }
}
