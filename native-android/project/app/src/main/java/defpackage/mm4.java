package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mm4 extends ByteArrayOutputStream {
    public final /* synthetic */ nm4 n;

    public mm4(nm4 r1, int r2) {
        this.n = r1;
        super(r2);
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int r0 = ((ByteArrayOutputStream) this).count;
        if (r0 <= 0) goto L12;
        int r2 = r0 - 1;
        if (((ByteArrayOutputStream) this).buf[r2] != 13) goto L12;
        r0 = r2;
    L12:
        return new String(((ByteArrayOutputStream) this).buf, 0, r0, this.n.o.name());
    L9:
        e = move-exception;
        throw new AssertionError(e);
    }
}
