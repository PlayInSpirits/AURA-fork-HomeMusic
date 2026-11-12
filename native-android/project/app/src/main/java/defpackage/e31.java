package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e31 extends a31 {
    public e31(InputStream r1) {
        super(r1);
        if (r1.markSupported() == false) goto L6;
        this.n.mark(Integer.MAX_VALUE);
        return;
    L6:
        kf2.n("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        throw null;
    }

    public final void f(long r4) {
        int r0 = this.p;
        if (r0 <= r4) goto L5;
        this.p = 0;
        this.n.reset();
    L6:
        b((int) r4);
        return;
    L5:
        r4 = r4 - ((long) r0);
        goto L6
    }

    public e31(byte[] r1) {
        super(r1);
        this.n.mark(Integer.MAX_VALUE);
    }
}
